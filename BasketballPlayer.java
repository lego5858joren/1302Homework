package prob1;

public class BasketballPlayer {

    private int freeThrowsAttempted;

    private int freeThrowsMade;

    private String name;

    private int threePointersAttempted;

    private int threePointersMade;

    private int twoPointersAttempted;

    private int twoPointersMade;

    private int totalPoints;

    BasketballPlayer(String name){
        this.name=name;
    }

    public double getFreeThrowPercent(){
        double percent;
        return ((double)freeThrowsMade/freeThrowsAttempted) *100;
    }

    public int getFreeThrowsAttempted(){
        return freeThrowsAttempted;
    }

    public int getFreeThrowsMade(){
        return freeThrowsMade;
    }

    public String getName(){
        return name;
    }

    public double getThreePointerPercent(){
        return ((double) threePointersMade / threePointersAttempted) *100;
    }

    public int getThreePointersAttempted(){
        return threePointersAttempted;
    }

    public int getThreePointersMade(){
        return threePointersMade;
    }

    public int getTotalPoints(){
        return totalPoints;
    }

    public double getTwoPointerPercent(){
        return((double) twoPointersMade/twoPointersAttempted) * 100;
    }

    public int getTwoPointersMade(){
        return twoPointersMade;
    }

    public int getTwoPointersAttempted(){
        return twoPointersAttempted;
    }

    public void shootFreeThrow(boolean isMade){
        if(isMade){
            freeThrowsAttempted++;
            freeThrowsMade++;
            totalPoints += 1;
        }
        else{
            freeThrowsAttempted++;
        }
    }

    public void shootTwoPointer(boolean isMade){
        if(isMade){
            twoPointersAttempted++;
            twoPointersMade++;
            totalPoints += 2;
        }
        else{
            twoPointersAttempted++;
        }
    }

    public void shootThreePointer(boolean isMade){
        if(isMade){
            threePointersAttempted++;
            threePointersMade++;
            totalPoints += 3;
        }
        else{
            threePointersAttempted++;
        }
    }

    @Override
    public String toString(){
        return name;
    }



    public static void main(String[] args){

    }
}
