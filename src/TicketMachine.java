import java.util.ArrayList;
import java.util.List;

// ���ű��
public class TicketMachine {

	private List<ScreenInfo> screenInfos = new ArrayList<ScreenInfo>();

	private int mvSeat;

	public TicketMachine() {
		
	}

	public void setScreenInformation(ScreenInfo screenInfo) {
		// screenInfo������ �Է�
		screenInfos.add(new ScreenInfo("�̳�;߼�", "2��", "1��", 10));
		screenInfos.add(new ScreenInfo("�̳�;߼�", "4��30��", "1��", 5));
		screenInfos.add(new ScreenInfo("�븳��", "1��", "2��", 0));
		screenInfos.add(new ScreenInfo("�븳��", "1��30��", "3��", 2));
	}

	public boolean isPossibleReserve(String mvName) {
		System.out.println("TicketMachine : Employee���� ��ȭ�� ���� ������ �˷��ش�.");
		
		for(int i=1; i<=screenInfos.size(); i++) {
			if(mvName==screenInfos.get(i).getMvName()){
				
			}
		}
		if (mvSeat >= 1)
			return true;
		else
			return false;
	}

	public void doReserve(String mvName, String mvTime) {
		System.out.println("TicketMachine : ��ȭ�� �����Ͽ����ϴ�.");
	}

}