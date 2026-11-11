package ex01;

interface LabAction {
	void run();
}
public class AnonymousExample {

	public static void main(String[] args) {

		/* 익명클래스
		
		LabAction action = new LabAction() {
			
			@Override
			public void run() {
				System.out.println("연구소에 오신것을 환영합니다.");
			}
		};
		action.run();
		*/
		
		LabAction action = () -> System.out.println("연구를 시작합니다!");
		action.run();

	}

}
