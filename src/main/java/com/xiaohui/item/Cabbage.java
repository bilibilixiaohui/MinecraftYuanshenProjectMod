package com.xiaohui.item;

import com.xiaohui.Main;
import net.minecraft.item.Item;

public class Cabbage extends Item  {
public Cabbage (){
    this.setRegistryName("cabbage");
    this.setUnlocalizedName(Main.MOD_ID+"Cabbage");
    this.setMaxStackSize(64);
}
}
