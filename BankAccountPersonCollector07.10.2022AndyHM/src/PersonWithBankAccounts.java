
import java.util.List;

public class PersonWithBankAccounts {
    private String name;
    List<String> ibans;

    public PersonWithBankAccounts(String name, List<String> ibans) {
        this.name = name;
        this.ibans = ibans;
    }

    public String getName() {

        return name;
    }

    public List<String> getIbans() {

        return ibans;
    }

    @Override
    public String toString() {
        return "PersonWithBankAccounts: " +
                name +  ibans ;
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        PersonWithBankAccounts temp = (PersonWithBankAccounts) ob;
        if (!(ob instanceof PersonWithBankAccounts)) return false;
        if (name != null ? !name.equals(temp.name) : temp.name != null) return false;
        return ibans != null ? ibans.equals(temp.ibans) : temp.ibans == null;


    }
}





