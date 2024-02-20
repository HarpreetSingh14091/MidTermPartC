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

        // Get user's name
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        // Display available genres
        System.out.println("Choose your favorite genre:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        // Get user's chosen genre
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int genreChoice = scanner.nextInt();

        // Validate genre choice
        if (genreChoice < 1 || genreChoice > genres.length) {
            System.out.println("Invalid genre choice. Exiting program.");
            return;
        }

        // Create UserProfile
        UserProfile userProfile = new UserProfile(userName, genres[genreChoice - 1]);

        // Display confirmation message
        System.out.println("User Profile created successfully!");
        System.out.println("UserID: " + userProfile.getUserID());
        System.out.println("Favorite Genre: " + userProfile.getGenre());

        // Close scanner
        scanner.close();
    }
}