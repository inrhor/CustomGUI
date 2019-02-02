package custom.gui.networkgui;

/**
 * �Զ�����������
 */
public class NetWorkGuiCustomField extends NetWorkGuiObject {

    int x, y, width, height, id, maxStringLength, textureX, textureY;
    String url;

    /**
     * ����һ���Զ��������
     *
     * @param url ����ͼƬ��ַ
     * @param id ��ťID
     * @param x ��ť������
     * @param y ��ť������
     * @param width ��ť���
     * @param height ��ť�߶�
     * @param textureX ͼƬѡȡ��������
     * @param maxStringLength ����ı�����
     * @param textureY ͼƬѡȡ���������
     */
    public NetWorkGuiCustomField(String url, int id, int x, int y, int width, int height, int textureX, int textureY, int maxStringLength) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.maxStringLength = maxStringLength;
        this.url = url;
        this.textureX = textureX;
        this.textureY = textureY;
        type = "GuiCustomField";
    }
}
