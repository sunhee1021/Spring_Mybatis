package DI2;

public class Program {

	public static void main(String[] args) {
		
		NewRecordView view = new NewRecordView();
		//아까랑 다르게 생성자로 입력 안하고
		
		//놀다가 ... NewRecord 객체 필요하다면
		NewRecord record = new NewRecord(100,50,50);
		view.setRecord(record);	//주입 ( 의존성 ) _ 뭘통해서? setter를 통해서
		
		view.print();

	}

}
