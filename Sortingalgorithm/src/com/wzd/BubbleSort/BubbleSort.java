/**  
* @Title: BubbleSort.java  
* @Package com.wzd.BubbleSort  
* @Description: 冒泡排序算法 
* @author wangzedong  
* @date 2018年11月8日上午7:00:27  
* @version V1.0  
*/    
package com.wzd.BubbleSort;  
  
/**  
* @ClassName: BubbleSort  
* @Description: 冒泡排序算法
* @author wangzedong  
* @date 2018年11月8日上午7:00:27  
*    
*/
public class BubbleSort {
    
    /**
     * 
    * @Title: bubbleShort  
    * @Description: 冒泡排序算法 
    * @param @param arr    参数  
    * @return void    返回类型  
    * @throws
     */
    public void bubbleShort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
