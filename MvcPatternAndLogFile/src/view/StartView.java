/* client 요청 최초 화면
 * - 브라우저 가정
 * - Controller에서 메소드 호출로 처리
 */

package view;

import controller.Controller;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StartView {

	public static void main(String[] args) {
		System.out.println("*** 모든 고객 출력");
		Controller.reqProcess(1);
		
		System.out.println("*** 회원 가입");
		Controller.reqProcess(2);
		
		System.out.println("*** 모든 고객 출력");
		Controller.reqProcess(1);
		
		System.out.println("*** 잘못된 기능");
		Controller.reqProcess(3);
		

	}

}
