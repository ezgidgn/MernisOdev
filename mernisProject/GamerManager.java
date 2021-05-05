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
			System.out.println("kullanýcý bilgileri hatalý.");
		}
	}
	
	public void update(Gamer gamer) {
		
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			String nameSurname = gamer.getFirstName() + " " + gamer.getLastName();
			System.out.println(nameSurname + "adlý oyunucunun bilgileri güncellendi.");
			
		}
		
		else {
			System.out.println("kullanýcý bilgileri hatalý.");
		}
	}
			
			
		
		
		
		
	
	public void delete(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + " " + "adlý oyuncu sistemden silindi");
		
	}

}
