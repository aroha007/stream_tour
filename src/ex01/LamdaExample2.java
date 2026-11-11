package ex01;

import java.util.function.Predicate;

public class LamdaExample2 {

	public static void main(String[] args) {
		// 정수를 입력해서 참 또는 거짓을 리턴 하는
		// 함수를 하나 만들겠습니다
		Predicate<Integer> isStrong = x -> x > 10;
		
			// Predict<Type> 객체명 = 사용할 메소드 등록
			// 객체명.test(비교할값) => true or false

			System.out.println(isStrong.test(10));
			System.out.println(isStrong.test(5));
		}
	}

