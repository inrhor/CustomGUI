package custom.gui.networkgui;

/**
 * �Զ��尴ť����
 */
public class NetWorkGuiCustomButton extends NetWorkGuiObject {

    String str, firstUrl, lastUrl;
    int x, y, width, height, id, firstColor, lastColor;
    float textureWidth, textureHeight;

    /**
     * ����һ���Զ��尴ť
     *
     * @param str �ı�
     * @param firstUrl ���δ��ͣʱ��ͼƬ��ַ
     * @param lastUrl �����ͣʱ��ͼƬ��ַ
     * @param id ID
     * @param x ������
     * @param y ������
     * @param width ͼƬ��ȡ���
     * @param height ͼƬ��ȡ�߶�
     * @param textureWidth ͼƬ��ʾ���
     * @param textureHeight ͼƬ��ʾ�߶�
     * @param firstColor ���δ��ͣʱ���ı���ɫ
     * @param lastColor �����ͣʱ���ı���ɫ
     */
    public NetWorkGuiCustomButton(String str, String firstUrl, String lastUrl, int id, int x, int y, int width, int height, float textureWidth, float textureHeight, int firstColor, int lastColor) {
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
        this.textureWidth = textureWidth;
        this.textureHeight = textureHeight;
        this.type = "GuiCustomButton";
    }
}
