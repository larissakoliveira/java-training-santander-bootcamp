package iphone_uml.exercise;

public class iPhone implements MusicPlayer, InternetBrowser {
    private double screenSize;
    private double batteryLife;

    public iPhone(double screenSize, double batteryLife) {
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }

    public void playMusic() {
        // Implementation to play music
        play();
    }

    public void makeCall(String number) {
        // Implementation to make a call
        call(number);
    }

    public void browseInternet(String url) {
        // Implementation to browse the internet
        browse(url);
    }

    @Override
    public void play() {
        // Implementation of playing music
        System.out.println("Playing music");
    }

    @Override
    public void browse(String url) {
        // Implementation of browsing the internet
        System.out.println("Browsing URL: " + url);
    }

    // Private method to simulate calling
    private void call(String number) {
        System.out.println("Calling " + number);
    }
}
