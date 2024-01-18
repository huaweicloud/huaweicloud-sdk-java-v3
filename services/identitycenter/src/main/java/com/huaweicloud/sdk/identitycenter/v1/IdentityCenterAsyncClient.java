package com.huaweicloud.sdk.identitycenter.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
     * 创建帐户分配
     *
     * 使用指定的权限集为指定帐户分配对应主体的访问权限，主体可为IdentityCenter用户或IdentityCenter用户组
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
     * 创建帐户分配
     *
     * 使用指定的权限集为指定帐户分配对应主体的访问权限，主体可为IdentityCenter用户或IdentityCenter用户组
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
     * 使用指定的权限集从指定帐户删除主体的访问权限
     *
     * 使用指定的权限集从指定帐户删除主体的访问权限
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
     * 使用指定的权限集从指定帐户删除主体的访问权限
     *
     * 使用指定的权限集从指定帐户删除主体的访问权限
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
     * 查询账号分配请求的状态
     *
     * 根据请求ID，查询指定IAM Identity Center实例下的帐户分配创建状态详情信息
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
     * 查询账号分配请求的状态
     *
     * 根据请求ID，查询指定IAM Identity Center实例下的帐户分配创建状态详情信息
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
     * 根据请求ID，查询指定IAM Identity Center实例下的帐户分配删除状态详情信息
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
     * 根据请求ID，查询指定IAM Identity Center实例下的帐户分配删除状态详情信息
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
     * 列出账户分配创建状态
     *
     * 查询指定IAM Identity Center实例下的帐户分配的创建状态列表
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
     * 查询指定IAM Identity Center实例下的帐户分配的创建状态列表
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
     * 查询指定IAM Identity Center实例下的帐户分配的删除状态列表
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
     * 查询指定IAM Identity Center实例下的帐户分配的删除状态列表
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
     * 列出与指定权限集以及指定帐户关联的用户/用户组
     *
     * 列出与指定权限集以及指定帐户关联的用户/用户组
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
     * 列出与指定权限集以及指定帐户关联的用户/用户组
     *
     * 列出与指定权限集以及指定帐户关联的用户/用户组
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
     * 查询profile关联的用户或组列表
     *
     * 查询profile关联的用户或组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProfileAssociationsRequest 请求对象
     * @return CompletableFuture<ListProfileAssociationsResponse>
     */
    public CompletableFuture<ListProfileAssociationsResponse> listProfileAssociationsAsync(
        ListProfileAssociationsRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listProfileAssociations);
    }

    /**
     * 查询profile关联的用户或组列表
     *
     * 查询profile关联的用户或组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProfileAssociationsRequest 请求对象
     * @return AsyncInvoker<ListProfileAssociationsRequest, ListProfileAssociationsResponse>
     */
    public AsyncInvoker<ListProfileAssociationsRequest, ListProfileAssociationsResponse> listProfileAssociationsAsyncInvoker(
        ListProfileAssociationsRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listProfileAssociations, hcClient);
    }

    /**
     * 查询实例列表
     *
     * 查询 IAM Identity Center的资源实例列表.
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
     * 查询实例列表
     *
     * 查询 IAM Identity Center的资源实例列表.
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
     * 将指定的客户自定义管理策略附加到指定的权限集
     *
     * 将指定的客户自定义管理策略附加到指定的权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachCustomerManagedPolicyToPermissionSetRequest 请求对象
     * @return CompletableFuture<AttachCustomerManagedPolicyToPermissionSetResponse>
     */
    public CompletableFuture<AttachCustomerManagedPolicyToPermissionSetResponse> attachCustomerManagedPolicyToPermissionSetAsync(
        AttachCustomerManagedPolicyToPermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.attachCustomerManagedPolicyToPermissionSet);
    }

    /**
     * 将指定的客户自定义管理策略附加到指定的权限集
     *
     * 将指定的客户自定义管理策略附加到指定的权限集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachCustomerManagedPolicyToPermissionSetRequest 请求对象
     * @return AsyncInvoker<AttachCustomerManagedPolicyToPermissionSetRequest, AttachCustomerManagedPolicyToPermissionSetResponse>
     */
    public AsyncInvoker<AttachCustomerManagedPolicyToPermissionSetRequest, AttachCustomerManagedPolicyToPermissionSetResponse> attachCustomerManagedPolicyToPermissionSetAsyncInvoker(
        AttachCustomerManagedPolicyToPermissionSetRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.attachCustomerManagedPolicyToPermissionSet, hcClient);
    }

    /**
     * 将系统管理策略附加到权限集
     *
     * 将系统管理策略附加到权限集
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
     * 将系统管理策略附加到权限集
     *
     * 将系统管理策略附加到权限集
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
     * 在指定的IAM Identity Center实例中创建权限集
     *
     * 在指定的IAM Identity Center实例中创建一个权限集
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
     * 在指定的IAM Identity Center实例中创建权限集
     *
     * 在指定的IAM Identity Center实例中创建一个权限集
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
     * 删除指定实例的权限集
     *
     * 删除指定实例的权限集
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
     * 删除指定实例的权限集
     *
     * 删除指定实例的权限集
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
     * 根据权限集ID，查询指定权限集的详情信息
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
     * 根据权限集ID，查询指定权限集的详情信息
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
     * 根据请求Id，查询权限集预分配状态的详情信息
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
     * 根据请求Id，查询权限集预分配状态的详情信息
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
     * 将附加的客户自定义管理策略从指定的权限集中分离
     *
     * 将附加的客户自定义管理策略从指定的权限集中分离
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachCustomerManagedPolicyReferenceFromPermissionSetRequest 请求对象
     * @return CompletableFuture<DetachCustomerManagedPolicyReferenceFromPermissionSetResponse>
     */
    public CompletableFuture<DetachCustomerManagedPolicyReferenceFromPermissionSetResponse> detachCustomerManagedPolicyReferenceFromPermissionSetAsync(
        DetachCustomerManagedPolicyReferenceFromPermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request,
            IdentityCenterMeta.detachCustomerManagedPolicyReferenceFromPermissionSet);
    }

    /**
     * 将附加的客户自定义管理策略从指定的权限集中分离
     *
     * 将附加的客户自定义管理策略从指定的权限集中分离
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachCustomerManagedPolicyReferenceFromPermissionSetRequest 请求对象
     * @return AsyncInvoker<DetachCustomerManagedPolicyReferenceFromPermissionSetRequest, DetachCustomerManagedPolicyReferenceFromPermissionSetResponse>
     */
    public AsyncInvoker<DetachCustomerManagedPolicyReferenceFromPermissionSetRequest, DetachCustomerManagedPolicyReferenceFromPermissionSetResponse> detachCustomerManagedPolicyReferenceFromPermissionSetAsyncInvoker(
        DetachCustomerManagedPolicyReferenceFromPermissionSetRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.detachCustomerManagedPolicyReferenceFromPermissionSet,
            hcClient);
    }

    /**
     * 将附加的系统策略从指定的权限集中分离
     *
     * 将附加的系统策略从指定的权限集中分离
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
     * 将附加的系统策略从指定的权限集中分离
     *
     * 将附加的系统策略从指定的权限集中分离
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
     * 列出权限集关联的账户
     *
     * 查询与指定权限集关联的账户列表
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
     * 列出权限集关联的账户
     *
     * 查询与指定权限集关联的账户列表
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
     * 获取附加到指定权限集的所有客户自定义策略列表
     *
     * 获取附加到指定权限集的所有客户自定义策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomerManagedPolicyReferencesInPermissionSetRequest 请求对象
     * @return CompletableFuture<ListCustomerManagedPolicyReferencesInPermissionSetResponse>
     */
    public CompletableFuture<ListCustomerManagedPolicyReferencesInPermissionSetResponse> listCustomerManagedPolicyReferencesInPermissionSetAsync(
        ListCustomerManagedPolicyReferencesInPermissionSetRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listCustomerManagedPolicyReferencesInPermissionSet);
    }

    /**
     * 获取附加到指定权限集的所有客户自定义策略列表
     *
     * 获取附加到指定权限集的所有客户自定义策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomerManagedPolicyReferencesInPermissionSetRequest 请求对象
     * @return AsyncInvoker<ListCustomerManagedPolicyReferencesInPermissionSetRequest, ListCustomerManagedPolicyReferencesInPermissionSetResponse>
     */
    public AsyncInvoker<ListCustomerManagedPolicyReferencesInPermissionSetRequest, ListCustomerManagedPolicyReferencesInPermissionSetResponse> listCustomerManagedPolicyReferencesInPermissionSetAsyncInvoker(
        ListCustomerManagedPolicyReferencesInPermissionSetRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listCustomerManagedPolicyReferencesInPermissionSet,
            hcClient);
    }

    /**
     * 列出权限集中附加的系统管理策略
     *
     * 列出权限集中附加的系统管理策略
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
     * 列出权限集中附加的系统管理策略
     *
     * 列出权限集中附加的系统管理策略
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
     * 列出权限集预分配状态
     *
     * 查询指定实例中的权限集预分配状态列表
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
     * 查询指定实例中的权限集预分配状态列表
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
     * 列出指定实例的权限集列表
     *
     * 列出指定实例的权限集列表
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
     * 列出指定实例的权限集列表
     *
     * 列出指定实例的权限集列表
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
     * 列出分配给指定帐户的权限集列表
     *
     * 列出分配给指定帐户的权限集列表
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
     * 列出分配给指定帐户的权限集列表
     *
     * 列出分配给指定帐户的权限集列表
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
     * 更新权限集
     *
     * 根据权限集ID，删除指定权限集的属性
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
     * 根据权限集ID，删除指定权限集的属性
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

}
