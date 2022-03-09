package com.wanxp.stream;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.SubmissionPublisher;
import java.util.stream.LongStream;

public class JdkStreamDemo1 {
    public static void main(String[] args) {
        CompletableFuture<Void> subTask = null;
        //<1> 构建生产者 SubmissionPublisher 是
        try(SubmissionPublisher<Long> pub = new SubmissionPublisher<>()) {
            System.out.println("Subscriber Buffer Size: " + pub.getMaxBufferCapacity());
            subTask = pub.consume(System.out::println);
            LongStream.range(1L, 10L)
                    .forEach(pub::submit);
        }

        if (subTask != null) {
            try {
                subTask.get();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
