package org.ict.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Broadcast {

	// 생성하는데 Stage를 필요로 하도록 설정해주세요.
	@Autowired
	public Stage stage;
	
	public Broadcast(Stage stage) {
		this.stage = stage;
	}
	// broad() 메서드는 방송 송출용 이라는 문장 두에
	// Stage의 perform() 메서드를 이용해 나머지 문장을 실행합니다.

	public void broad() {
		System.out.print("방송");
		stage.perform();
	}

}//class
