import java.util.ArrayList;
import java.util.List;

// ���ű��
public class TicketMachine {
	ScreenInfo screenInfo;

	private String mvName;
	private String mvTime;
	private String mvTheater;
	private int mvSeat;

	public TicketMachine() {
		screenInfo = new ScreenInfo();
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
