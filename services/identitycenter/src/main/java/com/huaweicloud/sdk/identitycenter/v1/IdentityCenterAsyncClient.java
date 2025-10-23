package com.huaweicloud.sdk.identitycenter.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedPolicyToPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedPolicyToPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedRoleToPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedRoleToPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateAccountAssignmentRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateAccountAssignmentResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateAliasRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateAliasResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateApplicationAssignmentRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateApplicationAssignmentResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateApplicationInstanceCertificateRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateApplicationInstanceCertificateResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateApplicationInstanceRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateApplicationInstanceResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateInstanceAccessControlAttributeConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateInstanceAccessControlAttributeConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreatePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreatePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateTagResourceRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateTagResourceResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteAccountAssignmentRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteAccountAssignmentResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteApplicationAssignmentRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteApplicationAssignmentResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteApplicationInstanceCertificateRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteApplicationInstanceCertificateResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteApplicationInstanceRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteApplicationInstanceResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteCustomPolicyFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteCustomPolicyFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteCustomRoleFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteCustomRoleFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteIdentityCenterRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteIdentityCenterResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteInstanceAccessControlAttributeConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteInstanceAccessControlAttributeConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeletePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeletePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteProfileRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteProfileResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteTagResourceRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteTagResourceResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentCreationStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentCreationStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentDeletionStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentDeletionStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeApplicationProviderRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeApplicationProviderResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeApplicationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeApplicationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeInstanceAccessControlAttributeConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeInstanceAccessControlAttributeConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetProvisioningStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetProvisioningStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeRegisteredRegionsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeRegisteredRegionsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedPolicyFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedPolicyFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedRoleFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedRoleFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DisassociateProfileRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DisassociateProfileResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetApplicationAssignmentConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetApplicationAssignmentConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetApplicationInstanceRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetApplicationInstanceResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetCustomPolicyForPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetCustomPolicyForPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetCustomRoleForPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetCustomRoleForPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetHaConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetHaConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetIdentityCenterServiceStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetIdentityCenterServiceStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetMfaDeviceManagementForIdentityStoreRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetMfaDeviceManagementForIdentityStoreResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetPermissionSetSummaryRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetPermissionSetSummaryResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetSsoConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetSsoConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ImportApplicationInstanceServiceProviderMetadataRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ImportApplicationInstanceServiceProviderMetadataResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentCreationStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentCreationStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentDeletionStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentDeletionStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentsForPrincipalRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentsForPrincipalResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountsForProvisionedPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountsForProvisionedPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationAssignmentsForPrincipalRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationAssignmentsForPrincipalResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationAssignmentsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationAssignmentsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationInstanceCertificatesRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationInstanceCertificatesResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationInstancesRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationInstancesResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationProvidersRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationProvidersResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationTemplatesRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationTemplatesResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListCatalogApplicationsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListCatalogApplicationsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListIdentityStoreAssociationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListIdentityStoreAssociationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListInstancesRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListInstancesResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListManagedPoliciesInPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListManagedPoliciesInPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListManagedRolesInPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListManagedRolesInPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetProvisioningStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetProvisioningStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsProvisionedToAccountRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsProvisionedToAccountResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListProfilesRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListProfilesResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListTagResourcesRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListTagResourcesResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ProvisionPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ProvisionPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.PutCustomPolicyToPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.PutCustomPolicyToPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.PutCustomRoleToPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.PutCustomRoleToPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.PutMfaDeviceManagementForIdentityStoreRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.PutMfaDeviceManagementForIdentityStoreResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.RegisterRegionRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.RegisterRegionResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.StartIdentityCenterRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.StartIdentityCenterResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceActiveCertificateRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceActiveCertificateResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceDisplayDataRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceDisplayDataResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceResponseConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceResponseConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceResponseSchemaConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceResponseSchemaConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceSecurityConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceSecurityConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceServiceProviderConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceServiceProviderConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateHaConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateHaConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateInstanceAccessControlAttributeConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateInstanceAccessControlAttributeConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdatePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdatePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateSsoConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateSsoConfigurationResponse;

import java.util.concurrent.CompletableFuture;

public class IdentityCenterAsyncClient {

    protected HcClient hcClient;

    public IdentityCenterAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IdentityCenterAsyncClient> newBuilder() {
        ClientBuilder<IdentityCenterAsyncClient> clientBuilder =
            new ClientBuilder<>(IdentityCenterAsyncClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 创建账户分配
     *
     * 使用指定的权限集为指定账户分配对应主体的访问权限，主体可为IdentityCenter用户或IdentityCenter用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccountAssignmentRequest 请求对象
     * @return CompletableFuture<CreateAccountAssignmentResponse>
     */
    public CompletableFuture<CreateAccountAssignmentResponse> createAccountAssignmentAsync(
        CreateAccountAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.createAccountAssignment);
    }

    /**
     * 创建账户分配
     *
     * 使用指定的权限集为指定账户分配对应主体的访问权限，主体可为IdentityCenter用户或IdentityCenter用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccountAssignmentRequest 请求对象
     * @return AsyncInvoker<CreateAccountAssignmentRequest, CreateAccountAssignmentResponse>
     */
    public AsyncInvoker<CreateAccountAssignmentRequest, CreateAccountAssignmentResponse> createAccountAssignmentAsyncInvoker(
        CreateAccountAssignmentRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.createAccountAssignment, hcClient);
    }

