package AOP_Basic_Spring06;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintAroundAdvice implements MethodInterceptor{	//메소드를 중간에 가로채기 위한 인터페이스

	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		//보조업무 구현
		System.out.println("Around Advice invoke Start");
		System.out.println("method : " + method);
		
		//보조업무
		Log log = LogFactory.getLog(this.getClass()); 
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[타이머 시작]");
		
		//주업무 (실 객체의 함수 호출)
		Object result = method.proceed();  //실 객체의 실 함수를 호출한 결과를 받아서 
		
		//보조업무
		sw.stop(); 
		log.info("[타이머 종료]");
		log.info("[Time log Method : " + method + "]");
		log.info("[Time log Method : "+ sw.getTotalTimeMillis() +"]");
		
		return result;
	}  

}
