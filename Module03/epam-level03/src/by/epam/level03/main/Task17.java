package by.epam.level03.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task17 {

	public static void main(String[] args) {
		String xml = "<notes>\r\n"
				+ " <note id = \"1\">\r\n"
				+ " <to>Вася</to>\r\n"
				+ " <from>Света</from>\r\n"
				+ " <heading>Напоминание</heading>\r\n"
				+ " <body>Позвони мне завтра!</body>\r\n"
				+ " </note>\r\n"
				+ " <note id = \"2\">\r\n"
				+ " <to>Петя</to>\r\n"
				+ " <from>Маша</from>\r\n"
				+ " <heading>Важное напоминание</heading>\r\n"
				+ " <body/>\r\n"
				+ " </note>\r\n"
				+ "</notes>";
		String[] s = xml.split("\n\\s*");
		for (int i = 0; i < s.length; i++) {
		}
		System.out.println("Open tags");
		Pattern open = Pattern.compile("<\\w+>");
		Matcher openTag = open.matcher(xml);
		while (openTag.find()) {
			System.out.print(openTag.group() + " ");
		}
		System.out.println();
		System.out.println("Closed tags");
		Pattern close = Pattern.compile("</\\w+");
		Matcher closeTag = close.matcher(xml);
		while (closeTag.find()) {
			System.out.print(closeTag.group() + " ");
		}
		System.out.println();
		System.out.println("Empty tags");
		Pattern empty = Pattern.compile("<\\w+\\s?/>");
		Matcher emptyTag = empty.matcher(xml);
		while (emptyTag.find()) {
			System.out.print(emptyTag.group() + " ");
		}
		System.out.println();
		System.out.println("Tags with body");
		Pattern body = Pattern.compile(">.+?<");
		Matcher bodyTag = body.matcher(xml);
		while (bodyTag.find()) {
			System.out.print(bodyTag.group() + " ");
		}
	}
}
/*
 * 
Open tags
<notes> <to> <from> <heading> <body> <to> <from> <heading> 
Closed tags
</to </from </heading </body </note </to </from </heading </note </notes 
Empty tags
<body/> 
Tags with body
>Вася< >Света< >Напоминание< >Позвони мне завтра!< >Петя< >Маша< >Важное напоминание< 

*/

