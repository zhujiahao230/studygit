/**
 * Create Date:2019年6月27日
 */
package com.zhujiahao.cms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:朱家豪
 * <br>Date:2019年6月27日
 */
public class StreamUtil {
   
  public static void sd(){
    OutputStream out  = null;
    try {
       out = new FileOutputStream("");
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    } finally {
       try {
          if (out != null) {
             out.close(); //关闭
          }
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
    
  }
  public static void main(String[] args) throws IOException {
    
    File src = new File("D://1.txt");
    fds(src);
  }
  
  public static String fds(File src) throws IOException{
    

FileInputStream ins = new FileInputStream(src);
int i = ins.available();
byte[] msd = new byte[i];
ins.read(msd);
ins.close();

System.out.println(src.getAbsoluteFile()+"      "+src.getFreeSpace()+""
  + ""+src.getName());
     
    return "";

    
  }
  
   
   
}
