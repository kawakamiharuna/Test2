package jp.co.aforce.test;


public class Person {
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	//練習問題１０
		public boolean isAdult() {
			if(this.getAge() >= 20) {
				return true;
			} else {
			return false;
			}
		}

}
