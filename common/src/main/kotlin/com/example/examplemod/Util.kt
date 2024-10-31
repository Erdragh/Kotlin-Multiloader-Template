package com.example.examplemod

import net.minecraft.resources.ResourceLocation

fun String.location() = ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, this)
fun String.location(namespace: String) = ResourceLocation.fromNamespaceAndPath(namespace, this)
fun String.vanillaLocation() = ResourceLocation.withDefaultNamespace(this)