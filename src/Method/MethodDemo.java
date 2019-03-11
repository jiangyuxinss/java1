package Method;

public class MethodDemo {
    //无参数无返回
    //需求：定义一个方法，专门打印
    public static void p() {
        System.out.println("*************************");
    }

    //有参数无返回
    //需求： 打印任意值
    public static void pValue(String val) {
        System.out.println(val);
    }

    //无参数有返回
    public static int u() {
        return 17;
    }
    //有参数有返回
    public static int j( int d,int b){
        return d+b;
    }

    public static void main(String[] args) {
        MethodDemo.p();
        System.out.println("hello world");
        MethodDemo.pValue("helllo");
       int a= MethodDemo.u();
        System.out.println(a);



        int sum=MethodDemo.j(3,4);
        System.out.println(sum);


         sum=MethodDemo.j(1,2);
        System.out.println(sum);
    }
}
