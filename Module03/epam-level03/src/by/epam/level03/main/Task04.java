package by.epam.level03.main;

/*    Работа со строкой как с массивом символов
 * 4. В строке найти количество чисел.
 */
public class Task04 {

	public static void main(String[] args) {
		String value = " I need 20 kg sugar, 10 kg solt , 5 kg pepper";
		char[] arr = value.toCharArray();
		int countNumbers = 0;
		for (int i = 0; i < arr.length; i++) {
			if (Character.isDigit(arr[i])) {
				countNumbers++;
				for (int j = i + 1; j < arr.length; j++) {
					if (Character.isDigit(arr[j])) {
						i = j;
					} else
						break;
				}
			}
		}
		System.out.println("The string contains " + countNumbers + " numbers");
	}
}
//  The string contains 3 numbers