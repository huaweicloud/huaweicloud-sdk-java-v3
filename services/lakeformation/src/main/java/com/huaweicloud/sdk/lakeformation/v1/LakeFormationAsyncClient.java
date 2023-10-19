package com.huaweicloud.sdk.lakeformation.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.lakeformation.v1.model.AddPartitionsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.AddPartitionsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ApplyForAccessRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ApplyForAccessResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.AssociatePrincipalsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.AssociatePrincipalsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.AssociateRolesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.AssociateRolesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.AuthorizeAccessServiceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.AuthorizeAccessServiceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchAuthorizeInterfaceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchAuthorizeInterfaceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchCancelAuthorizationInterfaceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchCancelAuthorizationInterfaceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchCheckPermissionRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchCheckPermissionResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchCreateConstraintRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchCreateConstraintResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchDeletePartitionRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchDeletePartitionResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchDeletePartitionedStatisticsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchDeletePartitionedStatisticsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchListPartitionByValuesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchListPartitionByValuesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchShowPartitionColumnStatisticsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchShowPartitionColumnStatisticsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchUpdateLakeFormationInstanceTagsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchUpdateLakeFormationInstanceTagsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchUpdatePartitionRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchUpdatePartitionResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CountMetaObjRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CountMetaObjResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateAccessClientRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateAccessClientResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateAgencyRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateAgencyResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateAgreementRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateAgreementResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateCatalogRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateCatalogResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateDatabaseRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateDatabaseResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateFunctionRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateFunctionResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateLakeFormationInstanceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateLakeFormationInstanceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateRoleRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateRoleResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateTableRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateTableResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAccessClientRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAccessClientResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAgencyRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAgencyResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAgreementRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAgreementResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAllTablesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAllTablesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteCatalogRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteCatalogResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteConstraintRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteConstraintResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteDatabaseRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteDatabaseResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteFunctionRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteFunctionResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteLakeFormationInstanceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteLakeFormationInstanceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeletePartitionColumnStatisticsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeletePartitionColumnStatisticsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteRoleRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteRoleResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteTableColumnStatisticsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteTableColumnStatisticsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteTableRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteTableResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListAccessClientInfosRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListAccessClientInfosResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListAccessInfosRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListAccessInfosResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListAllFunctionsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListAllFunctionsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListCatalogsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListCatalogsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListConfigsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListConfigsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListConstraintsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListConstraintsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListDatabaseNamesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListDatabaseNamesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListDatabasesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListDatabasesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListFunctionNamesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListFunctionNamesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListFunctionsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListFunctionsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListGroupsForDomainRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListGroupsForDomainResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListInterfacesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListInterfacesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListLakeFormationInstanceTagsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListLakeFormationInstanceTagsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListLakeFormationInstancesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListLakeFormationInstancesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListObsBucketsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListObsBucketsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListObsObjectRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListObsObjectResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPartitionNamesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPartitionNamesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPartitionNamesWithoutLimitRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPartitionNamesWithoutLimitResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPartitionsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPartitionsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPolicyRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPolicyResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPrincipalsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPrincipalsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListQuotasRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListQuotasResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListRoleNamesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListRoleNamesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListRolesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListRolesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListSpecsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListSpecsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTableColumnStatisticsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTableColumnStatisticsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTableMetaRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTableMetaResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTableNamesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTableNamesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTablesByNameRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTablesByNameResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTablesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTablesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListUserRolesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListUserRolesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListUsersRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListUsersResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.MoveLakeFormationInstanceOutRecycleBinRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.MoveLakeFormationInstanceOutRecycleBinResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.RevokePrincipalsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.RevokePrincipalsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.RevokeRolesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.RevokeRolesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.SetPartitionColumnStatisticsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.SetPartitionColumnStatisticsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.SetTableColumnStatisticsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.SetTableColumnStatisticsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAccessClientRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAccessClientResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAccessServiceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAccessServiceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAgencyRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAgencyResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAgreementRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAgreementResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAgreementRuleRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAgreementRuleResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowCatalogRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowCatalogResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowCredentialRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowCredentialResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowDatabaseRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowDatabaseResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowFunctionRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowFunctionResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowLakeFormationInstanceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowLakeFormationInstanceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowRoleRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowRoleResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowSyncPolicyRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowSyncPolicyResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowTableRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowTableResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateAccessClientRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateAccessClientResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateCatalogRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateCatalogResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateDatabaseRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateDatabaseResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateFunctionRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateFunctionResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateLakeFormationInstanceDefaultRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateLakeFormationInstanceDefaultResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateLakeFormationInstanceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateLakeFormationInstanceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateLakeFormationInstanceScaleRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateLakeFormationInstanceScaleResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdatePrincipalsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdatePrincipalsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateRoleRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateRoleResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateRolesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateRolesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateTableRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateTableResponse;

import java.util.concurrent.CompletableFuture;

public class LakeFormationAsyncClient {

    protected HcClient hcClient;

    public LakeFormationAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<LakeFormationAsyncClient> newBuilder() {
        ClientBuilder<LakeFormationAsyncClient> clientBuilder = new ClientBuilder<>(LakeFormationAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 申请接入服务
     *
     * 申请接入服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyForAccessRequest 请求对象
     * @return CompletableFuture<ApplyForAccessResponse>
     */
    public CompletableFuture<ApplyForAccessResponse> applyForAccessAsync(ApplyForAccessRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.applyForAccess);
    }

    /**
     * 申请接入服务
     *
     * 申请接入服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyForAccessRequest 请求对象
     * @return AsyncInvoker<ApplyForAccessRequest, ApplyForAccessResponse>
     */
    public AsyncInvoker<ApplyForAccessRequest, ApplyForAccessResponse> applyForAccessAsyncInvoker(
        ApplyForAccessRequest request) {
        return new AsyncInvoker<ApplyForAccessRequest, ApplyForAccessResponse>(request,
            LakeFormationMeta.applyForAccess, hcClient);
    }

    /**
     * 批量授权
     *
     * 批量授权接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAuthorizeInterfaceRequest 请求对象
     * @return CompletableFuture<BatchAuthorizeInterfaceResponse>
     */
    public CompletableFuture<BatchAuthorizeInterfaceResponse> batchAuthorizeInterfaceAsync(
        BatchAuthorizeInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.batchAuthorizeInterface);
    }

    /**
     * 批量授权
     *
     * 批量授权接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAuthorizeInterfaceRequest 请求对象
     * @return AsyncInvoker<BatchAuthorizeInterfaceRequest, BatchAuthorizeInterfaceResponse>
     */
    public AsyncInvoker<BatchAuthorizeInterfaceRequest, BatchAuthorizeInterfaceResponse> batchAuthorizeInterfaceAsyncInvoker(
        BatchAuthorizeInterfaceRequest request) {
        return new AsyncInvoker<BatchAuthorizeInterfaceRequest, BatchAuthorizeInterfaceResponse>(request,
            LakeFormationMeta.batchAuthorizeInterface, hcClient);
    }

