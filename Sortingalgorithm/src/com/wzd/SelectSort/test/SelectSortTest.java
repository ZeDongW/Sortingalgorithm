/**  
* @Title: SelectSortTest.java  
* @Package com.wzd.SelectSort.test  
* @Description: 选择排序测试类  
* @author wangzedong  
* @date 2018年11月8日上午7:40:28  
* @version V1.0  
*/    
package com.wzd.SelectSort.test;

import java.util.Arrays;

import javax.swing.plaf.SliderUI;

import org.junit.Test;

import com.wzd.SelectSort.SelectSort;

/**  
* @ClassName: SelectSortTest  
* @Description: 选择排序测试类
* @author wangzedong  
* @date 2018年11月8日上午7:40:28  
*    
*/
public class SelectSortTest {
    
    @Test
    public void testSelectSort() {
        int[] arr = {8,15,63,45,12,54,13,8};
        SelectSort selectSort = new SelectSort();
        System.out.println("排序前顺序：" + Arrays.toString(arr));
        selectSort.selectSort(arr);
        System.out.println("排序后顺序：" + Arrays.toString(arr));
    }
}
