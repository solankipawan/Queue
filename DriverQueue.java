import java.util.*;
class DriverQueue
{
public static void main(String args[])
{
QueueArrayList<Integer> obj=new QueueArrayList<Integer>();
Scanner scan=new Scanner(System.in);
int f=1;
while(f==1)
{
    System.out.println("\t<<<<<Menu>>>>>\n"+"1.For add element\n"+"2. For remove top most element and get it\n"+"3.For find topmost element\n"
    +"4. For length of stack\n"+"5.For exit\n"+"Choise number");
    Integer choise=scan.nextInt();
    switch(choise)
    {
        case 1:
        System.out.println("enter the number that you want to pop");
         obj.push(scan.nextInt());
         break;
        case 2:
        System.out.println(obj.pop());
        break;
        case 3:
        System.out.println(obj.peek());
        break;
        case 4:
        System.out.println(obj.length());
        break;
        case 5:
        f=2;
        break;
        default :
        System.out.println("Please enter write number");
    }
}
}
}
