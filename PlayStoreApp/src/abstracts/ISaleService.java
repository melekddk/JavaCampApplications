package abstracts;

import entities.Campaigns;
import entities.Customer;
import entities.Game;
import entities.Sale;

public interface ISaleService {

	 void SaleWithSale(Customer customer, Campaigns campaing, Game game, Sale sale );
	
	 void SaleOutSale(Sale sale, Customer customer, Game game);

}
