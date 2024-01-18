package com.huaweicloud.sdk.ga.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.ga.v1.model.AddIpGroupIpRequest;
import com.huaweicloud.sdk.ga.v1.model.AddIpGroupIpResponse;
import com.huaweicloud.sdk.ga.v1.model.AssociateListenerRequest;
import com.huaweicloud.sdk.ga.v1.model.AssociateListenerResponse;
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
import com.huaweicloud.sdk.ga.v1.model.DeleteTagsRequest;
import com.huaweicloud.sdk.ga.v1.model.DeleteTagsResponse;
import com.huaweicloud.sdk.ga.v1.model.DisassociateListenerRequest;
import com.huaweicloud.sdk.ga.v1.model.DisassociateListenerResponse;
import com.huaweicloud.sdk.ga.v1.model.ListAcceleratorsRequest;
import com.huaweicloud.sdk.ga.v1.model.ListAcceleratorsResponse;
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
import com.huaweicloud.sdk.ga.v1.model.ListRegionsRequest;
import com.huaweicloud.sdk.ga.v1.model.ListRegionsResponse;
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

import java.util.concurrent.CompletableFuture;

public class GaAsyncClient {

    protected HcClient hcClient;

    public GaAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GaAsyncClient> newBuilder() {
        ClientBuilder<GaAsyncClient> clientBuilder = new ClientBuilder<>(GaAsyncClient::new);
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
     * @return CompletableFuture<CreateAcceleratorResponse>
     */
    public CompletableFuture<CreateAcceleratorResponse> createAcceleratorAsync(CreateAcceleratorRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.createAccelerator);
    }

    /**
     * 创建全球加速器
     *
     * 创建全球加速器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAcceleratorRequest 请求对象
     * @return AsyncInvoker<CreateAcceleratorRequest, CreateAcceleratorResponse>
     */
    public AsyncInvoker<CreateAcceleratorRequest, CreateAcceleratorResponse> createAcceleratorAsyncInvoker(
        CreateAcceleratorRequest request) {
        return new AsyncInvoker<>(request, GaMeta.createAccelerator, hcClient);
    }

