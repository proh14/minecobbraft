package net.minecobbraft.world;

import net.minecobbraft.Minecobbraft;
import net.minecobbraft.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
  public static final RegistryKey<ConfiguredFeature<?, ?>> JAVASCRIPT_ORE_KEY = registerKey("javascript_ore");
  public static final RegistryKey<ConfiguredFeature<?, ?>> JAVA_ORE_KEY = registerKey("java_ore");
  public static final RegistryKey<ConfiguredFeature<?, ?>> PYTHON_ORE_KEY = registerKey("python_ore");

  public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {
    RuleTest stoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
    RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
    RuleTest netherReplacables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
    RuleTest endReplacables = new BlockMatchRuleTest(Blocks.END_STONE);

    List<OreFeatureConfig.Target> overworldJavascriptOres =
            List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.JAVASCRIPT_ORE.getDefaultState()));
    List<OreFeatureConfig.Target> overworldJavaOres =
            List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.JAVA_ORE.getDefaultState()), OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_JAVA_ORE.getDefaultState()));
    List<OreFeatureConfig.Target> overworldPythonOres =
            List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.PYTHON_ORE.getDefaultState()), OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_PYTHON_ORE.getDefaultState()));


    register(context, JAVASCRIPT_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldJavascriptOres, 20));
    register(context, JAVA_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldJavaOres, 10));
    register(context, PYTHON_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPythonOres, 10));
  }

  public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
    return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Minecobbraft.MOD_ID, name));
  }

  private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                 RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
    context.register(key, new ConfiguredFeature<>(feature, configuration));
  }
}