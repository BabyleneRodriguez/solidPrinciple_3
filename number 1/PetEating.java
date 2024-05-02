public class PetEating
{
    public String eat(Pet pet, String food)
    {
         return (pet.getOwner() + "'s " + pet.getPetName() + " eats " + food);
    }

}