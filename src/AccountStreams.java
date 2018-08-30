import java.util.stream.Stream;

public class AccountStreams {

	public static void main(String[] args) {
		Account[] actsArray = {new Account(1,"Checking",100),new Account(2,"Checking",200),
				               new Account(3,"Savings",300),new Account(4,"Checking",400)};
		//Find account having a balance greater then 150 dollars and of type Checking and increase bal by 100, find sum
		double sum = 0;
		for(Account act: actsArray) {
			if(act.getAccountBalance() > 150) {
				if(act.getAccountType().equals("Checking")) {
					act.increaseBalance(100);
					System.out.println("Act no is "+act.getAccountNumber()+" act bal is "+act.getAccountBalance());
					sum +=act.getAccountBalance();
				}
			}
		}
		System.out.println("Sum is "+sum);
		System.out.println("Using Stream --------------------------------------------------------");
		Stream<Account> acctsStream = Stream.of(new Account(1,"Checking",100),new Account(2,"Checking",200),
	                                            new Account(3,"Savings",300),new Account(4,"Checking",400));
		double result = acctsStream.filter(e -> e.getAccountBalance() > 150)
		           .filter(e -> e.getAccountType().equals("Checking"))
		           .peek(e -> e.increaseBalance(100))
		           .peek(e -> System.out.println("Act no is "+e.getAccountNumber()+" act bal is "+e.getAccountBalance()))
		           .mapToDouble(e -> e.getAccountBalance()).sum();
		System.out.println("Sum is "+result);

	}

}
