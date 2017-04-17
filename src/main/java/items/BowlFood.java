package items;

import com.loraanicus.wcies.Main;

import net.minecraft.item.ItemSoup;

public class BowlFood extends ItemSoup {

	public BowlFood(int amount, String unlocalizedName, String registryName) {
		super(amount);
		
		setUnlocalizedName(unlocalizedName);
		setRegistryName(registryName);
		
		setCreativeTab(Main.tabWCIES);
	}
	


}
