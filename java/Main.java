import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {   
        AbonnementType basic = AbonnementType.BASIC;
        AbonnementType premium = AbonnementType.PREMIUM;
        AbonnementType extreme = AbonnementType.EXTREME;

        LocalDate dateAbonnement = LocalDate.of(2025, 04, 10);

        Membre james = new Membre(0001, "James", "Callaghan", "jamescallaghanpro@gmail.com", dateAbonnement, basic, 1000);        
        Coach didier = new Coach(0003, "didier", "Deschamps", "didi@gmail.com", 104594);

        didier.addSpecialite(SpecialiteCoach.YOGA);
        System.out.println(didier);


        LocalDate date = LocalDate.of(2025, 02, 25);
        Seance s = new Seance(1004, "Yoga débutant", SpecialiteCoach.YOGA, 5, date);
        s.attribuerCoach(didier);
        System.out.println(s);




        s.ajouterMembre(james);
        System.out.println("Nombre de places restantes: " + s.nombrePlaceRestantes());

    }
}
