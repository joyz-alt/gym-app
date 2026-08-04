import java.util.ArrayList;
import java.time.LocalDate;

public class Seance {
    
    private int id;
    private String nomSeance;
    private SpecialiteCoach specialiteRequise;
    private int capaciteMax;
    private Coach coach;
    private ArrayList<Membre> participants = new ArrayList<>();
    private LocalDate date;

    public Seance(int id, String nomSeance, SpecialiteCoach specialiteRequise, int capaciteMax, LocalDate date){
        this.id = id;
        this.nomSeance = nomSeance;
        this.specialiteRequise = specialiteRequise;
        this.capaciteMax = capaciteMax;
        this.date = date;  
    }    

    public boolean attribuerCoach(Coach coach){
        if(coach.hasSpecialite(specialiteRequise)){
            this.coach = coach;
            return true;
        }else{
            return false;
        }
    }

    public boolean estInscrit(Membre membre){
        for(Membre participant : participants){
            if(participant.getEmail().equals(membre.getEmail())){
                return true;
            }
        }
        return false;
    }

    public boolean ajouterMembre(Membre membre){
        if(participants.size() >= capaciteMax){
            return false;
        }
        participants.add(membre);
        System.out.println(membre + " à été ajouter à la séance");
        return true;
    }

    public boolean removeMembre(Membre membre){
        if(participants.remove(membre)){
            System.out.println(membre+" a été retirer de la séance");
            return true;
        } else{
            System.out.println(membre+" est absent de la séance");
            return false;
        }
    }


    public boolean estComplete(){
        if(nombrePlaceRestantes() > 0){
            return false;
        }
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
        return id + ": " + nomSeance + " | " + capaciteMax + " membres maximum | " + coach.getFullName() + " | " + date;
    }
}
