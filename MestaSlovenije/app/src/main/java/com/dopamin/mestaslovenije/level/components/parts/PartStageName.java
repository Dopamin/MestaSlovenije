package com.dopamin.mestaslovenije.level.components.parts;

import com.dopamin.mestaslovenije.graphics.Render;
import com.dopamin.mestaslovenije.level.components.Stage;
import com.dopamin.mestaslovenije.math.Vector2f;
import com.dopamin.mestaslovenije.math.timing.Action;
import com.dopamin.mestaslovenije.math.timing.TimerLimit;


public class PartStageName extends Part {

    public PartStageName(Stage s) {
        super(s);

        timers.add(new TimerLimit(0.5f, new Action() {
            @Override
            public void execute() {
                stage.nextQuestion();
            }
        }));
    }

    @Override
    public boolean processInput(Vector2f pos) {
        return true;
    }

    @Override
    public void render(Render r) {
        r.drawText("BLA" + stage.name, "#000000", 100, 450, 64);
    }

}
