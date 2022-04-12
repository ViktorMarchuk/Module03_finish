package by.epam.level03.main;

/*    Работа со строкой как с массивом символов
 * 2. Замените в строке все вхождения 'word' на 'letter'.
 */
public class Task02 {

	public static void main(String[] args) {
		String sourceValue = "The world is huge. I like world";
		String value = sourceValue.replace("world", "letter");
		System.out.println("Result is: " + value);
	}
}
// Result is: The letter is huge. I like letter