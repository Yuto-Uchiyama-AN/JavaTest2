package jp.co.aforce.test;

public class MinMax {

	// 練習問題2
	public int
	getMaxValue(int a, int b, int c) {
		if (a < b) {
			return b;
		}
		if (b < c) {
			return c;
		} else {
			return a;
		}
	}

	public int getMinValue(int a, int b, int c) {
		if (a > b) {
			return b;
		} else if (b > c) {
			return c;
		} else {
			return a;
		}
	}

}
