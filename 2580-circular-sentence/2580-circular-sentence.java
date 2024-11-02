class Solution {
    public boolean isCircularSentence(String s) { 
            char last = 0;
            char first  = s.charAt(0);
            boolean x = true;

        for(int i = 1;i<s.length()-1;i++){
            if(s.charAt(i) == ' '&&s.charAt(i-1)!= s.charAt(i+1)) {
                return false;
                    //   System.out.println(s.charAt(i));
            // last = s.charAt(i);}else{
            //     if(s.charAt(i) == ' ' && s.charAt(i+1) == last ){
            //         x = true;
            //         first = s.charAt(i+1);
            //     }
            }

        }
        // if(x == true){
        //     return true;
        // }

          return s.charAt(0) == s.charAt(s.length()-1);
        
        
    }
}