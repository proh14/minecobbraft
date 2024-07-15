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
  public static final Item JAVASCRIPT_HELMET = registerItem("javascript_helmet",
    new ArmorItem(ModArmorMaterials.JAVASCRIPT, ArmorItem.Type.HELMET,
      new Item.Settings().maxDamage(1)));
  public static final Item JAVASCRIPT_CHESTPLATE = registerItem("javascript_chestplate",
    new ArmorItem(ModArmorMaterials.JAVASCRIPT, ArmorItem.Type.CHESTPLATE,
      new Item.Settings().maxDamage(1)));
  public static final Item JAVASCRIPT_LEGGINGS = registerItem("javascript_leggings",
    new ArmorItem(ModArmorMaterials.JAVASCRIPT, ArmorItem.Type.LEGGINGS,
      new Item.Settings().maxDamage(1)));
  public static final Item JAVASCRIPT_BOOTS = registerItem("javascript_boots",
    new ArmorItem(ModArmorMaterials.JAVASCRIPT, ArmorItem.Type.BOOTS,
      new Item.Settings().maxDamage(1)));

  public static final Item PYTHON = registerItem("python", new Item(new Item.Settings()));
  public static final Item PYTHON_PICKAXE = registerItem("python_pickaxe", new PickaxeItem(ModToolMaterial.PYTHON,
    new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.PYTHON, 0, -3))));
  public static final Item PYTHON_AXE = registerItem("python_axe", new AxeItem(ModToolMaterial.PYTHON,
    new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterial.PYTHON, 0, -5))));
  public static final Item PYTHON_SHOVEL = registerItem("python_shovel", new ShovelItem(ModToolMaterial.PYTHON,
    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterial.PYTHON, 0, -3))));
  public static final Item PYTHON_HOE = registerItem("python_hoe", new HoeItem(ModToolMaterial.PYTHON,
    new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.PYTHON, 0, -3))));
  public static final Item PYTHON_SWORD = registerItem("python_sword", new SwordItem(ModToolMaterial.PYTHON,
    new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.PYTHON, 0, -4))));

  public static final Item PYTHON_HELMET = registerItem("python_helmet",
    new ArmorItem(ModArmorMaterials.PYTHON, ArmorItem.Type.HELMET,
      new Item.Settings().maxDamage(World.LOW_MEDIUM_DURABILITY)));
  public static final Item PYTHON_CHESTPLATE = registerItem("python_chestplate",
    new ArmorItem(ModArmorMaterials.PYTHON, ArmorItem.Type.CHESTPLATE,
      new Item.Settings().maxDamage(World.LOW_MEDIUM_DURABILITY)));
  public static final Item PYTHON_LEGGINGS = registerItem("python_leggings",
    new ArmorItem(ModArmorMaterials.PYTHON, ArmorItem.Type.LEGGINGS,
      new Item.Settings().maxDamage(World.LOW_MEDIUM_DURABILITY)));
  public static final Item PYTHON_BOOTS = registerItem("python_boots",
    new ArmorItem(ModArmorMaterials.PYTHON, ArmorItem.Type.BOOTS,
      new Item.Settings()));

  public static final Item JAVA = registerItem("java", new Item(new Item.Settings()));
  public static final Item JAVA_PICKAXE = registerItem("java_pickaxe", new PickaxeItem(ModToolMaterial.JAVA, 
    new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.JAVA, 0, 0))));
  public static final Item JAVA_AXE = registerItem("java_axe", new AxeItem(ModToolMaterial.JAVA,
    new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterial.JAVA, 0, 0))));
  public static final Item JAVA_SHOVEL = registerItem("java_shovel", new ShovelItem(ModToolMaterial.JAVA,
    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterial.JAVA, 0, 0))));
  public static final Item JAVA_HOE = registerItem("java_hoe", new HoeItem(ModToolMaterial.JAVA,
    new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.JAVA, 0, 0))));
  public static final Item JAVA_SWORD = registerItem("java_sword", new SwordItem(ModToolMaterial.JAVA,
    new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.JAVA, 0, 0))));

  public static final Item JAVA_HELMET = registerItem("java_helmet",
    new ArmorItem(ModArmorMaterials.JAVA, ArmorItem.Type.HELMET,
      new Item.Settings().maxDamage(World.MEDIUM_DURABILITY)));
  public static final Item JAVA_CHESTPLATE = registerItem("java_chestplate",
    new ArmorItem(ModArmorMaterials.JAVA, ArmorItem.Type.CHESTPLATE,
      new Item.Settings().maxDamage(World.MEDIUM_DURABILITY)));
  public static final Item JAVA_LEGGINGS = registerItem("java_leggings",
    new ArmorItem(ModArmorMaterials.JAVA, ArmorItem.Type.LEGGINGS,
      new Item.Settings().maxDamage(World.MEDIUM_DURABILITY)));
  public static final Item JAVA_BOOTS = registerItem("java_boots",
    new ArmorItem(ModArmorMaterials.JAVA, ArmorItem.Type.BOOTS,
      new Item.Settings().maxDamage(World.MEDIUM_DURABILITY)));


  private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(Minecobbraft.MOD_ID, name), item);
  }

  private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
    entries.add(WAND_OF_PROH);
    entries.add(KAKTUS_DAGGER);
    entries.addAfter(Items.WOODEN_SWORD, JAVASCRIPT_SWORD);
    entries.addAfter(Items.LEATHER_BOOTS, JAVASCRIPT_HELMET, JAVASCRIPT_CHESTPLATE, JAVASCRIPT_LEGGINGS, JAVASCRIPT_BOOTS);

    entries.addAfter(Items.IRON_SWORD, PYTHON_SWORD);
    entries.addAfter(Items.IRON_BOOTS, PYTHON_HELMET, PYTHON_CHESTPLATE, PYTHON_LEGGINGS, PYTHON_BOOTS);

    entries.addAfter(Items.DIAMOND_SWORD, JAVA_SWORD);
    entries.addAfter(Items.DIAMOND_BOOTS, JAVA_HELMET, JAVA_CHESTPLATE, JAVA_LEGGINGS, JAVA_BOOTS);
  }

  private static void addItemsToNaturalItemGroup(FabricItemGroupEntries entries) {
    entries.addAfter(Blocks.COAL_ORE, ModBlocks.JAVASCRIPT_ORE);
    entries.addAfter(Blocks.IRON_ORE, ModBlocks.PYTHON_ORE, ModBlocks.DEEPSLATE_PYTHON_ORE);
    entries.addAfter(Blocks.DIAMOND_ORE, ModBlocks.JAVA_ORE, ModBlocks.DEEPSLATE_JAVA_ORE);
    entries.addAfter(Blocks.POPPY, ModBlocks.RUST_ROSE);
  }

  private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
    entries.addAfter(Items.WOODEN_HOE, JAVASCRIPT_SHOVEL, JAVASCRIPT_PICKAXE, JAVASCRIPT_AXE, JAVASCRIPT_HOE);
    entries.addAfter(Items.IRON_HOE, PYTHON_SHOVEL, PYTHON_PICKAXE, PYTHON_AXE, PYTHON_HOE);
    entries.addAfter(Items.DIAMOND_HOE, JAVA_SHOVEL, JAVA_PICKAXE, JAVA_AXE, JAVA_HOE);
  }

  private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
    entries.addAfter(Items.GOLD_NUGGET, JAVASCRIPT);
    entries.addAfter(Items.IRON_INGOT, PYTHON, JAVA);
  }

  public static void registerModItems() {
    Minecobbraft.LOGGER.info("Registering all Items for " + Minecobbraft.MOD_ID);
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalItemGroup);
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);
  }
}
