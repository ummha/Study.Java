package _07_oop._07_AccessModifier.test.m1;
import _07_oop._07_AccessModifier.test.m2.M2a;
import _07_oop._07_AccessModifier.test.m3.M3a;
public class M1a {
	private String className = "M1a";
	
	public void publicMethod() {
		System.out.println(className + " publicMethod()");
	}
	
	protected void protectedMethod() {
		System.out.println(className + " protectedMethod");
	}
	
	void defaultMethod() {
		System.out.println(className + " defaultMethod");		
	}

	private void privateMethod() {
		System.out.println(className + " privateMethod");
	}
	
	public static void main(String[] args) {
		M1a m1a = new M1a();
		M1b m1b = new M1b();
		M2a m2a = new M2a();
		M3a m3a = new M3a();
		
		m1a.publicMethod();
		m1a.protectedMethod();
		m1a.defaultMethod();
		m1a.privateMethod();

		m1b.publicMethod();
		m1b.protectedMethod();
		m1b.defaultMethod();
//		m1b.privateMethod();
		
		m2a.publicMethod();
//		m2a.protectedMethod();
//		m2a.defaultMethod();
//		m2a.privateMethod();

		
	}
}
