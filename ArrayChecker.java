public class ArrayChecker {
    int[] myArray;
    boolean isSymmetrical(int[] myArray){
        //check if first and last element are symmetrical
        int i = 0;
        while (i < (myArray.length - 1)){
            if (myArray[i] == myArray[myArray.length - i - 1]){
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
    public void reverse(int[] myArray){
        int i = 0;
        int [] reversedArray;
        reversedArray = new int[myArray.length];
        System.out.print("Reversed array: ");
        while (i < (myArray.length)){
            reversedArray[i] = myArray[(myArray.length - 1 - i)];
            System.out.print(reversedArray[i]);
            i++;
        }
        
    }

    public static void main(String[] args){
        {
            int[] myArray = {5, 4, 3, 3, 4, 8};
            ArrayChecker thisArray = new ArrayChecker();
            if (thisArray.isSymmetrical(myArray) == true) {
                System.out.println("The array is symmetrical.");
            } else {
                System.out.println("The array is not symmetrical.");
            }
            thisArray.reverse(myArray);
        }
    }
}
