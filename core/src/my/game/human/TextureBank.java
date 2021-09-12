package my.game.human;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class TextureBank {
    public static final Texture archer = new Texture(Gdx.files.internal("Archer.png"));
    public static final Texture cavalry = new Texture(Gdx.files.internal("Cavalry.png"));
    public static final Texture general = new Texture(Gdx.files.internal("General.png"));
    public static final Texture infantry = new Texture(Gdx.files.internal("Infantry.png"));
}
