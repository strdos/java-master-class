package linkedLists;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public static void main(String[] args) {
/*        Song song = new Song("Winter", 4.6);
        System.out.println(song.toString());

        Album album = new Album("Album1", "Artist1");
        album.addSong("Song1", 1.2);
        album.addSong("Song1", 1.2);


        System.out.println(album);
        for (Song s: album.songs) {
            System.out.println(s);
        }
        LinkedList<Song> playlist = new LinkedList<>();
        album.addToPlayList("Song1", playlist);
        for (Song s: playlist) {
            System.out.println(s);
        }
        System.out.println(album.songs.get(0));*/

        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);
    }

    private Song findSong(String title) {
        for (Song s: songs) {
            if (s.getTitle().equalsIgnoreCase(title)) {
                return s;
            }
        }
        return null;
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) != null) {
            System.out.println("The song " + title + " is already present on the album.");
            return false;
        } else {
            songs.add(new Song(title, duration));
            return true;
        }
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if (index >= 0 && index <= songs.size()) {
            playlist.add(songs.get(index));
            return true;
        }
        return false;
    }


    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        if (findSong(title) == null) {
            return false;
        }
        playlist.add(findSong(title));
        return true;
    }

/*    public boolean addSongV1(String title, double duration) {
        for (Song s: songs) {
            if (s.getTitle().equalsIgnoreCase(title)) {
                System.out.println("The song " + title + " is already present in the album.");
                return false;
            }
        }
        songs.add(new Song(title, duration));
        return true;
    }*/

}
