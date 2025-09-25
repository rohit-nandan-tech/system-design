package Adaptor_Design_Pattern;

// This class has a different interface
public class LegacyVideoPlayer {
    public void playFile(String filename) {
        System.out.println("Playing legacy video file: " + filename);
    }
}
