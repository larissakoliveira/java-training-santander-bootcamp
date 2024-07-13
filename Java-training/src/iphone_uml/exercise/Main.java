package iphone_uml.exercise;

public class Main {
    public static void main(String[] args) {
        iPhone myiPhone = new iPhone(6.1, 100); // Example screen size and battery life
        myiPhone.playMusic();
        myiPhone.makeCall("+1234567890");
        myiPhone.browseInternet("https://www.example.com");
    }
}

