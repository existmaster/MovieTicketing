// �մ�
public class Customer {

	String mvName;
	String mvTime;
	boolean isPossibleReserve = true;

	public Customer(String customerName) {
	}

	public void findNewMovie(MovieDisplay mvDisplay) {
		System.out.println("Customer : MovieDisplay���� ���� ������ ��ȭ������ �޾ƿɴϴ�.");
		mvName = mvDisplay.findCurrentMovies();
	}

	public void reserveMovie(Employee employee) {
		System.out.println("Customer : Employee���� A��ȭ�� 4D�� 1�ÿ� ����ʹٰ� ���մϴ�.");
		
		isPossibleReserve = employee.isPossibleReserve(this, mvName, mvTime);
		
		if (isPossibleReserve) {
			System.out.println("customer : �������ּ���.");
			employee.reserveMovie(this, mvName, mvTime);
		} else {
			System.out.println("Customer : �� �˰ڽ��ϴ�.");
		}
	}
}