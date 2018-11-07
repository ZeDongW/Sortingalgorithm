/**  
* @Title: SelectSort.java  
* @Package com.wzd.SelectSort  
* @Description: 选择排序算法
* @author wangzedong  
* @date 2018年11月8日上午7:37:00  
* @version V1.0  
*/    
package com.wzd.SelectSort;  
  
/**  
* @ClassName: SelectSort  
* @Description: 选择排序算法  
* @author wangzedong  
* @date 2018年11月8日上午7:37:00  
*    
*/
public class SelectSort {
    /**
     * 
    * @Title: selectSort  
    * @Description: 选择排序
    * @param @param arr    参数  
    * @return void    返回类型  
    * @throws
     */
    public void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
