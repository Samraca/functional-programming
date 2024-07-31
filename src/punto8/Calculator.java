package punto8;

public final class Calculator {
    private double accumulate;

    public Calculator() {
        accumulate = 0;
    }

    public double getAccumulate() {
        return accumulate;
    }

    public Calculator add(double a){
        System.out.println("Adding "+a+" to "+ accumulate);
        accumulate += a;
        System.out.println("New accumulated: "+ accumulate);
        return this;
    }

    public Calculator subtract(double a) {
        System.out.println("Subtracting "+a+" from "+ accumulate);
        accumulate -= a;
        System.out.println("New accumulated: "+ accumulate);
        return this;
    }

    public Calculator times(double a) {
        System.out.println("Multiplying "+accumulate+" by "+ a);
        accumulate *= a;
        System.out.println("New accumulated: "+ accumulate);
        return this;
    }
}
