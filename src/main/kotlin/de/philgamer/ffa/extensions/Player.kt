package de.philgamer.ffa.extensions

import de.philgamer.ffa.utils.*
import net.axay.kspigot.extensions.geometry.LocationArea
import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.block.Block
import org.bukkit.entity.Player
import org.bukkit.inventory.EquipmentSlot
import org.bukkit.util.Vector

fun Player.getUnderMaterial(): Material? {
    if (player!!.location.subtract(0.0, 1.0, 0.0).block.type != Material.AIR) {
        return null
    }
    return player!!.location.subtract(0.0, 1.0, 0.0).block.type
}

fun Player.getUnderBlock(): Block? {
    if (player!!.location.subtract(0.0, 1.0, 0.0).block.type != Material.AIR) {
        return null
    }
    return player!!.location.subtract(0.0, 1.0, 0.0).block
}
fun Player.isInArea(location: Location, location2: Location): Boolean =
    LocationArea(location, location2).isInArea(this.location, false, 0)

fun Player.killPlayer() {
    player!!.health = 0.0
}
fun Player.clearInventory() {
    player!!.inventory.clear()
}
fun Player.giveEquip() {
    player!!.inventory.setItem(0, sword)
    player!!.inventory.setItem(1, rod)
    player!!.inventory.setItem(EquipmentSlot.OFF_HAND, shield)
    player!!.inventory.setItem(4, cobble)
    player!!.inventory.setItem(EquipmentSlot.HEAD, diamondHelmet)
    player!!.inventory.setItem(EquipmentSlot.CHEST, diamondPlate)
    player!!.inventory.setItem(EquipmentSlot.LEGS, diamondLeggins)
    player!!.inventory.setItem(EquipmentSlot.FEET, diamondBoots)
}

