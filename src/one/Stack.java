package one;

/**
 * 利用数组实现堆栈
 */
public class Stack {
    private int[]elements;
    private int elementSize;
    private final static int DEFAULT_CAPACITY=10;
    public Stack(int capacity)
    {
        elements=new int[capacity];
    }
    public Stack()
    {
        this(DEFAULT_CAPACITY);
    }
    public void push(int value)//进栈
    {
        if(elementSize>elements.length)
        {
            int []temp=new int[elements.length*2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements=temp;
        }
        elements[elementSize++]=value;
    }
    public int pop()//出栈，出栈前必须调用empty（）判断栈是否为空
    {
        return elements[--elementSize];
    }
    public boolean empty()//判断栈是否为空
    {
        return elementSize==0;
    }
    public int getSize()//获取栈中元素个数
    {
        return elementSize;
    }
    public int peek()//获取当前栈顶元素
    {
        return elements[elementSize-1];
    }
}
