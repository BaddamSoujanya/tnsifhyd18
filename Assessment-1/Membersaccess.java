package Project1;

public class Membersaccess {
	int a=20;
	static int b=10;
	void display() {
		System.out.println(a);
	}
	static void display1() {
		System.out.println(b);
	}

	public static void main(String[] args) {
		Membersaccess s1=new Membersaccess();
		System.out.println(s1.a);
		s1.display();
		
		  
		  

	}	

	}

