package com.android.java_thread.leet_1114;

import com.sun.istack.internal.Nullable;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author : dev
 * @version :
 * @Date :  2/2/21 3:56 PM
 * @Desc : https://leetcode-cn.com/problems/print-in-order/submissions/
 */
public class Foo  {
    private CountDownLatch second = new CountDownLatch(1);
    private CountDownLatch third = new CountDownLatch(1);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        second.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        second.await();
        printSecond.run();
        third.countDown();

    }

    public void third(Runnable printThird) throws InterruptedException {
        third.await();
        printThird.run();
    }


}
