package jp.co.aforce.test;

public class Main {
	public static void main(String args[]) {
		PracticeTest8 practiceTest8 = new PracticeTest8();
		practiceTest8.printHello();
		practiceTest8.printRandomMessage();
		practiceTest8.printMessage(5, "Hello");
		practiceTest8.printRectangleArea(10, 10);
		practiceTest8.getWeatherForecast();
		practiceTest8.isEvenNumber(3);
		practiceTest8.getMessage("山田", true);
		String[] name = {"aaa","bbbb","cccc"};
		System.out.println(practiceTest8.getLongestString(name));
		Person person = new Person("山田", 20);
		System.out.println(practiceTest8.isAdult(person));
	}

}
