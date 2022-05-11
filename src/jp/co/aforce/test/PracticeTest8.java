package jp.co.aforce.test;

public class PracticeTest8 {


	// 練習問題1
	public  void printHello() {
		System.out.println("Hello");
	}

	// 練習問題2
	public  void printRandomMessage() {
		int n = (int) (3 * Math.random());

		if (n == 0) {
			System.out.println("おはよう");
		} else if (n == 1) {
			System.out.println("こんにちは");
		} else {
			System.out.println("こんばんは");
		}
	}

	// 練習問題3
	public  void printMessage(String message) {
		System.out.println(message);
	}

	// 練習問題4
	public  void printMessage(int count, String message) {
		for (int i = 1; i <= count; i++) {
			System.out.println(message);
		}
	}

	// 練習問題5
	public  void printRectangleArea(double height, double width) {
		System.out.println(height * width);
	}

	// 練習問題6
	public  String getWeatherForecast() {
		int k = (int) (3 * Math.random());
		String str = "";
		if (k == 0) {
			str = "今日";
		} else if (k == 1) {
			str = "明日";
		} else {
			str = "明後日";
		}

		int u = (int) (4 * Math.random());
		String str1 = "";
		if (u == 0) {
			str1 = "晴";
		} else if (u == 1) {
			str1 = "曇り";
		} else if (u == 2) {
			str1 = "雨";
		} else {
			str1 = "雪";
		}
		System.out.println(str + "の天気は" + str1 + "でしょう");

		return null;

	}

	// 練習問題7

	public  boolean isEvenNumber(int value) {

		if (value % 2 == 0) {
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
		}

	}

	// 練習問題8
	public  String getMessage(String name, boolean isKid) {
		if (isKid) {
			System.out.println("こんにちは。" + name + "ちゃん。");
		} else {
			System.out.println("こんにちは。" + name + "さん。");
		}

		return name;

	}

	// 練習問題9
	public  String getLongestString(String[] array) {
		String str = "";
		for(int i = 0; i < array.length; i++ ) {
			if(str.length() <= array[i].length());
			  str = array[i];
		}

		return str;

	}

	// 練習問題10
	public  boolean isAdult(Person person) {

		if(person.getAge() >= 20) {
			return true;
		}else {
			return false;
		}



	}

}
