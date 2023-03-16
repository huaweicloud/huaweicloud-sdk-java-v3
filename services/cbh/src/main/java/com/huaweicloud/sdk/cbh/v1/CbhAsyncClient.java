package com.huaweicloud.sdk.cbh.v1;

import com.huaweicloud.sdk.cbh.v1.model.*;
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
        return new ClientBuilder<>(CbhAsyncClient::new);
    }

    /**
     * 修改实例网络
     *
     * 修改云堡垒机实例网络。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeInstanceNetworkRequest 请求对象
     * @return CompletableFuture<ChangeInstanceNetworkResponse>
     */
    public CompletableFuture<ChangeInstanceNetworkResponse> changeInstanceNetworkAsync(
        ChangeInstanceNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.changeInstanceNetwork);
    }

    /**
     * 修改实例网络
     *
     * 修改云堡垒机实例网络。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeInstanceNetworkRequest 请求对象
     * @return AsyncInvoker<ChangeInstanceNetworkRequest, ChangeInstanceNetworkResponse>
     */
    public AsyncInvoker<ChangeInstanceNetworkRequest, ChangeInstanceNetworkResponse> changeInstanceNetworkAsyncInvoker(
        ChangeInstanceNetworkRequest request) {
        return new AsyncInvoker<ChangeInstanceNetworkRequest, ChangeInstanceNetworkResponse>(request,
            CbhMeta.changeInstanceNetwork, hcClient);
    }

    /**
     * 创建变更云堡垒机实例订单
     *
     * 创建变更云堡垒机实例订单。（调用此接口前先调用创建变更云堡垒机实例任务接口，当前接口未开放）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeInstanceOrderRequest 请求对象
     * @return CompletableFuture<ChangeInstanceOrderResponse>
     */
    public CompletableFuture<ChangeInstanceOrderResponse> changeInstanceOrderAsync(ChangeInstanceOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.changeInstanceOrder);
    }

    /**
     * 创建变更云堡垒机实例订单
     *
     * 创建变更云堡垒机实例订单。（调用此接口前先调用创建变更云堡垒机实例任务接口，当前接口未开放）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeInstanceOrderRequest 请求对象
     * @return AsyncInvoker<ChangeInstanceOrderRequest, ChangeInstanceOrderResponse>
     */
    public AsyncInvoker<ChangeInstanceOrderRequest, ChangeInstanceOrderResponse> changeInstanceOrderAsyncInvoker(
        ChangeInstanceOrderRequest request) {
        return new AsyncInvoker<ChangeInstanceOrderRequest, ChangeInstanceOrderResponse>(request,
            CbhMeta.changeInstanceOrder, hcClient);
    }

    /**
     * 创建云堡垒机实例
     *
     * 创建云堡垒机实例。（创建云堡垒机实例订单前，先调用此接口）
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
     * 创建云堡垒机实例
     *
     * 创建云堡垒机实例。（创建云堡垒机实例订单前，先调用此接口）
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
     * 创建云堡垒机实例订单
     *
     * 创建云堡垒机实例订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceOrderRequest 请求对象
     * @return CompletableFuture<CreateInstanceOrderResponse>
     */
    public CompletableFuture<CreateInstanceOrderResponse> createInstanceOrderAsync(CreateInstanceOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.createInstanceOrder);
    }

    /**
     * 创建云堡垒机实例订单
     *
     * 创建云堡垒机实例订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceOrderRequest 请求对象
     * @return AsyncInvoker<CreateInstanceOrderRequest, CreateInstanceOrderResponse>
     */
    public AsyncInvoker<CreateInstanceOrderRequest, CreateInstanceOrderResponse> createInstanceOrderAsyncInvoker(
        CreateInstanceOrderRequest request) {
        return new AsyncInvoker<CreateInstanceOrderRequest, CreateInstanceOrderResponse>(request,
            CbhMeta.createInstanceOrder, hcClient);
    }

    /**
     * 绑定弹性公网IP
     *
     * 云堡垒机实例绑定弹性公网IP
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
     * 绑定弹性公网IP
     *
     * 云堡垒机实例绑定弹性公网IP
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
     * 获取CBH实例列表
     *
     * 获取当前租户下的云堡垒机实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCbhInstanceRequest 请求对象
     * @return CompletableFuture<ListCbhInstanceResponse>
     */
    public CompletableFuture<ListCbhInstanceResponse> listCbhInstanceAsync(ListCbhInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.listCbhInstance);
    }

    /**
     * 获取CBH实例列表
     *
     * 获取当前租户下的云堡垒机实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCbhInstanceRequest 请求对象
     * @return AsyncInvoker<ListCbhInstanceRequest, ListCbhInstanceResponse>
     */
    public AsyncInvoker<ListCbhInstanceRequest, ListCbhInstanceResponse> listCbhInstanceAsyncInvoker(
        ListCbhInstanceRequest request) {
        return new AsyncInvoker<ListCbhInstanceRequest, ListCbhInstanceResponse>(request, CbhMeta.listCbhInstance,
            hcClient);
    }

    /**
     * 获取弹性云服务器配额
     *
     * 获取当前租户所选择的可用分区、性能规格所对应的弹性云服务器是否可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaStatusRequest 请求对象
     * @return CompletableFuture<ListQuotaStatusResponse>
     */
    public CompletableFuture<ListQuotaStatusResponse> listQuotaStatusAsync(ListQuotaStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.listQuotaStatus);
    }

    /**
     * 获取弹性云服务器配额
     *
     * 获取当前租户所选择的可用分区、性能规格所对应的弹性云服务器是否可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaStatusRequest 请求对象
     * @return AsyncInvoker<ListQuotaStatusRequest, ListQuotaStatusResponse>
     */
    public AsyncInvoker<ListQuotaStatusRequest, ListQuotaStatusResponse> listQuotaStatusAsyncInvoker(
        ListQuotaStatusRequest request) {
        return new AsyncInvoker<ListQuotaStatusRequest, ListQuotaStatusResponse>(request, CbhMeta.listQuotaStatus,
            hcClient);
    }

    /**
     * 重置admin用户多因子认证方式
     *
     * 重置admin用户多因子认证方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetLoginMethodRequest 请求对象
     * @return CompletableFuture<ResetLoginMethodResponse>
     */
    public CompletableFuture<ResetLoginMethodResponse> resetLoginMethodAsync(ResetLoginMethodRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.resetLoginMethod);
    }

    /**
     * 重置admin用户多因子认证方式
     *
     * 重置admin用户多因子认证方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetLoginMethodRequest 请求对象
     * @return AsyncInvoker<ResetLoginMethodRequest, ResetLoginMethodResponse>
     */
    public AsyncInvoker<ResetLoginMethodRequest, ResetLoginMethodResponse> resetLoginMethodAsyncInvoker(
        ResetLoginMethodRequest request) {
        return new AsyncInvoker<ResetLoginMethodRequest, ResetLoginMethodResponse>(request, CbhMeta.resetLoginMethod,
            hcClient);
    }

    /**
     * 修改admin用户密码
     *
     * 修改云堡垒机实例web登录admin用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetPasswordRequest 请求对象
     * @return CompletableFuture<ResetPasswordResponse>
     */
    public CompletableFuture<ResetPasswordResponse> resetPasswordAsync(ResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.resetPassword);
    }

    /**
     * 修改admin用户密码
     *
     * 修改云堡垒机实例web登录admin用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetPasswordRequest 请求对象
     * @return AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordAsyncInvoker(
        ResetPasswordRequest request) {
        return new AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>(request, CbhMeta.resetPassword, hcClient);
    }

    /**
     * 重启云堡垒机实例
     *
     * 重启云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartCbhInstanceRequest 请求对象
     * @return CompletableFuture<RestartCbhInstanceResponse>
     */
    public CompletableFuture<RestartCbhInstanceResponse> restartCbhInstanceAsync(RestartCbhInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.restartCbhInstance);
    }

    /**
     * 重启云堡垒机实例
     *
     * 重启云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartCbhInstanceRequest 请求对象
     * @return AsyncInvoker<RestartCbhInstanceRequest, RestartCbhInstanceResponse>
     */
    public AsyncInvoker<RestartCbhInstanceRequest, RestartCbhInstanceResponse> restartCbhInstanceAsyncInvoker(
        RestartCbhInstanceRequest request) {
        return new AsyncInvoker<RestartCbhInstanceRequest, RestartCbhInstanceResponse>(request,
            CbhMeta.restartCbhInstance, hcClient);
    }

    /**
     * 查询堡垒机配额
     *
     * 查询云堡垒机配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchQuotaRequest 请求对象
     * @return CompletableFuture<SearchQuotaResponse>
     */
    public CompletableFuture<SearchQuotaResponse> searchQuotaAsync(SearchQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.searchQuota);
    }

    /**
     * 查询堡垒机配额
     *
     * 查询云堡垒机配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchQuotaRequest 请求对象
     * @return AsyncInvoker<SearchQuotaRequest, SearchQuotaResponse>
     */
    public AsyncInvoker<SearchQuotaRequest, SearchQuotaResponse> searchQuotaAsyncInvoker(SearchQuotaRequest request) {
        return new AsyncInvoker<SearchQuotaRequest, SearchQuotaResponse>(request, CbhMeta.searchQuota, hcClient);
    }

    /**
     * 获取可用用分区信息
     *
     * 获取云堡垒机服务可用分区信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAvailableZoneInfoRequest 请求对象
     * @return CompletableFuture<ShowAvailableZoneInfoResponse>
     */
    public CompletableFuture<ShowAvailableZoneInfoResponse> showAvailableZoneInfoAsync(
        ShowAvailableZoneInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.showAvailableZoneInfo);
    }

    /**
     * 获取可用用分区信息
     *
     * 获取云堡垒机服务可用分区信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAvailableZoneInfoRequest 请求对象
     * @return AsyncInvoker<ShowAvailableZoneInfoRequest, ShowAvailableZoneInfoResponse>
     */
    public AsyncInvoker<ShowAvailableZoneInfoRequest, ShowAvailableZoneInfoResponse> showAvailableZoneInfoAsyncInvoker(
        ShowAvailableZoneInfoRequest request) {
        return new AsyncInvoker<ShowAvailableZoneInfoRequest, ShowAvailableZoneInfoResponse>(request,
            CbhMeta.showAvailableZoneInfo, hcClient);
    }

    /**
     * 检查云堡垒机网络
     *
     * 检查云堡垒机实例网络信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNetworkConfigurationRequest 请求对象
     * @return CompletableFuture<ShowNetworkConfigurationResponse>
     */
    public CompletableFuture<ShowNetworkConfigurationResponse> showNetworkConfigurationAsync(
        ShowNetworkConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.showNetworkConfiguration);
    }

    /**
     * 检查云堡垒机网络
     *
     * 检查云堡垒机实例网络信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNetworkConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowNetworkConfigurationRequest, ShowNetworkConfigurationResponse>
     */
    public AsyncInvoker<ShowNetworkConfigurationRequest, ShowNetworkConfigurationResponse> showNetworkConfigurationAsyncInvoker(
        ShowNetworkConfigurationRequest request) {
        return new AsyncInvoker<ShowNetworkConfigurationRequest, ShowNetworkConfigurationResponse>(request,
            CbhMeta.showNetworkConfiguration, hcClient);
    }

    /**
     * 启动云堡垒机实例
     *
     * 启动云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartCbhInstanceRequest 请求对象
     * @return CompletableFuture<StartCbhInstanceResponse>
     */
    public CompletableFuture<StartCbhInstanceResponse> startCbhInstanceAsync(StartCbhInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.startCbhInstance);
    }

    /**
     * 启动云堡垒机实例
     *
     * 启动云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartCbhInstanceRequest 请求对象
     * @return AsyncInvoker<StartCbhInstanceRequest, StartCbhInstanceResponse>
     */
    public AsyncInvoker<StartCbhInstanceRequest, StartCbhInstanceResponse> startCbhInstanceAsyncInvoker(
        StartCbhInstanceRequest request) {
        return new AsyncInvoker<StartCbhInstanceRequest, StartCbhInstanceResponse>(request, CbhMeta.startCbhInstance,
            hcClient);
    }

    /**
     * 关闭云堡垒机实例
     *
     * 关闭云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopCbhInstanceRequest 请求对象
     * @return CompletableFuture<StopCbhInstanceResponse>
     */
    public CompletableFuture<StopCbhInstanceResponse> stopCbhInstanceAsync(StopCbhInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.stopCbhInstance);
    }

    /**
     * 关闭云堡垒机实例
     *
     * 关闭云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopCbhInstanceRequest 请求对象
     * @return AsyncInvoker<StopCbhInstanceRequest, StopCbhInstanceResponse>
     */
    public AsyncInvoker<StopCbhInstanceRequest, StopCbhInstanceResponse> stopCbhInstanceAsyncInvoker(
        StopCbhInstanceRequest request) {
        return new AsyncInvoker<StopCbhInstanceRequest, StopCbhInstanceResponse>(request, CbhMeta.stopCbhInstance,
            hcClient);
    }

    /**
     * 解绑弹性公网IP
     *
     * 云堡垒机实例解绑弹性公网IP。
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
     * 解绑弹性公网IP
     *
     * 云堡垒机实例解绑弹性公网IP。
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
     * 升级云堡垒机实例
     *
     * 升级云堡垒机实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeCbhInstanceRequest 请求对象
     * @return CompletableFuture<UpgradeCbhInstanceResponse>
     */
    public CompletableFuture<UpgradeCbhInstanceResponse> upgradeCbhInstanceAsync(UpgradeCbhInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.upgradeCbhInstance);
    }

    /**
     * 升级云堡垒机实例
     *
     * 升级云堡垒机实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeCbhInstanceRequest 请求对象
     * @return AsyncInvoker<UpgradeCbhInstanceRequest, UpgradeCbhInstanceResponse>
     */
    public AsyncInvoker<UpgradeCbhInstanceRequest, UpgradeCbhInstanceResponse> upgradeCbhInstanceAsyncInvoker(
        UpgradeCbhInstanceRequest request) {
        return new AsyncInvoker<UpgradeCbhInstanceRequest, UpgradeCbhInstanceResponse>(request,
            CbhMeta.upgradeCbhInstance, hcClient);
    }

}
