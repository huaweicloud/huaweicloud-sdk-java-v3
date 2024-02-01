package com.huaweicloud.sdk.cc.v2;

import com.huaweicloud.sdk.cc.v2.model.BatchCreateDeleteTagsRequest;
import com.huaweicloud.sdk.cc.v2.model.BatchCreateDeleteTagsResponse;
import com.huaweicloud.sdk.cc.v2.model.BatchCreateGcbResourceTagsRequest;
import com.huaweicloud.sdk.cc.v2.model.BatchCreateGcbResourceTagsResponse;
import com.huaweicloud.sdk.cc.v2.model.BatchDeleteGcbResourceTagsRequest;
import com.huaweicloud.sdk.cc.v2.model.BatchDeleteGcbResourceTagsResponse;
import com.huaweicloud.sdk.cc.v2.model.CountGcbResourceByTagRequest;
import com.huaweicloud.sdk.cc.v2.model.CountGcbResourceByTagResponse;
import com.huaweicloud.sdk.cc.v2.model.CreateGcbResourceTagRequest;
import com.huaweicloud.sdk.cc.v2.model.CreateGcbResourceTagResponse;
import com.huaweicloud.sdk.cc.v2.model.CreateTagRequest;
import com.huaweicloud.sdk.cc.v2.model.CreateTagResponse;
import com.huaweicloud.sdk.cc.v2.model.DeleteGcbResourceTagRequest;
import com.huaweicloud.sdk.cc.v2.model.DeleteGcbResourceTagResponse;
import com.huaweicloud.sdk.cc.v2.model.DeleteTagRequest;
import com.huaweicloud.sdk.cc.v2.model.DeleteTagResponse;
import com.huaweicloud.sdk.cc.v2.model.ListDomainTagsRequest;
import com.huaweicloud.sdk.cc.v2.model.ListDomainTagsResponse;
import com.huaweicloud.sdk.cc.v2.model.ListGcbResourceByTagRequest;
import com.huaweicloud.sdk.cc.v2.model.ListGcbResourceByTagResponse;
import com.huaweicloud.sdk.cc.v2.model.ListGcbResourceTagsRequest;
import com.huaweicloud.sdk.cc.v2.model.ListGcbResourceTagsResponse;
import com.huaweicloud.sdk.cc.v2.model.ListGcbTenantTagsRequest;
import com.huaweicloud.sdk.cc.v2.model.ListGcbTenantTagsResponse;
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
     * 批量添加账户全域互联带宽资源标签
     *
     * TMS批量添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateGcbResourceTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateGcbResourceTagsResponse>
     */
    public CompletableFuture<BatchCreateGcbResourceTagsResponse> batchCreateGcbResourceTagsAsync(
        BatchCreateGcbResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.batchCreateGcbResourceTags);
    }

    /**
     * 批量添加账户全域互联带宽资源标签
     *
     * TMS批量添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateGcbResourceTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateGcbResourceTagsRequest, BatchCreateGcbResourceTagsResponse>
     */
    public AsyncInvoker<BatchCreateGcbResourceTagsRequest, BatchCreateGcbResourceTagsResponse> batchCreateGcbResourceTagsAsyncInvoker(
        BatchCreateGcbResourceTagsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.batchCreateGcbResourceTags, hcClient);
    }

    /**
     * 批量删除账户全域互联带宽资源标签
     *
     * 批量删除账户全域互联带宽资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteGcbResourceTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteGcbResourceTagsResponse>
     */
    public CompletableFuture<BatchDeleteGcbResourceTagsResponse> batchDeleteGcbResourceTagsAsync(
        BatchDeleteGcbResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.batchDeleteGcbResourceTags);
    }

    /**
     * 批量删除账户全域互联带宽资源标签
     *
     * 批量删除账户全域互联带宽资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteGcbResourceTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteGcbResourceTagsRequest, BatchDeleteGcbResourceTagsResponse>
     */
    public AsyncInvoker<BatchDeleteGcbResourceTagsRequest, BatchDeleteGcbResourceTagsResponse> batchDeleteGcbResourceTagsAsyncInvoker(
        BatchDeleteGcbResourceTagsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.batchDeleteGcbResourceTags, hcClient);
    }

    /**
     * 查询账户全域互联带宽资源标签数量
     *
     * 查询账户全域互联带宽资源标签数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountGcbResourceByTagRequest 请求对象
     * @return CompletableFuture<CountGcbResourceByTagResponse>
     */
    public CompletableFuture<CountGcbResourceByTagResponse> countGcbResourceByTagAsync(
        CountGcbResourceByTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.countGcbResourceByTag);
    }

    /**
     * 查询账户全域互联带宽资源标签数量
     *
     * 查询账户全域互联带宽资源标签数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountGcbResourceByTagRequest 请求对象
     * @return AsyncInvoker<CountGcbResourceByTagRequest, CountGcbResourceByTagResponse>
     */
    public AsyncInvoker<CountGcbResourceByTagRequest, CountGcbResourceByTagResponse> countGcbResourceByTagAsyncInvoker(
        CountGcbResourceByTagRequest request) {
        return new AsyncInvoker<>(request, CcMeta.countGcbResourceByTag, hcClient);
    }

    /**
     * 添加账户全域互联带宽资源标签
     *
     * 添加账户全域互联带宽资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGcbResourceTagRequest 请求对象
     * @return CompletableFuture<CreateGcbResourceTagResponse>
     */
    public CompletableFuture<CreateGcbResourceTagResponse> createGcbResourceTagAsync(
        CreateGcbResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.createGcbResourceTag);
    }

    /**
     * 添加账户全域互联带宽资源标签
     *
     * 添加账户全域互联带宽资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGcbResourceTagRequest 请求对象
     * @return AsyncInvoker<CreateGcbResourceTagRequest, CreateGcbResourceTagResponse>
     */
    public AsyncInvoker<CreateGcbResourceTagRequest, CreateGcbResourceTagResponse> createGcbResourceTagAsyncInvoker(
        CreateGcbResourceTagRequest request) {
        return new AsyncInvoker<>(request, CcMeta.createGcbResourceTag, hcClient);
    }

    /**
     * 删除账户全域互联带宽资源标签
     *
     * 删除账户全域互联带宽资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGcbResourceTagRequest 请求对象
     * @return CompletableFuture<DeleteGcbResourceTagResponse>
     */
    public CompletableFuture<DeleteGcbResourceTagResponse> deleteGcbResourceTagAsync(
        DeleteGcbResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.deleteGcbResourceTag);
    }

    /**
     * 删除账户全域互联带宽资源标签
     *
     * 删除账户全域互联带宽资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGcbResourceTagRequest 请求对象
     * @return AsyncInvoker<DeleteGcbResourceTagRequest, DeleteGcbResourceTagResponse>
     */
    public AsyncInvoker<DeleteGcbResourceTagRequest, DeleteGcbResourceTagResponse> deleteGcbResourceTagAsyncInvoker(
        DeleteGcbResourceTagRequest request) {
        return new AsyncInvoker<>(request, CcMeta.deleteGcbResourceTag, hcClient);
    }

    /**
     * 查询账户全域互联带宽资源实例列表
     *
     * 查询账户全域互联带宽资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGcbResourceByTagRequest 请求对象
     * @return CompletableFuture<ListGcbResourceByTagResponse>
     */
    public CompletableFuture<ListGcbResourceByTagResponse> listGcbResourceByTagAsync(
        ListGcbResourceByTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listGcbResourceByTag);
    }

    /**
     * 查询账户全域互联带宽资源实例列表
     *
     * 查询账户全域互联带宽资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGcbResourceByTagRequest 请求对象
     * @return AsyncInvoker<ListGcbResourceByTagRequest, ListGcbResourceByTagResponse>
     */
    public AsyncInvoker<ListGcbResourceByTagRequest, ListGcbResourceByTagResponse> listGcbResourceByTagAsyncInvoker(
        ListGcbResourceByTagRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listGcbResourceByTag, hcClient);
    }

    /**
     * 查询账户全域互联带宽资源的标签
     *
     * 查询账户全域互联带宽资源的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGcbResourceTagsRequest 请求对象
     * @return CompletableFuture<ListGcbResourceTagsResponse>
     */
    public CompletableFuture<ListGcbResourceTagsResponse> listGcbResourceTagsAsync(ListGcbResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listGcbResourceTags);
    }

    /**
     * 查询账户全域互联带宽资源的标签
     *
     * 查询账户全域互联带宽资源的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGcbResourceTagsRequest 请求对象
     * @return AsyncInvoker<ListGcbResourceTagsRequest, ListGcbResourceTagsResponse>
     */
    public AsyncInvoker<ListGcbResourceTagsRequest, ListGcbResourceTagsResponse> listGcbResourceTagsAsyncInvoker(
        ListGcbResourceTagsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listGcbResourceTags, hcClient);
    }

    /**
     * 查询账户全域互联带宽所有资源标签
     *
     * 查询账户全域互联带宽所有资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGcbTenantTagsRequest 请求对象
     * @return CompletableFuture<ListGcbTenantTagsResponse>
     */
    public CompletableFuture<ListGcbTenantTagsResponse> listGcbTenantTagsAsync(ListGcbTenantTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listGcbTenantTags);
    }

    /**
     * 查询账户全域互联带宽所有资源标签
     *
     * 查询账户全域互联带宽所有资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGcbTenantTagsRequest 请求对象
     * @return AsyncInvoker<ListGcbTenantTagsRequest, ListGcbTenantTagsResponse>
     */
    public AsyncInvoker<ListGcbTenantTagsRequest, ListGcbTenantTagsResponse> listGcbTenantTagsAsyncInvoker(
        ListGcbTenantTagsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listGcbTenantTags, hcClient);
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
