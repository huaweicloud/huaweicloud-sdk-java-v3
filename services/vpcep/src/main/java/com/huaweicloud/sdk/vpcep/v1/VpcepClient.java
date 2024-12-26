package com.huaweicloud.sdk.vpcep.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
import com.huaweicloud.sdk.vpcep.v1.model.UpgradeEndpointServiceRequest;
import com.huaweicloud.sdk.vpcep.v1.model.UpgradeEndpointServiceResponse;

public class VpcepClient {

    protected HcClient hcClient;

    public VpcepClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VpcepClient> newBuilder() {
        ClientBuilder<VpcepClient> clientBuilder = new ClientBuilder<>(VpcepClient::new);
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
     * @return AcceptOrRejectEndpointResponse
     */
    public AcceptOrRejectEndpointResponse acceptOrRejectEndpoint(AcceptOrRejectEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.acceptOrRejectEndpoint);
    }

    /**
     * 接受或拒绝终端节点的连接
     *
     * 接受或者拒绝终端节点连接到当前的终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptOrRejectEndpointRequest 请求对象
     * @return SyncInvoker<AcceptOrRejectEndpointRequest, AcceptOrRejectEndpointResponse>
     */
    public SyncInvoker<AcceptOrRejectEndpointRequest, AcceptOrRejectEndpointResponse> acceptOrRejectEndpointInvoker(
        AcceptOrRejectEndpointRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.acceptOrRejectEndpoint, hcClient);
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
     * @return AddOrRemoveServicePermissionsResponse
     */
    public AddOrRemoveServicePermissionsResponse addOrRemoveServicePermissions(
        AddOrRemoveServicePermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.addOrRemoveServicePermissions);
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
     * @return SyncInvoker<AddOrRemoveServicePermissionsRequest, AddOrRemoveServicePermissionsResponse>
     */
    public SyncInvoker<AddOrRemoveServicePermissionsRequest, AddOrRemoveServicePermissionsResponse> addOrRemoveServicePermissionsInvoker(
        AddOrRemoveServicePermissionsRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.addOrRemoveServicePermissions, hcClient);
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
     * @return BatchAddEndpointServicePermissionsResponse
     */
    public BatchAddEndpointServicePermissionsResponse batchAddEndpointServicePermissions(
        BatchAddEndpointServicePermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.batchAddEndpointServicePermissions);
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
     * @return SyncInvoker<BatchAddEndpointServicePermissionsRequest, BatchAddEndpointServicePermissionsResponse>
     */
    public SyncInvoker<BatchAddEndpointServicePermissionsRequest, BatchAddEndpointServicePermissionsResponse> batchAddEndpointServicePermissionsInvoker(
        BatchAddEndpointServicePermissionsRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.batchAddEndpointServicePermissions, hcClient);
    }

    /**
     * 批量删除终端节点服务的白名单
     *
     * 批量删除当前用户下终端节点服务的白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRemoveEndpointServicePermissionsRequest 请求对象
     * @return BatchRemoveEndpointServicePermissionsResponse
     */
    public BatchRemoveEndpointServicePermissionsResponse batchRemoveEndpointServicePermissions(
        BatchRemoveEndpointServicePermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.batchRemoveEndpointServicePermissions);
    }

    /**
     * 批量删除终端节点服务的白名单
     *
     * 批量删除当前用户下终端节点服务的白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRemoveEndpointServicePermissionsRequest 请求对象
     * @return SyncInvoker<BatchRemoveEndpointServicePermissionsRequest, BatchRemoveEndpointServicePermissionsResponse>
     */
    public SyncInvoker<BatchRemoveEndpointServicePermissionsRequest, BatchRemoveEndpointServicePermissionsResponse> batchRemoveEndpointServicePermissionsInvoker(
        BatchRemoveEndpointServicePermissionsRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.batchRemoveEndpointServicePermissions, hcClient);
    }

    /**
     * 创建终端节点
     *
     * 创建终端节点，以便访问终端节点服务。
     * 
     * 该接口为异步接口，调用成功会返回200状态码，说明请求已正常下发。
     * 通常创建终端节点需要1~2分钟，可以通过[查询终端节点详情](https://support.huaweicloud.com/api-vpcep/ListEndpointInfoDetails.html)查看创建结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return CreateEndpointResponse
     */
    public CreateEndpointResponse createEndpoint(CreateEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.createEndpoint);
    }

    /**
     * 创建终端节点
     *
     * 创建终端节点，以便访问终端节点服务。
     * 
     * 该接口为异步接口，调用成功会返回200状态码，说明请求已正常下发。
     * 通常创建终端节点需要1~2分钟，可以通过[查询终端节点详情](https://support.huaweicloud.com/api-vpcep/ListEndpointInfoDetails.html)查看创建结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return SyncInvoker<CreateEndpointRequest, CreateEndpointResponse>
     */
    public SyncInvoker<CreateEndpointRequest, CreateEndpointResponse> createEndpointInvoker(
        CreateEndpointRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.createEndpoint, hcClient);
    }

    /**
     * 创建终端节点服务
     *
     * 创建终端节点服务，允许其他用户创建终端节点连接您创建的终端节点服务，
     * 使用您所提供的服务。
     * 
     * 该接口为异步接口，调用成功会返回200状态码，说明请求已正常下发。
     * 通常创建终端节点服务需要1~2分钟，可以通过[查询终端节点服务详情](https://support.huaweicloud.com/api-vpcep/ListServiceDetails.html)查看创建结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointServiceRequest 请求对象
     * @return CreateEndpointServiceResponse
     */
    public CreateEndpointServiceResponse createEndpointService(CreateEndpointServiceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.createEndpointService);
    }

    /**
     * 创建终端节点服务
     *
     * 创建终端节点服务，允许其他用户创建终端节点连接您创建的终端节点服务，
     * 使用您所提供的服务。
     * 
     * 该接口为异步接口，调用成功会返回200状态码，说明请求已正常下发。
     * 通常创建终端节点服务需要1~2分钟，可以通过[查询终端节点服务详情](https://support.huaweicloud.com/api-vpcep/ListServiceDetails.html)查看创建结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointServiceRequest 请求对象
     * @return SyncInvoker<CreateEndpointServiceRequest, CreateEndpointServiceResponse>
     */
    public SyncInvoker<CreateEndpointServiceRequest, CreateEndpointServiceResponse> createEndpointServiceInvoker(
        CreateEndpointServiceRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.createEndpointService, hcClient);
    }

    /**
     * 删除终端节点
     *
     * 删除终端节点。
     * 
     * 该接口为异步接口，调用成功会返回200状态码，说明请求已正常下发。
     * 通常删除终端节点需要1~2分钟，可以通过[查询终端节点详情](https://support.huaweicloud.com/api-vpcep/ListEndpointInfoDetails.html)查看删除结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointRequest 请求对象
     * @return DeleteEndpointResponse
     */
    public DeleteEndpointResponse deleteEndpoint(DeleteEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.deleteEndpoint);
    }

    /**
     * 删除终端节点
     *
     * 删除终端节点。
     * 
     * 该接口为异步接口，调用成功会返回200状态码，说明请求已正常下发。
     * 通常删除终端节点需要1~2分钟，可以通过[查询终端节点详情](https://support.huaweicloud.com/api-vpcep/ListEndpointInfoDetails.html)查看删除结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointRequest 请求对象
     * @return SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>
     */
    public SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpointInvoker(
        DeleteEndpointRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.deleteEndpoint, hcClient);
    }

    /**
     * 删除网关型终端节点策略（待下线）
     *
     * 删除网关型终端节点策略，该接口待下线，不建议使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointPolicyRequest 请求对象
     * @return DeleteEndpointPolicyResponse
     */
    public DeleteEndpointPolicyResponse deleteEndpointPolicy(DeleteEndpointPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.deleteEndpointPolicy);
    }

    /**
     * 删除网关型终端节点策略（待下线）
     *
     * 删除网关型终端节点策略，该接口待下线，不建议使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointPolicyRequest 请求对象
     * @return SyncInvoker<DeleteEndpointPolicyRequest, DeleteEndpointPolicyResponse>
     */
    public SyncInvoker<DeleteEndpointPolicyRequest, DeleteEndpointPolicyResponse> deleteEndpointPolicyInvoker(
        DeleteEndpointPolicyRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.deleteEndpointPolicy, hcClient);
    }

    /**
     * 删除终端节点服务
     *
     * 删除终端节点服务。
     * 
     * 该接口为异步接口，调用成功会返回200状态码，说明请求已正常下发。通常删除终端节点服务需要1~2分钟，可以通过[查询终端节点服务详情](https://support.huaweicloud.com/api-vpcep/ListServiceDetails.html)查看删除结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointServiceRequest 请求对象
     * @return DeleteEndpointServiceResponse
     */
    public DeleteEndpointServiceResponse deleteEndpointService(DeleteEndpointServiceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.deleteEndpointService);
    }

    /**
     * 删除终端节点服务
     *
     * 删除终端节点服务。
     * 
     * 该接口为异步接口，调用成功会返回200状态码，说明请求已正常下发。通常删除终端节点服务需要1~2分钟，可以通过[查询终端节点服务详情](https://support.huaweicloud.com/api-vpcep/ListServiceDetails.html)查看删除结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointServiceRequest 请求对象
     * @return SyncInvoker<DeleteEndpointServiceRequest, DeleteEndpointServiceResponse>
     */
    public SyncInvoker<DeleteEndpointServiceRequest, DeleteEndpointServiceResponse> deleteEndpointServiceInvoker(
        DeleteEndpointServiceRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.deleteEndpointService, hcClient);
    }

    /**
     * 查询终端节点详情
     *
     * 查询终端节点的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointInfoDetailsRequest 请求对象
     * @return ListEndpointInfoDetailsResponse
     */
    public ListEndpointInfoDetailsResponse listEndpointInfoDetails(ListEndpointInfoDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listEndpointInfoDetails);
    }

    /**
     * 查询终端节点详情
     *
     * 查询终端节点的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointInfoDetailsRequest 请求对象
     * @return SyncInvoker<ListEndpointInfoDetailsRequest, ListEndpointInfoDetailsResponse>
     */
    public SyncInvoker<ListEndpointInfoDetailsRequest, ListEndpointInfoDetailsResponse> listEndpointInfoDetailsInvoker(
        ListEndpointInfoDetailsRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.listEndpointInfoDetails, hcClient);
    }

    /**
     * 查询终端节点服务列表
     *
     * 查询当前用户下的终端节点服务的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointServiceRequest 请求对象
     * @return ListEndpointServiceResponse
     */
    public ListEndpointServiceResponse listEndpointService(ListEndpointServiceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listEndpointService);
    }

    /**
     * 查询终端节点服务列表
     *
     * 查询当前用户下的终端节点服务的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointServiceRequest 请求对象
     * @return SyncInvoker<ListEndpointServiceRequest, ListEndpointServiceResponse>
     */
    public SyncInvoker<ListEndpointServiceRequest, ListEndpointServiceResponse> listEndpointServiceInvoker(
        ListEndpointServiceRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.listEndpointService, hcClient);
    }

    /**
     * 查询终端节点列表
     *
     * 查询当前用户下的终端节点的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return ListEndpointsResponse
     */
    public ListEndpointsResponse listEndpoints(ListEndpointsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listEndpoints);
    }

    /**
     * 查询终端节点列表
     *
     * 查询当前用户下的终端节点的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return SyncInvoker<ListEndpointsRequest, ListEndpointsResponse>
     */
    public SyncInvoker<ListEndpointsRequest, ListEndpointsResponse> listEndpointsInvoker(ListEndpointsRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.listEndpoints, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询用户的资源配额，包括终端节点服务和终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotaDetailsRequest 请求对象
     * @return ListQuotaDetailsResponse
     */
    public ListQuotaDetailsResponse listQuotaDetails(ListQuotaDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listQuotaDetails);
    }

    /**
     * 查询配额
     *
     * 查询用户的资源配额，包括终端节点服务和终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotaDetailsRequest 请求对象
     * @return SyncInvoker<ListQuotaDetailsRequest, ListQuotaDetailsResponse>
     */
    public SyncInvoker<ListQuotaDetailsRequest, ListQuotaDetailsResponse> listQuotaDetailsInvoker(
        ListQuotaDetailsRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.listQuotaDetails, hcClient);
    }

    /**
     * 查询连接终端节点服务的连接列表
     *
     * 查询连接当前用户下的某一个终端节点服务的连接列表。marker_id是连接的唯一标识。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceConnectionsRequest 请求对象
     * @return ListServiceConnectionsResponse
     */
    public ListServiceConnectionsResponse listServiceConnections(ListServiceConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listServiceConnections);
    }

    /**
     * 查询连接终端节点服务的连接列表
     *
     * 查询连接当前用户下的某一个终端节点服务的连接列表。marker_id是连接的唯一标识。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceConnectionsRequest 请求对象
     * @return SyncInvoker<ListServiceConnectionsRequest, ListServiceConnectionsResponse>
     */
    public SyncInvoker<ListServiceConnectionsRequest, ListServiceConnectionsResponse> listServiceConnectionsInvoker(
        ListServiceConnectionsRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.listServiceConnections, hcClient);
    }

    /**
     * 查询终端节点服务概要
     *
     * 查询终端节点服务的概要信息， 此接口是供创建终端节点的用户来查询需要连接的终端节点服务信息。 此接口既可以方便其他用户查询到您的终端节点服务概要信息, 又可以避免您的终端节点服务的细节信息暴露给其他用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceDescribeDetailsRequest 请求对象
     * @return ListServiceDescribeDetailsResponse
     */
    public ListServiceDescribeDetailsResponse listServiceDescribeDetails(ListServiceDescribeDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listServiceDescribeDetails);
    }

    /**
     * 查询终端节点服务概要
     *
     * 查询终端节点服务的概要信息， 此接口是供创建终端节点的用户来查询需要连接的终端节点服务信息。 此接口既可以方便其他用户查询到您的终端节点服务概要信息, 又可以避免您的终端节点服务的细节信息暴露给其他用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceDescribeDetailsRequest 请求对象
     * @return SyncInvoker<ListServiceDescribeDetailsRequest, ListServiceDescribeDetailsResponse>
     */
    public SyncInvoker<ListServiceDescribeDetailsRequest, ListServiceDescribeDetailsResponse> listServiceDescribeDetailsInvoker(
        ListServiceDescribeDetailsRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.listServiceDescribeDetails, hcClient);
    }

    /**
     * 查询终端节点服务详情
     *
     * 查询终端节点服务的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceDetailsRequest 请求对象
     * @return ListServiceDetailsResponse
     */
    public ListServiceDetailsResponse listServiceDetails(ListServiceDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listServiceDetails);
    }

    /**
     * 查询终端节点服务详情
     *
     * 查询终端节点服务的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceDetailsRequest 请求对象
     * @return SyncInvoker<ListServiceDetailsRequest, ListServiceDetailsResponse>
     */
    public SyncInvoker<ListServiceDetailsRequest, ListServiceDetailsResponse> listServiceDetailsInvoker(
        ListServiceDetailsRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.listServiceDetails, hcClient);
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
     * @return ListServicePermissionsDetailsResponse
     */
    public ListServicePermissionsDetailsResponse listServicePermissionsDetails(
        ListServicePermissionsDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listServicePermissionsDetails);
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
     * @return SyncInvoker<ListServicePermissionsDetailsRequest, ListServicePermissionsDetailsResponse>
     */
    public SyncInvoker<ListServicePermissionsDetailsRequest, ListServicePermissionsDetailsResponse> listServicePermissionsDetailsInvoker(
        ListServicePermissionsDetailsRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.listServicePermissionsDetails, hcClient);
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
     * @return ListServicePublicDetailsResponse
     */
    public ListServicePublicDetailsResponse listServicePublicDetails(ListServicePublicDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listServicePublicDetails);
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
     * @return SyncInvoker<ListServicePublicDetailsRequest, ListServicePublicDetailsResponse>
     */
    public SyncInvoker<ListServicePublicDetailsRequest, ListServicePublicDetailsResponse> listServicePublicDetailsInvoker(
        ListServicePublicDetailsRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.listServicePublicDetails, hcClient);
    }

    /**
     * 查询指定VPC终端节点接口版本信息
     *
     * 查询指定VPC终端节点接口版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpecifiedVersionDetailsRequest 请求对象
     * @return ListSpecifiedVersionDetailsResponse
     */
    public ListSpecifiedVersionDetailsResponse listSpecifiedVersionDetails(ListSpecifiedVersionDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listSpecifiedVersionDetails);
    }

    /**
     * 查询指定VPC终端节点接口版本信息
     *
     * 查询指定VPC终端节点接口版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpecifiedVersionDetailsRequest 请求对象
     * @return SyncInvoker<ListSpecifiedVersionDetailsRequest, ListSpecifiedVersionDetailsResponse>
     */
    public SyncInvoker<ListSpecifiedVersionDetailsRequest, ListSpecifiedVersionDetailsResponse> listSpecifiedVersionDetailsInvoker(
        ListSpecifiedVersionDetailsRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.listSpecifiedVersionDetails, hcClient);
    }

    /**
     * 查询VPC终端节点接口版本列表
     *
     * 查询VPC终端节点接口版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionDetailsRequest 请求对象
     * @return ListVersionDetailsResponse
     */
    public ListVersionDetailsResponse listVersionDetails(ListVersionDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listVersionDetails);
    }

    /**
     * 查询VPC终端节点接口版本列表
     *
     * 查询VPC终端节点接口版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionDetailsRequest 请求对象
     * @return SyncInvoker<ListVersionDetailsRequest, ListVersionDetailsResponse>
     */
    public SyncInvoker<ListVersionDetailsRequest, ListVersionDetailsResponse> listVersionDetailsInvoker(
        ListVersionDetailsRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.listVersionDetails, hcClient);
    }

    /**
     * 更新终端节点连接描述
     *
     * 更新终端节点服务连接的终端节点的描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointConnectionsDescRequest 请求对象
     * @return UpdateEndpointConnectionsDescResponse
     */
    public UpdateEndpointConnectionsDescResponse updateEndpointConnectionsDesc(
        UpdateEndpointConnectionsDescRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.updateEndpointConnectionsDesc);
    }

    /**
     * 更新终端节点连接描述
     *
     * 更新终端节点服务连接的终端节点的描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointConnectionsDescRequest 请求对象
     * @return SyncInvoker<UpdateEndpointConnectionsDescRequest, UpdateEndpointConnectionsDescResponse>
     */
    public SyncInvoker<UpdateEndpointConnectionsDescRequest, UpdateEndpointConnectionsDescResponse> updateEndpointConnectionsDescInvoker(
        UpdateEndpointConnectionsDescRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.updateEndpointConnectionsDesc, hcClient);
    }

    /**
     * 修改终端节点策略
     *
     * 修改终端节点策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointPolicyRequest 请求对象
     * @return UpdateEndpointPolicyResponse
     */
    public UpdateEndpointPolicyResponse updateEndpointPolicy(UpdateEndpointPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.updateEndpointPolicy);
    }

    /**
     * 修改终端节点策略
     *
     * 修改终端节点策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointPolicyRequest 请求对象
     * @return SyncInvoker<UpdateEndpointPolicyRequest, UpdateEndpointPolicyResponse>
     */
    public SyncInvoker<UpdateEndpointPolicyRequest, UpdateEndpointPolicyResponse> updateEndpointPolicyInvoker(
        UpdateEndpointPolicyRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.updateEndpointPolicy, hcClient);
    }

    /**
     * 修改终端节点的路由表
     *
     * 修改终端节点的路由表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointRoutetableRequest 请求对象
     * @return UpdateEndpointRoutetableResponse
     */
    public UpdateEndpointRoutetableResponse updateEndpointRoutetable(UpdateEndpointRoutetableRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.updateEndpointRoutetable);
    }

    /**
     * 修改终端节点的路由表
     *
     * 修改终端节点的路由表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointRoutetableRequest 请求对象
     * @return SyncInvoker<UpdateEndpointRoutetableRequest, UpdateEndpointRoutetableResponse>
     */
    public SyncInvoker<UpdateEndpointRoutetableRequest, UpdateEndpointRoutetableResponse> updateEndpointRoutetableInvoker(
        UpdateEndpointRoutetableRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.updateEndpointRoutetable, hcClient);
    }

    /**
     * 修改终端节点服务
     *
     * 修改终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointServiceRequest 请求对象
     * @return UpdateEndpointServiceResponse
     */
    public UpdateEndpointServiceResponse updateEndpointService(UpdateEndpointServiceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.updateEndpointService);
    }

    /**
     * 修改终端节点服务
     *
     * 修改终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointServiceRequest 请求对象
     * @return SyncInvoker<UpdateEndpointServiceRequest, UpdateEndpointServiceResponse>
     */
    public SyncInvoker<UpdateEndpointServiceRequest, UpdateEndpointServiceResponse> updateEndpointServiceInvoker(
        UpdateEndpointServiceRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.updateEndpointService, hcClient);
    }

    /**
     * 修改终端节点服务名称
     *
     * 修改终端节点服务名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointServiceNameRequest 请求对象
     * @return UpdateEndpointServiceNameResponse
     */
    public UpdateEndpointServiceNameResponse updateEndpointServiceName(UpdateEndpointServiceNameRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.updateEndpointServiceName);
    }

    /**
     * 修改终端节点服务名称
     *
     * 修改终端节点服务名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointServiceNameRequest 请求对象
     * @return SyncInvoker<UpdateEndpointServiceNameRequest, UpdateEndpointServiceNameResponse>
     */
    public SyncInvoker<UpdateEndpointServiceNameRequest, UpdateEndpointServiceNameResponse> updateEndpointServiceNameInvoker(
        UpdateEndpointServiceNameRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.updateEndpointServiceName, hcClient);
    }

    /**
     * 更新终端节点服务白名单描述
     *
     * 更新当前用户下终端节点服务白名单的描述信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointServicePermissionDescRequest 请求对象
     * @return UpdateEndpointServicePermissionDescResponse
     */
    public UpdateEndpointServicePermissionDescResponse updateEndpointServicePermissionDesc(
        UpdateEndpointServicePermissionDescRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.updateEndpointServicePermissionDesc);
    }

    /**
     * 更新终端节点服务白名单描述
     *
     * 更新当前用户下终端节点服务白名单的描述信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointServicePermissionDescRequest 请求对象
     * @return SyncInvoker<UpdateEndpointServicePermissionDescRequest, UpdateEndpointServicePermissionDescResponse>
     */
    public SyncInvoker<UpdateEndpointServicePermissionDescRequest, UpdateEndpointServicePermissionDescResponse> updateEndpointServicePermissionDescInvoker(
        UpdateEndpointServicePermissionDescRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.updateEndpointServicePermissionDesc, hcClient);
    }

    /**
     * 更新终端节点
     *
     * 更新或删除允许访问终端节点的白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointWhiteRequest 请求对象
     * @return UpdateEndpointWhiteResponse
     */
    public UpdateEndpointWhiteResponse updateEndpointWhite(UpdateEndpointWhiteRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.updateEndpointWhite);
    }

    /**
     * 更新终端节点
     *
     * 更新或删除允许访问终端节点的白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointWhiteRequest 请求对象
     * @return SyncInvoker<UpdateEndpointWhiteRequest, UpdateEndpointWhiteResponse>
     */
    public SyncInvoker<UpdateEndpointWhiteRequest, UpdateEndpointWhiteResponse> updateEndpointWhiteInvoker(
        UpdateEndpointWhiteRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.updateEndpointWhite, hcClient);
    }

    /**
     * 升级终端节点服务
     *
     * 升级终端节点服务，使终端节点服务支持创建专业型终端节点实例
     * 该接口仅支持在华东二、中东-利雅得、华东-青岛、非洲-开罗局点调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeEndpointServiceRequest 请求对象
     * @return UpgradeEndpointServiceResponse
     */
    public UpgradeEndpointServiceResponse upgradeEndpointService(UpgradeEndpointServiceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.upgradeEndpointService);
    }

    /**
     * 升级终端节点服务
     *
     * 升级终端节点服务，使终端节点服务支持创建专业型终端节点实例
     * 该接口仅支持在华东二、中东-利雅得、华东-青岛、非洲-开罗局点调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeEndpointServiceRequest 请求对象
     * @return SyncInvoker<UpgradeEndpointServiceRequest, UpgradeEndpointServiceResponse>
     */
    public SyncInvoker<UpgradeEndpointServiceRequest, UpgradeEndpointServiceResponse> upgradeEndpointServiceInvoker(
        UpgradeEndpointServiceRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.upgradeEndpointService, hcClient);
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
     * @return BatchAddOrRemoveResourceInstanceResponse
     */
    public BatchAddOrRemoveResourceInstanceResponse batchAddOrRemoveResourceInstance(
        BatchAddOrRemoveResourceInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.batchAddOrRemoveResourceInstance);
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
     * @return SyncInvoker<BatchAddOrRemoveResourceInstanceRequest, BatchAddOrRemoveResourceInstanceResponse>
     */
    public SyncInvoker<BatchAddOrRemoveResourceInstanceRequest, BatchAddOrRemoveResourceInstanceResponse> batchAddOrRemoveResourceInstanceInvoker(
        BatchAddOrRemoveResourceInstanceRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.batchAddOrRemoveResourceInstance, hcClient);
    }

    /**
     * 查询租户资源标签接口
     *
     * 根据租户ID和资源类型，获取租户下资源的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryProjectResourceTagsRequest 请求对象
     * @return ListQueryProjectResourceTagsResponse
     */
    public ListQueryProjectResourceTagsResponse listQueryProjectResourceTags(
        ListQueryProjectResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listQueryProjectResourceTags);
    }

    /**
     * 查询租户资源标签接口
     *
     * 根据租户ID和资源类型，获取租户下资源的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryProjectResourceTagsRequest 请求对象
     * @return SyncInvoker<ListQueryProjectResourceTagsRequest, ListQueryProjectResourceTagsResponse>
     */
    public SyncInvoker<ListQueryProjectResourceTagsRequest, ListQueryProjectResourceTagsResponse> listQueryProjectResourceTagsInvoker(
        ListQueryProjectResourceTagsRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.listQueryProjectResourceTags, hcClient);
    }

    /**
     * 查询资源实例接口
     *
     * 使用标签过滤查询租户下资源的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstancesRequest 请求对象
     * @return ListResourceInstancesResponse
     */
    public ListResourceInstancesResponse listResourceInstances(ListResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listResourceInstances);
    }

    /**
     * 查询资源实例接口
     *
     * 使用标签过滤查询租户下资源的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstancesRequest 请求对象
     * @return SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>
     */
    public SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstancesInvoker(
        ListResourceInstancesRequest request) {
        return new SyncInvoker<>(request, VpcepMeta.listResourceInstances, hcClient);
    }

}
