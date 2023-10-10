package net.patrick.custommod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.patrick.custommod.item.ModItems;

import java.util.function.Consumer;

import static net.minecraft.data.client.TextureMap.pattern;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.silasballs)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.peppapig)
                .criterion(FabricRecipeProvider.hasItem(ModItems.peppapig),
                        FabricRecipeProvider.conditionsFromItem(ModItems.peppapig))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.silasballs)));
    }
}
