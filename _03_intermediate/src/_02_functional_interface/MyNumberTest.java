package _02_functional_interface;

public class MyNumberTest {
	public static void main(String[] args) {
		MyNumber myNumber = (x, y) -> x > y? x : y;
		
		System.out.println(myNumber.getMax(10, 20));
		
	}
}
