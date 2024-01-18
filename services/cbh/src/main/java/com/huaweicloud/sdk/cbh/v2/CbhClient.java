package com.huaweicloud.sdk.cbh.v2;

import com.huaweicloud.sdk.cbh.v2.model.BatchCreateInstanceTagRequest;
import com.huaweicloud.sdk.cbh.v2.model.BatchCreateInstanceTagResponse;
import com.huaweicloud.sdk.cbh.v2.model.CountInstancesByTagRequest;
import com.huaweicloud.sdk.cbh.v2.model.CountInstancesByTagResponse;
import com.huaweicloud.sdk.cbh.v2.model.CreateInstanceRequest;
import com.huaweicloud.sdk.cbh.v2.model.CreateInstanceResponse;
import com.huaweicloud.sdk.cbh.v2.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.cbh.v2.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.cbh.v2.model.InstallInstanceEipRequest;
import com.huaweicloud.sdk.cbh.v2.model.InstallInstanceEipResponse;
import com.huaweicloud.sdk.cbh.v2.model.ListAvailableZonesRequest;
import com.huaweicloud.sdk.cbh.v2.model.ListAvailableZonesResponse;
import com.huaweicloud.sdk.cbh.v2.model.ListInstancesByTagRequest;
import com.huaweicloud.sdk.cbh.v2.model.ListInstancesByTagResponse;
import com.huaweicloud.sdk.cbh.v2.model.ListInstancesRequest;
import com.huaweicloud.sdk.cbh.v2.model.ListInstancesResponse;
import com.huaweicloud.sdk.cbh.v2.model.ListSpecificationsRequest;
import com.huaweicloud.sdk.cbh.v2.model.ListSpecificationsResponse;
import com.huaweicloud.sdk.cbh.v2.model.ListTagsRequest;
import com.huaweicloud.sdk.cbh.v2.model.ListTagsResponse;
import com.huaweicloud.sdk.cbh.v2.model.LoginInstanceRequest;
import com.huaweicloud.sdk.cbh.v2.model.LoginInstanceResponse;
import com.huaweicloud.sdk.cbh.v2.model.RebootInstanceRequest;
import com.huaweicloud.sdk.cbh.v2.model.RebootInstanceResponse;
import com.huaweicloud.sdk.cbh.v2.model.RegisterAuthorizationRequest;
import com.huaweicloud.sdk.cbh.v2.model.RegisterAuthorizationResponse;
import com.huaweicloud.sdk.cbh.v2.model.ResetInstanceLoginMethodRequest;
import com.huaweicloud.sdk.cbh.v2.model.ResetInstanceLoginMethodResponse;
import com.huaweicloud.sdk.cbh.v2.model.ResetInstancePasswordRequest;
import com.huaweicloud.sdk.cbh.v2.model.ResetInstancePasswordResponse;
import com.huaweicloud.sdk.cbh.v2.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.cbh.v2.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.cbh.v2.model.RollbackInstanceRequest;
import com.huaweicloud.sdk.cbh.v2.model.RollbackInstanceResponse;
import com.huaweicloud.sdk.cbh.v2.model.ShowAuthorizationRequest;
import com.huaweicloud.sdk.cbh.v2.model.ShowAuthorizationResponse;
import com.huaweicloud.sdk.cbh.v2.model.ShowEcsQuotaRequest;
import com.huaweicloud.sdk.cbh.v2.model.ShowEcsQuotaResponse;
import com.huaweicloud.sdk.cbh.v2.model.ShowInstanceStatusRequest;
import com.huaweicloud.sdk.cbh.v2.model.ShowInstanceStatusResponse;
import com.huaweicloud.sdk.cbh.v2.model.ShowInstanceTagsRequest;
import com.huaweicloud.sdk.cbh.v2.model.ShowInstanceTagsResponse;
import com.huaweicloud.sdk.cbh.v2.model.ShowOmUrlRequest;
import com.huaweicloud.sdk.cbh.v2.model.ShowOmUrlResponse;
import com.huaweicloud.sdk.cbh.v2.model.ShowQuotaRequest;
import com.huaweicloud.sdk.cbh.v2.model.ShowQuotaResponse;
import com.huaweicloud.sdk.cbh.v2.model.StartInstanceRequest;
import com.huaweicloud.sdk.cbh.v2.model.StartInstanceResponse;
import com.huaweicloud.sdk.cbh.v2.model.StopInstanceRequest;
import com.huaweicloud.sdk.cbh.v2.model.StopInstanceResponse;
import com.huaweicloud.sdk.cbh.v2.model.UninstallInstanceEipRequest;
import com.huaweicloud.sdk.cbh.v2.model.UninstallInstanceEipResponse;
import com.huaweicloud.sdk.cbh.v2.model.UpdateInstanceSecurityGroupRequest;
import com.huaweicloud.sdk.cbh.v2.model.UpdateInstanceSecurityGroupResponse;
import com.huaweicloud.sdk.cbh.v2.model.UpgradeInstanceRequest;
import com.huaweicloud.sdk.cbh.v2.model.UpgradeInstanceResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CbhClient {

    protected HcClient hcClient;

    public CbhClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CbhClient> newBuilder() {
        ClientBuilder<CbhClient> clientBuilder = new ClientBuilder<>(CbhClient::new);
        return clientBuilder;
    }

    /**
     * 操作堡垒机实例资源标签
     *
     * 操作堡垒机实例资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateInstanceTagRequest 请求对象
     * @return BatchCreateInstanceTagResponse
     */
    public BatchCreateInstanceTagResponse batchCreateInstanceTag(BatchCreateInstanceTagRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.batchCreateInstanceTag);
    }

    /**
     * 操作堡垒机实例资源标签
     *
     * 操作堡垒机实例资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateInstanceTagRequest 请求对象
     * @return SyncInvoker<BatchCreateInstanceTagRequest, BatchCreateInstanceTagResponse>
     */
    public SyncInvoker<BatchCreateInstanceTagRequest, BatchCreateInstanceTagResponse> batchCreateInstanceTagInvoker(
        BatchCreateInstanceTagRequest request) {
        return new SyncInvoker<>(request, CbhMeta.batchCreateInstanceTag, hcClient);
    }

    /**
     * 统计符合标签条件的实例数量
     *
     * 统计符合标签条件的实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountInstancesByTagRequest 请求对象
     * @return CountInstancesByTagResponse
     */
    public CountInstancesByTagResponse countInstancesByTag(CountInstancesByTagRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.countInstancesByTag);
    }

    /**
     * 统计符合标签条件的实例数量
     *
     * 统计符合标签条件的实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountInstancesByTagRequest 请求对象
     * @return SyncInvoker<CountInstancesByTagRequest, CountInstancesByTagResponse>
     */
    public SyncInvoker<CountInstancesByTagRequest, CountInstancesByTagResponse> countInstancesByTagInvoker(
        CountInstancesByTagRequest request) {
        return new SyncInvoker<>(request, CbhMeta.countInstancesByTag, hcClient);
    }

    /**
     * 创建堡垒机实例
     *
     * 创建云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.createInstance);
    }

    /**
     * 创建堡垒机实例
     *
     * 创建云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<>(request, CbhMeta.createInstance, hcClient);
    }

    /**
     * 删除故障和按需云堡垒机实例
     *
     * 删除云堡垒机故障实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.deleteInstance);
    }

    /**
     * 删除故障和按需云堡垒机实例
     *
     * 删除云堡垒机故障实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<>(request, CbhMeta.deleteInstance, hcClient);
    }

    /**
     * 堡垒机实例绑定弹性公网IP
     *
     * 云堡垒机实例绑定弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallInstanceEipRequest 请求对象
     * @return InstallInstanceEipResponse
     */
    public InstallInstanceEipResponse installInstanceEip(InstallInstanceEipRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.installInstanceEip);
    }

    /**
     * 堡垒机实例绑定弹性公网IP
     *
     * 云堡垒机实例绑定弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallInstanceEipRequest 请求对象
     * @return SyncInvoker<InstallInstanceEipRequest, InstallInstanceEipResponse>
     */
    public SyncInvoker<InstallInstanceEipRequest, InstallInstanceEipResponse> installInstanceEipInvoker(
        InstallInstanceEipRequest request) {
        return new SyncInvoker<>(request, CbhMeta.installInstanceEip, hcClient);
    }

    /**
     * 获取服务可用区信息
     *
     * 获取云堡垒机服务可用区信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableZonesRequest 请求对象
     * @return ListAvailableZonesResponse
     */
    public ListAvailableZonesResponse listAvailableZones(ListAvailableZonesRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.listAvailableZones);
    }

    /**
     * 获取服务可用区信息
     *
     * 获取云堡垒机服务可用区信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableZonesRequest 请求对象
     * @return SyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse>
     */
    public SyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZonesInvoker(
        ListAvailableZonesRequest request) {
        return new SyncInvoker<>(request, CbhMeta.listAvailableZones, hcClient);
    }

    /**
     * 获取堡垒机实例列表
     *
     * 获取当前租户下的堡垒机实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.listInstances);
    }

    /**
     * 获取堡垒机实例列表
     *
     * 获取当前租户下的堡垒机实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<>(request, CbhMeta.listInstances, hcClient);
    }

    /**
     * 使用标签过滤实例
     *
     * 使用标签过滤实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesByTagRequest 请求对象
     * @return ListInstancesByTagResponse
     */
    public ListInstancesByTagResponse listInstancesByTag(ListInstancesByTagRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.listInstancesByTag);
    }

    /**
     * 使用标签过滤实例
     *
     * 使用标签过滤实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesByTagRequest 请求对象
     * @return SyncInvoker<ListInstancesByTagRequest, ListInstancesByTagResponse>
     */
    public SyncInvoker<ListInstancesByTagRequest, ListInstancesByTagResponse> listInstancesByTagInvoker(
        ListInstancesByTagRequest request) {
        return new SyncInvoker<>(request, CbhMeta.listInstancesByTag, hcClient);
    }

    /**
     * 查询云堡垒机规格信息
     *
     * 查询云堡垒机规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpecificationsRequest 请求对象
     * @return ListSpecificationsResponse
     */
    public ListSpecificationsResponse listSpecifications(ListSpecificationsRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.listSpecifications);
    }

    /**
     * 查询云堡垒机规格信息
     *
     * 查询云堡垒机规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpecificationsRequest 请求对象
     * @return SyncInvoker<ListSpecificationsRequest, ListSpecificationsResponse>
     */
    public SyncInvoker<ListSpecificationsRequest, ListSpecificationsResponse> listSpecificationsInvoker(
        ListSpecificationsRequest request) {
        return new SyncInvoker<>(request, CbhMeta.listSpecifications, hcClient);
    }

    /**
     * 查询租户在项目中的资源标签集合
     *
     * 查询租户在项目中的资源标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.listTags);
    }

    /**
     * 查询租户在项目中的资源标签集合
     *
     * 查询租户在项目中的资源标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return SyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public SyncInvoker<ListTagsRequest, ListTagsResponse> listTagsInvoker(ListTagsRequest request) {
        return new SyncInvoker<>(request, CbhMeta.listTags, hcClient);
    }

    /**
     * IAM用户登录堡垒机实例console
     *
     * IAM用户登录堡垒机实例console。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LoginInstanceRequest 请求对象
     * @return LoginInstanceResponse
     */
    public LoginInstanceResponse loginInstance(LoginInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.loginInstance);
    }

    /**
     * IAM用户登录堡垒机实例console
     *
     * IAM用户登录堡垒机实例console。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LoginInstanceRequest 请求对象
     * @return SyncInvoker<LoginInstanceRequest, LoginInstanceResponse>
     */
    public SyncInvoker<LoginInstanceRequest, LoginInstanceResponse> loginInstanceInvoker(LoginInstanceRequest request) {
        return new SyncInvoker<>(request, CbhMeta.loginInstance, hcClient);
    }

    /**
     * 重启堡垒机实例
     *
     * 重启云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootInstanceRequest 请求对象
     * @return RebootInstanceResponse
     */
    public RebootInstanceResponse rebootInstance(RebootInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.rebootInstance);
    }

    /**
     * 重启堡垒机实例
     *
     * 重启云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootInstanceRequest 请求对象
     * @return SyncInvoker<RebootInstanceRequest, RebootInstanceResponse>
     */
    public SyncInvoker<RebootInstanceRequest, RebootInstanceResponse> rebootInstanceInvoker(
        RebootInstanceRequest request) {
        return new SyncInvoker<>(request, CbhMeta.rebootInstance, hcClient);
    }

    /**
     * 租户创建或取消云堡垒机服务的委托授权
     *
     * 租户创建或取消云堡垒机服务的委托授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterAuthorizationRequest 请求对象
     * @return RegisterAuthorizationResponse
     */
    public RegisterAuthorizationResponse registerAuthorization(RegisterAuthorizationRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.registerAuthorization);
    }

    /**
     * 租户创建或取消云堡垒机服务的委托授权
     *
     * 租户创建或取消云堡垒机服务的委托授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterAuthorizationRequest 请求对象
     * @return SyncInvoker<RegisterAuthorizationRequest, RegisterAuthorizationResponse>
     */
    public SyncInvoker<RegisterAuthorizationRequest, RegisterAuthorizationResponse> registerAuthorizationInvoker(
        RegisterAuthorizationRequest request) {
        return new SyncInvoker<>(request, CbhMeta.registerAuthorization, hcClient);
    }

    /**
     * 重置堡垒机实例admin登录方式
     *
     * 重置堡垒机实例admin用户登录方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetInstanceLoginMethodRequest 请求对象
     * @return ResetInstanceLoginMethodResponse
     */
    public ResetInstanceLoginMethodResponse resetInstanceLoginMethod(ResetInstanceLoginMethodRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.resetInstanceLoginMethod);
    }

    /**
     * 重置堡垒机实例admin登录方式
     *
     * 重置堡垒机实例admin用户登录方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetInstanceLoginMethodRequest 请求对象
     * @return SyncInvoker<ResetInstanceLoginMethodRequest, ResetInstanceLoginMethodResponse>
     */
    public SyncInvoker<ResetInstanceLoginMethodRequest, ResetInstanceLoginMethodResponse> resetInstanceLoginMethodInvoker(
        ResetInstanceLoginMethodRequest request) {
        return new SyncInvoker<>(request, CbhMeta.resetInstanceLoginMethod, hcClient);
    }

    /**
     * 重置堡垒机实例admin密码
     *
     * 重置云堡垒机实例web登录admin用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetInstancePasswordRequest 请求对象
     * @return ResetInstancePasswordResponse
     */
    public ResetInstancePasswordResponse resetInstancePassword(ResetInstancePasswordRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.resetInstancePassword);
    }

    /**
     * 重置堡垒机实例admin密码
     *
     * 重置云堡垒机实例web登录admin用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetInstancePasswordRequest 请求对象
     * @return SyncInvoker<ResetInstancePasswordRequest, ResetInstancePasswordResponse>
     */
    public SyncInvoker<ResetInstancePasswordRequest, ResetInstancePasswordResponse> resetInstancePasswordInvoker(
        ResetInstancePasswordRequest request) {
        return new SyncInvoker<>(request, CbhMeta.resetInstancePassword, hcClient);
    }

    /**
     * 变更堡垒机实例
     *
     * 变更云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return ResizeInstanceResponse
     */
    public ResizeInstanceResponse resizeInstance(ResizeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.resizeInstance);
    }

    /**
     * 变更堡垒机实例
     *
     * 变更云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceInvoker(
        ResizeInstanceRequest request) {
        return new SyncInvoker<>(request, CbhMeta.resizeInstance, hcClient);
    }

    /**
     * 回退升级的堡垒机实例
     *
     * 回退升级的云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollbackInstanceRequest 请求对象
     * @return RollbackInstanceResponse
     */
    public RollbackInstanceResponse rollbackInstance(RollbackInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.rollbackInstance);
    }

    /**
     * 回退升级的堡垒机实例
     *
     * 回退升级的云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollbackInstanceRequest 请求对象
     * @return SyncInvoker<RollbackInstanceRequest, RollbackInstanceResponse>
     */
    public SyncInvoker<RollbackInstanceRequest, RollbackInstanceResponse> rollbackInstanceInvoker(
        RollbackInstanceRequest request) {
        return new SyncInvoker<>(request, CbhMeta.rollbackInstance, hcClient);
    }

    /**
     * 获取租户给云堡垒机服务委托授权信息
     *
     * 获取租户给云堡垒机服务委托授权信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuthorizationRequest 请求对象
     * @return ShowAuthorizationResponse
     */
    public ShowAuthorizationResponse showAuthorization(ShowAuthorizationRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.showAuthorization);
    }

    /**
     * 获取租户给云堡垒机服务委托授权信息
     *
     * 获取租户给云堡垒机服务委托授权信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuthorizationRequest 请求对象
     * @return SyncInvoker<ShowAuthorizationRequest, ShowAuthorizationResponse>
     */
    public SyncInvoker<ShowAuthorizationRequest, ShowAuthorizationResponse> showAuthorizationInvoker(
        ShowAuthorizationRequest request) {
        return new SyncInvoker<>(request, CbhMeta.showAuthorization, hcClient);
    }

    /**
     * 获取创建堡垒机实例所需ECS资源配额
     *
     * 获取当前租户所选择的可用分区里的堡垒机ECS规格是否可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEcsQuotaRequest 请求对象
     * @return ShowEcsQuotaResponse
     */
    public ShowEcsQuotaResponse showEcsQuota(ShowEcsQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.showEcsQuota);
    }

    /**
     * 获取创建堡垒机实例所需ECS资源配额
     *
     * 获取当前租户所选择的可用分区里的堡垒机ECS规格是否可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEcsQuotaRequest 请求对象
     * @return SyncInvoker<ShowEcsQuotaRequest, ShowEcsQuotaResponse>
     */
    public SyncInvoker<ShowEcsQuotaRequest, ShowEcsQuotaResponse> showEcsQuotaInvoker(ShowEcsQuotaRequest request) {
        return new SyncInvoker<>(request, CbhMeta.showEcsQuota, hcClient);
    }

    /**
     * 获取堡垒机实例状态信息
     *
     * 获取堡垒机实例状态信息（未删除实例）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceStatusRequest 请求对象
     * @return ShowInstanceStatusResponse
     */
    public ShowInstanceStatusResponse showInstanceStatus(ShowInstanceStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.showInstanceStatus);
    }

    /**
     * 获取堡垒机实例状态信息
     *
     * 获取堡垒机实例状态信息（未删除实例）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceStatusRequest 请求对象
     * @return SyncInvoker<ShowInstanceStatusRequest, ShowInstanceStatusResponse>
     */
    public SyncInvoker<ShowInstanceStatusRequest, ShowInstanceStatusResponse> showInstanceStatusInvoker(
        ShowInstanceStatusRequest request) {
        return new SyncInvoker<>(request, CbhMeta.showInstanceStatus, hcClient);
    }

    /**
     * 查询堡垒机实例资源的标签信息
     *
     * 查询堡垒机实例资源的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceTagsRequest 请求对象
     * @return ShowInstanceTagsResponse
     */
    public ShowInstanceTagsResponse showInstanceTags(ShowInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.showInstanceTags);
    }

    /**
     * 查询堡垒机实例资源的标签信息
     *
     * 查询堡垒机实例资源的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceTagsRequest 请求对象
     * @return SyncInvoker<ShowInstanceTagsRequest, ShowInstanceTagsResponse>
     */
    public SyncInvoker<ShowInstanceTagsRequest, ShowInstanceTagsResponse> showInstanceTagsInvoker(
        ShowInstanceTagsRequest request) {
        return new SyncInvoker<>(request, CbhMeta.showInstanceTags, hcClient);
    }

    /**
     * 获取运维链接
     *
     * 获取运维链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOmUrlRequest 请求对象
     * @return ShowOmUrlResponse
     */
    public ShowOmUrlResponse showOmUrl(ShowOmUrlRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.showOmUrl);
    }

    /**
     * 获取运维链接
     *
     * 获取运维链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOmUrlRequest 请求对象
     * @return SyncInvoker<ShowOmUrlRequest, ShowOmUrlResponse>
     */
    public SyncInvoker<ShowOmUrlRequest, ShowOmUrlResponse> showOmUrlInvoker(ShowOmUrlRequest request) {
        return new SyncInvoker<>(request, CbhMeta.showOmUrl, hcClient);
    }

    /**
     * 获取堡垒机实例配额
     *
     * 获取堡垒机实例配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return ShowQuotaResponse
     */
    public ShowQuotaResponse showQuota(ShowQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.showQuota);
    }

    /**
     * 获取堡垒机实例配额
     *
     * 获取堡垒机实例配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public SyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaInvoker(ShowQuotaRequest request) {
        return new SyncInvoker<>(request, CbhMeta.showQuota, hcClient);
    }

    /**
     * 启动堡垒机实例
     *
     * 启动云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceRequest 请求对象
     * @return StartInstanceResponse
     */
    public StartInstanceResponse startInstance(StartInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.startInstance);
    }

    /**
     * 启动堡垒机实例
     *
     * 启动云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceRequest 请求对象
     * @return SyncInvoker<StartInstanceRequest, StartInstanceResponse>
     */
    public SyncInvoker<StartInstanceRequest, StartInstanceResponse> startInstanceInvoker(StartInstanceRequest request) {
        return new SyncInvoker<>(request, CbhMeta.startInstance, hcClient);
    }

    /**
     * 关闭堡垒机实例
     *
     * 关闭云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopInstanceRequest 请求对象
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstance(StopInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.stopInstance);
    }

    /**
     * 关闭堡垒机实例
     *
     * 关闭云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopInstanceRequest 请求对象
     * @return SyncInvoker<StopInstanceRequest, StopInstanceResponse>
     */
    public SyncInvoker<StopInstanceRequest, StopInstanceResponse> stopInstanceInvoker(StopInstanceRequest request) {
        return new SyncInvoker<>(request, CbhMeta.stopInstance, hcClient);
    }

    /**
     * 堡垒机实例解绑弹性公网IP
     *
     * 为云堡垒机实例解绑弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UninstallInstanceEipRequest 请求对象
     * @return UninstallInstanceEipResponse
     */
    public UninstallInstanceEipResponse uninstallInstanceEip(UninstallInstanceEipRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.uninstallInstanceEip);
    }

    /**
     * 堡垒机实例解绑弹性公网IP
     *
     * 为云堡垒机实例解绑弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UninstallInstanceEipRequest 请求对象
     * @return SyncInvoker<UninstallInstanceEipRequest, UninstallInstanceEipResponse>
     */
    public SyncInvoker<UninstallInstanceEipRequest, UninstallInstanceEipResponse> uninstallInstanceEipInvoker(
        UninstallInstanceEipRequest request) {
        return new SyncInvoker<>(request, CbhMeta.uninstallInstanceEip, hcClient);
    }

    /**
     * 修改堡垒机实例安全组
     *
     * 修改堡垒机实例安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceSecurityGroupRequest 请求对象
     * @return UpdateInstanceSecurityGroupResponse
     */
    public UpdateInstanceSecurityGroupResponse updateInstanceSecurityGroup(UpdateInstanceSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.updateInstanceSecurityGroup);
    }

    /**
     * 修改堡垒机实例安全组
     *
     * 修改堡垒机实例安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceSecurityGroupRequest 请求对象
     * @return SyncInvoker<UpdateInstanceSecurityGroupRequest, UpdateInstanceSecurityGroupResponse>
     */
    public SyncInvoker<UpdateInstanceSecurityGroupRequest, UpdateInstanceSecurityGroupResponse> updateInstanceSecurityGroupInvoker(
        UpdateInstanceSecurityGroupRequest request) {
        return new SyncInvoker<>(request, CbhMeta.updateInstanceSecurityGroup, hcClient);
    }

    /**
     * 升级堡垒机实例
     *
     * 升级云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeInstanceRequest 请求对象
     * @return UpgradeInstanceResponse
     */
    public UpgradeInstanceResponse upgradeInstance(UpgradeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.upgradeInstance);
    }

    /**
     * 升级堡垒机实例
     *
     * 升级云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeInstanceRequest 请求对象
     * @return SyncInvoker<UpgradeInstanceRequest, UpgradeInstanceResponse>
     */
    public SyncInvoker<UpgradeInstanceRequest, UpgradeInstanceResponse> upgradeInstanceInvoker(
        UpgradeInstanceRequest request) {
        return new SyncInvoker<>(request, CbhMeta.upgradeInstance, hcClient);
    }

}
