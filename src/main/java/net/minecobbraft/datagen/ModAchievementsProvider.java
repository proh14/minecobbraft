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
      .build(consumer, Minecobbraft.MOD_ID + "/webdev");

    var automationZombieAdvancement = Advancement.Builder.create()
      .display(
        ModItems.PYTHON,
        Text.translatable("advancement.minecobbraft.automationzombie.title"),
        Text.translatable("advancement.minecobbraft.automationzombie.description"),
        Identifier.of("textures/gui/advancements/backgrounds/adventure.png"),
        AdvancementFrame.TASK,
        true,
        true,
        false
      )
      .criterion("got_python", InventoryChangedCriterion.Conditions.items(ModItems.PYTHON))
      .parent(webDeveloperAdvancement)
      .build(consumer, Minecobbraft.MOD_ID + "/automationzombie");

      var minecraftDevAdvancement = Advancement.Builder.create()
        .display(
          ModItems.JAVA,
          Text.translatable("advancement.minecobbraft.minecraftdev.title"),
          Text.translatable("advancement.minecobbraft.minecraftdev.description"),
          Identifier.of("textures/gui/advancements/backgrounds/adventure.png"),
          AdvancementFrame.TASK,
          true,
          true,
          false
        )
        .criterion("got_java", InventoryChangedCriterion.Conditions.items(ModItems.JAVA))
        .parent(automationZombieAdvancement)
        .build(consumer, Minecobbraft.MOD_ID + "/minecraftdev");

      var realProgrammerAdvancement = Advancement.Builder.create()
        .display(
          ModItems.C,
          Text.translatable("advancement.minecobbraft.realprogrammer.title"),
          Text.translatable("advancement.minecobbraft.realprogrammer.description"),
          Identifier.of("textures/gui/advancements/backgrounds/adventure.png"),
          AdvancementFrame.TASK,
          true,
          true,
          false
        )
        .criterion("got_c", InventoryChangedCriterion.Conditions.items(ModItems.C))
        .parent(minecraftDevAdvancement)
        .build(consumer, Minecobbraft.MOD_ID + "/realprogrammer");
  }
}
