import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args)  {
        VirtualPet pet = new VirtualPet();
        System.out.println("Enter your pets name:");
        Scanner scanner = new Scanner(System.in);

        String name= scanner.nextLine();
        pet.setName(name);

       

        while(pet.getHunger() >= 0 && pet.getBoredom() >= 0 && pet.getThirst()  >= 0){
             System.out.println("What do you want to do with you pet? ");
             System.out.println("'A' to feed");
             System.out.println("'B' to play");
             System.out.println("'C' to give drink");
             System.out.println("'D' to give up on pet ownership and quit");
System.out.print("Enter choice: ");
             String response = scanner.nextLine();


             
//game loop

            if ( 
                response.equalsIgnoreCase("a")){
                    pet.feed(pet.getHunger());

                }
                else if (response.equalsIgnoreCase("b")){
                    pet.play(pet.getBoredom());
                }
                else if(response.equalsIgnoreCase("c")){
                    pet.giveDrink(pet.getThirst());
                }
                else if (response.equalsIgnoreCase("d")){
                    break;
                }
                else{
                    System.out.println("Please enter valid input");
                }

                    System.out.println("Your pets hunger level is: " + pet.getHunger() + "\nthirst level is: " + pet.getThirst() + "\nand boredom is: " + pet.getBoredom());
                
                }

               
                
                if ( pet.getHunger() < 0 || pet.getThirst() < 0 ) {
                    System.out.println("Your pet died of malnutrition");
                }else if ( pet.getBoredom() < 0){
                    System.out.println("Your pet ran away to find a place to play");
                }

            
            }
         
  
   
        
    }

