import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        /*Даны следующие классы: Person {String name;}, BankAccountWithOwner{Person owner;String ibann;}
         и данс писок банковских счетов List<BankAccountWithOwner> accounts.
         Написать функцию, которая вернет List<PersonWithBankAccounts> persons (PersonWithBankAccount{String name; List<String> ibanns;})
         такой, что к каждому человеку прилагается список ibans его банковских счетов.*/


        Person p1 = new Person("Maximilian Percy");
        Person p2 = new Person("Ola");
        Person p3 = new Person("Armando");

        List<BankAccountWithOwner> allBankAccounts =
                List.of(new BankAccountWithOwner(p1, "DE35 9039 2434 912 09980"),
                (new BankAccountWithOwner(p2, "DE35 9039 2434 912 09981")),
                (new BankAccountWithOwner(p3, "DDE35 9039 2434 912 09989")));
        System.out.println(getPersonsWithBankAccountList(allBankAccounts));
    }

    public static List<PersonWithBankAccounts> getPersonsWithBankAccountList(List<BankAccountWithOwner> list) {
        return list.stream()
                .collect(Collectors.groupingBy(e -> e.getOwners().getName(),
                        Collectors.mapping(e -> e.getIban(), Collectors.toList())))
                .entrySet().stream()
                .map(ba -> new PersonWithBankAccounts(ba.getKey(), ba.getValue()))
                .collect(Collectors.toList());
    }


}


