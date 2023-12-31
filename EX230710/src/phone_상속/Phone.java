package phone_상속;

public class Phone {
	
	
	public void call() {
		System.out.println("전화걸기!");
	}
	public void callBack() {
		System.out.println("전화받기!");
	}
	
}

// 상속의 특징
// 1. 다중상속을 지원하지 않는다 (엄마 두명 불가/ 하나의 수퍼클래스만 상속)
// 2. 상속 횟수에 제한을 두지 않는다. 연쇄적인 상속은 가능 (모부 -> 조모부-> 증조모부->고조모부)
// 3. 모든 클래스는 java.lang.Object를 상속한다 => 최상위 클래스
// +) 클래스 만들 때 브라우저에서 상속가능 or extends 상속받을 부모 클래스

// 상속확인하기 (부모/수퍼 클래스) -(자식/서브 클래스)

// 오버라이딩(overriding) : 자식클래스에서 부모클래스와 동일한 메소드를 재정의하는 것
// 오버라이딩의 조건
// - 메소드의 이름 동일
// - 메소드 매개변수의 개수와 데이터 타입 동일
// - 메소드의 리턴 타입 동일

