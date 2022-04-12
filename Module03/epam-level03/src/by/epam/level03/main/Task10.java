package by.epam.level03.main;

/*
 *  Работа со строкой как с объектом типа String или StringBuilder
 * 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

 */
public class Task10 {

	public static void main(String[] args) {
		String str = "Заданная строка";
		char[] ch = str.toCharArray();
		int count = 0;
		for (int i : ch) {
			if (i == 'а') {
				count++;
			}
		}
		System.out.println("The quentity of letters A is - " + count);
	}
}
// The quentity of letters A is - 4

