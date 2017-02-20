public class DecoratorPattern {
	public static void main(String[] args) {
		Contact c1 = new Music(new MaleContact());
		c1.getinterest();
		Contact c2 = new Dance(new MaleContact());
		c2.getinterest();
		Contact c3 = new Dance(new FemaleContact());
		c3.getinterest();
	}
}

abstract class Contact {
	public abstract void getinterest();
}

abstract class Decorator extends Contact {
	public Contact decorateContact;
	public Decorator(Contact decorateContact) {
		this.decorateContact = decorateContact;
	}
	abstract public void getinterest();
}

class FemaleContact extends Contact {
	public void getinterest() {
		System.out.println("I am a female");
	}
}

class MaleContact extends Contact {
	public void getinterest() {
		System.out.println("I am a male");
	}
}

class Music extends Decorator {
	public Music(Contact decorateContact) {
		super(decorateContact);
	}

	public void getinterest() {
		decorateContact.getinterest();
		setTalent(decorateContact);
	}
	private void setTalent(Contact decorateContact){
		System.out.println("I can sing");
	}
}

class Dance extends Decorator {
	public Dance(Contact decorateContact) {
		super(decorateContact);
	}
	public void getinterest(){
		decorateContact.getinterest();
		setTalent(decorateContact);
	}
	private void setTalent(Contact decorateContact) {
		System.out.println("I can dance");
	}
}