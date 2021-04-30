package com.huaweicloud.sdk.dli.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dli.v1.model.*;

public class DliClient {
    protected HcClient hcClient;

    public DliClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DliClient> newBuilder() {
        return new ClientBuilder<>(DliClient::new);
    }


    /**
     * 创建队列
     * 该API用于创建队列，该队列将会绑定用户指定的计算资源。
     *
     * @param CreateQueueRequest 请求对象
     * @return CreateQueueResponse
     */
    public CreateQueueResponse createQueue(CreateQueueRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.createQueue);
    }

    /**
     * 创建队列
     * 该API用于创建队列，该队列将会绑定用户指定的计算资源。
     *
     * @param CreateQueueRequest 请求对象
     * @return SyncInvoker<CreateQueueRequest, CreateQueueResponse>
     */
    public SyncInvoker<CreateQueueRequest, CreateQueueResponse> createQueueInvoker(CreateQueueRequest request) {
        return new SyncInvoker<CreateQueueRequest, CreateQueueResponse>(request, DliMeta.createQueue, hcClient);
    }

    /**
     * 删除队列
     * 该API用于删除指定队列。 说明：  若指定队列正在执行任务，则不允许删除。
     *
     * @param DeleteQueueRequest 请求对象
     * @return DeleteQueueResponse
     */
    public DeleteQueueResponse deleteQueue(DeleteQueueRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.deleteQueue);
    }

    /**
     * 删除队列
     * 该API用于删除指定队列。 说明：  若指定队列正在执行任务，则不允许删除。
     *
     * @param DeleteQueueRequest 请求对象
     * @return SyncInvoker<DeleteQueueRequest, DeleteQueueResponse>
     */
    public SyncInvoker<DeleteQueueRequest, DeleteQueueResponse> deleteQueueInvoker(DeleteQueueRequest request) {
        return new SyncInvoker<DeleteQueueRequest, DeleteQueueResponse>(request, DliMeta.deleteQueue, hcClient);
    }

    /**
     * 查询所有队列
     * 该API用于列出该project下所有的队列。
     *
     * @param ListQueuesRequest 请求对象
     * @return ListQueuesResponse
     */
    public ListQueuesResponse listQueues(ListQueuesRequest request) {
        return hcClient.syncInvokeHttp(request, DliMeta.listQueues);
    }

    /**
     * 查询所有队列
     * 该API用于列出该project下所有的队列。
     *
     * @param ListQueuesRequest 请求对象
     * @return SyncInvoker<ListQueuesRequest, ListQueuesResponse>
     */
    public SyncInvoker<ListQueuesRequest, ListQueuesResponse> listQueuesInvoker(ListQueuesRequest request) {
        return new SyncInvoker<ListQueuesRequest, ListQueuesResponse>(request, DliMeta.listQueues, hcClient);
    }

}