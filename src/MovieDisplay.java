import java.util.ArrayList;
import java.util.List;

// ������ ��ȭ ����
public class MovieDisplay {

	ArrayList<MovieInfo> movieInfo = new ArrayList<MovieInfo>();
	List<String> mvName = new ArrayList<String>();

	public MovieDisplay() {
		movieInfo.add(new MovieInfo("�̳�;߼�", "129��", "��Ÿ��, ������", "��ü���ɰ�"));
		movieInfo.add(new MovieInfo("�븳��", "130��", "���", "15��"));
	}

	public List<String> findCurrentMovies() {
		System.out.println("MovieDisplay : ���� ������ ��ȭ ������ Customer���� �˷��ݴϴ�.");

		System.out.println("******���� �� ������ ��ȭ******");
		for (int i = 0; i < movieInfo.size(); i++) {
			mvName.add(movieInfo.get(i).getMvName());
			System.out.println("  ���� : " + mvName.get(i));
		}
		System.out.println("**************************");

		return mvName;
	}

	public void setMovieInformation(MovieInfo mvInfo) {
		for (int i = 0; i < movieInfo.size(); i++) {
			mvName.add(movieInfo.get(i).getMvName());
		}

	}
}