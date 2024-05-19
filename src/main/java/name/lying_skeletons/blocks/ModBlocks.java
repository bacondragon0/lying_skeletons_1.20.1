package name.lying_skeletons.blocks;


import name.lying_skeletons.ModCore;
import name.lying_skeletons.blocks.custom.LyingSkeletonBlock;
import name.lying_skeletons.blocks.custom.LyingSkeletonBlock2;
import name.lying_skeletons.blocks.custom.LyingSkeletonBlock3;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block LYING_SKELETON_1 = registerBlock("lying_skeleton_1",
            new LyingSkeletonBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).nonOpaque().strength(0.5f)));

    public static final Block LYING_SKELETON_2 = registerBlock("lying_skeleton_2",
            new LyingSkeletonBlock2(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).nonOpaque().strength(0.5f)));

    public static final Block LYING_SKELETON_3 = registerBlock("lying_skeleton_3",
            new LyingSkeletonBlock3(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).nonOpaque().strength(0.5f)));

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
