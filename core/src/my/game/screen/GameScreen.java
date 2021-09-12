package my.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ScreenUtils;
import my.game.ArkanoidGame;
import my.game.GameWorldCreator;
import my.game.config.GameConstant;
import my.game.controller.RacketController;
import my.game.human.model.Squad;
import my.game.model.Ball;
import my.game.model.Cell;
import my.game.model.GameObject;
import my.game.model.Racket;

public class GameScreen implements Screen {
    private ArkanoidGame game;
    private GameWorldCreator creator;
    private RacketController racketController;
    private Array<Cell> cells;
    private Racket racket;
    private Ball ball;

    public GameScreen(ArkanoidGame game) {
        this.game = game;
        racketController = new RacketController();
        creator = new GameWorldCreator();
        this.ball = new Ball(GameConstant.CENTER_WIDTH, 40);
        this.racket = new Racket(GameConstant.CENTER_WIDTH, 0);
        this.cells = creator.makeCells();
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0.2f, 1);
        game.batch.begin();
        for(Cell cell: cells){
            game.batch.draw(cell.getTexture(), cell.x, cell.y, cell.width, cell.height);
        }
        game.batch.draw(racket.getTexture(), racket.x, racket.y, racket.width, racket.height);
        game.batch.draw(ball.getTexture(), ball.x, ball.y, ball.width, ball.height);
        game.batch.end();
        racketController.listenTouchKeyAndChangeCoordinate(racket);
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
