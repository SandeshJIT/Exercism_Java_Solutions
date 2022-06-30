
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        if(this.birdsPerDay.length!=0)
            return this.birdsPerDay[this.birdsPerDay.length-1];
        return 0;
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int i:this.birdsPerDay){
            if(i==0)
                return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count=0;
        if(numberOfDays>7){
            numberOfDays = 7;
        }
        for(int i=0;i<numberOfDays;i++){
                count += this.birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int count = 0;
        for(int i:this.birdsPerDay){
            if(i>=5){
                count++;
            }
        }
        return count;
    }
}
