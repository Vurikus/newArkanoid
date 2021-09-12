package my.game;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.Array;
import my.game.config.GameConstant;
import my.game.model.Cell;
import my.game.model.GameObject;

public class GameWorldCreator {

    public Array<Cell> makeCells(){
        return makeCells(10);
    }

    public Array<Cell> makeCells(int quantity){
        Array<Cell> cells = new Array<>(quantity);
        int countOnString = (int) (GameConstant.CENTER_WIDTH/Cell.width);
        int lastPosX = (int) (GameConstant.CENTER_WIDTH - Cell.width);
        int lastPosY = (int) (GameConstant.HEIGHT - Cell.height);
        for(int i = 0; i<quantity; i++){
            cells.add(new Cell(lastPosX, lastPosY));
            lastPosX -= Cell.width;
            if(lastPosX < 0) {
                lastPosY -= Cell.height;
                lastPosX = (int) (GameConstant.CENTER_WIDTH - Cell.width);
            }
        }
        return cells;
    }
}
