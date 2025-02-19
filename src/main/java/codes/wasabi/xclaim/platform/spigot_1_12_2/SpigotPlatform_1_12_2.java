package codes.wasabi.xclaim.platform.spigot_1_12_2;

import codes.wasabi.xclaim.platform.PlatformItemPickupListener;
import codes.wasabi.xclaim.platform.spigot_1_12.SpigotPlatform_1_12;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.scheduler.BukkitTask;

import java.util.UUID;

public class SpigotPlatform_1_12_2 extends SpigotPlatform_1_12 {

    @Override
    public boolean bukkitTaskCancelled(BukkitTask task) {
        return task.isCancelled();
    }

    @Override
    public PlatformItemPickupListener getItemPickupListener() {
        return new codes.wasabi.xclaim.platform.spigot_1_12_2.SpigotPlatformItemPickupListener_1_12_2();
    }

}
