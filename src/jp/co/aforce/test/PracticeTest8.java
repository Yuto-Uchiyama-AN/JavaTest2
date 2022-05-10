package jp.co.aforce.test;

public class PracticeTest8 {
	public static void main(String args[]) {
		printHello();
		printRandomMessage();
		printMessage(5, "Hello");
		printRectangleArea(10, 10);
		getWeatherForecast();
		isEvenNumber(3);
		getMessage("山田", true);
	}

	// 練習問題1
	public static void printHello() {
		System.out.println("Hello");
	}

	// 練習問題2
	public static void printRandomMessage() {
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
	public static void printMessage(String message) {
		System.out.println(message);
	}

	// 練習問題4
	public static void printMessage(int count, String message) {
		for (int i = 1; i <= count; i++) {
			System.out.println(message);
		}
	}

	// 練習問題5
	public static void printRectangleArea(double height, double width) {
		System.out.println(height * width / 2);
	}

	// 練習問題6
	public static String getWeatherForecast() {
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

	public static boolean isEvenNumber(int value) {

		if (value % 2 == 0) {
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
		}

	}

	// 練習問題8
	public static String getMessage(String name, boolean isKid) {
		if (isKid) {
			System.out.println("こんにちは。" + name + "ちゃん。");
		} else {
			System.out.println("こんにちは。" + name + "さん。");
		}

		return name;

	}

	// 練習問題9
	public static String getLongestString(String[] array) {


		return null;

	}

}
