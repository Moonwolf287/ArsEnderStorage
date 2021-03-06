package io.github.moonwolf287.ars_enderstorage;

import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ArsEnderStorageMod.MODID)
public class ArsEnderStorageMod {
    //Currently not using any config
    //public static ForgeConfigSpec SERVER_CONFIG
    public static final String MODID = "ars_enderstorage";

    // Currently not used
    // Directly reference a log4j logger
    // private static final Logger LOGGER = LogManager.getLogger()

    public ArsEnderStorageMod() {
        ArsNouveauRegistry.registerGlyphs();
        ArsEnderStorageConfig.registerGlyphConfigs();
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, ArsEnderStorageConfig.CLIENT_CONFIG);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        //Nothing to do here (yet)
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        //Nothing to do here (yet)
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // Nothing to do here (yet)
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        private RegistryEvents() {}

        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
        }
    }
}
