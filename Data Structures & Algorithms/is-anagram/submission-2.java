class Solution {

    public boolean isAnagram(String s, String t) {

        //index number = (hashcode) % array.length

        //solution: sort the array alphabetically, count the number of exact characters, compare

        //first case: same length

        if(s.length()!=t.length()){
            return false;
        }
        
        char[]s_array = s.toCharArray(); //turns the string into character
        char[]t_array = t.toCharArray();
        Arrays.sort(s_array); //sorts in accending values
        Arrays.sort(t_array);

        if(Arrays.equals(s_array, t_array)){
            return true;
        }

        return false;


        
        
    }
}
