package fr.av3nirr;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    private static Main INSTANCE;
    @Override
    public void onEnable() {
        System.out.println("§aEvoCore activé");
        INSTANCE = this;
        setCommands();


    }
    public static Main getInstance(){
        return INSTANCE;
    }
    @Override
    public void onDisable() {
        System.out.println(ChatColor.RED + "§aEvoCore s'éteint tranquil");
    }
    public void setCommands(){
        this.getCommand("say").setExecutor(new CmdSay());
    }
}
