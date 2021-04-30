package com.huaweicloud.sdk.dli.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dli.v1.model.*;

public class DliAsyncClient {
    protected HcClient hcClient;

    public DliAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DliAsyncClient> newBuilder() {
        return new ClientBuilder<>(DliAsyncClient::new);
    }


    /**
     * 创建队列
     * 该API用于创建队列，该队列将会绑定用户指定的计算资源。
     *
     * @param CreateQueueRequest 请求对象
     * @return CompletableFuture<CreateQueueResponse>
     */
    public CompletableFuture<CreateQueueResponse> createQueueAsync(CreateQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createQueue);
    }

    /**
     * 创建队列
     * 该API用于创建队列，该队列将会绑定用户指定的计算资源。
     *
     * @param CreateQueueRequest 请求对象
     * @return AsyncInvoker<CreateQueueRequest, CreateQueueResponse>
     */
    public AsyncInvoker<CreateQueueRequest, CreateQueueResponse> createQueueAsyncInvoker(CreateQueueRequest request) {
        return new AsyncInvoker<CreateQueueRequest, CreateQueueResponse>(request, DliMeta.createQueue, hcClient);
    }

    /**
     * 删除队列
     * 该API用于删除指定队列。 说明：  若指定队列正在执行任务，则不允许删除。
     *
     * @param DeleteQueueRequest 请求对象
     * @return CompletableFuture<DeleteQueueResponse>
     */
    public CompletableFuture<DeleteQueueResponse> deleteQueueAsync(DeleteQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteQueue);
    }

    /**
     * 删除队列
     * 该API用于删除指定队列。 说明：  若指定队列正在执行任务，则不允许删除。
     *
     * @param DeleteQueueRequest 请求对象
     * @return AsyncInvoker<DeleteQueueRequest, DeleteQueueResponse>
     */
    public AsyncInvoker<DeleteQueueRequest, DeleteQueueResponse> deleteQueueAsyncInvoker(DeleteQueueRequest request) {
        return new AsyncInvoker<DeleteQueueRequest, DeleteQueueResponse>(request, DliMeta.deleteQueue, hcClient);
    }

    /**
     * 查询所有队列
     * 该API用于列出该project下所有的队列。
     *
     * @param ListQueuesRequest 请求对象
     * @return CompletableFuture<ListQueuesResponse>
     */
    public CompletableFuture<ListQueuesResponse> listQueuesAsync(ListQueuesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listQueues);
    }

    /**
     * 查询所有队列
     * 该API用于列出该project下所有的队列。
     *
     * @param ListQueuesRequest 请求对象
     * @return AsyncInvoker<ListQueuesRequest, ListQueuesResponse>
     */
    public AsyncInvoker<ListQueuesRequest, ListQueuesResponse> listQueuesAsyncInvoker(ListQueuesRequest request) {
        return new AsyncInvoker<ListQueuesRequest, ListQueuesResponse>(request, DliMeta.listQueues, hcClient);
    }

}