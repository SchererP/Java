package blatt3Aufgabe3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 a = new C2();
		C2 b = new C2();
		// Stelle 1
		
		
		((C2) a).f1();
		((C1) b).f1();
		// System.out.println(a.s);  //the right way to invoke s is C1.s because its static
		b.f1();
		b.f2();
		b.f3();
		//C1 c = new C1();	c.f3(); //there isn't f3 in C1
		//C1 c = new C1(); ((C2) c).f1(); //a super class cannot get casted to a subclass	
	}

}