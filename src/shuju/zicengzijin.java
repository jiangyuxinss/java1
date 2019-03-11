package shuju;

public class zicengzijin {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;
        System.out.println(b);//输出为5 如果是++a则输出为6
        //如a++是先把a的值赋给前面接收的人，再自己加1
        //++a是先自己加1，然后把自己的值赋给前面接收的人
    }

}
