package DI_Annotation_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MonitorViewer {
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}
	
	@Autowired   
	//자동으로 걸고 넘어지라는 뜻의 annotation 이래 뭐지?
	@Qualifier("recorder_1") /*<qualifier value="recorder_1"></qualifier>*/
	public void setRecorder(Recorder recorder) {  //setter를 통해서 recorder 객체의 주소를 자동으로 주입받겠다.
		this.recorder = recorder;				  //By Type이 컨테이너안에 있으면 ...
	}
	
	@Autowired
	@Qualifier("recorder_2")
	public void Gmethod(Recorder rec) {
		System.out.println("Gmethod(rec) : " + rec);
	}
}
