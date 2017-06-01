
public class Potato {
public static void main(String[] args) {
	for (int i = 1; i <= 8  ; i++) {
		if (i % 8 == 0) {
			System.out.println("more");
		}
		else if (i % 4 == 0) {
			System.out.println("4");
		}
		else {
			System.out.println(i + " potato");
		}
	}
	
}
}
