package CC;


import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerChatEvent;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

public class ChatCo extends PluginBase implements Listener {

  public ChatCo() {}

  public void onLoad() {
    getLogger().info("Loading ChatCo");
  }

  public void onEnable() {
    getServer().getPluginManager().registerEvents(this, this);
    getLogger().info("Enabled ChatCo");
  }

  @EventHandler
  public void onChat(PlayerChatEvent e) {
    String msg = e.getMessage();
    if (msg.startsWith(">")) {
      msg = TextFormat.GREEN + msg;
      e.setMessage(msg);
    }
  }
}
