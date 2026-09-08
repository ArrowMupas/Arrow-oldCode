import java.util.LinkedList;

public class songs {

	LinkedList<String> songsList = new LinkedList<String>();

	public void setSongs(String song) {
		songsList.add(song);
	}

	public LinkedList<String> getSongs() {
		return songsList;
	}
}
