package custom.gui.networkgui;

/**
 * ����
 */
public abstract class NetWorkGuiObject {

    public String type = "GuiObject";
    public boolean wheel = false;

    /**
     * �����Ƿ����������ƶ�
     *
     * @param flag ��/��
     */
    public void setWheel(boolean flag) {
        wheel = flag;
    }
}
