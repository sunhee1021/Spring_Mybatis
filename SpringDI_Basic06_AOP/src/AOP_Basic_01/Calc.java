package AOP_Basic_01;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class Calc {
	/*
 	간단한 사칙 계산기 프로그램
 	-주관심(업무) : 사칙연산(ADD, MUL) -> 기능(함수) 구현
 	-보조관심(공통관심) : 연산에 걸리는 시간
 	-log 출력 (console 출력 red 한 글자)
 	
 	아래와 같은 함수가 100여 가지 ... 시간이 지나서 ... 유지보수 ... 수정하려면 100개의 코드를 모두 수정해야 하잖아? 오마이
 	
 	*/
	
	public int Add(int x, int y) {
		Log log = LogFactory.getLog(this.getClass());  //현재 동작하는 logfactory가 가질수 있음
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[타이머 시작]");
		
		//주업무
		int result = x+y;
		
		sw.stop(); //계산이 끝나면 stop이라고 눌러요
		log.info("[타이머 종료]");
		log.info("[Time log Method : Add]");
		log.info("[Time log Method : "+ sw.getTotalTimeMillis() +"]");
		
		return result;
	}
	
	public int Mul(int x, int y) {
		Log log = LogFactory.getLog(this.getClass());  //현재 동작하는 logfactory가 가질수 있음
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[타이머 시작]");
		
		//주업무
		int result = x*y;
		
		sw.stop(); //계산이 끝나면 stop이라고 눌러요
		log.info("[타이머 종료]");
		log.info("[Time log Method : Mul]");
		log.info("[Time log Method : "+ sw.getTotalTimeMillis() +"]");
		
		return result;
	}
}
