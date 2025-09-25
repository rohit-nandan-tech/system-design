package Adaptor_Design_Pattern;

// Adapter: makes LegacyVideoPlayer compatible with MediaPlayer
public class LegacyVideoAdapter implements MediaPlayer {
    private final LegacyVideoPlayer legacyVideoPlayer = new LegacyVideoPlayer();

    @Override
    public void play(String file) {
        legacyVideoPlayer.playFile(file);  // adapting method call
    }
}
