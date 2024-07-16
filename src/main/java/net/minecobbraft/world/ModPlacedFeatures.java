package net.minecobbraft.world;

import net.minecobbraft.Minecobbraft;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
  public static final RegistryKey<PlacedFeature> JAVASCRIPT_ORE_PLACED_KEY = registerKey("javascript_ore_placed");
  public static final RegistryKey<PlacedFeature> JAVA_ORE_PLACED_KEY = registerKey("java_ore_placed");
  public static final RegistryKey<PlacedFeature> PYTHON_ORE_PLACED_KEY = registerKey("python_ore_placed");
  public static final RegistryKey<PlacedFeature> C_ORE_PLACED_KEY = registerKey("c_ore_placed");

  public static void boostrap(Registerable<PlacedFeature> context) {
    var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

    register(context, JAVASCRIPT_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.JAVASCRIPT_ORE_KEY),
            ModOrePlacement.modifiersWithCount(13, // Veins per Chunk
                    HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(80))));

    register(context, PYTHON_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PYTHON_ORE_KEY),
            ModOrePlacement.modifiersWithCount(12, // Veins per Chunk
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-10), YOffset.fixed(80))));

    register(context, JAVA_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.JAVA_ORE_KEY),
            ModOrePlacement.modifiersWithCount(10, // Veins per Chunk
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(20))));

    register(context, C_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.C_ORE_KEY),
            ModOrePlacement.modifiersWithCount(10, // Veins per Chunk
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-40))));
  }

  public static RegistryKey<PlacedFeature> registerKey(String name) {
    return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Minecobbraft.MOD_ID, name));
  }

  private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                               List<PlacementModifier> modifiers) {
    context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
  }
}
