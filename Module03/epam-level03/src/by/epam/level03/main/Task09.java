package by.epam.level03.main;

/*
 *    Работа со строкой как с объектом типа String или StringBuilder
 * 4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт".
 */
public class Task09 {

	public static void main(String[] args) {
		String str = "информатика";
		StringBuilder sb = new StringBuilder(str);
		char letter01 = sb.charAt(7);
		char letter02 = sb.charAt(3);
		char letter03 = sb.charAt(4);
		char letter04 = sb.charAt(7);
		System.out.println("Result - " + letter01 + "" + letter02 + "" + letter03 + "" + letter04);
	}
}
// Result - торт