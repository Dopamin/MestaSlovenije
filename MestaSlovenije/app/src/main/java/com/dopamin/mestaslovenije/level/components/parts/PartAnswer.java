package com.dopamin.mestaslovenije.level.components.parts;

import android.graphics.Color;

import com.dopamin.mestaslovenije.graphics.Render;
import com.dopamin.mestaslovenije.level.components.Stage;
import com.dopamin.mestaslovenije.math.Coordinate;
import com.dopamin.mestaslovenije.math.Vector2f;

public class PartAnswer extends Part {

	private PartQuestion partQuestion;

	public PartAnswer(Stage stage, PartQuestion partQuestion) {
		super(stage);
		this.partQuestion = partQuestion;
	}

	@Override
	public boolean processInput(Vector2f pos) {
		stage.nextQuestion();
		return true;
	}

	@Override
	public void render(Render r) {
		partQuestion.render(r);

		Coordinate answer = partQuestion.getAnswer();
		Coordinate correct = partQuestion.getQuestion().location.coordinate;
		r.drawCirlce("#00FF00", correct.IMAGE_X, correct.IMAGE_Y, 10);
		r.drawCirlce("#FF0000", answer.IMAGE_X, answer.IMAGE_Y, 10);
	}

}
