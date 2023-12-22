package MusicPlayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class PlaylistManager {
    private LinkedList<String> playlist;
    private ListIterator<String> playlistIterator;

    public PlaylistManager() {
        // Constructor code here
    }

    public void addSong(String song) {
        // addSong() method code here
    }

    public void play() {
        // play() method code here
    }

    public void displayPlaylist() {
        // displayPlaylist() method code here
    }

    public static void main(String[] args) {
        // Main method for testing your PlaylistManager class
        PlaylistManager manager = new PlaylistManager();
    	// Adding three songs
        manager.addSong("Dojo Cat");
        manager.addSong("Sunnny day");
        manager.addSong("TGIF");

        // Displaying the playlist
        manager.displayPlaylist();

        // Removing two songs
        manager.removeSong("TGIF");
        manager.removeSong("Dojo Cat"); // Trying to remove a non-existent song

        // Displaying the updated playlist
        manager.displayPlaylist();
    }

	private void removeSong(String string) {
		// TODO Auto-generated method stub
		
	}
}

