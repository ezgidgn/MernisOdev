package mernisProject;

public class CampaignManager implements CampaignService {
	

	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " "+ "kampanyasý sisteme eklendi.");
	}
	
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " " + "kampnayasý güncellendi.");
	}
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " " + "kampanyasý silindi.");
	}
}
