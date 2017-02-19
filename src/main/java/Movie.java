/**
 * Created by NileshPagar at gmail dot com on 2/19/17.
 */
public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private Price price;

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            case CHILDRENS:
                price = new ChildrenPrice();
                break;
        }
    }

    public String getTitle() {
        return _title;
    }

    public double calculateAmount(int _daysRented) {
        return price.calculateAmount(_daysRented);
    }

    public int calculateFrequentRenterPoints(int daysRented) {
        return price.calculateFrequentRenterPoints(daysRented);
    }
}
