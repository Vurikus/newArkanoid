package my.game.human.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public abstract class Squad extends Rectangle {
    public static final float width = 8f;
    public static final float height = 5f;
    private int _life = 100;
    private int power = 5;
//    private float _x = 0;
//    private float _y = 0;

    public Squad(float x, float y) {
        super(x, y, width, height);
//        this._x = x;
//        this._y = y;
    }

//    public float x() {
//        return _x;
//    }
//
//    public void x(float _x) {
//        this._x = _x;
//    }
//
//    public float y() {
//        return _y;
//    }
//
//    public void y(float _y) {
//        this._y = _y;
//    }

    public abstract Texture getTexture();

    public int life() {
        return _life;
    }

    protected void life(int _life) {
        this._life = _life;
    }

    public void damage(int damage){
        this._life -= damage;
    }
}
