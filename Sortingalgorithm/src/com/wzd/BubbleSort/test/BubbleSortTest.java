/**  
* @Title: BubbleSortTest.java  
* @Package com.wzd.BubbleSort.test  
* @Description: 冒泡排序算法测试类 
* @author wangzedong  
* @date 2018年11月8日上午7:08:15  
* @version V1.0  
*/    
package com.wzd.BubbleSort.test;

import java.util.Arrays;

import org.junit.Test;

import com.wzd.BubbleSort.BubbleSort;

/**  
* @ClassName: BubbleSortTest  
* @Description: 冒泡排序算法测试类 
* @author wangzedong  
* @date 2018年11月8日上午7:08:15  
*    
*/
public class BubbleSortTest {
    /**
     * 
    * @Title: testBubbleSort  
    * @Description: 冒泡排序算法测试方法 
    * @param     参数  
    * @return void    返回类型  
    * @throws
     */
    @Test
    public void testBubbleSort() {
        BubbleSort bubbleSort = new BubbleSort(); 
        int[] arr = {8,15,63,45,12,54,13,8};
        System.out.println("排序前顺序：" + Arrays.toString(arr));
        bubbleSort.bubbleShort(arr);
        System.out.println("排序后顺序：" + Arrays.toString(arr));
    } 
}
