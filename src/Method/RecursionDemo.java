package Method;

public class RecursionDemo {

    public static void main(String[] args) {
        System.out.println("Hello world");
        //数列，其通向公式为： F(0)=0,F(1)=1,Fn=F(n-1)+F(n-2) (n>=3,n属于N*),求F(5)的值
       int b= RecursionDemo.Fn(6);
        System.out.println(b);
    }


    public static int Fn(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;

        }
        else {
            return Fn(n-1)+Fn(n-2);
        }

    }
}



