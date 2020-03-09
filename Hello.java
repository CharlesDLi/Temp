import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); //Sets up scanner to read input from keyboard
String apples;        
String name;
        String age;
        String residence; //Declares strings to store responses to questions

        System.out.print("Hello. What is your name? ");
        name = keyboard.next();
        System.out.print("It's nice to meet you, " + name + ". How old are you? ");
        age = keyboard.next();
        System.out.println("I see that you are still quite young at only " + age + ".");
        System.out.print("Where do you live? ");
        residence = keyboard.next();
        System.out.println("Wow! I've always wanted to go to " + residence + ". Thanks for chatting with me. Bye!"); //Asks questions and stores responses
    }

}
