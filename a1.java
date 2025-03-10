import java.util.HashMap;

public class a1 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {

            //第一个存储值，第二个存储数组位置
            HashMap<Integer,Integer> map= new HashMap<>();

            int[] k=new int[2];
            for(int i=0;i< nums.length;i++)
            {
                //寻找已经输入哈希表的有没有与差值相同的键值
                if(map.containsKey(target-nums[i]))
                {
                    //如果有的话将其数组位置存入结果数组
                    k[0]=map.get(target-nums[i]);
                    k[1]=i;
                }
                map.put(nums[i],i);
            }
            return k;
        }
    }
}
