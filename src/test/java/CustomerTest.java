import org.junit.Assert;
import org.junit.Test;

/**
 * Created by NileshPagar at gmail dot com on 2/19/17.
 */
public class CustomerTest {

    @Test
    public void testCustomerStatement() {
        Customer customer = new Customer("Nilesh");
        Movie movie = new Movie("Pirates", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 2);
        customer.addRental(rental);

        movie = new Movie("Titanic", Movie.REGULAR);
        rental = new Rental(movie, 5);
        customer.addRental(rental);

        movie = new Movie("Three Days", Movie.REGULAR);
        rental = new Rental(movie, 1);
        customer.addRental(rental);

        movie = new Movie("Angry Birds", Movie.CHILDRENS);
        rental = new Rental(movie, 4);
        customer.addRental(rental);

        movie = new Movie("UP", Movie.CHILDRENS);
        rental = new Rental(movie, 2);
        customer.addRental(rental);

        Assert.assertEquals("Rental Record for Nilesh\n" +
                "\tPirates\t6.0\n" +
                "\tTitanic\t6.5\n" +
                "\tThree Days\t2.0\n" +
                "\tAngry Birds\t3.0\n" +
                "\tUP\t1.5\n" +
                "Amount owed is 19.0\n" +
                "You earned 6 frequent renter points", customer.statement());
    }

}
