/*
 * @lc app=leetcode.cn id=1 lang=c
 *
 * [1] 两数之和
 */


/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize){

    Map<int, int> *map = Map();
    for (int i = 0; i < numsSize; i++)
    {
        int temp = nums[i];
        if (map[target - temp])
        {
            returnSize = [map[target - temp], i];
        }else {
            map[nums[i]] = i;
        }   
        
        /* code */
    }
    return returnSize;

}



