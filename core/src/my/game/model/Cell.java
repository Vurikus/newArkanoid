package my.game.model;

import com.badlogic.gdx.graphics.Texture;
import my.game.TextureBank;

public class Cell extends GameObject {
    private static final Texture texture = TextureBank.cell;
    public static final float width = 10f;
    public static final float height = 5f;

    public Cell(float x, float y) {
        super(x, y, width, height);
    }

    @Override
    public Texture getTexture() {
        return texture;
    }
}
