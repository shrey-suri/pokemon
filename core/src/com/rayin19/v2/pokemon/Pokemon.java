package com.rayin19.v2.pokemon;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.rayin19.v2.pokemon.screen.GameScreen;

public class Pokemon extends Game {

    private GameScreen screen;
    @Override
    public void create() {
        screen = new GameScreen(this);

        this.setScreen(screen);
    }

    @Override
    public void render() {

        //Between Frames we need to clear the screen or else we will overlap with each othe
        super.render();
    }
}
