package my.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import my.game.ArkanoidGame;
import my.game.config.GameConstant;
import my.game.human.HumanGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Human";
		config.width = GameConstant.WIDTH;
		config.height = GameConstant.HEIGHT;
		new LwjglApplication(new ArkanoidGame(), config);
	}
}
