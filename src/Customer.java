// �մ�
public class Customer {

	String mvName;
	boolean isPossibleReserve = true;

	public Customer(String customerName) {
	}

	public void findNewMovie(MovieDisplay mvDisplay) {
		System.out.println("Customer : MovieDisplay���� ���� ������ ��ȭ������ �޾ƿɴϴ�.");
		mvName = mvDisplay.findCurrentMovies();
	}

	public void reserveMovie(Employee employee) {
		System.out.println("Customer : Employee���� A��ȭ�� 4D�� 1�ÿ� ����ʹٰ� ���մϴ�.");

		isPossibleReserve = employee.reserveMovie(this, mvName);

		if (isPossibleReserve) {
			System.out.println("customer : �������ּ���.");
			employee.doReserveMovie();
		} else {
			System.out.println("Customer : �� �˰ڽ��ϴ�.");
		}
	}
}