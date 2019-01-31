package custom.gui.gui.object;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import custom.gui.gui.Gui;
import custom.gui.gui.GuiUtil;
import java.awt.image.BufferedImage;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureUtil;
import org.lwjgl.opengl.GL11;

public class EGuiUrlGif implements EGuiObject {

    String path;
    int x, y, textureX, textureY, width, height, id, speed, frameNum = 0, counter = 0, length;
    boolean[] isuploadTextureImage;
    int[] textureIDs;
    BufferedImage[] imgs;

    public EGuiUrlGif(JsonObject obj) {
        GuiUtil.writeInObject(new Gson().fromJson(obj, this.getClass()), this);
        length = TextureManager.gifUrls.get(path).length;
        isuploadTextureImage = new boolean[length];
        textureIDs = new int[length];
        imgs = TextureManager.gifUrls.get(path);
    }

    @Override
    public void draw(Gui gui) {
        counter++;
        if (counter == speed) {
            frameNum++;
            counter = 0;
        }
        if (frameNum == length) {
            frameNum = 0;
        }
        if (!isuploadTextureImage[frameNum]) {
            textureIDs[frameNum] = GL11.glGenTextures();
            TextureUtil.uploadTextureImage(textureIDs[frameNum], imgs[frameNum]);
            isuploadTextureImage[frameNum] = true;
        }
        GlStateManager.bindTexture(textureIDs[frameNum]);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        net.minecraft.client.gui.Gui.drawModalRectWithCustomSizedTexture(x, y, textureX, textureY, width, height, width,
                height);
    }

    @Override
    public void init(Gui gui) {
    }

}
