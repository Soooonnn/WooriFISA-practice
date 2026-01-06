/* 브라우저에 모든 고객 정보를 table 형식으로 보기 좋게 출력하는 정상 실행 소스라 가정
 * 
 */

package view;

import lombok.extern.slf4j.Slf4j;
import model.domain.Customer;

@Slf4j
public class EndAllView {
	// 배열 데이터값 반복 통해서 출력 = for each 반복문 사용
	public static void printAll(Customer[] allCustomer) {
		for(Customer cust : allCustomer) {
			System.out.println(cust);
		}
		
		
	}

}
