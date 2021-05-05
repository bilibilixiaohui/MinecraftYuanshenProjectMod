package com.xiaohui.registry;

import com.xiaohui.item.Cabbage;
import com.xiaohui.item.Primogem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;


@Mod.EventBusSubscriber
public class ItemRegistryHandler {
public static final Cabbage cabbage=new Cabbage();
public static final Primogem primogem=new Primogem();
@SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<Item>event){
    IForgeRegistry<Item> registry=event.getRegistry();
    registry.register(cabbage);
    registry.register(primogem);
}
@SideOnly(Side.CLIENT)
@SubscribeEvent
    public static void onModelRegistry(ModelRegistryEvent event){
registryModel(cabbage);
registryModel(primogem);
}
    @SideOnly(Side.CLIENT)
    private static void registryModel(Item item){
        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(item.getRegistryName(),"inventory");
        ModelLoader.setCustomModelResourceLocation(item,0,modelResourceLocation);
    }
}
