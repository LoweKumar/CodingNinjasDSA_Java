public class checkSorted {

    public static boolean check_sorted(int input[]){

        if(input.length <= 1){
            return true;
        }
        int smallInput[] = new int[input.length-1];
        for(int i=1;i<input.length;i++){
            smallInput[i-1] = input[i];
        }
        boolean smallans = check_sorted(smallInput);
        if(!smallans){
            return false;
        }
        if(input[0]<=input[1]){
            return true;
        }
        else{
            return false;
        }

    }
    public static boolean check_sortedMethod2(int input[]){

        if(input.length <= 1){
            return true;
        }
        if(input[0]<input[1]){
            return false;
        }
        int smallInput[] = new int[input.length-1];
        for(int i=1;i<input.length;i++){
            smallInput[i-1] = input[i];
        }
        boolean smallans = check_sortedMethod2(smallInput);
        return smallans;

    }

    public static void main(String[] args){
        int input[] = {2,1,3,4,5};
        System.out.println(check_sortedMethod2(input));
    }
}
