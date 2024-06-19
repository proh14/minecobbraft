package net.minecobbraft.item.custom;

import net.minecobbraft.utils.World;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import java.util.List;

public class KaktusDaggerItem extends SwordItem {
    public KaktusDaggerItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (user.getItemCooldownManager().isCoolingDown(this)) return ActionResult.FAIL;

        user.getItemCooldownManager().set(this, 10 * World.SECOND);
        stack.damage(1, user, EquipmentSlot.MAINHAND);
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 5 * World.SECOND), user);
        return ActionResult.success(true);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("item.minecobbraft.kaktus_dagger.tooltip"));
    }
}
