package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString // 이걸 없애면 주소값이 나옴, 값을 확인하기 위해서 꼭 필요함
public class Customer {
	private String id;
	private int pw;
	private String job;
	

}
