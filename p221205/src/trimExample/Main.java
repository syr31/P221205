package trimExample;

public class Main {
	public static void main(String[] args) {
		String tel1 = "02";
		String tel2 = "123	";
		String tel3 = "4567		";

		System.out.println(tel1 + tel2 + tel3);
		System.out.println(tel1.trim() + tel2.trim() + tel3.trim()); // trim()은 양 옆에 공백만 없애준다.
	}

}
