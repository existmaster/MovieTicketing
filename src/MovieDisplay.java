import java.util.List;

public class MovieDisplay {

	public MovieInfo mvInfo;

	public MovieDisplay() {
		mvInfo = new MovieInfo();
	}

	public MovieInfo findCurrentMovies() {
		System.out.println("MovieDisplay : ���� ������ ��ȭ ������ Customer���� �˷��ݴϴ�.");
		String[] mvinfo = {mvInfo.getMvName(), mvInfo.getMvTime(), mvInfo.getMvSeats()};
		return mvInfo;
	}
}