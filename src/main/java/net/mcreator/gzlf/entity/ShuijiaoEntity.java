package net.mcreator.gzlf.entity;

import net.minecraft.world.entity.animal.Salmon;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.TryFindWaterGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.gzlf.init.GzlfModItems;
/*
*	Salmon 类：服务端 + 客户端共用的核心逻辑类，定义三文鱼的行为、属性、尺寸变种和数据同步规则。
 * 	SalmonRenderer 类：客户端专用的渲染器，根据尺寸状态选择对应模型，完成三文鱼的视觉渲染和动画效果。
*	SalmonRenderState 类：客户端专用的状态容器，临时存储渲染所需的三文鱼尺寸信息。
*
*
* 和Entity相关的路径，牵一发而动全身
* src/main/java/net/mcreator/gzlf/entity/ShuijiaoEntity.java 这里是注册，管这个实体的行为、属性、尺寸变种和数据同步规则。生物AI出问题看这里
* src/main/java/net/mcreator/gzlf/client/renderer/ShuijiaoRenderer.java 这里是客户端专用的渲染器，根据尺寸状态选择对应模型，渲染出问题看这里
* src/main/java/net/mcreator/gzlf//client/renderer/entity/state/ShuijiaoRendererState 临时存储状态信息，mcr没有提供这个路径
* src/main/java/net/mcreator/gzlf/init/GzlfModEntities.java 这里存储了注册的生物大全，原版代码里没这段
* src/main/java/net/mcreator/gzlf/init/GzlfModEntityRenderers.java 这里是所有render（渲染器）的注册，如果不添加新的render不用管
* elements/Shuijiao.mod.json 这个element下面的东西好像是给mcr看的，对mod没什么影响
* src/main/java/net/mcreator/gzlf/init/GzlfModSounds.java 这里是存放相关的声音事件，一般不会出什么问题
* src/main/resources/data/gzlf/worldgen/biome/htytocean.json 如果想调节该生物在群系的生成状况，到这个路径下，如果和ModEntities里生物注册类型不匹配会导致无限生成电脑卡死
*
*/
public class ShuijiaoEntity extends Salmon {
	public ShuijiaoEntity(EntityType<ShuijiaoEntity> type, Level world) {
		super(type, world);
		xpReward = 2;	//掉落2经验
		setNoAi(false);
		this.setPathfindingMalus(PathType.WATER, 0);
		this.moveControl = new MoveControl(this) {
		};
	}
	//重写鱼群最大数量8条
	@Override
	public int getMaxSchoolSize() {
		return 8;
	}
	//掉落物品
	protected void dropCustomDeathLoot(ServerLevel serverLevel, DamageSource source, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(serverLevel, source, recentlyHitIn);
		this.spawnAtLocation(serverLevel, new ItemStack(GzlfModItems.MUSICDISCYLWJ));
	}
	//下面是音效
	@Override
	public SoundEvent getAmbientSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("gzlf:shuijiao"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("gzlf:zsmbwy"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("gzlf:uhhh"));
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	//设置基础数值，血量啥的
	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
		builder = builder.add(Attributes.MAX_HEALTH, 8);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.STEP_HEIGHT, 0);
		return builder;
	}
}