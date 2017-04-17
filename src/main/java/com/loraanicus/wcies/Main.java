package com.loraanicus.wcies;

import com.loraanicus.wcies.proxy.CommonProxy;

import init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Main 
{
	
	@Instance
	public static Main instance;
	
	//Proxies
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	//Initialization Events
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		ModItems.init();
		ModItems.register();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
		
	}
	
	//Creative Tab
	public static CreativeTabs tabWCIES = new CreativeTabs("tab_WCIES"){
		
		@Override
		public ItemStack getTabIconItem(){
			return new ItemStack(ModItems.oakSandwich);
		}
	};
}
