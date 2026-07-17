class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){ //first they have to be the same length
            return false;
        }
        
        char[]s_arr=s.toCharArray();
        char[]t_arr=t.toCharArray();

        Arrays.sort(s_arr);
        Arrays.sort(t_arr);

        if(Arrays.equals(s_arr,t_arr)){
            return true;
        }

        return false;

            
    }
}
