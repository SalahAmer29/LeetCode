public class SlidingWindow {
    public static void main(String[] args){
         int[] numbers ={1,2,4,5,7,9,11,12,14,15,20,25,30};

         int sum=0;
         int k=5;
         for(int i=0;i<k;i++){
            sum+=numbers[i];
         }
         System.out.println(sum);

         for(int i=k;i<numbers.length;i++){
            //System.out.println(i);
            sum=sum- numbers[i-k] +numbers[i];
            System.out.println(sum);
         }
         
    }

}
