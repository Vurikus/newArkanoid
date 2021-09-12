package my.game.human.model;

import com.badlogic.gdx.graphics.Texture;
import my.game.human.TextureBank;

public class Archer extends Squad {
    public static final Texture texture = TextureBank.archer;

    public Archer(float x, float y) {
        super(x, y);
    }

    @Override
    public Texture getTexture() {
        return texture;
    }
}
