package custom.gui.networkgui;

/**
 * �Զ��尴ť����
 */
public class NetWorkGuiCustomButton extends NetWorkGuiObject {

    String str, firstUrl, lastUrl;
    int x, y, width, height, id, firstColor, lastColor;

    /**
     * ����һ���Զ��尴ť
     *
     * @param str ��ť�ı�
     * @param firstUrl ���δ��ͣʱ��ͼƬ��ַ
     * @param lastUrl �����ͣʱ��ͼƬ��ַ
     * @param id ��ťID
     * @param x ��ť������
     * @param y ��ť������
     * @param width ��ť���
     * @param height ��ť�߶�
     * @param firstColor ���δ��ͣʱ���ı���ɫ
     * @param lastColor �����ͣʱ���ı���ɫ
     */
    public NetWorkGuiCustomButton(String str, String firstUrl, String lastUrl, int id, int x, int y, int width, int height, int firstColor, int lastColor) {
        this.id = id;
        this.str = str;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.firstUrl = firstUrl;
        this.lastUrl = lastUrl;
        this.firstColor = firstColor;
        this.lastColor = lastColor;
        type = "GuiCustomButton";
    }
}
