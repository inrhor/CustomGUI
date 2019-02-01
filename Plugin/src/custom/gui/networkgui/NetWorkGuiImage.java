package custom.gui.networkgui;

/**
 * ͼƬ����
 */
public class NetWorkGuiImage extends NetWorkGuiObject {

    public String path;
    public int x, y, textureX, textureY, width, height, id;

    /**
     * ����һ��ͼƬ
     *
     * @param path ͼƬ��ַ
     * @param id ��ťID
     * @param x ��ť������
     * @param y ��ť������
     * @param width ��ť���
     * @param height ��ť�߶�
     * @param textureX ͼƬѡȡ��������
     * @param textureY ͼƬѡȡ���������
     */
    public NetWorkGuiImage(String path, int id, int x, int y, int textureX, int textureY, int width, int height) {
        this.id = id;
        this.path = path;
        this.x = x;
        this.y = y;
        this.textureX = textureX;
        this.textureY = textureY;
        this.width = width;
        this.height = height;
        type = "GuiImage";
    }

}
