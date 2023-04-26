package org.bukkit.craftbukkit.v1_19_R3.inventory;

import com.mohistmc.banner.util.BannerLecternInventory;
import net.minecraft.world.Container;
import net.minecraft.world.level.block.entity.LecternBlockEntity;
import org.bukkit.block.Lectern;
import org.bukkit.inventory.LecternInventory;

public class CraftInventoryLectern extends CraftInventory implements LecternInventory {

    public net.minecraft.world.MenuProvider tile;

    public CraftInventoryLectern(Container inventory) {
        super(inventory);

        /**
        if (inventory instanceof BannerLecternInventory) {
            this.tile = ((BannerLecternInventory) inventory).getLectern();
        }*/
    }

    @Override
    public Lectern getHolder() {
        return (Lectern) inventory.getOwner();
    }
}
