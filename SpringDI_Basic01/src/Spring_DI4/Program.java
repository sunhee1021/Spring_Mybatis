package Spring_DI4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		/*
		 1.SpringFramework 가 제공하는 컨테이너 안에 객체가 생성 (메모리 공간 : IOC 컨테이너) 
		 2.컨테이너를 만들고 그 메모리에 필요한 객체를 생성하고 조립(주입)  하고 소멸까지 간다
		 
		NewRecordView view = new NewRecordView();
		NewRecord record = new NewRecord();
		
		view.setRecord(record); //setter로 주입(다형성)
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("DIConfig.xml");
		//저장공간인 컨테이너를 만들고 그 다음 xml 파일을 read 하기 시작 > 컨테이너 안에 객체생성, 주입과정 실행
		//xml 파일을 통해서 필요한 것을 올려놓은 거임
		
		//컨테이너 안에서 필요한 객체만 골라서 놀면 돼요
		//레고박스 안에 만들어진 블럭들이 있고 , 원하는 블럭을 가지고 노는 것
		RecordView view = (RecordView)context.getBean("view");
		//타입이 정형화되지 않기때문에 , 자기타입으로 캐스팅 걸어줘야함
		
		view.input();
		view.print();
		
		//예외발생
		//Caused by : java.lang.ClassNotFoundException: org.apache.commons.logging.LogFactory
	}

}
