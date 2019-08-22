package com.bkw.library.mode;

import android.support.annotation.NonNull;
import android.util.Log;

import java.util.concurrent.ThreadFactory;

import static android.content.ContentValues.TAG;

/**
 * 自定义子线程，主要是指定一个线程名字，方便出错时回溯
 *
 * @author bkw
 */
public class DefaultThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(@NonNull Runnable r) {
        final Thread thread = new Thread(r);
        thread.setName("BkwThread");

        //优先级为normal
        if (thread.getPriority() != Thread.NORM_PRIORITY) {
            thread.setPriority(Thread.NORM_PRIORITY);
        }

        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                Log.e(TAG, "Running Task appeared exception! Thread[" + thread.getName() + "], because [" + e.getMessage() + "]");
            }
        });
        return thread;
    }
}
