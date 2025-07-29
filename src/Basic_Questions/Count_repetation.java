package Basic_Questions;

public class Count_repetation {
    public static void main(String[] args){

        int[] digitcount=new int[10];
        int count4 =0;
        int count3=0;
        int count5=0;
        int n=123453637;
        int result=0;
        int target1=4;
        int target2=3;
        int target3=5;


        while(n!=0) {
            int digit = n % 10;
//            if(digit==target1){
//                count4++;
//            } else if (digit==target2) {
//                count3++;
//            } else if (digit==target3) {
//                count5 ++;
        //    }
            digitcount[digit]++;
            n=n/10;
        }

//        System.out.println("count1:"+ count4+" count2:"+count3+" Count5:"+count5);
        System.out.println("Count of 3: " + digitcount[3]);
        System.out.println("Count of 4: " + digitcount[4]);
        System.out.println("Count of 5: " + digitcount[5]);
    }
}
