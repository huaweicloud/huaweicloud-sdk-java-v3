package com.huaweicloud.sdk.vpcep.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.vpcep.v1.model.AcceptOrRejectEndpointRequest;
import com.huaweicloud.sdk.vpcep.v1.model.AcceptOrRejectEndpointResponse;
import com.huaweicloud.sdk.vpcep.v1.model.AddOrRemoveServicePermissionsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.AddOrRemoveServicePermissionsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.BatchAddEndpointServicePermissionsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.BatchAddEndpointServicePermissionsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.BatchAddOrRemoveResourceInstanceRequest;
import com.huaweicloud.sdk.vpcep.v1.model.BatchAddOrRemoveResourceInstanceResponse;
import com.huaweicloud.sdk.vpcep.v1.model.BatchRemoveEndpointServicePermissionsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.BatchRemoveEndpointServicePermissionsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.CreateEndpointRequest;
import com.huaweicloud.sdk.vpcep.v1.model.CreateEndpointResponse;
import com.huaweicloud.sdk.vpcep.v1.model.CreateEndpointServiceRequest;
import com.huaweicloud.sdk.vpcep.v1.model.CreateEndpointServiceResponse;
import com.huaweicloud.sdk.vpcep.v1.model.DeleteEndpointPolicyRequest;
import com.huaweicloud.sdk.vpcep.v1.model.DeleteEndpointPolicyResponse;
import com.huaweicloud.sdk.vpcep.v1.model.DeleteEndpointRequest;
import com.huaweicloud.sdk.vpcep.v1.model.DeleteEndpointResponse;
import com.huaweicloud.sdk.vpcep.v1.model.DeleteEndpointServiceRequest;
import com.huaweicloud.sdk.vpcep.v1.model.DeleteEndpointServiceResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListEndpointInfoDetailsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListEndpointInfoDetailsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListEndpointServiceRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListEndpointServiceResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListEndpointsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListEndpointsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListQueryProjectResourceTagsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListQueryProjectResourceTagsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListQuotaDetailsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListQuotaDetailsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListResourceInstancesRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListResourceInstancesResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListServiceConnectionsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListServiceConnectionsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListServiceDescribeDetailsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListServiceDescribeDetailsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListServiceDetailsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListServiceDetailsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListServicePermissionsDetailsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListServicePermissionsDetailsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListServicePublicDetailsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListServicePublicDetailsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListSpecifiedVersionDetailsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListSpecifiedVersionDetailsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListVersionDetailsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListVersionDetailsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointConnectionsDescRequest;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointConnectionsDescResponse;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointPolicyRequest;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointPolicyResponse;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointRoutetableRequest;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointRoutetableResponse;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServiceNameRequest;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServiceNameResponse;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServicePermissionDescRequest;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServicePermissionDescResponse;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServiceRequest;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServiceResponse;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointWhiteRequest;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointWhiteResponse;

import java.util.concurrent.CompletableFuture;

public class VpcepAsyncClient {

    protected HcClient hcClient;

    public VpcepAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VpcepAsyncClient> newBuilder() {
        ClientBuilder<VpcepAsyncClient> clientBuilder = new ClientBuilder<>(VpcepAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 接受或拒绝终端节点的连接
     *
     * 接受或者拒绝终端节点连接到当前的终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptOrRejectEndpointRequest 请求对象
     * @return CompletableFuture<AcceptOrRejectEndpointResponse>
     */
    public CompletableFuture<AcceptOrRejectEndpointResponse> acceptOrRejectEndpointAsync(
        AcceptOrRejectEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.acceptOrRejectEndpoint);
    }

    /**
     * 接受或拒绝终端节点的连接
     *
     * 接受或者拒绝终端节点连接到当前的终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptOrRejectEndpointRequest 请求对象
     * @return AsyncInvoker<AcceptOrRejectEndpointRequest, AcceptOrRejectEndpointResponse>
     */
    public AsyncInvoker<AcceptOrRejectEndpointRequest, AcceptOrRejectEndpointResponse> acceptOrRejectEndpointAsyncInvoker(
        AcceptOrRejectEndpointRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.acceptOrRejectEndpoint, hcClient);
    }

