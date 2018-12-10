package fr.forgingaura.fyw.cmd;

import com.google.common.collect.Lists;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;

import javax.annotation.Nonnull;
import java.util.List;

public class SystemInfo extends CommandBase {
    private List<String> aliases;

    public SystemInfo() {
        this.aliases = Lists.newArrayList("SYSTEM", "sys", "SYS");
    }

    @Override
    @Nonnull
    public String getName() {
        return "system";
    }

    @Override
    @Nonnull
    public List<String> getAliases() {
        return this.aliases;
    }

    @Override
    @Nonnull
    public String getUsage(ICommandSender sender) {
        return "sys.usage";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if (args.length == 0) {

        } else if (args.length == 1){
            if (args[0].equals("cpu")) {

            } else if (args[0].equals("mem")) {

            } else {
                sender.sendMessage(new TextComponentTranslation("sys.arg.error"));
                sender.sendMessage(new TextComponentTranslation("sys.usage"));
            }
        } else {
            sender.sendMessage(new TextComponentTranslation("sys.arg.tomuch"));
        }
    }
}
