package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member mem1 = new Member("jws", "정우성", 50000) ;
		Member mem2 = new Member("yjs", "유재석", 30000);
		Member mem3 = new Member("lhr", "이효리", 40000);

		mem1.showInfo();
		mem2.showInfo();
		mem3.showInfo();
		
		
		
	}

}
