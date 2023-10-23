package ch6;

//class Tv {
//	// Tv의 속성(멤버변수)
//	String color;
//	boolean power;
//	int channel;
//	
//	//Tv의 기능(메서드)
//	void power() {
//		power = !power;
//	}
//	void channelUp() {
//		++channel;
//	}
//	void channelDown() {
//		--channel;
//	}
//}

public class TvTest3 {
	public static void main(String[] args) {
			
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel값은 " + t1.channel + " 입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + " 입니다.");
		
		t2 = t1;		// t1이 저장하고 있는 '주소값'을 t2에게 저장한다.
		t1.channel = 7;
		System.out.println("t1의 channel값을 7 로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + " 입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + " 입니다.");		// 따라서 t2에도 7의 값이 저장됨
		
	}
}
