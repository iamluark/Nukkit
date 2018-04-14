package cn.nukkit.server.entity.monster;

import cn.nukkit.api.entity.monster.Slime;
import cn.nukkit.server.NukkitServer;
import cn.nukkit.server.entity.EntityType;
import cn.nukkit.server.entity.LivingEntity;
import cn.nukkit.server.level.NukkitLevel;
import com.flowpowered.math.vector.Vector3f;

public class SlimeEntity extends LivingEntity implements Slime {

    public SlimeEntity(Vector3f position, NukkitLevel level, NukkitServer server) {
        super(EntityType.SLIME, position, level, server, 4);
    }
}