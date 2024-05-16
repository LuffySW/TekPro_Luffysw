package org.example.statement;
import org.example.Customer;
import org.example.Rental;

public class PlainStatement extends Statement {
    public PlainStatement(Customer customer) {
        super(customer);
    }

    @Override
    protected String footer() {
        return "Amount owed is " + String.valueOf(getCustomer().getTotalCharge()) + "\n" + "You earned " + String.valueOf(getCustomer().getTotalFrequentRenterPoints()) + " frequent renter points";
    }

    @Override
    protected String detail(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
    }

    @Override
    protected String header() {
        return "Rental record for " + getCustomer().getName() + "\n";
    }
}
