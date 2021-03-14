/** 
 * Given a list L of n elements with values or records L(0) ... L(n-1), and target value T, 
 * the following subroutine uses linear search to find the index of the target T in L.
*/

class searching {

	public static void main (String[] args) throws java.lang.Exception {
        int arr[] = { 10, 20, 30, 50, 70, 90 };
        int target = 40;

        int index_found = linear(arr, target);
        if(index_found != -1){
            System.out.println(target + " is found at index: " + index_found);
        } else {
            System.out.println("Value Not Exist.\n");
        }
	}

    /** Linear Search Method */
    public static int linear(int[] arr, int target ) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
