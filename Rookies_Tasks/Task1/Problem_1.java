public class Problem_1 {
    public static void main(String[] args) {
        int[] arr={10,15,200,60,4};
        int []temp=new int[arr.length];
        for(int i=0;i< arr.length;i++) {
            if (i == arr.length - 1) {
                temp[i] = -1;
                break;
            } else {
                int MaxNum = arr[i+1];
                for (int j = i + 2; j < arr.length; j++) {
                    if (arr[j] > MaxNum) {
                        MaxNum = arr[j];
                    }
                }
                temp[i] = MaxNum;

            }
        }
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }
}