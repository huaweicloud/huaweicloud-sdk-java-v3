package com.huaweicloud.sdk.iam.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.iam.v5.model.AddUserToGroupV5Request;
import com.huaweicloud.sdk.iam.v5.model.AddUserToGroupV5Response;
import com.huaweicloud.sdk.iam.v5.model.AttachAgencyPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.AttachAgencyPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.AttachGroupPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.AttachGroupPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.AttachUserPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.AttachUserPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.ChangePasswordV5Request;
import com.huaweicloud.sdk.iam.v5.model.ChangePasswordV5Response;
import com.huaweicloud.sdk.iam.v5.model.CreateAccessKeyV5Request;
import com.huaweicloud.sdk.iam.v5.model.CreateAccessKeyV5Response;
import com.huaweicloud.sdk.iam.v5.model.CreateAgencyV5Request;
import com.huaweicloud.sdk.iam.v5.model.CreateAgencyV5Response;
import com.huaweicloud.sdk.iam.v5.model.CreateGroupV5Request;
import com.huaweicloud.sdk.iam.v5.model.CreateGroupV5Response;
import com.huaweicloud.sdk.iam.v5.model.CreateLoginProfileV5Request;
import com.huaweicloud.sdk.iam.v5.model.CreateLoginProfileV5Response;
import com.huaweicloud.sdk.iam.v5.model.CreatePolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.CreatePolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.CreatePolicyVersionV5Request;
import com.huaweicloud.sdk.iam.v5.model.CreatePolicyVersionV5Response;
import com.huaweicloud.sdk.iam.v5.model.CreateServiceLinkedAgencyV5Request;
import com.huaweicloud.sdk.iam.v5.model.CreateServiceLinkedAgencyV5Response;
import com.huaweicloud.sdk.iam.v5.model.CreateUserV5Request;
import com.huaweicloud.sdk.iam.v5.model.CreateUserV5Response;
import com.huaweicloud.sdk.iam.v5.model.CreateVirtualMfaDeviceV5Request;
import com.huaweicloud.sdk.iam.v5.model.CreateVirtualMfaDeviceV5Response;
import com.huaweicloud.sdk.iam.v5.model.DeleteAccessKeyV5Request;
import com.huaweicloud.sdk.iam.v5.model.DeleteAccessKeyV5Response;
import com.huaweicloud.sdk.iam.v5.model.DeleteAgencyV5Request;
import com.huaweicloud.sdk.iam.v5.model.DeleteAgencyV5Response;
import com.huaweicloud.sdk.iam.v5.model.DeleteGroupV5Request;
import com.huaweicloud.sdk.iam.v5.model.DeleteGroupV5Response;
import com.huaweicloud.sdk.iam.v5.model.DeleteLoginProfileV5Request;
import com.huaweicloud.sdk.iam.v5.model.DeleteLoginProfileV5Response;
import com.huaweicloud.sdk.iam.v5.model.DeletePolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.DeletePolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.DeletePolicyVersionV5Request;
import com.huaweicloud.sdk.iam.v5.model.DeletePolicyVersionV5Response;
import com.huaweicloud.sdk.iam.v5.model.DeleteResourceTagsV5Request;
import com.huaweicloud.sdk.iam.v5.model.DeleteResourceTagsV5Response;
import com.huaweicloud.sdk.iam.v5.model.DeleteServiceLinkedAgencyV5Request;
import com.huaweicloud.sdk.iam.v5.model.DeleteServiceLinkedAgencyV5Response;
import com.huaweicloud.sdk.iam.v5.model.DeleteUserV5Request;
import com.huaweicloud.sdk.iam.v5.model.DeleteUserV5Response;
import com.huaweicloud.sdk.iam.v5.model.DeleteVirtualMfaDeviceV5Request;
import com.huaweicloud.sdk.iam.v5.model.DeleteVirtualMfaDeviceV5Response;
import com.huaweicloud.sdk.iam.v5.model.DetachAgencyPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.DetachAgencyPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.DetachGroupPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.DetachGroupPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.DetachUserPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.DetachUserPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.DisableMfaDeviceV5Request;
import com.huaweicloud.sdk.iam.v5.model.DisableMfaDeviceV5Response;
import com.huaweicloud.sdk.iam.v5.model.EnableMfaDeviceV5Request;
import com.huaweicloud.sdk.iam.v5.model.EnableMfaDeviceV5Response;
import com.huaweicloud.sdk.iam.v5.model.GetAccountSummaryV5Request;
import com.huaweicloud.sdk.iam.v5.model.GetAccountSummaryV5Response;
import com.huaweicloud.sdk.iam.v5.model.GetAgencyV5Request;
import com.huaweicloud.sdk.iam.v5.model.GetAgencyV5Response;
import com.huaweicloud.sdk.iam.v5.model.GetAsymmetricSignatureSwitchV5Request;
import com.huaweicloud.sdk.iam.v5.model.GetAsymmetricSignatureSwitchV5Response;
import com.huaweicloud.sdk.iam.v5.model.GetAuthorizationSchemaV5Request;
import com.huaweicloud.sdk.iam.v5.model.GetAuthorizationSchemaV5Response;
import com.huaweicloud.sdk.iam.v5.model.GetFeatureStatusV5Request;
import com.huaweicloud.sdk.iam.v5.model.GetFeatureStatusV5Response;
import com.huaweicloud.sdk.iam.v5.model.GetPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.GetPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.GetPolicyVersionV5Request;
import com.huaweicloud.sdk.iam.v5.model.GetPolicyVersionV5Response;
import com.huaweicloud.sdk.iam.v5.model.GetServiceLinkedAgencyDeletionStatusV5Request;
import com.huaweicloud.sdk.iam.v5.model.GetServiceLinkedAgencyDeletionStatusV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListAccessKeysV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListAccessKeysV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListAgenciesV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListAgenciesV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListAttachedAgencyPoliciesV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListAttachedAgencyPoliciesV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListAttachedGroupPoliciesV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListAttachedGroupPoliciesV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListAttachedUserPoliciesV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListAttachedUserPoliciesV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListEntitiesForPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListEntitiesForPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListGroupsV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListGroupsV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListMfaDevicesV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListMfaDevicesV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListPoliciesV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListPoliciesV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListPolicyVersionsV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListPolicyVersionsV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListRegisteredServicesForAuthSchemaV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListRegisteredServicesForAuthSchemaV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListResourceTagsV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListResourceTagsV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListServicePrincipalsV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListServicePrincipalsV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListUsersV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListUsersV5Response;
import com.huaweicloud.sdk.iam.v5.model.RemoveUserFromGroupV5Request;
import com.huaweicloud.sdk.iam.v5.model.RemoveUserFromGroupV5Response;
import com.huaweicloud.sdk.iam.v5.model.SetAsymmetricSignatureSwitchV5Request;
import com.huaweicloud.sdk.iam.v5.model.SetAsymmetricSignatureSwitchV5Response;
import com.huaweicloud.sdk.iam.v5.model.SetDefaultPolicyVersionV5Request;
import com.huaweicloud.sdk.iam.v5.model.SetDefaultPolicyVersionV5Response;
import com.huaweicloud.sdk.iam.v5.model.ShowAccessKeyLastUsedV5Request;
import com.huaweicloud.sdk.iam.v5.model.ShowAccessKeyLastUsedV5Response;
import com.huaweicloud.sdk.iam.v5.model.ShowGroupV5Request;
import com.huaweicloud.sdk.iam.v5.model.ShowGroupV5Response;
import com.huaweicloud.sdk.iam.v5.model.ShowLoginPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.ShowLoginPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.ShowLoginProfileV5Request;
import com.huaweicloud.sdk.iam.v5.model.ShowLoginProfileV5Response;
import com.huaweicloud.sdk.iam.v5.model.ShowPasswordPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.ShowPasswordPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.ShowUserLastLoginV5Request;
import com.huaweicloud.sdk.iam.v5.model.ShowUserLastLoginV5Response;
import com.huaweicloud.sdk.iam.v5.model.ShowUserV5Request;
import com.huaweicloud.sdk.iam.v5.model.ShowUserV5Response;
import com.huaweicloud.sdk.iam.v5.model.TagResourceV5Request;
import com.huaweicloud.sdk.iam.v5.model.TagResourceV5Response;
import com.huaweicloud.sdk.iam.v5.model.UpdateAccessKeyV5Request;
import com.huaweicloud.sdk.iam.v5.model.UpdateAccessKeyV5Response;
import com.huaweicloud.sdk.iam.v5.model.UpdateAgencyV5Request;
import com.huaweicloud.sdk.iam.v5.model.UpdateAgencyV5Response;
import com.huaweicloud.sdk.iam.v5.model.UpdateGroupV5Request;
import com.huaweicloud.sdk.iam.v5.model.UpdateGroupV5Response;
import com.huaweicloud.sdk.iam.v5.model.UpdateLoginPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.UpdateLoginPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.UpdateLoginProfileV5Request;
import com.huaweicloud.sdk.iam.v5.model.UpdateLoginProfileV5Response;
import com.huaweicloud.sdk.iam.v5.model.UpdatePasswordPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.UpdatePasswordPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.UpdateTrustPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.UpdateTrustPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.UpdateUserV5Request;
import com.huaweicloud.sdk.iam.v5.model.UpdateUserV5Response;

