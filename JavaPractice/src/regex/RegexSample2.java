package regex;

import java.util.regex.*;

public class RegexSample2 {
	
	public static void main(String[] args) {
		//대상 문자열
		String str = "010-1234-1234";
		String exp1 = "^[0-9]*$";	//	^: 시작, $: 끝, []: 이 안에서 체크, *: 없거나 둘 이상
//					   ^[0-9-]*$로 수정하여 -를 추가해주면 출력값은 true가 된다.
		
		System.out.println(str.matches(exp1));
	}
}
