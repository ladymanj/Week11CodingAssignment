package dreamworks_films;

import java.util.stream.Collectors;

public class DreamWorksFilmStreamer {

	public static void main(String[] args) {
		String names = DreamWorksFilm.getDreamWorksFilms()
				.stream()
				.map(p -> p.toString())
				.sorted()
				.collect(Collectors.joining(", "));
		
		System.out.println(names);
	}

}
