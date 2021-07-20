package DI_Annotation_01;

import org.springframework.beans.factory.annotation.Autowired;

public class MonitorViewer {
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}
	
	     
	//@Autowired(required=true) 가 default임 >> 무조건 injection 하겠다
	//@Autowired(required=false) 면 >> 없으면 안하면 되지~ , 컨테이너안에 원하는 타입이 없으면 안하면 되지
	@Autowired  //자동으로 걸고 넘어지라는 뜻의 annotation 이래 뭐지?
	public void setRecorder(Recorder recorder) {  //setter를 통해서 recorder 객체의 주소를 자동으로 주입받겠다.
		this.recorder = recorder;				  //By Type이 컨테이너안에 있으면 ...
	}
	
}
