package com.blocklegend001.craftingenchantedgoldenapple;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CraftingEnchantedGoldenApple.MOD_ID)
public class CraftingEnchantedGoldenApple {
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final String MOD_ID = "craftingenchantedgoldenapple";

    public CraftingEnchantedGoldenApple() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }
}