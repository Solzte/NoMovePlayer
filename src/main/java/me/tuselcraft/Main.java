package me.tuselcraft;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("\033[38;5;214m   _____       _     _       ");
        getLogger().info("\033[38;5;214m  / ____|     | |   | |      ");
        getLogger().info("\033[38;5;214m | (___   ___ | |___| |_ ___ ");
        getLogger().info("\033[38;5;214m  \\___ \\ / _ \\| |_  / __/ _ \\");
        getLogger().info("\033[38;5;214m  ____) | (_) | |/ /| ||  __/");
        getLogger().info("\033[38;5;214m |_____/ \\___/|_/___|\\__\\___|");
        getLogger().info("\033[0m");
        getLogger().info("\033[38;5;82mNoMovePlugin başarıyla etkinleştirildi!");
        
        getServer().getPluginManager().registerEvents(new FishingRodListener(), this);
        getServer().getPluginManager().registerEvents(new WindChargeListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("\033[38;5;214m   _____       _     _       ");
        getLogger().info("\033[38;5;214m  / ____|     | |   | |      ");
        getLogger().info("\033[38;5;214m | (___   ___ | |___| |_ ___ ");
        getLogger().info("\033[38;5;214m  \\___ \\ / _ \\| |_  / __/ _ \\");
        getLogger().info("\033[38;5;214m  ____) | (_) | |/ /| ||  __/");
        getLogger().info("\033[38;5;214m |_____/ \\___/|_/___|\\__\\___|");
        getLogger().info("\033[0m");
        getLogger().info("\033[38;5;196mNoMovePlugin devre dışı bırakıldı!");
    }
}
