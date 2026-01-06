// RDBMS의 Database와 흡사한 기능의 클래스라 가정
// static{} : byte code가 메모리에 저장 시에 단 한 번 자동 실행
package model;

import model.domain.Customer;

public class Database {
	// 데이터 보관, 반환
	private static Customer [] allCusts = new Customer[4]; 
	// 초기화 할 때 배열의 크기를 정해서 초기화하지 않고 null로 초기화 해버리면 아래에서 allCusts의 객체를 만들 때
	// 귀찮게 나중에 이걸 또 써줘야 함 allCusts = new Customer[3];
	// 그래서 처음에 초기하 할 때 배열의 크기를 정해서 초기화 함
	
	private Database() {} // 외부에서 불러오지 못하게 생성자를 private으로 막아둠
	
	// 보관 (24시간 365일 실행 시 단 한 번만 초기화 보장하고 싶음) -> static{}으로 코드를 실행할 때 한 번만 실행되도록 설정
	static {
		allCusts[0] = new Customer("user01", 11, "개발자");
		allCusts[1] = new Customer("user02", 22, "기획자");
		allCusts[2] = new Customer("user03", 33, "운영자");
	}
	
	// 반환 : select * from Customer
	public static Customer[] getCustomers() {
		return allCusts;
	}
	
	
	// 가입 : insert into customer values("user04", "44", "연구원")
	
	public static boolean insertCustomer(Customer newCust) { 
		allCusts[3] = newCust;
		return true;
	}

}
