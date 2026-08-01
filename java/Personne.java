public abstract class Personne {
    private int id;
    private String name;
    private String surname;
    private String email;

    public Personne(int id, String name, String surname, String email){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String getFullName(){
        return name + " " + surname;
    }

    public String getEmail(){
        return email;
    }

    public int getId(){
        return id;
    }

    public void showPersonne(Personne p){
        System.out.println(p);
    }

    @Override
    public String toString(){
        return id + "| Full name: " + getFullName() + " | Email: " + getEmail();
    }



}


