package com.github.tartaricacid.unexpectedteleport.client.model;

import com.github.tartaricacid.unexpectedteleport.entity.EntityMagicCircle;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class MagicCircleModel extends EntityModel<EntityMagicCircle> {
    private final ModelRenderer bone;

    public MagicCircleModel() {
        texWidth = 256;
        texHeight = 256;

        bone = new ModelRenderer(this);
        bone.setPos(0.0F, 24.0F, 0.0F);
        bone.texOffs(0, 0).addBox(-32.0F, -0.1F, -32.0F, 64.0F, 0.0F, 64.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(EntityMagicCircle entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        bone.render(matrixStack, buffer, packedLight, packedOverlay);
    }
}
