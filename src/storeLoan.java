import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;

/**
 * Natasya Virgichalia
 * Date: 12/15/2017
 * Assignment 17.6
 */
public class storeLoan {
    public static void main(String[] args) throws IOException {
        loan firstLoan = new loan();
        loan secondLoan = new loan(5.5, 4, 15000);
        loan thirdLoan = new loan(3.0, 5, 50000);
        loan fouthLoan = new loan(6.5, 3, 10000);
        loan fifthLoan = new loan(8.0, 2, 12000);
        try (ObjectOutputStream output = new ObjectOutputStream(new
                BufferedOutputStream(new FileOutputStream("Exercise17_06.dat")));
        ) {
            output.writeObject(firstLoan);
            output.writeObject(secondLoan);
            output.writeObject(thirdLoan);
            output.writeObject(fouthLoan);
            output.writeObject(fifthLoan);

        }
    }
}
