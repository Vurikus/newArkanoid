package my.game.screen;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ScreenUtils;
import my.game.ArkanoidGame;
import my.game.config.GameConstant;
import my.game.human.model.Squad;
import my.game.model.Ball;
import my.game.model.Cell;
import my.game.model.GameObject;

public class GameScreen implements Screen {
    private ArkanoidGame game;
    private Array<GameObject> objects;

    public GameScreen(ArkanoidGame game) {
        this.game = game;
        this.objects = new Array<>();
        objects.add(new Ball(GameConstant.CENTER_WIDTH, 40));
        objects.add(new Cell(GameConstant.CENTER_WIDTH, GameConstant.CENTER_HEIGHT));
        objects.add(new Cell(GameConstant.CENTER_WIDTH, GameConstant.CENTER_HEIGHT + Cell.height));
        objects.add(new Cell(GameConstant.CENTER_WIDTH, GameConstant.CENTER_HEIGHT + Cell.height * 2));
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0.2f, 1);
        game.batch.begin();
        for(GameObject go: objects){
            game.batch.draw(go.getTexture(), go.x, go.y);
        }
        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
