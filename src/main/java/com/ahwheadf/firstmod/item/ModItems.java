package com.ahwheadf.firstmod.item;

import com.ahwheadf.firstmod.FirstMod;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RED_DIAMOND = registerItem("red_diamond",new Item(new FabricItemSettings()));
    public static final Item CRACKED_RED_DIAMOND = registerItem("cracked_red_diamond", new Item(new FabricItemSettings()));

    private static void addItemsToIngridientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(RED_DIAMOND);
        entries.add(CRACKED_RED_DIAMOND);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(FirstMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        FirstMod.LOGGER.info("Registering Mod Item for " + FirstMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngridientTabItemGroup);

    }
}
