import java.util.*;

abstract class Subject{
	abstract void attach(Observer o);
	abstract void detach(Observer o);
	abstract void _notify();
}

class Appointment extends Subject{
	String msg = null;
	ArrayList<Observer> members = new ArrayList<Observer>();

	void attach(Observer o){
		members.add(o);
	}

	void detach(Observer o){
		members.remove(o);
	}

	void _notify(){
		for(Observer o : members){
			o.update(msg);
		}
	}

	void scheduleChanged(){
		_notify();
	}

	void newSchedule(String msg){
		this.msg = msg;
		scheduleChanged();
	}
}


interface Observer{
	 void update(String msg);
}

interface Display{
	void display();
}


class Member implements Observer,Display{
	Subject app;
	String nschedule,name;
	Member(Subject sub, String name){
		app = sub;
		app.attach(this);
		this.name=name;
	}

	
	public void update(String nSchedule){
		nschedule = nSchedule;
		display();
	}

	public void display(){
		System.out.println("Alert  : "+name+nschedule);
	}

}

class InformationSystem{
	public static void main(String[] args) {
		Appointment app = new Appointment();
		Observer member1 = new Member(app,"m1");
		app.newSchedule("Test preponed to Friday from Saturday");

		Observer member2 = new Member(app,"m2");
		app.newSchedule("Hello World");

		Observer member3 = new Member(app,"m3");
		app.newSchedule("Hello World!!!!!!");
	}
}