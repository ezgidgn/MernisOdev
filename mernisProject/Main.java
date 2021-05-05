package mernisProject;

public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager1 = new GamerManager(new MernisValiditionManager());
	    Gamer gamer1 = new Gamer();
	    GamerManager gamerManager2 = new GamerManager(new MernisValiditionManager());
	    Gamer gamer2 = new Gamer();
	    
	    Game game1 = new Game(2, "pubg", 30);
	    Game game2 = new Game(5, "zombi tsunami",20);
	    Game game3 = new Game(8, "kafa topu",10);
	    
	    Campaign campaign1 = new Campaign(34, "yaz tatili indirimi", 40);
	    Campaign campaign2 = new Campaign(20, "sömestýr tatili indirimi", 50);
	    
	    
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign2);
		
		
		SalesManager salesManager = new SalesManager();
		salesManager.sellGame(game3, gamer2);
		salesManager.sellGame(game3, gamer2, campaign2);

	}

}
