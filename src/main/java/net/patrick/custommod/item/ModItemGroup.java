package net.patrick.custommod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.patrick.custommod.custommod;

public class ModItemGroup {
    public static ItemGroup ModItems;

    public static void registerItemGroups(){
        ModItems = FabricItemGroup.builder(new Identifier(custommod.MOD_ID, "moditems"))
                .displayName(Text.literal("ModItems"))
                .icon(() -> new ItemStack(Blocks.BARRIER))
                .build();
    }
}
