package mernisProject;

public class GameManager implements GameService {
	
	
	public void add(Game game) {
		System.out.println(game.getName() + " "+ "oyunu sisteme eklendi.");
	}
	
	public void update(Game game) {
		System.out.println(game.getName() + " " + "oyunu g�ncellendi.");
	}
	public void delete(Game game) {
		System.out.println(game.getName() + " " + "oyunu silindi.");
	}

	

}
