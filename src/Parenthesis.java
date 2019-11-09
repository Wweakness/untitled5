//如数一组字符串，看是否符合一下两个条件：
//1、字符只有（和）   2、看（和）是否匹配
//如：输入：（（1））  返回false   输入：（（（）） 返回false   输入：（（））  返回true
import java.util.Stack;

import java.util.*;

public class Parenthesis {
    public static boolean chkParenthesis(String A, int n) {
        // write code here
        Stack stack=new Stack();
        char[] b=A.toCharArray();
        for(int i=0;i<n;i++){
            if(b[i]=='('){

                stack.push(b[i]);
            }
            if(b[i]==')'){
                if (!stack.isEmpty()){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            if(b[n-1]=='('){
                return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }else {
            return true;
        }


    }

    public static void main(String[] args) {
        String A="(()))";
        int n=5;
        System.out.println(chkParenthesis(A,n));
    }
}