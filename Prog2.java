package CS390Assignment3;

public class Prog2 {

    public static char minCharacter(String str,int index){
        //assigning the min to the largest ASCII character which is ~ = 126
       char min = '~';
        if(index < str.length()) {
            if(str.charAt(index) < min){
                min = str.charAt(index);
            }
            char nextMin = minCharacter(str,index + 1);
            if(nextMin < min){
                min = nextMin;
            }
        };
        return min;
    }

    public static void main(String[] args){

   System.out.println(minCharacter("akel",0));

    }
}
