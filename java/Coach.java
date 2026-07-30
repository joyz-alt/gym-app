public class Coach extends Personne{
    
    private String specialite;
    private int numeroSalarie;

    public Coach(int id, String name, String surname, String email, String specialite, int numeroSalarie){
        super(id, name, surname, email);
        this.specialite = specialite;
        this.numeroSalarie = numeroSalarie;
    }

    public void setSpecialite(String spe){
        this.specialite = spe;
    }

    public String getSpecialite(){
        return specialite;
    }

    public void setNumeroSalarie(int i){
        this.numeroSalarie = i;
    }

    public int getNumeroSalarie(){
        return numeroSalarie;
    }

    @Override
    public String toString() {
        return "Salarié: " + getNumeroSalarie() + " | Spécialité: " + getSpecialite();
    }
}
