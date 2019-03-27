package concur;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class ThreadTest {
    /**
     * Vector  线程安全的
     *
     */
    public static void test(){
        //用来测试的list集合
        List<Object> list= new ArrayList<Object>();
        //        List<Object> list = new Vector<Object>();
        //线程数
        int threadCount =10000;
        //用来让主线等待thread 个执行完毕
        CountDownLatch  count=new CountDownLatch(threadCount);
        for(int i=0;i<threadCount;i++){
            Thread thread=new Thread(new MyThread(list, count));
            thread.start();
        }
        try {
            //主线程所有都执行完成后，再向下执行
            count.await();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            test();
        }
    }
}
