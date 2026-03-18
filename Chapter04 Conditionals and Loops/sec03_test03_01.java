package sec03.test02;

public class test03_01 {

	public static void main(String[] args) {

		while (true) {
			int num1 = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			
			System.out.println("("+ num1 + ", " + num2 + ")");
			
			if((num1 + num2) == 5) {
				break;
			}
		}
		
	}

}
