package net.minecobbraft.screen.screens;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecobbraft.Minecobbraft;
import net.minecobbraft.screen.screenHandlers.PianoScreenHandler;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class PianoScreen extends HandledScreen<PianoScreenHandler> {
  private static final Identifier TEXTURE = Identifier.of(Minecobbraft.MOD_ID, "textures/gui/piano_gui.png");

  public PianoScreen(PianoScreenHandler handler, PlayerInventory inventory, Text title) {
    super(handler, inventory, title);
  }

  @Override
  protected void init() {
    super.init();
  }

  @Override
  protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
    RenderSystem.setShader(GameRenderer::getPositionProgram);
    RenderSystem.setShaderColor(1f,1f,1f,1f);
    RenderSystem.setShaderTexture(0, TEXTURE);
    int x = (width - backgroundWidth) / 2;
    int y = (height - backgroundHeight) / 2;

    context.drawTexture(TEXTURE, x, y, 0,0, backgroundWidth, backgroundHeight);
  }

  @Override
  public void render(DrawContext context, int mouseX, int mouseY, float delta) {
    renderBackground(context, mouseX, mouseY, delta);
    super.render(context, mouseX, mouseY, delta);
    drawMouseoverTooltip(context, mouseX, mouseY);
  }
}
