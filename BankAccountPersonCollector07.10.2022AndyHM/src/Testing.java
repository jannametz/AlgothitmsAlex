import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;



public class Testing {
    @Test
    public void getMap() {
        Person p1 = new Person("Maximilian Percy");
        Person p2 = new Person("Ola");
        Person p3 = new Person("Armando");

        List<BankAccountWithOwner> accounts = List.of(new BankAccountWithOwner(p1, "DE35 9039 2434 912 09980"),
                (new BankAccountWithOwner(p2, "DE35 9039 2434 912 09981")),
                (new BankAccountWithOwner(p3, "DE35 9039 2434 912 09989")));

        }
}

