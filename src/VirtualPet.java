public class VirtualPet {

    private String name;
    private int hunger, thirst, boredom, tick;

    public VirtualPet() {
       
        this.hunger = 80;
        this.thirst = 80;
        this.boredom = 80;
    }

    public VirtualPet(String nextLine) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public int getTick() {
        return tick;
    }

    public void setTick(int tick) {
        this.tick = tick;
    }

    // give pet drink unless at 100 (wont go over 100)
    public void giveDrink(int thirst) {
        this.thirst = (thirst + 40) >= 100 ? 100: (thirst + 40); 
        tick();
    }

    // play with pet
    public void play(int boredom) {
        this.boredom = boredom + 40 >= 100 ? 100: (boredom + 40); 
        tick();
    }

    // give pet food
    public void feed(int hunger) {
        this.hunger = hunger + 40 >= 100 ? 100: (hunger + 40); 
        tick();
    }

    // reduce pets non chosen stats every turn
    public void tick() {
        boredom -= 20;
        thirst -= 20;
        hunger -= 20;
    }

}
