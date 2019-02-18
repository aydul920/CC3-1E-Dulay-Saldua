package rpg;

    public class Character {
        public String name;
        public int strength;
        public int dexterity;
        public int intelligence;
        public int currentLife;
        public int maxLife;
        public int damage;


    static Dice dice = new Dice();

    public Character(String n, int s, int d, int i) {
     this.name=n;
     this.strength=s;
     this.dexterity=d;
     this.intelligence=i;
     this.maxLife=dice.roll()+20;
     this.currentLife=maxLife;
    }

    public int attack() {
         int attack = dice.roll()+strength;
         this.damage =attack;
         return attack;
    }
    /**
    * Decreases currentlife by the damage parameter
         * @param damage
    */
    public void wound(int damage) {
        damage  = dice.roll();
        currentLife -= damage;

    }
    /**
    * Increases currentlife by the heal parameter.
    * currentlife cannot be greater than maxlife
         * @param heal
    */
    public void heal(int heal) {
         if(currentLife>maxLife)
             currentLife=currentLife+heal;
    }
    /**
    * Returns name
         * @return 
    */
    public String getName() {
        return name;
    }
    /**
    * Returns strength
         * @return 
    */
    public int getStrength() {
        return strength;
    }
    /**
    * Returns dexterity
         * @return 
    */
    public int getDexterity() {
        return dexterity;
    }
    /**
    * Returns intelligence
         * @return 
    */
    public int getIntelligence() {
        return intelligence;
    }
    /**
    * Returns currentlife
         * @return 
    */
    public int getCurrentLife() {
        return currentLife;
    }
    /**
    * Returns maxlife
         * @return 
    */
    public int getMaxLife() {
        return maxLife;
    }
    public void setName(String name){
            this.name=name;
    }
    public void setStrength(int strength){
            this.strength=strength;
    }
    public void setDexterity(int dexterity){
            this.dexterity=dexterity;
    }
    public void setIntelligence(int intelligence){
            this.intelligence=intelligence;
    }
    public void setMaxLife(int maxLife){
            this.maxLife=maxLife;
    }
    public void setCurrentLife(int currentLife){
        this.currentLife=currentLife;
    }
    public int decreaseCurrentLife(int attack){
        return attack;
    }
    } 