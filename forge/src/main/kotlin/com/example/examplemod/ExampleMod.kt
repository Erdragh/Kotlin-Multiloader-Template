package com.example.examplemod

import net.minecraftforge.fml.common.Mod

@Mod(Constants.MOD_ID)
class ExampleMod() {
    init {
        Constants.LOG.info("Hello Forge world from Kotlin!")
        CommonObject.init()
    }
}