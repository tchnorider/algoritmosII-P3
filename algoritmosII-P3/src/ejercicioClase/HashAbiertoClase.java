package ejercicioClase;

public class HashAbiertoClase {

	public static void main(String[] args) {

		int r = h(1);
		System.out.println(r);
		r = h(8);
		System.out.println(r);
		r = h(27);
		System.out.println(r);
		r = h(64);
		System.out.println(r);
		r = h(125);
		System.out.println(r);
		r = h(216);
		System.out.println(r);
		r = h(343);
		System.out.println(r);
	}

	public static int h(int i) {
		return i % 7;
	}
}
