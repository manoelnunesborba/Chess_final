package appli;
import joueur.Joueur;
/*30/03/21*/
import plateau.Plateau;
/* NON */


/*V�rification*/
public class Application {
	
	

	public static boolean EstFinie() {
		return true;
	}
	
	public static void main(String[] args) {
		Plateau plat = new Plateau();
		Joueur j1 = new Joueur(5, true);
		Joueur j2 = new Joueur(5, true);
		j1.ajoutRoi(plat, 3, 4, false);
		j1.ajoutFou(plat, 3, 3, false);
		j1.ajoutFou(plat, 3, 5, false);
		j1.ajoutTour(plat, 3, 2, false);
		j1.ajoutTour(plat, 3, 6, false);
		j2.ajoutRoi(plat, 6, 4, true);
		j2.ajoutFou(plat, 6, 3, true);
		j2.ajoutFou(plat, 6, 5, true);
		j2.ajoutTour(plat, 6, 2, true);
		j2.ajoutTour(plat, 6, 6, true);
		
		do {
			 do{
				 System.out.println("C'est � A");
				 System.out.print(plat);
				j1.jouer(plat,j2);
				if(j1.EstEchecEtMat(j2)) {
					System.out.print("Echec !");
				}
			}while(j1.EstTour());
			do{
				System.out.println("C'est � B");
				System.out.print(plat);
				j2.jouer(plat, j1);
				if(j2.EstEchecEtMat(j1)) {
					System.out.print("Echec !");
				};
			}while(j2.EstTour());
		
		}while(EstFinie());
	}
}
