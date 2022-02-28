package de.philgamer.ffa.listener

import de.philgamer.ffa.extensions.giveEquip
import de.philgamer.ffa.utils.spawn
import net.axay.kspigot.event.listen
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent

class ConnectionListener {

    val join = listen<PlayerJoinEvent> {
        it.player.teleport(spawn)
        it.joinMessage(null)
        it.player.giveEquip()
    }
    val quit = listen<PlayerQuitEvent> {
        it.quitMessage(null)
    }

}