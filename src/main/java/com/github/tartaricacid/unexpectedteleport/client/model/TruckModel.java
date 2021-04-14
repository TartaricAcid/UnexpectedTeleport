package com.github.tartaricacid.unexpectedteleport.client.model;

import com.github.tartaricacid.unexpectedteleport.entity.EntityTruck;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TruckModel extends EntityModel<EntityTruck> {
    private final ModelRenderer car;
    private final ModelRenderer bone2;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer gang;
    private final ModelRenderer cube_r43;
    private final ModelRenderer gang2;
    private final ModelRenderer cube_r44;
    private final ModelRenderer bone4;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer cube_r62;
    private final ModelRenderer cube_r63;
    private final ModelRenderer cube_r64;
    private final ModelRenderer cube_r65;
    private final ModelRenderer cube_r66;
    private final ModelRenderer cube_r67;
    private final ModelRenderer cube_r68;
    private final ModelRenderer cube_r69;
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer cube_r73;
    private final ModelRenderer cube_r74;
    private final ModelRenderer cube_r75;
    private final ModelRenderer cube_r76;
    private final ModelRenderer bone9;
    private final ModelRenderer cube_r77;
    private final ModelRenderer cube_r78;
    private final ModelRenderer cube_r79;
    private final ModelRenderer cube_r80;
    private final ModelRenderer cube_r81;
    private final ModelRenderer cube_r82;
    private final ModelRenderer cube_r83;
    private final ModelRenderer cube_r84;
    private final ModelRenderer you;
    private final ModelRenderer cube_r85;
    private final ModelRenderer cube_r86;
    private final ModelRenderer cube_r87;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer cube_r90;
    private final ModelRenderer cube_r91;
    private final ModelRenderer zuo;
    private final ModelRenderer cube_r92;
    private final ModelRenderer lun;
    private final ModelRenderer qian1;
    private final ModelRenderer cube_r93;
    private final ModelRenderer cube_r94;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;
    private final ModelRenderer cube_r97;
    private final ModelRenderer cube_r98;
    private final ModelRenderer cube_r99;
    private final ModelRenderer cube_r100;
    private final ModelRenderer cube_r101;
    private final ModelRenderer cube_r102;
    private final ModelRenderer cube_r103;
    private final ModelRenderer qian2;
    private final ModelRenderer cube_r104;
    private final ModelRenderer cube_r105;
    private final ModelRenderer cube_r106;
    private final ModelRenderer cube_r107;
    private final ModelRenderer cube_r108;
    private final ModelRenderer cube_r109;
    private final ModelRenderer cube_r110;
    private final ModelRenderer cube_r111;
    private final ModelRenderer cube_r112;
    private final ModelRenderer cube_r113;
    private final ModelRenderer cube_r114;
    private final ModelRenderer houlun2;
    private final ModelRenderer qian3;
    private final ModelRenderer cube_r115;
    private final ModelRenderer cube_r116;
    private final ModelRenderer cube_r117;
    private final ModelRenderer cube_r118;
    private final ModelRenderer cube_r119;
    private final ModelRenderer cube_r120;
    private final ModelRenderer cube_r121;
    private final ModelRenderer cube_r122;
    private final ModelRenderer cube_r123;
    private final ModelRenderer cube_r124;
    private final ModelRenderer cube_r125;
    private final ModelRenderer qian5;
    private final ModelRenderer cube_r126;
    private final ModelRenderer cube_r127;
    private final ModelRenderer cube_r128;
    private final ModelRenderer cube_r129;
    private final ModelRenderer cube_r130;
    private final ModelRenderer cube_r131;
    private final ModelRenderer cube_r132;
    private final ModelRenderer cube_r133;
    private final ModelRenderer cube_r134;
    private final ModelRenderer cube_r135;
    private final ModelRenderer cube_r136;
    private final ModelRenderer qian6;
    private final ModelRenderer cube_r137;
    private final ModelRenderer cube_r138;
    private final ModelRenderer cube_r139;
    private final ModelRenderer cube_r140;
    private final ModelRenderer cube_r141;
    private final ModelRenderer cube_r142;
    private final ModelRenderer cube_r143;
    private final ModelRenderer cube_r144;
    private final ModelRenderer cube_r145;
    private final ModelRenderer cube_r146;
    private final ModelRenderer cube_r147;
    private final ModelRenderer qian4;
    private final ModelRenderer cube_r148;
    private final ModelRenderer cube_r149;
    private final ModelRenderer cube_r150;
    private final ModelRenderer cube_r151;
    private final ModelRenderer cube_r152;
    private final ModelRenderer cube_r153;
    private final ModelRenderer cube_r154;
    private final ModelRenderer cube_r155;
    private final ModelRenderer cube_r156;
    private final ModelRenderer cube_r157;
    private final ModelRenderer cube_r158;
    private final ModelRenderer bone6;

    public TruckModel() {
        texWidth = 1024;
        texHeight = 1024;

        car = new ModelRenderer(this);
        car.setPos(0.0F, -20.0F, 0.0F);


        bone2 = new ModelRenderer(this);
        bone2.setPos(0.0F, 24.0F, 29.0F);
        car.addChild(bone2);
        bone2.texOffs(185, 377).addBox(27.391F, -2.9643F, -111.2832F, 6.0F, 3.0F, 2.0F, 0.0F, false);
        bone2.texOffs(68, 29).addBox(28.581F, -52.2143F, -120.719F, 3.0F, 3.0F, 27.0F, 0.0F, false);
        bone2.texOffs(443, 267).addBox(-27.819F, -52.2143F, -86.719F, 59.0F, 3.0F, 12.0F, 0.0F, false);
        bone2.texOffs(452, 20).addBox(-27.819F, -52.2143F, -93.619F, 57.0F, 2.0F, 6.0F, 0.0F, false);
        bone2.texOffs(366, 316).addBox(28.281F, -48.9143F, -120.719F, 3.0F, 1.0F, 27.0F, 0.0F, false);
        bone2.texOffs(389, 206).addBox(28.281F, -49.1143F, -86.819F, 3.0F, 1.0F, 9.0F, 0.0F, false);
        bone2.texOffs(260, 182).addBox(30.381F, -5.9643F, -122.519F, 4.0F, 7.0F, 1.0F, 0.0F, false);
        bone2.texOffs(260, 174).addBox(30.381F, -5.8643F, -124.519F, 4.0F, 12.0F, 1.0F, 0.0F, false);
        bone2.texOffs(260, 174).addBox(-34.381F, -5.8643F, -124.519F, 4.0F, 12.0F, 1.0F, 0.0F, true);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(-31.881F, -2.4643F, -125.619F);
        bone2.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -0.7854F, 0.0F);
        cube_r1.texOffs(399, 329).addBox(-1.0F, -3.51F, -2.5F, 4.0F, 12.0F, 5.0F, 0.0F, true);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(31.881F, -2.4643F, -125.619F);
        bone2.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.7854F, 0.0F);
        cube_r2.texOffs(399, 329).addBox(-3.0F, -3.51F, -2.5F, 4.0F, 12.0F, 5.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(30.781F, -40.7143F, -117.719F);
        bone2.addChild(cube_r3);
        setRotationAngle(cube_r3, -1.789F, 0.0F, 0.0F);
        cube_r3.texOffs(504, 366).addBox(-2.49F, 0.15F, -8.15F, 3.0F, 1.0F, 23.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(31.081F, -40.7143F, -122.119F);
        bone2.addChild(cube_r4);
        setRotationAngle(cube_r4, -1.789F, 0.0F, 0.0F);
        cube_r4.texOffs(345, 433).addBox(-2.49F, -3.15F, -11.55F, 3.0F, 4.0F, 23.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(30.781F, -32.7224F, -81.3547F);
        bone2.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        cube_r5.texOffs(214, 117).addBox(-2.5F, 0.65F, -5.9F, 3.0F, 1.0F, 10.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(30.781F, -30.4724F, -106.3547F);
        bone2.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        cube_r6.texOffs(68, 0).addBox(-2.5F, 0.65F, -15.9F, 3.0F, 1.0F, 28.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(31.081F, -31.1724F, -71.3547F);
        bone2.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        cube_r7.texOffs(149, 296).addBox(-2.49F, -1.65F, -15.9F, 3.0F, 3.0F, 12.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(31.081F, -27.1724F, -106.3547F);
        bone2.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        cube_r8.texOffs(358, 236).addBox(-2.49F, -1.65F, -15.9F, 3.0F, 3.0F, 31.0F, 0.0F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setPos(30.781F, -30.6143F, -123.469F);
        bone2.addChild(cube_r9);
        setRotationAngle(cube_r9, -1.5708F, 0.0F, 0.0F);
        cube_r9.texOffs(371, 337).addBox(-2.48F, -3.1F, -0.65F, 3.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setPos(30.781F, -34.6143F, -88.819F);
        bone2.addChild(cube_r10);
        setRotationAngle(cube_r10, -1.5708F, 0.0F, 0.0F);
        cube_r10.texOffs(38, 451).addBox(-2.48F, -3.1F, -14.4F, 3.0F, 1.0F, 18.0F, 0.0F, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setPos(30.781F, -34.6143F, -80.519F);
        bone2.addChild(cube_r11);
        setRotationAngle(cube_r11, -1.5708F, 0.0F, 0.0F);
        cube_r11.texOffs(282, 465).addBox(-2.48F, -3.1F, -14.4F, 3.0F, 1.0F, 18.0F, 0.0F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setPos(30.781F, -34.6143F, -96.769F);
        bone2.addChild(cube_r12);
        setRotationAngle(cube_r12, -1.5708F, 0.0F, 0.0F);
        cube_r12.texOffs(330, 465).addBox(-2.48F, -3.1F, -13.65F, 3.0F, 1.0F, 18.0F, 0.0F, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setPos(31.081F, -34.8143F, -77.969F);
        bone2.addChild(cube_r13);
        setRotationAngle(cube_r13, -1.5708F, 0.0F, 0.0F);
        cube_r13.texOffs(161, 504).addBox(-2.51F, -3.8F, -17.3F, 3.0F, 3.0F, 23.0F, 0.0F, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setPos(31.081F, -34.6143F, -93.169F);
        bone2.addChild(cube_r14);
        setRotationAngle(cube_r14, -1.5708F, 0.0F, 0.0F);
        cube_r14.texOffs(504, 340).addBox(-2.51F, -2.8F, -17.55F, 3.0F, 3.0F, 23.0F, 0.0F, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setPos(27.081F, 10.7857F, -126.269F);
        bone2.addChild(cube_r15);
        setRotationAngle(cube_r15, -1.5708F, 0.0F, 0.0F);
        cube_r15.texOffs(814, 273).addBox(-58.1F, -18.8F, -20.45F, 61.0F, 16.0F, 12.0F, 0.0F, false);
        cube_r15.texOffs(444, 184).addBox(-58.1F, -2.8F, -16.75F, 61.0F, 4.0F, 12.0F, 0.0F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setPos(49.881F, -28.3143F, -126.069F);
        bone2.addChild(cube_r16);
        setRotationAngle(cube_r16, -1.5708F, 0.0F, -0.7854F);
        cube_r16.texOffs(213, 341).addBox(-24.89F, -0.61F, -17.53F, 7.0F, 1.0F, 4.0F, 0.0F, false);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setPos(-19.119F, 1.6857F, -126.069F);
        bone2.addChild(cube_r17);
        setRotationAngle(cube_r17, -1.5708F, 0.0F, 0.7854F);
        cube_r17.texOffs(120, 344).addBox(-24.89F, -0.61F, -17.53F, 7.0F, 1.0F, 4.0F, 0.0F, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setPos(72.681F, -0.2143F, -126.269F);
        bone2.addChild(cube_r18);
        setRotationAngle(cube_r18, -1.5708F, 0.0F, 0.0F);
        cube_r18.texOffs(213, 324).addBox(-48.6F, -0.8F, -16.79F, 6.0F, 1.0F, 8.0F, 0.0F, false);
        cube_r18.texOffs(151, 327).addBox(-103.2F, -0.8F, -16.79F, 6.0F, 1.0F, 8.0F, 0.0F, false);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setPos(46.781F, 10.7857F, -128.269F);
        bone2.addChild(cube_r19);
        setRotationAngle(cube_r19, -1.5708F, 0.0F, 0.0F);
        cube_r19.texOffs(88, 493).addBox(-54.8F, -4.75F, -15.79F, 15.0F, 5.0F, 3.0F, 0.0F, false);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setPos(72.781F, 12.7857F, -128.269F);
        bone2.addChild(cube_r20);
        setRotationAngle(cube_r20, -1.5708F, 0.0F, 0.0F);
        cube_r20.texOffs(297, 166).addBox(-47.6F, -0.8F, -15.79F, 4.0F, 1.0F, 3.0F, 0.0F, false);
        cube_r20.texOffs(183, 316).addBox(-102.3F, -0.8F, -15.79F, 4.0F, 1.0F, 3.0F, 0.0F, false);

        cube_r21 = new ModelRenderer(this);
        cube_r21.setPos(27.081F, -7.2143F, -126.269F);
        bone2.addChild(cube_r21);
        setRotationAngle(cube_r21, -1.5708F, 0.0F, 0.0F);
        cube_r21.texOffs(130, 111).addBox(-49.6F, -0.8F, -17.79F, 45.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r22 = new ModelRenderer(this);
        cube_r22.setPos(-39.619F, -3.9143F, -126.269F);
        bone2.addChild(cube_r22);
        setRotationAngle(cube_r22, -1.5708F, 0.0F, 1.5708F);
        cube_r22.texOffs(0, 60).addBox(-11.79F, -0.8F, -17.56F, 6.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setPos(5.981F, -3.9143F, -126.269F);
        bone2.addChild(cube_r23);
        setRotationAngle(cube_r23, -1.5708F, 0.0F, 1.5708F);
        cube_r23.texOffs(14, 60).addBox(-11.79F, -0.8F, -17.56F, 6.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r24 = new ModelRenderer(this);
        cube_r24.setPos(27.081F, 7.7857F, -126.269F);
        bone2.addChild(cube_r24);
        setRotationAngle(cube_r24, -1.5708F, 0.0F, 0.0F);
        cube_r24.texOffs(130, 117).addBox(-49.9F, -0.8F, -17.55F, 46.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r25 = new ModelRenderer(this);
        cube_r25.setPos(27.081F, 4.7857F, -126.269F);
        bone2.addChild(cube_r25);
        setRotationAngle(cube_r25, -1.5708F, 0.0F, 0.0F);
        cube_r25.texOffs(130, 119).addBox(-49.9F, -0.8F, -17.55F, 46.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setPos(27.081F, 1.7857F, -126.269F);
        bone2.addChild(cube_r26);
        setRotationAngle(cube_r26, -1.5708F, 0.0F, 0.0F);
        cube_r26.texOffs(130, 121).addBox(-49.9F, -0.8F, -17.55F, 46.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r27 = new ModelRenderer(this);
        cube_r27.setPos(27.081F, -17.2143F, -126.269F);
        bone2.addChild(cube_r27);
        setRotationAngle(cube_r27, -1.789F, 0.0F, 0.0F);
        cube_r27.texOffs(195, 1005).addBox(-54.9F, -0.8F, -32.55F, 56.0F, 1.0F, 19.0F, 0.0F, false);

        cube_r28 = new ModelRenderer(this);
        cube_r28.setPos(27.081F, -12.2143F, -126.269F);
        bone2.addChild(cube_r28);
        setRotationAngle(cube_r28, -1.5708F, 0.0F, 0.0F);
        cube_r28.texOffs(242, 236).addBox(-54.9F, -0.8F, -17.55F, 56.0F, 1.0F, 4.0F, 0.0F, false);

        cube_r29 = new ModelRenderer(this);
        cube_r29.setPos(27.081F, -12.2143F, -124.269F);
        bone2.addChild(cube_r29);
        setRotationAngle(cube_r29, -1.5708F, 0.0F, 0.0F);
        cube_r29.texOffs(435, 307).addBox(-54.9F, -2.8F, -17.55F, 56.0F, 4.0F, 17.0F, 0.0F, false);
        cube_r29.texOffs(183, 324).addBox(1.5F, -2.8F, -17.55F, 3.0F, 4.0F, 24.0F, 0.0F, false);

        cube_r30 = new ModelRenderer(this);
        cube_r30.setPos(28.091F, -6.6643F, -80.219F);
        bone2.addChild(cube_r30);
        setRotationAngle(cube_r30, -1.5708F, 0.0F, 0.0F);
        cube_r30.texOffs(403, 403).addBox(-56.01F, -6.1F, -42.9F, 56.0F, 4.0F, 40.0F, 0.0F, false);
        cube_r30.texOffs(82, 509).addBox(0.49F, -6.1F, -22.3F, 3.0F, 12.0F, 19.0F, 0.0F, false);

        cube_r31 = new ModelRenderer(this);
        cube_r31.setPos(31.091F, -6.6643F, -83.919F);
        bone2.addChild(cube_r31);
        setRotationAngle(cube_r31, -1.5708F, 0.0F, 0.0F);
        cube_r31.texOffs(282, 465).addBox(-2.51F, 2.8F, -45.5F, 3.0F, 3.0F, 42.0F, 0.0F, false);

        cube_r32 = new ModelRenderer(this);
        cube_r32.setPos(31.091F, -6.6643F, -99.019F);
        bone2.addChild(cube_r32);
        setRotationAngle(cube_r32, -1.5708F, 0.0F, 0.0F);
        cube_r32.texOffs(38, 507).addBox(-2.51F, -8.6F, -21.9F, 3.0F, 15.0F, 19.0F, 0.0F, false);

        cube_r33 = new ModelRenderer(this);
        cube_r33.setPos(31.091F, -0.6643F, -114.019F);
        bone2.addChild(cube_r33);
        setRotationAngle(cube_r33, -1.5708F, 0.0F, 0.0F);
        cube_r33.texOffs(488, 488).addBox(-2.51F, -8.5F, -25.5F, 3.0F, 16.0F, 20.0F, 0.0F, false);

        cube_r34 = new ModelRenderer(this);
        cube_r34.setPos(32.891F, -0.2643F, -117.819F);
        bone2.addChild(cube_r34);
        setRotationAngle(cube_r34, -1.5708F, 0.0F, 0.0F);
        cube_r34.texOffs(0, 391).addBox(-5.61F, -6.5F, 0.0F, 6.0F, 10.0F, 1.0F, 0.0F, false);

        cube_r35 = new ModelRenderer(this);
        cube_r35.setPos(32.891F, -9.5643F, -94.119F);
        bone2.addChild(cube_r35);
        setRotationAngle(cube_r35, -1.5708F, 0.0F, 0.0F);
        cube_r35.texOffs(524, 524).addBox(-3.51F, -22.5F, -3.0F, 4.0F, 30.0F, 4.0F, 0.0F, false);

        cube_r36 = new ModelRenderer(this);
        cube_r36.setPos(32.401F, -1.5643F, -73.0046F);
        bone2.addChild(cube_r36);
        setRotationAngle(cube_r36, 0.1309F, 0.0F, 0.0F);
        cube_r36.texOffs(374, 55).addBox(-4.99F, -3.0F, -0.5F, 6.0F, 6.0F, 1.0F, 0.0F, false);

        cube_r37 = new ModelRenderer(this);
        cube_r37.setPos(32.401F, -6.5143F, -74.8546F);
        bone2.addChild(cube_r37);
        setRotationAngle(cube_r37, 0.6109F, 0.0F, 0.0F);
        cube_r37.texOffs(120, 381).addBox(-4.99F, -3.0F, -0.5F, 6.0F, 6.0F, 1.0F, 0.0F, false);

        cube_r38 = new ModelRenderer(this);
        cube_r38.setPos(0.0F, 5.1757F, 55.556F);
        bone2.addChild(cube_r38);
        setRotationAngle(cube_r38, 0.0F, 0.0F, -1.5708F);
        cube_r38.texOffs(579, 814).addBox(2.8F, -12.5F, -165.925F, 10.0F, 3.0F, 199.0F, 0.0F, true);

        cube_r39 = new ModelRenderer(this);
        cube_r39.setPos(0.0F, 5.1757F, 55.556F);
        bone2.addChild(cube_r39);
        setRotationAngle(cube_r39, 0.0F, 0.0F, 1.5708F);
        cube_r39.texOffs(579, 814).addBox(-12.8F, -12.5F, -165.925F, 10.0F, 3.0F, 199.0F, 0.0F, false);
        cube_r39.texOffs(361, 894).addBox(1.2F, -29.5F, -6.925F, 3.0F, 59.0F, 3.0F, 0.0F, false);

        cube_r40 = new ModelRenderer(this);
        cube_r40.setPos(0.0F, 4.4757F, 50.256F);
        bone2.addChild(cube_r40);
        setRotationAngle(cube_r40, 0.0F, 0.0F, 1.5708F);
        cube_r40.texOffs(932, 222).addBox(-4.0F, -11.5F, -142.625F, 8.0F, 23.0F, 5.0F, 0.0F, false);
        cube_r40.texOffs(932, 222).addBox(-4.0F, -11.5F, -2.625F, 8.0F, 23.0F, 5.0F, 0.0F, false);

        cube_r41 = new ModelRenderer(this);
        cube_r41.setPos(0.0F, 7.7757F, -89.744F);
        bone2.addChild(cube_r41);
        setRotationAngle(cube_r41, 0.0F, 0.0F, 1.5708F);
        cube_r41.texOffs(361, 894).addBox(-1.5F, -25.5F, -1.625F, 3.0F, 51.0F, 3.0F, 0.0F, false);

        cube_r42 = new ModelRenderer(this);
        cube_r42.setPos(32.891F, -6.5643F, -103.369F);
        bone2.addChild(cube_r42);
        setRotationAngle(cube_r42, -0.7854F, 0.0F, 0.0F);
        cube_r42.texOffs(120, 327).addBox(-5.49F, -5.5F, -3.0F, 6.0F, 13.0F, 4.0F, 0.0F, false);

        gang = new ModelRenderer(this);
        gang.setPos(39.591F, 33.8857F, 28.881F);
        bone2.addChild(gang);
        gang.texOffs(230, 411).addBox(-2.51F, -35.1F, -4.95F, 1.0F, 8.0F, 3.0F, 0.0F, false);
        gang.texOffs(230, 427).addBox(-2.51F, -35.1F, -96.26F, 1.0F, 8.0F, 3.0F, 0.0F, false);
        gang.texOffs(376, 316).addBox(-5.51F, -44.5F, -87.25F, 4.0F, 18.0F, 3.0F, 0.0F, false);
        gang.texOffs(382, 109).addBox(-5.51F, -44.5F, -15.65F, 4.0F, 17.0F, 3.0F, 0.0F, false);

        cube_r43 = new ModelRenderer(this);
        cube_r43.setPos(-2.0F, -26.0F, -90.75F);
        gang.addChild(cube_r43);
        setRotationAngle(cube_r43, -1.5708F, 0.0F, 0.0F);
        cube_r43.texOffs(422, 467).addBox(0.4F, -89.5F, -11.25F, 1.0F, 95.0F, 3.0F, 0.0F, false);
        cube_r43.texOffs(422, 467).addBox(0.4F, -89.5F, -3.25F, 1.0F, 95.0F, 3.0F, 0.0F, false);

        gang2 = new ModelRenderer(this);
        gang2.setPos(-39.591F, 33.8857F, 28.881F);
        bone2.addChild(gang2);
        gang2.texOffs(230, 411).addBox(1.51F, -35.1F, -4.95F, 1.0F, 8.0F, 3.0F, 0.0F, true);
        gang2.texOffs(230, 427).addBox(1.51F, -35.1F, -96.26F, 1.0F, 8.0F, 3.0F, 0.0F, true);
        gang2.texOffs(376, 316).addBox(1.51F, -44.5F, -87.25F, 4.0F, 18.0F, 3.0F, 0.0F, true);
        gang2.texOffs(382, 109).addBox(1.51F, -44.5F, -15.65F, 4.0F, 17.0F, 3.0F, 0.0F, true);

        cube_r44 = new ModelRenderer(this);
        cube_r44.setPos(2.0F, -26.0F, -90.75F);
        gang2.addChild(cube_r44);
        setRotationAngle(cube_r44, -1.5708F, 0.0F, 0.0F);
        cube_r44.texOffs(422, 467).addBox(-1.4F, -89.5F, -11.25F, 1.0F, 95.0F, 3.0F, 0.0F, true);
        cube_r44.texOffs(422, 467).addBox(-1.4F, -89.5F, -3.25F, 1.0F, 95.0F, 3.0F, 0.0F, true);

        bone4 = new ModelRenderer(this);
        bone4.setPos(-71.0F, 0.0F, 0.0F);
        bone2.addChild(bone4);
        bone4.texOffs(362, 236).addBox(37.391F, -2.9643F, -111.2832F, 7.0F, 3.0F, 2.0F, 0.0F, false);
        bone4.texOffs(242, 206).addBox(39.201F, -52.2143F, -120.719F, 60.0F, 3.0F, 27.0F, 0.0F, false);
        bone4.texOffs(395, 242).addBox(39.201F, -52.2143F, -86.719F, 4.0F, 3.0F, 12.0F, 0.0F, false);
        bone4.texOffs(107, 504).addBox(39.501F, -49.2143F, -116.719F, 4.0F, 1.0F, 23.0F, 0.0F, false);
        bone4.texOffs(358, 253).addBox(39.501F, -49.0143F, -86.819F, 4.0F, 1.0F, 9.0F, 0.0F, false);
        bone4.texOffs(299, 174).addBox(36.401F, -5.9643F, -122.519F, 5.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r45 = new ModelRenderer(this);
        cube_r45.setPos(40.001F, -40.7143F, -117.719F);
        bone4.addChild(cube_r45);
        setRotationAngle(cube_r45, -1.789F, 0.0F, 0.0F);
        cube_r45.texOffs(498, 28).addBox(-0.51F, 0.15F, -8.15F, 4.0F, 1.0F, 23.0F, 0.0F, false);

        cube_r46 = new ModelRenderer(this);
        cube_r46.setPos(71.201F, -54.3479F, -95.9927F);
        bone4.addChild(cube_r46);
        setRotationAngle(cube_r46, -1.1694F, 0.0F, 0.0F);
        cube_r46.texOffs(435, 328).addBox(-30.0F, -1.4F, -6.5F, 60.0F, 2.0F, 10.0F, 0.0F, false);

        cube_r47 = new ModelRenderer(this);
        cube_r47.setPos(99.191F, -47.3979F, -106.3427F);
        bone4.addChild(cube_r47);
        setRotationAngle(cube_r47, -2.7489F, 0.0F, 0.0F);
        cube_r47.texOffs(444, 195).addBox(-58.0F, -0.15F, -11.55F, 60.0F, 2.0F, 5.0F, 0.0F, false);

        cube_r48 = new ModelRenderer(this);
        cube_r48.setPos(99.191F, -50.2979F, -105.3427F);
        bone4.addChild(cube_r48);
        setRotationAngle(cube_r48, -2.7489F, 0.0F, 0.0F);
        cube_r48.texOffs(443, 253).addBox(-58.0F, -0.15F, -11.55F, 60.0F, 2.0F, 12.0F, 0.0F, false);

        cube_r49 = new ModelRenderer(this);
        cube_r49.setPos(99.191F, -52.3979F, -106.2427F);
        bone4.addChild(cube_r49);
        setRotationAngle(cube_r49, -2.7489F, 0.0F, 0.0F);
        cube_r49.texOffs(435, 285).addBox(-58.0F, -0.15F, -11.55F, 60.0F, 2.0F, 20.0F, 0.0F, false);

        cube_r50 = new ModelRenderer(this);
        cube_r50.setPos(99.191F, -54.4979F, -107.1427F);
        bone4.addChild(cube_r50);
        setRotationAngle(cube_r50, -2.7489F, 0.0F, 0.0F);
        cube_r50.texOffs(382, 109).addBox(-58.0F, -0.15F, -11.55F, 60.0F, 2.0F, 23.0F, 0.0F, false);

        cube_r51 = new ModelRenderer(this);
        cube_r51.setPos(108.091F, -38.2143F, -118.119F);
        bone4.addChild(cube_r51);
        setRotationAngle(cube_r51, -1.5708F, 0.0F, 0.0F);
        cube_r51.texOffs(89, 686).addBox(-5.5F, -0.15F, -13.05F, 11.0F, 0.0F, 26.0F, 0.0F, true);

        cube_r52 = new ModelRenderer(this);
        cube_r52.setPos(33.701F, -40.7143F, -121.119F);
        bone4.addChild(cube_r52);
        setRotationAngle(cube_r52, -1.5708F, 0.0F, 0.0F);
        cube_r52.texOffs(89, 686).addBox(-5.51F, -3.15F, -10.55F, 11.0F, 0.0F, 26.0F, 0.0F, false);

        cube_r53 = new ModelRenderer(this);
        cube_r53.setPos(39.701F, -40.7143F, -122.119F);
        bone4.addChild(cube_r53);
        setRotationAngle(cube_r53, -1.789F, 0.0F, 0.0F);
        cube_r53.texOffs(120, 327).addBox(-0.51F, -3.15F, -11.55F, 4.0F, 4.0F, 23.0F, 0.0F, false);

        cube_r54 = new ModelRenderer(this);
        cube_r54.setPos(40.001F, -32.7224F, -81.3547F);
        bone4.addChild(cube_r54);
        setRotationAngle(cube_r54, 0.1745F, 0.0F, 0.0F);
        cube_r54.texOffs(30, 50).addBox(-0.5F, 0.65F, -5.9F, 4.0F, 1.0F, 10.0F, 0.0F, false);

        cube_r55 = new ModelRenderer(this);
        cube_r55.setPos(40.001F, -30.4724F, -106.3547F);
        bone4.addChild(cube_r55);
        setRotationAngle(cube_r55, 0.1745F, 0.0F, 0.0F);
        cube_r55.texOffs(374, 0).addBox(-0.5F, 0.65F, -15.9F, 4.0F, 1.0F, 28.0F, 0.0F, false);

        cube_r56 = new ModelRenderer(this);
        cube_r56.setPos(39.701F, -31.1724F, -71.3547F);
        bone4.addChild(cube_r56);
        setRotationAngle(cube_r56, 0.1745F, 0.0F, 0.0F);
        cube_r56.texOffs(279, 174).addBox(-0.51F, -1.65F, -15.9F, 4.0F, 3.0F, 12.0F, 0.0F, false);

        cube_r57 = new ModelRenderer(this);
        cube_r57.setPos(39.701F, -27.1724F, -106.3547F);
        bone4.addChild(cube_r57);
        setRotationAngle(cube_r57, 0.1745F, 0.0F, 0.0F);
        cube_r57.texOffs(242, 140).addBox(-0.51F, -1.65F, -15.9F, 4.0F, 3.0F, 31.0F, 0.0F, false);

        cube_r58 = new ModelRenderer(this);
        cube_r58.setPos(40.001F, -30.6143F, -123.469F);
        bone4.addChild(cube_r58);
        setRotationAngle(cube_r58, -1.5708F, 0.0F, 0.0F);
        cube_r58.texOffs(151, 344).addBox(-0.52F, -3.1F, -0.65F, 4.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r59 = new ModelRenderer(this);
        cube_r59.setPos(40.001F, -34.6143F, -88.819F);
        bone4.addChild(cube_r59);
        setRotationAngle(cube_r59, -1.5708F, 0.0F, 0.0F);
        cube_r59.texOffs(282, 440).addBox(-0.52F, -3.1F, -14.4F, 4.0F, 1.0F, 18.0F, 0.0F, false);

        cube_r60 = new ModelRenderer(this);
        cube_r60.setPos(40.001F, -34.6143F, -80.519F);
        bone4.addChild(cube_r60);
        setRotationAngle(cube_r60, -1.5708F, 0.0F, 0.0F);
        cube_r60.texOffs(488, 467).addBox(-0.52F, -3.1F, -14.4F, 4.0F, 1.0F, 18.0F, 0.0F, false);

        cube_r61 = new ModelRenderer(this);
        cube_r61.setPos(40.001F, -34.6143F, -96.469F);
        bone4.addChild(cube_r61);
        setRotationAngle(cube_r61, -1.5708F, 0.0F, 0.0F);
        cube_r61.texOffs(138, 504).addBox(-0.52F, -3.1F, -13.65F, 4.0F, 1.0F, 18.0F, 0.0F, false);

        cube_r62 = new ModelRenderer(this);
        cube_r62.setPos(39.701F, -34.8143F, -77.969F);
        bone4.addChild(cube_r62);
        setRotationAngle(cube_r62, -1.5708F, 0.0F, 0.0F);
        cube_r62.texOffs(120, 365).addBox(-0.49F, -3.8F, -17.3F, 4.0F, 3.0F, 23.0F, 0.0F, false);

        cube_r63 = new ModelRenderer(this);
        cube_r63.setPos(39.701F, -34.6143F, -93.169F);
        bone4.addChild(cube_r63);
        setRotationAngle(cube_r63, -1.5708F, 0.0F, 0.0F);
        cube_r63.texOffs(374, 29).addBox(-0.49F, -2.8F, -17.55F, 4.0F, 3.0F, 23.0F, 0.0F, false);

        cube_r64 = new ModelRenderer(this);
        cube_r64.setPos(39.701F, -12.2143F, -124.269F);
        bone4.addChild(cube_r64);
        setRotationAngle(cube_r64, -1.5708F, 0.0F, 0.0F);
        cube_r64.texOffs(183, 296).addBox(-0.5F, -2.8F, -17.55F, 4.0F, 4.0F, 24.0F, 0.0F, false);

        cube_r65 = new ModelRenderer(this);
        cube_r65.setPos(43.691F, -8.2643F, -84.819F);
        bone4.addChild(cube_r65);
        setRotationAngle(cube_r65, -1.5708F, 0.0F, 0.0F);
        cube_r65.texOffs(443, 202).addBox(-0.49F, -6.1F, -5.3F, 56.0F, 47.0F, 4.0F, 0.0F, false);

        cube_r66 = new ModelRenderer(this);
        cube_r66.setPos(39.691F, -6.6643F, -80.219F);
        bone4.addChild(cube_r66);
        setRotationAngle(cube_r66, -1.5708F, 0.0F, 0.0F);
        cube_r66.texOffs(282, 510).addBox(-0.49F, -6.1F, -22.3F, 4.0F, 12.0F, 19.0F, 0.0F, false);

        cube_r67 = new ModelRenderer(this);
        cube_r67.setPos(39.691F, -6.6643F, -83.919F);
        bone4.addChild(cube_r67);
        setRotationAngle(cube_r67, -1.5708F, 0.0F, 0.0F);
        cube_r67.texOffs(38, 462).addBox(-0.49F, 2.8F, -45.5F, 4.0F, 3.0F, 42.0F, 0.0F, false);

        cube_r68 = new ModelRenderer(this);
        cube_r68.setPos(39.691F, -6.6643F, -99.019F);
        bone4.addChild(cube_r68);
        setRotationAngle(cube_r68, -1.5708F, 0.0F, 0.0F);
        cube_r68.texOffs(452, 28).addBox(-0.49F, -8.6F, -21.9F, 4.0F, 15.0F, 19.0F, 0.0F, false);

        cube_r69 = new ModelRenderer(this);
        cube_r69.setPos(39.691F, -0.6643F, -114.019F);
        bone4.addChild(cube_r69);
        setRotationAngle(cube_r69, -1.5708F, 0.0F, 0.0F);
        cube_r69.texOffs(282, 404).addBox(-0.49F, -8.5F, -25.5F, 4.0F, 16.0F, 20.0F, 0.0F, false);

        cube_r70 = new ModelRenderer(this);
        cube_r70.setPos(37.891F, -0.2643F, -117.819F);
        bone4.addChild(cube_r70);
        setRotationAngle(cube_r70, -1.5708F, 0.0F, 0.0F);
        cube_r70.texOffs(428, 51).addBox(-0.49F, -6.5F, 0.0F, 7.0F, 10.0F, 1.0F, 0.0F, false);

        cube_r71 = new ModelRenderer(this);
        cube_r71.setPos(37.891F, -9.5643F, -94.119F);
        bone4.addChild(cube_r71);
        setRotationAngle(cube_r71, -1.5708F, 0.0F, 0.0F);
        cube_r71.texOffs(514, 70).addBox(-0.49F, -22.5F, -3.0F, 5.0F, 30.0F, 4.0F, 0.0F, false);

        cube_r72 = new ModelRenderer(this);
        cube_r72.setPos(38.381F, -1.5643F, -73.0046F);
        bone4.addChild(cube_r72);
        setRotationAngle(cube_r72, 0.1309F, 0.0F, 0.0F);
        cube_r72.texOffs(225, 0).addBox(-1.01F, -3.0F, -0.5F, 7.0F, 6.0F, 1.0F, 0.0F, false);

        cube_r73 = new ModelRenderer(this);
        cube_r73.setPos(38.381F, -6.5143F, -74.8546F);
        bone4.addChild(cube_r73);
        setRotationAngle(cube_r73, 0.6109F, 0.0F, 0.0F);
        cube_r73.texOffs(374, 20).addBox(-1.01F, -3.0F, -0.5F, 7.0F, 6.0F, 1.0F, 0.0F, false);

        cube_r74 = new ModelRenderer(this);
        cube_r74.setPos(50.691F, -1.5643F, 42.131F);
        bone4.addChild(cube_r74);
        setRotationAngle(cube_r74, -1.5708F, 0.0F, 0.0F);
        cube_r74.texOffs(345, 404).addBox(-0.5F, -30.5F, -7.25F, 43.0F, 30.0F, 1.0F, 0.0F, false);

        cube_r75 = new ModelRenderer(this);
        cube_r75.setPos(50.691F, -1.5643F, -48.869F);
        bone4.addChild(cube_r75);
        setRotationAngle(cube_r75, -1.5708F, 0.0F, 0.0F);
        cube_r75.texOffs(130, 0).addBox(-0.5F, -79.6F, -7.25F, 43.0F, 95.0F, 9.0F, 0.0F, false);

        cube_r76 = new ModelRenderer(this);
        cube_r76.setPos(37.891F, -6.5643F, -103.369F);
        bone4.addChild(cube_r76);
        setRotationAngle(cube_r76, -0.7854F, 0.0F, 0.0F);
        cube_r76.texOffs(102, 8).addBox(-0.51F, -5.5F, -3.0F, 7.0F, 13.0F, 4.0F, 0.0F, false);

        bone9 = new ModelRenderer(this);
        bone9.setPos(-0.1F, 0.0F, 0.0F);
        car.addChild(bone9);
        bone9.texOffs(655, 948).addBox(-35.091F, 14.1857F, 117.931F, 71.0F, 17.0F, 3.0F, 0.0F, true);
        bone9.texOffs(151, 336).addBox(-25.409F, 19.1857F, 118.931F, 11.0F, 5.0F, 3.0F, 0.0F, false);
        bone9.texOffs(102, 0).addBox(-8.009F, 16.1857F, 118.931F, 15.0F, 5.0F, 3.0F, 0.0F, false);
        bone9.texOffs(213, 333).addBox(13.591F, 19.1857F, 118.931F, 11.0F, 5.0F, 3.0F, 0.0F, false);
        bone9.texOffs(68, 59).addBox(-25.489F, 21.5857F, 122.431F, 11.0F, 2.0F, 1.0F, 0.0F, false);
        bone9.texOffs(68, 25).addBox(13.581F, 21.5857F, 122.431F, 11.0F, 2.0F, 1.0F, 0.0F, false);
        bone9.texOffs(548, 122).addBox(10.281F, 7.1857F, -45.119F, 11.0F, 7.0F, 5.0F, 0.0F, false);
        bone9.texOffs(410, 0).addBox(9.281F, -1.8143F, -42.119F, 13.0F, 16.0F, 4.0F, 0.0F, false);
        bone9.texOffs(548, 57).addBox(-22.719F, 7.1857F, -45.119F, 11.0F, 7.0F, 5.0F, 0.0F, false);
        bone9.texOffs(151, 365).addBox(-23.719F, -1.8143F, -42.119F, 13.0F, 16.0F, 4.0F, 0.0F, false);

        cube_r77 = new ModelRenderer(this);
        cube_r77.setPos(-20.309F, -45.5643F, -19.869F);
        bone9.addChild(cube_r77);
        setRotationAngle(cube_r77, -1.5708F, 0.0F, 0.0F);
        cube_r77.texOffs(646, 604).addBox(-15.1F, -144.3F, -1.1F, 71.0F, 164.0F, 3.0F, 0.0F, false);

        cube_r78 = new ModelRenderer(this);
        cube_r78.setPos(-0.219F, 22.6857F, 117.706F);
        bone9.addChild(cube_r78);
        setRotationAngle(cube_r78, 0.2618F, 0.0F, 0.0F);
        cube_r78.texOffs(422, 447).addBox(-29.5F, -8.5F, -1.975F, 59.0F, 16.0F, 4.0F, 0.0F, false);

        cube_r79 = new ModelRenderer(this);
        cube_r79.setPos(-0.509F, 30.3107F, 124.631F);
        bone9.addChild(cube_r79);
        setRotationAngle(cube_r79, -1.5708F, 0.0F, 0.0F);
        cube_r79.texOffs(120, 357).addBox(-29.9F, -3.0F, -1.125F, 59.0F, 6.0F, 2.0F, 0.0F, false);

        cube_r80 = new ModelRenderer(this);
        cube_r80.setPos(-20.309F, 13.4357F, -19.869F);
        bone9.addChild(cube_r80);
        setRotationAngle(cube_r80, -1.5708F, 0.0F, 0.0F);
        cube_r80.texOffs(25, 839).addBox(-15.1F, -143.5F, -1.25F, 70.0F, 163.0F, 3.0F, 0.0F, false);

        cube_r81 = new ModelRenderer(this);
        cube_r81.setPos(0.1F, -15.8893F, -37.669F);
        bone9.addChild(cube_r81);
        setRotationAngle(cube_r81, -1.5708F, -1.5708F, 0.0F);
        cube_r81.texOffs(831, 839).addBox(-2.0F, -36.2F, -31.025F, 4.0F, 72.0F, 62.0F, 0.0F, false);

        cube_r82 = new ModelRenderer(this);
        cube_r82.setPos(0.091F, -15.6893F, 120.131F);
        bone9.addChild(cube_r82);
        setRotationAngle(cube_r82, -1.5708F, -1.5708F, 0.0F);
        cube_r82.texOffs(844, 671).addBox(-1.5F, -35.5F, -28.125F, 3.0F, 71.0F, 56.0F, 0.0F, false);

        cube_r83 = new ModelRenderer(this);
        cube_r83.setPos(-3.909F, 15.4357F, 60.131F);
        bone9.addChild(cube_r83);
        setRotationAngle(cube_r83, -1.5708F, 0.0F, 0.0F);
        cube_r83.texOffs(120, 296).addBox(-1.5F, -65.5F, -61.25F, 2.0F, 2.0F, 59.0F, 0.0F, false);
        cube_r83.texOffs(282, 404).addBox(6.5F, -65.5F, -61.25F, 2.0F, 2.0F, 59.0F, 0.0F, false);

        cube_r84 = new ModelRenderer(this);
        cube_r84.setPos(29.091F, 31.1357F, 58.131F);
        bone9.addChild(cube_r84);
        setRotationAngle(cube_r84, -1.5708F, 0.0F, 0.0F);
        cube_r84.texOffs(281, 325).addBox(5.5F, -66.5F, -77.85F, 4.0F, 2.0F, 77.0F, 0.0F, false);
        cube_r84.texOffs(358, 206).addBox(-67.6F, -66.5F, -77.85F, 4.0F, 2.0F, 77.0F, 0.0F, false);

        you = new ModelRenderer(this);
        you.setPos(-34.909F, 15.4357F, -32.869F);
        bone9.addChild(you);


        cube_r85 = new ModelRenderer(this);
        cube_r85.setPos(0.0F, 0.0F, 0.0F);
        you.addChild(cube_r85);
        setRotationAngle(cube_r85, -1.5708F, 0.0F, 0.0F);
        cube_r85.texOffs(382, 0).addBox(-3.5F, -40.5F, -62.25F, 4.0F, 47.0F, 62.0F, 0.0F, false);

        cube_r86 = new ModelRenderer(this);
        cube_r86.setPos(-3.0F, 0.0F, -6.0F);
        you.addChild(cube_r86);
        setRotationAngle(cube_r86, -1.5708F, 0.0F, 0.0F);
        cube_r86.texOffs(120, 296).addBox(0.0F, -65.5F, -61.25F, 2.0F, 2.0F, 59.0F, 0.0F, false);

        cube_r87 = new ModelRenderer(this);
        cube_r87.setPos(-3.0F, 0.0F, -1.0F);
        you.addChild(cube_r87);
        setRotationAngle(cube_r87, -1.5708F, 0.0F, 0.0F);
        cube_r87.texOffs(120, 296).addBox(0.0F, -65.5F, -61.25F, 2.0F, 2.0F, 59.0F, 0.0F, false);

        cube_r88 = new ModelRenderer(this);
        cube_r88.setPos(-3.0F, 0.0F, 4.0F);
        you.addChild(cube_r88);
        setRotationAngle(cube_r88, -1.5708F, 0.0F, 0.0F);
        cube_r88.texOffs(120, 296).addBox(0.0F, -65.5F, -61.25F, 2.0F, 2.0F, 59.0F, 0.0F, false);

        cube_r89 = new ModelRenderer(this);
        cube_r89.setPos(-3.0F, 0.0F, 9.0F);
        you.addChild(cube_r89);
        setRotationAngle(cube_r89, -1.5708F, 0.0F, 0.0F);
        cube_r89.texOffs(120, 296).addBox(0.0F, -65.5F, -61.25F, 2.0F, 2.0F, 59.0F, 0.0F, false);

        cube_r90 = new ModelRenderer(this);
        cube_r90.setPos(2.0F, 0.0F, 49.0F);
        you.addChild(cube_r90);
        setRotationAngle(cube_r90, -1.5708F, 0.0F, 0.0F);
        cube_r90.texOffs(366, 285).addBox(-3.5F, -41.4F, -61.5F, 4.0F, 50.0F, 61.0F, 0.0F, false);

        cube_r91 = new ModelRenderer(this);
        cube_r91.setPos(0.0F, 0.0F, 91.0F);
        you.addChild(cube_r91);
        setRotationAngle(cube_r91, -1.5708F, 0.0F, 0.0F);
        cube_r91.texOffs(312, 78).addBox(-3.5F, -65.5F, -62.25F, 4.0F, 66.0F, 62.0F, 0.0F, false);

        zuo = new ModelRenderer(this);
        zuo.setPos(37.091F, 15.4357F, -32.869F);
        bone9.addChild(zuo);


        cube_r92 = new ModelRenderer(this);
        cube_r92.setPos(0.0F, 0.0F, 0.0F);
        zuo.addChild(cube_r92);
        setRotationAngle(cube_r92, -1.5708F, 0.0F, 0.0F);
        cube_r92.texOffs(0, 0).addBox(-1.7F, -156.5F, -62.25F, 3.0F, 163.0F, 62.0F, 0.0F, false);

        lun = new ModelRenderer(this);
        lun.setPos(26.3993F, 40.6773F, -58.9107F);
        car.addChild(lun);


        qian1 = new ModelRenderer(this);
        qian1.setPos(-0.0083F, -8.9916F, 0.1107F);
        lun.addChild(qian1);
        qian1.texOffs(793, 13).addBox(-2.98F, -5.65F, -7.769F, 5.0F, 11.0F, 11.0F, 1.0F, true);
        qian1.texOffs(814, 38).addBox(-3.075F, 6.75F, -4.5F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r93 = new ModelRenderer(this);
        cube_r93.setPos(0.0F, 0.0F, -1.9F);
        qian1.addChild(cube_r93);
        setRotationAngle(cube_r93, -1.5708F, 0.0F, 0.0F);
        cube_r93.texOffs(814, 38).addBox(-3.075F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r94 = new ModelRenderer(this);
        cube_r94.setPos(0.0F, 0.0F, -1.9F);
        qian1.addChild(cube_r94);
        setRotationAngle(cube_r94, 2.0944F, 0.0F, 0.0F);
        cube_r94.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r95 = new ModelRenderer(this);
        cube_r95.setPos(0.0F, 0.0F, -1.9F);
        qian1.addChild(cube_r95);
        setRotationAngle(cube_r95, -2.618F, 0.0F, 0.0F);
        cube_r95.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r96 = new ModelRenderer(this);
        cube_r96.setPos(0.0F, 0.0F, -1.9F);
        qian1.addChild(cube_r96);
        setRotationAngle(cube_r96, 0.5236F, 0.0F, 0.0F);
        cube_r96.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r97 = new ModelRenderer(this);
        cube_r97.setPos(0.0F, 0.0F, -1.9F);
        qian1.addChild(cube_r97);
        setRotationAngle(cube_r97, -1.0472F, 0.0F, 0.0F);
        cube_r97.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r98 = new ModelRenderer(this);
        cube_r98.setPos(0.0F, 0.0F, -1.9F);
        qian1.addChild(cube_r98);
        setRotationAngle(cube_r98, 2.618F, 0.0F, 0.0F);
        cube_r98.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r99 = new ModelRenderer(this);
        cube_r99.setPos(0.0F, 0.0F, -1.9F);
        qian1.addChild(cube_r99);
        setRotationAngle(cube_r99, -2.0944F, 0.0F, 0.0F);
        cube_r99.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r100 = new ModelRenderer(this);
        cube_r100.setPos(0.0F, 0.0F, -1.9F);
        qian1.addChild(cube_r100);
        setRotationAngle(cube_r100, 1.0472F, 0.0F, 0.0F);
        cube_r100.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r101 = new ModelRenderer(this);
        cube_r101.setPos(0.0F, 0.0F, -1.9F);
        qian1.addChild(cube_r101);
        setRotationAngle(cube_r101, -0.5236F, 0.0F, 0.0F);
        cube_r101.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r102 = new ModelRenderer(this);
        cube_r102.setPos(0.0F, 0.0F, -1.9F);
        qian1.addChild(cube_r102);
        setRotationAngle(cube_r102, 3.1416F, 0.0F, 0.0F);
        cube_r102.texOffs(814, 38).addBox(-3.075F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r103 = new ModelRenderer(this);
        cube_r103.setPos(0.0F, 0.0F, -1.9F);
        qian1.addChild(cube_r103);
        setRotationAngle(cube_r103, 1.5708F, 0.0F, 0.0F);
        cube_r103.texOffs(814, 38).addBox(-3.075F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        qian2 = new ModelRenderer(this);
        qian2.setPos(-52.7903F, -8.9916F, 0.1107F);
        lun.addChild(qian2);
        qian2.texOffs(793, 13).addBox(-2.97F, -5.65F, -7.769F, 5.0F, 11.0F, 11.0F, 1.0F, false);
        qian2.texOffs(814, 38).addBox(-3.075F, 6.75F, -4.5F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r104 = new ModelRenderer(this);
        cube_r104.setPos(0.0F, 0.0F, -1.9F);
        qian2.addChild(cube_r104);
        setRotationAngle(cube_r104, -1.5708F, 0.0F, 0.0F);
        cube_r104.texOffs(814, 38).addBox(-3.075F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r105 = new ModelRenderer(this);
        cube_r105.setPos(0.0F, 0.0F, -1.9F);
        qian2.addChild(cube_r105);
        setRotationAngle(cube_r105, 2.0944F, 0.0F, 0.0F);
        cube_r105.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r106 = new ModelRenderer(this);
        cube_r106.setPos(0.0F, 0.0F, -1.9F);
        qian2.addChild(cube_r106);
        setRotationAngle(cube_r106, -2.618F, 0.0F, 0.0F);
        cube_r106.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r107 = new ModelRenderer(this);
        cube_r107.setPos(0.0F, 0.0F, -1.9F);
        qian2.addChild(cube_r107);
        setRotationAngle(cube_r107, 0.5236F, 0.0F, 0.0F);
        cube_r107.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r108 = new ModelRenderer(this);
        cube_r108.setPos(0.0F, 0.0F, -1.9F);
        qian2.addChild(cube_r108);
        setRotationAngle(cube_r108, -1.0472F, 0.0F, 0.0F);
        cube_r108.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r109 = new ModelRenderer(this);
        cube_r109.setPos(0.0F, 0.0F, -1.9F);
        qian2.addChild(cube_r109);
        setRotationAngle(cube_r109, 2.618F, 0.0F, 0.0F);
        cube_r109.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r110 = new ModelRenderer(this);
        cube_r110.setPos(0.0F, 0.0F, -1.9F);
        qian2.addChild(cube_r110);
        setRotationAngle(cube_r110, -2.0944F, 0.0F, 0.0F);
        cube_r110.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r111 = new ModelRenderer(this);
        cube_r111.setPos(0.0F, 0.0F, -1.9F);
        qian2.addChild(cube_r111);
        setRotationAngle(cube_r111, 1.0472F, 0.0F, 0.0F);
        cube_r111.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r112 = new ModelRenderer(this);
        cube_r112.setPos(0.0F, 0.0F, -1.9F);
        qian2.addChild(cube_r112);
        setRotationAngle(cube_r112, -0.5236F, 0.0F, 0.0F);
        cube_r112.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r113 = new ModelRenderer(this);
        cube_r113.setPos(0.0F, 0.0F, -1.9F);
        qian2.addChild(cube_r113);
        setRotationAngle(cube_r113, 3.1416F, 0.0F, 0.0F);
        cube_r113.texOffs(814, 38).addBox(-3.075F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r114 = new ModelRenderer(this);
        cube_r114.setPos(0.0F, 0.0F, -1.9F);
        qian2.addChild(cube_r114);
        setRotationAngle(cube_r114, 1.5708F, 0.0F, 0.0F);
        cube_r114.texOffs(814, 38).addBox(-3.075F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        houlun2 = new ModelRenderer(this);
        houlun2.setPos(0.0F, 31.6857F, 78.781F);
        car.addChild(houlun2);


        qian3 = new ModelRenderer(this);
        qian3.setPos(26.391F, 0.0F, 2.419F);
        houlun2.addChild(qian3);
        qian3.texOffs(793, 13).addBox(3.02F, -5.65F, -7.769F, 5.0F, 11.0F, 11.0F, 1.0F, true);
        qian3.texOffs(814, 38).addBox(2.925F, 6.75F, -4.5F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r115 = new ModelRenderer(this);
        cube_r115.setPos(6.0F, 0.0F, -1.9F);
        qian3.addChild(cube_r115);
        setRotationAngle(cube_r115, -1.5708F, 0.0F, 0.0F);
        cube_r115.texOffs(814, 38).addBox(-3.075F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r116 = new ModelRenderer(this);
        cube_r116.setPos(6.0F, 0.0F, -1.9F);
        qian3.addChild(cube_r116);
        setRotationAngle(cube_r116, 2.0944F, 0.0F, 0.0F);
        cube_r116.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r117 = new ModelRenderer(this);
        cube_r117.setPos(6.0F, 0.0F, -1.9F);
        qian3.addChild(cube_r117);
        setRotationAngle(cube_r117, -2.618F, 0.0F, 0.0F);
        cube_r117.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r118 = new ModelRenderer(this);
        cube_r118.setPos(6.0F, 0.0F, -1.9F);
        qian3.addChild(cube_r118);
        setRotationAngle(cube_r118, 0.5236F, 0.0F, 0.0F);
        cube_r118.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r119 = new ModelRenderer(this);
        cube_r119.setPos(6.0F, 0.0F, -1.9F);
        qian3.addChild(cube_r119);
        setRotationAngle(cube_r119, -1.0472F, 0.0F, 0.0F);
        cube_r119.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r120 = new ModelRenderer(this);
        cube_r120.setPos(6.0F, 0.0F, -1.9F);
        qian3.addChild(cube_r120);
        setRotationAngle(cube_r120, 2.618F, 0.0F, 0.0F);
        cube_r120.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r121 = new ModelRenderer(this);
        cube_r121.setPos(6.0F, 0.0F, -1.9F);
        qian3.addChild(cube_r121);
        setRotationAngle(cube_r121, -2.0944F, 0.0F, 0.0F);
        cube_r121.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r122 = new ModelRenderer(this);
        cube_r122.setPos(6.0F, 0.0F, -1.9F);
        qian3.addChild(cube_r122);
        setRotationAngle(cube_r122, 1.0472F, 0.0F, 0.0F);
        cube_r122.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r123 = new ModelRenderer(this);
        cube_r123.setPos(6.0F, 0.0F, -1.9F);
        qian3.addChild(cube_r123);
        setRotationAngle(cube_r123, -0.5236F, 0.0F, 0.0F);
        cube_r123.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r124 = new ModelRenderer(this);
        cube_r124.setPos(6.0F, 0.0F, -1.9F);
        qian3.addChild(cube_r124);
        setRotationAngle(cube_r124, 3.1416F, 0.0F, 0.0F);
        cube_r124.texOffs(814, 38).addBox(-3.075F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r125 = new ModelRenderer(this);
        cube_r125.setPos(6.0F, 0.0F, -1.9F);
        qian3.addChild(cube_r125);
        setRotationAngle(cube_r125, 1.5708F, 0.0F, 0.0F);
        cube_r125.texOffs(814, 38).addBox(-3.075F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        qian5 = new ModelRenderer(this);
        qian5.setPos(17.591F, 0.0F, 2.419F);
        houlun2.addChild(qian5);
        qian5.texOffs(793, 13).addBox(3.02F, -5.65F, -7.769F, 5.0F, 11.0F, 11.0F, 1.0F, true);
        qian5.texOffs(814, 38).addBox(2.925F, 6.75F, -4.5F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r126 = new ModelRenderer(this);
        cube_r126.setPos(6.0F, 0.0F, -1.9F);
        qian5.addChild(cube_r126);
        setRotationAngle(cube_r126, -1.5708F, 0.0F, 0.0F);
        cube_r126.texOffs(814, 38).addBox(-3.075F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r127 = new ModelRenderer(this);
        cube_r127.setPos(6.0F, 0.0F, -1.9F);
        qian5.addChild(cube_r127);
        setRotationAngle(cube_r127, 2.0944F, 0.0F, 0.0F);
        cube_r127.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r128 = new ModelRenderer(this);
        cube_r128.setPos(6.0F, 0.0F, -1.9F);
        qian5.addChild(cube_r128);
        setRotationAngle(cube_r128, -2.618F, 0.0F, 0.0F);
        cube_r128.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r129 = new ModelRenderer(this);
        cube_r129.setPos(6.0F, 0.0F, -1.9F);
        qian5.addChild(cube_r129);
        setRotationAngle(cube_r129, 0.5236F, 0.0F, 0.0F);
        cube_r129.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r130 = new ModelRenderer(this);
        cube_r130.setPos(6.0F, 0.0F, -1.9F);
        qian5.addChild(cube_r130);
        setRotationAngle(cube_r130, -1.0472F, 0.0F, 0.0F);
        cube_r130.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r131 = new ModelRenderer(this);
        cube_r131.setPos(6.0F, 0.0F, -1.9F);
        qian5.addChild(cube_r131);
        setRotationAngle(cube_r131, 2.618F, 0.0F, 0.0F);
        cube_r131.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r132 = new ModelRenderer(this);
        cube_r132.setPos(6.0F, 0.0F, -1.9F);
        qian5.addChild(cube_r132);
        setRotationAngle(cube_r132, -2.0944F, 0.0F, 0.0F);
        cube_r132.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r133 = new ModelRenderer(this);
        cube_r133.setPos(6.0F, 0.0F, -1.9F);
        qian5.addChild(cube_r133);
        setRotationAngle(cube_r133, 1.0472F, 0.0F, 0.0F);
        cube_r133.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r134 = new ModelRenderer(this);
        cube_r134.setPos(6.0F, 0.0F, -1.9F);
        qian5.addChild(cube_r134);
        setRotationAngle(cube_r134, -0.5236F, 0.0F, 0.0F);
        cube_r134.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r135 = new ModelRenderer(this);
        cube_r135.setPos(6.0F, 0.0F, -1.9F);
        qian5.addChild(cube_r135);
        setRotationAngle(cube_r135, 3.1416F, 0.0F, 0.0F);
        cube_r135.texOffs(814, 38).addBox(-3.075F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        cube_r136 = new ModelRenderer(this);
        cube_r136.setPos(6.0F, 0.0F, -1.9F);
        qian5.addChild(cube_r136);
        setRotationAngle(cube_r136, 1.5708F, 0.0F, 0.0F);
        cube_r136.texOffs(814, 38).addBox(-3.075F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, true);

        qian6 = new ModelRenderer(this);
        qian6.setPos(-17.591F, 0.0F, 2.419F);
        houlun2.addChild(qian6);
        qian6.texOffs(793, 13).addBox(-2.97F, -5.65F, -7.769F, 5.0F, 11.0F, 11.0F, 1.0F, false);
        qian6.texOffs(814, 38).addBox(-3.075F, 6.75F, -4.5F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r137 = new ModelRenderer(this);
        cube_r137.setPos(0.0F, 0.0F, -1.9F);
        qian6.addChild(cube_r137);
        setRotationAngle(cube_r137, -1.5708F, 0.0F, 0.0F);
        cube_r137.texOffs(814, 38).addBox(-3.075F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r138 = new ModelRenderer(this);
        cube_r138.setPos(0.0F, 0.0F, -1.9F);
        qian6.addChild(cube_r138);
        setRotationAngle(cube_r138, 2.0944F, 0.0F, 0.0F);
        cube_r138.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r139 = new ModelRenderer(this);
        cube_r139.setPos(0.0F, 0.0F, -1.9F);
        qian6.addChild(cube_r139);
        setRotationAngle(cube_r139, -2.618F, 0.0F, 0.0F);
        cube_r139.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r140 = new ModelRenderer(this);
        cube_r140.setPos(0.0F, 0.0F, -1.9F);
        qian6.addChild(cube_r140);
        setRotationAngle(cube_r140, 0.5236F, 0.0F, 0.0F);
        cube_r140.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r141 = new ModelRenderer(this);
        cube_r141.setPos(0.0F, 0.0F, -1.9F);
        qian6.addChild(cube_r141);
        setRotationAngle(cube_r141, -1.0472F, 0.0F, 0.0F);
        cube_r141.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r142 = new ModelRenderer(this);
        cube_r142.setPos(0.0F, 0.0F, -1.9F);
        qian6.addChild(cube_r142);
        setRotationAngle(cube_r142, 2.618F, 0.0F, 0.0F);
        cube_r142.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r143 = new ModelRenderer(this);
        cube_r143.setPos(0.0F, 0.0F, -1.9F);
        qian6.addChild(cube_r143);
        setRotationAngle(cube_r143, -2.0944F, 0.0F, 0.0F);
        cube_r143.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r144 = new ModelRenderer(this);
        cube_r144.setPos(0.0F, 0.0F, -1.9F);
        qian6.addChild(cube_r144);
        setRotationAngle(cube_r144, 1.0472F, 0.0F, 0.0F);
        cube_r144.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r145 = new ModelRenderer(this);
        cube_r145.setPos(0.0F, 0.0F, -1.9F);
        qian6.addChild(cube_r145);
        setRotationAngle(cube_r145, -0.5236F, 0.0F, 0.0F);
        cube_r145.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r146 = new ModelRenderer(this);
        cube_r146.setPos(0.0F, 0.0F, -1.9F);
        qian6.addChild(cube_r146);
        setRotationAngle(cube_r146, 3.1416F, 0.0F, 0.0F);
        cube_r146.texOffs(814, 38).addBox(-3.075F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r147 = new ModelRenderer(this);
        cube_r147.setPos(0.0F, 0.0F, -1.9F);
        qian6.addChild(cube_r147);
        setRotationAngle(cube_r147, 1.5708F, 0.0F, 0.0F);
        cube_r147.texOffs(814, 38).addBox(-3.075F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        qian4 = new ModelRenderer(this);
        qian4.setPos(-26.391F, 0.0F, 2.419F);
        houlun2.addChild(qian4);
        qian4.texOffs(793, 13).addBox(-2.97F, -5.65F, -7.769F, 5.0F, 11.0F, 11.0F, 1.0F, false);
        qian4.texOffs(814, 38).addBox(-3.075F, 6.75F, -4.5F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r148 = new ModelRenderer(this);
        cube_r148.setPos(0.0F, 0.0F, -1.9F);
        qian4.addChild(cube_r148);
        setRotationAngle(cube_r148, -1.5708F, 0.0F, 0.0F);
        cube_r148.texOffs(814, 38).addBox(-3.075F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r149 = new ModelRenderer(this);
        cube_r149.setPos(0.0F, 0.0F, -1.9F);
        qian4.addChild(cube_r149);
        setRotationAngle(cube_r149, 2.0944F, 0.0F, 0.0F);
        cube_r149.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r150 = new ModelRenderer(this);
        cube_r150.setPos(0.0F, 0.0F, -1.9F);
        qian4.addChild(cube_r150);
        setRotationAngle(cube_r150, -2.618F, 0.0F, 0.0F);
        cube_r150.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r151 = new ModelRenderer(this);
        cube_r151.setPos(0.0F, 0.0F, -1.9F);
        qian4.addChild(cube_r151);
        setRotationAngle(cube_r151, 0.5236F, 0.0F, 0.0F);
        cube_r151.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r152 = new ModelRenderer(this);
        cube_r152.setPos(0.0F, 0.0F, -1.9F);
        qian4.addChild(cube_r152);
        setRotationAngle(cube_r152, -1.0472F, 0.0F, 0.0F);
        cube_r152.texOffs(814, 38).addBox(-3.05F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r153 = new ModelRenderer(this);
        cube_r153.setPos(0.0F, 0.0F, -1.9F);
        qian4.addChild(cube_r153);
        setRotationAngle(cube_r153, 2.618F, 0.0F, 0.0F);
        cube_r153.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r154 = new ModelRenderer(this);
        cube_r154.setPos(0.0F, 0.0F, -1.9F);
        qian4.addChild(cube_r154);
        setRotationAngle(cube_r154, -2.0944F, 0.0F, 0.0F);
        cube_r154.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r155 = new ModelRenderer(this);
        cube_r155.setPos(0.0F, 0.0F, -1.9F);
        qian4.addChild(cube_r155);
        setRotationAngle(cube_r155, 1.0472F, 0.0F, 0.0F);
        cube_r155.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r156 = new ModelRenderer(this);
        cube_r156.setPos(0.0F, 0.0F, -1.9F);
        qian4.addChild(cube_r156);
        setRotationAngle(cube_r156, -0.5236F, 0.0F, 0.0F);
        cube_r156.texOffs(814, 38).addBox(-3.025F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r157 = new ModelRenderer(this);
        cube_r157.setPos(0.0F, 0.0F, -1.9F);
        qian4.addChild(cube_r157);
        setRotationAngle(cube_r157, 3.1416F, 0.0F, 0.0F);
        cube_r157.texOffs(814, 38).addBox(-3.075F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        cube_r158 = new ModelRenderer(this);
        cube_r158.setPos(0.0F, 0.0F, -1.9F);
        qian4.addChild(cube_r158);
        setRotationAngle(cube_r158, 1.5708F, 0.0F, 0.0F);
        cube_r158.texOffs(814, 38).addBox(-3.075F, 6.75F, -2.6F, 6.0F, 5.0F, 5.0F, 1.0F, false);

        bone6 = new ModelRenderer(this);
        bone6.setPos(-3.0011F, -12.1111F, 352.8833F);
        car.addChild(bone6);
    }


    @Override
    public void setupAnim(EntityTruck entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        lun.zRot = limbSwingAmount;
        houlun2.zRot = limbSwingAmount;
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        car.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
