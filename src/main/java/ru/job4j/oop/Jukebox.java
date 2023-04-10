package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        String songName = switch (position) {
            case 1 -> "Pust begut neukluge";
            case 2 -> "Spokoinoy nochi";
            default -> "Song have not fined";
        };
        System.out.println(songName);
    }

    public static void main(String[] args) {
        Jukebox song = new Jukebox();
        song.music(1);
        song.music(2);
        song.music(0);
    }
}
