package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author hasanbasil
 */
public class TestUserprofile {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display available genres to the user
        System.out.println("Available genres:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user to select their favorite genre
        System.out.print("Enter the number of your favorite genre: ");
        int genreNumber = scanner.nextInt();

        // Create a new user profile with the given name and selected genre
        UserProfile userProfile = new UserProfile(name, genres[genreNumber - 1]);

        // Display a message that the user's profile was created
        System.out.println("Congratulations, " + userProfile.getUserID() + "! Your profile was created with your favorite genre set to " + userProfile.getGenre() + ".");
    }
}
