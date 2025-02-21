package me.tuselcraft;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class WindChargeListener implements Listener {

    @EventHandler
    public void onPlayerUseWindCharge(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack mainHandItem = player.getInventory().getItemInMainHand();
        ItemStack offHandItem = player.getInventory().getItemInOffHand();

        if (mainHandItem.getType() == Material.WIND_CHARGE || offHandItem.getType() == Material.WIND_CHARGE) {
            event.setCancelled(true);
        }
    }
}
