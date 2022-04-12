package by.epam.level03.main;

import java.util.Arrays;

/*
 * Работа со строкой как с объектом типа String или StringBuilder
   6. Из заданной строки получить новую, повторив каждый символ дважды.
 */
public class Task11 {

	public static void main(String[] args) {
		String str = "Hello word too ";
		String str1 = "";
		int n = str.length();
		for (int i = 0; i < n; i++) {
			str1 = str1 + str.substring(i, i + 1) + str.substring(i, i + 1);
		}
		System.out.println("Result \n" + str1);
	}
}
// Result 
// HHeelllloo  wwoorrdd  ttoooo