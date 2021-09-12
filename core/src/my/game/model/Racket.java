package my.game.model;

import com.badlogic.gdx.graphics.Texture;
import my.game.TextureBank;

public class Racket extends GameObject {
    private static final Texture texture = TextureBank.racket;
    public static final float width = 256f;
    public static final float height = 64f;
    public final float speed = 64f;

    public Racket(float x, float y) {
        super(x, y, width, height);
    }

    @Override
    public Texture getTexture() {
        return texture;
    }
}
