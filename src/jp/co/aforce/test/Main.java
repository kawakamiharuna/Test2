package jp.co.aforce.test;

public class Main {
	public static void main(String[] args){
		
		PracticeTest8 pra = new	PracticeTest8();
		//練習問題１
		pra.printHello();
		
		//練習問題２
		pra.printRandomMessage();
		
		//練習問題３
		pra.printMessage("あああ");
		
		//練習問題４
		pra.printMessage("hel",4);
		
		//練習問題５
		pra.printRectangleArea(2.9, 93);
		
		//練習問題６
		pra.getWeatherForecast();
		
		//練習問題７
		System.out.println(pra.isEvenNumber(222));
		
		//練習問題８
		System.out.println(pra.getMessage("チョン",true));
		
		//練習問題９
		pra.getLongestString(null);
		
		//練習問題１０
		Person person = new Person("nii",19);
		System.out.println(person.isAdult());
		
	}

}
