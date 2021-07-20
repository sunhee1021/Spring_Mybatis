package DI_05_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		/*java 코드
		MyBean mybean = new MyBean();
		MyBean mybean2 = new MyBean("hong");
		MyBean mybean3 = new MyBean();
		
		System.out.println("mybean : " + mybean);
		System.out.println("mybean2 : " + mybean2);
		System.out.println("mybean3 : " + mybean3);
		각각의 주소값이 다르게 나오겠죠~? 그정도는 알죠~?
		
		Singleton single = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		System.out.println("single : " + single);
		System.out.println("single2 : " + single2);
		여기는 주소값이 같게 나오겠죠~? 그정도는 알죠~? 싱글톤은 하나의 메모리를 공유하잖아
		 */
		
		ApplicationContext context = 
				new GenericXmlApplicationContext("classpath:DI_05_Spring/DI_05.xml");
		//Spring 컨테이너(메모리)가 구성되고 xml파일을 read 해서 파싱해서 객체에 생성, 조립, 소멸 을 담당
		//누가? 컨테이너가
		//그리고 컨테이너 안에서 필요한 객체를 얻어서 사용하시면 됩니다
		
		MyBean mybean = context.getBean("mybean",MyBean.class);
		MyBean mybean2 = context.getBean("mybean",MyBean.class);
		MyBean mybean3 = context.getBean("mybean",MyBean.class);
		//getBean 함수는 new를 하지 않아, 있는거 갖고오는거야
		//그렇기 때문에 이 3개의 주소값은 같겠지!!!
		//1. return type Object (타입에 맞는 casting)
		//2. 호출시 새로운 객체를 만들지 않아요(new 하지 않아요)
		//**스프링 컨테이너안에 객체들의 타입은 : default singleton
		//**예외적으로 getBean() 객체를 생성하게 할수도 있다!!!!! (그치만 거의 쓰지 않아요)
		//괜히 아는척 객체 만든다고 하지 말자
		
		System.out.println("주소값 : " + mybean + ":" + mybean2 + ":" + mybean3);
		
		
		MyBean mybean4 = context.getBean("mybean2", MyBean.class);
		System.out.println("생성자 사용 : " + mybean4);
		
		Singleton single = context.getBean("single",Singleton.class);
		Singleton single2 = context.getBean("single",Singleton.class);
		
		System.out.println(single +"/" + single2);
		
		
		
		

	}

}
