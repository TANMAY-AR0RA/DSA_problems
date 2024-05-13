import java.util.HashSet;

public class LCcontainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for(int num: nums){
         if(set.contains(num))
             return true;   
         set.add(num); 
        }    
 return false;
 }

 public static void main(String[] args) {
    int[] nums = {1,2,3,4,1};
    LCcontainsDuplicate obj =  new LCcontainsDuplicate();
    boolean b = obj.containsDuplicate(nums);
    System.out.println(b);
}
}
