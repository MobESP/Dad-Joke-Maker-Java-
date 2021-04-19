
import java.util.Scanner;
import java.util.random;
import java.util.concurrent;


public class DadJokeMaker {
    public static void main(String[] args) {

        string[] arr={"lettuce", "owl", "joke3"};
        random r=new Random();
        int jokeStarter =r.nextInt(arr.length);

        Scanner reader = new Scanner(System.in);
        system.out.printLn("Knock Knock! (Psst! your supposed to say 'Whose there' :D!");
        TimeUnit.SECONDS.sleep(10);

        system.out.printLn(arr[jokeStarter]);       
    }
}
