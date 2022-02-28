package de.philgamer.ffa.utils

import net.axay.kspigot.items.itemStack
import net.axay.kspigot.items.meta
import org.bukkit.Material
import org.bukkit.enchantments.Enchantment

val sword = itemStack(Material.DIAMOND_SWORD) {
    meta {
        isUnbreakable = true
        amount = 1
        addEnchant(Enchantment.DAMAGE_ALL, 1, true )
    }
}
val shield = itemStack(Material.SHIELD) {
    meta {
        isUnbreakable = false

    }
}
val cobble = itemStack(Material.COBBLESTONE) {
    meta {
        amount = 64
    }
}
val diamondPlate = itemStack(Material.DIAMOND_CHESTPLATE) {
    meta {
        amount = 1
        addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true)
    }
}
val diamondHelmet = itemStack(Material.DIAMOND_HELMET) {
    meta {
        amount = 1
        addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true)
    }
}
val diamondBoots = itemStack(Material.DIAMOND_BOOTS) {
    meta {
        amount = 1
        addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true)
    }
}
val diamondLeggins = itemStack(Material.DIAMOND_LEGGINGS) {
    meta {
        amount = 1
        addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true)
    }
}
val gap = itemStack(Material.GOLDEN_APPLE) {
    meta {
        amount = 10
    }
}
val rod = itemStack(Material.FISHING_ROD) {
    meta {
        amount = 1
        isUnbreakable = true
    }
}