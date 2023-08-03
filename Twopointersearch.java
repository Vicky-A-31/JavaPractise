public class Twopointersearch {
    public static void main(String[] args) {
        int[] a = {12,43,54,67,85,99,97,32,15,76,41,70,84,69,36,10,26};
        int start = 0;
        int end = a.length-1;
        int num = 99;
        int index = -1;
        while(start<end){
            if(num == a[start]){
                index = start;
            }
            if(num == a[end]){
                index = end;
            }
            start++;
            end--;
        }
        System.out.println(index);
    }
}
