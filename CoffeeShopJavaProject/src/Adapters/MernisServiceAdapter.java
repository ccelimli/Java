package Adapters;


import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CustomerCheckService(Customer customer){
		KPSPublicSoapProxy proxy= new KPSPublicSoapProxy();
		boolean result=false;
		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());	
		}
		
		catch (Exception e) {
			System.out.println("Not a valid person");
		}
		return result;
		
	}

}
