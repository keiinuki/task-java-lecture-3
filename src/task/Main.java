package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		Map<String, String> genMap = new HashMap<>();
		genMap.put("団塊", "1947年から1949年生まれです。");
		genMap.put("バブル", "1965年から1969年生まれです。");
		genMap.put("氷河期", "1971年から1984年生まれです。");

		System.out.println(genMap.get("団塊"));
		System.out.println(genMap.get("バブル"));
		System.out.println(genMap.get("氷河期"));

		for (Map.Entry<String, String> entry : genMap.entrySet()) {
			System.out.println(entry.getKey() + "世代は、" + entry.getValue());
		}

		List<String> genKeyList = new ArrayList<>(genMap.keySet());

		System.out.println(genKeyList);

		genKeyList.forEach(System.out::println);

		List<String> genValList = new ArrayList<>(genMap.values());

		System.out.println(genValList);

		genValList.forEach(System.out::println);

		System.out.println(genKeyList.get(0) + "世代は、" + genValList.get(0));

		String str = genKeyList.get(0);

		try {
			if (str.length() < 3) {
				throw new IllegalArgumentException();
			}
			System.out.println(str + "は、3文字以上です。");
		} catch (IllegalArgumentException e) {
			System.out.println(str + "は、3文字未満です。");
		}

		genValList.stream().sorted(Comparator.naturalOrder()).forEach(i -> System.out.println(i));

		genValList.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i));

		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
		integerList.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));

		integerList.stream().map(i -> i * 2).forEach(i -> System.out.println(i));

		integerList.stream().sorted((a, b) -> Integer.compare(a, b)).forEach(i -> System.out.println(i));
		integerList.stream().sorted((b, a) -> Integer.compare(a, b)).forEach(i -> System.out.println(i));
		integerList.stream().sorted(Comparator.naturalOrder()).forEach(i -> System.out.println(i));
		integerList.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i));

		Map<Integer, String> monthMap = new HashMap<>();
		monthMap.put(1, "睦月");
		monthMap.put(5, "皐月");
		monthMap.put(2, "如月");
		monthMap.put(6, "水無月");
		monthMap.put(4, "卯月");
		monthMap.put(9, "長月");
		monthMap.put(12, "師走");
		monthMap.put(7, "文月");
		monthMap.put(8, "葉月");
		monthMap.put(3, "弥生");
		monthMap.put(10, "神無月");
		monthMap.put(11, "霜月");

		monthMap.entrySet().stream().map(e -> e.getKey() + "月の和風月名は、" + e.getValue() + "です。")
				.forEach(System.out::println);

		monthMap.entrySet().stream().sorted(Entry.comparingByKey())
				.forEach(e -> System.out.println(e.getKey() + "月の和風月名は、" + e.getValue() + "です。"));

		monthMap.entrySet().stream().sorted(Entry.<Integer, String> comparingByKey().reversed())
				.forEach(e -> System.out.println(e.getKey() + "月の和風月名は、" + e.getValue() + "です。"));

		monthMap.entrySet().stream().filter(e -> e.getKey() % 2 == 0)
				.forEach(e -> System.out.println("偶数月は、" + e.getValue() + "です。"));

		monthMap.entrySet().stream().filter(e -> e.getKey() % 2 != 0)
				.forEach(e -> System.out.println("奇数月は、" + e.getValue() + "です。"));

		monthMap.entrySet().stream().filter(e -> e.getValue().length() == 3)
				.forEach(e -> System.out.println("三文字なのは、" + e.getValue() + "です。"));

	}
}
