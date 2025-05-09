public class Main {
    public static void main(String[] args) {
        HeroManager manager = new HeroManager();

        // Add heroes
        manager.addHero(new Hero("Spider-Man", 66, Affiliation.AVENGERS));
        manager.addHero(new Hero("Batman", 90, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Wolverine", 88, Affiliation.X_MEN));
        manager.addHero(new Hero("Super Man", 100, Affiliation.JUSTICE_LEAGUE));

        System.out.println("\nOriginal List:");
        manager.displayHeroes();

        System.out.println("\nAfter Bubble Sort by Power:");
        manager.bubbleSortByPower();
        manager.displayHeroes();

        System.out.println("\nAfter Insertion Sort by Power:");
        manager.insertionSortByPower();
        manager.displayHeroes();

        System.out.println("\nRemoving Batman...");
        manager.removeHero("Batman");
        manager.displayHeroes();

        System.out.println("\nAdding Storm...");
        manager.addHero(new Hero("Storm", 99, Affiliation.X_MEN));
        manager.displayHeroes();

        System.out.println("\n2D Array Format:");
        manager.displayAs2DArray();
    }
}
