public class Vet {

    String clinicName;
    Pet pet;

    public Vet(String clinicName) {
        this.clinicName = clinicName;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
