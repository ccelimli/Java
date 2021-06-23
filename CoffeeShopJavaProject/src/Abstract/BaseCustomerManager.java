package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void Add(Customer customer) {
		System.out.println("Saved to Database"+ customer.getFirstName());
	}

	
}
