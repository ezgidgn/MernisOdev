package mernisProject;

public class GamerManager implements GamerService{
	
	GamerCheckService gamerCheckService;  //dependency injeciton
	   public GamerManager(GamerCheckService gamerCheckService){ 
		   this.gamerCheckService = gamerCheckService;
	   }
	   
	
	
	
	public void add(Gamer gamer) {
		
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			String nameSurname = gamer.getFirstName() + " " + gamer.getLastName();
			System.out.println(nameSurname + " "+ "oyuncu sisteme eklendi.");
		}
		else {
			System.out.println("kullan�c� bilgileri hatal�.");
		}
	}
	
	public void update(Gamer gamer) {
		
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			String nameSurname = gamer.getFirstName() + " " + gamer.getLastName();
			System.out.println(nameSurname + "adl� oyunucunun bilgileri g�ncellendi.");
			
		}
		
		else {
			System.out.println("kullan�c� bilgileri hatal�.");
		}
	}
			
			
		
		
		
		
	
	public void delete(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + " " + "adl� oyuncu sistemden silindi");
		
	}

}
