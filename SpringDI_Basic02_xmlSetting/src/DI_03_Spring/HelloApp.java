package DI_03_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		
		/* 무식한 방법이래
		 * 영문버전
		 MessageBean_en messagebean_en = new MessageBean_en();
		 messagebean_en.sayHello("hong");
		 
	     * 한글버전 
		 MessageBean_kr messagebean_kr = new MessageBean_kr();
		 messagebean_kr.sayHello("hong");
		 
		
		//이걸지워주는거임 (DI_03.xml 참고)
		MessageBean messagebean = new MessageBean_kr();
		messagebean.sayHello("hong");    //인터페이스 -> 이제 스프링으로 바꿔보자*/	
		
		//spring 컨테이너 생성 > 생성된 컨테이너 객체 생성 조립(xml)
		//컨테이너 생성방법 : 다양한 방법
		//ApplicationContext context = new ClassPathXmlApplicationContext("DIConfig.xml");
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_03_Spring/DI_03.xml");
										//GenericXmlApplicationContext : XML로부터 객체 설정 정보를 가져온다

		//Generic ... 형변환 이점
		MessageBean message = context.getBean("messagebean", MessageBean.class);  
		//제너릭으로 하면 getbean에 파라미터를 하나더 쓸수 있대요
		//messagebean.class를 쓰면 클래스 내부의 정보를 제공 받기때문에 따로 캐스팅 해주지 않아도 돼요
		message.sayHello("hong");
		
	}

}
