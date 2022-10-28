package fr.av3nirr;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CmdSay implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)){
            return false;
        }
        else{
            Player p = (Player) sender;
            for (Player target : Bukkit.getOnlinePlayers()){
                target.sendMessage("§a[§fAnnonce§a] §f" + args[1].replace("&", "§"));
            }
        }
        return true;
    }
}
