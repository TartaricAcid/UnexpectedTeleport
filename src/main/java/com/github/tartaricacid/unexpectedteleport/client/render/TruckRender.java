package com.github.tartaricacid.unexpectedteleport.client.render;

import com.github.tartaricacid.unexpectedteleport.UnexpectedTeleport;
import com.github.tartaricacid.unexpectedteleport.client.model.TruckModel;
import com.github.tartaricacid.unexpectedteleport.entity.EntityTruck;
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
public class TruckRender extends EntityRenderer<EntityTruck> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(UnexpectedTeleport.MOD_ID, "textures/entity/truck.png");
    private static final TruckModel MODEL = new TruckModel();

    public TruckRender(EntityRendererManager manager) {
        super(manager);
    }

    @Override
    public void render(EntityTruck entityTruck, float yaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer typeBuffer, int packedLightIn) {
        super.render(entityTruck, yaw, partialTicks, matrixStack, typeBuffer, packedLightIn);
        matrixStack.pushPose();
        matrixStack.scale(0.75f, 0.75f, 0.75f);
        matrixStack.mulPose(Vector3f.YN.rotationDegrees(yaw));
        matrixStack.mulPose(Vector3f.ZN.rotationDegrees(180));
        matrixStack.translate(0, -1.5, 0);
        IVertexBuilder ivertexbuilder = typeBuffer.getBuffer(MODEL.renderType(TEXTURE));
        MODEL.renderToBuffer(matrixStack, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStack.popPose();
    }

    @Override
    public ResourceLocation getTextureLocation(EntityTruck entityTruck) {
        return TEXTURE;
    }
}
