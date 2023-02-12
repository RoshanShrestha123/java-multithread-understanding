import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("<<Experimenting with Threads>>");


        MultiThread _thread = new MultiThread(1);
        MultiThread _thread2 = new MultiThread(2);
        _thread.start(); // keeps the threads up
        _thread2.start(); // keeps the threads up

        // trying getting IO while thread is running
        getUserData();
    }

    public static void getUserData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Get the user input:");
        int number = input.nextInt();
        System.out.println("User entered >>>> " + number);

    }
}