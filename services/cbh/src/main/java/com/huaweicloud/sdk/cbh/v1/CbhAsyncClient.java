package com.huaweicloud.sdk.cbh.v1;

import com.huaweicloud.sdk.cbh.v1.model.ChangeInstanceNetworkRequest;
import com.huaweicloud.sdk.cbh.v1.model.ChangeInstanceNetworkResponse;
import com.huaweicloud.sdk.cbh.v1.model.ChangeInstanceOrderRequest;
import com.huaweicloud.sdk.cbh.v1.model.ChangeInstanceOrderResponse;
import com.huaweicloud.sdk.cbh.v1.model.CreateCbhRequest;
import com.huaweicloud.sdk.cbh.v1.model.CreateCbhResponse;
import com.huaweicloud.sdk.cbh.v1.model.CreateInstanceOrderRequest;
import com.huaweicloud.sdk.cbh.v1.model.CreateInstanceOrderResponse;
import com.huaweicloud.sdk.cbh.v1.model.InstallCbhEipRequest;
import com.huaweicloud.sdk.cbh.v1.model.InstallCbhEipResponse;
import com.huaweicloud.sdk.cbh.v1.model.ListCbhInstanceRequest;
import com.huaweicloud.sdk.cbh.v1.model.ListCbhInstanceResponse;
import com.huaweicloud.sdk.cbh.v1.model.ListQuotaStatusRequest;
import com.huaweicloud.sdk.cbh.v1.model.ListQuotaStatusResponse;
import com.huaweicloud.sdk.cbh.v1.model.LoginCbhRequest;
import com.huaweicloud.sdk.cbh.v1.model.LoginCbhResponse;
import com.huaweicloud.sdk.cbh.v1.model.ResetLoginMethodRequest;
import com.huaweicloud.sdk.cbh.v1.model.ResetLoginMethodResponse;
import com.huaweicloud.sdk.cbh.v1.model.ResetPasswordRequest;
import com.huaweicloud.sdk.cbh.v1.model.ResetPasswordResponse;
import com.huaweicloud.sdk.cbh.v1.model.RestartCbhInstanceRequest;
import com.huaweicloud.sdk.cbh.v1.model.RestartCbhInstanceResponse;
import com.huaweicloud.sdk.cbh.v1.model.SearchQuotaRequest;
import com.huaweicloud.sdk.cbh.v1.model.SearchQuotaResponse;
import com.huaweicloud.sdk.cbh.v1.model.ShowAvailableZoneInfoRequest;
import com.huaweicloud.sdk.cbh.v1.model.ShowAvailableZoneInfoResponse;
import com.huaweicloud.sdk.cbh.v1.model.ShowNetworkConfigurationRequest;
import com.huaweicloud.sdk.cbh.v1.model.ShowNetworkConfigurationResponse;
import com.huaweicloud.sdk.cbh.v1.model.StartCbhInstanceRequest;
import com.huaweicloud.sdk.cbh.v1.model.StartCbhInstanceResponse;
import com.huaweicloud.sdk.cbh.v1.model.StopCbhInstanceRequest;
import com.huaweicloud.sdk.cbh.v1.model.StopCbhInstanceResponse;
import com.huaweicloud.sdk.cbh.v1.model.UninstallCbhEipRequest;
import com.huaweicloud.sdk.cbh.v1.model.UninstallCbhEipResponse;
import com.huaweicloud.sdk.cbh.v1.model.UpgradeCbhInstanceRequest;
import com.huaweicloud.sdk.cbh.v1.model.UpgradeCbhInstanceResponse;
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
     * 修改实例网络
     *
     * 修改云堡垒机实例网络。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeInstanceNetworkRequest 请求对象
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
     * @param request ChangeInstanceNetworkRequest 请求对象
     * @return AsyncInvoker<ChangeInstanceNetworkRequest, ChangeInstanceNetworkResponse>
     */
    public AsyncInvoker<ChangeInstanceNetworkRequest, ChangeInstanceNetworkResponse> changeInstanceNetworkAsyncInvoker(
        ChangeInstanceNetworkRequest request) {
        return new AsyncInvoker<>(request, CbhMeta.changeInstanceNetwork, hcClient);
    }

    /**
     * 创建变更云堡垒机实例订单
     *
     * 创建变更云堡垒机实例订单。（调用此接口前先调用创建变更云堡垒机实例任务接口，当前接口未开放）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeInstanceOrderRequest 请求对象
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
     * @param request ChangeInstanceOrderRequest 请求对象
     * @return AsyncInvoker<ChangeInstanceOrderRequest, ChangeInstanceOrderResponse>
     */
    public AsyncInvoker<ChangeInstanceOrderRequest, ChangeInstanceOrderResponse> changeInstanceOrderAsyncInvoker(
        ChangeInstanceOrderRequest request) {
        return new AsyncInvoker<>(request, CbhMeta.changeInstanceOrder, hcClient);
    }

    /**
     * 创建云堡垒机实例
     *
     * 创建云堡垒机实例。（创建云堡垒机实例订单前，先调用此接口）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCbhRequest 请求对象
     * @return CompletableFuture<CreateCbhResponse>
     */
    public CompletableFuture<CreateCbhResponse> createCbhAsync(CreateCbhRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.createCbh);
    }

    /**
     * 创建云堡垒机实例
     *
     * 创建云堡垒机实例。（创建云堡垒机实例订单前，先调用此接口）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCbhRequest 请求对象
     * @return AsyncInvoker<CreateCbhRequest, CreateCbhResponse>
     */
    public AsyncInvoker<CreateCbhRequest, CreateCbhResponse> createCbhAsyncInvoker(CreateCbhRequest request) {
        return new AsyncInvoker<>(request, CbhMeta.createCbh, hcClient);
    }

    /**
     * 创建云堡垒机实例订单
     *
     * 创建云堡垒机实例订单。(调用此接口前先调用创建云堡垒机实例接口)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceOrderRequest 请求对象
     * @return CompletableFuture<CreateInstanceOrderResponse>
     */
    public CompletableFuture<CreateInstanceOrderResponse> createInstanceOrderAsync(CreateInstanceOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.createInstanceOrder);
    }

    /**
     * 创建云堡垒机实例订单
     *
     * 创建云堡垒机实例订单。(调用此接口前先调用创建云堡垒机实例接口)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceOrderRequest 请求对象
     * @return AsyncInvoker<CreateInstanceOrderRequest, CreateInstanceOrderResponse>
     */
    public AsyncInvoker<CreateInstanceOrderRequest, CreateInstanceOrderResponse> createInstanceOrderAsyncInvoker(
        CreateInstanceOrderRequest request) {
        return new AsyncInvoker<>(request, CbhMeta.createInstanceOrder, hcClient);
    }

    /**
     * 绑定弹性公网IP
     *
     * 云堡垒机实例绑定弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallCbhEipRequest 请求对象
     * @return CompletableFuture<InstallCbhEipResponse>
     */
    public CompletableFuture<InstallCbhEipResponse> installCbhEipAsync(InstallCbhEipRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.installCbhEip);
    }

    /**
     * 绑定弹性公网IP
     *
     * 云堡垒机实例绑定弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallCbhEipRequest 请求对象
     * @return AsyncInvoker<InstallCbhEipRequest, InstallCbhEipResponse>
     */
    public AsyncInvoker<InstallCbhEipRequest, InstallCbhEipResponse> installCbhEipAsyncInvoker(
        InstallCbhEipRequest request) {
        return new AsyncInvoker<>(request, CbhMeta.installCbhEip, hcClient);
    }

    /**
     * 获取CBH实例列表
     *
     * 获取当前租户下的云堡垒机实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCbhInstanceRequest 请求对象
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
     * @param request ListCbhInstanceRequest 请求对象
     * @return AsyncInvoker<ListCbhInstanceRequest, ListCbhInstanceResponse>
     */
    public AsyncInvoker<ListCbhInstanceRequest, ListCbhInstanceResponse> listCbhInstanceAsyncInvoker(
        ListCbhInstanceRequest request) {
        return new AsyncInvoker<>(request, CbhMeta.listCbhInstance, hcClient);
    }

    /**
     * 获取弹性云服务器配额
     *
     * 获取当前租户所选择的可用分区、性能规格所对应的弹性云服务器是否可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotaStatusRequest 请求对象
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
     * @param request ListQuotaStatusRequest 请求对象
     * @return AsyncInvoker<ListQuotaStatusRequest, ListQuotaStatusResponse>
     */
    public AsyncInvoker<ListQuotaStatusRequest, ListQuotaStatusResponse> listQuotaStatusAsyncInvoker(
        ListQuotaStatusRequest request) {
        return new AsyncInvoker<>(request, CbhMeta.listQuotaStatus, hcClient);
    }

    /**
     * 重置admin用户多因子认证方式
     *
     * 重置admin用户多因子认证方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetLoginMethodRequest 请求对象
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
     * @param request ResetLoginMethodRequest 请求对象
     * @return AsyncInvoker<ResetLoginMethodRequest, ResetLoginMethodResponse>
     */
    public AsyncInvoker<ResetLoginMethodRequest, ResetLoginMethodResponse> resetLoginMethodAsyncInvoker(
        ResetLoginMethodRequest request) {
        return new AsyncInvoker<>(request, CbhMeta.resetLoginMethod, hcClient);
    }

    /**
     * 修改admin用户密码
     *
     * 修改云堡垒机实例web登录admin用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
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
     * @param request ResetPasswordRequest 请求对象
     * @return AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordAsyncInvoker(
        ResetPasswordRequest request) {
        return new AsyncInvoker<>(request, CbhMeta.resetPassword, hcClient);
    }

    /**
     * 重启云堡垒机实例
     *
     * 重启云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartCbhInstanceRequest 请求对象
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
     * @param request RestartCbhInstanceRequest 请求对象
     * @return AsyncInvoker<RestartCbhInstanceRequest, RestartCbhInstanceResponse>
     */
    public AsyncInvoker<RestartCbhInstanceRequest, RestartCbhInstanceResponse> restartCbhInstanceAsyncInvoker(
        RestartCbhInstanceRequest request) {
        return new AsyncInvoker<>(request, CbhMeta.restartCbhInstance, hcClient);
    }

    /**
     * 查询堡垒机配额
     *
     * 查询云堡垒机配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchQuotaRequest 请求对象
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
     * @param request SearchQuotaRequest 请求对象
     * @return AsyncInvoker<SearchQuotaRequest, SearchQuotaResponse>
     */
    public AsyncInvoker<SearchQuotaRequest, SearchQuotaResponse> searchQuotaAsyncInvoker(SearchQuotaRequest request) {
        return new AsyncInvoker<>(request, CbhMeta.searchQuota, hcClient);
    }

    /**
     * 获取可用用分区信息
     *
     * 获取云堡垒机服务可用分区信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailableZoneInfoRequest 请求对象
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
     * @param request ShowAvailableZoneInfoRequest 请求对象
     * @return AsyncInvoker<ShowAvailableZoneInfoRequest, ShowAvailableZoneInfoResponse>
     */
    public AsyncInvoker<ShowAvailableZoneInfoRequest, ShowAvailableZoneInfoResponse> showAvailableZoneInfoAsyncInvoker(
        ShowAvailableZoneInfoRequest request) {
        return new AsyncInvoker<>(request, CbhMeta.showAvailableZoneInfo, hcClient);
    }

    /**
     * 检查云堡垒机网络
     *
     * 检查云堡垒机实例网络信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkConfigurationRequest 请求对象
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
     * @param request ShowNetworkConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowNetworkConfigurationRequest, ShowNetworkConfigurationResponse>
     */
    public AsyncInvoker<ShowNetworkConfigurationRequest, ShowNetworkConfigurationResponse> showNetworkConfigurationAsyncInvoker(
        ShowNetworkConfigurationRequest request) {
        return new AsyncInvoker<>(request, CbhMeta.showNetworkConfiguration, hcClient);
    }

    /**
     * 启动云堡垒机实例
     *
     * 启动云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartCbhInstanceRequest 请求对象
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
     * @param request StartCbhInstanceRequest 请求对象
     * @return AsyncInvoker<StartCbhInstanceRequest, StartCbhInstanceResponse>
     */
    public AsyncInvoker<StartCbhInstanceRequest, StartCbhInstanceResponse> startCbhInstanceAsyncInvoker(
        StartCbhInstanceRequest request) {
        return new AsyncInvoker<>(request, CbhMeta.startCbhInstance, hcClient);
    }

    /**
     * 关闭云堡垒机实例
     *
     * 关闭云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopCbhInstanceRequest 请求对象
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
     * @param request StopCbhInstanceRequest 请求对象
     * @return AsyncInvoker<StopCbhInstanceRequest, StopCbhInstanceResponse>
     */
    public AsyncInvoker<StopCbhInstanceRequest, StopCbhInstanceResponse> stopCbhInstanceAsyncInvoker(
        StopCbhInstanceRequest request) {
        return new AsyncInvoker<>(request, CbhMeta.stopCbhInstance, hcClient);
    }

    /**
     * 解绑弹性公网IP
     *
     * 云堡垒机实例解绑弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UninstallCbhEipRequest 请求对象
     * @return CompletableFuture<UninstallCbhEipResponse>
     */
    public CompletableFuture<UninstallCbhEipResponse> uninstallCbhEipAsync(UninstallCbhEipRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.uninstallCbhEip);
    }

    /**
     * 解绑弹性公网IP
     *
     * 云堡垒机实例解绑弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UninstallCbhEipRequest 请求对象
     * @return AsyncInvoker<UninstallCbhEipRequest, UninstallCbhEipResponse>
     */
    public AsyncInvoker<UninstallCbhEipRequest, UninstallCbhEipResponse> uninstallCbhEipAsyncInvoker(
        UninstallCbhEipRequest request) {
        return new AsyncInvoker<>(request, CbhMeta.uninstallCbhEip, hcClient);
    }

    /**
     * 升级云堡垒机实例
     *
     * 升级云堡垒机实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeCbhInstanceRequest 请求对象
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
     * @param request UpgradeCbhInstanceRequest 请求对象
     * @return AsyncInvoker<UpgradeCbhInstanceRequest, UpgradeCbhInstanceResponse>
     */
    public AsyncInvoker<UpgradeCbhInstanceRequest, UpgradeCbhInstanceResponse> upgradeCbhInstanceAsyncInvoker(
        UpgradeCbhInstanceRequest request) {
        return new AsyncInvoker<>(request, CbhMeta.upgradeCbhInstance, hcClient);
    }

    /**
     * 获取IAM登录实例链接
     *
     * 获取当前IAM用户登录堡垒机的免登录链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LoginCbhRequest 请求对象
     * @return CompletableFuture<LoginCbhResponse>
     */
    public CompletableFuture<LoginCbhResponse> loginCbhAsync(LoginCbhRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.loginCbh);
    }

    /**
     * 获取IAM登录实例链接
     *
     * 获取当前IAM用户登录堡垒机的免登录链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LoginCbhRequest 请求对象
     * @return AsyncInvoker<LoginCbhRequest, LoginCbhResponse>
     */
    public AsyncInvoker<LoginCbhRequest, LoginCbhResponse> loginCbhAsyncInvoker(LoginCbhRequest request) {
        return new AsyncInvoker<>(request, CbhMeta.loginCbh, hcClient);
    }

}
