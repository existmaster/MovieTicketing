// ������
public class ScreenInfo {

	private String mvName; // ��ȭ�̸�
	private String mvTime; // �󿵽ð�
	private String mvTheater; // �󿵰�
	private int mvSeat = 5; // �ڸ�

	public ScreenInfo() {
	}

	public String getMvName() {
		return mvName;
	}

	public void setMvName(MovieInfo mvInfo) {
		mvName = mvInfo.getMvName();
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