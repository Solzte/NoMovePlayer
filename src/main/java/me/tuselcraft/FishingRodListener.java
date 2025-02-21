package me.tuselcraft;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.entity.Player;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.ItemStack;

public class FishingRodListener implements Listener {

    @EventHandler
    public void onPlayerFish(PlayerFishEvent event) {
        Player player = event.getPlayer();

        if (event.getCaught() instanceof LivingEntity) {
            event.setCancelled(true); 
            player.sendMessage("§cÜzgünüm, bunu yapamazsın.");

            PlayerInventory inventory = player.getInventory();
            ItemStack mainHandItem = inventory.getItemInMainHand();
            ItemStack offHandItem = inventory.getItemInOffHand();

            if (mainHandItem != null && !mainHandItem.getType().isAir()) {
                player.getWorld().dropItemNaturally(player.getLocation(), mainHandItem);
                inventory.setItemInMainHand(null);
            }

            if (offHandItem != null && !offHandItem.getType().isAir()) {
                player.getWorld().dropItemNaturally(player.getLocation(), offHandItem);
                inventory.setItemInOffHand(null);
            }
        }
    }
}