package com.bdr.bdrmod.core.init;

import com.bdr.bdrmod.BDRMOD;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			BDRMOD.MOD_ID);
			
	public static final RegistryObject<Item> MAGIC_ZBOUB = ITEMS.register("magic_zboub",
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
	
	public static final RegistryObject<Item> BEDROCK_SWORD = ITEMS.register("bedrock_sword",
			() -> new Item(new Item.Properties().group(ItemGroup.COMBAT)));
	
	// Block Items
	public static final RegistryObject<BlockItem> EXAMPLE_BLOCK = ITEMS.register("example_block",
			() -> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
}