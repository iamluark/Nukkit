package cn.nukkit.server.block.entity;

import cn.nukkit.api.block.entity.BedBlockEntity;
import cn.nukkit.api.util.data.DyeColor;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NukkitBedBlockEntity implements BedBlockEntity {
    private final DyeColor dyeColor;

    @Override
    public DyeColor getDyeColor() {
        return null;
    }
}