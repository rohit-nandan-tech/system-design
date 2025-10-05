package SpotifyLLD.SongRepoPack;

public class Song {
    public String name;
    public String artist;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
