package custom.gui.networkgui;

/**
 * �ı�����
 */
public class NetWorkGuiText extends NetWorkGuiObject {

    public String str;
    public int x, y, color, id;

    /**
     * ����һ���ı�
     *
     * @param str �ı�
     * @param id ��ťID
     * @param x ��ť������
     * @param y ��ť������
     * @param color ��ɫ��0x��ɫ
     */
    public NetWorkGuiText(String str, int id, int x, int y, int color) {
        this.id = id;
        this.str = str;
        this.x = x;
        this.y = y;
        this.color = color;
        type = "GuiText";
    }

}
