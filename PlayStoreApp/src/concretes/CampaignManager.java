package concretes;

import abstracts.ICampaignService;
import entities.Campaigns;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaigns campaign) {
		System.out.println("Yeni Kampanya Ekleme ��lemi Ger�ekle�ti" + campaign.getCampaignName() + " " + campaign.getDiscountDate() );
		
	}

	@Override
	public void update(Campaigns campaign) {
		System.out.println("Yeni Kampanya G�ncellem ��lemi Ger�ekle�ti" + campaign.getCampaignName() + " " + campaign.getDiscountDate() );
		
	}

	@Override
	public void delete(Campaigns campaign) {
		System.out.println("Yeni Kampanya Silme ��lemi Ger�ekle�ti" + campaign.getCampaignName() + " " + campaign.getDiscountDate() );
		
	}

}
