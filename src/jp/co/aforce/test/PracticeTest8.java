package jp.co.aforce.test;

import java.util.Arrays;
import java.util.List;

public class PracticeTest8 {
	//練習問題1
	String hello = "Hello";

	public void printHello() {
		System.out.println(this.hello);
	}

	//練習問題２
	String[] aisatu = { "こんばんは", "こんにちは", "おはよう" };
	int n = (int) (3 * Math.random());

	public void printRandomMessage() {

		System.out.println(aisatu[n]);
	}

	//練習問題３
	void printMessage(String message) {
		System.out.println(message);
	}

	//練習問題４
	void printMessage(String message, int count) {
		for (int y = 1; y <= count; y++) {
			System.out.println(message);
		}
	}

	//練習問題５
	void printRectangleArea(double height, double width) {
		System.out.println(height * width);
	}

	//練習問題６
	String[] day = { "今日", "明日", "明後日" };
	String[] weather = { "晴れ", "曇り", "雨", "雪" };
	int m = (int) (3 * Math.random());
	int l = (int) (3 * Math.random());

	void getWeatherForecast() {
		System.out.println(day[m] + "の天気は" + weather[l] + "でしょう");
	}

	//練習問題７
	boolean isEvenNumber(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	//練習問題８
	String getMessage(String name, boolean isKid) {
		if (isKid == true) {
			return "こんにちは、" + name + "ちゃん";
		} else if (isKid == false) {
			return "こんにちは、" + name + "さん";
		}
		return name;
	}

	//練習問題９
	List<String> list = Arrays.asList("こんにちは","パン","じじじっじじ");
	list.stream().map(s -> s.length()).forEach(System.out::println);
	
		
	}

}