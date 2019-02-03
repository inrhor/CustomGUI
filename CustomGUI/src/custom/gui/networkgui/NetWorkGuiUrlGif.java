package custom.gui.networkgui;

/**
 * GIFͼƬ����
 */
public class NetWorkGuiUrlGif extends NetWorkGuiObject {

    public String path;
    public int x, y, textureX, textureY, width, height, id, speed;
    float textureWidth, textureHeight;

    /**
     * ����һ��GIFͼƬ
     *
     * @param path ��ַ
     * @param id ID
     * @param x ������
     * @param speed �����ԽС�ٶ�Խ��
     * @param y ������
     * @param textureX ͼƬѡȡ��������
     * @param textureY ͼƬѡȡ���������
     * @param width ͼƬ��ȡ���
     * @param height ͼƬ��ȡ�߶�
     * @param textureWidth ͼƬ��ʾ���
     * @param textureHeight ͼƬ��ʾ�߶�
     */
    public NetWorkGuiUrlGif(String path, int id, int speed, int x, int y, int textureX, int textureY, int width, int height, float textureWidth, float textureHeight) {
        this.path = path;
        this.x = x;
        this.y = y;
        this.textureX = textureX;
        this.textureY = textureY;
        this.width = width;
        this.height = height;
        this.id = id;
        this.speed = speed;
        this.textureWidth = textureWidth;
        this.textureHeight = textureHeight;
        type = "GuiUrlGif";
    }

}
