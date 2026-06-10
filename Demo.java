// class Z {


// }


// class A extends Z implements Runnable {
//     public void run() {
//        for(int i = 0 ; i <= 10 ; i++)
//        {
//         System.out.println("hi");
//         try {
//             Thread.sleep(10);
            
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
           
//        }
//     }
// }

// class B extends Z implements Runnable  {
//     public void run() {
//         for(int i = 0 ; i <= 10 ; i++)
//        {
//         System.out.println("hello");
//         try {
//             Thread.sleep(10);
            
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//        }
//     }
// }

class Counter
{
    int count;
    public synchronized void increment(){
        count++;
    }
} 


public class Demo {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable a = () -> 
        {
            for(int i = 1 ; i <=10000 ; i++)
            {
                c.increment();
            }
        };
        Runnable b = () -> 
        {
            for(int i = 1 ; i <=10000 ; i++)
            {
                c.increment();
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        
        System.out.println(c.count);
    }
}
    
// changes added comment 
// new line added 
// System.out.println("Testing");