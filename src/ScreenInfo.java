// ������

public class ScreenInfo {
	MovieInfo mvInfo;
	String mvCode;	// ��ȭ �ڵ�
	String mvName;	// ��ȭ�̸�
	String mvTime;	// �󿵽ð�
	String mvTheater; // �󿵰�
	int mvSeat=5;	// �ڸ�
	
	public ScreenInfo() {
		mvInfo = new MovieInfo();
	}
	
	public String getMvCode() {
		return mvCode;
	}
	
	public String getMvName() {
		return mvName;
	}
	
	public void setMvName() {
		mvInfo.getMvName();
	}
	
	public String getMvTime() {
		return mvTime;
	}
	
	public String getMvTheater() {
		return mvTheater;
	}
	
	public int getMvSeat() {
		return mvSeat;
	}

}
