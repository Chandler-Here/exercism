public class Lasagna {

    public final int EXPECTED_MIN_IN_OVEN = 40;
    public final int TIME_FOR_EACH_LAYER = 2;

    public int expectedMinutesInOven(){
        return EXPECTED_MIN_IN_OVEN;
    }


    public int remainingMinutesInOven(int x){
        return expectedMinutesInOven()-x;
    }


    public int preparationTimeInMinutes(int x){
        return x*TIME_FOR_EACH_LAYER;
    }

    public int totalTimeInMinutes(int x, int y){
        return preparationTimeInMinutes(x)+y;
        
    }
}
