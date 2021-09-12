package my.game.controller;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import my.game.config.GameConstant;
import my.game.model.Racket;

public class RacketController {
    public void listenTouchKeyAndChangeCoordinate(Racket r){
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT))
            r.x -= r.speed * Gdx.graphics.getDeltaTime();
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT))
            r.x += r.speed * Gdx.graphics.getDeltaTime();
        if (r.x < 0)
            r.x = 0;
        if (r.x > GameConstant.WIDTH - r.getWidth())
            r.x = GameConstant.WIDTH - r.getWidth();
    }
}
