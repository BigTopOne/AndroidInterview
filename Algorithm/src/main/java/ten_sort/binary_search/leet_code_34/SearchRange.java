package ten_sort.binary_search.leet_code_34;

/**
 * @author :  dev
 * @version :
 * @Date :  2021/5/31 21:39
 * @Url :  https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * @Level :  medium
 * @Desc : leetcode 34. 在排序数组中查找元素的第一个和最后一个位置
 * @Counter : 10
 * @Answer :
 * 伟伟：https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/solution/si-lu-hen-jian-dan-xi-jie-fei-mo-gui-de-er-fen-cha/
 */
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return new int[]{-1, -1};
        }
        int firstPosition = findFirstPosition(nums, target);
        if (firstPosition == -1) {
            return new int[]{-1, -1};
        }
        int lastPosition = finLastPosition(nums, target);
        return new int[]{firstPosition, lastPosition};

    }

    private int findFirstPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = getMid(left, right);
            int currentValue = nums[mid];
            if (currentValue < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
            if (nums[left] == target) {
                return left;
            }
        }
        return -1;
    }

    private int finLastPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid =  left +((right-left+1)>>1);
            int currentValue = nums[mid];
            if (currentValue > target) {
                // 下一轮搜索区域 是[left...mid - 1];
                right = mid - 1;
            } else {
                // 下一轮搜索区间是[mid .. right];
                left = mid;
            }
        }
        return left;
    }

    private int getMid(int left, int right) {
        return left + ((right - left) >> 1);
    }
}
