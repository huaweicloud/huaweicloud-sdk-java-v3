package com.huaweicloud.sdk.vpcep.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.vpcep.v1.model.*;

public class VpcepClient {

    protected HcClient hcClient;

    public VpcepClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VpcepClient> newBuilder() {
        return new ClientBuilder<>(VpcepClient::new);
    }

    /** 接受或拒绝终端节点的连接 功能介绍 接受或者拒绝终端节点连接到当前的终端节点服务。
     *
     * @param AcceptOrRejectEndpointRequest 请求对象
     * @return AcceptOrRejectEndpointResponse */
    public AcceptOrRejectEndpointResponse acceptOrRejectEndpoint(AcceptOrRejectEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.acceptOrRejectEndpoint);
    }

    /** 接受或拒绝终端节点的连接 功能介绍 接受或者拒绝终端节点连接到当前的终端节点服务。
     *
     * @param AcceptOrRejectEndpointRequest 请求对象
     * @return SyncInvoker<AcceptOrRejectEndpointRequest, AcceptOrRejectEndpointResponse> */
    public SyncInvoker<AcceptOrRejectEndpointRequest, AcceptOrRejectEndpointResponse> acceptOrRejectEndpointInvoker(
        AcceptOrRejectEndpointRequest request) {
        return new SyncInvoker<AcceptOrRejectEndpointRequest, AcceptOrRejectEndpointResponse>(request,
            VpcepMeta.acceptOrRejectEndpoint, hcClient);
    }

    /** 批量添加或移除终端节点服务的白名单 功能介绍 批量添加或移除当前用户下终端节点服务的白名单。 说明 本帐号默认在自身用户的终端节点服务的白名单中。
     *
     * @param AddOrRemoveServicePermissionsRequest 请求对象
     * @return AddOrRemoveServicePermissionsResponse */
    public AddOrRemoveServicePermissionsResponse addOrRemoveServicePermissions(
        AddOrRemoveServicePermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.addOrRemoveServicePermissions);
    }

    /** 批量添加或移除终端节点服务的白名单 功能介绍 批量添加或移除当前用户下终端节点服务的白名单。 说明 本帐号默认在自身用户的终端节点服务的白名单中。
     *
     * @param AddOrRemoveServicePermissionsRequest 请求对象
     * @return SyncInvoker<AddOrRemoveServicePermissionsRequest, AddOrRemoveServicePermissionsResponse> */
    public SyncInvoker<AddOrRemoveServicePermissionsRequest, AddOrRemoveServicePermissionsResponse> addOrRemoveServicePermissionsInvoker(
        AddOrRemoveServicePermissionsRequest request) {
        return new SyncInvoker<AddOrRemoveServicePermissionsRequest, AddOrRemoveServicePermissionsResponse>(request,
            VpcepMeta.addOrRemoveServicePermissions, hcClient);
    }

    /** 创建终端节点 功能介绍 创建终端节点，以便访问终端节点服务。
     *
     * @param CreateEndpointRequest 请求对象
     * @return CreateEndpointResponse */
    public CreateEndpointResponse createEndpoint(CreateEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.createEndpoint);
    }

    /** 创建终端节点 功能介绍 创建终端节点，以便访问终端节点服务。
     *
     * @param CreateEndpointRequest 请求对象
     * @return SyncInvoker<CreateEndpointRequest, CreateEndpointResponse> */
    public SyncInvoker<CreateEndpointRequest, CreateEndpointResponse> createEndpointInvoker(
        CreateEndpointRequest request) {
        return new SyncInvoker<CreateEndpointRequest, CreateEndpointResponse>(request, VpcepMeta.createEndpoint,
            hcClient);
    }

    /** 创建终端节点服务 功能介绍 创建终端节点服务，允许其他用户创建终端节点连接您创建的终端节点服务，使用您 所提供的服务。 说明 该接口为异步接口，调用成功会返回200状态码，说明请求已正常下发。通常创建终端节点服务
     * 需要1~2分钟，可以通过查询终端节点服务详情查看创建结果。
     *
     * @param CreateEndpointServiceRequest 请求对象
     * @return CreateEndpointServiceResponse */
    public CreateEndpointServiceResponse createEndpointService(CreateEndpointServiceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.createEndpointService);
    }

    /** 创建终端节点服务 功能介绍 创建终端节点服务，允许其他用户创建终端节点连接您创建的终端节点服务，使用您 所提供的服务。 说明 该接口为异步接口，调用成功会返回200状态码，说明请求已正常下发。通常创建终端节点服务
     * 需要1~2分钟，可以通过查询终端节点服务详情查看创建结果。
     *
     * @param CreateEndpointServiceRequest 请求对象
     * @return SyncInvoker<CreateEndpointServiceRequest, CreateEndpointServiceResponse> */
    public SyncInvoker<CreateEndpointServiceRequest, CreateEndpointServiceResponse> createEndpointServiceInvoker(
        CreateEndpointServiceRequest request) {
        return new SyncInvoker<CreateEndpointServiceRequest, CreateEndpointServiceResponse>(request,
            VpcepMeta.createEndpointService, hcClient);
    }

    /** 删除终端节点 功能介绍 删除终端节点。
     *
     * @param DeleteEndpointRequest 请求对象
     * @return DeleteEndpointResponse */
    public DeleteEndpointResponse deleteEndpoint(DeleteEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.deleteEndpoint);
    }

    /** 删除终端节点 功能介绍 删除终端节点。
     *
     * @param DeleteEndpointRequest 请求对象
     * @return SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse> */
    public SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpointInvoker(
        DeleteEndpointRequest request) {
        return new SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>(request, VpcepMeta.deleteEndpoint,
            hcClient);
    }

    /** 删除终端节点服务 功能介绍 删除终端节点服务。
     *
     * @param DeleteEndpointServiceRequest 请求对象
     * @return DeleteEndpointServiceResponse */
    public DeleteEndpointServiceResponse deleteEndpointService(DeleteEndpointServiceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.deleteEndpointService);
    }

    /** 删除终端节点服务 功能介绍 删除终端节点服务。
     *
     * @param DeleteEndpointServiceRequest 请求对象
     * @return SyncInvoker<DeleteEndpointServiceRequest, DeleteEndpointServiceResponse> */
    public SyncInvoker<DeleteEndpointServiceRequest, DeleteEndpointServiceResponse> deleteEndpointServiceInvoker(
        DeleteEndpointServiceRequest request) {
        return new SyncInvoker<DeleteEndpointServiceRequest, DeleteEndpointServiceResponse>(request,
            VpcepMeta.deleteEndpointService, hcClient);
    }

    /** 查询终端节点列表 功能介绍 查询当前用户下的终端节点的列表。
     *
     * @param ListEndpointDetailsRequest 请求对象
     * @return ListEndpointDetailsResponse */
    public ListEndpointDetailsResponse listEndpointDetails(ListEndpointDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listEndpointDetails);
    }

    /** 查询终端节点列表 功能介绍 查询当前用户下的终端节点的列表。
     *
     * @param ListEndpointDetailsRequest 请求对象
     * @return SyncInvoker<ListEndpointDetailsRequest, ListEndpointDetailsResponse> */
    public SyncInvoker<ListEndpointDetailsRequest, ListEndpointDetailsResponse> listEndpointDetailsInvoker(
        ListEndpointDetailsRequest request) {
        return new SyncInvoker<ListEndpointDetailsRequest, ListEndpointDetailsResponse>(request,
            VpcepMeta.listEndpointDetails, hcClient);
    }

    /** 查询终端节点详情 功能介绍 查询终端节点的详细信息。
     *
     * @param ListEndpointInfoDetailsRequest 请求对象
     * @return ListEndpointInfoDetailsResponse */
    public ListEndpointInfoDetailsResponse listEndpointInfoDetails(ListEndpointInfoDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listEndpointInfoDetails);
    }

    /** 查询终端节点详情 功能介绍 查询终端节点的详细信息。
     *
     * @param ListEndpointInfoDetailsRequest 请求对象
     * @return SyncInvoker<ListEndpointInfoDetailsRequest, ListEndpointInfoDetailsResponse> */
    public SyncInvoker<ListEndpointInfoDetailsRequest, ListEndpointInfoDetailsResponse> listEndpointInfoDetailsInvoker(
        ListEndpointInfoDetailsRequest request) {
        return new SyncInvoker<ListEndpointInfoDetailsRequest, ListEndpointInfoDetailsResponse>(request,
            VpcepMeta.listEndpointInfoDetails, hcClient);
    }

    /** 查询终端节点服务列表 功能介绍 查询当前用户下的终端节点服务的列表。
     *
     * @param ListEndpointServiceRequest 请求对象
     * @return ListEndpointServiceResponse */
    public ListEndpointServiceResponse listEndpointService(ListEndpointServiceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listEndpointService);
    }

    /** 查询终端节点服务列表 功能介绍 查询当前用户下的终端节点服务的列表。
     *
     * @param ListEndpointServiceRequest 请求对象
     * @return SyncInvoker<ListEndpointServiceRequest, ListEndpointServiceResponse> */
    public SyncInvoker<ListEndpointServiceRequest, ListEndpointServiceResponse> listEndpointServiceInvoker(
        ListEndpointServiceRequest request) {
        return new SyncInvoker<ListEndpointServiceRequest, ListEndpointServiceResponse>(request,
            VpcepMeta.listEndpointService, hcClient);
    }

    /** 查询配额 功能介绍 查询用户的资源配额，包括终端节点服务和终端节点。
     *
     * @param ListQuotaDetailsRequest 请求对象
     * @return ListQuotaDetailsResponse */
    public ListQuotaDetailsResponse listQuotaDetails(ListQuotaDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listQuotaDetails);
    }

    /** 查询配额 功能介绍 查询用户的资源配额，包括终端节点服务和终端节点。
     *
     * @param ListQuotaDetailsRequest 请求对象
     * @return SyncInvoker<ListQuotaDetailsRequest, ListQuotaDetailsResponse> */
    public SyncInvoker<ListQuotaDetailsRequest, ListQuotaDetailsResponse> listQuotaDetailsInvoker(
        ListQuotaDetailsRequest request) {
        return new SyncInvoker<ListQuotaDetailsRequest, ListQuotaDetailsResponse>(request, VpcepMeta.listQuotaDetails,
            hcClient);
    }

    /** 查询连接终端节点服务的连接列表 功能介绍 查询连接当前用户下的某一个终端节点服务的连接列表。marker_id是连接的唯一标 识。
     *
     * @param ListServiceConnectionsRequest 请求对象
     * @return ListServiceConnectionsResponse */
    public ListServiceConnectionsResponse listServiceConnections(ListServiceConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listServiceConnections);
    }

    /** 查询连接终端节点服务的连接列表 功能介绍 查询连接当前用户下的某一个终端节点服务的连接列表。marker_id是连接的唯一标 识。
     *
     * @param ListServiceConnectionsRequest 请求对象
     * @return SyncInvoker<ListServiceConnectionsRequest, ListServiceConnectionsResponse> */
    public SyncInvoker<ListServiceConnectionsRequest, ListServiceConnectionsResponse> listServiceConnectionsInvoker(
        ListServiceConnectionsRequest request) {
        return new SyncInvoker<ListServiceConnectionsRequest, ListServiceConnectionsResponse>(request,
            VpcepMeta.listServiceConnections, hcClient);
    }

    /** 查询终端节点服务概要 功能介绍 查询终端节点服务的概要信息，此接口是供创建终端节点的用户来查询需要连接的终 端节点服务信息。此接口既可以方便其他用户查询到您的终端节点服务概要信息又可
     * 以避免您的终端节点服务的细节信息暴露给其他用户。
     *
     * @param ListServiceDescribeDetailsRequest 请求对象
     * @return ListServiceDescribeDetailsResponse */
    public ListServiceDescribeDetailsResponse listServiceDescribeDetails(ListServiceDescribeDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listServiceDescribeDetails);
    }

    /** 查询终端节点服务概要 功能介绍 查询终端节点服务的概要信息，此接口是供创建终端节点的用户来查询需要连接的终 端节点服务信息。此接口既可以方便其他用户查询到您的终端节点服务概要信息又可
     * 以避免您的终端节点服务的细节信息暴露给其他用户。
     *
     * @param ListServiceDescribeDetailsRequest 请求对象
     * @return SyncInvoker<ListServiceDescribeDetailsRequest, ListServiceDescribeDetailsResponse> */
    public SyncInvoker<ListServiceDescribeDetailsRequest, ListServiceDescribeDetailsResponse> listServiceDescribeDetailsInvoker(
        ListServiceDescribeDetailsRequest request) {
        return new SyncInvoker<ListServiceDescribeDetailsRequest, ListServiceDescribeDetailsResponse>(request,
            VpcepMeta.listServiceDescribeDetails, hcClient);
    }

    /** 查询终端节点服务详情 功能介绍 查询终端节点服务的详细信息。
     *
     * @param ListServiceDetailsRequest 请求对象
     * @return ListServiceDetailsResponse */
    public ListServiceDetailsResponse listServiceDetails(ListServiceDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listServiceDetails);
    }

    /** 查询终端节点服务详情 功能介绍 查询终端节点服务的详细信息。
     *
     * @param ListServiceDetailsRequest 请求对象
     * @return SyncInvoker<ListServiceDetailsRequest, ListServiceDetailsResponse> */
    public SyncInvoker<ListServiceDetailsRequest, ListServiceDetailsResponse> listServiceDetailsInvoker(
        ListServiceDetailsRequest request) {
        return new SyncInvoker<ListServiceDetailsRequest, ListServiceDetailsResponse>(request,
            VpcepMeta.listServiceDetails, hcClient);
    }

    /** 查询终端节点服务的白名单列表 功能介绍 查询当前用户下终端节点服务的白名单列表。 说明 本帐号默认在当前用户下终端节点服务的白名单中。
     *
     * @param ListServicePermissionsDetailsRequest 请求对象
     * @return ListServicePermissionsDetailsResponse */
    public ListServicePermissionsDetailsResponse listServicePermissionsDetails(
        ListServicePermissionsDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listServicePermissionsDetails);
    }

    /** 查询终端节点服务的白名单列表 功能介绍 查询当前用户下终端节点服务的白名单列表。 说明 本帐号默认在当前用户下终端节点服务的白名单中。
     *
     * @param ListServicePermissionsDetailsRequest 请求对象
     * @return SyncInvoker<ListServicePermissionsDetailsRequest, ListServicePermissionsDetailsResponse> */
    public SyncInvoker<ListServicePermissionsDetailsRequest, ListServicePermissionsDetailsResponse> listServicePermissionsDetailsInvoker(
        ListServicePermissionsDetailsRequest request) {
        return new SyncInvoker<ListServicePermissionsDetailsRequest, ListServicePermissionsDetailsResponse>(request,
            VpcepMeta.listServicePermissionsDetails, hcClient);
    }

    /** 查询公共终端节点服务列表 功能介绍 查询公共终端节点服务的列表，公共终端节点服务是所有用户可见且可连接的终端节 点服务，由运维人员创建，用户可直接使用，但无权创建。
     *
     * @param ListServicePublicDetailsRequest 请求对象
     * @return ListServicePublicDetailsResponse */
    public ListServicePublicDetailsResponse listServicePublicDetails(ListServicePublicDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listServicePublicDetails);
    }

    /** 查询公共终端节点服务列表 功能介绍 查询公共终端节点服务的列表，公共终端节点服务是所有用户可见且可连接的终端节 点服务，由运维人员创建，用户可直接使用，但无权创建。
     *
     * @param ListServicePublicDetailsRequest 请求对象
     * @return SyncInvoker<ListServicePublicDetailsRequest, ListServicePublicDetailsResponse> */
    public SyncInvoker<ListServicePublicDetailsRequest, ListServicePublicDetailsResponse> listServicePublicDetailsInvoker(
        ListServicePublicDetailsRequest request) {
        return new SyncInvoker<ListServicePublicDetailsRequest, ListServicePublicDetailsResponse>(request,
            VpcepMeta.listServicePublicDetails, hcClient);
    }

    /** 查询指定VPC终端节点接口版本信息 功能介绍 查询指定VPC终端节点接口版本信息。
     *
     * @param ListSpecifiedVersionDetailsRequest 请求对象
     * @return ListSpecifiedVersionDetailsResponse */
    public ListSpecifiedVersionDetailsResponse listSpecifiedVersionDetails(ListSpecifiedVersionDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listSpecifiedVersionDetails);
    }

    /** 查询指定VPC终端节点接口版本信息 功能介绍 查询指定VPC终端节点接口版本信息。
     *
     * @param ListSpecifiedVersionDetailsRequest 请求对象
     * @return SyncInvoker<ListSpecifiedVersionDetailsRequest, ListSpecifiedVersionDetailsResponse> */
    public SyncInvoker<ListSpecifiedVersionDetailsRequest, ListSpecifiedVersionDetailsResponse> listSpecifiedVersionDetailsInvoker(
        ListSpecifiedVersionDetailsRequest request) {
        return new SyncInvoker<ListSpecifiedVersionDetailsRequest, ListSpecifiedVersionDetailsResponse>(request,
            VpcepMeta.listSpecifiedVersionDetails, hcClient);
    }

    /** 查询VPC终端节点接口版本列表 功能介绍 查询VPC终端节点接口版本列表。
     *
     * @param ListVersionDetailsRequest 请求对象
     * @return ListVersionDetailsResponse */
    public ListVersionDetailsResponse listVersionDetails(ListVersionDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listVersionDetails);
    }

    /** 查询VPC终端节点接口版本列表 功能介绍 查询VPC终端节点接口版本列表。
     *
     * @param ListVersionDetailsRequest 请求对象
     * @return SyncInvoker<ListVersionDetailsRequest, ListVersionDetailsResponse> */
    public SyncInvoker<ListVersionDetailsRequest, ListVersionDetailsResponse> listVersionDetailsInvoker(
        ListVersionDetailsRequest request) {
        return new SyncInvoker<ListVersionDetailsRequest, ListVersionDetailsResponse>(request,
            VpcepMeta.listVersionDetails, hcClient);
    }

    /** 修改终端节点路由表 功能介绍 修改终端节点路由表。
     *
     * @param UpdateEndpointRoutetableRequest 请求对象
     * @return UpdateEndpointRoutetableResponse */
    public UpdateEndpointRoutetableResponse updateEndpointRoutetable(UpdateEndpointRoutetableRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.updateEndpointRoutetable);
    }

    /** 修改终端节点路由表 功能介绍 修改终端节点路由表。
     *
     * @param UpdateEndpointRoutetableRequest 请求对象
     * @return SyncInvoker<UpdateEndpointRoutetableRequest, UpdateEndpointRoutetableResponse> */
    public SyncInvoker<UpdateEndpointRoutetableRequest, UpdateEndpointRoutetableResponse> updateEndpointRoutetableInvoker(
        UpdateEndpointRoutetableRequest request) {
        return new SyncInvoker<UpdateEndpointRoutetableRequest, UpdateEndpointRoutetableResponse>(request,
            VpcepMeta.updateEndpointRoutetable, hcClient);
    }

    /** 修改终端节点服务 功能介绍 修改终端节点服务。
     *
     * @param UpdateEndpointServiceRequest 请求对象
     * @return UpdateEndpointServiceResponse */
    public UpdateEndpointServiceResponse updateEndpointService(UpdateEndpointServiceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.updateEndpointService);
    }

    /** 修改终端节点服务 功能介绍 修改终端节点服务。
     *
     * @param UpdateEndpointServiceRequest 请求对象
     * @return SyncInvoker<UpdateEndpointServiceRequest, UpdateEndpointServiceResponse> */
    public SyncInvoker<UpdateEndpointServiceRequest, UpdateEndpointServiceResponse> updateEndpointServiceInvoker(
        UpdateEndpointServiceRequest request) {
        return new SyncInvoker<UpdateEndpointServiceRequest, UpdateEndpointServiceResponse>(request,
            VpcepMeta.updateEndpointService, hcClient);
    }

    /** 更新终端节点的白名单 功能介绍 更新或删除允许访问终端节点的白名单。
     *
     * @param UpdateEndpointWhiteRequest 请求对象
     * @return UpdateEndpointWhiteResponse */
    public UpdateEndpointWhiteResponse updateEndpointWhite(UpdateEndpointWhiteRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.updateEndpointWhite);
    }

    /** 更新终端节点的白名单 功能介绍 更新或删除允许访问终端节点的白名单。
     *
     * @param UpdateEndpointWhiteRequest 请求对象
     * @return SyncInvoker<UpdateEndpointWhiteRequest, UpdateEndpointWhiteResponse> */
    public SyncInvoker<UpdateEndpointWhiteRequest, UpdateEndpointWhiteResponse> updateEndpointWhiteInvoker(
        UpdateEndpointWhiteRequest request) {
        return new SyncInvoker<UpdateEndpointWhiteRequest, UpdateEndpointWhiteResponse>(request,
            VpcepMeta.updateEndpointWhite, hcClient);
    }

    /** 功能介绍 为指定Endpoint Service或Endpoint批量添加或删除标签。 ● 一个资源上最多有10个标签。
     *
     * @param BatchAddOrRemoveResourceInstanceRequest 请求对象
     * @return BatchAddOrRemoveResourceInstanceResponse */
    public BatchAddOrRemoveResourceInstanceResponse batchAddOrRemoveResourceInstance(
        BatchAddOrRemoveResourceInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.batchAddOrRemoveResourceInstance);
    }

    /** 功能介绍 为指定Endpoint Service或Endpoint批量添加或删除标签。 ● 一个资源上最多有10个标签。
     *
     * @param BatchAddOrRemoveResourceInstanceRequest 请求对象
     * @return SyncInvoker<BatchAddOrRemoveResourceInstanceRequest, BatchAddOrRemoveResourceInstanceResponse> */
    public SyncInvoker<BatchAddOrRemoveResourceInstanceRequest, BatchAddOrRemoveResourceInstanceResponse> batchAddOrRemoveResourceInstanceInvoker(
        BatchAddOrRemoveResourceInstanceRequest request) {
        return new SyncInvoker<BatchAddOrRemoveResourceInstanceRequest, BatchAddOrRemoveResourceInstanceResponse>(
            request, VpcepMeta.batchAddOrRemoveResourceInstance, hcClient);
    }

    /** 功能介绍 根据租户ID和资源类型，获取租户下资源的标签。
     *
     * @param ListQueryProjectResourceTagsRequest 请求对象
     * @return ListQueryProjectResourceTagsResponse */
    public ListQueryProjectResourceTagsResponse listQueryProjectResourceTags(
        ListQueryProjectResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listQueryProjectResourceTags);
    }

    /** 功能介绍 根据租户ID和资源类型，获取租户下资源的标签。
     *
     * @param ListQueryProjectResourceTagsRequest 请求对象
     * @return SyncInvoker<ListQueryProjectResourceTagsRequest, ListQueryProjectResourceTagsResponse> */
    public SyncInvoker<ListQueryProjectResourceTagsRequest, ListQueryProjectResourceTagsResponse> listQueryProjectResourceTagsInvoker(
        ListQueryProjectResourceTagsRequest request) {
        return new SyncInvoker<ListQueryProjectResourceTagsRequest, ListQueryProjectResourceTagsResponse>(request,
            VpcepMeta.listQueryProjectResourceTags, hcClient);
    }

    /** 查询资源实例接口 功能介绍 使用标签过滤查询租户下资源的实例。
     *
     * @param ListResourceInstancesRequest 请求对象
     * @return ListResourceInstancesResponse */
    public ListResourceInstancesResponse listResourceInstances(ListResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcepMeta.listResourceInstances);
    }

    /** 查询资源实例接口 功能介绍 使用标签过滤查询租户下资源的实例。
     *
     * @param ListResourceInstancesRequest 请求对象
     * @return SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> */
    public SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstancesInvoker(
        ListResourceInstancesRequest request) {
        return new SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>(request,
            VpcepMeta.listResourceInstances, hcClient);
    }

}
