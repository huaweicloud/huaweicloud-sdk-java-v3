package com.huaweicloud.sdk.iam.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
import com.huaweicloud.sdk.iam.v5.model.ShowTokenPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.ShowTokenPolicyV5Response;
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
import com.huaweicloud.sdk.iam.v5.model.UpdateTokenPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.UpdateTokenPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.UpdateTrustPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.UpdateTrustPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.UpdateUserV5Request;
import com.huaweicloud.sdk.iam.v5.model.UpdateUserV5Response;

public class IamClient {

    protected HcClient hcClient;

    public IamClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IamClient> newBuilder() {
        ClientBuilder<IamClient> clientBuilder =
            new ClientBuilder<>(IamClient::new, "GlobalCredentials,BasicCredentials,IAMCredentials");
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
     * @return GetAccountSummaryV5Response
     */
    public GetAccountSummaryV5Response getAccountSummaryV5(GetAccountSummaryV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.getAccountSummaryV5);
    }

    /**
     * 获取此账号中IAM实体使用情况和IAM配额的摘要信息
     *
     * 该接口可以用于获取此账号中IAM实体使用情况和IAM配额的摘要信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAccountSummaryV5Request 请求对象
     * @return SyncInvoker<GetAccountSummaryV5Request, GetAccountSummaryV5Response>
     */
    public SyncInvoker<GetAccountSummaryV5Request, GetAccountSummaryV5Response> getAccountSummaryV5Invoker(
        GetAccountSummaryV5Request request) {
        return new SyncInvoker<>(request, IamMeta.getAccountSummaryV5, hcClient);
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
     * @return CreateAgencyV5Response
     */
    public CreateAgencyV5Response createAgencyV5(CreateAgencyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createAgencyV5);
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
     * @return SyncInvoker<CreateAgencyV5Request, CreateAgencyV5Response>
     */
    public SyncInvoker<CreateAgencyV5Request, CreateAgencyV5Response> createAgencyV5Invoker(
        CreateAgencyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.createAgencyV5, hcClient);
    }

