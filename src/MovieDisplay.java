// ������ ��ȭ ����
public class MovieDisplay {

	String mvName;

	public MovieDisplay() {
	}

	public String findCurrentMovies() {
		System.out.println("MovieDisplay : ���� ������ ��ȭ ������ Customer���� �˷��ݴϴ�.");
		return mvName;
	}

	public void getMovieInformation(MovieInfo mvInfo) {
		mvName = mvInfo.getMvName();
	}
}