import java.util.ArrayList;
import java.util.List;

// �մ�
public class Customer {

	List<String> movies = new ArrayList<String>();
	
	String mvName;
	String mvTime;
	boolean isPossibleReserve = true;

	public Customer(String customerName) {

	}

	public void findNewMovie(MovieDisplay mvDisplay) {
		System.out.println("Customer : MovieDisplay���� ���� ������ ��ȭ������ �޾ƿɴϴ�.");
		movies.addAll(mvDisplay.findCurrentMovies());
		for(int i=0; i<movies.size(); i++) {
//			System.out.println(movies.get(i));
		}
	}

	public void reserveMovie(Employee employee) {
		System.out.println("Customer : Employee���� A��ȭ�� 4D�� 1�ÿ� ����ʹٰ� ���մϴ�.");

		// ���Ƿ� ��ȭ�� �ϳ� �������ش�.
		mvName= movies.get(0);

		isPossibleReserve = employee.isPossibleReserve(this, mvName);

		if (isPossibleReserve) {
			System.out.println("customer : �������ּ���.");
			employee.reserveMovie(this, mvName, mvTime);
		} else {
			System.out.println("Customer : �� �˰ڽ��ϴ�.");
		}
	}
}