package codes.wasabi.xclaim.platform.spigot_1_19;

import codes.wasabi.xclaim.platform.spigot_1_17.SpigotPlatform_1_17;
import org.bukkit.Bukkit;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.UUID;

public class SpigotPlatform_1_19 extends SpigotPlatform_1_17 {

	@Override
	public void setOwningPlayer(SkullMeta skullMeta, UUID uuid, String name) {
		skullMeta.setOwnerProfile(Bukkit.createPlayerProfile(uuid, name));
	}
}
