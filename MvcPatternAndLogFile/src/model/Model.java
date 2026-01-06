/* biz(비즈니스) 요청 처리 핵심 클래스
 * Controller -> Model(database 사용) -> Controller
 * 
 * Model 관점에서 DataBase라는 객체가 필요할까?
 * 	안 필요함
 * 	Database라는 객체 생성 없이 필요한 메소드 기능만 호출
 * 
 *데이터 검색 시 에 출력은 Model에서 하나?
 *	Controller 출력 위임
 */

package model;

import model.domain.Customer;

public class Model {
	
	// 1. 입력되면 실행되는 biz 메소드
	// 모든 고객 정보 검색
	// 추후에 예외처리 학습 후 null 반환 또는 배열 반환에 따른 값 분기
	// 실제 select 요청하는 코드로 변환됨
	public static Customer[] getAllCustomer() {
		return Database.getCustomers();
	}
	
	// 2. 입력되면 실행되는 biz 메소드
	// 고객 가입
	//실제 insert하는 코드로 변환됨
	public static boolean insertCust(Customer cust) {
		return Database.insertCustomer(cust);
	}
}
