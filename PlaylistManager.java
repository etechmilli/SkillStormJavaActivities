package MusicPlayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class PlaylistManager {
    private LinkedList<String> playlist;
    private ListIterator<String> playlistIterator;

    public PlaylistManager() {
    	this.playlist = new LinkedList<>();
    	this.playlistIterator = playlist.listIterator();
    }
    
    public void addSong(String song) {
    	playlist.add(song);    
    	System.out.println(song + "Add to the playlist.");
}
    	
    public void play() {
    if (playlist.isEmpty()) {
    	System.out.println("If playlist is empty, add sonds before playing.");
    }
    }

    public void displayPlaylist() {
    	System.out.println("Playlist:");
    	for (String song : playlist) {
    		System.out.println(song);
    	}
    }

    private void removeSong(String song) {
    	if (playlist.contains(song)) {
    		playlist.remove(song);
    		System.out.println(song + " remove from the playlist.");
    	}else {
    		System.out.println(song + " not found in the playlist.");
    	}
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
}
		

