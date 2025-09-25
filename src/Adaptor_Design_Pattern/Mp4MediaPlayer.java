package Adaptor_Design_Pattern;

public class Mp4MediaPlayer implements MediaPlayer{


    @Override
    public void play(String file) {
        System.out.println("Playing " + file);
    }
}
