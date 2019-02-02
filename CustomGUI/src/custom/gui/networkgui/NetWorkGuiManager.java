package custom.gui.networkgui;

import java.util.ArrayList;
import java.util.List;

/**
 * ������
 */
public class NetWorkGuiManager {

    static int id = 0;
    public static List<String> imageUrls = new ArrayList<>();
    public static List<String> gifUrls = new ArrayList<>();

    /**
     * ����һ���Զ��������
     *
     * @return ����һ�����ظ���ID
     */
    public static int distributeID() {
        return id++;
    }

    /**
     * ���һ��url����ҽ���ʱ�Զ���ȡ��ͼƬ��ַ�����б��У���Ч����ͼƬ����ʱ��
     *
     * @param url ͼƬ��ַ
     */
    public static void addImageURL(String url) {
        imageUrls.add(url);
    }

    /**
     * ���һ��url����ҽ���ʱ�Զ���ȡ��GIFͼƬ��ַ�����б��У���Ч����GIFͼƬ����ʱ��
     *
     * @param url ͼƬ��ַ
     */
    public static void addGifURL(String url) {
        gifUrls.add(url);
    }
}
