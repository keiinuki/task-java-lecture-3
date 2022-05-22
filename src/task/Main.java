package task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
			System.out.println(str +"は、3文字以上です。");
		} catch (IllegalArgumentException e) {
			System.out.println(str + "は、3文字未満です。");
		}

	}

}
