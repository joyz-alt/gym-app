    enum AbonnementType{ 
        BASIC(15, 12, true, false , false), 
        PREMIUM(20, 12, true, true , false), 
        EXTREME(25, 12, true, true , true);
    
    
        private int prix;
        private int duree;
        private boolean salleDeSport;
        private boolean piscine;
        private boolean coach;


        private AbonnementType(int prix, int duree, boolean salleDeSport, boolean piscine, boolean coach){
            this.prix = prix;
            this.duree = duree;
            this.salleDeSport = salleDeSport;
            this.piscine = piscine;
            this.coach = coach;
        }
        

        public int getPrix(){
            return prix;
        }

        public int getDuree(){
            return duree;
        }

        public boolean accesSalleDeSport(){
            return salleDeSport;
        }

        public boolean accesPiscine(){
            return piscine;
        }

        public boolean accesCoach(){
            return coach;
        }
        


    }

