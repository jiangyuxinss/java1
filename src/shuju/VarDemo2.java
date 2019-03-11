package shuju;

import java.lang.reflect.Field;

public class VarDemo2 {

      static int age ;  //现在定义成员变量，都使用static修饰

    public static void main(String[] args) {
        /*1.成员变量/字段(Field):直接定义在类的{}中的变量(方法外)*/

       /* 2. 局部变量：定义在方法中的变量
                变量除了成员变量就是局部变量*/

        int  num1 =18;  //使用局部变量 先声明，再初始化，最后使用  可以重复使用
        num1=49;
        System.out.println(num1);//18 就近原则
      /*  1.成员变量：在所定义的类中起作用
         2.局部变量：从定义的哪一个地方开始，到紧跟着结束的)之间*/


    }


}
