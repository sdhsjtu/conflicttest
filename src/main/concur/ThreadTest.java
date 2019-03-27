package concur;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class ThreadTest {
    /**
     * Vector  �̰߳�ȫ��
     *
     */
    public static void test(){
        //�������Ե�list����
        List<Object> list= new ArrayList<Object>();
        //        List<Object> list = new Vector<Object>();
        //�߳���
        int threadCount =10000;
        //���������ߵȴ�thread ��ִ�����
        CountDownLatch  count=new CountDownLatch(threadCount);
        for(int i=0;i<threadCount;i++){
            Thread thread=new Thread(new MyThread(list, count));
            thread.start();
        }
        try {
            //���߳����ж�ִ����ɺ�������ִ��
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
