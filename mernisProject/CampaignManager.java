package mernisProject;

public class CampaignManager implements CampaignService {
	

	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " "+ "kampanyas� sisteme eklendi.");
	}
	
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " " + "kampnayas� g�ncellendi.");
	}
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " " + "kampanyas� silindi.");
	}
}
