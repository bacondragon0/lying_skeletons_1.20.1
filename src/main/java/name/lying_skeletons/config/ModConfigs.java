package name.lying_skeletons.config;

import com.mojang.datafixers.util.Pair;
import name.lying_skeletons.ModCore;
import name.lying_skeletons.config.ModConfigProvider;
import name.lying_skeletons.config.SimpleConfig;

public class ModConfigs {
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;

    public static int MAX_BONE_DROP;
    public static int MIN_BONE_DROP;

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(ModCore.MOD_ID + "_config").provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addKeyValuePair(new Pair<>("corpse.min.bone.drop", 3), "int");
        configs.addKeyValuePair(new Pair<>("corpse.max.bone.drop", 5), "int");
    }

    private static void assignConfigs() {
        MAX_BONE_DROP = CONFIG.getOrDefault("corpse.max.bone.drop", 5);
        MIN_BONE_DROP = CONFIG.getOrDefault("corpse.min.bone.drop", 3);

        System.out.println("All " + configs.getConfigsList().size() + " have been set properly");
    }
}