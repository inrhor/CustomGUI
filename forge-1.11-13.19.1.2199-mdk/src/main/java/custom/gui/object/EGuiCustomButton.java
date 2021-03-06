package custom.gui.object;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import custom.gui.util.GuiUtil;
import custom.gui.mcobject.GuiCustomButton;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;

public class EGuiCustomButton implements EGuiObject {

    public String str, firstUrl, lastUrl;
    public int x, y, width, height, id, firstColor, lastColor;
    public float textureWidth, textureHeight;
    public GuiCustomButton instance;
    public boolean wheel;

    public EGuiCustomButton(JsonObject obj) {
        GuiUtil.writeInObject(new Gson().fromJson(obj, this.getClass()), this);
        if (TextureManager.imageUrls.get(firstUrl) == null) {
            TextureManager.downloadImage(firstUrl);
        }
        if (TextureManager.imageUrls.get(lastUrl) == null) {
            TextureManager.downloadImage(lastUrl);
        }
    }

    @Override
    public void draw(int mouseX, int mouseY, float partialTicks) {
        instance.xPosition = x;
        instance.yPosition = y;
        instance.displayString = str;
        instance.width = width;
        instance.height = height;
        instance.drawButton(Minecraft.getMinecraft(), mouseX, mouseY);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
    }

    @Override
    public void init() {
        instance = new GuiCustomButton(id, x, y, width, height, textureWidth, textureHeight, firstColor, lastColor, str, firstUrl, lastUrl);
    }
}
