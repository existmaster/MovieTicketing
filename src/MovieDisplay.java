// ������ ��ȭ ����
public class MovieDisplay {

	String movieName;
	
	public MovieDisplay() {
	}

	public String findCurrentMovies() {
		System.out.println("MovieDisplay : ���� ������ ��ȭ ������ Customer���� �˷��ݴϴ�.");
		return movieName;
	}

	public void getMovieInformation(MovieInfo mvInfo) {
		movieName = mvInfo.getMvName();
		
	}
}