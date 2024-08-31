//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Foo foo = new Foo();
            Thread t1 = new Thread(() -> {
                foo.first();
            });
            Thread t2 = new Thread(() -> {
                foo.second();
            });
            Thread t3 = new Thread(() -> {
                foo.third();
            });
            t1.start();
            //t1.join();
            t2.start();
           // t2.join();
            t3.start();
        }
        catch(Exception exc){}

        }
    }
