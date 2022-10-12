public class DifferenceWithAndWithoutSmallest {
    public static void main(String[] args) {
        int[] numbers= {12,11,15,37,65,80,22,98,30,15};
        int smallest,sum=0,diff,size;
        size=numbers.length;
        smallest=numbers[0];
        for(int i=1;i<size;i++){
            if(numbers[i]<smallest){
                sum=sum+smallest;
                smallest=numbers[i];
            }
            else sum=sum+numbers[i];
        }
        diff=sum-smallest;
        System.out.println("Difference of Sum and the smallest number = "+diff);
    }
}
