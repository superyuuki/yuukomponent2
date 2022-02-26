package com.superyuuki.yuukomponent.core;

import org.bukkit.Server;
import org.bukkit.plugin.Plugin;

import java.util.concurrent.Executor;

public class SpigotExecutor implements Executor {

    private final Plugin plugin;

    public SpigotExecutor(Plugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void execute(Runnable command) {
        if (plugin.getServer().isPrimaryThread()) {
            command.run();

            return;
        }

        plugin.getServer().getScheduler().runTask(plugin, command);
    }
}
