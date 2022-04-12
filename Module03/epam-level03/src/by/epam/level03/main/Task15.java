package by.epam.level03.main;

/*
 * Работа со строкой как с объектом типа String или StringBuilder
 * 10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным 
   знаком. Определить количество предложений в строке X
 */
public class Task15 {

	public static void main(String[] args) {
		String str = "The weather is cold. Do you like it? Yes it is! I need to rest.";
		System.out.println("Count of sentences is " + countSentences(str));

	}

	public static int countSentences(String s) {
		int count = 0;
		String[] s1 = s.split("[\\.\\!\\?]");
		for (String i : s1) {
			count++;
		}
		return count;
	}

}
// Count of sentences is 4