package ex01;

public interface LabAction {
	// 상속한 클래스에서 구현함
	// 반드시
	// 인터페이스는 모두 퍼블릭
	void run();

	class WelcomeAction implements LabAction {
		@Override
		public void run() {
			System.out.println("연구소에 오신것을 환영합니다");
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
