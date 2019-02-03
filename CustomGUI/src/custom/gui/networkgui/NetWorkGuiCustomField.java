package custom.gui.networkgui;

/**
 * �Զ�����������
 */
public class NetWorkGuiCustomField extends NetWorkGuiObject {

    int x, y, width, height, id, maxStringLength, textureX, textureY;
    float textureWidth, textureHeight;
    String url;

    /**
     * ����һ���Զ��������
     *
     * @param url ����ͼƬ��ַ
     * @param id ID
     * @param x ������
     * @param y ������
     * @param width ͼƬ��ȡ���
     * @param height ͼƬ��ȡ�߶�
     * @param textureX ͼƬѡȡ��������
     * @param maxStringLength ����ı�����
     * @param textureY ͼƬѡȡ���������
     * @param textureWidth ͼƬ��ʾ���
     * @param textureHeight ͼƬ��ʾ�߶�
     */
    public NetWorkGuiCustomField(String url, int id, int x, int y, int width, int height, int textureX, int textureY, float textureWidth, float textureHeight, int maxStringLength) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.maxStringLength = maxStringLength;
        this.url = url;
        this.textureX = textureX;
        this.textureY = textureY;
        this.textureWidth = textureWidth;
        this.textureHeight = textureHeight;
        type = "GuiCustomField";
    }
}
