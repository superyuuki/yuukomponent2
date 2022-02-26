package com.superyuuki.yuukomponent.core;

import org.bukkit.plugin.Plugin;

import java.util.concurrent.Executor;

public class AsyncExecutor implements Executor {

    private final Plugin plugin;

    public AsyncExecutor(Plugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void execute(Runnable command) {
        if (!plugin.getServer().isPrimaryThread()) {
            command.run();

            return;
        }

        plugin.getServer().getScheduler().runTaskAsynchronously(plugin, command);
    }
}
