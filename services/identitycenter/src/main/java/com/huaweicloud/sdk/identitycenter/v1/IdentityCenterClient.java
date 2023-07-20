package com.huaweicloud.sdk.identitycenter.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachCustomerManagedPolicyToPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachCustomerManagedPolicyToPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedPolicyToPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedPolicyToPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateAccountAssignmentRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateAccountAssignmentResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreatePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreatePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteAccountAssignmentRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteAccountAssignmentResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeletePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeletePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentCreationStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentCreationStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentDeletionStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentDeletionStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetProvisioningStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetProvisioningStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachCustomerManagedPolicyReferenceFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachCustomerManagedPolicyReferenceFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedPolicyFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedPolicyFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentCreationStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentCreationStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentDeletionStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentDeletionStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountsForProvisionedPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountsForProvisionedPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListCustomerManagedPolicyReferencesInPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListCustomerManagedPolicyReferencesInPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListInstancesRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListInstancesResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListManagedPoliciesInPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListManagedPoliciesInPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetProvisioningStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetProvisioningStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsProvisionedToAccountRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsProvisionedToAccountResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListProfileAssociationsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListProfileAssociationsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdatePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdatePermissionSetResponse;

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
     * 创建帐户分配
     *
     * 使用指定的权限集为指定帐户分配对应主体的访问权限，主体可为IdentityCenter用户或IdentityCenter用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAccountAssignmentRequest 请求对象
     * @return CreateAccountAssignmentResponse
     */
    public CreateAccountAssignmentResponse createAccountAssignment(CreateAccountAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.createAccountAssignment);
    }

    /**
     * 创建帐户分配
     *
     * 使用指定的权限集为指定帐户分配对应主体的访问权限，主体可为IdentityCenter用户或IdentityCenter用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAccountAssignmentRequest 请求对象
     * @return SyncInvoker<CreateAccountAssignmentRequest, CreateAccountAssignmentResponse>
     */
    public SyncInvoker<CreateAccountAssignmentRequest, CreateAccountAssignmentResponse> createAccountAssignmentInvoker(
        CreateAccountAssignmentRequest request) {
        return new SyncInvoker<CreateAccountAssignmentRequest, CreateAccountAssignmentResponse>(request,
            IdentityCenterMeta.createAccountAssignment, hcClient);
    }

    /**
     * 使用指定的权限集从指定帐户删除主体的访问权限
     *
     * 使用指定的权限集从指定帐户删除主体的访问权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAccountAssignmentRequest 请求对象
     * @return DeleteAccountAssignmentResponse
     */
    public DeleteAccountAssignmentResponse deleteAccountAssignment(DeleteAccountAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.deleteAccountAssignment);
    }

    /**
     * 使用指定的权限集从指定帐户删除主体的访问权限
     *
     * 使用指定的权限集从指定帐户删除主体的访问权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAccountAssignmentRequest 请求对象
     * @return SyncInvoker<DeleteAccountAssignmentRequest, DeleteAccountAssignmentResponse>
     */
    public SyncInvoker<DeleteAccountAssignmentRequest, DeleteAccountAssignmentResponse> deleteAccountAssignmentInvoker(
        DeleteAccountAssignmentRequest request) {
        return new SyncInvoker<DeleteAccountAssignmentRequest, DeleteAccountAssignmentResponse>(request,
            IdentityCenterMeta.deleteAccountAssignment, hcClient);
    }

    /**
     * 查询账号分配请求的状态
     *
     * 根据请求ID，查询指定IAM Identity Center实例下的帐户分配创建状态详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DescribeAccountAssignmentCreationStatusRequest 请求对象
     * @return DescribeAccountAssignmentCreationStatusResponse
     */
    public DescribeAccountAssignmentCreationStatusResponse describeAccountAssignmentCreationStatus(
        DescribeAccountAssignmentCreationStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.describeAccountAssignmentCreationStatus);
    }

    /**
     * 查询账号分配请求的状态
     *
     * 根据请求ID，查询指定IAM Identity Center实例下的帐户分配创建状态详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DescribeAccountAssignmentCreationStatusRequest 请求对象
     * @return SyncInvoker<DescribeAccountAssignmentCreationStatusRequest, DescribeAccountAssignmentCreationStatusResponse>
     */
    public SyncInvoker<DescribeAccountAssignmentCreationStatusRequest, DescribeAccountAssignmentCreationStatusResponse> describeAccountAssignmentCreationStatusInvoker(
        DescribeAccountAssignmentCreationStatusRequest request) {
        return new SyncInvoker<DescribeAccountAssignmentCreationStatusRequest, DescribeAccountAssignmentCreationStatusResponse>(
            request, IdentityCenterMeta.describeAccountAssignmentCreationStatus, hcClient);
    }

    /**
     * 查询账户分配删除状态详情
     *
     * 根据请求ID，查询指定IAM Identity Center实例下的帐户分配删除状态详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DescribeAccountAssignmentDeletionStatusRequest 请求对象
     * @return DescribeAccountAssignmentDeletionStatusResponse
     */
    public DescribeAccountAssignmentDeletionStatusResponse describeAccountAssignmentDeletionStatus(
        DescribeAccountAssignmentDeletionStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.describeAccountAssignmentDeletionStatus);
    }

    /**
     * 查询账户分配删除状态详情
     *
     * 根据请求ID，查询指定IAM Identity Center实例下的帐户分配删除状态详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DescribeAccountAssignmentDeletionStatusRequest 请求对象
     * @return SyncInvoker<DescribeAccountAssignmentDeletionStatusRequest, DescribeAccountAssignmentDeletionStatusResponse>
     */
    public SyncInvoker<DescribeAccountAssignmentDeletionStatusRequest, DescribeAccountAssignmentDeletionStatusResponse> describeAccountAssignmentDeletionStatusInvoker(
        DescribeAccountAssignmentDeletionStatusRequest request) {
        return new SyncInvoker<DescribeAccountAssignmentDeletionStatusRequest, DescribeAccountAssignmentDeletionStatusResponse>(
            request, IdentityCenterMeta.describeAccountAssignmentDeletionStatus, hcClient);
    }

    /**
     * 列出账户分配创建状态
     *
     * 查询指定IAM Identity Center实例下的帐户分配的创建状态列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccountAssignmentCreationStatusRequest 请求对象
     * @return ListAccountAssignmentCreationStatusResponse
     */
    public ListAccountAssignmentCreationStatusResponse listAccountAssignmentCreationStatus(
        ListAccountAssignmentCreationStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listAccountAssignmentCreationStatus);
    }

    /**
     * 列出账户分配创建状态
     *
     * 查询指定IAM Identity Center实例下的帐户分配的创建状态列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccountAssignmentCreationStatusRequest 请求对象
     * @return SyncInvoker<ListAccountAssignmentCreationStatusRequest, ListAccountAssignmentCreationStatusResponse>
     */
    public SyncInvoker<ListAccountAssignmentCreationStatusRequest, ListAccountAssignmentCreationStatusResponse> listAccountAssignmentCreationStatusInvoker(
        ListAccountAssignmentCreationStatusRequest request) {
        return new SyncInvoker<ListAccountAssignmentCreationStatusRequest, ListAccountAssignmentCreationStatusResponse>(
            request, IdentityCenterMeta.listAccountAssignmentCreationStatus, hcClient);
    }

    /**
     * 列出账户分配删除状态
     *
     * 查询指定IAM Identity Center实例下的帐户分配的删除状态列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccountAssignmentDeletionStatusRequest 请求对象
     * @return ListAccountAssignmentDeletionStatusResponse
     */
    public ListAccountAssignmentDeletionStatusResponse listAccountAssignmentDeletionStatus(
        ListAccountAssignmentDeletionStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listAccountAssignmentDeletionStatus);
    }

    /**
     * 列出账户分配删除状态
     *
     * 查询指定IAM Identity Center实例下的帐户分配的删除状态列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccountAssignmentDeletionStatusRequest 请求对象
     * @return SyncInvoker<ListAccountAssignmentDeletionStatusRequest, ListAccountAssignmentDeletionStatusResponse>
     */
    public SyncInvoker<ListAccountAssignmentDeletionStatusRequest, ListAccountAssignmentDeletionStatusResponse> listAccountAssignmentDeletionStatusInvoker(
        ListAccountAssignmentDeletionStatusRequest request) {
        return new SyncInvoker<ListAccountAssignmentDeletionStatusRequest, ListAccountAssignmentDeletionStatusResponse>(
            request, IdentityCenterMeta.listAccountAssignmentDeletionStatus, hcClient);
    }

    /**
     * 列出与指定权限集以及指定帐户关联的用户/用户组
     *
     * 列出与指定权限集以及指定帐户关联的用户/用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccountAssignmentsRequest 请求对象
     * @return ListAccountAssignmentsResponse
     */
    public ListAccountAssignmentsResponse listAccountAssignments(ListAccountAssignmentsRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listAccountAssignments);
    }

    /**
     * 列出与指定权限集以及指定帐户关联的用户/用户组
     *
     * 列出与指定权限集以及指定帐户关联的用户/用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccountAssignmentsRequest 请求对象
     * @return SyncInvoker<ListAccountAssignmentsRequest, ListAccountAssignmentsResponse>
     */
    public SyncInvoker<ListAccountAssignmentsRequest, ListAccountAssignmentsResponse> listAccountAssignmentsInvoker(
        ListAccountAssignmentsRequest request) {
        return new SyncInvoker<ListAccountAssignmentsRequest, ListAccountAssignmentsResponse>(request,
            IdentityCenterMeta.listAccountAssignments, hcClient);
    }

    /**
     * 查询profile关联的用户或组列表
     *
     * 查询profile关联的用户或组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProfileAssociationsRequest 请求对象
     * @return ListProfileAssociationsResponse
     */
    public ListProfileAssociationsResponse listProfileAssociations(ListProfileAssociationsRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listProfileAssociations);
    }

    /**
     * 查询profile关联的用户或组列表
     *
     * 查询profile关联的用户或组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProfileAssociationsRequest 请求对象
     * @return SyncInvoker<ListProfileAssociationsRequest, ListProfileAssociationsResponse>
     */
    public SyncInvoker<ListProfileAssociationsRequest, ListProfileAssociationsResponse> listProfileAssociationsInvoker(
        ListProfileAssociationsRequest request) {
        return new SyncInvoker<ListProfileAssociationsRequest, ListProfileAssociationsResponse>(request,
            IdentityCenterMeta.listProfileAssociations, hcClient);
    }

    /**
     * 查询实例列表
     *
     * 查询 IAM Identity Center的资源实例列表.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listInstances);
    }

    /**
     * 查询实例列表
     *
     * 查询 IAM Identity Center的资源实例列表.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, IdentityCenterMeta.listInstances,
            hcClient);
    }

    /**
     * 将指定的客户自定义管理策略附加到指定的权限集
     *
     * 将指定的客户自定义管理策略附加到指定的权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachCustomerManagedPolicyToPermissionSetRequest 请求对象
     * @return AttachCustomerManagedPolicyToPermissionSetResponse
     */
    public AttachCustomerManagedPolicyToPermissionSetResponse attachCustomerManagedPolicyToPermissionSet(
        AttachCustomerManagedPolicyToPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.attachCustomerManagedPolicyToPermissionSet);
    }

    /**
     * 将指定的客户自定义管理策略附加到指定的权限集
     *
     * 将指定的客户自定义管理策略附加到指定的权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachCustomerManagedPolicyToPermissionSetRequest 请求对象
     * @return SyncInvoker<AttachCustomerManagedPolicyToPermissionSetRequest, AttachCustomerManagedPolicyToPermissionSetResponse>
     */
    public SyncInvoker<AttachCustomerManagedPolicyToPermissionSetRequest, AttachCustomerManagedPolicyToPermissionSetResponse> attachCustomerManagedPolicyToPermissionSetInvoker(
        AttachCustomerManagedPolicyToPermissionSetRequest request) {
        return new SyncInvoker<AttachCustomerManagedPolicyToPermissionSetRequest, AttachCustomerManagedPolicyToPermissionSetResponse>(
            request, IdentityCenterMeta.attachCustomerManagedPolicyToPermissionSet, hcClient);
    }

    /**
     * 将系统管理策略附加到权限集
     *
     * 将系统管理策略附加到权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachManagedPolicyToPermissionSetRequest 请求对象
     * @return AttachManagedPolicyToPermissionSetResponse
     */
    public AttachManagedPolicyToPermissionSetResponse attachManagedPolicyToPermissionSet(
        AttachManagedPolicyToPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.attachManagedPolicyToPermissionSet);
    }

    /**
     * 将系统管理策略附加到权限集
     *
     * 将系统管理策略附加到权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachManagedPolicyToPermissionSetRequest 请求对象
     * @return SyncInvoker<AttachManagedPolicyToPermissionSetRequest, AttachManagedPolicyToPermissionSetResponse>
     */
    public SyncInvoker<AttachManagedPolicyToPermissionSetRequest, AttachManagedPolicyToPermissionSetResponse> attachManagedPolicyToPermissionSetInvoker(
        AttachManagedPolicyToPermissionSetRequest request) {
        return new SyncInvoker<AttachManagedPolicyToPermissionSetRequest, AttachManagedPolicyToPermissionSetResponse>(
            request, IdentityCenterMeta.attachManagedPolicyToPermissionSet, hcClient);
    }

    /**
     * 在指定的IAM Identity Center实例中创建权限集
     *
     * 在指定的IAM Identity Center实例中创建一个权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePermissionSetRequest 请求对象
     * @return CreatePermissionSetResponse
     */
    public CreatePermissionSetResponse createPermissionSet(CreatePermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.createPermissionSet);
    }

    /**
     * 在指定的IAM Identity Center实例中创建权限集
     *
     * 在指定的IAM Identity Center实例中创建一个权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePermissionSetRequest 请求对象
     * @return SyncInvoker<CreatePermissionSetRequest, CreatePermissionSetResponse>
     */
    public SyncInvoker<CreatePermissionSetRequest, CreatePermissionSetResponse> createPermissionSetInvoker(
        CreatePermissionSetRequest request) {
        return new SyncInvoker<CreatePermissionSetRequest, CreatePermissionSetResponse>(request,
            IdentityCenterMeta.createPermissionSet, hcClient);
    }

    /**
     * 删除指定实例的权限集
     *
     * 删除指定实例的权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePermissionSetRequest 请求对象
     * @return DeletePermissionSetResponse
     */
    public DeletePermissionSetResponse deletePermissionSet(DeletePermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.deletePermissionSet);
    }

    /**
     * 删除指定实例的权限集
     *
     * 删除指定实例的权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePermissionSetRequest 请求对象
     * @return SyncInvoker<DeletePermissionSetRequest, DeletePermissionSetResponse>
     */
    public SyncInvoker<DeletePermissionSetRequest, DeletePermissionSetResponse> deletePermissionSetInvoker(
        DeletePermissionSetRequest request) {
        return new SyncInvoker<DeletePermissionSetRequest, DeletePermissionSetResponse>(request,
            IdentityCenterMeta.deletePermissionSet, hcClient);
    }

    /**
     * 查询权限集详情
     *
     * 根据权限集ID，查询指定权限集的详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DescribePermissionSetRequest 请求对象
     * @return DescribePermissionSetResponse
     */
    public DescribePermissionSetResponse describePermissionSet(DescribePermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.describePermissionSet);
    }

    /**
     * 查询权限集详情
     *
     * 根据权限集ID，查询指定权限集的详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DescribePermissionSetRequest 请求对象
     * @return SyncInvoker<DescribePermissionSetRequest, DescribePermissionSetResponse>
     */
    public SyncInvoker<DescribePermissionSetRequest, DescribePermissionSetResponse> describePermissionSetInvoker(
        DescribePermissionSetRequest request) {
        return new SyncInvoker<DescribePermissionSetRequest, DescribePermissionSetResponse>(request,
            IdentityCenterMeta.describePermissionSet, hcClient);
    }

    /**
     * 查询权限集预分配状态详情
     *
     * 根据请求Id，查询权限集预分配状态的详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DescribePermissionSetProvisioningStatusRequest 请求对象
     * @return DescribePermissionSetProvisioningStatusResponse
     */
    public DescribePermissionSetProvisioningStatusResponse describePermissionSetProvisioningStatus(
        DescribePermissionSetProvisioningStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.describePermissionSetProvisioningStatus);
    }

    /**
     * 查询权限集预分配状态详情
     *
     * 根据请求Id，查询权限集预分配状态的详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DescribePermissionSetProvisioningStatusRequest 请求对象
     * @return SyncInvoker<DescribePermissionSetProvisioningStatusRequest, DescribePermissionSetProvisioningStatusResponse>
     */
    public SyncInvoker<DescribePermissionSetProvisioningStatusRequest, DescribePermissionSetProvisioningStatusResponse> describePermissionSetProvisioningStatusInvoker(
        DescribePermissionSetProvisioningStatusRequest request) {
        return new SyncInvoker<DescribePermissionSetProvisioningStatusRequest, DescribePermissionSetProvisioningStatusResponse>(
            request, IdentityCenterMeta.describePermissionSetProvisioningStatus, hcClient);
    }

    /**
     * 将附加的客户自定义管理策略从指定的权限集中分离
     *
     * 将附加的客户自定义管理策略从指定的权限集中分离
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetachCustomerManagedPolicyReferenceFromPermissionSetRequest 请求对象
     * @return DetachCustomerManagedPolicyReferenceFromPermissionSetResponse
     */
    public DetachCustomerManagedPolicyReferenceFromPermissionSetResponse detachCustomerManagedPolicyReferenceFromPermissionSet(
        DetachCustomerManagedPolicyReferenceFromPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request,
            IdentityCenterMeta.detachCustomerManagedPolicyReferenceFromPermissionSet);
    }

    /**
     * 将附加的客户自定义管理策略从指定的权限集中分离
     *
     * 将附加的客户自定义管理策略从指定的权限集中分离
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetachCustomerManagedPolicyReferenceFromPermissionSetRequest 请求对象
     * @return SyncInvoker<DetachCustomerManagedPolicyReferenceFromPermissionSetRequest, DetachCustomerManagedPolicyReferenceFromPermissionSetResponse>
     */
    public SyncInvoker<DetachCustomerManagedPolicyReferenceFromPermissionSetRequest, DetachCustomerManagedPolicyReferenceFromPermissionSetResponse> detachCustomerManagedPolicyReferenceFromPermissionSetInvoker(
        DetachCustomerManagedPolicyReferenceFromPermissionSetRequest request) {
        return new SyncInvoker<DetachCustomerManagedPolicyReferenceFromPermissionSetRequest, DetachCustomerManagedPolicyReferenceFromPermissionSetResponse>(
            request, IdentityCenterMeta.detachCustomerManagedPolicyReferenceFromPermissionSet, hcClient);
    }

    /**
     * 将附加的系统策略从指定的权限集中分离
     *
     * 将附加的系统策略从指定的权限集中分离
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetachManagedPolicyFromPermissionSetRequest 请求对象
     * @return DetachManagedPolicyFromPermissionSetResponse
     */
    public DetachManagedPolicyFromPermissionSetResponse detachManagedPolicyFromPermissionSet(
        DetachManagedPolicyFromPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.detachManagedPolicyFromPermissionSet);
    }

    /**
     * 将附加的系统策略从指定的权限集中分离
     *
     * 将附加的系统策略从指定的权限集中分离
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetachManagedPolicyFromPermissionSetRequest 请求对象
     * @return SyncInvoker<DetachManagedPolicyFromPermissionSetRequest, DetachManagedPolicyFromPermissionSetResponse>
     */
    public SyncInvoker<DetachManagedPolicyFromPermissionSetRequest, DetachManagedPolicyFromPermissionSetResponse> detachManagedPolicyFromPermissionSetInvoker(
        DetachManagedPolicyFromPermissionSetRequest request) {
        return new SyncInvoker<DetachManagedPolicyFromPermissionSetRequest, DetachManagedPolicyFromPermissionSetResponse>(
            request, IdentityCenterMeta.detachManagedPolicyFromPermissionSet, hcClient);
    }

    /**
     * 列出权限集关联的账户
     *
     * 查询与指定权限集关联的账户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccountsForProvisionedPermissionSetRequest 请求对象
     * @return ListAccountsForProvisionedPermissionSetResponse
     */
    public ListAccountsForProvisionedPermissionSetResponse listAccountsForProvisionedPermissionSet(
        ListAccountsForProvisionedPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listAccountsForProvisionedPermissionSet);
    }

    /**
     * 列出权限集关联的账户
     *
     * 查询与指定权限集关联的账户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccountsForProvisionedPermissionSetRequest 请求对象
     * @return SyncInvoker<ListAccountsForProvisionedPermissionSetRequest, ListAccountsForProvisionedPermissionSetResponse>
     */
    public SyncInvoker<ListAccountsForProvisionedPermissionSetRequest, ListAccountsForProvisionedPermissionSetResponse> listAccountsForProvisionedPermissionSetInvoker(
        ListAccountsForProvisionedPermissionSetRequest request) {
        return new SyncInvoker<ListAccountsForProvisionedPermissionSetRequest, ListAccountsForProvisionedPermissionSetResponse>(
            request, IdentityCenterMeta.listAccountsForProvisionedPermissionSet, hcClient);
    }

    /**
     * 获取附加到指定权限集的所有客户自定义策略列表
     *
     * 获取附加到指定权限集的所有客户自定义策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerManagedPolicyReferencesInPermissionSetRequest 请求对象
     * @return ListCustomerManagedPolicyReferencesInPermissionSetResponse
     */
    public ListCustomerManagedPolicyReferencesInPermissionSetResponse listCustomerManagedPolicyReferencesInPermissionSet(
        ListCustomerManagedPolicyReferencesInPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listCustomerManagedPolicyReferencesInPermissionSet);
    }

    /**
     * 获取附加到指定权限集的所有客户自定义策略列表
     *
     * 获取附加到指定权限集的所有客户自定义策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomerManagedPolicyReferencesInPermissionSetRequest 请求对象
     * @return SyncInvoker<ListCustomerManagedPolicyReferencesInPermissionSetRequest, ListCustomerManagedPolicyReferencesInPermissionSetResponse>
     */
    public SyncInvoker<ListCustomerManagedPolicyReferencesInPermissionSetRequest, ListCustomerManagedPolicyReferencesInPermissionSetResponse> listCustomerManagedPolicyReferencesInPermissionSetInvoker(
        ListCustomerManagedPolicyReferencesInPermissionSetRequest request) {
        return new SyncInvoker<ListCustomerManagedPolicyReferencesInPermissionSetRequest, ListCustomerManagedPolicyReferencesInPermissionSetResponse>(
            request, IdentityCenterMeta.listCustomerManagedPolicyReferencesInPermissionSet, hcClient);
    }

    /**
     * 列出权限集中附加的系统管理策略
     *
     * 列出权限集中附加的系统管理策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListManagedPoliciesInPermissionSetRequest 请求对象
     * @return ListManagedPoliciesInPermissionSetResponse
     */
    public ListManagedPoliciesInPermissionSetResponse listManagedPoliciesInPermissionSet(
        ListManagedPoliciesInPermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listManagedPoliciesInPermissionSet);
    }

    /**
     * 列出权限集中附加的系统管理策略
     *
     * 列出权限集中附加的系统管理策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListManagedPoliciesInPermissionSetRequest 请求对象
     * @return SyncInvoker<ListManagedPoliciesInPermissionSetRequest, ListManagedPoliciesInPermissionSetResponse>
     */
    public SyncInvoker<ListManagedPoliciesInPermissionSetRequest, ListManagedPoliciesInPermissionSetResponse> listManagedPoliciesInPermissionSetInvoker(
        ListManagedPoliciesInPermissionSetRequest request) {
        return new SyncInvoker<ListManagedPoliciesInPermissionSetRequest, ListManagedPoliciesInPermissionSetResponse>(
            request, IdentityCenterMeta.listManagedPoliciesInPermissionSet, hcClient);
    }

    /**
     * 列出权限集预分配状态
     *
     * 查询指定实例中的权限集预分配状态列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPermissionSetProvisioningStatusRequest 请求对象
     * @return ListPermissionSetProvisioningStatusResponse
     */
    public ListPermissionSetProvisioningStatusResponse listPermissionSetProvisioningStatus(
        ListPermissionSetProvisioningStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listPermissionSetProvisioningStatus);
    }

    /**
     * 列出权限集预分配状态
     *
     * 查询指定实例中的权限集预分配状态列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPermissionSetProvisioningStatusRequest 请求对象
     * @return SyncInvoker<ListPermissionSetProvisioningStatusRequest, ListPermissionSetProvisioningStatusResponse>
     */
    public SyncInvoker<ListPermissionSetProvisioningStatusRequest, ListPermissionSetProvisioningStatusResponse> listPermissionSetProvisioningStatusInvoker(
        ListPermissionSetProvisioningStatusRequest request) {
        return new SyncInvoker<ListPermissionSetProvisioningStatusRequest, ListPermissionSetProvisioningStatusResponse>(
            request, IdentityCenterMeta.listPermissionSetProvisioningStatus, hcClient);
    }

    /**
     * 列出指定实例的权限集列表
     *
     * 列出指定实例的权限集列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPermissionSetsRequest 请求对象
     * @return ListPermissionSetsResponse
     */
    public ListPermissionSetsResponse listPermissionSets(ListPermissionSetsRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listPermissionSets);
    }

    /**
     * 列出指定实例的权限集列表
     *
     * 列出指定实例的权限集列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPermissionSetsRequest 请求对象
     * @return SyncInvoker<ListPermissionSetsRequest, ListPermissionSetsResponse>
     */
    public SyncInvoker<ListPermissionSetsRequest, ListPermissionSetsResponse> listPermissionSetsInvoker(
        ListPermissionSetsRequest request) {
        return new SyncInvoker<ListPermissionSetsRequest, ListPermissionSetsResponse>(request,
            IdentityCenterMeta.listPermissionSets, hcClient);
    }

    /**
     * 列出分配给指定帐户的权限集列表
     *
     * 列出分配给指定帐户的权限集列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPermissionSetsProvisionedToAccountRequest 请求对象
     * @return ListPermissionSetsProvisionedToAccountResponse
     */
    public ListPermissionSetsProvisionedToAccountResponse listPermissionSetsProvisionedToAccount(
        ListPermissionSetsProvisionedToAccountRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listPermissionSetsProvisionedToAccount);
    }

    /**
     * 列出分配给指定帐户的权限集列表
     *
     * 列出分配给指定帐户的权限集列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPermissionSetsProvisionedToAccountRequest 请求对象
     * @return SyncInvoker<ListPermissionSetsProvisionedToAccountRequest, ListPermissionSetsProvisionedToAccountResponse>
     */
    public SyncInvoker<ListPermissionSetsProvisionedToAccountRequest, ListPermissionSetsProvisionedToAccountResponse> listPermissionSetsProvisionedToAccountInvoker(
        ListPermissionSetsProvisionedToAccountRequest request) {
        return new SyncInvoker<ListPermissionSetsProvisionedToAccountRequest, ListPermissionSetsProvisionedToAccountResponse>(
            request, IdentityCenterMeta.listPermissionSetsProvisionedToAccount, hcClient);
    }

    /**
     * 更新权限集
     *
     * 根据权限集ID，删除指定权限集的属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePermissionSetRequest 请求对象
     * @return UpdatePermissionSetResponse
     */
    public UpdatePermissionSetResponse updatePermissionSet(UpdatePermissionSetRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.updatePermissionSet);
    }

    /**
     * 更新权限集
     *
     * 根据权限集ID，删除指定权限集的属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePermissionSetRequest 请求对象
     * @return SyncInvoker<UpdatePermissionSetRequest, UpdatePermissionSetResponse>
     */
    public SyncInvoker<UpdatePermissionSetRequest, UpdatePermissionSetResponse> updatePermissionSetInvoker(
        UpdatePermissionSetRequest request) {
        return new SyncInvoker<UpdatePermissionSetRequest, UpdatePermissionSetResponse>(request,
            IdentityCenterMeta.updatePermissionSet, hcClient);
    }

}
