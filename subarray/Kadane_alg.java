package subarray;

public class Kadane_alg {
    public static void main(String[] args) {
        int[] arr= {-1,2,-2,5,-9,9,2,3,-1};

        int left=0,right=0,cursum=0,maxsum=Integer.MIN_VALUE;
        int templeft=0;

        for(int i=0;i<arr.length;i++){
            cursum+=arr[i];
            if(cursum>maxsum){
                maxsum=cursum;
                left=templeft;
                right=i;
            }
            if(cursum<0){
                cursum=0;
                templeft=i+1;
            }
        }
        // System.out.println();
        System.out.println(maxsum);
        for (int i = left; i <= right; i++) {
            System.out.print(arr[i] + " ");
        }
        // System.out.println();
    }
}
