package com.ahwheadf.firstmod.item;

import com.ahwheadf.firstmod.FirstMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DIAMOND_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(FirstMod.MOD_ID, "diamonds"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.diamonds"))
                    .icon(() -> new ItemStack(ModItems.RED_DIAMOND)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RED_DIAMOND);
                        entries.add(ModItems.CRACKED_RED_DIAMOND);

                        entries.add(Items.DIAMOND);

                    }).build());
    public static void RegisterItemGroups(){
        FirstMod.LOGGER.info("Registering Item Groups for " + FirstMod.MOD_ID);
    }
}
