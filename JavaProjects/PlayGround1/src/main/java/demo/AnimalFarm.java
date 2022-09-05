package demo;

public class AnimalFarm {
    public static void main(String[] args) {
        Dog Omar = new Dog("bingo");

        Dog catty = new Dog ("catty");

        Cat Aqil = new Cat ("Aqil", true);

        System.out.println(Omar.name);
        System.out.println(catty.name);
        System.out.println(Aqil.name);

        Omar.bark();
        catty.bark();
        Aqil.meow();
    }
}
