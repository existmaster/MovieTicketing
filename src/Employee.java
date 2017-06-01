// ����
public class Employee {

	public TicketMachine ticketMachine;
	public boolean isSeat; // �¼� ����

	public Employee() {
		ticketMachine = new TicketMachine();
	}

	public boolean isPossibleReserve(Customer customer, String mvName, String mvTime) {
		System.out.println("Employee : Ticketmachine���� A��ȭ�� ���� ������ ����ϴ�.");
		isSeat = ticketMachine.isPossibleReserve();

		if (isSeat) {
			System.out.println("Employee : ���� ��ȭ�� �ڸ��� �־� ���� �����մϴ�.");
			return true;
		} else {
			System.out.println("Employee : �ش� ��ȭ�� �ڸ��� �����ϴ�. �˼��մϴ�.");
			return false;
		}
	}

	public void reserveMovie(Customer customer, String mvName, String mvTime) {
		System.out.println("Employee : ��ȭ�� �����ϰڽ��ϴ�.");
		ticketMachine.doReserve();
	}

}
