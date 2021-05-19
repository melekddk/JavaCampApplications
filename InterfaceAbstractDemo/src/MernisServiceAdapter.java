import java.util.Locale;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
public class MernisServiceAdapter implements ICustomerCheckService {
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean serviceResult = false;
		try {
			serviceResult = client.TCKimlikNoDogrula(Long.parseLong(
					customer.getNationalityId()),
					customer.getFirstName().toUpperCase(new Locale("tr")),
					customer.getFirstName().toUpperCase(new Locale("tr")), 
					customer.getDateOfBirrth());
		} catch (Exception e) {
			System.out.println("Not a valid person");
		}
		return serviceResult;
	}

}