package week3.day1;

public class Myphone {

	public static void main(String[] args) {

		Samsung find = new Samsung();
		float version = find.getandroidversion();
		System.out.println(version);
		int battery = find.getbatterycharge();
		System.out.println(battery);
		Oneplus find1=new Oneplus();
		find1.oneplusconnectpresent();
		find1.supportcareapp();
		
	}

}
