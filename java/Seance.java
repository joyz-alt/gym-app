import java.util.ArrayList;

import javax.management.MBeanException;

public class Seance {
    
    private int id;
    private String nom;
    private int capaciteMax;
    private ArrayList<Membre> participants = new ArrayList<>();

    public Seance(int id, String nom, int capaciteMax){
        this.id = id;
        this.nom = nom;
        this.capaciteMax = capaciteMax;
    }

    public int getCapaciteMax(){
        return capaciteMax;
    }

    public boolean ajouterMembre(Membre membre){
        if(participants.size() >= capaciteMax){
            return false;
        }

        participants.add(membre);
        System.out.println(membre + " à été ajouter à la séance");
        return true;
    }

    public int nombrePlaceRestantes(){
        return capaciteMax - participants.size();
    }

    public void afficherMembres(){
        for(Membre membre : participants){
            System.out.println(membre.getFullName());
        }    
    }

    @Override
    public String toString() {
        return id + " | " + nom + " | " + capaciteMax;
    }
}
