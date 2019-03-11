package kongzhiyuju;

public class ScoreLeveDemo {
    public static void main(String[] args) {
        int score=99;
        if(score>=90){
            System.out.println("你好，师姐");
        }
        else if(score>=80){
            System.out.println("*************");
        }
        else if(score>=70){
            System.out.println("////////");
        }
        else {
            System.out.println("菜鸡");
        }
    }
}
