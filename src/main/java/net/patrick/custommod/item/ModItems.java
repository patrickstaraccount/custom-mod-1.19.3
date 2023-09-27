package net.patrick.custommod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.patrick.custommod.custommod;

//important comment
public class ModItems {
    public static final Item peppapig = registerItem("peppapig",
            new Item(new FabricItemSettings()));
    public static final Item silasballs = registerItem("silasballs",
            new Item(new FabricItemSettings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(custommod.MOD_ID, name), item);
    }
    public static void addItemsToItemGroup(){
        addToItemGroup(ModItemGroup.ModItems, peppapig);
        addToItemGroup(ModItemGroup.ModItems, silasballs);
    }
    private static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems(){
        custommod.LOGGER.info("Registering Mod Items for " + custommod.MOD_ID);
        addItemsToItemGroup();
    }
}
