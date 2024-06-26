import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Set<String> uniqueSongs = new HashSet<>(allSongs); // подумайте, какую лучше коллекцию использовать


        System.out.println("Количество песен: " + uniqueSongs.size());

        System.out.println("Песни:");
        for (String elem : allSongs) {
            System.out.println("  * " + uniqueSongs);
        }
    }

    private static List<String> allSongs = List.of(
        "Sting – Shape Of My Heart",
       "Gorillaz – Clint Eastwood",
        "Lady Gaga – Bad Romance",
        "Taylor Swift – Wildest Dreams",
        "Ariana Grande – 7 rings",
        "Depeche Mode – Personal Jesus",
        "Gorillaz – Clint Eastwood",
        "Lady Gaga – Bad Romance",
        "Bruno Mars – Talking To The Moon",
        "Taylor Swift – Wildest Dreams"
    );
}
