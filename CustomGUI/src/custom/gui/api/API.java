package custom.gui.api;

import com.google.gson.JsonObject;
import custom.gui.PacketPlayOutCustomPayload;
import custom.gui.listener.MainListener;
import custom.gui.networkgui.NetWorkGui;
import java.util.HashMap;
import java.util.List;
import org.bukkit.entity.Player;

/**
 * �����õ�API��
 */
public class API {

    /**
     * ����ͻ����ϴ�������HashMap
     */
    public static HashMap<String, HashMap<String, String>> variablesMap = new HashMap<>();

    /**
     * Ϊ���p��nwg��GUI
     *
     * @param p ���
     * @param nwg GUI����
     */
    public static void openGui(Player p, NetWorkGui nwg) {
        JsonObject jo = new JsonObject();
        jo.addProperty("Gui", nwg.toJson());
        jo.addProperty("UseDefaultBackground", nwg.useDefaultBackground);
        jo.addProperty("GuiID", nwg.guiID);
        jo.addProperty("Method", "OPENGUI");
        new PacketPlayOutCustomPayload(p, jo.toString()).sendTo();
    }

    /**
     * Ϊ���p����ΪguiType��GUIֲ��nwg��GUI�е����
     *
     * @param p ���
     * @param nwg GUI����
     * @param guiType GUI����
     */
    public static void implantationGUI(Player p, NetWorkGui nwg, GuiType guiType) {
        JsonObject jo = new JsonObject();
        jo.addProperty("Gui", nwg.toJson());
        jo.addProperty("GuiType", guiType.name());
        jo.addProperty("Method", "IMPLANTATIONGUI");
        new PacketPlayOutCustomPayload(p, jo.toString()).sendTo();
    }

    public enum GuiType {
        GuiIngameMenu,
        GuiChat,
        GuiInventory,
        GuiContainerCreative,
        GuiChest,
        GuiCrafting,
        GuiFurnace,
        GuiEnchantment,
        GuiDispenser,
        GuiHopper,
        GuiDownloadTerrain,
        InGame
    }

    /**
     * Ϊ���p�ر����ڵ�GUI
     *
     * @param p ���
     */
    public static void closeNowGui(Player p) {
        JsonObject jo = new JsonObject();
        jo.addProperty("Method", "CLOSENOWGUI");
        new PacketPlayOutCustomPayload(p, jo.toString()).sendTo();
    }

    /**
     * ��ȡ���p��IDΪid��������е��ı�
     *
     * @param p ���
     * @param id �����ID
     * @return ����������е��ı�
     */
    public static String getField(Player p, int id) {
        return variablesMap.get(p.getName()).get(String.valueOf(id));
    }

    /**
     * ��ȡ���p��IDΪid��GUI�Ŀ��
     *
     * @param p ���
     * @param id GUI��ID
     * @return ����GUI�Ŀ��
     */
    public static int getWidth(Player p, int id) {
        return Integer.valueOf(variablesMap.get(p.getName()).get(id + ":width"));
    }

    /**
     * ��ȡ���p��IDΪid��GUI�ĸ߶�
     *
     * @param p ���
     * @param id GUI��ID
     * @return ����GUI�ĸ߶�
     */
    public static int getHeight(Player p, int id) {
        return Integer.valueOf(variablesMap.get(p.getName()).get(id + ":height"));
    }

}
