package my.game.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import my.game.TextureBank;

public class Ball extends GameObject {
    private static final Texture texture = TextureBank.ball;
    public static final float width = 5f;
    public static final float height = 5f;

    public Ball(float x, float y) {
        super(x, y, width, height);
    }

    @Override
    public Texture getTexture() {
        return texture;
    }
}
