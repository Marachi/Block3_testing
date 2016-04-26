package com.company;
/**
 * Created by Kate on 26.04.2016.
 */
public class SquareEquation {

    double coefficientA;
    double coefficientB;
    double coefficientC;
//asdasd

    public SquareEquation(double coefficientA, double coefficientB, double coefficientC) {
        this.coefficientA = coefficientA;
        this.coefficientB = coefficientB;
        this.coefficientC = coefficientC;
    }
    public SquareEquation(){
        System.out.println("SDASD");
    }
   public double[] solve(){
       if(coefficientA==0.0) {
           throw new IllegalArgumentException("a==0");
       }
       double d = coefficientB*coefficientB -4*coefficientA*coefficientC;
            if (d<0){
                return new double[0];
            }else if (d==0){
                return  new double[]{-coefficientB/(2*coefficientA)};
            }else {
                double x1 = (-coefficientB -Math.sqrt(d)/(2*coefficientA));
                double x2 = (-coefficientB +Math.sqrt(d)/(2*coefficientA));
            }
       return null;
   }

    public SquareEquation setCoefficientA(double coefficientA) {
        this.coefficientA = coefficientA;
        return  this;

    }
    public SquareEquation setCoefficientB(double coefficientB) {
        this.coefficientB = coefficientB;
        return  this;

    }
    public SquareEquation setCoefficientC(double coefficientC) {
        this.coefficientC = coefficientC;
        return  this;
    }
}
