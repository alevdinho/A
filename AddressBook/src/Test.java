
public class Test {
	public static void main(String[] args) {
		Person[] person = new Person[4];
		
		person[0] = new Person ("Simeon", "Wilcox");
		person[1] = new Person ("Maria", "Smart");
		
		for (int i = 0; i <=1; i++) {
			System.out.println(person[i]);
		}
		
		person[2] = new Person ("Ada", "Smart");
		person[3] = new Person ("Moseray", "Smart");
		
		EmailAddress[] ea = new EmailAddress[10];
		//ea[0] = new EmailAddress ("getsimeon@yahoo.com  getsimeon@hotmail.com");
		//person[0] = new EmailAddress (addEmailAddress(ea)); 
		
		//person[0].addEmailAddress(ea);
		
		for (int i = 0; i <=3; i++) {
			System.out.println(person[i]);
			System.out.println(ea[i]);
	}
	}


}
