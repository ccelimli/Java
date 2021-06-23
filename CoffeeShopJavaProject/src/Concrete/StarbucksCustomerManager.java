package Concrete;


import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private ICustomerCheckService checkService;


	public StarbucksCustomerManager(ICustomerCheckService checkService) {
		this.checkService = checkService;
	}


	@Override
	public void Add(Customer customer) {
		if (checkService.CustomerCheckService(customer)) {
			this.Add(customer);
		}
		else {
			System.out.println("Not a valid Person!");
		}
		
	}

}
