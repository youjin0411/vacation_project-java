package first;

public class MyclassExam {

	public static void main(String[] args) {
		Myclass myclass = new Myclass();
		myclass.method1();
		myclass.method2(10);
		int value = myclass.method3();
		System.out.println("m3�� ������ �� : "+value);
		myclass.method4(5, 10);
		int value2 = myclass.method5(55);
		System.out.println("m5�� ������ �� : "+value2);
	}

}
