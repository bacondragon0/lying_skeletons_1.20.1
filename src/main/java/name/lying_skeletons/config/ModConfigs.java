package name.lying_skeletons.config;

import com.mojang.datafixers.util.Pair;
import name.lying_skeletons.ModCore;

public class ModConfigs {
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;

    public static int MAX_BONE_DROP;
    public static int MIN_BONE_DROP;

    public static int MAX_IRON_PICKAXE_DAMAGE_DROP;
    public static int MIN_IRON_PICKAXE_DAMAGE_DROP;

    public static int MAX_GOLD_PICKAXE_DAMAGE_DROP;
    public static int MIN_GOLD_PICKAXE_DAMAGE_DROP;

    public static int MAX_STONE_PICKAXE_DAMAGE_DROP;
    public static int MIN_STONE_PICKAXE_DAMAGE_DROP;

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(ModCore.MOD_ID + "_config").provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addKeyValuePair(new Pair<>("corpse.min.bone.drop", 3), "int");
        configs.addKeyValuePair(new Pair<>("corpse.max.bone.drop", 5), "int");

        configs.addKeyValuePair(new Pair<>("corpse.min.iron.pickaxe.damage.drop", 180), "int");
        configs.addKeyValuePair(new Pair<>("corpse.max.iron.pickaxe.damage.drop", 215), "int");

        configs.addKeyValuePair(new Pair<>("corpse.min.gold.pickaxe.damage.drop", 18), "int");
        configs.addKeyValuePair(new Pair<>("corpse.max.gold.pickaxe.damage.drop", 24), "int");

        configs.addKeyValuePair(new Pair<>("corpse.min.stone.pickaxe.damage.drop", 98), "int");
        configs.addKeyValuePair(new Pair<>("corpse.max.stone.pickaxe.damage.drop", 121), "int");
    }

    private static void assignConfigs() {
        MAX_BONE_DROP = CONFIG.getOrDefault("corpse.max.bone.drop", 5);
        MIN_BONE_DROP = CONFIG.getOrDefault("corpse.min.bone.drop", 3);

        MAX_IRON_PICKAXE_DAMAGE_DROP = CONFIG.getOrDefault("corpse.max.iron.pickaxe.damage.drop", 215);
        MIN_IRON_PICKAXE_DAMAGE_DROP = CONFIG.getOrDefault("corpse.min.iron.pickaxe.damage.drop", 180);

        MAX_GOLD_PICKAXE_DAMAGE_DROP = CONFIG.getOrDefault("corpse.max.gold.pickaxe.damage.drop", 24);
        MIN_GOLD_PICKAXE_DAMAGE_DROP = CONFIG.getOrDefault("corpse.min.gold.pickaxe.damage.drop", 18);

        MAX_STONE_PICKAXE_DAMAGE_DROP = CONFIG.getOrDefault("corpse.max.stone.pickaxe.damage.drop", 121);
        MIN_STONE_PICKAXE_DAMAGE_DROP = CONFIG.getOrDefault("corpse.min.stone.pickaxe.damage.drop", 98);

        System.out.println("All " + configs.getConfigsList().size() + " have been set properly");
    }
}