package mernisProject;

public class SalesManager implements SalesService {

	@Override
	public void sellGame(Game game, Gamer gamer) {
	System.out.println(game.getName() + gamer.getFirstName()+ "oyunu aldý");
		
	}

	@Override
	public void sellGame(Game game, Gamer gamer, Campaign campaign) {
	System.out.println(game.getName()+gamer.getFirstName()+campaign.getName()+ "ile oyunu aldý.");
		
	}

}
