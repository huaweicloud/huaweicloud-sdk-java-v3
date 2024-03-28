package com.huaweicloud.sdk.cc.v3;

import com.huaweicloud.sdk.cc.v3.model.ApplyCentralNetworkPolicyRequest;
import com.huaweicloud.sdk.cc.v3.model.ApplyCentralNetworkPolicyResponse;
import com.huaweicloud.sdk.cc.v3.model.AssociateBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.AssociateBandwidthPackageResponse;
import com.huaweicloud.sdk.cc.v3.model.AssociateGlobalConnectionBandwidthInstanceRequest;
import com.huaweicloud.sdk.cc.v3.model.AssociateGlobalConnectionBandwidthInstanceResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateAuthorisationRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateAuthorisationResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateBandwidthPackageResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateCentralNetworkErRouteTableAttachmentRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateCentralNetworkErRouteTableAttachmentResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateCentralNetworkGdgwAttachmentRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateCentralNetworkGdgwAttachmentResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateCentralNetworkPolicyRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateCentralNetworkPolicyResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateCentralNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateCentralNetworkResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateCloudConnectionRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateCloudConnectionResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateGlobalConnectionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateGlobalConnectionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateInterRegionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateInterRegionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateNetworkInstanceRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateNetworkInstanceResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteAuthorisationRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteAuthorisationResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteBandwidthPackageResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteCentralNetworkAttachmentRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteCentralNetworkAttachmentResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteCentralNetworkPolicyRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteCentralNetworkPolicyResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteCentralNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteCentralNetworkResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteCloudConnectionRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteCloudConnectionResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteGlobalConnectionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteGlobalConnectionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteInterRegionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteInterRegionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteNetworkInstanceRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteNetworkInstanceResponse;
import com.huaweicloud.sdk.cc.v3.model.DisassociateBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.DisassociateBandwidthPackageResponse;
import com.huaweicloud.sdk.cc.v3.model.DisassociateGlobalConnectionBandwidthInstanceRequest;
import com.huaweicloud.sdk.cc.v3.model.DisassociateGlobalConnectionBandwidthInstanceResponse;
import com.huaweicloud.sdk.cc.v3.model.ListAuthorisationsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListAuthorisationsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackageTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackageTagsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackagesByTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackagesByTagsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackagesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackagesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkAttachmentsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkAttachmentsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkCapabilitiesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkCapabilitiesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkConnectionsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkConnectionsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkErRouteTableAttachmentsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkErRouteTableAttachmentsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkGdgwAttachmentsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkGdgwAttachmentsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkPoliciesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkPoliciesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkPolicyChangeSetRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkPolicyChangeSetResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkQuotasRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkQuotasResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworkTagsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworksByTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworksByTagsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworksRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCentralNetworksResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionQuotasRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionQuotasResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionRoutesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionRoutesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionTagsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionsByTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionsByTagsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListGlobalConnectionBandwidthConfigsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListGlobalConnectionBandwidthConfigsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListGlobalConnectionBandwidthLineLevelsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListGlobalConnectionBandwidthLineLevelsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListGlobalConnectionBandwidthSitesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListGlobalConnectionBandwidthSitesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListGlobalConnectionBandwidthSpecCodesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListGlobalConnectionBandwidthSpecCodesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListGlobalConnectionBandwidthsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListGlobalConnectionBandwidthsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListInterRegionBandwidthsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListInterRegionBandwidthsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListNetworkInstancesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListNetworkInstancesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListPermissionsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListPermissionsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListSupportBindingConnectionBandwidthsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListSupportBindingConnectionBandwidthsResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowBandwidthPackageResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowCentralNetworkErRouteTableAttachmentRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowCentralNetworkErRouteTableAttachmentResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowCentralNetworkGdgwAttachmentRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowCentralNetworkGdgwAttachmentResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowCentralNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowCentralNetworkResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowCloudConnectionRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowCloudConnectionResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowCloudConnectionRoutesRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowCloudConnectionRoutesResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowGlobalConnectionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowGlobalConnectionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowInterRegionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowInterRegionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.ShowNetworkInstanceRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowNetworkInstanceResponse;
import com.huaweicloud.sdk.cc.v3.model.TagBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.TagBandwidthPackageResponse;
import com.huaweicloud.sdk.cc.v3.model.TagCentralNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.TagCentralNetworkResponse;
import com.huaweicloud.sdk.cc.v3.model.TagCloudConnectionRequest;
import com.huaweicloud.sdk.cc.v3.model.TagCloudConnectionResponse;
import com.huaweicloud.sdk.cc.v3.model.UntagBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.UntagBandwidthPackageResponse;
import com.huaweicloud.sdk.cc.v3.model.UntagCentralNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.UntagCentralNetworkResponse;
import com.huaweicloud.sdk.cc.v3.model.UntagCloudConnectionRequest;
import com.huaweicloud.sdk.cc.v3.model.UntagCloudConnectionResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateAuthorisationRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateAuthorisationResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateBandwidthPackageResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkConnectionRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkConnectionResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkErRouteTableAttachmentRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkErRouteTableAttachmentResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkGdgwAttachmentRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkGdgwAttachmentResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateCentralNetworkResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateCloudConnectionRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateCloudConnectionResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateGlobalConnectionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateGlobalConnectionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateInterRegionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateInterRegionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateNetworkInstanceRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateNetworkInstanceResponse;
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
     * 创建授权
     *
     * 网络实例所属租户授予云连接实例所属租户加载其网络实例的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuthorisationRequest 请求对象
     * @return CreateAuthorisationResponse
     */
    public CreateAuthorisationResponse createAuthorisation(CreateAuthorisationRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.createAuthorisation);
    }

    /**
     * 创建授权
     *
     * 网络实例所属租户授予云连接实例所属租户加载其网络实例的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuthorisationRequest 请求对象
     * @return SyncInvoker<CreateAuthorisationRequest, CreateAuthorisationResponse>
     */
    public SyncInvoker<CreateAuthorisationRequest, CreateAuthorisationResponse> createAuthorisationInvoker(
        CreateAuthorisationRequest request) {
        return new SyncInvoker<>(request, CcMeta.createAuthorisation, hcClient);
    }

    /**
     * 删除授权
     *
     * 网络实例所属租户取消授予云连接实例所属租户加载其网络实例的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuthorisationRequest 请求对象
     * @return DeleteAuthorisationResponse
     */
    public DeleteAuthorisationResponse deleteAuthorisation(DeleteAuthorisationRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.deleteAuthorisation);
    }

    /**
     * 删除授权
     *
     * 网络实例所属租户取消授予云连接实例所属租户加载其网络实例的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuthorisationRequest 请求对象
     * @return SyncInvoker<DeleteAuthorisationRequest, DeleteAuthorisationResponse>
     */
    public SyncInvoker<DeleteAuthorisationRequest, DeleteAuthorisationResponse> deleteAuthorisationInvoker(
        DeleteAuthorisationRequest request) {
        return new SyncInvoker<>(request, CcMeta.deleteAuthorisation, hcClient);
    }

    /**
     * 查询授权列表
     *
     * 网络实例所属租户查看其已经授予其他租户的权限。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorisationsRequest 请求对象
     * @return ListAuthorisationsResponse
     */
    public ListAuthorisationsResponse listAuthorisations(ListAuthorisationsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listAuthorisations);
    }

    /**
     * 查询授权列表
     *
     * 网络实例所属租户查看其已经授予其他租户的权限。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorisationsRequest 请求对象
     * @return SyncInvoker<ListAuthorisationsRequest, ListAuthorisationsResponse>
     */
    public SyncInvoker<ListAuthorisationsRequest, ListAuthorisationsResponse> listAuthorisationsInvoker(
        ListAuthorisationsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listAuthorisations, hcClient);
    }

    /**
     * 查询权限列表
     *
     * 云连接实例所属租户查询其可加载其他租户的网络实例权限。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionsRequest 请求对象
     * @return ListPermissionsResponse
     */
    public ListPermissionsResponse listPermissions(ListPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listPermissions);
    }

    /**
     * 查询权限列表
     *
     * 云连接实例所属租户查询其可加载其他租户的网络实例权限。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionsRequest 请求对象
     * @return SyncInvoker<ListPermissionsRequest, ListPermissionsResponse>
     */
    public SyncInvoker<ListPermissionsRequest, ListPermissionsResponse> listPermissionsInvoker(
        ListPermissionsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listPermissions, hcClient);
    }

    /**
     * 更新授权
     *
     * 更新授权实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuthorisationRequest 请求对象
     * @return UpdateAuthorisationResponse
     */
    public UpdateAuthorisationResponse updateAuthorisation(UpdateAuthorisationRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.updateAuthorisation);
    }

    /**
     * 更新授权
     *
     * 更新授权实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuthorisationRequest 请求对象
     * @return SyncInvoker<UpdateAuthorisationRequest, UpdateAuthorisationResponse>
     */
    public SyncInvoker<UpdateAuthorisationRequest, UpdateAuthorisationResponse> updateAuthorisationInvoker(
        UpdateAuthorisationRequest request) {
        return new SyncInvoker<>(request, CcMeta.updateAuthorisation, hcClient);
    }

    /**
     * 将带宽包实例绑定到云连接实例
     *
     * 将带宽包实例绑定到云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateBandwidthPackageRequest 请求对象
     * @return AssociateBandwidthPackageResponse
     */
    public AssociateBandwidthPackageResponse associateBandwidthPackage(AssociateBandwidthPackageRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.associateBandwidthPackage);
    }

    /**
     * 将带宽包实例绑定到云连接实例
     *
     * 将带宽包实例绑定到云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateBandwidthPackageRequest 请求对象
     * @return SyncInvoker<AssociateBandwidthPackageRequest, AssociateBandwidthPackageResponse>
     */
    public SyncInvoker<AssociateBandwidthPackageRequest, AssociateBandwidthPackageResponse> associateBandwidthPackageInvoker(
        AssociateBandwidthPackageRequest request) {
        return new SyncInvoker<>(request, CcMeta.associateBandwidthPackage, hcClient);
    }

    /**
     * 创建带宽包实例
     *
     * 创建带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBandwidthPackageRequest 请求对象
     * @return CreateBandwidthPackageResponse
     */
    public CreateBandwidthPackageResponse createBandwidthPackage(CreateBandwidthPackageRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.createBandwidthPackage);
    }

    /**
     * 创建带宽包实例
     *
     * 创建带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBandwidthPackageRequest 请求对象
     * @return SyncInvoker<CreateBandwidthPackageRequest, CreateBandwidthPackageResponse>
     */
    public SyncInvoker<CreateBandwidthPackageRequest, CreateBandwidthPackageResponse> createBandwidthPackageInvoker(
        CreateBandwidthPackageRequest request) {
        return new SyncInvoker<>(request, CcMeta.createBandwidthPackage, hcClient);
    }

    /**
     * 删除带宽包实例
     *
     * 删除带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBandwidthPackageRequest 请求对象
     * @return DeleteBandwidthPackageResponse
     */
    public DeleteBandwidthPackageResponse deleteBandwidthPackage(DeleteBandwidthPackageRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.deleteBandwidthPackage);
    }

    /**
     * 删除带宽包实例
     *
     * 删除带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBandwidthPackageRequest 请求对象
     * @return SyncInvoker<DeleteBandwidthPackageRequest, DeleteBandwidthPackageResponse>
     */
    public SyncInvoker<DeleteBandwidthPackageRequest, DeleteBandwidthPackageResponse> deleteBandwidthPackageInvoker(
        DeleteBandwidthPackageRequest request) {
        return new SyncInvoker<>(request, CcMeta.deleteBandwidthPackage, hcClient);
    }

    /**
     * 解除带宽包实例与云连接实例的绑定
     *
     * 解除带宽包实例与云连接实例的绑定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateBandwidthPackageRequest 请求对象
     * @return DisassociateBandwidthPackageResponse
     */
    public DisassociateBandwidthPackageResponse disassociateBandwidthPackage(
        DisassociateBandwidthPackageRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.disassociateBandwidthPackage);
    }

    /**
     * 解除带宽包实例与云连接实例的绑定
     *
     * 解除带宽包实例与云连接实例的绑定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateBandwidthPackageRequest 请求对象
     * @return SyncInvoker<DisassociateBandwidthPackageRequest, DisassociateBandwidthPackageResponse>
     */
    public SyncInvoker<DisassociateBandwidthPackageRequest, DisassociateBandwidthPackageResponse> disassociateBandwidthPackageInvoker(
        DisassociateBandwidthPackageRequest request) {
        return new SyncInvoker<>(request, CcMeta.disassociateBandwidthPackage, hcClient);
    }

    /**
     * 查询带宽包的标签信息
     *
     * 查询带宽包的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthPackageTagsRequest 请求对象
     * @return ListBandwidthPackageTagsResponse
     */
    public ListBandwidthPackageTagsResponse listBandwidthPackageTags(ListBandwidthPackageTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listBandwidthPackageTags);
    }

    /**
     * 查询带宽包的标签信息
     *
     * 查询带宽包的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthPackageTagsRequest 请求对象
     * @return SyncInvoker<ListBandwidthPackageTagsRequest, ListBandwidthPackageTagsResponse>
     */
    public SyncInvoker<ListBandwidthPackageTagsRequest, ListBandwidthPackageTagsResponse> listBandwidthPackageTagsInvoker(
        ListBandwidthPackageTagsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listBandwidthPackageTags, hcClient);
    }

    /**
     * 查询带宽包列表
     *
     * 查询带宽包列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthPackagesRequest 请求对象
     * @return ListBandwidthPackagesResponse
     */
    public ListBandwidthPackagesResponse listBandwidthPackages(ListBandwidthPackagesRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listBandwidthPackages);
    }

    /**
     * 查询带宽包列表
     *
     * 查询带宽包列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthPackagesRequest 请求对象
     * @return SyncInvoker<ListBandwidthPackagesRequest, ListBandwidthPackagesResponse>
     */
    public SyncInvoker<ListBandwidthPackagesRequest, ListBandwidthPackagesResponse> listBandwidthPackagesInvoker(
        ListBandwidthPackagesRequest request) {
        return new SyncInvoker<>(request, CcMeta.listBandwidthPackages, hcClient);
    }

    /**
     * 通过标签过滤带宽包实例
     *
     * 通过标签过滤带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthPackagesByTagsRequest 请求对象
     * @return ListBandwidthPackagesByTagsResponse
     */
    public ListBandwidthPackagesByTagsResponse listBandwidthPackagesByTags(ListBandwidthPackagesByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listBandwidthPackagesByTags);
    }

    /**
     * 通过标签过滤带宽包实例
     *
     * 通过标签过滤带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthPackagesByTagsRequest 请求对象
     * @return SyncInvoker<ListBandwidthPackagesByTagsRequest, ListBandwidthPackagesByTagsResponse>
     */
    public SyncInvoker<ListBandwidthPackagesByTagsRequest, ListBandwidthPackagesByTagsResponse> listBandwidthPackagesByTagsInvoker(
        ListBandwidthPackagesByTagsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listBandwidthPackagesByTags, hcClient);
    }

    /**
     * 查询带宽包实例
     *
     * 查询带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBandwidthPackageRequest 请求对象
     * @return ShowBandwidthPackageResponse
     */
    public ShowBandwidthPackageResponse showBandwidthPackage(ShowBandwidthPackageRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.showBandwidthPackage);
    }

    /**
     * 查询带宽包实例
     *
     * 查询带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBandwidthPackageRequest 请求对象
     * @return SyncInvoker<ShowBandwidthPackageRequest, ShowBandwidthPackageResponse>
     */
    public SyncInvoker<ShowBandwidthPackageRequest, ShowBandwidthPackageResponse> showBandwidthPackageInvoker(
        ShowBandwidthPackageRequest request) {
        return new SyncInvoker<>(request, CcMeta.showBandwidthPackage, hcClient);
    }

    /**
     * 创建带宽包标签
     *
     * 创建带宽包标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagBandwidthPackageRequest 请求对象
     * @return TagBandwidthPackageResponse
     */
    public TagBandwidthPackageResponse tagBandwidthPackage(TagBandwidthPackageRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.tagBandwidthPackage);
    }

    /**
     * 创建带宽包标签
     *
     * 创建带宽包标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagBandwidthPackageRequest 请求对象
     * @return SyncInvoker<TagBandwidthPackageRequest, TagBandwidthPackageResponse>
     */
    public SyncInvoker<TagBandwidthPackageRequest, TagBandwidthPackageResponse> tagBandwidthPackageInvoker(
        TagBandwidthPackageRequest request) {
        return new SyncInvoker<>(request, CcMeta.tagBandwidthPackage, hcClient);
    }

    /**
     * 删除带宽包标签
     *
     * 删除带宽包标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UntagBandwidthPackageRequest 请求对象
     * @return UntagBandwidthPackageResponse
     */
    public UntagBandwidthPackageResponse untagBandwidthPackage(UntagBandwidthPackageRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.untagBandwidthPackage);
    }

    /**
     * 删除带宽包标签
     *
     * 删除带宽包标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UntagBandwidthPackageRequest 请求对象
     * @return SyncInvoker<UntagBandwidthPackageRequest, UntagBandwidthPackageResponse>
     */
    public SyncInvoker<UntagBandwidthPackageRequest, UntagBandwidthPackageResponse> untagBandwidthPackageInvoker(
        UntagBandwidthPackageRequest request) {
        return new SyncInvoker<>(request, CcMeta.untagBandwidthPackage, hcClient);
    }

    /**
     * 更新带宽包实例
     *
     * 更新带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBandwidthPackageRequest 请求对象
     * @return UpdateBandwidthPackageResponse
     */
    public UpdateBandwidthPackageResponse updateBandwidthPackage(UpdateBandwidthPackageRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.updateBandwidthPackage);
    }

    /**
     * 更新带宽包实例
     *
     * 更新带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBandwidthPackageRequest 请求对象
     * @return SyncInvoker<UpdateBandwidthPackageRequest, UpdateBandwidthPackageResponse>
     */
    public SyncInvoker<UpdateBandwidthPackageRequest, UpdateBandwidthPackageResponse> updateBandwidthPackageInvoker(
        UpdateBandwidthPackageRequest request) {
        return new SyncInvoker<>(request, CcMeta.updateBandwidthPackage, hcClient);
    }

    /**
     * 应用中心网络策略
     *
     * 应用中心网络策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyCentralNetworkPolicyRequest 请求对象
     * @return ApplyCentralNetworkPolicyResponse
     */
    public ApplyCentralNetworkPolicyResponse applyCentralNetworkPolicy(ApplyCentralNetworkPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.applyCentralNetworkPolicy);
    }

    /**
     * 应用中心网络策略
     *
     * 应用中心网络策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyCentralNetworkPolicyRequest 请求对象
     * @return SyncInvoker<ApplyCentralNetworkPolicyRequest, ApplyCentralNetworkPolicyResponse>
     */
    public SyncInvoker<ApplyCentralNetworkPolicyRequest, ApplyCentralNetworkPolicyResponse> applyCentralNetworkPolicyInvoker(
        ApplyCentralNetworkPolicyRequest request) {
        return new SyncInvoker<>(request, CcMeta.applyCentralNetworkPolicy, hcClient);
    }

    /**
     * 创建中心网络
     *
     * 创建中心网络。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCentralNetworkRequest 请求对象
     * @return CreateCentralNetworkResponse
     */
    public CreateCentralNetworkResponse createCentralNetwork(CreateCentralNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.createCentralNetwork);
    }

    /**
     * 创建中心网络
     *
     * 创建中心网络。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCentralNetworkRequest 请求对象
     * @return SyncInvoker<CreateCentralNetworkRequest, CreateCentralNetworkResponse>
     */
    public SyncInvoker<CreateCentralNetworkRequest, CreateCentralNetworkResponse> createCentralNetworkInvoker(
        CreateCentralNetworkRequest request) {
        return new SyncInvoker<>(request, CcMeta.createCentralNetwork, hcClient);
    }

    /**
     * 创建一个新版本的中心网络策略
     *
     * 创建一份只读的中心网络的策略。如果您有策略文档内容改动，需要基于此版本重新创建一个新版本的策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCentralNetworkPolicyRequest 请求对象
     * @return CreateCentralNetworkPolicyResponse
     */
    public CreateCentralNetworkPolicyResponse createCentralNetworkPolicy(CreateCentralNetworkPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.createCentralNetworkPolicy);
    }

    /**
     * 创建一个新版本的中心网络策略
     *
     * 创建一份只读的中心网络的策略。如果您有策略文档内容改动，需要基于此版本重新创建一个新版本的策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCentralNetworkPolicyRequest 请求对象
     * @return SyncInvoker<CreateCentralNetworkPolicyRequest, CreateCentralNetworkPolicyResponse>
     */
    public SyncInvoker<CreateCentralNetworkPolicyRequest, CreateCentralNetworkPolicyResponse> createCentralNetworkPolicyInvoker(
        CreateCentralNetworkPolicyRequest request) {
        return new SyncInvoker<>(request, CcMeta.createCentralNetworkPolicy, hcClient);
    }

    /**
     * 删除中心网络
     *
     * 删除中心网络，请先清除附件后再删除中心网络。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCentralNetworkRequest 请求对象
     * @return DeleteCentralNetworkResponse
     */
    public DeleteCentralNetworkResponse deleteCentralNetwork(DeleteCentralNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.deleteCentralNetwork);
    }

    /**
     * 删除中心网络
     *
     * 删除中心网络，请先清除附件后再删除中心网络。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCentralNetworkRequest 请求对象
     * @return SyncInvoker<DeleteCentralNetworkRequest, DeleteCentralNetworkResponse>
     */
    public SyncInvoker<DeleteCentralNetworkRequest, DeleteCentralNetworkResponse> deleteCentralNetworkInvoker(
        DeleteCentralNetworkRequest request) {
        return new SyncInvoker<>(request, CcMeta.deleteCentralNetwork, hcClient);
    }

    /**
     * 删除中心网络策略版本
     *
     * 删除中心网络策略版本。您无法删除正在被应用的中心策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCentralNetworkPolicyRequest 请求对象
     * @return DeleteCentralNetworkPolicyResponse
     */
    public DeleteCentralNetworkPolicyResponse deleteCentralNetworkPolicy(DeleteCentralNetworkPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.deleteCentralNetworkPolicy);
    }

    /**
     * 删除中心网络策略版本
     *
     * 删除中心网络策略版本。您无法删除正在被应用的中心策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCentralNetworkPolicyRequest 请求对象
     * @return SyncInvoker<DeleteCentralNetworkPolicyRequest, DeleteCentralNetworkPolicyResponse>
     */
    public SyncInvoker<DeleteCentralNetworkPolicyRequest, DeleteCentralNetworkPolicyResponse> deleteCentralNetworkPolicyInvoker(
        DeleteCentralNetworkPolicyRequest request) {
        return new SyncInvoker<>(request, CcMeta.deleteCentralNetworkPolicy, hcClient);
    }

    /**
     * 查询所有版本的中心网络策略列表
     *
     * 查询所有版本的中心网络策略列表。
     * 分页查询使用的参数为marker、limit。limit默认值为0，没有指定marker时返回第一条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkPoliciesRequest 请求对象
     * @return ListCentralNetworkPoliciesResponse
     */
    public ListCentralNetworkPoliciesResponse listCentralNetworkPolicies(ListCentralNetworkPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listCentralNetworkPolicies);
    }

    /**
     * 查询所有版本的中心网络策略列表
     *
     * 查询所有版本的中心网络策略列表。
     * 分页查询使用的参数为marker、limit。limit默认值为0，没有指定marker时返回第一条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkPoliciesRequest 请求对象
     * @return SyncInvoker<ListCentralNetworkPoliciesRequest, ListCentralNetworkPoliciesResponse>
     */
    public SyncInvoker<ListCentralNetworkPoliciesRequest, ListCentralNetworkPoliciesResponse> listCentralNetworkPoliciesInvoker(
        ListCentralNetworkPoliciesRequest request) {
        return new SyncInvoker<>(request, CcMeta.listCentralNetworkPolicies, hcClient);
    }

    /**
     * 查询中心网络策略变化集
     *
     * 查询与当前应用中心网络策略的变化集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkPolicyChangeSetRequest 请求对象
     * @return ListCentralNetworkPolicyChangeSetResponse
     */
    public ListCentralNetworkPolicyChangeSetResponse listCentralNetworkPolicyChangeSet(
        ListCentralNetworkPolicyChangeSetRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listCentralNetworkPolicyChangeSet);
    }

    /**
     * 查询中心网络策略变化集
     *
     * 查询与当前应用中心网络策略的变化集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkPolicyChangeSetRequest 请求对象
     * @return SyncInvoker<ListCentralNetworkPolicyChangeSetRequest, ListCentralNetworkPolicyChangeSetResponse>
     */
    public SyncInvoker<ListCentralNetworkPolicyChangeSetRequest, ListCentralNetworkPolicyChangeSetResponse> listCentralNetworkPolicyChangeSetInvoker(
        ListCentralNetworkPolicyChangeSetRequest request) {
        return new SyncInvoker<>(request, CcMeta.listCentralNetworkPolicyChangeSet, hcClient);
    }

    /**
     * 查询中心网络的标签信息
     *
     * 查询中心网络的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkTagsRequest 请求对象
     * @return ListCentralNetworkTagsResponse
     */
    public ListCentralNetworkTagsResponse listCentralNetworkTags(ListCentralNetworkTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listCentralNetworkTags);
    }

    /**
     * 查询中心网络的标签信息
     *
     * 查询中心网络的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkTagsRequest 请求对象
     * @return SyncInvoker<ListCentralNetworkTagsRequest, ListCentralNetworkTagsResponse>
     */
    public SyncInvoker<ListCentralNetworkTagsRequest, ListCentralNetworkTagsResponse> listCentralNetworkTagsInvoker(
        ListCentralNetworkTagsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listCentralNetworkTags, hcClient);
    }

    /**
     * 查询中心网络列表
     *
     * 查询中心网络列表。
     * 分页查询使用的参数为marker、limit。limit默认值为0，没有指定marker时返回第一条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworksRequest 请求对象
     * @return ListCentralNetworksResponse
     */
    public ListCentralNetworksResponse listCentralNetworks(ListCentralNetworksRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listCentralNetworks);
    }

    /**
     * 查询中心网络列表
     *
     * 查询中心网络列表。
     * 分页查询使用的参数为marker、limit。limit默认值为0，没有指定marker时返回第一条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworksRequest 请求对象
     * @return SyncInvoker<ListCentralNetworksRequest, ListCentralNetworksResponse>
     */
    public SyncInvoker<ListCentralNetworksRequest, ListCentralNetworksResponse> listCentralNetworksInvoker(
        ListCentralNetworksRequest request) {
        return new SyncInvoker<>(request, CcMeta.listCentralNetworks, hcClient);
    }

    /**
     * 通过标签过滤中心网络实例
     *
     * 通过标签过滤中心网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworksByTagsRequest 请求对象
     * @return ListCentralNetworksByTagsResponse
     */
    public ListCentralNetworksByTagsResponse listCentralNetworksByTags(ListCentralNetworksByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listCentralNetworksByTags);
    }

    /**
     * 通过标签过滤中心网络实例
     *
     * 通过标签过滤中心网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworksByTagsRequest 请求对象
     * @return SyncInvoker<ListCentralNetworksByTagsRequest, ListCentralNetworksByTagsResponse>
     */
    public SyncInvoker<ListCentralNetworksByTagsRequest, ListCentralNetworksByTagsResponse> listCentralNetworksByTagsInvoker(
        ListCentralNetworksByTagsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listCentralNetworksByTags, hcClient);
    }

    /**
     * 查询中心网络详情
     *
     * 查询中心网络详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCentralNetworkRequest 请求对象
     * @return ShowCentralNetworkResponse
     */
    public ShowCentralNetworkResponse showCentralNetwork(ShowCentralNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.showCentralNetwork);
    }

    /**
     * 查询中心网络详情
     *
     * 查询中心网络详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCentralNetworkRequest 请求对象
     * @return SyncInvoker<ShowCentralNetworkRequest, ShowCentralNetworkResponse>
     */
    public SyncInvoker<ShowCentralNetworkRequest, ShowCentralNetworkResponse> showCentralNetworkInvoker(
        ShowCentralNetworkRequest request) {
        return new SyncInvoker<>(request, CcMeta.showCentralNetwork, hcClient);
    }

    /**
     * 创建中心网络标签
     *
     * 创建中心网络标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagCentralNetworkRequest 请求对象
     * @return TagCentralNetworkResponse
     */
    public TagCentralNetworkResponse tagCentralNetwork(TagCentralNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.tagCentralNetwork);
    }

    /**
     * 创建中心网络标签
     *
     * 创建中心网络标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagCentralNetworkRequest 请求对象
     * @return SyncInvoker<TagCentralNetworkRequest, TagCentralNetworkResponse>
     */
    public SyncInvoker<TagCentralNetworkRequest, TagCentralNetworkResponse> tagCentralNetworkInvoker(
        TagCentralNetworkRequest request) {
        return new SyncInvoker<>(request, CcMeta.tagCentralNetwork, hcClient);
    }

    /**
     * 删除中心网络标签
     *
     * 删除中心网络标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UntagCentralNetworkRequest 请求对象
     * @return UntagCentralNetworkResponse
     */
    public UntagCentralNetworkResponse untagCentralNetwork(UntagCentralNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.untagCentralNetwork);
    }

    /**
     * 删除中心网络标签
     *
     * 删除中心网络标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UntagCentralNetworkRequest 请求对象
     * @return SyncInvoker<UntagCentralNetworkRequest, UntagCentralNetworkResponse>
     */
    public SyncInvoker<UntagCentralNetworkRequest, UntagCentralNetworkResponse> untagCentralNetworkInvoker(
        UntagCentralNetworkRequest request) {
        return new SyncInvoker<>(request, CcMeta.untagCentralNetwork, hcClient);
    }

    /**
     * 更新中心网络详情
     *
     * 更新中心网络详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCentralNetworkRequest 请求对象
     * @return UpdateCentralNetworkResponse
     */
    public UpdateCentralNetworkResponse updateCentralNetwork(UpdateCentralNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.updateCentralNetwork);
    }

    /**
     * 更新中心网络详情
     *
     * 更新中心网络详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCentralNetworkRequest 请求对象
     * @return SyncInvoker<UpdateCentralNetworkRequest, UpdateCentralNetworkResponse>
     */
    public SyncInvoker<UpdateCentralNetworkRequest, UpdateCentralNetworkResponse> updateCentralNetworkInvoker(
        UpdateCentralNetworkRequest request) {
        return new SyncInvoker<>(request, CcMeta.updateCentralNetwork, hcClient);
    }

    /**
     * 创建中心网络ER路由表附件
     *
     * 创建中心网络的路由表附件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCentralNetworkErRouteTableAttachmentRequest 请求对象
     * @return CreateCentralNetworkErRouteTableAttachmentResponse
     */
    public CreateCentralNetworkErRouteTableAttachmentResponse createCentralNetworkErRouteTableAttachment(
        CreateCentralNetworkErRouteTableAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.createCentralNetworkErRouteTableAttachment);
    }

    /**
     * 创建中心网络ER路由表附件
     *
     * 创建中心网络的路由表附件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCentralNetworkErRouteTableAttachmentRequest 请求对象
     * @return SyncInvoker<CreateCentralNetworkErRouteTableAttachmentRequest, CreateCentralNetworkErRouteTableAttachmentResponse>
     */
    public SyncInvoker<CreateCentralNetworkErRouteTableAttachmentRequest, CreateCentralNetworkErRouteTableAttachmentResponse> createCentralNetworkErRouteTableAttachmentInvoker(
        CreateCentralNetworkErRouteTableAttachmentRequest request) {
        return new SyncInvoker<>(request, CcMeta.createCentralNetworkErRouteTableAttachment, hcClient);
    }

    /**
     * 创建中心网络GDGW附件
     *
     * 创建中心网络的GDGW附件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCentralNetworkGdgwAttachmentRequest 请求对象
     * @return CreateCentralNetworkGdgwAttachmentResponse
     */
    public CreateCentralNetworkGdgwAttachmentResponse createCentralNetworkGdgwAttachment(
        CreateCentralNetworkGdgwAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.createCentralNetworkGdgwAttachment);
    }

    /**
     * 创建中心网络GDGW附件
     *
     * 创建中心网络的GDGW附件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCentralNetworkGdgwAttachmentRequest 请求对象
     * @return SyncInvoker<CreateCentralNetworkGdgwAttachmentRequest, CreateCentralNetworkGdgwAttachmentResponse>
     */
    public SyncInvoker<CreateCentralNetworkGdgwAttachmentRequest, CreateCentralNetworkGdgwAttachmentResponse> createCentralNetworkGdgwAttachmentInvoker(
        CreateCentralNetworkGdgwAttachmentRequest request) {
        return new SyncInvoker<>(request, CcMeta.createCentralNetworkGdgwAttachment, hcClient);
    }

    /**
     * 删除中心网络附件
     *
     * 删除中心网络附件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCentralNetworkAttachmentRequest 请求对象
     * @return DeleteCentralNetworkAttachmentResponse
     */
    public DeleteCentralNetworkAttachmentResponse deleteCentralNetworkAttachment(
        DeleteCentralNetworkAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.deleteCentralNetworkAttachment);
    }

    /**
     * 删除中心网络附件
     *
     * 删除中心网络附件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCentralNetworkAttachmentRequest 请求对象
     * @return SyncInvoker<DeleteCentralNetworkAttachmentRequest, DeleteCentralNetworkAttachmentResponse>
     */
    public SyncInvoker<DeleteCentralNetworkAttachmentRequest, DeleteCentralNetworkAttachmentResponse> deleteCentralNetworkAttachmentInvoker(
        DeleteCentralNetworkAttachmentRequest request) {
        return new SyncInvoker<>(request, CcMeta.deleteCentralNetworkAttachment, hcClient);
    }

    /**
     * 查询中心网络附件列表
     *
     * 查询中心网络附件列表，分页查询使用的参数为marker、limit。limit默认值为0，没有指定marker时返回第一条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkAttachmentsRequest 请求对象
     * @return ListCentralNetworkAttachmentsResponse
     */
    public ListCentralNetworkAttachmentsResponse listCentralNetworkAttachments(
        ListCentralNetworkAttachmentsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listCentralNetworkAttachments);
    }

    /**
     * 查询中心网络附件列表
     *
     * 查询中心网络附件列表，分页查询使用的参数为marker、limit。limit默认值为0，没有指定marker时返回第一条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkAttachmentsRequest 请求对象
     * @return SyncInvoker<ListCentralNetworkAttachmentsRequest, ListCentralNetworkAttachmentsResponse>
     */
    public SyncInvoker<ListCentralNetworkAttachmentsRequest, ListCentralNetworkAttachmentsResponse> listCentralNetworkAttachmentsInvoker(
        ListCentralNetworkAttachmentsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listCentralNetworkAttachments, hcClient);
    }

    /**
     * 查询中心网络ER路由表附件列表
     *
     * 查询中心网络ER路由表附件列表。
     * 分页查询使用的参数为marker、limit。limit默认值为0，没有指定marker时返回第一条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkErRouteTableAttachmentsRequest 请求对象
     * @return ListCentralNetworkErRouteTableAttachmentsResponse
     */
    public ListCentralNetworkErRouteTableAttachmentsResponse listCentralNetworkErRouteTableAttachments(
        ListCentralNetworkErRouteTableAttachmentsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listCentralNetworkErRouteTableAttachments);
    }

    /**
     * 查询中心网络ER路由表附件列表
     *
     * 查询中心网络ER路由表附件列表。
     * 分页查询使用的参数为marker、limit。limit默认值为0，没有指定marker时返回第一条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkErRouteTableAttachmentsRequest 请求对象
     * @return SyncInvoker<ListCentralNetworkErRouteTableAttachmentsRequest, ListCentralNetworkErRouteTableAttachmentsResponse>
     */
    public SyncInvoker<ListCentralNetworkErRouteTableAttachmentsRequest, ListCentralNetworkErRouteTableAttachmentsResponse> listCentralNetworkErRouteTableAttachmentsInvoker(
        ListCentralNetworkErRouteTableAttachmentsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listCentralNetworkErRouteTableAttachments, hcClient);
    }

    /**
     * 查询中心网络GDGW附件列表
     *
     * 查询中心网络GDGW附件列表。
     * 分页查询使用的参数为marker、limit。limit默认值为0，没有指定marker时返回第一条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkGdgwAttachmentsRequest 请求对象
     * @return ListCentralNetworkGdgwAttachmentsResponse
     */
    public ListCentralNetworkGdgwAttachmentsResponse listCentralNetworkGdgwAttachments(
        ListCentralNetworkGdgwAttachmentsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listCentralNetworkGdgwAttachments);
    }

    /**
     * 查询中心网络GDGW附件列表
     *
     * 查询中心网络GDGW附件列表。
     * 分页查询使用的参数为marker、limit。limit默认值为0，没有指定marker时返回第一条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkGdgwAttachmentsRequest 请求对象
     * @return SyncInvoker<ListCentralNetworkGdgwAttachmentsRequest, ListCentralNetworkGdgwAttachmentsResponse>
     */
    public SyncInvoker<ListCentralNetworkGdgwAttachmentsRequest, ListCentralNetworkGdgwAttachmentsResponse> listCentralNetworkGdgwAttachmentsInvoker(
        ListCentralNetworkGdgwAttachmentsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listCentralNetworkGdgwAttachments, hcClient);
    }

    /**
     * 查询中心网络ER路由表附件详情
     *
     * 查询中心网络ER路由表附件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCentralNetworkErRouteTableAttachmentRequest 请求对象
     * @return ShowCentralNetworkErRouteTableAttachmentResponse
     */
    public ShowCentralNetworkErRouteTableAttachmentResponse showCentralNetworkErRouteTableAttachment(
        ShowCentralNetworkErRouteTableAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.showCentralNetworkErRouteTableAttachment);
    }

    /**
     * 查询中心网络ER路由表附件详情
     *
     * 查询中心网络ER路由表附件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCentralNetworkErRouteTableAttachmentRequest 请求对象
     * @return SyncInvoker<ShowCentralNetworkErRouteTableAttachmentRequest, ShowCentralNetworkErRouteTableAttachmentResponse>
     */
    public SyncInvoker<ShowCentralNetworkErRouteTableAttachmentRequest, ShowCentralNetworkErRouteTableAttachmentResponse> showCentralNetworkErRouteTableAttachmentInvoker(
        ShowCentralNetworkErRouteTableAttachmentRequest request) {
        return new SyncInvoker<>(request, CcMeta.showCentralNetworkErRouteTableAttachment, hcClient);
    }

    /**
     * 查询中心网络GDGW附件详情
     *
     * 查询中心网络GDGW附件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCentralNetworkGdgwAttachmentRequest 请求对象
     * @return ShowCentralNetworkGdgwAttachmentResponse
     */
    public ShowCentralNetworkGdgwAttachmentResponse showCentralNetworkGdgwAttachment(
        ShowCentralNetworkGdgwAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.showCentralNetworkGdgwAttachment);
    }

    /**
     * 查询中心网络GDGW附件详情
     *
     * 查询中心网络GDGW附件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCentralNetworkGdgwAttachmentRequest 请求对象
     * @return SyncInvoker<ShowCentralNetworkGdgwAttachmentRequest, ShowCentralNetworkGdgwAttachmentResponse>
     */
    public SyncInvoker<ShowCentralNetworkGdgwAttachmentRequest, ShowCentralNetworkGdgwAttachmentResponse> showCentralNetworkGdgwAttachmentInvoker(
        ShowCentralNetworkGdgwAttachmentRequest request) {
        return new SyncInvoker<>(request, CcMeta.showCentralNetworkGdgwAttachment, hcClient);
    }

    /**
     * 更新中心网络ER路由表附件
     *
     * 更新中心网络ER路由表附件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCentralNetworkErRouteTableAttachmentRequest 请求对象
     * @return UpdateCentralNetworkErRouteTableAttachmentResponse
     */
    public UpdateCentralNetworkErRouteTableAttachmentResponse updateCentralNetworkErRouteTableAttachment(
        UpdateCentralNetworkErRouteTableAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.updateCentralNetworkErRouteTableAttachment);
    }

    /**
     * 更新中心网络ER路由表附件
     *
     * 更新中心网络ER路由表附件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCentralNetworkErRouteTableAttachmentRequest 请求对象
     * @return SyncInvoker<UpdateCentralNetworkErRouteTableAttachmentRequest, UpdateCentralNetworkErRouteTableAttachmentResponse>
     */
    public SyncInvoker<UpdateCentralNetworkErRouteTableAttachmentRequest, UpdateCentralNetworkErRouteTableAttachmentResponse> updateCentralNetworkErRouteTableAttachmentInvoker(
        UpdateCentralNetworkErRouteTableAttachmentRequest request) {
        return new SyncInvoker<>(request, CcMeta.updateCentralNetworkErRouteTableAttachment, hcClient);
    }

    /**
     * 更新中心网络GDGW附件
     *
     * 更新中心网络GDGW附件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCentralNetworkGdgwAttachmentRequest 请求对象
     * @return UpdateCentralNetworkGdgwAttachmentResponse
     */
    public UpdateCentralNetworkGdgwAttachmentResponse updateCentralNetworkGdgwAttachment(
        UpdateCentralNetworkGdgwAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.updateCentralNetworkGdgwAttachment);
    }

    /**
     * 更新中心网络GDGW附件
     *
     * 更新中心网络GDGW附件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCentralNetworkGdgwAttachmentRequest 请求对象
     * @return SyncInvoker<UpdateCentralNetworkGdgwAttachmentRequest, UpdateCentralNetworkGdgwAttachmentResponse>
     */
    public SyncInvoker<UpdateCentralNetworkGdgwAttachmentRequest, UpdateCentralNetworkGdgwAttachmentResponse> updateCentralNetworkGdgwAttachmentInvoker(
        UpdateCentralNetworkGdgwAttachmentRequest request) {
        return new SyncInvoker<>(request, CcMeta.updateCentralNetworkGdgwAttachment, hcClient);
    }

    /**
     * 查询中心网络能力列表
     *
     * 查询中心网络能力列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkCapabilitiesRequest 请求对象
     * @return ListCentralNetworkCapabilitiesResponse
     */
    public ListCentralNetworkCapabilitiesResponse listCentralNetworkCapabilities(
        ListCentralNetworkCapabilitiesRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listCentralNetworkCapabilities);
    }

    /**
     * 查询中心网络能力列表
     *
     * 查询中心网络能力列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkCapabilitiesRequest 请求对象
     * @return SyncInvoker<ListCentralNetworkCapabilitiesRequest, ListCentralNetworkCapabilitiesResponse>
     */
    public SyncInvoker<ListCentralNetworkCapabilitiesRequest, ListCentralNetworkCapabilitiesResponse> listCentralNetworkCapabilitiesInvoker(
        ListCentralNetworkCapabilitiesRequest request) {
        return new SyncInvoker<>(request, CcMeta.listCentralNetworkCapabilities, hcClient);
    }

    /**
     * 查询中心网络连接列表
     *
     * 查询中心网络连接列表接口。
     * 分页查询使用的参数为marker、limit。limit默认值为0，没有指定marker时返回第一条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkConnectionsRequest 请求对象
     * @return ListCentralNetworkConnectionsResponse
     */
    public ListCentralNetworkConnectionsResponse listCentralNetworkConnections(
        ListCentralNetworkConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listCentralNetworkConnections);
    }

    /**
     * 查询中心网络连接列表
     *
     * 查询中心网络连接列表接口。
     * 分页查询使用的参数为marker、limit。limit默认值为0，没有指定marker时返回第一条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkConnectionsRequest 请求对象
     * @return SyncInvoker<ListCentralNetworkConnectionsRequest, ListCentralNetworkConnectionsResponse>
     */
    public SyncInvoker<ListCentralNetworkConnectionsRequest, ListCentralNetworkConnectionsResponse> listCentralNetworkConnectionsInvoker(
        ListCentralNetworkConnectionsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listCentralNetworkConnections, hcClient);
    }

    /**
     * 更新中心网络连接接口
     *
     * 更新中心网络连接接口（仅支持更新带宽）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCentralNetworkConnectionRequest 请求对象
     * @return UpdateCentralNetworkConnectionResponse
     */
    public UpdateCentralNetworkConnectionResponse updateCentralNetworkConnection(
        UpdateCentralNetworkConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.updateCentralNetworkConnection);
    }

    /**
     * 更新中心网络连接接口
     *
     * 更新中心网络连接接口（仅支持更新带宽）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCentralNetworkConnectionRequest 请求对象
     * @return SyncInvoker<UpdateCentralNetworkConnectionRequest, UpdateCentralNetworkConnectionResponse>
     */
    public SyncInvoker<UpdateCentralNetworkConnectionRequest, UpdateCentralNetworkConnectionResponse> updateCentralNetworkConnectionInvoker(
        UpdateCentralNetworkConnectionRequest request) {
        return new SyncInvoker<>(request, CcMeta.updateCentralNetworkConnection, hcClient);
    }

    /**
     * 查询中心网络配额
     *
     * 查询中心网络配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkQuotasRequest 请求对象
     * @return ListCentralNetworkQuotasResponse
     */
    public ListCentralNetworkQuotasResponse listCentralNetworkQuotas(ListCentralNetworkQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listCentralNetworkQuotas);
    }

    /**
     * 查询中心网络配额
     *
     * 查询中心网络配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkQuotasRequest 请求对象
     * @return SyncInvoker<ListCentralNetworkQuotasRequest, ListCentralNetworkQuotasResponse>
     */
    public SyncInvoker<ListCentralNetworkQuotasRequest, ListCentralNetworkQuotasResponse> listCentralNetworkQuotasInvoker(
        ListCentralNetworkQuotasRequest request) {
        return new SyncInvoker<>(request, CcMeta.listCentralNetworkQuotas, hcClient);
    }

    /**
     * 创建云连接实例
     *
     * 创建云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCloudConnectionRequest 请求对象
     * @return CreateCloudConnectionResponse
     */
    public CreateCloudConnectionResponse createCloudConnection(CreateCloudConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.createCloudConnection);
    }

    /**
     * 创建云连接实例
     *
     * 创建云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCloudConnectionRequest 请求对象
     * @return SyncInvoker<CreateCloudConnectionRequest, CreateCloudConnectionResponse>
     */
    public SyncInvoker<CreateCloudConnectionRequest, CreateCloudConnectionResponse> createCloudConnectionInvoker(
        CreateCloudConnectionRequest request) {
        return new SyncInvoker<>(request, CcMeta.createCloudConnection, hcClient);
    }

    /**
     * 删除云连接实例
     *
     * 删除云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCloudConnectionRequest 请求对象
     * @return DeleteCloudConnectionResponse
     */
    public DeleteCloudConnectionResponse deleteCloudConnection(DeleteCloudConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.deleteCloudConnection);
    }

    /**
     * 删除云连接实例
     *
     * 删除云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCloudConnectionRequest 请求对象
     * @return SyncInvoker<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse>
     */
    public SyncInvoker<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse> deleteCloudConnectionInvoker(
        DeleteCloudConnectionRequest request) {
        return new SyncInvoker<>(request, CcMeta.deleteCloudConnection, hcClient);
    }

    /**
     * 查询云连接实例的标签信息
     *
     * 查询云连接实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudConnectionTagsRequest 请求对象
     * @return ListCloudConnectionTagsResponse
     */
    public ListCloudConnectionTagsResponse listCloudConnectionTags(ListCloudConnectionTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listCloudConnectionTags);
    }

    /**
     * 查询云连接实例的标签信息
     *
     * 查询云连接实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudConnectionTagsRequest 请求对象
     * @return SyncInvoker<ListCloudConnectionTagsRequest, ListCloudConnectionTagsResponse>
     */
    public SyncInvoker<ListCloudConnectionTagsRequest, ListCloudConnectionTagsResponse> listCloudConnectionTagsInvoker(
        ListCloudConnectionTagsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listCloudConnectionTags, hcClient);
    }

    /**
     * 查询云连接列表
     *
     * 查询云连接列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudConnectionsRequest 请求对象
     * @return ListCloudConnectionsResponse
     */
    public ListCloudConnectionsResponse listCloudConnections(ListCloudConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listCloudConnections);
    }

    /**
     * 查询云连接列表
     *
     * 查询云连接列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudConnectionsRequest 请求对象
     * @return SyncInvoker<ListCloudConnectionsRequest, ListCloudConnectionsResponse>
     */
    public SyncInvoker<ListCloudConnectionsRequest, ListCloudConnectionsResponse> listCloudConnectionsInvoker(
        ListCloudConnectionsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listCloudConnections, hcClient);
    }

    /**
     * 通过标签过滤云连接实例
     *
     * 通过标签过滤云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudConnectionsByTagsRequest 请求对象
     * @return ListCloudConnectionsByTagsResponse
     */
    public ListCloudConnectionsByTagsResponse listCloudConnectionsByTags(ListCloudConnectionsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listCloudConnectionsByTags);
    }

    /**
     * 通过标签过滤云连接实例
     *
     * 通过标签过滤云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudConnectionsByTagsRequest 请求对象
     * @return SyncInvoker<ListCloudConnectionsByTagsRequest, ListCloudConnectionsByTagsResponse>
     */
    public SyncInvoker<ListCloudConnectionsByTagsRequest, ListCloudConnectionsByTagsResponse> listCloudConnectionsByTagsInvoker(
        ListCloudConnectionsByTagsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listCloudConnectionsByTags, hcClient);
    }

    /**
     * 查询云连接实例
     *
     * 查询云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCloudConnectionRequest 请求对象
     * @return ShowCloudConnectionResponse
     */
    public ShowCloudConnectionResponse showCloudConnection(ShowCloudConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.showCloudConnection);
    }

    /**
     * 查询云连接实例
     *
     * 查询云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCloudConnectionRequest 请求对象
     * @return SyncInvoker<ShowCloudConnectionRequest, ShowCloudConnectionResponse>
     */
    public SyncInvoker<ShowCloudConnectionRequest, ShowCloudConnectionResponse> showCloudConnectionInvoker(
        ShowCloudConnectionRequest request) {
        return new SyncInvoker<>(request, CcMeta.showCloudConnection, hcClient);
    }

    /**
     * 创建云连接实例标签
     *
     * 创建云连接实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagCloudConnectionRequest 请求对象
     * @return TagCloudConnectionResponse
     */
    public TagCloudConnectionResponse tagCloudConnection(TagCloudConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.tagCloudConnection);
    }

    /**
     * 创建云连接实例标签
     *
     * 创建云连接实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagCloudConnectionRequest 请求对象
     * @return SyncInvoker<TagCloudConnectionRequest, TagCloudConnectionResponse>
     */
    public SyncInvoker<TagCloudConnectionRequest, TagCloudConnectionResponse> tagCloudConnectionInvoker(
        TagCloudConnectionRequest request) {
        return new SyncInvoker<>(request, CcMeta.tagCloudConnection, hcClient);
    }

    /**
     * 删除云连接实例标签
     *
     * 删除云连接实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UntagCloudConnectionRequest 请求对象
     * @return UntagCloudConnectionResponse
     */
    public UntagCloudConnectionResponse untagCloudConnection(UntagCloudConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.untagCloudConnection);
    }

    /**
     * 删除云连接实例标签
     *
     * 删除云连接实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UntagCloudConnectionRequest 请求对象
     * @return SyncInvoker<UntagCloudConnectionRequest, UntagCloudConnectionResponse>
     */
    public SyncInvoker<UntagCloudConnectionRequest, UntagCloudConnectionResponse> untagCloudConnectionInvoker(
        UntagCloudConnectionRequest request) {
        return new SyncInvoker<>(request, CcMeta.untagCloudConnection, hcClient);
    }

    /**
     * 更新云连接实例
     *
     * 更新云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCloudConnectionRequest 请求对象
     * @return UpdateCloudConnectionResponse
     */
    public UpdateCloudConnectionResponse updateCloudConnection(UpdateCloudConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.updateCloudConnection);
    }

    /**
     * 更新云连接实例
     *
     * 更新云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCloudConnectionRequest 请求对象
     * @return SyncInvoker<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse>
     */
    public SyncInvoker<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse> updateCloudConnectionInvoker(
        UpdateCloudConnectionRequest request) {
        return new SyncInvoker<>(request, CcMeta.updateCloudConnection, hcClient);
    }

    /**
     * 查询云连接配额
     *
     * 查询云连接配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudConnectionQuotasRequest 请求对象
     * @return ListCloudConnectionQuotasResponse
     */
    public ListCloudConnectionQuotasResponse listCloudConnectionQuotas(ListCloudConnectionQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listCloudConnectionQuotas);
    }

    /**
     * 查询云连接配额
     *
     * 查询云连接配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudConnectionQuotasRequest 请求对象
     * @return SyncInvoker<ListCloudConnectionQuotasRequest, ListCloudConnectionQuotasResponse>
     */
    public SyncInvoker<ListCloudConnectionQuotasRequest, ListCloudConnectionQuotasResponse> listCloudConnectionQuotasInvoker(
        ListCloudConnectionQuotasRequest request) {
        return new SyncInvoker<>(request, CcMeta.listCloudConnectionQuotas, hcClient);
    }

    /**
     * 查询云连接路由条目列表
     *
     * 查询云连接路由条目列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudConnectionRoutesRequest 请求对象
     * @return ListCloudConnectionRoutesResponse
     */
    public ListCloudConnectionRoutesResponse listCloudConnectionRoutes(ListCloudConnectionRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listCloudConnectionRoutes);
    }

    /**
     * 查询云连接路由条目列表
     *
     * 查询云连接路由条目列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudConnectionRoutesRequest 请求对象
     * @return SyncInvoker<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse>
     */
    public SyncInvoker<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse> listCloudConnectionRoutesInvoker(
        ListCloudConnectionRoutesRequest request) {
        return new SyncInvoker<>(request, CcMeta.listCloudConnectionRoutes, hcClient);
    }

    /**
     * 查询云连接路由条目详情
     *
     * 查询云连接路由条目列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCloudConnectionRoutesRequest 请求对象
     * @return ShowCloudConnectionRoutesResponse
     */
    public ShowCloudConnectionRoutesResponse showCloudConnectionRoutes(ShowCloudConnectionRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.showCloudConnectionRoutes);
    }

    /**
     * 查询云连接路由条目详情
     *
     * 查询云连接路由条目列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCloudConnectionRoutesRequest 请求对象
     * @return SyncInvoker<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse>
     */
    public SyncInvoker<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse> showCloudConnectionRoutesInvoker(
        ShowCloudConnectionRoutesRequest request) {
        return new SyncInvoker<>(request, CcMeta.showCloudConnectionRoutes, hcClient);
    }

    /**
     * 全域互联带宽绑定实例
     *
     * 全域互联带宽绑定实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateGlobalConnectionBandwidthInstanceRequest 请求对象
     * @return AssociateGlobalConnectionBandwidthInstanceResponse
     */
    public AssociateGlobalConnectionBandwidthInstanceResponse associateGlobalConnectionBandwidthInstance(
        AssociateGlobalConnectionBandwidthInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.associateGlobalConnectionBandwidthInstance);
    }

    /**
     * 全域互联带宽绑定实例
     *
     * 全域互联带宽绑定实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateGlobalConnectionBandwidthInstanceRequest 请求对象
     * @return SyncInvoker<AssociateGlobalConnectionBandwidthInstanceRequest, AssociateGlobalConnectionBandwidthInstanceResponse>
     */
    public SyncInvoker<AssociateGlobalConnectionBandwidthInstanceRequest, AssociateGlobalConnectionBandwidthInstanceResponse> associateGlobalConnectionBandwidthInstanceInvoker(
        AssociateGlobalConnectionBandwidthInstanceRequest request) {
        return new SyncInvoker<>(request, CcMeta.associateGlobalConnectionBandwidthInstance, hcClient);
    }

    /**
     * 创建全域互联带宽
     *
     * 创建全域互联带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGlobalConnectionBandwidthRequest 请求对象
     * @return CreateGlobalConnectionBandwidthResponse
     */
    public CreateGlobalConnectionBandwidthResponse createGlobalConnectionBandwidth(
        CreateGlobalConnectionBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.createGlobalConnectionBandwidth);
    }

    /**
     * 创建全域互联带宽
     *
     * 创建全域互联带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGlobalConnectionBandwidthRequest 请求对象
     * @return SyncInvoker<CreateGlobalConnectionBandwidthRequest, CreateGlobalConnectionBandwidthResponse>
     */
    public SyncInvoker<CreateGlobalConnectionBandwidthRequest, CreateGlobalConnectionBandwidthResponse> createGlobalConnectionBandwidthInvoker(
        CreateGlobalConnectionBandwidthRequest request) {
        return new SyncInvoker<>(request, CcMeta.createGlobalConnectionBandwidth, hcClient);
    }

    /**
     * 删除全域互联带宽
     *
     * 删除全域互联带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGlobalConnectionBandwidthRequest 请求对象
     * @return DeleteGlobalConnectionBandwidthResponse
     */
    public DeleteGlobalConnectionBandwidthResponse deleteGlobalConnectionBandwidth(
        DeleteGlobalConnectionBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.deleteGlobalConnectionBandwidth);
    }

    /**
     * 删除全域互联带宽
     *
     * 删除全域互联带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGlobalConnectionBandwidthRequest 请求对象
     * @return SyncInvoker<DeleteGlobalConnectionBandwidthRequest, DeleteGlobalConnectionBandwidthResponse>
     */
    public SyncInvoker<DeleteGlobalConnectionBandwidthRequest, DeleteGlobalConnectionBandwidthResponse> deleteGlobalConnectionBandwidthInvoker(
        DeleteGlobalConnectionBandwidthRequest request) {
        return new SyncInvoker<>(request, CcMeta.deleteGlobalConnectionBandwidth, hcClient);
    }

    /**
     * 全域互联带宽解绑实例
     *
     * 全域互联带宽解绑实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateGlobalConnectionBandwidthInstanceRequest 请求对象
     * @return DisassociateGlobalConnectionBandwidthInstanceResponse
     */
    public DisassociateGlobalConnectionBandwidthInstanceResponse disassociateGlobalConnectionBandwidthInstance(
        DisassociateGlobalConnectionBandwidthInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.disassociateGlobalConnectionBandwidthInstance);
    }

    /**
     * 全域互联带宽解绑实例
     *
     * 全域互联带宽解绑实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateGlobalConnectionBandwidthInstanceRequest 请求对象
     * @return SyncInvoker<DisassociateGlobalConnectionBandwidthInstanceRequest, DisassociateGlobalConnectionBandwidthInstanceResponse>
     */
    public SyncInvoker<DisassociateGlobalConnectionBandwidthInstanceRequest, DisassociateGlobalConnectionBandwidthInstanceResponse> disassociateGlobalConnectionBandwidthInstanceInvoker(
        DisassociateGlobalConnectionBandwidthInstanceRequest request) {
        return new SyncInvoker<>(request, CcMeta.disassociateGlobalConnectionBandwidthInstance, hcClient);
    }

    /**
     * 查询全域互联带宽租户配置信息
     *
     * 查询全域互联带宽租户配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalConnectionBandwidthConfigsRequest 请求对象
     * @return ListGlobalConnectionBandwidthConfigsResponse
     */
    public ListGlobalConnectionBandwidthConfigsResponse listGlobalConnectionBandwidthConfigs(
        ListGlobalConnectionBandwidthConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listGlobalConnectionBandwidthConfigs);
    }

    /**
     * 查询全域互联带宽租户配置信息
     *
     * 查询全域互联带宽租户配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalConnectionBandwidthConfigsRequest 请求对象
     * @return SyncInvoker<ListGlobalConnectionBandwidthConfigsRequest, ListGlobalConnectionBandwidthConfigsResponse>
     */
    public SyncInvoker<ListGlobalConnectionBandwidthConfigsRequest, ListGlobalConnectionBandwidthConfigsResponse> listGlobalConnectionBandwidthConfigsInvoker(
        ListGlobalConnectionBandwidthConfigsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listGlobalConnectionBandwidthConfigs, hcClient);
    }

    /**
     * 查询线路等级列表
     *
     * 查询线路等级列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalConnectionBandwidthLineLevelsRequest 请求对象
     * @return ListGlobalConnectionBandwidthLineLevelsResponse
     */
    public ListGlobalConnectionBandwidthLineLevelsResponse listGlobalConnectionBandwidthLineLevels(
        ListGlobalConnectionBandwidthLineLevelsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listGlobalConnectionBandwidthLineLevels);
    }

    /**
     * 查询线路等级列表
     *
     * 查询线路等级列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalConnectionBandwidthLineLevelsRequest 请求对象
     * @return SyncInvoker<ListGlobalConnectionBandwidthLineLevelsRequest, ListGlobalConnectionBandwidthLineLevelsResponse>
     */
    public SyncInvoker<ListGlobalConnectionBandwidthLineLevelsRequest, ListGlobalConnectionBandwidthLineLevelsResponse> listGlobalConnectionBandwidthLineLevelsInvoker(
        ListGlobalConnectionBandwidthLineLevelsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listGlobalConnectionBandwidthLineLevels, hcClient);
    }

    /**
     * 查询站点列表
     *
     * 查询站点列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalConnectionBandwidthSitesRequest 请求对象
     * @return ListGlobalConnectionBandwidthSitesResponse
     */
    public ListGlobalConnectionBandwidthSitesResponse listGlobalConnectionBandwidthSites(
        ListGlobalConnectionBandwidthSitesRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listGlobalConnectionBandwidthSites);
    }

    /**
     * 查询站点列表
     *
     * 查询站点列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalConnectionBandwidthSitesRequest 请求对象
     * @return SyncInvoker<ListGlobalConnectionBandwidthSitesRequest, ListGlobalConnectionBandwidthSitesResponse>
     */
    public SyncInvoker<ListGlobalConnectionBandwidthSitesRequest, ListGlobalConnectionBandwidthSitesResponse> listGlobalConnectionBandwidthSitesInvoker(
        ListGlobalConnectionBandwidthSitesRequest request) {
        return new SyncInvoker<>(request, CcMeta.listGlobalConnectionBandwidthSites, hcClient);
    }

    /**
     * 查询线路规格列表
     *
     * 查询线路规格列表。租户白名单控制，默认为空。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalConnectionBandwidthSpecCodesRequest 请求对象
     * @return ListGlobalConnectionBandwidthSpecCodesResponse
     */
    public ListGlobalConnectionBandwidthSpecCodesResponse listGlobalConnectionBandwidthSpecCodes(
        ListGlobalConnectionBandwidthSpecCodesRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listGlobalConnectionBandwidthSpecCodes);
    }

    /**
     * 查询线路规格列表
     *
     * 查询线路规格列表。租户白名单控制，默认为空。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalConnectionBandwidthSpecCodesRequest 请求对象
     * @return SyncInvoker<ListGlobalConnectionBandwidthSpecCodesRequest, ListGlobalConnectionBandwidthSpecCodesResponse>
     */
    public SyncInvoker<ListGlobalConnectionBandwidthSpecCodesRequest, ListGlobalConnectionBandwidthSpecCodesResponse> listGlobalConnectionBandwidthSpecCodesInvoker(
        ListGlobalConnectionBandwidthSpecCodesRequest request) {
        return new SyncInvoker<>(request, CcMeta.listGlobalConnectionBandwidthSpecCodes, hcClient);
    }

    /**
     * 查询全域互联带宽列表
     *
     * 查询全域互联带宽列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalConnectionBandwidthsRequest 请求对象
     * @return ListGlobalConnectionBandwidthsResponse
     */
    public ListGlobalConnectionBandwidthsResponse listGlobalConnectionBandwidths(
        ListGlobalConnectionBandwidthsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listGlobalConnectionBandwidths);
    }

    /**
     * 查询全域互联带宽列表
     *
     * 查询全域互联带宽列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalConnectionBandwidthsRequest 请求对象
     * @return SyncInvoker<ListGlobalConnectionBandwidthsRequest, ListGlobalConnectionBandwidthsResponse>
     */
    public SyncInvoker<ListGlobalConnectionBandwidthsRequest, ListGlobalConnectionBandwidthsResponse> listGlobalConnectionBandwidthsInvoker(
        ListGlobalConnectionBandwidthsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listGlobalConnectionBandwidths, hcClient);
    }

    /**
     * 查询符合绑定条件的全域互联带宽列表
     *
     * 查询符合绑定条件的全域互联带宽列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportBindingConnectionBandwidthsRequest 请求对象
     * @return ListSupportBindingConnectionBandwidthsResponse
     */
    public ListSupportBindingConnectionBandwidthsResponse listSupportBindingConnectionBandwidths(
        ListSupportBindingConnectionBandwidthsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listSupportBindingConnectionBandwidths);
    }

    /**
     * 查询符合绑定条件的全域互联带宽列表
     *
     * 查询符合绑定条件的全域互联带宽列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportBindingConnectionBandwidthsRequest 请求对象
     * @return SyncInvoker<ListSupportBindingConnectionBandwidthsRequest, ListSupportBindingConnectionBandwidthsResponse>
     */
    public SyncInvoker<ListSupportBindingConnectionBandwidthsRequest, ListSupportBindingConnectionBandwidthsResponse> listSupportBindingConnectionBandwidthsInvoker(
        ListSupportBindingConnectionBandwidthsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listSupportBindingConnectionBandwidths, hcClient);
    }

    /**
     * 查询全域互联带宽详情
     *
     * 查询全域互联带宽详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalConnectionBandwidthRequest 请求对象
     * @return ShowGlobalConnectionBandwidthResponse
     */
    public ShowGlobalConnectionBandwidthResponse showGlobalConnectionBandwidth(
        ShowGlobalConnectionBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.showGlobalConnectionBandwidth);
    }

    /**
     * 查询全域互联带宽详情
     *
     * 查询全域互联带宽详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalConnectionBandwidthRequest 请求对象
     * @return SyncInvoker<ShowGlobalConnectionBandwidthRequest, ShowGlobalConnectionBandwidthResponse>
     */
    public SyncInvoker<ShowGlobalConnectionBandwidthRequest, ShowGlobalConnectionBandwidthResponse> showGlobalConnectionBandwidthInvoker(
        ShowGlobalConnectionBandwidthRequest request) {
        return new SyncInvoker<>(request, CcMeta.showGlobalConnectionBandwidth, hcClient);
    }

    /**
     * 更新全域互联带宽详情
     *
     * 更新全域互联带宽详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGlobalConnectionBandwidthRequest 请求对象
     * @return UpdateGlobalConnectionBandwidthResponse
     */
    public UpdateGlobalConnectionBandwidthResponse updateGlobalConnectionBandwidth(
        UpdateGlobalConnectionBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.updateGlobalConnectionBandwidth);
    }

    /**
     * 更新全域互联带宽详情
     *
     * 更新全域互联带宽详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGlobalConnectionBandwidthRequest 请求对象
     * @return SyncInvoker<UpdateGlobalConnectionBandwidthRequest, UpdateGlobalConnectionBandwidthResponse>
     */
    public SyncInvoker<UpdateGlobalConnectionBandwidthRequest, UpdateGlobalConnectionBandwidthResponse> updateGlobalConnectionBandwidthInvoker(
        UpdateGlobalConnectionBandwidthRequest request) {
        return new SyncInvoker<>(request, CcMeta.updateGlobalConnectionBandwidth, hcClient);
    }

    /**
     * 创建域间带宽实例
     *
     * 创建域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInterRegionBandwidthRequest 请求对象
     * @return CreateInterRegionBandwidthResponse
     */
    public CreateInterRegionBandwidthResponse createInterRegionBandwidth(CreateInterRegionBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.createInterRegionBandwidth);
    }

    /**
     * 创建域间带宽实例
     *
     * 创建域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInterRegionBandwidthRequest 请求对象
     * @return SyncInvoker<CreateInterRegionBandwidthRequest, CreateInterRegionBandwidthResponse>
     */
    public SyncInvoker<CreateInterRegionBandwidthRequest, CreateInterRegionBandwidthResponse> createInterRegionBandwidthInvoker(
        CreateInterRegionBandwidthRequest request) {
        return new SyncInvoker<>(request, CcMeta.createInterRegionBandwidth, hcClient);
    }

    /**
     * 删除域间带宽实例
     *
     * 删除域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInterRegionBandwidthRequest 请求对象
     * @return DeleteInterRegionBandwidthResponse
     */
    public DeleteInterRegionBandwidthResponse deleteInterRegionBandwidth(DeleteInterRegionBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.deleteInterRegionBandwidth);
    }

    /**
     * 删除域间带宽实例
     *
     * 删除域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInterRegionBandwidthRequest 请求对象
     * @return SyncInvoker<DeleteInterRegionBandwidthRequest, DeleteInterRegionBandwidthResponse>
     */
    public SyncInvoker<DeleteInterRegionBandwidthRequest, DeleteInterRegionBandwidthResponse> deleteInterRegionBandwidthInvoker(
        DeleteInterRegionBandwidthRequest request) {
        return new SyncInvoker<>(request, CcMeta.deleteInterRegionBandwidth, hcClient);
    }

    /**
     * 查询域间带宽列表
     *
     * 查询域间带宽列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInterRegionBandwidthsRequest 请求对象
     * @return ListInterRegionBandwidthsResponse
     */
    public ListInterRegionBandwidthsResponse listInterRegionBandwidths(ListInterRegionBandwidthsRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listInterRegionBandwidths);
    }

    /**
     * 查询域间带宽列表
     *
     * 查询域间带宽列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInterRegionBandwidthsRequest 请求对象
     * @return SyncInvoker<ListInterRegionBandwidthsRequest, ListInterRegionBandwidthsResponse>
     */
    public SyncInvoker<ListInterRegionBandwidthsRequest, ListInterRegionBandwidthsResponse> listInterRegionBandwidthsInvoker(
        ListInterRegionBandwidthsRequest request) {
        return new SyncInvoker<>(request, CcMeta.listInterRegionBandwidths, hcClient);
    }

    /**
     * 查询域间带宽实例
     *
     * 查询域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInterRegionBandwidthRequest 请求对象
     * @return ShowInterRegionBandwidthResponse
     */
    public ShowInterRegionBandwidthResponse showInterRegionBandwidth(ShowInterRegionBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.showInterRegionBandwidth);
    }

    /**
     * 查询域间带宽实例
     *
     * 查询域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInterRegionBandwidthRequest 请求对象
     * @return SyncInvoker<ShowInterRegionBandwidthRequest, ShowInterRegionBandwidthResponse>
     */
    public SyncInvoker<ShowInterRegionBandwidthRequest, ShowInterRegionBandwidthResponse> showInterRegionBandwidthInvoker(
        ShowInterRegionBandwidthRequest request) {
        return new SyncInvoker<>(request, CcMeta.showInterRegionBandwidth, hcClient);
    }

    /**
     * 更新域间带宽实例
     *
     * 更新域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInterRegionBandwidthRequest 请求对象
     * @return UpdateInterRegionBandwidthResponse
     */
    public UpdateInterRegionBandwidthResponse updateInterRegionBandwidth(UpdateInterRegionBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.updateInterRegionBandwidth);
    }

    /**
     * 更新域间带宽实例
     *
     * 更新域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInterRegionBandwidthRequest 请求对象
     * @return SyncInvoker<UpdateInterRegionBandwidthRequest, UpdateInterRegionBandwidthResponse>
     */
    public SyncInvoker<UpdateInterRegionBandwidthRequest, UpdateInterRegionBandwidthResponse> updateInterRegionBandwidthInvoker(
        UpdateInterRegionBandwidthRequest request) {
        return new SyncInvoker<>(request, CcMeta.updateInterRegionBandwidth, hcClient);
    }

    /**
     * 创建网络实例
     *
     * 创建网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNetworkInstanceRequest 请求对象
     * @return CreateNetworkInstanceResponse
     */
    public CreateNetworkInstanceResponse createNetworkInstance(CreateNetworkInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.createNetworkInstance);
    }

    /**
     * 创建网络实例
     *
     * 创建网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNetworkInstanceRequest 请求对象
     * @return SyncInvoker<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse>
     */
    public SyncInvoker<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse> createNetworkInstanceInvoker(
        CreateNetworkInstanceRequest request) {
        return new SyncInvoker<>(request, CcMeta.createNetworkInstance, hcClient);
    }

    /**
     * 删除网络实例
     *
     * 删除网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNetworkInstanceRequest 请求对象
     * @return DeleteNetworkInstanceResponse
     */
    public DeleteNetworkInstanceResponse deleteNetworkInstance(DeleteNetworkInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.deleteNetworkInstance);
    }

    /**
     * 删除网络实例
     *
     * 删除网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNetworkInstanceRequest 请求对象
     * @return SyncInvoker<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse>
     */
    public SyncInvoker<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse> deleteNetworkInstanceInvoker(
        DeleteNetworkInstanceRequest request) {
        return new SyncInvoker<>(request, CcMeta.deleteNetworkInstance, hcClient);
    }

    /**
     * 查询网络实例列表
     *
     * 查询云连接列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkInstancesRequest 请求对象
     * @return ListNetworkInstancesResponse
     */
    public ListNetworkInstancesResponse listNetworkInstances(ListNetworkInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.listNetworkInstances);
    }

    /**
     * 查询网络实例列表
     *
     * 查询云连接列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkInstancesRequest 请求对象
     * @return SyncInvoker<ListNetworkInstancesRequest, ListNetworkInstancesResponse>
     */
    public SyncInvoker<ListNetworkInstancesRequest, ListNetworkInstancesResponse> listNetworkInstancesInvoker(
        ListNetworkInstancesRequest request) {
        return new SyncInvoker<>(request, CcMeta.listNetworkInstances, hcClient);
    }

    /**
     * 查询网络实例
     *
     * 查询网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkInstanceRequest 请求对象
     * @return ShowNetworkInstanceResponse
     */
    public ShowNetworkInstanceResponse showNetworkInstance(ShowNetworkInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.showNetworkInstance);
    }

    /**
     * 查询网络实例
     *
     * 查询网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkInstanceRequest 请求对象
     * @return SyncInvoker<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse>
     */
    public SyncInvoker<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse> showNetworkInstanceInvoker(
        ShowNetworkInstanceRequest request) {
        return new SyncInvoker<>(request, CcMeta.showNetworkInstance, hcClient);
    }

    /**
     * 更新网络实例
     *
     * 更新网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNetworkInstanceRequest 请求对象
     * @return UpdateNetworkInstanceResponse
     */
    public UpdateNetworkInstanceResponse updateNetworkInstance(UpdateNetworkInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CcMeta.updateNetworkInstance);
    }

    /**
     * 更新网络实例
     *
     * 更新网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNetworkInstanceRequest 请求对象
     * @return SyncInvoker<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse>
     */
    public SyncInvoker<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse> updateNetworkInstanceInvoker(
        UpdateNetworkInstanceRequest request) {
        return new SyncInvoker<>(request, CcMeta.updateNetworkInstance, hcClient);
    }

}