    /**
     * 批量添加或移除终端节点服务的白名单
     *
     * 批量添加或移除当前用户下终端节点服务的白名单。
     * 说明
     * 本账号默认在自身用户的终端节点服务的白名单中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddOrRemoveServicePermissionsRequest 请求对象
     * @return CompletableFuture<AddOrRemoveServicePermissionsResponse>
     */
    public CompletableFuture<AddOrRemoveServicePermissionsResponse> addOrRemoveServicePermissionsAsync(
        AddOrRemoveServicePermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.addOrRemoveServicePermissions);
    }

    /**
     * 批量添加或移除终端节点服务的白名单
     *
     * 批量添加或移除当前用户下终端节点服务的白名单。
     * 说明
     * 本账号默认在自身用户的终端节点服务的白名单中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddOrRemoveServicePermissionsRequest 请求对象
     * @return AsyncInvoker<AddOrRemoveServicePermissionsRequest, AddOrRemoveServicePermissionsResponse>
     */
    public AsyncInvoker<AddOrRemoveServicePermissionsRequest, AddOrRemoveServicePermissionsResponse> addOrRemoveServicePermissionsAsyncInvoker(
        AddOrRemoveServicePermissionsRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.addOrRemoveServicePermissions, hcClient);
    }

    /**
     * 批量添加终端节点服务的白名单
     *
     * 批量添加当前用户下终端节点服务的白名单，支持添加描述信息。
     * 说明
     * 本账号默认在自身用户的终端节点服务的白名单中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddEndpointServicePermissionsRequest 请求对象
     * @return CompletableFuture<BatchAddEndpointServicePermissionsResponse>
     */
    public CompletableFuture<BatchAddEndpointServicePermissionsResponse> batchAddEndpointServicePermissionsAsync(
        BatchAddEndpointServicePermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.batchAddEndpointServicePermissions);
    }

    /**
     * 批量添加终端节点服务的白名单
     *
     * 批量添加当前用户下终端节点服务的白名单，支持添加描述信息。
     * 说明
     * 本账号默认在自身用户的终端节点服务的白名单中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddEndpointServicePermissionsRequest 请求对象
     * @return AsyncInvoker<BatchAddEndpointServicePermissionsRequest, BatchAddEndpointServicePermissionsResponse>
     */
    public AsyncInvoker<BatchAddEndpointServicePermissionsRequest, BatchAddEndpointServicePermissionsResponse> batchAddEndpointServicePermissionsAsyncInvoker(
        BatchAddEndpointServicePermissionsRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.batchAddEndpointServicePermissions, hcClient);
    }

    /**
     * 批量删除终端节点服务的白名单
     *
     * 批量删除当前用户下终端节点服务的白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRemoveEndpointServicePermissionsRequest 请求对象
     * @return CompletableFuture<BatchRemoveEndpointServicePermissionsResponse>
     */
    public CompletableFuture<BatchRemoveEndpointServicePermissionsResponse> batchRemoveEndpointServicePermissionsAsync(
        BatchRemoveEndpointServicePermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.batchRemoveEndpointServicePermissions);
    }

    /**
     * 批量删除终端节点服务的白名单
     *
     * 批量删除当前用户下终端节点服务的白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRemoveEndpointServicePermissionsRequest 请求对象
     * @return AsyncInvoker<BatchRemoveEndpointServicePermissionsRequest, BatchRemoveEndpointServicePermissionsResponse>
     */
    public AsyncInvoker<BatchRemoveEndpointServicePermissionsRequest, BatchRemoveEndpointServicePermissionsResponse> batchRemoveEndpointServicePermissionsAsyncInvoker(
        BatchRemoveEndpointServicePermissionsRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.batchRemoveEndpointServicePermissions, hcClient);
    }

    /**
     * 创建终端节点
     *
     * 创建终端节点，以便访问终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return CompletableFuture<CreateEndpointResponse>
     */
    public CompletableFuture<CreateEndpointResponse> createEndpointAsync(CreateEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.createEndpoint);
    }

    /**
     * 创建终端节点
     *
     * 创建终端节点，以便访问终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse>
     */
    public AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse> createEndpointAsyncInvoker(
        CreateEndpointRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.createEndpoint, hcClient);
    }

    /**
     * 创建终端节点服务
     *
     * 创建终端节点服务，允许其他用户创建终端节点连接您创建的终端节点服务，
     * 使用您所提供的服务。
     * 说明
     * 该接口为异步接口，调用成功会返回200状态码，说明请求已正常下发。
     * 通常创建终端节点服务需要1~2分钟，可以通过查询终端节点服务详情查看创建结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointServiceRequest 请求对象
     * @return CompletableFuture<CreateEndpointServiceResponse>
     */
    public CompletableFuture<CreateEndpointServiceResponse> createEndpointServiceAsync(
        CreateEndpointServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.createEndpointService);
    }

    /**
     * 创建终端节点服务
     *
     * 创建终端节点服务，允许其他用户创建终端节点连接您创建的终端节点服务，
     * 使用您所提供的服务。
     * 说明
     * 该接口为异步接口，调用成功会返回200状态码，说明请求已正常下发。
     * 通常创建终端节点服务需要1~2分钟，可以通过查询终端节点服务详情查看创建结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointServiceRequest 请求对象
     * @return AsyncInvoker<CreateEndpointServiceRequest, CreateEndpointServiceResponse>
     */
    public AsyncInvoker<CreateEndpointServiceRequest, CreateEndpointServiceResponse> createEndpointServiceAsyncInvoker(
        CreateEndpointServiceRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.createEndpointService, hcClient);
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
        return hcClient.asyncInvokeHttp(request, VpcepMeta.deleteEndpoint);
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
        return new AsyncInvoker<>(request, VpcepMeta.deleteEndpoint, hcClient);
    }

    /**
     * 删除网关型终端节点策略（待下线）
     *
     * 删除网关型终端节点策略，该接口待下线，不建议使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointPolicyRequest 请求对象
     * @return CompletableFuture<DeleteEndpointPolicyResponse>
     */
    public CompletableFuture<DeleteEndpointPolicyResponse> deleteEndpointPolicyAsync(
        DeleteEndpointPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.deleteEndpointPolicy);
    }

    /**
     * 删除网关型终端节点策略（待下线）
     *
     * 删除网关型终端节点策略，该接口待下线，不建议使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteEndpointPolicyRequest, DeleteEndpointPolicyResponse>
     */
    public AsyncInvoker<DeleteEndpointPolicyRequest, DeleteEndpointPolicyResponse> deleteEndpointPolicyAsyncInvoker(
        DeleteEndpointPolicyRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.deleteEndpointPolicy, hcClient);
    }

    /**
     * 删除终端节点服务
     *
     * 删除终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointServiceRequest 请求对象
     * @return CompletableFuture<DeleteEndpointServiceResponse>
     */
    public CompletableFuture<DeleteEndpointServiceResponse> deleteEndpointServiceAsync(
        DeleteEndpointServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.deleteEndpointService);
    }

    /**
     * 删除终端节点服务
     *
     * 删除终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointServiceRequest 请求对象
     * @return AsyncInvoker<DeleteEndpointServiceRequest, DeleteEndpointServiceResponse>
     */
    public AsyncInvoker<DeleteEndpointServiceRequest, DeleteEndpointServiceResponse> deleteEndpointServiceAsyncInvoker(
        DeleteEndpointServiceRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.deleteEndpointService, hcClient);
    }

    /**
     * 查询终端节点详情
     *
     * 查询终端节点的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointInfoDetailsRequest 请求对象
     * @return CompletableFuture<ListEndpointInfoDetailsResponse>
     */
    public CompletableFuture<ListEndpointInfoDetailsResponse> listEndpointInfoDetailsAsync(
        ListEndpointInfoDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listEndpointInfoDetails);
    }

    /**
     * 查询终端节点详情
     *
     * 查询终端节点的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointInfoDetailsRequest 请求对象
     * @return AsyncInvoker<ListEndpointInfoDetailsRequest, ListEndpointInfoDetailsResponse>
     */
    public AsyncInvoker<ListEndpointInfoDetailsRequest, ListEndpointInfoDetailsResponse> listEndpointInfoDetailsAsyncInvoker(
        ListEndpointInfoDetailsRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.listEndpointInfoDetails, hcClient);
    }

    /**
     * 查询终端节点服务列表
     *
     * 查询当前用户下的终端节点服务的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointServiceRequest 请求对象
     * @return CompletableFuture<ListEndpointServiceResponse>
     */
    public CompletableFuture<ListEndpointServiceResponse> listEndpointServiceAsync(ListEndpointServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listEndpointService);
    }

    /**
     * 查询终端节点服务列表
     *
     * 查询当前用户下的终端节点服务的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointServiceRequest 请求对象
     * @return AsyncInvoker<ListEndpointServiceRequest, ListEndpointServiceResponse>
     */
    public AsyncInvoker<ListEndpointServiceRequest, ListEndpointServiceResponse> listEndpointServiceAsyncInvoker(
        ListEndpointServiceRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.listEndpointService, hcClient);
    }

    /**
     * 查询终端节点列表
     *
     * 查询当前用户下的终端节点的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return CompletableFuture<ListEndpointsResponse>
     */
    public CompletableFuture<ListEndpointsResponse> listEndpointsAsync(ListEndpointsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listEndpoints);
    }

    /**
     * 查询终端节点列表
     *
     * 查询当前用户下的终端节点的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse>
     */
    public AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse> listEndpointsAsyncInvoker(
        ListEndpointsRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.listEndpoints, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询用户的资源配额，包括终端节点服务和终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotaDetailsRequest 请求对象
     * @return CompletableFuture<ListQuotaDetailsResponse>
     */
    public CompletableFuture<ListQuotaDetailsResponse> listQuotaDetailsAsync(ListQuotaDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listQuotaDetails);
    }

    /**
     * 查询配额
     *
     * 查询用户的资源配额，包括终端节点服务和终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotaDetailsRequest 请求对象
     * @return AsyncInvoker<ListQuotaDetailsRequest, ListQuotaDetailsResponse>
     */
    public AsyncInvoker<ListQuotaDetailsRequest, ListQuotaDetailsResponse> listQuotaDetailsAsyncInvoker(
        ListQuotaDetailsRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.listQuotaDetails, hcClient);
    }

    /**
     * 查询连接终端节点服务的连接列表
     *
     * 查询连接当前用户下的某一个终端节点服务的连接列表。marker_id是连接的唯一标识。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceConnectionsRequest 请求对象
     * @return CompletableFuture<ListServiceConnectionsResponse>
     */
    public CompletableFuture<ListServiceConnectionsResponse> listServiceConnectionsAsync(
        ListServiceConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listServiceConnections);
    }

    /**
     * 查询连接终端节点服务的连接列表
     *
     * 查询连接当前用户下的某一个终端节点服务的连接列表。marker_id是连接的唯一标识。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceConnectionsRequest 请求对象
     * @return AsyncInvoker<ListServiceConnectionsRequest, ListServiceConnectionsResponse>
     */
    public AsyncInvoker<ListServiceConnectionsRequest, ListServiceConnectionsResponse> listServiceConnectionsAsyncInvoker(
        ListServiceConnectionsRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.listServiceConnections, hcClient);
    }

    /**
     * 查询终端节点服务概要
     *
     * 查询终端节点服务的概要信息， 此接口是供创建终端节点的用户来查询需要连接的终端节点服务信息。 此接口既可以方便其他用户查询到您的终端节点服务概要信息, 又可以避免您的终端节点服务的细节信息暴露给其他用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceDescribeDetailsRequest 请求对象
     * @return CompletableFuture<ListServiceDescribeDetailsResponse>
     */
    public CompletableFuture<ListServiceDescribeDetailsResponse> listServiceDescribeDetailsAsync(
        ListServiceDescribeDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listServiceDescribeDetails);
    }

    /**
     * 查询终端节点服务概要
     *
     * 查询终端节点服务的概要信息， 此接口是供创建终端节点的用户来查询需要连接的终端节点服务信息。 此接口既可以方便其他用户查询到您的终端节点服务概要信息, 又可以避免您的终端节点服务的细节信息暴露给其他用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceDescribeDetailsRequest 请求对象
     * @return AsyncInvoker<ListServiceDescribeDetailsRequest, ListServiceDescribeDetailsResponse>
     */
    public AsyncInvoker<ListServiceDescribeDetailsRequest, ListServiceDescribeDetailsResponse> listServiceDescribeDetailsAsyncInvoker(
        ListServiceDescribeDetailsRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.listServiceDescribeDetails, hcClient);
    }

    /**
     * 查询终端节点服务详情
     *
     * 查询终端节点服务的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceDetailsRequest 请求对象
     * @return CompletableFuture<ListServiceDetailsResponse>
     */
    public CompletableFuture<ListServiceDetailsResponse> listServiceDetailsAsync(ListServiceDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listServiceDetails);
    }

    /**
     * 查询终端节点服务详情
     *
     * 查询终端节点服务的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceDetailsRequest 请求对象
     * @return AsyncInvoker<ListServiceDetailsRequest, ListServiceDetailsResponse>
     */
    public AsyncInvoker<ListServiceDetailsRequest, ListServiceDetailsResponse> listServiceDetailsAsyncInvoker(
        ListServiceDetailsRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.listServiceDetails, hcClient);
    }

    /**
     * 查询终端节点服务的白名单列表
     *
     * 查询当前用户下终端节点服务的白名单列表。
     * 说明
     * 本账号默认在当前用户下终端节点服务的白名单中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServicePermissionsDetailsRequest 请求对象
     * @return CompletableFuture<ListServicePermissionsDetailsResponse>
     */
    public CompletableFuture<ListServicePermissionsDetailsResponse> listServicePermissionsDetailsAsync(
        ListServicePermissionsDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listServicePermissionsDetails);
    }

    /**
     * 查询终端节点服务的白名单列表
     *
     * 查询当前用户下终端节点服务的白名单列表。
     * 说明
     * 本账号默认在当前用户下终端节点服务的白名单中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServicePermissionsDetailsRequest 请求对象
     * @return AsyncInvoker<ListServicePermissionsDetailsRequest, ListServicePermissionsDetailsResponse>
     */
    public AsyncInvoker<ListServicePermissionsDetailsRequest, ListServicePermissionsDetailsResponse> listServicePermissionsDetailsAsyncInvoker(
        ListServicePermissionsDetailsRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.listServicePermissionsDetails, hcClient);
    }

    /**
     * 查询公共终端节点服务列表
     *
     * 查询公共终端节点服务的列表，公共终端节点服务是所有用户可见且可连接的终端节点服务，
     * 由运维人员创建，用户可直接使用，但无权创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServicePublicDetailsRequest 请求对象
     * @return CompletableFuture<ListServicePublicDetailsResponse>
     */
    public CompletableFuture<ListServicePublicDetailsResponse> listServicePublicDetailsAsync(
        ListServicePublicDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listServicePublicDetails);
    }

    /**
     * 查询公共终端节点服务列表
     *
     * 查询公共终端节点服务的列表，公共终端节点服务是所有用户可见且可连接的终端节点服务，
     * 由运维人员创建，用户可直接使用，但无权创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServicePublicDetailsRequest 请求对象
     * @return AsyncInvoker<ListServicePublicDetailsRequest, ListServicePublicDetailsResponse>
     */
    public AsyncInvoker<ListServicePublicDetailsRequest, ListServicePublicDetailsResponse> listServicePublicDetailsAsyncInvoker(
        ListServicePublicDetailsRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.listServicePublicDetails, hcClient);
    }

    /**
     * 查询指定VPC终端节点接口版本信息
     *
     * 查询指定VPC终端节点接口版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpecifiedVersionDetailsRequest 请求对象
     * @return CompletableFuture<ListSpecifiedVersionDetailsResponse>
     */
    public CompletableFuture<ListSpecifiedVersionDetailsResponse> listSpecifiedVersionDetailsAsync(
        ListSpecifiedVersionDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listSpecifiedVersionDetails);
    }

    /**
     * 查询指定VPC终端节点接口版本信息
     *
     * 查询指定VPC终端节点接口版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpecifiedVersionDetailsRequest 请求对象
     * @return AsyncInvoker<ListSpecifiedVersionDetailsRequest, ListSpecifiedVersionDetailsResponse>
     */
    public AsyncInvoker<ListSpecifiedVersionDetailsRequest, ListSpecifiedVersionDetailsResponse> listSpecifiedVersionDetailsAsyncInvoker(
        ListSpecifiedVersionDetailsRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.listSpecifiedVersionDetails, hcClient);
    }

    /**
     * 查询VPC终端节点接口版本列表
     *
     * 查询VPC终端节点接口版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionDetailsRequest 请求对象
     * @return CompletableFuture<ListVersionDetailsResponse>
     */
    public CompletableFuture<ListVersionDetailsResponse> listVersionDetailsAsync(ListVersionDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listVersionDetails);
    }

    /**
     * 查询VPC终端节点接口版本列表
     *
     * 查询VPC终端节点接口版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionDetailsRequest 请求对象
     * @return AsyncInvoker<ListVersionDetailsRequest, ListVersionDetailsResponse>
     */
    public AsyncInvoker<ListVersionDetailsRequest, ListVersionDetailsResponse> listVersionDetailsAsyncInvoker(
        ListVersionDetailsRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.listVersionDetails, hcClient);
    }

    /**
     * 更新终端节点连接描述
     *
     * 更新终端节点服务连接的终端节点的描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointConnectionsDescRequest 请求对象
     * @return CompletableFuture<UpdateEndpointConnectionsDescResponse>
     */
    public CompletableFuture<UpdateEndpointConnectionsDescResponse> updateEndpointConnectionsDescAsync(
        UpdateEndpointConnectionsDescRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.updateEndpointConnectionsDesc);
    }

    /**
     * 更新终端节点连接描述
     *
     * 更新终端节点服务连接的终端节点的描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointConnectionsDescRequest 请求对象
     * @return AsyncInvoker<UpdateEndpointConnectionsDescRequest, UpdateEndpointConnectionsDescResponse>
     */
    public AsyncInvoker<UpdateEndpointConnectionsDescRequest, UpdateEndpointConnectionsDescResponse> updateEndpointConnectionsDescAsyncInvoker(
        UpdateEndpointConnectionsDescRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.updateEndpointConnectionsDesc, hcClient);
    }

    /**
     * 修改终端节点策略
     *
     * 修改终端节点策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointPolicyRequest 请求对象
     * @return CompletableFuture<UpdateEndpointPolicyResponse>
     */
    public CompletableFuture<UpdateEndpointPolicyResponse> updateEndpointPolicyAsync(
        UpdateEndpointPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.updateEndpointPolicy);
    }

    /**
     * 修改终端节点策略
     *
     * 修改终端节点策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateEndpointPolicyRequest, UpdateEndpointPolicyResponse>
     */
    public AsyncInvoker<UpdateEndpointPolicyRequest, UpdateEndpointPolicyResponse> updateEndpointPolicyAsyncInvoker(
        UpdateEndpointPolicyRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.updateEndpointPolicy, hcClient);
    }

    /**
     * 修改终端节点的路由表
     *
     * 修改终端节点的路由表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointRoutetableRequest 请求对象
     * @return CompletableFuture<UpdateEndpointRoutetableResponse>
     */
    public CompletableFuture<UpdateEndpointRoutetableResponse> updateEndpointRoutetableAsync(
        UpdateEndpointRoutetableRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.updateEndpointRoutetable);
    }

    /**
     * 修改终端节点的路由表
     *
     * 修改终端节点的路由表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointRoutetableRequest 请求对象
     * @return AsyncInvoker<UpdateEndpointRoutetableRequest, UpdateEndpointRoutetableResponse>
     */
    public AsyncInvoker<UpdateEndpointRoutetableRequest, UpdateEndpointRoutetableResponse> updateEndpointRoutetableAsyncInvoker(
        UpdateEndpointRoutetableRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.updateEndpointRoutetable, hcClient);
    }

    /**
     * 修改终端节点服务
     *
     * 修改终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointServiceRequest 请求对象
     * @return CompletableFuture<UpdateEndpointServiceResponse>
     */
    public CompletableFuture<UpdateEndpointServiceResponse> updateEndpointServiceAsync(
        UpdateEndpointServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.updateEndpointService);
    }

    /**
     * 修改终端节点服务
     *
     * 修改终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointServiceRequest 请求对象
     * @return AsyncInvoker<UpdateEndpointServiceRequest, UpdateEndpointServiceResponse>
     */
    public AsyncInvoker<UpdateEndpointServiceRequest, UpdateEndpointServiceResponse> updateEndpointServiceAsyncInvoker(
        UpdateEndpointServiceRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.updateEndpointService, hcClient);
    }

    /**
     * 修改终端节点服务名称
     *
     * 修改终端节点服务名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointServiceNameRequest 请求对象
     * @return CompletableFuture<UpdateEndpointServiceNameResponse>
     */
    public CompletableFuture<UpdateEndpointServiceNameResponse> updateEndpointServiceNameAsync(
        UpdateEndpointServiceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.updateEndpointServiceName);
    }

    /**
     * 修改终端节点服务名称
     *
     * 修改终端节点服务名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointServiceNameRequest 请求对象
     * @return AsyncInvoker<UpdateEndpointServiceNameRequest, UpdateEndpointServiceNameResponse>
     */
    public AsyncInvoker<UpdateEndpointServiceNameRequest, UpdateEndpointServiceNameResponse> updateEndpointServiceNameAsyncInvoker(
        UpdateEndpointServiceNameRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.updateEndpointServiceName, hcClient);
    }

    /**
     * 更新终端节点服务白名单描述
     *
     * 更新当前用户下终端节点服务白名单的描述信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointServicePermissionDescRequest 请求对象
     * @return CompletableFuture<UpdateEndpointServicePermissionDescResponse>
     */
    public CompletableFuture<UpdateEndpointServicePermissionDescResponse> updateEndpointServicePermissionDescAsync(
        UpdateEndpointServicePermissionDescRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.updateEndpointServicePermissionDesc);
    }

    /**
     * 更新终端节点服务白名单描述
     *
     * 更新当前用户下终端节点服务白名单的描述信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointServicePermissionDescRequest 请求对象
     * @return AsyncInvoker<UpdateEndpointServicePermissionDescRequest, UpdateEndpointServicePermissionDescResponse>
     */
    public AsyncInvoker<UpdateEndpointServicePermissionDescRequest, UpdateEndpointServicePermissionDescResponse> updateEndpointServicePermissionDescAsyncInvoker(
        UpdateEndpointServicePermissionDescRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.updateEndpointServicePermissionDesc, hcClient);
    }

    /**
     * 更新终端节点
     *
     * 更新或删除允许访问终端节点的白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointWhiteRequest 请求对象
     * @return CompletableFuture<UpdateEndpointWhiteResponse>
     */
    public CompletableFuture<UpdateEndpointWhiteResponse> updateEndpointWhiteAsync(UpdateEndpointWhiteRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.updateEndpointWhite);
    }

    /**
     * 更新终端节点
     *
     * 更新或删除允许访问终端节点的白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointWhiteRequest 请求对象
     * @return AsyncInvoker<UpdateEndpointWhiteRequest, UpdateEndpointWhiteResponse>
     */
    public AsyncInvoker<UpdateEndpointWhiteRequest, UpdateEndpointWhiteResponse> updateEndpointWhiteAsyncInvoker(
        UpdateEndpointWhiteRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.updateEndpointWhite, hcClient);
    }

    /**
     * 批量添加或删除资源标签接口
     *
     * 为指定Endpoint Service或Endpoint批量添加或删除标签。
     *  - 一个资源上最多有10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddOrRemoveResourceInstanceRequest 请求对象
     * @return CompletableFuture<BatchAddOrRemoveResourceInstanceResponse>
     */
    public CompletableFuture<BatchAddOrRemoveResourceInstanceResponse> batchAddOrRemoveResourceInstanceAsync(
        BatchAddOrRemoveResourceInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.batchAddOrRemoveResourceInstance);
    }

    /**
     * 批量添加或删除资源标签接口
     *
     * 为指定Endpoint Service或Endpoint批量添加或删除标签。
     *  - 一个资源上最多有10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddOrRemoveResourceInstanceRequest 请求对象
     * @return AsyncInvoker<BatchAddOrRemoveResourceInstanceRequest, BatchAddOrRemoveResourceInstanceResponse>
     */
    public AsyncInvoker<BatchAddOrRemoveResourceInstanceRequest, BatchAddOrRemoveResourceInstanceResponse> batchAddOrRemoveResourceInstanceAsyncInvoker(
        BatchAddOrRemoveResourceInstanceRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.batchAddOrRemoveResourceInstance, hcClient);
    }

    /**
     * 查询租户资源标签接口
     *
     * 根据租户ID和资源类型，获取租户下资源的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryProjectResourceTagsRequest 请求对象
     * @return CompletableFuture<ListQueryProjectResourceTagsResponse>
     */
    public CompletableFuture<ListQueryProjectResourceTagsResponse> listQueryProjectResourceTagsAsync(
        ListQueryProjectResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listQueryProjectResourceTags);
    }

    /**
     * 查询租户资源标签接口
     *
     * 根据租户ID和资源类型，获取租户下资源的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryProjectResourceTagsRequest 请求对象
     * @return AsyncInvoker<ListQueryProjectResourceTagsRequest, ListQueryProjectResourceTagsResponse>
     */
    public AsyncInvoker<ListQueryProjectResourceTagsRequest, ListQueryProjectResourceTagsResponse> listQueryProjectResourceTagsAsyncInvoker(
        ListQueryProjectResourceTagsRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.listQueryProjectResourceTags, hcClient);
    }

    /**
     * 查询资源实例接口
     *
     * 使用标签过滤查询租户下资源的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstancesRequest 请求对象
     * @return CompletableFuture<ListResourceInstancesResponse>
     */
    public CompletableFuture<ListResourceInstancesResponse> listResourceInstancesAsync(
        ListResourceInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listResourceInstances);
    }

    /**
     * 查询资源实例接口
     *
     * 使用标签过滤查询租户下资源的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstancesRequest 请求对象
     * @return AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>
     */
    public AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstancesAsyncInvoker(
        ListResourceInstancesRequest request) {
        return new AsyncInvoker<>(request, VpcepMeta.listResourceInstances, hcClient);
    }

}
