public class PrototypeRav4 {
    
   
    public String rouler (String conducteur, Float carburant) {
       String drive_result;
    
        drive_result = (conducteur + " démarre la voiture avec " + carburant + "  Litre de Carburant.");
       // System.out.println(drive_result ); 
      // System.out.println("La fonction rouler s\'est bien deroule");
        return drive_result;
    }
    
    
    /**
     * @param vitesse
     * @param deceleration
     * @return
     */
    public String freiner (double vitesse, Float deceleration ) {
        String stop_result;
        stop_result = "je décélère à " + deceleration + "m/s2.Mon ancienne vitesse est " + vitesse + " m/s" ;
         //System.out.println();
         //System.out.println("La fonction rouler s\'est bien deroule");
        return stop_result; 
          
    }

}
        