package de.philgamer.ffa

import de.philgamer.ffa.actionbar.ActionBar
import de.philgamer.ffa.listener.ConnectionListener
import de.philgamer.ffa.listener.DamageListener
import net.axay.kspigot.chat.KColors
import net.axay.kspigot.event.register
import net.axay.kspigot.extensions.pluginManager
import net.axay.kspigot.main.KSpigot
import org.bukkit.event.Listener
import kotlin.math.log

class Main : KSpigot() {

    companion object {
        val prefix = "${KColors.BLUE}FFA |${KColors.GRAY}"
        val trolls: ArrayList<String> = ArrayList<String>()
    }

    override fun startup() {
        logger.info("${KColors.GREEN}The Plugin was enabled!")
        ConnectionListener().join.register()
        ConnectionListener().quit.register()
        pluginManager.registerEvents(DamageListener(), this)
        ActionBar.sendActionBar()
        val desc = description
        logger.info("$prefix This plugin was made by ${desc.authors}")
    }

    override fun shutdown() {
        logger.info("${KColors.RED}The Plugin was disabled!")
    }
}
