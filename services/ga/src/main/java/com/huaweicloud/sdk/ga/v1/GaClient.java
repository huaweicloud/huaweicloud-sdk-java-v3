package com.huaweicloud.sdk.ga.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.ga.v1.model.AddIpGroupIpRequest;
import com.huaweicloud.sdk.ga.v1.model.AddIpGroupIpResponse;
import com.huaweicloud.sdk.ga.v1.model.AssociateListenerRequest;
import com.huaweicloud.sdk.ga.v1.model.AssociateListenerResponse;
import com.huaweicloud.sdk.ga.v1.model.CountResourcesByTagRequest;
import com.huaweicloud.sdk.ga.v1.model.CountResourcesByTagResponse;
import com.huaweicloud.sdk.ga.v1.model.CreateAcceleratorRequest;
import com.huaweicloud.sdk.ga.v1.model.CreateAcceleratorResponse;
import com.huaweicloud.sdk.ga.v1.model.CreateEndpointGroupRequest;
import com.huaweicloud.sdk.ga.v1.model.CreateEndpointGroupResponse;
import com.huaweicloud.sdk.ga.v1.model.CreateEndpointRequest;
import com.huaweicloud.sdk.ga.v1.model.CreateEndpointResponse;
import com.huaweicloud.sdk.ga.v1.model.CreateHealthCheckRequest;
import com.huaweicloud.sdk.ga.v1.model.CreateHealthCheckResponse;
import com.huaweicloud.sdk.ga.v1.model.CreateIpGroupRequest;
import com.huaweicloud.sdk.ga.v1.model.CreateIpGroupResponse;
import com.huaweicloud.sdk.ga.v1.model.CreateListenerRequest;
import com.huaweicloud.sdk.ga.v1.model.CreateListenerResponse;
import com.huaweicloud.sdk.ga.v1.model.CreateLogtankRequest;
import com.huaweicloud.sdk.ga.v1.model.CreateLogtankResponse;
import com.huaweicloud.sdk.ga.v1.model.CreateTagsRequest;
import com.huaweicloud.sdk.ga.v1.model.CreateTagsResponse;
import com.huaweicloud.sdk.ga.v1.model.DeleteAcceleratorRequest;
import com.huaweicloud.sdk.ga.v1.model.DeleteAcceleratorResponse;
import com.huaweicloud.sdk.ga.v1.model.DeleteEndpointGroupRequest;
import com.huaweicloud.sdk.ga.v1.model.DeleteEndpointGroupResponse;
import com.huaweicloud.sdk.ga.v1.model.DeleteEndpointRequest;
import com.huaweicloud.sdk.ga.v1.model.DeleteEndpointResponse;
import com.huaweicloud.sdk.ga.v1.model.DeleteHealthCheckRequest;
import com.huaweicloud.sdk.ga.v1.model.DeleteHealthCheckResponse;
import com.huaweicloud.sdk.ga.v1.model.DeleteIpGroupRequest;
import com.huaweicloud.sdk.ga.v1.model.DeleteIpGroupResponse;
import com.huaweicloud.sdk.ga.v1.model.DeleteListenerRequest;
import com.huaweicloud.sdk.ga.v1.model.DeleteListenerResponse;
import com.huaweicloud.sdk.ga.v1.model.DeleteLogtankRequest;
import com.huaweicloud.sdk.ga.v1.model.DeleteLogtankResponse;
import com.huaweicloud.sdk.ga.v1.model.DeleteTagsRequest;
import com.huaweicloud.sdk.ga.v1.model.DeleteTagsResponse;
import com.huaweicloud.sdk.ga.v1.model.DisassociateListenerRequest;
import com.huaweicloud.sdk.ga.v1.model.DisassociateListenerResponse;
import com.huaweicloud.sdk.ga.v1.model.ListAcceleratorsRequest;
import com.huaweicloud.sdk.ga.v1.model.ListAcceleratorsResponse;
import com.huaweicloud.sdk.ga.v1.model.ListAllPopsRequest;
import com.huaweicloud.sdk.ga.v1.model.ListAllPopsResponse;
import com.huaweicloud.sdk.ga.v1.model.ListEndpointGroupsRequest;
import com.huaweicloud.sdk.ga.v1.model.ListEndpointGroupsResponse;
import com.huaweicloud.sdk.ga.v1.model.ListEndpointsRequest;
import com.huaweicloud.sdk.ga.v1.model.ListEndpointsResponse;
import com.huaweicloud.sdk.ga.v1.model.ListHealthChecksRequest;
import com.huaweicloud.sdk.ga.v1.model.ListHealthChecksResponse;
import com.huaweicloud.sdk.ga.v1.model.ListIpGroupsRequest;
import com.huaweicloud.sdk.ga.v1.model.ListIpGroupsResponse;
import com.huaweicloud.sdk.ga.v1.model.ListListenersRequest;
import com.huaweicloud.sdk.ga.v1.model.ListListenersResponse;
import com.huaweicloud.sdk.ga.v1.model.ListLogtanksRequest;
import com.huaweicloud.sdk.ga.v1.model.ListLogtanksResponse;
import com.huaweicloud.sdk.ga.v1.model.ListRegionsRequest;
import com.huaweicloud.sdk.ga.v1.model.ListRegionsResponse;
import com.huaweicloud.sdk.ga.v1.model.ListResourcesByTagRequest;
import com.huaweicloud.sdk.ga.v1.model.ListResourcesByTagResponse;
import com.huaweicloud.sdk.ga.v1.model.ListTagsRequest;
import com.huaweicloud.sdk.ga.v1.model.ListTagsResponse;
import com.huaweicloud.sdk.ga.v1.model.ListTenantQuotasRequest;
import com.huaweicloud.sdk.ga.v1.model.ListTenantQuotasResponse;
import com.huaweicloud.sdk.ga.v1.model.RemoveIpGroupIpRequest;
import com.huaweicloud.sdk.ga.v1.model.RemoveIpGroupIpResponse;
import com.huaweicloud.sdk.ga.v1.model.ShowAcceleratorRequest;
import com.huaweicloud.sdk.ga.v1.model.ShowAcceleratorResponse;
import com.huaweicloud.sdk.ga.v1.model.ShowEndpointGroupRequest;
import com.huaweicloud.sdk.ga.v1.model.ShowEndpointGroupResponse;
import com.huaweicloud.sdk.ga.v1.model.ShowEndpointRequest;
import com.huaweicloud.sdk.ga.v1.model.ShowEndpointResponse;
import com.huaweicloud.sdk.ga.v1.model.ShowHealthCheckRequest;
import com.huaweicloud.sdk.ga.v1.model.ShowHealthCheckResponse;
import com.huaweicloud.sdk.ga.v1.model.ShowIpGroupRequest;
import com.huaweicloud.sdk.ga.v1.model.ShowIpGroupResponse;
import com.huaweicloud.sdk.ga.v1.model.ShowListenerRequest;
import com.huaweicloud.sdk.ga.v1.model.ShowListenerResponse;
import com.huaweicloud.sdk.ga.v1.model.ShowLogtankRequest;
import com.huaweicloud.sdk.ga.v1.model.ShowLogtankResponse;
import com.huaweicloud.sdk.ga.v1.model.ShowResourceTagsRequest;
import com.huaweicloud.sdk.ga.v1.model.ShowResourceTagsResponse;
import com.huaweicloud.sdk.ga.v1.model.UpdateAcceleratorRequest;
import com.huaweicloud.sdk.ga.v1.model.UpdateAcceleratorResponse;
import com.huaweicloud.sdk.ga.v1.model.UpdateEndpointGroupRequest;
import com.huaweicloud.sdk.ga.v1.model.UpdateEndpointGroupResponse;
import com.huaweicloud.sdk.ga.v1.model.UpdateEndpointRequest;
import com.huaweicloud.sdk.ga.v1.model.UpdateEndpointResponse;
import com.huaweicloud.sdk.ga.v1.model.UpdateHealthCheckRequest;
import com.huaweicloud.sdk.ga.v1.model.UpdateHealthCheckResponse;
import com.huaweicloud.sdk.ga.v1.model.UpdateIpGroupRequest;
import com.huaweicloud.sdk.ga.v1.model.UpdateIpGroupResponse;
import com.huaweicloud.sdk.ga.v1.model.UpdateListenerRequest;
import com.huaweicloud.sdk.ga.v1.model.UpdateListenerResponse;
import com.huaweicloud.sdk.ga.v1.model.UpdateLogtankRequest;
import com.huaweicloud.sdk.ga.v1.model.UpdateLogtankResponse;

