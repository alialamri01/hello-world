package com.tutorial.main;

import java.awt.*;
import java.util.Random;

public class Player extends GameObject {

    Random r = new Random();

    public Player(int x, int y, ID id){
        super(x, y , id);


    }

    public void tick(){
        x += velX;
        y += velY;

        x = Game.clamp( x, 0, Game.WIDTH - 33);
        y = Game.clamp( y, 0, Game.WIDTH -219);

    }

    public void render(Graphics g){
        if(id == ID.Player) {
            g.setColor(Color.WHITE);
        }

        g.fillRect( x, y,32,32);
    }


}
