package com.huaweicloud.sdk.cc.v2;

import com.huaweicloud.sdk.cc.v2.model.BatchCreateDeleteTagsRequest;
import com.huaweicloud.sdk.cc.v2.model.BatchCreateDeleteTagsResponse;
import com.huaweicloud.sdk.cc.v2.model.CreateTagRequest;
import com.huaweicloud.sdk.cc.v2.model.CreateTagResponse;
import com.huaweicloud.sdk.cc.v2.model.DeleteTagRequest;
import com.huaweicloud.sdk.cc.v2.model.DeleteTagResponse;
import com.huaweicloud.sdk.cc.v2.model.ListDomainTagsRequest;
import com.huaweicloud.sdk.cc.v2.model.ListDomainTagsResponse;
import com.huaweicloud.sdk.cc.v2.model.ListResourceByFilterTagRequest;
import com.huaweicloud.sdk.cc.v2.model.ListResourceByFilterTagResponse;
import com.huaweicloud.sdk.cc.v2.model.ListTagsRequest;
import com.huaweicloud.sdk.cc.v2.model.ListTagsResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CcAsyncClient {

    protected HcClient hcClient;

    public CcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CcAsyncClient> newBuilder() {
        ClientBuilder<CcAsyncClient> clientBuilder = new ClientBuilder<>(CcAsyncClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 批量创建和删除资源标签
     *
     * 批量创建和删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateDeleteTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateDeleteTagsResponse>
     */
    public CompletableFuture<BatchCreateDeleteTagsResponse> batchCreateDeleteTagsAsync(
        BatchCreateDeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.batchCreateDeleteTags);
    }

    /**
     * 批量创建和删除资源标签
     *
     * 批量创建和删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateDeleteTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateDeleteTagsRequest, BatchCreateDeleteTagsResponse>
     */
    public AsyncInvoker<BatchCreateDeleteTagsRequest, BatchCreateDeleteTagsResponse> batchCreateDeleteTagsAsyncInvoker(
        BatchCreateDeleteTagsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.batchCreateDeleteTags, hcClient);
    }

    /**
     * 添加资源标签
     *
     * 添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return CompletableFuture<CreateTagResponse>
     */
    public CompletableFuture<CreateTagResponse> createTagAsync(CreateTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.createTag);
    }

    /**
     * 添加资源标签
     *
     * 添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return AsyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public AsyncInvoker<CreateTagRequest, CreateTagResponse> createTagAsyncInvoker(CreateTagRequest request) {
        return new AsyncInvoker<>(request, CcMeta.createTag, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return CompletableFuture<DeleteTagResponse>
     */
    public CompletableFuture<DeleteTagResponse> deleteTagAsync(DeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.deleteTag);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return AsyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public AsyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagAsyncInvoker(DeleteTagRequest request) {
        return new AsyncInvoker<>(request, CcMeta.deleteTag, hcClient);
    }

    /**
     * 查询账户资源标签
     *
     * 查询账户资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainTagsRequest 请求对象
     * @return CompletableFuture<ListDomainTagsResponse>
     */
    public CompletableFuture<ListDomainTagsResponse> listDomainTagsAsync(ListDomainTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listDomainTags);
    }

    /**
     * 查询账户资源标签
     *
     * 查询账户资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainTagsRequest 请求对象
     * @return AsyncInvoker<ListDomainTagsRequest, ListDomainTagsResponse>
     */
    public AsyncInvoker<ListDomainTagsRequest, ListDomainTagsResponse> listDomainTagsAsyncInvoker(
        ListDomainTagsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listDomainTags, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 查询资源实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceByFilterTagRequest 请求对象
     * @return CompletableFuture<ListResourceByFilterTagResponse>
     */
    public CompletableFuture<ListResourceByFilterTagResponse> listResourceByFilterTagAsync(
        ListResourceByFilterTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listResourceByFilterTag);
    }

    /**
     * 查询资源实例
     *
     * 查询资源实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceByFilterTagRequest 请求对象
     * @return AsyncInvoker<ListResourceByFilterTagRequest, ListResourceByFilterTagResponse>
     */
    public AsyncInvoker<ListResourceByFilterTagRequest, ListResourceByFilterTagResponse> listResourceByFilterTagAsyncInvoker(
        ListResourceByFilterTagRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listResourceByFilterTag, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return CompletableFuture<ListTagsResponse>
     */
    public CompletableFuture<ListTagsResponse> listTagsAsync(ListTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listTags);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return AsyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public AsyncInvoker<ListTagsRequest, ListTagsResponse> listTagsAsyncInvoker(ListTagsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listTags, hcClient);
    }

}
