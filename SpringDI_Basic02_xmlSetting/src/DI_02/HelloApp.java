package DI_02;

public class HelloApp {

	public static void main(String[] args) {
		
		/* 무식한 방법이래
		 * 영문버전
		 MessageBean_en messagebean_en = new MessageBean_en();
		 messagebean_en.sayHello("hong");
		 
	     * 한글버전 
		 MessageBean_kr messagebean_kr = new MessageBean_kr();
		 messagebean_kr.sayHello("hong");
		 */	
		
		
		MessageBean messagebean = new MessageBean_en();
		messagebean.sayHello("hong");    //인터페이스 -> 이제 스프링으로 바꿔보자
		
		MessageBean messagebean2 = new MessageBean_kr();
		messagebean.sayHello("hong");
	}

}
