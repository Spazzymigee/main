package com.koehn.ue.gui;

import com.koehn.ue.Reference;
import com.koehn.ue.handler.ConfigurationHandler;

import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class UEGuiConfig extends GuiConfig
{
    public UEGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MODID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}