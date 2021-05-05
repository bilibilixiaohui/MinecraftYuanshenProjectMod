package com.xiaohui.item;

import com.xiaohui.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class Primogem extends Item  {
    public Primogem (){
        this.setRegistryName("primogem");
        this.setUnlocalizedName(Main.MOD_ID+"Primogem");
        this.setMaxStackSize(64);
        this.setCreativeTab(CreativeTabs.MATERIALS);
    }

}
