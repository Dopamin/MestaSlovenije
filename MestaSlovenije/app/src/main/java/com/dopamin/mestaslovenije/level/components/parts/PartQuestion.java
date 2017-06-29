package com.dopamin.mestaslovenije.level.components.parts;

import android.graphics.Color;
import android.util.Log;

import com.dopamin.mestaslovenije.graphics.Render;
import com.dopamin.mestaslovenije.level.components.Question;
import com.dopamin.mestaslovenije.level.components.Stage;
import com.dopamin.mestaslovenije.math.Coordinate;
import com.dopamin.mestaslovenije.math.Vector2f;

public class PartQuestion extends Part {

    private Question question;
    public final int questionNumber;

    private Coordinate answer;

    public PartQuestion(Stage stage, Question question, int questionNumber) {
        super(stage);
        this.question = question;
        this.questionNumber = questionNumber;
    }

    @Override
    /* The argument is still in pixels */
    public boolean processInput(Vector2f pos) {
        answer = new Coordinate(pos.x, pos.y, true);
        question.answer(answer);
        stage.displayAnswer(this);
        return true;
    }

    @Override
    public void render(Render r) {
        r.drawText("" + question.location.name, "#000000", 500, 450, 128);
    }

    public Question getQuestion() {
        return question;
    }

    public Coordinate getAnswer() {
        return answer;
    }
}