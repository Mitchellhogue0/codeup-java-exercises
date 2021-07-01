package oop.animals;

public class AquaMamm extends MarineAnimal{

    private int maxTimeSubmerged;


    public AquaMamm(boolean canSwim, int length, int fishCount, boolean isSaltWater, String name, int maxTimeSubmerged) {
        super(canSwim,length,fishCount,isSaltWater,name);
        this.maxTimeSubmerged = maxTimeSubmerged;
    }

    public AquaMamm(String name){
        super(name);
    }

    public AquaMamm(){}

    public int getMaxTimeSubmerged() {
        return maxTimeSubmerged;
    }

    public void setMaxTimeSubmerged(int maxTimeSubmerged) {
        this.maxTimeSubmerged = maxTimeSubmerged;
    }
}
