package name.lying_skeletons.blocks;


import name.lying_skeletons.ModCore;
import name.lying_skeletons.blocks.custom.LyingSkeletonBlock;
import name.lying_skeletons.blocks.custom.LyingSkeletonWithGoldPickaxeBlock;
import name.lying_skeletons.blocks.custom.LyingSkeletonWithIronPickaxeBlock;
import name.lying_skeletons.blocks.custom.LyingSkeletonWithStonePickaxeBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ModBlocks {

    public static final Block LYING_SKELETON_1 = registerBlock("lying_skeleton_1",
            new LyingSkeletonBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).nonOpaque().strength(0.5f)){
                @Override
                public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
                    return Block.createCuboidShape(4, 0, 4, 12, 22, 12);
                }
            });

    public static final Block LYING_SKELETON_1_IRON_PICKAXE = registerBlock("lying_skeleton_1_iron_pickaxe",
            new LyingSkeletonWithIronPickaxeBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).nonOpaque().strength(0.5f)){
                @Override
                public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
                    return Block.createCuboidShape(4, 0, 4, 12, 22, 12);
                }
            });

    public static final Block LYING_SKELETON_1_GOLD_PICKAXE = registerBlock("lying_skeleton_1_gold_pickaxe",
            new LyingSkeletonWithGoldPickaxeBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).nonOpaque().strength(0.5f)){
                @Override
                public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
                    return Block.createCuboidShape(4, 0, 4, 12, 22, 12);
                }
            });

    public static final Block LYING_SKELETON_1_STONE_PICKAXE = registerBlock("lying_skeleton_1_stone_pickaxe",
            new LyingSkeletonWithStonePickaxeBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).nonOpaque().strength(0.5f)){
                @Override
                public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
                    return Block.createCuboidShape(4, 0, 4, 12, 22, 12);
                }
            });

    public static final Block LYING_SKELETON_2 = registerBlock("lying_skeleton_2",
            new LyingSkeletonBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).nonOpaque().strength(0.5f)){
                @Override
                public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
                    return Block.createCuboidShape(4, 0, 4, 18, 3, 12);
                }
            });

    public static final Block LYING_SKELETON_2_IRON_PICKAXE = registerBlock("lying_skeleton_2_iron_pickaxe",
            new LyingSkeletonWithIronPickaxeBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).nonOpaque().strength(0.5f)){
                @Override
                public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
                    return Block.createCuboidShape(4, 0, 4, 18, 3, 12);
                }
            });

    public static final Block LYING_SKELETON_2_GOLD_PICKAXE = registerBlock("lying_skeleton_2_gold_pickaxe",
            new LyingSkeletonWithGoldPickaxeBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).nonOpaque().strength(0.5f)){
                @Override
                public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
                    return Block.createCuboidShape(4, 0, 4, 18, 3, 12);
                }
            });

    public static final Block LYING_SKELETON_2_STONE_PICKAXE = registerBlock("lying_skeleton_2_stone_pickaxe",
            new LyingSkeletonWithStonePickaxeBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).nonOpaque().strength(0.5f)){
                @Override
                public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
                    return Block.createCuboidShape(4, 0, 4, 12, 22, 12);
                }
            });

    public static final Block LYING_SKELETON_3 = registerBlock("lying_skeleton_3",
            new LyingSkeletonBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).nonOpaque().strength(0.5f)){
                @Override
                public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
                    return Block.createCuboidShape(4, 0, 4, 12, 22, 12);
                }
            });

    public static final Block LYING_SKELETON_3_IRON_PICKAXE = registerBlock("lying_skeleton_3_iron_pickaxe",
            new LyingSkeletonWithIronPickaxeBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).nonOpaque().strength(0.5f)){
                @Override
                public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
                    return Block.createCuboidShape(4, 0, 4, 12, 22, 12);
                }
            });

    public static final Block LYING_SKELETON_3_GOLD_PICKAXE = registerBlock("lying_skeleton_3_gold_pickaxe",
            new LyingSkeletonWithGoldPickaxeBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).nonOpaque().strength(0.5f)){
                @Override
                public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
                    return Block.createCuboidShape(4, 0, 4, 12, 22, 12);
                }
            });

    public static final Block LYING_SKELETON_3_STONE_PICKAXE = registerBlock("lying_skeleton_3_stone_pickaxe",
            new LyingSkeletonWithStonePickaxeBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).nonOpaque().strength(0.5f)){
                @Override
                public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
                    return Block.createCuboidShape(4, 0, 4, 12, 22, 12);
                }
            });

    public static final Block LYING_SKELETON_4 = registerBlock("lying_skeleton_4",
            new LyingSkeletonBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).nonOpaque().strength(0.5f)){
                @Override
                public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
                    return Block.createCuboidShape(2, 0, 2, 16, 8, 16);
                }
            });

    public static final Block LYING_SKELETON_4_IRON_PICKAXE = registerBlock("lying_skeleton_4_iron_pickaxe",
            new LyingSkeletonWithIronPickaxeBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).nonOpaque().strength(0.5f)){
                @Override
                public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
                    return Block.createCuboidShape(2, 0, 2, 16, 8, 16);
                }
            });

    public static final Block LYING_SKELETON_4_GOLD_PICKAXE = registerBlock("lying_skeleton_4_gold_pickaxe",
            new LyingSkeletonWithGoldPickaxeBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).nonOpaque().strength(0.5f)){
                @Override
                public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
                    return Block.createCuboidShape(2, 0, 2, 16, 8, 16);
                }
            });

    public static final Block LYING_SKELETON_4_STONE_PICKAXE = registerBlock("lying_skeleton_4_stone_pickaxe",
            new LyingSkeletonWithStonePickaxeBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).nonOpaque().strength(0.5f)){
                @Override
                public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
                    return Block.createCuboidShape(4, 0, 4, 12, 22, 12);
                }
            });

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ModCore.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ModCore.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ModCore.LOGGER.info("Registering mod blocks for" + ModCore.MOD_ID);
    }
}
