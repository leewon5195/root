package day18;

import java.io.Serializable;

public class Person_ implements Serializable{ //시리얼 코드가 필요하다.
	
	private static final long serialVersionUID = 1L;
	private String myName;
	private int myAge;
	
	
	public Person_(String myName, int myAge) {
		
	}
	
	public void setMyName(String myName, int myAge) {
		this.myAge = myAge;
		this.myName = myName;
	}

	
}
