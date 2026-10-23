public class binarysearch {
	public static void main(String[] args) {
		System.out.println("Java is running!");
        int[] numbers ={1,2,4,5,7,9,11,12,14,15,20,25,30};
    System.out.println(BinarySearch(numbers,20));
	}
    
    

public static int BinarySearch(int[] numbers,int target){
    int low=0;
    int high=numbers.length-1;

    while(low<=high){
        int posistion = (low+high)/2;
        int midelnumber=numbers[posistion];
        
        if(midelnumber==target){
            return posistion;
        }
        if(target<midelnumber){
            high=posistion-1;
        }
        else{
            low=posistion+1;
        }
    }
    return -1;
}
}
