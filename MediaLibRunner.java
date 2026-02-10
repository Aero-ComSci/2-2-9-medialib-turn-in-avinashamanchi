public class MediaLibRunner
{
    public static void main(String[] args)
    {
        MediaLib myLib1 = new MediaLib();
        MediaLib myLib2 = new MediaLib();

        myLib1.addBook("Diary of a Wimpy Kid", "Jeff Kinney");
        myLib1.addMovie("Interstellar", 2.49);
        myLib1.addSong("Raindance");

        myLib2.addBook("The Hunger Games", "Suzanne Collins ");
        myLib2.addMovie("Star Wars Revenge Of the Sith", 2.20);
        myLib2.addSong("We are never getting back together");

        System.out.println("Library 1:");
        System.out.println(myLib1);

        System.out.println("Library 2:");
        System.out.println(myLib2);

        System.out.println("Total entries: " + MediaLib.getNumEntries());
        System.out.println("Books: " + MediaLib.getNumBooks());
        System.out.println("Movies: " + MediaLib.getNumMovies());
        System.out.println("Songs: " + MediaLib.getNumSongs());
    }
}
