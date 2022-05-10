package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest2 {
	public static void main(String args[]) {

		// 練習問題1
		int x = 10;
		int y = 28;
		double z = 3.14;

		System.out.println(x * y);

		// 練習問題2
		System.out.println((y / x) + "..." + (y % x));

		// 練習問題3

		double syosu = (y * z);
		System.out.println(syosu);

		// 練習問題4
		System.out.println(++ syosu);
		
		// 練習問題5
		int age = 22;
		Random random = new Random();
		int randomNumber = random.nextInt(100);
		
		if(age > randomNumber) {
			System.out.println("私の方が年上です");
		
		}else if(age < randomNumber) {
			System.out.println("私の方が年下です");
		
		}else {
			System.out.println("同い年です");
		}

	}

}
