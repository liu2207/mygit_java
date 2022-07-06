package cn.mytest.javaTest0702.lambda01;

/**
 * 实现类
 */
public class LambdaDemo01 {
    public static void main(String[] args) {
        //1 方式一
        /*MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();*/

        //2 方式二
        /*new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println("多线程启动了...");
            }
        }).start();*/


        //3 方式三
       /* new Thread(
                () ->
                    System.out.println("函数式编程方式...多线程启动了...");

        ).start();*/


    }
}
