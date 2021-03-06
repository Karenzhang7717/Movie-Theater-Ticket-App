package Control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import java.util.ArrayList;

import Model.Movie;
import Model.MovieList;
import Model.ShowTime;
import Model.ShowTimeList;
import Model.Theater;


public class LogisticsController{
//	private ArrayList<Movie> movies;
	private MovieList movieList;
	private ShowTimeList showtimeList;
//	private ArrayList<ShowTime> showtimes;
	private Movie movie;
	private MainController mainController;
//	private DBController dbController;

	
	public Movie selectMovie(int id) {
		Movie selectedMovie = null;
		
		return selectedMovie;
	}
	
	public Theater selectTheatre() {
		Theater selectedTheater = null;
		
		return selectedTheater;
	}
	
	public ShowTime selectShowtime(int id) {
		ShowTime selectedShowtime = null;
		
		return selectedShowtime;
	}
	
	public ArrayList<Movie> listRegularMovies() {
		return movieList.listRegularMovies();
	}
	
	public ArrayList<Movie> listReservationMovies(){
		return movieList.listReservationMovies();
	}
	
//	public void run() {
//	    dbController = new DBController(this);
//	    movieList=new MovieList(dbController.getMovies());
//	
//		ShowTimeList theShowTime = new ShowTimeList(dbController.getShowTime());
//		ArrayList<Movie> regularMovies = movieList.listRegularMovies();
//		System.out.println(regularMovies);
//		
//	}

	public ShowTimeList getShowTimeList() {
		return showtimeList;
	}

	public void setShowtimes(ArrayList<ShowTime> showtimes) {
		this.showtimeList = new ShowTimeList(showtimes);
	}

	public void setMovies(ArrayList<Movie> movies) {
		this.movieList = new MovieList(movies);
	}
	public MovieList getMovieList() {
		return movieList;
	}
	

	
	
	
	
	

}
