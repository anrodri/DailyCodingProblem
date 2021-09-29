import java.util.ArrayList;

public class Solution {

    public boolean checkSums(int inputArray[], int sum) {
        //Create a temporary list to store the difference
        ArrayList<Integer> partial_Sum = new ArrayList<Integer>();
        for (int i = 0; i < inputArray.length; i++) {

            //Check if the Array element is present in the temporary array
            if(partial_Sum.contains(inputArray[i])){
                return true;
            }

            //else add the difference of the sum and array element in the temporary array list.
            else
                partial_Sum.add(sum - inputArray[i]);
        }

        return false;

    }

    public static void main(String args[]) {

        int[] input= {10, 15, 3, 7};
        int key = 17;

        Solution x = new Solution();

        System.out.println(x.checkSums(input, key));

    }
}