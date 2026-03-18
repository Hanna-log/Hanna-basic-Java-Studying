package sec03.test02;

public class test03_03_DoWhile {

	public static void main(String[] args) {

		int n, m; // 변수 선언만 해둠

		do {
		    n = (int)(Math.random() * 6) + 1; // 1. 일단 던진다
		    m = (int)(Math.random() * 6) + 1;
		    
		    System.out.println("(" + m + "," + n + ")"); // 2. 일단 출력한다
		    
		} while (m + n != 5); // 3. 그 다음에 합이 5인지 검사해서 다시 던질지 결정한다
		
	}

}
