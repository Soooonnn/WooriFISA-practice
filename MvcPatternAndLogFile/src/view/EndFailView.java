// 문제 발생 시에만 브라우저에 출력하는 기능의 전담 클래스
package view;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EndFailView {

	public static void print(String message) {
		System.out.println("발생된 문제: " + message);
		
	}

}
