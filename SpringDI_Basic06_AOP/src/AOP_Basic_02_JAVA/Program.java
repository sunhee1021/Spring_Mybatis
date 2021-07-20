package AOP_Basic_02_JAVA;

import java.lang.reflect.Proxy;

public class Program {

	public static void main(String[] args) {
		//1. 실 객체의 주소를 알아야 함
		Calc calc = new NewCalc();
		
		//2. 가짜를 생성할거임 (= proxy)
		Calc cal = (Calc)Proxy.newProxyInstance(calc.getClass().getClassLoader(), //실 객체의 메타 정보(내부정보)
							   				calc.getClass().getInterfaces(),  //행위 정보 (인터페이스로 넘겨주고)
							   				new LogPrintHandler(calc));  //보조 객체의 정보
		
		int result = cal.ADD(555, 555);
		System.out.println("result:" + result);
		
		result = calc.MUL(465, 166);
		System.out.println("result : " + result);

	}

}
