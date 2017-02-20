import java.util.*;

interface Customize{
	public void change();
}

class FontSize implements Customize {
	public void change() {
		int s;
		System.out.println("Enter the new font size :");
		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();
		System.out.println("Font size changed to "+s);
	}
}

class FontType implements Customize {
	public void change(){
		String t;
		System.out.println("Enter the new font type :");
		Scanner sc = new Scanner(System.in);
		t = sc.next();
		System.out.println("Font type change to "+t);
	}
}

class Color implements Customize {
	public void change(){
		String color;
		System.out.println("Enter the new colour :");
		Scanner sc = new Scanner(System.in);
		color = sc.nextLine();
		System.out.println("Color changed back to "+color);
	}
}

class CustomizeApp{
	private Customize size;
	private Customize type;
	private Customize col;

	public CustomizeApp(){
		size = new FontSize();
		type = new FontType();
		col = new Color();
	}

	public void changeSize(){
		size.change();
	}

	public void changeType(){
		type.change();
	}

	public void changeColor(){
		col.change();
	}
}

public class FacadePattern {
	public static void main(String[] args) {
		CustomizeApp custapp = new CustomizeApp();
		custapp.changeSize();
		custapp.changeType();
		custapp.changeColor();
	}
}