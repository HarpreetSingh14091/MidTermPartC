/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author harpr
 */
import java.util.Scanner;

public class TestUserprofile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for name
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        // Display available genres
        System.out.println("Choose your favorite genre from the following options:");
        for (int i = 0; i < UserProfile.genres.length; i++) {
            System.out.println((i + 1) + ". " + UserProfile.genres[i]);
        }

        // Prompt user for genre choice
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int genreChoice = scanner.nextInt();

        // Validate genre choice
        if (genreChoice < 1 || genreChoice > UserProfile.genres.length) {
            System.out.println("Invalid genre choice. Please run the program again and choose a valid genre.");
            return;
        }

        // Create user profile
        UserProfile userProfile = new UserProfile(userName, UserProfile.genres[genreChoice - 1]);

        // Display confirmation message
        System.out.println("Your userProfile was created:\n" +
                           "Name: " + userProfile.getUserID() + "\n" +
                           "Favorite Genre: " + userProfile.getGenre());
    }
}