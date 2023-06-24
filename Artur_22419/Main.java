// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
    public class Main {
    public static void main(String[] args) {
        System.out.println("------ abstract class Pet ----------");
        Cat cat1 = new Cat( "Bursztynek", 4);
        System.out.println(cat1.name + " is " +cat1.age + " old.");
        cat1.speak();

        Dog dog1 = new Dog("Brutus", 15);
        System.out.println(dog1.name + " is " +dog1.age + " old.");
        dog1.speak();

        Cat cat2 = new Cat("Promien", 3);
        System.out.println(cat2.name + " is " +cat2.age + " old.");
        cat2.speak();

        Dog dog2 = new Dog("Roki", 5);
        System.out.println(dog2.name + " is " +dog2.age + " old.");
        dog2.speak();

        Person p1 = new Person("Ala");
        p1.setPet(cat1);
        System.out.println(p1.getPet() .name + " ma opiekuna " + p1.name);

        Person p2 = new Person("Jarek");
        p2.setPet(cat2);
        System.out.println(p1.getPet() .name + " ma opiekuna " + p2.name);

        Vet v1 = new Vet("Usmiech");
        v1.setPet(dog1);
        System.out.println(v1.getPet() .name + " Witaj w klinice " +v1.clinicName);

        Vet v2 = new Vet("ProVet");
        v2.setPet(dog2);
        System.out.println(v2.getPet() .name + " Witaj w klinice " +v2.clinicName);
    }
}