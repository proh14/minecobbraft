package net.minecobbraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecobbraft.block.ModBlocks;
import net.minecobbraft.Minecobbraft;
import net.minecobbraft.item.custom.KaktusDaggerItem;
import net.minecobbraft.item.custom.WandOfProhItem;
import net.minecobbraft.utils.World;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

// Helper class for registering all the items :D
public class ModItems {
  public static final Item WAND_OF_PROH = registerItem("wand_of_proh", new WandOfProhItem(new Item.Settings()
    .maxCount(1)
    .maxDamage(World.LOW_MEDIUM_DURABILITY)));
  public static final Item KAKTUS_DAGGER = registerItem("kaktus_dagger", new KaktusDaggerItem(ToolMaterials.IRON, new Item.Settings()
    .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, 3, -2.4f))
    .maxCount(1)
    .maxDamage(World.LOW_MEDIUM_DURABILITY)));


  private static Item registerItem(String name, Item item){
    return Registry.register(Registries.ITEM, Identifier.of(Minecobbraft.MOD_ID, name), item);
  }

  private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
    entries.add(WAND_OF_PROH);
    entries.add(KAKTUS_DAGGER);
  }

  private static void addItemsToNaturalItemGroup(FabricItemGroupEntries entries) {
    entries.addAfter(Blocks.COAL_ORE, ModBlocks.JS_ORE);
  }

  public static void registerAllItems(){
    Minecobbraft.LOGGER.info("Registering all Items for " + Minecobbraft.MOD_ID);
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalItemGroup);
  }
}
