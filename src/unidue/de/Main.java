package unidue.de;

import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	boolean terminate = false;

	Scanner input = new Scanner(System.in);
	while(!terminate) {
	    System.out.println("Please input file path or quit to terminate :");
	    String choice = input.nextLine();
        if ("quit".equalsIgnoreCase(choice)) {
            System.out.println("Terminating...");
            terminate = true;
        } else {
            try {
                String output = Files.readString(Path.of(choice));
                System.out.println(output);
            } catch (InvalidPathException e) {
                System.out.println("Invalid Path :"+e.getMessage());
            }
            catch (IOException e) {
                System.out.println("Error when reading : "+e.getMessage());
            }

        }
    }

    }
}
