public class BankAccountWithOwner {
    Person owners;
    private String Iban;

    public BankAccountWithOwner(Person owners, String Iban) {
        this.owners = owners;
        this.Iban = Iban;
    }

    public Person getOwners() {
        return owners;
    }

    public String getIban() {
        return Iban;
    }

    @Override
    public String toString() {
        return owners + " " +
                Iban;
    }
}
