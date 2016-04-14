
package test;
import java.util.HashSet;
public class ContainsDuplicate {
//	public void main(){
	public static void main(String[] args){
		int[] nums = {4,5,6,7};
		boolean flag = containsDuplicate(nums);
		System.out.println(flag);
	}
	public static boolean containsDuplicate(int[] nums) {
	    if(nums==null || nums.length==0)
	        return false;
	 
	    HashSet<Integer> set = new HashSet<Integer>();
	    for(int i: nums){
	        if(!set.add(i)){
	            return true;
	        }
	    }	 
	    return false;
	}
}
