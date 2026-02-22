
public class mainChallenge {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountNumber( 123456789);
        account.setBalance(1000.00);
        account.setCustomerName("Kamil Sudol");
        account.setEmail("test@gmail.com");
        account.setPhoneNumber("112554665");

        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
        System.out.println(account.getCustomerName ());
        System.out.println(account.getEmail());
        System.out.println(account.getPhoneNumber());


        account.deposit(500.00);
        account.withdraw(250.00);
        account.withdraw(1500.00);

    }
}