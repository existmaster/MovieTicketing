// ����
public class Employee {

	public TicketMachine ticketMachine;
	public boolean isSeat; // �¼� ����

	public Employee() {
		ticketMachine = new TicketMachine();
	}

	public void reserveMovie(Customer customer, String mvName) {
		System.out.println("Employee : TicketMachine���� A��ȭ�� ��ȭ ������ ����ϴ�.");
		ticketMachine.movieInfo();
	}

}
