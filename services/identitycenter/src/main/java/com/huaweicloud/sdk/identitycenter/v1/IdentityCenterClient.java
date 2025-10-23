package com.huaweicloud.sdk.identitycenter.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class IdentityCenterClient {

    protected HcClient hcClient;

    public IdentityCenterClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IdentityCenterClient> newBuilder() {
        ClientBuilder<IdentityCenterClient> clientBuilder =
            new ClientBuilder<>(IdentityCenterClient::new, "GlobalCredentials");
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
     * @return CreateAccountAssignmentResponse
     */
    public CreateAccountAssignmentResponse createAccountAssignment(CreateAccountAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.createAccountAssignment);
    }

    /**
     * 创建账户分配
     *
     * 使用指定的权限集为指定账户分配对应主体的访问权限，主体可为IdentityCenter用户或IdentityCenter用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccountAssignmentRequest 请求对象
     * @return SyncInvoker<CreateAccountAssignmentRequest, CreateAccountAssignmentResponse>
     */
    public SyncInvoker<CreateAccountAssignmentRequest, CreateAccountAssignmentResponse> createAccountAssignmentInvoker(
        CreateAccountAssignmentRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.createAccountAssignment, hcClient);
    }

    /**
     * 删除账号分配
     *
     * 使用指定的权限集从指定的账号删除主体的访问权限，主体可为IAM身份中心用户或用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAccountAssignmentRequest 请求对象
     * @return DeleteAccountAssignmentResponse
     */
    public DeleteAccountAssignmentResponse deleteAccountAssignment(DeleteAccountAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.deleteAccountAssignment);
    }

    /**
     * 删除账号分配
     *
     * 使用指定的权限集从指定的账号删除主体的访问权限，主体可为IAM身份中心用户或用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAccountAssignmentRequest 请求对象
     * @return SyncInvoker<DeleteAccountAssignmentRequest, DeleteAccountAssignmentResponse>
     */
    public SyncInvoker<DeleteAccountAssignmentRequest, DeleteAccountAssignmentResponse> deleteAccountAssignmentInvoker(
        DeleteAccountAssignmentRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.deleteAccountAssignment, hcClient);
    }

    /**
     * 查询账户分配创建状态详情
     *
     * 根据请求ID，查询指定IAM Identity Center实例下的账户分配创建状态详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeAccountAssignmentCreationStatusRequest 请求对象
     * @return DescribeAccountAssignmentCreationStatusResponse
     */
    public DescribeAccountAssignmentCreationStatusResponse describeAccountAssignmentCreationStatus(
        DescribeAccountAssignmentCreationStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.describeAccountAssignmentCreationStatus);
    }

    /**
     * 查询账户分配创建状态详情
     *
     * 根据请求ID，查询指定IAM Identity Center实例下的账户分配创建状态详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeAccountAssignmentCreationStatusRequest 请求对象
     * @return SyncInvoker<DescribeAccountAssignmentCreationStatusRequest, DescribeAccountAssignmentCreationStatusResponse>
     */
    public SyncInvoker<DescribeAccountAssignmentCreationStatusRequest, DescribeAccountAssignmentCreationStatusResponse> describeAccountAssignmentCreationStatusInvoker(
        DescribeAccountAssignmentCreationStatusRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.describeAccountAssignmentCreationStatus, hcClient);
    }

    /**
     * 查询账户分配删除状态详情
     *
     * 根据请求ID，查询指定IAM Identity Center实例下的账户分配删除状态详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeAccountAssignmentDeletionStatusRequest 请求对象
     * @return DescribeAccountAssignmentDeletionStatusResponse
     */
    public DescribeAccountAssignmentDeletionStatusResponse describeAccountAssignmentDeletionStatus(
        DescribeAccountAssignmentDeletionStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.describeAccountAssignmentDeletionStatus);
    }

    /**
     * 查询账户分配删除状态详情
     *
     * 根据请求ID，查询指定IAM Identity Center实例下的账户分配删除状态详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeAccountAssignmentDeletionStatusRequest 请求对象
     * @return SyncInvoker<DescribeAccountAssignmentDeletionStatusRequest, DescribeAccountAssignmentDeletionStatusResponse>
     */
    public SyncInvoker<DescribeAccountAssignmentDeletionStatusRequest, DescribeAccountAssignmentDeletionStatusResponse> describeAccountAssignmentDeletionStatusInvoker(
        DescribeAccountAssignmentDeletionStatusRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.describeAccountAssignmentDeletionStatus, hcClient);
    }

    /**
     * 解除与用户或组绑定的所有账号授权关联
     *
     * 解除与用户或组绑定的所有账号授权关联。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateProfileRequest 请求对象
     * @return DisassociateProfileResponse
     */
    public DisassociateProfileResponse disassociateProfile(DisassociateProfileRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.disassociateProfile);
    }

    /**
     * 解除与用户或组绑定的所有账号授权关联
     *
     * 解除与用户或组绑定的所有账号授权关联。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateProfileRequest 请求对象
     * @return SyncInvoker<DisassociateProfileRequest, DisassociateProfileResponse>
     */
    public SyncInvoker<DisassociateProfileRequest, DisassociateProfileResponse> disassociateProfileInvoker(
        DisassociateProfileRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.disassociateProfile, hcClient);
    }

    /**
     * 列出账户分配创建状态
     *
     * 查询指定IAM Identity Center实例下的账户分配的创建状态列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountAssignmentCreationStatusRequest 请求对象
     * @return ListAccountAssignmentCreationStatusResponse
     */
    public ListAccountAssignmentCreationStatusResponse listAccountAssignmentCreationStatus(
        ListAccountAssignmentCreationStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listAccountAssignmentCreationStatus);
    }

    /**
     * 列出账户分配创建状态
     *
     * 查询指定IAM Identity Center实例下的账户分配的创建状态列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountAssignmentCreationStatusRequest 请求对象
     * @return SyncInvoker<ListAccountAssignmentCreationStatusRequest, ListAccountAssignmentCreationStatusResponse>
     */
    public SyncInvoker<ListAccountAssignmentCreationStatusRequest, ListAccountAssignmentCreationStatusResponse> listAccountAssignmentCreationStatusInvoker(
        ListAccountAssignmentCreationStatusRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listAccountAssignmentCreationStatus, hcClient);
    }

    /**
     * 列出账户分配删除状态
     *
     * 查询指定IAM Identity Center实例下的账户分配的删除状态列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountAssignmentDeletionStatusRequest 请求对象
     * @return ListAccountAssignmentDeletionStatusResponse
     */
    public ListAccountAssignmentDeletionStatusResponse listAccountAssignmentDeletionStatus(
        ListAccountAssignmentDeletionStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listAccountAssignmentDeletionStatus);
    }

    /**
     * 列出账户分配删除状态
     *
     * 查询指定IAM Identity Center实例下的账户分配的删除状态列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountAssignmentDeletionStatusRequest 请求对象
     * @return SyncInvoker<ListAccountAssignmentDeletionStatusRequest, ListAccountAssignmentDeletionStatusResponse>
     */
    public SyncInvoker<ListAccountAssignmentDeletionStatusRequest, ListAccountAssignmentDeletionStatusResponse> listAccountAssignmentDeletionStatusInvoker(
        ListAccountAssignmentDeletionStatusRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listAccountAssignmentDeletionStatus, hcClient);
    }

    /**
     * 列出账户和权限集关联的用户或用户组
     *
     * 列出与指定账户以及指定权限集关联的用户或用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountAssignmentsRequest 请求对象
     * @return ListAccountAssignmentsResponse
     */
    public ListAccountAssignmentsResponse listAccountAssignments(ListAccountAssignmentsRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listAccountAssignments);
    }

    /**
     * 列出账户和权限集关联的用户或用户组
     *
     * 列出与指定账户以及指定权限集关联的用户或用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountAssignmentsRequest 请求对象
     * @return SyncInvoker<ListAccountAssignmentsRequest, ListAccountAssignmentsResponse>
     */
    public SyncInvoker<ListAccountAssignmentsRequest, ListAccountAssignmentsResponse> listAccountAssignmentsInvoker(
        ListAccountAssignmentsRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listAccountAssignments, hcClient);
    }

    /**
     * 检索与用户或用户组关联的账号列表
     *
     * 检索与用户或用户组关联的账号列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountAssignmentsForPrincipalRequest 请求对象
     * @return ListAccountAssignmentsForPrincipalResponse
     */
    public ListAccountAssignmentsForPrincipalResponse listAccountAssignmentsForPrincipal(
        ListAccountAssignmentsForPrincipalRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listAccountAssignmentsForPrincipal);
    }

    /**
     * 检索与用户或用户组关联的账号列表
     *
     * 检索与用户或用户组关联的账号列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountAssignmentsForPrincipalRequest 请求对象
     * @return SyncInvoker<ListAccountAssignmentsForPrincipalRequest, ListAccountAssignmentsForPrincipalResponse>
     */
    public SyncInvoker<ListAccountAssignmentsForPrincipalRequest, ListAccountAssignmentsForPrincipalResponse> listAccountAssignmentsForPrincipalInvoker(
        ListAccountAssignmentsForPrincipalRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listAccountAssignmentsForPrincipal, hcClient);
    }

    /**
     * 创建应用程序实例
     *
     * 创建应用程序实例。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationInstanceRequest 请求对象
     * @return CreateApplicationInstanceResponse
     */
    public CreateApplicationInstanceResponse createApplicationInstance(CreateApplicationInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.createApplicationInstance);
    }

    /**
     * 创建应用程序实例
     *
     * 创建应用程序实例。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationInstanceRequest 请求对象
     * @return SyncInvoker<CreateApplicationInstanceRequest, CreateApplicationInstanceResponse>
     */
    public SyncInvoker<CreateApplicationInstanceRequest, CreateApplicationInstanceResponse> createApplicationInstanceInvoker(
        CreateApplicationInstanceRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.createApplicationInstance, hcClient);
    }

    /**
     * 删除应用程序实例
     *
     * 删除应用程序实例。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationInstanceRequest 请求对象
     * @return DeleteApplicationInstanceResponse
     */
    public DeleteApplicationInstanceResponse deleteApplicationInstance(DeleteApplicationInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.deleteApplicationInstance);
    }

    /**
     * 删除应用程序实例
     *
     * 删除应用程序实例。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationInstanceRequest 请求对象
     * @return SyncInvoker<DeleteApplicationInstanceRequest, DeleteApplicationInstanceResponse>
     */
    public SyncInvoker<DeleteApplicationInstanceRequest, DeleteApplicationInstanceResponse> deleteApplicationInstanceInvoker(
        DeleteApplicationInstanceRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.deleteApplicationInstance, hcClient);
    }

    /**
     * 删除应用程序实例与用户或用户组关联关系
     *
     * 删除应用程序实例与用户或用户组关联关系。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProfileRequest 请求对象
     * @return DeleteProfileResponse
     */
    public DeleteProfileResponse deleteProfile(DeleteProfileRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.deleteProfile);
    }

    /**
     * 删除应用程序实例与用户或用户组关联关系
     *
     * 删除应用程序实例与用户或用户组关联关系。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProfileRequest 请求对象
     * @return SyncInvoker<DeleteProfileRequest, DeleteProfileResponse>
     */
    public SyncInvoker<DeleteProfileRequest, DeleteProfileResponse> deleteProfileInvoker(DeleteProfileRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.deleteProfile, hcClient);
    }

    /**
     * 查询应用程序详情
     *
     * 查询应用程序详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeApplicationRequest 请求对象
     * @return DescribeApplicationResponse
     */
    public DescribeApplicationResponse describeApplication(DescribeApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.describeApplication);
    }

    /**
     * 查询应用程序详情
     *
     * 查询应用程序详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeApplicationRequest 请求对象
     * @return SyncInvoker<DescribeApplicationRequest, DescribeApplicationResponse>
     */
    public SyncInvoker<DescribeApplicationRequest, DescribeApplicationResponse> describeApplicationInvoker(
        DescribeApplicationRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.describeApplication, hcClient);
    }

    /**
     * 查询应用程序提供者详情
     *
     * 查询应用程序提供者详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeApplicationProviderRequest 请求对象
     * @return DescribeApplicationProviderResponse
     */
    public DescribeApplicationProviderResponse describeApplicationProvider(DescribeApplicationProviderRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.describeApplicationProvider);
    }

    /**
     * 查询应用程序提供者详情
     *
     * 查询应用程序提供者详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeApplicationProviderRequest 请求对象
     * @return SyncInvoker<DescribeApplicationProviderRequest, DescribeApplicationProviderResponse>
     */
    public SyncInvoker<DescribeApplicationProviderRequest, DescribeApplicationProviderResponse> describeApplicationProviderInvoker(
        DescribeApplicationProviderRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.describeApplicationProvider, hcClient);
    }

    /**
     * 查询应用程序分配属性配置
     *
     * 查询应用程序分配属性配置，目的为用户或者用户组分配对应用程序的访问权限。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetApplicationAssignmentConfigurationRequest 请求对象
     * @return GetApplicationAssignmentConfigurationResponse
     */
    public GetApplicationAssignmentConfigurationResponse getApplicationAssignmentConfiguration(
        GetApplicationAssignmentConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.getApplicationAssignmentConfiguration);
    }

    /**
     * 查询应用程序分配属性配置
     *
     * 查询应用程序分配属性配置，目的为用户或者用户组分配对应用程序的访问权限。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetApplicationAssignmentConfigurationRequest 请求对象
     * @return SyncInvoker<GetApplicationAssignmentConfigurationRequest, GetApplicationAssignmentConfigurationResponse>
     */
    public SyncInvoker<GetApplicationAssignmentConfigurationRequest, GetApplicationAssignmentConfigurationResponse> getApplicationAssignmentConfigurationInvoker(
        GetApplicationAssignmentConfigurationRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.getApplicationAssignmentConfiguration, hcClient);
    }

    /**
     * 查询应用程序实例详情
     *
     * 查询应用程序实例详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetApplicationInstanceRequest 请求对象
     * @return GetApplicationInstanceResponse
     */
    public GetApplicationInstanceResponse getApplicationInstance(GetApplicationInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.getApplicationInstance);
    }

    /**
     * 查询应用程序实例详情
     *
     * 查询应用程序实例详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetApplicationInstanceRequest 请求对象
     * @return SyncInvoker<GetApplicationInstanceRequest, GetApplicationInstanceResponse>
     */
    public SyncInvoker<GetApplicationInstanceRequest, GetApplicationInstanceResponse> getApplicationInstanceInvoker(
        GetApplicationInstanceRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.getApplicationInstance, hcClient);
    }

    /**
     * 上传应用程序实例元数据文件
     *
     * 上传应用程序实例元数据文件。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportApplicationInstanceServiceProviderMetadataRequest 请求对象
     * @return ImportApplicationInstanceServiceProviderMetadataResponse
     */
    public ImportApplicationInstanceServiceProviderMetadataResponse importApplicationInstanceServiceProviderMetadata(
        ImportApplicationInstanceServiceProviderMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.importApplicationInstanceServiceProviderMetadata);
    }

    /**
     * 上传应用程序实例元数据文件
     *
     * 上传应用程序实例元数据文件。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportApplicationInstanceServiceProviderMetadataRequest 请求对象
     * @return SyncInvoker<ImportApplicationInstanceServiceProviderMetadataRequest, ImportApplicationInstanceServiceProviderMetadataResponse>
     */
    public SyncInvoker<ImportApplicationInstanceServiceProviderMetadataRequest, ImportApplicationInstanceServiceProviderMetadataResponse> importApplicationInstanceServiceProviderMetadataInvoker(
        ImportApplicationInstanceServiceProviderMetadataRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.importApplicationInstanceServiceProviderMetadata,
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
     * @return ListApplicationInstancesResponse
     */
    public ListApplicationInstancesResponse listApplicationInstances(ListApplicationInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listApplicationInstances);
    }

    /**
     * 列出应用程序实例
     *
     * 列出应用程序实例。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationInstancesRequest 请求对象
     * @return SyncInvoker<ListApplicationInstancesRequest, ListApplicationInstancesResponse>
     */
    public SyncInvoker<ListApplicationInstancesRequest, ListApplicationInstancesResponse> listApplicationInstancesInvoker(
        ListApplicationInstancesRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listApplicationInstances, hcClient);
    }

    /**
     * 列出应用程序提供者
     *
     * 查询应用程序提供者列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationProvidersRequest 请求对象
     * @return ListApplicationProvidersResponse
     */
    public ListApplicationProvidersResponse listApplicationProviders(ListApplicationProvidersRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listApplicationProviders);
    }

    /**
     * 列出应用程序提供者
     *
     * 查询应用程序提供者列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationProvidersRequest 请求对象
     * @return SyncInvoker<ListApplicationProvidersRequest, ListApplicationProvidersResponse>
     */
    public SyncInvoker<ListApplicationProvidersRequest, ListApplicationProvidersResponse> listApplicationProvidersInvoker(
        ListApplicationProvidersRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listApplicationProviders, hcClient);
    }

    /**
     * 列出应用程序模板
     *
     * 查询应用程序模板列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationTemplatesRequest 请求对象
     * @return ListApplicationTemplatesResponse
     */
    public ListApplicationTemplatesResponse listApplicationTemplates(ListApplicationTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listApplicationTemplates);
    }

    /**
     * 列出应用程序模板
     *
     * 查询应用程序模板列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationTemplatesRequest 请求对象
     * @return SyncInvoker<ListApplicationTemplatesRequest, ListApplicationTemplatesResponse>
     */
    public SyncInvoker<ListApplicationTemplatesRequest, ListApplicationTemplatesResponse> listApplicationTemplatesInvoker(
        ListApplicationTemplatesRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listApplicationTemplates, hcClient);
    }

    /**
     * 列出应用程序
     *
     * 查询应用程序列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationsRequest 请求对象
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listApplications);
    }

    /**
     * 列出应用程序
     *
     * 查询应用程序列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationsRequest 请求对象
     * @return SyncInvoker<ListApplicationsRequest, ListApplicationsResponse>
     */
    public SyncInvoker<ListApplicationsRequest, ListApplicationsResponse> listApplicationsInvoker(
        ListApplicationsRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listApplications, hcClient);
    }

    /**
     * 列出应用程序目录中的预置应用模板
     *
     * 列出应用程序目录中的预置应用模板。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCatalogApplicationsRequest 请求对象
     * @return ListCatalogApplicationsResponse
     */
    public ListCatalogApplicationsResponse listCatalogApplications(ListCatalogApplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listCatalogApplications);
    }

    /**
     * 列出应用程序目录中的预置应用模板
     *
     * 列出应用程序目录中的预置应用模板。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCatalogApplicationsRequest 请求对象
     * @return SyncInvoker<ListCatalogApplicationsRequest, ListCatalogApplicationsResponse>
     */
    public SyncInvoker<ListCatalogApplicationsRequest, ListCatalogApplicationsResponse> listCatalogApplicationsInvoker(
        ListCatalogApplicationsRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listCatalogApplications, hcClient);
    }

    /**
     * 列出应用程序实例与用户或用户组存在的关联关系
     *
     * 列出应用程序实例与用户或用户组存在的关联关系。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProfilesRequest 请求对象
     * @return ListProfilesResponse
     */
    public ListProfilesResponse listProfiles(ListProfilesRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listProfiles);
    }

    /**
     * 列出应用程序实例与用户或用户组存在的关联关系
     *
     * 列出应用程序实例与用户或用户组存在的关联关系。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProfilesRequest 请求对象
     * @return SyncInvoker<ListProfilesRequest, ListProfilesResponse>
     */
    public SyncInvoker<ListProfilesRequest, ListProfilesResponse> listProfilesInvoker(ListProfilesRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listProfiles, hcClient);
    }

    /**
     * 更新应用程序实例显示信息
     *
     * 更新应用程序实例显示信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceDisplayDataRequest 请求对象
     * @return UpdateApplicationInstanceDisplayDataResponse
     */
    public UpdateApplicationInstanceDisplayDataResponse updateApplicationInstanceDisplayData(
        UpdateApplicationInstanceDisplayDataRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.updateApplicationInstanceDisplayData);
    }

    /**
     * 更新应用程序实例显示信息
     *
     * 更新应用程序实例显示信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceDisplayDataRequest 请求对象
     * @return SyncInvoker<UpdateApplicationInstanceDisplayDataRequest, UpdateApplicationInstanceDisplayDataResponse>
     */
    public SyncInvoker<UpdateApplicationInstanceDisplayDataRequest, UpdateApplicationInstanceDisplayDataResponse> updateApplicationInstanceDisplayDataInvoker(
        UpdateApplicationInstanceDisplayDataRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.updateApplicationInstanceDisplayData, hcClient);
    }

    /**
     * 更新应用程序属性配置
     *
     * 更新应用程序属性配置信息，更新应用程序中的属性映射、中继状态以及会话过期时间。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceResponseConfigurationRequest 请求对象
     * @return UpdateApplicationInstanceResponseConfigurationResponse
     */
    public UpdateApplicationInstanceResponseConfigurationResponse updateApplicationInstanceResponseConfiguration(
        UpdateApplicationInstanceResponseConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.updateApplicationInstanceResponseConfiguration);
    }

    /**
     * 更新应用程序属性配置
     *
     * 更新应用程序属性配置信息，更新应用程序中的属性映射、中继状态以及会话过期时间。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceResponseConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateApplicationInstanceResponseConfigurationRequest, UpdateApplicationInstanceResponseConfigurationResponse>
     */
    public SyncInvoker<UpdateApplicationInstanceResponseConfigurationRequest, UpdateApplicationInstanceResponseConfigurationResponse> updateApplicationInstanceResponseConfigurationInvoker(
        UpdateApplicationInstanceResponseConfigurationRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.updateApplicationInstanceResponseConfiguration, hcClient);
    }

    /**
     * 更新应用程序Schema属性映射配置
     *
     * 更新应用程序Schema属性映射配置，支持SAML断言中Subject属性映射以及Subject NameID格式。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceResponseSchemaConfigurationRequest 请求对象
     * @return UpdateApplicationInstanceResponseSchemaConfigurationResponse
     */
    public UpdateApplicationInstanceResponseSchemaConfigurationResponse updateApplicationInstanceResponseSchemaConfiguration(
        UpdateApplicationInstanceResponseSchemaConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request,
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
     * @return SyncInvoker<UpdateApplicationInstanceResponseSchemaConfigurationRequest, UpdateApplicationInstanceResponseSchemaConfigurationResponse>
     */
    public SyncInvoker<UpdateApplicationInstanceResponseSchemaConfigurationRequest, UpdateApplicationInstanceResponseSchemaConfigurationResponse> updateApplicationInstanceResponseSchemaConfigurationInvoker(
        UpdateApplicationInstanceResponseSchemaConfigurationRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.updateApplicationInstanceResponseSchemaConfiguration,
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
     * @return UpdateApplicationInstanceSecurityConfigurationResponse
     */
    public UpdateApplicationInstanceSecurityConfigurationResponse updateApplicationInstanceSecurityConfiguration(
        UpdateApplicationInstanceSecurityConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.updateApplicationInstanceSecurityConfiguration);
    }

    /**
     * 更新应用程序实例证书配置
     *
     * 更新应用程序实例证书配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceSecurityConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateApplicationInstanceSecurityConfigurationRequest, UpdateApplicationInstanceSecurityConfigurationResponse>
     */
    public SyncInvoker<UpdateApplicationInstanceSecurityConfigurationRequest, UpdateApplicationInstanceSecurityConfigurationResponse> updateApplicationInstanceSecurityConfigurationInvoker(
        UpdateApplicationInstanceSecurityConfigurationRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.updateApplicationInstanceSecurityConfiguration, hcClient);
    }

    /**
     * 更新应用程序实例服务提供商配置
     *
     * 更新应用程序实例服务提供商配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceServiceProviderConfigurationRequest 请求对象
     * @return UpdateApplicationInstanceServiceProviderConfigurationResponse
     */
    public UpdateApplicationInstanceServiceProviderConfigurationResponse updateApplicationInstanceServiceProviderConfiguration(
        UpdateApplicationInstanceServiceProviderConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request,
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
     * @return SyncInvoker<UpdateApplicationInstanceServiceProviderConfigurationRequest, UpdateApplicationInstanceServiceProviderConfigurationResponse>
     */
    public SyncInvoker<UpdateApplicationInstanceServiceProviderConfigurationRequest, UpdateApplicationInstanceServiceProviderConfigurationResponse> updateApplicationInstanceServiceProviderConfigurationInvoker(
        UpdateApplicationInstanceServiceProviderConfigurationRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.updateApplicationInstanceServiceProviderConfiguration,
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
     * @return UpdateApplicationInstanceStatusResponse
     */
    public UpdateApplicationInstanceStatusResponse updateApplicationInstanceStatus(
        UpdateApplicationInstanceStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.updateApplicationInstanceStatus);
    }

    /**
     * 更新应用程序实例状态
     *
     * 更新应用程序实例状态。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceStatusRequest 请求对象
     * @return SyncInvoker<UpdateApplicationInstanceStatusRequest, UpdateApplicationInstanceStatusResponse>
     */
    public SyncInvoker<UpdateApplicationInstanceStatusRequest, UpdateApplicationInstanceStatusResponse> updateApplicationInstanceStatusInvoker(
        UpdateApplicationInstanceStatusRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.updateApplicationInstanceStatus, hcClient);
    }

    /**
     * 应用程序分配用户或用户组
     *
     * 应用程序分配用户或用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationAssignmentRequest 请求对象
     * @return CreateApplicationAssignmentResponse
     */
    public CreateApplicationAssignmentResponse createApplicationAssignment(CreateApplicationAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.createApplicationAssignment);
    }

    /**
     * 应用程序分配用户或用户组
     *
     * 应用程序分配用户或用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationAssignmentRequest 请求对象
     * @return SyncInvoker<CreateApplicationAssignmentRequest, CreateApplicationAssignmentResponse>
     */
    public SyncInvoker<CreateApplicationAssignmentRequest, CreateApplicationAssignmentResponse> createApplicationAssignmentInvoker(
        CreateApplicationAssignmentRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.createApplicationAssignment, hcClient);
    }

    /**
     * 删除应用程序已分配用户或用户组
     *
     * 删除应用程序已分配用户或用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationAssignmentRequest 请求对象
     * @return DeleteApplicationAssignmentResponse
     */
    public DeleteApplicationAssignmentResponse deleteApplicationAssignment(DeleteApplicationAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.deleteApplicationAssignment);
    }

    /**
     * 删除应用程序已分配用户或用户组
     *
     * 删除应用程序已分配用户或用户组。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationAssignmentRequest 请求对象
     * @return SyncInvoker<DeleteApplicationAssignmentRequest, DeleteApplicationAssignmentResponse>
     */
    public SyncInvoker<DeleteApplicationAssignmentRequest, DeleteApplicationAssignmentResponse> deleteApplicationAssignmentInvoker(
        DeleteApplicationAssignmentRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.deleteApplicationAssignment, hcClient);
    }

    /**
     * 查询应用程序已分配的用户或用户组列表
     *
     * 查询应用程序已分配的用户或用户组列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationAssignmentsRequest 请求对象
     * @return ListApplicationAssignmentsResponse
     */
    public ListApplicationAssignmentsResponse listApplicationAssignments(ListApplicationAssignmentsRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listApplicationAssignments);
    }

    /**
     * 查询应用程序已分配的用户或用户组列表
     *
     * 查询应用程序已分配的用户或用户组列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationAssignmentsRequest 请求对象
     * @return SyncInvoker<ListApplicationAssignmentsRequest, ListApplicationAssignmentsResponse>
     */
    public SyncInvoker<ListApplicationAssignmentsRequest, ListApplicationAssignmentsResponse> listApplicationAssignmentsInvoker(
        ListApplicationAssignmentsRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listApplicationAssignments, hcClient);
    }

    /**
     * 检索与用户或用户组关联的应用程序列表
     *
     * 检索与用户或用户组关联的应用程序列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationAssignmentsForPrincipalRequest 请求对象
     * @return ListApplicationAssignmentsForPrincipalResponse
     */
    public ListApplicationAssignmentsForPrincipalResponse listApplicationAssignmentsForPrincipal(
        ListApplicationAssignmentsForPrincipalRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listApplicationAssignmentsForPrincipal);
    }

    /**
     * 检索与用户或用户组关联的应用程序列表
     *
     * 检索与用户或用户组关联的应用程序列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationAssignmentsForPrincipalRequest 请求对象
     * @return SyncInvoker<ListApplicationAssignmentsForPrincipalRequest, ListApplicationAssignmentsForPrincipalResponse>
     */
    public SyncInvoker<ListApplicationAssignmentsForPrincipalRequest, ListApplicationAssignmentsForPrincipalResponse> listApplicationAssignmentsForPrincipalInvoker(
        ListApplicationAssignmentsForPrincipalRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listApplicationAssignmentsForPrincipal, hcClient);
    }

    /**
     * 创建应用程序实例证书
     *
     * 创建应用程序实例证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationInstanceCertificateRequest 请求对象
     * @return CreateApplicationInstanceCertificateResponse
     */
    public CreateApplicationInstanceCertificateResponse createApplicationInstanceCertificate(
        CreateApplicationInstanceCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.createApplicationInstanceCertificate);
    }

    /**
     * 创建应用程序实例证书
     *
     * 创建应用程序实例证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationInstanceCertificateRequest 请求对象
     * @return SyncInvoker<CreateApplicationInstanceCertificateRequest, CreateApplicationInstanceCertificateResponse>
     */
    public SyncInvoker<CreateApplicationInstanceCertificateRequest, CreateApplicationInstanceCertificateResponse> createApplicationInstanceCertificateInvoker(
        CreateApplicationInstanceCertificateRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.createApplicationInstanceCertificate, hcClient);
    }

    /**
     * 删除应用程序实例证书
     *
     * 删除应用程序实例证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationInstanceCertificateRequest 请求对象
     * @return DeleteApplicationInstanceCertificateResponse
     */
    public DeleteApplicationInstanceCertificateResponse deleteApplicationInstanceCertificate(
        DeleteApplicationInstanceCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.deleteApplicationInstanceCertificate);
    }

    /**
     * 删除应用程序实例证书
     *
     * 删除应用程序实例证书。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationInstanceCertificateRequest 请求对象
     * @return SyncInvoker<DeleteApplicationInstanceCertificateRequest, DeleteApplicationInstanceCertificateResponse>
     */
    public SyncInvoker<DeleteApplicationInstanceCertificateRequest, DeleteApplicationInstanceCertificateResponse> deleteApplicationInstanceCertificateInvoker(
        DeleteApplicationInstanceCertificateRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.deleteApplicationInstanceCertificate, hcClient);
    }

    /**
     * 列出应用程序实例证书
     *
     * 查询应用程序实例证书列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationInstanceCertificatesRequest 请求对象
     * @return ListApplicationInstanceCertificatesResponse
     */
    public ListApplicationInstanceCertificatesResponse listApplicationInstanceCertificates(
        ListApplicationInstanceCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listApplicationInstanceCertificates);
    }

    /**
     * 列出应用程序实例证书
     *
     * 查询应用程序实例证书列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationInstanceCertificatesRequest 请求对象
     * @return SyncInvoker<ListApplicationInstanceCertificatesRequest, ListApplicationInstanceCertificatesResponse>
     */
    public SyncInvoker<ListApplicationInstanceCertificatesRequest, ListApplicationInstanceCertificatesResponse> listApplicationInstanceCertificatesInvoker(
        ListApplicationInstanceCertificatesRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listApplicationInstanceCertificates, hcClient);
    }

    /**
     * 激活应用程序实例证书
     *
     * 激活应用程序实例证书，实现证书轮转。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceActiveCertificateRequest 请求对象
     * @return UpdateApplicationInstanceActiveCertificateResponse
     */
    public UpdateApplicationInstanceActiveCertificateResponse updateApplicationInstanceActiveCertificate(
        UpdateApplicationInstanceActiveCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.updateApplicationInstanceActiveCertificate);
    }

    /**
     * 激活应用程序实例证书
     *
     * 激活应用程序实例证书，实现证书轮转。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationInstanceActiveCertificateRequest 请求对象
     * @return SyncInvoker<UpdateApplicationInstanceActiveCertificateRequest, UpdateApplicationInstanceActiveCertificateResponse>
     */
    public SyncInvoker<UpdateApplicationInstanceActiveCertificateRequest, UpdateApplicationInstanceActiveCertificateResponse> updateApplicationInstanceActiveCertificateInvoker(
        UpdateApplicationInstanceActiveCertificateRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.updateApplicationInstanceActiveCertificate, hcClient);
    }

    /**
     * 查询实例配置信息
     *
     * 查询IAM身份中心实例配置信息，包括身份认证配置和会话管理配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetSsoConfigurationRequest 请求对象
     * @return GetSsoConfigurationResponse
     */
    public GetSsoConfigurationResponse getSsoConfiguration(GetSsoConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.getSsoConfiguration);
    }

    /**
     * 查询实例配置信息
     *
     * 查询IAM身份中心实例配置信息，包括身份认证配置和会话管理配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetSsoConfigurationRequest 请求对象
     * @return SyncInvoker<GetSsoConfigurationRequest, GetSsoConfigurationResponse>
     */
    public SyncInvoker<GetSsoConfigurationRequest, GetSsoConfigurationResponse> getSsoConfigurationInvoker(
        GetSsoConfigurationRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.getSsoConfiguration, hcClient);
    }

    /**
     * 设置实例配置信息
     *
     * 设置IAM身份中心服务实例配置信息，包括身份认证配置和会话管理配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSsoConfigurationRequest 请求对象
     * @return UpdateSsoConfigurationResponse
     */
    public UpdateSsoConfigurationResponse updateSsoConfiguration(UpdateSsoConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.updateSsoConfiguration);
    }

    /**
     * 设置实例配置信息
     *
     * 设置IAM身份中心服务实例配置信息，包括身份认证配置和会话管理配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSsoConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateSsoConfigurationRequest, UpdateSsoConfigurationResponse>
     */
    public SyncInvoker<UpdateSsoConfigurationRequest, UpdateSsoConfigurationResponse> updateSsoConfigurationInvoker(
        UpdateSsoConfigurationRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.updateSsoConfiguration, hcClient);
    }

    /**
     * 自定义访问门户URL
     *
     * 自定义访问门户URL，默认情况下，您可以使用遵循以下格式的 URL访问门户：idcenter.huaweicloud.com/d-xxxxxxxxxx/portal，您可以按如下方式更改为自定义 URL：idcenter.huaweicloud.com/your_subdomain/portal。设置自定义访问门户URL是一次性操作，无法撤销。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAliasRequest 请求对象
     * @return CreateAliasResponse
     */
    public CreateAliasResponse createAlias(CreateAliasRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.createAlias);
    }

    /**
     * 自定义访问门户URL
     *
     * 自定义访问门户URL，默认情况下，您可以使用遵循以下格式的 URL访问门户：idcenter.huaweicloud.com/d-xxxxxxxxxx/portal，您可以按如下方式更改为自定义 URL：idcenter.huaweicloud.com/your_subdomain/portal。设置自定义访问门户URL是一次性操作，无法撤销。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAliasRequest 请求对象
     * @return SyncInvoker<CreateAliasRequest, CreateAliasResponse>
     */
    public SyncInvoker<CreateAliasRequest, CreateAliasResponse> createAliasInvoker(CreateAliasRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.createAlias, hcClient);
    }

    /**
     * 删除服务实例
     *
     * 删除IAM Identity Center服务实例。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIdentityCenterRequest 请求对象
     * @return DeleteIdentityCenterResponse
     */
    public DeleteIdentityCenterResponse deleteIdentityCenter(DeleteIdentityCenterRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.deleteIdentityCenter);
    }

    /**
     * 删除服务实例
     *
     * 删除IAM Identity Center服务实例。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIdentityCenterRequest 请求对象
     * @return SyncInvoker<DeleteIdentityCenterRequest, DeleteIdentityCenterResponse>
     */
    public SyncInvoker<DeleteIdentityCenterRequest, DeleteIdentityCenterResponse> deleteIdentityCenterInvoker(
        DeleteIdentityCenterRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.deleteIdentityCenter, hcClient);
    }

    /**
     * 查询服务实例开通所在区域
     *
     * 查询IAM身份中心服务实例开通后，具体开通所在区域。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeRegisteredRegionsRequest 请求对象
     * @return DescribeRegisteredRegionsResponse
     */
    public DescribeRegisteredRegionsResponse describeRegisteredRegions(DescribeRegisteredRegionsRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.describeRegisteredRegions);
    }

    /**
     * 查询服务实例开通所在区域
     *
     * 查询IAM身份中心服务实例开通后，具体开通所在区域。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeRegisteredRegionsRequest 请求对象
     * @return SyncInvoker<DescribeRegisteredRegionsRequest, DescribeRegisteredRegionsResponse>
     */
    public SyncInvoker<DescribeRegisteredRegionsRequest, DescribeRegisteredRegionsResponse> describeRegisteredRegionsInvoker(
        DescribeRegisteredRegionsRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.describeRegisteredRegions, hcClient);
    }

    /**
     * 查询高可用功能配置
     *
     * 查询高可用功能配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetHaConfigurationRequest 请求对象
     * @return GetHaConfigurationResponse
     */
    public GetHaConfigurationResponse getHaConfiguration(GetHaConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.getHaConfiguration);
    }

    /**
     * 查询高可用功能配置
     *
     * 查询高可用功能配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetHaConfigurationRequest 请求对象
     * @return SyncInvoker<GetHaConfigurationRequest, GetHaConfigurationResponse>
     */
    public SyncInvoker<GetHaConfigurationRequest, GetHaConfigurationResponse> getHaConfigurationInvoker(
        GetHaConfigurationRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.getHaConfiguration, hcClient);
    }

    /**
     * 查询服务实例状态
     *
     * 查询IAM Identity Center服务实例状态信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetIdentityCenterServiceStatusRequest 请求对象
     * @return GetIdentityCenterServiceStatusResponse
     */
    public GetIdentityCenterServiceStatusResponse getIdentityCenterServiceStatus(
        GetIdentityCenterServiceStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.getIdentityCenterServiceStatus);
    }

    /**
     * 查询服务实例状态
     *
     * 查询IAM Identity Center服务实例状态信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetIdentityCenterServiceStatusRequest 请求对象
     * @return SyncInvoker<GetIdentityCenterServiceStatusRequest, GetIdentityCenterServiceStatusResponse>
     */
    public SyncInvoker<GetIdentityCenterServiceStatusRequest, GetIdentityCenterServiceStatusResponse> getIdentityCenterServiceStatusInvoker(
        GetIdentityCenterServiceStatusRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.getIdentityCenterServiceStatus, hcClient);
    }

    /**
     * 获取身份源配置
     *
     * 获取IAM身份中心服务实例中的身份源配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIdentityStoreAssociationRequest 请求对象
     * @return ListIdentityStoreAssociationResponse
     */
    public ListIdentityStoreAssociationResponse listIdentityStoreAssociation(
        ListIdentityStoreAssociationRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listIdentityStoreAssociation);
    }

    /**
     * 获取身份源配置
     *
     * 获取IAM身份中心服务实例中的身份源配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIdentityStoreAssociationRequest 请求对象
     * @return SyncInvoker<ListIdentityStoreAssociationRequest, ListIdentityStoreAssociationResponse>
     */
    public SyncInvoker<ListIdentityStoreAssociationRequest, ListIdentityStoreAssociationResponse> listIdentityStoreAssociationInvoker(
        ListIdentityStoreAssociationRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listIdentityStoreAssociation, hcClient);
    }

    /**
     * 列出实例
     *
     * 查询IAM身份中心的实例列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listInstances);
    }

    /**
     * 列出实例
     *
     * 查询IAM身份中心的实例列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listInstances, hcClient);
    }

    /**
     * 选择服务实例开通区域
     *
     * IAM身份中心服务实例开通前，需要选择服务实例具体开通在某一区域。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterRegionRequest 请求对象
     * @return RegisterRegionResponse
     */
    public RegisterRegionResponse registerRegion(RegisterRegionRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.registerRegion);
    }

    /**
     * 选择服务实例开通区域
     *
     * IAM身份中心服务实例开通前，需要选择服务实例具体开通在某一区域。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterRegionRequest 请求对象
     * @return SyncInvoker<RegisterRegionRequest, RegisterRegionResponse>
     */
    public SyncInvoker<RegisterRegionRequest, RegisterRegionResponse> registerRegionInvoker(
        RegisterRegionRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.registerRegion, hcClient);
    }

    /**
     * 开通服务实例
     *
     * 开通IAM Identity Center服务实例。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartIdentityCenterRequest 请求对象
     * @return StartIdentityCenterResponse
     */
    public StartIdentityCenterResponse startIdentityCenter(StartIdentityCenterRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.startIdentityCenter);
    }

    /**
     * 开通服务实例
     *
     * 开通IAM Identity Center服务实例。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartIdentityCenterRequest 请求对象
     * @return SyncInvoker<StartIdentityCenterRequest, StartIdentityCenterResponse>
     */
    public SyncInvoker<StartIdentityCenterRequest, StartIdentityCenterResponse> startIdentityCenterInvoker(
        StartIdentityCenterRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.startIdentityCenter, hcClient);
    }

    /**
     * 更新高可用功能配置
     *
     * 授权启用或者禁用高可用功能配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHaConfigurationRequest 请求对象
     * @return UpdateHaConfigurationResponse
     */
    public UpdateHaConfigurationResponse updateHaConfiguration(UpdateHaConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.updateHaConfiguration);
    }

    /**
     * 更新高可用功能配置
     *
     * 授权启用或者禁用高可用功能配置。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHaConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateHaConfigurationRequest, UpdateHaConfigurationResponse>
     */
    public SyncInvoker<UpdateHaConfigurationRequest, UpdateHaConfigurationResponse> updateHaConfigurationInvoker(
        UpdateHaConfigurationRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.updateHaConfiguration, hcClient);
    }

    /**
     * 启用指定实例的访问控制功能
     *
     * 启用指定实例的访问控制功能。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceAccessControlAttributeConfigurationRequest 请求对象
     * @return CreateInstanceAccessControlAttributeConfigurationResponse
     */
    public CreateInstanceAccessControlAttributeConfigurationResponse createInstanceAccessControlAttributeConfiguration(
        CreateInstanceAccessControlAttributeConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.createInstanceAccessControlAttributeConfiguration);
    }

    /**
     * 启用指定实例的访问控制功能
     *
     * 启用指定实例的访问控制功能。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceAccessControlAttributeConfigurationRequest 请求对象
     * @return SyncInvoker<CreateInstanceAccessControlAttributeConfigurationRequest, CreateInstanceAccessControlAttributeConfigurationResponse>
     */
    public SyncInvoker<CreateInstanceAccessControlAttributeConfigurationRequest, CreateInstanceAccessControlAttributeConfigurationResponse> createInstanceAccessControlAttributeConfigurationInvoker(
        CreateInstanceAccessControlAttributeConfigurationRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.createInstanceAccessControlAttributeConfiguration,
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
     * @return DeleteInstanceAccessControlAttributeConfigurationResponse
     */
    public DeleteInstanceAccessControlAttributeConfigurationResponse deleteInstanceAccessControlAttributeConfiguration(
        DeleteInstanceAccessControlAttributeConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.deleteInstanceAccessControlAttributeConfiguration);
    }

    /**
     * 解除指定实例的访问控制属性配置
     *
     * 禁用指定IAM Identity Center实例的基于属性的访问控制（ABAC）功能，并删除已配置的所有属性映射。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceAccessControlAttributeConfigurationRequest 请求对象
     * @return SyncInvoker<DeleteInstanceAccessControlAttributeConfigurationRequest, DeleteInstanceAccessControlAttributeConfigurationResponse>
     */
    public SyncInvoker<DeleteInstanceAccessControlAttributeConfigurationRequest, DeleteInstanceAccessControlAttributeConfigurationResponse> deleteInstanceAccessControlAttributeConfigurationInvoker(
        DeleteInstanceAccessControlAttributeConfigurationRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.deleteInstanceAccessControlAttributeConfiguration,
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
     * @return DescribeInstanceAccessControlAttributeConfigurationResponse
     */
    public DescribeInstanceAccessControlAttributeConfigurationResponse describeInstanceAccessControlAttributeConfiguration(
        DescribeInstanceAccessControlAttributeConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.describeInstanceAccessControlAttributeConfiguration);
    }

    /**
     * 获取指定实例的访问控制属性配置
     *
     * 返回已配置为与指定IAM Identity Center实例的基于属性的访问控制（ABAC）一起使用的IAM Identity Center身份存储属性列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeInstanceAccessControlAttributeConfigurationRequest 请求对象
     * @return SyncInvoker<DescribeInstanceAccessControlAttributeConfigurationRequest, DescribeInstanceAccessControlAttributeConfigurationResponse>
     */
    public SyncInvoker<DescribeInstanceAccessControlAttributeConfigurationRequest, DescribeInstanceAccessControlAttributeConfigurationResponse> describeInstanceAccessControlAttributeConfigurationInvoker(
        DescribeInstanceAccessControlAttributeConfigurationRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.describeInstanceAccessControlAttributeConfiguration,
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
     * @return UpdateInstanceAccessControlAttributeConfigurationResponse
     */
    public UpdateInstanceAccessControlAttributeConfigurationResponse updateInstanceAccessControlAttributeConfiguration(
        UpdateInstanceAccessControlAttributeConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.updateInstanceAccessControlAttributeConfiguration);
    }

    /**
     * 更新指定实例的访问控制属性配置
     *
     * 更新可与IAM Identity Center实例一起使用的IAM Identity Center身份存储属性，以进行基于属性的访问控制（ABAC）。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceAccessControlAttributeConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateInstanceAccessControlAttributeConfigurationRequest, UpdateInstanceAccessControlAttributeConfigurationResponse>
     */
    public SyncInvoker<UpdateInstanceAccessControlAttributeConfigurationRequest, UpdateInstanceAccessControlAttributeConfigurationResponse> updateInstanceAccessControlAttributeConfigurationInvoker(
        UpdateInstanceAccessControlAttributeConfigurationRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.updateInstanceAccessControlAttributeConfiguration,
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
     * @return GetMfaDeviceManagementForIdentityStoreResponse
     */
    public GetMfaDeviceManagementForIdentityStoreResponse getMfaDeviceManagementForIdentityStore(
        GetMfaDeviceManagementForIdentityStoreRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.getMfaDeviceManagementForIdentityStore);
    }

    /**
     * 查询MFA管理配置信息
     *
     * 查询MFA管理配置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetMfaDeviceManagementForIdentityStoreRequest 请求对象
     * @return SyncInvoker<GetMfaDeviceManagementForIdentityStoreRequest, GetMfaDeviceManagementForIdentityStoreResponse>
     */
    public SyncInvoker<GetMfaDeviceManagementForIdentityStoreRequest, GetMfaDeviceManagementForIdentityStoreResponse> getMfaDeviceManagementForIdentityStoreInvoker(
        GetMfaDeviceManagementForIdentityStoreRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.getMfaDeviceManagementForIdentityStore, hcClient);
    }

    /**
     * 设置MFA管理设置信息
     *
     * 设置MFA管理设置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutMfaDeviceManagementForIdentityStoreRequest 请求对象
     * @return PutMfaDeviceManagementForIdentityStoreResponse
     */
    public PutMfaDeviceManagementForIdentityStoreResponse putMfaDeviceManagementForIdentityStore(
        PutMfaDeviceManagementForIdentityStoreRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.putMfaDeviceManagementForIdentityStore);
    }

    /**
     * 设置MFA管理设置信息
     *
     * 设置MFA管理设置信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutMfaDeviceManagementForIdentityStoreRequest 请求对象
     * @return SyncInvoker<PutMfaDeviceManagementForIdentityStoreRequest, PutMfaDeviceManagementForIdentityStoreResponse>
     */
    public SyncInvoker<PutMfaDeviceManagementForIdentityStoreRequest, PutMfaDeviceManagementForIdentityStoreResponse> putMfaDeviceManagementForIdentityStoreInvoker(
        PutMfaDeviceManagementForIdentityStoreRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.putMfaDeviceManagementForIdentityStore, hcClient);
    }

    /**
     * 添加系统身份策略
     *
     * 在指定的权限集中添加系统身份策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachManagedPolicyToPermissionSetRequest 请求对象
     * @return AttachManagedPolicyToPermissionSetResponse
     */
    public AttachManagedPolicyToPermissionSetResponse attachManagedPolicyToPermissionSet(
        AttachManagedPolicyToPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.attachManagedPolicyToPermissionSet);
    }

    /**
     * 添加系统身份策略
     *
     * 在指定的权限集中添加系统身份策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachManagedPolicyToPermissionSetRequest 请求对象
     * @return SyncInvoker<AttachManagedPolicyToPermissionSetRequest, AttachManagedPolicyToPermissionSetResponse>
     */
    public SyncInvoker<AttachManagedPolicyToPermissionSetRequest, AttachManagedPolicyToPermissionSetResponse> attachManagedPolicyToPermissionSetInvoker(
        AttachManagedPolicyToPermissionSetRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.attachManagedPolicyToPermissionSet, hcClient);
    }

    /**
     * 添加系统策略
     *
     * 在指定的权限集中添加系统策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachManagedRoleToPermissionSetRequest 请求对象
     * @return AttachManagedRoleToPermissionSetResponse
     */
    public AttachManagedRoleToPermissionSetResponse attachManagedRoleToPermissionSet(
        AttachManagedRoleToPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.attachManagedRoleToPermissionSet);
    }

    /**
     * 添加系统策略
     *
     * 在指定的权限集中添加系统策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachManagedRoleToPermissionSetRequest 请求对象
     * @return SyncInvoker<AttachManagedRoleToPermissionSetRequest, AttachManagedRoleToPermissionSetResponse>
     */
    public SyncInvoker<AttachManagedRoleToPermissionSetRequest, AttachManagedRoleToPermissionSetResponse> attachManagedRoleToPermissionSetInvoker(
        AttachManagedRoleToPermissionSetRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.attachManagedRoleToPermissionSet, hcClient);
    }

    /**
     * 创建权限集
     *
     * 在指定的IAM Identity Center实例中创建一个权限集。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePermissionSetRequest 请求对象
     * @return CreatePermissionSetResponse
     */
    public CreatePermissionSetResponse createPermissionSet(CreatePermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.createPermissionSet);
    }

    /**
     * 创建权限集
     *
     * 在指定的IAM Identity Center实例中创建一个权限集。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePermissionSetRequest 请求对象
     * @return SyncInvoker<CreatePermissionSetRequest, CreatePermissionSetResponse>
     */
    public SyncInvoker<CreatePermissionSetRequest, CreatePermissionSetResponse> createPermissionSetInvoker(
        CreatePermissionSetRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.createPermissionSet, hcClient);
    }

    /**
     * 删除自定义身份策略
     *
     * 删除指定权限集中的自定义身份策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomPolicyFromPermissionSetRequest 请求对象
     * @return DeleteCustomPolicyFromPermissionSetResponse
     */
    public DeleteCustomPolicyFromPermissionSetResponse deleteCustomPolicyFromPermissionSet(
        DeleteCustomPolicyFromPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.deleteCustomPolicyFromPermissionSet);
    }

    /**
     * 删除自定义身份策略
     *
     * 删除指定权限集中的自定义身份策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomPolicyFromPermissionSetRequest 请求对象
     * @return SyncInvoker<DeleteCustomPolicyFromPermissionSetRequest, DeleteCustomPolicyFromPermissionSetResponse>
     */
    public SyncInvoker<DeleteCustomPolicyFromPermissionSetRequest, DeleteCustomPolicyFromPermissionSetResponse> deleteCustomPolicyFromPermissionSetInvoker(
        DeleteCustomPolicyFromPermissionSetRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.deleteCustomPolicyFromPermissionSet, hcClient);
    }

    /**
     * 删除自定义策略
     *
     * 删除指定权限集中的自定义策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomRoleFromPermissionSetRequest 请求对象
     * @return DeleteCustomRoleFromPermissionSetResponse
     */
    public DeleteCustomRoleFromPermissionSetResponse deleteCustomRoleFromPermissionSet(
        DeleteCustomRoleFromPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.deleteCustomRoleFromPermissionSet);
    }

    /**
     * 删除自定义策略
     *
     * 删除指定权限集中的自定义策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomRoleFromPermissionSetRequest 请求对象
     * @return SyncInvoker<DeleteCustomRoleFromPermissionSetRequest, DeleteCustomRoleFromPermissionSetResponse>
     */
    public SyncInvoker<DeleteCustomRoleFromPermissionSetRequest, DeleteCustomRoleFromPermissionSetResponse> deleteCustomRoleFromPermissionSetInvoker(
        DeleteCustomRoleFromPermissionSetRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.deleteCustomRoleFromPermissionSet, hcClient);
    }

    /**
     * 删除权限集
     *
     * 根据权限集ID，删除指定的权限集。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePermissionSetRequest 请求对象
     * @return DeletePermissionSetResponse
     */
    public DeletePermissionSetResponse deletePermissionSet(DeletePermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.deletePermissionSet);
    }

    /**
     * 删除权限集
     *
     * 根据权限集ID，删除指定的权限集。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePermissionSetRequest 请求对象
     * @return SyncInvoker<DeletePermissionSetRequest, DeletePermissionSetResponse>
     */
    public SyncInvoker<DeletePermissionSetRequest, DeletePermissionSetResponse> deletePermissionSetInvoker(
        DeletePermissionSetRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.deletePermissionSet, hcClient);
    }

    /**
     * 查询权限集详情
     *
     * 根据权限集ID，查询指定权限集的详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribePermissionSetRequest 请求对象
     * @return DescribePermissionSetResponse
     */
    public DescribePermissionSetResponse describePermissionSet(DescribePermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.describePermissionSet);
    }

    /**
     * 查询权限集详情
     *
     * 根据权限集ID，查询指定权限集的详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribePermissionSetRequest 请求对象
     * @return SyncInvoker<DescribePermissionSetRequest, DescribePermissionSetResponse>
     */
    public SyncInvoker<DescribePermissionSetRequest, DescribePermissionSetResponse> describePermissionSetInvoker(
        DescribePermissionSetRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.describePermissionSet, hcClient);
    }

    /**
     * 查询权限集预分配状态详情
     *
     * 根据请求Id，查询权限集预分配状态的详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribePermissionSetProvisioningStatusRequest 请求对象
     * @return DescribePermissionSetProvisioningStatusResponse
     */
    public DescribePermissionSetProvisioningStatusResponse describePermissionSetProvisioningStatus(
        DescribePermissionSetProvisioningStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.describePermissionSetProvisioningStatus);
    }

    /**
     * 查询权限集预分配状态详情
     *
     * 根据请求Id，查询权限集预分配状态的详情信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribePermissionSetProvisioningStatusRequest 请求对象
     * @return SyncInvoker<DescribePermissionSetProvisioningStatusRequest, DescribePermissionSetProvisioningStatusResponse>
     */
    public SyncInvoker<DescribePermissionSetProvisioningStatusRequest, DescribePermissionSetProvisioningStatusResponse> describePermissionSetProvisioningStatusInvoker(
        DescribePermissionSetProvisioningStatusRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.describePermissionSetProvisioningStatus, hcClient);
    }

    /**
     * 删除系统身份策略
     *
     * 删除指定权限集中的系统身份策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachManagedPolicyFromPermissionSetRequest 请求对象
     * @return DetachManagedPolicyFromPermissionSetResponse
     */
    public DetachManagedPolicyFromPermissionSetResponse detachManagedPolicyFromPermissionSet(
        DetachManagedPolicyFromPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.detachManagedPolicyFromPermissionSet);
    }

    /**
     * 删除系统身份策略
     *
     * 删除指定权限集中的系统身份策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachManagedPolicyFromPermissionSetRequest 请求对象
     * @return SyncInvoker<DetachManagedPolicyFromPermissionSetRequest, DetachManagedPolicyFromPermissionSetResponse>
     */
    public SyncInvoker<DetachManagedPolicyFromPermissionSetRequest, DetachManagedPolicyFromPermissionSetResponse> detachManagedPolicyFromPermissionSetInvoker(
        DetachManagedPolicyFromPermissionSetRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.detachManagedPolicyFromPermissionSet, hcClient);
    }

    /**
     * 删除系统策略
     *
     * 删除指定权限集中的系统策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachManagedRoleFromPermissionSetRequest 请求对象
     * @return DetachManagedRoleFromPermissionSetResponse
     */
    public DetachManagedRoleFromPermissionSetResponse detachManagedRoleFromPermissionSet(
        DetachManagedRoleFromPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.detachManagedRoleFromPermissionSet);
    }

    /**
     * 删除系统策略
     *
     * 删除指定权限集中的系统策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachManagedRoleFromPermissionSetRequest 请求对象
     * @return SyncInvoker<DetachManagedRoleFromPermissionSetRequest, DetachManagedRoleFromPermissionSetResponse>
     */
    public SyncInvoker<DetachManagedRoleFromPermissionSetRequest, DetachManagedRoleFromPermissionSetResponse> detachManagedRoleFromPermissionSetInvoker(
        DetachManagedRoleFromPermissionSetRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.detachManagedRoleFromPermissionSet, hcClient);
    }

    /**
     * 查询自定义身份策略详情
     *
     * 查询指定权限集中的自定义身份策略详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetCustomPolicyForPermissionSetRequest 请求对象
     * @return GetCustomPolicyForPermissionSetResponse
     */
    public GetCustomPolicyForPermissionSetResponse getCustomPolicyForPermissionSet(
        GetCustomPolicyForPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.getCustomPolicyForPermissionSet);
    }

    /**
     * 查询自定义身份策略详情
     *
     * 查询指定权限集中的自定义身份策略详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetCustomPolicyForPermissionSetRequest 请求对象
     * @return SyncInvoker<GetCustomPolicyForPermissionSetRequest, GetCustomPolicyForPermissionSetResponse>
     */
    public SyncInvoker<GetCustomPolicyForPermissionSetRequest, GetCustomPolicyForPermissionSetResponse> getCustomPolicyForPermissionSetInvoker(
        GetCustomPolicyForPermissionSetRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.getCustomPolicyForPermissionSet, hcClient);
    }

    /**
     * 查询自定义策略详情
     *
     * 查询指定权限集中的自定义策略详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetCustomRoleForPermissionSetRequest 请求对象
     * @return GetCustomRoleForPermissionSetResponse
     */
    public GetCustomRoleForPermissionSetResponse getCustomRoleForPermissionSet(
        GetCustomRoleForPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.getCustomRoleForPermissionSet);
    }

    /**
     * 查询自定义策略详情
     *
     * 查询指定权限集中的自定义策略详情。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetCustomRoleForPermissionSetRequest 请求对象
     * @return SyncInvoker<GetCustomRoleForPermissionSetRequest, GetCustomRoleForPermissionSetResponse>
     */
    public SyncInvoker<GetCustomRoleForPermissionSetRequest, GetCustomRoleForPermissionSetResponse> getCustomRoleForPermissionSetInvoker(
        GetCustomRoleForPermissionSetRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.getCustomRoleForPermissionSet, hcClient);
    }

    /**
     * 查询权限集配额信息
     *
     * 查询权限集配额信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPermissionSetSummaryRequest 请求对象
     * @return GetPermissionSetSummaryResponse
     */
    public GetPermissionSetSummaryResponse getPermissionSetSummary(GetPermissionSetSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.getPermissionSetSummary);
    }

    /**
     * 查询权限集配额信息
     *
     * 查询权限集配额信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPermissionSetSummaryRequest 请求对象
     * @return SyncInvoker<GetPermissionSetSummaryRequest, GetPermissionSetSummaryResponse>
     */
    public SyncInvoker<GetPermissionSetSummaryRequest, GetPermissionSetSummaryResponse> getPermissionSetSummaryInvoker(
        GetPermissionSetSummaryRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.getPermissionSetSummary, hcClient);
    }

    /**
     * 列出权限集关联的账号
     *
     * 查询与指定权限集关联的账户列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountsForProvisionedPermissionSetRequest 请求对象
     * @return ListAccountsForProvisionedPermissionSetResponse
     */
    public ListAccountsForProvisionedPermissionSetResponse listAccountsForProvisionedPermissionSet(
        ListAccountsForProvisionedPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listAccountsForProvisionedPermissionSet);
    }

    /**
     * 列出权限集关联的账号
     *
     * 查询与指定权限集关联的账户列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountsForProvisionedPermissionSetRequest 请求对象
     * @return SyncInvoker<ListAccountsForProvisionedPermissionSetRequest, ListAccountsForProvisionedPermissionSetResponse>
     */
    public SyncInvoker<ListAccountsForProvisionedPermissionSetRequest, ListAccountsForProvisionedPermissionSetResponse> listAccountsForProvisionedPermissionSetInvoker(
        ListAccountsForProvisionedPermissionSetRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listAccountsForProvisionedPermissionSet, hcClient);
    }

    /**
     * 列出系统身份策略
     *
     * 获取添加到指定权限集中的系统身份策略列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedPoliciesInPermissionSetRequest 请求对象
     * @return ListManagedPoliciesInPermissionSetResponse
     */
    public ListManagedPoliciesInPermissionSetResponse listManagedPoliciesInPermissionSet(
        ListManagedPoliciesInPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listManagedPoliciesInPermissionSet);
    }

    /**
     * 列出系统身份策略
     *
     * 获取添加到指定权限集中的系统身份策略列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedPoliciesInPermissionSetRequest 请求对象
     * @return SyncInvoker<ListManagedPoliciesInPermissionSetRequest, ListManagedPoliciesInPermissionSetResponse>
     */
    public SyncInvoker<ListManagedPoliciesInPermissionSetRequest, ListManagedPoliciesInPermissionSetResponse> listManagedPoliciesInPermissionSetInvoker(
        ListManagedPoliciesInPermissionSetRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listManagedPoliciesInPermissionSet, hcClient);
    }

    /**
     * 列出系统策略
     *
     * 获取添加到指定权限集中的系统策略列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedRolesInPermissionSetRequest 请求对象
     * @return ListManagedRolesInPermissionSetResponse
     */
    public ListManagedRolesInPermissionSetResponse listManagedRolesInPermissionSet(
        ListManagedRolesInPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listManagedRolesInPermissionSet);
    }

    /**
     * 列出系统策略
     *
     * 获取添加到指定权限集中的系统策略列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedRolesInPermissionSetRequest 请求对象
     * @return SyncInvoker<ListManagedRolesInPermissionSetRequest, ListManagedRolesInPermissionSetResponse>
     */
    public SyncInvoker<ListManagedRolesInPermissionSetRequest, ListManagedRolesInPermissionSetResponse> listManagedRolesInPermissionSetInvoker(
        ListManagedRolesInPermissionSetRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listManagedRolesInPermissionSet, hcClient);
    }

    /**
     * 列出权限集预分配状态
     *
     * 查询指定实例中的权限集预分配状态列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionSetProvisioningStatusRequest 请求对象
     * @return ListPermissionSetProvisioningStatusResponse
     */
    public ListPermissionSetProvisioningStatusResponse listPermissionSetProvisioningStatus(
        ListPermissionSetProvisioningStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listPermissionSetProvisioningStatus);
    }

    /**
     * 列出权限集预分配状态
     *
     * 查询指定实例中的权限集预分配状态列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionSetProvisioningStatusRequest 请求对象
     * @return SyncInvoker<ListPermissionSetProvisioningStatusRequest, ListPermissionSetProvisioningStatusResponse>
     */
    public SyncInvoker<ListPermissionSetProvisioningStatusRequest, ListPermissionSetProvisioningStatusResponse> listPermissionSetProvisioningStatusInvoker(
        ListPermissionSetProvisioningStatusRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listPermissionSetProvisioningStatus, hcClient);
    }

    /**
     * 列出权限集
     *
     * 查询指定实例下的权限集列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionSetsRequest 请求对象
     * @return ListPermissionSetsResponse
     */
    public ListPermissionSetsResponse listPermissionSets(ListPermissionSetsRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listPermissionSets);
    }

    /**
     * 列出权限集
     *
     * 查询指定实例下的权限集列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionSetsRequest 请求对象
     * @return SyncInvoker<ListPermissionSetsRequest, ListPermissionSetsResponse>
     */
    public SyncInvoker<ListPermissionSetsRequest, ListPermissionSetsResponse> listPermissionSetsInvoker(
        ListPermissionSetsRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listPermissionSets, hcClient);
    }

    /**
     * 列出分配给账户的权限集
     *
     * 查询分配给指定账户的权限集列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionSetsProvisionedToAccountRequest 请求对象
     * @return ListPermissionSetsProvisionedToAccountResponse
     */
    public ListPermissionSetsProvisionedToAccountResponse listPermissionSetsProvisionedToAccount(
        ListPermissionSetsProvisionedToAccountRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listPermissionSetsProvisionedToAccount);
    }

    /**
     * 列出分配给账户的权限集
     *
     * 查询分配给指定账户的权限集列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionSetsProvisionedToAccountRequest 请求对象
     * @return SyncInvoker<ListPermissionSetsProvisionedToAccountRequest, ListPermissionSetsProvisionedToAccountResponse>
     */
    public SyncInvoker<ListPermissionSetsProvisionedToAccountRequest, ListPermissionSetsProvisionedToAccountResponse> listPermissionSetsProvisionedToAccountInvoker(
        ListPermissionSetsProvisionedToAccountRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listPermissionSetsProvisionedToAccount, hcClient);
    }

    /**
     * 预分配权限集
     *
     * 将指定权限集预分配给指定账户。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ProvisionPermissionSetRequest 请求对象
     * @return ProvisionPermissionSetResponse
     */
    public ProvisionPermissionSetResponse provisionPermissionSet(ProvisionPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.provisionPermissionSet);
    }

    /**
     * 预分配权限集
     *
     * 将指定权限集预分配给指定账户。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ProvisionPermissionSetRequest 请求对象
     * @return SyncInvoker<ProvisionPermissionSetRequest, ProvisionPermissionSetResponse>
     */
    public SyncInvoker<ProvisionPermissionSetRequest, ProvisionPermissionSetResponse> provisionPermissionSetInvoker(
        ProvisionPermissionSetRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.provisionPermissionSet, hcClient);
    }

    /**
     * 将自定义身份策略附加到权限集
     *
     * 将自定义身份策略附加到权限集。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutCustomPolicyToPermissionSetRequest 请求对象
     * @return PutCustomPolicyToPermissionSetResponse
     */
    public PutCustomPolicyToPermissionSetResponse putCustomPolicyToPermissionSet(
        PutCustomPolicyToPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.putCustomPolicyToPermissionSet);
    }

    /**
     * 将自定义身份策略附加到权限集
     *
     * 将自定义身份策略附加到权限集。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutCustomPolicyToPermissionSetRequest 请求对象
     * @return SyncInvoker<PutCustomPolicyToPermissionSetRequest, PutCustomPolicyToPermissionSetResponse>
     */
    public SyncInvoker<PutCustomPolicyToPermissionSetRequest, PutCustomPolicyToPermissionSetResponse> putCustomPolicyToPermissionSetInvoker(
        PutCustomPolicyToPermissionSetRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.putCustomPolicyToPermissionSet, hcClient);
    }

    /**
     * 添加自定义策略
     *
     * 在指定的权限集中添加自定义策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutCustomRoleToPermissionSetRequest 请求对象
     * @return PutCustomRoleToPermissionSetResponse
     */
    public PutCustomRoleToPermissionSetResponse putCustomRoleToPermissionSet(
        PutCustomRoleToPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.putCustomRoleToPermissionSet);
    }

    /**
     * 添加自定义策略
     *
     * 在指定的权限集中添加自定义策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutCustomRoleToPermissionSetRequest 请求对象
     * @return SyncInvoker<PutCustomRoleToPermissionSetRequest, PutCustomRoleToPermissionSetResponse>
     */
    public SyncInvoker<PutCustomRoleToPermissionSetRequest, PutCustomRoleToPermissionSetResponse> putCustomRoleToPermissionSetInvoker(
        PutCustomRoleToPermissionSetRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.putCustomRoleToPermissionSet, hcClient);
    }

    /**
     * 更新权限集
     *
     * 根据权限集ID，更新指定权限集的属性。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePermissionSetRequest 请求对象
     * @return UpdatePermissionSetResponse
     */
    public UpdatePermissionSetResponse updatePermissionSet(UpdatePermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.updatePermissionSet);
    }

    /**
     * 更新权限集
     *
     * 根据权限集ID，更新指定权限集的属性。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePermissionSetRequest 请求对象
     * @return SyncInvoker<UpdatePermissionSetRequest, UpdatePermissionSetResponse>
     */
    public SyncInvoker<UpdatePermissionSetRequest, UpdatePermissionSetResponse> updatePermissionSetInvoker(
        UpdatePermissionSetRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.updatePermissionSet, hcClient);
    }

    /**
     * 为指定资源添加标签
     *
     * 向指定的资源添加一个或多个标签。目前，您可以将标签附加到实例中的权限集。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagResourceRequest 请求对象
     * @return CreateTagResourceResponse
     */
    public CreateTagResourceResponse createTagResource(CreateTagResourceRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.createTagResource);
    }

    /**
     * 为指定资源添加标签
     *
     * 向指定的资源添加一个或多个标签。目前，您可以将标签附加到实例中的权限集。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagResourceRequest 请求对象
     * @return SyncInvoker<CreateTagResourceRequest, CreateTagResourceResponse>
     */
    public SyncInvoker<CreateTagResourceRequest, CreateTagResourceResponse> createTagResourceInvoker(
        CreateTagResourceRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.createTagResource, hcClient);
    }

    /**
     * 从指定资源中删除指定主键标签
     *
     * 从指定资源中删除具有指定主键的任何标签。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagResourceRequest 请求对象
     * @return DeleteTagResourceResponse
     */
    public DeleteTagResourceResponse deleteTagResource(DeleteTagResourceRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.deleteTagResource);
    }

    /**
     * 从指定资源中删除指定主键标签
     *
     * 从指定资源中删除具有指定主键的任何标签。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagResourceRequest 请求对象
     * @return SyncInvoker<DeleteTagResourceRequest, DeleteTagResourceResponse>
     */
    public SyncInvoker<DeleteTagResourceRequest, DeleteTagResourceResponse> deleteTagResourceInvoker(
        DeleteTagResourceRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.deleteTagResource, hcClient);
    }

    /**
     * 列出绑定到指定资源的标签
     *
     * 列出绑定到指定资源的标签。您可以将标签附加到实例中的权限集。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagResourcesRequest 请求对象
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listTagResources);
    }

    /**
     * 列出绑定到指定资源的标签
     *
     * 列出绑定到指定资源的标签。您可以将标签附加到实例中的权限集。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagResourcesRequest 请求对象
     * @return SyncInvoker<ListTagResourcesRequest, ListTagResourcesResponse>
     */
    public SyncInvoker<ListTagResourcesRequest, ListTagResourcesResponse> listTagResourcesInvoker(
        ListTagResourcesRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listTagResources, hcClient);
    }

}
