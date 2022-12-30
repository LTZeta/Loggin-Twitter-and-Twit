import java.util.Scanner;

public class SetData {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your twitter email:");
        String email = scanner.next();
        System.out.println("Write your twitter password:");
        String password = scanner.next();
        int audience;

        boolean checkAudience = false;
        do {
            System.out.println("Choose audience. 1 for Everybody. 2 for Twitter Circle:");
            audience = scanner.nextInt();
            if (audience == 1 || audience == 2){
                checkAudience = true;
            }
        } while (!checkAudience);

        System.out.println("Write the tweet you want to publish:");
        String tweet = scanner.next();
        scanner.close();

        Twit twit = new Twit();
        twit.setAll(email, password, audience, tweet);
        twit.initWebDriver();
        twit.twitSomething();
        twit.quitWebDriver();

    }

}