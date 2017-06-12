import java.util.ArrayList;
import java.util.List;

// �մ�
public class Customer {

	List<String> movies = new ArrayList<String>();
	
	String mvName;
	List<String> mvTime = new ArrayList<String>();

	public Customer(String customerName) {

	}

	public void findNewMovie(MovieDisplay mvDisplay) {
		System.out.println("Customer : MovieDisplay���� ���� ������ ��ȭ������ �޾ƿɴϴ�.");
		movies.addAll(mvDisplay.findCurrentMovies());
	}

	public void reserveMovie(Employee employee) {
		System.out.println("Customer : Employee���� '�̳�;߼�'��ȭ�� ����ʹٰ� ���մϴ�.");

		// ���Ƿ� ��ȭ�� �ϳ� �������ش�.
		mvName= movies.get(0);

		mvTime = employee.askMvTime(this, mvName);
		
		System.out.println("Customer : '"+ mvName + "' ��ȭ " +mvTime.get(0)+"�� ������ �ּ���");
		employee.reserveMovie(this, mvName, mvTime.get(0));
		
		
	}
}