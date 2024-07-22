package net.minecobbraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecobbraft.Minecobbraft;
import net.minecobbraft.item.ModItems;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAchievementsProvider extends FabricAdvancementProvider {
  public ModAchievementsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
    super(output, registryLookup);
  }

  @Override
  public void generateAdvancement(RegistryWrapper.WrapperLookup registryLookup, Consumer<AdvancementEntry> consumer) {
    var webDeveloperAdvancement = Advancement.Builder.create()
      .display(
        ModItems.JAVASCRIPT,
        Text.translatable("advancement.minecobbraft.webdev.title"),
        Text.translatable("advancement.minecobbraft.webdev.description"),
        Identifier.of("textures/gui/advancements/backgrounds/adventure.png"),
        AdvancementFrame.TASK,
        true,
        true,
        false
      )
      .criterion("got_javascript", InventoryChangedCriterion.Conditions.items(ModItems.JAVASCRIPT))
      .build(consumer, Minecobbraft.MOD_ID + "/root");
  }
}
