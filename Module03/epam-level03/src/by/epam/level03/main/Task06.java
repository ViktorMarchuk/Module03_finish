package by.epam.level03.main;

/*
 *   Работа со строкой как с объектом типа String или StringBuilder
   1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */
public class Task06 {

	public static void main(String[] args) {
		String str = "I want to go home and to eat something";
		char[] ch = str.toCharArray();
		int countSpace = 0;
		for (int i : ch) {
			if (i == ' ') {
				countSpace++;
			}
		}
		System.out.println("Result - " + countSpace + " whitespaces");
	}
}
//  Result - 8 whitespaces