// ���ű��
public class TicketMachine {

	private String mvName;
	private String mvTime;
	private String mvTheater;
	private int mvSeat;

	public TicketMachine() {
		
	}

	public void setScreenInformation(ScreenInfo screenInfo) {
		// screenInfo������ �Է�
		mvName = screenInfo.getMvName();
		mvTime = screenInfo.getMvTime();
		mvTheater = screenInfo.getMvTheater();
		mvSeat = screenInfo.getMvSeat();
	}

	public boolean isPossibleReserve() {
		System.out.println("TicketMachine : Employee���� ��ȭ�� ���� ������ �˷��ش�.");
		if (mvSeat >= 1)
			return true;
		else
			return false;
	}

	public void doReserve() {
		System.out.println("TicketMachine : ��ȭ�� �����Ͽ����ϴ�.");
	}

}