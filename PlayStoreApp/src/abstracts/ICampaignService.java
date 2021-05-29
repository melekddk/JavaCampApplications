package abstracts;

import entities.Campaigns;

public interface ICampaignService {
    void add(Campaigns campaign);
	
	void update(Campaigns campaign);
	
	void delete(Campaigns campaign);

}
