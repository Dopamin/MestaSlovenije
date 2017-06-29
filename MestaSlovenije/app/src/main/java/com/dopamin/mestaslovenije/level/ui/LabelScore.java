package com.dopamin.mestaslovenije.level.ui;


import com.dopamin.mestaslovenije.graphics.Render;
import com.dopamin.mestaslovenije.math.Vector2f;

public class LabelScore extends Label {

    @Override
    protected void initLocation() {
        pos = new Vector2f(1000, 900 - 150);
        size = new Vector2f(500, 100);
    }

    @Override
    public void render(Render r) {
        super.render(r);

        float score = game.getLevel().getScore();
        r.drawText(score + "", "#000000", pos.x, pos.y + size.y, 64);
    }

}
