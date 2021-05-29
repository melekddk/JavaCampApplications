package concretes;

import abstracts.ISaleService;
import entities.Campaigns;
import entities.Customer;
import entities.Game;
import entities.Sale;

public class SalesManager implements ISaleService{

	@Override
	public void SaleWithSale(Customer customer, Campaigns campaing, Game game, Sale sale) {
		System.out.println(customer.getFirstName()+ " " + customer.getLastName() + " isimli m��teri " + campaing.getCampaignName()+
				" kampanyadaki" + game.getGameName() +  " oyunu " + sale.getTypeOfSale() + " sat�n ald�." );
		
	}

	@Override
	public void SaleOutSale(Sale sale, Customer customer, Game game) {
		System.out.println(customer.getFirstName()+ " " + customer.getLastName() + " isimli m��teri " + 
	     game.getGameName() +  " oyunu " + sale.getTypeOfSale() + " sat�n ald�." );
		
	}

}
