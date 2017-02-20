import java.util.*;

abstract class Address {
	String door, street, area, city, state;
	abstract void getFullAddress();
	void setAddress(String door, String street, String area, String city, String state){
		this.door = door;
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
	}
}

class USAddress extends Address {
	String sp = " ",nl = "\n";
	USAddress(){}
	USAddress(String door, String street, String area, String city, String state){
		this.door = door;
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
	}
	void getFullAddress() {
		System.out.println(door + sp + street + sp + nl + area + sp + city + nl + state);
	}
}

class IndianAddress extends Address{
	String sp=" ",nl="\n"; 
	IndianAddress(String door,String street, String area,String city,String state){
		this.door=door;
		this.street=street;
		this.area=area;
		this.city=city;
		this.state=state;
	}
	void getFullAddress(){
		System.out.println(door+sp+street+sp+nl+area+sp+city+nl+state);
	}
}

abstract class PhoneNumber {
	int code;
	long phone;
	PhoneNumber(int code){
		this.code = code;
	}
		abstract void getPno();
		void setPno(long phone){
			this.phone = phone;
		
	}
}

class USPhoneNumber extends PhoneNumber{
	USPhoneNumber(int code){
		super(code);
	}
	void getPno(){
		System.out.print(code+" "+phone);
	}
}

class IndianPhoneNumber extends PhoneNumber{
	IndianPhoneNumber(int code){
		super(code);
	}
	void getPno(){
		System.out.print(code+" "+phone);
	}
}

interface ContactFactory{
	Address getAddress();
	PhoneNumber getPhoneNumber(int code);
}

class USContactFactory implements ContactFactory{
	public Address getAddress(){
		return new USAddress();
	}
	public PhoneNumber getPhoneNumber(int code){
		return new USPhoneNumber(code);
	}
}

public class TestAbstract{
	public static void main(String[] args) {
		//Address US = new USAddress;
		ContactFactory uscf = new USContactFactory();
		Address usa = uscf.getAddress();
		PhoneNumber uspn = uscf.getPhoneNumber(1054);

		usa.setAddress("54", "MG road", "Mathikere", "Seattle", "California");
		usa.getFullAddress();
		uspn.setPno(988665263);
		uspn.getPno();
		System.out.println();
	}
}