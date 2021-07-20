package DI_Annotation_04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//ConfigContext 파일은 >> DI_Config.xml 과 동일한 효과

@Configuration
public class ConfigContext {  //객체 생성하고 주입
	
	//xml> <bean id="user" class="DI_Annotation_04.User">
	//함수를 통해서 객체를 return
	
	@Bean
	public User user() {
		return new User();
	}
	
	//@Bean = 내가 직접 작성한 클래스가 아니라 외부 라이브러리의 객체를 빈으로 만들고 싶을 때 사용한다.
	
	//bean 이란
	//Spring IoC 컨테이너가 관리하는 자바 객체를 빈(Bean)이라는 용어로 부른다. 
	//즉 Spring에서의 빈은 ApplicationContext가 알고있는 객체, 즉 ApplicationContext가 만들어서 그 안에 담고있는 객체를 의미한다.
	
	//xml> <bean id="user2" class="DI_Annotation_04.User2">
	
	@Bean
	public User2 user2() {
		return new User2();
	}
}
