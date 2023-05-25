package com.rayin19.v2.pokemon.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.rayin19.v2.pokemon.Pokemon;
import com.rayin19.v2.pokemon.Settings;
import com.rayin19.v2.pokemon.controller.PlayerController;
import com.rayin19.v2.pokemon.model.Actor;
import com.rayin19.v2.pokemon.model.Camera;
import com.rayin19.v2.pokemon.model.TileMap;

public class GameScreen extends AbstractScreen{

    private Actor player;
    private TileMap map;
    private Camera camera;
    private PlayerController controller;
    private SpriteBatch batch;
    private Texture playerStandingSouth;
    private Texture grass;


    public GameScreen(Pokemon app) {
        super(app);

        playerStandingSouth = new Texture("test_south_stand.png");
        grass = new Texture("GrassTile.png");
        batch = new SpriteBatch();
        map = new TileMap(10,10);
        player = new Actor(map,0,0);
        controller = new PlayerController(player);
        camera = new Camera();
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(controller);
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0,0,0,1);
        batch.begin();

        camera.update(player.getX() + 0.5f, player.getY() + 0.5f);
        float worldStartX = Gdx.graphics.getWidth()/2 - camera.getCameraX()*Settings.SCALED_TILE_SIZE;
        float worldStartY = Gdx.graphics.getHeight()/2 - camera.getCameraY()*Settings.SCALED_TILE_SIZE;

        for (int x = 0; x < map.getWidth(); x++) {
            for (int y = 0; y < map.getHeight(); y++) {
                batch.draw(
                        grass,
                        worldStartX+x*Settings.SCALED_TILE_SIZE,
                        worldStartY+y*Settings.SCALED_TILE_SIZE,
                        Settings.SCALED_TILE_SIZE,
                        Settings.SCALED_TILE_SIZE
                );
            }
        }
        //Each tile is 20 pixel
        batch.draw(playerStandingSouth,
                worldStartX+player.getX()* Settings.SCALED_TILE_SIZE,
                worldStartY+player.getY()*Settings.SCALED_TILE_SIZE,
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
