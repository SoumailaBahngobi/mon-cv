import java.util.Scanner;

public class Programme { 
    
    public static void main (String [] args) { 

      Scanner input = new Scanner (System.in);   
      PrototypeRav4 modele = new PrototypeRav4();
      Rav42019 voiture = new Rav42019();

      String conducteur, driving, freinage;
      Float carburant, deceleration, vitesse;

     //cette partie concerne la methode rouler a partir de la classe mere

       System.out.println("qui est le conducteur?");
       conducteur = input.nextLine();

       System.out.println("quelle est la quantité de caburant?");
       carburant = input.nextFloat();
       driving = modele.rouler(conducteur, carburant);
      System.out.println(driving);
      
      //la methode freiner a partir de la classe fille (Rav42019)
      System.out.println("Quelle est la vitesse de la voiture:");
      vitesse = input.nextFloat();
      System.out.println("Quelle est la deceleration de la voiture:");
      deceleration = input.nextFloat();
      System.out.println("Je suis la classe fille");
      freinage = voiture.freiner(vitesse, deceleration);
      System.out.println(freinage);

      //freiner avec la classe mere(PrototypeRav4)
      System.out.println("Je suis la classe mere");
      freinage = modele.freiner(vitesse, deceleration);
      System.out.println(freinage);

      //surchage de rouler
      System.out.println("Quelle est le nom du conducteur");









  
    }

}
