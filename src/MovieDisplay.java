// ������ ��ȭ ����
public class MovieDisplay {

	private String mvName;
	private String mvTime;

	public MovieDisplay() {
	}

	public String findCurrentMovies() {
		System.out.println("MovieDisplay : ���� ������ ��ȭ ������ Customer���� �˷��ݴϴ�.");
		return mvName;
	}

	public void setMovieInformation(MovieInfo mvInfo) {
		mvName = mvInfo.getMvName();
	}
}