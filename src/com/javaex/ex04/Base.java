package com.javaex.ex04;

public class Base {
	
    
    private String day;
    private String night;
    private String afternoon;
    

	public void service(String state) {
        
        //코드작성할것
    	if (state == "낮") {
    		this.day = state;
    	} else if (state == "밤") {
    		this.night = state;
    	} else {
    		this.afternoon = state;
    	}
    		
    }

    public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }

    public void night() {
        
    	//코드작성할것
    	System.out.println("밤에는 숙면");
    }
    
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
}

