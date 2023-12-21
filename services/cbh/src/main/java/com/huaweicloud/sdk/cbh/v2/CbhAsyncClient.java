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
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CbhAsyncClient {

    protected HcClient hcClient;

    public CbhAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CbhAsyncClient> newBuilder() {
        ClientBuilder<CbhAsyncClient> clientBuilder = new ClientBuilder<>(CbhAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 操作堡垒机实例资源标签
     *
     * 操作堡垒机实例资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateInstanceTagRequest 请求对象
     * @return CompletableFuture<BatchCreateInstanceTagResponse>
     */
    public CompletableFuture<BatchCreateInstanceTagResponse> batchCreateInstanceTagAsync(
        BatchCreateInstanceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.batchCreateInstanceTag);
    }

    /**
     * 操作堡垒机实例资源标签
     *
     * 操作堡垒机实例资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateInstanceTagRequest 请求对象
     * @return AsyncInvoker<BatchCreateInstanceTagRequest, BatchCreateInstanceTagResponse>
     */
    public AsyncInvoker<BatchCreateInstanceTagRequest, BatchCreateInstanceTagResponse> batchCreateInstanceTagAsyncInvoker(
        BatchCreateInstanceTagRequest request) {
        return new AsyncInvoker<BatchCreateInstanceTagRequest, BatchCreateInstanceTagResponse>(request,
            CbhMeta.batchCreateInstanceTag, hcClient);
    }

    /**
     * 统计符合标签条件的实例数量
     *
     * 统计符合标签条件的实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountInstancesByTagRequest 请求对象
     * @return CompletableFuture<CountInstancesByTagResponse>
     */
    public CompletableFuture<CountInstancesByTagResponse> countInstancesByTagAsync(CountInstancesByTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.countInstancesByTag);
    }

    /**
     * 统计符合标签条件的实例数量
     *
     * 统计符合标签条件的实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountInstancesByTagRequest 请求对象
     * @return AsyncInvoker<CountInstancesByTagRequest, CountInstancesByTagResponse>
     */
    public AsyncInvoker<CountInstancesByTagRequest, CountInstancesByTagResponse> countInstancesByTagAsyncInvoker(
        CountInstancesByTagRequest request) {
        return new AsyncInvoker<CountInstancesByTagRequest, CountInstancesByTagResponse>(request,
            CbhMeta.countInstancesByTag, hcClient);
    }

    /**
     * 创建堡垒机实例
     *
     * 创建云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.createInstance);
    }

    /**
     * 创建堡垒机实例
     *
     * 创建云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, CbhMeta.createInstance,
            hcClient);
    }

    /**
     * 删除故障和按需云堡垒机实例
     *
     * 删除云堡垒机故障实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.deleteInstance);
    }

    /**
     * 删除故障和按需云堡垒机实例
     *
     * 删除云堡垒机故障实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, CbhMeta.deleteInstance,
            hcClient);
    }

    /**
     * 堡垒机实例绑定弹性公网IP
     *
     * 云堡垒机实例绑定弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param InstallInstanceEipRequest 请求对象
     * @return CompletableFuture<InstallInstanceEipResponse>
     */
    public CompletableFuture<InstallInstanceEipResponse> installInstanceEipAsync(InstallInstanceEipRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.installInstanceEip);
    }

    /**
     * 堡垒机实例绑定弹性公网IP
     *
     * 云堡垒机实例绑定弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param InstallInstanceEipRequest 请求对象
     * @return AsyncInvoker<InstallInstanceEipRequest, InstallInstanceEipResponse>
     */
    public AsyncInvoker<InstallInstanceEipRequest, InstallInstanceEipResponse> installInstanceEipAsyncInvoker(
        InstallInstanceEipRequest request) {
        return new AsyncInvoker<InstallInstanceEipRequest, InstallInstanceEipResponse>(request,
            CbhMeta.installInstanceEip, hcClient);
    }

    /**
     * 获取服务可用区信息
     *
     * 获取云堡垒机服务可用区信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailableZonesRequest 请求对象
     * @return CompletableFuture<ListAvailableZonesResponse>
     */
    public CompletableFuture<ListAvailableZonesResponse> listAvailableZonesAsync(ListAvailableZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.listAvailableZones);
    }

    /**
     * 获取服务可用区信息
     *
     * 获取云堡垒机服务可用区信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailableZonesRequest 请求对象
     * @return AsyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse>
     */
    public AsyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZonesAsyncInvoker(
        ListAvailableZonesRequest request) {
        return new AsyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse>(request,
            CbhMeta.listAvailableZones, hcClient);
    }

    /**
     * 获取堡垒机实例列表
     *
     * 获取当前租户下的堡垒机实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.listInstances);
    }

    /**
     * 获取堡垒机实例列表
     *
     * 获取当前租户下的堡垒机实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, CbhMeta.listInstances, hcClient);
    }

    /**
     * 使用标签过滤实例
     *
     * 使用标签过滤实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesByTagRequest 请求对象
     * @return CompletableFuture<ListInstancesByTagResponse>
     */
    public CompletableFuture<ListInstancesByTagResponse> listInstancesByTagAsync(ListInstancesByTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.listInstancesByTag);
    }

    /**
     * 使用标签过滤实例
     *
     * 使用标签过滤实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesByTagRequest 请求对象
     * @return AsyncInvoker<ListInstancesByTagRequest, ListInstancesByTagResponse>
     */
    public AsyncInvoker<ListInstancesByTagRequest, ListInstancesByTagResponse> listInstancesByTagAsyncInvoker(
        ListInstancesByTagRequest request) {
        return new AsyncInvoker<ListInstancesByTagRequest, ListInstancesByTagResponse>(request,
            CbhMeta.listInstancesByTag, hcClient);
    }

    /**
     * 查询云堡垒机规格信息
     *
     * 查询云堡垒机规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSpecificationsRequest 请求对象
     * @return CompletableFuture<ListSpecificationsResponse>
     */
    public CompletableFuture<ListSpecificationsResponse> listSpecificationsAsync(ListSpecificationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.listSpecifications);
    }

    /**
     * 查询云堡垒机规格信息
     *
     * 查询云堡垒机规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSpecificationsRequest 请求对象
     * @return AsyncInvoker<ListSpecificationsRequest, ListSpecificationsResponse>
     */
    public AsyncInvoker<ListSpecificationsRequest, ListSpecificationsResponse> listSpecificationsAsyncInvoker(
        ListSpecificationsRequest request) {
        return new AsyncInvoker<ListSpecificationsRequest, ListSpecificationsResponse>(request,
            CbhMeta.listSpecifications, hcClient);
    }

    /**
     * 查询租户在项目中的资源标签集合
     *
     * 查询租户在项目中的资源标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
     * @return CompletableFuture<ListTagsResponse>
     */
    public CompletableFuture<ListTagsResponse> listTagsAsync(ListTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.listTags);
    }

    /**
     * 查询租户在项目中的资源标签集合
     *
     * 查询租户在项目中的资源标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
     * @return AsyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public AsyncInvoker<ListTagsRequest, ListTagsResponse> listTagsAsyncInvoker(ListTagsRequest request) {
        return new AsyncInvoker<ListTagsRequest, ListTagsResponse>(request, CbhMeta.listTags, hcClient);
    }

    /**
     * IAM用户登录堡垒机实例console
     *
     * IAM用户登录堡垒机实例console。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param LoginInstanceRequest 请求对象
     * @return CompletableFuture<LoginInstanceResponse>
     */
    public CompletableFuture<LoginInstanceResponse> loginInstanceAsync(LoginInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.loginInstance);
    }

    /**
     * IAM用户登录堡垒机实例console
     *
     * IAM用户登录堡垒机实例console。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param LoginInstanceRequest 请求对象
     * @return AsyncInvoker<LoginInstanceRequest, LoginInstanceResponse>
     */
    public AsyncInvoker<LoginInstanceRequest, LoginInstanceResponse> loginInstanceAsyncInvoker(
        LoginInstanceRequest request) {
        return new AsyncInvoker<LoginInstanceRequest, LoginInstanceResponse>(request, CbhMeta.loginInstance, hcClient);
    }

    /**
     * 重启堡垒机实例
     *
     * 重启云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RebootInstanceRequest 请求对象
     * @return CompletableFuture<RebootInstanceResponse>
     */
    public CompletableFuture<RebootInstanceResponse> rebootInstanceAsync(RebootInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.rebootInstance);
    }

    /**
     * 重启堡垒机实例
     *
     * 重启云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RebootInstanceRequest 请求对象
     * @return AsyncInvoker<RebootInstanceRequest, RebootInstanceResponse>
     */
    public AsyncInvoker<RebootInstanceRequest, RebootInstanceResponse> rebootInstanceAsyncInvoker(
        RebootInstanceRequest request) {
        return new AsyncInvoker<RebootInstanceRequest, RebootInstanceResponse>(request, CbhMeta.rebootInstance,
            hcClient);
    }

    /**
     * 租户创建或取消云堡垒机服务的委托授权
     *
     * 租户创建或取消云堡垒机服务的委托授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterAuthorizationRequest 请求对象
     * @return CompletableFuture<RegisterAuthorizationResponse>
     */
    public CompletableFuture<RegisterAuthorizationResponse> registerAuthorizationAsync(
        RegisterAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.registerAuthorization);
    }

    /**
     * 租户创建或取消云堡垒机服务的委托授权
     *
     * 租户创建或取消云堡垒机服务的委托授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterAuthorizationRequest 请求对象
     * @return AsyncInvoker<RegisterAuthorizationRequest, RegisterAuthorizationResponse>
     */
    public AsyncInvoker<RegisterAuthorizationRequest, RegisterAuthorizationResponse> registerAuthorizationAsyncInvoker(
        RegisterAuthorizationRequest request) {
        return new AsyncInvoker<RegisterAuthorizationRequest, RegisterAuthorizationResponse>(request,
            CbhMeta.registerAuthorization, hcClient);
    }

    /**
     * 重置堡垒机实例admin登录方式
     *
     * 重置堡垒机实例admin用户登录方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetInstanceLoginMethodRequest 请求对象
     * @return CompletableFuture<ResetInstanceLoginMethodResponse>
     */
    public CompletableFuture<ResetInstanceLoginMethodResponse> resetInstanceLoginMethodAsync(
        ResetInstanceLoginMethodRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.resetInstanceLoginMethod);
    }

    /**
     * 重置堡垒机实例admin登录方式
     *
     * 重置堡垒机实例admin用户登录方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetInstanceLoginMethodRequest 请求对象
     * @return AsyncInvoker<ResetInstanceLoginMethodRequest, ResetInstanceLoginMethodResponse>
     */
    public AsyncInvoker<ResetInstanceLoginMethodRequest, ResetInstanceLoginMethodResponse> resetInstanceLoginMethodAsyncInvoker(
        ResetInstanceLoginMethodRequest request) {
        return new AsyncInvoker<ResetInstanceLoginMethodRequest, ResetInstanceLoginMethodResponse>(request,
            CbhMeta.resetInstanceLoginMethod, hcClient);
    }

    /**
     * 重置堡垒机实例admin密码
     *
     * 重置云堡垒机实例web登录admin用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetInstancePasswordRequest 请求对象
     * @return CompletableFuture<ResetInstancePasswordResponse>
     */
    public CompletableFuture<ResetInstancePasswordResponse> resetInstancePasswordAsync(
        ResetInstancePasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.resetInstancePassword);
    }

    /**
     * 重置堡垒机实例admin密码
     *
     * 重置云堡垒机实例web登录admin用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetInstancePasswordRequest 请求对象
     * @return AsyncInvoker<ResetInstancePasswordRequest, ResetInstancePasswordResponse>
     */
    public AsyncInvoker<ResetInstancePasswordRequest, ResetInstancePasswordResponse> resetInstancePasswordAsyncInvoker(
        ResetInstancePasswordRequest request) {
        return new AsyncInvoker<ResetInstancePasswordRequest, ResetInstancePasswordResponse>(request,
            CbhMeta.resetInstancePassword, hcClient);
    }

    /**
     * 变更堡垒机实例
     *
     * 变更云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceRequest 请求对象
     * @return CompletableFuture<ResizeInstanceResponse>
     */
    public CompletableFuture<ResizeInstanceResponse> resizeInstanceAsync(ResizeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.resizeInstance);
    }

    /**
     * 变更堡垒机实例
     *
     * 变更云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceAsyncInvoker(
        ResizeInstanceRequest request) {
        return new AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>(request, CbhMeta.resizeInstance,
            hcClient);
    }

    /**
     * 回退升级的堡垒机实例
     *
     * 回退升级的云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RollbackInstanceRequest 请求对象
     * @return CompletableFuture<RollbackInstanceResponse>
     */
    public CompletableFuture<RollbackInstanceResponse> rollbackInstanceAsync(RollbackInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.rollbackInstance);
    }

    /**
     * 回退升级的堡垒机实例
     *
     * 回退升级的云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RollbackInstanceRequest 请求对象
     * @return AsyncInvoker<RollbackInstanceRequest, RollbackInstanceResponse>
     */
    public AsyncInvoker<RollbackInstanceRequest, RollbackInstanceResponse> rollbackInstanceAsyncInvoker(
        RollbackInstanceRequest request) {
        return new AsyncInvoker<RollbackInstanceRequest, RollbackInstanceResponse>(request, CbhMeta.rollbackInstance,
            hcClient);
    }

    /**
     * 获取租户给云堡垒机服务委托授权信息
     *
     * 获取租户给云堡垒机服务委托授权信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAuthorizationRequest 请求对象
     * @return CompletableFuture<ShowAuthorizationResponse>
     */
    public CompletableFuture<ShowAuthorizationResponse> showAuthorizationAsync(ShowAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.showAuthorization);
    }

    /**
     * 获取租户给云堡垒机服务委托授权信息
     *
     * 获取租户给云堡垒机服务委托授权信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAuthorizationRequest 请求对象
     * @return AsyncInvoker<ShowAuthorizationRequest, ShowAuthorizationResponse>
     */
    public AsyncInvoker<ShowAuthorizationRequest, ShowAuthorizationResponse> showAuthorizationAsyncInvoker(
        ShowAuthorizationRequest request) {
        return new AsyncInvoker<ShowAuthorizationRequest, ShowAuthorizationResponse>(request, CbhMeta.showAuthorization,
            hcClient);
    }

    /**
     * 获取创建堡垒机实例所需ECS资源配额
     *
     * 获取当前租户所选择的可用分区里的堡垒机ECS规格是否可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEcsQuotaRequest 请求对象
     * @return CompletableFuture<ShowEcsQuotaResponse>
     */
    public CompletableFuture<ShowEcsQuotaResponse> showEcsQuotaAsync(ShowEcsQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.showEcsQuota);
    }

    /**
     * 获取创建堡垒机实例所需ECS资源配额
     *
     * 获取当前租户所选择的可用分区里的堡垒机ECS规格是否可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEcsQuotaRequest 请求对象
     * @return AsyncInvoker<ShowEcsQuotaRequest, ShowEcsQuotaResponse>
     */
    public AsyncInvoker<ShowEcsQuotaRequest, ShowEcsQuotaResponse> showEcsQuotaAsyncInvoker(
        ShowEcsQuotaRequest request) {
        return new AsyncInvoker<ShowEcsQuotaRequest, ShowEcsQuotaResponse>(request, CbhMeta.showEcsQuota, hcClient);
    }

    /**
     * 获取堡垒机实例状态信息
     *
     * 获取堡垒机实例状态信息（未删除实例）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceStatusRequest 请求对象
     * @return CompletableFuture<ShowInstanceStatusResponse>
     */
    public CompletableFuture<ShowInstanceStatusResponse> showInstanceStatusAsync(ShowInstanceStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.showInstanceStatus);
    }

    /**
     * 获取堡垒机实例状态信息
     *
     * 获取堡垒机实例状态信息（未删除实例）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceStatusRequest 请求对象
     * @return AsyncInvoker<ShowInstanceStatusRequest, ShowInstanceStatusResponse>
     */
    public AsyncInvoker<ShowInstanceStatusRequest, ShowInstanceStatusResponse> showInstanceStatusAsyncInvoker(
        ShowInstanceStatusRequest request) {
        return new AsyncInvoker<ShowInstanceStatusRequest, ShowInstanceStatusResponse>(request,
            CbhMeta.showInstanceStatus, hcClient);
    }

    /**
     * 查询堡垒机实例资源的标签信息
     *
     * 查询堡垒机实例资源的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceTagsRequest 请求对象
     * @return CompletableFuture<ShowInstanceTagsResponse>
     */
    public CompletableFuture<ShowInstanceTagsResponse> showInstanceTagsAsync(ShowInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.showInstanceTags);
    }

    /**
     * 查询堡垒机实例资源的标签信息
     *
     * 查询堡垒机实例资源的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ShowInstanceTagsRequest, ShowInstanceTagsResponse>
     */
    public AsyncInvoker<ShowInstanceTagsRequest, ShowInstanceTagsResponse> showInstanceTagsAsyncInvoker(
        ShowInstanceTagsRequest request) {
        return new AsyncInvoker<ShowInstanceTagsRequest, ShowInstanceTagsResponse>(request, CbhMeta.showInstanceTags,
            hcClient);
    }

    /**
     * 获取运维链接
     *
     * 获取运维链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOmUrlRequest 请求对象
     * @return CompletableFuture<ShowOmUrlResponse>
     */
    public CompletableFuture<ShowOmUrlResponse> showOmUrlAsync(ShowOmUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.showOmUrl);
    }

    /**
     * 获取运维链接
     *
     * 获取运维链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOmUrlRequest 请求对象
     * @return AsyncInvoker<ShowOmUrlRequest, ShowOmUrlResponse>
     */
    public AsyncInvoker<ShowOmUrlRequest, ShowOmUrlResponse> showOmUrlAsyncInvoker(ShowOmUrlRequest request) {
        return new AsyncInvoker<ShowOmUrlRequest, ShowOmUrlResponse>(request, CbhMeta.showOmUrl, hcClient);
    }

    /**
     * 获取堡垒机实例配额
     *
     * 获取堡垒机实例配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotaRequest 请求对象
     * @return CompletableFuture<ShowQuotaResponse>
     */
    public CompletableFuture<ShowQuotaResponse> showQuotaAsync(ShowQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.showQuota);
    }

    /**
     * 获取堡垒机实例配额
     *
     * 获取堡垒机实例配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotaRequest 请求对象
     * @return AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaAsyncInvoker(ShowQuotaRequest request) {
        return new AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse>(request, CbhMeta.showQuota, hcClient);
    }

    /**
     * 启动堡垒机实例
     *
     * 启动云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartInstanceRequest 请求对象
     * @return CompletableFuture<StartInstanceResponse>
     */
    public CompletableFuture<StartInstanceResponse> startInstanceAsync(StartInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.startInstance);
    }

    /**
     * 启动堡垒机实例
     *
     * 启动云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartInstanceRequest 请求对象
     * @return AsyncInvoker<StartInstanceRequest, StartInstanceResponse>
     */
    public AsyncInvoker<StartInstanceRequest, StartInstanceResponse> startInstanceAsyncInvoker(
        StartInstanceRequest request) {
        return new AsyncInvoker<StartInstanceRequest, StartInstanceResponse>(request, CbhMeta.startInstance, hcClient);
    }

    /**
     * 关闭堡垒机实例
     *
     * 关闭云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopInstanceRequest 请求对象
     * @return CompletableFuture<StopInstanceResponse>
     */
    public CompletableFuture<StopInstanceResponse> stopInstanceAsync(StopInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.stopInstance);
    }

    /**
     * 关闭堡垒机实例
     *
     * 关闭云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopInstanceRequest 请求对象
     * @return AsyncInvoker<StopInstanceRequest, StopInstanceResponse>
     */
    public AsyncInvoker<StopInstanceRequest, StopInstanceResponse> stopInstanceAsyncInvoker(
        StopInstanceRequest request) {
        return new AsyncInvoker<StopInstanceRequest, StopInstanceResponse>(request, CbhMeta.stopInstance, hcClient);
    }

    /**
     * 堡垒机实例解绑弹性公网IP
     *
     * 为云堡垒机实例解绑弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UninstallInstanceEipRequest 请求对象
     * @return CompletableFuture<UninstallInstanceEipResponse>
     */
    public CompletableFuture<UninstallInstanceEipResponse> uninstallInstanceEipAsync(
        UninstallInstanceEipRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.uninstallInstanceEip);
    }

    /**
     * 堡垒机实例解绑弹性公网IP
     *
     * 为云堡垒机实例解绑弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UninstallInstanceEipRequest 请求对象
     * @return AsyncInvoker<UninstallInstanceEipRequest, UninstallInstanceEipResponse>
     */
    public AsyncInvoker<UninstallInstanceEipRequest, UninstallInstanceEipResponse> uninstallInstanceEipAsyncInvoker(
        UninstallInstanceEipRequest request) {
        return new AsyncInvoker<UninstallInstanceEipRequest, UninstallInstanceEipResponse>(request,
            CbhMeta.uninstallInstanceEip, hcClient);
    }

    /**
     * 修改堡垒机实例安全组
     *
     * 修改堡垒机实例安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceSecurityGroupRequest 请求对象
     * @return CompletableFuture<UpdateInstanceSecurityGroupResponse>
     */
    public CompletableFuture<UpdateInstanceSecurityGroupResponse> updateInstanceSecurityGroupAsync(
        UpdateInstanceSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.updateInstanceSecurityGroup);
    }

    /**
     * 修改堡垒机实例安全组
     *
     * 修改堡垒机实例安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceSecurityGroupRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceSecurityGroupRequest, UpdateInstanceSecurityGroupResponse>
     */
    public AsyncInvoker<UpdateInstanceSecurityGroupRequest, UpdateInstanceSecurityGroupResponse> updateInstanceSecurityGroupAsyncInvoker(
        UpdateInstanceSecurityGroupRequest request) {
        return new AsyncInvoker<UpdateInstanceSecurityGroupRequest, UpdateInstanceSecurityGroupResponse>(request,
            CbhMeta.updateInstanceSecurityGroup, hcClient);
    }

    /**
     * 升级堡垒机实例
     *
     * 升级云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeInstanceRequest 请求对象
     * @return CompletableFuture<UpgradeInstanceResponse>
     */
    public CompletableFuture<UpgradeInstanceResponse> upgradeInstanceAsync(UpgradeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.upgradeInstance);
    }

    /**
     * 升级堡垒机实例
     *
     * 升级云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeInstanceRequest 请求对象
     * @return AsyncInvoker<UpgradeInstanceRequest, UpgradeInstanceResponse>
     */
    public AsyncInvoker<UpgradeInstanceRequest, UpgradeInstanceResponse> upgradeInstanceAsyncInvoker(
        UpgradeInstanceRequest request) {
        return new AsyncInvoker<UpgradeInstanceRequest, UpgradeInstanceResponse>(request, CbhMeta.upgradeInstance,
            hcClient);
    }

}
