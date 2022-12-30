package ifs;

public class SmartTelevisionExample {
    public static void main(String[] args) {
        SmartTelevision tv = new SmartTelevision();
        RemoteControl rc = tv;
        rc.turnOn();
        rc.turnOff();
        rc.setVolume(20);
        Searchable searchable = tv;
        searchable.search("https://www.naver.com/");

    }
}
