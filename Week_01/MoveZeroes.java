import java.util.Arrays;

/**
 * 移动零 https://leetcode-cn.com/problems/move-zeroes/
 *
 * @author wangyongtao
 * @date 2020/5/19
 */
public class MoveZeroes {

  public static void main(String[] args) {
    int[] arr = new int[] {0, 1, 0, 3, 12};
    System.out.println(Arrays.toString(arr));
    new MoveZeroes().moveZeroes(arr);
    System.out.println(Arrays.toString(arr));
  }

  public void moveZeroes(int[] nums) {
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[j] = nums[i];
        j++;
      }
    }
    for (; j < nums.length; j++) {
      nums[j] = 0;
    }
  }
}
// 两次遍历
// 0. 非0数字转移到数组最前边;
// 1. 剩余的index将值设置为0;
