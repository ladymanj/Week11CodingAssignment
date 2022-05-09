package dreamworks_films;

import java.util.LinkedList;
import java.util.List;

public class DreamWorksFilm {
	private String name;
	
	private static final List<DreamWorksFilm> DREAMWORKS_FILMS = List.of(
			new DreamWorksFilm("Shrek"),
			new DreamWorksFilm("Kung Fu Panda"),
			new DreamWorksFilm("How to Train Your Dragon"),
			new DreamWorksFilm("Antz"),
			new DreamWorksFilm("Trolls"),
			new DreamWorksFilm("Megamind"),
			new DreamWorksFilm("Madagascar"),
			new DreamWorksFilm("Bee Movie")
			);
			
	
	public DreamWorksFilm(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name + " - a DreamWorks Film";
	}
	
	public static int compare(DreamWorksFilm film1, DreamWorksFilm film2) {
		return film1.name.compareTo(film2.name);
	}

	public static List<DreamWorksFilm> getDreamWorksFilms() {
		return new LinkedList<>(DREAMWORKS_FILMS);
	}
	
	public static void printFilms(List<DreamWorksFilm> films) {
		for(DreamWorksFilm film : films) {
			System.out.println("\t" + film);
		}
		System.out.println();
	}
	
	
}
