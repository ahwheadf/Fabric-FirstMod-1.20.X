package com.ahwheadf.firstmod.item;

import com.ahwheadf.firstmod.FirstMod;
import com.ahwheadf.firstmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DIAMOND_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(FirstMod.MOD_ID, "silver"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.silver_group"))
                    .icon(() -> new ItemStack(ModItems.SILVER_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SILVER_INGOT);
                        entries.add(ModItems.SILVER_ORE);



                        entries.add(ModBlocks.SILVER_BLOCK);
                        entries.add(ModBlocks.SILVER_ORE_BLOCK);

                    }).build());
    public static void RegisterItemGroups(){
        FirstMod.LOGGER.info("Registering Item Groups for " + FirstMod.MOD_ID);
    }
}
