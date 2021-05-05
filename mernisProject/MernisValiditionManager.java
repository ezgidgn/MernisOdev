package mernisProject;

public class MernisValiditionManager implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		if(gamer.getId() == 3 && gamer.getYearOfBirth() == 1999 && gamer.getFirstName() == "Ezgi" && gamer.getLastName() == "Doðan")
		{
			return true;
		}		
		else if(gamer.getId() == 1 && gamer.getYearOfBirth() == 1987 && gamer.getFirstName() == "Gökhan" && gamer.getLastName() == "Doðan") {
			
			return true;
		}
		else {
			return false;
		}
		
	}

}
