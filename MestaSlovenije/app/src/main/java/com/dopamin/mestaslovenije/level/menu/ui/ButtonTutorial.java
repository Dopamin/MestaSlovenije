package com.dopamin.mestaslovenije.level.menu.ui;


import com.dopamin.mestaslovenije.math.Vector2f;

public class ButtonTutorial extends Button {

	@Override
	protected void pressed() {

	}

	@Override
	protected void initLocation() {
		pos = new Vector2f(50, 900 - 300);
		size = new Vector2f(500, 100);
	}

}
