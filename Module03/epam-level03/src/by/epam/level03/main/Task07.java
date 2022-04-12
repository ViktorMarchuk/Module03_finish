package by.epam.level03.main;

/*
 * Работа со строкой как с объектом типа String или StringBuilder
 * 2. В строке вставить после каждого символа 'a' символ 'b'
 */
public class Task07 {

	public static void main(String[] args) {
		String str = "and after ability alibi ";
		String newStr = str.replace("a", "b");
		System.out.println("Result - \n" + newStr);
	}
}
//  Result - 
//  bnd  bfter  bbility  blibi 