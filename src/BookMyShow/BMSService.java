package BookMyShow;

import BookMyShow.Builders.AudiBuilder;
import BookMyShow.Builders.CinemaHallBuilder;
import BookMyShow.Builders.MovieBuilder;
import BookMyShow.Builders.ShowBuilder;
import BookMyShow.Entities.*;
import BookMyShow.Enums.Genre;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BMSService {
    public static void main(String []arg) {
        System.out.println("-- adding cinemas in the system by using builder design pattern --");

        CinemaHall cinemaHall1 = new CinemaHallBuilder()
                .setCinemaHallId(1)
                .setCinemaName("DLF")
                .setAddress(new Address("sector 123", "greater noida", "200108", "noida", "india"))
                .getCinemaHall();

        CinemaHall cinemaHall2 = new CinemaHallBuilder()
                .setCinemaHallId(2)
                .setCinemaName("Venice")
                .setAddress(new Address("A-78", "aanand vihar", "211003", "delhi", "india"))
                .getCinemaHall();


        System.out.println("-- adding movies in the system by using builder design pattern --");
        Movie movie1 = new MovieBuilder()
                .setMovieId(101)
                .setMovieName("Pushpa2")
                .setReleaseDate(new Date())
                .setDuration(120)
                .getMovieDetails();

        Movie movie2 = new MovieBuilder()
                .setMovieId(102)
                .setMovieName("Baby John")
                .setReleaseDate(new Date())
                .setDuration(100)
                .setGenre(Genre.ROMANTIC)
                .getMovieDetails();

        Movie movie3 = new MovieBuilder()
                .setMovieId(103)
                .setMovieName("UI")
                .setReleaseDate(new Date())
                .setDuration(140)
                .setLanguage("HINDI")
                .getMovieDetails();

        System.out.println("-- adding shows in the system by using builder design pattern --");
        Show show1 = new ShowBuilder()
                .setShowId(200)
                .setMovie(movie1)
                .setCinemaPlayedAt(cinemaHall1)
                .setStartTime(new Date())
                .setEndTime(new Date())
                .getShow();

        Show show2 = new ShowBuilder()
                .setShowId(201)
                .setMovie(movie2)
                .setCinemaPlayedAt(cinemaHall1)
                .setStartTime(new Date())
                .setEndTime(new Date())
                .getShow();

        Show show3 = new ShowBuilder()
                .setShowId(202)
                .setMovie(movie3)
                .setCinemaPlayedAt(cinemaHall1)
                .setStartTime(new Date())
                .setEndTime(new Date())
                .getShow();

        Show show4 = new ShowBuilder()
                .setShowId(203)
                .setMovie(movie3)
                .setCinemaPlayedAt(cinemaHall2)
                .setStartTime(new Date())
                .setEndTime(new Date())
                .getShow();

        Show show5 = new ShowBuilder()
                .setShowId(203)
                .setMovie(movie1)
                .setCinemaPlayedAt(cinemaHall2)
                .setStartTime(new Date())
                .setEndTime(new Date())
                .getShow();

        List<Show> showsInCinema1 = new ArrayList<>();
        List<Show> showsInCinema2 = new ArrayList<>();
        showsInCinema1.add(show1);
        showsInCinema1.add(show2);
        showsInCinema1.add(show3);

        showsInCinema1.add(show4);
        showsInCinema1.add(show5);

        showsInCinema2.add(show4);
        showsInCinema2.add(show5);

        System.out.println("-- adding audis in the system by using builder design pattern --");
        List<Show> showsInAudi1Cinema1 = new ArrayList<>();
        List<Show> showsInAudi2Cinema1 = new ArrayList<>();
        List<Show> showsInAudi3Cinema1 = new ArrayList<>();

        List<Show> showsInAudi1Cinema2 = new ArrayList<>();
        List<Show> showsInAudi2Cinema2 = new ArrayList<>();

        showsInAudi1Cinema1.add(show1);
        showsInAudi1Cinema1.add(show2);

        showsInAudi2Cinema1.add(show1);
        showsInAudi2Cinema1.add(show3);

        showsInAudi3Cinema1.add(show2);
        showsInAudi3Cinema1.add(show3);

        showsInAudi1Cinema2.add(show4);
        showsInAudi1Cinema2.add(show5);

        showsInAudi2Cinema2.add(show4);

        Audi audi1ForCinema1 = new AudiBuilder()
                .setAudiId(1)
                .setAudiName("Audi-1")
                .setTotalSeats(50)
                .setShowName(showsInAudi1Cinema1)
                .getAudi();
        Audi audi2ForCinema1 = new AudiBuilder()
                .setAudiId(2)
                .setAudiName("Audi-2")
                .setShowName(showsInAudi2Cinema1)
                .setTotalSeats(60)
                .getAudi();
        Audi audi3ForCinema1 = new AudiBuilder()
                .setAudiId(3)
                .setAudiName("Audi-3")
                .setShowName(showsInAudi3Cinema1)
                .setTotalSeats(100)
                .getAudi();

        Audi audi1ForCinema2 = new AudiBuilder()
                .setAudiId(1)
                .setAudiName("Audi-1")
                .setShowName(showsInAudi1Cinema2)
                .setTotalSeats(80)
                .getAudi();
        Audi audi2ForCinema2 = new AudiBuilder()
                .setAudiId(2)
                .setAudiName("Audi-2")
                .setShowName(showsInAudi2Cinema2)
                .setTotalSeats(90)
                .getAudi();

        List<Audi> audiListForCinema1 = new ArrayList<>();
        List<Audi> audiListForCinema2 = new ArrayList<>();

        audiListForCinema1.add(audi1ForCinema1);
        audiListForCinema1.add(audi2ForCinema1);
        audiListForCinema1.add(audi3ForCinema1);

        audiListForCinema2.add(audi1ForCinema2);
        audiListForCinema2.add(audi2ForCinema2);

        cinemaHall1.setAudis(audiListForCinema1);
        cinemaHall2.setAudis(audiListForCinema2);

    }
}
