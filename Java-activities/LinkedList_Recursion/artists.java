import java.util.LinkedList;

public class artists {

	LinkedList<String> artistsList = new LinkedList<String>();

	public void setArtists(String artist) {
		this.artistsList.add(artist);
	}

	public LinkedList<String> getArtists() {
		return artistsList;
	}
}
