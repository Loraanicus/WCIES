package items;

import com.loraanicus.wcies.Main;

import net.minecraft.item.ItemFood;

public class BasicFood extends ItemFood {

	public BasicFood(int amount, float saturation, String unlocalizedName, String registryName) {
		super(amount, saturation, false);
		
		setUnlocalizedName(unlocalizedName);
		setRegistryName(registryName);
		
		setCreativeTab(Main.tabWCIES);
	}
	
	

}
