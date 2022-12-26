package com.yemeksepeti.threads;

public class ConsumerProducer {
    public static void main(String[] args) {
        ShareData data = new ShareData();
        data.intValue = 10;

        Producer p = new Producer(data);
        Consumer c = new Consumer(data);
        Thread t = new Thread(c);

        p.start();
        t.start();
    }
}

class Producer extends Thread {
    ShareData data;

    public Producer(ShareData data) {
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                data.intValue++;
            }
            System.out.println("Producer :" + data.intValue);
        }
    }
}

class Consumer implements Runnable {
    ShareData data;

    public Consumer(ShareData data) {
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                data.intValue--;
            }
            System.out.println("Consumer :" + data.intValue);
        }
    }
}

class ShareData {
    int intValue;
}
