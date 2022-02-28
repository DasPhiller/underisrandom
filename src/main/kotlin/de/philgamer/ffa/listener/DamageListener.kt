package de.philgamer.ffa.listener

import de.philgamer.ffa.extensions.isInArea
import de.philgamer.ffa.utils.spawn1
import de.philgamer.ffa.utils.spawn2
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.event.player.PlayerJoinEvent

class DamageListener : Listener {

    @EventHandler
    fun onDamage(event: EntityDamageEvent) {
        if (event.entity !is Player) return
        val player: Player = event.entity as Player
        if (player.isInArea(spawn1, spawn2)) {
            event.isCancelled = true
        }
    }
}