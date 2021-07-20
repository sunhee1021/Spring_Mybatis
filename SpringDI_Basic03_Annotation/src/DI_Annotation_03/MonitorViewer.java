package DI_Annotation_03;

import javax.annotation.Resource;

public class MonitorViewer {
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}
	
	//@Aurowired (같은 Type) = (by type)
	@Resource(name="zz")	//같은 타입의 객체가 여러개 있더라도 name값으로 찾는다 = (by name)
	public void setRecorder(Recorder recorder) {  
		this.recorder = recorder;				 
	}
	
}
