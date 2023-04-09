package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Pust begut neukluge");
        } else if (position == 2) {
            System.out.println("Spokoinoy nochi");
        } else {
            System.out.println("Song have not fined");
        }
    }

    public static void main(String[] args) {
        Jukebox song = new Jukebox();
        song.music(1);
        song.music(2);
        song.music(0);
    }
}
