//Adapter Pattern
public class TestAdapter{
	public static void main(String[] args) {
		Shape rect = new Rectangle();
		Shape cir = new Circle();
		rect.fill();
		rect.draw();
		rect.display();
		cir.display();
	}
}
abstract class Shape	{
	abstract void fill();
	abstract void draw();
	abstract void display();
}
class Rectangle extends Shape {
	XXRectangle myRectangle = new XXRectangle();
	void fill(){
		myRectangle.fillIt(); 
	}
	void draw(){
		myRectangle.drawIt();
	}
	void display(){
		myRectangle.displayIt();
	}

}
class Circle extends Shape{
	void fill(){
		System.out.println("I am getting a color");
	}
	void draw(){
		System.out.println("This is how im creted");
	}
	void display(){
		System.out.println("This is how i look");
	}
}

class XXRectangle{
	public void fillIt(){
		System.out.println("I am getting a color");
	}
	public void drawIt(){
		System.out.println("This is how im creted");

	}
	public void displayIt(){
		System.out.println("This is how i look");
	}
}

class DP1{
	public static void draw_a_line(double x1, double y1, double x2, double y2){
		System.out.println("Line from ("+x1+","+y1+") to ("+x2+","+y2+")");
	}
}

class DP2{
	public static void drawline(double x1, double y1, double x2, double y2){
		System.out.println("Line from ("+x1+","+y1+") to ("+x2+","+y2+")");
	}
}

