package mernisProject;

public class MernisValiditionManager implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		if(gamer.getId() == 3 && gamer.getYearOfBirth() == 1999 && gamer.getFirstName() == "Ezgi" && gamer.getLastName() == "Do�an")
		{
			return true;
		}		
		else if(gamer.getId() == 1 && gamer.getYearOfBirth() == 1987 && gamer.getFirstName() == "G�khan" && gamer.getLastName() == "Do�an") {
			
			return true;
		}
		else {
			return false;
		}
		
	}

}
