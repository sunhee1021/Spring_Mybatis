package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import Spring.Client;

//xml > java 파일 > prototype 설정

@Configuration
public class JavaConfigPrototype {
	
/*	
  <bean id="client" class="Spring.Client" scope="prototype"> //scope => getbean할때마다 객체를 새로 만듬
	<property name="host" value="webserver"></property>
  </bean>
*/
	@Bean
	@Scope("prototype")  //이런코드를 쓸일이 없어요, 보통 annotation 안쓰고 싱글톤으로 씁니다.
	public Client client(){
		Client client = new Client();
		client.setHost("webserver");
		return client;
	}

}

//AOP 프로그래밍
//2차 과제할때 filter 같은거를 의미함
//한글처리!!!
