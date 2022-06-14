import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class DogGenetics {
    public static void main(String[] args) {
        Vector<String> breeds = new Vector<>();
        HashMap<String, Integer> selections = new HashMap<>();
        Random rand = new Random();

        int sum = 100;
        int buffer = 5;

        int perc;
        String dog;
        String name;


        breeds.add("Labrador Retriever");
        breeds.add("French Bulldog");
        breeds.add("German Shepherd");
        breeds.add("Golden Retriever");
        breeds.add("English Bulldog");
        breeds.add("Poodle");
        breeds.add("Beagle");
        breeds.add("Rottweiler");
        breeds.add("German Shorthaired Pointer");
        breeds.add("Dachshund");
        Scanner in = new Scanner(System.in);
        System.out.println("What is your dogs name? : ");
        name = in.nextLine();


        //
        for(int i = 0; i < 4; i++){

            dog = breeds.get(rand.nextInt(breeds.size()));

            perc = rand.nextInt(sum - buffer) + 1;
            selections.put(dog, perc);
            breeds.remove(dog);

            sum = sum - perc;
            buffer -=1 ;
        }
        dog = breeds.get(rand.nextInt(breeds.size()));
        selections.put(dog, sum);
        System.out.println(name + " is : ");
        selections.forEach((key, value) ->{
            System.out.println(key + " : " + value);
                });

        System.out.println("Wow, thats quite the dog!");
    }
}
