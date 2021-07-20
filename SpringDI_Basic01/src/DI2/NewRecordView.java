package DI2;

public class NewRecordView {
	//점수 출력하는 클래스
	
	private NewRecord record;	//member field(setter)
	
	
	public void setRecord(NewRecord record) {	//record의 setter 함수
		this.record = record;
	}

	//나는 니가 필요해  (2가지 방법)
	//1. [생성자]를 통해서 필요한 객체를 생성 또는 주입 하는 방법  (= DI)  >> 복합이 될수도 집합이 될수도 있음
	//2. 함수(setter)를 통해서 필요한 객체를 주입하는 방법  (= DI2)  >> 집합
	//>  뉴레코드를 했다고 해서 세터를 꼭 해야 하는건 아니니까 필요에 따라서 
	
	public void print() {
		System.out.println(record.total() + "/" + record.avg());
	}
}
