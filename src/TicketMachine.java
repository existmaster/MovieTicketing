// ���ű��
public class TicketMachine {

	public MovieInfo mvInfo;
	
	public TicketMachine() {
		mvInfo = new MovieInfo();
	}
	
	public String[] movieInfo() {
		System.out.println("TicketMachine : MovieInfo�� ���� �󿵰��� �����ִ� �ڸ� ������ �˾ƺ��ϴ�.");
		String[] seatInfo = {mvInfo.getMvName(), mvInfo.getMvThreater(), mvInfo.getMvTime(), mvInfo.getMvSeats()};
		return seatInfo;
	}
}
