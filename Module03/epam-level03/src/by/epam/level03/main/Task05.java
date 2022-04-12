package by.epam.level03.main;

/*
 * 5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. 
   Крайние пробелы в строке удалить.
 */
public class Task05 {

	public static void main(String[] args) {
		String str = "    I   want         to    learn                           Java   ";
		String strChange = str.replaceAll("\\s+", " ");
		System.out.println(" Result is -\n" + strChange);
	}
}
// Result is -
// I want to learn Java 