package sec03.test02;

public class test03_02 {

	public static void main(String[] args) {

		int n = 0; // 변수 초기화
		int m = 0;

		// 합이 5가 아닐 때만 반복
		while (m + n != 5) {
		    n = (int)(Math.random() * 6) + 1; // 반복문 안에서 다시 던지기
		    m = (int)(Math.random() * 6) + 1;
		    
		    System.out.println("(" + m + "," + n + ")");
		    
		    // while 조건문에서 이미 합을 체크하므로 내부 if문과 break는 없어도 무방합니다.
		}
		
	}

}
