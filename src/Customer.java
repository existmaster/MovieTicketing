
public class Customer {

	MovieDisplay movieDisplay;

	public Customer(String customerName) {
		movieDisplay = new MovieDisplay();
	}

	public void findNewMovie(MovieDisplay mvDisplay) {
		// TODO Auto-generated method stub
		System.out.println("Customer : MovieDisplay���� ���� ������ ��ȭ������ �޾ƿɴϴ�.");
		mvDisplay.findCurrentMovies();
	}

	public void reserveMovie(Employee employee) {
		System.out.println("Customer : Employee���� A��ȭ�� 4D�� 1�ÿ� ����ʹٰ� ���մϴ�.");
		employee.reservation(this, movieDisplay.mvInfo);
	}
}