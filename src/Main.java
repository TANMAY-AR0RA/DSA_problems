//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,1};
        LCcontainsDuplicate obj =  new LCcontainsDuplicate();
        boolean b = obj.containsDuplicate(nums);
        System.out.println(b);
    }
    
}