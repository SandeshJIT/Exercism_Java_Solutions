public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int n){
        return 40-n;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int n){
        return 2*n;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int n,int m){
        return n*2+m;
    }
}