public class GaClient {

    protected HcClient hcClient;

    public GaClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GaClient> newBuilder() {
        ClientBuilder<GaClient> clientBuilder = new ClientBuilder<>(GaClient::new);
        return clientBuilder;
    }

    /**
     * 创建全球加速器
     *
     * 创建全球加速器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAcceleratorRequest 请求对象
     * @return CreateAcceleratorResponse
     */
    public CreateAcceleratorResponse createAccelerator(CreateAcceleratorRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.createAccelerator);
    }

    /**
     * 创建全球加速器
     *
     * 创建全球加速器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAcceleratorRequest 请求对象
     * @return SyncInvoker<CreateAcceleratorRequest, CreateAcceleratorResponse>
     */
    public SyncInvoker<CreateAcceleratorRequest, CreateAcceleratorResponse> createAcceleratorInvoker(
        CreateAcceleratorRequest request) {
        return new SyncInvoker<>(request, GaMeta.createAccelerator, hcClient);
    }

    /**
     * 删除全球加速器
     *
     * 删除全球加速器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAcceleratorRequest 请求对象
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
     * @param request DeleteAcceleratorRequest 请求对象
     * @return SyncInvoker<DeleteAcceleratorRequest, DeleteAcceleratorResponse>
     */
    public SyncInvoker<DeleteAcceleratorRequest, DeleteAcceleratorResponse> deleteAcceleratorInvoker(
        DeleteAcceleratorRequest request) {
        return new SyncInvoker<>(request, GaMeta.deleteAccelerator, hcClient);
    }

    /**
     * 查询全球加速器列表
     *
     * 查询全球加速器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAcceleratorsRequest 请求对象
     * @return ListAcceleratorsResponse
     */
    public ListAcceleratorsResponse listAccelerators(ListAcceleratorsRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.listAccelerators);
    }

    /**
     * 查询全球加速器列表
     *
     * 查询全球加速器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAcceleratorsRequest 请求对象
     * @return SyncInvoker<ListAcceleratorsRequest, ListAcceleratorsResponse>
     */
    public SyncInvoker<ListAcceleratorsRequest, ListAcceleratorsResponse> listAcceleratorsInvoker(
        ListAcceleratorsRequest request) {
        return new SyncInvoker<>(request, GaMeta.listAccelerators, hcClient);
    }

    /**
     * 查询全球加速器详情
     *
     * 查询全球加速器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAcceleratorRequest 请求对象
     * @return ShowAcceleratorResponse
     */
    public ShowAcceleratorResponse showAccelerator(ShowAcceleratorRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.showAccelerator);
    }

    /**
     * 查询全球加速器详情
     *
     * 查询全球加速器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAcceleratorRequest 请求对象
     * @return SyncInvoker<ShowAcceleratorRequest, ShowAcceleratorResponse>
     */
    public SyncInvoker<ShowAcceleratorRequest, ShowAcceleratorResponse> showAcceleratorInvoker(
        ShowAcceleratorRequest request) {
        return new SyncInvoker<>(request, GaMeta.showAccelerator, hcClient);
    }

    /**
     * 更新全球加速器
     *
     * 更新全球加速器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAcceleratorRequest 请求对象
     * @return UpdateAcceleratorResponse
     */
    public UpdateAcceleratorResponse updateAccelerator(UpdateAcceleratorRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.updateAccelerator);
    }

    /**
     * 更新全球加速器
     *
     * 更新全球加速器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAcceleratorRequest 请求对象
     * @return SyncInvoker<UpdateAcceleratorRequest, UpdateAcceleratorResponse>
     */
    public SyncInvoker<UpdateAcceleratorRequest, UpdateAcceleratorResponse> updateAcceleratorInvoker(
        UpdateAcceleratorRequest request) {
        return new SyncInvoker<>(request, GaMeta.updateAccelerator, hcClient);
    }

    /**
     * 创建终端节点
     *
     * 创建终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return CreateEndpointResponse
     */
    public CreateEndpointResponse createEndpoint(CreateEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.createEndpoint);
    }

    /**
     * 创建终端节点
     *
     * 创建终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return SyncInvoker<CreateEndpointRequest, CreateEndpointResponse>
     */
    public SyncInvoker<CreateEndpointRequest, CreateEndpointResponse> createEndpointInvoker(
        CreateEndpointRequest request) {
        return new SyncInvoker<>(request, GaMeta.createEndpoint, hcClient);
    }

    /**
     * 删除终端节点
     *
     * 删除终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointRequest 请求对象
     * @return DeleteEndpointResponse
     */
    public DeleteEndpointResponse deleteEndpoint(DeleteEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.deleteEndpoint);
    }

    /**
     * 删除终端节点
     *
     * 删除终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointRequest 请求对象
     * @return SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>
     */
    public SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpointInvoker(
        DeleteEndpointRequest request) {
        return new SyncInvoker<>(request, GaMeta.deleteEndpoint, hcClient);
    }

    /**
     * 查询终端节点组下终端节点列表
     *
     * 查询终端节点组下终端节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return ListEndpointsResponse
     */
    public ListEndpointsResponse listEndpoints(ListEndpointsRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.listEndpoints);
    }

    /**
     * 查询终端节点组下终端节点列表
     *
     * 查询终端节点组下终端节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return SyncInvoker<ListEndpointsRequest, ListEndpointsResponse>
     */
    public SyncInvoker<ListEndpointsRequest, ListEndpointsResponse> listEndpointsInvoker(ListEndpointsRequest request) {
        return new SyncInvoker<>(request, GaMeta.listEndpoints, hcClient);
    }

    /**
     * 查询终端节点详情
     *
     * 查询终端节点详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEndpointRequest 请求对象
     * @return ShowEndpointResponse
     */
    public ShowEndpointResponse showEndpoint(ShowEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.showEndpoint);
    }

    /**
     * 查询终端节点详情
     *
     * 查询终端节点详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEndpointRequest 请求对象
     * @return SyncInvoker<ShowEndpointRequest, ShowEndpointResponse>
     */
    public SyncInvoker<ShowEndpointRequest, ShowEndpointResponse> showEndpointInvoker(ShowEndpointRequest request) {
        return new SyncInvoker<>(request, GaMeta.showEndpoint, hcClient);
    }

    /**
     * 更新终端节点
     *
     * 更新终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointRequest 请求对象
     * @return UpdateEndpointResponse
     */
    public UpdateEndpointResponse updateEndpoint(UpdateEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.updateEndpoint);
    }

    /**
     * 更新终端节点
     *
     * 更新终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointRequest 请求对象
     * @return SyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse>
     */
    public SyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse> updateEndpointInvoker(
        UpdateEndpointRequest request) {
        return new SyncInvoker<>(request, GaMeta.updateEndpoint, hcClient);
    }

    /**
     * 创建终端节点组
     *
     * 创建终端节点组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointGroupRequest 请求对象
     * @return CreateEndpointGroupResponse
     */
    public CreateEndpointGroupResponse createEndpointGroup(CreateEndpointGroupRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.createEndpointGroup);
    }

    /**
     * 创建终端节点组
     *
     * 创建终端节点组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointGroupRequest 请求对象
     * @return SyncInvoker<CreateEndpointGroupRequest, CreateEndpointGroupResponse>
     */
    public SyncInvoker<CreateEndpointGroupRequest, CreateEndpointGroupResponse> createEndpointGroupInvoker(
        CreateEndpointGroupRequest request) {
        return new SyncInvoker<>(request, GaMeta.createEndpointGroup, hcClient);
    }

    /**
     * 删除终端节点组
     *
     * 删除终端节点组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointGroupRequest 请求对象
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
     * @param request DeleteEndpointGroupRequest 请求对象
     * @return SyncInvoker<DeleteEndpointGroupRequest, DeleteEndpointGroupResponse>
     */
    public SyncInvoker<DeleteEndpointGroupRequest, DeleteEndpointGroupResponse> deleteEndpointGroupInvoker(
        DeleteEndpointGroupRequest request) {
        return new SyncInvoker<>(request, GaMeta.deleteEndpointGroup, hcClient);
    }

    /**
     * 查询终端节点组列表
     *
     * 查询终端节点组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointGroupsRequest 请求对象
     * @return ListEndpointGroupsResponse
     */
    public ListEndpointGroupsResponse listEndpointGroups(ListEndpointGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.listEndpointGroups);
    }

    /**
     * 查询终端节点组列表
     *
     * 查询终端节点组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointGroupsRequest 请求对象
     * @return SyncInvoker<ListEndpointGroupsRequest, ListEndpointGroupsResponse>
     */
    public SyncInvoker<ListEndpointGroupsRequest, ListEndpointGroupsResponse> listEndpointGroupsInvoker(
        ListEndpointGroupsRequest request) {
        return new SyncInvoker<>(request, GaMeta.listEndpointGroups, hcClient);
    }

    /**
     * 查询终端节点组详情
     *
     * 查询终端节点组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEndpointGroupRequest 请求对象
     * @return ShowEndpointGroupResponse
     */
    public ShowEndpointGroupResponse showEndpointGroup(ShowEndpointGroupRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.showEndpointGroup);
    }

    /**
     * 查询终端节点组详情
     *
     * 查询终端节点组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEndpointGroupRequest 请求对象
     * @return SyncInvoker<ShowEndpointGroupRequest, ShowEndpointGroupResponse>
     */
    public SyncInvoker<ShowEndpointGroupRequest, ShowEndpointGroupResponse> showEndpointGroupInvoker(
        ShowEndpointGroupRequest request) {
        return new SyncInvoker<>(request, GaMeta.showEndpointGroup, hcClient);
    }

    /**
     * 更新终端节点组
     *
     * 更新终端节点组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointGroupRequest 请求对象
     * @return UpdateEndpointGroupResponse
     */
    public UpdateEndpointGroupResponse updateEndpointGroup(UpdateEndpointGroupRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.updateEndpointGroup);
    }

    /**
     * 更新终端节点组
     *
     * 更新终端节点组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointGroupRequest 请求对象
     * @return SyncInvoker<UpdateEndpointGroupRequest, UpdateEndpointGroupResponse>
     */
    public SyncInvoker<UpdateEndpointGroupRequest, UpdateEndpointGroupResponse> updateEndpointGroupInvoker(
        UpdateEndpointGroupRequest request) {
        return new SyncInvoker<>(request, GaMeta.updateEndpointGroup, hcClient);
    }

    /**
     * 创建健康检查
     *
     * 创建健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHealthCheckRequest 请求对象
     * @return CreateHealthCheckResponse
     */
    public CreateHealthCheckResponse createHealthCheck(CreateHealthCheckRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.createHealthCheck);
    }

    /**
     * 创建健康检查
     *
     * 创建健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHealthCheckRequest 请求对象
     * @return SyncInvoker<CreateHealthCheckRequest, CreateHealthCheckResponse>
     */
    public SyncInvoker<CreateHealthCheckRequest, CreateHealthCheckResponse> createHealthCheckInvoker(
        CreateHealthCheckRequest request) {
        return new SyncInvoker<>(request, GaMeta.createHealthCheck, hcClient);
    }

    /**
     * 删除健康检查
     *
     * 删除健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHealthCheckRequest 请求对象
     * @return DeleteHealthCheckResponse
     */
    public DeleteHealthCheckResponse deleteHealthCheck(DeleteHealthCheckRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.deleteHealthCheck);
    }

    /**
     * 删除健康检查
     *
     * 删除健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHealthCheckRequest 请求对象
     * @return SyncInvoker<DeleteHealthCheckRequest, DeleteHealthCheckResponse>
     */
    public SyncInvoker<DeleteHealthCheckRequest, DeleteHealthCheckResponse> deleteHealthCheckInvoker(
        DeleteHealthCheckRequest request) {
        return new SyncInvoker<>(request, GaMeta.deleteHealthCheck, hcClient);
    }

    /**
     * 查询健康检查列表
     *
     * 查询健康检查列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHealthChecksRequest 请求对象
     * @return ListHealthChecksResponse
     */
    public ListHealthChecksResponse listHealthChecks(ListHealthChecksRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.listHealthChecks);
    }

    /**
     * 查询健康检查列表
     *
     * 查询健康检查列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHealthChecksRequest 请求对象
     * @return SyncInvoker<ListHealthChecksRequest, ListHealthChecksResponse>
     */
    public SyncInvoker<ListHealthChecksRequest, ListHealthChecksResponse> listHealthChecksInvoker(
        ListHealthChecksRequest request) {
        return new SyncInvoker<>(request, GaMeta.listHealthChecks, hcClient);
    }

    /**
     * 查询健康检查详情
     *
     * 查询健康检查详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHealthCheckRequest 请求对象
     * @return ShowHealthCheckResponse
     */
    public ShowHealthCheckResponse showHealthCheck(ShowHealthCheckRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.showHealthCheck);
    }

    /**
     * 查询健康检查详情
     *
     * 查询健康检查详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHealthCheckRequest 请求对象
     * @return SyncInvoker<ShowHealthCheckRequest, ShowHealthCheckResponse>
     */
    public SyncInvoker<ShowHealthCheckRequest, ShowHealthCheckResponse> showHealthCheckInvoker(
        ShowHealthCheckRequest request) {
        return new SyncInvoker<>(request, GaMeta.showHealthCheck, hcClient);
    }

    /**
     * 更新健康检查
     *
     * 更新健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHealthCheckRequest 请求对象
     * @return UpdateHealthCheckResponse
     */
    public UpdateHealthCheckResponse updateHealthCheck(UpdateHealthCheckRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.updateHealthCheck);
    }

    /**
     * 更新健康检查
     *
     * 更新健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHealthCheckRequest 请求对象
     * @return SyncInvoker<UpdateHealthCheckRequest, UpdateHealthCheckResponse>
     */
    public SyncInvoker<UpdateHealthCheckRequest, UpdateHealthCheckResponse> updateHealthCheckInvoker(
        UpdateHealthCheckRequest request) {
        return new SyncInvoker<>(request, GaMeta.updateHealthCheck, hcClient);
    }

    /**
     * 添加IP地址组中的IP网段
     *
     * 添加IP地址组中的IP网段。
     * 该接口属于异步接口，接口返回后，后台的添加任务仍在执行；可以使用查询IP地址组详情接口查询状态，当IP地址组状态为ACTIVE时，表示条目添加完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddIpGroupIpRequest 请求对象
     * @return AddIpGroupIpResponse
     */
    public AddIpGroupIpResponse addIpGroupIp(AddIpGroupIpRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.addIpGroupIp);
    }

    /**
     * 添加IP地址组中的IP网段
     *
     * 添加IP地址组中的IP网段。
     * 该接口属于异步接口，接口返回后，后台的添加任务仍在执行；可以使用查询IP地址组详情接口查询状态，当IP地址组状态为ACTIVE时，表示条目添加完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddIpGroupIpRequest 请求对象
     * @return SyncInvoker<AddIpGroupIpRequest, AddIpGroupIpResponse>
     */
    public SyncInvoker<AddIpGroupIpRequest, AddIpGroupIpResponse> addIpGroupIpInvoker(AddIpGroupIpRequest request) {
        return new SyncInvoker<>(request, GaMeta.addIpGroupIp, hcClient);
    }

    /**
     * 绑定IP地址组与监听器
     *
     * 绑定IP地址组与监听器。
     * 该接口属于异步接口，接口返回后，后台的绑定任务仍在执行；可以使用查询IP地址组详情接口查询状态，当IP地址组状态为ACTIVE时，表示绑定完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateListenerRequest 请求对象
     * @return AssociateListenerResponse
     */
    public AssociateListenerResponse associateListener(AssociateListenerRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.associateListener);
    }

    /**
     * 绑定IP地址组与监听器
     *
     * 绑定IP地址组与监听器。
     * 该接口属于异步接口，接口返回后，后台的绑定任务仍在执行；可以使用查询IP地址组详情接口查询状态，当IP地址组状态为ACTIVE时，表示绑定完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateListenerRequest 请求对象
     * @return SyncInvoker<AssociateListenerRequest, AssociateListenerResponse>
     */
    public SyncInvoker<AssociateListenerRequest, AssociateListenerResponse> associateListenerInvoker(
        AssociateListenerRequest request) {
        return new SyncInvoker<>(request, GaMeta.associateListener, hcClient);
    }

    /**
     * 创建IP地址组
     *
     * 创建IP地址组。
     * 该接口属于异步接口，会先返回一个IP地址组ID，但后台的创建任务仍在执行；可以使用查询IP地址组详情接口查询状态，当IP地址组状态为ACTIVE时，表示IP地址组创建完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpGroupRequest 请求对象
     * @return CreateIpGroupResponse
     */
    public CreateIpGroupResponse createIpGroup(CreateIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.createIpGroup);
    }

    /**
     * 创建IP地址组
     *
     * 创建IP地址组。
     * 该接口属于异步接口，会先返回一个IP地址组ID，但后台的创建任务仍在执行；可以使用查询IP地址组详情接口查询状态，当IP地址组状态为ACTIVE时，表示IP地址组创建完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpGroupRequest 请求对象
     * @return SyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse>
     */
    public SyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse> createIpGroupInvoker(CreateIpGroupRequest request) {
        return new SyncInvoker<>(request, GaMeta.createIpGroup, hcClient);
    }

    /**
     * 删除IP地址组
     *
     * 删除IP地址组。
     * 该接口属于异步接口，接口返回后，后台的删除任务仍在执行；可以使用查询IP地址组详情接口查询状态，当查询不到该IP地址组时，表示删除完成；删除IP地址组时，若IP地址组已经绑定了监听器，则需要先解绑IP地址组与监听器，再进行删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpGroupRequest 请求对象
     * @return DeleteIpGroupResponse
     */
    public DeleteIpGroupResponse deleteIpGroup(DeleteIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.deleteIpGroup);
    }

    /**
     * 删除IP地址组
     *
     * 删除IP地址组。
     * 该接口属于异步接口，接口返回后，后台的删除任务仍在执行；可以使用查询IP地址组详情接口查询状态，当查询不到该IP地址组时，表示删除完成；删除IP地址组时，若IP地址组已经绑定了监听器，则需要先解绑IP地址组与监听器，再进行删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpGroupRequest 请求对象
     * @return SyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse>
     */
    public SyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse> deleteIpGroupInvoker(DeleteIpGroupRequest request) {
        return new SyncInvoker<>(request, GaMeta.deleteIpGroup, hcClient);
    }

    /**
     * 解绑IP地址组与监听器
     *
     * 解绑IP地址组与监听器。
     * 该接口属于异步接口，接口返回后，后台的解绑任务仍在执行；可以使用查询IP地址组详情接口查询状态，当IP地址组状态为ACTIVE时，表示解绑完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateListenerRequest 请求对象
     * @return DisassociateListenerResponse
     */
    public DisassociateListenerResponse disassociateListener(DisassociateListenerRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.disassociateListener);
    }

    /**
     * 解绑IP地址组与监听器
     *
     * 解绑IP地址组与监听器。
     * 该接口属于异步接口，接口返回后，后台的解绑任务仍在执行；可以使用查询IP地址组详情接口查询状态，当IP地址组状态为ACTIVE时，表示解绑完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateListenerRequest 请求对象
     * @return SyncInvoker<DisassociateListenerRequest, DisassociateListenerResponse>
     */
    public SyncInvoker<DisassociateListenerRequest, DisassociateListenerResponse> disassociateListenerInvoker(
        DisassociateListenerRequest request) {
        return new SyncInvoker<>(request, GaMeta.disassociateListener, hcClient);
    }

    /**
     * 查询IP地址组列表
     *
     * 查询IP地址组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpGroupsRequest 请求对象
     * @return ListIpGroupsResponse
     */
    public ListIpGroupsResponse listIpGroups(ListIpGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.listIpGroups);
    }

    /**
     * 查询IP地址组列表
     *
     * 查询IP地址组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpGroupsRequest 请求对象
     * @return SyncInvoker<ListIpGroupsRequest, ListIpGroupsResponse>
     */
    public SyncInvoker<ListIpGroupsRequest, ListIpGroupsResponse> listIpGroupsInvoker(ListIpGroupsRequest request) {
        return new SyncInvoker<>(request, GaMeta.listIpGroups, hcClient);
    }

    /**
     * 删除IP地址组中的IP网段
     *
     * 删除IP地址组中的IP网段。
     * 该接口属于异步接口，接口返回后，后台的删除任务仍在执行；可以使用查询IP地址组详情接口查询状态，当IP地址组状态为ACTIVE时，表示条目删除完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveIpGroupIpRequest 请求对象
     * @return RemoveIpGroupIpResponse
     */
    public RemoveIpGroupIpResponse removeIpGroupIp(RemoveIpGroupIpRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.removeIpGroupIp);
    }

    /**
     * 删除IP地址组中的IP网段
     *
     * 删除IP地址组中的IP网段。
     * 该接口属于异步接口，接口返回后，后台的删除任务仍在执行；可以使用查询IP地址组详情接口查询状态，当IP地址组状态为ACTIVE时，表示条目删除完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveIpGroupIpRequest 请求对象
     * @return SyncInvoker<RemoveIpGroupIpRequest, RemoveIpGroupIpResponse>
     */
    public SyncInvoker<RemoveIpGroupIpRequest, RemoveIpGroupIpResponse> removeIpGroupIpInvoker(
        RemoveIpGroupIpRequest request) {
        return new SyncInvoker<>(request, GaMeta.removeIpGroupIp, hcClient);
    }

    /**
     * 查询IP地址组详情
     *
     * 查询IP地址组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpGroupRequest 请求对象
     * @return ShowIpGroupResponse
     */
    public ShowIpGroupResponse showIpGroup(ShowIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.showIpGroup);
    }

    /**
     * 查询IP地址组详情
     *
     * 查询IP地址组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpGroupRequest 请求对象
     * @return SyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse>
     */
    public SyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse> showIpGroupInvoker(ShowIpGroupRequest request) {
        return new SyncInvoker<>(request, GaMeta.showIpGroup, hcClient);
    }

    /**
     * 更新IP地址组
     *
     * 更新IP地址组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpGroupRequest 请求对象
     * @return UpdateIpGroupResponse
     */
    public UpdateIpGroupResponse updateIpGroup(UpdateIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.updateIpGroup);
    }

    /**
     * 更新IP地址组
     *
     * 更新IP地址组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpGroupRequest 请求对象
     * @return SyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse>
     */
    public SyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse> updateIpGroupInvoker(UpdateIpGroupRequest request) {
        return new SyncInvoker<>(request, GaMeta.updateIpGroup, hcClient);
    }

    /**
     * 创建监听器
     *
     * 创建监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateListenerRequest 请求对象
     * @return CreateListenerResponse
     */
    public CreateListenerResponse createListener(CreateListenerRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.createListener);
    }

    /**
     * 创建监听器
     *
     * 创建监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateListenerRequest 请求对象
     * @return SyncInvoker<CreateListenerRequest, CreateListenerResponse>
     */
    public SyncInvoker<CreateListenerRequest, CreateListenerResponse> createListenerInvoker(
        CreateListenerRequest request) {
        return new SyncInvoker<>(request, GaMeta.createListener, hcClient);
    }

    /**
     * 删除监听器
     *
     * 删除监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteListenerRequest 请求对象
     * @return DeleteListenerResponse
     */
    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.deleteListener);
    }

    /**
     * 删除监听器
     *
     * 删除监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteListenerRequest 请求对象
     * @return SyncInvoker<DeleteListenerRequest, DeleteListenerResponse>
     */
    public SyncInvoker<DeleteListenerRequest, DeleteListenerResponse> deleteListenerInvoker(
        DeleteListenerRequest request) {
        return new SyncInvoker<>(request, GaMeta.deleteListener, hcClient);
    }

    /**
     * 查询监听器列表
     *
     * 查询监听器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListListenersRequest 请求对象
     * @return ListListenersResponse
     */
    public ListListenersResponse listListeners(ListListenersRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.listListeners);
    }

    /**
     * 查询监听器列表
     *
     * 查询监听器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListListenersRequest 请求对象
     * @return SyncInvoker<ListListenersRequest, ListListenersResponse>
     */
    public SyncInvoker<ListListenersRequest, ListListenersResponse> listListenersInvoker(ListListenersRequest request) {
        return new SyncInvoker<>(request, GaMeta.listListeners, hcClient);
    }

    /**
     * 查询监听器详情
     *
     * 查询监听器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListenerRequest 请求对象
     * @return ShowListenerResponse
     */
    public ShowListenerResponse showListener(ShowListenerRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.showListener);
    }

    /**
     * 查询监听器详情
     *
     * 查询监听器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListenerRequest 请求对象
     * @return SyncInvoker<ShowListenerRequest, ShowListenerResponse>
     */
    public SyncInvoker<ShowListenerRequest, ShowListenerResponse> showListenerInvoker(ShowListenerRequest request) {
        return new SyncInvoker<>(request, GaMeta.showListener, hcClient);
    }

    /**
     * 更新监听器
     *
     * 更新监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateListenerRequest 请求对象
     * @return UpdateListenerResponse
     */
    public UpdateListenerResponse updateListener(UpdateListenerRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.updateListener);
    }

    /**
     * 更新监听器
     *
     * 更新监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateListenerRequest 请求对象
     * @return SyncInvoker<UpdateListenerRequest, UpdateListenerResponse>
     */
    public SyncInvoker<UpdateListenerRequest, UpdateListenerResponse> updateListenerInvoker(
        UpdateListenerRequest request) {
        return new SyncInvoker<>(request, GaMeta.updateListener, hcClient);
    }

    /**
     * 创建云日志
     *
     * 创建云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogtankRequest 请求对象
     * @return CreateLogtankResponse
     */
    public CreateLogtankResponse createLogtank(CreateLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.createLogtank);
    }

    /**
     * 创建云日志
     *
     * 创建云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogtankRequest 请求对象
     * @return SyncInvoker<CreateLogtankRequest, CreateLogtankResponse>
     */
    public SyncInvoker<CreateLogtankRequest, CreateLogtankResponse> createLogtankInvoker(CreateLogtankRequest request) {
        return new SyncInvoker<>(request, GaMeta.createLogtank, hcClient);
    }

    /**
     * 删除云日志
     *
     * 删除云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogtankRequest 请求对象
     * @return DeleteLogtankResponse
     */
    public DeleteLogtankResponse deleteLogtank(DeleteLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.deleteLogtank);
    }

    /**
     * 删除云日志
     *
     * 删除云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogtankRequest 请求对象
     * @return SyncInvoker<DeleteLogtankRequest, DeleteLogtankResponse>
     */
    public SyncInvoker<DeleteLogtankRequest, DeleteLogtankResponse> deleteLogtankInvoker(DeleteLogtankRequest request) {
        return new SyncInvoker<>(request, GaMeta.deleteLogtank, hcClient);
    }

    /**
     * 查询云日志列表
     *
     * 查询云日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogtanksRequest 请求对象
     * @return ListLogtanksResponse
     */
    public ListLogtanksResponse listLogtanks(ListLogtanksRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.listLogtanks);
    }

    /**
     * 查询云日志列表
     *
     * 查询云日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogtanksRequest 请求对象
     * @return SyncInvoker<ListLogtanksRequest, ListLogtanksResponse>
     */
    public SyncInvoker<ListLogtanksRequest, ListLogtanksResponse> listLogtanksInvoker(ListLogtanksRequest request) {
        return new SyncInvoker<>(request, GaMeta.listLogtanks, hcClient);
    }

    /**
     * 查询云日志详情
     *
     * 查询云日志详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogtankRequest 请求对象
     * @return ShowLogtankResponse
     */
    public ShowLogtankResponse showLogtank(ShowLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.showLogtank);
    }

    /**
     * 查询云日志详情
     *
     * 查询云日志详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogtankRequest 请求对象
     * @return SyncInvoker<ShowLogtankRequest, ShowLogtankResponse>
     */
    public SyncInvoker<ShowLogtankRequest, ShowLogtankResponse> showLogtankInvoker(ShowLogtankRequest request) {
        return new SyncInvoker<>(request, GaMeta.showLogtank, hcClient);
    }

    /**
     * 更新云日志
     *
     * 更新云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogtankRequest 请求对象
     * @return UpdateLogtankResponse
     */
    public UpdateLogtankResponse updateLogtank(UpdateLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.updateLogtank);
    }

    /**
     * 更新云日志
     *
     * 更新云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogtankRequest 请求对象
     * @return SyncInvoker<UpdateLogtankRequest, UpdateLogtankResponse>
     */
    public SyncInvoker<UpdateLogtankRequest, UpdateLogtankResponse> updateLogtankInvoker(UpdateLogtankRequest request) {
        return new SyncInvoker<>(request, GaMeta.updateLogtank, hcClient);
    }

    /**
     * 查询pop列表
     *
     * 查询pop列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllPopsRequest 请求对象
     * @return ListAllPopsResponse
     */
    public ListAllPopsResponse listAllPops(ListAllPopsRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.listAllPops);
    }

    /**
     * 查询pop列表
     *
     * 查询pop列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllPopsRequest 请求对象
     * @return SyncInvoker<ListAllPopsRequest, ListAllPopsResponse>
     */
    public SyncInvoker<ListAllPopsRequest, ListAllPopsResponse> listAllPopsInvoker(ListAllPopsRequest request) {
        return new SyncInvoker<>(request, GaMeta.listAllPops, hcClient);
    }

    /**
     * 查询配额列表
     *
     * 查询配额列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantQuotasRequest 请求对象
     * @return ListTenantQuotasResponse
     */
    public ListTenantQuotasResponse listTenantQuotas(ListTenantQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.listTenantQuotas);
    }

    /**
     * 查询配额列表
     *
     * 查询配额列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantQuotasRequest 请求对象
     * @return SyncInvoker<ListTenantQuotasRequest, ListTenantQuotasResponse>
     */
    public SyncInvoker<ListTenantQuotasRequest, ListTenantQuotasResponse> listTenantQuotasInvoker(
        ListTenantQuotasRequest request) {
        return new SyncInvoker<>(request, GaMeta.listTenantQuotas, hcClient);
    }

    /**
     * 查询区域列表
     *
     * 查询区域列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions(ListRegionsRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.listRegions);
    }

    /**
     * 查询区域列表
     *
     * 查询区域列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return SyncInvoker<ListRegionsRequest, ListRegionsResponse>
     */
    public SyncInvoker<ListRegionsRequest, ListRegionsResponse> listRegionsInvoker(ListRegionsRequest request) {
        return new SyncInvoker<>(request, GaMeta.listRegions, hcClient);
    }

    /**
     * 通过标签查询资源实例数量
     *
     * 通过标签查询资源实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourcesByTagRequest 请求对象
     * @return CountResourcesByTagResponse
     */
    public CountResourcesByTagResponse countResourcesByTag(CountResourcesByTagRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.countResourcesByTag);
    }

    /**
     * 通过标签查询资源实例数量
     *
     * 通过标签查询资源实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourcesByTagRequest 请求对象
     * @return SyncInvoker<CountResourcesByTagRequest, CountResourcesByTagResponse>
     */
    public SyncInvoker<CountResourcesByTagRequest, CountResourcesByTagResponse> countResourcesByTagInvoker(
        CountResourcesByTagRequest request) {
        return new SyncInvoker<>(request, GaMeta.countResourcesByTag, hcClient);
    }

    /**
     * 创建资源标签
     *
     * 创建资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagsRequest 请求对象
     * @return CreateTagsResponse
     */
    public CreateTagsResponse createTags(CreateTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.createTags);
    }

    /**
     * 创建资源标签
     *
     * 创建资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagsRequest 请求对象
     * @return SyncInvoker<CreateTagsRequest, CreateTagsResponse>
     */
    public SyncInvoker<CreateTagsRequest, CreateTagsResponse> createTagsInvoker(CreateTagsRequest request) {
        return new SyncInvoker<>(request, GaMeta.createTags, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagsRequest 请求对象
     * @return DeleteTagsResponse
     */
    public DeleteTagsResponse deleteTags(DeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.deleteTags);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagsRequest 请求对象
     * @return SyncInvoker<DeleteTagsRequest, DeleteTagsResponse>
     */
    public SyncInvoker<DeleteTagsRequest, DeleteTagsResponse> deleteTagsInvoker(DeleteTagsRequest request) {
        return new SyncInvoker<>(request, GaMeta.deleteTags, hcClient);
    }

    /**
     * 通过标签查询资源实例列表
     *
     * 通过标签查询资源实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesByTagRequest 请求对象
     * @return ListResourcesByTagResponse
     */
    public ListResourcesByTagResponse listResourcesByTag(ListResourcesByTagRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.listResourcesByTag);
    }

    /**
     * 通过标签查询资源实例列表
     *
     * 通过标签查询资源实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesByTagRequest 请求对象
     * @return SyncInvoker<ListResourcesByTagRequest, ListResourcesByTagResponse>
     */
    public SyncInvoker<ListResourcesByTagRequest, ListResourcesByTagResponse> listResourcesByTagInvoker(
        ListResourcesByTagRequest request) {
        return new SyncInvoker<>(request, GaMeta.listResourcesByTag, hcClient);
    }

    /**
     * 查询标签列表
     *
     * 查询标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.listTags);
    }

    /**
     * 查询标签列表
     *
     * 查询标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return SyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public SyncInvoker<ListTagsRequest, ListTagsResponse> listTagsInvoker(ListTagsRequest request) {
        return new SyncInvoker<>(request, GaMeta.listTags, hcClient);
    }

    /**
     * 查询特定资源标签
     *
     * 查询特定资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceTagsRequest 请求对象
     * @return ShowResourceTagsResponse
     */
    public ShowResourceTagsResponse showResourceTags(ShowResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GaMeta.showResourceTags);
    }

    /**
     * 查询特定资源标签
     *
     * 查询特定资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceTagsRequest 请求对象
     * @return SyncInvoker<ShowResourceTagsRequest, ShowResourceTagsResponse>
     */
    public SyncInvoker<ShowResourceTagsRequest, ShowResourceTagsResponse> showResourceTagsInvoker(
        ShowResourceTagsRequest request) {
        return new SyncInvoker<>(request, GaMeta.showResourceTags, hcClient);
    }

}
