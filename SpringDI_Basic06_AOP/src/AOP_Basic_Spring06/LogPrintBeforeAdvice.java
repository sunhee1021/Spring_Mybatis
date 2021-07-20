package AOP_Basic_Spring06;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

public class LogPrintBeforeAdvice implements MethodBeforeAdvice{

	@Override  //주업무가 실행되기전에 실행될것임
	public void before(Method method, Object[] args, Object target) throws Throwable {
															//실객체주소
		Log log = LogFactory.getLog(this.getClass());
		log.info("[Before Advice Start]");
		log.info("method:" + method.getName());
		log.info("args : " + args.toString());
		log.info("target" + target.toString());
		
		
	}

}
