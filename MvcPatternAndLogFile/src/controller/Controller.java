/* client -> 화면(StartView.java) -> Controller가 요청 구분 -> Model
 *  -> Controller -> EndView.java 정상 실행 값 출력
 *  				  -> EndInsertSuccessView.java
 * 
 */

package controller;

import lombok.extern.slf4j.Slf4j;
import model.Model;
import model.domain.Customer;
import view.EndFailView;
import view.EndInsertSuccessView;
import view.EndAllView;

@Slf4j
public class Controller {
	
	// 1 -> 검색 / 2 -> 가입
	public static void reqProcess(int reqNo) {
		if(reqNo == 1) { // 모든 검색
//			Customer[] all = Model.getAllCustomer();
//			EndAllView.printAll(all);
			
			EndAllView.printAll(Model.getAllCustomer());
			log.debug("모든 고객 검색");
			
		}else if(reqNo == 2) { // 가입, 가입 정보도 함께 서버로 전송되었다고 가정
			
			EndInsertSuccessView.successMessage(Model.insertCust(new Customer("user05", 55, "연구원")));
			log.debug("새로운 고객 추가");
			
		}else { // 미존재하는 로직 요청 시 처리 블락
			EndFailView.print("요청이 무효합니다. 재확인 부탁드려요");
			// 그냥 system.out.println하면 안 되나? -> 이러면 controller의 역할을 잃어버림
			// s.o.p하면 view의 역할까지 수행해버림
			log.warn("잘못된 기능 요청");
		}
	}

}
