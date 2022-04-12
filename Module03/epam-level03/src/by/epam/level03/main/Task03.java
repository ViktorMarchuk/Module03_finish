package by.epam.level03.main;

/*
 * Работа со строкой как с массивом символов
 * 3. В строке найти количество цифр.
 */
public class Task03 {

	public static void main(String[] args) {
		String value = " I was born on July 02, 1987 ";
		int count = (int) value.codePoints().filter(Character::isDigit).count();
		System.out.println("Amount of digits is " + count);
	}
}
// Amount of digits is 6