    /**
     * 删除信任委托
     *
     * 该接口可以用于删除信任委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgencyV5Request 请求对象
     * @return DeleteAgencyV5Response
     */
    public DeleteAgencyV5Response deleteAgencyV5(DeleteAgencyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteAgencyV5);
    }

    /**
     * 删除信任委托
     *
     * 该接口可以用于删除信任委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgencyV5Request 请求对象
     * @return SyncInvoker<DeleteAgencyV5Request, DeleteAgencyV5Response>
     */
    public SyncInvoker<DeleteAgencyV5Request, DeleteAgencyV5Response> deleteAgencyV5Invoker(
        DeleteAgencyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.deleteAgencyV5, hcClient);
    }

    /**
     * 查询委托或信任委托详情
     *
     * 该接口可以用于查询委托或信任委托详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAgencyV5Request 请求对象
     * @return GetAgencyV5Response
     */
    public GetAgencyV5Response getAgencyV5(GetAgencyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.getAgencyV5);
    }

    /**
     * 查询委托或信任委托详情
     *
     * 该接口可以用于查询委托或信任委托详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAgencyV5Request 请求对象
     * @return SyncInvoker<GetAgencyV5Request, GetAgencyV5Response>
     */
    public SyncInvoker<GetAgencyV5Request, GetAgencyV5Response> getAgencyV5Invoker(GetAgencyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.getAgencyV5, hcClient);
    }

    /**
     * 查询指定条件下的委托及信任委托列表
     *
     * 该接口可以用于查询指定条件下的委托及信任委托列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgenciesV5Request 请求对象
     * @return ListAgenciesV5Response
     */
    public ListAgenciesV5Response listAgenciesV5(ListAgenciesV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listAgenciesV5);
    }

    /**
     * 查询指定条件下的委托及信任委托列表
     *
     * 该接口可以用于查询指定条件下的委托及信任委托列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgenciesV5Request 请求对象
     * @return SyncInvoker<ListAgenciesV5Request, ListAgenciesV5Response>
     */
    public SyncInvoker<ListAgenciesV5Request, ListAgenciesV5Response> listAgenciesV5Invoker(
        ListAgenciesV5Request request) {
        return new SyncInvoker<>(request, IamMeta.listAgenciesV5, hcClient);
    }

    /**
     * 修改信任委托
     *
     * 该接口可以用于修改信任委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgencyV5Request 请求对象
     * @return UpdateAgencyV5Response
     */
    public UpdateAgencyV5Response updateAgencyV5(UpdateAgencyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateAgencyV5);
    }

    /**
     * 修改信任委托
     *
     * 该接口可以用于修改信任委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgencyV5Request 请求对象
     * @return SyncInvoker<UpdateAgencyV5Request, UpdateAgencyV5Response>
     */
    public SyncInvoker<UpdateAgencyV5Request, UpdateAgencyV5Response> updateAgencyV5Invoker(
        UpdateAgencyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.updateAgencyV5, hcClient);
    }

    /**
     * 修改信任委托信任策略
     *
     * 该接口可以用于修改信任委托信任策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrustPolicyV5Request 请求对象
     * @return UpdateTrustPolicyV5Response
     */
    public UpdateTrustPolicyV5Response updateTrustPolicyV5(UpdateTrustPolicyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateTrustPolicyV5);
    }

    /**
     * 修改信任委托信任策略
     *
     * 该接口可以用于修改信任委托信任策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrustPolicyV5Request 请求对象
     * @return SyncInvoker<UpdateTrustPolicyV5Request, UpdateTrustPolicyV5Response>
     */
    public SyncInvoker<UpdateTrustPolicyV5Request, UpdateTrustPolicyV5Response> updateTrustPolicyV5Invoker(
        UpdateTrustPolicyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.updateTrustPolicyV5, hcClient);
    }

    /**
     * 获取账号非对称签名开关状态
     *
     * 该接口用于获取账号非对称签名开关的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAsymmetricSignatureSwitchV5Request 请求对象
     * @return GetAsymmetricSignatureSwitchV5Response
     */
    public GetAsymmetricSignatureSwitchV5Response getAsymmetricSignatureSwitchV5(
        GetAsymmetricSignatureSwitchV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.getAsymmetricSignatureSwitchV5);
    }

    /**
     * 获取账号非对称签名开关状态
     *
     * 该接口用于获取账号非对称签名开关的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAsymmetricSignatureSwitchV5Request 请求对象
     * @return SyncInvoker<GetAsymmetricSignatureSwitchV5Request, GetAsymmetricSignatureSwitchV5Response>
     */
    public SyncInvoker<GetAsymmetricSignatureSwitchV5Request, GetAsymmetricSignatureSwitchV5Response> getAsymmetricSignatureSwitchV5Invoker(
        GetAsymmetricSignatureSwitchV5Request request) {
        return new SyncInvoker<>(request, IamMeta.getAsymmetricSignatureSwitchV5, hcClient);
    }

    /**
     * 设置账号开启或关闭非对称签名
     *
     * 该接口用于设置账号开启或关闭非对称签名功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAsymmetricSignatureSwitchV5Request 请求对象
     * @return SetAsymmetricSignatureSwitchV5Response
     */
    public SetAsymmetricSignatureSwitchV5Response setAsymmetricSignatureSwitchV5(
        SetAsymmetricSignatureSwitchV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.setAsymmetricSignatureSwitchV5);
    }

    /**
     * 设置账号开启或关闭非对称签名
     *
     * 该接口用于设置账号开启或关闭非对称签名功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAsymmetricSignatureSwitchV5Request 请求对象
     * @return SyncInvoker<SetAsymmetricSignatureSwitchV5Request, SetAsymmetricSignatureSwitchV5Response>
     */
    public SyncInvoker<SetAsymmetricSignatureSwitchV5Request, SetAsymmetricSignatureSwitchV5Response> setAsymmetricSignatureSwitchV5Invoker(
        SetAsymmetricSignatureSwitchV5Request request) {
        return new SyncInvoker<>(request, IamMeta.setAsymmetricSignatureSwitchV5, hcClient);
    }

    /**
     * 查询指定服务授权概要
     *
     * 该接口可以用于查询指定云服务的授权概要。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAuthorizationSchemaV5Request 请求对象
     * @return GetAuthorizationSchemaV5Response
     */
    public GetAuthorizationSchemaV5Response getAuthorizationSchemaV5(GetAuthorizationSchemaV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.getAuthorizationSchemaV5);
    }

    /**
     * 查询指定服务授权概要
     *
     * 该接口可以用于查询指定云服务的授权概要。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAuthorizationSchemaV5Request 请求对象
     * @return SyncInvoker<GetAuthorizationSchemaV5Request, GetAuthorizationSchemaV5Response>
     */
    public SyncInvoker<GetAuthorizationSchemaV5Request, GetAuthorizationSchemaV5Response> getAuthorizationSchemaV5Invoker(
        GetAuthorizationSchemaV5Request request) {
        return new SyncInvoker<>(request, IamMeta.getAuthorizationSchemaV5, hcClient);
    }

    /**
     * 查询已注册云服务列表
     *
     * 该接口可以用于查询已注册云服务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegisteredServicesForAuthSchemaV5Request 请求对象
     * @return ListRegisteredServicesForAuthSchemaV5Response
     */
    public ListRegisteredServicesForAuthSchemaV5Response listRegisteredServicesForAuthSchemaV5(
        ListRegisteredServicesForAuthSchemaV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listRegisteredServicesForAuthSchemaV5);
    }

    /**
     * 查询已注册云服务列表
     *
     * 该接口可以用于查询已注册云服务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegisteredServicesForAuthSchemaV5Request 请求对象
     * @return SyncInvoker<ListRegisteredServicesForAuthSchemaV5Request, ListRegisteredServicesForAuthSchemaV5Response>
     */
    public SyncInvoker<ListRegisteredServicesForAuthSchemaV5Request, ListRegisteredServicesForAuthSchemaV5Response> listRegisteredServicesForAuthSchemaV5Invoker(
        ListRegisteredServicesForAuthSchemaV5Request request) {
        return new SyncInvoker<>(request, IamMeta.listRegisteredServicesForAuthSchemaV5, hcClient);
    }

    /**
     * 添加IAM用户到用户组
     *
     * 该接口可以用于添加IAM用户到用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddUserToGroupV5Request 请求对象
     * @return AddUserToGroupV5Response
     */
    public AddUserToGroupV5Response addUserToGroupV5(AddUserToGroupV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.addUserToGroupV5);
    }

    /**
     * 添加IAM用户到用户组
     *
     * 该接口可以用于添加IAM用户到用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddUserToGroupV5Request 请求对象
     * @return SyncInvoker<AddUserToGroupV5Request, AddUserToGroupV5Response>
     */
    public SyncInvoker<AddUserToGroupV5Request, AddUserToGroupV5Response> addUserToGroupV5Invoker(
        AddUserToGroupV5Request request) {
        return new SyncInvoker<>(request, IamMeta.addUserToGroupV5, hcClient);
    }

    /**
     * 创建用户组
     *
     * 该接口可以用于创建用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupV5Request 请求对象
     * @return CreateGroupV5Response
     */
    public CreateGroupV5Response createGroupV5(CreateGroupV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createGroupV5);
    }

    /**
     * 创建用户组
     *
     * 该接口可以用于创建用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupV5Request 请求对象
     * @return SyncInvoker<CreateGroupV5Request, CreateGroupV5Response>
     */
    public SyncInvoker<CreateGroupV5Request, CreateGroupV5Response> createGroupV5Invoker(CreateGroupV5Request request) {
        return new SyncInvoker<>(request, IamMeta.createGroupV5, hcClient);
    }

    /**
     * 删除用户组
     *
     * 该接口可以用于删除用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupV5Request 请求对象
     * @return DeleteGroupV5Response
     */
    public DeleteGroupV5Response deleteGroupV5(DeleteGroupV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteGroupV5);
    }

    /**
     * 删除用户组
     *
     * 该接口可以用于删除用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupV5Request 请求对象
     * @return SyncInvoker<DeleteGroupV5Request, DeleteGroupV5Response>
     */
    public SyncInvoker<DeleteGroupV5Request, DeleteGroupV5Response> deleteGroupV5Invoker(DeleteGroupV5Request request) {
        return new SyncInvoker<>(request, IamMeta.deleteGroupV5, hcClient);
    }

    /**
     * 查询用户组列表
     *
     * 该接口可以用于查询用户组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupsV5Request 请求对象
     * @return ListGroupsV5Response
     */
    public ListGroupsV5Response listGroupsV5(ListGroupsV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listGroupsV5);
    }

    /**
     * 查询用户组列表
     *
     * 该接口可以用于查询用户组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupsV5Request 请求对象
     * @return SyncInvoker<ListGroupsV5Request, ListGroupsV5Response>
     */
    public SyncInvoker<ListGroupsV5Request, ListGroupsV5Response> listGroupsV5Invoker(ListGroupsV5Request request) {
        return new SyncInvoker<>(request, IamMeta.listGroupsV5, hcClient);
    }

    /**
     * 移除用户组中的IAM用户
     *
     * 该接口可以用于移除用户组中的IAM用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveUserFromGroupV5Request 请求对象
     * @return RemoveUserFromGroupV5Response
     */
    public RemoveUserFromGroupV5Response removeUserFromGroupV5(RemoveUserFromGroupV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.removeUserFromGroupV5);
    }

    /**
     * 移除用户组中的IAM用户
     *
     * 该接口可以用于移除用户组中的IAM用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveUserFromGroupV5Request 请求对象
     * @return SyncInvoker<RemoveUserFromGroupV5Request, RemoveUserFromGroupV5Response>
     */
    public SyncInvoker<RemoveUserFromGroupV5Request, RemoveUserFromGroupV5Response> removeUserFromGroupV5Invoker(
        RemoveUserFromGroupV5Request request) {
        return new SyncInvoker<>(request, IamMeta.removeUserFromGroupV5, hcClient);
    }

    /**
     * 查询用户组详情
     *
     * 该接口可以用于查询用户组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupV5Request 请求对象
     * @return ShowGroupV5Response
     */
    public ShowGroupV5Response showGroupV5(ShowGroupV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showGroupV5);
    }

    /**
     * 查询用户组详情
     *
     * 该接口可以用于查询用户组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupV5Request 请求对象
     * @return SyncInvoker<ShowGroupV5Request, ShowGroupV5Response>
     */
    public SyncInvoker<ShowGroupV5Request, ShowGroupV5Response> showGroupV5Invoker(ShowGroupV5Request request) {
        return new SyncInvoker<>(request, IamMeta.showGroupV5, hcClient);
    }

    /**
     * 修改用户组
     *
     * 该接口可以用于修改用户组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupV5Request 请求对象
     * @return UpdateGroupV5Response
     */
    public UpdateGroupV5Response updateGroupV5(UpdateGroupV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateGroupV5);
    }

    /**
     * 修改用户组
     *
     * 该接口可以用于修改用户组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupV5Request 请求对象
     * @return SyncInvoker<UpdateGroupV5Request, UpdateGroupV5Response>
     */
    public SyncInvoker<UpdateGroupV5Request, UpdateGroupV5Response> updateGroupV5Invoker(UpdateGroupV5Request request) {
        return new SyncInvoker<>(request, IamMeta.updateGroupV5, hcClient);
    }

    /**
     * 创建MFA设备
     *
     * 该接口可以用于创建MFA设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVirtualMfaDeviceV5Request 请求对象
     * @return CreateVirtualMfaDeviceV5Response
     */
    public CreateVirtualMfaDeviceV5Response createVirtualMfaDeviceV5(CreateVirtualMfaDeviceV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createVirtualMfaDeviceV5);
    }

    /**
     * 创建MFA设备
     *
     * 该接口可以用于创建MFA设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVirtualMfaDeviceV5Request 请求对象
     * @return SyncInvoker<CreateVirtualMfaDeviceV5Request, CreateVirtualMfaDeviceV5Response>
     */
    public SyncInvoker<CreateVirtualMfaDeviceV5Request, CreateVirtualMfaDeviceV5Response> createVirtualMfaDeviceV5Invoker(
        CreateVirtualMfaDeviceV5Request request) {
        return new SyncInvoker<>(request, IamMeta.createVirtualMfaDeviceV5, hcClient);
    }

    /**
     * 删除MFA设备
     *
     * 该接口可以用于删除MFA设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVirtualMfaDeviceV5Request 请求对象
     * @return DeleteVirtualMfaDeviceV5Response
     */
    public DeleteVirtualMfaDeviceV5Response deleteVirtualMfaDeviceV5(DeleteVirtualMfaDeviceV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteVirtualMfaDeviceV5);
    }

    /**
     * 删除MFA设备
     *
     * 该接口可以用于删除MFA设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVirtualMfaDeviceV5Request 请求对象
     * @return SyncInvoker<DeleteVirtualMfaDeviceV5Request, DeleteVirtualMfaDeviceV5Response>
     */
    public SyncInvoker<DeleteVirtualMfaDeviceV5Request, DeleteVirtualMfaDeviceV5Response> deleteVirtualMfaDeviceV5Invoker(
        DeleteVirtualMfaDeviceV5Request request) {
        return new SyncInvoker<>(request, IamMeta.deleteVirtualMfaDeviceV5, hcClient);
    }

    /**
     * 禁用MFA设备
     *
     * 该接口可以用于禁用指定的MFA设备并删除其与对应IAM用户的关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableMfaDeviceV5Request 请求对象
     * @return DisableMfaDeviceV5Response
     */
    public DisableMfaDeviceV5Response disableMfaDeviceV5(DisableMfaDeviceV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.disableMfaDeviceV5);
    }

    /**
     * 禁用MFA设备
     *
     * 该接口可以用于禁用指定的MFA设备并删除其与对应IAM用户的关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableMfaDeviceV5Request 请求对象
     * @return SyncInvoker<DisableMfaDeviceV5Request, DisableMfaDeviceV5Response>
     */
    public SyncInvoker<DisableMfaDeviceV5Request, DisableMfaDeviceV5Response> disableMfaDeviceV5Invoker(
        DisableMfaDeviceV5Request request) {
        return new SyncInvoker<>(request, IamMeta.disableMfaDeviceV5, hcClient);
    }

    /**
     * 启用MFA设备
     *
     * 该接口可以用于启用指定的MFA设备并将其与指定的IAM用户关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableMfaDeviceV5Request 请求对象
     * @return EnableMfaDeviceV5Response
     */
    public EnableMfaDeviceV5Response enableMfaDeviceV5(EnableMfaDeviceV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.enableMfaDeviceV5);
    }

    /**
     * 启用MFA设备
     *
     * 该接口可以用于启用指定的MFA设备并将其与指定的IAM用户关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableMfaDeviceV5Request 请求对象
     * @return SyncInvoker<EnableMfaDeviceV5Request, EnableMfaDeviceV5Response>
     */
    public SyncInvoker<EnableMfaDeviceV5Request, EnableMfaDeviceV5Response> enableMfaDeviceV5Invoker(
        EnableMfaDeviceV5Request request) {
        return new SyncInvoker<>(request, IamMeta.enableMfaDeviceV5, hcClient);
    }

    /**
     * 列举全部MFA设备
     *
     * 该接口可以用于列举全部MFA设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMfaDevicesV5Request 请求对象
     * @return ListMfaDevicesV5Response
     */
    public ListMfaDevicesV5Response listMfaDevicesV5(ListMfaDevicesV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listMfaDevicesV5);
    }

    /**
     * 列举全部MFA设备
     *
     * 该接口可以用于列举全部MFA设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMfaDevicesV5Request 请求对象
     * @return SyncInvoker<ListMfaDevicesV5Request, ListMfaDevicesV5Response>
     */
    public SyncInvoker<ListMfaDevicesV5Request, ListMfaDevicesV5Response> listMfaDevicesV5Invoker(
        ListMfaDevicesV5Request request) {
        return new SyncInvoker<>(request, IamMeta.listMfaDevicesV5, hcClient);
    }

    /**
     * 创建自定义身份策略
     *
     * 该接口可以用于创建一个默认版本为v1的新自定义身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyV5Request 请求对象
     * @return CreatePolicyV5Response
     */
    public CreatePolicyV5Response createPolicyV5(CreatePolicyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createPolicyV5);
    }

    /**
     * 创建自定义身份策略
     *
     * 该接口可以用于创建一个默认版本为v1的新自定义身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyV5Request 请求对象
     * @return SyncInvoker<CreatePolicyV5Request, CreatePolicyV5Response>
     */
    public SyncInvoker<CreatePolicyV5Request, CreatePolicyV5Response> createPolicyV5Invoker(
        CreatePolicyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.createPolicyV5, hcClient);
    }

    /**
     * 删除自定义身份策略
     *
     * 该接口可以用于删除一个存在的自定义身份策略，必须确保该自定义身份策略没有附加在任何IAM用户、用户组、委托或信任委托上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyV5Request 请求对象
     * @return DeletePolicyV5Response
     */
    public DeletePolicyV5Response deletePolicyV5(DeletePolicyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deletePolicyV5);
    }

    /**
     * 删除自定义身份策略
     *
     * 该接口可以用于删除一个存在的自定义身份策略，必须确保该自定义身份策略没有附加在任何IAM用户、用户组、委托或信任委托上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyV5Request 请求对象
     * @return SyncInvoker<DeletePolicyV5Request, DeletePolicyV5Response>
     */
    public SyncInvoker<DeletePolicyV5Request, DeletePolicyV5Response> deletePolicyV5Invoker(
        DeletePolicyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.deletePolicyV5, hcClient);
    }

    /**
     * 通过身份策略ID获取身份策略
     *
     * 该接口可以用于通过身份策略ID获取身份策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPolicyV5Request 请求对象
     * @return GetPolicyV5Response
     */
    public GetPolicyV5Response getPolicyV5(GetPolicyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.getPolicyV5);
    }

    /**
     * 通过身份策略ID获取身份策略
     *
     * 该接口可以用于通过身份策略ID获取身份策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPolicyV5Request 请求对象
     * @return SyncInvoker<GetPolicyV5Request, GetPolicyV5Response>
     */
    public SyncInvoker<GetPolicyV5Request, GetPolicyV5Response> getPolicyV5Invoker(GetPolicyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.getPolicyV5, hcClient);
    }

    /**
     * 查询所有身份策略
     *
     * 该接口可以用于查询所有身份策略，包含系统预置身份策略和自定义身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoliciesV5Request 请求对象
     * @return ListPoliciesV5Response
     */
    public ListPoliciesV5Response listPoliciesV5(ListPoliciesV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listPoliciesV5);
    }

    /**
     * 查询所有身份策略
     *
     * 该接口可以用于查询所有身份策略，包含系统预置身份策略和自定义身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoliciesV5Request 请求对象
     * @return SyncInvoker<ListPoliciesV5Request, ListPoliciesV5Response>
     */
    public SyncInvoker<ListPoliciesV5Request, ListPoliciesV5Response> listPoliciesV5Invoker(
        ListPoliciesV5Request request) {
        return new SyncInvoker<>(request, IamMeta.listPoliciesV5, hcClient);
    }

    /**
     * 为委托或信任委托附加身份策略
     *
     * 该接口可以用于为指定委托或信任委托附加指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachAgencyPolicyV5Request 请求对象
     * @return AttachAgencyPolicyV5Response
     */
    public AttachAgencyPolicyV5Response attachAgencyPolicyV5(AttachAgencyPolicyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.attachAgencyPolicyV5);
    }

    /**
     * 为委托或信任委托附加身份策略
     *
     * 该接口可以用于为指定委托或信任委托附加指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachAgencyPolicyV5Request 请求对象
     * @return SyncInvoker<AttachAgencyPolicyV5Request, AttachAgencyPolicyV5Response>
     */
    public SyncInvoker<AttachAgencyPolicyV5Request, AttachAgencyPolicyV5Response> attachAgencyPolicyV5Invoker(
        AttachAgencyPolicyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.attachAgencyPolicyV5, hcClient);
    }

    /**
     * 为用户组附加身份策略
     *
     * 该接口可以用于为指定用户组附加指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachGroupPolicyV5Request 请求对象
     * @return AttachGroupPolicyV5Response
     */
    public AttachGroupPolicyV5Response attachGroupPolicyV5(AttachGroupPolicyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.attachGroupPolicyV5);
    }

    /**
     * 为用户组附加身份策略
     *
     * 该接口可以用于为指定用户组附加指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachGroupPolicyV5Request 请求对象
     * @return SyncInvoker<AttachGroupPolicyV5Request, AttachGroupPolicyV5Response>
     */
    public SyncInvoker<AttachGroupPolicyV5Request, AttachGroupPolicyV5Response> attachGroupPolicyV5Invoker(
        AttachGroupPolicyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.attachGroupPolicyV5, hcClient);
    }

    /**
     * 为IAM用户附加身份策略
     *
     * 该接口可以用于为指定IAM用户附加指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachUserPolicyV5Request 请求对象
     * @return AttachUserPolicyV5Response
     */
    public AttachUserPolicyV5Response attachUserPolicyV5(AttachUserPolicyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.attachUserPolicyV5);
    }

    /**
     * 为IAM用户附加身份策略
     *
     * 该接口可以用于为指定IAM用户附加指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachUserPolicyV5Request 请求对象
     * @return SyncInvoker<AttachUserPolicyV5Request, AttachUserPolicyV5Response>
     */
    public SyncInvoker<AttachUserPolicyV5Request, AttachUserPolicyV5Response> attachUserPolicyV5Invoker(
        AttachUserPolicyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.attachUserPolicyV5, hcClient);
    }

    /**
     * 从委托或信任委托分离身份策略
     *
     * 该接口可以用于从指定委托或信任委托中分离指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachAgencyPolicyV5Request 请求对象
     * @return DetachAgencyPolicyV5Response
     */
    public DetachAgencyPolicyV5Response detachAgencyPolicyV5(DetachAgencyPolicyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.detachAgencyPolicyV5);
    }

    /**
     * 从委托或信任委托分离身份策略
     *
     * 该接口可以用于从指定委托或信任委托中分离指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachAgencyPolicyV5Request 请求对象
     * @return SyncInvoker<DetachAgencyPolicyV5Request, DetachAgencyPolicyV5Response>
     */
    public SyncInvoker<DetachAgencyPolicyV5Request, DetachAgencyPolicyV5Response> detachAgencyPolicyV5Invoker(
        DetachAgencyPolicyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.detachAgencyPolicyV5, hcClient);
    }

    /**
     * 从用户组分离身份策略
     *
     * 该接口可以用于从指定用户组分离指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachGroupPolicyV5Request 请求对象
     * @return DetachGroupPolicyV5Response
     */
    public DetachGroupPolicyV5Response detachGroupPolicyV5(DetachGroupPolicyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.detachGroupPolicyV5);
    }

    /**
     * 从用户组分离身份策略
     *
     * 该接口可以用于从指定用户组分离指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachGroupPolicyV5Request 请求对象
     * @return SyncInvoker<DetachGroupPolicyV5Request, DetachGroupPolicyV5Response>
     */
    public SyncInvoker<DetachGroupPolicyV5Request, DetachGroupPolicyV5Response> detachGroupPolicyV5Invoker(
        DetachGroupPolicyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.detachGroupPolicyV5, hcClient);
    }

    /**
     * 从IAM用户分离身份策略
     *
     * 该接口可以用于从指定的IAM用户分离指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachUserPolicyV5Request 请求对象
     * @return DetachUserPolicyV5Response
     */
    public DetachUserPolicyV5Response detachUserPolicyV5(DetachUserPolicyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.detachUserPolicyV5);
    }

    /**
     * 从IAM用户分离身份策略
     *
     * 该接口可以用于从指定的IAM用户分离指定身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachUserPolicyV5Request 请求对象
     * @return SyncInvoker<DetachUserPolicyV5Request, DetachUserPolicyV5Response>
     */
    public SyncInvoker<DetachUserPolicyV5Request, DetachUserPolicyV5Response> detachUserPolicyV5Invoker(
        DetachUserPolicyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.detachUserPolicyV5, hcClient);
    }

    /**
     * 查询指定委托或信任委托附加的所有身份策略
     *
     * 该接口可用于查询指定委托或信任委托附加的所有身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachedAgencyPoliciesV5Request 请求对象
     * @return ListAttachedAgencyPoliciesV5Response
     */
    public ListAttachedAgencyPoliciesV5Response listAttachedAgencyPoliciesV5(
        ListAttachedAgencyPoliciesV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listAttachedAgencyPoliciesV5);
    }

    /**
     * 查询指定委托或信任委托附加的所有身份策略
     *
     * 该接口可用于查询指定委托或信任委托附加的所有身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachedAgencyPoliciesV5Request 请求对象
     * @return SyncInvoker<ListAttachedAgencyPoliciesV5Request, ListAttachedAgencyPoliciesV5Response>
     */
    public SyncInvoker<ListAttachedAgencyPoliciesV5Request, ListAttachedAgencyPoliciesV5Response> listAttachedAgencyPoliciesV5Invoker(
        ListAttachedAgencyPoliciesV5Request request) {
        return new SyncInvoker<>(request, IamMeta.listAttachedAgencyPoliciesV5, hcClient);
    }

    /**
     * 查询指定用户组附加的所有身份策略
     *
     * 该接口可用于查询指定用户组附加的所有身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachedGroupPoliciesV5Request 请求对象
     * @return ListAttachedGroupPoliciesV5Response
     */
    public ListAttachedGroupPoliciesV5Response listAttachedGroupPoliciesV5(ListAttachedGroupPoliciesV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listAttachedGroupPoliciesV5);
    }

    /**
     * 查询指定用户组附加的所有身份策略
     *
     * 该接口可用于查询指定用户组附加的所有身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachedGroupPoliciesV5Request 请求对象
     * @return SyncInvoker<ListAttachedGroupPoliciesV5Request, ListAttachedGroupPoliciesV5Response>
     */
    public SyncInvoker<ListAttachedGroupPoliciesV5Request, ListAttachedGroupPoliciesV5Response> listAttachedGroupPoliciesV5Invoker(
        ListAttachedGroupPoliciesV5Request request) {
        return new SyncInvoker<>(request, IamMeta.listAttachedGroupPoliciesV5, hcClient);
    }

    /**
     * 查询指定IAM用户附加的所有身份策略
     *
     * 该接口可用于查询指定IAM用户附加的所有身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachedUserPoliciesV5Request 请求对象
     * @return ListAttachedUserPoliciesV5Response
     */
    public ListAttachedUserPoliciesV5Response listAttachedUserPoliciesV5(ListAttachedUserPoliciesV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listAttachedUserPoliciesV5);
    }

    /**
     * 查询指定IAM用户附加的所有身份策略
     *
     * 该接口可用于查询指定IAM用户附加的所有身份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachedUserPoliciesV5Request 请求对象
     * @return SyncInvoker<ListAttachedUserPoliciesV5Request, ListAttachedUserPoliciesV5Response>
     */
    public SyncInvoker<ListAttachedUserPoliciesV5Request, ListAttachedUserPoliciesV5Response> listAttachedUserPoliciesV5Invoker(
        ListAttachedUserPoliciesV5Request request) {
        return new SyncInvoker<>(request, IamMeta.listAttachedUserPoliciesV5, hcClient);
    }

    /**
     * 查询指定身份策略附加的所有实体
     *
     * 该接口可用于查询指定身份策略附加的所有实体。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEntitiesForPolicyV5Request 请求对象
     * @return ListEntitiesForPolicyV5Response
     */
    public ListEntitiesForPolicyV5Response listEntitiesForPolicyV5(ListEntitiesForPolicyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listEntitiesForPolicyV5);
    }

    /**
     * 查询指定身份策略附加的所有实体
     *
     * 该接口可用于查询指定身份策略附加的所有实体。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEntitiesForPolicyV5Request 请求对象
     * @return SyncInvoker<ListEntitiesForPolicyV5Request, ListEntitiesForPolicyV5Response>
     */
    public SyncInvoker<ListEntitiesForPolicyV5Request, ListEntitiesForPolicyV5Response> listEntitiesForPolicyV5Invoker(
        ListEntitiesForPolicyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.listEntitiesForPolicyV5, hcClient);
    }

    /**
     * 为指定身份策略创建一个新版本
     *
     * 该接口可以用于为指定身份策略创建一个新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyVersionV5Request 请求对象
     * @return CreatePolicyVersionV5Response
     */
    public CreatePolicyVersionV5Response createPolicyVersionV5(CreatePolicyVersionV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createPolicyVersionV5);
    }

    /**
     * 为指定身份策略创建一个新版本
     *
     * 该接口可以用于为指定身份策略创建一个新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyVersionV5Request 请求对象
     * @return SyncInvoker<CreatePolicyVersionV5Request, CreatePolicyVersionV5Response>
     */
    public SyncInvoker<CreatePolicyVersionV5Request, CreatePolicyVersionV5Response> createPolicyVersionV5Invoker(
        CreatePolicyVersionV5Request request) {
        return new SyncInvoker<>(request, IamMeta.createPolicyVersionV5, hcClient);
    }

    /**
     * 删除指定身份策略版本
     *
     * 该接口可以用于删除指定身份策略的指定版本。默认身份策略版本不能被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyVersionV5Request 请求对象
     * @return DeletePolicyVersionV5Response
     */
    public DeletePolicyVersionV5Response deletePolicyVersionV5(DeletePolicyVersionV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deletePolicyVersionV5);
    }

    /**
     * 删除指定身份策略版本
     *
     * 该接口可以用于删除指定身份策略的指定版本。默认身份策略版本不能被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyVersionV5Request 请求对象
     * @return SyncInvoker<DeletePolicyVersionV5Request, DeletePolicyVersionV5Response>
     */
    public SyncInvoker<DeletePolicyVersionV5Request, DeletePolicyVersionV5Response> deletePolicyVersionV5Invoker(
        DeletePolicyVersionV5Request request) {
        return new SyncInvoker<>(request, IamMeta.deletePolicyVersionV5, hcClient);
    }

    /**
     * 查询指定身份策略版本
     *
     * 该接口可以用于查询指定身份策略的指定版本的相关信息，包括身份策略文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPolicyVersionV5Request 请求对象
     * @return GetPolicyVersionV5Response
     */
    public GetPolicyVersionV5Response getPolicyVersionV5(GetPolicyVersionV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.getPolicyVersionV5);
    }

    /**
     * 查询指定身份策略版本
     *
     * 该接口可以用于查询指定身份策略的指定版本的相关信息，包括身份策略文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPolicyVersionV5Request 请求对象
     * @return SyncInvoker<GetPolicyVersionV5Request, GetPolicyVersionV5Response>
     */
    public SyncInvoker<GetPolicyVersionV5Request, GetPolicyVersionV5Response> getPolicyVersionV5Invoker(
        GetPolicyVersionV5Request request) {
        return new SyncInvoker<>(request, IamMeta.getPolicyVersionV5, hcClient);
    }

    /**
     * 查询指定身份策略的所有版本
     *
     * 该接口可以用于查询指定身份策略的所有版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyVersionsV5Request 请求对象
     * @return ListPolicyVersionsV5Response
     */
    public ListPolicyVersionsV5Response listPolicyVersionsV5(ListPolicyVersionsV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listPolicyVersionsV5);
    }

    /**
     * 查询指定身份策略的所有版本
     *
     * 该接口可以用于查询指定身份策略的所有版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyVersionsV5Request 请求对象
     * @return SyncInvoker<ListPolicyVersionsV5Request, ListPolicyVersionsV5Response>
     */
    public SyncInvoker<ListPolicyVersionsV5Request, ListPolicyVersionsV5Response> listPolicyVersionsV5Invoker(
        ListPolicyVersionsV5Request request) {
        return new SyncInvoker<>(request, IamMeta.listPolicyVersionsV5, hcClient);
    }

    /**
     * 将指定身份策略版本设置为默认版本
     *
     * 该接口可以用于将指定身份策略的指定版本设置为默认版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDefaultPolicyVersionV5Request 请求对象
     * @return SetDefaultPolicyVersionV5Response
     */
    public SetDefaultPolicyVersionV5Response setDefaultPolicyVersionV5(SetDefaultPolicyVersionV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.setDefaultPolicyVersionV5);
    }

    /**
     * 将指定身份策略版本设置为默认版本
     *
     * 该接口可以用于将指定身份策略的指定版本设置为默认版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDefaultPolicyVersionV5Request 请求对象
     * @return SyncInvoker<SetDefaultPolicyVersionV5Request, SetDefaultPolicyVersionV5Response>
     */
    public SyncInvoker<SetDefaultPolicyVersionV5Request, SetDefaultPolicyVersionV5Response> setDefaultPolicyVersionV5Invoker(
        SetDefaultPolicyVersionV5Request request) {
        return new SyncInvoker<>(request, IamMeta.setDefaultPolicyVersionV5, hcClient);
    }

    /**
     * 删除指定资源的部分标签
     *
     * 该接口可以用于删除指定资源的部分标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceTagsV5Request 请求对象
     * @return DeleteResourceTagsV5Response
     */
    public DeleteResourceTagsV5Response deleteResourceTagsV5(DeleteResourceTagsV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteResourceTagsV5);
    }

    /**
     * 删除指定资源的部分标签
     *
     * 该接口可以用于删除指定资源的部分标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceTagsV5Request 请求对象
     * @return SyncInvoker<DeleteResourceTagsV5Request, DeleteResourceTagsV5Response>
     */
    public SyncInvoker<DeleteResourceTagsV5Request, DeleteResourceTagsV5Response> deleteResourceTagsV5Invoker(
        DeleteResourceTagsV5Request request) {
        return new SyncInvoker<>(request, IamMeta.deleteResourceTagsV5, hcClient);
    }

    /**
     * 获取指定资源的所有标签
     *
     * 该接口可以用于获取指定资源的所有标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsV5Request 请求对象
     * @return ListResourceTagsV5Response
     */
    public ListResourceTagsV5Response listResourceTagsV5(ListResourceTagsV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listResourceTagsV5);
    }

    /**
     * 获取指定资源的所有标签
     *
     * 该接口可以用于获取指定资源的所有标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsV5Request 请求对象
     * @return SyncInvoker<ListResourceTagsV5Request, ListResourceTagsV5Response>
     */
    public SyncInvoker<ListResourceTagsV5Request, ListResourceTagsV5Response> listResourceTagsV5Invoker(
        ListResourceTagsV5Request request) {
        return new SyncInvoker<>(request, IamMeta.listResourceTagsV5, hcClient);
    }

    /**
     * 为IAM资源打上标签
     *
     * 该接口可以用于为IAM资源打上标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagResourceV5Request 请求对象
     * @return TagResourceV5Response
     */
    public TagResourceV5Response tagResourceV5(TagResourceV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.tagResourceV5);
    }

    /**
     * 为IAM资源打上标签
     *
     * 该接口可以用于为IAM资源打上标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagResourceV5Request 请求对象
     * @return SyncInvoker<TagResourceV5Request, TagResourceV5Response>
     */
    public SyncInvoker<TagResourceV5Request, TagResourceV5Response> tagResourceV5Invoker(TagResourceV5Request request) {
        return new SyncInvoker<>(request, IamMeta.tagResourceV5, hcClient);
    }

    /**
     * 查询账号登录策略
     *
     * 该接口可以用于查询账号登录策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoginPolicyV5Request 请求对象
     * @return ShowLoginPolicyV5Response
     */
    public ShowLoginPolicyV5Response showLoginPolicyV5(ShowLoginPolicyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showLoginPolicyV5);
    }

    /**
     * 查询账号登录策略
     *
     * 该接口可以用于查询账号登录策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoginPolicyV5Request 请求对象
     * @return SyncInvoker<ShowLoginPolicyV5Request, ShowLoginPolicyV5Response>
     */
    public SyncInvoker<ShowLoginPolicyV5Request, ShowLoginPolicyV5Response> showLoginPolicyV5Invoker(
        ShowLoginPolicyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.showLoginPolicyV5, hcClient);
    }

    /**
     * 查询账号密码策略
     *
     * 该接口可以用于查询账号密码策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPasswordPolicyV5Request 请求对象
     * @return ShowPasswordPolicyV5Response
     */
    public ShowPasswordPolicyV5Response showPasswordPolicyV5(ShowPasswordPolicyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showPasswordPolicyV5);
    }

    /**
     * 查询账号密码策略
     *
     * 该接口可以用于查询账号密码策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPasswordPolicyV5Request 请求对象
     * @return SyncInvoker<ShowPasswordPolicyV5Request, ShowPasswordPolicyV5Response>
     */
    public SyncInvoker<ShowPasswordPolicyV5Request, ShowPasswordPolicyV5Response> showPasswordPolicyV5Invoker(
        ShowPasswordPolicyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.showPasswordPolicyV5, hcClient);
    }

    /**
     * 查询账号的Token策略
     *
     * 查询账号的Token策略，Token策略控制账号下的所有身份类型（IAM用户、委托、联邦用户）是否允许获取Token（联邦认证获取的unscoped token不受Token策略影响）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTokenPolicyV5Request 请求对象
     * @return ShowTokenPolicyV5Response
     */
    public ShowTokenPolicyV5Response showTokenPolicyV5(ShowTokenPolicyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showTokenPolicyV5);
    }

    /**
     * 查询账号的Token策略
     *
     * 查询账号的Token策略，Token策略控制账号下的所有身份类型（IAM用户、委托、联邦用户）是否允许获取Token（联邦认证获取的unscoped token不受Token策略影响）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTokenPolicyV5Request 请求对象
     * @return SyncInvoker<ShowTokenPolicyV5Request, ShowTokenPolicyV5Response>
     */
    public SyncInvoker<ShowTokenPolicyV5Request, ShowTokenPolicyV5Response> showTokenPolicyV5Invoker(
        ShowTokenPolicyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.showTokenPolicyV5, hcClient);
    }

    /**
     * 修改账号登录策略
     *
     * 该接口可以用于修改账号登录策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLoginPolicyV5Request 请求对象
     * @return UpdateLoginPolicyV5Response
     */
    public UpdateLoginPolicyV5Response updateLoginPolicyV5(UpdateLoginPolicyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateLoginPolicyV5);
    }

    /**
     * 修改账号登录策略
     *
     * 该接口可以用于修改账号登录策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLoginPolicyV5Request 请求对象
     * @return SyncInvoker<UpdateLoginPolicyV5Request, UpdateLoginPolicyV5Response>
     */
    public SyncInvoker<UpdateLoginPolicyV5Request, UpdateLoginPolicyV5Response> updateLoginPolicyV5Invoker(
        UpdateLoginPolicyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.updateLoginPolicyV5, hcClient);
    }

    /**
     * 修改账号密码策略
     *
     * 该接口可以用于修改账号密码策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePasswordPolicyV5Request 请求对象
     * @return UpdatePasswordPolicyV5Response
     */
    public UpdatePasswordPolicyV5Response updatePasswordPolicyV5(UpdatePasswordPolicyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updatePasswordPolicyV5);
    }

    /**
     * 修改账号密码策略
     *
     * 该接口可以用于修改账号密码策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePasswordPolicyV5Request 请求对象
     * @return SyncInvoker<UpdatePasswordPolicyV5Request, UpdatePasswordPolicyV5Response>
     */
    public SyncInvoker<UpdatePasswordPolicyV5Request, UpdatePasswordPolicyV5Response> updatePasswordPolicyV5Invoker(
        UpdatePasswordPolicyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.updatePasswordPolicyV5, hcClient);
    }

    /**
     * 修改账号的Token策略
     *
     * 修改账号的Token策略，Token策略控制账号下的所有身份类型（IAM用户、委托、联邦用户）是否允许获取Token（联邦认证获取的unscoped token不受Token策略影响）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTokenPolicyV5Request 请求对象
     * @return UpdateTokenPolicyV5Response
     */
    public UpdateTokenPolicyV5Response updateTokenPolicyV5(UpdateTokenPolicyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateTokenPolicyV5);
    }

    /**
     * 修改账号的Token策略
     *
     * 修改账号的Token策略，Token策略控制账号下的所有身份类型（IAM用户、委托、联邦用户）是否允许获取Token（联邦认证获取的unscoped token不受Token策略影响）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTokenPolicyV5Request 请求对象
     * @return SyncInvoker<UpdateTokenPolicyV5Request, UpdateTokenPolicyV5Response>
     */
    public SyncInvoker<UpdateTokenPolicyV5Request, UpdateTokenPolicyV5Response> updateTokenPolicyV5Invoker(
        UpdateTokenPolicyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.updateTokenPolicyV5, hcClient);
    }

    /**
     * 创建服务关联委托
     *
     * 该接口可以用于创建服务关联委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceLinkedAgencyV5Request 请求对象
     * @return CreateServiceLinkedAgencyV5Response
     */
    public CreateServiceLinkedAgencyV5Response createServiceLinkedAgencyV5(CreateServiceLinkedAgencyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createServiceLinkedAgencyV5);
    }

    /**
     * 创建服务关联委托
     *
     * 该接口可以用于创建服务关联委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceLinkedAgencyV5Request 请求对象
     * @return SyncInvoker<CreateServiceLinkedAgencyV5Request, CreateServiceLinkedAgencyV5Response>
     */
    public SyncInvoker<CreateServiceLinkedAgencyV5Request, CreateServiceLinkedAgencyV5Response> createServiceLinkedAgencyV5Invoker(
        CreateServiceLinkedAgencyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.createServiceLinkedAgencyV5, hcClient);
    }

    /**
     * 删除服务关联委托
     *
     * 该接口可以用于服务关联委托删除自己。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceLinkedAgencyV5Request 请求对象
     * @return DeleteServiceLinkedAgencyV5Response
     */
    public DeleteServiceLinkedAgencyV5Response deleteServiceLinkedAgencyV5(DeleteServiceLinkedAgencyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteServiceLinkedAgencyV5);
    }

    /**
     * 删除服务关联委托
     *
     * 该接口可以用于服务关联委托删除自己。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceLinkedAgencyV5Request 请求对象
     * @return SyncInvoker<DeleteServiceLinkedAgencyV5Request, DeleteServiceLinkedAgencyV5Response>
     */
    public SyncInvoker<DeleteServiceLinkedAgencyV5Request, DeleteServiceLinkedAgencyV5Response> deleteServiceLinkedAgencyV5Invoker(
        DeleteServiceLinkedAgencyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.deleteServiceLinkedAgencyV5, hcClient);
    }

    /**
     * 获取服务关联委托删除状态
     *
     * 该接口可以用于获取服务关联委托删除状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetServiceLinkedAgencyDeletionStatusV5Request 请求对象
     * @return GetServiceLinkedAgencyDeletionStatusV5Response
     */
    public GetServiceLinkedAgencyDeletionStatusV5Response getServiceLinkedAgencyDeletionStatusV5(
        GetServiceLinkedAgencyDeletionStatusV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.getServiceLinkedAgencyDeletionStatusV5);
    }

    /**
     * 获取服务关联委托删除状态
     *
     * 该接口可以用于获取服务关联委托删除状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetServiceLinkedAgencyDeletionStatusV5Request 请求对象
     * @return SyncInvoker<GetServiceLinkedAgencyDeletionStatusV5Request, GetServiceLinkedAgencyDeletionStatusV5Response>
     */
    public SyncInvoker<GetServiceLinkedAgencyDeletionStatusV5Request, GetServiceLinkedAgencyDeletionStatusV5Response> getServiceLinkedAgencyDeletionStatusV5Invoker(
        GetServiceLinkedAgencyDeletionStatusV5Request request) {
        return new SyncInvoker<>(request, IamMeta.getServiceLinkedAgencyDeletionStatusV5, hcClient);
    }

    /**
     * 获取全部服务主体
     *
     * 该接口可以用于获取全部服务主体。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServicePrincipalsV5Request 请求对象
     * @return ListServicePrincipalsV5Response
     */
    public ListServicePrincipalsV5Response listServicePrincipalsV5(ListServicePrincipalsV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listServicePrincipalsV5);
    }

    /**
     * 获取全部服务主体
     *
     * 该接口可以用于获取全部服务主体。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServicePrincipalsV5Request 请求对象
     * @return SyncInvoker<ListServicePrincipalsV5Request, ListServicePrincipalsV5Response>
     */
    public SyncInvoker<ListServicePrincipalsV5Request, ListServicePrincipalsV5Response> listServicePrincipalsV5Invoker(
        ListServicePrincipalsV5Request request) {
        return new SyncInvoker<>(request, IamMeta.listServicePrincipalsV5, hcClient);
    }

    /**
     * 创建IAM用户
     *
     * 该接口可以用于创建IAM用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserV5Request 请求对象
     * @return CreateUserV5Response
     */
    public CreateUserV5Response createUserV5(CreateUserV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createUserV5);
    }

    /**
     * 创建IAM用户
     *
     * 该接口可以用于创建IAM用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserV5Request 请求对象
     * @return SyncInvoker<CreateUserV5Request, CreateUserV5Response>
     */
    public SyncInvoker<CreateUserV5Request, CreateUserV5Response> createUserV5Invoker(CreateUserV5Request request) {
        return new SyncInvoker<>(request, IamMeta.createUserV5, hcClient);
    }

    /**
     * 删除IAM用户
     *
     * 该接口可以用于删除指定IAM用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserV5Request 请求对象
     * @return DeleteUserV5Response
     */
    public DeleteUserV5Response deleteUserV5(DeleteUserV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteUserV5);
    }

    /**
     * 删除IAM用户
     *
     * 该接口可以用于删除指定IAM用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserV5Request 请求对象
     * @return SyncInvoker<DeleteUserV5Request, DeleteUserV5Response>
     */
    public SyncInvoker<DeleteUserV5Request, DeleteUserV5Response> deleteUserV5Invoker(DeleteUserV5Request request) {
        return new SyncInvoker<>(request, IamMeta.deleteUserV5, hcClient);
    }

    /**
     * 查询IAM用户列表
     *
     * 该接口可以用于查询IAM用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersV5Request 请求对象
     * @return ListUsersV5Response
     */
    public ListUsersV5Response listUsersV5(ListUsersV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listUsersV5);
    }

    /**
     * 查询IAM用户列表
     *
     * 该接口可以用于查询IAM用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersV5Request 请求对象
     * @return SyncInvoker<ListUsersV5Request, ListUsersV5Response>
     */
    public SyncInvoker<ListUsersV5Request, ListUsersV5Response> listUsersV5Invoker(ListUsersV5Request request) {
        return new SyncInvoker<>(request, IamMeta.listUsersV5, hcClient);
    }

    /**
     * 查询IAM用户最后登录时间
     *
     * 该接口可以用于查询IAM用户的最后登录时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserLastLoginV5Request 请求对象
     * @return ShowUserLastLoginV5Response
     */
    public ShowUserLastLoginV5Response showUserLastLoginV5(ShowUserLastLoginV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showUserLastLoginV5);
    }

    /**
     * 查询IAM用户最后登录时间
     *
     * 该接口可以用于查询IAM用户的最后登录时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserLastLoginV5Request 请求对象
     * @return SyncInvoker<ShowUserLastLoginV5Request, ShowUserLastLoginV5Response>
     */
    public SyncInvoker<ShowUserLastLoginV5Request, ShowUserLastLoginV5Response> showUserLastLoginV5Invoker(
        ShowUserLastLoginV5Request request) {
        return new SyncInvoker<>(request, IamMeta.showUserLastLoginV5, hcClient);
    }

    /**
     * 查询IAM用户详情
     *
     * 该接口可以用于查询IAM用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserV5Request 请求对象
     * @return ShowUserV5Response
     */
    public ShowUserV5Response showUserV5(ShowUserV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showUserV5);
    }

    /**
     * 查询IAM用户详情
     *
     * 该接口可以用于查询IAM用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserV5Request 请求对象
     * @return SyncInvoker<ShowUserV5Request, ShowUserV5Response>
     */
    public SyncInvoker<ShowUserV5Request, ShowUserV5Response> showUserV5Invoker(ShowUserV5Request request) {
        return new SyncInvoker<>(request, IamMeta.showUserV5, hcClient);
    }

    /**
     * 修改IAM用户信息
     *
     * 该接口可以用于修改IAM用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserV5Request 请求对象
     * @return UpdateUserV5Response
     */
    public UpdateUserV5Response updateUserV5(UpdateUserV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateUserV5);
    }

    /**
     * 修改IAM用户信息
     *
     * 该接口可以用于修改IAM用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserV5Request 请求对象
     * @return SyncInvoker<UpdateUserV5Request, UpdateUserV5Response>
     */
    public SyncInvoker<UpdateUserV5Request, UpdateUserV5Response> updateUserV5Invoker(UpdateUserV5Request request) {
        return new SyncInvoker<>(request, IamMeta.updateUserV5, hcClient);
    }

    /**
     * 修改IAM用户密码
     *
     * 该接口可以用于IAM用户修改自己的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePasswordV5Request 请求对象
     * @return ChangePasswordV5Response
     */
    public ChangePasswordV5Response changePasswordV5(ChangePasswordV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.changePasswordV5);
    }

    /**
     * 修改IAM用户密码
     *
     * 该接口可以用于IAM用户修改自己的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePasswordV5Request 请求对象
     * @return SyncInvoker<ChangePasswordV5Request, ChangePasswordV5Response>
     */
    public SyncInvoker<ChangePasswordV5Request, ChangePasswordV5Response> changePasswordV5Invoker(
        ChangePasswordV5Request request) {
        return new SyncInvoker<>(request, IamMeta.changePasswordV5, hcClient);
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
     * @return CreateAccessKeyV5Response
     */
    public CreateAccessKeyV5Response createAccessKeyV5(CreateAccessKeyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createAccessKeyV5);
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
     * @return SyncInvoker<CreateAccessKeyV5Request, CreateAccessKeyV5Response>
     */
    public SyncInvoker<CreateAccessKeyV5Request, CreateAccessKeyV5Response> createAccessKeyV5Invoker(
        CreateAccessKeyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.createAccessKeyV5, hcClient);
    }

    /**
     * 创建IAM用户登录信息
     *
     * 该接口可以用于创建指定IAM用户的登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLoginProfileV5Request 请求对象
     * @return CreateLoginProfileV5Response
     */
    public CreateLoginProfileV5Response createLoginProfileV5(CreateLoginProfileV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createLoginProfileV5);
    }

    /**
     * 创建IAM用户登录信息
     *
     * 该接口可以用于创建指定IAM用户的登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLoginProfileV5Request 请求对象
     * @return SyncInvoker<CreateLoginProfileV5Request, CreateLoginProfileV5Response>
     */
    public SyncInvoker<CreateLoginProfileV5Request, CreateLoginProfileV5Response> createLoginProfileV5Invoker(
        CreateLoginProfileV5Request request) {
        return new SyncInvoker<>(request, IamMeta.createLoginProfileV5, hcClient);
    }

    /**
     * 删除指定永久访问密钥
     *
     * 该接口可以用于删除IAM用户的指定永久访问密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAccessKeyV5Request 请求对象
     * @return DeleteAccessKeyV5Response
     */
    public DeleteAccessKeyV5Response deleteAccessKeyV5(DeleteAccessKeyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteAccessKeyV5);
    }

    /**
     * 删除指定永久访问密钥
     *
     * 该接口可以用于删除IAM用户的指定永久访问密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAccessKeyV5Request 请求对象
     * @return SyncInvoker<DeleteAccessKeyV5Request, DeleteAccessKeyV5Response>
     */
    public SyncInvoker<DeleteAccessKeyV5Request, DeleteAccessKeyV5Response> deleteAccessKeyV5Invoker(
        DeleteAccessKeyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.deleteAccessKeyV5, hcClient);
    }

    /**
     * 删除IAM用户登录信息
     *
     * 该接口可以用于删除指定IAM用户的登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLoginProfileV5Request 请求对象
     * @return DeleteLoginProfileV5Response
     */
    public DeleteLoginProfileV5Response deleteLoginProfileV5(DeleteLoginProfileV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteLoginProfileV5);
    }

    /**
     * 删除IAM用户登录信息
     *
     * 该接口可以用于删除指定IAM用户的登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLoginProfileV5Request 请求对象
     * @return SyncInvoker<DeleteLoginProfileV5Request, DeleteLoginProfileV5Response>
     */
    public SyncInvoker<DeleteLoginProfileV5Request, DeleteLoginProfileV5Response> deleteLoginProfileV5Invoker(
        DeleteLoginProfileV5Request request) {
        return new SyncInvoker<>(request, IamMeta.deleteLoginProfileV5, hcClient);
    }

    /**
     * 查询所有永久访问密钥
     *
     * 该接口可以用于查询IAM用户的所有永久访问密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessKeysV5Request 请求对象
     * @return ListAccessKeysV5Response
     */
    public ListAccessKeysV5Response listAccessKeysV5(ListAccessKeysV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listAccessKeysV5);
    }

    /**
     * 查询所有永久访问密钥
     *
     * 该接口可以用于查询IAM用户的所有永久访问密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessKeysV5Request 请求对象
     * @return SyncInvoker<ListAccessKeysV5Request, ListAccessKeysV5Response>
     */
    public SyncInvoker<ListAccessKeysV5Request, ListAccessKeysV5Response> listAccessKeysV5Invoker(
        ListAccessKeysV5Request request) {
        return new SyncInvoker<>(request, IamMeta.listAccessKeysV5, hcClient);
    }

    /**
     * 查询指定永久访问密钥最后使用时间
     *
     * 该接口可以用于查询IAM用户的指定永久访问密钥的最后使用时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessKeyLastUsedV5Request 请求对象
     * @return ShowAccessKeyLastUsedV5Response
     */
    public ShowAccessKeyLastUsedV5Response showAccessKeyLastUsedV5(ShowAccessKeyLastUsedV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showAccessKeyLastUsedV5);
    }

    /**
     * 查询指定永久访问密钥最后使用时间
     *
     * 该接口可以用于查询IAM用户的指定永久访问密钥的最后使用时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessKeyLastUsedV5Request 请求对象
     * @return SyncInvoker<ShowAccessKeyLastUsedV5Request, ShowAccessKeyLastUsedV5Response>
     */
    public SyncInvoker<ShowAccessKeyLastUsedV5Request, ShowAccessKeyLastUsedV5Response> showAccessKeyLastUsedV5Invoker(
        ShowAccessKeyLastUsedV5Request request) {
        return new SyncInvoker<>(request, IamMeta.showAccessKeyLastUsedV5, hcClient);
    }

    /**
     * 查询IAM用户登录信息
     *
     * 该接口可以用于查询指定IAM用户的登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoginProfileV5Request 请求对象
     * @return ShowLoginProfileV5Response
     */
    public ShowLoginProfileV5Response showLoginProfileV5(ShowLoginProfileV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showLoginProfileV5);
    }

    /**
     * 查询IAM用户登录信息
     *
     * 该接口可以用于查询指定IAM用户的登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoginProfileV5Request 请求对象
     * @return SyncInvoker<ShowLoginProfileV5Request, ShowLoginProfileV5Response>
     */
    public SyncInvoker<ShowLoginProfileV5Request, ShowLoginProfileV5Response> showLoginProfileV5Invoker(
        ShowLoginProfileV5Request request) {
        return new SyncInvoker<>(request, IamMeta.showLoginProfileV5, hcClient);
    }

    /**
     * 修改指定永久访问密钥
     *
     * 该接口可以用于修改IAM用户的指定永久访问密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessKeyV5Request 请求对象
     * @return UpdateAccessKeyV5Response
     */
    public UpdateAccessKeyV5Response updateAccessKeyV5(UpdateAccessKeyV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateAccessKeyV5);
    }

    /**
     * 修改指定永久访问密钥
     *
     * 该接口可以用于修改IAM用户的指定永久访问密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessKeyV5Request 请求对象
     * @return SyncInvoker<UpdateAccessKeyV5Request, UpdateAccessKeyV5Response>
     */
    public SyncInvoker<UpdateAccessKeyV5Request, UpdateAccessKeyV5Response> updateAccessKeyV5Invoker(
        UpdateAccessKeyV5Request request) {
        return new SyncInvoker<>(request, IamMeta.updateAccessKeyV5, hcClient);
    }

    /**
     * 修改IAM用户登录信息
     *
     * 该接口可以用于修改指定IAM用户的登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLoginProfileV5Request 请求对象
     * @return UpdateLoginProfileV5Response
     */
    public UpdateLoginProfileV5Response updateLoginProfileV5(UpdateLoginProfileV5Request request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateLoginProfileV5);
    }

    /**
     * 修改IAM用户登录信息
     *
     * 该接口可以用于修改指定IAM用户的登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLoginProfileV5Request 请求对象
     * @return SyncInvoker<UpdateLoginProfileV5Request, UpdateLoginProfileV5Response>
     */
    public SyncInvoker<UpdateLoginProfileV5Request, UpdateLoginProfileV5Response> updateLoginProfileV5Invoker(
        UpdateLoginProfileV5Request request) {
        return new SyncInvoker<>(request, IamMeta.updateLoginProfileV5, hcClient);
    }

}
