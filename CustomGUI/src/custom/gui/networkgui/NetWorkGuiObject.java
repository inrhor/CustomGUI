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
     * @return �������
     */
    public NetWorkGuiObject setWheel(boolean flag) {
        wheel = flag;
        return this;
    }
}
