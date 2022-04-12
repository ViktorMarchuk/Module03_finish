package by.epam.level03.main;

/*
 *   Работа со строкой как с массивом символов
 *   1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */
public class Task01 {

	public static void main(String[] args) {

		String[] arr = { " uperCaseTo ", " waterCool ", " inToFrom " };
		System.out.println("  Convert array ");
		for (int j = 0; j < arr.length; j++) {
			String result = "";
			char c = arr[j].charAt(0);
			result = result + Character.toLowerCase(c);
			for (int i = 0; i < arr[j].length(); i++) {
				char ch = arr[j].charAt(i);
				if (Character.isUpperCase(ch)) {
					result = result + "_";
					result = result + Character.toLowerCase(ch);
				} else {
					result = result + ch;
				}
			}
			System.out.print (result);
		}
	}
}
// Convert array 
// uper_case_to   water_cool   in_to_from 