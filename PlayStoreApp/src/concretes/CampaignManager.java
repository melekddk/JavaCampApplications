package concretes;

import abstracts.ICampaignService;
import entities.Campaigns;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaigns campaign) {
		System.out.println("Yeni Kampanya Ekleme Ýþlemi Gerçekleþti" + campaign.getCampaignName() + " " + campaign.getDiscountDate() );
		
	}

	@Override
	public void update(Campaigns campaign) {
		System.out.println("Yeni Kampanya Güncellem Ýþlemi Gerçekleþti" + campaign.getCampaignName() + " " + campaign.getDiscountDate() );
		
	}

	@Override
	public void delete(Campaigns campaign) {
		System.out.println("Yeni Kampanya Silme Ýþlemi Gerçekleþti" + campaign.getCampaignName() + " " + campaign.getDiscountDate() );
		
	}

}
