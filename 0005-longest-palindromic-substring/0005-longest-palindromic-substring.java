class Solution {
    public String longestPalindrome(String s) {

        if(s.length()<=1){
            return s;
        }

        String LPS = "" ;
        for(int i=1 ;i<s.length();i++){
            //for odd length string:
            int low=i;
            int high = i;

           //keep extending in both direction left and right
            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;
                //terminating condition when we reach at start or end of the string
                if(low==-1||high ==s.length()){
                    break;
                }
            }    
                String palindrome = s.substring(low+1 ,high);
                if(palindrome.length()>LPS.length()){
                    //capture longest palindrome substring
                    LPS =palindrome;
                }

            // for even length string:
            low=i-1; 
            high = i;
            //keep extending in both direction left and right
            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;
                //terminating condition when we reach at start or end of the string
                if(low==-1 || high ==s.length()){
                    break;
                }
            }
            palindrome =s.substring(low+1,high);
            if (palindrome.length()>LPS.length()){
                 //capture longest palindrome substring
                LPS = palindrome;
            }   

        }
        return LPS;
        
    }
}