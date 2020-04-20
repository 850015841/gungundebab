package one;

/**
 * 测试类
 */
public class StackOfTest {
    public static void main(String []args){
        Stack stack=new Stack(15);
        int []A=new int [15];
        for(int i=0;i<A.length;i++)
        {
            A[i]=i;
        }
        for(int j=0;j<A.length;j++)
        {
            stack.push(A[j]);
        }
        while(!stack.empty())
        {
            System.out.print(stack.pop()+" ");
        }
    }
}
