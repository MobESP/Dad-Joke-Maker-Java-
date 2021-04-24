import java.util.Scanner;
import java.util.Random;


public class DadJokeMaker {
    public static void main(String[] args) {
        String[][] arr = {
            {"lettuce", "lettuce out!"}, 
            {"owl", "owl be yours!"}, 
            {"joke4", "joke4 you!"}
        };

        Random r = new Random();
        int jokeIndex = r.nextInt(arr.length);
        
        while(true) {
            System.out.println("Knock Knock! (Psst! your supposed to say 'Whose there' :D!");

            Scanner reader = new Scanner(System.in);
            String whoIsThereQuestion = reader.nextLine();

            if(!whoIsThereQuestion.equals("Whose there")) continue;

            System.out.println(arr[jokeIndex][0]);

            String who = reader.nextLine();
            if(!who.equals(arr[jokeIndex][0] + " who")) continue;

            System.out.println(arr[jokeIndex][1]);

            break;
        }
    }
}
