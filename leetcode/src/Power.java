/**
 * Created by majun on 2016/6/30.
 */
public class Power {
    public double Power(double base, int exponent) {
        return Math.pow(base, exponent);
    }
    public double Power1(double base, int exponent) {
        double  result=1;
        for(int i=0;i<Math.abs(exponent);i++){
            result*=base;
        }
        if(exponent<0){
            result=1/result;
        }
        return result;
    }
}
