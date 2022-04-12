package by.epam.level03.main;

/*
 * Работа со строкой как с объектом типа String или StringBuilder
 * 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. 
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */
public class Task12 {

	public static void main(String[] args) {
		String str = "abc cde def";
		String strNoWhiteSpace = str.replaceAll("\\s+", "");
		StringBuilder sb = new StringBuilder(strNoWhiteSpace);
		sb.delete(3, 6);
		System.out.println("Result is\n" + sb);
	}
}
// Result is
// abcdef
