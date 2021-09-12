package my.game.human.screen;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ScreenUtils;
import my.game.human.HumanGame;
import my.game.human.model.Squad;

public class WarScreen implements Screen {
    private HumanGame game;
    private OrthographicCamera camera;
    private Array<Squad> squads;

    public WarScreen(HumanGame game) {
        this.game = game;
        camera = new OrthographicCamera(10, 10);
        squads = new Array<>();
//        squads.add(new Squad(20, 20));
//        squads.add(new Squad(20, 10));
//        squads.add(new Squad(40, 20));
//        squads.add(new Squad(40, 10));
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0.2f, 1);
//        camera.update();
//        game.batch.setProjectionMatrix(camera.combined);
        game.batch.begin();
        for(Squad squad: squads){
            game.batch.draw(squad.getTexture(), squad.x, squad.y);
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
