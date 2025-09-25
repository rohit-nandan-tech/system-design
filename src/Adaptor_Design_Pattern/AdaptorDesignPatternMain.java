package Adaptor_Design_Pattern;

public class AdaptorDesignPatternMain {

    public static void main(String []args){
        ObjectStore objectStore = new ObjectStore();

        objectStore.getAdaptor().play("Song.mp3");
        objectStore.getAdaptor().play("Video.mp4");
        objectStore.getAdaptor().play("git.exe");
    }
}
