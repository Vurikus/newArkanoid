package my.game.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public abstract class GameObject extends Rectangle {

    public GameObject(float x, float y, float width, float height) {
        super(x, y, width, height);
    }

    public abstract Texture getTexture();
}