    /**
     * 取消批量授权
     *
     * 批量取消授权接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCancelAuthorizationInterfaceRequest 请求对象
     * @return CompletableFuture<BatchCancelAuthorizationInterfaceResponse>
     */
    public CompletableFuture<BatchCancelAuthorizationInterfaceResponse> batchCancelAuthorizationInterfaceAsync(
        BatchCancelAuthorizationInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.batchCancelAuthorizationInterface);
    }

    /**
     * 取消批量授权
     *
     * 批量取消授权接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCancelAuthorizationInterfaceRequest 请求对象
     * @return AsyncInvoker<BatchCancelAuthorizationInterfaceRequest, BatchCancelAuthorizationInterfaceResponse>
     */
    public AsyncInvoker<BatchCancelAuthorizationInterfaceRequest, BatchCancelAuthorizationInterfaceResponse> batchCancelAuthorizationInterfaceAsyncInvoker(
        BatchCancelAuthorizationInterfaceRequest request) {
        return new AsyncInvoker<BatchCancelAuthorizationInterfaceRequest, BatchCancelAuthorizationInterfaceResponse>(
            request, LakeFormationMeta.batchCancelAuthorizationInterface, hcClient);
    }

    /**
     * 批量鉴权
     *
     * 批量鉴权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCheckPermissionRequest 请求对象
     * @return CompletableFuture<BatchCheckPermissionResponse>
     */
    public CompletableFuture<BatchCheckPermissionResponse> batchCheckPermissionAsync(
        BatchCheckPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.batchCheckPermission);
    }

    /**
     * 批量鉴权
     *
     * 批量鉴权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCheckPermissionRequest 请求对象
     * @return AsyncInvoker<BatchCheckPermissionRequest, BatchCheckPermissionResponse>
     */
    public AsyncInvoker<BatchCheckPermissionRequest, BatchCheckPermissionResponse> batchCheckPermissionAsyncInvoker(
        BatchCheckPermissionRequest request) {
        return new AsyncInvoker<BatchCheckPermissionRequest, BatchCheckPermissionResponse>(request,
            LakeFormationMeta.batchCheckPermission, hcClient);
    }

    /**
     * 创建服务接入客户端
     *
     * 创建服务接入客户端。
     * 其他限制：
     *   同一个实例下默认最多创建20个接入客户端。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAccessClientRequest 请求对象
     * @return CompletableFuture<CreateAccessClientResponse>
     */
    public CompletableFuture<CreateAccessClientResponse> createAccessClientAsync(CreateAccessClientRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.createAccessClient);
    }

    /**
     * 创建服务接入客户端
     *
     * 创建服务接入客户端。
     * 其他限制：
     *   同一个实例下默认最多创建20个接入客户端。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAccessClientRequest 请求对象
     * @return AsyncInvoker<CreateAccessClientRequest, CreateAccessClientResponse>
     */
    public AsyncInvoker<CreateAccessClientRequest, CreateAccessClientResponse> createAccessClientAsyncInvoker(
        CreateAccessClientRequest request) {
        return new AsyncInvoker<CreateAccessClientRequest, CreateAccessClientResponse>(request,
            LakeFormationMeta.createAccessClient, hcClient);
    }

    /**
     * 删除服务接入客户端
     *
     * 根据ID删除服务接入客户端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAccessClientRequest 请求对象
     * @return CompletableFuture<DeleteAccessClientResponse>
     */
    public CompletableFuture<DeleteAccessClientResponse> deleteAccessClientAsync(DeleteAccessClientRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deleteAccessClient);
    }

    /**
     * 删除服务接入客户端
     *
     * 根据ID删除服务接入客户端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAccessClientRequest 请求对象
     * @return AsyncInvoker<DeleteAccessClientRequest, DeleteAccessClientResponse>
     */
    public AsyncInvoker<DeleteAccessClientRequest, DeleteAccessClientResponse> deleteAccessClientAsyncInvoker(
        DeleteAccessClientRequest request) {
        return new AsyncInvoker<DeleteAccessClientRequest, DeleteAccessClientResponse>(request,
            LakeFormationMeta.deleteAccessClient, hcClient);
    }

    /**
     * 获取服务接入客户端信息列表
     *
     * 根据LakeFormation实例获取服务实例相关的接入客户端信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessClientInfosRequest 请求对象
     * @return CompletableFuture<ListAccessClientInfosResponse>
     */
    public CompletableFuture<ListAccessClientInfosResponse> listAccessClientInfosAsync(
        ListAccessClientInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listAccessClientInfos);
    }

    /**
     * 获取服务接入客户端信息列表
     *
     * 根据LakeFormation实例获取服务实例相关的接入客户端信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessClientInfosRequest 请求对象
     * @return AsyncInvoker<ListAccessClientInfosRequest, ListAccessClientInfosResponse>
     */
    public AsyncInvoker<ListAccessClientInfosRequest, ListAccessClientInfosResponse> listAccessClientInfosAsyncInvoker(
        ListAccessClientInfosRequest request) {
        return new AsyncInvoker<ListAccessClientInfosRequest, ListAccessClientInfosResponse>(request,
            LakeFormationMeta.listAccessClientInfos, hcClient);
    }

    /**
     * 获取服务接入信息
     *
     * 根据LakeFormation实例获取服务实例相关的接入信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessInfosRequest 请求对象
     * @return CompletableFuture<ListAccessInfosResponse>
     */
    public CompletableFuture<ListAccessInfosResponse> listAccessInfosAsync(ListAccessInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listAccessInfos);
    }

    /**
     * 获取服务接入信息
     *
     * 根据LakeFormation实例获取服务实例相关的接入信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessInfosRequest 请求对象
     * @return AsyncInvoker<ListAccessInfosRequest, ListAccessInfosResponse>
     */
    public AsyncInvoker<ListAccessInfosRequest, ListAccessInfosResponse> listAccessInfosAsyncInvoker(
        ListAccessInfosRequest request) {
        return new AsyncInvoker<ListAccessInfosRequest, ListAccessInfosResponse>(request,
            LakeFormationMeta.listAccessInfos, hcClient);
    }

    /**
     * 查询策略
     *
     * 通过过滤条件查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInterfacesRequest 请求对象
     * @return CompletableFuture<ListInterfacesResponse>
     */
    public CompletableFuture<ListInterfacesResponse> listInterfacesAsync(ListInterfacesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listInterfaces);
    }

    /**
     * 查询策略
     *
     * 通过过滤条件查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInterfacesRequest 请求对象
     * @return AsyncInvoker<ListInterfacesRequest, ListInterfacesResponse>
     */
    public AsyncInvoker<ListInterfacesRequest, ListInterfacesResponse> listInterfacesAsyncInvoker(
        ListInterfacesRequest request) {
        return new AsyncInvoker<ListInterfacesRequest, ListInterfacesResponse>(request,
            LakeFormationMeta.listInterfaces, hcClient);
    }

    /**
     * 获取同步权限策略
     *
     * 分页获取同步权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyRequest 请求对象
     * @return CompletableFuture<ListPolicyResponse>
     */
    public CompletableFuture<ListPolicyResponse> listPolicyAsync(ListPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listPolicy);
    }

    /**
     * 获取同步权限策略
     *
     * 分页获取同步权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyRequest 请求对象
     * @return AsyncInvoker<ListPolicyRequest, ListPolicyResponse>
     */
    public AsyncInvoker<ListPolicyRequest, ListPolicyResponse> listPolicyAsyncInvoker(ListPolicyRequest request) {
        return new AsyncInvoker<ListPolicyRequest, ListPolicyResponse>(request, LakeFormationMeta.listPolicy, hcClient);
    }

    /**
     * 获取服务接入客户端详情
     *
     * 根据ID获取服务接入客户端详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAccessClientRequest 请求对象
     * @return CompletableFuture<ShowAccessClientResponse>
     */
    public CompletableFuture<ShowAccessClientResponse> showAccessClientAsync(ShowAccessClientRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showAccessClient);
    }

    /**
     * 获取服务接入客户端详情
     *
     * 根据ID获取服务接入客户端详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAccessClientRequest 请求对象
     * @return AsyncInvoker<ShowAccessClientRequest, ShowAccessClientResponse>
     */
    public AsyncInvoker<ShowAccessClientRequest, ShowAccessClientResponse> showAccessClientAsyncInvoker(
        ShowAccessClientRequest request) {
        return new AsyncInvoker<ShowAccessClientRequest, ShowAccessClientResponse>(request,
            LakeFormationMeta.showAccessClient, hcClient);
    }

    /**
     * 获取同步权限策略
     *
     * 获取同步权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSyncPolicyRequest 请求对象
     * @return CompletableFuture<ShowSyncPolicyResponse>
     */
    public CompletableFuture<ShowSyncPolicyResponse> showSyncPolicyAsync(ShowSyncPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showSyncPolicy);
    }

    /**
     * 获取同步权限策略
     *
     * 获取同步权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSyncPolicyRequest 请求对象
     * @return AsyncInvoker<ShowSyncPolicyRequest, ShowSyncPolicyResponse>
     */
    public AsyncInvoker<ShowSyncPolicyRequest, ShowSyncPolicyResponse> showSyncPolicyAsyncInvoker(
        ShowSyncPolicyRequest request) {
        return new AsyncInvoker<ShowSyncPolicyRequest, ShowSyncPolicyResponse>(request,
            LakeFormationMeta.showSyncPolicy, hcClient);
    }

    /**
     * 更新服务接入客户端
     *
     * 根据ID更新服务接入客户端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAccessClientRequest 请求对象
     * @return CompletableFuture<UpdateAccessClientResponse>
     */
    public CompletableFuture<UpdateAccessClientResponse> updateAccessClientAsync(UpdateAccessClientRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.updateAccessClient);
    }

    /**
     * 更新服务接入客户端
     *
     * 根据ID更新服务接入客户端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAccessClientRequest 请求对象
     * @return AsyncInvoker<UpdateAccessClientRequest, UpdateAccessClientResponse>
     */
    public AsyncInvoker<UpdateAccessClientRequest, UpdateAccessClientResponse> updateAccessClientAsyncInvoker(
        UpdateAccessClientRequest request) {
        return new AsyncInvoker<UpdateAccessClientRequest, UpdateAccessClientResponse>(request,
            LakeFormationMeta.updateAccessClient, hcClient);
    }

    /**
     * 创建委托
     *
     * 创建委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgencyRequest 请求对象
     * @return CompletableFuture<CreateAgencyResponse>
     */
    public CompletableFuture<CreateAgencyResponse> createAgencyAsync(CreateAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.createAgency);
    }

    /**
     * 创建委托
     *
     * 创建委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgencyRequest 请求对象
     * @return AsyncInvoker<CreateAgencyRequest, CreateAgencyResponse>
     */
    public AsyncInvoker<CreateAgencyRequest, CreateAgencyResponse> createAgencyAsyncInvoker(
        CreateAgencyRequest request) {
        return new AsyncInvoker<CreateAgencyRequest, CreateAgencyResponse>(request, LakeFormationMeta.createAgency,
            hcClient);
    }

    /**
     * 删除委托
     *
     * 删除委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAgencyRequest 请求对象
     * @return CompletableFuture<DeleteAgencyResponse>
     */
    public CompletableFuture<DeleteAgencyResponse> deleteAgencyAsync(DeleteAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deleteAgency);
    }

    /**
     * 删除委托
     *
     * 删除委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAgencyRequest 请求对象
     * @return AsyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse>
     */
    public AsyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse> deleteAgencyAsyncInvoker(
        DeleteAgencyRequest request) {
        return new AsyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse>(request, LakeFormationMeta.deleteAgency,
            hcClient);
    }

    /**
     * 委托查询
     *
     * 委托查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgencyRequest 请求对象
     * @return CompletableFuture<ShowAgencyResponse>
     */
    public CompletableFuture<ShowAgencyResponse> showAgencyAsync(ShowAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showAgency);
    }

    /**
     * 委托查询
     *
     * 委托查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgencyRequest 请求对象
     * @return AsyncInvoker<ShowAgencyRequest, ShowAgencyResponse>
     */
    public AsyncInvoker<ShowAgencyRequest, ShowAgencyResponse> showAgencyAsyncInvoker(ShowAgencyRequest request) {
        return new AsyncInvoker<ShowAgencyRequest, ShowAgencyResponse>(request, LakeFormationMeta.showAgency, hcClient);
    }

    /**
     * 创建catalog
     *
     * 创建catalog，会在catalog下创建默认数据库，默认数据库名称为：default
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCatalogRequest 请求对象
     * @return CompletableFuture<CreateCatalogResponse>
     */
    public CompletableFuture<CreateCatalogResponse> createCatalogAsync(CreateCatalogRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.createCatalog);
    }

    /**
     * 创建catalog
     *
     * 创建catalog，会在catalog下创建默认数据库，默认数据库名称为：default
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCatalogRequest 请求对象
     * @return AsyncInvoker<CreateCatalogRequest, CreateCatalogResponse>
     */
    public AsyncInvoker<CreateCatalogRequest, CreateCatalogResponse> createCatalogAsyncInvoker(
        CreateCatalogRequest request) {
        return new AsyncInvoker<CreateCatalogRequest, CreateCatalogResponse>(request, LakeFormationMeta.createCatalog,
            hcClient);
    }

    /**
     * 删除catalog对象
     *
     * 删除空的catalog对象。
     * 删除前需要保证catalog下只有默认的数据库，且默认数据库下没有表对象，否则删除失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCatalogRequest 请求对象
     * @return CompletableFuture<DeleteCatalogResponse>
     */
    public CompletableFuture<DeleteCatalogResponse> deleteCatalogAsync(DeleteCatalogRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deleteCatalog);
    }

    /**
     * 删除catalog对象
     *
     * 删除空的catalog对象。
     * 删除前需要保证catalog下只有默认的数据库，且默认数据库下没有表对象，否则删除失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCatalogRequest 请求对象
     * @return AsyncInvoker<DeleteCatalogRequest, DeleteCatalogResponse>
     */
    public AsyncInvoker<DeleteCatalogRequest, DeleteCatalogResponse> deleteCatalogAsyncInvoker(
        DeleteCatalogRequest request) {
        return new AsyncInvoker<DeleteCatalogRequest, DeleteCatalogResponse>(request, LakeFormationMeta.deleteCatalog,
            hcClient);
    }

    /**
     * 列举catalog信息
     *
     * 根据catalog名字的通配符列举catalog的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCatalogsRequest 请求对象
     * @return CompletableFuture<ListCatalogsResponse>
     */
    public CompletableFuture<ListCatalogsResponse> listCatalogsAsync(ListCatalogsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listCatalogs);
    }

    /**
     * 列举catalog信息
     *
     * 根据catalog名字的通配符列举catalog的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCatalogsRequest 请求对象
     * @return AsyncInvoker<ListCatalogsRequest, ListCatalogsResponse>
     */
    public AsyncInvoker<ListCatalogsRequest, ListCatalogsResponse> listCatalogsAsyncInvoker(
        ListCatalogsRequest request) {
        return new AsyncInvoker<ListCatalogsRequest, ListCatalogsResponse>(request, LakeFormationMeta.listCatalogs,
            hcClient);
    }

    /**
     * 获取catalog信息
     *
     * 获取catalog信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCatalogRequest 请求对象
     * @return CompletableFuture<ShowCatalogResponse>
     */
    public CompletableFuture<ShowCatalogResponse> showCatalogAsync(ShowCatalogRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showCatalog);
    }

    /**
     * 获取catalog信息
     *
     * 获取catalog信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCatalogRequest 请求对象
     * @return AsyncInvoker<ShowCatalogRequest, ShowCatalogResponse>
     */
    public AsyncInvoker<ShowCatalogRequest, ShowCatalogResponse> showCatalogAsyncInvoker(ShowCatalogRequest request) {
        return new AsyncInvoker<ShowCatalogRequest, ShowCatalogResponse>(request, LakeFormationMeta.showCatalog,
            hcClient);
    }

    /**
     * 修改catalog信息
     *
     * 修改catalog信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCatalogRequest 请求对象
     * @return CompletableFuture<UpdateCatalogResponse>
     */
    public CompletableFuture<UpdateCatalogResponse> updateCatalogAsync(UpdateCatalogRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.updateCatalog);
    }

    /**
     * 修改catalog信息
     *
     * 修改catalog信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCatalogRequest 请求对象
     * @return AsyncInvoker<UpdateCatalogRequest, UpdateCatalogResponse>
     */
    public AsyncInvoker<UpdateCatalogRequest, UpdateCatalogResponse> updateCatalogAsyncInvoker(
        UpdateCatalogRequest request) {
        return new AsyncInvoker<UpdateCatalogRequest, UpdateCatalogResponse>(request, LakeFormationMeta.updateCatalog,
            hcClient);
    }

    /**
     * 获取所有用户可见的租户面配置
     *
     * 获取所有用户可见的租户面配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigsRequest 请求对象
     * @return CompletableFuture<ListConfigsResponse>
     */
    public CompletableFuture<ListConfigsResponse> listConfigsAsync(ListConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listConfigs);
    }

    /**
     * 获取所有用户可见的租户面配置
     *
     * 获取所有用户可见的租户面配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigsRequest 请求对象
     * @return AsyncInvoker<ListConfigsRequest, ListConfigsResponse>
     */
    public AsyncInvoker<ListConfigsRequest, ListConfigsResponse> listConfigsAsyncInvoker(ListConfigsRequest request) {
        return new AsyncInvoker<ListConfigsRequest, ListConfigsResponse>(request, LakeFormationMeta.listConfigs,
            hcClient);
    }

    /**
     * 获取临时密钥和securityToken
     *
     * 获取临时密钥和securityToken，失效时间大于等于1小时，请在1小时内更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCredentialRequest 请求对象
     * @return CompletableFuture<ShowCredentialResponse>
     */
    public CompletableFuture<ShowCredentialResponse> showCredentialAsync(ShowCredentialRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showCredential);
    }

    /**
     * 获取临时密钥和securityToken
     *
     * 获取临时密钥和securityToken，失效时间大于等于1小时，请在1小时内更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCredentialRequest 请求对象
     * @return AsyncInvoker<ShowCredentialRequest, ShowCredentialResponse>
     */
    public AsyncInvoker<ShowCredentialRequest, ShowCredentialResponse> showCredentialAsyncInvoker(
        ShowCredentialRequest request) {
        return new AsyncInvoker<ShowCredentialRequest, ShowCredentialResponse>(request,
            LakeFormationMeta.showCredential, hcClient);
    }

    /**
     * 创建数据库
     *
     * 创建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseRequest 请求对象
     * @return CompletableFuture<CreateDatabaseResponse>
     */
    public CompletableFuture<CreateDatabaseResponse> createDatabaseAsync(CreateDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.createDatabase);
    }

    /**
     * 创建数据库
     *
     * 创建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>
     */
    public AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseAsyncInvoker(
        CreateDatabaseRequest request) {
        return new AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>(request,
            LakeFormationMeta.createDatabase, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除指定数据库，catalog的默认数据库不允许删除。
     * cascade: 指定为true时，删除数据库下的表；指定为false时，只能删除空的数据库
     * delete_data: 指定为true时，级联删除会将表的数据放入回收站；指定为false时，不删除表数据
     * 删除数据库后不支持恢复数据库下的事务表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return CompletableFuture<DeleteDatabaseResponse>
     */
    public CompletableFuture<DeleteDatabaseResponse> deleteDatabaseAsync(DeleteDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deleteDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除指定数据库，catalog的默认数据库不允许删除。
     * cascade: 指定为true时，删除数据库下的表；指定为false时，只能删除空的数据库
     * delete_data: 指定为true时，级联删除会将表的数据放入回收站；指定为false时，不删除表数据
     * 删除数据库后不支持恢复数据库下的事务表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>
     */
    public AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseAsyncInvoker(
        DeleteDatabaseRequest request) {
        return new AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>(request,
            LakeFormationMeta.deleteDatabase, hcClient);
    }

    /**
     * 列举数据库名称信息
     *
     * 列举数据库名称信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseNamesRequest 请求对象
     * @return CompletableFuture<ListDatabaseNamesResponse>
     */
    public CompletableFuture<ListDatabaseNamesResponse> listDatabaseNamesAsync(ListDatabaseNamesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listDatabaseNames);
    }

    /**
     * 列举数据库名称信息
     *
     * 列举数据库名称信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseNamesRequest 请求对象
     * @return AsyncInvoker<ListDatabaseNamesRequest, ListDatabaseNamesResponse>
     */
    public AsyncInvoker<ListDatabaseNamesRequest, ListDatabaseNamesResponse> listDatabaseNamesAsyncInvoker(
        ListDatabaseNamesRequest request) {
        return new AsyncInvoker<ListDatabaseNamesRequest, ListDatabaseNamesResponse>(request,
            LakeFormationMeta.listDatabaseNames, hcClient);
    }

    /**
     * 列举数据库信息
     *
     * 列举数据库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabasesRequest 请求对象
     * @return CompletableFuture<ListDatabasesResponse>
     */
    public CompletableFuture<ListDatabasesResponse> listDatabasesAsync(ListDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listDatabases);
    }

    /**
     * 列举数据库信息
     *
     * 列举数据库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabasesRequest 请求对象
     * @return AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesAsyncInvoker(
        ListDatabasesRequest request) {
        return new AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse>(request, LakeFormationMeta.listDatabases,
            hcClient);
    }

    /**
     * 获取数据库
     *
     * 获取数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatabaseRequest 请求对象
     * @return CompletableFuture<ShowDatabaseResponse>
     */
    public CompletableFuture<ShowDatabaseResponse> showDatabaseAsync(ShowDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showDatabase);
    }

    /**
     * 获取数据库
     *
     * 获取数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatabaseRequest 请求对象
     * @return AsyncInvoker<ShowDatabaseRequest, ShowDatabaseResponse>
     */
    public AsyncInvoker<ShowDatabaseRequest, ShowDatabaseResponse> showDatabaseAsyncInvoker(
        ShowDatabaseRequest request) {
        return new AsyncInvoker<ShowDatabaseRequest, ShowDatabaseResponse>(request, LakeFormationMeta.showDatabase,
            hcClient);
    }

    /**
     * 修改数据库属性
     *
     * 修改数据库属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDatabaseRequest 请求对象
     * @return CompletableFuture<UpdateDatabaseResponse>
     */
    public CompletableFuture<UpdateDatabaseResponse> updateDatabaseAsync(UpdateDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.updateDatabase);
    }

    /**
     * 修改数据库属性
     *
     * 修改数据库属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDatabaseRequest 请求对象
     * @return AsyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse>
     */
    public AsyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse> updateDatabaseAsyncInvoker(
        UpdateDatabaseRequest request) {
        return new AsyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse>(request,
            LakeFormationMeta.updateDatabase, hcClient);
    }

    /**
     * 创建函数
     *
     * 创建函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFunctionRequest 请求对象
     * @return CompletableFuture<CreateFunctionResponse>
     */
    public CompletableFuture<CreateFunctionResponse> createFunctionAsync(CreateFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.createFunction);
    }

    /**
     * 创建函数
     *
     * 创建函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFunctionRequest 请求对象
     * @return AsyncInvoker<CreateFunctionRequest, CreateFunctionResponse>
     */
    public AsyncInvoker<CreateFunctionRequest, CreateFunctionResponse> createFunctionAsyncInvoker(
        CreateFunctionRequest request) {
        return new AsyncInvoker<CreateFunctionRequest, CreateFunctionResponse>(request,
            LakeFormationMeta.createFunction, hcClient);
    }

    /**
     * 删除函数
     *
     * 删除函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFunctionRequest 请求对象
     * @return CompletableFuture<DeleteFunctionResponse>
     */
    public CompletableFuture<DeleteFunctionResponse> deleteFunctionAsync(DeleteFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deleteFunction);
    }

    /**
     * 删除函数
     *
     * 删除函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFunctionRequest 请求对象
     * @return AsyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse>
     */
    public AsyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse> deleteFunctionAsyncInvoker(
        DeleteFunctionRequest request) {
        return new AsyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse>(request,
            LakeFormationMeta.deleteFunction, hcClient);
    }

    /**
     * 列举catalog下所有的函数
     *
     * 获取catalog下所有的函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllFunctionsRequest 请求对象
     * @return CompletableFuture<ListAllFunctionsResponse>
     */
    public CompletableFuture<ListAllFunctionsResponse> listAllFunctionsAsync(ListAllFunctionsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listAllFunctions);
    }

    /**
     * 列举catalog下所有的函数
     *
     * 获取catalog下所有的函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllFunctionsRequest 请求对象
     * @return AsyncInvoker<ListAllFunctionsRequest, ListAllFunctionsResponse>
     */
    public AsyncInvoker<ListAllFunctionsRequest, ListAllFunctionsResponse> listAllFunctionsAsyncInvoker(
        ListAllFunctionsRequest request) {
        return new AsyncInvoker<ListAllFunctionsRequest, ListAllFunctionsResponse>(request,
            LakeFormationMeta.listAllFunctions, hcClient);
    }

    /**
     * 列举库下所有函数名称
     *
     * 查询数据库下的所有函数名称列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionNamesRequest 请求对象
     * @return CompletableFuture<ListFunctionNamesResponse>
     */
    public CompletableFuture<ListFunctionNamesResponse> listFunctionNamesAsync(ListFunctionNamesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listFunctionNames);
    }

    /**
     * 列举库下所有函数名称
     *
     * 查询数据库下的所有函数名称列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionNamesRequest 请求对象
     * @return AsyncInvoker<ListFunctionNamesRequest, ListFunctionNamesResponse>
     */
    public AsyncInvoker<ListFunctionNamesRequest, ListFunctionNamesResponse> listFunctionNamesAsyncInvoker(
        ListFunctionNamesRequest request) {
        return new AsyncInvoker<ListFunctionNamesRequest, ListFunctionNamesResponse>(request,
            LakeFormationMeta.listFunctionNames, hcClient);
    }

    /**
     * 列举函数
     *
     * 列举函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionsRequest 请求对象
     * @return CompletableFuture<ListFunctionsResponse>
     */
    public CompletableFuture<ListFunctionsResponse> listFunctionsAsync(ListFunctionsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listFunctions);
    }

    /**
     * 列举函数
     *
     * 列举函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionsRequest 请求对象
     * @return AsyncInvoker<ListFunctionsRequest, ListFunctionsResponse>
     */
    public AsyncInvoker<ListFunctionsRequest, ListFunctionsResponse> listFunctionsAsyncInvoker(
        ListFunctionsRequest request) {
        return new AsyncInvoker<ListFunctionsRequest, ListFunctionsResponse>(request, LakeFormationMeta.listFunctions,
            hcClient);
    }

    /**
     * 查询函数
     *
     * 根据函数名称查询函数信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFunctionRequest 请求对象
     * @return CompletableFuture<ShowFunctionResponse>
     */
    public CompletableFuture<ShowFunctionResponse> showFunctionAsync(ShowFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showFunction);
    }

    /**
     * 查询函数
     *
     * 根据函数名称查询函数信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFunctionRequest 请求对象
     * @return AsyncInvoker<ShowFunctionRequest, ShowFunctionResponse>
     */
    public AsyncInvoker<ShowFunctionRequest, ShowFunctionResponse> showFunctionAsyncInvoker(
        ShowFunctionRequest request) {
        return new AsyncInvoker<ShowFunctionRequest, ShowFunctionResponse>(request, LakeFormationMeta.showFunction,
            hcClient);
    }

    /**
     * 修改函数属性
     *
     * 修改函数属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionRequest 请求对象
     * @return CompletableFuture<UpdateFunctionResponse>
     */
    public CompletableFuture<UpdateFunctionResponse> updateFunctionAsync(UpdateFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.updateFunction);
    }

    /**
     * 修改函数属性
     *
     * 修改函数属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionRequest 请求对象
     * @return AsyncInvoker<UpdateFunctionRequest, UpdateFunctionResponse>
     */
    public AsyncInvoker<UpdateFunctionRequest, UpdateFunctionResponse> updateFunctionAsyncInvoker(
        UpdateFunctionRequest request) {
        return new AsyncInvoker<UpdateFunctionRequest, UpdateFunctionResponse>(request,
            LakeFormationMeta.updateFunction, hcClient);
    }

    /**
     * 接入服务授权
     *
     * 接入服务授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AuthorizeAccessServiceRequest 请求对象
     * @return CompletableFuture<AuthorizeAccessServiceResponse>
     */
    public CompletableFuture<AuthorizeAccessServiceResponse> authorizeAccessServiceAsync(
        AuthorizeAccessServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.authorizeAccessService);
    }

    /**
     * 接入服务授权
     *
     * 接入服务授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AuthorizeAccessServiceRequest 请求对象
     * @return AsyncInvoker<AuthorizeAccessServiceRequest, AuthorizeAccessServiceResponse>
     */
    public AsyncInvoker<AuthorizeAccessServiceRequest, AuthorizeAccessServiceResponse> authorizeAccessServiceAsyncInvoker(
        AuthorizeAccessServiceRequest request) {
        return new AsyncInvoker<AuthorizeAccessServiceRequest, AuthorizeAccessServiceResponse>(request,
            LakeFormationMeta.authorizeAccessService, hcClient);
    }

    /**
     * 注册租户协议
     *
     * 用户授权并委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgreementRequest 请求对象
     * @return CompletableFuture<CreateAgreementResponse>
     */
    public CompletableFuture<CreateAgreementResponse> createAgreementAsync(CreateAgreementRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.createAgreement);
    }

    /**
     * 注册租户协议
     *
     * 用户授权并委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgreementRequest 请求对象
     * @return AsyncInvoker<CreateAgreementRequest, CreateAgreementResponse>
     */
    public AsyncInvoker<CreateAgreementRequest, CreateAgreementResponse> createAgreementAsyncInvoker(
        CreateAgreementRequest request) {
        return new AsyncInvoker<CreateAgreementRequest, CreateAgreementResponse>(request,
            LakeFormationMeta.createAgreement, hcClient);
    }

    /**
     * 删除租户协议
     *
     * 用户取消授权，同时有权限用户删除委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAgreementRequest 请求对象
     * @return CompletableFuture<DeleteAgreementResponse>
     */
    public CompletableFuture<DeleteAgreementResponse> deleteAgreementAsync(DeleteAgreementRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deleteAgreement);
    }

    /**
     * 删除租户协议
     *
     * 用户取消授权，同时有权限用户删除委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAgreementRequest 请求对象
     * @return AsyncInvoker<DeleteAgreementRequest, DeleteAgreementResponse>
     */
    public AsyncInvoker<DeleteAgreementRequest, DeleteAgreementResponse> deleteAgreementAsyncInvoker(
        DeleteAgreementRequest request) {
        return new AsyncInvoker<DeleteAgreementRequest, DeleteAgreementResponse>(request,
            LakeFormationMeta.deleteAgreement, hcClient);
    }

    /**
     * 查询租户当前的接入服务授权
     *
     * 查询租户当前的接入服务授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAccessServiceRequest 请求对象
     * @return CompletableFuture<ShowAccessServiceResponse>
     */
    public CompletableFuture<ShowAccessServiceResponse> showAccessServiceAsync(ShowAccessServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showAccessService);
    }

    /**
     * 查询租户当前的接入服务授权
     *
     * 查询租户当前的接入服务授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAccessServiceRequest 请求对象
     * @return AsyncInvoker<ShowAccessServiceRequest, ShowAccessServiceResponse>
     */
    public AsyncInvoker<ShowAccessServiceRequest, ShowAccessServiceResponse> showAccessServiceAsyncInvoker(
        ShowAccessServiceRequest request) {
        return new AsyncInvoker<ShowAccessServiceRequest, ShowAccessServiceResponse>(request,
            LakeFormationMeta.showAccessService, hcClient);
    }

    /**
     * 查询租户是否注册协议
     *
     * 查询租户当前协议和委托信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgreementRequest 请求对象
     * @return CompletableFuture<ShowAgreementResponse>
     */
    public CompletableFuture<ShowAgreementResponse> showAgreementAsync(ShowAgreementRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showAgreement);
    }

    /**
     * 查询租户是否注册协议
     *
     * 查询租户当前协议和委托信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgreementRequest 请求对象
     * @return AsyncInvoker<ShowAgreementRequest, ShowAgreementResponse>
     */
    public AsyncInvoker<ShowAgreementRequest, ShowAgreementResponse> showAgreementAsyncInvoker(
        ShowAgreementRequest request) {
        return new AsyncInvoker<ShowAgreementRequest, ShowAgreementResponse>(request, LakeFormationMeta.showAgreement,
            hcClient);
    }

    /**
     * 查询当前系统协议
     *
     * 查询当前系统协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgreementRuleRequest 请求对象
     * @return CompletableFuture<ShowAgreementRuleResponse>
     */
    public CompletableFuture<ShowAgreementRuleResponse> showAgreementRuleAsync(ShowAgreementRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showAgreementRule);
    }

    /**
     * 查询当前系统协议
     *
     * 查询当前系统协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgreementRuleRequest 请求对象
     * @return AsyncInvoker<ShowAgreementRuleRequest, ShowAgreementRuleResponse>
     */
    public AsyncInvoker<ShowAgreementRuleRequest, ShowAgreementRuleResponse> showAgreementRuleAsyncInvoker(
        ShowAgreementRuleRequest request) {
        return new AsyncInvoker<ShowAgreementRuleRequest, ShowAgreementRuleResponse>(request,
            LakeFormationMeta.showAgreementRule, hcClient);
    }

    /**
     * 元数据数量统计
     *
     * 元数据数量统计接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountMetaObjRequest 请求对象
     * @return CompletableFuture<CountMetaObjResponse>
     */
    public CompletableFuture<CountMetaObjResponse> countMetaObjAsync(CountMetaObjRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.countMetaObj);
    }

    /**
     * 元数据数量统计
     *
     * 元数据数量统计接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountMetaObjRequest 请求对象
     * @return AsyncInvoker<CountMetaObjRequest, CountMetaObjResponse>
     */
    public AsyncInvoker<CountMetaObjRequest, CountMetaObjResponse> countMetaObjAsyncInvoker(
        CountMetaObjRequest request) {
        return new AsyncInvoker<CountMetaObjRequest, CountMetaObjResponse>(request, LakeFormationMeta.countMetaObj,
            hcClient);
    }

    /**
     * 创建实例
     *
     * 创建一个LakeFormation实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLakeFormationInstanceRequest 请求对象
     * @return CompletableFuture<CreateLakeFormationInstanceResponse>
     */
    public CompletableFuture<CreateLakeFormationInstanceResponse> createLakeFormationInstanceAsync(
        CreateLakeFormationInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.createLakeFormationInstance);
    }

    /**
     * 创建实例
     *
     * 创建一个LakeFormation实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLakeFormationInstanceRequest 请求对象
     * @return AsyncInvoker<CreateLakeFormationInstanceRequest, CreateLakeFormationInstanceResponse>
     */
    public AsyncInvoker<CreateLakeFormationInstanceRequest, CreateLakeFormationInstanceResponse> createLakeFormationInstanceAsyncInvoker(
        CreateLakeFormationInstanceRequest request) {
        return new AsyncInvoker<CreateLakeFormationInstanceRequest, CreateLakeFormationInstanceResponse>(request,
            LakeFormationMeta.createLakeFormationInstance, hcClient);
    }

    /**
     * 删除实例
     *
     * 根据实例Id删除LakeFormation实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLakeFormationInstanceRequest 请求对象
     * @return CompletableFuture<DeleteLakeFormationInstanceResponse>
     */
    public CompletableFuture<DeleteLakeFormationInstanceResponse> deleteLakeFormationInstanceAsync(
        DeleteLakeFormationInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deleteLakeFormationInstance);
    }

    /**
     * 删除实例
     *
     * 根据实例Id删除LakeFormation实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLakeFormationInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteLakeFormationInstanceRequest, DeleteLakeFormationInstanceResponse>
     */
    public AsyncInvoker<DeleteLakeFormationInstanceRequest, DeleteLakeFormationInstanceResponse> deleteLakeFormationInstanceAsyncInvoker(
        DeleteLakeFormationInstanceRequest request) {
        return new AsyncInvoker<DeleteLakeFormationInstanceRequest, DeleteLakeFormationInstanceResponse>(request,
            LakeFormationMeta.deleteLakeFormationInstance, hcClient);
    }

    /**
     * 查询实例列表
     *
     * 查询用户创建的实例列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLakeFormationInstancesRequest 请求对象
     * @return CompletableFuture<ListLakeFormationInstancesResponse>
     */
    public CompletableFuture<ListLakeFormationInstancesResponse> listLakeFormationInstancesAsync(
        ListLakeFormationInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listLakeFormationInstances);
    }

    /**
     * 查询实例列表
     *
     * 查询用户创建的实例列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLakeFormationInstancesRequest 请求对象
     * @return AsyncInvoker<ListLakeFormationInstancesRequest, ListLakeFormationInstancesResponse>
     */
    public AsyncInvoker<ListLakeFormationInstancesRequest, ListLakeFormationInstancesResponse> listLakeFormationInstancesAsyncInvoker(
        ListLakeFormationInstancesRequest request) {
        return new AsyncInvoker<ListLakeFormationInstancesRequest, ListLakeFormationInstancesResponse>(request,
            LakeFormationMeta.listLakeFormationInstances, hcClient);
    }

    /**
     * 恢复实例
     *
     * 从回收站恢复LakeFormation实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MoveLakeFormationInstanceOutRecycleBinRequest 请求对象
     * @return CompletableFuture<MoveLakeFormationInstanceOutRecycleBinResponse>
     */
    public CompletableFuture<MoveLakeFormationInstanceOutRecycleBinResponse> moveLakeFormationInstanceOutRecycleBinAsync(
        MoveLakeFormationInstanceOutRecycleBinRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.moveLakeFormationInstanceOutRecycleBin);
    }

    /**
     * 恢复实例
     *
     * 从回收站恢复LakeFormation实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MoveLakeFormationInstanceOutRecycleBinRequest 请求对象
     * @return AsyncInvoker<MoveLakeFormationInstanceOutRecycleBinRequest, MoveLakeFormationInstanceOutRecycleBinResponse>
     */
    public AsyncInvoker<MoveLakeFormationInstanceOutRecycleBinRequest, MoveLakeFormationInstanceOutRecycleBinResponse> moveLakeFormationInstanceOutRecycleBinAsyncInvoker(
        MoveLakeFormationInstanceOutRecycleBinRequest request) {
        return new AsyncInvoker<MoveLakeFormationInstanceOutRecycleBinRequest, MoveLakeFormationInstanceOutRecycleBinResponse>(
            request, LakeFormationMeta.moveLakeFormationInstanceOutRecycleBin, hcClient);
    }

    /**
     * 查询实例详情
     *
     * 使用实例Id查询LakeFormation实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLakeFormationInstanceRequest 请求对象
     * @return CompletableFuture<ShowLakeFormationInstanceResponse>
     */
    public CompletableFuture<ShowLakeFormationInstanceResponse> showLakeFormationInstanceAsync(
        ShowLakeFormationInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showLakeFormationInstance);
    }

    /**
     * 查询实例详情
     *
     * 使用实例Id查询LakeFormation实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLakeFormationInstanceRequest 请求对象
     * @return AsyncInvoker<ShowLakeFormationInstanceRequest, ShowLakeFormationInstanceResponse>
     */
    public AsyncInvoker<ShowLakeFormationInstanceRequest, ShowLakeFormationInstanceResponse> showLakeFormationInstanceAsyncInvoker(
        ShowLakeFormationInstanceRequest request) {
        return new AsyncInvoker<ShowLakeFormationInstanceRequest, ShowLakeFormationInstanceResponse>(request,
            LakeFormationMeta.showLakeFormationInstance, hcClient);
    }

    /**
     * 更新实例
     *
     * 修改LakeFormation实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLakeFormationInstanceRequest 请求对象
     * @return CompletableFuture<UpdateLakeFormationInstanceResponse>
     */
    public CompletableFuture<UpdateLakeFormationInstanceResponse> updateLakeFormationInstanceAsync(
        UpdateLakeFormationInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.updateLakeFormationInstance);
    }

    /**
     * 更新实例
     *
     * 修改LakeFormation实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLakeFormationInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateLakeFormationInstanceRequest, UpdateLakeFormationInstanceResponse>
     */
    public AsyncInvoker<UpdateLakeFormationInstanceRequest, UpdateLakeFormationInstanceResponse> updateLakeFormationInstanceAsyncInvoker(
        UpdateLakeFormationInstanceRequest request) {
        return new AsyncInvoker<UpdateLakeFormationInstanceRequest, UpdateLakeFormationInstanceResponse>(request,
            LakeFormationMeta.updateLakeFormationInstance, hcClient);
    }

    /**
     * 设为默认实例
     *
     * 设为默认实例，只有非默认实例可以设置为默认实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLakeFormationInstanceDefaultRequest 请求对象
     * @return CompletableFuture<UpdateLakeFormationInstanceDefaultResponse>
     */
    public CompletableFuture<UpdateLakeFormationInstanceDefaultResponse> updateLakeFormationInstanceDefaultAsync(
        UpdateLakeFormationInstanceDefaultRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.updateLakeFormationInstanceDefault);
    }

    /**
     * 设为默认实例
     *
     * 设为默认实例，只有非默认实例可以设置为默认实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLakeFormationInstanceDefaultRequest 请求对象
     * @return AsyncInvoker<UpdateLakeFormationInstanceDefaultRequest, UpdateLakeFormationInstanceDefaultResponse>
     */
    public AsyncInvoker<UpdateLakeFormationInstanceDefaultRequest, UpdateLakeFormationInstanceDefaultResponse> updateLakeFormationInstanceDefaultAsyncInvoker(
        UpdateLakeFormationInstanceDefaultRequest request) {
        return new AsyncInvoker<UpdateLakeFormationInstanceDefaultRequest, UpdateLakeFormationInstanceDefaultResponse>(
            request, LakeFormationMeta.updateLakeFormationInstanceDefault, hcClient);
    }

    /**
     * 变更实例规格
     *
     * 变更LakeFormation实例规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLakeFormationInstanceScaleRequest 请求对象
     * @return CompletableFuture<UpdateLakeFormationInstanceScaleResponse>
     */
    public CompletableFuture<UpdateLakeFormationInstanceScaleResponse> updateLakeFormationInstanceScaleAsync(
        UpdateLakeFormationInstanceScaleRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.updateLakeFormationInstanceScale);
    }

    /**
     * 变更实例规格
     *
     * 变更LakeFormation实例规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLakeFormationInstanceScaleRequest 请求对象
     * @return AsyncInvoker<UpdateLakeFormationInstanceScaleRequest, UpdateLakeFormationInstanceScaleResponse>
     */
    public AsyncInvoker<UpdateLakeFormationInstanceScaleRequest, UpdateLakeFormationInstanceScaleResponse> updateLakeFormationInstanceScaleAsyncInvoker(
        UpdateLakeFormationInstanceScaleRequest request) {
        return new AsyncInvoker<UpdateLakeFormationInstanceScaleRequest, UpdateLakeFormationInstanceScaleResponse>(
            request, LakeFormationMeta.updateLakeFormationInstanceScale, hcClient);
    }

    /**
     * 查询OBS桶列表
     *
     * 查询OBS桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsBucketsRequest 请求对象
     * @return CompletableFuture<ListObsBucketsResponse>
     */
    public CompletableFuture<ListObsBucketsResponse> listObsBucketsAsync(ListObsBucketsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listObsBuckets);
    }

    /**
     * 查询OBS桶列表
     *
     * 查询OBS桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsBucketsRequest 请求对象
     * @return AsyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse>
     */
    public AsyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse> listObsBucketsAsyncInvoker(
        ListObsBucketsRequest request) {
        return new AsyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse>(request,
            LakeFormationMeta.listObsBuckets, hcClient);
    }

    /**
     * 查询obs桶对象列表
     *
     * 查询obs桶对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsObjectRequest 请求对象
     * @return CompletableFuture<ListObsObjectResponse>
     */
    public CompletableFuture<ListObsObjectResponse> listObsObjectAsync(ListObsObjectRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listObsObject);
    }

    /**
     * 查询obs桶对象列表
     *
     * 查询obs桶对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsObjectRequest 请求对象
     * @return AsyncInvoker<ListObsObjectRequest, ListObsObjectResponse>
     */
    public AsyncInvoker<ListObsObjectRequest, ListObsObjectResponse> listObsObjectAsyncInvoker(
        ListObsObjectRequest request) {
        return new AsyncInvoker<ListObsObjectRequest, ListObsObjectResponse>(request, LakeFormationMeta.listObsObject,
            hcClient);
    }

    /**
     * 批量添加分区信息
     *
     * 批量添加分区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddPartitionsRequest 请求对象
     * @return CompletableFuture<AddPartitionsResponse>
     */
    public CompletableFuture<AddPartitionsResponse> addPartitionsAsync(AddPartitionsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.addPartitions);
    }

    /**
     * 批量添加分区信息
     *
     * 批量添加分区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddPartitionsRequest 请求对象
     * @return AsyncInvoker<AddPartitionsRequest, AddPartitionsResponse>
     */
    public AsyncInvoker<AddPartitionsRequest, AddPartitionsResponse> addPartitionsAsyncInvoker(
        AddPartitionsRequest request) {
        return new AsyncInvoker<AddPartitionsRequest, AddPartitionsResponse>(request, LakeFormationMeta.addPartitions,
            hcClient);
    }

    /**
     * 批量删除分区信息
     *
     * 非事务表：如果设置删除数据，立刻删除分区数据路径下的数据。
     * 事务表：如果设置删除数据，保留数据在原路径下但对外不可见，待数据超期后统一删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePartitionRequest 请求对象
     * @return CompletableFuture<BatchDeletePartitionResponse>
     */
    public CompletableFuture<BatchDeletePartitionResponse> batchDeletePartitionAsync(
        BatchDeletePartitionRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.batchDeletePartition);
    }

    /**
     * 批量删除分区信息
     *
     * 非事务表：如果设置删除数据，立刻删除分区数据路径下的数据。
     * 事务表：如果设置删除数据，保留数据在原路径下但对外不可见，待数据超期后统一删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePartitionRequest 请求对象
     * @return AsyncInvoker<BatchDeletePartitionRequest, BatchDeletePartitionResponse>
     */
    public AsyncInvoker<BatchDeletePartitionRequest, BatchDeletePartitionResponse> batchDeletePartitionAsyncInvoker(
        BatchDeletePartitionRequest request) {
        return new AsyncInvoker<BatchDeletePartitionRequest, BatchDeletePartitionResponse>(request,
            LakeFormationMeta.batchDeletePartition, hcClient);
    }

    /**
     * 批量清空列表信息
     *
     * 删除存在分区的数据及统计信息，保留分区的元数据信息。全部存在、部分存在或都不存在，均返回OK
     * 非事务表：立刻删除分区路径下的数据。
     * 事务表：数据保留但不可见，待被删除数据超期后统一删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePartitionedStatisticsRequest 请求对象
     * @return CompletableFuture<BatchDeletePartitionedStatisticsResponse>
     */
    public CompletableFuture<BatchDeletePartitionedStatisticsResponse> batchDeletePartitionedStatisticsAsync(
        BatchDeletePartitionedStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.batchDeletePartitionedStatistics);
    }

    /**
     * 批量清空列表信息
     *
     * 删除存在分区的数据及统计信息，保留分区的元数据信息。全部存在、部分存在或都不存在，均返回OK
     * 非事务表：立刻删除分区路径下的数据。
     * 事务表：数据保留但不可见，待被删除数据超期后统一删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePartitionedStatisticsRequest 请求对象
     * @return AsyncInvoker<BatchDeletePartitionedStatisticsRequest, BatchDeletePartitionedStatisticsResponse>
     */
    public AsyncInvoker<BatchDeletePartitionedStatisticsRequest, BatchDeletePartitionedStatisticsResponse> batchDeletePartitionedStatisticsAsyncInvoker(
        BatchDeletePartitionedStatisticsRequest request) {
        return new AsyncInvoker<BatchDeletePartitionedStatisticsRequest, BatchDeletePartitionedStatisticsResponse>(
            request, LakeFormationMeta.batchDeletePartitionedStatistics, hcClient);
    }

    /**
     * 批量获取分区信息
     *
     * 批量获取分区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchListPartitionByValuesRequest 请求对象
     * @return CompletableFuture<BatchListPartitionByValuesResponse>
     */
    public CompletableFuture<BatchListPartitionByValuesResponse> batchListPartitionByValuesAsync(
        BatchListPartitionByValuesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.batchListPartitionByValues);
    }

    /**
     * 批量获取分区信息
     *
     * 批量获取分区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchListPartitionByValuesRequest 请求对象
     * @return AsyncInvoker<BatchListPartitionByValuesRequest, BatchListPartitionByValuesResponse>
     */
    public AsyncInvoker<BatchListPartitionByValuesRequest, BatchListPartitionByValuesResponse> batchListPartitionByValuesAsyncInvoker(
        BatchListPartitionByValuesRequest request) {
        return new AsyncInvoker<BatchListPartitionByValuesRequest, BatchListPartitionByValuesResponse>(request,
            LakeFormationMeta.batchListPartitionByValues, hcClient);
    }

    /**
     * 批量修改分区信息
     *
     * 所有partition必须要全部存在，如果存在某个partition不存在，就返回失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdatePartitionRequest 请求对象
     * @return CompletableFuture<BatchUpdatePartitionResponse>
     */
    public CompletableFuture<BatchUpdatePartitionResponse> batchUpdatePartitionAsync(
        BatchUpdatePartitionRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.batchUpdatePartition);
    }

    /**
     * 批量修改分区信息
     *
     * 所有partition必须要全部存在，如果存在某个partition不存在，就返回失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdatePartitionRequest 请求对象
     * @return AsyncInvoker<BatchUpdatePartitionRequest, BatchUpdatePartitionResponse>
     */
    public AsyncInvoker<BatchUpdatePartitionRequest, BatchUpdatePartitionResponse> batchUpdatePartitionAsyncInvoker(
        BatchUpdatePartitionRequest request) {
        return new AsyncInvoker<BatchUpdatePartitionRequest, BatchUpdatePartitionResponse>(request,
            LakeFormationMeta.batchUpdatePartition, hcClient);
    }

    /**
     * 列举分区值列表
     *
     * 遍历分区名字列表信息
     * 对于事务表，支持基于表的特定版本遍历分区名字列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionNamesRequest 请求对象
     * @return CompletableFuture<ListPartitionNamesResponse>
     */
    public CompletableFuture<ListPartitionNamesResponse> listPartitionNamesAsync(ListPartitionNamesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listPartitionNames);
    }

    /**
     * 列举分区值列表
     *
     * 遍历分区名字列表信息
     * 对于事务表，支持基于表的特定版本遍历分区名字列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionNamesRequest 请求对象
     * @return AsyncInvoker<ListPartitionNamesRequest, ListPartitionNamesResponse>
     */
    public AsyncInvoker<ListPartitionNamesRequest, ListPartitionNamesResponse> listPartitionNamesAsyncInvoker(
        ListPartitionNamesRequest request) {
        return new AsyncInvoker<ListPartitionNamesRequest, ListPartitionNamesResponse>(request,
            LakeFormationMeta.listPartitionNames, hcClient);
    }

    /**
     * 列举全量分区值列表
     *
     * 遍历分区名称列表信息,返回全量的数据。
     * 对于事务表，支持基于表的特定版本遍历分区名称列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionNamesWithoutLimitRequest 请求对象
     * @return CompletableFuture<ListPartitionNamesWithoutLimitResponse>
     */
    public CompletableFuture<ListPartitionNamesWithoutLimitResponse> listPartitionNamesWithoutLimitAsync(
        ListPartitionNamesWithoutLimitRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listPartitionNamesWithoutLimit);
    }

    /**
     * 列举全量分区值列表
     *
     * 遍历分区名称列表信息,返回全量的数据。
     * 对于事务表，支持基于表的特定版本遍历分区名称列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionNamesWithoutLimitRequest 请求对象
     * @return AsyncInvoker<ListPartitionNamesWithoutLimitRequest, ListPartitionNamesWithoutLimitResponse>
     */
    public AsyncInvoker<ListPartitionNamesWithoutLimitRequest, ListPartitionNamesWithoutLimitResponse> listPartitionNamesWithoutLimitAsyncInvoker(
        ListPartitionNamesWithoutLimitRequest request) {
        return new AsyncInvoker<ListPartitionNamesWithoutLimitRequest, ListPartitionNamesWithoutLimitResponse>(request,
            LakeFormationMeta.listPartitionNamesWithoutLimit, hcClient);
    }

    /**
     * 列举分区信息
     *
     * 遍历指定数据表下的分区列表，对于事务表，支持基于表的特定版本遍历分区列表。
     * 当过滤条件不为空时，优先根据过滤条件筛选过滤，
     * 当过滤条件为空且分区值不为空时，再根据分区值筛选过滤，
     * 当过滤条件和分区值都为空时，返回指定数据表下所有分区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionsRequest 请求对象
     * @return CompletableFuture<ListPartitionsResponse>
     */
    public CompletableFuture<ListPartitionsResponse> listPartitionsAsync(ListPartitionsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listPartitions);
    }

    /**
     * 列举分区信息
     *
     * 遍历指定数据表下的分区列表，对于事务表，支持基于表的特定版本遍历分区列表。
     * 当过滤条件不为空时，优先根据过滤条件筛选过滤，
     * 当过滤条件为空且分区值不为空时，再根据分区值筛选过滤，
     * 当过滤条件和分区值都为空时，返回指定数据表下所有分区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionsRequest 请求对象
     * @return AsyncInvoker<ListPartitionsRequest, ListPartitionsResponse>
     */
    public AsyncInvoker<ListPartitionsRequest, ListPartitionsResponse> listPartitionsAsyncInvoker(
        ListPartitionsRequest request) {
        return new AsyncInvoker<ListPartitionsRequest, ListPartitionsResponse>(request,
            LakeFormationMeta.listPartitions, hcClient);
    }

    /**
     * 批量获取分区的列统计信息
     *
     * 批量获取分区的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowPartitionColumnStatisticsRequest 请求对象
     * @return CompletableFuture<BatchShowPartitionColumnStatisticsResponse>
     */
    public CompletableFuture<BatchShowPartitionColumnStatisticsResponse> batchShowPartitionColumnStatisticsAsync(
        BatchShowPartitionColumnStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.batchShowPartitionColumnStatistics);
    }

    /**
     * 批量获取分区的列统计信息
     *
     * 批量获取分区的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowPartitionColumnStatisticsRequest 请求对象
     * @return AsyncInvoker<BatchShowPartitionColumnStatisticsRequest, BatchShowPartitionColumnStatisticsResponse>
     */
    public AsyncInvoker<BatchShowPartitionColumnStatisticsRequest, BatchShowPartitionColumnStatisticsResponse> batchShowPartitionColumnStatisticsAsyncInvoker(
        BatchShowPartitionColumnStatisticsRequest request) {
        return new AsyncInvoker<BatchShowPartitionColumnStatisticsRequest, BatchShowPartitionColumnStatisticsResponse>(
            request, LakeFormationMeta.batchShowPartitionColumnStatistics, hcClient);
    }

    /**
     * 删除分区列的统计信息
     *
     * 删除分区列的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePartitionColumnStatisticsRequest 请求对象
     * @return CompletableFuture<DeletePartitionColumnStatisticsResponse>
     */
    public CompletableFuture<DeletePartitionColumnStatisticsResponse> deletePartitionColumnStatisticsAsync(
        DeletePartitionColumnStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deletePartitionColumnStatistics);
    }

    /**
     * 删除分区列的统计信息
     *
     * 删除分区列的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePartitionColumnStatisticsRequest 请求对象
     * @return AsyncInvoker<DeletePartitionColumnStatisticsRequest, DeletePartitionColumnStatisticsResponse>
     */
    public AsyncInvoker<DeletePartitionColumnStatisticsRequest, DeletePartitionColumnStatisticsResponse> deletePartitionColumnStatisticsAsyncInvoker(
        DeletePartitionColumnStatisticsRequest request) {
        return new AsyncInvoker<DeletePartitionColumnStatisticsRequest, DeletePartitionColumnStatisticsResponse>(
            request, LakeFormationMeta.deletePartitionColumnStatistics, hcClient);
    }

    /**
     * 批量设置分区的统计信息
     *
     * 批量设置分区的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetPartitionColumnStatisticsRequest 请求对象
     * @return CompletableFuture<SetPartitionColumnStatisticsResponse>
     */
    public CompletableFuture<SetPartitionColumnStatisticsResponse> setPartitionColumnStatisticsAsync(
        SetPartitionColumnStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.setPartitionColumnStatistics);
    }

    /**
     * 批量设置分区的统计信息
     *
     * 批量设置分区的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetPartitionColumnStatisticsRequest 请求对象
     * @return AsyncInvoker<SetPartitionColumnStatisticsRequest, SetPartitionColumnStatisticsResponse>
     */
    public AsyncInvoker<SetPartitionColumnStatisticsRequest, SetPartitionColumnStatisticsResponse> setPartitionColumnStatisticsAsyncInvoker(
        SetPartitionColumnStatisticsRequest request) {
        return new AsyncInvoker<SetPartitionColumnStatisticsRequest, SetPartitionColumnStatisticsResponse>(request,
            LakeFormationMeta.setPartitionColumnStatistics, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询用户的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return CompletableFuture<ListQuotasResponse>
     */
    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listQuotas);
    }

    /**
     * 查询配额
     *
     * 查询用户的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return AsyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, LakeFormationMeta.listQuotas, hcClient);
    }

    /**
     * 将一个或者多个用户/用户组加入角色
     *
     * 将一个或者多个用户/用户组加入角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociatePrincipalsRequest 请求对象
     * @return CompletableFuture<AssociatePrincipalsResponse>
     */
    public CompletableFuture<AssociatePrincipalsResponse> associatePrincipalsAsync(AssociatePrincipalsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.associatePrincipals);
    }

    /**
     * 将一个或者多个用户/用户组加入角色
     *
     * 将一个或者多个用户/用户组加入角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociatePrincipalsRequest 请求对象
     * @return AsyncInvoker<AssociatePrincipalsRequest, AssociatePrincipalsResponse>
     */
    public AsyncInvoker<AssociatePrincipalsRequest, AssociatePrincipalsResponse> associatePrincipalsAsyncInvoker(
        AssociatePrincipalsRequest request) {
        return new AsyncInvoker<AssociatePrincipalsRequest, AssociatePrincipalsResponse>(request,
            LakeFormationMeta.associatePrincipals, hcClient);
    }

    /**
     * 创建role
     *
     * 创建role
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRoleRequest 请求对象
     * @return CompletableFuture<CreateRoleResponse>
     */
    public CompletableFuture<CreateRoleResponse> createRoleAsync(CreateRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.createRole);
    }

    /**
     * 创建role
     *
     * 创建role
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRoleRequest 请求对象
     * @return AsyncInvoker<CreateRoleRequest, CreateRoleResponse>
     */
    public AsyncInvoker<CreateRoleRequest, CreateRoleResponse> createRoleAsyncInvoker(CreateRoleRequest request) {
        return new AsyncInvoker<CreateRoleRequest, CreateRoleResponse>(request, LakeFormationMeta.createRole, hcClient);
    }

    /**
     * 删除角色
     *
     * 删除指定角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRoleRequest 请求对象
     * @return CompletableFuture<DeleteRoleResponse>
     */
    public CompletableFuture<DeleteRoleResponse> deleteRoleAsync(DeleteRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deleteRole);
    }

    /**
     * 删除角色
     *
     * 删除指定角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRoleRequest 请求对象
     * @return AsyncInvoker<DeleteRoleRequest, DeleteRoleResponse>
     */
    public AsyncInvoker<DeleteRoleRequest, DeleteRoleResponse> deleteRoleAsyncInvoker(DeleteRoleRequest request) {
        return new AsyncInvoker<DeleteRoleRequest, DeleteRoleResponse>(request, LakeFormationMeta.deleteRole, hcClient);
    }

    /**
     * 查询角色下的用户/用户组
     *
     * 查询角色下的用户/用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrincipalsRequest 请求对象
     * @return CompletableFuture<ListPrincipalsResponse>
     */
    public CompletableFuture<ListPrincipalsResponse> listPrincipalsAsync(ListPrincipalsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listPrincipals);
    }

    /**
     * 查询角色下的用户/用户组
     *
     * 查询角色下的用户/用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrincipalsRequest 请求对象
     * @return AsyncInvoker<ListPrincipalsRequest, ListPrincipalsResponse>
     */
    public AsyncInvoker<ListPrincipalsRequest, ListPrincipalsResponse> listPrincipalsAsyncInvoker(
        ListPrincipalsRequest request) {
        return new AsyncInvoker<ListPrincipalsRequest, ListPrincipalsResponse>(request,
            LakeFormationMeta.listPrincipals, hcClient);
    }

    /**
     * 列举所有角色名
     *
     * 查询所有角色名字列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRoleNamesRequest 请求对象
     * @return CompletableFuture<ListRoleNamesResponse>
     */
    public CompletableFuture<ListRoleNamesResponse> listRoleNamesAsync(ListRoleNamesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listRoleNames);
    }

    /**
     * 列举所有角色名
     *
     * 查询所有角色名字列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRoleNamesRequest 请求对象
     * @return AsyncInvoker<ListRoleNamesRequest, ListRoleNamesResponse>
     */
    public AsyncInvoker<ListRoleNamesRequest, ListRoleNamesResponse> listRoleNamesAsyncInvoker(
        ListRoleNamesRequest request) {
        return new AsyncInvoker<ListRoleNamesRequest, ListRoleNamesResponse>(request, LakeFormationMeta.listRoleNames,
            hcClient);
    }

    /**
     * 根据条件分页列举角色
     *
     * 返回所有角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRolesRequest 请求对象
     * @return CompletableFuture<ListRolesResponse>
     */
    public CompletableFuture<ListRolesResponse> listRolesAsync(ListRolesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listRoles);
    }

    /**
     * 根据条件分页列举角色
     *
     * 返回所有角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRolesRequest 请求对象
     * @return AsyncInvoker<ListRolesRequest, ListRolesResponse>
     */
    public AsyncInvoker<ListRolesRequest, ListRolesResponse> listRolesAsyncInvoker(ListRolesRequest request) {
        return new AsyncInvoker<ListRolesRequest, ListRolesResponse>(request, LakeFormationMeta.listRoles, hcClient);
    }

    /**
     * 将一个或者多个用户/用户组从角色移除
     *
     * 将一个或者多个用户/用户组从角色移除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RevokePrincipalsRequest 请求对象
     * @return CompletableFuture<RevokePrincipalsResponse>
     */
    public CompletableFuture<RevokePrincipalsResponse> revokePrincipalsAsync(RevokePrincipalsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.revokePrincipals);
    }

    /**
     * 将一个或者多个用户/用户组从角色移除
     *
     * 将一个或者多个用户/用户组从角色移除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RevokePrincipalsRequest 请求对象
     * @return AsyncInvoker<RevokePrincipalsRequest, RevokePrincipalsResponse>
     */
    public AsyncInvoker<RevokePrincipalsRequest, RevokePrincipalsResponse> revokePrincipalsAsyncInvoker(
        RevokePrincipalsRequest request) {
        return new AsyncInvoker<RevokePrincipalsRequest, RevokePrincipalsResponse>(request,
            LakeFormationMeta.revokePrincipals, hcClient);
    }

    /**
     * 获取角色
     *
     * 获取角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRoleRequest 请求对象
     * @return CompletableFuture<ShowRoleResponse>
     */
    public CompletableFuture<ShowRoleResponse> showRoleAsync(ShowRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showRole);
    }

    /**
     * 获取角色
     *
     * 获取角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRoleRequest 请求对象
     * @return AsyncInvoker<ShowRoleRequest, ShowRoleResponse>
     */
    public AsyncInvoker<ShowRoleRequest, ShowRoleResponse> showRoleAsyncInvoker(ShowRoleRequest request) {
        return new AsyncInvoker<ShowRoleRequest, ShowRoleResponse>(request, LakeFormationMeta.showRole, hcClient);
    }

    /**
     * 更新角色中的principals
     *
     * 更新角色中的principals
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrincipalsRequest 请求对象
     * @return CompletableFuture<UpdatePrincipalsResponse>
     */
    public CompletableFuture<UpdatePrincipalsResponse> updatePrincipalsAsync(UpdatePrincipalsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.updatePrincipals);
    }

    /**
     * 更新角色中的principals
     *
     * 更新角色中的principals
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrincipalsRequest 请求对象
     * @return AsyncInvoker<UpdatePrincipalsRequest, UpdatePrincipalsResponse>
     */
    public AsyncInvoker<UpdatePrincipalsRequest, UpdatePrincipalsResponse> updatePrincipalsAsyncInvoker(
        UpdatePrincipalsRequest request) {
        return new AsyncInvoker<UpdatePrincipalsRequest, UpdatePrincipalsResponse>(request,
            LakeFormationMeta.updatePrincipals, hcClient);
    }

    /**
     * 修改角色信息
     *
     * 修改角色信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRoleRequest 请求对象
     * @return CompletableFuture<UpdateRoleResponse>
     */
    public CompletableFuture<UpdateRoleResponse> updateRoleAsync(UpdateRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.updateRole);
    }

    /**
     * 修改角色信息
     *
     * 修改角色信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRoleRequest 请求对象
     * @return AsyncInvoker<UpdateRoleRequest, UpdateRoleResponse>
     */
    public AsyncInvoker<UpdateRoleRequest, UpdateRoleResponse> updateRoleAsyncInvoker(UpdateRoleRequest request) {
        return new AsyncInvoker<UpdateRoleRequest, UpdateRoleResponse>(request, LakeFormationMeta.updateRole, hcClient);
    }

    /**
     * 
     *
     * 查询规格列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSpecsRequest 请求对象
     * @return CompletableFuture<ListSpecsResponse>
     */
    public CompletableFuture<ListSpecsResponse> listSpecsAsync(ListSpecsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listSpecs);
    }

    /**
     * 
     *
     * 查询规格列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSpecsRequest 请求对象
     * @return AsyncInvoker<ListSpecsRequest, ListSpecsResponse>
     */
    public AsyncInvoker<ListSpecsRequest, ListSpecsResponse> listSpecsAsyncInvoker(ListSpecsRequest request) {
        return new AsyncInvoker<ListSpecsRequest, ListSpecsResponse>(request, LakeFormationMeta.listSpecs, hcClient);
    }

    /**
     * 创建表
     *
     * 创建表操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTableRequest 请求对象
     * @return CompletableFuture<CreateTableResponse>
     */
    public CompletableFuture<CreateTableResponse> createTableAsync(CreateTableRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.createTable);
    }

    /**
     * 创建表
     *
     * 创建表操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTableRequest 请求对象
     * @return AsyncInvoker<CreateTableRequest, CreateTableResponse>
     */
    public AsyncInvoker<CreateTableRequest, CreateTableResponse> createTableAsyncInvoker(CreateTableRequest request) {
        return new AsyncInvoker<CreateTableRequest, CreateTableResponse>(request, LakeFormationMeta.createTable,
            hcClient);
    }

    /**
     * 清空表的数据
     *
     * 清空表以及表下所有分区的数据及统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAllTablesRequest 请求对象
     * @return CompletableFuture<DeleteAllTablesResponse>
     */
    public CompletableFuture<DeleteAllTablesResponse> deleteAllTablesAsync(DeleteAllTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deleteAllTables);
    }

    /**
     * 清空表的数据
     *
     * 清空表以及表下所有分区的数据及统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAllTablesRequest 请求对象
     * @return AsyncInvoker<DeleteAllTablesRequest, DeleteAllTablesResponse>
     */
    public AsyncInvoker<DeleteAllTablesRequest, DeleteAllTablesResponse> deleteAllTablesAsyncInvoker(
        DeleteAllTablesRequest request) {
        return new AsyncInvoker<DeleteAllTablesRequest, DeleteAllTablesResponse>(request,
            LakeFormationMeta.deleteAllTables, hcClient);
    }

    /**
     * 删除表
     *
     * 删除表及表下的分区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableRequest 请求对象
     * @return CompletableFuture<DeleteTableResponse>
     */
    public CompletableFuture<DeleteTableResponse> deleteTableAsync(DeleteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deleteTable);
    }

    /**
     * 删除表
     *
     * 删除表及表下的分区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableRequest 请求对象
     * @return AsyncInvoker<DeleteTableRequest, DeleteTableResponse>
     */
    public AsyncInvoker<DeleteTableRequest, DeleteTableResponse> deleteTableAsyncInvoker(DeleteTableRequest request) {
        return new AsyncInvoker<DeleteTableRequest, DeleteTableResponse>(request, LakeFormationMeta.deleteTable,
            hcClient);
    }

    /**
     * 分页获取表的描述信息
     *
     * 通过数据库通配符和表通配符，找到符合条件的表并返回表的描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableMetaRequest 请求对象
     * @return CompletableFuture<ListTableMetaResponse>
     */
    public CompletableFuture<ListTableMetaResponse> listTableMetaAsync(ListTableMetaRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listTableMeta);
    }

    /**
     * 分页获取表的描述信息
     *
     * 通过数据库通配符和表通配符，找到符合条件的表并返回表的描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableMetaRequest 请求对象
     * @return AsyncInvoker<ListTableMetaRequest, ListTableMetaResponse>
     */
    public AsyncInvoker<ListTableMetaRequest, ListTableMetaResponse> listTableMetaAsyncInvoker(
        ListTableMetaRequest request) {
        return new AsyncInvoker<ListTableMetaRequest, ListTableMetaResponse>(request, LakeFormationMeta.listTableMeta,
            hcClient);
    }

    /**
     * 列举库下所有表名
     *
     * 查询数据库下的所有表名字列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableNamesRequest 请求对象
     * @return CompletableFuture<ListTableNamesResponse>
     */
    public CompletableFuture<ListTableNamesResponse> listTableNamesAsync(ListTableNamesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listTableNames);
    }

    /**
     * 列举库下所有表名
     *
     * 查询数据库下的所有表名字列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableNamesRequest 请求对象
     * @return AsyncInvoker<ListTableNamesRequest, ListTableNamesResponse>
     */
    public AsyncInvoker<ListTableNamesRequest, ListTableNamesResponse> listTableNamesAsyncInvoker(
        ListTableNamesRequest request) {
        return new AsyncInvoker<ListTableNamesRequest, ListTableNamesResponse>(request,
            LakeFormationMeta.listTableNames, hcClient);
    }

    /**
     * 根据条件分页列举表信息
     *
     * 返回数据库下符合查询条件的表的元数据信息，不支持事务操作
     * 当表名通配符或表类型不为空时，优先根据表名和类型筛选过滤
     * 当表名通配符或表类型为空时，再根据属性筛选过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablesRequest 请求对象
     * @return CompletableFuture<ListTablesResponse>
     */
    public CompletableFuture<ListTablesResponse> listTablesAsync(ListTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listTables);
    }

    /**
     * 根据条件分页列举表信息
     *
     * 返回数据库下符合查询条件的表的元数据信息，不支持事务操作
     * 当表名通配符或表类型不为空时，优先根据表名和类型筛选过滤
     * 当表名通配符或表类型为空时，再根据属性筛选过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablesRequest 请求对象
     * @return AsyncInvoker<ListTablesRequest, ListTablesResponse>
     */
    public AsyncInvoker<ListTablesRequest, ListTablesResponse> listTablesAsyncInvoker(ListTablesRequest request) {
        return new AsyncInvoker<ListTablesRequest, ListTablesResponse>(request, LakeFormationMeta.listTables, hcClient);
    }

    /**
     * 根据表名列举表信息
     *
     * 根据表名查询数据库下的表信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablesByNameRequest 请求对象
     * @return CompletableFuture<ListTablesByNameResponse>
     */
    public CompletableFuture<ListTablesByNameResponse> listTablesByNameAsync(ListTablesByNameRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listTablesByName);
    }

    /**
     * 根据表名列举表信息
     *
     * 根据表名查询数据库下的表信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablesByNameRequest 请求对象
     * @return AsyncInvoker<ListTablesByNameRequest, ListTablesByNameResponse>
     */
    public AsyncInvoker<ListTablesByNameRequest, ListTablesByNameResponse> listTablesByNameAsyncInvoker(
        ListTablesByNameRequest request) {
        return new AsyncInvoker<ListTablesByNameRequest, ListTablesByNameResponse>(request,
            LakeFormationMeta.listTablesByName, hcClient);
    }

    /**
     * 获取表信息
     *
     * 获取表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTableRequest 请求对象
     * @return CompletableFuture<ShowTableResponse>
     */
    public CompletableFuture<ShowTableResponse> showTableAsync(ShowTableRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showTable);
    }

    /**
     * 获取表信息
     *
     * 获取表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTableRequest 请求对象
     * @return AsyncInvoker<ShowTableRequest, ShowTableResponse>
     */
    public AsyncInvoker<ShowTableRequest, ShowTableResponse> showTableAsyncInvoker(ShowTableRequest request) {
        return new AsyncInvoker<ShowTableRequest, ShowTableResponse>(request, LakeFormationMeta.showTable, hcClient);
    }

    /**
     * 修改表信息
     *
     * 修改表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTableRequest 请求对象
     * @return CompletableFuture<UpdateTableResponse>
     */
    public CompletableFuture<UpdateTableResponse> updateTableAsync(UpdateTableRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.updateTable);
    }

    /**
     * 修改表信息
     *
     * 修改表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTableRequest 请求对象
     * @return AsyncInvoker<UpdateTableRequest, UpdateTableResponse>
     */
    public AsyncInvoker<UpdateTableRequest, UpdateTableResponse> updateTableAsyncInvoker(UpdateTableRequest request) {
        return new AsyncInvoker<UpdateTableRequest, UpdateTableResponse>(request, LakeFormationMeta.updateTable,
            hcClient);
    }

    /**
     * 删除表的指定列统计信息
     *
     * 删除表的指定列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableColumnStatisticsRequest 请求对象
     * @return CompletableFuture<DeleteTableColumnStatisticsResponse>
     */
    public CompletableFuture<DeleteTableColumnStatisticsResponse> deleteTableColumnStatisticsAsync(
        DeleteTableColumnStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deleteTableColumnStatistics);
    }

    /**
     * 删除表的指定列统计信息
     *
     * 删除表的指定列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableColumnStatisticsRequest 请求对象
     * @return AsyncInvoker<DeleteTableColumnStatisticsRequest, DeleteTableColumnStatisticsResponse>
     */
    public AsyncInvoker<DeleteTableColumnStatisticsRequest, DeleteTableColumnStatisticsResponse> deleteTableColumnStatisticsAsyncInvoker(
        DeleteTableColumnStatisticsRequest request) {
        return new AsyncInvoker<DeleteTableColumnStatisticsRequest, DeleteTableColumnStatisticsResponse>(request,
            LakeFormationMeta.deleteTableColumnStatistics, hcClient);
    }

    /**
     * 获取表的列统计信息
     *
     * 获取表的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableColumnStatisticsRequest 请求对象
     * @return CompletableFuture<ListTableColumnStatisticsResponse>
     */
    public CompletableFuture<ListTableColumnStatisticsResponse> listTableColumnStatisticsAsync(
        ListTableColumnStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listTableColumnStatistics);
    }

    /**
     * 获取表的列统计信息
     *
     * 获取表的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableColumnStatisticsRequest 请求对象
     * @return AsyncInvoker<ListTableColumnStatisticsRequest, ListTableColumnStatisticsResponse>
     */
    public AsyncInvoker<ListTableColumnStatisticsRequest, ListTableColumnStatisticsResponse> listTableColumnStatisticsAsyncInvoker(
        ListTableColumnStatisticsRequest request) {
        return new AsyncInvoker<ListTableColumnStatisticsRequest, ListTableColumnStatisticsResponse>(request,
            LakeFormationMeta.listTableColumnStatistics, hcClient);
    }

    /**
     * 更新表的列统计信息
     *
     * 更新表的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetTableColumnStatisticsRequest 请求对象
     * @return CompletableFuture<SetTableColumnStatisticsResponse>
     */
    public CompletableFuture<SetTableColumnStatisticsResponse> setTableColumnStatisticsAsync(
        SetTableColumnStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.setTableColumnStatistics);
    }

    /**
     * 更新表的列统计信息
     *
     * 更新表的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetTableColumnStatisticsRequest 请求对象
     * @return AsyncInvoker<SetTableColumnStatisticsRequest, SetTableColumnStatisticsResponse>
     */
    public AsyncInvoker<SetTableColumnStatisticsRequest, SetTableColumnStatisticsResponse> setTableColumnStatisticsAsyncInvoker(
        SetTableColumnStatisticsRequest request) {
        return new AsyncInvoker<SetTableColumnStatisticsRequest, SetTableColumnStatisticsResponse>(request,
            LakeFormationMeta.setTableColumnStatistics, hcClient);
    }

    /**
     * 批量创建列限制条件
     *
     * 批量创建表的列限制条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateConstraintRequest 请求对象
     * @return CompletableFuture<BatchCreateConstraintResponse>
     */
    public CompletableFuture<BatchCreateConstraintResponse> batchCreateConstraintAsync(
        BatchCreateConstraintRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.batchCreateConstraint);
    }

    /**
     * 批量创建列限制条件
     *
     * 批量创建表的列限制条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateConstraintRequest 请求对象
     * @return AsyncInvoker<BatchCreateConstraintRequest, BatchCreateConstraintResponse>
     */
    public AsyncInvoker<BatchCreateConstraintRequest, BatchCreateConstraintResponse> batchCreateConstraintAsyncInvoker(
        BatchCreateConstraintRequest request) {
        return new AsyncInvoker<BatchCreateConstraintRequest, BatchCreateConstraintResponse>(request,
            LakeFormationMeta.batchCreateConstraint, hcClient);
    }

    /**
     * 删除列限制条件
     *
     * 删除列限制条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConstraintRequest 请求对象
     * @return CompletableFuture<DeleteConstraintResponse>
     */
    public CompletableFuture<DeleteConstraintResponse> deleteConstraintAsync(DeleteConstraintRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deleteConstraint);
    }

    /**
     * 删除列限制条件
     *
     * 删除列限制条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConstraintRequest 请求对象
     * @return AsyncInvoker<DeleteConstraintRequest, DeleteConstraintResponse>
     */
    public AsyncInvoker<DeleteConstraintRequest, DeleteConstraintResponse> deleteConstraintAsyncInvoker(
        DeleteConstraintRequest request) {
        return new AsyncInvoker<DeleteConstraintRequest, DeleteConstraintResponse>(request,
            LakeFormationMeta.deleteConstraint, hcClient);
    }

    /**
     * 获取列限制条件
     *
     * 若查询外键信息，需要在参数中填写被引用表的数据库名和表名。如：parent_db&#x3D;db1&amp;parent_tbl&#x3D;tbl1
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConstraintsRequest 请求对象
     * @return CompletableFuture<ListConstraintsResponse>
     */
    public CompletableFuture<ListConstraintsResponse> listConstraintsAsync(ListConstraintsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listConstraints);
    }

    /**
     * 获取列限制条件
     *
     * 若查询外键信息，需要在参数中填写被引用表的数据库名和表名。如：parent_db&#x3D;db1&amp;parent_tbl&#x3D;tbl1
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConstraintsRequest 请求对象
     * @return AsyncInvoker<ListConstraintsRequest, ListConstraintsResponse>
     */
    public AsyncInvoker<ListConstraintsRequest, ListConstraintsResponse> listConstraintsAsyncInvoker(
        ListConstraintsRequest request) {
        return new AsyncInvoker<ListConstraintsRequest, ListConstraintsResponse>(request,
            LakeFormationMeta.listConstraints, hcClient);
    }

    /**
     * 批量更新标签
     *
     * 为指定实例批量更新标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateLakeFormationInstanceTagsRequest 请求对象
     * @return CompletableFuture<BatchUpdateLakeFormationInstanceTagsResponse>
     */
    public CompletableFuture<BatchUpdateLakeFormationInstanceTagsResponse> batchUpdateLakeFormationInstanceTagsAsync(
        BatchUpdateLakeFormationInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.batchUpdateLakeFormationInstanceTags);
    }

    /**
     * 批量更新标签
     *
     * 为指定实例批量更新标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateLakeFormationInstanceTagsRequest 请求对象
     * @return AsyncInvoker<BatchUpdateLakeFormationInstanceTagsRequest, BatchUpdateLakeFormationInstanceTagsResponse>
     */
    public AsyncInvoker<BatchUpdateLakeFormationInstanceTagsRequest, BatchUpdateLakeFormationInstanceTagsResponse> batchUpdateLakeFormationInstanceTagsAsyncInvoker(
        BatchUpdateLakeFormationInstanceTagsRequest request) {
        return new AsyncInvoker<BatchUpdateLakeFormationInstanceTagsRequest, BatchUpdateLakeFormationInstanceTagsResponse>(
            request, LakeFormationMeta.batchUpdateLakeFormationInstanceTags, hcClient);
    }

    /**
     * 查询资源标签集合
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLakeFormationInstanceTagsRequest 请求对象
     * @return CompletableFuture<ListLakeFormationInstanceTagsResponse>
     */
    public CompletableFuture<ListLakeFormationInstanceTagsResponse> listLakeFormationInstanceTagsAsync(
        ListLakeFormationInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listLakeFormationInstanceTags);
    }

    /**
     * 查询资源标签集合
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLakeFormationInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ListLakeFormationInstanceTagsRequest, ListLakeFormationInstanceTagsResponse>
     */
    public AsyncInvoker<ListLakeFormationInstanceTagsRequest, ListLakeFormationInstanceTagsResponse> listLakeFormationInstanceTagsAsyncInvoker(
        ListLakeFormationInstanceTagsRequest request) {
        return new AsyncInvoker<ListLakeFormationInstanceTagsRequest, ListLakeFormationInstanceTagsResponse>(request,
            LakeFormationMeta.listLakeFormationInstanceTags, hcClient);
    }

    /**
     * 将多个角色授予User
     *
     * 将多个角色授予User
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateRolesRequest 请求对象
     * @return CompletableFuture<AssociateRolesResponse>
     */
    public CompletableFuture<AssociateRolesResponse> associateRolesAsync(AssociateRolesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.associateRoles);
    }

    /**
     * 将多个角色授予User
     *
     * 将多个角色授予User
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateRolesRequest 请求对象
     * @return AsyncInvoker<AssociateRolesRequest, AssociateRolesResponse>
     */
    public AsyncInvoker<AssociateRolesRequest, AssociateRolesResponse> associateRolesAsyncInvoker(
        AssociateRolesRequest request) {
        return new AsyncInvoker<AssociateRolesRequest, AssociateRolesResponse>(request,
            LakeFormationMeta.associateRoles, hcClient);
    }

    /**
     * 查询用户的角色列表
     *
     * 查询用户的角色列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserRolesRequest 请求对象
     * @return CompletableFuture<ListUserRolesResponse>
     */
    public CompletableFuture<ListUserRolesResponse> listUserRolesAsync(ListUserRolesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listUserRoles);
    }

    /**
     * 查询用户的角色列表
     *
     * 查询用户的角色列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserRolesRequest 请求对象
     * @return AsyncInvoker<ListUserRolesRequest, ListUserRolesResponse>
     */
    public AsyncInvoker<ListUserRolesRequest, ListUserRolesResponse> listUserRolesAsyncInvoker(
        ListUserRolesRequest request) {
        return new AsyncInvoker<ListUserRolesRequest, ListUserRolesResponse>(request, LakeFormationMeta.listUserRoles,
            hcClient);
    }

    /**
     * 获取用户列表
     *
     * 获取用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersRequest 请求对象
     * @return CompletableFuture<ListUsersResponse>
     */
    public CompletableFuture<ListUsersResponse> listUsersAsync(ListUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listUsers);
    }

    /**
     * 获取用户列表
     *
     * 获取用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersRequest 请求对象
     * @return AsyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public AsyncInvoker<ListUsersRequest, ListUsersResponse> listUsersAsyncInvoker(ListUsersRequest request) {
        return new AsyncInvoker<ListUsersRequest, ListUsersResponse>(request, LakeFormationMeta.listUsers, hcClient);
    }

    /**
     * 将一个或者多个角色从用户移除
     *
     * 将一个或者多个角色从用户移除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RevokeRolesRequest 请求对象
     * @return CompletableFuture<RevokeRolesResponse>
     */
    public CompletableFuture<RevokeRolesResponse> revokeRolesAsync(RevokeRolesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.revokeRoles);
    }

    /**
     * 将一个或者多个角色从用户移除
     *
     * 将一个或者多个角色从用户移除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RevokeRolesRequest 请求对象
     * @return AsyncInvoker<RevokeRolesRequest, RevokeRolesResponse>
     */
    public AsyncInvoker<RevokeRolesRequest, RevokeRolesResponse> revokeRolesAsyncInvoker(RevokeRolesRequest request) {
        return new AsyncInvoker<RevokeRolesRequest, RevokeRolesResponse>(request, LakeFormationMeta.revokeRoles,
            hcClient);
    }

    /**
     * 更新用户中的角色
     *
     * 更新用户中的角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRolesRequest 请求对象
     * @return CompletableFuture<UpdateRolesResponse>
     */
    public CompletableFuture<UpdateRolesResponse> updateRolesAsync(UpdateRolesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.updateRoles);
    }

    /**
     * 更新用户中的角色
     *
     * 更新用户中的角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRolesRequest 请求对象
     * @return AsyncInvoker<UpdateRolesRequest, UpdateRolesResponse>
     */
    public AsyncInvoker<UpdateRolesRequest, UpdateRolesResponse> updateRolesAsyncInvoker(UpdateRolesRequest request) {
        return new AsyncInvoker<UpdateRolesRequest, UpdateRolesResponse>(request, LakeFormationMeta.updateRoles,
            hcClient);
    }

    /**
     * 获取租户的用户组
     *
     * 获取租户的用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGroupsForDomainRequest 请求对象
     * @return CompletableFuture<ListGroupsForDomainResponse>
     */
    public CompletableFuture<ListGroupsForDomainResponse> listGroupsForDomainAsync(ListGroupsForDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listGroupsForDomain);
    }

    /**
     * 获取租户的用户组
     *
     * 获取租户的用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGroupsForDomainRequest 请求对象
     * @return AsyncInvoker<ListGroupsForDomainRequest, ListGroupsForDomainResponse>
     */
    public AsyncInvoker<ListGroupsForDomainRequest, ListGroupsForDomainResponse> listGroupsForDomainAsyncInvoker(
        ListGroupsForDomainRequest request) {
        return new AsyncInvoker<ListGroupsForDomainRequest, ListGroupsForDomainResponse>(request,
            LakeFormationMeta.listGroupsForDomain, hcClient);
    }

}
