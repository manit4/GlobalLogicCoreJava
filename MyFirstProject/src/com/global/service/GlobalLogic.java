package com.global.service;

import com.global.Human;

public class GlobalLogic {
	
	boolean status = false;
	
	public void interview(Human human) {
		
		//Human vikhyat = new Human();
		
		if(human.getIq() >= 52 ) {
			
			status = true;
		}
	}

	public boolean isStatus() {
		return status;
	}
	
	

}
