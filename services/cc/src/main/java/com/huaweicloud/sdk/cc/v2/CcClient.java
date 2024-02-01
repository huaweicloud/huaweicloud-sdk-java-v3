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
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CcClient {

    protected HcClient hcClient;

    public CcClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CcClient> newBuilder() {
        ClientBuilder<CcClient> clientBuilder = new ClientBuilder<>(CcClient::new, "GlobalCredentials");
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
     * @return BatchCreateGcbResourceTagsResponse
     */
    public BatchCreateGcbResourceTagsResponse batchCreateGcbResourceTags(BatchCreateGcbResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.batchCreateGcbResourceTags);
    }

    /**
     * 批量添加账户全域互联带宽资源标签
     *
     * TMS批量添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateGcbResourceTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateGcbResourceTagsRequest, BatchCreateGcbResourceTagsResponse>
     */
    public SyncInvoker<BatchCreateGcbResourceTagsRequest, BatchCreateGcbResourceTagsResponse> batchCreateGcbResourceTagsInvoker(
        BatchCreateGcbResourceTagsRequest request) {
        return new SyncInvoker<>(request, CcMeta.batchCreateGcbResourceTags, hcClient);
    }

    /**
     * 批量删除账户全域互联带宽资源标签
     *
     * 批量删除账户全域互联带宽资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteGcbResourceTagsRequest 请求对象
     * @return BatchDeleteGcbResourceTagsResponse
     */
    public BatchDeleteGcbResourceTagsResponse batchDeleteGcbResourceTags(BatchDeleteGcbResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.batchDeleteGcbResourceTags);
    }

    /**
     * 批量删除账户全域互联带宽资源标签
     *
     * 批量删除账户全域互联带宽资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteGcbResourceTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteGcbResourceTagsRequest, BatchDeleteGcbResourceTagsResponse>
     */
    public SyncInvoker<BatchDeleteGcbResourceTagsRequest, BatchDeleteGcbResourceTagsResponse> batchDeleteGcbResourceTagsInvoker(
        BatchDeleteGcbResourceTagsRequest request) {
        return new SyncInvoker<>(request, CcMeta.batchDeleteGcbResourceTags, hcClient);
    }

    /**
     * 查询账户全域互联带宽资源标签数量
     *
     * 查询账户全域互联带宽资源标签数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountGcbResourceByTagRequest 请求对象
     * @return CountGcbResourceByTagResponse
     */
    public CountGcbResourceByTagResponse countGcbResourceByTag(CountGcbResourceByTagRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.countGcbResourceByTag);
    }

    /**
     * 查询账户全域互联带宽资源标签数量
     *
     * 查询账户全域互联带宽资源标签数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountGcbResourceByTagRequest 请求对象
     * @return SyncInvoker<CountGcbResourceByTagRequest, CountGcbResourceByTagResponse>
     */
    public SyncInvoker<CountGcbResourceByTagRequest, CountGcbResourceByTagResponse> countGcbResourceByTagInvoker(
        CountGcbResourceByTagRequest request) {
        return new SyncInvoker<>(request, CcMeta.countGcbResourceByTag, hcClient);
    }

    /**
     * 添加账户全域互联带宽资源标签
     *
     * 添加账户全域互联带宽资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGcbResourceTagRequest 请求对象
     * @return CreateGcbResourceTagResponse
     */
    public CreateGcbResourceTagResponse createGcbResourceTag(CreateGcbResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.createGcbResourceTag);
    }

    /**
     * 添加账户全域互联带宽资源标签
     *
     * 添加账户全域互联带宽资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGcbResourceTagRequest 请求对象
     * @return SyncInvoker<CreateGcbResourceTagRequest, CreateGcbResourceTagResponse>
     */
    public SyncInvoker<CreateGcbResourceTagRequest, CreateGcbResourceTagResponse> createGcbResourceTagInvoker(
        CreateGcbResourceTagRequest request) {
        return new SyncInvoker<>(request, CcMeta.createGcbResourceTag, hcClient);
    }

    /**
     * 删除账户全域互联带宽资源标签
     *
     * 删除账户全域互联带宽资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGcbResourceTagRequest 请求对象
     * @return DeleteGcbResourceTagResponse
     */
    public DeleteGcbResourceTagResponse deleteGcbResourceTag(DeleteGcbResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.deleteGcbResourceTag);
    }

    /**
     * 删除账户全域互联带宽资源标签
     *
     * 删除账户全域互联带宽资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGcbResourceTagRequest 请求对象
     * @return SyncInvoker<DeleteGcbResourceTagRequest, DeleteGcbResourceTagResponse>
     */
    public SyncInvoker<DeleteGcbResourceTagRequest, DeleteGcbResourceTagResponse> deleteGcbResourceTagInvoker(
        DeleteGcbResourceTagRequest request) {
        return new SyncInvoker<>(request, CcMeta.deleteGcbResourceTag, hcClient);
    }

    /**
     * 查询账户全域互联带宽资源实例列表
     *
     * 查询账户全域互联带宽资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGcbResourceByTagRequest 请求对象
     * @return ListGcbResourceByTagResponse
     */
    public ListGcbResourceByTagResponse listGcbResourceByTag(ListGcbResourceByTagRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listGcbResourceByTag);
    }

    /**
     * 查询账户全域互联带宽资源实例列表
     *
     * 查询账户全域互联带宽资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGcbResourceByTagRequest 请求对象
     * @return SyncInvoker<ListGcbResourceByTagRequest, ListGcbResourceByTagResponse>
     */
    public SyncInvoker<ListGcbResourceByTagRequest, ListGcbResourceByTagResponse> listGcbResourceByTagInvoker(
        ListGcbResourceByTagRequest request) {
        return new SyncInvoker<>(request, CcMeta.listGcbResourceByTag, hcClient);
    }

    /**
     * 查询账户全域互联带宽资源的标签
     *
     * 查询账户全域互联带宽资源的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGcbResourceTagsRequest 请求对象
     * @return ListGcbResourceTagsResponse
     */
    public ListGcbResourceTagsResponse listGcbResourceTags(ListGcbResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listGcbResourceTags);
    }

    /**
     * 查询账户全域互联带宽资源的标签
     *
     * 查询账户全域互联带宽资源的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGcbResourceTagsRequest 请求对象
     * @return SyncInvoker<ListGcbResourceTagsRequest, ListGcbResourceTagsResponse>
     */
    public SyncInvoker<ListGcbResourceTagsRequest, ListGcbResourceTagsResponse> listGcbResourceTagsInvoker(
        ListGcbResourceTagsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listGcbResourceTags, hcClient);
    }

    /**
     * 查询账户全域互联带宽所有资源标签
     *
     * 查询账户全域互联带宽所有资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGcbTenantTagsRequest 请求对象
     * @return ListGcbTenantTagsResponse
     */
    public ListGcbTenantTagsResponse listGcbTenantTags(ListGcbTenantTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listGcbTenantTags);
    }

    /**
     * 查询账户全域互联带宽所有资源标签
     *
     * 查询账户全域互联带宽所有资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGcbTenantTagsRequest 请求对象
     * @return SyncInvoker<ListGcbTenantTagsRequest, ListGcbTenantTagsResponse>
     */
    public SyncInvoker<ListGcbTenantTagsRequest, ListGcbTenantTagsResponse> listGcbTenantTagsInvoker(
        ListGcbTenantTagsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listGcbTenantTags, hcClient);
    }

    /**
     * 批量创建和删除资源标签
     *
     * 批量创建和删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateDeleteTagsRequest 请求对象
     * @return BatchCreateDeleteTagsResponse
     */
    public BatchCreateDeleteTagsResponse batchCreateDeleteTags(BatchCreateDeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.batchCreateDeleteTags);
    }

    /**
     * 批量创建和删除资源标签
     *
     * 批量创建和删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateDeleteTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateDeleteTagsRequest, BatchCreateDeleteTagsResponse>
     */
    public SyncInvoker<BatchCreateDeleteTagsRequest, BatchCreateDeleteTagsResponse> batchCreateDeleteTagsInvoker(
        BatchCreateDeleteTagsRequest request) {
        return new SyncInvoker<>(request, CcMeta.batchCreateDeleteTags, hcClient);
    }

    /**
     * 添加资源标签
     *
     * 添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return CreateTagResponse
     */
    public CreateTagResponse createTag(CreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.createTag);
    }

    /**
     * 添加资源标签
     *
     * 添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return SyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public SyncInvoker<CreateTagRequest, CreateTagResponse> createTagInvoker(CreateTagRequest request) {
        return new SyncInvoker<>(request, CcMeta.createTag, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.deleteTag);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return SyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public SyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagInvoker(DeleteTagRequest request) {
        return new SyncInvoker<>(request, CcMeta.deleteTag, hcClient);
    }

    /**
     * 查询账户资源标签
     *
     * 查询账户资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainTagsRequest 请求对象
     * @return ListDomainTagsResponse
     */
    public ListDomainTagsResponse listDomainTags(ListDomainTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listDomainTags);
    }

    /**
     * 查询账户资源标签
     *
     * 查询账户资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainTagsRequest 请求对象
     * @return SyncInvoker<ListDomainTagsRequest, ListDomainTagsResponse>
     */
    public SyncInvoker<ListDomainTagsRequest, ListDomainTagsResponse> listDomainTagsInvoker(
        ListDomainTagsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listDomainTags, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 查询资源实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceByFilterTagRequest 请求对象
     * @return ListResourceByFilterTagResponse
     */
    public ListResourceByFilterTagResponse listResourceByFilterTag(ListResourceByFilterTagRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listResourceByFilterTag);
    }

    /**
     * 查询资源实例
     *
     * 查询资源实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceByFilterTagRequest 请求对象
     * @return SyncInvoker<ListResourceByFilterTagRequest, ListResourceByFilterTagResponse>
     */
    public SyncInvoker<ListResourceByFilterTagRequest, ListResourceByFilterTagResponse> listResourceByFilterTagInvoker(
        ListResourceByFilterTagRequest request) {
        return new SyncInvoker<>(request, CcMeta.listResourceByFilterTag, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listTags);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return SyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public SyncInvoker<ListTagsRequest, ListTagsResponse> listTagsInvoker(ListTagsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listTags, hcClient);
    }

}
