public class AutoMain {
    public static void main(String[] args) {
        System.out.println("----- abstract class Vehicle ------");
        Car car1 = new Car("Civic", "Blue", "Honda",4);
        System.out.println(car1.namevehical + " is the colour " +car1.color +" company " +car1.company +" have " +car1.wheels +" wheels.");
        Truck t1 = new Truck("H50", "White", "BMW", 12);
        System.out.println(t1.namevehical + " is the colour " +t1.color + " company  " +t1.company + " have " +t1.wheels + " wheels.");
        motorbike m1 = new motorbike("S600", "Gray", "Suzuki", 2);
        System.out.println(m1.namevehical + " is the colour " +m1.color + " company " +m1.company + " have " +m1.wheels + " wheels.");
    }

    /*
    Vehicle name, color
    car
    motorbike
    truck
    abstract method: information() number of wheels


   Producer: Company, Factory



     */
}
