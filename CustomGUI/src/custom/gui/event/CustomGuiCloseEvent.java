package custom.gui.event;

import org.bukkit.event.HandlerList;
import org.bukkit.event.Event;
import org.bukkit.entity.Player;

/**
 * ����ҹر��Զ���GUIʱ��������¼�
 */
public class CustomGuiCloseEvent extends Event {

    private static final HandlerList hl = new HandlerList();
    private int id;
    private Player p;

    public CustomGuiCloseEvent(int id, Player p) {
        this.id = id;
        this.p = p;
    }

    public int getCustomGuiID() {
        return this.id;
    }

    public Player getPlayer() {
        return this.p;
    }

    public static HandlerList getHandlerList() {
        return hl;
    }

    public HandlerList getHandlers() {
        return hl;
    }

}
