// ����
public class Employee {

	public TicketMachine ticketMachine;

	public Employee() {
		ticketMachine = new TicketMachine();
	}

	public void reservation(Customer customer, String mvName) {
		System.out.println("Employee : TicketMachine���� A��ȭ�� ��ȭ ������ ����ϴ�.");
		ticketMachine.movieInfo();
	}

}
