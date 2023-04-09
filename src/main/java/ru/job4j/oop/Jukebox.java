package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        switch (position) {
            case 1:
                System.out.println("Pust begut neukluge");
                break;
            case 2:
                System.out.println("Spokoinoy nochi");
                break;
            default:
                System.out.println("Song have not fined");
                break;
        }
    }

    public static void main(String[] args) {
        Jukebox song = new Jukebox();
        song.music(1);
        song.music(2);
        song.music(0);
    }
}
