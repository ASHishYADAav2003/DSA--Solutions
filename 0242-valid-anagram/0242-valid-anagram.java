class Solution {
    public boolean isAnagram(String s, String t) {
        // to lower case  
        s=s.toLowerCase();
        t=t.toLowerCase();
        // remove whitespaces
        s=s.replace(" " ,"");
        t=t.replace(" " ,"");

         // initialize bucket array
        int[] count =new int[26];
        // fill bucket array with +1
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        } 
        //fill bucket array with  -1
        for(int i=0; i<t.length();i++){
            count[t.charAt(i) -'a']--;
        }
         // it checkall +1 is cancelled by -1 and count =0 then its true anagram;
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                return false;

            }
        }

        return true;
    }
}

//BY THE USE OF PRE-BUILT STRING METHODS--SORT() METHOD ::::

// import java.util.Arrays;

// class Solution {
//     public boolean isAnagram(String s, String t) {

//         if (s.length() != t.length()) {
//             return false;
//         }

//         char[] arr1 = s.toCharArray();
//         char[] arr2 = t.toCharArray();

//         Arrays.sort(arr1);
//         Arrays.sort(arr2);

//         return Arrays.equals(arr1, arr2);
//     }
// }







