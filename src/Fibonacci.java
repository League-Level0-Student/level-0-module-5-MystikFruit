
public class Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 1;
		System.out.println(a);
		System.out.println(a + b);
		System.out.println(a + b);
		for (int i = 0; i < 30; i++) {
			System.out.println(b + c);
			a = b;
			b = c;
			c = a + b;
		}
	}
}
