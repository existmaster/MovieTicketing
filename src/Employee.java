
public class Employee {

	public TicketMachine ticketMachine;
	
	public Employee() {
		ticketMachine = new TicketMachine();
		
	}

	public void reservation() {
		System.out.println("Employee : TicketMachine���� A��ȭ�� ��ȭ ������ ����ϴ�.");
		ticketMachine.movieInfo();
	}
	
}
