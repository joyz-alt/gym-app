public class Membre extends Personne{

    private String dateInscription;
    private int numeroAdherent;

    public Membre(int id, String name, String surname, String email, String dateInscription, int numeroAdherent){
        super(id, name, surname, email);
        this.dateInscription = dateInscription;
        this.numeroAdherent = numeroAdherent;
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

    @Override
    public String toString() {
        return "Adherent: " + getNumeroAdherent() + " | " + getDateInscription() + " | " + super.getFullName();
    }


}