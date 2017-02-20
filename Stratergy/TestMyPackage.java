//Stratergy Pattern
public class TestMyPackage{
	public static void main(String[] args) {
		Duck md = new MallardDuck();
		md.display();
		System.out.println("-----------------------------------");
		md.performFly();
				System.out.println("-----------------------------------");
		md.setFlyBehavior(new FlyRockeetsSpeed());
				System.out.println("-----------------------------------");
		md.performFly();
				System.out.println("-----------------------------------");
		md.performQuack();
				System.out.println("-----------------------------------");
		md.setQuackBehavior(new Squeak());
				System.out.println("-----------------------------------");
		md.performQuack();
				System.out.println("-----------------------------------");
		Duck rd = new RubberDuck();
		rd.display();
				System.out.println("-----------------------------------");
		rd.performFly();
				System.out.println("-----------------------------------");
		rd.performQuack();
				System.out.println("-----------------------------------");
	}
}

abstract class Duck{
	Quackbehavior qb;
	Flybehavior fb;

	public void swim(){
		System.out.println(" I am swimming");
	}

	abstract void display();
	void performFly(){
		fb.fly();
	}
	void performQuack(){
		qb.quack();
	}
	public void setFlyBehavior(Flybehavior newFb){
		fb = newFb;
	}
	public void setQuackBehavior(Quackbehavior newQb){
		qb = newQb;
	}
}

class MallardDuck extends Duck{
	MallardDuck(){
		fb = new Fly1();
		qb = new Quack1();
	}
	void display(){
		System.out.println(" I am a Mallard Duck");
	}
}

class RubberDuck extends Duck{
	RubberDuck(){
		fb = new NoFly();
		qb = new Squeak();
	}

	void display(){
		System.out.println("I am a Rubber Duck");
	}
}

interface Flybehavior{
	public void fly();
}

interface Quackbehavior{
	public void quack();
}

class Fly1 implements Flybehavior{
	public void fly(){
		System.out.println("I am Flying");
	}
}

class NoFly implements Flybehavior{
	public void fly(){
		System.out.println("Sorry I am unable to fly");
	}
}

class FlyRockeetsSpeed implements Flybehavior{
	public void fly(){
		System.out.println("Beware I am a Rocket now");
	}
}

class Squeak implements Quackbehavior{
	public void quack(){
		System.out.println("Sqeeeeeeeeeeeeeeek");
	}
}

class Quack1 implements Quackbehavior{
	public void quack(){
		System.out.println("Quack! quack!!  quack!!!");
	}
}

class Mute implements Quackbehavior{
	public void quack(){
		System.out.println("Silence Please!!!!");
	}
}

