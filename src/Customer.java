
public class Customer {

	public Customer(String customerName) {
		
	}

	public void reserveMovie(Employee employee) {
		System.out.println("Customer : MovieDisplay���� ���� ������ ��ȭ������ �޾ƿɴϴ�.");
		MovieDisplay movieDisplay = new MovieDisplay();
		movieDisplay.currentMovie();
		
		System.out.println("Customer : Employee���� A��ȭ�� 4D�� 1�ÿ� ����ʹٰ� ���մϴ�.");
		employee.reservation(movieDisplay.mvInfo);
	}

}
