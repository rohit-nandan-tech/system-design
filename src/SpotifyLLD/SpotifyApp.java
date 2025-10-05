package SpotifyLLD;

import SpotifyLLD.DeviceConnectorPack.*;
import SpotifyLLD.PlaylistRepoPack.PlaylistSet;
import SpotifyLLD.SongRepoPack.*;

import java.util.Scanner;

public class SpotifyApp {
    public static void main(String[] args) {
        // --- Setup ---
        ObjectStore objectStore = new ObjectStore();
        CacheConfigService cacheConfigService = new CacheConfigServiceImpl(new SongDaoDB());
        DeviceConnector connector = new DeviceConnectorImpl(objectStore);

        SpotifyManager spotifyManager = new SpotifyManager(connector, cacheConfigService);
        spotifyManager.Connect(DeviceType.BLUETOOTH);

        Scanner sc = new Scanner(System.in);

        // --- User Interaction Loop ---
        System.out.println("🎵 Welcome to Spotify LLD!");
        System.out.println("----------------------------");

        System.out.print("Enter your username: ");
        String userName = sc.nextLine();
        PlaylistSet userPlaylistSet = new PlaylistSet(userName);

        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Play Song");
            System.out.println("2. Pause Song");
            System.out.println("3. Add Song to Playlist");
            System.out.println("4. Remove Song from Playlist");
            System.out.println("5. View Playlist");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter song name to play: ");
                    String songName = sc.nextLine();
                    Song song = spotifyManager.findSong(songName);
                    if (song != null) {
                        spotifyManager.Play(song.name);
                    }
                }
                case 2 -> spotifyManager.Pause();

                case 3 -> {
                    System.out.print("Enter playlist name: ");
                    String playlistName = sc.nextLine();
                    System.out.print("Enter song name to add: ");
                    String songName = sc.nextLine();
                    Song song = spotifyManager.findSong(songName);
                    if (song != null)
                        spotifyManager.addSongToUserPlaylist(userPlaylistSet, playlistName, song);
                }

                case 4 -> {
                    System.out.print("Enter playlist name: ");
                    String playlistName = sc.nextLine();
                    System.out.print("Enter song name to remove: ");
                    String songName = sc.nextLine();
                    Song song = spotifyManager.findSong(songName);
                    if (song != null)
                        spotifyManager.removeSongFromUserPlaylist(userPlaylistSet, playlistName, song);
                }

                case 5 -> {
                    System.out.print("Enter playlist name to view: ");
                    String playlistName = sc.nextLine();
                    spotifyManager.showUserPlaylist(userPlaylistSet, playlistName);
                }

                case 6 -> {
                    System.out.println("👋 Exiting Spotify... Goodbye!");
                    return;
                }

                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
