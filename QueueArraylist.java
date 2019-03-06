import java.util.Scanner;

class QueueArraylist<D> implements Queue<D> {
    Object arr[];
    Integer size;
    Integer buffer;

    QueueArraylist() {
        size = 0;
        buffer = 10;
        arr = new Object[buffer];
    }

    public void push(D q) {
        arr[size] = q;
        size++;
        if (size == buffer) {
            Object arr2[] = new Object[buffer * 2];
            buffer = buffer * 2;
            for (Integer y = 0; y < size; y++) {
                arr2[y] = arr[y];
            }
            arr = arr2;
        }
    }
   public D pop() {
    D value=null;
    try
    {
if (size==0)
{
throw new ArrayIndexOutOfBoundsException();
}
else
{
value=(D)arr[0];
arr[0]=null;
for(int i=0;i<size-1;i++)
{
arr[i]=arr[i+1];
}
size--;
}       
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array is alread empty");
}
return (D)value;
    }  


       public D peek()
       {
         return (D)arr[size-1];
         }
         public Integer length()
         {
           return size;
                       } 
}
