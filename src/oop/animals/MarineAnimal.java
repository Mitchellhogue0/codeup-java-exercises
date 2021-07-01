package oop.animals;

public class MarineAnimal {
    private boolean canSwim;
    private int length;
    private int fishCount;
    private boolean isSaltWater;
    private String name;


    public MarineAnimal(boolean canSwim, int length, int fishCount, boolean isSaltWater, String name) {
        this.canSwim = canSwim;
        this.length = length;
        this.fishCount = fishCount;
        this.isSaltWater = isSaltWater;
        this.name = name;
    }

    public MarineAnimal(String name){
        this.name = name;
    }


    public MarineAnimal(){}


    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getFishCount() {
        return fishCount;
    }

    public void setFishCount(int fishCount) {
        this.fishCount = fishCount;
    }

    public boolean isSaltWater() {
        return isSaltWater;
    }

    public void setSaltWater(boolean saltWater) {
        isSaltWater = saltWater;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
