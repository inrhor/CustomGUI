package custom.gui.networkgui;

/**
 * ͼƬ����
 */
public class NetWorkGuiImage extends NetWorkGuiObject {

    public String path;
    public int x, y, textureX, textureY, width, height, id;
    float textureWidth, textureHeight;

    /**
     * ����һ��ͼƬ
     *
     * @param path ͼƬ��ַ
     * @param id ID
     * @param x ������
     * @param y ������
     * @param textureX ͼƬѡȡ��������
     * @param textureY ͼƬѡȡ���������
     * @param width ͼƬ��ȡ���
     * @param height ͼƬ��ȡ�߶�
     * @param textureWidth ͼƬ��ʾ���
     * @param textureHeight ͼƬ��ʾ�߶�
     */
    public NetWorkGuiImage(String path, int id, int x, int y, int textureX, int textureY, int width, int height, float textureWidth, float textureHeight) {
        this.id = id;
        this.path = path;
        this.x = x;
        this.y = y;
        this.textureX = textureX;
        this.textureY = textureY;
        this.width = width;
        this.height = height;
        this.textureWidth = textureWidth;
        this.textureHeight = textureHeight;
        type = "GuiImage";
    }

}
