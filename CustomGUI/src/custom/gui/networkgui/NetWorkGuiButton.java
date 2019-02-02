package custom.gui.networkgui;

/**
 * mc�Դ���ť����
 */
public class NetWorkGuiButton extends NetWorkGuiObject {

    public String str;
    public int x, y, width, height, id;

    /**
     * ����һ��mc�Դ��İ�ť
     *
     * @param str ��ť�ı�
     * @param id ��ťID
     * @param x ��ť������
     * @param y ��ť������
     * @param width ��ť���
     * @param height ��ť�߶�
     */
    public NetWorkGuiButton(String str, int id, int x, int y, int width, int height) {
        this.id = id;
        this.str = str;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        type = "GuiButton";
    }

}
