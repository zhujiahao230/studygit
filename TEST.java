/**
 * Create Date:2019年6月27日
 */
package rkday17;

import java.util.Date;

import com.zhujiahao.cms.DateUtil;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:朱家豪
 * <br>Date:2019年6月27日
 */
public class TEST {

  public static void main(String[] args) {
    
    
    Date src = new Date();
    
    
      
    Date date = DateUtil.getDateByInitMonth(src); //获取DateUtil工具类中的getDateByInitMonth()返回值
    
    
    //进行替换
    String sql =
      "select * from t_order where create_time>='"+date+"' and create_time<='"+date+"' ";
    
    System.out.println(sql);//打印正确的sql
    
  }
  
}
