package view;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EndInsertSuccessView {
	//DML(insert, update, delete)가 정상 실행 시 출력되는 메소드
	public static void successMessage(boolean result) {
		System.out.println(result);
	}

}
