package com.huaweicloud.sdk.ga.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.ga.v1.model.*;

public class GaClient {

    protected HcClient hcClient;

    public GaClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GaClient> newBuilder() {
        return new ClientBuilder<>(GaClient::new);
    }

    /**
     * 创建全球加速器
     *
     * 创建全球加速器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAcceleratorRequest 请求对象
     * @return CreateAcceleratorResponse
     */
    public CreateAcceleratorResponse createAccelerator(CreateAcceleratorRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.createAccelerator);
    }

    /**
     * 创建全球加速器
     *
     * 创建全球加速器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAcceleratorRequest 请求对象
     * @return SyncInvoker<CreateAcceleratorRequest, CreateAcceleratorResponse>
     */
    public SyncInvoker<CreateAcceleratorRequest, CreateAcceleratorResponse> createAcceleratorInvoker(
        CreateAcceleratorRequest request) {
        return new SyncInvoker<CreateAcceleratorRequest, CreateAcceleratorResponse>(request, GaMeta.createAccelerator,
            hcClient);
    }

    /**
     * 删除全球加速器
     *
     * 删除全球加速器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAcceleratorRequest 请求对象
     * @return DeleteAcceleratorResponse
     */
    public DeleteAcceleratorResponse deleteAccelerator(DeleteAcceleratorRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.deleteAccelerator);
    }

    /**
     * 删除全球加速器
     *
     * 删除全球加速器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAcceleratorRequest 请求对象
     * @return SyncInvoker<DeleteAcceleratorRequest, DeleteAcceleratorResponse>
     */
    public SyncInvoker<DeleteAcceleratorRequest, DeleteAcceleratorResponse> deleteAcceleratorInvoker(
        DeleteAcceleratorRequest request) {
        return new SyncInvoker<DeleteAcceleratorRequest, DeleteAcceleratorResponse>(request, GaMeta.deleteAccelerator,
            hcClient);
    }

    /**
     * 查询全球加速器列表
     *
     * 查询全球加速器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAcceleratorsRequest 请求对象
     * @return ListAcceleratorsResponse
     */
    public ListAcceleratorsResponse listAccelerators(ListAcceleratorsRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.listAccelerators);
    }

    /**
     * 查询全球加速器列表
     *
     * 查询全球加速器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAcceleratorsRequest 请求对象
     * @return SyncInvoker<ListAcceleratorsRequest, ListAcceleratorsResponse>
     */
    public SyncInvoker<ListAcceleratorsRequest, ListAcceleratorsResponse> listAcceleratorsInvoker(
        ListAcceleratorsRequest request) {
        return new SyncInvoker<ListAcceleratorsRequest, ListAcceleratorsResponse>(request, GaMeta.listAccelerators,
            hcClient);
    }

    /**
     * 查询全球加速器详情
     *
     * 查询全球加速器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAcceleratorRequest 请求对象
     * @return ShowAcceleratorResponse
     */
    public ShowAcceleratorResponse showAccelerator(ShowAcceleratorRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.showAccelerator);
    }

    /**
     * 查询全球加速器详情
     *
     * 查询全球加速器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAcceleratorRequest 请求对象
     * @return SyncInvoker<ShowAcceleratorRequest, ShowAcceleratorResponse>
     */
    public SyncInvoker<ShowAcceleratorRequest, ShowAcceleratorResponse> showAcceleratorInvoker(
        ShowAcceleratorRequest request) {
        return new SyncInvoker<ShowAcceleratorRequest, ShowAcceleratorResponse>(request, GaMeta.showAccelerator,
            hcClient);
    }

    /**
     * 更新全球加速器
     *
     * 更新全球加速器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAcceleratorRequest 请求对象
     * @return UpdateAcceleratorResponse
     */
    public UpdateAcceleratorResponse updateAccelerator(UpdateAcceleratorRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.updateAccelerator);
    }

    /**
     * 更新全球加速器
     *
     * 更新全球加速器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAcceleratorRequest 请求对象
     * @return SyncInvoker<UpdateAcceleratorRequest, UpdateAcceleratorResponse>
     */
    public SyncInvoker<UpdateAcceleratorRequest, UpdateAcceleratorResponse> updateAcceleratorInvoker(
        UpdateAcceleratorRequest request) {
        return new SyncInvoker<UpdateAcceleratorRequest, UpdateAcceleratorResponse>(request, GaMeta.updateAccelerator,
            hcClient);
    }

    /**
     * 创建终端节点
     *
     * 创建终端节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEndpointRequest 请求对象
     * @return CreateEndpointResponse
     */
    public CreateEndpointResponse createEndpoint(CreateEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.createEndpoint);
    }

    /**
     * 创建终端节点
     *
     * 创建终端节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEndpointRequest 请求对象
     * @return SyncInvoker<CreateEndpointRequest, CreateEndpointResponse>
     */
    public SyncInvoker<CreateEndpointRequest, CreateEndpointResponse> createEndpointInvoker(
        CreateEndpointRequest request) {
        return new SyncInvoker<CreateEndpointRequest, CreateEndpointResponse>(request, GaMeta.createEndpoint, hcClient);
    }

    /**
     * 删除终端节点
     *
     * 删除终端节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEndpointRequest 请求对象
     * @return DeleteEndpointResponse
     */
    public DeleteEndpointResponse deleteEndpoint(DeleteEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.deleteEndpoint);
    }

    /**
     * 删除终端节点
     *
     * 删除终端节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEndpointRequest 请求对象
     * @return SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>
     */
    public SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpointInvoker(
        DeleteEndpointRequest request) {
        return new SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>(request, GaMeta.deleteEndpoint, hcClient);
    }

    /**
     * 查询终端节点组下终端节点列表
     *
     * 查询终端节点组下终端节点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEndpointsRequest 请求对象
     * @return ListEndpointsResponse
     */
    public ListEndpointsResponse listEndpoints(ListEndpointsRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.listEndpoints);
    }

    /**
     * 查询终端节点组下终端节点列表
     *
     * 查询终端节点组下终端节点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEndpointsRequest 请求对象
     * @return SyncInvoker<ListEndpointsRequest, ListEndpointsResponse>
     */
    public SyncInvoker<ListEndpointsRequest, ListEndpointsResponse> listEndpointsInvoker(ListEndpointsRequest request) {
        return new SyncInvoker<ListEndpointsRequest, ListEndpointsResponse>(request, GaMeta.listEndpoints, hcClient);
    }

    /**
     * 查询终端节点详情
     *
     * 查询终端节点详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEndpointRequest 请求对象
     * @return ShowEndpointResponse
     */
    public ShowEndpointResponse showEndpoint(ShowEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.showEndpoint);
    }

    /**
     * 查询终端节点详情
     *
     * 查询终端节点详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEndpointRequest 请求对象
     * @return SyncInvoker<ShowEndpointRequest, ShowEndpointResponse>
     */
    public SyncInvoker<ShowEndpointRequest, ShowEndpointResponse> showEndpointInvoker(ShowEndpointRequest request) {
        return new SyncInvoker<ShowEndpointRequest, ShowEndpointResponse>(request, GaMeta.showEndpoint, hcClient);
    }

    /**
     * 更新终端节点
     *
     * 更新终端节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointRequest 请求对象
     * @return UpdateEndpointResponse
     */
    public UpdateEndpointResponse updateEndpoint(UpdateEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.updateEndpoint);
    }

    /**
     * 更新终端节点
     *
     * 更新终端节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointRequest 请求对象
     * @return SyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse>
     */
    public SyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse> updateEndpointInvoker(
        UpdateEndpointRequest request) {
        return new SyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse>(request, GaMeta.updateEndpoint, hcClient);
    }

    /**
     * 创建终端节点组
     *
     * 创建终端节点组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEndpointGroupRequest 请求对象
     * @return CreateEndpointGroupResponse
     */
    public CreateEndpointGroupResponse createEndpointGroup(CreateEndpointGroupRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.createEndpointGroup);
    }

    /**
     * 创建终端节点组
     *
     * 创建终端节点组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEndpointGroupRequest 请求对象
     * @return SyncInvoker<CreateEndpointGroupRequest, CreateEndpointGroupResponse>
     */
    public SyncInvoker<CreateEndpointGroupRequest, CreateEndpointGroupResponse> createEndpointGroupInvoker(
        CreateEndpointGroupRequest request) {
        return new SyncInvoker<CreateEndpointGroupRequest, CreateEndpointGroupResponse>(request,
            GaMeta.createEndpointGroup, hcClient);
    }

    /**
     * 删除终端节点组
     *
     * 删除终端节点组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEndpointGroupRequest 请求对象
     * @return DeleteEndpointGroupResponse
     */
    public DeleteEndpointGroupResponse deleteEndpointGroup(DeleteEndpointGroupRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.deleteEndpointGroup);
    }

    /**
     * 删除终端节点组
     *
     * 删除终端节点组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEndpointGroupRequest 请求对象
     * @return SyncInvoker<DeleteEndpointGroupRequest, DeleteEndpointGroupResponse>
     */
    public SyncInvoker<DeleteEndpointGroupRequest, DeleteEndpointGroupResponse> deleteEndpointGroupInvoker(
        DeleteEndpointGroupRequest request) {
        return new SyncInvoker<DeleteEndpointGroupRequest, DeleteEndpointGroupResponse>(request,
            GaMeta.deleteEndpointGroup, hcClient);
    }

    /**
     * 查询终端节点组列表
     *
     * 查询终端节点组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEndpointGroupsRequest 请求对象
     * @return ListEndpointGroupsResponse
     */
    public ListEndpointGroupsResponse listEndpointGroups(ListEndpointGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.listEndpointGroups);
    }

    /**
     * 查询终端节点组列表
     *
     * 查询终端节点组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEndpointGroupsRequest 请求对象
     * @return SyncInvoker<ListEndpointGroupsRequest, ListEndpointGroupsResponse>
     */
    public SyncInvoker<ListEndpointGroupsRequest, ListEndpointGroupsResponse> listEndpointGroupsInvoker(
        ListEndpointGroupsRequest request) {
        return new SyncInvoker<ListEndpointGroupsRequest, ListEndpointGroupsResponse>(request,
            GaMeta.listEndpointGroups, hcClient);
    }

    /**
     * 查询终端节点组详情
     *
     * 查询终端节点组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEndpointGroupRequest 请求对象
     * @return ShowEndpointGroupResponse
     */
    public ShowEndpointGroupResponse showEndpointGroup(ShowEndpointGroupRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.showEndpointGroup);
    }

    /**
     * 查询终端节点组详情
     *
     * 查询终端节点组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEndpointGroupRequest 请求对象
     * @return SyncInvoker<ShowEndpointGroupRequest, ShowEndpointGroupResponse>
     */
    public SyncInvoker<ShowEndpointGroupRequest, ShowEndpointGroupResponse> showEndpointGroupInvoker(
        ShowEndpointGroupRequest request) {
        return new SyncInvoker<ShowEndpointGroupRequest, ShowEndpointGroupResponse>(request, GaMeta.showEndpointGroup,
            hcClient);
    }

    /**
     * 更新终端节点组
     *
     * 更新终端节点组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointGroupRequest 请求对象
     * @return UpdateEndpointGroupResponse
     */
    public UpdateEndpointGroupResponse updateEndpointGroup(UpdateEndpointGroupRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.updateEndpointGroup);
    }

    /**
     * 更新终端节点组
     *
     * 更新终端节点组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointGroupRequest 请求对象
     * @return SyncInvoker<UpdateEndpointGroupRequest, UpdateEndpointGroupResponse>
     */
    public SyncInvoker<UpdateEndpointGroupRequest, UpdateEndpointGroupResponse> updateEndpointGroupInvoker(
        UpdateEndpointGroupRequest request) {
        return new SyncInvoker<UpdateEndpointGroupRequest, UpdateEndpointGroupResponse>(request,
            GaMeta.updateEndpointGroup, hcClient);
    }

    /**
     * 创建健康检查
     *
     * 创建健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateHealthCheckRequest 请求对象
     * @return CreateHealthCheckResponse
     */
    public CreateHealthCheckResponse createHealthCheck(CreateHealthCheckRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.createHealthCheck);
    }

    /**
     * 创建健康检查
     *
     * 创建健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateHealthCheckRequest 请求对象
     * @return SyncInvoker<CreateHealthCheckRequest, CreateHealthCheckResponse>
     */
    public SyncInvoker<CreateHealthCheckRequest, CreateHealthCheckResponse> createHealthCheckInvoker(
        CreateHealthCheckRequest request) {
        return new SyncInvoker<CreateHealthCheckRequest, CreateHealthCheckResponse>(request, GaMeta.createHealthCheck,
            hcClient);
    }

    /**
     * 删除健康检查
     *
     * 删除健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHealthCheckRequest 请求对象
     * @return DeleteHealthCheckResponse
     */
    public DeleteHealthCheckResponse deleteHealthCheck(DeleteHealthCheckRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.deleteHealthCheck);
    }

    /**
     * 删除健康检查
     *
     * 删除健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHealthCheckRequest 请求对象
     * @return SyncInvoker<DeleteHealthCheckRequest, DeleteHealthCheckResponse>
     */
    public SyncInvoker<DeleteHealthCheckRequest, DeleteHealthCheckResponse> deleteHealthCheckInvoker(
        DeleteHealthCheckRequest request) {
        return new SyncInvoker<DeleteHealthCheckRequest, DeleteHealthCheckResponse>(request, GaMeta.deleteHealthCheck,
            hcClient);
    }

    /**
     * 查询健康检查列表
     *
     * 查询健康检查列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHealthChecksRequest 请求对象
     * @return ListHealthChecksResponse
     */
    public ListHealthChecksResponse listHealthChecks(ListHealthChecksRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.listHealthChecks);
    }

    /**
     * 查询健康检查列表
     *
     * 查询健康检查列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHealthChecksRequest 请求对象
     * @return SyncInvoker<ListHealthChecksRequest, ListHealthChecksResponse>
     */
    public SyncInvoker<ListHealthChecksRequest, ListHealthChecksResponse> listHealthChecksInvoker(
        ListHealthChecksRequest request) {
        return new SyncInvoker<ListHealthChecksRequest, ListHealthChecksResponse>(request, GaMeta.listHealthChecks,
            hcClient);
    }

    /**
     * 查询健康检查详情
     *
     * 查询健康检查详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHealthCheckRequest 请求对象
     * @return ShowHealthCheckResponse
     */
    public ShowHealthCheckResponse showHealthCheck(ShowHealthCheckRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.showHealthCheck);
    }

    /**
     * 查询健康检查详情
     *
     * 查询健康检查详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHealthCheckRequest 请求对象
     * @return SyncInvoker<ShowHealthCheckRequest, ShowHealthCheckResponse>
     */
    public SyncInvoker<ShowHealthCheckRequest, ShowHealthCheckResponse> showHealthCheckInvoker(
        ShowHealthCheckRequest request) {
        return new SyncInvoker<ShowHealthCheckRequest, ShowHealthCheckResponse>(request, GaMeta.showHealthCheck,
            hcClient);
    }

    /**
     * 更新健康检查
     *
     * 更新健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHealthCheckRequest 请求对象
     * @return UpdateHealthCheckResponse
     */
    public UpdateHealthCheckResponse updateHealthCheck(UpdateHealthCheckRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.updateHealthCheck);
    }

    /**
     * 更新健康检查
     *
     * 更新健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHealthCheckRequest 请求对象
     * @return SyncInvoker<UpdateHealthCheckRequest, UpdateHealthCheckResponse>
     */
    public SyncInvoker<UpdateHealthCheckRequest, UpdateHealthCheckResponse> updateHealthCheckInvoker(
        UpdateHealthCheckRequest request) {
        return new SyncInvoker<UpdateHealthCheckRequest, UpdateHealthCheckResponse>(request, GaMeta.updateHealthCheck,
            hcClient);
    }

    /**
     * 创建监听器
     *
     * 创建监听器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateListenerRequest 请求对象
     * @return CreateListenerResponse
     */
    public CreateListenerResponse createListener(CreateListenerRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.createListener);
    }

    /**
     * 创建监听器
     *
     * 创建监听器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateListenerRequest 请求对象
     * @return SyncInvoker<CreateListenerRequest, CreateListenerResponse>
     */
    public SyncInvoker<CreateListenerRequest, CreateListenerResponse> createListenerInvoker(
        CreateListenerRequest request) {
        return new SyncInvoker<CreateListenerRequest, CreateListenerResponse>(request, GaMeta.createListener, hcClient);
    }

    /**
     * 删除监听器
     *
     * 删除监听器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteListenerRequest 请求对象
     * @return DeleteListenerResponse
     */
    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.deleteListener);
    }

    /**
     * 删除监听器
     *
     * 删除监听器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteListenerRequest 请求对象
     * @return SyncInvoker<DeleteListenerRequest, DeleteListenerResponse>
     */
    public SyncInvoker<DeleteListenerRequest, DeleteListenerResponse> deleteListenerInvoker(
        DeleteListenerRequest request) {
        return new SyncInvoker<DeleteListenerRequest, DeleteListenerResponse>(request, GaMeta.deleteListener, hcClient);
    }

    /**
     * 查询监听器列表
     *
     * 查询监听器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListListenersRequest 请求对象
     * @return ListListenersResponse
     */
    public ListListenersResponse listListeners(ListListenersRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.listListeners);
    }

    /**
     * 查询监听器列表
     *
     * 查询监听器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListListenersRequest 请求对象
     * @return SyncInvoker<ListListenersRequest, ListListenersResponse>
     */
    public SyncInvoker<ListListenersRequest, ListListenersResponse> listListenersInvoker(ListListenersRequest request) {
        return new SyncInvoker<ListListenersRequest, ListListenersResponse>(request, GaMeta.listListeners, hcClient);
    }

    /**
     * 查询监听器详情
     *
     * 查询监听器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowListenerRequest 请求对象
     * @return ShowListenerResponse
     */
    public ShowListenerResponse showListener(ShowListenerRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.showListener);
    }

    /**
     * 查询监听器详情
     *
     * 查询监听器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowListenerRequest 请求对象
     * @return SyncInvoker<ShowListenerRequest, ShowListenerResponse>
     */
    public SyncInvoker<ShowListenerRequest, ShowListenerResponse> showListenerInvoker(ShowListenerRequest request) {
        return new SyncInvoker<ShowListenerRequest, ShowListenerResponse>(request, GaMeta.showListener, hcClient);
    }

    /**
     * 更新监听器
     *
     * 更新监听器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateListenerRequest 请求对象
     * @return UpdateListenerResponse
     */
    public UpdateListenerResponse updateListener(UpdateListenerRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.updateListener);
    }

    /**
     * 更新监听器
     *
     * 更新监听器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateListenerRequest 请求对象
     * @return SyncInvoker<UpdateListenerRequest, UpdateListenerResponse>
     */
    public SyncInvoker<UpdateListenerRequest, UpdateListenerResponse> updateListenerInvoker(
        UpdateListenerRequest request) {
        return new SyncInvoker<UpdateListenerRequest, UpdateListenerResponse>(request, GaMeta.updateListener, hcClient);
    }

    /**
     * 查询区域列表
     *
     * 查询区域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRegionsRequest 请求对象
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions(ListRegionsRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.listRegions);
    }

    /**
     * 查询区域列表
     *
     * 查询区域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRegionsRequest 请求对象
     * @return SyncInvoker<ListRegionsRequest, ListRegionsResponse>
     */
    public SyncInvoker<ListRegionsRequest, ListRegionsResponse> listRegionsInvoker(ListRegionsRequest request) {
        return new SyncInvoker<ListRegionsRequest, ListRegionsResponse>(request, GaMeta.listRegions, hcClient);
    }

}
