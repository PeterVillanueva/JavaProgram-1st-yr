package PracticalTestStack;

import java.util.Stack;

public class MainArtist {

	public static void main(String[] args) {
		Stack<String> artist = new Stack<String>();

		artist.push("Beyonce");
		artist.push("Ariana Grande");
		artist.push("Taylor Swift");
		artist.push("Mariah Carey");
		artist.push("Adele");
		artist.push("Lady Gaga");
		artist.push("Celine Dion");
		artist.push("Ella Fitzgerald");
		artist.push("Etta James");
		artist.push("Selena Gomez");
		
		String myFavArtist = artist.peek();

		System.out.println("My Favorite Artist is " + myFavArtist);

	}

}
