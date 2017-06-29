package com.dopamin.mestaslovenije.graphics;

public class Rhomboid extends Polygon {

	public Rhomboid(float width, float height) {
		super(1);
		VERTICES_COUNT = 4;
		float r = (float) Math.toRadians(57);
		float d = height / (float) Math.tan(r);
		float verts[] = { -d / 2, 0, width - d / 2, 0, width + d / 2, height, d / 2, height };
		VERTICES = verts;
	}

}
