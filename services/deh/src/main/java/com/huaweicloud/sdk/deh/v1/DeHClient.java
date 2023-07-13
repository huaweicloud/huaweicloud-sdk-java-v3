package com.huaweicloud.sdk.deh.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.deh.v1.model.*;

public class DeHClient {

    protected HcClient hcClient;

    public DeHClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DeHClient> newBuilder() {
        return new ClientBuilder<>(DeHClient::new);
    }

    /**
     * 批量添加专属主机标签
     *
     * 为指定专属主机批量添加标签。
     * 
     * 标签管理服务（TMS）使用该接口批量添加专属主机的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateDedicatedHostTagsRequest 请求对象
     * @return BatchCreateDedicatedHostTagsResponse
     */
    public BatchCreateDedicatedHostTagsResponse batchCreateDedicatedHostTags(
        BatchCreateDedicatedHostTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DeHMeta.batchCreateDedicatedHostTags);
    }

    /**
     * 批量添加专属主机标签
     *
     * 为指定专属主机批量添加标签。
     * 
     * 标签管理服务（TMS）使用该接口批量添加专属主机的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateDedicatedHostTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateDedicatedHostTagsRequest, BatchCreateDedicatedHostTagsResponse>
     */
    public SyncInvoker<BatchCreateDedicatedHostTagsRequest, BatchCreateDedicatedHostTagsResponse> batchCreateDedicatedHostTagsInvoker(
        BatchCreateDedicatedHostTagsRequest request) {
        return new SyncInvoker<BatchCreateDedicatedHostTagsRequest, BatchCreateDedicatedHostTagsResponse>(request,
            DeHMeta.batchCreateDedicatedHostTags, hcClient);
    }

    /**
     * 批量删除专属主机标签
     *
     * 批量删除指定专属主机标签。
     * 
     * 标签管理服务（TMS）使用该接口批量删除专属主机的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteDedicatedHostTagsRequest 请求对象
     * @return BatchDeleteDedicatedHostTagsResponse
     */
    public BatchDeleteDedicatedHostTagsResponse batchDeleteDedicatedHostTags(
        BatchDeleteDedicatedHostTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DeHMeta.batchDeleteDedicatedHostTags);
    }

    /**
     * 批量删除专属主机标签
     *
     * 批量删除指定专属主机标签。
     * 
     * 标签管理服务（TMS）使用该接口批量删除专属主机的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteDedicatedHostTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteDedicatedHostTagsRequest, BatchDeleteDedicatedHostTagsResponse>
     */
    public SyncInvoker<BatchDeleteDedicatedHostTagsRequest, BatchDeleteDedicatedHostTagsResponse> batchDeleteDedicatedHostTagsInvoker(
        BatchDeleteDedicatedHostTagsRequest request) {
        return new SyncInvoker<BatchDeleteDedicatedHostTagsRequest, BatchDeleteDedicatedHostTagsResponse>(request,
            DeHMeta.batchDeleteDedicatedHostTags, hcClient);
    }

    /**
     * 分配专属主机
     *
     * 分配一台或多台专属主机，需要设置实例规格、所属AZ、数量等参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDedicatedHostRequest 请求对象
     * @return CreateDedicatedHostResponse
     */
    public CreateDedicatedHostResponse createDedicatedHost(CreateDedicatedHostRequest request) {
        return hcClient.syncInvokeHttp(request, DeHMeta.createDedicatedHost);
    }

    /**
     * 分配专属主机
     *
     * 分配一台或多台专属主机，需要设置实例规格、所属AZ、数量等参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDedicatedHostRequest 请求对象
     * @return SyncInvoker<CreateDedicatedHostRequest, CreateDedicatedHostResponse>
     */
    public SyncInvoker<CreateDedicatedHostRequest, CreateDedicatedHostResponse> createDedicatedHostInvoker(
        CreateDedicatedHostRequest request) {
        return new SyncInvoker<CreateDedicatedHostRequest, CreateDedicatedHostResponse>(request,
            DeHMeta.createDedicatedHost, hcClient);
    }

    /**
     * 释放专属主机
     *
     * 释放专属主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDedicatedHostRequest 请求对象
     * @return DeleteDedicatedHostResponse
     */
    public DeleteDedicatedHostResponse deleteDedicatedHost(DeleteDedicatedHostRequest request) {
        return hcClient.syncInvokeHttp(request, DeHMeta.deleteDedicatedHost);
    }

    /**
     * 释放专属主机
     *
     * 释放专属主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDedicatedHostRequest 请求对象
     * @return SyncInvoker<DeleteDedicatedHostRequest, DeleteDedicatedHostResponse>
     */
    public SyncInvoker<DeleteDedicatedHostRequest, DeleteDedicatedHostResponse> deleteDedicatedHostInvoker(
        DeleteDedicatedHostRequest request) {
        return new SyncInvoker<DeleteDedicatedHostRequest, DeleteDedicatedHostResponse>(request,
            DeHMeta.deleteDedicatedHost, hcClient);
    }

    /**
     * 查询可用的专属主机类型
     *
     * 查询某一AZ内可用的专属主机类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDedicatedHostTypesRequest 请求对象
     * @return ListDedicatedHostTypesResponse
     */
    public ListDedicatedHostTypesResponse listDedicatedHostTypes(ListDedicatedHostTypesRequest request) {
        return hcClient.syncInvokeHttp(request, DeHMeta.listDedicatedHostTypes);
    }

    /**
     * 查询可用的专属主机类型
     *
     * 查询某一AZ内可用的专属主机类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDedicatedHostTypesRequest 请求对象
     * @return SyncInvoker<ListDedicatedHostTypesRequest, ListDedicatedHostTypesResponse>
     */
    public SyncInvoker<ListDedicatedHostTypesRequest, ListDedicatedHostTypesResponse> listDedicatedHostTypesInvoker(
        ListDedicatedHostTypesRequest request) {
        return new SyncInvoker<ListDedicatedHostTypesRequest, ListDedicatedHostTypesResponse>(request,
            DeHMeta.listDedicatedHostTypes, hcClient);
    }

    /**
     * 查询专属主机列表
     *
     * 通过该接口查询专属主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDedicatedHostsRequest 请求对象
     * @return ListDedicatedHostsResponse
     */
    public ListDedicatedHostsResponse listDedicatedHosts(ListDedicatedHostsRequest request) {
        return hcClient.syncInvokeHttp(request, DeHMeta.listDedicatedHosts);
    }

    /**
     * 查询专属主机列表
     *
     * 通过该接口查询专属主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDedicatedHostsRequest 请求对象
     * @return SyncInvoker<ListDedicatedHostsRequest, ListDedicatedHostsResponse>
     */
    public SyncInvoker<ListDedicatedHostsRequest, ListDedicatedHostsResponse> listDedicatedHostsInvoker(
        ListDedicatedHostsRequest request) {
        return new SyncInvoker<ListDedicatedHostsRequest, ListDedicatedHostsResponse>(request,
            DeHMeta.listDedicatedHosts, hcClient);
    }

    /**
     * 按标签查询专属主机列表
     *
     * 使用标签过滤专属主机列表，并返回专属主机使用的所有标签。
     * 
     * 标签管理服务（TMS）使用该接口过滤专属主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDedicatedHostsByTagsRequest 请求对象
     * @return ListDedicatedHostsByTagsResponse
     */
    public ListDedicatedHostsByTagsResponse listDedicatedHostsByTags(ListDedicatedHostsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DeHMeta.listDedicatedHostsByTags);
    }

    /**
     * 按标签查询专属主机列表
     *
     * 使用标签过滤专属主机列表，并返回专属主机使用的所有标签。
     * 
     * 标签管理服务（TMS）使用该接口过滤专属主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDedicatedHostsByTagsRequest 请求对象
     * @return SyncInvoker<ListDedicatedHostsByTagsRequest, ListDedicatedHostsByTagsResponse>
     */
    public SyncInvoker<ListDedicatedHostsByTagsRequest, ListDedicatedHostsByTagsResponse> listDedicatedHostsByTagsInvoker(
        ListDedicatedHostsByTagsRequest request) {
        return new SyncInvoker<ListDedicatedHostsByTagsRequest, ListDedicatedHostsByTagsResponse>(request,
            DeHMeta.listDedicatedHostsByTags, hcClient);
    }

    /**
     * 查询专属主机上的云服务器
     *
     * 查询专属主机上已部署的云服务器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServersDedicatedHostRequest 请求对象
     * @return ListServersDedicatedHostResponse
     */
    public ListServersDedicatedHostResponse listServersDedicatedHost(ListServersDedicatedHostRequest request) {
        return hcClient.syncInvokeHttp(request, DeHMeta.listServersDedicatedHost);
    }

    /**
     * 查询专属主机上的云服务器
     *
     * 查询专属主机上已部署的云服务器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServersDedicatedHostRequest 请求对象
     * @return SyncInvoker<ListServersDedicatedHostRequest, ListServersDedicatedHostResponse>
     */
    public SyncInvoker<ListServersDedicatedHostRequest, ListServersDedicatedHostResponse> listServersDedicatedHostInvoker(
        ListServersDedicatedHostRequest request) {
        return new SyncInvoker<ListServersDedicatedHostRequest, ListServersDedicatedHostResponse>(request,
            DeHMeta.listServersDedicatedHost, hcClient);
    }

    /**
     * 查询专属主机详情
     *
     * 查询某一台专属主机的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDedicatedHostRequest 请求对象
     * @return ShowDedicatedHostResponse
     */
    public ShowDedicatedHostResponse showDedicatedHost(ShowDedicatedHostRequest request) {
        return hcClient.syncInvokeHttp(request, DeHMeta.showDedicatedHost);
    }

    /**
     * 查询专属主机详情
     *
     * 查询某一台专属主机的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDedicatedHostRequest 请求对象
     * @return SyncInvoker<ShowDedicatedHostRequest, ShowDedicatedHostResponse>
     */
    public SyncInvoker<ShowDedicatedHostRequest, ShowDedicatedHostResponse> showDedicatedHostInvoker(
        ShowDedicatedHostRequest request) {
        return new SyncInvoker<ShowDedicatedHostRequest, ShowDedicatedHostResponse>(request, DeHMeta.showDedicatedHost,
            hcClient);
    }

    /**
     * 查询指定专属主机标签
     *
     * 查询指定专属主机的标签信息。
     * 
     * 标签管理服务（TMS）使用该接口查询指定专属主机的全部标签数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDedicatedHostTagsRequest 请求对象
     * @return ShowDedicatedHostTagsResponse
     */
    public ShowDedicatedHostTagsResponse showDedicatedHostTags(ShowDedicatedHostTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DeHMeta.showDedicatedHostTags);
    }

    /**
     * 查询指定专属主机标签
     *
     * 查询指定专属主机的标签信息。
     * 
     * 标签管理服务（TMS）使用该接口查询指定专属主机的全部标签数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDedicatedHostTagsRequest 请求对象
     * @return SyncInvoker<ShowDedicatedHostTagsRequest, ShowDedicatedHostTagsResponse>
     */
    public SyncInvoker<ShowDedicatedHostTagsRequest, ShowDedicatedHostTagsResponse> showDedicatedHostTagsInvoker(
        ShowDedicatedHostTagsRequest request) {
        return new SyncInvoker<ShowDedicatedHostTagsRequest, ShowDedicatedHostTagsResponse>(request,
            DeHMeta.showDedicatedHostTags, hcClient);
    }

    /**
     * 查询租户的专属主机配额
     *
     * 该接口用于查询租户的专属主机配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotaSetsRequest 请求对象
     * @return ShowQuotaSetsResponse
     */
    public ShowQuotaSetsResponse showQuotaSets(ShowQuotaSetsRequest request) {
        return hcClient.syncInvokeHttp(request, DeHMeta.showQuotaSets);
    }

    /**
     * 查询租户的专属主机配额
     *
     * 该接口用于查询租户的专属主机配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotaSetsRequest 请求对象
     * @return SyncInvoker<ShowQuotaSetsRequest, ShowQuotaSetsResponse>
     */
    public SyncInvoker<ShowQuotaSetsRequest, ShowQuotaSetsResponse> showQuotaSetsInvoker(ShowQuotaSetsRequest request) {
        return new SyncInvoker<ShowQuotaSetsRequest, ShowQuotaSetsResponse>(request, DeHMeta.showQuotaSets, hcClient);
    }

    /**
     * 更新专属主机属性
     *
     * 该接口用于变更专属主机的“auto_placement”和“name”属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDedicatedHostRequest 请求对象
     * @return UpdateDedicatedHostResponse
     */
    public UpdateDedicatedHostResponse updateDedicatedHost(UpdateDedicatedHostRequest request) {
        return hcClient.syncInvokeHttp(request, DeHMeta.updateDedicatedHost);
    }

    /**
     * 更新专属主机属性
     *
     * 该接口用于变更专属主机的“auto_placement”和“name”属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDedicatedHostRequest 请求对象
     * @return SyncInvoker<UpdateDedicatedHostRequest, UpdateDedicatedHostResponse>
     */
    public SyncInvoker<UpdateDedicatedHostRequest, UpdateDedicatedHostResponse> updateDedicatedHostInvoker(
        UpdateDedicatedHostRequest request) {
        return new SyncInvoker<UpdateDedicatedHostRequest, UpdateDedicatedHostResponse>(request,
            DeHMeta.updateDedicatedHost, hcClient);
    }

}
