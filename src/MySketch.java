import processing.core.*;

public class MySketch extends PApplet {

	PImage img;

	@Override
	public void settings() {
		size(300, 300);
	}

	@Override
	public void setup() {
		background(255);
		img = loadImage("p5logo.png");
	}

	@Override
	public void draw() {
		image(img, 0, 0, width, height);
	}

	@Override
	public void mousePressed(){
	}

	public static void main(String[] args) {
		PApplet.main(MySketch.class.getName());
	}
}