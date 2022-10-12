public class InitializeArray {
    public int[] arr ;
    public int len=10;
    public InitializeArray(int[] arr,int len){
        this.arr=arr;
        this.len=len;
    }

    public void printEvenIndexs(){
        for(int i=0;i<len;i++){
            if(i%2==0){
                System.out.printf("%d ",arr[i]);
            }
        }
        System.out.println();
    }

    public void printEvenElements(){
        for(int i=0;i<len;i++){
            if(arr[i]%2==0){
                System.out.printf("%d ",arr[i]);
            }
        }
        System.out.println();
    }

    public void printElementsInRverseOrder(){
        for(int i=len-1;i>=0;i--){
            System.out.printf("%d ",arr[i]);
        }
        System.out.println();
    }
    public void printFirstAndLast(){
        System.out.printf("%d %d",arr[0],arr[len-1]);
    }
}
