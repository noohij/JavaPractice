package ch6;

public class TvTest4 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();		// tvArr[0], tvArr[1], tvArr[2]
			tvArr[i].channel = i + 10;	// tvArr[0] = 10, tvArr[1] = 11, tvArr[2] = 12
		}
		
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();	// tvArr[0] = 11, tvArr[1] = 12, tvArr[2] = 13
			System.out.printf("tvArr[%d].channel = %d%n", i, tvArr[i].channel);
			// 형식화된 출력		출력될 텍스트의 형식			  ㄴ> 첫 번째 정수를 대체하는 값
			//														ㄴ> 두 번째 정수를 대체하는 값
		}
	}
	
//	class Tv {
//		// Tv의 속성(멤버변수)
//		String color;
//		boolean power;
//		int channel;
//		
//		//Tv의 기능(메서드)
//		void power() {
//			power = !power;
//		}
//		void channelUp() {
//			++channel;
//		}
//		void channelDown() {
//			--channel;
//		}
//	}

}
