package dreamworks_films;

import java.util.List;

public class DreamWorksFilmSorter {

	public static void main(String[] args) {
		List<DreamWorksFilm> unsortedFilms = DreamWorksFilm.getDreamWorksFilms();
		List<DreamWorksFilm> lambdaFilms;
		List<DreamWorksFilm> methodReferenceFilms;
		
		System.out.println("Original:");
		DreamWorksFilm.printFilms(unsortedFilms);
		
		lambdaFilms = sortWithLambda();
		System.out.println("Sort using lambda expression:");
		DreamWorksFilm.printFilms(lambdaFilms);
		
		methodReferenceFilms = sortWithMethodReference();
		System.out.println("Sort using method reference:");
		DreamWorksFilm.printFilms(methodReferenceFilms);
	}
	
	private static List<DreamWorksFilm> sortWithLambda() {
		List<DreamWorksFilm> films = DreamWorksFilm.getDreamWorksFilms();
		
		films.sort((p1, p2) -> DreamWorksFilm.compare(p1, p2));
		return films;
	}
	
	private static List<DreamWorksFilm> sortWithMethodReference() {
		List<DreamWorksFilm> films = DreamWorksFilm.getDreamWorksFilms();
		
		films.sort(DreamWorksFilm::compare);
		return films;
	}
}
