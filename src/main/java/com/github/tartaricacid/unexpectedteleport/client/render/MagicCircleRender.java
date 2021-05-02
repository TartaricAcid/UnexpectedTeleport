package com.github.tartaricacid.unexpectedteleport.client.render;

import com.github.tartaricacid.unexpectedteleport.UnexpectedTeleport;
import com.github.tartaricacid.unexpectedteleport.client.model.MagicCircleModel;
import com.github.tartaricacid.unexpectedteleport.entity.EntityMagicCircle;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class MagicCircleRender extends EntityRenderer<EntityMagicCircle> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(UnexpectedTeleport.MOD_ID, "textures/entity/magic_circle.png");
    private static final MagicCircleModel MODEL = new MagicCircleModel();

    public MagicCircleRender(EntityRendererManager manager) {
        super(manager);
    }

    @Override
    public void render(EntityMagicCircle magicCircle, float yaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer typeBuffer, int packedLightIn) {
        super.render(magicCircle, yaw, partialTicks, matrixStack, typeBuffer, packedLightIn);
        matrixStack.pushPose();
        float scale = magicCircle.tickCount / 20.0f;
        matrixStack.scale(scale, scale, scale);
        matrixStack.mulPose(Vector3f.YN.rotationDegrees(magicCircle.tickCount * 15));
        matrixStack.mulPose(Vector3f.ZN.rotationDegrees(180));
        matrixStack.translate(0, -1.5, 0);
        IVertexBuilder ivertexbuilder = typeBuffer.getBuffer(MODEL.renderType(TEXTURE));
        MODEL.renderToBuffer(matrixStack, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStack.popPose();
    }

    @Override
    public ResourceLocation getTextureLocation(EntityMagicCircle magicCircle) {
        return TEXTURE;
    }
}
