public class NaturalNumber {
    int n;
    int sum=0;
    int number;
    
    NaturalNumber(int n){
        number =n;
        if(n<=0){
             throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        for(int i=1;i<=(n/2);i++){
            if(n%i==0){
                sum+=i;
            }
        }
    }
    public Classification getClassification() {
        if(number==sum){
            return Classification.PERFECT;
        }
       if(number<sum){
            return Classification.ABUNDANT;
        }
        if(number>sum){
            return Classification.DEFICIENT;
        }
        return null;
    }
}
