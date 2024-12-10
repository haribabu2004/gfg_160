public class Move_zero {
    public static void main(String[] args) {
        int[] arr={2,4,5,0,2,0,1,0};
        
        int ptr=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[ptr]=arr[i];
                ptr++;
            }
        }

        for(int i=ptr;i<arr.length;i++){
            arr[i]=0;
        }

        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
