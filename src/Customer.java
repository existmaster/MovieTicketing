// �մ�
public class Customer {

	String mvName;
	public Customer(String customerName) {
	}

	public void findNewMovie(MovieDisplay mvDisplay) {
		System.out.println("Customer : MovieDisplay���� ���� ������ ��ȭ������ �޾ƿɴϴ�.");
		mvName = mvDisplay.findCurrentMovies();
	}

	public void reserveMovie(Employee employee) {
		System.out.println("Customer : Employee���� A��ȭ�� 4D�� 1�ÿ� ����ʹٰ� ���մϴ�.");
		employee.reservation(this, mvName);
	}
}