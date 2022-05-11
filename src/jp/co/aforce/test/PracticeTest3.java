package jp.co.aforce.test;

import java.util.ArrayList;
import java.util.HashMap;

public class PracticeTest3 {
	public static void main(String args[]) {
		// 練習問題1
		String[] name = { "1", "田中太郎", "男性", "27" };

		// 練習問題2
		System.out.println(name[1]);

		// 練習問題4
		ArrayList<Employee> employees = new ArrayList<>();
		Employee tanaka = new Employee(1, "田中太郎", "男性", 27);
		Employee sato = new Employee(2, "佐藤花子", "女性", 22);
		Employee suzuki = new Employee(3, "鈴木次郎", "男性", 31);

		employees.add(tanaka);
		employees.add(sato);
		employees.add(suzuki);

		for (Employee employee : employees) {
			System.out.println(
					"番号は" + employee.getNumber() + "名前は" + employee.getName(null) + "年齢は" + employee.getAge(0) + "歳です");
		}

		// 練習問題5
		HashMap<String, Integer> scores = new HashMap<>();

		scores.put("国語", 90);
		scores.put("数学", 80);
		scores.put("英語", 90);

		for (HashMap.Entry<String, Integer> score : scores.entrySet()) {
			System.out.println(score.getKey() + ":" + score.getValue());
		}

		// 練習問題6
		// 今回は順番で持つ必要がないのと
		// 科目名と得点を紐づけてコレクションに格納するのがよいと考えられるため。

	}

}