    /**
     * 删除全球加速器
     *
     * 删除全球加速器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAcceleratorRequest 请求对象
     * @return CompletableFuture<DeleteAcceleratorResponse>
     */
    public CompletableFuture<DeleteAcceleratorResponse> deleteAcceleratorAsync(DeleteAcceleratorRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.deleteAccelerator);
    }

    /**
     * 删除全球加速器
     *
     * 删除全球加速器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAcceleratorRequest 请求对象
     * @return AsyncInvoker<DeleteAcceleratorRequest, DeleteAcceleratorResponse>
     */
    public AsyncInvoker<DeleteAcceleratorRequest, DeleteAcceleratorResponse> deleteAcceleratorAsyncInvoker(
        DeleteAcceleratorRequest request) {
        return new AsyncInvoker<>(request, GaMeta.deleteAccelerator, hcClient);
    }

    /**
     * 查询全球加速器列表
     *
     * 查询全球加速器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAcceleratorsRequest 请求对象
     * @return CompletableFuture<ListAcceleratorsResponse>
     */
    public CompletableFuture<ListAcceleratorsResponse> listAcceleratorsAsync(ListAcceleratorsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.listAccelerators);
    }

    /**
     * 查询全球加速器列表
     *
     * 查询全球加速器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAcceleratorsRequest 请求对象
     * @return AsyncInvoker<ListAcceleratorsRequest, ListAcceleratorsResponse>
     */
    public AsyncInvoker<ListAcceleratorsRequest, ListAcceleratorsResponse> listAcceleratorsAsyncInvoker(
        ListAcceleratorsRequest request) {
        return new AsyncInvoker<>(request, GaMeta.listAccelerators, hcClient);
    }

    /**
     * 查询全球加速器详情
     *
     * 查询全球加速器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAcceleratorRequest 请求对象
     * @return CompletableFuture<ShowAcceleratorResponse>
     */
    public CompletableFuture<ShowAcceleratorResponse> showAcceleratorAsync(ShowAcceleratorRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.showAccelerator);
    }

    /**
     * 查询全球加速器详情
     *
     * 查询全球加速器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAcceleratorRequest 请求对象
     * @return AsyncInvoker<ShowAcceleratorRequest, ShowAcceleratorResponse>
     */
    public AsyncInvoker<ShowAcceleratorRequest, ShowAcceleratorResponse> showAcceleratorAsyncInvoker(
        ShowAcceleratorRequest request) {
        return new AsyncInvoker<>(request, GaMeta.showAccelerator, hcClient);
    }

    /**
     * 更新全球加速器
     *
     * 更新全球加速器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAcceleratorRequest 请求对象
     * @return CompletableFuture<UpdateAcceleratorResponse>
     */
    public CompletableFuture<UpdateAcceleratorResponse> updateAcceleratorAsync(UpdateAcceleratorRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.updateAccelerator);
    }

    /**
     * 更新全球加速器
     *
     * 更新全球加速器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAcceleratorRequest 请求对象
     * @return AsyncInvoker<UpdateAcceleratorRequest, UpdateAcceleratorResponse>
     */
    public AsyncInvoker<UpdateAcceleratorRequest, UpdateAcceleratorResponse> updateAcceleratorAsyncInvoker(
        UpdateAcceleratorRequest request) {
        return new AsyncInvoker<>(request, GaMeta.updateAccelerator, hcClient);
    }

    /**
     * 创建终端节点
     *
     * 创建终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return CompletableFuture<CreateEndpointResponse>
     */
    public CompletableFuture<CreateEndpointResponse> createEndpointAsync(CreateEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.createEndpoint);
    }

    /**
     * 创建终端节点
     *
     * 创建终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse>
     */
    public AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse> createEndpointAsyncInvoker(
        CreateEndpointRequest request) {
        return new AsyncInvoker<>(request, GaMeta.createEndpoint, hcClient);
    }

    /**
     * 删除终端节点
     *
     * 删除终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointRequest 请求对象
     * @return CompletableFuture<DeleteEndpointResponse>
     */
    public CompletableFuture<DeleteEndpointResponse> deleteEndpointAsync(DeleteEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.deleteEndpoint);
    }

    /**
     * 删除终端节点
     *
     * 删除终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointRequest 请求对象
     * @return AsyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>
     */
    public AsyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpointAsyncInvoker(
        DeleteEndpointRequest request) {
        return new AsyncInvoker<>(request, GaMeta.deleteEndpoint, hcClient);
    }

    /**
     * 查询终端节点组下终端节点列表
     *
     * 查询终端节点组下终端节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return CompletableFuture<ListEndpointsResponse>
     */
    public CompletableFuture<ListEndpointsResponse> listEndpointsAsync(ListEndpointsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.listEndpoints);
    }

    /**
     * 查询终端节点组下终端节点列表
     *
     * 查询终端节点组下终端节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse>
     */
    public AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse> listEndpointsAsyncInvoker(
        ListEndpointsRequest request) {
        return new AsyncInvoker<>(request, GaMeta.listEndpoints, hcClient);
    }

    /**
     * 查询终端节点详情
     *
     * 查询终端节点详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEndpointRequest 请求对象
     * @return CompletableFuture<ShowEndpointResponse>
     */
    public CompletableFuture<ShowEndpointResponse> showEndpointAsync(ShowEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.showEndpoint);
    }

    /**
     * 查询终端节点详情
     *
     * 查询终端节点详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEndpointRequest 请求对象
     * @return AsyncInvoker<ShowEndpointRequest, ShowEndpointResponse>
     */
    public AsyncInvoker<ShowEndpointRequest, ShowEndpointResponse> showEndpointAsyncInvoker(
        ShowEndpointRequest request) {
        return new AsyncInvoker<>(request, GaMeta.showEndpoint, hcClient);
    }

    /**
     * 更新终端节点
     *
     * 更新终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointRequest 请求对象
     * @return CompletableFuture<UpdateEndpointResponse>
     */
    public CompletableFuture<UpdateEndpointResponse> updateEndpointAsync(UpdateEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.updateEndpoint);
    }

    /**
     * 更新终端节点
     *
     * 更新终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointRequest 请求对象
     * @return AsyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse>
     */
    public AsyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse> updateEndpointAsyncInvoker(
        UpdateEndpointRequest request) {
        return new AsyncInvoker<>(request, GaMeta.updateEndpoint, hcClient);
    }

    /**
     * 创建终端节点组
     *
     * 创建终端节点组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointGroupRequest 请求对象
     * @return CompletableFuture<CreateEndpointGroupResponse>
     */
    public CompletableFuture<CreateEndpointGroupResponse> createEndpointGroupAsync(CreateEndpointGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.createEndpointGroup);
    }

    /**
     * 创建终端节点组
     *
     * 创建终端节点组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointGroupRequest 请求对象
     * @return AsyncInvoker<CreateEndpointGroupRequest, CreateEndpointGroupResponse>
     */
    public AsyncInvoker<CreateEndpointGroupRequest, CreateEndpointGroupResponse> createEndpointGroupAsyncInvoker(
        CreateEndpointGroupRequest request) {
        return new AsyncInvoker<>(request, GaMeta.createEndpointGroup, hcClient);
    }

    /**
     * 删除终端节点组
     *
     * 删除终端节点组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointGroupRequest 请求对象
     * @return CompletableFuture<DeleteEndpointGroupResponse>
     */
    public CompletableFuture<DeleteEndpointGroupResponse> deleteEndpointGroupAsync(DeleteEndpointGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.deleteEndpointGroup);
    }

    /**
     * 删除终端节点组
     *
     * 删除终端节点组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointGroupRequest 请求对象
     * @return AsyncInvoker<DeleteEndpointGroupRequest, DeleteEndpointGroupResponse>
     */
    public AsyncInvoker<DeleteEndpointGroupRequest, DeleteEndpointGroupResponse> deleteEndpointGroupAsyncInvoker(
        DeleteEndpointGroupRequest request) {
        return new AsyncInvoker<>(request, GaMeta.deleteEndpointGroup, hcClient);
    }

    /**
     * 查询终端节点组列表
     *
     * 查询终端节点组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointGroupsRequest 请求对象
     * @return CompletableFuture<ListEndpointGroupsResponse>
     */
    public CompletableFuture<ListEndpointGroupsResponse> listEndpointGroupsAsync(ListEndpointGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.listEndpointGroups);
    }

    /**
     * 查询终端节点组列表
     *
     * 查询终端节点组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointGroupsRequest 请求对象
     * @return AsyncInvoker<ListEndpointGroupsRequest, ListEndpointGroupsResponse>
     */
    public AsyncInvoker<ListEndpointGroupsRequest, ListEndpointGroupsResponse> listEndpointGroupsAsyncInvoker(
        ListEndpointGroupsRequest request) {
        return new AsyncInvoker<>(request, GaMeta.listEndpointGroups, hcClient);
    }

    /**
     * 查询终端节点组详情
     *
     * 查询终端节点组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEndpointGroupRequest 请求对象
     * @return CompletableFuture<ShowEndpointGroupResponse>
     */
    public CompletableFuture<ShowEndpointGroupResponse> showEndpointGroupAsync(ShowEndpointGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.showEndpointGroup);
    }

    /**
     * 查询终端节点组详情
     *
     * 查询终端节点组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEndpointGroupRequest 请求对象
     * @return AsyncInvoker<ShowEndpointGroupRequest, ShowEndpointGroupResponse>
     */
    public AsyncInvoker<ShowEndpointGroupRequest, ShowEndpointGroupResponse> showEndpointGroupAsyncInvoker(
        ShowEndpointGroupRequest request) {
        return new AsyncInvoker<>(request, GaMeta.showEndpointGroup, hcClient);
    }

    /**
     * 更新终端节点组
     *
     * 更新终端节点组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointGroupRequest 请求对象
     * @return CompletableFuture<UpdateEndpointGroupResponse>
     */
    public CompletableFuture<UpdateEndpointGroupResponse> updateEndpointGroupAsync(UpdateEndpointGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.updateEndpointGroup);
    }

    /**
     * 更新终端节点组
     *
     * 更新终端节点组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointGroupRequest 请求对象
     * @return AsyncInvoker<UpdateEndpointGroupRequest, UpdateEndpointGroupResponse>
     */
    public AsyncInvoker<UpdateEndpointGroupRequest, UpdateEndpointGroupResponse> updateEndpointGroupAsyncInvoker(
        UpdateEndpointGroupRequest request) {
        return new AsyncInvoker<>(request, GaMeta.updateEndpointGroup, hcClient);
    }

    /**
     * 创建健康检查
     *
     * 创建健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHealthCheckRequest 请求对象
     * @return CompletableFuture<CreateHealthCheckResponse>
     */
    public CompletableFuture<CreateHealthCheckResponse> createHealthCheckAsync(CreateHealthCheckRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.createHealthCheck);
    }

    /**
     * 创建健康检查
     *
     * 创建健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHealthCheckRequest 请求对象
     * @return AsyncInvoker<CreateHealthCheckRequest, CreateHealthCheckResponse>
     */
    public AsyncInvoker<CreateHealthCheckRequest, CreateHealthCheckResponse> createHealthCheckAsyncInvoker(
        CreateHealthCheckRequest request) {
        return new AsyncInvoker<>(request, GaMeta.createHealthCheck, hcClient);
    }

    /**
     * 删除健康检查
     *
     * 删除健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHealthCheckRequest 请求对象
     * @return CompletableFuture<DeleteHealthCheckResponse>
     */
    public CompletableFuture<DeleteHealthCheckResponse> deleteHealthCheckAsync(DeleteHealthCheckRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.deleteHealthCheck);
    }

    /**
     * 删除健康检查
     *
     * 删除健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHealthCheckRequest 请求对象
     * @return AsyncInvoker<DeleteHealthCheckRequest, DeleteHealthCheckResponse>
     */
    public AsyncInvoker<DeleteHealthCheckRequest, DeleteHealthCheckResponse> deleteHealthCheckAsyncInvoker(
        DeleteHealthCheckRequest request) {
        return new AsyncInvoker<>(request, GaMeta.deleteHealthCheck, hcClient);
    }

    /**
     * 查询健康检查列表
     *
     * 查询健康检查列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHealthChecksRequest 请求对象
     * @return CompletableFuture<ListHealthChecksResponse>
     */
    public CompletableFuture<ListHealthChecksResponse> listHealthChecksAsync(ListHealthChecksRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.listHealthChecks);
    }

    /**
     * 查询健康检查列表
     *
     * 查询健康检查列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHealthChecksRequest 请求对象
     * @return AsyncInvoker<ListHealthChecksRequest, ListHealthChecksResponse>
     */
    public AsyncInvoker<ListHealthChecksRequest, ListHealthChecksResponse> listHealthChecksAsyncInvoker(
        ListHealthChecksRequest request) {
        return new AsyncInvoker<>(request, GaMeta.listHealthChecks, hcClient);
    }

    /**
     * 查询健康检查详情
     *
     * 查询健康检查详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHealthCheckRequest 请求对象
     * @return CompletableFuture<ShowHealthCheckResponse>
     */
    public CompletableFuture<ShowHealthCheckResponse> showHealthCheckAsync(ShowHealthCheckRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.showHealthCheck);
    }

    /**
     * 查询健康检查详情
     *
     * 查询健康检查详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHealthCheckRequest 请求对象
     * @return AsyncInvoker<ShowHealthCheckRequest, ShowHealthCheckResponse>
     */
    public AsyncInvoker<ShowHealthCheckRequest, ShowHealthCheckResponse> showHealthCheckAsyncInvoker(
        ShowHealthCheckRequest request) {
        return new AsyncInvoker<>(request, GaMeta.showHealthCheck, hcClient);
    }

    /**
     * 更新健康检查
     *
     * 更新健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHealthCheckRequest 请求对象
     * @return CompletableFuture<UpdateHealthCheckResponse>
     */
    public CompletableFuture<UpdateHealthCheckResponse> updateHealthCheckAsync(UpdateHealthCheckRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.updateHealthCheck);
    }

    /**
     * 更新健康检查
     *
     * 更新健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHealthCheckRequest 请求对象
     * @return AsyncInvoker<UpdateHealthCheckRequest, UpdateHealthCheckResponse>
     */
    public AsyncInvoker<UpdateHealthCheckRequest, UpdateHealthCheckResponse> updateHealthCheckAsyncInvoker(
        UpdateHealthCheckRequest request) {
        return new AsyncInvoker<>(request, GaMeta.updateHealthCheck, hcClient);
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
     * @return CompletableFuture<AddIpGroupIpResponse>
     */
    public CompletableFuture<AddIpGroupIpResponse> addIpGroupIpAsync(AddIpGroupIpRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.addIpGroupIp);
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
     * @return AsyncInvoker<AddIpGroupIpRequest, AddIpGroupIpResponse>
     */
    public AsyncInvoker<AddIpGroupIpRequest, AddIpGroupIpResponse> addIpGroupIpAsyncInvoker(
        AddIpGroupIpRequest request) {
        return new AsyncInvoker<>(request, GaMeta.addIpGroupIp, hcClient);
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
     * @return CompletableFuture<AssociateListenerResponse>
     */
    public CompletableFuture<AssociateListenerResponse> associateListenerAsync(AssociateListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.associateListener);
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
     * @return AsyncInvoker<AssociateListenerRequest, AssociateListenerResponse>
     */
    public AsyncInvoker<AssociateListenerRequest, AssociateListenerResponse> associateListenerAsyncInvoker(
        AssociateListenerRequest request) {
        return new AsyncInvoker<>(request, GaMeta.associateListener, hcClient);
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
     * @return CompletableFuture<CreateIpGroupResponse>
     */
    public CompletableFuture<CreateIpGroupResponse> createIpGroupAsync(CreateIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.createIpGroup);
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
     * @return AsyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse>
     */
    public AsyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse> createIpGroupAsyncInvoker(
        CreateIpGroupRequest request) {
        return new AsyncInvoker<>(request, GaMeta.createIpGroup, hcClient);
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
     * @return CompletableFuture<DeleteIpGroupResponse>
     */
    public CompletableFuture<DeleteIpGroupResponse> deleteIpGroupAsync(DeleteIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.deleteIpGroup);
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
     * @return AsyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse>
     */
    public AsyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse> deleteIpGroupAsyncInvoker(
        DeleteIpGroupRequest request) {
        return new AsyncInvoker<>(request, GaMeta.deleteIpGroup, hcClient);
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
     * @return CompletableFuture<DisassociateListenerResponse>
     */
    public CompletableFuture<DisassociateListenerResponse> disassociateListenerAsync(
        DisassociateListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.disassociateListener);
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
     * @return AsyncInvoker<DisassociateListenerRequest, DisassociateListenerResponse>
     */
    public AsyncInvoker<DisassociateListenerRequest, DisassociateListenerResponse> disassociateListenerAsyncInvoker(
        DisassociateListenerRequest request) {
        return new AsyncInvoker<>(request, GaMeta.disassociateListener, hcClient);
    }

    /**
     * 查询IP地址组列表
     *
     * 查询IP地址组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpGroupsRequest 请求对象
     * @return CompletableFuture<ListIpGroupsResponse>
     */
    public CompletableFuture<ListIpGroupsResponse> listIpGroupsAsync(ListIpGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.listIpGroups);
    }

    /**
     * 查询IP地址组列表
     *
     * 查询IP地址组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpGroupsRequest 请求对象
     * @return AsyncInvoker<ListIpGroupsRequest, ListIpGroupsResponse>
     */
    public AsyncInvoker<ListIpGroupsRequest, ListIpGroupsResponse> listIpGroupsAsyncInvoker(
        ListIpGroupsRequest request) {
        return new AsyncInvoker<>(request, GaMeta.listIpGroups, hcClient);
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
     * @return CompletableFuture<RemoveIpGroupIpResponse>
     */
    public CompletableFuture<RemoveIpGroupIpResponse> removeIpGroupIpAsync(RemoveIpGroupIpRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.removeIpGroupIp);
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
     * @return AsyncInvoker<RemoveIpGroupIpRequest, RemoveIpGroupIpResponse>
     */
    public AsyncInvoker<RemoveIpGroupIpRequest, RemoveIpGroupIpResponse> removeIpGroupIpAsyncInvoker(
        RemoveIpGroupIpRequest request) {
        return new AsyncInvoker<>(request, GaMeta.removeIpGroupIp, hcClient);
    }

    /**
     * 查询IP地址组详情
     *
     * 查询IP地址组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpGroupRequest 请求对象
     * @return CompletableFuture<ShowIpGroupResponse>
     */
    public CompletableFuture<ShowIpGroupResponse> showIpGroupAsync(ShowIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.showIpGroup);
    }

    /**
     * 查询IP地址组详情
     *
     * 查询IP地址组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpGroupRequest 请求对象
     * @return AsyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse>
     */
    public AsyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse> showIpGroupAsyncInvoker(ShowIpGroupRequest request) {
        return new AsyncInvoker<>(request, GaMeta.showIpGroup, hcClient);
    }

    /**
     * 更新IP地址组
     *
     * 更新IP地址组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpGroupRequest 请求对象
     * @return CompletableFuture<UpdateIpGroupResponse>
     */
    public CompletableFuture<UpdateIpGroupResponse> updateIpGroupAsync(UpdateIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.updateIpGroup);
    }

    /**
     * 更新IP地址组
     *
     * 更新IP地址组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpGroupRequest 请求对象
     * @return AsyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse>
     */
    public AsyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse> updateIpGroupAsyncInvoker(
        UpdateIpGroupRequest request) {
        return new AsyncInvoker<>(request, GaMeta.updateIpGroup, hcClient);
    }

    /**
     * 创建监听器
     *
     * 创建监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateListenerRequest 请求对象
     * @return CompletableFuture<CreateListenerResponse>
     */
    public CompletableFuture<CreateListenerResponse> createListenerAsync(CreateListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.createListener);
    }

    /**
     * 创建监听器
     *
     * 创建监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateListenerRequest 请求对象
     * @return AsyncInvoker<CreateListenerRequest, CreateListenerResponse>
     */
    public AsyncInvoker<CreateListenerRequest, CreateListenerResponse> createListenerAsyncInvoker(
        CreateListenerRequest request) {
        return new AsyncInvoker<>(request, GaMeta.createListener, hcClient);
    }

    /**
     * 删除监听器
     *
     * 删除监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteListenerRequest 请求对象
     * @return CompletableFuture<DeleteListenerResponse>
     */
    public CompletableFuture<DeleteListenerResponse> deleteListenerAsync(DeleteListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.deleteListener);
    }

    /**
     * 删除监听器
     *
     * 删除监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteListenerRequest 请求对象
     * @return AsyncInvoker<DeleteListenerRequest, DeleteListenerResponse>
     */
    public AsyncInvoker<DeleteListenerRequest, DeleteListenerResponse> deleteListenerAsyncInvoker(
        DeleteListenerRequest request) {
        return new AsyncInvoker<>(request, GaMeta.deleteListener, hcClient);
    }

    /**
     * 查询监听器列表
     *
     * 查询监听器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListListenersRequest 请求对象
     * @return CompletableFuture<ListListenersResponse>
     */
    public CompletableFuture<ListListenersResponse> listListenersAsync(ListListenersRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.listListeners);
    }

    /**
     * 查询监听器列表
     *
     * 查询监听器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListListenersRequest 请求对象
     * @return AsyncInvoker<ListListenersRequest, ListListenersResponse>
     */
    public AsyncInvoker<ListListenersRequest, ListListenersResponse> listListenersAsyncInvoker(
        ListListenersRequest request) {
        return new AsyncInvoker<>(request, GaMeta.listListeners, hcClient);
    }

    /**
     * 查询监听器详情
     *
     * 查询监听器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListenerRequest 请求对象
     * @return CompletableFuture<ShowListenerResponse>
     */
    public CompletableFuture<ShowListenerResponse> showListenerAsync(ShowListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.showListener);
    }

    /**
     * 查询监听器详情
     *
     * 查询监听器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListenerRequest 请求对象
     * @return AsyncInvoker<ShowListenerRequest, ShowListenerResponse>
     */
    public AsyncInvoker<ShowListenerRequest, ShowListenerResponse> showListenerAsyncInvoker(
        ShowListenerRequest request) {
        return new AsyncInvoker<>(request, GaMeta.showListener, hcClient);
    }

    /**
     * 更新监听器
     *
     * 更新监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateListenerRequest 请求对象
     * @return CompletableFuture<UpdateListenerResponse>
     */
    public CompletableFuture<UpdateListenerResponse> updateListenerAsync(UpdateListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.updateListener);
    }

    /**
     * 更新监听器
     *
     * 更新监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateListenerRequest 请求对象
     * @return AsyncInvoker<UpdateListenerRequest, UpdateListenerResponse>
     */
    public AsyncInvoker<UpdateListenerRequest, UpdateListenerResponse> updateListenerAsyncInvoker(
        UpdateListenerRequest request) {
        return new AsyncInvoker<>(request, GaMeta.updateListener, hcClient);
    }

    /**
     * 查询区域列表
     *
     * 查询区域列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return CompletableFuture<ListRegionsResponse>
     */
    public CompletableFuture<ListRegionsResponse> listRegionsAsync(ListRegionsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.listRegions);
    }

    /**
     * 查询区域列表
     *
     * 查询区域列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return AsyncInvoker<ListRegionsRequest, ListRegionsResponse>
     */
    public AsyncInvoker<ListRegionsRequest, ListRegionsResponse> listRegionsAsyncInvoker(ListRegionsRequest request) {
        return new AsyncInvoker<>(request, GaMeta.listRegions, hcClient);
    }

    /**
     * 创建资源标签
     *
     * 创建资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagsRequest 请求对象
     * @return CompletableFuture<CreateTagsResponse>
     */
    public CompletableFuture<CreateTagsResponse> createTagsAsync(CreateTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.createTags);
    }

    /**
     * 创建资源标签
     *
     * 创建资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagsRequest 请求对象
     * @return AsyncInvoker<CreateTagsRequest, CreateTagsResponse>
     */
    public AsyncInvoker<CreateTagsRequest, CreateTagsResponse> createTagsAsyncInvoker(CreateTagsRequest request) {
        return new AsyncInvoker<>(request, GaMeta.createTags, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagsRequest 请求对象
     * @return CompletableFuture<DeleteTagsResponse>
     */
    public CompletableFuture<DeleteTagsResponse> deleteTagsAsync(DeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.deleteTags);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagsRequest 请求对象
     * @return AsyncInvoker<DeleteTagsRequest, DeleteTagsResponse>
     */
    public AsyncInvoker<DeleteTagsRequest, DeleteTagsResponse> deleteTagsAsyncInvoker(DeleteTagsRequest request) {
        return new AsyncInvoker<>(request, GaMeta.deleteTags, hcClient);
    }

    /**
     * 查询特定资源标签
     *
     * 查询特定资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceTagsRequest 请求对象
     * @return CompletableFuture<ShowResourceTagsResponse>
     */
    public CompletableFuture<ShowResourceTagsResponse> showResourceTagsAsync(ShowResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaMeta.showResourceTags);
    }

    /**
     * 查询特定资源标签
     *
     * 查询特定资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceTagsRequest 请求对象
     * @return AsyncInvoker<ShowResourceTagsRequest, ShowResourceTagsResponse>
     */
    public AsyncInvoker<ShowResourceTagsRequest, ShowResourceTagsResponse> showResourceTagsAsyncInvoker(
        ShowResourceTagsRequest request) {
        return new AsyncInvoker<>(request, GaMeta.showResourceTags, hcClient);
    }

}