    /**
     * 删除账号分配
     *
     * 使用指定的权限集从指定的账号删除主体的访问权限，主体可为IAM身份中心用户或用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAccountAssignmentRequest 请求对象
     * @return CompletableFuture<DeleteAccountAssignmentResponse>
     */
    public CompletableFuture<DeleteAccountAssignmentResponse> deleteAccountAssignmentAsync(
        DeleteAccountAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.deleteAccountAssignment);
    }

    /**
     * 删除账号分配
     *
     * 使用指定的权限集从指定的账号删除主体的访问权限，主体可为IAM身份中心用户或用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAccountAssignmentRequest 请求对象
     * @return AsyncInvoker<DeleteAccountAssignmentRequest, DeleteAccountAssignmentResponse>
     */
    public AsyncInvoker<DeleteAccountAssignmentRequest, DeleteAccountAssignmentResponse> deleteAccountAssignmentAsyncInvoker(
        DeleteAccountAssignmentRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.deleteAccountAssignment, hcClient);
    }

    /**
     * 查询账户分配创建状态详情
     *
     * 根据请求ID，查询指定IAM Identity Center实例下的账户分配创建状态详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeAccountAssignmentCreationStatusRequest 请求对象
     * @return CompletableFuture<DescribeAccountAssignmentCreationStatusResponse>
     */
    public CompletableFuture<DescribeAccountAssignmentCreationStatusResponse> describeAccountAssignmentCreationStatusAsync(
        DescribeAccountAssignmentCreationStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.describeAccountAssignmentCreationStatus);
    }

    /**
     * 查询账户分配创建状态详情
     *
     * 根据请求ID，查询指定IAM Identity Center实例下的账户分配创建状态详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeAccountAssignmentCreationStatusRequest 请求对象
     * @return AsyncInvoker<DescribeAccountAssignmentCreationStatusRequest, DescribeAccountAssignmentCreationStatusResponse>
     */
    public AsyncInvoker<DescribeAccountAssignmentCreationStatusRequest, DescribeAccountAssignmentCreationStatusResponse> describeAccountAssignmentCreationStatusAsyncInvoker(
        DescribeAccountAssignmentCreationStatusRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.describeAccountAssignmentCreationStatus, hcClient);
    }

    /**
     * 查询账户分配删除状态详情
     *
     * 根据请求ID，查询指定IAM Identity Center实例下的账户分配删除状态详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeAccountAssignmentDeletionStatusRequest 请求对象
     * @return CompletableFuture<DescribeAccountAssignmentDeletionStatusResponse>
     */
    public CompletableFuture<DescribeAccountAssignmentDeletionStatusResponse> describeAccountAssignmentDeletionStatusAsync(
        DescribeAccountAssignmentDeletionStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.describeAccountAssignmentDeletionStatus);
    }

    /**
     * 查询账户分配删除状态详情
     *
     * 根据请求ID，查询指定IAM Identity Center实例下的账户分配删除状态详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeAccountAssignmentDeletionStatusRequest 请求对象
     * @return AsyncInvoker<DescribeAccountAssignmentDeletionStatusRequest, DescribeAccountAssignmentDeletionStatusResponse>
     */
    public AsyncInvoker<DescribeAccountAssignmentDeletionStatusRequest, DescribeAccountAssignmentDeletionStatusResponse> describeAccountAssignmentDeletionStatusAsyncInvoker(
        DescribeAccountAssignmentDeletionStatusRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.describeAccountAssignmentDeletionStatus, hcClient);
    }

    /**
     * 解除与用户或组绑定的所有账号授权关联
     *
     * 解除与用户或组绑定的所有账号授权关联。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateProfileRequest 请求对象
     * @return CompletableFuture<DisassociateProfileResponse>
     */
    public CompletableFuture<DisassociateProfileResponse> disassociateProfileAsync(DisassociateProfileRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.disassociateProfile);
    }

    /**
     * 解除与用户或组绑定的所有账号授权关联
     *
     * 解除与用户或组绑定的所有账号授权关联。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateProfileRequest 请求对象
     * @return AsyncInvoker<DisassociateProfileRequest, DisassociateProfileResponse>
     */
    public AsyncInvoker<DisassociateProfileRequest, DisassociateProfileResponse> disassociateProfileAsyncInvoker(
        DisassociateProfileRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.disassociateProfile, hcClient);
    }

    /**
     * 列出账户分配创建状态
     *
     * 查询指定IAM Identity Center实例下的账户分配的创建状态列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountAssignmentCreationStatusRequest 请求对象
     * @return CompletableFuture<ListAccountAssignmentCreationStatusResponse>
     */
    public CompletableFuture<ListAccountAssignmentCreationStatusResponse> listAccountAssignmentCreationStatusAsync(
        ListAccountAssignmentCreationStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listAccountAssignmentCreationStatus);
    }

    /**
     * 列出账户分配创建状态
     *
     * 查询指定IAM Identity Center实例下的账户分配的创建状态列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountAssignmentCreationStatusRequest 请求对象
     * @return AsyncInvoker<ListAccountAssignmentCreationStatusRequest, ListAccountAssignmentCreationStatusResponse>
     */
    public AsyncInvoker<ListAccountAssignmentCreationStatusRequest, ListAccountAssignmentCreationStatusResponse> listAccountAssignmentCreationStatusAsyncInvoker(
        ListAccountAssignmentCreationStatusRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listAccountAssignmentCreationStatus, hcClient);
    }

    /**
     * 列出账户分配删除状态
     *
     * 查询指定IAM Identity Center实例下的账户分配的删除状态列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountAssignmentDeletionStatusRequest 请求对象
     * @return CompletableFuture<ListAccountAssignmentDeletionStatusResponse>
     */
    public CompletableFuture<ListAccountAssignmentDeletionStatusResponse> listAccountAssignmentDeletionStatusAsync(
        ListAccountAssignmentDeletionStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listAccountAssignmentDeletionStatus);
    }

    /**
     * 列出账户分配删除状态
     *
     * 查询指定IAM Identity Center实例下的账户分配的删除状态列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountAssignmentDeletionStatusRequest 请求对象
     * @return AsyncInvoker<ListAccountAssignmentDeletionStatusRequest, ListAccountAssignmentDeletionStatusResponse>
     */
    public AsyncInvoker<ListAccountAssignmentDeletionStatusRequest, ListAccountAssignmentDeletionStatusResponse> listAccountAssignmentDeletionStatusAsyncInvoker(
        ListAccountAssignmentDeletionStatusRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listAccountAssignmentDeletionStatus, hcClient);
    }

    /**
     * 列出账户和权限集关联的用户或用户组
     *
     * 列出与指定账户以及指定权限集关联的用户或用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountAssignmentsRequest 请求对象
     * @return CompletableFuture<ListAccountAssignmentsResponse>
     */
    public CompletableFuture<ListAccountAssignmentsResponse> listAccountAssignmentsAsync(
        ListAccountAssignmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listAccountAssignments);
    }

    /**
     * 列出账户和权限集关联的用户或用户组
     *
     * 列出与指定账户以及指定权限集关联的用户或用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountAssignmentsRequest 请求对象
     * @return AsyncInvoker<ListAccountAssignmentsRequest, ListAccountAssignmentsResponse>
     */
    public AsyncInvoker<ListAccountAssignmentsRequest, ListAccountAssignmentsResponse> listAccountAssignmentsAsyncInvoker(
        ListAccountAssignmentsRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listAccountAssignments, hcClient);
    }

    /**
     * 检索与用户或用户组关联的账号列表
     *
     * 检索与用户或用户组关联的账号列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountAssignmentsForPrincipalRequest 请求对象
     * @return CompletableFuture<ListAccountAssignmentsForPrincipalResponse>
     */
    public CompletableFuture<ListAccountAssignmentsForPrincipalResponse> listAccountAssignmentsForPrincipalAsync(
        ListAccountAssignmentsForPrincipalRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listAccountAssignmentsForPrincipal);
    }

    /**
     * 检索与用户或用户组关联的账号列表
     *
     * 检索与用户或用户组关联的账号列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountAssignmentsForPrincipalRequest 请求对象
     * @return AsyncInvoker<ListAccountAssignmentsForPrincipalRequest, ListAccountAssignmentsForPrincipalResponse>
     */
    public AsyncInvoker<ListAccountAssignmentsForPrincipalRequest, ListAccountAssignmentsForPrincipalResponse> listAccountAssignmentsForPrincipalAsyncInvoker(
        ListAccountAssignmentsForPrincipalRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listAccountAssignmentsForPrincipal, hcClient);
    }

    /**
     * 创建应用程序实例
     *
     * 创建应用程序实例。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationInstanceRequest 请求对象
     * @return CompletableFuture<CreateApplicationInstanceResponse>
     */
    public CompletableFuture<CreateApplicationInstanceResponse> createApplicationInstanceAsync(
        CreateApplicationInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.createApplicationInstance);
    }

    /**
     * 创建应用程序实例
     *
     * 创建应用程序实例。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationInstanceRequest 请求对象
     * @return AsyncInvoker<CreateApplicationInstanceRequest, CreateApplicationInstanceResponse>
     */
    public AsyncInvoker<CreateApplicationInstanceRequest, CreateApplicationInstanceResponse> createApplicationInstanceAsyncInvoker(
        CreateApplicationInstanceRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.createApplicationInstance, hcClient);
    }

    /**
     * 删除应用程序实例
     *
     * 删除应用程序实例。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationInstanceRequest 请求对象
     * @return CompletableFuture<DeleteApplicationInstanceResponse>
     */
    public CompletableFuture<DeleteApplicationInstanceResponse> deleteApplicationInstanceAsync(
        DeleteApplicationInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.deleteApplicationInstance);
    }

    /**
     * 删除应用程序实例
     *
     * 删除应用程序实例。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteApplicationInstanceRequest, DeleteApplicationInstanceResponse>
     */
    public AsyncInvoker<DeleteApplicationInstanceRequest, DeleteApplicationInstanceResponse> deleteApplicationInstanceAsyncInvoker(
        DeleteApplicationInstanceRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.deleteApplicationInstance, hcClient);
    }

    /**
     * 删除应用程序实例与用户或用户组关联关系
     *
     * 删除应用程序实例与用户或用户组关联关系。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProfileRequest 请求对象
     * @return CompletableFuture<DeleteProfileResponse>
     */
    public CompletableFuture<DeleteProfileResponse> deleteProfileAsync(DeleteProfileRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.deleteProfile);
    }

    /**
     * 删除应用程序实例与用户或用户组关联关系
     *
     * 删除应用程序实例与用户或用户组关联关系。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProfileRequest 请求对象
     * @return AsyncInvoker<DeleteProfileRequest, DeleteProfileResponse>
     */
    public AsyncInvoker<DeleteProfileRequest, DeleteProfileResponse> deleteProfileAsyncInvoker(
        DeleteProfileRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.deleteProfile, hcClient);
    }

    /**
     * 查询应用程序详情
     *
     * 查询应用程序详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeApplicationRequest 请求对象
     * @return CompletableFuture<DescribeApplicationResponse>
     */
    public CompletableFuture<DescribeApplicationResponse> describeApplicationAsync(DescribeApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.describeApplication);
    }

    /**
     * 查询应用程序详情
     *
     * 查询应用程序详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeApplicationRequest 请求对象
     * @return AsyncInvoker<DescribeApplicationRequest, DescribeApplicationResponse>
     */
    public AsyncInvoker<DescribeApplicationRequest, DescribeApplicationResponse> describeApplicationAsyncInvoker(
        DescribeApplicationRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.describeApplication, hcClient);
    }

    /**
     * 查询应用程序提供者详情
     *
     * 查询应用程序提供者详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeApplicationProviderRequest 请求对象
     * @return CompletableFuture<DescribeApplicationProviderResponse>
     */
    public CompletableFuture<DescribeApplicationProviderResponse> describeApplicationProviderAsync(
        DescribeApplicationProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.describeApplicationProvider);
    }

    /**
     * 查询应用程序提供者详情
     *
     * 查询应用程序提供者详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeApplicationProviderRequest 请求对象
     * @return AsyncInvoker<DescribeApplicationProviderRequest, DescribeApplicationProviderResponse>
     */
    public AsyncInvoker<DescribeApplicationProviderRequest, DescribeApplicationProviderResponse> describeApplicationProviderAsyncInvoker(
        DescribeApplicationProviderRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.describeApplicationProvider, hcClient);
    }

    /**
     * 查询应用程序分配属性配置
     *
     * 查询应用程序分配属性配置，目的为用户或者用户组分配对应用程序的访问权限。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetApplicationAssignmentConfigurationRequest 请求对象
     * @return CompletableFuture<GetApplicationAssignmentConfigurationResponse>
     */
    public CompletableFuture<GetApplicationAssignmentConfigurationResponse> getApplicationAssignmentConfigurationAsync(
        GetApplicationAssignmentConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.getApplicationAssignmentConfiguration);
    }

    /**
     * 查询应用程序分配属性配置
     *
     * 查询应用程序分配属性配置，目的为用户或者用户组分配对应用程序的访问权限。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetApplicationAssignmentConfigurationRequest 请求对象
     * @return AsyncInvoker<GetApplicationAssignmentConfigurationRequest, GetApplicationAssignmentConfigurationResponse>
     */
    public AsyncInvoker<GetApplicationAssignmentConfigurationRequest, GetApplicationAssignmentConfigurationResponse> getApplicationAssignmentConfigurationAsyncInvoker(
        GetApplicationAssignmentConfigurationRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.getApplicationAssignmentConfiguration, hcClient);
    }

    /**
     * 查询应用程序实例详情
     *
     * 查询应用程序实例详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetApplicationInstanceRequest 请求对象
     * @return CompletableFuture<GetApplicationInstanceResponse>
     */
    public CompletableFuture<GetApplicationInstanceResponse> getApplicationInstanceAsync(
        GetApplicationInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.getApplicationInstance);
    }

    /**
     * 查询应用程序实例详情
     *
     * 查询应用程序实例详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetApplicationInstanceRequest 请求对象
     * @return AsyncInvoker<GetApplicationInstanceRequest, GetApplicationInstanceResponse>
     */
    public AsyncInvoker<GetApplicationInstanceRequest, GetApplicationInstanceResponse> getApplicationInstanceAsyncInvoker(
        GetApplicationInstanceRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.getApplicationInstance, hcClient);
    }

    /**
     * 上传应用程序实例元数据文件
     *
     * 上传应用程序实例元数据文件。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportApplicationInstanceServiceProviderMetadataRequest 请求对象
     * @return CompletableFuture<ImportApplicationInstanceServiceProviderMetadataResponse>
     */
    public CompletableFuture<ImportApplicationInstanceServiceProviderMetadataResponse> importApplicationInstanceServiceProviderMetadataAsync(
        ImportApplicationInstanceServiceProviderMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.importApplicationInstanceServiceProviderMetadata);
    }

    /**
     * 上传应用程序实例元数据文件
     *
     * 上传应用程序实例元数据文件。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportApplicationInstanceServiceProviderMetadataRequest 请求对象
     * @return AsyncInvoker<ImportApplicationInstanceServiceProviderMetadataRequest, ImportApplicationInstanceServiceProviderMetadataResponse>
     */
    public AsyncInvoker<ImportApplicationInstanceServiceProviderMetadataRequest, ImportApplicationInstanceServiceProviderMetadataResponse> importApplicationInstanceServiceProviderMetadataAsyncInvoker(
        ImportApplicationInstanceServiceProviderMetadataRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.importApplicationInstanceServiceProviderMetadata,
            hcClient);
    }

    /**
     * 列出应用程序实例
     *
     * 列出应用程序实例。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationInstancesRequest 请求对象
     * @return CompletableFuture<ListApplicationInstancesResponse>
     */
    public CompletableFuture<ListApplicationInstancesResponse> listApplicationInstancesAsync(
        ListApplicationInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listApplicationInstances);
    }

    /**
     * 列出应用程序实例
     *
     * 列出应用程序实例。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationInstancesRequest 请求对象
     * @return AsyncInvoker<ListApplicationInstancesRequest, ListApplicationInstancesResponse>
     */
    public AsyncInvoker<ListApplicationInstancesRequest, ListApplicationInstancesResponse> listApplicationInstancesAsyncInvoker(
        ListApplicationInstancesRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listApplicationInstances, hcClient);
    }

    /**
     * 列出应用程序提供者
     *
     * 查询应用程序提供者列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationProvidersRequest 请求对象
     * @return CompletableFuture<ListApplicationProvidersResponse>
     */
    public CompletableFuture<ListApplicationProvidersResponse> listApplicationProvidersAsync(
        ListApplicationProvidersRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listApplicationProviders);
    }

    /**
     * 列出应用程序提供者
     *
     * 查询应用程序提供者列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationProvidersRequest 请求对象
     * @return AsyncInvoker<ListApplicationProvidersRequest, ListApplicationProvidersResponse>
     */
    public AsyncInvoker<ListApplicationProvidersRequest, ListApplicationProvidersResponse> listApplicationProvidersAsyncInvoker(
        ListApplicationProvidersRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listApplicationProviders, hcClient);
    }

    /**
     * 列出应用程序模板
     *
     * 查询应用程序模板列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationTemplatesRequest 请求对象
     * @return CompletableFuture<ListApplicationTemplatesResponse>
     */
    public CompletableFuture<ListApplicationTemplatesResponse> listApplicationTemplatesAsync(
        ListApplicationTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listApplicationTemplates);
    }

    /**
     * 列出应用程序模板
     *
     * 查询应用程序模板列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationTemplatesRequest 请求对象
     * @return AsyncInvoker<ListApplicationTemplatesRequest, ListApplicationTemplatesResponse>
     */
    public AsyncInvoker<ListApplicationTemplatesRequest, ListApplicationTemplatesResponse> listApplicationTemplatesAsyncInvoker(
        ListApplicationTemplatesRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listApplicationTemplates, hcClient);
    }

    /**
     * 列出应用程序
     *
     * 查询应用程序列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationsRequest 请求对象
     * @return CompletableFuture<ListApplicationsResponse>
     */
    public CompletableFuture<ListApplicationsResponse> listApplicationsAsync(ListApplicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listApplications);
    }

    /**
     * 列出应用程序
     *
     * 查询应用程序列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationsRequest 请求对象
     * @return AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse>
     */
    public AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse> listApplicationsAsyncInvoker(
        ListApplicationsRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listApplications, hcClient);
    }

    /**
     * 列出应用程序目录中的预置应用模板
     *
     * 列出应用程序目录中的预置应用模板。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCatalogApplicationsRequest 请求对象
     * @return CompletableFuture<ListCatalogApplicationsResponse>
     */
    public CompletableFuture<ListCatalogApplicationsResponse> listCatalogApplicationsAsync(
        ListCatalogApplicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listCatalogApplications);
    }

    /**
     * 列出应用程序目录中的预置应用模板
     *
     * 列出应用程序目录中的预置应用模板。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCatalogApplicationsRequest 请求对象
     * @return AsyncInvoker<ListCatalogApplicationsRequest, ListCatalogApplicationsResponse>
     */
    public AsyncInvoker<ListCatalogApplicationsRequest, ListCatalogApplicationsResponse> listCatalogApplicationsAsyncInvoker(
        ListCatalogApplicationsRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listCatalogApplications, hcClient);
    }

    /**
     * 列出应用程序实例与用户或用户组存在的关联关系
     *
     * 列出应用程序实例与用户或用户组存在的关联关系。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProfilesRequest 请求对象
     * @return CompletableFuture<ListProfilesResponse>
     */
    public CompletableFuture<ListProfilesResponse> listProfilesAsync(ListProfilesRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listProfiles);
    }

    /**
     * 列出应用程序实例与用户或用户组存在的关联关系
     *
     * 列出应用程序实例与用户或用户组存在的关联关系。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProfilesRequest 请求对象
     * @return AsyncInvoker<ListProfilesRequest, ListProfilesResponse>
     */
    public AsyncInvoker<ListProfilesRequest, ListProfilesResponse> listProfilesAsyncInvoker(
        ListProfilesRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listProfiles, hcClient);
    }

    /**
     * 更新应用程序实例显示信息
     *
     * 更新应用程序实例显示信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceDisplayDataRequest 请求对象
     * @return CompletableFuture<UpdateApplicationInstanceDisplayDataResponse>
     */
    public CompletableFuture<UpdateApplicationInstanceDisplayDataResponse> updateApplicationInstanceDisplayDataAsync(
        UpdateApplicationInstanceDisplayDataRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.updateApplicationInstanceDisplayData);
    }

    /**
     * 更新应用程序实例显示信息
     *
     * 更新应用程序实例显示信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceDisplayDataRequest 请求对象
     * @return AsyncInvoker<UpdateApplicationInstanceDisplayDataRequest, UpdateApplicationInstanceDisplayDataResponse>
     */
    public AsyncInvoker<UpdateApplicationInstanceDisplayDataRequest, UpdateApplicationInstanceDisplayDataResponse> updateApplicationInstanceDisplayDataAsyncInvoker(
        UpdateApplicationInstanceDisplayDataRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.updateApplicationInstanceDisplayData, hcClient);
    }

    /**
     * 更新应用程序属性配置
     *
     * 更新应用程序属性配置信息，更新应用程序中的属性映射、中继状态以及会话过期时间。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceResponseConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateApplicationInstanceResponseConfigurationResponse>
     */
    public CompletableFuture<UpdateApplicationInstanceResponseConfigurationResponse> updateApplicationInstanceResponseConfigurationAsync(
        UpdateApplicationInstanceResponseConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.updateApplicationInstanceResponseConfiguration);
    }

    /**
     * 更新应用程序属性配置
     *
     * 更新应用程序属性配置信息，更新应用程序中的属性映射、中继状态以及会话过期时间。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceResponseConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateApplicationInstanceResponseConfigurationRequest, UpdateApplicationInstanceResponseConfigurationResponse>
     */
    public AsyncInvoker<UpdateApplicationInstanceResponseConfigurationRequest, UpdateApplicationInstanceResponseConfigurationResponse> updateApplicationInstanceResponseConfigurationAsyncInvoker(
        UpdateApplicationInstanceResponseConfigurationRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.updateApplicationInstanceResponseConfiguration, hcClient);
    }

    /**
     * 更新应用程序Schema属性映射配置
     *
     * 更新应用程序Schema属性映射配置，支持SAML断言中Subject属性映射以及Subject NameID格式。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceResponseSchemaConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateApplicationInstanceResponseSchemaConfigurationResponse>
     */
    public CompletableFuture<UpdateApplicationInstanceResponseSchemaConfigurationResponse> updateApplicationInstanceResponseSchemaConfigurationAsync(
        UpdateApplicationInstanceResponseSchemaConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request,
            IdentityCenterMeta.updateApplicationInstanceResponseSchemaConfiguration);
    }

    /**
     * 更新应用程序Schema属性映射配置
     *
     * 更新应用程序Schema属性映射配置，支持SAML断言中Subject属性映射以及Subject NameID格式。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceResponseSchemaConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateApplicationInstanceResponseSchemaConfigurationRequest, UpdateApplicationInstanceResponseSchemaConfigurationResponse>
     */
    public AsyncInvoker<UpdateApplicationInstanceResponseSchemaConfigurationRequest, UpdateApplicationInstanceResponseSchemaConfigurationResponse> updateApplicationInstanceResponseSchemaConfigurationAsyncInvoker(
        UpdateApplicationInstanceResponseSchemaConfigurationRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.updateApplicationInstanceResponseSchemaConfiguration,
            hcClient);
    }

    /**
     * 更新应用程序实例证书配置
     *
     * 更新应用程序实例证书配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceSecurityConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateApplicationInstanceSecurityConfigurationResponse>
     */
    public CompletableFuture<UpdateApplicationInstanceSecurityConfigurationResponse> updateApplicationInstanceSecurityConfigurationAsync(
        UpdateApplicationInstanceSecurityConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.updateApplicationInstanceSecurityConfiguration);
    }

    /**
     * 更新应用程序实例证书配置
     *
     * 更新应用程序实例证书配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceSecurityConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateApplicationInstanceSecurityConfigurationRequest, UpdateApplicationInstanceSecurityConfigurationResponse>
     */
    public AsyncInvoker<UpdateApplicationInstanceSecurityConfigurationRequest, UpdateApplicationInstanceSecurityConfigurationResponse> updateApplicationInstanceSecurityConfigurationAsyncInvoker(
        UpdateApplicationInstanceSecurityConfigurationRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.updateApplicationInstanceSecurityConfiguration, hcClient);
    }

    /**
     * 更新应用程序实例服务提供商配置
     *
     * 更新应用程序实例服务提供商配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceServiceProviderConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateApplicationInstanceServiceProviderConfigurationResponse>
     */
    public CompletableFuture<UpdateApplicationInstanceServiceProviderConfigurationResponse> updateApplicationInstanceServiceProviderConfigurationAsync(
        UpdateApplicationInstanceServiceProviderConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request,
            IdentityCenterMeta.updateApplicationInstanceServiceProviderConfiguration);
    }

    /**
     * 更新应用程序实例服务提供商配置
     *
     * 更新应用程序实例服务提供商配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceServiceProviderConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateApplicationInstanceServiceProviderConfigurationRequest, UpdateApplicationInstanceServiceProviderConfigurationResponse>
     */
    public AsyncInvoker<UpdateApplicationInstanceServiceProviderConfigurationRequest, UpdateApplicationInstanceServiceProviderConfigurationResponse> updateApplicationInstanceServiceProviderConfigurationAsyncInvoker(
        UpdateApplicationInstanceServiceProviderConfigurationRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.updateApplicationInstanceServiceProviderConfiguration,
            hcClient);
    }

    /**
     * 更新应用程序实例状态
     *
     * 更新应用程序实例状态。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceStatusRequest 请求对象
     * @return CompletableFuture<UpdateApplicationInstanceStatusResponse>
     */
    public CompletableFuture<UpdateApplicationInstanceStatusResponse> updateApplicationInstanceStatusAsync(
        UpdateApplicationInstanceStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.updateApplicationInstanceStatus);
    }

    /**
     * 更新应用程序实例状态
     *
     * 更新应用程序实例状态。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceStatusRequest 请求对象
     * @return AsyncInvoker<UpdateApplicationInstanceStatusRequest, UpdateApplicationInstanceStatusResponse>
     */
    public AsyncInvoker<UpdateApplicationInstanceStatusRequest, UpdateApplicationInstanceStatusResponse> updateApplicationInstanceStatusAsyncInvoker(
        UpdateApplicationInstanceStatusRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.updateApplicationInstanceStatus, hcClient);
    }

    /**
     * 应用程序分配用户或用户组
     *
     * 应用程序分配用户或用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationAssignmentRequest 请求对象
     * @return CompletableFuture<CreateApplicationAssignmentResponse>
     */
    public CompletableFuture<CreateApplicationAssignmentResponse> createApplicationAssignmentAsync(
        CreateApplicationAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.createApplicationAssignment);
    }

    /**
     * 应用程序分配用户或用户组
     *
     * 应用程序分配用户或用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationAssignmentRequest 请求对象
     * @return AsyncInvoker<CreateApplicationAssignmentRequest, CreateApplicationAssignmentResponse>
     */
    public AsyncInvoker<CreateApplicationAssignmentRequest, CreateApplicationAssignmentResponse> createApplicationAssignmentAsyncInvoker(
        CreateApplicationAssignmentRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.createApplicationAssignment, hcClient);
    }

    /**
     * 删除应用程序已分配用户或用户组
     *
     * 删除应用程序已分配用户或用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationAssignmentRequest 请求对象
     * @return CompletableFuture<DeleteApplicationAssignmentResponse>
     */
    public CompletableFuture<DeleteApplicationAssignmentResponse> deleteApplicationAssignmentAsync(
        DeleteApplicationAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.deleteApplicationAssignment);
    }

    /**
     * 删除应用程序已分配用户或用户组
     *
     * 删除应用程序已分配用户或用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationAssignmentRequest 请求对象
     * @return AsyncInvoker<DeleteApplicationAssignmentRequest, DeleteApplicationAssignmentResponse>
     */
    public AsyncInvoker<DeleteApplicationAssignmentRequest, DeleteApplicationAssignmentResponse> deleteApplicationAssignmentAsyncInvoker(
        DeleteApplicationAssignmentRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.deleteApplicationAssignment, hcClient);
    }

    /**
     * 查询应用程序已分配的用户或用户组列表
     *
     * 查询应用程序已分配的用户或用户组列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationAssignmentsRequest 请求对象
     * @return CompletableFuture<ListApplicationAssignmentsResponse>
     */
    public CompletableFuture<ListApplicationAssignmentsResponse> listApplicationAssignmentsAsync(
        ListApplicationAssignmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listApplicationAssignments);
    }

    /**
     * 查询应用程序已分配的用户或用户组列表
     *
     * 查询应用程序已分配的用户或用户组列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationAssignmentsRequest 请求对象
     * @return AsyncInvoker<ListApplicationAssignmentsRequest, ListApplicationAssignmentsResponse>
     */
    public AsyncInvoker<ListApplicationAssignmentsRequest, ListApplicationAssignmentsResponse> listApplicationAssignmentsAsyncInvoker(
        ListApplicationAssignmentsRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listApplicationAssignments, hcClient);
    }

    /**
     * 检索与用户或用户组关联的应用程序列表
     *
     * 检索与用户或用户组关联的应用程序列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationAssignmentsForPrincipalRequest 请求对象
     * @return CompletableFuture<ListApplicationAssignmentsForPrincipalResponse>
     */
    public CompletableFuture<ListApplicationAssignmentsForPrincipalResponse> listApplicationAssignmentsForPrincipalAsync(
        ListApplicationAssignmentsForPrincipalRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listApplicationAssignmentsForPrincipal);
    }

    /**
     * 检索与用户或用户组关联的应用程序列表
     *
     * 检索与用户或用户组关联的应用程序列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationAssignmentsForPrincipalRequest 请求对象
     * @return AsyncInvoker<ListApplicationAssignmentsForPrincipalRequest, ListApplicationAssignmentsForPrincipalResponse>
     */
    public AsyncInvoker<ListApplicationAssignmentsForPrincipalRequest, ListApplicationAssignmentsForPrincipalResponse> listApplicationAssignmentsForPrincipalAsyncInvoker(
        ListApplicationAssignmentsForPrincipalRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listApplicationAssignmentsForPrincipal, hcClient);
    }

    /**
     * 创建应用程序实例证书
     *
     * 创建应用程序实例证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationInstanceCertificateRequest 请求对象
     * @return CompletableFuture<CreateApplicationInstanceCertificateResponse>
     */
    public CompletableFuture<CreateApplicationInstanceCertificateResponse> createApplicationInstanceCertificateAsync(
        CreateApplicationInstanceCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.createApplicationInstanceCertificate);
    }

    /**
     * 创建应用程序实例证书
     *
     * 创建应用程序实例证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationInstanceCertificateRequest 请求对象
     * @return AsyncInvoker<CreateApplicationInstanceCertificateRequest, CreateApplicationInstanceCertificateResponse>
     */
    public AsyncInvoker<CreateApplicationInstanceCertificateRequest, CreateApplicationInstanceCertificateResponse> createApplicationInstanceCertificateAsyncInvoker(
        CreateApplicationInstanceCertificateRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.createApplicationInstanceCertificate, hcClient);
    }

    /**
     * 删除应用程序实例证书
     *
     * 删除应用程序实例证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationInstanceCertificateRequest 请求对象
     * @return CompletableFuture<DeleteApplicationInstanceCertificateResponse>
     */
    public CompletableFuture<DeleteApplicationInstanceCertificateResponse> deleteApplicationInstanceCertificateAsync(
        DeleteApplicationInstanceCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.deleteApplicationInstanceCertificate);
    }

    /**
     * 删除应用程序实例证书
     *
     * 删除应用程序实例证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationInstanceCertificateRequest 请求对象
     * @return AsyncInvoker<DeleteApplicationInstanceCertificateRequest, DeleteApplicationInstanceCertificateResponse>
     */
    public AsyncInvoker<DeleteApplicationInstanceCertificateRequest, DeleteApplicationInstanceCertificateResponse> deleteApplicationInstanceCertificateAsyncInvoker(
        DeleteApplicationInstanceCertificateRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.deleteApplicationInstanceCertificate, hcClient);
    }

    /**
     * 列出应用程序实例证书
     *
     * 查询应用程序实例证书列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationInstanceCertificatesRequest 请求对象
     * @return CompletableFuture<ListApplicationInstanceCertificatesResponse>
     */
    public CompletableFuture<ListApplicationInstanceCertificatesResponse> listApplicationInstanceCertificatesAsync(
        ListApplicationInstanceCertificatesRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listApplicationInstanceCertificates);
    }

    /**
     * 列出应用程序实例证书
     *
     * 查询应用程序实例证书列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationInstanceCertificatesRequest 请求对象
     * @return AsyncInvoker<ListApplicationInstanceCertificatesRequest, ListApplicationInstanceCertificatesResponse>
     */
    public AsyncInvoker<ListApplicationInstanceCertificatesRequest, ListApplicationInstanceCertificatesResponse> listApplicationInstanceCertificatesAsyncInvoker(
        ListApplicationInstanceCertificatesRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listApplicationInstanceCertificates, hcClient);
    }

    /**
     * 激活应用程序实例证书
     *
     * 激活应用程序实例证书，实现证书轮转。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceActiveCertificateRequest 请求对象
     * @return CompletableFuture<UpdateApplicationInstanceActiveCertificateResponse>
     */
    public CompletableFuture<UpdateApplicationInstanceActiveCertificateResponse> updateApplicationInstanceActiveCertificateAsync(
        UpdateApplicationInstanceActiveCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.updateApplicationInstanceActiveCertificate);
    }

    /**
     * 激活应用程序实例证书
     *
     * 激活应用程序实例证书，实现证书轮转。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceActiveCertificateRequest 请求对象
     * @return AsyncInvoker<UpdateApplicationInstanceActiveCertificateRequest, UpdateApplicationInstanceActiveCertificateResponse>
     */
    public AsyncInvoker<UpdateApplicationInstanceActiveCertificateRequest, UpdateApplicationInstanceActiveCertificateResponse> updateApplicationInstanceActiveCertificateAsyncInvoker(
        UpdateApplicationInstanceActiveCertificateRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.updateApplicationInstanceActiveCertificate, hcClient);
    }

    /**
     * 查询实例配置信息
     *
     * 查询IAM身份中心实例配置信息，包括身份认证配置和会话管理配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetSsoConfigurationRequest 请求对象
     * @return CompletableFuture<GetSsoConfigurationResponse>
     */
    public CompletableFuture<GetSsoConfigurationResponse> getSsoConfigurationAsync(GetSsoConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.getSsoConfiguration);
    }

    /**
     * 查询实例配置信息
     *
     * 查询IAM身份中心实例配置信息，包括身份认证配置和会话管理配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetSsoConfigurationRequest 请求对象
     * @return AsyncInvoker<GetSsoConfigurationRequest, GetSsoConfigurationResponse>
     */
    public AsyncInvoker<GetSsoConfigurationRequest, GetSsoConfigurationResponse> getSsoConfigurationAsyncInvoker(
        GetSsoConfigurationRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.getSsoConfiguration, hcClient);
    }

    /**
     * 设置实例配置信息
     *
     * 设置IAM身份中心服务实例配置信息，包括身份认证配置和会话管理配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSsoConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateSsoConfigurationResponse>
     */
    public CompletableFuture<UpdateSsoConfigurationResponse> updateSsoConfigurationAsync(
        UpdateSsoConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.updateSsoConfiguration);
    }

    /**
     * 设置实例配置信息
     *
     * 设置IAM身份中心服务实例配置信息，包括身份认证配置和会话管理配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSsoConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateSsoConfigurationRequest, UpdateSsoConfigurationResponse>
     */
    public AsyncInvoker<UpdateSsoConfigurationRequest, UpdateSsoConfigurationResponse> updateSsoConfigurationAsyncInvoker(
        UpdateSsoConfigurationRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.updateSsoConfiguration, hcClient);
    }

    /**
     * 自定义访问门户URL
     *
     * 自定义访问门户URL，默认情况下，您可以使用遵循以下格式的 URL访问门户：idcenter.huaweicloud.com/d-xxxxxxxxxx/portal，您可以按如下方式更改为自定义 URL：idcenter.huaweicloud.com/your_subdomain/portal。设置自定义访问门户URL是一次性操作，无法撤销。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAliasRequest 请求对象
     * @return CompletableFuture<CreateAliasResponse>
     */
    public CompletableFuture<CreateAliasResponse> createAliasAsync(CreateAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.createAlias);
    }

    /**
     * 自定义访问门户URL
     *
     * 自定义访问门户URL，默认情况下，您可以使用遵循以下格式的 URL访问门户：idcenter.huaweicloud.com/d-xxxxxxxxxx/portal，您可以按如下方式更改为自定义 URL：idcenter.huaweicloud.com/your_subdomain/portal。设置自定义访问门户URL是一次性操作，无法撤销。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAliasRequest 请求对象
     * @return AsyncInvoker<CreateAliasRequest, CreateAliasResponse>
     */
    public AsyncInvoker<CreateAliasRequest, CreateAliasResponse> createAliasAsyncInvoker(CreateAliasRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.createAlias, hcClient);
    }

    /**
     * 删除服务实例
     *
     * 删除IAM Identity Center服务实例。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIdentityCenterRequest 请求对象
     * @return CompletableFuture<DeleteIdentityCenterResponse>
     */
    public CompletableFuture<DeleteIdentityCenterResponse> deleteIdentityCenterAsync(
        DeleteIdentityCenterRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.deleteIdentityCenter);
    }

    /**
     * 删除服务实例
     *
     * 删除IAM Identity Center服务实例。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIdentityCenterRequest 请求对象
     * @return AsyncInvoker<DeleteIdentityCenterRequest, DeleteIdentityCenterResponse>
     */
    public AsyncInvoker<DeleteIdentityCenterRequest, DeleteIdentityCenterResponse> deleteIdentityCenterAsyncInvoker(
        DeleteIdentityCenterRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.deleteIdentityCenter, hcClient);
    }

    /**
     * 查询服务实例开通所在区域
     *
     * 查询IAM身份中心服务实例开通后，具体开通所在区域。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeRegisteredRegionsRequest 请求对象
     * @return CompletableFuture<DescribeRegisteredRegionsResponse>
     */
    public CompletableFuture<DescribeRegisteredRegionsResponse> describeRegisteredRegionsAsync(
        DescribeRegisteredRegionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.describeRegisteredRegions);
    }

    /**
     * 查询服务实例开通所在区域
     *
     * 查询IAM身份中心服务实例开通后，具体开通所在区域。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeRegisteredRegionsRequest 请求对象
     * @return AsyncInvoker<DescribeRegisteredRegionsRequest, DescribeRegisteredRegionsResponse>
     */
    public AsyncInvoker<DescribeRegisteredRegionsRequest, DescribeRegisteredRegionsResponse> describeRegisteredRegionsAsyncInvoker(
        DescribeRegisteredRegionsRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.describeRegisteredRegions, hcClient);
    }

    /**
     * 查询高可用功能配置
     *
     * 查询高可用功能配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetHaConfigurationRequest 请求对象
     * @return CompletableFuture<GetHaConfigurationResponse>
     */
    public CompletableFuture<GetHaConfigurationResponse> getHaConfigurationAsync(GetHaConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.getHaConfiguration);
    }

    /**
     * 查询高可用功能配置
     *
     * 查询高可用功能配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetHaConfigurationRequest 请求对象
     * @return AsyncInvoker<GetHaConfigurationRequest, GetHaConfigurationResponse>
     */
    public AsyncInvoker<GetHaConfigurationRequest, GetHaConfigurationResponse> getHaConfigurationAsyncInvoker(
        GetHaConfigurationRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.getHaConfiguration, hcClient);
    }

    /**
     * 查询服务实例状态
     *
     * 查询IAM Identity Center服务实例状态信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetIdentityCenterServiceStatusRequest 请求对象
     * @return CompletableFuture<GetIdentityCenterServiceStatusResponse>
     */
    public CompletableFuture<GetIdentityCenterServiceStatusResponse> getIdentityCenterServiceStatusAsync(
        GetIdentityCenterServiceStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.getIdentityCenterServiceStatus);
    }

    /**
     * 查询服务实例状态
     *
     * 查询IAM Identity Center服务实例状态信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetIdentityCenterServiceStatusRequest 请求对象
     * @return AsyncInvoker<GetIdentityCenterServiceStatusRequest, GetIdentityCenterServiceStatusResponse>
     */
    public AsyncInvoker<GetIdentityCenterServiceStatusRequest, GetIdentityCenterServiceStatusResponse> getIdentityCenterServiceStatusAsyncInvoker(
        GetIdentityCenterServiceStatusRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.getIdentityCenterServiceStatus, hcClient);
    }

    /**
     * 获取身份源配置
     *
     * 获取IAM身份中心服务实例中的身份源配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIdentityStoreAssociationRequest 请求对象
     * @return CompletableFuture<ListIdentityStoreAssociationResponse>
     */
    public CompletableFuture<ListIdentityStoreAssociationResponse> listIdentityStoreAssociationAsync(
        ListIdentityStoreAssociationRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listIdentityStoreAssociation);
    }

    /**
     * 获取身份源配置
     *
     * 获取IAM身份中心服务实例中的身份源配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIdentityStoreAssociationRequest 请求对象
     * @return AsyncInvoker<ListIdentityStoreAssociationRequest, ListIdentityStoreAssociationResponse>
     */
    public AsyncInvoker<ListIdentityStoreAssociationRequest, ListIdentityStoreAssociationResponse> listIdentityStoreAssociationAsyncInvoker(
        ListIdentityStoreAssociationRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listIdentityStoreAssociation, hcClient);
    }

    /**
     * 列出实例
     *
     * 查询IAM身份中心的实例列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listInstances);
    }

    /**
     * 列出实例
     *
     * 查询IAM身份中心的实例列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listInstances, hcClient);
    }

    /**
     * 选择服务实例开通区域
     *
     * IAM身份中心服务实例开通前，需要选择服务实例具体开通在某一区域。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterRegionRequest 请求对象
     * @return CompletableFuture<RegisterRegionResponse>
     */
    public CompletableFuture<RegisterRegionResponse> registerRegionAsync(RegisterRegionRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.registerRegion);
    }

    /**
     * 选择服务实例开通区域
     *
     * IAM身份中心服务实例开通前，需要选择服务实例具体开通在某一区域。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterRegionRequest 请求对象
     * @return AsyncInvoker<RegisterRegionRequest, RegisterRegionResponse>
     */
    public AsyncInvoker<RegisterRegionRequest, RegisterRegionResponse> registerRegionAsyncInvoker(
        RegisterRegionRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.registerRegion, hcClient);
    }

    /**
     * 开通服务实例
     *
     * 开通IAM Identity Center服务实例。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartIdentityCenterRequest 请求对象
     * @return CompletableFuture<StartIdentityCenterResponse>
     */
    public CompletableFuture<StartIdentityCenterResponse> startIdentityCenterAsync(StartIdentityCenterRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.startIdentityCenter);
    }

    /**
     * 开通服务实例
     *
     * 开通IAM Identity Center服务实例。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartIdentityCenterRequest 请求对象
     * @return AsyncInvoker<StartIdentityCenterRequest, StartIdentityCenterResponse>
     */
    public AsyncInvoker<StartIdentityCenterRequest, StartIdentityCenterResponse> startIdentityCenterAsyncInvoker(
        StartIdentityCenterRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.startIdentityCenter, hcClient);
    }

    /**
     * 更新高可用功能配置
     *
     * 授权启用或者禁用高可用功能配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHaConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateHaConfigurationResponse>
     */
    public CompletableFuture<UpdateHaConfigurationResponse> updateHaConfigurationAsync(
        UpdateHaConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.updateHaConfiguration);
    }

    /**
     * 更新高可用功能配置
     *
     * 授权启用或者禁用高可用功能配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHaConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateHaConfigurationRequest, UpdateHaConfigurationResponse>
     */
    public AsyncInvoker<UpdateHaConfigurationRequest, UpdateHaConfigurationResponse> updateHaConfigurationAsyncInvoker(
        UpdateHaConfigurationRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.updateHaConfiguration, hcClient);
    }

    /**
     * 启用指定实例的访问控制功能
     *
     * 启用指定实例的访问控制功能。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceAccessControlAttributeConfigurationRequest 请求对象
     * @return CompletableFuture<CreateInstanceAccessControlAttributeConfigurationResponse>
     */
    public CompletableFuture<CreateInstanceAccessControlAttributeConfigurationResponse> createInstanceAccessControlAttributeConfigurationAsync(
        CreateInstanceAccessControlAttributeConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.createInstanceAccessControlAttributeConfiguration);
    }

    /**
     * 启用指定实例的访问控制功能
     *
     * 启用指定实例的访问控制功能。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceAccessControlAttributeConfigurationRequest 请求对象
     * @return AsyncInvoker<CreateInstanceAccessControlAttributeConfigurationRequest, CreateInstanceAccessControlAttributeConfigurationResponse>
     */
    public AsyncInvoker<CreateInstanceAccessControlAttributeConfigurationRequest, CreateInstanceAccessControlAttributeConfigurationResponse> createInstanceAccessControlAttributeConfigurationAsyncInvoker(
        CreateInstanceAccessControlAttributeConfigurationRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.createInstanceAccessControlAttributeConfiguration,
            hcClient);
    }

    /**
     * 解除指定实例的访问控制属性配置
     *
     * 禁用指定IAM Identity Center实例的基于属性的访问控制（ABAC）功能，并删除已配置的所有属性映射。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceAccessControlAttributeConfigurationRequest 请求对象
     * @return CompletableFuture<DeleteInstanceAccessControlAttributeConfigurationResponse>
     */
    public CompletableFuture<DeleteInstanceAccessControlAttributeConfigurationResponse> deleteInstanceAccessControlAttributeConfigurationAsync(
        DeleteInstanceAccessControlAttributeConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.deleteInstanceAccessControlAttributeConfiguration);
    }

    /**
     * 解除指定实例的访问控制属性配置
     *
     * 禁用指定IAM Identity Center实例的基于属性的访问控制（ABAC）功能，并删除已配置的所有属性映射。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceAccessControlAttributeConfigurationRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceAccessControlAttributeConfigurationRequest, DeleteInstanceAccessControlAttributeConfigurationResponse>
     */
    public AsyncInvoker<DeleteInstanceAccessControlAttributeConfigurationRequest, DeleteInstanceAccessControlAttributeConfigurationResponse> deleteInstanceAccessControlAttributeConfigurationAsyncInvoker(
        DeleteInstanceAccessControlAttributeConfigurationRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.deleteInstanceAccessControlAttributeConfiguration,
            hcClient);
    }

    /**
     * 获取指定实例的访问控制属性配置
     *
     * 返回已配置为与指定IAM Identity Center实例的基于属性的访问控制（ABAC）一起使用的IAM Identity Center身份存储属性列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeInstanceAccessControlAttributeConfigurationRequest 请求对象
     * @return CompletableFuture<DescribeInstanceAccessControlAttributeConfigurationResponse>
     */
    public CompletableFuture<DescribeInstanceAccessControlAttributeConfigurationResponse> describeInstanceAccessControlAttributeConfigurationAsync(
        DescribeInstanceAccessControlAttributeConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request,
            IdentityCenterMeta.describeInstanceAccessControlAttributeConfiguration);
    }

    /**
     * 获取指定实例的访问控制属性配置
     *
     * 返回已配置为与指定IAM Identity Center实例的基于属性的访问控制（ABAC）一起使用的IAM Identity Center身份存储属性列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeInstanceAccessControlAttributeConfigurationRequest 请求对象
     * @return AsyncInvoker<DescribeInstanceAccessControlAttributeConfigurationRequest, DescribeInstanceAccessControlAttributeConfigurationResponse>
     */
    public AsyncInvoker<DescribeInstanceAccessControlAttributeConfigurationRequest, DescribeInstanceAccessControlAttributeConfigurationResponse> describeInstanceAccessControlAttributeConfigurationAsyncInvoker(
        DescribeInstanceAccessControlAttributeConfigurationRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.describeInstanceAccessControlAttributeConfiguration,
            hcClient);
    }

    /**
     * 更新指定实例的访问控制属性配置
     *
     * 更新可与IAM Identity Center实例一起使用的IAM Identity Center身份存储属性，以进行基于属性的访问控制（ABAC）。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceAccessControlAttributeConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateInstanceAccessControlAttributeConfigurationResponse>
     */
    public CompletableFuture<UpdateInstanceAccessControlAttributeConfigurationResponse> updateInstanceAccessControlAttributeConfigurationAsync(
        UpdateInstanceAccessControlAttributeConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.updateInstanceAccessControlAttributeConfiguration);
    }

    /**
     * 更新指定实例的访问控制属性配置
     *
     * 更新可与IAM Identity Center实例一起使用的IAM Identity Center身份存储属性，以进行基于属性的访问控制（ABAC）。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceAccessControlAttributeConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceAccessControlAttributeConfigurationRequest, UpdateInstanceAccessControlAttributeConfigurationResponse>
     */
    public AsyncInvoker<UpdateInstanceAccessControlAttributeConfigurationRequest, UpdateInstanceAccessControlAttributeConfigurationResponse> updateInstanceAccessControlAttributeConfigurationAsyncInvoker(
        UpdateInstanceAccessControlAttributeConfigurationRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.updateInstanceAccessControlAttributeConfiguration,
            hcClient);
    }

    /**
     * 查询MFA管理配置信息
     *
     * 查询MFA管理配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetMfaDeviceManagementForIdentityStoreRequest 请求对象
     * @return CompletableFuture<GetMfaDeviceManagementForIdentityStoreResponse>
     */
    public CompletableFuture<GetMfaDeviceManagementForIdentityStoreResponse> getMfaDeviceManagementForIdentityStoreAsync(
        GetMfaDeviceManagementForIdentityStoreRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.getMfaDeviceManagementForIdentityStore);
    }

    /**
     * 查询MFA管理配置信息
     *
     * 查询MFA管理配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetMfaDeviceManagementForIdentityStoreRequest 请求对象
     * @return AsyncInvoker<GetMfaDeviceManagementForIdentityStoreRequest, GetMfaDeviceManagementForIdentityStoreResponse>
     */
    public AsyncInvoker<GetMfaDeviceManagementForIdentityStoreRequest, GetMfaDeviceManagementForIdentityStoreResponse> getMfaDeviceManagementForIdentityStoreAsyncInvoker(
        GetMfaDeviceManagementForIdentityStoreRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.getMfaDeviceManagementForIdentityStore, hcClient);
    }

    /**
     * 设置MFA管理设置信息
     *
     * 设置MFA管理设置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutMfaDeviceManagementForIdentityStoreRequest 请求对象
     * @return CompletableFuture<PutMfaDeviceManagementForIdentityStoreResponse>
     */
    public CompletableFuture<PutMfaDeviceManagementForIdentityStoreResponse> putMfaDeviceManagementForIdentityStoreAsync(
        PutMfaDeviceManagementForIdentityStoreRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.putMfaDeviceManagementForIdentityStore);
    }

    /**
     * 设置MFA管理设置信息
     *
     * 设置MFA管理设置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutMfaDeviceManagementForIdentityStoreRequest 请求对象
     * @return AsyncInvoker<PutMfaDeviceManagementForIdentityStoreRequest, PutMfaDeviceManagementForIdentityStoreResponse>
     */
    public AsyncInvoker<PutMfaDeviceManagementForIdentityStoreRequest, PutMfaDeviceManagementForIdentityStoreResponse> putMfaDeviceManagementForIdentityStoreAsyncInvoker(
        PutMfaDeviceManagementForIdentityStoreRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.putMfaDeviceManagementForIdentityStore, hcClient);
    }

    /**
     * 添加系统身份策略
     *
     * 在指定的权限集中添加系统身份策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachManagedPolicyToPermissionSetRequest 请求对象
     * @return CompletableFuture<AttachManagedPolicyToPermissionSetResponse>
     */
    public CompletableFuture<AttachManagedPolicyToPermissionSetResponse> attachManagedPolicyToPermissionSetAsync(
        AttachManagedPolicyToPermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.attachManagedPolicyToPermissionSet);
    }

    /**
     * 添加系统身份策略
     *
     * 在指定的权限集中添加系统身份策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachManagedPolicyToPermissionSetRequest 请求对象
     * @return AsyncInvoker<AttachManagedPolicyToPermissionSetRequest, AttachManagedPolicyToPermissionSetResponse>
     */
    public AsyncInvoker<AttachManagedPolicyToPermissionSetRequest, AttachManagedPolicyToPermissionSetResponse> attachManagedPolicyToPermissionSetAsyncInvoker(
        AttachManagedPolicyToPermissionSetRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.attachManagedPolicyToPermissionSet, hcClient);
    }

    /**
     * 添加系统策略
     *
     * 在指定的权限集中添加系统策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachManagedRoleToPermissionSetRequest 请求对象
     * @return CompletableFuture<AttachManagedRoleToPermissionSetResponse>
     */
    public CompletableFuture<AttachManagedRoleToPermissionSetResponse> attachManagedRoleToPermissionSetAsync(
        AttachManagedRoleToPermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.attachManagedRoleToPermissionSet);
    }

    /**
     * 添加系统策略
     *
     * 在指定的权限集中添加系统策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachManagedRoleToPermissionSetRequest 请求对象
     * @return AsyncInvoker<AttachManagedRoleToPermissionSetRequest, AttachManagedRoleToPermissionSetResponse>
     */
    public AsyncInvoker<AttachManagedRoleToPermissionSetRequest, AttachManagedRoleToPermissionSetResponse> attachManagedRoleToPermissionSetAsyncInvoker(
        AttachManagedRoleToPermissionSetRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.attachManagedRoleToPermissionSet, hcClient);
    }

    /**
     * 创建权限集
     *
     * 在指定的IAM Identity Center实例中创建一个权限集。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePermissionSetRequest 请求对象
     * @return CompletableFuture<CreatePermissionSetResponse>
     */
    public CompletableFuture<CreatePermissionSetResponse> createPermissionSetAsync(CreatePermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.createPermissionSet);
    }

    /**
     * 创建权限集
     *
     * 在指定的IAM Identity Center实例中创建一个权限集。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePermissionSetRequest 请求对象
     * @return AsyncInvoker<CreatePermissionSetRequest, CreatePermissionSetResponse>
     */
    public AsyncInvoker<CreatePermissionSetRequest, CreatePermissionSetResponse> createPermissionSetAsyncInvoker(
        CreatePermissionSetRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.createPermissionSet, hcClient);
    }

    /**
     * 删除自定义身份策略
     *
     * 删除指定权限集中的自定义身份策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomPolicyFromPermissionSetRequest 请求对象
     * @return CompletableFuture<DeleteCustomPolicyFromPermissionSetResponse>
     */
    public CompletableFuture<DeleteCustomPolicyFromPermissionSetResponse> deleteCustomPolicyFromPermissionSetAsync(
        DeleteCustomPolicyFromPermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.deleteCustomPolicyFromPermissionSet);
    }

    /**
     * 删除自定义身份策略
     *
     * 删除指定权限集中的自定义身份策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomPolicyFromPermissionSetRequest 请求对象
     * @return AsyncInvoker<DeleteCustomPolicyFromPermissionSetRequest, DeleteCustomPolicyFromPermissionSetResponse>
     */
    public AsyncInvoker<DeleteCustomPolicyFromPermissionSetRequest, DeleteCustomPolicyFromPermissionSetResponse> deleteCustomPolicyFromPermissionSetAsyncInvoker(
        DeleteCustomPolicyFromPermissionSetRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.deleteCustomPolicyFromPermissionSet, hcClient);
    }

    /**
     * 删除自定义策略
     *
     * 删除指定权限集中的自定义策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomRoleFromPermissionSetRequest 请求对象
     * @return CompletableFuture<DeleteCustomRoleFromPermissionSetResponse>
     */
    public CompletableFuture<DeleteCustomRoleFromPermissionSetResponse> deleteCustomRoleFromPermissionSetAsync(
        DeleteCustomRoleFromPermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.deleteCustomRoleFromPermissionSet);
    }

    /**
     * 删除自定义策略
     *
     * 删除指定权限集中的自定义策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomRoleFromPermissionSetRequest 请求对象
     * @return AsyncInvoker<DeleteCustomRoleFromPermissionSetRequest, DeleteCustomRoleFromPermissionSetResponse>
     */
    public AsyncInvoker<DeleteCustomRoleFromPermissionSetRequest, DeleteCustomRoleFromPermissionSetResponse> deleteCustomRoleFromPermissionSetAsyncInvoker(
        DeleteCustomRoleFromPermissionSetRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.deleteCustomRoleFromPermissionSet, hcClient);
    }

    /**
     * 删除权限集
     *
     * 根据权限集ID，删除指定的权限集。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePermissionSetRequest 请求对象
     * @return CompletableFuture<DeletePermissionSetResponse>
     */
    public CompletableFuture<DeletePermissionSetResponse> deletePermissionSetAsync(DeletePermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.deletePermissionSet);
    }

    /**
     * 删除权限集
     *
     * 根据权限集ID，删除指定的权限集。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePermissionSetRequest 请求对象
     * @return AsyncInvoker<DeletePermissionSetRequest, DeletePermissionSetResponse>
     */
    public AsyncInvoker<DeletePermissionSetRequest, DeletePermissionSetResponse> deletePermissionSetAsyncInvoker(
        DeletePermissionSetRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.deletePermissionSet, hcClient);
    }

    /**
     * 查询权限集详情
     *
     * 根据权限集ID，查询指定权限集的详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribePermissionSetRequest 请求对象
     * @return CompletableFuture<DescribePermissionSetResponse>
     */
    public CompletableFuture<DescribePermissionSetResponse> describePermissionSetAsync(
        DescribePermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.describePermissionSet);
    }

    /**
     * 查询权限集详情
     *
     * 根据权限集ID，查询指定权限集的详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribePermissionSetRequest 请求对象
     * @return AsyncInvoker<DescribePermissionSetRequest, DescribePermissionSetResponse>
     */
    public AsyncInvoker<DescribePermissionSetRequest, DescribePermissionSetResponse> describePermissionSetAsyncInvoker(
        DescribePermissionSetRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.describePermissionSet, hcClient);
    }

    /**
     * 查询权限集预分配状态详情
     *
     * 根据请求Id，查询权限集预分配状态的详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribePermissionSetProvisioningStatusRequest 请求对象
     * @return CompletableFuture<DescribePermissionSetProvisioningStatusResponse>
     */
    public CompletableFuture<DescribePermissionSetProvisioningStatusResponse> describePermissionSetProvisioningStatusAsync(
        DescribePermissionSetProvisioningStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.describePermissionSetProvisioningStatus);
    }

    /**
     * 查询权限集预分配状态详情
     *
     * 根据请求Id，查询权限集预分配状态的详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribePermissionSetProvisioningStatusRequest 请求对象
     * @return AsyncInvoker<DescribePermissionSetProvisioningStatusRequest, DescribePermissionSetProvisioningStatusResponse>
     */
    public AsyncInvoker<DescribePermissionSetProvisioningStatusRequest, DescribePermissionSetProvisioningStatusResponse> describePermissionSetProvisioningStatusAsyncInvoker(
        DescribePermissionSetProvisioningStatusRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.describePermissionSetProvisioningStatus, hcClient);
    }

    /**
     * 删除系统身份策略
     *
     * 删除指定权限集中的系统身份策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachManagedPolicyFromPermissionSetRequest 请求对象
     * @return CompletableFuture<DetachManagedPolicyFromPermissionSetResponse>
     */
    public CompletableFuture<DetachManagedPolicyFromPermissionSetResponse> detachManagedPolicyFromPermissionSetAsync(
        DetachManagedPolicyFromPermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.detachManagedPolicyFromPermissionSet);
    }

    /**
     * 删除系统身份策略
     *
     * 删除指定权限集中的系统身份策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachManagedPolicyFromPermissionSetRequest 请求对象
     * @return AsyncInvoker<DetachManagedPolicyFromPermissionSetRequest, DetachManagedPolicyFromPermissionSetResponse>
     */
    public AsyncInvoker<DetachManagedPolicyFromPermissionSetRequest, DetachManagedPolicyFromPermissionSetResponse> detachManagedPolicyFromPermissionSetAsyncInvoker(
        DetachManagedPolicyFromPermissionSetRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.detachManagedPolicyFromPermissionSet, hcClient);
    }

    /**
     * 删除系统策略
     *
     * 删除指定权限集中的系统策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachManagedRoleFromPermissionSetRequest 请求对象
     * @return CompletableFuture<DetachManagedRoleFromPermissionSetResponse>
     */
    public CompletableFuture<DetachManagedRoleFromPermissionSetResponse> detachManagedRoleFromPermissionSetAsync(
        DetachManagedRoleFromPermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.detachManagedRoleFromPermissionSet);
    }

    /**
     * 删除系统策略
     *
     * 删除指定权限集中的系统策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachManagedRoleFromPermissionSetRequest 请求对象
     * @return AsyncInvoker<DetachManagedRoleFromPermissionSetRequest, DetachManagedRoleFromPermissionSetResponse>
     */
    public AsyncInvoker<DetachManagedRoleFromPermissionSetRequest, DetachManagedRoleFromPermissionSetResponse> detachManagedRoleFromPermissionSetAsyncInvoker(
        DetachManagedRoleFromPermissionSetRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.detachManagedRoleFromPermissionSet, hcClient);
    }

    /**
     * 查询自定义身份策略详情
     *
     * 查询指定权限集中的自定义身份策略详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetCustomPolicyForPermissionSetRequest 请求对象
     * @return CompletableFuture<GetCustomPolicyForPermissionSetResponse>
     */
    public CompletableFuture<GetCustomPolicyForPermissionSetResponse> getCustomPolicyForPermissionSetAsync(
        GetCustomPolicyForPermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.getCustomPolicyForPermissionSet);
    }

    /**
     * 查询自定义身份策略详情
     *
     * 查询指定权限集中的自定义身份策略详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetCustomPolicyForPermissionSetRequest 请求对象
     * @return AsyncInvoker<GetCustomPolicyForPermissionSetRequest, GetCustomPolicyForPermissionSetResponse>
     */
    public AsyncInvoker<GetCustomPolicyForPermissionSetRequest, GetCustomPolicyForPermissionSetResponse> getCustomPolicyForPermissionSetAsyncInvoker(
        GetCustomPolicyForPermissionSetRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.getCustomPolicyForPermissionSet, hcClient);
    }

    /**
     * 查询自定义策略详情
     *
     * 查询指定权限集中的自定义策略详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetCustomRoleForPermissionSetRequest 请求对象
     * @return CompletableFuture<GetCustomRoleForPermissionSetResponse>
     */
    public CompletableFuture<GetCustomRoleForPermissionSetResponse> getCustomRoleForPermissionSetAsync(
        GetCustomRoleForPermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.getCustomRoleForPermissionSet);
    }

    /**
     * 查询自定义策略详情
     *
     * 查询指定权限集中的自定义策略详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetCustomRoleForPermissionSetRequest 请求对象
     * @return AsyncInvoker<GetCustomRoleForPermissionSetRequest, GetCustomRoleForPermissionSetResponse>
     */
    public AsyncInvoker<GetCustomRoleForPermissionSetRequest, GetCustomRoleForPermissionSetResponse> getCustomRoleForPermissionSetAsyncInvoker(
        GetCustomRoleForPermissionSetRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.getCustomRoleForPermissionSet, hcClient);
    }

    /**
     * 查询权限集配额信息
     *
     * 查询权限集配额信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPermissionSetSummaryRequest 请求对象
     * @return CompletableFuture<GetPermissionSetSummaryResponse>
     */
    public CompletableFuture<GetPermissionSetSummaryResponse> getPermissionSetSummaryAsync(
        GetPermissionSetSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.getPermissionSetSummary);
    }

    /**
     * 查询权限集配额信息
     *
     * 查询权限集配额信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPermissionSetSummaryRequest 请求对象
     * @return AsyncInvoker<GetPermissionSetSummaryRequest, GetPermissionSetSummaryResponse>
     */
    public AsyncInvoker<GetPermissionSetSummaryRequest, GetPermissionSetSummaryResponse> getPermissionSetSummaryAsyncInvoker(
        GetPermissionSetSummaryRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.getPermissionSetSummary, hcClient);
    }

    /**
     * 列出权限集关联的账号
     *
     * 查询与指定权限集关联的账户列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountsForProvisionedPermissionSetRequest 请求对象
     * @return CompletableFuture<ListAccountsForProvisionedPermissionSetResponse>
     */
    public CompletableFuture<ListAccountsForProvisionedPermissionSetResponse> listAccountsForProvisionedPermissionSetAsync(
        ListAccountsForProvisionedPermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listAccountsForProvisionedPermissionSet);
    }

    /**
     * 列出权限集关联的账号
     *
     * 查询与指定权限集关联的账户列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountsForProvisionedPermissionSetRequest 请求对象
     * @return AsyncInvoker<ListAccountsForProvisionedPermissionSetRequest, ListAccountsForProvisionedPermissionSetResponse>
     */
    public AsyncInvoker<ListAccountsForProvisionedPermissionSetRequest, ListAccountsForProvisionedPermissionSetResponse> listAccountsForProvisionedPermissionSetAsyncInvoker(
        ListAccountsForProvisionedPermissionSetRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listAccountsForProvisionedPermissionSet, hcClient);
    }

    /**
     * 列出系统身份策略
     *
     * 获取添加到指定权限集中的系统身份策略列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedPoliciesInPermissionSetRequest 请求对象
     * @return CompletableFuture<ListManagedPoliciesInPermissionSetResponse>
     */
    public CompletableFuture<ListManagedPoliciesInPermissionSetResponse> listManagedPoliciesInPermissionSetAsync(
        ListManagedPoliciesInPermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listManagedPoliciesInPermissionSet);
    }

    /**
     * 列出系统身份策略
     *
     * 获取添加到指定权限集中的系统身份策略列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedPoliciesInPermissionSetRequest 请求对象
     * @return AsyncInvoker<ListManagedPoliciesInPermissionSetRequest, ListManagedPoliciesInPermissionSetResponse>
     */
    public AsyncInvoker<ListManagedPoliciesInPermissionSetRequest, ListManagedPoliciesInPermissionSetResponse> listManagedPoliciesInPermissionSetAsyncInvoker(
        ListManagedPoliciesInPermissionSetRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listManagedPoliciesInPermissionSet, hcClient);
    }

    /**
     * 列出系统策略
     *
     * 获取添加到指定权限集中的系统策略列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedRolesInPermissionSetRequest 请求对象
     * @return CompletableFuture<ListManagedRolesInPermissionSetResponse>
     */
    public CompletableFuture<ListManagedRolesInPermissionSetResponse> listManagedRolesInPermissionSetAsync(
        ListManagedRolesInPermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listManagedRolesInPermissionSet);
    }

    /**
     * 列出系统策略
     *
     * 获取添加到指定权限集中的系统策略列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedRolesInPermissionSetRequest 请求对象
     * @return AsyncInvoker<ListManagedRolesInPermissionSetRequest, ListManagedRolesInPermissionSetResponse>
     */
    public AsyncInvoker<ListManagedRolesInPermissionSetRequest, ListManagedRolesInPermissionSetResponse> listManagedRolesInPermissionSetAsyncInvoker(
        ListManagedRolesInPermissionSetRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listManagedRolesInPermissionSet, hcClient);
    }

    /**
     * 列出权限集预分配状态
     *
     * 查询指定实例中的权限集预分配状态列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionSetProvisioningStatusRequest 请求对象
     * @return CompletableFuture<ListPermissionSetProvisioningStatusResponse>
     */
    public CompletableFuture<ListPermissionSetProvisioningStatusResponse> listPermissionSetProvisioningStatusAsync(
        ListPermissionSetProvisioningStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listPermissionSetProvisioningStatus);
    }

    /**
     * 列出权限集预分配状态
     *
     * 查询指定实例中的权限集预分配状态列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionSetProvisioningStatusRequest 请求对象
     * @return AsyncInvoker<ListPermissionSetProvisioningStatusRequest, ListPermissionSetProvisioningStatusResponse>
     */
    public AsyncInvoker<ListPermissionSetProvisioningStatusRequest, ListPermissionSetProvisioningStatusResponse> listPermissionSetProvisioningStatusAsyncInvoker(
        ListPermissionSetProvisioningStatusRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listPermissionSetProvisioningStatus, hcClient);
    }

    /**
     * 列出权限集
     *
     * 查询指定实例下的权限集列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionSetsRequest 请求对象
     * @return CompletableFuture<ListPermissionSetsResponse>
     */
    public CompletableFuture<ListPermissionSetsResponse> listPermissionSetsAsync(ListPermissionSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listPermissionSets);
    }

    /**
     * 列出权限集
     *
     * 查询指定实例下的权限集列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionSetsRequest 请求对象
     * @return AsyncInvoker<ListPermissionSetsRequest, ListPermissionSetsResponse>
     */
    public AsyncInvoker<ListPermissionSetsRequest, ListPermissionSetsResponse> listPermissionSetsAsyncInvoker(
        ListPermissionSetsRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listPermissionSets, hcClient);
    }

    /**
     * 列出分配给账户的权限集
     *
     * 查询分配给指定账户的权限集列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionSetsProvisionedToAccountRequest 请求对象
     * @return CompletableFuture<ListPermissionSetsProvisionedToAccountResponse>
     */
    public CompletableFuture<ListPermissionSetsProvisionedToAccountResponse> listPermissionSetsProvisionedToAccountAsync(
        ListPermissionSetsProvisionedToAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listPermissionSetsProvisionedToAccount);
    }

    /**
     * 列出分配给账户的权限集
     *
     * 查询分配给指定账户的权限集列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionSetsProvisionedToAccountRequest 请求对象
     * @return AsyncInvoker<ListPermissionSetsProvisionedToAccountRequest, ListPermissionSetsProvisionedToAccountResponse>
     */
    public AsyncInvoker<ListPermissionSetsProvisionedToAccountRequest, ListPermissionSetsProvisionedToAccountResponse> listPermissionSetsProvisionedToAccountAsyncInvoker(
        ListPermissionSetsProvisionedToAccountRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listPermissionSetsProvisionedToAccount, hcClient);
    }

    /**
     * 预分配权限集
     *
     * 将指定权限集预分配给指定账户。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ProvisionPermissionSetRequest 请求对象
     * @return CompletableFuture<ProvisionPermissionSetResponse>
     */
    public CompletableFuture<ProvisionPermissionSetResponse> provisionPermissionSetAsync(
        ProvisionPermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.provisionPermissionSet);
    }

    /**
     * 预分配权限集
     *
     * 将指定权限集预分配给指定账户。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ProvisionPermissionSetRequest 请求对象
     * @return AsyncInvoker<ProvisionPermissionSetRequest, ProvisionPermissionSetResponse>
     */
    public AsyncInvoker<ProvisionPermissionSetRequest, ProvisionPermissionSetResponse> provisionPermissionSetAsyncInvoker(
        ProvisionPermissionSetRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.provisionPermissionSet, hcClient);
    }

    /**
     * 将自定义身份策略附加到权限集
     *
     * 将自定义身份策略附加到权限集。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutCustomPolicyToPermissionSetRequest 请求对象
     * @return CompletableFuture<PutCustomPolicyToPermissionSetResponse>
     */
    public CompletableFuture<PutCustomPolicyToPermissionSetResponse> putCustomPolicyToPermissionSetAsync(
        PutCustomPolicyToPermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.putCustomPolicyToPermissionSet);
    }

    /**
     * 将自定义身份策略附加到权限集
     *
     * 将自定义身份策略附加到权限集。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutCustomPolicyToPermissionSetRequest 请求对象
     * @return AsyncInvoker<PutCustomPolicyToPermissionSetRequest, PutCustomPolicyToPermissionSetResponse>
     */
    public AsyncInvoker<PutCustomPolicyToPermissionSetRequest, PutCustomPolicyToPermissionSetResponse> putCustomPolicyToPermissionSetAsyncInvoker(
        PutCustomPolicyToPermissionSetRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.putCustomPolicyToPermissionSet, hcClient);
    }

    /**
     * 添加自定义策略
     *
     * 在指定的权限集中添加自定义策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutCustomRoleToPermissionSetRequest 请求对象
     * @return CompletableFuture<PutCustomRoleToPermissionSetResponse>
     */
    public CompletableFuture<PutCustomRoleToPermissionSetResponse> putCustomRoleToPermissionSetAsync(
        PutCustomRoleToPermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.putCustomRoleToPermissionSet);
    }

    /**
     * 添加自定义策略
     *
     * 在指定的权限集中添加自定义策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutCustomRoleToPermissionSetRequest 请求对象
     * @return AsyncInvoker<PutCustomRoleToPermissionSetRequest, PutCustomRoleToPermissionSetResponse>
     */
    public AsyncInvoker<PutCustomRoleToPermissionSetRequest, PutCustomRoleToPermissionSetResponse> putCustomRoleToPermissionSetAsyncInvoker(
        PutCustomRoleToPermissionSetRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.putCustomRoleToPermissionSet, hcClient);
    }

    /**
     * 更新权限集
     *
     * 根据权限集ID，更新指定权限集的属性。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePermissionSetRequest 请求对象
     * @return CompletableFuture<UpdatePermissionSetResponse>
     */
    public CompletableFuture<UpdatePermissionSetResponse> updatePermissionSetAsync(UpdatePermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.updatePermissionSet);
    }

    /**
     * 更新权限集
     *
     * 根据权限集ID，更新指定权限集的属性。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePermissionSetRequest 请求对象
     * @return AsyncInvoker<UpdatePermissionSetRequest, UpdatePermissionSetResponse>
     */
    public AsyncInvoker<UpdatePermissionSetRequest, UpdatePermissionSetResponse> updatePermissionSetAsyncInvoker(
        UpdatePermissionSetRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.updatePermissionSet, hcClient);
    }

    /**
     * 为指定资源添加标签
     *
     * 向指定的资源添加一个或多个标签。目前，您可以将标签附加到实例中的权限集。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagResourceRequest 请求对象
     * @return CompletableFuture<CreateTagResourceResponse>
     */
    public CompletableFuture<CreateTagResourceResponse> createTagResourceAsync(CreateTagResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.createTagResource);
    }

    /**
     * 为指定资源添加标签
     *
     * 向指定的资源添加一个或多个标签。目前，您可以将标签附加到实例中的权限集。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagResourceRequest 请求对象
     * @return AsyncInvoker<CreateTagResourceRequest, CreateTagResourceResponse>
     */
    public AsyncInvoker<CreateTagResourceRequest, CreateTagResourceResponse> createTagResourceAsyncInvoker(
        CreateTagResourceRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.createTagResource, hcClient);
    }

    /**
     * 从指定资源中删除指定主键标签
     *
     * 从指定资源中删除具有指定主键的任何标签。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagResourceRequest 请求对象
     * @return CompletableFuture<DeleteTagResourceResponse>
     */
    public CompletableFuture<DeleteTagResourceResponse> deleteTagResourceAsync(DeleteTagResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.deleteTagResource);
    }

    /**
     * 从指定资源中删除指定主键标签
     *
     * 从指定资源中删除具有指定主键的任何标签。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagResourceRequest 请求对象
     * @return AsyncInvoker<DeleteTagResourceRequest, DeleteTagResourceResponse>
     */
    public AsyncInvoker<DeleteTagResourceRequest, DeleteTagResourceResponse> deleteTagResourceAsyncInvoker(
        DeleteTagResourceRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.deleteTagResource, hcClient);
    }

    /**
     * 列出绑定到指定资源的标签
     *
     * 列出绑定到指定资源的标签。您可以将标签附加到实例中的权限集。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagResourcesRequest 请求对象
     * @return CompletableFuture<ListTagResourcesResponse>
     */
    public CompletableFuture<ListTagResourcesResponse> listTagResourcesAsync(ListTagResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listTagResources);
    }

    /**
     * 列出绑定到指定资源的标签
     *
     * 列出绑定到指定资源的标签。您可以将标签附加到实例中的权限集。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagResourcesRequest 请求对象
     * @return AsyncInvoker<ListTagResourcesRequest, ListTagResourcesResponse>
     */
    public AsyncInvoker<ListTagResourcesRequest, ListTagResourcesResponse> listTagResourcesAsyncInvoker(
        ListTagResourcesRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listTagResources, hcClient);
    }

}
