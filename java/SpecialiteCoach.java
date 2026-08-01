enum SpecialiteCoach{

    FORCE(false),
    PERTE_POIDS(false),
    YOGA(true);


    private boolean coursCollectif;


    private SpecialiteCoach(boolean coursCollectif){
        this.coursCollectif = coursCollectif;
    }

    public boolean isCoursCollectif(){
        return coursCollectif;
    }




}
