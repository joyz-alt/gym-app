public class Membre extends Personne{

    private String dateInscription;
    private AbonnementType abonnement;
    private int numeroAdherent;

    public Membre(int id, String name, String surname, String email, String dateInscription, AbonnementType abonnement, int numeroAdherent){
        super(id, name, surname, email);
        this.dateInscription = dateInscription;
        this.abonnement = abonnement;
        this.numeroAdherent = numeroAdherent;
    }

    public void setAbonnement(AbonnementType a){
        this.abonnement = a;
    }

    public void setDateInscription(String d){
        this.dateInscription = d;
    }

    public String getDateInscription(){
        return dateInscription;
    }

    public void setNumeroAdherent(int i){
        this.numeroAdherent = i;
    }

    public int getNumeroAdherent(){
        return numeroAdherent;
    }

    public AbonnementType getAbonnement(){
        return abonnement;
    }

    @Override
    public String toString() {
        return "Adherent: " + getNumeroAdherent() + " | " + getDateInscription() + " | " + super.getFullName();
    }


}