package com.huaweicloud.sdk.vpcep.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.vpcep.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class VpcepAsyncClient {

    protected HcClient hcClient;

    public VpcepAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VpcepAsyncClient> newBuilder() {
        return new ClientBuilder<>(VpcepAsyncClient::new);
    }

    /**
     * 接受或拒绝终端节点的连接
     *
     * 功能介绍
     * 接受或者拒绝终端节点连接到当前的终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AcceptOrRejectEndpointRequest 请求对象
     * @return CompletableFuture<AcceptOrRejectEndpointResponse>
     */
    public CompletableFuture<AcceptOrRejectEndpointResponse> acceptOrRejectEndpointAsync(
        AcceptOrRejectEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.acceptOrRejectEndpoint);
    }

    /**
     * 接受或拒绝终端节点的连接
     *
     * 功能介绍
     * 接受或者拒绝终端节点连接到当前的终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AcceptOrRejectEndpointRequest 请求对象
     * @return AsyncInvoker<AcceptOrRejectEndpointRequest, AcceptOrRejectEndpointResponse>
     */
    public AsyncInvoker<AcceptOrRejectEndpointRequest, AcceptOrRejectEndpointResponse> acceptOrRejectEndpointAsyncInvoker(
        AcceptOrRejectEndpointRequest request) {
        return new AsyncInvoker<AcceptOrRejectEndpointRequest, AcceptOrRejectEndpointResponse>(request,
            VpcepMeta.acceptOrRejectEndpoint, hcClient);
    }

    /**
     * 批量添加或移除终端节点服务的白名单
     *
     * 功能介绍
     * 批量添加或移除当前用户下终端节点服务的白名单。
     * 说明
     * 本帐号默认在自身用户的终端节点服务的白名单中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddOrRemoveServicePermissionsRequest 请求对象
     * @return CompletableFuture<AddOrRemoveServicePermissionsResponse>
     */
    public CompletableFuture<AddOrRemoveServicePermissionsResponse> addOrRemoveServicePermissionsAsync(
        AddOrRemoveServicePermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.addOrRemoveServicePermissions);
    }

    /**
     * 批量添加或移除终端节点服务的白名单
     *
     * 功能介绍
     * 批量添加或移除当前用户下终端节点服务的白名单。
     * 说明
     * 本帐号默认在自身用户的终端节点服务的白名单中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddOrRemoveServicePermissionsRequest 请求对象
     * @return AsyncInvoker<AddOrRemoveServicePermissionsRequest, AddOrRemoveServicePermissionsResponse>
     */
    public AsyncInvoker<AddOrRemoveServicePermissionsRequest, AddOrRemoveServicePermissionsResponse> addOrRemoveServicePermissionsAsyncInvoker(
        AddOrRemoveServicePermissionsRequest request) {
        return new AsyncInvoker<AddOrRemoveServicePermissionsRequest, AddOrRemoveServicePermissionsResponse>(request,
            VpcepMeta.addOrRemoveServicePermissions, hcClient);
    }

    /**
     * 批量添加终端节点服务的白名单
     *
     * 功能介绍
     * 批量添加当前用户下终端节点服务的白名单，支持添加描述信息。
     * 说明
     * 本帐号默认在自身用户的终端节点服务的白名单中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddEndpointServicePermissionsRequest 请求对象
     * @return CompletableFuture<BatchAddEndpointServicePermissionsResponse>
     */
    public CompletableFuture<BatchAddEndpointServicePermissionsResponse> batchAddEndpointServicePermissionsAsync(
        BatchAddEndpointServicePermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.batchAddEndpointServicePermissions);
    }

    /**
     * 批量添加终端节点服务的白名单
     *
     * 功能介绍
     * 批量添加当前用户下终端节点服务的白名单，支持添加描述信息。
     * 说明
     * 本帐号默认在自身用户的终端节点服务的白名单中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddEndpointServicePermissionsRequest 请求对象
     * @return AsyncInvoker<BatchAddEndpointServicePermissionsRequest, BatchAddEndpointServicePermissionsResponse>
     */
    public AsyncInvoker<BatchAddEndpointServicePermissionsRequest, BatchAddEndpointServicePermissionsResponse> batchAddEndpointServicePermissionsAsyncInvoker(
        BatchAddEndpointServicePermissionsRequest request) {
        return new AsyncInvoker<BatchAddEndpointServicePermissionsRequest, BatchAddEndpointServicePermissionsResponse>(
            request, VpcepMeta.batchAddEndpointServicePermissions, hcClient);
    }

    /**
     * 批量删除终端节点服务的白名单
     *
     * 功能介绍
     * 批量删除当前用户下终端节点服务的白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRemoveEndpointServicePermissionsRequest 请求对象
     * @return CompletableFuture<BatchRemoveEndpointServicePermissionsResponse>
     */
    public CompletableFuture<BatchRemoveEndpointServicePermissionsResponse> batchRemoveEndpointServicePermissionsAsync(
        BatchRemoveEndpointServicePermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.batchRemoveEndpointServicePermissions);
    }

    /**
     * 批量删除终端节点服务的白名单
     *
     * 功能介绍
     * 批量删除当前用户下终端节点服务的白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRemoveEndpointServicePermissionsRequest 请求对象
     * @return AsyncInvoker<BatchRemoveEndpointServicePermissionsRequest, BatchRemoveEndpointServicePermissionsResponse>
     */
    public AsyncInvoker<BatchRemoveEndpointServicePermissionsRequest, BatchRemoveEndpointServicePermissionsResponse> batchRemoveEndpointServicePermissionsAsyncInvoker(
        BatchRemoveEndpointServicePermissionsRequest request) {
        return new AsyncInvoker<BatchRemoveEndpointServicePermissionsRequest, BatchRemoveEndpointServicePermissionsResponse>(
            request, VpcepMeta.batchRemoveEndpointServicePermissions, hcClient);
    }

    /**
     * 创建终端节点
     *
     * 功能介绍
     * 创建终端节点，以便访问终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEndpointRequest 请求对象
     * @return CompletableFuture<CreateEndpointResponse>
     */
    public CompletableFuture<CreateEndpointResponse> createEndpointAsync(CreateEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.createEndpoint);
    }

    /**
     * 创建终端节点
     *
     * 功能介绍
     * 创建终端节点，以便访问终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEndpointRequest 请求对象
     * @return AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse>
     */
    public AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse> createEndpointAsyncInvoker(
        CreateEndpointRequest request) {
        return new AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse>(request, VpcepMeta.createEndpoint,
            hcClient);
    }

    /**
     * 创建终端节点服务
     *
     * 功能介绍
     * 创建终端节点服务，允许其他用户创建终端节点连接您创建的终端节点服务，
     * 使用您所提供的服务。
     * 说明
     * 该接口为异步接口，调用成功会返回200状态码，说明请求已正常下发。
     * 通常创建终端节点服务需要1~2分钟，可以通过查询终端节点服务详情查看创建结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEndpointServiceRequest 请求对象
     * @return CompletableFuture<CreateEndpointServiceResponse>
     */
    public CompletableFuture<CreateEndpointServiceResponse> createEndpointServiceAsync(
        CreateEndpointServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.createEndpointService);
    }

    /**
     * 创建终端节点服务
     *
     * 功能介绍
     * 创建终端节点服务，允许其他用户创建终端节点连接您创建的终端节点服务，
     * 使用您所提供的服务。
     * 说明
     * 该接口为异步接口，调用成功会返回200状态码，说明请求已正常下发。
     * 通常创建终端节点服务需要1~2分钟，可以通过查询终端节点服务详情查看创建结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEndpointServiceRequest 请求对象
     * @return AsyncInvoker<CreateEndpointServiceRequest, CreateEndpointServiceResponse>
     */
    public AsyncInvoker<CreateEndpointServiceRequest, CreateEndpointServiceResponse> createEndpointServiceAsyncInvoker(
        CreateEndpointServiceRequest request) {
        return new AsyncInvoker<CreateEndpointServiceRequest, CreateEndpointServiceResponse>(request,
            VpcepMeta.createEndpointService, hcClient);
    }

    /**
     * 删除终端节点
     *
     * 功能介绍
     * 删除终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEndpointRequest 请求对象
     * @return CompletableFuture<DeleteEndpointResponse>
     */
    public CompletableFuture<DeleteEndpointResponse> deleteEndpointAsync(DeleteEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.deleteEndpoint);
    }

    /**
     * 删除终端节点
     *
     * 功能介绍
     * 删除终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEndpointRequest 请求对象
     * @return AsyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>
     */
    public AsyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpointAsyncInvoker(
        DeleteEndpointRequest request) {
        return new AsyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>(request, VpcepMeta.deleteEndpoint,
            hcClient);
    }

    /**
     * 删除网关型终端节点policy
     *
     * 功能介绍
     * 删除网关型终端节点policy。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEndpointPolicyRequest 请求对象
     * @return CompletableFuture<DeleteEndpointPolicyResponse>
     */
    public CompletableFuture<DeleteEndpointPolicyResponse> deleteEndpointPolicyAsync(
        DeleteEndpointPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.deleteEndpointPolicy);
    }

    /**
     * 删除网关型终端节点policy
     *
     * 功能介绍
     * 删除网关型终端节点policy。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEndpointPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteEndpointPolicyRequest, DeleteEndpointPolicyResponse>
     */
    public AsyncInvoker<DeleteEndpointPolicyRequest, DeleteEndpointPolicyResponse> deleteEndpointPolicyAsyncInvoker(
        DeleteEndpointPolicyRequest request) {
        return new AsyncInvoker<DeleteEndpointPolicyRequest, DeleteEndpointPolicyResponse>(request,
            VpcepMeta.deleteEndpointPolicy, hcClient);
    }

    /**
     * 删除终端节点服务
     *
     * 功能介绍
     * 删除终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEndpointServiceRequest 请求对象
     * @return CompletableFuture<DeleteEndpointServiceResponse>
     */
    public CompletableFuture<DeleteEndpointServiceResponse> deleteEndpointServiceAsync(
        DeleteEndpointServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.deleteEndpointService);
    }

    /**
     * 删除终端节点服务
     *
     * 功能介绍
     * 删除终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEndpointServiceRequest 请求对象
     * @return AsyncInvoker<DeleteEndpointServiceRequest, DeleteEndpointServiceResponse>
     */
    public AsyncInvoker<DeleteEndpointServiceRequest, DeleteEndpointServiceResponse> deleteEndpointServiceAsyncInvoker(
        DeleteEndpointServiceRequest request) {
        return new AsyncInvoker<DeleteEndpointServiceRequest, DeleteEndpointServiceResponse>(request,
            VpcepMeta.deleteEndpointService, hcClient);
    }

    /**
     * 查询终端节点详情
     *
     * 功能介绍
     * 查询终端节点的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEndpointInfoDetailsRequest 请求对象
     * @return CompletableFuture<ListEndpointInfoDetailsResponse>
     */
    public CompletableFuture<ListEndpointInfoDetailsResponse> listEndpointInfoDetailsAsync(
        ListEndpointInfoDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listEndpointInfoDetails);
    }

    /**
     * 查询终端节点详情
     *
     * 功能介绍
     * 查询终端节点的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEndpointInfoDetailsRequest 请求对象
     * @return AsyncInvoker<ListEndpointInfoDetailsRequest, ListEndpointInfoDetailsResponse>
     */
    public AsyncInvoker<ListEndpointInfoDetailsRequest, ListEndpointInfoDetailsResponse> listEndpointInfoDetailsAsyncInvoker(
        ListEndpointInfoDetailsRequest request) {
        return new AsyncInvoker<ListEndpointInfoDetailsRequest, ListEndpointInfoDetailsResponse>(request,
            VpcepMeta.listEndpointInfoDetails, hcClient);
    }

    /**
     * 查询终端节点服务列表
     *
     * 功能介绍
     * 查询当前用户下的终端节点服务的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEndpointServiceRequest 请求对象
     * @return CompletableFuture<ListEndpointServiceResponse>
     */
    public CompletableFuture<ListEndpointServiceResponse> listEndpointServiceAsync(ListEndpointServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listEndpointService);
    }

    /**
     * 查询终端节点服务列表
     *
     * 功能介绍
     * 查询当前用户下的终端节点服务的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEndpointServiceRequest 请求对象
     * @return AsyncInvoker<ListEndpointServiceRequest, ListEndpointServiceResponse>
     */
    public AsyncInvoker<ListEndpointServiceRequest, ListEndpointServiceResponse> listEndpointServiceAsyncInvoker(
        ListEndpointServiceRequest request) {
        return new AsyncInvoker<ListEndpointServiceRequest, ListEndpointServiceResponse>(request,
            VpcepMeta.listEndpointService, hcClient);
    }

    /**
     * 查询终端节点列表
     *
     * 功能介绍
     * 查询当前用户下的终端节点的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEndpointsRequest 请求对象
     * @return CompletableFuture<ListEndpointsResponse>
     */
    public CompletableFuture<ListEndpointsResponse> listEndpointsAsync(ListEndpointsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listEndpoints);
    }

    /**
     * 查询终端节点列表
     *
     * 功能介绍
     * 查询当前用户下的终端节点的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEndpointsRequest 请求对象
     * @return AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse>
     */
    public AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse> listEndpointsAsyncInvoker(
        ListEndpointsRequest request) {
        return new AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse>(request, VpcepMeta.listEndpoints,
            hcClient);
    }

    /**
     * 查询配额
     *
     * 功能介绍
     * 查询用户的资源配额，包括终端节点服务和终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaDetailsRequest 请求对象
     * @return CompletableFuture<ListQuotaDetailsResponse>
     */
    public CompletableFuture<ListQuotaDetailsResponse> listQuotaDetailsAsync(ListQuotaDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listQuotaDetails);
    }

    /**
     * 查询配额
     *
     * 功能介绍
     * 查询用户的资源配额，包括终端节点服务和终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaDetailsRequest 请求对象
     * @return AsyncInvoker<ListQuotaDetailsRequest, ListQuotaDetailsResponse>
     */
    public AsyncInvoker<ListQuotaDetailsRequest, ListQuotaDetailsResponse> listQuotaDetailsAsyncInvoker(
        ListQuotaDetailsRequest request) {
        return new AsyncInvoker<ListQuotaDetailsRequest, ListQuotaDetailsResponse>(request, VpcepMeta.listQuotaDetails,
            hcClient);
    }

    /**
     * 查询连接终端节点服务的连接列表
     *
     * 功能介绍
     * 查询连接当前用户下的某一个终端节点服务的连接列表。marker_id是连接的唯一标识。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceConnectionsRequest 请求对象
     * @return CompletableFuture<ListServiceConnectionsResponse>
     */
    public CompletableFuture<ListServiceConnectionsResponse> listServiceConnectionsAsync(
        ListServiceConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listServiceConnections);
    }

    /**
     * 查询连接终端节点服务的连接列表
     *
     * 功能介绍
     * 查询连接当前用户下的某一个终端节点服务的连接列表。marker_id是连接的唯一标识。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceConnectionsRequest 请求对象
     * @return AsyncInvoker<ListServiceConnectionsRequest, ListServiceConnectionsResponse>
     */
    public AsyncInvoker<ListServiceConnectionsRequest, ListServiceConnectionsResponse> listServiceConnectionsAsyncInvoker(
        ListServiceConnectionsRequest request) {
        return new AsyncInvoker<ListServiceConnectionsRequest, ListServiceConnectionsResponse>(request,
            VpcepMeta.listServiceConnections, hcClient);
    }

    /**
     * 查询终端节点服务概要
     *
     * 功能介绍查询终端节点服务的概要信息， 此接口是供创建终端节点的用户来查询需要连接的终端节点服务信息。 此接口既可以方便其他用户查询到您的终端节点服务概要信息, 又可以避免您的终端节点服务的细节信息暴露给其他用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceDescribeDetailsRequest 请求对象
     * @return CompletableFuture<ListServiceDescribeDetailsResponse>
     */
    public CompletableFuture<ListServiceDescribeDetailsResponse> listServiceDescribeDetailsAsync(
        ListServiceDescribeDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listServiceDescribeDetails);
    }

    /**
     * 查询终端节点服务概要
     *
     * 功能介绍查询终端节点服务的概要信息， 此接口是供创建终端节点的用户来查询需要连接的终端节点服务信息。 此接口既可以方便其他用户查询到您的终端节点服务概要信息, 又可以避免您的终端节点服务的细节信息暴露给其他用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceDescribeDetailsRequest 请求对象
     * @return AsyncInvoker<ListServiceDescribeDetailsRequest, ListServiceDescribeDetailsResponse>
     */
    public AsyncInvoker<ListServiceDescribeDetailsRequest, ListServiceDescribeDetailsResponse> listServiceDescribeDetailsAsyncInvoker(
        ListServiceDescribeDetailsRequest request) {
        return new AsyncInvoker<ListServiceDescribeDetailsRequest, ListServiceDescribeDetailsResponse>(request,
            VpcepMeta.listServiceDescribeDetails, hcClient);
    }

    /**
     * 查询终端节点服务详情
     *
     * 功能介绍
     * 查询终端节点服务的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceDetailsRequest 请求对象
     * @return CompletableFuture<ListServiceDetailsResponse>
     */
    public CompletableFuture<ListServiceDetailsResponse> listServiceDetailsAsync(ListServiceDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listServiceDetails);
    }

    /**
     * 查询终端节点服务详情
     *
     * 功能介绍
     * 查询终端节点服务的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceDetailsRequest 请求对象
     * @return AsyncInvoker<ListServiceDetailsRequest, ListServiceDetailsResponse>
     */
    public AsyncInvoker<ListServiceDetailsRequest, ListServiceDetailsResponse> listServiceDetailsAsyncInvoker(
        ListServiceDetailsRequest request) {
        return new AsyncInvoker<ListServiceDetailsRequest, ListServiceDetailsResponse>(request,
            VpcepMeta.listServiceDetails, hcClient);
    }

    /**
     * 查询终端节点服务的白名单列表
     *
     * 功能介绍
     * 查询当前用户下终端节点服务的白名单列表。
     * 说明
     * 本帐号默认在当前用户下终端节点服务的白名单中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServicePermissionsDetailsRequest 请求对象
     * @return CompletableFuture<ListServicePermissionsDetailsResponse>
     */
    public CompletableFuture<ListServicePermissionsDetailsResponse> listServicePermissionsDetailsAsync(
        ListServicePermissionsDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listServicePermissionsDetails);
    }

    /**
     * 查询终端节点服务的白名单列表
     *
     * 功能介绍
     * 查询当前用户下终端节点服务的白名单列表。
     * 说明
     * 本帐号默认在当前用户下终端节点服务的白名单中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServicePermissionsDetailsRequest 请求对象
     * @return AsyncInvoker<ListServicePermissionsDetailsRequest, ListServicePermissionsDetailsResponse>
     */
    public AsyncInvoker<ListServicePermissionsDetailsRequest, ListServicePermissionsDetailsResponse> listServicePermissionsDetailsAsyncInvoker(
        ListServicePermissionsDetailsRequest request) {
        return new AsyncInvoker<ListServicePermissionsDetailsRequest, ListServicePermissionsDetailsResponse>(request,
            VpcepMeta.listServicePermissionsDetails, hcClient);
    }

    /**
     * 查询公共终端节点服务列表
     *
     * 功能介绍
     * 查询公共终端节点服务的列表，公共终端节点服务是所有用户可见且可连接的终端节点服务，
     * 由运维人员创建，用户可直接使用，但无权创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServicePublicDetailsRequest 请求对象
     * @return CompletableFuture<ListServicePublicDetailsResponse>
     */
    public CompletableFuture<ListServicePublicDetailsResponse> listServicePublicDetailsAsync(
        ListServicePublicDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listServicePublicDetails);
    }

    /**
     * 查询公共终端节点服务列表
     *
     * 功能介绍
     * 查询公共终端节点服务的列表，公共终端节点服务是所有用户可见且可连接的终端节点服务，
     * 由运维人员创建，用户可直接使用，但无权创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServicePublicDetailsRequest 请求对象
     * @return AsyncInvoker<ListServicePublicDetailsRequest, ListServicePublicDetailsResponse>
     */
    public AsyncInvoker<ListServicePublicDetailsRequest, ListServicePublicDetailsResponse> listServicePublicDetailsAsyncInvoker(
        ListServicePublicDetailsRequest request) {
        return new AsyncInvoker<ListServicePublicDetailsRequest, ListServicePublicDetailsResponse>(request,
            VpcepMeta.listServicePublicDetails, hcClient);
    }

    /**
     * 查询指定VPC终端节点接口版本信息
     *
     * 功能介绍
     * 查询指定VPC终端节点接口版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSpecifiedVersionDetailsRequest 请求对象
     * @return CompletableFuture<ListSpecifiedVersionDetailsResponse>
     */
    public CompletableFuture<ListSpecifiedVersionDetailsResponse> listSpecifiedVersionDetailsAsync(
        ListSpecifiedVersionDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listSpecifiedVersionDetails);
    }

    /**
     * 查询指定VPC终端节点接口版本信息
     *
     * 功能介绍
     * 查询指定VPC终端节点接口版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSpecifiedVersionDetailsRequest 请求对象
     * @return AsyncInvoker<ListSpecifiedVersionDetailsRequest, ListSpecifiedVersionDetailsResponse>
     */
    public AsyncInvoker<ListSpecifiedVersionDetailsRequest, ListSpecifiedVersionDetailsResponse> listSpecifiedVersionDetailsAsyncInvoker(
        ListSpecifiedVersionDetailsRequest request) {
        return new AsyncInvoker<ListSpecifiedVersionDetailsRequest, ListSpecifiedVersionDetailsResponse>(request,
            VpcepMeta.listSpecifiedVersionDetails, hcClient);
    }

    /**
     * 查询VPC终端节点接口版本列表
     *
     * 功能介绍
     * 查询VPC终端节点接口版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVersionDetailsRequest 请求对象
     * @return CompletableFuture<ListVersionDetailsResponse>
     */
    public CompletableFuture<ListVersionDetailsResponse> listVersionDetailsAsync(ListVersionDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listVersionDetails);
    }

    /**
     * 查询VPC终端节点接口版本列表
     *
     * 功能介绍
     * 查询VPC终端节点接口版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVersionDetailsRequest 请求对象
     * @return AsyncInvoker<ListVersionDetailsRequest, ListVersionDetailsResponse>
     */
    public AsyncInvoker<ListVersionDetailsRequest, ListVersionDetailsResponse> listVersionDetailsAsyncInvoker(
        ListVersionDetailsRequest request) {
        return new AsyncInvoker<ListVersionDetailsRequest, ListVersionDetailsResponse>(request,
            VpcepMeta.listVersionDetails, hcClient);
    }

    /**
     * 更新终端节点连接描述
     *
     * 功能介绍：
     *      更新终端节点服务连接的终端节点的描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointConnectionsDescRequest 请求对象
     * @return CompletableFuture<UpdateEndpointConnectionsDescResponse>
     */
    public CompletableFuture<UpdateEndpointConnectionsDescResponse> updateEndpointConnectionsDescAsync(
        UpdateEndpointConnectionsDescRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.updateEndpointConnectionsDesc);
    }

    /**
     * 更新终端节点连接描述
     *
     * 功能介绍：
     *      更新终端节点服务连接的终端节点的描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointConnectionsDescRequest 请求对象
     * @return AsyncInvoker<UpdateEndpointConnectionsDescRequest, UpdateEndpointConnectionsDescResponse>
     */
    public AsyncInvoker<UpdateEndpointConnectionsDescRequest, UpdateEndpointConnectionsDescResponse> updateEndpointConnectionsDescAsyncInvoker(
        UpdateEndpointConnectionsDescRequest request) {
        return new AsyncInvoker<UpdateEndpointConnectionsDescRequest, UpdateEndpointConnectionsDescResponse>(request,
            VpcepMeta.updateEndpointConnectionsDesc, hcClient);
    }

    /**
     * 修改网关型终端节点policy
     *
     * 功能介绍
     * 修改网关型终端节点policy。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointPolicyRequest 请求对象
     * @return CompletableFuture<UpdateEndpointPolicyResponse>
     */
    public CompletableFuture<UpdateEndpointPolicyResponse> updateEndpointPolicyAsync(
        UpdateEndpointPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.updateEndpointPolicy);
    }

    /**
     * 修改网关型终端节点policy
     *
     * 功能介绍
     * 修改网关型终端节点policy。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateEndpointPolicyRequest, UpdateEndpointPolicyResponse>
     */
    public AsyncInvoker<UpdateEndpointPolicyRequest, UpdateEndpointPolicyResponse> updateEndpointPolicyAsyncInvoker(
        UpdateEndpointPolicyRequest request) {
        return new AsyncInvoker<UpdateEndpointPolicyRequest, UpdateEndpointPolicyResponse>(request,
            VpcepMeta.updateEndpointPolicy, hcClient);
    }

    /**
     * 修改终端节点的路由表
     *
     * 功能介绍
     * 修改终端节点的路由表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointRoutetableRequest 请求对象
     * @return CompletableFuture<UpdateEndpointRoutetableResponse>
     */
    public CompletableFuture<UpdateEndpointRoutetableResponse> updateEndpointRoutetableAsync(
        UpdateEndpointRoutetableRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.updateEndpointRoutetable);
    }

    /**
     * 修改终端节点的路由表
     *
     * 功能介绍
     * 修改终端节点的路由表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointRoutetableRequest 请求对象
     * @return AsyncInvoker<UpdateEndpointRoutetableRequest, UpdateEndpointRoutetableResponse>
     */
    public AsyncInvoker<UpdateEndpointRoutetableRequest, UpdateEndpointRoutetableResponse> updateEndpointRoutetableAsyncInvoker(
        UpdateEndpointRoutetableRequest request) {
        return new AsyncInvoker<UpdateEndpointRoutetableRequest, UpdateEndpointRoutetableResponse>(request,
            VpcepMeta.updateEndpointRoutetable, hcClient);
    }

    /**
     * 修改终端节点服务
     *
     * 功能介绍
     * 修改终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointServiceRequest 请求对象
     * @return CompletableFuture<UpdateEndpointServiceResponse>
     */
    public CompletableFuture<UpdateEndpointServiceResponse> updateEndpointServiceAsync(
        UpdateEndpointServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.updateEndpointService);
    }

    /**
     * 修改终端节点服务
     *
     * 功能介绍
     * 修改终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointServiceRequest 请求对象
     * @return AsyncInvoker<UpdateEndpointServiceRequest, UpdateEndpointServiceResponse>
     */
    public AsyncInvoker<UpdateEndpointServiceRequest, UpdateEndpointServiceResponse> updateEndpointServiceAsyncInvoker(
        UpdateEndpointServiceRequest request) {
        return new AsyncInvoker<UpdateEndpointServiceRequest, UpdateEndpointServiceResponse>(request,
            VpcepMeta.updateEndpointService, hcClient);
    }

    /**
     * 修改终端节点服务名称
     *
     * 功能介绍
     * 修改终端节点服务名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointServiceNameRequest 请求对象
     * @return CompletableFuture<UpdateEndpointServiceNameResponse>
     */
    public CompletableFuture<UpdateEndpointServiceNameResponse> updateEndpointServiceNameAsync(
        UpdateEndpointServiceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.updateEndpointServiceName);
    }

    /**
     * 修改终端节点服务名称
     *
     * 功能介绍
     * 修改终端节点服务名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointServiceNameRequest 请求对象
     * @return AsyncInvoker<UpdateEndpointServiceNameRequest, UpdateEndpointServiceNameResponse>
     */
    public AsyncInvoker<UpdateEndpointServiceNameRequest, UpdateEndpointServiceNameResponse> updateEndpointServiceNameAsyncInvoker(
        UpdateEndpointServiceNameRequest request) {
        return new AsyncInvoker<UpdateEndpointServiceNameRequest, UpdateEndpointServiceNameResponse>(request,
            VpcepMeta.updateEndpointServiceName, hcClient);
    }

    /**
     * 更新终端节点服务白名单描述
     *
     * 功能介绍
     * 更新当前用户下终端节点服务白名单的描述信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointServicePermissionDescRequest 请求对象
     * @return CompletableFuture<UpdateEndpointServicePermissionDescResponse>
     */
    public CompletableFuture<UpdateEndpointServicePermissionDescResponse> updateEndpointServicePermissionDescAsync(
        UpdateEndpointServicePermissionDescRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.updateEndpointServicePermissionDesc);
    }

    /**
     * 更新终端节点服务白名单描述
     *
     * 功能介绍
     * 更新当前用户下终端节点服务白名单的描述信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointServicePermissionDescRequest 请求对象
     * @return AsyncInvoker<UpdateEndpointServicePermissionDescRequest, UpdateEndpointServicePermissionDescResponse>
     */
    public AsyncInvoker<UpdateEndpointServicePermissionDescRequest, UpdateEndpointServicePermissionDescResponse> updateEndpointServicePermissionDescAsyncInvoker(
        UpdateEndpointServicePermissionDescRequest request) {
        return new AsyncInvoker<UpdateEndpointServicePermissionDescRequest, UpdateEndpointServicePermissionDescResponse>(
            request, VpcepMeta.updateEndpointServicePermissionDesc, hcClient);
    }

    /**
     * 更新终端节点
     *
     * 功能介绍
     * 更新或删除允许访问终端节点的白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointWhiteRequest 请求对象
     * @return CompletableFuture<UpdateEndpointWhiteResponse>
     */
    public CompletableFuture<UpdateEndpointWhiteResponse> updateEndpointWhiteAsync(UpdateEndpointWhiteRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.updateEndpointWhite);
    }

    /**
     * 更新终端节点
     *
     * 功能介绍
     * 更新或删除允许访问终端节点的白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointWhiteRequest 请求对象
     * @return AsyncInvoker<UpdateEndpointWhiteRequest, UpdateEndpointWhiteResponse>
     */
    public AsyncInvoker<UpdateEndpointWhiteRequest, UpdateEndpointWhiteResponse> updateEndpointWhiteAsyncInvoker(
        UpdateEndpointWhiteRequest request) {
        return new AsyncInvoker<UpdateEndpointWhiteRequest, UpdateEndpointWhiteResponse>(request,
            VpcepMeta.updateEndpointWhite, hcClient);
    }

    /**
     * 批量添加或删除资源标签接口
     *
     * 功能介绍
     * 为指定Endpoint Service或Endpoint批量添加或删除标签。
     * ● 一个资源上最多有10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddOrRemoveResourceInstanceRequest 请求对象
     * @return CompletableFuture<BatchAddOrRemoveResourceInstanceResponse>
     */
    public CompletableFuture<BatchAddOrRemoveResourceInstanceResponse> batchAddOrRemoveResourceInstanceAsync(
        BatchAddOrRemoveResourceInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.batchAddOrRemoveResourceInstance);
    }

    /**
     * 批量添加或删除资源标签接口
     *
     * 功能介绍
     * 为指定Endpoint Service或Endpoint批量添加或删除标签。
     * ● 一个资源上最多有10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddOrRemoveResourceInstanceRequest 请求对象
     * @return AsyncInvoker<BatchAddOrRemoveResourceInstanceRequest, BatchAddOrRemoveResourceInstanceResponse>
     */
    public AsyncInvoker<BatchAddOrRemoveResourceInstanceRequest, BatchAddOrRemoveResourceInstanceResponse> batchAddOrRemoveResourceInstanceAsyncInvoker(
        BatchAddOrRemoveResourceInstanceRequest request) {
        return new AsyncInvoker<BatchAddOrRemoveResourceInstanceRequest, BatchAddOrRemoveResourceInstanceResponse>(
            request, VpcepMeta.batchAddOrRemoveResourceInstance, hcClient);
    }

    /**
     * 查询租户资源标签接口
     *
     * 功能介绍
     * 根据租户ID和资源类型，获取租户下资源的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQueryProjectResourceTagsRequest 请求对象
     * @return CompletableFuture<ListQueryProjectResourceTagsResponse>
     */
    public CompletableFuture<ListQueryProjectResourceTagsResponse> listQueryProjectResourceTagsAsync(
        ListQueryProjectResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listQueryProjectResourceTags);
    }

    /**
     * 查询租户资源标签接口
     *
     * 功能介绍
     * 根据租户ID和资源类型，获取租户下资源的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQueryProjectResourceTagsRequest 请求对象
     * @return AsyncInvoker<ListQueryProjectResourceTagsRequest, ListQueryProjectResourceTagsResponse>
     */
    public AsyncInvoker<ListQueryProjectResourceTagsRequest, ListQueryProjectResourceTagsResponse> listQueryProjectResourceTagsAsyncInvoker(
        ListQueryProjectResourceTagsRequest request) {
        return new AsyncInvoker<ListQueryProjectResourceTagsRequest, ListQueryProjectResourceTagsResponse>(request,
            VpcepMeta.listQueryProjectResourceTags, hcClient);
    }

    /**
     * 查询资源实例接口
     *
     * 功能介绍
     * 使用标签过滤查询租户下资源的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceInstancesRequest 请求对象
     * @return CompletableFuture<ListResourceInstancesResponse>
     */
    public CompletableFuture<ListResourceInstancesResponse> listResourceInstancesAsync(
        ListResourceInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcepMeta.listResourceInstances);
    }

    /**
     * 查询资源实例接口
     *
     * 功能介绍
     * 使用标签过滤查询租户下资源的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceInstancesRequest 请求对象
     * @return AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>
     */
    public AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstancesAsyncInvoker(
        ListResourceInstancesRequest request) {
        return new AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>(request,
            VpcepMeta.listResourceInstances, hcClient);
    }

}
