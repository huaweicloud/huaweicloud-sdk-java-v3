package com.huaweicloud.sdk.kvs.v1;

import com.huaweicloud.sdk.core.exception.ConnectionException;
import com.huaweicloud.sdk.core.exception.RequestTimeoutException;
import com.huaweicloud.sdk.kvs.v1.model.CheckHealthRequest;
import com.huaweicloud.sdk.kvs.v1.model.CheckHealthRequestBody;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class KvsClientHeartbeatKeeper {
    private static final Logger LOG = LoggerFactory.getLogger(KvsClientHeartbeatKeeper.class);

    private final ConcurrentHashMap<Integer, ManagedKvsClient> kvsClientMap;

    private final ThreadPoolExecutor healthCheckThreadPool;

    private final Timer heartbeatTimer;

    public KvsClientHeartbeatKeeper(ConcurrentHashMap<Integer, ManagedKvsClient> kvsClientMap,
        Integer heartBeatCheckIntervalMs, Integer heartBeatCheckThreadPoolSize) {
        this.kvsClientMap = kvsClientMap;
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(heartBeatCheckThreadPoolSize * 100);
        this.healthCheckThreadPool = new ThreadPoolExecutor(
            heartBeatCheckThreadPoolSize, heartBeatCheckThreadPoolSize,
            0L, TimeUnit.MILLISECONDS,
            queue,
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.DiscardPolicy());
        this.heartbeatTimer = new Timer("heartbeatKeeper");
        heartbeatTimer.schedule(new HeartbeatKeeperTask(), heartBeatCheckIntervalMs, heartBeatCheckIntervalMs);
    }

    public void close() {
        healthCheckThreadPool.shutdown();
        heartbeatTimer.cancel();
        heartbeatTimer.purge();
        LOG.info("KvsClientHeartbeatKeeper is closed !");
    }

    private class HeartbeatKeeperTask extends TimerTask {
        @Override
        public void run() {
            kvsClientMap.forEach(
                (sortNum, managedKvsClient) -> healthCheckThreadPool.execute(new HeathCheckTask(managedKvsClient)));
        }
    }

    private static class HeathCheckTask implements Runnable {
        ManagedKvsClient client;

        public HeathCheckTask(ManagedKvsClient client) {
            this.client = client;
        }

        @Override
        public void run() {
            boolean isUsable = true;
            try {
                CheckHealthRequestBody body = new CheckHealthRequestBody().withVersion(1);
                if (!client.isAsyncClient()) {
                    client.getKvsClient()
                        .checkHealth(new CheckHealthRequest().withBody(body));
                } else {
                    client.getKvsAsyncClient()
                        .checkHealthAsync(new CheckHealthRequest().withBody(body)).get();
                }

            } catch (RequestTimeoutException | ConnectionException e) {
                LOG.warn("Network channel throw Exception, set " + client.getEndpointName()
                    + " client to unusable, errorInfo: " + e, e);
                isUsable = false;
            } catch (ExecutionException | InterruptedException e) {
                LOG.error("get healthCheckResponse from future of AsyncClient failed !", e);
            }
            client.setIsUsable(isUsable);
        }
    }
}
