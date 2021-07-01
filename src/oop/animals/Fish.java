package oop.animals;

public class Fish extends MarineAnimal {


    private boolean hasScales;


    public Fish(boolean canSwim, int length, int fishCount, boolean isSaltWater, String name, boolean hasScales) {
        super(canSwim,length,fishCount,isSaltWater,name);
        this.hasScales = hasScales;
    }

    public boolean isHasScales() {
        return hasScales;
    }

    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }
}
