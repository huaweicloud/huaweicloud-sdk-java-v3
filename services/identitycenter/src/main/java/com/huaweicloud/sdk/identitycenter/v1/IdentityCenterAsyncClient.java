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
import com.huaweicloud.sdk.identitycenter.v1.model.CreateInstanceAccessControlAttributeConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateInstanceAccessControlAttributeConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreatePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreatePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateTagResourceRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateTagResourceResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteAccountAssignmentRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteAccountAssignmentResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteCustomPolicyFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteCustomPolicyFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteCustomRoleFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteCustomRoleFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteInstanceAccessControlAttributeConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteInstanceAccessControlAttributeConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeletePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeletePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteTagResourceRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteTagResourceResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentCreationStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentCreationStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentDeletionStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentDeletionStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeInstanceAccessControlAttributeConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeInstanceAccessControlAttributeConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetProvisioningStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetProvisioningStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedPolicyFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedPolicyFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedRoleFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedRoleFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetCustomPolicyForPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetCustomPolicyForPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetCustomRoleForPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetCustomRoleForPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentCreationStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentCreationStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentDeletionStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentDeletionStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountsForProvisionedPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountsForProvisionedPermissionSetResponse;
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
import com.huaweicloud.sdk.identitycenter.v1.model.ListTagResourcesRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListTagResourcesResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ProvisionPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ProvisionPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.PutCustomPolicyToPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.PutCustomPolicyToPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.PutCustomRoleToPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.PutCustomRoleToPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateInstanceAccessControlAttributeConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateInstanceAccessControlAttributeConfigurationResponse;
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
     * 创建账号分配
     *
     * 使用指定的权限集为指定账号分配对应主体的访问权限，主体可为IAM身份中心用户或用户组。
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
     * 创建账号分配
     *
     * 使用指定的权限集为指定账号分配对应主体的访问权限，主体可为IAM身份中心用户或用户组。
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
     * 使用指定的权限集从指定的账号删除主体的访问权限，主体可为IAM身份中心用户或用户组。
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
     * 使用指定的权限集从指定的账号删除主体的访问权限，主体可为IAM身份中心用户或用户组。
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
     * 查询账号分配创建状态详情
     *
     * 根据请求ID，查询指定IAM身份中心实例下的账号分配创建状态详情信息。
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
     * 查询账号分配创建状态详情
     *
     * 根据请求ID，查询指定IAM身份中心实例下的账号分配创建状态详情信息。
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
     * 查询账号分配删除状态详情
     *
     * 根据请求ID，查询指定IAM身份中心实例下的账号分配删除状态详情信息。
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
     * 查询账号分配删除状态详情
     *
     * 根据请求ID，查询指定IAM身份中心实例下的账号分配删除状态详情信息。
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
     * 列出账号分配创建状态
     *
     * 查询指定IAM身份中心实例下的账号分配的创建状态列表。
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
     * 列出账号分配创建状态
     *
     * 查询指定IAM身份中心实例下的账号分配的创建状态列表。
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
     * 列出账号分配删除状态
     *
     * 查询指定IAM身份中心实例下的账号分配的删除状态列表。
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
     * 列出账号分配删除状态
     *
     * 查询指定IAM身份中心实例下的账号分配的删除状态列表。
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
     * 列出账号和权限集关联的用户或用户组
     *
     * 列出与指定账号以及指定权限集关联的用户或用户组。
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
     * 列出账号和权限集关联的用户或用户组
     *
     * 列出与指定账号以及指定权限集关联的用户或用户组。
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
     * 列出实例
     *
     * 查询IAM身份中心的实例列表。
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
     * 查询IAM身份中心的实例列表。
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
     * 启用指定实例的访问控制功能
     *
     * 启用指定实例的访问控制功能。
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
     * 启用指定实例的访问控制功能。
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
     * 禁用指定IAM身份中心实例的基于属性的访问控制（ABAC）功能，并删除已配置的所有属性映射。
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
     * 禁用指定IAM身份中心实例的基于属性的访问控制（ABAC）功能，并删除已配置的所有属性映射。
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
     * 返回已配置为与指定IAM身份中心实例的基于属性的访问控制（ABAC）一起使用的IAM身份中心身份源属性列表。
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
     * 返回已配置为与指定IAM身份中心实例的基于属性的访问控制（ABAC）一起使用的IAM身份中心身份源属性列表。
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
     * 更新可与IAM身份中心实例一起使用的IAM身份中心身份源属性，以进行基于属性的访问控制（ABAC）。
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
     * 更新可与IAM身份中心实例一起使用的IAM身份中心身份源属性，以进行基于属性的访问控制（ABAC）。
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
     * 添加系统身份策略
     *
     * 在指定的权限集中添加系统身份策略。
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
     * 在指定的权限集中添加系统身份策略。
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
     * 创建权限集
     *
     * 在指定的IAM身份中心实例中创建一个权限集。
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
     * 在指定的IAM身份中心实例中创建一个权限集。
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
     * 删除指定权限集中的自定义身份策略。
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
     * 删除指定权限集中的自定义身份策略。
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
     * 删除指定权限集中的自定义策略
     *
     * 删除指定权限集中的自定义策略
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
     * 删除指定权限集中的自定义策略
     *
     * 删除指定权限集中的自定义策略
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
     * 根据权限集ID，删除指定的权限集。
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
     * 根据权限集ID，删除指定的权限集。
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
     * 根据权限集ID，查询指定权限集的详情信息。
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
     * 根据权限集ID，查询指定权限集的详情信息。
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
     * 根据请求ID，查询权限集预分配状态的详情信息。
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
     * 根据请求ID，查询权限集预分配状态的详情信息。
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
     * 删除指定权限集中的系统身份策略。
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
     * 删除指定权限集中的系统身份策略。
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
     * 查询自定义身份策略详情
     *
     * 查询指定权限集中的自定义身份策略详情。
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
     * 查询指定权限集中的自定义身份策略详情。
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
     * 获取分配给权限集的自定义策略
     *
     * 获取分配给权限集的自定义策略
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
     * 获取分配给权限集的自定义策略
     *
     * 获取分配给权限集的自定义策略
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
     * 列出权限集关联的账号
     *
     * 查询与指定权限集关联的账号列表。
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
     * 查询与指定权限集关联的账号列表。
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
     * 获取添加到指定权限集中的系统身份策略列表。
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
     * 获取添加到指定权限集中的系统身份策略列表。
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
     * 查询指定实例中的权限集预分配状态列表。
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
     * 查询指定实例中的权限集预分配状态列表。
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
     * 查询指定实例下的权限集列表。
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
     * 查询指定实例下的权限集列表。
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
     * 列出分配给账号的权限集
     *
     * 查询分配给指定账号的权限集列表。
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
     * 列出分配给账号的权限集
     *
     * 查询分配给指定账号的权限集列表。
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
     * 将指定权限集预分配给指定账号。
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
     * 将指定权限集预分配给指定账号。
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
     * 添加自定义身份策略
     *
     * 在指定的权限集中添加自定义身份策略。
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
     * 添加自定义身份策略
     *
     * 在指定的权限集中添加自定义身份策略。
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
     * 将自定义策略附加到权限集
     *
     * 将自定义策略附加到权限集
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
     * 将自定义策略附加到权限集
     *
     * 将自定义策略附加到权限集
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
     * 根据权限集ID，更新指定权限集的属性。
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
     * 根据权限集ID，更新指定权限集的属性。
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
     * 给指定的资源添加一个或多个标签。当前支持为权限集添加标签。
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
     * 给指定的资源添加一个或多个标签。当前支持为权限集添加标签。
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
     * 删除指定资源的指定标签
     *
     * 从指定资源中删除指定的标签。
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
     * 删除指定资源的指定标签
     *
     * 从指定资源中删除指定的标签。
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
     * 列出绑定到指定资源的标签。当前支持为权限集添加标签。
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
     * 列出绑定到指定资源的标签。当前支持为权限集添加标签。
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

    /**
     * 添加系统策略
     *
     * 在指定的权限集中添加系统策略。
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
     * 在指定的权限集中添加系统策略。
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
     * 删除系统策略
     *
     * 删除指定权限集中的系统策略。
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
     * 删除指定权限集中的系统策略。
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
     * 列出系统策略
     *
     * 获取添加到指定权限集中的系统策略列表。
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
     * 获取添加到指定权限集中的系统策略列表。
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

}
