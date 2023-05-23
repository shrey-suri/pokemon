package com.rayin19.v2.pokemon.screen;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.rayin19.v2.pokemon.Pokemon;

public class GameScreen extends AbstractScreen{

    private SpriteBatch batch;

    private Texture player;


    public GameScreen(Pokemon app) {
        super(app);

        player = new Texture("test_south_stand.png");
        batch = new SpriteBatch();
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0,0,0,1);
        batch.begin();
        batch.draw(player,0,0,20,35);
        batch.end();

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
        batch.dispose();
        player.dispose();
    }
}
