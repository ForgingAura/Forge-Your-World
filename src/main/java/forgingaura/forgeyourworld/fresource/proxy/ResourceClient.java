package forgingaura.forgeyourworld.fresource.proxy;

import forgingaura.forgeyourworld.fresource.ResourceConfig;
import forgingaura.forgeyourworld.fresource.init.ResourceBlock;
import forgingaura.forgeyourworld.fresource.init.ResourceItem;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.IntBuffer;

import javax.imageio.ImageIO;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Cursor;
import org.lwjgl.input.Mouse;

/**
 * Created by AlasDiablo on 28/10/2017.
 */
public class ResourceClient implements ResourceCommon {

    private int texture_size = 16;
    @Override
    public void preInit() {
    }

    @Override
    public void init() {
    }

    @Override
    public void registerRenders() {
        ResourceBlock.registerRenders();
        System.out.println("[Forge Your World Resource] Block Renders Done");
        ResourceItem.registerRenders();
        System.out.println("[Forge Your World Resource] Item Renders Done");

        //Curseur
        if(ResourceConfig.enable_new_cursor == true) {
            if(ResourceConfig.cursor_type == 1) {
                this.setCursor("fresource", "/textures/cursors/diamond_sword.png", texture_size, texture_size, 3.1415926536);
            } else if(ResourceConfig.cursor_type == 2) {
                this.setCursor("fresource", "/textures/cursors/stick.png", texture_size, texture_size, 3.1415926536);
            } else if(ResourceConfig.cursor_type == 3) {
                this.setCursor("fresource", "/textures/cursors/arrow.png", texture_size, texture_size, 3.1415926536);
            } else if(ResourceConfig.cursor_type == 4) {
                this.setCursor("fresource", "/textures/cursors/spectral_arrow.png", texture_size, texture_size, 3.1415926536);
            }
        }
    }

    //Curseur
    private void setCursor(String modid, String path, int width, int height, double rotation){

        AffineTransform transform = new AffineTransform();



        try{

            BufferedImage cursorTexture = ImageIO.read(getClass().getResource("/assets/" + modid + path));

            transform.rotate(rotation, cursorTexture.getWidth()/2, cursorTexture.getHeight()/2);



            AffineTransformOp op = new AffineTransformOp(transform, AffineTransformOp.TYPE_BILINEAR);

            cursorTexture = op.filter(cursorTexture, null);



            int[] rgbs = new int[cursorTexture.getWidth() * cursorTexture.getHeight()];



            IntBuffer buffer = IntBuffer.wrap(cursorTexture.getRGB(0, 0, cursorTexture.getWidth(), cursorTexture.getHeight(), rgbs, 0, cursorTexture.getHeight()));



            buffer.rewind();



            Cursor newCursor = new Cursor(width, height, 1, cursorTexture.getHeight() - 1, 1, buffer, null);

            Mouse.setNativeCursor(newCursor);

        }

        catch (LWJGLException e) {

            e.printStackTrace();

        }

        catch (IOException e) {

            e.printStackTrace();

        }

    }

}
