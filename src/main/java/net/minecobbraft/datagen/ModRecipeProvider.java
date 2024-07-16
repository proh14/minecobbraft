package net.minecobbraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecobbraft.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
  public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
    super(output, registriesFuture);
  }

  @Override
  public void generate(RecipeExporter exporter) {
    final ArrayList<Item> ITEMS = new ArrayList<Item>();

    ITEMS.add(ModItems.JAVASCRIPT_SWORD);
    ITEMS.add(ModItems.JAVASCRIPT_PICKAXE);
    ITEMS.add(ModItems.JAVASCRIPT_AXE);
    ITEMS.add(ModItems.JAVASCRIPT_SHOVEL);
    ITEMS.add(ModItems.JAVASCRIPT_HOE);
    ITEMS.add(ModItems.JAVASCRIPT_HELMET);
    ITEMS.add(ModItems.JAVASCRIPT_CHESTPLATE);
    ITEMS.add(ModItems.JAVASCRIPT_LEGGINGS);
    ITEMS.add(ModItems.JAVASCRIPT_BOOTS);
    toolAndArmorSetFor(exporter, ModItems.JAVASCRIPT, ITEMS);
    ITEMS.clear();

    ITEMS.add(ModItems.PYTHON_SWORD);
    ITEMS.add(ModItems.PYTHON_PICKAXE);
    ITEMS.add(ModItems.PYTHON_AXE);
    ITEMS.add(ModItems.PYTHON_SHOVEL);
    ITEMS.add(ModItems.PYTHON_HOE);
    ITEMS.add(ModItems.PYTHON_HELMET);
    ITEMS.add(ModItems.PYTHON_CHESTPLATE);
    ITEMS.add(ModItems.PYTHON_LEGGINGS);
    ITEMS.add(ModItems.PYTHON_BOOTS);
    toolAndArmorSetFor(exporter, ModItems.PYTHON, ITEMS);
    ITEMS.clear();

    ITEMS.add(ModItems.JAVA_SWORD);
    ITEMS.add(ModItems.JAVA_PICKAXE);
    ITEMS.add(ModItems.JAVA_AXE);
    ITEMS.add(ModItems.JAVA_SHOVEL);
    ITEMS.add(ModItems.JAVA_HOE);
    ITEMS.add(ModItems.JAVA_HELMET);
    ITEMS.add(ModItems.JAVA_CHESTPLATE);
    ITEMS.add(ModItems.JAVA_LEGGINGS);
    ITEMS.add(ModItems.JAVA_BOOTS);
    toolAndArmorSetFor(exporter, ModItems.JAVA, ITEMS);
    ITEMS.clear();

    ITEMS.add(ModItems.C_SWORD);
    ITEMS.add(ModItems.C_PICKAXE);
    ITEMS.add(ModItems.C_AXE);
    ITEMS.add(ModItems.C_SHOVEL);
    ITEMS.add(ModItems.C_HOE);
    ITEMS.add(ModItems.C_HELMET);
    ITEMS.add(ModItems.C_CHESTPLATE);
    ITEMS.add(ModItems.C_LEGGINGS);
    ITEMS.add(ModItems.C_BOOTS);
    toolAndArmorSetFor(exporter, ModItems.C, ITEMS);
    ITEMS.clear();
  }

  private void toolAndArmorSetFor(RecipeExporter exporter, Item item, ArrayList<Item> res) {
    ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, res.get(0), 1)
            .pattern(" X ")
            .pattern(" X ")
            .pattern(" # ")
            .input('#', Items.STICK)
            .input('X', item)
            .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
            .criterion(hasItem(item), conditionsFromItem(res.get(0)))
            .offerTo(exporter, Identifier.of(getRecipeName(res.get(0))));
    ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, res.get(1), 1)
            .pattern("XXX")
            .pattern(" # ")
            .pattern(" # ")
            .input('#', Items.STICK)
            .input('X', item)
            .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
            .criterion(hasItem(item), conditionsFromItem(res.get(1)))
            .offerTo(exporter, Identifier.of(getRecipeName(res.get(1))));
    ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, res.get(2), 1)
            .pattern("XX ")
            .pattern("X# ")
            .pattern(" # ")
            .input('#', Items.STICK)
            .input('X', item)
            .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
            .criterion(hasItem(item), conditionsFromItem(res.get(2)))
            .offerTo(exporter, Identifier.of(getRecipeName(res.get(2))));
    ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, res.get(3), 1)
            .pattern(" X ")
            .pattern(" # ")
            .pattern(" # ")
            .input('#', Items.STICK)
            .input('X', item)
            .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
            .criterion(hasItem(item), conditionsFromItem(res.get(3)))
            .offerTo(exporter, Identifier.of(getRecipeName(res.get(3))));
    ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, res.get(4), 1)
            .pattern("XX ")
            .pattern(" # ")
            .pattern(" # ")
            .input('#', Items.STICK)
            .input('X', item)
            .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
            .criterion(hasItem(item), conditionsFromItem(res.get(4)))
            .offerTo(exporter, Identifier.of(getRecipeName(res.get(4))));
    ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, res.get(5), 1)
            .pattern("XXX")
            .pattern("X X")
            .input('X', item)
            .criterion(hasItem(item), conditionsFromItem(res.get(5)))
            .offerTo(exporter, Identifier.of(getRecipeName(res.get(5))));
    ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, res.get(6), 1)
            .pattern("X X")
            .pattern("XXX")
            .pattern("XXX")
            .input('X', item)
            .criterion(hasItem(item), conditionsFromItem(res.get(6)))
            .offerTo(exporter, Identifier.of(getRecipeName(res.get(6))));
    ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, res.get(7), 1)
            .pattern("XXX")
            .pattern("X X")
            .pattern("X X")
            .input('X', item)
            .criterion(hasItem(item), conditionsFromItem(res.get(7)))
            .offerTo(exporter, Identifier.of(getRecipeName(res.get(7))));
    ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, res.get(8), 1)
            .pattern("X X")
            .pattern("X X")
            .input('X', item)
            .criterion(hasItem(item), conditionsFromItem(res.get(8)))
            .offerTo(exporter, Identifier.of(getRecipeName(res.get(8))));
  }
}
