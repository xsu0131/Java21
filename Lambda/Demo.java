package Lambda;
@FunctionalInterface
interface A
{
    void show(int a, int b, int c);

    @Override
    public String toString();

}
public class Demo
{
    public static void main(String[] args) {
//        A obj = new A()
//        {
//            @Override
//            public void show() {
//                System.out.println("in show");
//            }
//        };

        // lambda function
//        A obj = () ->
//        {
//            System.out.println(" in show");
//        };

//        A obj = () -> System.out.println(" in show");

        A obj = (int a, int b, int c) -> System.out.println(" in show " + a + " " + b + " " + c);

        obj.show(5,3,2);
    }
}
