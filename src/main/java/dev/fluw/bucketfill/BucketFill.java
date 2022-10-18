package dev.fluw.bucketfill;

import net.milkbowl.vault.economy.Economy;
import org.bukkit.ChatColor;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.logging.Logger;

public class BucketFill extends JavaPlugin {

    public static BucketFill instance;

    private static final Logger log = Logger.getLogger("Minecraft");
    private static Economy econ = null;



    @Override
    public void onEnable() {
        if (!setupEconomy() ) {
            log.severe(String.format("[%s] - Disabled due to no Vault dependency found!", getDescription().getName()));
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        setupEconomy();
        this.getConfig().options().copyDefaults();
        saveDefaultConfig();
        instance = this;
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "BucketFill by Fluw is enabled");
        registerCommands();
    }

    public static JavaPlugin getInstance() {
        return instance;
    }

    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }

    public void registerCommands() {
        Objects.requireNonNull(instance.getCommand("bucket")).setExecutor(new Commands());
    }

    public static Economy getEconomy() {
        return econ;
    }



    @Override
    public void onDisable() {

        getServer().getConsoleSender().sendMessage(ChatColor.RED + "BucketFill by Fluw is disabled");

    }

}
