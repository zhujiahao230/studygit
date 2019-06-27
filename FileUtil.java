/**
 * Create Date:2019年6月27日
 */
package com.zhujiahao.cms;

import java.io.File;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:朱家豪
 * <br>Date:2019年6月27日
 */
public class FileUtil {
   public static void main(String[] args) {
      String file = "aaa.jpg";
     
      System.out.println(file);  
      //给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(10分)
     
      System.out.println("main调用getExtendName方法："+getExtendName(file));
  }
   
   public static String getExtendName(String fileName){
     
     int  i = fileName.indexOf(".");
     
     String String = fileName.substring(i);
     
     
     return String;
   
   }

}