import java.util.concurrent.CompletableFuture;

public class IamAsyncClient {

    protected HcClient hcClient;

    public IamAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IamAsyncClient> newBuilder() {
        ClientBuilder<IamAsyncClient> clientBuilder =
            new ClientBuilder<>(IamAsyncClient::new, "GlobalCredentials,BasicCredentials,IAMCredentials");
        return clientBuilder;
    }

    /**
     * 获取此账号中IAM实体使用情况和IAM配额的摘要信息
     *
     * 该接口可以用于获取此账号中IAM实体使用情况和IAM配额的摘要信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAccountSummaryV5Request 请求对象
     * @return CompletableFuture<GetAccountSummaryV5Response>
     */
    public CompletableFuture<GetAccountSummaryV5Response> getAccountSummaryV5Async(GetAccountSummaryV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.getAccountSummaryV5);
    }

    /**
     * 获取此账号中IAM实体使用情况和IAM配额的摘要信息
     *
     * 该接口可以用于获取此账号中IAM实体使用情况和IAM配额的摘要信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAccountSummaryV5Request 请求对象
     * @return AsyncInvoker<GetAccountSummaryV5Request, GetAccountSummaryV5Response>
     */
    public AsyncInvoker<GetAccountSummaryV5Request, GetAccountSummaryV5Response> getAccountSummaryV5AsyncInvoker(
        GetAccountSummaryV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.getAccountSummaryV5, hcClient);
    }

    /**
     * 获取账号非对称签名开关状态
     *
     * 该接口用于获取账号非对称签名开关的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAsymmetricSignatureSwitchV5Request 请求对象
     * @return CompletableFuture<GetAsymmetricSignatureSwitchV5Response>
     */
    public CompletableFuture<GetAsymmetricSignatureSwitchV5Response> getAsymmetricSignatureSwitchV5Async(
        GetAsymmetricSignatureSwitchV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.getAsymmetricSignatureSwitchV5);
    }

    /**
     * 获取账号非对称签名开关状态
     *
     * 该接口用于获取账号非对称签名开关的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAsymmetricSignatureSwitchV5Request 请求对象
     * @return AsyncInvoker<GetAsymmetricSignatureSwitchV5Request, GetAsymmetricSignatureSwitchV5Response>
     */
    public AsyncInvoker<GetAsymmetricSignatureSwitchV5Request, GetAsymmetricSignatureSwitchV5Response> getAsymmetricSignatureSwitchV5AsyncInvoker(
        GetAsymmetricSignatureSwitchV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.getAsymmetricSignatureSwitchV5, hcClient);
    }

    /**
     * 获取此账号的功能状态
     *
     * 该接口可以用于获取此账号的功能状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetFeatureStatusV5Request 请求对象
     * @return CompletableFuture<GetFeatureStatusV5Response>
     */
    public CompletableFuture<GetFeatureStatusV5Response> getFeatureStatusV5Async(GetFeatureStatusV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.getFeatureStatusV5);
    }

    /**
     * 获取此账号的功能状态
     *
     * 该接口可以用于获取此账号的功能状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetFeatureStatusV5Request 请求对象
     * @return AsyncInvoker<GetFeatureStatusV5Request, GetFeatureStatusV5Response>
     */
    public AsyncInvoker<GetFeatureStatusV5Request, GetFeatureStatusV5Response> getFeatureStatusV5AsyncInvoker(
        GetFeatureStatusV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.getFeatureStatusV5, hcClient);
    }

    /**
     * 设置账号开启或关闭非对称签名
     *
     * 该接口用于设置账号开启或关闭非对称签名功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAsymmetricSignatureSwitchV5Request 请求对象
     * @return CompletableFuture<SetAsymmetricSignatureSwitchV5Response>
     */
    public CompletableFuture<SetAsymmetricSignatureSwitchV5Response> setAsymmetricSignatureSwitchV5Async(
        SetAsymmetricSignatureSwitchV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.setAsymmetricSignatureSwitchV5);
    }

    /**
     * 设置账号开启或关闭非对称签名
     *
     * 该接口用于设置账号开启或关闭非对称签名功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAsymmetricSignatureSwitchV5Request 请求对象
     * @return AsyncInvoker<SetAsymmetricSignatureSwitchV5Request, SetAsymmetricSignatureSwitchV5Response>
     */
    public AsyncInvoker<SetAsymmetricSignatureSwitchV5Request, SetAsymmetricSignatureSwitchV5Response> setAsymmetricSignatureSwitchV5AsyncInvoker(
        SetAsymmetricSignatureSwitchV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.setAsymmetricSignatureSwitchV5, hcClient);
    }

    /**
     * 创建信任委托
     *
     * 该接口可以用于创建信任委托。
     * 
     * &gt; 信任委托只能授予身份策略且仅兼容支持身份策略的云服务，详情见[[支持身份策略与信任委托的云服务列表](https://support.huaweicloud.com/productdesc-iam/iam_01_1224.html)](tag:hws)[[支持身份策略与信任委托的云服务列表](https://support.huaweicloud.com/intl/zh-cn/productdesc-iam/iam_01_1224.html)](tag:hws_hk)[[支持身份策略与信任委托的云服务列表](https://support.huaweicloud.com/eu/productdesc-iam/iam_01_1224.html)](tag:hws_eu)[《统一身份认证用户指南》的“支持身份策略与信任委托的云服务列表”章节](tag:fcs,fcs_vm,ctc,hws_test,g42,tm)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgencyV5Request 请求对象
     * @return CompletableFuture<CreateAgencyV5Response>
     */
    public CompletableFuture<CreateAgencyV5Response> createAgencyV5Async(CreateAgencyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createAgencyV5);
    }

    /**
     * 创建信任委托
     *
     * 该接口可以用于创建信任委托。
     * 
     * &gt; 信任委托只能授予身份策略且仅兼容支持身份策略的云服务，详情见[[支持身份策略与信任委托的云服务列表](https://support.huaweicloud.com/productdesc-iam/iam_01_1224.html)](tag:hws)[[支持身份策略与信任委托的云服务列表](https://support.huaweicloud.com/intl/zh-cn/productdesc-iam/iam_01_1224.html)](tag:hws_hk)[[支持身份策略与信任委托的云服务列表](https://support.huaweicloud.com/eu/productdesc-iam/iam_01_1224.html)](tag:hws_eu)[《统一身份认证用户指南》的“支持身份策略与信任委托的云服务列表”章节](tag:fcs,fcs_vm,ctc,hws_test,g42,tm)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgencyV5Request 请求对象
     * @return AsyncInvoker<CreateAgencyV5Request, CreateAgencyV5Response>
     */
    public AsyncInvoker<CreateAgencyV5Request, CreateAgencyV5Response> createAgencyV5AsyncInvoker(
        CreateAgencyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.createAgencyV5, hcClient);
    }

    /**
     * 创建服务关联委托
     *
     * 该接口可以用于创建服务关联委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceLinkedAgencyV5Request 请求对象
     * @return CompletableFuture<CreateServiceLinkedAgencyV5Response>
     */
    public CompletableFuture<CreateServiceLinkedAgencyV5Response> createServiceLinkedAgencyV5Async(
        CreateServiceLinkedAgencyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createServiceLinkedAgencyV5);
    }

    /**
     * 创建服务关联委托
     *
     * 该接口可以用于创建服务关联委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceLinkedAgencyV5Request 请求对象
     * @return AsyncInvoker<CreateServiceLinkedAgencyV5Request, CreateServiceLinkedAgencyV5Response>
     */
    public AsyncInvoker<CreateServiceLinkedAgencyV5Request, CreateServiceLinkedAgencyV5Response> createServiceLinkedAgencyV5AsyncInvoker(
        CreateServiceLinkedAgencyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.createServiceLinkedAgencyV5, hcClient);
    }

    /**
     * 删除信任委托
     *
     * 该接口可以用于删除信任委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgencyV5Request 请求对象
     * @return CompletableFuture<DeleteAgencyV5Response>
     */
    public CompletableFuture<DeleteAgencyV5Response> deleteAgencyV5Async(DeleteAgencyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deleteAgencyV5);
    }

    /**
     * 删除信任委托
     *
     * 该接口可以用于删除信任委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgencyV5Request 请求对象
     * @return AsyncInvoker<DeleteAgencyV5Request, DeleteAgencyV5Response>
     */
    public AsyncInvoker<DeleteAgencyV5Request, DeleteAgencyV5Response> deleteAgencyV5AsyncInvoker(
        DeleteAgencyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.deleteAgencyV5, hcClient);
    }

    /**
     * 删除服务关联委托
     *
     * 该接口可以用于服务关联委托删除自己。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceLinkedAgencyV5Request 请求对象
     * @return CompletableFuture<DeleteServiceLinkedAgencyV5Response>
     */
    public CompletableFuture<DeleteServiceLinkedAgencyV5Response> deleteServiceLinkedAgencyV5Async(
        DeleteServiceLinkedAgencyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deleteServiceLinkedAgencyV5);
    }

    /**
     * 删除服务关联委托
     *
     * 该接口可以用于服务关联委托删除自己。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceLinkedAgencyV5Request 请求对象
     * @return AsyncInvoker<DeleteServiceLinkedAgencyV5Request, DeleteServiceLinkedAgencyV5Response>
     */
    public AsyncInvoker<DeleteServiceLinkedAgencyV5Request, DeleteServiceLinkedAgencyV5Response> deleteServiceLinkedAgencyV5AsyncInvoker(
        DeleteServiceLinkedAgencyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.deleteServiceLinkedAgencyV5, hcClient);
    }

    /**
     * 查询委托或信任委托详情
     *
     * 该接口可以用于查询委托或信任委托详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAgencyV5Request 请求对象
     * @return CompletableFuture<GetAgencyV5Response>
     */
    public CompletableFuture<GetAgencyV5Response> getAgencyV5Async(GetAgencyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.getAgencyV5);
    }

    /**
     * 查询委托或信任委托详情
     *
     * 该接口可以用于查询委托或信任委托详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAgencyV5Request 请求对象
     * @return AsyncInvoker<GetAgencyV5Request, GetAgencyV5Response>
     */
    public AsyncInvoker<GetAgencyV5Request, GetAgencyV5Response> getAgencyV5AsyncInvoker(GetAgencyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.getAgencyV5, hcClient);
    }

    /**
     * 获取服务关联委托删除状态
     *
     * 该接口可以用于获取服务关联委托删除状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetServiceLinkedAgencyDeletionStatusV5Request 请求对象
     * @return CompletableFuture<GetServiceLinkedAgencyDeletionStatusV5Response>
     */
    public CompletableFuture<GetServiceLinkedAgencyDeletionStatusV5Response> getServiceLinkedAgencyDeletionStatusV5Async(
        GetServiceLinkedAgencyDeletionStatusV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.getServiceLinkedAgencyDeletionStatusV5);
    }

    /**
     * 获取服务关联委托删除状态
     *
     * 该接口可以用于获取服务关联委托删除状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetServiceLinkedAgencyDeletionStatusV5Request 请求对象
     * @return AsyncInvoker<GetServiceLinkedAgencyDeletionStatusV5Request, GetServiceLinkedAgencyDeletionStatusV5Response>
     */
    public AsyncInvoker<GetServiceLinkedAgencyDeletionStatusV5Request, GetServiceLinkedAgencyDeletionStatusV5Response> getServiceLinkedAgencyDeletionStatusV5AsyncInvoker(
        GetServiceLinkedAgencyDeletionStatusV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.getServiceLinkedAgencyDeletionStatusV5, hcClient);
    }

    /**
     * 查询指定条件下的委托及信任委托列表
     *
     * 该接口可以用于查询指定条件下的委托及信任委托列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgenciesV5Request 请求对象
     * @return CompletableFuture<ListAgenciesV5Response>
     */
    public CompletableFuture<ListAgenciesV5Response> listAgenciesV5Async(ListAgenciesV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listAgenciesV5);
    }

    /**
     * 查询指定条件下的委托及信任委托列表
     *
     * 该接口可以用于查询指定条件下的委托及信任委托列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgenciesV5Request 请求对象
     * @return AsyncInvoker<ListAgenciesV5Request, ListAgenciesV5Response>
     */
    public AsyncInvoker<ListAgenciesV5Request, ListAgenciesV5Response> listAgenciesV5AsyncInvoker(
        ListAgenciesV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.listAgenciesV5, hcClient);
    }

    /**
     * 修改信任委托
     *
     * 该接口可以用于修改信任委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgencyV5Request 请求对象
     * @return CompletableFuture<UpdateAgencyV5Response>
     */
    public CompletableFuture<UpdateAgencyV5Response> updateAgencyV5Async(UpdateAgencyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateAgencyV5);
    }

    /**
     * 修改信任委托
     *
     * 该接口可以用于修改信任委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgencyV5Request 请求对象
     * @return AsyncInvoker<UpdateAgencyV5Request, UpdateAgencyV5Response>
     */
    public AsyncInvoker<UpdateAgencyV5Request, UpdateAgencyV5Response> updateAgencyV5AsyncInvoker(
        UpdateAgencyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.updateAgencyV5, hcClient);
    }

    /**
     * 修改信任委托信任策略
     *
     * 该接口可以用于修改信任委托信任策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrustPolicyV5Request 请求对象
     * @return CompletableFuture<UpdateTrustPolicyV5Response>
     */
    public CompletableFuture<UpdateTrustPolicyV5Response> updateTrustPolicyV5Async(UpdateTrustPolicyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateTrustPolicyV5);
    }

    /**
     * 修改信任委托信任策略
     *
     * 该接口可以用于修改信任委托信任策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrustPolicyV5Request 请求对象
     * @return AsyncInvoker<UpdateTrustPolicyV5Request, UpdateTrustPolicyV5Response>
     */
    public AsyncInvoker<UpdateTrustPolicyV5Request, UpdateTrustPolicyV5Response> updateTrustPolicyV5AsyncInvoker(
        UpdateTrustPolicyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.updateTrustPolicyV5, hcClient);
    }

    /**
     * 查询指定服务授权概要
     *
     * 该接口可以用于查询指定云服务的授权概要。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAuthorizationSchemaV5Request 请求对象
     * @return CompletableFuture<GetAuthorizationSchemaV5Response>
     */
    public CompletableFuture<GetAuthorizationSchemaV5Response> getAuthorizationSchemaV5Async(
        GetAuthorizationSchemaV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.getAuthorizationSchemaV5);
    }

    /**
     * 查询指定服务授权概要
     *
     * 该接口可以用于查询指定云服务的授权概要。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAuthorizationSchemaV5Request 请求对象
     * @return AsyncInvoker<GetAuthorizationSchemaV5Request, GetAuthorizationSchemaV5Response>
     */
    public AsyncInvoker<GetAuthorizationSchemaV5Request, GetAuthorizationSchemaV5Response> getAuthorizationSchemaV5AsyncInvoker(
        GetAuthorizationSchemaV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.getAuthorizationSchemaV5, hcClient);
    }

    /**
     * 查询已注册云服务列表
     *
     * 该接口可以用于查询已注册云服务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegisteredServicesForAuthSchemaV5Request 请求对象
     * @return CompletableFuture<ListRegisteredServicesForAuthSchemaV5Response>
     */
    public CompletableFuture<ListRegisteredServicesForAuthSchemaV5Response> listRegisteredServicesForAuthSchemaV5Async(
        ListRegisteredServicesForAuthSchemaV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listRegisteredServicesForAuthSchemaV5);
    }

    /**
     * 查询已注册云服务列表
     *
     * 该接口可以用于查询已注册云服务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegisteredServicesForAuthSchemaV5Request 请求对象
     * @return AsyncInvoker<ListRegisteredServicesForAuthSchemaV5Request, ListRegisteredServicesForAuthSchemaV5Response>
     */
    public AsyncInvoker<ListRegisteredServicesForAuthSchemaV5Request, ListRegisteredServicesForAuthSchemaV5Response> listRegisteredServicesForAuthSchemaV5AsyncInvoker(
        ListRegisteredServicesForAuthSchemaV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.listRegisteredServicesForAuthSchemaV5, hcClient);
    }

    /**
     * 获取全部服务主体
     *
     * 该接口可以用于获取全部服务主体。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServicePrincipalsV5Request 请求对象
     * @return CompletableFuture<ListServicePrincipalsV5Response>
     */
    public CompletableFuture<ListServicePrincipalsV5Response> listServicePrincipalsV5Async(
        ListServicePrincipalsV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listServicePrincipalsV5);
    }

    /**
     * 获取全部服务主体
     *
     * 该接口可以用于获取全部服务主体。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServicePrincipalsV5Request 请求对象
     * @return AsyncInvoker<ListServicePrincipalsV5Request, ListServicePrincipalsV5Response>
     */
    public AsyncInvoker<ListServicePrincipalsV5Request, ListServicePrincipalsV5Response> listServicePrincipalsV5AsyncInvoker(
        ListServicePrincipalsV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.listServicePrincipalsV5, hcClient);
    }

    /**
     * 添加IAM用户到用户组
     *
     * 该接口可以用于添加IAM用户到用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddUserToGroupV5Request 请求对象
     * @return CompletableFuture<AddUserToGroupV5Response>
     */
    public CompletableFuture<AddUserToGroupV5Response> addUserToGroupV5Async(AddUserToGroupV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.addUserToGroupV5);
    }

    /**
     * 添加IAM用户到用户组
     *
     * 该接口可以用于添加IAM用户到用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddUserToGroupV5Request 请求对象
     * @return AsyncInvoker<AddUserToGroupV5Request, AddUserToGroupV5Response>
     */
    public AsyncInvoker<AddUserToGroupV5Request, AddUserToGroupV5Response> addUserToGroupV5AsyncInvoker(
        AddUserToGroupV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.addUserToGroupV5, hcClient);
    }

    /**
     * 创建用户组
     *
     * 该接口可以用于创建用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupV5Request 请求对象
     * @return CompletableFuture<CreateGroupV5Response>
     */
    public CompletableFuture<CreateGroupV5Response> createGroupV5Async(CreateGroupV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createGroupV5);
    }

    /**
     * 创建用户组
     *
     * 该接口可以用于创建用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupV5Request 请求对象
     * @return AsyncInvoker<CreateGroupV5Request, CreateGroupV5Response>
     */
    public AsyncInvoker<CreateGroupV5Request, CreateGroupV5Response> createGroupV5AsyncInvoker(
        CreateGroupV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.createGroupV5, hcClient);
    }

    /**
     * 删除用户组
     *
     * 该接口可以用于删除用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupV5Request 请求对象
     * @return CompletableFuture<DeleteGroupV5Response>
     */
    public CompletableFuture<DeleteGroupV5Response> deleteGroupV5Async(DeleteGroupV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deleteGroupV5);
    }

    /**
     * 删除用户组
     *
     * 该接口可以用于删除用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupV5Request 请求对象
     * @return AsyncInvoker<DeleteGroupV5Request, DeleteGroupV5Response>
     */
    public AsyncInvoker<DeleteGroupV5Request, DeleteGroupV5Response> deleteGroupV5AsyncInvoker(
        DeleteGroupV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.deleteGroupV5, hcClient);
    }

    /**
     * 查询用户组列表
     *
     * 该接口可以用于查询用户组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupsV5Request 请求对象
     * @return CompletableFuture<ListGroupsV5Response>
     */
    public CompletableFuture<ListGroupsV5Response> listGroupsV5Async(ListGroupsV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listGroupsV5);
    }

    /**
     * 查询用户组列表
     *
     * 该接口可以用于查询用户组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupsV5Request 请求对象
     * @return AsyncInvoker<ListGroupsV5Request, ListGroupsV5Response>
     */
    public AsyncInvoker<ListGroupsV5Request, ListGroupsV5Response> listGroupsV5AsyncInvoker(
        ListGroupsV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.listGroupsV5, hcClient);
    }

    /**
     * 移除用户组中的IAM用户
     *
     * 该接口可以用于移除用户组中的IAM用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveUserFromGroupV5Request 请求对象
     * @return CompletableFuture<RemoveUserFromGroupV5Response>
     */
    public CompletableFuture<RemoveUserFromGroupV5Response> removeUserFromGroupV5Async(
        RemoveUserFromGroupV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.removeUserFromGroupV5);
    }

    /**
     * 移除用户组中的IAM用户
     *
     * 该接口可以用于移除用户组中的IAM用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveUserFromGroupV5Request 请求对象
     * @return AsyncInvoker<RemoveUserFromGroupV5Request, RemoveUserFromGroupV5Response>
     */
    public AsyncInvoker<RemoveUserFromGroupV5Request, RemoveUserFromGroupV5Response> removeUserFromGroupV5AsyncInvoker(
        RemoveUserFromGroupV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.removeUserFromGroupV5, hcClient);
    }

    /**
     * 查询用户组详情
     *
     * 该接口可以用于查询用户组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupV5Request 请求对象
     * @return CompletableFuture<ShowGroupV5Response>
     */
    public CompletableFuture<ShowGroupV5Response> showGroupV5Async(ShowGroupV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showGroupV5);
    }

    /**
     * 查询用户组详情
     *
     * 该接口可以用于查询用户组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupV5Request 请求对象
     * @return AsyncInvoker<ShowGroupV5Request, ShowGroupV5Response>
     */
    public AsyncInvoker<ShowGroupV5Request, ShowGroupV5Response> showGroupV5AsyncInvoker(ShowGroupV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.showGroupV5, hcClient);
    }

    /**
     * 修改用户组
     *
     * 该接口可以用于修改用户组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupV5Request 请求对象
     * @return CompletableFuture<UpdateGroupV5Response>
     */
    public CompletableFuture<UpdateGroupV5Response> updateGroupV5Async(UpdateGroupV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateGroupV5);
    }

    /**
     * 修改用户组
     *
     * 该接口可以用于修改用户组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupV5Request 请求对象
     * @return AsyncInvoker<UpdateGroupV5Request, UpdateGroupV5Response>
     */
    public AsyncInvoker<UpdateGroupV5Request, UpdateGroupV5Response> updateGroupV5AsyncInvoker(
        UpdateGroupV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.updateGroupV5, hcClient);
    }

    /**
     * 创建MFA设备
     *
     * 该接口可以用于创建MFA设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVirtualMfaDeviceV5Request 请求对象
     * @return CompletableFuture<CreateVirtualMfaDeviceV5Response>
     */
    public CompletableFuture<CreateVirtualMfaDeviceV5Response> createVirtualMfaDeviceV5Async(
        CreateVirtualMfaDeviceV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createVirtualMfaDeviceV5);
    }

    /**
     * 创建MFA设备
     *
     * 该接口可以用于创建MFA设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVirtualMfaDeviceV5Request 请求对象
     * @return AsyncInvoker<CreateVirtualMfaDeviceV5Request, CreateVirtualMfaDeviceV5Response>
     */
    public AsyncInvoker<CreateVirtualMfaDeviceV5Request, CreateVirtualMfaDeviceV5Response> createVirtualMfaDeviceV5AsyncInvoker(
        CreateVirtualMfaDeviceV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.createVirtualMfaDeviceV5, hcClient);
    }

    /**
     * 删除MFA设备
     *
     * 该接口可以用于删除MFA设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVirtualMfaDeviceV5Request 请求对象
     * @return CompletableFuture<DeleteVirtualMfaDeviceV5Response>
     */
    public CompletableFuture<DeleteVirtualMfaDeviceV5Response> deleteVirtualMfaDeviceV5Async(
        DeleteVirtualMfaDeviceV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deleteVirtualMfaDeviceV5);
    }

    /**
     * 删除MFA设备
     *
     * 该接口可以用于删除MFA设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVirtualMfaDeviceV5Request 请求对象
     * @return AsyncInvoker<DeleteVirtualMfaDeviceV5Request, DeleteVirtualMfaDeviceV5Response>
     */
    public AsyncInvoker<DeleteVirtualMfaDeviceV5Request, DeleteVirtualMfaDeviceV5Response> deleteVirtualMfaDeviceV5AsyncInvoker(
        DeleteVirtualMfaDeviceV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.deleteVirtualMfaDeviceV5, hcClient);
    }

    /**
     * 禁用MFA设备
     *
     * 该接口可以用于禁用指定的MFA设备并删除其与对应IAM用户的关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableMfaDeviceV5Request 请求对象
     * @return CompletableFuture<DisableMfaDeviceV5Response>
     */
    public CompletableFuture<DisableMfaDeviceV5Response> disableMfaDeviceV5Async(DisableMfaDeviceV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.disableMfaDeviceV5);
    }

    /**
     * 禁用MFA设备
     *
     * 该接口可以用于禁用指定的MFA设备并删除其与对应IAM用户的关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableMfaDeviceV5Request 请求对象
     * @return AsyncInvoker<DisableMfaDeviceV5Request, DisableMfaDeviceV5Response>
     */
    public AsyncInvoker<DisableMfaDeviceV5Request, DisableMfaDeviceV5Response> disableMfaDeviceV5AsyncInvoker(
        DisableMfaDeviceV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.disableMfaDeviceV5, hcClient);
    }

    /**
     * 启用MFA设备
     *
     * 该接口可以用于启用指定的MFA设备并将其与指定的IAM用户关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableMfaDeviceV5Request 请求对象
     * @return CompletableFuture<EnableMfaDeviceV5Response>
     */
    public CompletableFuture<EnableMfaDeviceV5Response> enableMfaDeviceV5Async(EnableMfaDeviceV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.enableMfaDeviceV5);
    }

    /**
     * 启用MFA设备
     *
     * 该接口可以用于启用指定的MFA设备并将其与指定的IAM用户关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableMfaDeviceV5Request 请求对象
     * @return AsyncInvoker<EnableMfaDeviceV5Request, EnableMfaDeviceV5Response>
     */
    public AsyncInvoker<EnableMfaDeviceV5Request, EnableMfaDeviceV5Response> enableMfaDeviceV5AsyncInvoker(
        EnableMfaDeviceV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.enableMfaDeviceV5, hcClient);
    }

    /**
     * 列举全部MFA设备
     *
     * 该接口可以用于列举全部MFA设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMfaDevicesV5Request 请求对象
     * @return CompletableFuture<ListMfaDevicesV5Response>
     */
    public CompletableFuture<ListMfaDevicesV5Response> listMfaDevicesV5Async(ListMfaDevicesV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listMfaDevicesV5);
    }

    /**
     * 列举全部MFA设备
     *
     * 该接口可以用于列举全部MFA设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMfaDevicesV5Request 请求对象
     * @return AsyncInvoker<ListMfaDevicesV5Request, ListMfaDevicesV5Response>
     */
    public AsyncInvoker<ListMfaDevicesV5Request, ListMfaDevicesV5Response> listMfaDevicesV5AsyncInvoker(
        ListMfaDevicesV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.listMfaDevicesV5, hcClient);
    }

    /**
     * 创建自定义身份策略
     *
     * 该接口可以用于创建一个默认版本为v1的新自定义身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyV5Request 请求对象
     * @return CompletableFuture<CreatePolicyV5Response>
     */
    public CompletableFuture<CreatePolicyV5Response> createPolicyV5Async(CreatePolicyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createPolicyV5);
    }

    /**
     * 创建自定义身份策略
     *
     * 该接口可以用于创建一个默认版本为v1的新自定义身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyV5Request 请求对象
     * @return AsyncInvoker<CreatePolicyV5Request, CreatePolicyV5Response>
     */
    public AsyncInvoker<CreatePolicyV5Request, CreatePolicyV5Response> createPolicyV5AsyncInvoker(
        CreatePolicyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.createPolicyV5, hcClient);
    }

    /**
     * 为指定身份策略创建一个新版本
     *
     * 该接口可以用于为指定身份策略创建一个新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyVersionV5Request 请求对象
     * @return CompletableFuture<CreatePolicyVersionV5Response>
     */
    public CompletableFuture<CreatePolicyVersionV5Response> createPolicyVersionV5Async(
        CreatePolicyVersionV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createPolicyVersionV5);
    }

    /**
     * 为指定身份策略创建一个新版本
     *
     * 该接口可以用于为指定身份策略创建一个新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyVersionV5Request 请求对象
     * @return AsyncInvoker<CreatePolicyVersionV5Request, CreatePolicyVersionV5Response>
     */
    public AsyncInvoker<CreatePolicyVersionV5Request, CreatePolicyVersionV5Response> createPolicyVersionV5AsyncInvoker(
        CreatePolicyVersionV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.createPolicyVersionV5, hcClient);
    }

    /**
     * 删除自定义身份策略
     *
     * 该接口可以用于删除一个存在的自定义身份策略，必须确保该自定义身份策略没有附加在任何IAM用户、用户组、委托或信任委托上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyV5Request 请求对象
     * @return CompletableFuture<DeletePolicyV5Response>
     */
    public CompletableFuture<DeletePolicyV5Response> deletePolicyV5Async(DeletePolicyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deletePolicyV5);
    }

    /**
     * 删除自定义身份策略
     *
     * 该接口可以用于删除一个存在的自定义身份策略，必须确保该自定义身份策略没有附加在任何IAM用户、用户组、委托或信任委托上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyV5Request 请求对象
     * @return AsyncInvoker<DeletePolicyV5Request, DeletePolicyV5Response>
     */
    public AsyncInvoker<DeletePolicyV5Request, DeletePolicyV5Response> deletePolicyV5AsyncInvoker(
        DeletePolicyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.deletePolicyV5, hcClient);
    }

    /**
     * 删除指定身份策略版本
     *
     * 该接口可以用于删除指定身份策略的指定版本。默认身份策略版本不能被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyVersionV5Request 请求对象
     * @return CompletableFuture<DeletePolicyVersionV5Response>
     */
    public CompletableFuture<DeletePolicyVersionV5Response> deletePolicyVersionV5Async(
        DeletePolicyVersionV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deletePolicyVersionV5);
    }

    /**
     * 删除指定身份策略版本
     *
     * 该接口可以用于删除指定身份策略的指定版本。默认身份策略版本不能被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyVersionV5Request 请求对象
     * @return AsyncInvoker<DeletePolicyVersionV5Request, DeletePolicyVersionV5Response>
     */
    public AsyncInvoker<DeletePolicyVersionV5Request, DeletePolicyVersionV5Response> deletePolicyVersionV5AsyncInvoker(
        DeletePolicyVersionV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.deletePolicyVersionV5, hcClient);
    }

    /**
     * 通过身份策略ID获取身份策略
     *
     * 该接口可以用于通过身份策略ID获取身份策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPolicyV5Request 请求对象
     * @return CompletableFuture<GetPolicyV5Response>
     */
    public CompletableFuture<GetPolicyV5Response> getPolicyV5Async(GetPolicyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.getPolicyV5);
    }

    /**
     * 通过身份策略ID获取身份策略
     *
     * 该接口可以用于通过身份策略ID获取身份策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPolicyV5Request 请求对象
     * @return AsyncInvoker<GetPolicyV5Request, GetPolicyV5Response>
     */
    public AsyncInvoker<GetPolicyV5Request, GetPolicyV5Response> getPolicyV5AsyncInvoker(GetPolicyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.getPolicyV5, hcClient);
    }

    /**
     * 查询指定身份策略版本
     *
     * 该接口可以用于查询指定身份策略的指定版本的相关信息，包括身份策略文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPolicyVersionV5Request 请求对象
     * @return CompletableFuture<GetPolicyVersionV5Response>
     */
    public CompletableFuture<GetPolicyVersionV5Response> getPolicyVersionV5Async(GetPolicyVersionV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.getPolicyVersionV5);
    }

    /**
     * 查询指定身份策略版本
     *
     * 该接口可以用于查询指定身份策略的指定版本的相关信息，包括身份策略文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPolicyVersionV5Request 请求对象
     * @return AsyncInvoker<GetPolicyVersionV5Request, GetPolicyVersionV5Response>
     */
    public AsyncInvoker<GetPolicyVersionV5Request, GetPolicyVersionV5Response> getPolicyVersionV5AsyncInvoker(
        GetPolicyVersionV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.getPolicyVersionV5, hcClient);
    }

    /**
     * 查询所有身份策略
     *
     * 该接口可以用于查询所有身份策略，包含系统预置身份策略和自定义身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoliciesV5Request 请求对象
     * @return CompletableFuture<ListPoliciesV5Response>
     */
    public CompletableFuture<ListPoliciesV5Response> listPoliciesV5Async(ListPoliciesV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listPoliciesV5);
    }

    /**
     * 查询所有身份策略
     *
     * 该接口可以用于查询所有身份策略，包含系统预置身份策略和自定义身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoliciesV5Request 请求对象
     * @return AsyncInvoker<ListPoliciesV5Request, ListPoliciesV5Response>
     */
    public AsyncInvoker<ListPoliciesV5Request, ListPoliciesV5Response> listPoliciesV5AsyncInvoker(
        ListPoliciesV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.listPoliciesV5, hcClient);
    }

    /**
     * 查询指定身份策略的所有版本
     *
     * 该接口可以用于查询指定身份策略的所有版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyVersionsV5Request 请求对象
     * @return CompletableFuture<ListPolicyVersionsV5Response>
     */
    public CompletableFuture<ListPolicyVersionsV5Response> listPolicyVersionsV5Async(
        ListPolicyVersionsV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listPolicyVersionsV5);
    }

    /**
     * 查询指定身份策略的所有版本
     *
     * 该接口可以用于查询指定身份策略的所有版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyVersionsV5Request 请求对象
     * @return AsyncInvoker<ListPolicyVersionsV5Request, ListPolicyVersionsV5Response>
     */
    public AsyncInvoker<ListPolicyVersionsV5Request, ListPolicyVersionsV5Response> listPolicyVersionsV5AsyncInvoker(
        ListPolicyVersionsV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.listPolicyVersionsV5, hcClient);
    }

    /**
     * 将指定身份策略版本设置为默认版本
     *
     * 该接口可以用于将指定身份策略的指定版本设置为默认版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDefaultPolicyVersionV5Request 请求对象
     * @return CompletableFuture<SetDefaultPolicyVersionV5Response>
     */
    public CompletableFuture<SetDefaultPolicyVersionV5Response> setDefaultPolicyVersionV5Async(
        SetDefaultPolicyVersionV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.setDefaultPolicyVersionV5);
    }

    /**
     * 将指定身份策略版本设置为默认版本
     *
     * 该接口可以用于将指定身份策略的指定版本设置为默认版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDefaultPolicyVersionV5Request 请求对象
     * @return AsyncInvoker<SetDefaultPolicyVersionV5Request, SetDefaultPolicyVersionV5Response>
     */
    public AsyncInvoker<SetDefaultPolicyVersionV5Request, SetDefaultPolicyVersionV5Response> setDefaultPolicyVersionV5AsyncInvoker(
        SetDefaultPolicyVersionV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.setDefaultPolicyVersionV5, hcClient);
    }

    /**
     * 为委托或信任委托附加身份策略
     *
     * 该接口可以用于为指定委托或信任委托附加指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachAgencyPolicyV5Request 请求对象
     * @return CompletableFuture<AttachAgencyPolicyV5Response>
     */
    public CompletableFuture<AttachAgencyPolicyV5Response> attachAgencyPolicyV5Async(
        AttachAgencyPolicyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.attachAgencyPolicyV5);
    }

    /**
     * 为委托或信任委托附加身份策略
     *
     * 该接口可以用于为指定委托或信任委托附加指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachAgencyPolicyV5Request 请求对象
     * @return AsyncInvoker<AttachAgencyPolicyV5Request, AttachAgencyPolicyV5Response>
     */
    public AsyncInvoker<AttachAgencyPolicyV5Request, AttachAgencyPolicyV5Response> attachAgencyPolicyV5AsyncInvoker(
        AttachAgencyPolicyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.attachAgencyPolicyV5, hcClient);
    }

    /**
     * 为用户组附加身份策略
     *
     * 该接口可以用于为指定用户组附加指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachGroupPolicyV5Request 请求对象
     * @return CompletableFuture<AttachGroupPolicyV5Response>
     */
    public CompletableFuture<AttachGroupPolicyV5Response> attachGroupPolicyV5Async(AttachGroupPolicyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.attachGroupPolicyV5);
    }

    /**
     * 为用户组附加身份策略
     *
     * 该接口可以用于为指定用户组附加指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachGroupPolicyV5Request 请求对象
     * @return AsyncInvoker<AttachGroupPolicyV5Request, AttachGroupPolicyV5Response>
     */
    public AsyncInvoker<AttachGroupPolicyV5Request, AttachGroupPolicyV5Response> attachGroupPolicyV5AsyncInvoker(
        AttachGroupPolicyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.attachGroupPolicyV5, hcClient);
    }

    /**
     * 为IAM用户附加身份策略
     *
     * 该接口可以用于为指定IAM用户附加指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachUserPolicyV5Request 请求对象
     * @return CompletableFuture<AttachUserPolicyV5Response>
     */
    public CompletableFuture<AttachUserPolicyV5Response> attachUserPolicyV5Async(AttachUserPolicyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.attachUserPolicyV5);
    }

    /**
     * 为IAM用户附加身份策略
     *
     * 该接口可以用于为指定IAM用户附加指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachUserPolicyV5Request 请求对象
     * @return AsyncInvoker<AttachUserPolicyV5Request, AttachUserPolicyV5Response>
     */
    public AsyncInvoker<AttachUserPolicyV5Request, AttachUserPolicyV5Response> attachUserPolicyV5AsyncInvoker(
        AttachUserPolicyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.attachUserPolicyV5, hcClient);
    }

    /**
     * 从委托或信任委托分离身份策略
     *
     * 该接口可以用于从指定委托或信任委托中分离指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachAgencyPolicyV5Request 请求对象
     * @return CompletableFuture<DetachAgencyPolicyV5Response>
     */
    public CompletableFuture<DetachAgencyPolicyV5Response> detachAgencyPolicyV5Async(
        DetachAgencyPolicyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.detachAgencyPolicyV5);
    }

    /**
     * 从委托或信任委托分离身份策略
     *
     * 该接口可以用于从指定委托或信任委托中分离指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachAgencyPolicyV5Request 请求对象
     * @return AsyncInvoker<DetachAgencyPolicyV5Request, DetachAgencyPolicyV5Response>
     */
    public AsyncInvoker<DetachAgencyPolicyV5Request, DetachAgencyPolicyV5Response> detachAgencyPolicyV5AsyncInvoker(
        DetachAgencyPolicyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.detachAgencyPolicyV5, hcClient);
    }

    /**
     * 从用户组分离身份策略
     *
     * 该接口可以用于从指定用户组分离指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachGroupPolicyV5Request 请求对象
     * @return CompletableFuture<DetachGroupPolicyV5Response>
     */
    public CompletableFuture<DetachGroupPolicyV5Response> detachGroupPolicyV5Async(DetachGroupPolicyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.detachGroupPolicyV5);
    }

    /**
     * 从用户组分离身份策略
     *
     * 该接口可以用于从指定用户组分离指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachGroupPolicyV5Request 请求对象
     * @return AsyncInvoker<DetachGroupPolicyV5Request, DetachGroupPolicyV5Response>
     */
    public AsyncInvoker<DetachGroupPolicyV5Request, DetachGroupPolicyV5Response> detachGroupPolicyV5AsyncInvoker(
        DetachGroupPolicyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.detachGroupPolicyV5, hcClient);
    }

    /**
     * 从IAM用户分离身份策略
     *
     * 该接口可以用于从指定的IAM用户分离指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachUserPolicyV5Request 请求对象
     * @return CompletableFuture<DetachUserPolicyV5Response>
     */
    public CompletableFuture<DetachUserPolicyV5Response> detachUserPolicyV5Async(DetachUserPolicyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.detachUserPolicyV5);
    }

    /**
     * 从IAM用户分离身份策略
     *
     * 该接口可以用于从指定的IAM用户分离指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachUserPolicyV5Request 请求对象
     * @return AsyncInvoker<DetachUserPolicyV5Request, DetachUserPolicyV5Response>
     */
    public AsyncInvoker<DetachUserPolicyV5Request, DetachUserPolicyV5Response> detachUserPolicyV5AsyncInvoker(
        DetachUserPolicyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.detachUserPolicyV5, hcClient);
    }

    /**
     * 查询指定委托或信任委托附加的所有身份策略
     *
     * 该接口可用于查询指定委托或信任委托附加的所有身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachedAgencyPoliciesV5Request 请求对象
     * @return CompletableFuture<ListAttachedAgencyPoliciesV5Response>
     */
    public CompletableFuture<ListAttachedAgencyPoliciesV5Response> listAttachedAgencyPoliciesV5Async(
        ListAttachedAgencyPoliciesV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listAttachedAgencyPoliciesV5);
    }

    /**
     * 查询指定委托或信任委托附加的所有身份策略
     *
     * 该接口可用于查询指定委托或信任委托附加的所有身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachedAgencyPoliciesV5Request 请求对象
     * @return AsyncInvoker<ListAttachedAgencyPoliciesV5Request, ListAttachedAgencyPoliciesV5Response>
     */
    public AsyncInvoker<ListAttachedAgencyPoliciesV5Request, ListAttachedAgencyPoliciesV5Response> listAttachedAgencyPoliciesV5AsyncInvoker(
        ListAttachedAgencyPoliciesV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.listAttachedAgencyPoliciesV5, hcClient);
    }

    /**
     * 查询指定用户组附加的所有身份策略
     *
     * 该接口可用于查询指定用户组附加的所有身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachedGroupPoliciesV5Request 请求对象
     * @return CompletableFuture<ListAttachedGroupPoliciesV5Response>
     */
    public CompletableFuture<ListAttachedGroupPoliciesV5Response> listAttachedGroupPoliciesV5Async(
        ListAttachedGroupPoliciesV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listAttachedGroupPoliciesV5);
    }

    /**
     * 查询指定用户组附加的所有身份策略
     *
     * 该接口可用于查询指定用户组附加的所有身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachedGroupPoliciesV5Request 请求对象
     * @return AsyncInvoker<ListAttachedGroupPoliciesV5Request, ListAttachedGroupPoliciesV5Response>
     */
    public AsyncInvoker<ListAttachedGroupPoliciesV5Request, ListAttachedGroupPoliciesV5Response> listAttachedGroupPoliciesV5AsyncInvoker(
        ListAttachedGroupPoliciesV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.listAttachedGroupPoliciesV5, hcClient);
    }

    /**
     * 查询指定IAM用户附加的所有身份策略
     *
     * 该接口可用于查询指定IAM用户附加的所有身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachedUserPoliciesV5Request 请求对象
     * @return CompletableFuture<ListAttachedUserPoliciesV5Response>
     */
    public CompletableFuture<ListAttachedUserPoliciesV5Response> listAttachedUserPoliciesV5Async(
        ListAttachedUserPoliciesV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listAttachedUserPoliciesV5);
    }

    /**
     * 查询指定IAM用户附加的所有身份策略
     *
     * 该接口可用于查询指定IAM用户附加的所有身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachedUserPoliciesV5Request 请求对象
     * @return AsyncInvoker<ListAttachedUserPoliciesV5Request, ListAttachedUserPoliciesV5Response>
     */
    public AsyncInvoker<ListAttachedUserPoliciesV5Request, ListAttachedUserPoliciesV5Response> listAttachedUserPoliciesV5AsyncInvoker(
        ListAttachedUserPoliciesV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.listAttachedUserPoliciesV5, hcClient);
    }

    /**
     * 查询指定身份策略附加的所有实体
     *
     * 该接口可用于查询指定身份策略附加的所有实体。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEntitiesForPolicyV5Request 请求对象
     * @return CompletableFuture<ListEntitiesForPolicyV5Response>
     */
    public CompletableFuture<ListEntitiesForPolicyV5Response> listEntitiesForPolicyV5Async(
        ListEntitiesForPolicyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listEntitiesForPolicyV5);
    }

    /**
     * 查询指定身份策略附加的所有实体
     *
     * 该接口可用于查询指定身份策略附加的所有实体。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEntitiesForPolicyV5Request 请求对象
     * @return AsyncInvoker<ListEntitiesForPolicyV5Request, ListEntitiesForPolicyV5Response>
     */
    public AsyncInvoker<ListEntitiesForPolicyV5Request, ListEntitiesForPolicyV5Response> listEntitiesForPolicyV5AsyncInvoker(
        ListEntitiesForPolicyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.listEntitiesForPolicyV5, hcClient);
    }

    /**
     * 删除指定资源的部分标签
     *
     * 该接口可以用于删除指定资源的部分标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceTagsV5Request 请求对象
     * @return CompletableFuture<DeleteResourceTagsV5Response>
     */
    public CompletableFuture<DeleteResourceTagsV5Response> deleteResourceTagsV5Async(
        DeleteResourceTagsV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deleteResourceTagsV5);
    }

    /**
     * 删除指定资源的部分标签
     *
     * 该接口可以用于删除指定资源的部分标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceTagsV5Request 请求对象
     * @return AsyncInvoker<DeleteResourceTagsV5Request, DeleteResourceTagsV5Response>
     */
    public AsyncInvoker<DeleteResourceTagsV5Request, DeleteResourceTagsV5Response> deleteResourceTagsV5AsyncInvoker(
        DeleteResourceTagsV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.deleteResourceTagsV5, hcClient);
    }

    /**
     * 获取指定资源的所有标签
     *
     * 该接口可以用于获取指定资源的所有标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsV5Request 请求对象
     * @return CompletableFuture<ListResourceTagsV5Response>
     */
    public CompletableFuture<ListResourceTagsV5Response> listResourceTagsV5Async(ListResourceTagsV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listResourceTagsV5);
    }

    /**
     * 获取指定资源的所有标签
     *
     * 该接口可以用于获取指定资源的所有标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsV5Request 请求对象
     * @return AsyncInvoker<ListResourceTagsV5Request, ListResourceTagsV5Response>
     */
    public AsyncInvoker<ListResourceTagsV5Request, ListResourceTagsV5Response> listResourceTagsV5AsyncInvoker(
        ListResourceTagsV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.listResourceTagsV5, hcClient);
    }

    /**
     * 为IAM资源打上标签
     *
     * 该接口可以用于为IAM资源打上标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagResourceV5Request 请求对象
     * @return CompletableFuture<TagResourceV5Response>
     */
    public CompletableFuture<TagResourceV5Response> tagResourceV5Async(TagResourceV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.tagResourceV5);
    }

    /**
     * 为IAM资源打上标签
     *
     * 该接口可以用于为IAM资源打上标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagResourceV5Request 请求对象
     * @return AsyncInvoker<TagResourceV5Request, TagResourceV5Response>
     */
    public AsyncInvoker<TagResourceV5Request, TagResourceV5Response> tagResourceV5AsyncInvoker(
        TagResourceV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.tagResourceV5, hcClient);
    }

    /**
     * 查询账号登录策略
     *
     * 该接口可以用于查询账号登录策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoginPolicyV5Request 请求对象
     * @return CompletableFuture<ShowLoginPolicyV5Response>
     */
    public CompletableFuture<ShowLoginPolicyV5Response> showLoginPolicyV5Async(ShowLoginPolicyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showLoginPolicyV5);
    }

    /**
     * 查询账号登录策略
     *
     * 该接口可以用于查询账号登录策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoginPolicyV5Request 请求对象
     * @return AsyncInvoker<ShowLoginPolicyV5Request, ShowLoginPolicyV5Response>
     */
    public AsyncInvoker<ShowLoginPolicyV5Request, ShowLoginPolicyV5Response> showLoginPolicyV5AsyncInvoker(
        ShowLoginPolicyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.showLoginPolicyV5, hcClient);
    }

    /**
     * 查询账号密码策略
     *
     * 该接口可以用于查询账号密码策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPasswordPolicyV5Request 请求对象
     * @return CompletableFuture<ShowPasswordPolicyV5Response>
     */
    public CompletableFuture<ShowPasswordPolicyV5Response> showPasswordPolicyV5Async(
        ShowPasswordPolicyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showPasswordPolicyV5);
    }

    /**
     * 查询账号密码策略
     *
     * 该接口可以用于查询账号密码策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPasswordPolicyV5Request 请求对象
     * @return AsyncInvoker<ShowPasswordPolicyV5Request, ShowPasswordPolicyV5Response>
     */
    public AsyncInvoker<ShowPasswordPolicyV5Request, ShowPasswordPolicyV5Response> showPasswordPolicyV5AsyncInvoker(
        ShowPasswordPolicyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.showPasswordPolicyV5, hcClient);
    }

    /**
     * 修改账号登录策略
     *
     * 该接口可以用于修改账号登录策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLoginPolicyV5Request 请求对象
     * @return CompletableFuture<UpdateLoginPolicyV5Response>
     */
    public CompletableFuture<UpdateLoginPolicyV5Response> updateLoginPolicyV5Async(UpdateLoginPolicyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateLoginPolicyV5);
    }

    /**
     * 修改账号登录策略
     *
     * 该接口可以用于修改账号登录策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLoginPolicyV5Request 请求对象
     * @return AsyncInvoker<UpdateLoginPolicyV5Request, UpdateLoginPolicyV5Response>
     */
    public AsyncInvoker<UpdateLoginPolicyV5Request, UpdateLoginPolicyV5Response> updateLoginPolicyV5AsyncInvoker(
        UpdateLoginPolicyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.updateLoginPolicyV5, hcClient);
    }

    /**
     * 修改账号密码策略
     *
     * 该接口可以用于修改账号密码策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePasswordPolicyV5Request 请求对象
     * @return CompletableFuture<UpdatePasswordPolicyV5Response>
     */
    public CompletableFuture<UpdatePasswordPolicyV5Response> updatePasswordPolicyV5Async(
        UpdatePasswordPolicyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updatePasswordPolicyV5);
    }

    /**
     * 修改账号密码策略
     *
     * 该接口可以用于修改账号密码策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePasswordPolicyV5Request 请求对象
     * @return AsyncInvoker<UpdatePasswordPolicyV5Request, UpdatePasswordPolicyV5Response>
     */
    public AsyncInvoker<UpdatePasswordPolicyV5Request, UpdatePasswordPolicyV5Response> updatePasswordPolicyV5AsyncInvoker(
        UpdatePasswordPolicyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.updatePasswordPolicyV5, hcClient);
    }

    /**
     * 创建IAM用户
     *
     * 该接口可以用于创建IAM用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserV5Request 请求对象
     * @return CompletableFuture<CreateUserV5Response>
     */
    public CompletableFuture<CreateUserV5Response> createUserV5Async(CreateUserV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createUserV5);
    }

    /**
     * 创建IAM用户
     *
     * 该接口可以用于创建IAM用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserV5Request 请求对象
     * @return AsyncInvoker<CreateUserV5Request, CreateUserV5Response>
     */
    public AsyncInvoker<CreateUserV5Request, CreateUserV5Response> createUserV5AsyncInvoker(
        CreateUserV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.createUserV5, hcClient);
    }

    /**
     * 删除IAM用户
     *
     * 该接口可以用于删除指定IAM用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserV5Request 请求对象
     * @return CompletableFuture<DeleteUserV5Response>
     */
    public CompletableFuture<DeleteUserV5Response> deleteUserV5Async(DeleteUserV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deleteUserV5);
    }

    /**
     * 删除IAM用户
     *
     * 该接口可以用于删除指定IAM用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserV5Request 请求对象
     * @return AsyncInvoker<DeleteUserV5Request, DeleteUserV5Response>
     */
    public AsyncInvoker<DeleteUserV5Request, DeleteUserV5Response> deleteUserV5AsyncInvoker(
        DeleteUserV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.deleteUserV5, hcClient);
    }

    /**
     * 查询IAM用户列表
     *
     * 该接口可以用于查询IAM用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersV5Request 请求对象
     * @return CompletableFuture<ListUsersV5Response>
     */
    public CompletableFuture<ListUsersV5Response> listUsersV5Async(ListUsersV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listUsersV5);
    }

    /**
     * 查询IAM用户列表
     *
     * 该接口可以用于查询IAM用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersV5Request 请求对象
     * @return AsyncInvoker<ListUsersV5Request, ListUsersV5Response>
     */
    public AsyncInvoker<ListUsersV5Request, ListUsersV5Response> listUsersV5AsyncInvoker(ListUsersV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.listUsersV5, hcClient);
    }

    /**
     * 查询IAM用户最后登录时间
     *
     * 该接口可以用于查询IAM用户的最后登录时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserLastLoginV5Request 请求对象
     * @return CompletableFuture<ShowUserLastLoginV5Response>
     */
    public CompletableFuture<ShowUserLastLoginV5Response> showUserLastLoginV5Async(ShowUserLastLoginV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showUserLastLoginV5);
    }

    /**
     * 查询IAM用户最后登录时间
     *
     * 该接口可以用于查询IAM用户的最后登录时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserLastLoginV5Request 请求对象
     * @return AsyncInvoker<ShowUserLastLoginV5Request, ShowUserLastLoginV5Response>
     */
    public AsyncInvoker<ShowUserLastLoginV5Request, ShowUserLastLoginV5Response> showUserLastLoginV5AsyncInvoker(
        ShowUserLastLoginV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.showUserLastLoginV5, hcClient);
    }

    /**
     * 查询IAM用户详情
     *
     * 该接口可以用于查询IAM用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserV5Request 请求对象
     * @return CompletableFuture<ShowUserV5Response>
     */
    public CompletableFuture<ShowUserV5Response> showUserV5Async(ShowUserV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showUserV5);
    }

    /**
     * 查询IAM用户详情
     *
     * 该接口可以用于查询IAM用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserV5Request 请求对象
     * @return AsyncInvoker<ShowUserV5Request, ShowUserV5Response>
     */
    public AsyncInvoker<ShowUserV5Request, ShowUserV5Response> showUserV5AsyncInvoker(ShowUserV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.showUserV5, hcClient);
    }

    /**
     * 修改IAM用户信息
     *
     * 该接口可以用于修改IAM用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserV5Request 请求对象
     * @return CompletableFuture<UpdateUserV5Response>
     */
    public CompletableFuture<UpdateUserV5Response> updateUserV5Async(UpdateUserV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateUserV5);
    }

    /**
     * 修改IAM用户信息
     *
     * 该接口可以用于修改IAM用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserV5Request 请求对象
     * @return AsyncInvoker<UpdateUserV5Request, UpdateUserV5Response>
     */
    public AsyncInvoker<UpdateUserV5Request, UpdateUserV5Response> updateUserV5AsyncInvoker(
        UpdateUserV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.updateUserV5, hcClient);
    }

    /**
     * 修改IAM用户密码
     *
     * 该接口可以用于IAM用户修改自己的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePasswordV5Request 请求对象
     * @return CompletableFuture<ChangePasswordV5Response>
     */
    public CompletableFuture<ChangePasswordV5Response> changePasswordV5Async(ChangePasswordV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.changePasswordV5);
    }

    /**
     * 修改IAM用户密码
     *
     * 该接口可以用于IAM用户修改自己的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePasswordV5Request 请求对象
     * @return AsyncInvoker<ChangePasswordV5Request, ChangePasswordV5Response>
     */
    public AsyncInvoker<ChangePasswordV5Request, ChangePasswordV5Response> changePasswordV5AsyncInvoker(
        ChangePasswordV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.changePasswordV5, hcClient);
    }

    /**
     * 创建永久访问密钥
     *
     * 该接口可以用于给IAM用户创建永久访问密钥。
     * 
     * 访问密钥（Access Key ID/Secret Access Key，简称AK/SK），是您通过开发工具（API、CLI、SDK）访问的身份凭证，不用于登录控制台。系统通过AK识别访问用户的身份，通过SK进行签名验证，通过加密签名验证可以确保请求的机密性、完整性和请求者身份的正确性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccessKeyV5Request 请求对象
     * @return CompletableFuture<CreateAccessKeyV5Response>
     */
    public CompletableFuture<CreateAccessKeyV5Response> createAccessKeyV5Async(CreateAccessKeyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createAccessKeyV5);
    }

    /**
     * 创建永久访问密钥
     *
     * 该接口可以用于给IAM用户创建永久访问密钥。
     * 
     * 访问密钥（Access Key ID/Secret Access Key，简称AK/SK），是您通过开发工具（API、CLI、SDK）访问的身份凭证，不用于登录控制台。系统通过AK识别访问用户的身份，通过SK进行签名验证，通过加密签名验证可以确保请求的机密性、完整性和请求者身份的正确性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccessKeyV5Request 请求对象
     * @return AsyncInvoker<CreateAccessKeyV5Request, CreateAccessKeyV5Response>
     */
    public AsyncInvoker<CreateAccessKeyV5Request, CreateAccessKeyV5Response> createAccessKeyV5AsyncInvoker(
        CreateAccessKeyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.createAccessKeyV5, hcClient);
    }

    /**
     * 创建IAM用户登录信息
     *
     * 该接口可以用于创建指定IAM用户的登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLoginProfileV5Request 请求对象
     * @return CompletableFuture<CreateLoginProfileV5Response>
     */
    public CompletableFuture<CreateLoginProfileV5Response> createLoginProfileV5Async(
        CreateLoginProfileV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createLoginProfileV5);
    }

    /**
     * 创建IAM用户登录信息
     *
     * 该接口可以用于创建指定IAM用户的登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLoginProfileV5Request 请求对象
     * @return AsyncInvoker<CreateLoginProfileV5Request, CreateLoginProfileV5Response>
     */
    public AsyncInvoker<CreateLoginProfileV5Request, CreateLoginProfileV5Response> createLoginProfileV5AsyncInvoker(
        CreateLoginProfileV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.createLoginProfileV5, hcClient);
    }

    /**
     * 删除指定永久访问密钥
     *
     * 该接口可以用于删除IAM用户的指定永久访问密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAccessKeyV5Request 请求对象
     * @return CompletableFuture<DeleteAccessKeyV5Response>
     */
    public CompletableFuture<DeleteAccessKeyV5Response> deleteAccessKeyV5Async(DeleteAccessKeyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deleteAccessKeyV5);
    }

    /**
     * 删除指定永久访问密钥
     *
     * 该接口可以用于删除IAM用户的指定永久访问密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAccessKeyV5Request 请求对象
     * @return AsyncInvoker<DeleteAccessKeyV5Request, DeleteAccessKeyV5Response>
     */
    public AsyncInvoker<DeleteAccessKeyV5Request, DeleteAccessKeyV5Response> deleteAccessKeyV5AsyncInvoker(
        DeleteAccessKeyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.deleteAccessKeyV5, hcClient);
    }

    /**
     * 删除IAM用户登录信息
     *
     * 该接口可以用于删除指定IAM用户的登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLoginProfileV5Request 请求对象
     * @return CompletableFuture<DeleteLoginProfileV5Response>
     */
    public CompletableFuture<DeleteLoginProfileV5Response> deleteLoginProfileV5Async(
        DeleteLoginProfileV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deleteLoginProfileV5);
    }

    /**
     * 删除IAM用户登录信息
     *
     * 该接口可以用于删除指定IAM用户的登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLoginProfileV5Request 请求对象
     * @return AsyncInvoker<DeleteLoginProfileV5Request, DeleteLoginProfileV5Response>
     */
    public AsyncInvoker<DeleteLoginProfileV5Request, DeleteLoginProfileV5Response> deleteLoginProfileV5AsyncInvoker(
        DeleteLoginProfileV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.deleteLoginProfileV5, hcClient);
    }

    /**
     * 查询所有永久访问密钥
     *
     * 该接口可以用于查询IAM用户的所有永久访问密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessKeysV5Request 请求对象
     * @return CompletableFuture<ListAccessKeysV5Response>
     */
    public CompletableFuture<ListAccessKeysV5Response> listAccessKeysV5Async(ListAccessKeysV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listAccessKeysV5);
    }

    /**
     * 查询所有永久访问密钥
     *
     * 该接口可以用于查询IAM用户的所有永久访问密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessKeysV5Request 请求对象
     * @return AsyncInvoker<ListAccessKeysV5Request, ListAccessKeysV5Response>
     */
    public AsyncInvoker<ListAccessKeysV5Request, ListAccessKeysV5Response> listAccessKeysV5AsyncInvoker(
        ListAccessKeysV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.listAccessKeysV5, hcClient);
    }

    /**
     * 查询指定永久访问密钥最后使用时间
     *
     * 该接口可以用于查询IAM用户的指定永久访问密钥的最后使用时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessKeyLastUsedV5Request 请求对象
     * @return CompletableFuture<ShowAccessKeyLastUsedV5Response>
     */
    public CompletableFuture<ShowAccessKeyLastUsedV5Response> showAccessKeyLastUsedV5Async(
        ShowAccessKeyLastUsedV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showAccessKeyLastUsedV5);
    }

    /**
     * 查询指定永久访问密钥最后使用时间
     *
     * 该接口可以用于查询IAM用户的指定永久访问密钥的最后使用时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessKeyLastUsedV5Request 请求对象
     * @return AsyncInvoker<ShowAccessKeyLastUsedV5Request, ShowAccessKeyLastUsedV5Response>
     */
    public AsyncInvoker<ShowAccessKeyLastUsedV5Request, ShowAccessKeyLastUsedV5Response> showAccessKeyLastUsedV5AsyncInvoker(
        ShowAccessKeyLastUsedV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.showAccessKeyLastUsedV5, hcClient);
    }

    /**
     * 查询IAM用户登录信息
     *
     * 该接口可以用于查询指定IAM用户的登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoginProfileV5Request 请求对象
     * @return CompletableFuture<ShowLoginProfileV5Response>
     */
    public CompletableFuture<ShowLoginProfileV5Response> showLoginProfileV5Async(ShowLoginProfileV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showLoginProfileV5);
    }

    /**
     * 查询IAM用户登录信息
     *
     * 该接口可以用于查询指定IAM用户的登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoginProfileV5Request 请求对象
     * @return AsyncInvoker<ShowLoginProfileV5Request, ShowLoginProfileV5Response>
     */
    public AsyncInvoker<ShowLoginProfileV5Request, ShowLoginProfileV5Response> showLoginProfileV5AsyncInvoker(
        ShowLoginProfileV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.showLoginProfileV5, hcClient);
    }

    /**
     * 修改指定永久访问密钥
     *
     * 该接口可以用于修改IAM用户的指定永久访问密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessKeyV5Request 请求对象
     * @return CompletableFuture<UpdateAccessKeyV5Response>
     */
    public CompletableFuture<UpdateAccessKeyV5Response> updateAccessKeyV5Async(UpdateAccessKeyV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateAccessKeyV5);
    }

    /**
     * 修改指定永久访问密钥
     *
     * 该接口可以用于修改IAM用户的指定永久访问密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessKeyV5Request 请求对象
     * @return AsyncInvoker<UpdateAccessKeyV5Request, UpdateAccessKeyV5Response>
     */
    public AsyncInvoker<UpdateAccessKeyV5Request, UpdateAccessKeyV5Response> updateAccessKeyV5AsyncInvoker(
        UpdateAccessKeyV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.updateAccessKeyV5, hcClient);
    }

    /**
     * 修改IAM用户登录信息
     *
     * 该接口可以用于修改指定IAM用户的登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLoginProfileV5Request 请求对象
     * @return CompletableFuture<UpdateLoginProfileV5Response>
     */
    public CompletableFuture<UpdateLoginProfileV5Response> updateLoginProfileV5Async(
        UpdateLoginProfileV5Request request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateLoginProfileV5);
    }

    /**
     * 修改IAM用户登录信息
     *
     * 该接口可以用于修改指定IAM用户的登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLoginProfileV5Request 请求对象
     * @return AsyncInvoker<UpdateLoginProfileV5Request, UpdateLoginProfileV5Response>
     */
    public AsyncInvoker<UpdateLoginProfileV5Request, UpdateLoginProfileV5Response> updateLoginProfileV5AsyncInvoker(
        UpdateLoginProfileV5Request request) {
        return new AsyncInvoker<>(request, IamMeta.updateLoginProfileV5, hcClient);
    }

}
