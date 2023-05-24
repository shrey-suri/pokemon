package com.rayin19.v2.pokemon.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.rayin19.v2.pokemon.Pokemon;
import com.rayin19.v2.pokemon.Settings;
import com.rayin19.v2.pokemon.controller.PlayerController;
import com.rayin19.v2.pokemon.model.Actor;

public class GameScreen extends AbstractScreen{

    private Actor player;
    private PlayerController controller;
    private SpriteBatch batch;
    private Texture playerStandingSouth;


    public GameScreen(Pokemon app) {
        super(app);

        playerStandingSouth = new Texture("test_south_stand.png");
        batch = new SpriteBatch();
        player = new Actor(0,0);
        controller = new PlayerController(player);
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(controller);
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0,0,0,1);
        batch.begin();
        //Each tile is 20 pixel
        batch.draw(playerStandingSouth,
                player.getX()* Settings.SCALED_TILE_SIZE,
                player.getY()*Settings.SCALED_TILE_SIZE,
                Settings.SCALED_TILE_SIZE, Settings.SCALED_TILE_SIZE*(1.5f));
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
        playerStandingSouth.dispose();
    }
}
