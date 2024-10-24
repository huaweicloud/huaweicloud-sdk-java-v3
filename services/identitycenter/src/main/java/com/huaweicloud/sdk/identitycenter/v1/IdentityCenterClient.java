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
     * 创建账号分配
     *
     * 使用指定的权限集为指定账号分配对应主体的访问权限，主体可为IAM身份中心用户或用户组。
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
     * 创建账号分配
     *
     * 使用指定的权限集为指定账号分配对应主体的访问权限，主体可为IAM身份中心用户或用户组。
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
     * 使用指定的权限集从指定的账号删除主体的访问权限，主体可为IAM身份中心用户或用户组。
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
     * 使用指定的权限集从指定的账号删除主体的访问权限，主体可为IAM身份中心用户或用户组。
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
     * 查询账号分配创建状态详情
     *
     * 根据请求ID，查询指定IAM身份中心实例下的账号分配创建状态详情信息。
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
     * 查询账号分配创建状态详情
     *
     * 根据请求ID，查询指定IAM身份中心实例下的账号分配创建状态详情信息。
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
     * 查询账号分配删除状态详情
     *
     * 根据请求ID，查询指定IAM身份中心实例下的账号分配删除状态详情信息。
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
     * 查询账号分配删除状态详情
     *
     * 根据请求ID，查询指定IAM身份中心实例下的账号分配删除状态详情信息。
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
     * 列出账号分配创建状态
     *
     * 查询指定IAM身份中心实例下的账号分配的创建状态列表。
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
     * 列出账号分配创建状态
     *
     * 查询指定IAM身份中心实例下的账号分配的创建状态列表。
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
     * 列出账号分配删除状态
     *
     * 查询指定IAM身份中心实例下的账号分配的删除状态列表。
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
     * 列出账号分配删除状态
     *
     * 查询指定IAM身份中心实例下的账号分配的删除状态列表。
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
     * 列出账号和权限集关联的用户或用户组
     *
     * 列出与指定账号以及指定权限集关联的用户或用户组。
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
     * 列出账号和权限集关联的用户或用户组
     *
     * 列出与指定账号以及指定权限集关联的用户或用户组。
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
     * 列出实例
     *
     * 查询IAM身份中心的实例列表。
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
     * 查询IAM身份中心的实例列表。
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
     * 启用指定实例的访问控制功能
     *
     * 启用指定实例的访问控制功能。
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
     * 启用指定实例的访问控制功能。
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
     * 禁用指定IAM身份中心实例的基于属性的访问控制（ABAC）功能，并删除已配置的所有属性映射。
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
     * 禁用指定IAM身份中心实例的基于属性的访问控制（ABAC）功能，并删除已配置的所有属性映射。
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
     * 返回已配置为与指定IAM身份中心实例的基于属性的访问控制（ABAC）一起使用的IAM身份中心身份源属性列表。
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
     * 返回已配置为与指定IAM身份中心实例的基于属性的访问控制（ABAC）一起使用的IAM身份中心身份源属性列表。
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
     * 更新可与IAM身份中心实例一起使用的IAM身份中心身份源属性，以进行基于属性的访问控制（ABAC）。
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
     * 更新可与IAM身份中心实例一起使用的IAM身份中心身份源属性，以进行基于属性的访问控制（ABAC）。
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
     * 添加系统身份策略
     *
     * 在指定的权限集中添加系统身份策略。
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
     * 在指定的权限集中添加系统身份策略。
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
     * 创建权限集
     *
     * 在指定的IAM身份中心实例中创建一个权限集。
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
     * 在指定的IAM身份中心实例中创建一个权限集。
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
     * 删除指定权限集中的自定义身份策略。
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
     * 删除指定权限集中的自定义身份策略。
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
     * 删除指定权限集中的自定义策略
     *
     * 删除指定权限集中的自定义策略
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
     * 删除指定权限集中的自定义策略
     *
     * 删除指定权限集中的自定义策略
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
     * 根据权限集ID，删除指定的权限集。
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
     * 根据权限集ID，删除指定的权限集。
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
     * 根据权限集ID，查询指定权限集的详情信息。
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
     * 根据权限集ID，查询指定权限集的详情信息。
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
     * 根据请求ID，查询权限集预分配状态的详情信息。
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
     * 根据请求ID，查询权限集预分配状态的详情信息。
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
     * 删除指定权限集中的系统身份策略。
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
     * 删除指定权限集中的系统身份策略。
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
     * 查询自定义身份策略详情
     *
     * 查询指定权限集中的自定义身份策略详情。
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
     * 查询指定权限集中的自定义身份策略详情。
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
     * 获取分配给权限集的自定义策略
     *
     * 获取分配给权限集的自定义策略
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
     * 获取分配给权限集的自定义策略
     *
     * 获取分配给权限集的自定义策略
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
     * 列出权限集关联的账号
     *
     * 查询与指定权限集关联的账号列表。
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
     * 查询与指定权限集关联的账号列表。
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
     * 获取添加到指定权限集中的系统身份策略列表。
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
     * 获取添加到指定权限集中的系统身份策略列表。
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
     * 列出权限集预分配状态
     *
     * 查询指定实例中的权限集预分配状态列表。
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
     * 查询指定实例中的权限集预分配状态列表。
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
     * 查询指定实例下的权限集列表。
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
     * 查询指定实例下的权限集列表。
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
     * 列出分配给账号的权限集
     *
     * 查询分配给指定账号的权限集列表。
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
     * 列出分配给账号的权限集
     *
     * 查询分配给指定账号的权限集列表。
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
     * 将指定权限集预分配给指定账号。
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
     * 将指定权限集预分配给指定账号。
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
     * 添加自定义身份策略
     *
     * 在指定的权限集中添加自定义身份策略。
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
     * 添加自定义身份策略
     *
     * 在指定的权限集中添加自定义身份策略。
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
     * 将自定义策略附加到权限集
     *
     * 将自定义策略附加到权限集
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
     * 将自定义策略附加到权限集
     *
     * 将自定义策略附加到权限集
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
     * 根据权限集ID，更新指定权限集的属性。
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
     * 根据权限集ID，更新指定权限集的属性。
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
     * 给指定的资源添加一个或多个标签。当前支持为权限集添加标签。
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
     * 给指定的资源添加一个或多个标签。当前支持为权限集添加标签。
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
     * 删除指定资源的指定标签
     *
     * 从指定资源中删除指定的标签。
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
     * 删除指定资源的指定标签
     *
     * 从指定资源中删除指定的标签。
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
     * 列出绑定到指定资源的标签。当前支持为权限集添加标签。
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
     * 列出绑定到指定资源的标签。当前支持为权限集添加标签。
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

    /**
     * 添加系统策略
     *
     * 在指定的权限集中添加系统策略。
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
     * 在指定的权限集中添加系统策略。
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
     * 删除系统策略
     *
     * 删除指定权限集中的系统策略。
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
     * 删除指定权限集中的系统策略。
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
     * 列出系统策略
     *
     * 获取添加到指定权限集中的系统策略列表。
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
     * 获取添加到指定权限集中的系统策略列表。
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

}
