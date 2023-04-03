package kadai_004;

import java.util.HashMap;//自習よう
import java.util.Map;//自習用

public class Score_Chapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Aさんの点数は" + 10 + "点");
		System.out.println("Bさんの点数は" + 20 + "点");
		System.out.println("Cさんの点数は" + 30 + "点");
		System.out.println("Dさんの点数は" + 40 + "点");
		System.out.println("Eさんの点数は" + 50 + "点");
		System.out.println("Fさんの点数は" + 60 + "点");
		System.out.println("Gさんの点数は" + 70 + "点");
		System.out.println("Hさんの点数は" + 80 + "点");
		System.out.println("Iさんの点数は" + 90 + "点");
		System.out.println("Jさんの点数は" + 100 + "点");
		System.out.println("テストの平均点は" +((10 + 20 + 30 + 40 + 50 + 60 + 70 + 80 + 90 + 100)/10) + "点");
		 
		//以下自習用
		Map<String,Integer> map = new HashMap<>();
		map.put("A",10);
		map.put("B", 20);
		map.put("C", 30);
		map.put("D",40);
		map.put("E", 50);
		map.put("F", 60);
		map.put("G", 70);
		map.put("H", 80);
		map.put("I", 90);
		map.put("J", 100);
		
		int sum = 0;
		int count = 0;
		for (String key : map.keySet()) {
			System.out.println(key + "さんの点数は" + map.get(key) + "点");
			sum += map.get(key);
			count ++;
		}
		int average = sum / count;
		System.out.println("テストの平均点は" + average + "点");
	}

}
