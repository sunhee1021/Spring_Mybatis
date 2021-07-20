package AOP_Basic_Spring06;

import java.lang.reflect.Proxy;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Program {

	public static void main(String[] args) {
		ApplicationContext context =
				new GenericXmlApplicationContext("classpath:AOP_Basic_Spring06/ApplicationContext.xml");
		
		Calc calc = context.getBean("proxy",Calc.class);
		int result = calc.SUB(10000, 10000);
		System.out.println("AOP 결과 : " + result);

	}

}
