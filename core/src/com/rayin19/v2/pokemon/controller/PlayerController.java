package com.rayin19.v2.pokemon.controller;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;
import com.rayin19.v2.pokemon.model.Actor;

public class PlayerController  extends InputAdapter {

    private Actor actor;

    public PlayerController(Actor actor){
        this.actor = actor;
    }

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Keys.UP){
            actor.movePlayer(0,1);
        }
        if (keycode == Keys.DOWN){
            actor.movePlayer(0,-1);
        }
        if (keycode == Keys.LEFT){
            actor.movePlayer(-1,0);
        }
        if (keycode == Keys.RIGHT){
            actor.movePlayer(1,0);
        }

        return false;
    }
}
