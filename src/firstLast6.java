public boolean firstLast6(int[] nums) {
    if (nums[0] == 6 || nums[nums.length-1] ==6) {
        return true;
    } else {
        return false;
    }
}

//again just pretty elementary logic problem
//i guess it is not nums.size() for arrays have to look up how to get that
//it was nums.length i was pretty close