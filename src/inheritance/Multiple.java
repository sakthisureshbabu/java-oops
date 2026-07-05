package inheritance;

interface Camera {
    void takephoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {
    @Override
    public void takephoto() {
        System.out.println("Taking a photo...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }
}

public class Multiple {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        phone.takephoto();
        phone.playMusic();
    }
}