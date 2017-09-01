package forgingaura.forgeyourworld.handler;

public class MainHandler {
	
	public static final String MODID = "forgeyourworld";
	public static final String NAME = "Forge Your World";
	public static final String VERSION = "Beta-1.2";
	public static final String ACCEPTED_VERSION = "[1.12,1.12.1]";
	public static final String CLIENT_PROXY_CLASSE = "forgingaura.forgeyourworld.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASSE = "forgingaura.forgeyourworld.proxy.ServerProxy";
	public static final String VERSION_CHECKER_URL = "https://raw.githubusercontent.com/ForgingAura/Forge-Your-World/master/update.json";
	
	public static enum FYWItems {
		
		FLOUR("flour", "Flour"),
		TOAST("toast", "Toast"),
		APPLEJAM("applejam", "AppleJam"),
		APPLETOAST("appletoast", "AppleToast"),
		RAWTERILLIUM("rawterillium", "RawTerillium"),
		TERILLIUM("terillium", "Terillium"),
		CEREALS("cereals", "Cereals"),
		CHOCOLATECEREALS("chocolatecereals", "ChocolateCereals"),
		CEREALSBOWL("cerealsbowl", "CerealsBowl"),
		CHOCOLATECEREALSBOWL("chocolatecerealsbowl", "ChocolateCerealsBowl"),
		TERILLIUMHELMET("terilliumhelmet", "TerilliumHelmet"),
		TERILLIUMCHESTPLATE("terilliumchestplate", "TerilliumChestPlate"),
		TERILLIUMLEGGINGS("terilliumleggings", "TerilliumLeggings"),
		TERILLIUMBOOTS("terilliumboots", "TerilliumBoots"),
		TERILLIUMAXE("terilliumaxe", "TerilliumAxe"),
		TERILLIUMHOE("terilliumhoe", "TerilliumHoe"),
		TERILLIUMPICKAXE("terilliumpickaxe", "TerilliumPickaxe"),
		TERILLIUMSHOVEL("terilliumshovel", "TerilliumShovel"),
		TERILLIUMSWORD("terilliumsword", "TerilliumSword"),
		BLAZECOAL("blazecoal", "BlazeCoal"),
		KITCHENKNIFE("kitchenknife", "KitchenKnife");
		
		private String unlocalizedName;
		private String registryName;
		
		FYWItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
	public static enum FYWBlocks {
		TERILLIUMORE("terilliumore", "TerilliumOre"),
		APPLEJAMJAR("applejamjar", "AppleJamJar"),
		BLAZECOALBLOCK("blazecoalblock", "BlazeCoalBlock"),
		BLAZECOALORE("blazecoalBlock", "BlazeCoalOre"),
		ENDERIUMORE("enderiumore", "EnderiumOre"),
		ANDESITEBRICK("andesitebrick", "AndesiteBrick"),
		ANDESITEBRICKCARVED("andesitebrickcarved", "AndesiteBrickCarved"),
		ANDESITEBRICKCRACKED("andesitebrickcracked", "AndesiteBrickCracked"),
		ANDESITEBRICKMOSSY("andesitebricmossy", "AndesiteBrickMossy"),
		DIORITEBRICK("dioritebrick", "DioriteBrick"),
		DIORITEBRICKCARVED("dioritebrickcarved", "DioriteBrickCarved"),
		DIORITEBRICKCRACKED("dioritebrickcracked", "DioriteBrickCracked"),
		DIORITEBRICKMOSSY("dioritebrickmossy", "DioriteBrickMossy"),
		GRANITEBRICK("granitebrick", "GraniteBrick"),
		GRANITEBRICKCARVED("granitebrickcarved", "GraniteBrickCarved"),
		GRANITEBRICKCRACKED("granitebrickcracked", "GraniteBrickCracked"),
		GRANITEBRICKMOSSY("granitebrickmossy", "GraniteBrickMossy"),
		ENDSTONEBRICKCARVED("endstonebrickcarved", "EndStoneBrickCarved"),
		ENDSTONEBRICKCRACKED("endstonebrickcracked", "EndStoneBrickCracked"),
		ENDSTONEBRICKMOSSY("endstonebrickmossy", "endstonebrickmossy");

		private String unlocalizedName;
		private String registryName;
		
		FYWBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}

}
