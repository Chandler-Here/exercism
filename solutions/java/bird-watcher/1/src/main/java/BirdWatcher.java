
class BirdWatcher {
    private final int[] birdsPerDay;
    private static final int[] LAST_WEEK = { 0, 2, 5, 3, 7, 8, 4 };

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return LAST_WEEK;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
        
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean result = false;
        for(int birds:birdsPerDay){
            if(birds==0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count=0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        for(int i=0;i<limit;i++){
            count+=birdsPerDay[i];            
        }
        return count;
    }

    public int getBusyDays() {
        int busyDays=0;
        for(int birds:birdsPerDay){
            if(birds>=5){
                busyDays++;
            }
        }
        return busyDays;
    }
}
