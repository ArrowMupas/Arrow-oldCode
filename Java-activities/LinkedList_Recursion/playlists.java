import java.util.LinkedList;

public class playlist {

	LinkedList<String> playlist = new LinkedList<String>();

	public void setPlaylist(String songEntry) {
		this.playlist.add(songEntry);
	}

	public LinkedList<String> getPlaylist() {
		return playlist;
	}
}
