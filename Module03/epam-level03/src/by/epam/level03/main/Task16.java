package by.epam.level03.main;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Работа с регулярными выражениями (Pattern, Matcher)
 * 1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных 
   операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине; 
   отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по 
   алфавиту.
 */
public class Task16 {

	public static void main(String[] args) {
		String st = " Today is hot, it is cool, walking will I. I want to go outside, and you too. I will be back. Create have idea, I you today.";
		String letter = "e";
		System.out.println("Sorted paragraphs");
		System.out.println();
		sortArrText(st);
		System.out.println();
		System.out.println("Sorted words");
		sortSentences(st);
		System.out.println();
		System.out.println("Sorted tokens");
		System.out.println();
		sortTokens(st, letter);

	}

	public static void sortArrText(String s) {
		String[] st = splitText(s);
		for (int i = 0; i < st.length - 1; i++)
			for (int j = i; j >= 0; j--)
				if (st[j].length() > st[j + 1].length()) {
					String temp = st[j];
					st[j] = st[j + 1];
					st[j + 1] = temp;
				}
		for (int z = 0; z < st.length; z++)
			System.out.println(st[z]);
	}

	public static String[] splitText(String st) {
		return st.split("[\\.\\!\\?]");
	}

	public static void sortSentences(String s) {
		String[] k = splitText(s);
		for (int x = 0; x < k.length; x++) {
			String sc = k[x].replaceAll("[!?,.]", "");
			String[] st = sc.split("\\s+");
			for (int i = 0; i < st.length; i++) {
				boolean sort = false;
				while (!sort) {
					sort = true;
					for (int j = 0; j < st.length - 1; j++) {
						if (st[j].length() > st[j + 1].length()) {
							String temp = st[j];
							st[j] = st[j + 1];
							st[j + 1] = temp;
							sort = false;
						}
					}
				}
			}
			for (int z = 0; z < st.length; z++) {
				System.out.println(st[z]);
			}
		}
	}

	public static void sortTokens(String s, String symbol) {
		String[] st = splitText(s);
		for (int i = 0; i < st.length; i++) {
			for (int k = st.length - 1; k >= 0; k--) {
				for (int m = 0; m < k; m++) {
					int countRight = 0;
					int countLeft = 0;
					for (int n = 0; n < st[m].length(); n++) {
						if (String.valueOf(st[m].charAt(n)).compareToIgnoreCase(symbol) == 0) {
							countLeft++;
						}
					}
					for (int n = 0; n < st[m + 1].length(); n++) {
						if (String.valueOf(st[m + 1].charAt(n)).compareToIgnoreCase(symbol) == 0) {
							countRight++;
						}
					}
					if (countLeft < countRight) {
						String tmp = st[m];
						st[m] = st[m + 1];
						st[m + 1] = tmp;
					} else if (countLeft == countRight) {
						String[] forCompare = { st[m], st[m + 1] };
						Arrays.sort(forCompare);
						st[m] = forCompare[0];
						st[m + 1] = forCompare[1];
					}
				}
			}
		}
		for (String word : st) {
			System.out.print(word + " ");
		}
	}
}

/*
 * Sorted paragraphs
 * 
 * I will be back Create have idea, I you today I want to go outside, and you
 * too Today is hot, it is cool, walking will I
 * 
 * Sorted words
 * 
 * I is it is hot cool will Today walking
 * 
 * I to go and you too want outside
 * 
 * I be will back
 * 
 * I you have idea today Create
 * 
 * Sorted tokens
 * 
 * Create have idea, I you today I want to go outside, and you too I will be
 * back Today is hot, it is cool, walking will I
 */
