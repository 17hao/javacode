package xyz.shiqihao.advanced.concurrency.pattern.thread_per_msg;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * 从输出结果中可以看到, 主线程不会等待具体执行任务的子线程执行完才终止, 而是自顾自地结束执行.
 * thread per message模式适用于具体执行的任务特别耗时, 并且主线程不需要任务的返回值, 可以用来加速应答.
 * 如果主线程需要返回结果, 就要用到Future模式.
 * thread per message会为每个请求创建一个线程(BIO); 类似的模式是worker thread, 它会事先准备好一部分线程, 供后续
 * 请求循环使用(NIO).
 */
public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
        System.out.println("main BEGIN");
        Host host = new Host(new Helper(), executor);
        host.request(3, 'A');
        host.request(6, 'B');
        host.request(9, 'C');
        System.out.println("main END");
    }
}
