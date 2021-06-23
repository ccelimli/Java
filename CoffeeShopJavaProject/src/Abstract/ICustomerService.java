package Abstract;


import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public interface ICustomerService {
	void Add(Customer customer);

}
