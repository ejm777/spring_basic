package org.ict.di;

public class JavaMain {

	public static void main(String[] args) {

		//문제.
		
		//Singer객체와 Stage객체를 생성한 다음
		Singer singer = new Singer();
		
		Stage stage = new Stage(singer);
		
		Broadcast broadcast = new Broadcast(stage);
		
		//Stage에서 Singer가 노래를 부르는 상황을 먼저 코드로
		stage.perform();
		//그 다음 Singer가 단독으로 노래를 부르는 상황을 구현하세요.
		singer.sing();
		
		
		//방송무대도 구현해주세요.
		broadcast.broad();		
	}//main

}//class
