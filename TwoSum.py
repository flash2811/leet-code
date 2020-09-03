class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for n in range(len(nums)):
            if nums[n] + nums[n+1] == target:
                return [n, n+1]
        
