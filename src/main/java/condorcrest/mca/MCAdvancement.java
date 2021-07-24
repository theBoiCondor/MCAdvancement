package condorcrest.mca;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MCAdvancement.MOD_ID)
public class MCAdvancement
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mca";

    public MCAdvancement() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
