public class Main {
    
    public static void main(String[] args) {
        AbonnementType basic = AbonnementType.BASIC;
        AbonnementType premium = AbonnementType.PREMIUM;
        AbonnementType extreme = AbonnementType.EXTREME;

        Membre james = new Membre(0001, "James", "Callaghan", "jamescallaghanpro@gmail.com", "25/02/2025", basic, 1000);
        Membre denis = new Membre(0002, "Denis", "bourdier", "denis@gmail.com", "25/02/2025", premium ,2000);
        
        Coach c = new Coach(0003, "didier", "Deschamps", "didi@gmail.com", "football", 104594);

        Seance s = new Seance(0004, "Football drills", 20); 

        System.out.println("Capacité maximum: " + s.getCapaciteMax());
        System.out.println("Nombre de places restantes: " + s.nombrePlaceRestantes());
        s.ajouterMembre(denis);

        System.out.println("Nombre de places restantes: " + s.nombrePlaceRestantes());
        s.ajouterMembre(james);
        System.out.println("Nombre de places restantes: " + s.nombrePlaceRestantes());

    }
}
