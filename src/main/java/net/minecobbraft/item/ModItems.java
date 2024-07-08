package net.minecobbraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecobbraft.block.ModBlocks;
import net.minecobbraft.Minecobbraft;
import net.minecobbraft.item.custom.KaktusDaggerItem;
import net.minecobbraft.item.custom.WandOfProhItem;
import net.minecobbraft.utils.World;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
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

  public static final Item JAVASCRIPT = registerItem("javascript", new Item(new Item.Settings()));

  public static final Item JAVASCRIPT_PICKAXE = registerItem("javascript_pickaxe", new PickaxeItem(ModToolMaterial.JAVASCRIPT,
          new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.JAVASCRIPT, 0, 1))));
  public static final Item JAVASCRIPT_AXE = registerItem("javascript_axe", new AxeItem(ModToolMaterial.JAVASCRIPT,
          new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.JAVASCRIPT, 0, 1))));
  public static final Item JAVASCRIPT_SHOVEL = registerItem("javascript_shovel", new ShovelItem(ModToolMaterial.JAVASCRIPT,
          new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.JAVASCRIPT, 0, 1))));
  public static final Item JAVASCRIPT_HOE = registerItem("javascript_hoe", new HoeItem(ModToolMaterial.JAVASCRIPT,
          new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.JAVASCRIPT, 0, 1))));
  public static final Item JAVASCRIPT_SWORD = registerItem("javascript_sword", new SwordItem(ModToolMaterial.JAVASCRIPT,
          new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.JAVASCRIPT, 0, 1))));

  public static final Item JAVASCIPRT_HELMET = registerItem("javascript_helmet", new ArmorItem(ModArmorMaterials.JAVASCRIPT, ArmorItem.Type.HELMET,
          new Item.Settings().maxDamage(1)));
  public static final Item JAVASCIPRT_CHESTPLATE = registerItem("javascript_chestplate", new ArmorItem(ModArmorMaterials.JAVASCRIPT, ArmorItem.Type.CHESTPLATE,
          new Item.Settings().maxDamage(1)));
  public static final Item JAVASCIPRT_LEGGINGS = registerItem("javascript_leggings", new ArmorItem(ModArmorMaterials.JAVASCRIPT, ArmorItem.Type.LEGGINGS,
          new Item.Settings().maxDamage(1)));
  public static final Item JAVASCIPRT_BOOTS = registerItem("javascript_boots", new ArmorItem(ModArmorMaterials.JAVASCRIPT, ArmorItem.Type.BOOTS,
          new Item.Settings().maxDamage(1)));


  private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(Minecobbraft.MOD_ID, name), item);
  }

  private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
    entries.add(WAND_OF_PROH);
    entries.add(KAKTUS_DAGGER);
    entries.addAfter(Items.WOODEN_SWORD, JAVASCRIPT_SWORD);
  }

  private static void addItemsToNaturalItemGroup(FabricItemGroupEntries entries) {
    entries.addAfter(Blocks.COAL_ORE, ModBlocks.JAVASCRIPT_ORE);
  }

  private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
    entries.addAfter(Items.WOODEN_HOE, JAVASCRIPT_SHOVEL, JAVASCRIPT_PICKAXE, JAVASCRIPT_AXE, JAVASCRIPT_HOE);
  }

  private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
    entries.addAfter(Items.GOLD_NUGGET, JAVASCRIPT);
  }

  public static void registerAllItems() {
    Minecobbraft.LOGGER.info("Registering all Items for " + Minecobbraft.MOD_ID);
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalItemGroup);
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);
  }
}
