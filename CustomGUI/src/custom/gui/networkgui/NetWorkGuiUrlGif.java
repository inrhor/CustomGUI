package custom.gui.networkgui;

/**
 * GIFͼƬ����
 */
public class NetWorkGuiUrlGif extends NetWorkGuiObject {

    public String path;
    public int x, y, textureX, textureY, width, height, id, speed;

    /**
     * ����һ��GIFͼƬ
     *
     * @param path ��ַ
     * @param id ��ťID
     * @param x ��ť������
     * @param speed �����ԽС�ٶ�Խ��
     * @param y ��ť������
     * @param width ��ť���
     * @param height ��ť�߶�
     * @param textureX ͼƬѡȡ��������
     * @param textureY ͼƬѡȡ���������
     */
    public NetWorkGuiUrlGif(String path, int id, int speed, int x, int y, int textureX, int textureY, int width, int height) {
        this.path = path;
        this.x = x;
        this.y = y;
        this.textureX = textureX;
        this.textureY = textureY;
        this.width = width;
        this.height = height;
        this.id = id;
        this.speed = speed;
        type = "GuiUrlGif";
    }

}
