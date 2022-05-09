package dreamworks_films;

import java.util.NoSuchElementException;
import java.util.Optional;

public class DreamWorksFilmOptional {

	public static void main(String[] args) {
		DreamWorksFilm film = filmMethod(Optional.of(new DreamWorksFilm("The Bad Guys")));
		System.out.println("The newest and hottest film is: " + film);
		
		try {
			Optional<DreamWorksFilm> empty = Optional.empty();
			filmMethod(empty);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static DreamWorksFilm filmMethod(Optional<DreamWorksFilm> filmOptional) {
		return filmOptional.orElseThrow(
				() -> new NoSuchElementException("The film does not exist."));
	}
}
