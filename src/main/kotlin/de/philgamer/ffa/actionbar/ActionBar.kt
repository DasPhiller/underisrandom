package de.philgamer.ffa.actionbar

import net.axay.kspigot.extensions.onlinePlayers
import org.bukkit.entity.Player
import java.text.SimpleDateFormat

object ActionBar {

    private val timerFormat = SimpleDateFormat("mm:ss")
    var time: Int = 100

    fun sendActionBar() {
        onlinePlayers.forEach { player ->
            player.sendMessage(timerFormat.format(time))
        }
    }
}