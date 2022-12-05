package ArraysbinarySearch;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] scores = { 99, 68, 36, 29, 88 };

//		Arrays.sort(scores);		//오름차순으로 정렬을 하지않으면 index가 양수가 뜬다.
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}

		int index = Arrays.binarySearch(scores, 99);
		System.out.println("index : " + index);
	}

}
