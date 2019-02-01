package custom.gui.networkgui;

/**
 * GIFͼƬ����
 */
public class NetWorkGuiUrlsGif extends NetWorkGuiObject {

    public String[] paths;
    public int x, y, textureX, textureY, width, height, id, speed;

    /**
     * ����һ��GIF
     *
     * @param paths ��ַ����
     * @param id ��ťID
     * @param speed �����ԽС�ٶ�Խ��
     * @param x ��ť������
     * @param y ��ť������
     * @param width ��ť���
     * @param height ��ť�߶�
     * @param textureX ͼƬѡȡ��������
     * @param textureY ͼƬѡȡ���������
     */
    public NetWorkGuiUrlsGif(String[] paths, int id, int speed, int x, int y, int textureX, int textureY, int width, int height) {
        this.paths = paths;
        this.x = x;
        this.y = y;
        this.textureX = textureX;
        this.textureY = textureY;
        this.width = width;
        this.height = height;
        this.id = id;
        this.speed = speed;
        type = "GuiUrlsGif";
    }

}
