import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager= new NeroCustomerManager(); 
		Customer customer= new Customer(1,"Cagatay","Celimli",LocalDate.of(1996, 5, 5),"736324");

	}

}
