import java.util.ArrayList;

public class Abonnement {

    private ArrayList<String> abonnements;

    public Abonnement(){
        abonnements = new ArrayList<String>(); 
    }

    public void ajouterAbonnement(String a){
        abonnements.add(a);
    }

    public void supprimerAbonnement(String a){
        abonnements.remove(a);
    }

    public String afficherAbonnement(String a){
        return a;
    }




}
