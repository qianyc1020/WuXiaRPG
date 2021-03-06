package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.mygdx.game.stage.StageManager;
import com.mygdx.game.stage.StageMain;

public class WorldController extends InputAdapter {
    private WorldController() {
        init();
    }
    private static WorldController instance = new WorldController();
    public static WorldController instance(){
        return instance;
    }
    StageManager stageManager = StageManager.getInstance();
    public long gameTurn = 0L;

    private void init() {
        stageManager.currentStage = new StageMain();
    }
    public void update() {
        gameTurn++;
        Gdx.input.setInputProcessor(stageManager.currentStage);
        stageManager.currentStage.act();
    }

}