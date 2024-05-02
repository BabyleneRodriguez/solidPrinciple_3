public class Petshop
{
    public static void main (String[] args)
    {
        Pet pet = new Pet("Dog", "Babbi");
        PetEating petEating = new PetEating();
        PetSound petSound = new PetSound();

        System.out.print (petEating.eat(pet, "Dog Food") + "\n");
        System.out.print (petSound.makeSound(pet, "Meow!!"));
    }
}