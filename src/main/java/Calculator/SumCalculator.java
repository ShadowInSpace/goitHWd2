package Calculator;

public class SumCalculator {

    public int sum(int n){
        int result=0;
        if(n==0) throw new IllegalArgumentException();

        for (int i = 0; i <= n; i++) {
            result+=i;
        }
        return result;
    }
}
