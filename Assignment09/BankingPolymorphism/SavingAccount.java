package Assignment09.BankingPolymorphism;

public class SavingAccount extends Account{
    @Override
    public void createAccount() {
        System.out.println("-------------------------------------------------");
        System.out.println("CREATING Saving ACCOUNT");
        System.out.println("-------------------------------------------------");
        System.out.print("Enter name: ");
        setName(sc_str.nextLine());
        System.out.print("Enter Age: ");
        setAge(sc.nextInt());
        setDate();
        System.out.print("Enter account type: ");
        System.out.println("""
                1.Saving
                2.PF
                3.Current""");
        int ch = sc.nextInt();
        switch (ch){
            case 1->{
                setAcountType("Saving");
            }case 2->{
                setAcountType("PF");
            }case 3->{
                setAcountType("Current");
            }default -> {
                System.out.println("Enter valid choice");
            }
        }
        double balance = getBalance();
        do {
            System.out.println("Basic balance: ");
            balance = sc.nextDouble(); // initial deposit (must be minimum Rs.1000)
            if (balance < 1000) {
                System.out.println("Initial balance should be minimum Rs.1000!");
            }
            else {
                System.out.println("--------------------------------------");
                System.out.println("Account created!");
                System.out.println("--------------------------------------");
            }
        } while (balance < 1000);


    }
}
