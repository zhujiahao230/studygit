/**
 * Create Date:2019年6月27日
 */
package com.zhujiahao.cms;

import java.util.Date;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:朱家豪
 * <br>Date:2019年6月27日
 */
public class DateUtil {
  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date); //获取现在的时间
    Date date2 = new Date(0000-00-00);
    
    date2 = date;
    System.out.println(date2); // 时间赋值 
    
     date2.setHours(0); //时间更改
     date2.setDate(1);
     
     date2.setMinutes(0);
     date2.setSeconds(0);
     int n = date2.getYear();
      n = 2019;
     int n1 = date2.getMonth();
     int n2 = date2.getDate();
     int n3 = date2.getHours();
     int n4 = date2.getMinutes();
     int n5 = date2.getSeconds();
     System.out.println(n+"--"+"0"+n1+"--"+"0"+n2+"   "+"0"+n3+":"+"0"+n4+":"+"0"+n5);
     System.out.println(date2);//更改之后的时间
     System.out.println("获取src并在main里面调用打印结果"+getDateByInitMonth(date));
 }
 
  public static Date getDateByInitMonth(Date src){
   int n = src.getYear();
    n = 2019;
   int n1 = src.getMonth(); //判断月份
     if (n1==2) {
       if ((n/4)==1) { //判断年份是什么年份
         src.setDate(29);
         }else {
           src.setDate(28);
           
         }
     }
     
     
   int n2 = src.getDate();
    src.setHours(23);
    src.setMinutes(59);
    src.setSeconds(59);
   
   int n3 = src.getHours();
   int n4 = src.getMinutes();
   int n5 = src.getSeconds(); 
     
   System.out.println("src输出"+n+"--"+n1+"--"+n2+"   "+n3+":"+n4+":"+n5); //结果输出
    return src;
  
  }

   
  
}
