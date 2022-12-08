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
     * 修改CBH实例网络
     *
     * 修改CBH实例网络
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
     * 修改CBH实例网络
     *
     * 修改CBH实例网络
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
     * 创建CBH实例
     *
     * 创建CBH实例
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
     * 创建CBH实例
     *
     * 创建CBH实例
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
     * 创建CBH实例订单
     *
     * 创建CBH实例订单
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
     * 创建CBH实例订单
     *
     * 创建CBH实例订单
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
     * 获取CBH实例列表
     *
     * 获取CBH实例列表
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
     * 获取CBH实例列表
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
     * 重启CBH实例
     *
     * 重启CBH实例
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
     * 重启CBH实例
     *
     * 重启CBH实例
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
     * 查询堡垒机配额
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
     * 查询堡垒机配额
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
     * 获取CBH服务可用分区信息
     *
     * 获取CBH服务可用分区信息
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
     * 获取CBH服务可用分区信息
     *
     * 获取CBH服务可用分区信息
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
     * 检查网络接口
     *
     * 检查网络接口
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
     * 检查网络接口
     *
     * 检查网络接口
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
     * 启动CBH实例
     *
     * 启动CBH实例
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
     * 启动CBH实例
     *
     * 启动CBH实例
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
     * 升级CBH实例
     *
     * 升级CBH实例
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
     * 升级CBH实例
     *
     * 升级CBH实例
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

    /**
     * 修改admin用户多因子认证方式
     *
     * 修改admin用户多因子认证方式
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
     * 修改admin用户多因子认证方式
     *
     * 修改admin用户多因子认证方式
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
     * 修改admin密码
     *
     * 修改admin密码
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
     * 修改admin密码
     *
     * 修改admin密码
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
     * 关闭CBH实例
     *
     * 关闭CBH实例
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
     * 关闭CBH实例
     *
     * 关闭CBH实例
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
     * 获取ECS配额
     *
     * 获取当前租户所选择的可用分区、性能规格所对应的ECS flavor是否可用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaStateRequest 请求对象
     * @return CompletableFuture<ListQuotaStateResponse>
     */
    public CompletableFuture<ListQuotaStateResponse> listQuotaStateAsync(ListQuotaStateRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.listQuotaState);
    }

    /**
     * 获取ECS配额
     *
     * 获取当前租户所选择的可用分区、性能规格所对应的ECS flavor是否可用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaStateRequest 请求对象
     * @return AsyncInvoker<ListQuotaStateRequest, ListQuotaStateResponse>
     */
    public AsyncInvoker<ListQuotaStateRequest, ListQuotaStateResponse> listQuotaStateAsyncInvoker(
        ListQuotaStateRequest request) {
        return new AsyncInvoker<ListQuotaStateRequest, ListQuotaStateResponse>(request, CbhMeta.listQuotaState,
            hcClient);
    }

    /**
     * 绑定CBH实例Eip
     *
     * 绑定CBH实例Eip
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
     * 绑定CBH实例Eip
     *
     * 绑定CBH实例Eip
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
     * 解绑CBH实例Eip
     *
     * 解绑CBH实例Eip
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
     * 解绑CBH实例Eip
     *
     * 解绑CBH实例Eip
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

}
