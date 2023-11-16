package regex;

import java.util.regex.*;

public class RegexSample1 {
	
	public static void main(String[] args) {
		//대상 문자열
		String str = "010-1234-1234";
		String exp1 = "^[0-9-#$%]*$";	//	^: 시작, $: 끝, []: 이 안에서 체크, *: 없거나 둘 이상, (-#$%: 이러한 문자들도 포함)
		String exp2 = "^[\\d]*$"; //	\d: 숫자. \자체의 의미를 표현하기 위해 \ + \d 사용
		
		Pattern p1 = Pattern.compile(exp1);
		Pattern p2 = Pattern.compile(exp2);
		Matcher m1 = p1.matcher(str);
		Matcher m2 = p2.matcher(str);
		
		System.out.println(m1.find());
		System.out.println(m2.find());
	}
}
