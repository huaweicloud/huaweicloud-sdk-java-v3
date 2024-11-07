package com.huaweicloud.sdk.kvs.v1;

import com.huaweicloud.sdk.core.exception.SdkException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public abstract class AbstractMultiChannelKvsClient {
    private static final Logger LOG = LoggerFactory.getLogger(AbstractMultiChannelKvsClient.class);

    protected final AtomicInteger tokenNum = new AtomicInteger(1);

    protected final AtomicInteger weightCount = new AtomicInteger(0);

    protected final ConcurrentHashMap<Integer, ManagedKvsClient> kvsClientMap = new ConcurrentHashMap<>();

    protected ConcurrentHashMap<Long, ConcurrentHashMap<Integer, ManagedKvsClient>> oldKvsClientMaps
        = new ConcurrentHashMap<>();

    private final ReentrantLock pollingLock = new ReentrantLock();

    private final Random random = new Random();

    public static final int BASE_OF_EXPONENT = 2;

    protected ManagedKvsClient getKvsClientByPolling(Integer retryCount) {
        // Exponential Backoff
        if (retryCount > 0) {
            try {
                Thread.sleep(random.nextInt((int) Math.pow(BASE_OF_EXPONENT, retryCount)) * 1000L);
            } catch (InterruptedException e) {
                LOG.warn("Thread.sleep is interrupted", e);
            }
        }
        return getKvsClientByPolling();
    }

    protected ManagedKvsClient getKvsClientByPolling() {
        int selectCount = 0;
        pollingLock.lock();
        do {
            if (selectCount > kvsClientMap.size()) {
                LOG.error("all web channel of kvs clients are unusable! please wait and retry");
                throw new SdkException("all web channel of kvs clients are unusable! please wait and retry");
            }
            selectCount++;

            ManagedKvsClient kvsClient = kvsClientMap.get(tokenNum.get());
            if (kvsClient.isUsable() && weightCount.get() < kvsClient.getEndPointWeight()) {
                weightCount.getAndIncrement();
            } else if (tokenNum.get() >= kvsClientMap.size()) {
                tokenNum.getAndSet(1);
                weightCount.getAndSet(1);
            } else {
                tokenNum.getAndIncrement();
                weightCount.getAndSet(1);
            }
        } while (!kvsClientMap.get(tokenNum.get()).isUsable());

        int kvsClientNum = tokenNum.get();
        pollingLock.unlock();
        return kvsClientMap.get(kvsClientNum);
    }
}
