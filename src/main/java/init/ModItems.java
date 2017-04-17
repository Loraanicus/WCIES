package init;

import items.BasicFood;
import items.BowlFood;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item oakSandwich;
	public static Item birchCookie;
	public static Item acaciaPie;
	public static Item darkOakShnickers;
	public static Item spruceChowder;
	public static Item jungleJambalaya;
	
	public static void init(){
		
		//Basic Foods
		oakSandwich = new BasicFood(8, 0.8F, "oakSandwich", "oakSandwich");
		birchCookie = new BasicFood(3,0.2F, "birchCookie","birchCookie");
		acaciaPie = new BasicFood(8, 0.8F, "acaciaPie","acaciaPie");
		darkOakShnickers = new BasicFood (5,0.5F,"darkOakShnickers","darkOakShnickers");
		
		//Bowl Foods
		spruceChowder = new BowlFood (9,"spruceChowder","spruceChowder");
		jungleJambalaya = new BowlFood (11,"jungleJambalaya","jungleJambalaya");
	}
	
	public static void register(){
		GameRegistry.register(oakSandwich);
		GameRegistry.register(birchCookie);
		GameRegistry.register(acaciaPie);
		GameRegistry.register(darkOakShnickers);
		GameRegistry.register(spruceChowder);
		GameRegistry.register(jungleJambalaya);
	}
	
	public static void registerRenders(){
		registerRender(oakSandwich);
		registerRender(birchCookie);
		registerRender(acaciaPie);
		registerRender(darkOakShnickers);
		registerRender(spruceChowder);
		registerRender(jungleJambalaya);
	}
	
	private static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
