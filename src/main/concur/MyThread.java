package concur;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public class MyThread  implements Runnable{
    private List<Object> list;
    private CountDownLatch countDownLatch;
    public MyThread(){}
    public  MyThread(List<Object> list,CountDownLatch countDownLatch){
        this.list=list;
        this.countDownLatch=countDownLatch;
    }
    
    public void run() {
        //��ÿ���߳����10��Ԫ��
        for(int i=0;i<10;i++){
            list.add(new Object());
        }
        //���һ�����߳�
        countDownLatch.countDown();
    }
}