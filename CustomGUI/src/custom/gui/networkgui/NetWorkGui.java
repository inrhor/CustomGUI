package custom.gui.networkgui;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 * GUI����
 */
public class NetWorkGui {

    public List<NetWorkGuiObject> objList = new ArrayList<>();
    public int guiID, wheelSpeed = 15;
    public boolean useDefaultBackground = true;

    public NetWorkGui(int guiID) {
        this.guiID = guiID;
    }

    public String objListToJson() {
        Gson gson = new Gson();
        return gson.toJson(objList);
    }

    /**
     * �����������ٶ�
     *
     * @param wheelSpeed �������ٶ�
     */
    public void setWheelSpeed(int wheelSpeed) {
        this.wheelSpeed = wheelSpeed;
    }

    /**
     * �����Ƿ�ʹ��mc�Դ���͸���ɫ����
     *
     * @param flag ��/��
     */
    public void setUseDefaultBackground(boolean flag) {
        useDefaultBackground = flag;
    }

}
