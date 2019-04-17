package ObjectsАndClasses.Exercises;

import java.util.*;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[] phases = {"Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."};
        String[] events = {"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            String phase = phases[random.nextInt(phases.length)];
            String event = events[random.nextInt(events.length)];
            String author = authors[random.nextInt(authors.length)];
            String city = cities[random.nextInt(cities.length)];

            System.out.printf("%s %s %s - %s%n",phase,event,author,city);
        }
    }
}
