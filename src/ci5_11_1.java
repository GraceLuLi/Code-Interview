/*
 * given two sorted arrays, A and B, where A has a large enough buffer at the end to hold B.
 * Write a method to merge B into A in sorted order
 */
public class ci5_11_1 {
    public void mergeSortedArray(int[] arrA, int[] arrB, int sizeA, int sizeB){
    	int size = sizeA + sizeB;
    	int i = sizeA-1;
    	int j = sizeB-1;
    	int k = size -1;
    	while(i >= 0 && j >= 0){
    		if(arrA[i] > arrB[j]){
    			arrA[k--] = arrA[i--];
    		}
    		else{
    			arrA[k--] = arrB[j--];
    		}
    	}
    	while(j >= 0){
    		arrA[k--] = arrB[j--];
    	}
    }
}
