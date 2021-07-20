package AOP_Basic_02_JAVA;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

//보조 업무를 (공통관심) 클래스
//실 함수를 대신해서 처리할 수 있는 기능 (대리함수) (= invoke)
//invoke : 여러개의 함수를 대리하는 방법
public class LogPrintHandler implements InvocationHandler{ //보조객체긴 하지만 주객체를 찾아갈수 있어야함

	private Object target;	//실 객체의 주소값
	LogPrintHandler(Object target) {
		System.out.println("logPrintHandler 생성자 호출");
		this.target = target;
	}
	
	
	//invoke == 대리함수(Add,Mul,Sub 를 대신해서)
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {  //add,sub,mul 어떤함수를 불러도 호출되어야 하는 함수
		System.out.println("invoke 함수 호출");
		System.out.println("method 함수명 : " + method);
		System.out.println("method parameter : " + Arrays.toString(args));
		
		Log log = LogFactory.getLog(this.getClass()); 
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[타이머 시작]");
		
		//주업무 실행(실 객체의 실 함수 호출) : 주객체의 주함수인 (add,mul,sub) 를 호출 누가? invoke가
		int result = (int)method.invoke(this.target, args);  //int 다운캐스팅, Object타입 이기 때문에
		
		//보조업무
		sw.stop(); 
		log.info("[타이머 종료]");
		log.info("[Time log Method : Mul]");
		log.info("[Time log Method : "+ sw.getTotalTimeMillis() +"]");
		
		return result ;
	} 

}
