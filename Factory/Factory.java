import java.util.*;


class Appointment {
	String appDate, appTime, appVenue, appName;

	public void setAppt(String d, String t, String v, String n) {
		appDate = d;
		appTime = t;
		appVenue = v;
		appName = n;
	}
	
	public void displayApptDetails() {
		System.out.println("Date:" + appDate);
		System.out.println("Time:" + appTime);
		System.out.println("Venue:" + appVenue);
		System.out.println("Person to meet:" + appName+"\n");
		}
}

class docEyeAppt extends Appointment {
	public void displayApptDetails() {
		System.out.println("Your Opthamologist Appointment details are:\n");
		super.displayApptDetails();
	}
}

class docEntAppt extends Appointment {
	public void displayApptDetails() {
		System.out.println("Your ENT Appointment details are:\n");
		super.displayApptDetails();
	}
}

class docVetAppt extends Appointment {
	public void displayApptDetails() {
		System.out.println("Your VET Appointment details are:\n");
		super.displayApptDetails();
	}
}

abstract class AppointmentCreator {
	public abstract Appointment createAppt(String x);
}

class DocApptCreator extends AppointmentCreator {
	public Appointment createAppt(String type) {
		if(type.equals("EYE")) {
			return new docEyeAppt();
		}
		else if(type.equals("ENT")) {
			return new docEntAppt();
		}
		else if(type.equals("VET")) {
			return new docVetAppt();
		}
		else {
			return null;
		}
	}
}

public class Factory {
	public static void main(String[] args) {
		Appointment myAppt;
		AppointmentCreator myApptCreator = new DocApptCreator();
		myAppt = myApptCreator.createAppt("EYE");
		Scanner in = new Scanner(System.in);
		String date, time, venue, person_name;

		System.out.println("Enter your appointment details:\n");
		System.out.println("Enter the date:\n");
		date = in.nextLine();
		System.out.println("Enter the time:\n");
		time = in.nextLine();
		System.out.println("Enter the venue:\n");	
		venue = in.nextLine();
		System.out.println("Enter the name of the person you are meeting:\n");
		person_name = in.nextLine();
		
		myAppt.setAppt(date,time,venue,person_name);
		myAppt.displayApptDetails();
		
		System.out.println("Enter the changed timing of Appointment:\n");
		time = in.nextLine();
		myAppt.setAppt(date,time,venue,person_name);

		System.out.println("Enter the another person's name you are meeting:\n");
		person_name = in.nextLine();
		myAppt.setAppt(date,time,venue,person_name);
		
		System.out.println("Your Appointment details are:\n");
		myAppt.displayApptDetails();
	}
}
