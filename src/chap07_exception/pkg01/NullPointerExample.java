package chap07_exception.pkg01;
/**
 * 실행예외 (Runtime Exception) 테스트 클래스
 *  - NullPointException : 변수가 참조하고 있는 메모리 번지가 없는 상태에서 사용
 */

public class NullPointerExample {
	public static void main(String[] args) {
		String data = null; // String type 클래스 변수 data 선언

		// 메모리 공간이 없는 상태에서 내용을 조회함(예외)
		// System.out.println(data.toString()); // (x)

		Student stu = null; // 클래스 변수 선언만 해,놓음(메모리 공간 없음)
		 //stu = new Student(); //빈객체 생성(필드들은 기본값으로 세팅됨)
		System.out.println(stu.a); // 예외(NullPointerExample)
	}

}

class Student {
	public int a = 10;
	//기본생성자
	public Student() {
	}
}