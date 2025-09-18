package com.huaweicloud.sdk.cc.v3;

import com.huaweicloud.sdk.cc.v3.model.ApplyCentralNetworkPolicyRequest;
import com.huaweicloud.sdk.cc.v3.model.ApplyCentralNetworkPolicyResponse;
import com.huaweicloud.sdk.cc.v3.model.AssociateBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.AssociateBandwidthPackageResponse;
import com.huaweicloud.sdk.cc.v3.model.AssociateGlobalConnectionBandwidthInstanceRequest;
import com.huaweicloud.sdk.cc.v3.model.AssociateGlobalConnectionBandwidthInstanceResponse;
import com.huaweicloud.sdk.cc.v3.model.AssociateSiteNetworkBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.AssociateSiteNetworkBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.BatchCreateGcbResourceTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.BatchCreateGcbResourceTagsResponse;
import com.huaweicloud.sdk.cc.v3.model.BatchDeleteGcbResourceTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.BatchDeleteGcbResourceTagsResponse;
import com.huaweicloud.sdk.cc.v3.model.CountGcbResourceByTagRequest;
import com.huaweicloud.sdk.cc.v3.model.CountGcbResourceByTagResponse;
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
import com.huaweicloud.sdk.cc.v3.model.CreateGcbResourceTagRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateGcbResourceTagResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateGlobalConnectionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateGlobalConnectionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateInterRegionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateInterRegionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateNetworkInstanceRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateNetworkInstanceResponse;
import com.huaweicloud.sdk.cc.v3.model.CreateP2PSiteNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.CreateP2PSiteNetworkResponse;
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
import com.huaweicloud.sdk.cc.v3.model.DeleteGcbResourceTagRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteGcbResourceTagResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteGlobalConnectionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteGlobalConnectionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteInterRegionBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteInterRegionBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteNetworkInstanceRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteNetworkInstanceResponse;
import com.huaweicloud.sdk.cc.v3.model.DeleteSiteNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.DeleteSiteNetworkResponse;
import com.huaweicloud.sdk.cc.v3.model.DisassociateBandwidthPackageRequest;
import com.huaweicloud.sdk.cc.v3.model.DisassociateBandwidthPackageResponse;
import com.huaweicloud.sdk.cc.v3.model.DisassociateGlobalConnectionBandwidthInstanceRequest;
import com.huaweicloud.sdk.cc.v3.model.DisassociateGlobalConnectionBandwidthInstanceResponse;
import com.huaweicloud.sdk.cc.v3.model.DisassociateSiteNetworkBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.DisassociateSiteNetworkBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.ListAreaBandwidthPackageSpecificationsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListAreaBandwidthPackageSpecificationsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListAreasRequest;
import com.huaweicloud.sdk.cc.v3.model.ListAreasResponse;
import com.huaweicloud.sdk.cc.v3.model.ListAuthorisationsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListAuthorisationsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackageLevelsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackageLevelsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackageLinesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackageLinesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackageSitesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListBandwidthPackageSitesResponse;
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
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionCapabilitiesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListCloudConnectionCapabilitiesResponse;
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
import com.huaweicloud.sdk.cc.v3.model.ListGcbResourceByTagRequest;
import com.huaweicloud.sdk.cc.v3.model.ListGcbResourceByTagResponse;
import com.huaweicloud.sdk.cc.v3.model.ListGcbResourceTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListGcbResourceTagsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListGcbTenantTagsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListGcbTenantTagsResponse;
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
import com.huaweicloud.sdk.cc.v3.model.ListRegionBandwidthPackageSpecificationsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListRegionBandwidthPackageSpecificationsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListRegionsRequest;
import com.huaweicloud.sdk.cc.v3.model.ListRegionsResponse;
import com.huaweicloud.sdk.cc.v3.model.ListSiteNetworkCapabilitiesRequest;
import com.huaweicloud.sdk.cc.v3.model.ListSiteNetworkCapabilitiesResponse;
import com.huaweicloud.sdk.cc.v3.model.ListSiteNetworkQuotasRequest;
import com.huaweicloud.sdk.cc.v3.model.ListSiteNetworkQuotasResponse;
import com.huaweicloud.sdk.cc.v3.model.ListSiteNetworksRequest;
import com.huaweicloud.sdk.cc.v3.model.ListSiteNetworksResponse;
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
import com.huaweicloud.sdk.cc.v3.model.ShowSiteNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.ShowSiteNetworkResponse;
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
import com.huaweicloud.sdk.cc.v3.model.UpdateSiteNetworkBandwidthRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateSiteNetworkBandwidthResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateSiteNetworkBandwidthSizeRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateSiteNetworkBandwidthSizeResponse;
import com.huaweicloud.sdk.cc.v3.model.UpdateSiteNetworkRequest;
import com.huaweicloud.sdk.cc.v3.model.UpdateSiteNetworkResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CcAsyncClient {

    protected HcClient hcClient;

    public CcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CcAsyncClient> newBuilder() {
        ClientBuilder<CcAsyncClient> clientBuilder = new ClientBuilder<>(CcAsyncClient::new, "GlobalCredentials");
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
     * @return CompletableFuture<CreateAuthorisationResponse>
     */
    public CompletableFuture<CreateAuthorisationResponse> createAuthorisationAsync(CreateAuthorisationRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.createAuthorisation);
    }

    /**
     * 创建授权
     *
     * 网络实例所属租户授予云连接实例所属租户加载其网络实例的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuthorisationRequest 请求对象
     * @return AsyncInvoker<CreateAuthorisationRequest, CreateAuthorisationResponse>
     */
    public AsyncInvoker<CreateAuthorisationRequest, CreateAuthorisationResponse> createAuthorisationAsyncInvoker(
        CreateAuthorisationRequest request) {
        return new AsyncInvoker<>(request, CcMeta.createAuthorisation, hcClient);
    }

    /**
     * 删除授权
     *
     * 网络实例所属租户取消授予云连接实例所属租户加载其网络实例的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuthorisationRequest 请求对象
     * @return CompletableFuture<DeleteAuthorisationResponse>
     */
    public CompletableFuture<DeleteAuthorisationResponse> deleteAuthorisationAsync(DeleteAuthorisationRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.deleteAuthorisation);
    }

    /**
     * 删除授权
     *
     * 网络实例所属租户取消授予云连接实例所属租户加载其网络实例的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuthorisationRequest 请求对象
     * @return AsyncInvoker<DeleteAuthorisationRequest, DeleteAuthorisationResponse>
     */
    public AsyncInvoker<DeleteAuthorisationRequest, DeleteAuthorisationResponse> deleteAuthorisationAsyncInvoker(
        DeleteAuthorisationRequest request) {
        return new AsyncInvoker<>(request, CcMeta.deleteAuthorisation, hcClient);
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
     * @return CompletableFuture<ListAuthorisationsResponse>
     */
    public CompletableFuture<ListAuthorisationsResponse> listAuthorisationsAsync(ListAuthorisationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listAuthorisations);
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
     * @return AsyncInvoker<ListAuthorisationsRequest, ListAuthorisationsResponse>
     */
    public AsyncInvoker<ListAuthorisationsRequest, ListAuthorisationsResponse> listAuthorisationsAsyncInvoker(
        ListAuthorisationsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listAuthorisations, hcClient);
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
     * @return CompletableFuture<ListPermissionsResponse>
     */
    public CompletableFuture<ListPermissionsResponse> listPermissionsAsync(ListPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listPermissions);
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
     * @return AsyncInvoker<ListPermissionsRequest, ListPermissionsResponse>
     */
    public AsyncInvoker<ListPermissionsRequest, ListPermissionsResponse> listPermissionsAsyncInvoker(
        ListPermissionsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listPermissions, hcClient);
    }

    /**
     * 更新授权
     *
     * 更新授权实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuthorisationRequest 请求对象
     * @return CompletableFuture<UpdateAuthorisationResponse>
     */
    public CompletableFuture<UpdateAuthorisationResponse> updateAuthorisationAsync(UpdateAuthorisationRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.updateAuthorisation);
    }

    /**
     * 更新授权
     *
     * 更新授权实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuthorisationRequest 请求对象
     * @return AsyncInvoker<UpdateAuthorisationRequest, UpdateAuthorisationResponse>
     */
    public AsyncInvoker<UpdateAuthorisationRequest, UpdateAuthorisationResponse> updateAuthorisationAsyncInvoker(
        UpdateAuthorisationRequest request) {
        return new AsyncInvoker<>(request, CcMeta.updateAuthorisation, hcClient);
    }

    /**
     * 将带宽包实例绑定到云连接实例
     *
     * 将带宽包实例绑定到云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateBandwidthPackageRequest 请求对象
     * @return CompletableFuture<AssociateBandwidthPackageResponse>
     */
    public CompletableFuture<AssociateBandwidthPackageResponse> associateBandwidthPackageAsync(
        AssociateBandwidthPackageRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.associateBandwidthPackage);
    }

    /**
     * 将带宽包实例绑定到云连接实例
     *
     * 将带宽包实例绑定到云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateBandwidthPackageRequest 请求对象
     * @return AsyncInvoker<AssociateBandwidthPackageRequest, AssociateBandwidthPackageResponse>
     */
    public AsyncInvoker<AssociateBandwidthPackageRequest, AssociateBandwidthPackageResponse> associateBandwidthPackageAsyncInvoker(
        AssociateBandwidthPackageRequest request) {
        return new AsyncInvoker<>(request, CcMeta.associateBandwidthPackage, hcClient);
    }

    /**
     * 创建带宽包实例
     *
     * 创建带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBandwidthPackageRequest 请求对象
     * @return CompletableFuture<CreateBandwidthPackageResponse>
     */
    public CompletableFuture<CreateBandwidthPackageResponse> createBandwidthPackageAsync(
        CreateBandwidthPackageRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.createBandwidthPackage);
    }

    /**
     * 创建带宽包实例
     *
     * 创建带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBandwidthPackageRequest 请求对象
     * @return AsyncInvoker<CreateBandwidthPackageRequest, CreateBandwidthPackageResponse>
     */
    public AsyncInvoker<CreateBandwidthPackageRequest, CreateBandwidthPackageResponse> createBandwidthPackageAsyncInvoker(
        CreateBandwidthPackageRequest request) {
        return new AsyncInvoker<>(request, CcMeta.createBandwidthPackage, hcClient);
    }

    /**
     * 删除带宽包实例
     *
     * 删除带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBandwidthPackageRequest 请求对象
     * @return CompletableFuture<DeleteBandwidthPackageResponse>
     */
    public CompletableFuture<DeleteBandwidthPackageResponse> deleteBandwidthPackageAsync(
        DeleteBandwidthPackageRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.deleteBandwidthPackage);
    }

    /**
     * 删除带宽包实例
     *
     * 删除带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBandwidthPackageRequest 请求对象
     * @return AsyncInvoker<DeleteBandwidthPackageRequest, DeleteBandwidthPackageResponse>
     */
    public AsyncInvoker<DeleteBandwidthPackageRequest, DeleteBandwidthPackageResponse> deleteBandwidthPackageAsyncInvoker(
        DeleteBandwidthPackageRequest request) {
        return new AsyncInvoker<>(request, CcMeta.deleteBandwidthPackage, hcClient);
    }

    /**
     * 解除带宽包实例与云连接实例的绑定
     *
     * 解除带宽包实例与云连接实例的绑定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateBandwidthPackageRequest 请求对象
     * @return CompletableFuture<DisassociateBandwidthPackageResponse>
     */
    public CompletableFuture<DisassociateBandwidthPackageResponse> disassociateBandwidthPackageAsync(
        DisassociateBandwidthPackageRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.disassociateBandwidthPackage);
    }

    /**
     * 解除带宽包实例与云连接实例的绑定
     *
     * 解除带宽包实例与云连接实例的绑定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateBandwidthPackageRequest 请求对象
     * @return AsyncInvoker<DisassociateBandwidthPackageRequest, DisassociateBandwidthPackageResponse>
     */
    public AsyncInvoker<DisassociateBandwidthPackageRequest, DisassociateBandwidthPackageResponse> disassociateBandwidthPackageAsyncInvoker(
        DisassociateBandwidthPackageRequest request) {
        return new AsyncInvoker<>(request, CcMeta.disassociateBandwidthPackage, hcClient);
    }

    /**
     * 查询带宽包的标签信息
     *
     * 查询带宽包的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthPackageTagsRequest 请求对象
     * @return CompletableFuture<ListBandwidthPackageTagsResponse>
     */
    public CompletableFuture<ListBandwidthPackageTagsResponse> listBandwidthPackageTagsAsync(
        ListBandwidthPackageTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listBandwidthPackageTags);
    }

    /**
     * 查询带宽包的标签信息
     *
     * 查询带宽包的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthPackageTagsRequest 请求对象
     * @return AsyncInvoker<ListBandwidthPackageTagsRequest, ListBandwidthPackageTagsResponse>
     */
    public AsyncInvoker<ListBandwidthPackageTagsRequest, ListBandwidthPackageTagsResponse> listBandwidthPackageTagsAsyncInvoker(
        ListBandwidthPackageTagsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listBandwidthPackageTags, hcClient);
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
     * @return CompletableFuture<ListBandwidthPackagesResponse>
     */
    public CompletableFuture<ListBandwidthPackagesResponse> listBandwidthPackagesAsync(
        ListBandwidthPackagesRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listBandwidthPackages);
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
     * @return AsyncInvoker<ListBandwidthPackagesRequest, ListBandwidthPackagesResponse>
     */
    public AsyncInvoker<ListBandwidthPackagesRequest, ListBandwidthPackagesResponse> listBandwidthPackagesAsyncInvoker(
        ListBandwidthPackagesRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listBandwidthPackages, hcClient);
    }

    /**
     * 通过标签过滤带宽包实例
     *
     * 通过标签过滤带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthPackagesByTagsRequest 请求对象
     * @return CompletableFuture<ListBandwidthPackagesByTagsResponse>
     */
    public CompletableFuture<ListBandwidthPackagesByTagsResponse> listBandwidthPackagesByTagsAsync(
        ListBandwidthPackagesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listBandwidthPackagesByTags);
    }

    /**
     * 通过标签过滤带宽包实例
     *
     * 通过标签过滤带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthPackagesByTagsRequest 请求对象
     * @return AsyncInvoker<ListBandwidthPackagesByTagsRequest, ListBandwidthPackagesByTagsResponse>
     */
    public AsyncInvoker<ListBandwidthPackagesByTagsRequest, ListBandwidthPackagesByTagsResponse> listBandwidthPackagesByTagsAsyncInvoker(
        ListBandwidthPackagesByTagsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listBandwidthPackagesByTags, hcClient);
    }

    /**
     * 查询带宽包实例
     *
     * 查询带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBandwidthPackageRequest 请求对象
     * @return CompletableFuture<ShowBandwidthPackageResponse>
     */
    public CompletableFuture<ShowBandwidthPackageResponse> showBandwidthPackageAsync(
        ShowBandwidthPackageRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.showBandwidthPackage);
    }

    /**
     * 查询带宽包实例
     *
     * 查询带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBandwidthPackageRequest 请求对象
     * @return AsyncInvoker<ShowBandwidthPackageRequest, ShowBandwidthPackageResponse>
     */
    public AsyncInvoker<ShowBandwidthPackageRequest, ShowBandwidthPackageResponse> showBandwidthPackageAsyncInvoker(
        ShowBandwidthPackageRequest request) {
        return new AsyncInvoker<>(request, CcMeta.showBandwidthPackage, hcClient);
    }

    /**
     * 创建带宽包标签
     *
     * 创建带宽包标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagBandwidthPackageRequest 请求对象
     * @return CompletableFuture<TagBandwidthPackageResponse>
     */
    public CompletableFuture<TagBandwidthPackageResponse> tagBandwidthPackageAsync(TagBandwidthPackageRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.tagBandwidthPackage);
    }

    /**
     * 创建带宽包标签
     *
     * 创建带宽包标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagBandwidthPackageRequest 请求对象
     * @return AsyncInvoker<TagBandwidthPackageRequest, TagBandwidthPackageResponse>
     */
    public AsyncInvoker<TagBandwidthPackageRequest, TagBandwidthPackageResponse> tagBandwidthPackageAsyncInvoker(
        TagBandwidthPackageRequest request) {
        return new AsyncInvoker<>(request, CcMeta.tagBandwidthPackage, hcClient);
    }

    /**
     * 删除带宽包标签
     *
     * 删除带宽包标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UntagBandwidthPackageRequest 请求对象
     * @return CompletableFuture<UntagBandwidthPackageResponse>
     */
    public CompletableFuture<UntagBandwidthPackageResponse> untagBandwidthPackageAsync(
        UntagBandwidthPackageRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.untagBandwidthPackage);
    }

    /**
     * 删除带宽包标签
     *
     * 删除带宽包标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UntagBandwidthPackageRequest 请求对象
     * @return AsyncInvoker<UntagBandwidthPackageRequest, UntagBandwidthPackageResponse>
     */
    public AsyncInvoker<UntagBandwidthPackageRequest, UntagBandwidthPackageResponse> untagBandwidthPackageAsyncInvoker(
        UntagBandwidthPackageRequest request) {
        return new AsyncInvoker<>(request, CcMeta.untagBandwidthPackage, hcClient);
    }

    /**
     * 更新带宽包实例
     *
     * 更新带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBandwidthPackageRequest 请求对象
     * @return CompletableFuture<UpdateBandwidthPackageResponse>
     */
    public CompletableFuture<UpdateBandwidthPackageResponse> updateBandwidthPackageAsync(
        UpdateBandwidthPackageRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.updateBandwidthPackage);
    }

    /**
     * 更新带宽包实例
     *
     * 更新带宽包实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBandwidthPackageRequest 请求对象
     * @return AsyncInvoker<UpdateBandwidthPackageRequest, UpdateBandwidthPackageResponse>
     */
    public AsyncInvoker<UpdateBandwidthPackageRequest, UpdateBandwidthPackageResponse> updateBandwidthPackageAsyncInvoker(
        UpdateBandwidthPackageRequest request) {
        return new AsyncInvoker<>(request, CcMeta.updateBandwidthPackage, hcClient);
    }

    /**
     * 应用中心网络策略
     *
     * 应用中心网络策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyCentralNetworkPolicyRequest 请求对象
     * @return CompletableFuture<ApplyCentralNetworkPolicyResponse>
     */
    public CompletableFuture<ApplyCentralNetworkPolicyResponse> applyCentralNetworkPolicyAsync(
        ApplyCentralNetworkPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.applyCentralNetworkPolicy);
    }

    /**
     * 应用中心网络策略
     *
     * 应用中心网络策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyCentralNetworkPolicyRequest 请求对象
     * @return AsyncInvoker<ApplyCentralNetworkPolicyRequest, ApplyCentralNetworkPolicyResponse>
     */
    public AsyncInvoker<ApplyCentralNetworkPolicyRequest, ApplyCentralNetworkPolicyResponse> applyCentralNetworkPolicyAsyncInvoker(
        ApplyCentralNetworkPolicyRequest request) {
        return new AsyncInvoker<>(request, CcMeta.applyCentralNetworkPolicy, hcClient);
    }

    /**
     * 创建中心网络
     *
     * 创建中心网络。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCentralNetworkRequest 请求对象
     * @return CompletableFuture<CreateCentralNetworkResponse>
     */
    public CompletableFuture<CreateCentralNetworkResponse> createCentralNetworkAsync(
        CreateCentralNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.createCentralNetwork);
    }

    /**
     * 创建中心网络
     *
     * 创建中心网络。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCentralNetworkRequest 请求对象
     * @return AsyncInvoker<CreateCentralNetworkRequest, CreateCentralNetworkResponse>
     */
    public AsyncInvoker<CreateCentralNetworkRequest, CreateCentralNetworkResponse> createCentralNetworkAsyncInvoker(
        CreateCentralNetworkRequest request) {
        return new AsyncInvoker<>(request, CcMeta.createCentralNetwork, hcClient);
    }

    /**
     * 创建一个新版本的中心网络策略
     *
     * 创建一份只读的中心网络的策略。如果您有策略文档内容改动，需要基于此版本重新创建一个新版本的策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCentralNetworkPolicyRequest 请求对象
     * @return CompletableFuture<CreateCentralNetworkPolicyResponse>
     */
    public CompletableFuture<CreateCentralNetworkPolicyResponse> createCentralNetworkPolicyAsync(
        CreateCentralNetworkPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.createCentralNetworkPolicy);
    }

    /**
     * 创建一个新版本的中心网络策略
     *
     * 创建一份只读的中心网络的策略。如果您有策略文档内容改动，需要基于此版本重新创建一个新版本的策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCentralNetworkPolicyRequest 请求对象
     * @return AsyncInvoker<CreateCentralNetworkPolicyRequest, CreateCentralNetworkPolicyResponse>
     */
    public AsyncInvoker<CreateCentralNetworkPolicyRequest, CreateCentralNetworkPolicyResponse> createCentralNetworkPolicyAsyncInvoker(
        CreateCentralNetworkPolicyRequest request) {
        return new AsyncInvoker<>(request, CcMeta.createCentralNetworkPolicy, hcClient);
    }

    /**
     * 删除中心网络
     *
     * 删除中心网络，请先清除附件后再删除中心网络。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCentralNetworkRequest 请求对象
     * @return CompletableFuture<DeleteCentralNetworkResponse>
     */
    public CompletableFuture<DeleteCentralNetworkResponse> deleteCentralNetworkAsync(
        DeleteCentralNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.deleteCentralNetwork);
    }

    /**
     * 删除中心网络
     *
     * 删除中心网络，请先清除附件后再删除中心网络。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCentralNetworkRequest 请求对象
     * @return AsyncInvoker<DeleteCentralNetworkRequest, DeleteCentralNetworkResponse>
     */
    public AsyncInvoker<DeleteCentralNetworkRequest, DeleteCentralNetworkResponse> deleteCentralNetworkAsyncInvoker(
        DeleteCentralNetworkRequest request) {
        return new AsyncInvoker<>(request, CcMeta.deleteCentralNetwork, hcClient);
    }

    /**
     * 删除中心网络策略版本
     *
     * 删除中心网络策略版本。您无法删除正在被应用的中心策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCentralNetworkPolicyRequest 请求对象
     * @return CompletableFuture<DeleteCentralNetworkPolicyResponse>
     */
    public CompletableFuture<DeleteCentralNetworkPolicyResponse> deleteCentralNetworkPolicyAsync(
        DeleteCentralNetworkPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.deleteCentralNetworkPolicy);
    }

    /**
     * 删除中心网络策略版本
     *
     * 删除中心网络策略版本。您无法删除正在被应用的中心策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCentralNetworkPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteCentralNetworkPolicyRequest, DeleteCentralNetworkPolicyResponse>
     */
    public AsyncInvoker<DeleteCentralNetworkPolicyRequest, DeleteCentralNetworkPolicyResponse> deleteCentralNetworkPolicyAsyncInvoker(
        DeleteCentralNetworkPolicyRequest request) {
        return new AsyncInvoker<>(request, CcMeta.deleteCentralNetworkPolicy, hcClient);
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
     * @return CompletableFuture<ListCentralNetworkPoliciesResponse>
     */
    public CompletableFuture<ListCentralNetworkPoliciesResponse> listCentralNetworkPoliciesAsync(
        ListCentralNetworkPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listCentralNetworkPolicies);
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
     * @return AsyncInvoker<ListCentralNetworkPoliciesRequest, ListCentralNetworkPoliciesResponse>
     */
    public AsyncInvoker<ListCentralNetworkPoliciesRequest, ListCentralNetworkPoliciesResponse> listCentralNetworkPoliciesAsyncInvoker(
        ListCentralNetworkPoliciesRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listCentralNetworkPolicies, hcClient);
    }

    /**
     * 查询中心网络策略变化集
     *
     * 查询与当前应用中心网络策略的变化集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkPolicyChangeSetRequest 请求对象
     * @return CompletableFuture<ListCentralNetworkPolicyChangeSetResponse>
     */
    public CompletableFuture<ListCentralNetworkPolicyChangeSetResponse> listCentralNetworkPolicyChangeSetAsync(
        ListCentralNetworkPolicyChangeSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listCentralNetworkPolicyChangeSet);
    }

    /**
     * 查询中心网络策略变化集
     *
     * 查询与当前应用中心网络策略的变化集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkPolicyChangeSetRequest 请求对象
     * @return AsyncInvoker<ListCentralNetworkPolicyChangeSetRequest, ListCentralNetworkPolicyChangeSetResponse>
     */
    public AsyncInvoker<ListCentralNetworkPolicyChangeSetRequest, ListCentralNetworkPolicyChangeSetResponse> listCentralNetworkPolicyChangeSetAsyncInvoker(
        ListCentralNetworkPolicyChangeSetRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listCentralNetworkPolicyChangeSet, hcClient);
    }

    /**
     * 查询中心网络的标签信息
     *
     * 查询中心网络的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkTagsRequest 请求对象
     * @return CompletableFuture<ListCentralNetworkTagsResponse>
     */
    public CompletableFuture<ListCentralNetworkTagsResponse> listCentralNetworkTagsAsync(
        ListCentralNetworkTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listCentralNetworkTags);
    }

    /**
     * 查询中心网络的标签信息
     *
     * 查询中心网络的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkTagsRequest 请求对象
     * @return AsyncInvoker<ListCentralNetworkTagsRequest, ListCentralNetworkTagsResponse>
     */
    public AsyncInvoker<ListCentralNetworkTagsRequest, ListCentralNetworkTagsResponse> listCentralNetworkTagsAsyncInvoker(
        ListCentralNetworkTagsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listCentralNetworkTags, hcClient);
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
     * @return CompletableFuture<ListCentralNetworksResponse>
     */
    public CompletableFuture<ListCentralNetworksResponse> listCentralNetworksAsync(ListCentralNetworksRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listCentralNetworks);
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
     * @return AsyncInvoker<ListCentralNetworksRequest, ListCentralNetworksResponse>
     */
    public AsyncInvoker<ListCentralNetworksRequest, ListCentralNetworksResponse> listCentralNetworksAsyncInvoker(
        ListCentralNetworksRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listCentralNetworks, hcClient);
    }

    /**
     * 通过标签过滤中心网络实例
     *
     * 通过标签过滤中心网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworksByTagsRequest 请求对象
     * @return CompletableFuture<ListCentralNetworksByTagsResponse>
     */
    public CompletableFuture<ListCentralNetworksByTagsResponse> listCentralNetworksByTagsAsync(
        ListCentralNetworksByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listCentralNetworksByTags);
    }

    /**
     * 通过标签过滤中心网络实例
     *
     * 通过标签过滤中心网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworksByTagsRequest 请求对象
     * @return AsyncInvoker<ListCentralNetworksByTagsRequest, ListCentralNetworksByTagsResponse>
     */
    public AsyncInvoker<ListCentralNetworksByTagsRequest, ListCentralNetworksByTagsResponse> listCentralNetworksByTagsAsyncInvoker(
        ListCentralNetworksByTagsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listCentralNetworksByTags, hcClient);
    }

    /**
     * 查询中心网络详情
     *
     * 查询中心网络详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCentralNetworkRequest 请求对象
     * @return CompletableFuture<ShowCentralNetworkResponse>
     */
    public CompletableFuture<ShowCentralNetworkResponse> showCentralNetworkAsync(ShowCentralNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.showCentralNetwork);
    }

    /**
     * 查询中心网络详情
     *
     * 查询中心网络详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCentralNetworkRequest 请求对象
     * @return AsyncInvoker<ShowCentralNetworkRequest, ShowCentralNetworkResponse>
     */
    public AsyncInvoker<ShowCentralNetworkRequest, ShowCentralNetworkResponse> showCentralNetworkAsyncInvoker(
        ShowCentralNetworkRequest request) {
        return new AsyncInvoker<>(request, CcMeta.showCentralNetwork, hcClient);
    }

    /**
     * 创建中心网络标签
     *
     * 创建中心网络标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagCentralNetworkRequest 请求对象
     * @return CompletableFuture<TagCentralNetworkResponse>
     */
    public CompletableFuture<TagCentralNetworkResponse> tagCentralNetworkAsync(TagCentralNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.tagCentralNetwork);
    }

    /**
     * 创建中心网络标签
     *
     * 创建中心网络标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagCentralNetworkRequest 请求对象
     * @return AsyncInvoker<TagCentralNetworkRequest, TagCentralNetworkResponse>
     */
    public AsyncInvoker<TagCentralNetworkRequest, TagCentralNetworkResponse> tagCentralNetworkAsyncInvoker(
        TagCentralNetworkRequest request) {
        return new AsyncInvoker<>(request, CcMeta.tagCentralNetwork, hcClient);
    }

    /**
     * 删除中心网络标签
     *
     * 删除中心网络标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UntagCentralNetworkRequest 请求对象
     * @return CompletableFuture<UntagCentralNetworkResponse>
     */
    public CompletableFuture<UntagCentralNetworkResponse> untagCentralNetworkAsync(UntagCentralNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.untagCentralNetwork);
    }

    /**
     * 删除中心网络标签
     *
     * 删除中心网络标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UntagCentralNetworkRequest 请求对象
     * @return AsyncInvoker<UntagCentralNetworkRequest, UntagCentralNetworkResponse>
     */
    public AsyncInvoker<UntagCentralNetworkRequest, UntagCentralNetworkResponse> untagCentralNetworkAsyncInvoker(
        UntagCentralNetworkRequest request) {
        return new AsyncInvoker<>(request, CcMeta.untagCentralNetwork, hcClient);
    }

    /**
     * 更新中心网络详情
     *
     * 更新中心网络详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCentralNetworkRequest 请求对象
     * @return CompletableFuture<UpdateCentralNetworkResponse>
     */
    public CompletableFuture<UpdateCentralNetworkResponse> updateCentralNetworkAsync(
        UpdateCentralNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.updateCentralNetwork);
    }

    /**
     * 更新中心网络详情
     *
     * 更新中心网络详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCentralNetworkRequest 请求对象
     * @return AsyncInvoker<UpdateCentralNetworkRequest, UpdateCentralNetworkResponse>
     */
    public AsyncInvoker<UpdateCentralNetworkRequest, UpdateCentralNetworkResponse> updateCentralNetworkAsyncInvoker(
        UpdateCentralNetworkRequest request) {
        return new AsyncInvoker<>(request, CcMeta.updateCentralNetwork, hcClient);
    }

    /**
     * 创建中心网络ER路由表附件
     *
     * 创建中心网络的路由表附件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCentralNetworkErRouteTableAttachmentRequest 请求对象
     * @return CompletableFuture<CreateCentralNetworkErRouteTableAttachmentResponse>
     */
    public CompletableFuture<CreateCentralNetworkErRouteTableAttachmentResponse> createCentralNetworkErRouteTableAttachmentAsync(
        CreateCentralNetworkErRouteTableAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.createCentralNetworkErRouteTableAttachment);
    }

    /**
     * 创建中心网络ER路由表附件
     *
     * 创建中心网络的路由表附件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCentralNetworkErRouteTableAttachmentRequest 请求对象
     * @return AsyncInvoker<CreateCentralNetworkErRouteTableAttachmentRequest, CreateCentralNetworkErRouteTableAttachmentResponse>
     */
    public AsyncInvoker<CreateCentralNetworkErRouteTableAttachmentRequest, CreateCentralNetworkErRouteTableAttachmentResponse> createCentralNetworkErRouteTableAttachmentAsyncInvoker(
        CreateCentralNetworkErRouteTableAttachmentRequest request) {
        return new AsyncInvoker<>(request, CcMeta.createCentralNetworkErRouteTableAttachment, hcClient);
    }

    /**
     * 创建中心网络GDGW附件
     *
     * 创建中心网络的GDGW附件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCentralNetworkGdgwAttachmentRequest 请求对象
     * @return CompletableFuture<CreateCentralNetworkGdgwAttachmentResponse>
     */
    public CompletableFuture<CreateCentralNetworkGdgwAttachmentResponse> createCentralNetworkGdgwAttachmentAsync(
        CreateCentralNetworkGdgwAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.createCentralNetworkGdgwAttachment);
    }

    /**
     * 创建中心网络GDGW附件
     *
     * 创建中心网络的GDGW附件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCentralNetworkGdgwAttachmentRequest 请求对象
     * @return AsyncInvoker<CreateCentralNetworkGdgwAttachmentRequest, CreateCentralNetworkGdgwAttachmentResponse>
     */
    public AsyncInvoker<CreateCentralNetworkGdgwAttachmentRequest, CreateCentralNetworkGdgwAttachmentResponse> createCentralNetworkGdgwAttachmentAsyncInvoker(
        CreateCentralNetworkGdgwAttachmentRequest request) {
        return new AsyncInvoker<>(request, CcMeta.createCentralNetworkGdgwAttachment, hcClient);
    }

    /**
     * 删除中心网络附件
     *
     * 删除中心网络附件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCentralNetworkAttachmentRequest 请求对象
     * @return CompletableFuture<DeleteCentralNetworkAttachmentResponse>
     */
    public CompletableFuture<DeleteCentralNetworkAttachmentResponse> deleteCentralNetworkAttachmentAsync(
        DeleteCentralNetworkAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.deleteCentralNetworkAttachment);
    }

    /**
     * 删除中心网络附件
     *
     * 删除中心网络附件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCentralNetworkAttachmentRequest 请求对象
     * @return AsyncInvoker<DeleteCentralNetworkAttachmentRequest, DeleteCentralNetworkAttachmentResponse>
     */
    public AsyncInvoker<DeleteCentralNetworkAttachmentRequest, DeleteCentralNetworkAttachmentResponse> deleteCentralNetworkAttachmentAsyncInvoker(
        DeleteCentralNetworkAttachmentRequest request) {
        return new AsyncInvoker<>(request, CcMeta.deleteCentralNetworkAttachment, hcClient);
    }

    /**
     * 查询中心网络附件列表
     *
     * 查询中心网络附件列表，分页查询使用的参数为marker、limit。limit默认值为0，没有指定marker时返回第一条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkAttachmentsRequest 请求对象
     * @return CompletableFuture<ListCentralNetworkAttachmentsResponse>
     */
    public CompletableFuture<ListCentralNetworkAttachmentsResponse> listCentralNetworkAttachmentsAsync(
        ListCentralNetworkAttachmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listCentralNetworkAttachments);
    }

    /**
     * 查询中心网络附件列表
     *
     * 查询中心网络附件列表，分页查询使用的参数为marker、limit。limit默认值为0，没有指定marker时返回第一条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkAttachmentsRequest 请求对象
     * @return AsyncInvoker<ListCentralNetworkAttachmentsRequest, ListCentralNetworkAttachmentsResponse>
     */
    public AsyncInvoker<ListCentralNetworkAttachmentsRequest, ListCentralNetworkAttachmentsResponse> listCentralNetworkAttachmentsAsyncInvoker(
        ListCentralNetworkAttachmentsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listCentralNetworkAttachments, hcClient);
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
     * @return CompletableFuture<ListCentralNetworkErRouteTableAttachmentsResponse>
     */
    public CompletableFuture<ListCentralNetworkErRouteTableAttachmentsResponse> listCentralNetworkErRouteTableAttachmentsAsync(
        ListCentralNetworkErRouteTableAttachmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listCentralNetworkErRouteTableAttachments);
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
     * @return AsyncInvoker<ListCentralNetworkErRouteTableAttachmentsRequest, ListCentralNetworkErRouteTableAttachmentsResponse>
     */
    public AsyncInvoker<ListCentralNetworkErRouteTableAttachmentsRequest, ListCentralNetworkErRouteTableAttachmentsResponse> listCentralNetworkErRouteTableAttachmentsAsyncInvoker(
        ListCentralNetworkErRouteTableAttachmentsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listCentralNetworkErRouteTableAttachments, hcClient);
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
     * @return CompletableFuture<ListCentralNetworkGdgwAttachmentsResponse>
     */
    public CompletableFuture<ListCentralNetworkGdgwAttachmentsResponse> listCentralNetworkGdgwAttachmentsAsync(
        ListCentralNetworkGdgwAttachmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listCentralNetworkGdgwAttachments);
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
     * @return AsyncInvoker<ListCentralNetworkGdgwAttachmentsRequest, ListCentralNetworkGdgwAttachmentsResponse>
     */
    public AsyncInvoker<ListCentralNetworkGdgwAttachmentsRequest, ListCentralNetworkGdgwAttachmentsResponse> listCentralNetworkGdgwAttachmentsAsyncInvoker(
        ListCentralNetworkGdgwAttachmentsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listCentralNetworkGdgwAttachments, hcClient);
    }

    /**
     * 查询中心网络ER路由表附件详情
     *
     * 查询中心网络ER路由表附件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCentralNetworkErRouteTableAttachmentRequest 请求对象
     * @return CompletableFuture<ShowCentralNetworkErRouteTableAttachmentResponse>
     */
    public CompletableFuture<ShowCentralNetworkErRouteTableAttachmentResponse> showCentralNetworkErRouteTableAttachmentAsync(
        ShowCentralNetworkErRouteTableAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.showCentralNetworkErRouteTableAttachment);
    }

    /**
     * 查询中心网络ER路由表附件详情
     *
     * 查询中心网络ER路由表附件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCentralNetworkErRouteTableAttachmentRequest 请求对象
     * @return AsyncInvoker<ShowCentralNetworkErRouteTableAttachmentRequest, ShowCentralNetworkErRouteTableAttachmentResponse>
     */
    public AsyncInvoker<ShowCentralNetworkErRouteTableAttachmentRequest, ShowCentralNetworkErRouteTableAttachmentResponse> showCentralNetworkErRouteTableAttachmentAsyncInvoker(
        ShowCentralNetworkErRouteTableAttachmentRequest request) {
        return new AsyncInvoker<>(request, CcMeta.showCentralNetworkErRouteTableAttachment, hcClient);
    }

    /**
     * 查询中心网络GDGW附件详情
     *
     * 查询中心网络GDGW附件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCentralNetworkGdgwAttachmentRequest 请求对象
     * @return CompletableFuture<ShowCentralNetworkGdgwAttachmentResponse>
     */
    public CompletableFuture<ShowCentralNetworkGdgwAttachmentResponse> showCentralNetworkGdgwAttachmentAsync(
        ShowCentralNetworkGdgwAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.showCentralNetworkGdgwAttachment);
    }

    /**
     * 查询中心网络GDGW附件详情
     *
     * 查询中心网络GDGW附件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCentralNetworkGdgwAttachmentRequest 请求对象
     * @return AsyncInvoker<ShowCentralNetworkGdgwAttachmentRequest, ShowCentralNetworkGdgwAttachmentResponse>
     */
    public AsyncInvoker<ShowCentralNetworkGdgwAttachmentRequest, ShowCentralNetworkGdgwAttachmentResponse> showCentralNetworkGdgwAttachmentAsyncInvoker(
        ShowCentralNetworkGdgwAttachmentRequest request) {
        return new AsyncInvoker<>(request, CcMeta.showCentralNetworkGdgwAttachment, hcClient);
    }

    /**
     * 更新中心网络ER路由表附件
     *
     * 更新中心网络ER路由表附件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCentralNetworkErRouteTableAttachmentRequest 请求对象
     * @return CompletableFuture<UpdateCentralNetworkErRouteTableAttachmentResponse>
     */
    public CompletableFuture<UpdateCentralNetworkErRouteTableAttachmentResponse> updateCentralNetworkErRouteTableAttachmentAsync(
        UpdateCentralNetworkErRouteTableAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.updateCentralNetworkErRouteTableAttachment);
    }

    /**
     * 更新中心网络ER路由表附件
     *
     * 更新中心网络ER路由表附件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCentralNetworkErRouteTableAttachmentRequest 请求对象
     * @return AsyncInvoker<UpdateCentralNetworkErRouteTableAttachmentRequest, UpdateCentralNetworkErRouteTableAttachmentResponse>
     */
    public AsyncInvoker<UpdateCentralNetworkErRouteTableAttachmentRequest, UpdateCentralNetworkErRouteTableAttachmentResponse> updateCentralNetworkErRouteTableAttachmentAsyncInvoker(
        UpdateCentralNetworkErRouteTableAttachmentRequest request) {
        return new AsyncInvoker<>(request, CcMeta.updateCentralNetworkErRouteTableAttachment, hcClient);
    }

    /**
     * 更新中心网络GDGW附件
     *
     * 更新中心网络GDGW附件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCentralNetworkGdgwAttachmentRequest 请求对象
     * @return CompletableFuture<UpdateCentralNetworkGdgwAttachmentResponse>
     */
    public CompletableFuture<UpdateCentralNetworkGdgwAttachmentResponse> updateCentralNetworkGdgwAttachmentAsync(
        UpdateCentralNetworkGdgwAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.updateCentralNetworkGdgwAttachment);
    }

    /**
     * 更新中心网络GDGW附件
     *
     * 更新中心网络GDGW附件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCentralNetworkGdgwAttachmentRequest 请求对象
     * @return AsyncInvoker<UpdateCentralNetworkGdgwAttachmentRequest, UpdateCentralNetworkGdgwAttachmentResponse>
     */
    public AsyncInvoker<UpdateCentralNetworkGdgwAttachmentRequest, UpdateCentralNetworkGdgwAttachmentResponse> updateCentralNetworkGdgwAttachmentAsyncInvoker(
        UpdateCentralNetworkGdgwAttachmentRequest request) {
        return new AsyncInvoker<>(request, CcMeta.updateCentralNetworkGdgwAttachment, hcClient);
    }

    /**
     * 查询中心网络能力列表
     *
     * 查询中心网络能力列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkCapabilitiesRequest 请求对象
     * @return CompletableFuture<ListCentralNetworkCapabilitiesResponse>
     */
    public CompletableFuture<ListCentralNetworkCapabilitiesResponse> listCentralNetworkCapabilitiesAsync(
        ListCentralNetworkCapabilitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listCentralNetworkCapabilities);
    }

    /**
     * 查询中心网络能力列表
     *
     * 查询中心网络能力列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkCapabilitiesRequest 请求对象
     * @return AsyncInvoker<ListCentralNetworkCapabilitiesRequest, ListCentralNetworkCapabilitiesResponse>
     */
    public AsyncInvoker<ListCentralNetworkCapabilitiesRequest, ListCentralNetworkCapabilitiesResponse> listCentralNetworkCapabilitiesAsyncInvoker(
        ListCentralNetworkCapabilitiesRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listCentralNetworkCapabilities, hcClient);
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
     * @return CompletableFuture<ListCentralNetworkConnectionsResponse>
     */
    public CompletableFuture<ListCentralNetworkConnectionsResponse> listCentralNetworkConnectionsAsync(
        ListCentralNetworkConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listCentralNetworkConnections);
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
     * @return AsyncInvoker<ListCentralNetworkConnectionsRequest, ListCentralNetworkConnectionsResponse>
     */
    public AsyncInvoker<ListCentralNetworkConnectionsRequest, ListCentralNetworkConnectionsResponse> listCentralNetworkConnectionsAsyncInvoker(
        ListCentralNetworkConnectionsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listCentralNetworkConnections, hcClient);
    }

    /**
     * 更新中心网络连接接口
     *
     * 更新中心网络连接接口（仅支持更新带宽）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCentralNetworkConnectionRequest 请求对象
     * @return CompletableFuture<UpdateCentralNetworkConnectionResponse>
     */
    public CompletableFuture<UpdateCentralNetworkConnectionResponse> updateCentralNetworkConnectionAsync(
        UpdateCentralNetworkConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.updateCentralNetworkConnection);
    }

    /**
     * 更新中心网络连接接口
     *
     * 更新中心网络连接接口（仅支持更新带宽）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCentralNetworkConnectionRequest 请求对象
     * @return AsyncInvoker<UpdateCentralNetworkConnectionRequest, UpdateCentralNetworkConnectionResponse>
     */
    public AsyncInvoker<UpdateCentralNetworkConnectionRequest, UpdateCentralNetworkConnectionResponse> updateCentralNetworkConnectionAsyncInvoker(
        UpdateCentralNetworkConnectionRequest request) {
        return new AsyncInvoker<>(request, CcMeta.updateCentralNetworkConnection, hcClient);
    }

    /**
     * 查询中心网络配额
     *
     * 查询中心网络配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkQuotasRequest 请求对象
     * @return CompletableFuture<ListCentralNetworkQuotasResponse>
     */
    public CompletableFuture<ListCentralNetworkQuotasResponse> listCentralNetworkQuotasAsync(
        ListCentralNetworkQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listCentralNetworkQuotas);
    }

    /**
     * 查询中心网络配额
     *
     * 查询中心网络配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCentralNetworkQuotasRequest 请求对象
     * @return AsyncInvoker<ListCentralNetworkQuotasRequest, ListCentralNetworkQuotasResponse>
     */
    public AsyncInvoker<ListCentralNetworkQuotasRequest, ListCentralNetworkQuotasResponse> listCentralNetworkQuotasAsyncInvoker(
        ListCentralNetworkQuotasRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listCentralNetworkQuotas, hcClient);
    }

    /**
     * 创建云连接实例
     *
     * 创建云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCloudConnectionRequest 请求对象
     * @return CompletableFuture<CreateCloudConnectionResponse>
     */
    public CompletableFuture<CreateCloudConnectionResponse> createCloudConnectionAsync(
        CreateCloudConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.createCloudConnection);
    }

    /**
     * 创建云连接实例
     *
     * 创建云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCloudConnectionRequest 请求对象
     * @return AsyncInvoker<CreateCloudConnectionRequest, CreateCloudConnectionResponse>
     */
    public AsyncInvoker<CreateCloudConnectionRequest, CreateCloudConnectionResponse> createCloudConnectionAsyncInvoker(
        CreateCloudConnectionRequest request) {
        return new AsyncInvoker<>(request, CcMeta.createCloudConnection, hcClient);
    }

    /**
     * 删除云连接实例
     *
     * 删除云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCloudConnectionRequest 请求对象
     * @return CompletableFuture<DeleteCloudConnectionResponse>
     */
    public CompletableFuture<DeleteCloudConnectionResponse> deleteCloudConnectionAsync(
        DeleteCloudConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.deleteCloudConnection);
    }

    /**
     * 删除云连接实例
     *
     * 删除云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCloudConnectionRequest 请求对象
     * @return AsyncInvoker<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse>
     */
    public AsyncInvoker<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse> deleteCloudConnectionAsyncInvoker(
        DeleteCloudConnectionRequest request) {
        return new AsyncInvoker<>(request, CcMeta.deleteCloudConnection, hcClient);
    }

    /**
     * 查询云连接实例的标签信息
     *
     * 查询云连接实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudConnectionTagsRequest 请求对象
     * @return CompletableFuture<ListCloudConnectionTagsResponse>
     */
    public CompletableFuture<ListCloudConnectionTagsResponse> listCloudConnectionTagsAsync(
        ListCloudConnectionTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listCloudConnectionTags);
    }

    /**
     * 查询云连接实例的标签信息
     *
     * 查询云连接实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudConnectionTagsRequest 请求对象
     * @return AsyncInvoker<ListCloudConnectionTagsRequest, ListCloudConnectionTagsResponse>
     */
    public AsyncInvoker<ListCloudConnectionTagsRequest, ListCloudConnectionTagsResponse> listCloudConnectionTagsAsyncInvoker(
        ListCloudConnectionTagsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listCloudConnectionTags, hcClient);
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
     * @return CompletableFuture<ListCloudConnectionsResponse>
     */
    public CompletableFuture<ListCloudConnectionsResponse> listCloudConnectionsAsync(
        ListCloudConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listCloudConnections);
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
     * @return AsyncInvoker<ListCloudConnectionsRequest, ListCloudConnectionsResponse>
     */
    public AsyncInvoker<ListCloudConnectionsRequest, ListCloudConnectionsResponse> listCloudConnectionsAsyncInvoker(
        ListCloudConnectionsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listCloudConnections, hcClient);
    }

    /**
     * 通过标签过滤云连接实例
     *
     * 通过标签过滤云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudConnectionsByTagsRequest 请求对象
     * @return CompletableFuture<ListCloudConnectionsByTagsResponse>
     */
    public CompletableFuture<ListCloudConnectionsByTagsResponse> listCloudConnectionsByTagsAsync(
        ListCloudConnectionsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listCloudConnectionsByTags);
    }

    /**
     * 通过标签过滤云连接实例
     *
     * 通过标签过滤云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudConnectionsByTagsRequest 请求对象
     * @return AsyncInvoker<ListCloudConnectionsByTagsRequest, ListCloudConnectionsByTagsResponse>
     */
    public AsyncInvoker<ListCloudConnectionsByTagsRequest, ListCloudConnectionsByTagsResponse> listCloudConnectionsByTagsAsyncInvoker(
        ListCloudConnectionsByTagsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listCloudConnectionsByTags, hcClient);
    }

    /**
     * 查询云连接实例
     *
     * 查询云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCloudConnectionRequest 请求对象
     * @return CompletableFuture<ShowCloudConnectionResponse>
     */
    public CompletableFuture<ShowCloudConnectionResponse> showCloudConnectionAsync(ShowCloudConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.showCloudConnection);
    }

    /**
     * 查询云连接实例
     *
     * 查询云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCloudConnectionRequest 请求对象
     * @return AsyncInvoker<ShowCloudConnectionRequest, ShowCloudConnectionResponse>
     */
    public AsyncInvoker<ShowCloudConnectionRequest, ShowCloudConnectionResponse> showCloudConnectionAsyncInvoker(
        ShowCloudConnectionRequest request) {
        return new AsyncInvoker<>(request, CcMeta.showCloudConnection, hcClient);
    }

    /**
     * 创建云连接实例标签
     *
     * 创建云连接实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagCloudConnectionRequest 请求对象
     * @return CompletableFuture<TagCloudConnectionResponse>
     */
    public CompletableFuture<TagCloudConnectionResponse> tagCloudConnectionAsync(TagCloudConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.tagCloudConnection);
    }

    /**
     * 创建云连接实例标签
     *
     * 创建云连接实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagCloudConnectionRequest 请求对象
     * @return AsyncInvoker<TagCloudConnectionRequest, TagCloudConnectionResponse>
     */
    public AsyncInvoker<TagCloudConnectionRequest, TagCloudConnectionResponse> tagCloudConnectionAsyncInvoker(
        TagCloudConnectionRequest request) {
        return new AsyncInvoker<>(request, CcMeta.tagCloudConnection, hcClient);
    }

    /**
     * 删除云连接实例标签
     *
     * 删除云连接实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UntagCloudConnectionRequest 请求对象
     * @return CompletableFuture<UntagCloudConnectionResponse>
     */
    public CompletableFuture<UntagCloudConnectionResponse> untagCloudConnectionAsync(
        UntagCloudConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.untagCloudConnection);
    }

    /**
     * 删除云连接实例标签
     *
     * 删除云连接实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UntagCloudConnectionRequest 请求对象
     * @return AsyncInvoker<UntagCloudConnectionRequest, UntagCloudConnectionResponse>
     */
    public AsyncInvoker<UntagCloudConnectionRequest, UntagCloudConnectionResponse> untagCloudConnectionAsyncInvoker(
        UntagCloudConnectionRequest request) {
        return new AsyncInvoker<>(request, CcMeta.untagCloudConnection, hcClient);
    }

    /**
     * 更新云连接实例
     *
     * 更新云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCloudConnectionRequest 请求对象
     * @return CompletableFuture<UpdateCloudConnectionResponse>
     */
    public CompletableFuture<UpdateCloudConnectionResponse> updateCloudConnectionAsync(
        UpdateCloudConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.updateCloudConnection);
    }

    /**
     * 更新云连接实例
     *
     * 更新云连接实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCloudConnectionRequest 请求对象
     * @return AsyncInvoker<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse>
     */
    public AsyncInvoker<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse> updateCloudConnectionAsyncInvoker(
        UpdateCloudConnectionRequest request) {
        return new AsyncInvoker<>(request, CcMeta.updateCloudConnection, hcClient);
    }

    /**
     * 查询云连接的能力列表
     *
     * 查询云连接的能力列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudConnectionCapabilitiesRequest 请求对象
     * @return CompletableFuture<ListCloudConnectionCapabilitiesResponse>
     */
    public CompletableFuture<ListCloudConnectionCapabilitiesResponse> listCloudConnectionCapabilitiesAsync(
        ListCloudConnectionCapabilitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listCloudConnectionCapabilities);
    }

    /**
     * 查询云连接的能力列表
     *
     * 查询云连接的能力列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudConnectionCapabilitiesRequest 请求对象
     * @return AsyncInvoker<ListCloudConnectionCapabilitiesRequest, ListCloudConnectionCapabilitiesResponse>
     */
    public AsyncInvoker<ListCloudConnectionCapabilitiesRequest, ListCloudConnectionCapabilitiesResponse> listCloudConnectionCapabilitiesAsyncInvoker(
        ListCloudConnectionCapabilitiesRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listCloudConnectionCapabilities, hcClient);
    }

    /**
     * 查询云连接配额
     *
     * 查询云连接配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudConnectionQuotasRequest 请求对象
     * @return CompletableFuture<ListCloudConnectionQuotasResponse>
     */
    public CompletableFuture<ListCloudConnectionQuotasResponse> listCloudConnectionQuotasAsync(
        ListCloudConnectionQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listCloudConnectionQuotas);
    }

    /**
     * 查询云连接配额
     *
     * 查询云连接配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudConnectionQuotasRequest 请求对象
     * @return AsyncInvoker<ListCloudConnectionQuotasRequest, ListCloudConnectionQuotasResponse>
     */
    public AsyncInvoker<ListCloudConnectionQuotasRequest, ListCloudConnectionQuotasResponse> listCloudConnectionQuotasAsyncInvoker(
        ListCloudConnectionQuotasRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listCloudConnectionQuotas, hcClient);
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
     * @return CompletableFuture<ListCloudConnectionRoutesResponse>
     */
    public CompletableFuture<ListCloudConnectionRoutesResponse> listCloudConnectionRoutesAsync(
        ListCloudConnectionRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listCloudConnectionRoutes);
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
     * @return AsyncInvoker<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse>
     */
    public AsyncInvoker<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse> listCloudConnectionRoutesAsyncInvoker(
        ListCloudConnectionRoutesRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listCloudConnectionRoutes, hcClient);
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
     * @return CompletableFuture<ShowCloudConnectionRoutesResponse>
     */
    public CompletableFuture<ShowCloudConnectionRoutesResponse> showCloudConnectionRoutesAsync(
        ShowCloudConnectionRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.showCloudConnectionRoutes);
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
     * @return AsyncInvoker<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse>
     */
    public AsyncInvoker<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse> showCloudConnectionRoutesAsyncInvoker(
        ShowCloudConnectionRoutesRequest request) {
        return new AsyncInvoker<>(request, CcMeta.showCloudConnectionRoutes, hcClient);
    }

    /**
     * 全域互联带宽绑定实例
     *
     * 全域互联带宽绑定实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateGlobalConnectionBandwidthInstanceRequest 请求对象
     * @return CompletableFuture<AssociateGlobalConnectionBandwidthInstanceResponse>
     */
    public CompletableFuture<AssociateGlobalConnectionBandwidthInstanceResponse> associateGlobalConnectionBandwidthInstanceAsync(
        AssociateGlobalConnectionBandwidthInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.associateGlobalConnectionBandwidthInstance);
    }

    /**
     * 全域互联带宽绑定实例
     *
     * 全域互联带宽绑定实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateGlobalConnectionBandwidthInstanceRequest 请求对象
     * @return AsyncInvoker<AssociateGlobalConnectionBandwidthInstanceRequest, AssociateGlobalConnectionBandwidthInstanceResponse>
     */
    public AsyncInvoker<AssociateGlobalConnectionBandwidthInstanceRequest, AssociateGlobalConnectionBandwidthInstanceResponse> associateGlobalConnectionBandwidthInstanceAsyncInvoker(
        AssociateGlobalConnectionBandwidthInstanceRequest request) {
        return new AsyncInvoker<>(request, CcMeta.associateGlobalConnectionBandwidthInstance, hcClient);
    }

    /**
     * 创建全域互联带宽
     *
     * 创建全域互联带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGlobalConnectionBandwidthRequest 请求对象
     * @return CompletableFuture<CreateGlobalConnectionBandwidthResponse>
     */
    public CompletableFuture<CreateGlobalConnectionBandwidthResponse> createGlobalConnectionBandwidthAsync(
        CreateGlobalConnectionBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.createGlobalConnectionBandwidth);
    }

    /**
     * 创建全域互联带宽
     *
     * 创建全域互联带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGlobalConnectionBandwidthRequest 请求对象
     * @return AsyncInvoker<CreateGlobalConnectionBandwidthRequest, CreateGlobalConnectionBandwidthResponse>
     */
    public AsyncInvoker<CreateGlobalConnectionBandwidthRequest, CreateGlobalConnectionBandwidthResponse> createGlobalConnectionBandwidthAsyncInvoker(
        CreateGlobalConnectionBandwidthRequest request) {
        return new AsyncInvoker<>(request, CcMeta.createGlobalConnectionBandwidth, hcClient);
    }

    /**
     * 删除全域互联带宽
     *
     * 删除全域互联带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGlobalConnectionBandwidthRequest 请求对象
     * @return CompletableFuture<DeleteGlobalConnectionBandwidthResponse>
     */
    public CompletableFuture<DeleteGlobalConnectionBandwidthResponse> deleteGlobalConnectionBandwidthAsync(
        DeleteGlobalConnectionBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.deleteGlobalConnectionBandwidth);
    }

    /**
     * 删除全域互联带宽
     *
     * 删除全域互联带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGlobalConnectionBandwidthRequest 请求对象
     * @return AsyncInvoker<DeleteGlobalConnectionBandwidthRequest, DeleteGlobalConnectionBandwidthResponse>
     */
    public AsyncInvoker<DeleteGlobalConnectionBandwidthRequest, DeleteGlobalConnectionBandwidthResponse> deleteGlobalConnectionBandwidthAsyncInvoker(
        DeleteGlobalConnectionBandwidthRequest request) {
        return new AsyncInvoker<>(request, CcMeta.deleteGlobalConnectionBandwidth, hcClient);
    }

    /**
     * 全域互联带宽解绑实例
     *
     * 全域互联带宽解绑实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateGlobalConnectionBandwidthInstanceRequest 请求对象
     * @return CompletableFuture<DisassociateGlobalConnectionBandwidthInstanceResponse>
     */
    public CompletableFuture<DisassociateGlobalConnectionBandwidthInstanceResponse> disassociateGlobalConnectionBandwidthInstanceAsync(
        DisassociateGlobalConnectionBandwidthInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.disassociateGlobalConnectionBandwidthInstance);
    }

    /**
     * 全域互联带宽解绑实例
     *
     * 全域互联带宽解绑实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateGlobalConnectionBandwidthInstanceRequest 请求对象
     * @return AsyncInvoker<DisassociateGlobalConnectionBandwidthInstanceRequest, DisassociateGlobalConnectionBandwidthInstanceResponse>
     */
    public AsyncInvoker<DisassociateGlobalConnectionBandwidthInstanceRequest, DisassociateGlobalConnectionBandwidthInstanceResponse> disassociateGlobalConnectionBandwidthInstanceAsyncInvoker(
        DisassociateGlobalConnectionBandwidthInstanceRequest request) {
        return new AsyncInvoker<>(request, CcMeta.disassociateGlobalConnectionBandwidthInstance, hcClient);
    }

    /**
     * 查询全域互联带宽租户配置信息
     *
     * 查询全域互联带宽租户配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalConnectionBandwidthConfigsRequest 请求对象
     * @return CompletableFuture<ListGlobalConnectionBandwidthConfigsResponse>
     */
    public CompletableFuture<ListGlobalConnectionBandwidthConfigsResponse> listGlobalConnectionBandwidthConfigsAsync(
        ListGlobalConnectionBandwidthConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listGlobalConnectionBandwidthConfigs);
    }

    /**
     * 查询全域互联带宽租户配置信息
     *
     * 查询全域互联带宽租户配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalConnectionBandwidthConfigsRequest 请求对象
     * @return AsyncInvoker<ListGlobalConnectionBandwidthConfigsRequest, ListGlobalConnectionBandwidthConfigsResponse>
     */
    public AsyncInvoker<ListGlobalConnectionBandwidthConfigsRequest, ListGlobalConnectionBandwidthConfigsResponse> listGlobalConnectionBandwidthConfigsAsyncInvoker(
        ListGlobalConnectionBandwidthConfigsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listGlobalConnectionBandwidthConfigs, hcClient);
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
     * @return CompletableFuture<ListGlobalConnectionBandwidthLineLevelsResponse>
     */
    public CompletableFuture<ListGlobalConnectionBandwidthLineLevelsResponse> listGlobalConnectionBandwidthLineLevelsAsync(
        ListGlobalConnectionBandwidthLineLevelsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listGlobalConnectionBandwidthLineLevels);
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
     * @return AsyncInvoker<ListGlobalConnectionBandwidthLineLevelsRequest, ListGlobalConnectionBandwidthLineLevelsResponse>
     */
    public AsyncInvoker<ListGlobalConnectionBandwidthLineLevelsRequest, ListGlobalConnectionBandwidthLineLevelsResponse> listGlobalConnectionBandwidthLineLevelsAsyncInvoker(
        ListGlobalConnectionBandwidthLineLevelsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listGlobalConnectionBandwidthLineLevels, hcClient);
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
     * @return CompletableFuture<ListGlobalConnectionBandwidthSitesResponse>
     */
    public CompletableFuture<ListGlobalConnectionBandwidthSitesResponse> listGlobalConnectionBandwidthSitesAsync(
        ListGlobalConnectionBandwidthSitesRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listGlobalConnectionBandwidthSites);
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
     * @return AsyncInvoker<ListGlobalConnectionBandwidthSitesRequest, ListGlobalConnectionBandwidthSitesResponse>
     */
    public AsyncInvoker<ListGlobalConnectionBandwidthSitesRequest, ListGlobalConnectionBandwidthSitesResponse> listGlobalConnectionBandwidthSitesAsyncInvoker(
        ListGlobalConnectionBandwidthSitesRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listGlobalConnectionBandwidthSites, hcClient);
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
     * @return CompletableFuture<ListGlobalConnectionBandwidthSpecCodesResponse>
     */
    public CompletableFuture<ListGlobalConnectionBandwidthSpecCodesResponse> listGlobalConnectionBandwidthSpecCodesAsync(
        ListGlobalConnectionBandwidthSpecCodesRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listGlobalConnectionBandwidthSpecCodes);
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
     * @return AsyncInvoker<ListGlobalConnectionBandwidthSpecCodesRequest, ListGlobalConnectionBandwidthSpecCodesResponse>
     */
    public AsyncInvoker<ListGlobalConnectionBandwidthSpecCodesRequest, ListGlobalConnectionBandwidthSpecCodesResponse> listGlobalConnectionBandwidthSpecCodesAsyncInvoker(
        ListGlobalConnectionBandwidthSpecCodesRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listGlobalConnectionBandwidthSpecCodes, hcClient);
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
     * @return CompletableFuture<ListGlobalConnectionBandwidthsResponse>
     */
    public CompletableFuture<ListGlobalConnectionBandwidthsResponse> listGlobalConnectionBandwidthsAsync(
        ListGlobalConnectionBandwidthsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listGlobalConnectionBandwidths);
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
     * @return AsyncInvoker<ListGlobalConnectionBandwidthsRequest, ListGlobalConnectionBandwidthsResponse>
     */
    public AsyncInvoker<ListGlobalConnectionBandwidthsRequest, ListGlobalConnectionBandwidthsResponse> listGlobalConnectionBandwidthsAsyncInvoker(
        ListGlobalConnectionBandwidthsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listGlobalConnectionBandwidths, hcClient);
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
     * @return CompletableFuture<ListSupportBindingConnectionBandwidthsResponse>
     */
    public CompletableFuture<ListSupportBindingConnectionBandwidthsResponse> listSupportBindingConnectionBandwidthsAsync(
        ListSupportBindingConnectionBandwidthsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listSupportBindingConnectionBandwidths);
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
     * @return AsyncInvoker<ListSupportBindingConnectionBandwidthsRequest, ListSupportBindingConnectionBandwidthsResponse>
     */
    public AsyncInvoker<ListSupportBindingConnectionBandwidthsRequest, ListSupportBindingConnectionBandwidthsResponse> listSupportBindingConnectionBandwidthsAsyncInvoker(
        ListSupportBindingConnectionBandwidthsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listSupportBindingConnectionBandwidths, hcClient);
    }

    /**
     * 查询全域互联带宽详情
     *
     * 查询全域互联带宽详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalConnectionBandwidthRequest 请求对象
     * @return CompletableFuture<ShowGlobalConnectionBandwidthResponse>
     */
    public CompletableFuture<ShowGlobalConnectionBandwidthResponse> showGlobalConnectionBandwidthAsync(
        ShowGlobalConnectionBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.showGlobalConnectionBandwidth);
    }

    /**
     * 查询全域互联带宽详情
     *
     * 查询全域互联带宽详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalConnectionBandwidthRequest 请求对象
     * @return AsyncInvoker<ShowGlobalConnectionBandwidthRequest, ShowGlobalConnectionBandwidthResponse>
     */
    public AsyncInvoker<ShowGlobalConnectionBandwidthRequest, ShowGlobalConnectionBandwidthResponse> showGlobalConnectionBandwidthAsyncInvoker(
        ShowGlobalConnectionBandwidthRequest request) {
        return new AsyncInvoker<>(request, CcMeta.showGlobalConnectionBandwidth, hcClient);
    }

    /**
     * 更新全域互联带宽详情
     *
     * 更新全域互联带宽详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGlobalConnectionBandwidthRequest 请求对象
     * @return CompletableFuture<UpdateGlobalConnectionBandwidthResponse>
     */
    public CompletableFuture<UpdateGlobalConnectionBandwidthResponse> updateGlobalConnectionBandwidthAsync(
        UpdateGlobalConnectionBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.updateGlobalConnectionBandwidth);
    }

    /**
     * 更新全域互联带宽详情
     *
     * 更新全域互联带宽详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGlobalConnectionBandwidthRequest 请求对象
     * @return AsyncInvoker<UpdateGlobalConnectionBandwidthRequest, UpdateGlobalConnectionBandwidthResponse>
     */
    public AsyncInvoker<UpdateGlobalConnectionBandwidthRequest, UpdateGlobalConnectionBandwidthResponse> updateGlobalConnectionBandwidthAsyncInvoker(
        UpdateGlobalConnectionBandwidthRequest request) {
        return new AsyncInvoker<>(request, CcMeta.updateGlobalConnectionBandwidth, hcClient);
    }

    /**
     * 批量添加账户全域互联带宽资源标签
     *
     * TMS批量添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateGcbResourceTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateGcbResourceTagsResponse>
     */
    public CompletableFuture<BatchCreateGcbResourceTagsResponse> batchCreateGcbResourceTagsAsync(
        BatchCreateGcbResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.batchCreateGcbResourceTags);
    }

    /**
     * 批量添加账户全域互联带宽资源标签
     *
     * TMS批量添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateGcbResourceTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateGcbResourceTagsRequest, BatchCreateGcbResourceTagsResponse>
     */
    public AsyncInvoker<BatchCreateGcbResourceTagsRequest, BatchCreateGcbResourceTagsResponse> batchCreateGcbResourceTagsAsyncInvoker(
        BatchCreateGcbResourceTagsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.batchCreateGcbResourceTags, hcClient);
    }

    /**
     * 批量删除账户全域互联带宽资源标签
     *
     * 批量删除账户全域互联带宽资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteGcbResourceTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteGcbResourceTagsResponse>
     */
    public CompletableFuture<BatchDeleteGcbResourceTagsResponse> batchDeleteGcbResourceTagsAsync(
        BatchDeleteGcbResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.batchDeleteGcbResourceTags);
    }

    /**
     * 批量删除账户全域互联带宽资源标签
     *
     * 批量删除账户全域互联带宽资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteGcbResourceTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteGcbResourceTagsRequest, BatchDeleteGcbResourceTagsResponse>
     */
    public AsyncInvoker<BatchDeleteGcbResourceTagsRequest, BatchDeleteGcbResourceTagsResponse> batchDeleteGcbResourceTagsAsyncInvoker(
        BatchDeleteGcbResourceTagsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.batchDeleteGcbResourceTags, hcClient);
    }

    /**
     * 查询账户全域互联带宽资源标签数量
     *
     * 查询账户全域互联带宽资源标签数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountGcbResourceByTagRequest 请求对象
     * @return CompletableFuture<CountGcbResourceByTagResponse>
     */
    public CompletableFuture<CountGcbResourceByTagResponse> countGcbResourceByTagAsync(
        CountGcbResourceByTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.countGcbResourceByTag);
    }

    /**
     * 查询账户全域互联带宽资源标签数量
     *
     * 查询账户全域互联带宽资源标签数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountGcbResourceByTagRequest 请求对象
     * @return AsyncInvoker<CountGcbResourceByTagRequest, CountGcbResourceByTagResponse>
     */
    public AsyncInvoker<CountGcbResourceByTagRequest, CountGcbResourceByTagResponse> countGcbResourceByTagAsyncInvoker(
        CountGcbResourceByTagRequest request) {
        return new AsyncInvoker<>(request, CcMeta.countGcbResourceByTag, hcClient);
    }

    /**
     * 添加账户全域互联带宽资源标签
     *
     * 添加账户全域互联带宽资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGcbResourceTagRequest 请求对象
     * @return CompletableFuture<CreateGcbResourceTagResponse>
     */
    public CompletableFuture<CreateGcbResourceTagResponse> createGcbResourceTagAsync(
        CreateGcbResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.createGcbResourceTag);
    }

    /**
     * 添加账户全域互联带宽资源标签
     *
     * 添加账户全域互联带宽资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGcbResourceTagRequest 请求对象
     * @return AsyncInvoker<CreateGcbResourceTagRequest, CreateGcbResourceTagResponse>
     */
    public AsyncInvoker<CreateGcbResourceTagRequest, CreateGcbResourceTagResponse> createGcbResourceTagAsyncInvoker(
        CreateGcbResourceTagRequest request) {
        return new AsyncInvoker<>(request, CcMeta.createGcbResourceTag, hcClient);
    }

    /**
     * 删除账户全域互联带宽资源标签
     *
     * 删除账户全域互联带宽资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGcbResourceTagRequest 请求对象
     * @return CompletableFuture<DeleteGcbResourceTagResponse>
     */
    public CompletableFuture<DeleteGcbResourceTagResponse> deleteGcbResourceTagAsync(
        DeleteGcbResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.deleteGcbResourceTag);
    }

    /**
     * 删除账户全域互联带宽资源标签
     *
     * 删除账户全域互联带宽资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGcbResourceTagRequest 请求对象
     * @return AsyncInvoker<DeleteGcbResourceTagRequest, DeleteGcbResourceTagResponse>
     */
    public AsyncInvoker<DeleteGcbResourceTagRequest, DeleteGcbResourceTagResponse> deleteGcbResourceTagAsyncInvoker(
        DeleteGcbResourceTagRequest request) {
        return new AsyncInvoker<>(request, CcMeta.deleteGcbResourceTag, hcClient);
    }

    /**
     * 查询账户全域互联带宽资源实例列表
     *
     * 查询账户全域互联带宽资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGcbResourceByTagRequest 请求对象
     * @return CompletableFuture<ListGcbResourceByTagResponse>
     */
    public CompletableFuture<ListGcbResourceByTagResponse> listGcbResourceByTagAsync(
        ListGcbResourceByTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listGcbResourceByTag);
    }

    /**
     * 查询账户全域互联带宽资源实例列表
     *
     * 查询账户全域互联带宽资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGcbResourceByTagRequest 请求对象
     * @return AsyncInvoker<ListGcbResourceByTagRequest, ListGcbResourceByTagResponse>
     */
    public AsyncInvoker<ListGcbResourceByTagRequest, ListGcbResourceByTagResponse> listGcbResourceByTagAsyncInvoker(
        ListGcbResourceByTagRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listGcbResourceByTag, hcClient);
    }

    /**
     * 查询账户全域互联带宽资源的标签
     *
     * 查询账户全域互联带宽资源的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGcbResourceTagsRequest 请求对象
     * @return CompletableFuture<ListGcbResourceTagsResponse>
     */
    public CompletableFuture<ListGcbResourceTagsResponse> listGcbResourceTagsAsync(ListGcbResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listGcbResourceTags);
    }

    /**
     * 查询账户全域互联带宽资源的标签
     *
     * 查询账户全域互联带宽资源的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGcbResourceTagsRequest 请求对象
     * @return AsyncInvoker<ListGcbResourceTagsRequest, ListGcbResourceTagsResponse>
     */
    public AsyncInvoker<ListGcbResourceTagsRequest, ListGcbResourceTagsResponse> listGcbResourceTagsAsyncInvoker(
        ListGcbResourceTagsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listGcbResourceTags, hcClient);
    }

    /**
     * 查询账户全域互联带宽所有资源标签
     *
     * 查询账户全域互联带宽所有资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGcbTenantTagsRequest 请求对象
     * @return CompletableFuture<ListGcbTenantTagsResponse>
     */
    public CompletableFuture<ListGcbTenantTagsResponse> listGcbTenantTagsAsync(ListGcbTenantTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listGcbTenantTags);
    }

    /**
     * 查询账户全域互联带宽所有资源标签
     *
     * 查询账户全域互联带宽所有资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGcbTenantTagsRequest 请求对象
     * @return AsyncInvoker<ListGcbTenantTagsRequest, ListGcbTenantTagsResponse>
     */
    public AsyncInvoker<ListGcbTenantTagsRequest, ListGcbTenantTagsResponse> listGcbTenantTagsAsyncInvoker(
        ListGcbTenantTagsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listGcbTenantTags, hcClient);
    }

    /**
     * 创建域间带宽实例
     *
     * 创建域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInterRegionBandwidthRequest 请求对象
     * @return CompletableFuture<CreateInterRegionBandwidthResponse>
     */
    public CompletableFuture<CreateInterRegionBandwidthResponse> createInterRegionBandwidthAsync(
        CreateInterRegionBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.createInterRegionBandwidth);
    }

    /**
     * 创建域间带宽实例
     *
     * 创建域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInterRegionBandwidthRequest 请求对象
     * @return AsyncInvoker<CreateInterRegionBandwidthRequest, CreateInterRegionBandwidthResponse>
     */
    public AsyncInvoker<CreateInterRegionBandwidthRequest, CreateInterRegionBandwidthResponse> createInterRegionBandwidthAsyncInvoker(
        CreateInterRegionBandwidthRequest request) {
        return new AsyncInvoker<>(request, CcMeta.createInterRegionBandwidth, hcClient);
    }

    /**
     * 删除域间带宽实例
     *
     * 删除域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInterRegionBandwidthRequest 请求对象
     * @return CompletableFuture<DeleteInterRegionBandwidthResponse>
     */
    public CompletableFuture<DeleteInterRegionBandwidthResponse> deleteInterRegionBandwidthAsync(
        DeleteInterRegionBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.deleteInterRegionBandwidth);
    }

    /**
     * 删除域间带宽实例
     *
     * 删除域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInterRegionBandwidthRequest 请求对象
     * @return AsyncInvoker<DeleteInterRegionBandwidthRequest, DeleteInterRegionBandwidthResponse>
     */
    public AsyncInvoker<DeleteInterRegionBandwidthRequest, DeleteInterRegionBandwidthResponse> deleteInterRegionBandwidthAsyncInvoker(
        DeleteInterRegionBandwidthRequest request) {
        return new AsyncInvoker<>(request, CcMeta.deleteInterRegionBandwidth, hcClient);
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
     * @return CompletableFuture<ListInterRegionBandwidthsResponse>
     */
    public CompletableFuture<ListInterRegionBandwidthsResponse> listInterRegionBandwidthsAsync(
        ListInterRegionBandwidthsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listInterRegionBandwidths);
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
     * @return AsyncInvoker<ListInterRegionBandwidthsRequest, ListInterRegionBandwidthsResponse>
     */
    public AsyncInvoker<ListInterRegionBandwidthsRequest, ListInterRegionBandwidthsResponse> listInterRegionBandwidthsAsyncInvoker(
        ListInterRegionBandwidthsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listInterRegionBandwidths, hcClient);
    }

    /**
     * 查询域间带宽实例
     *
     * 查询域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInterRegionBandwidthRequest 请求对象
     * @return CompletableFuture<ShowInterRegionBandwidthResponse>
     */
    public CompletableFuture<ShowInterRegionBandwidthResponse> showInterRegionBandwidthAsync(
        ShowInterRegionBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.showInterRegionBandwidth);
    }

    /**
     * 查询域间带宽实例
     *
     * 查询域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInterRegionBandwidthRequest 请求对象
     * @return AsyncInvoker<ShowInterRegionBandwidthRequest, ShowInterRegionBandwidthResponse>
     */
    public AsyncInvoker<ShowInterRegionBandwidthRequest, ShowInterRegionBandwidthResponse> showInterRegionBandwidthAsyncInvoker(
        ShowInterRegionBandwidthRequest request) {
        return new AsyncInvoker<>(request, CcMeta.showInterRegionBandwidth, hcClient);
    }

    /**
     * 更新域间带宽实例
     *
     * 更新域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInterRegionBandwidthRequest 请求对象
     * @return CompletableFuture<UpdateInterRegionBandwidthResponse>
     */
    public CompletableFuture<UpdateInterRegionBandwidthResponse> updateInterRegionBandwidthAsync(
        UpdateInterRegionBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.updateInterRegionBandwidth);
    }

    /**
     * 更新域间带宽实例
     *
     * 更新域间带宽实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInterRegionBandwidthRequest 请求对象
     * @return AsyncInvoker<UpdateInterRegionBandwidthRequest, UpdateInterRegionBandwidthResponse>
     */
    public AsyncInvoker<UpdateInterRegionBandwidthRequest, UpdateInterRegionBandwidthResponse> updateInterRegionBandwidthAsyncInvoker(
        UpdateInterRegionBandwidthRequest request) {
        return new AsyncInvoker<>(request, CcMeta.updateInterRegionBandwidth, hcClient);
    }

    /**
     * 创建网络实例
     *
     * 创建网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNetworkInstanceRequest 请求对象
     * @return CompletableFuture<CreateNetworkInstanceResponse>
     */
    public CompletableFuture<CreateNetworkInstanceResponse> createNetworkInstanceAsync(
        CreateNetworkInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.createNetworkInstance);
    }

    /**
     * 创建网络实例
     *
     * 创建网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNetworkInstanceRequest 请求对象
     * @return AsyncInvoker<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse>
     */
    public AsyncInvoker<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse> createNetworkInstanceAsyncInvoker(
        CreateNetworkInstanceRequest request) {
        return new AsyncInvoker<>(request, CcMeta.createNetworkInstance, hcClient);
    }

    /**
     * 删除网络实例
     *
     * 删除网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNetworkInstanceRequest 请求对象
     * @return CompletableFuture<DeleteNetworkInstanceResponse>
     */
    public CompletableFuture<DeleteNetworkInstanceResponse> deleteNetworkInstanceAsync(
        DeleteNetworkInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.deleteNetworkInstance);
    }

    /**
     * 删除网络实例
     *
     * 删除网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNetworkInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse>
     */
    public AsyncInvoker<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse> deleteNetworkInstanceAsyncInvoker(
        DeleteNetworkInstanceRequest request) {
        return new AsyncInvoker<>(request, CcMeta.deleteNetworkInstance, hcClient);
    }

    /**
     * 查询网络实例列表
     *
     * 查询网络实例列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkInstancesRequest 请求对象
     * @return CompletableFuture<ListNetworkInstancesResponse>
     */
    public CompletableFuture<ListNetworkInstancesResponse> listNetworkInstancesAsync(
        ListNetworkInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listNetworkInstances);
    }

    /**
     * 查询网络实例列表
     *
     * 查询网络实例列表。
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkInstancesRequest 请求对象
     * @return AsyncInvoker<ListNetworkInstancesRequest, ListNetworkInstancesResponse>
     */
    public AsyncInvoker<ListNetworkInstancesRequest, ListNetworkInstancesResponse> listNetworkInstancesAsyncInvoker(
        ListNetworkInstancesRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listNetworkInstances, hcClient);
    }

    /**
     * 查询网络实例
     *
     * 查询网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkInstanceRequest 请求对象
     * @return CompletableFuture<ShowNetworkInstanceResponse>
     */
    public CompletableFuture<ShowNetworkInstanceResponse> showNetworkInstanceAsync(ShowNetworkInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.showNetworkInstance);
    }

    /**
     * 查询网络实例
     *
     * 查询网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkInstanceRequest 请求对象
     * @return AsyncInvoker<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse>
     */
    public AsyncInvoker<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse> showNetworkInstanceAsyncInvoker(
        ShowNetworkInstanceRequest request) {
        return new AsyncInvoker<>(request, CcMeta.showNetworkInstance, hcClient);
    }

    /**
     * 更新网络实例
     *
     * 更新网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNetworkInstanceRequest 请求对象
     * @return CompletableFuture<UpdateNetworkInstanceResponse>
     */
    public CompletableFuture<UpdateNetworkInstanceResponse> updateNetworkInstanceAsync(
        UpdateNetworkInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.updateNetworkInstance);
    }

    /**
     * 更新网络实例
     *
     * 更新网络实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNetworkInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse>
     */
    public AsyncInvoker<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse> updateNetworkInstanceAsyncInvoker(
        UpdateNetworkInstanceRequest request) {
        return new AsyncInvoker<>(request, CcMeta.updateNetworkInstance, hcClient);
    }

    /**
     * 关联分支连接带宽
     *
     * 关联分支连接带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateSiteNetworkBandwidthRequest 请求对象
     * @return CompletableFuture<AssociateSiteNetworkBandwidthResponse>
     */
    public CompletableFuture<AssociateSiteNetworkBandwidthResponse> associateSiteNetworkBandwidthAsync(
        AssociateSiteNetworkBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.associateSiteNetworkBandwidth);
    }

    /**
     * 关联分支连接带宽
     *
     * 关联分支连接带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateSiteNetworkBandwidthRequest 请求对象
     * @return AsyncInvoker<AssociateSiteNetworkBandwidthRequest, AssociateSiteNetworkBandwidthResponse>
     */
    public AsyncInvoker<AssociateSiteNetworkBandwidthRequest, AssociateSiteNetworkBandwidthResponse> associateSiteNetworkBandwidthAsyncInvoker(
        AssociateSiteNetworkBandwidthRequest request) {
        return new AsyncInvoker<>(request, CcMeta.associateSiteNetworkBandwidth, hcClient);
    }

    /**
     * 解关联分支连接带宽
     *
     * 解关联分支连接带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateSiteNetworkBandwidthRequest 请求对象
     * @return CompletableFuture<DisassociateSiteNetworkBandwidthResponse>
     */
    public CompletableFuture<DisassociateSiteNetworkBandwidthResponse> disassociateSiteNetworkBandwidthAsync(
        DisassociateSiteNetworkBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.disassociateSiteNetworkBandwidth);
    }

    /**
     * 解关联分支连接带宽
     *
     * 解关联分支连接带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateSiteNetworkBandwidthRequest 请求对象
     * @return AsyncInvoker<DisassociateSiteNetworkBandwidthRequest, DisassociateSiteNetworkBandwidthResponse>
     */
    public AsyncInvoker<DisassociateSiteNetworkBandwidthRequest, DisassociateSiteNetworkBandwidthResponse> disassociateSiteNetworkBandwidthAsyncInvoker(
        DisassociateSiteNetworkBandwidthRequest request) {
        return new AsyncInvoker<>(request, CcMeta.disassociateSiteNetworkBandwidth, hcClient);
    }

    /**
     * 更改分支连接带宽包
     *
     * 更改分支连接带宽包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSiteNetworkBandwidthRequest 请求对象
     * @return CompletableFuture<UpdateSiteNetworkBandwidthResponse>
     */
    public CompletableFuture<UpdateSiteNetworkBandwidthResponse> updateSiteNetworkBandwidthAsync(
        UpdateSiteNetworkBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.updateSiteNetworkBandwidth);
    }

    /**
     * 更改分支连接带宽包
     *
     * 更改分支连接带宽包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSiteNetworkBandwidthRequest 请求对象
     * @return AsyncInvoker<UpdateSiteNetworkBandwidthRequest, UpdateSiteNetworkBandwidthResponse>
     */
    public AsyncInvoker<UpdateSiteNetworkBandwidthRequest, UpdateSiteNetworkBandwidthResponse> updateSiteNetworkBandwidthAsyncInvoker(
        UpdateSiteNetworkBandwidthRequest request) {
        return new AsyncInvoker<>(request, CcMeta.updateSiteNetworkBandwidth, hcClient);
    }

    /**
     * 更改分支连接带宽大小
     *
     * 更改分支连接带宽大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSiteNetworkBandwidthSizeRequest 请求对象
     * @return CompletableFuture<UpdateSiteNetworkBandwidthSizeResponse>
     */
    public CompletableFuture<UpdateSiteNetworkBandwidthSizeResponse> updateSiteNetworkBandwidthSizeAsync(
        UpdateSiteNetworkBandwidthSizeRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.updateSiteNetworkBandwidthSize);
    }

    /**
     * 更改分支连接带宽大小
     *
     * 更改分支连接带宽大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSiteNetworkBandwidthSizeRequest 请求对象
     * @return AsyncInvoker<UpdateSiteNetworkBandwidthSizeRequest, UpdateSiteNetworkBandwidthSizeResponse>
     */
    public AsyncInvoker<UpdateSiteNetworkBandwidthSizeRequest, UpdateSiteNetworkBandwidthSizeResponse> updateSiteNetworkBandwidthSizeAsyncInvoker(
        UpdateSiteNetworkBandwidthSizeRequest request) {
        return new AsyncInvoker<>(request, CcMeta.updateSiteNetworkBandwidthSize, hcClient);
    }

    /**
     * 创建P2P类型的分支网络
     *
     * 创建P2P类型的分支网络。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateP2PSiteNetworkRequest 请求对象
     * @return CompletableFuture<CreateP2PSiteNetworkResponse>
     */
    public CompletableFuture<CreateP2PSiteNetworkResponse> createP2PSiteNetworkAsync(
        CreateP2PSiteNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.createP2PSiteNetwork);
    }

    /**
     * 创建P2P类型的分支网络
     *
     * 创建P2P类型的分支网络。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateP2PSiteNetworkRequest 请求对象
     * @return AsyncInvoker<CreateP2PSiteNetworkRequest, CreateP2PSiteNetworkResponse>
     */
    public AsyncInvoker<CreateP2PSiteNetworkRequest, CreateP2PSiteNetworkResponse> createP2PSiteNetworkAsyncInvoker(
        CreateP2PSiteNetworkRequest request) {
        return new AsyncInvoker<>(request, CcMeta.createP2PSiteNetwork, hcClient);
    }

    /**
     * 删除分支网络
     *
     * 删除分支网络。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSiteNetworkRequest 请求对象
     * @return CompletableFuture<DeleteSiteNetworkResponse>
     */
    public CompletableFuture<DeleteSiteNetworkResponse> deleteSiteNetworkAsync(DeleteSiteNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.deleteSiteNetwork);
    }

    /**
     * 删除分支网络
     *
     * 删除分支网络。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSiteNetworkRequest 请求对象
     * @return AsyncInvoker<DeleteSiteNetworkRequest, DeleteSiteNetworkResponse>
     */
    public AsyncInvoker<DeleteSiteNetworkRequest, DeleteSiteNetworkResponse> deleteSiteNetworkAsyncInvoker(
        DeleteSiteNetworkRequest request) {
        return new AsyncInvoker<>(request, CcMeta.deleteSiteNetwork, hcClient);
    }

    /**
     * 查询分支网络列表
     *
     * 查询分支网络列表。
     * 分页查询使用的参数为marker、limit。limit默认值为0，没有指定marker时返回第一条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSiteNetworksRequest 请求对象
     * @return CompletableFuture<ListSiteNetworksResponse>
     */
    public CompletableFuture<ListSiteNetworksResponse> listSiteNetworksAsync(ListSiteNetworksRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listSiteNetworks);
    }

    /**
     * 查询分支网络列表
     *
     * 查询分支网络列表。
     * 分页查询使用的参数为marker、limit。limit默认值为0，没有指定marker时返回第一条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSiteNetworksRequest 请求对象
     * @return AsyncInvoker<ListSiteNetworksRequest, ListSiteNetworksResponse>
     */
    public AsyncInvoker<ListSiteNetworksRequest, ListSiteNetworksResponse> listSiteNetworksAsyncInvoker(
        ListSiteNetworksRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listSiteNetworks, hcClient);
    }

    /**
     * 查询分支网络详情
     *
     * 查询分支网络详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSiteNetworkRequest 请求对象
     * @return CompletableFuture<ShowSiteNetworkResponse>
     */
    public CompletableFuture<ShowSiteNetworkResponse> showSiteNetworkAsync(ShowSiteNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.showSiteNetwork);
    }

    /**
     * 查询分支网络详情
     *
     * 查询分支网络详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSiteNetworkRequest 请求对象
     * @return AsyncInvoker<ShowSiteNetworkRequest, ShowSiteNetworkResponse>
     */
    public AsyncInvoker<ShowSiteNetworkRequest, ShowSiteNetworkResponse> showSiteNetworkAsyncInvoker(
        ShowSiteNetworkRequest request) {
        return new AsyncInvoker<>(request, CcMeta.showSiteNetwork, hcClient);
    }

    /**
     * 更新分支网络详情
     *
     * 更新分支网络详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSiteNetworkRequest 请求对象
     * @return CompletableFuture<UpdateSiteNetworkResponse>
     */
    public CompletableFuture<UpdateSiteNetworkResponse> updateSiteNetworkAsync(UpdateSiteNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.updateSiteNetwork);
    }

    /**
     * 更新分支网络详情
     *
     * 更新分支网络详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSiteNetworkRequest 请求对象
     * @return AsyncInvoker<UpdateSiteNetworkRequest, UpdateSiteNetworkResponse>
     */
    public AsyncInvoker<UpdateSiteNetworkRequest, UpdateSiteNetworkResponse> updateSiteNetworkAsyncInvoker(
        UpdateSiteNetworkRequest request) {
        return new AsyncInvoker<>(request, CcMeta.updateSiteNetwork, hcClient);
    }

    /**
     * 查询分支网络的能力列表
     *
     * 查询分支网络的能力列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSiteNetworkCapabilitiesRequest 请求对象
     * @return CompletableFuture<ListSiteNetworkCapabilitiesResponse>
     */
    public CompletableFuture<ListSiteNetworkCapabilitiesResponse> listSiteNetworkCapabilitiesAsync(
        ListSiteNetworkCapabilitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listSiteNetworkCapabilities);
    }

    /**
     * 查询分支网络的能力列表
     *
     * 查询分支网络的能力列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSiteNetworkCapabilitiesRequest 请求对象
     * @return AsyncInvoker<ListSiteNetworkCapabilitiesRequest, ListSiteNetworkCapabilitiesResponse>
     */
    public AsyncInvoker<ListSiteNetworkCapabilitiesRequest, ListSiteNetworkCapabilitiesResponse> listSiteNetworkCapabilitiesAsyncInvoker(
        ListSiteNetworkCapabilitiesRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listSiteNetworkCapabilities, hcClient);
    }

    /**
     * 查询分支网络配额
     *
     * 查询分支网络配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSiteNetworkQuotasRequest 请求对象
     * @return CompletableFuture<ListSiteNetworkQuotasResponse>
     */
    public CompletableFuture<ListSiteNetworkQuotasResponse> listSiteNetworkQuotasAsync(
        ListSiteNetworkQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listSiteNetworkQuotas);
    }

    /**
     * 查询分支网络配额
     *
     * 查询分支网络配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSiteNetworkQuotasRequest 请求对象
     * @return AsyncInvoker<ListSiteNetworkQuotasRequest, ListSiteNetworkQuotasResponse>
     */
    public AsyncInvoker<ListSiteNetworkQuotasRequest, ListSiteNetworkQuotasResponse> listSiteNetworkQuotasAsyncInvoker(
        ListSiteNetworkQuotasRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listSiteNetworkQuotas, hcClient);
    }

    /**
     * 查询大区互通类型的带宽包资源规格列表
     *
     * 查询大区互通类型的带宽包资源规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAreaBandwidthPackageSpecificationsRequest 请求对象
     * @return CompletableFuture<ListAreaBandwidthPackageSpecificationsResponse>
     */
    public CompletableFuture<ListAreaBandwidthPackageSpecificationsResponse> listAreaBandwidthPackageSpecificationsAsync(
        ListAreaBandwidthPackageSpecificationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listAreaBandwidthPackageSpecifications);
    }

    /**
     * 查询大区互通类型的带宽包资源规格列表
     *
     * 查询大区互通类型的带宽包资源规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAreaBandwidthPackageSpecificationsRequest 请求对象
     * @return AsyncInvoker<ListAreaBandwidthPackageSpecificationsRequest, ListAreaBandwidthPackageSpecificationsResponse>
     */
    public AsyncInvoker<ListAreaBandwidthPackageSpecificationsRequest, ListAreaBandwidthPackageSpecificationsResponse> listAreaBandwidthPackageSpecificationsAsyncInvoker(
        ListAreaBandwidthPackageSpecificationsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listAreaBandwidthPackageSpecifications, hcClient);
    }

    /**
     * 查询当前支持的大区列表
     *
     * 查询当前支持的大区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAreasRequest 请求对象
     * @return CompletableFuture<ListAreasResponse>
     */
    public CompletableFuture<ListAreasResponse> listAreasAsync(ListAreasRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listAreas);
    }

    /**
     * 查询当前支持的大区列表
     *
     * 查询当前支持的大区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAreasRequest 请求对象
     * @return AsyncInvoker<ListAreasRequest, ListAreasResponse>
     */
    public AsyncInvoker<ListAreasRequest, ListAreasResponse> listAreasAsyncInvoker(ListAreasRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listAreas, hcClient);
    }

    /**
     * 查询带宽包等级列表
     *
     * 查询带宽包等级列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthPackageLevelsRequest 请求对象
     * @return CompletableFuture<ListBandwidthPackageLevelsResponse>
     */
    public CompletableFuture<ListBandwidthPackageLevelsResponse> listBandwidthPackageLevelsAsync(
        ListBandwidthPackageLevelsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listBandwidthPackageLevels);
    }

    /**
     * 查询带宽包等级列表
     *
     * 查询带宽包等级列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthPackageLevelsRequest 请求对象
     * @return AsyncInvoker<ListBandwidthPackageLevelsRequest, ListBandwidthPackageLevelsResponse>
     */
    public AsyncInvoker<ListBandwidthPackageLevelsRequest, ListBandwidthPackageLevelsResponse> listBandwidthPackageLevelsAsyncInvoker(
        ListBandwidthPackageLevelsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listBandwidthPackageLevels, hcClient);
    }

    /**
     * 查询带宽包线路列表
     *
     * 查询带宽包线路列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthPackageLinesRequest 请求对象
     * @return CompletableFuture<ListBandwidthPackageLinesResponse>
     */
    public CompletableFuture<ListBandwidthPackageLinesResponse> listBandwidthPackageLinesAsync(
        ListBandwidthPackageLinesRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listBandwidthPackageLines);
    }

    /**
     * 查询带宽包线路列表
     *
     * 查询带宽包线路列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthPackageLinesRequest 请求对象
     * @return AsyncInvoker<ListBandwidthPackageLinesRequest, ListBandwidthPackageLinesResponse>
     */
    public AsyncInvoker<ListBandwidthPackageLinesRequest, ListBandwidthPackageLinesResponse> listBandwidthPackageLinesAsyncInvoker(
        ListBandwidthPackageLinesRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listBandwidthPackageLines, hcClient);
    }

    /**
     * 查询带宽包站点列表
     *
     * 查询带宽包站点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthPackageSitesRequest 请求对象
     * @return CompletableFuture<ListBandwidthPackageSitesResponse>
     */
    public CompletableFuture<ListBandwidthPackageSitesResponse> listBandwidthPackageSitesAsync(
        ListBandwidthPackageSitesRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listBandwidthPackageSites);
    }

    /**
     * 查询带宽包站点列表
     *
     * 查询带宽包站点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthPackageSitesRequest 请求对象
     * @return AsyncInvoker<ListBandwidthPackageSitesRequest, ListBandwidthPackageSitesResponse>
     */
    public AsyncInvoker<ListBandwidthPackageSitesRequest, ListBandwidthPackageSitesResponse> listBandwidthPackageSitesAsyncInvoker(
        ListBandwidthPackageSitesRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listBandwidthPackageSites, hcClient);
    }

    /**
     * 查询区域互通类型的带宽包规格列表
     *
     * 查询区域互通类型的带宽包规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionBandwidthPackageSpecificationsRequest 请求对象
     * @return CompletableFuture<ListRegionBandwidthPackageSpecificationsResponse>
     */
    public CompletableFuture<ListRegionBandwidthPackageSpecificationsResponse> listRegionBandwidthPackageSpecificationsAsync(
        ListRegionBandwidthPackageSpecificationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listRegionBandwidthPackageSpecifications);
    }

    /**
     * 查询区域互通类型的带宽包规格列表
     *
     * 查询区域互通类型的带宽包规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionBandwidthPackageSpecificationsRequest 请求对象
     * @return AsyncInvoker<ListRegionBandwidthPackageSpecificationsRequest, ListRegionBandwidthPackageSpecificationsResponse>
     */
    public AsyncInvoker<ListRegionBandwidthPackageSpecificationsRequest, ListRegionBandwidthPackageSpecificationsResponse> listRegionBandwidthPackageSpecificationsAsyncInvoker(
        ListRegionBandwidthPackageSpecificationsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listRegionBandwidthPackageSpecifications, hcClient);
    }

    /**
     * 查询当前支持的区域列表
     *
     * 查询当前支持的区域列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return CompletableFuture<ListRegionsResponse>
     */
    public CompletableFuture<ListRegionsResponse> listRegionsAsync(ListRegionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CcMeta.listRegions);
    }

    /**
     * 查询当前支持的区域列表
     *
     * 查询当前支持的区域列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return AsyncInvoker<ListRegionsRequest, ListRegionsResponse>
     */
    public AsyncInvoker<ListRegionsRequest, ListRegionsResponse> listRegionsAsyncInvoker(ListRegionsRequest request) {
        return new AsyncInvoker<>(request, CcMeta.listRegions, hcClient);
    }

}
