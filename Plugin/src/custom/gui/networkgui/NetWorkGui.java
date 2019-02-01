package custom.gui.networkgui;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 * GUI����
 */
public class NetWorkGui {

    public List<NetWorkGuiObject> objList = new ArrayList<>();
    public int guiID;
    public boolean useDefaultBackground = true;

    public NetWorkGui(int guiID) {
        this.guiID = guiID;
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(objList);
    }

    /**
     * �����Ƿ�ʹ��mc�Դ���͸���ɫ����
     *
     * @param flag
     */
    public void setUseDefaultBackground(boolean flag) {
        useDefaultBackground = flag;
    }

}
