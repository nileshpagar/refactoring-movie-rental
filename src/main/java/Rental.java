/**
 * Created by NileshPagar at gmail dot com on 2/19/17.
 */
public class Rental {

    Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public double calculateAmount() {
        return _movie.calculateAmount(_daysRented);
    }

    public int calculateFrequentRenterPoints() {
        return _movie.calculateFrequentRenterPoints(_daysRented);
    }
}