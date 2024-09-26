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
     * 批量创建和删除资源标签
     *
     * 批量创建和删除标签。此API为历史API，请优先使用《 创建云连接实例标签》、《 创建带宽包标签》、《 删除云连接实例标签》、《 删除带宽包标签》。
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
     * 批量创建和删除标签。此API为历史API，请优先使用《 创建云连接实例标签》、《 创建带宽包标签》、《 删除云连接实例标签》、《 删除带宽包标签》。
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
     * 添加资源标签。此API为历史API，请优先使用《 创建云连接实例标签》、《 创建带宽包标签》。
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
     * 添加资源标签。此API为历史API，请优先使用《 创建云连接实例标签》、《 创建带宽包标签》。
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
     * 删除资源标签。此API为历史API，请优先使用《 删除云连接实例标签》或《 删除带宽包标签》。
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
     * 删除资源标签。此API为历史API，请优先使用《 删除云连接实例标签》或《 删除带宽包标签》。
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
     * 查询账户资源标签。此API为历史API，请优先使用《查询云连接实例的标签信息》、《查询带宽包的标签信息》。
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
     * 查询账户资源标签。此API为历史API，请优先使用《查询云连接实例的标签信息》、《查询带宽包的标签信息》。
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
     * 查询资源实例。此API为历史API，请优先使用《通过标签过滤云连接实例》、《通过标签过滤带宽包实例》。
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
     * 查询资源实例。此API为历史API，请优先使用《通过标签过滤云连接实例》、《通过标签过滤带宽包实例》。
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
     * 查询资源标签。此API为历史API，请优先使用《查询云连接实例的标签信息》、《查询带宽包的标签信息》。
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
     * 查询资源标签。此API为历史API，请优先使用《查询云连接实例的标签信息》、《查询带宽包的标签信息》。
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
