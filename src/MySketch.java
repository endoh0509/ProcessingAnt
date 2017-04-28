import processing.core.PApplet;

public class MySketch extends PApplet {

	@Override
	public void settings() {
		size(300, 300);
	}

	@Override
	public void setup() {
		background(100);
	}

	@Override
	public void draw() {
		ellipse(mouseX, mouseY, 100, 100);
	}

	@Override
	public void mousePressed(){
	}

	public static void main(String[] args) {
		System.out.println("class name: " + MySketch.class.getName());
		PApplet.main(MySketch.class.getName());
	}
}