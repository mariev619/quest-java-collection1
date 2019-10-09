import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        Hero black = new Hero("Black Widow", 34);
        // name: Black Widow, age: 34
        Hero captain = new Hero("Captain America", 100);
        // name: Captain America, age: 100
        Hero vision = new Hero("Vision", 3);
        // name: Vision, age: 3
        Hero iron = new Hero("Iron Man", 48);
        // name: Iron Man, age: 48
        Hero scarlet = new Hero("Scarlet Witch", 29);
        // name: Scarlet Witch, age: 29
        Hero thor = new Hero("Thor", 1500);
        // name: Thor, age: 1500
        Hero spider = new Hero("Spider-Man", 18);
        // name: Spider-Man, age: 18
        Hero hulk = new Hero("Hulk", 49);
        // name: Hulk, age: 49
        Hero doctor = new Hero("Doctor Strange", 42);
        // name: Doctor Strange, age: 42
        heroes.add(black);
        heroes.add(captain);
        heroes.add(vision);
        heroes.add(iron);
        heroes.add(scarlet);
        heroes.add(thor);
        heroes.add(spider);
        heroes.add(hulk);
        heroes.add(doctor);

        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge(1501);

        Collections.shuffle(heroes);
        List<Hero> heroes2 = heroes.subList(0, 4);

        for (Hero hero : heroes2) {
            System.out.println(hero.getName());
        }
    }
}
