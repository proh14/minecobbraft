package net.minecobbraft.item;

import net.minecobbraft.Minecobbraft;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

@SuppressWarnings("unchecked")
public class ModArmorMaterials {
  public static final RegistryEntry<ArmorMaterial> JAVASCRIPT = ModArmorMaterials.register("javascript", Util.make(new EnumMap(ArmorItem.Type.class), map -> {
    map.put(ArmorItem.Type.BOOTS, 1);
    map.put(ArmorItem.Type.LEGGINGS, 1);
    map.put(ArmorItem.Type.CHESTPLATE, 1);
    map.put(ArmorItem.Type.HELMET, 1);
    map.put(ArmorItem.Type.BODY, 1);
  }), 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f, 0.0f, () -> Ingredient.ofItems(ModItems.JAVASCRIPT), List.of(new ArmorMaterial.Layer(Identifier.of(Minecobbraft.MOD_ID,"javascript"), "", false), new ArmorMaterial.Layer(Identifier.of(Minecobbraft.MOD_ID,"javascript"), "", false)));

  public static final RegistryEntry<ArmorMaterial> PYTHON = ModArmorMaterials.register("python", Util.make(new EnumMap(ArmorItem.Type.class), map -> {
    map.put(ArmorItem.Type.BOOTS, 4);
    map.put(ArmorItem.Type.LEGGINGS, 5);
    map.put(ArmorItem.Type.CHESTPLATE, 6);
    map.put(ArmorItem.Type.HELMET, 5);
    map.put(ArmorItem.Type.BODY, 5);
  }), 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.5f, 0.025f, () -> Ingredient.ofItems(ModItems.PYTHON), List.of(new ArmorMaterial.Layer(Identifier.of(Minecobbraft.MOD_ID, "python"), "", false), new ArmorMaterial.Layer(Identifier.of(Minecobbraft.MOD_ID,"python"), "", false)));

  public static final RegistryEntry<ArmorMaterial> JAVA = ModArmorMaterials.register("java", Util.make(new EnumMap(ArmorItem.Type.class), map -> {
    map.put(ArmorItem.Type.BOOTS, 5);
    map.put(ArmorItem.Type.LEGGINGS, 6);
    map.put(ArmorItem.Type.CHESTPLATE, 7);
    map.put(ArmorItem.Type.HELMET, 5);
    map.put(ArmorItem.Type.BODY, 5);
  }), 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f, 0.04f, () -> Ingredient.ofItems(ModItems.JAVA), List.of(new ArmorMaterial.Layer(Identifier.of(Minecobbraft.MOD_ID, "java"), "", false), new ArmorMaterial.Layer(Identifier.of(Minecobbraft.MOD_ID, "java"), "", false)));

  public static final RegistryEntry<ArmorMaterial> C = ModArmorMaterials.register("c", Util.make(new EnumMap(ArmorItem.Type.class), map -> {
    map.put(ArmorItem.Type.BOOTS, 6);
    map.put(ArmorItem.Type.LEGGINGS, 7);
    map.put(ArmorItem.Type.CHESTPLATE, 8);
    map.put(ArmorItem.Type.HELMET, 6);
    map.put(ArmorItem.Type.BODY, 6);
  }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5f, 0.06f, () -> Ingredient.ofItems(ModItems.C), List.of(new ArmorMaterial.Layer(Identifier.of(Minecobbraft.MOD_ID, "c"), "", false), new ArmorMaterial.Layer(Identifier.of(Minecobbraft.MOD_ID, "c"), "", false)));

  private static RegistryEntry<ArmorMaterial> register(String id, EnumMap<ArmorItem.Type, Integer> defense, int enchantability, RegistryEntry<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
    List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(Identifier.ofVanilla(id)));
    return ModArmorMaterials.register(id, defense, enchantability, equipSound, toughness, knockbackResistance, repairIngredient, list);
  }

  private static RegistryEntry<ArmorMaterial> register(String id, EnumMap<ArmorItem.Type, Integer> defense, int enchantability, RegistryEntry<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient, List<ArmorMaterial.Layer> layers) {
    EnumMap<ArmorItem.Type, Integer> enumMap = new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class);
    for (ArmorItem.Type type : ArmorItem.Type.values()) {
      enumMap.put(type, defense.get(type));
    }
    return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.ofVanilla(id), new ArmorMaterial(enumMap, enchantability, equipSound, repairIngredient, layers, toughness, knockbackResistance));
  }
}
