import java.util.Scanner;

public class mainLLR {
	
	songs s = new songs();
    artists a = new artists();
    playlist p = new playlist();

	public static void main(String[] args) {

		mainLLR main = new mainLLR();
		main.Display();
        
    }
	
	public void Display(){
    	Scanner scan = new Scanner(System.in);
    	
    	//User can enter how many songs he want
    	System.out.print("How many songs will you enter?: ");
    	int count = scan.nextInt();
    	scan.nextLine();
    	
    	//inputing and printing of songs and artist Linked List
    	Input(count);
        System.out.println("Songs: " + s.getSongs());
        System.out.println("Artists: " + a.getArtists());
        
        //printing of playlist Linked List
        System.out.println("Playlist:");
        for(int i = 0; i < p.getPlaylist().size(); i++) {
        	System.out.println(p.getPlaylist().get(i));
        }
    }
	
	public void Input(int n) {
		
		Scanner sc = new Scanner(System.in);
		
		//Inputing songs, artists, and playlist to the linked list using recursion
        if(n > 0) {

        	System.out.print("Enter the song name: ");
        	String kanta = sc.nextLine();
        	s.setSongs(kanta);
        	
        	System.out.print("Enter the artist/band: ");
        	String singerist = sc.nextLine();
        	a.setArtists(singerist);
        	
        	p.setPlaylist(kanta + " - " + singerist);
        	
        	Input(n - 1);
        }	
	}
}
