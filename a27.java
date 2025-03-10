class a27 {
    public static int b27(int[] nums,int val)
    {
        int k=0;
        int length=nums.length;
        for(int i=0;i<length;i++)
        {
            if(nums[i]!=val)
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return length-k;
    }

    public static void main(String[] args) {
        int[] nums= {0,1,2,2,3,0,4,2};
        int val=2;
        int m=b27(nums,val);
        System.out.println(m);
    }
}
