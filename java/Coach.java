import java.util.ArrayList;
public class Coach extends Personne {

    private ArrayList<SpecialiteCoach> specialites;
    private int numeroSalarie;

    public Coach(int id, String name, String surname, String email, int numeroSalarie) {
        super(id, name, surname, email);
        this.specialites = new ArrayList<>();
        this.numeroSalarie = numeroSalarie;
    }

    public ArrayList<SpecialiteCoach> getSpecialites() {
        return specialites;
    }
    

    public void addSpecialite(SpecialiteCoach specialite) {
        if (!specialites.contains(specialite)) {
            specialites.add(specialite);
        }
    }

    public void removeSpecialite(SpecialiteCoach specialite) {
        specialites.remove(specialite);
    }

    public boolean hasSpecialite(SpecialiteCoach specialite) {
        return specialites.contains(specialite);
    }

    public void setNumeroSalarie(int i) {
        this.numeroSalarie = i;
    }

    public int getNumeroSalarie() {
        return numeroSalarie;
    }

    @Override
    public String toString() {
        return getId() + ": " + getFullName() + " | " + getEmail() + " | " + getSpecialites();
    }
}
