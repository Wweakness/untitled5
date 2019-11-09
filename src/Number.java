//读入一个字符串str，输出字符串str中的连续最长的数字串
//例如输入：ab123456cde123
//则输出是：123456
import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //while (in.hasNextInt()) {
            String A = in.next();
            char[] a=A.toCharArray();
            int max=0;
            String result=null;
            for(int i=0;i<A.length();i++){
                int count=0;
                if(Character.isDigit(a[i])){
                    for(int j=i+1;j<A.length();j++){
                        if(Character.isDigit(a[j])){
                            count++;
                            if(count>max){
                                max=count;
                                result=A.substring(i,j+1);
                            }
                        }else {
                            break;
                        }
                }
            }else{
                    continue;
                }
            }
            System.out.println(result);
        }
    }

