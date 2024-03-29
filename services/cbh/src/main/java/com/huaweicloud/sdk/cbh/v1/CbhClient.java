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
     * 修改实例网络
     *
     * 修改云堡垒机实例网络。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeInstanceNetworkRequest 请求对象
     * @return ChangeInstanceNetworkResponse
     */
    public ChangeInstanceNetworkResponse changeInstanceNetwork(ChangeInstanceNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.changeInstanceNetwork);
    }

    /**
     * 修改实例网络
     *
     * 修改云堡垒机实例网络。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeInstanceNetworkRequest 请求对象
     * @return SyncInvoker<ChangeInstanceNetworkRequest, ChangeInstanceNetworkResponse>
     */
    public SyncInvoker<ChangeInstanceNetworkRequest, ChangeInstanceNetworkResponse> changeInstanceNetworkInvoker(
        ChangeInstanceNetworkRequest request) {
        return new SyncInvoker<>(request, CbhMeta.changeInstanceNetwork, hcClient);
    }

    /**
     * 创建变更云堡垒机实例订单
     *
     * 创建变更云堡垒机实例订单。（调用此接口前先调用创建变更云堡垒机实例任务接口，当前接口未开放）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeInstanceOrderRequest 请求对象
     * @return ChangeInstanceOrderResponse
     */
    public ChangeInstanceOrderResponse changeInstanceOrder(ChangeInstanceOrderRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.changeInstanceOrder);
    }

    /**
     * 创建变更云堡垒机实例订单
     *
     * 创建变更云堡垒机实例订单。（调用此接口前先调用创建变更云堡垒机实例任务接口，当前接口未开放）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeInstanceOrderRequest 请求对象
     * @return SyncInvoker<ChangeInstanceOrderRequest, ChangeInstanceOrderResponse>
     */
    public SyncInvoker<ChangeInstanceOrderRequest, ChangeInstanceOrderResponse> changeInstanceOrderInvoker(
        ChangeInstanceOrderRequest request) {
        return new SyncInvoker<>(request, CbhMeta.changeInstanceOrder, hcClient);
    }

    /**
     * 创建云堡垒机实例
     *
     * 创建云堡垒机实例。（创建云堡垒机实例订单前，先调用此接口）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCbhRequest 请求对象
     * @return CreateCbhResponse
     */
    public CreateCbhResponse createCbh(CreateCbhRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.createCbh);
    }

    /**
     * 创建云堡垒机实例
     *
     * 创建云堡垒机实例。（创建云堡垒机实例订单前，先调用此接口）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCbhRequest 请求对象
     * @return SyncInvoker<CreateCbhRequest, CreateCbhResponse>
     */
    public SyncInvoker<CreateCbhRequest, CreateCbhResponse> createCbhInvoker(CreateCbhRequest request) {
        return new SyncInvoker<>(request, CbhMeta.createCbh, hcClient);
    }

    /**
     * 创建云堡垒机实例订单
     *
     * 创建云堡垒机实例订单。(调用此接口前先调用创建云堡垒机实例接口)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceOrderRequest 请求对象
     * @return CreateInstanceOrderResponse
     */
    public CreateInstanceOrderResponse createInstanceOrder(CreateInstanceOrderRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.createInstanceOrder);
    }

    /**
     * 创建云堡垒机实例订单
     *
     * 创建云堡垒机实例订单。(调用此接口前先调用创建云堡垒机实例接口)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceOrderRequest 请求对象
     * @return SyncInvoker<CreateInstanceOrderRequest, CreateInstanceOrderResponse>
     */
    public SyncInvoker<CreateInstanceOrderRequest, CreateInstanceOrderResponse> createInstanceOrderInvoker(
        CreateInstanceOrderRequest request) {
        return new SyncInvoker<>(request, CbhMeta.createInstanceOrder, hcClient);
    }

    /**
     * 绑定弹性公网IP
     *
     * 云堡垒机实例绑定弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallCbhEipRequest 请求对象
     * @return InstallCbhEipResponse
     */
    public InstallCbhEipResponse installCbhEip(InstallCbhEipRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.installCbhEip);
    }

    /**
     * 绑定弹性公网IP
     *
     * 云堡垒机实例绑定弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallCbhEipRequest 请求对象
     * @return SyncInvoker<InstallCbhEipRequest, InstallCbhEipResponse>
     */
    public SyncInvoker<InstallCbhEipRequest, InstallCbhEipResponse> installCbhEipInvoker(InstallCbhEipRequest request) {
        return new SyncInvoker<>(request, CbhMeta.installCbhEip, hcClient);
    }

    /**
     * 获取CBH实例列表
     *
     * 获取当前租户下的云堡垒机实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCbhInstanceRequest 请求对象
     * @return ListCbhInstanceResponse
     */
    public ListCbhInstanceResponse listCbhInstance(ListCbhInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.listCbhInstance);
    }

    /**
     * 获取CBH实例列表
     *
     * 获取当前租户下的云堡垒机实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCbhInstanceRequest 请求对象
     * @return SyncInvoker<ListCbhInstanceRequest, ListCbhInstanceResponse>
     */
    public SyncInvoker<ListCbhInstanceRequest, ListCbhInstanceResponse> listCbhInstanceInvoker(
        ListCbhInstanceRequest request) {
        return new SyncInvoker<>(request, CbhMeta.listCbhInstance, hcClient);
    }

    /**
     * 获取弹性云服务器配额
     *
     * 获取当前租户所选择的可用分区、性能规格所对应的弹性云服务器是否可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotaStatusRequest 请求对象
     * @return ListQuotaStatusResponse
     */
    public ListQuotaStatusResponse listQuotaStatus(ListQuotaStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.listQuotaStatus);
    }

    /**
     * 获取弹性云服务器配额
     *
     * 获取当前租户所选择的可用分区、性能规格所对应的弹性云服务器是否可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotaStatusRequest 请求对象
     * @return SyncInvoker<ListQuotaStatusRequest, ListQuotaStatusResponse>
     */
    public SyncInvoker<ListQuotaStatusRequest, ListQuotaStatusResponse> listQuotaStatusInvoker(
        ListQuotaStatusRequest request) {
        return new SyncInvoker<>(request, CbhMeta.listQuotaStatus, hcClient);
    }

    /**
     * 重置admin用户多因子认证方式
     *
     * 重置admin用户多因子认证方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetLoginMethodRequest 请求对象
     * @return ResetLoginMethodResponse
     */
    public ResetLoginMethodResponse resetLoginMethod(ResetLoginMethodRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.resetLoginMethod);
    }

    /**
     * 重置admin用户多因子认证方式
     *
     * 重置admin用户多因子认证方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetLoginMethodRequest 请求对象
     * @return SyncInvoker<ResetLoginMethodRequest, ResetLoginMethodResponse>
     */
    public SyncInvoker<ResetLoginMethodRequest, ResetLoginMethodResponse> resetLoginMethodInvoker(
        ResetLoginMethodRequest request) {
        return new SyncInvoker<>(request, CbhMeta.resetLoginMethod, hcClient);
    }

    /**
     * 修改admin用户密码
     *
     * 修改云堡垒机实例web登录admin用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return ResetPasswordResponse
     */
    public ResetPasswordResponse resetPassword(ResetPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.resetPassword);
    }

    /**
     * 修改admin用户密码
     *
     * 修改云堡垒机实例web登录admin用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public SyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordInvoker(ResetPasswordRequest request) {
        return new SyncInvoker<>(request, CbhMeta.resetPassword, hcClient);
    }

    /**
     * 重启云堡垒机实例
     *
     * 重启云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartCbhInstanceRequest 请求对象
     * @return RestartCbhInstanceResponse
     */
    public RestartCbhInstanceResponse restartCbhInstance(RestartCbhInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.restartCbhInstance);
    }

    /**
     * 重启云堡垒机实例
     *
     * 重启云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartCbhInstanceRequest 请求对象
     * @return SyncInvoker<RestartCbhInstanceRequest, RestartCbhInstanceResponse>
     */
    public SyncInvoker<RestartCbhInstanceRequest, RestartCbhInstanceResponse> restartCbhInstanceInvoker(
        RestartCbhInstanceRequest request) {
        return new SyncInvoker<>(request, CbhMeta.restartCbhInstance, hcClient);
    }

    /**
     * 查询堡垒机配额
     *
     * 查询云堡垒机配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchQuotaRequest 请求对象
     * @return SearchQuotaResponse
     */
    public SearchQuotaResponse searchQuota(SearchQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.searchQuota);
    }

    /**
     * 查询堡垒机配额
     *
     * 查询云堡垒机配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchQuotaRequest 请求对象
     * @return SyncInvoker<SearchQuotaRequest, SearchQuotaResponse>
     */
    public SyncInvoker<SearchQuotaRequest, SearchQuotaResponse> searchQuotaInvoker(SearchQuotaRequest request) {
        return new SyncInvoker<>(request, CbhMeta.searchQuota, hcClient);
    }

    /**
     * 获取可用用分区信息
     *
     * 获取云堡垒机服务可用分区信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailableZoneInfoRequest 请求对象
     * @return ShowAvailableZoneInfoResponse
     */
    public ShowAvailableZoneInfoResponse showAvailableZoneInfo(ShowAvailableZoneInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.showAvailableZoneInfo);
    }

    /**
     * 获取可用用分区信息
     *
     * 获取云堡垒机服务可用分区信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailableZoneInfoRequest 请求对象
     * @return SyncInvoker<ShowAvailableZoneInfoRequest, ShowAvailableZoneInfoResponse>
     */
    public SyncInvoker<ShowAvailableZoneInfoRequest, ShowAvailableZoneInfoResponse> showAvailableZoneInfoInvoker(
        ShowAvailableZoneInfoRequest request) {
        return new SyncInvoker<>(request, CbhMeta.showAvailableZoneInfo, hcClient);
    }

    /**
     * 检查云堡垒机网络
     *
     * 检查云堡垒机实例网络信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkConfigurationRequest 请求对象
     * @return ShowNetworkConfigurationResponse
     */
    public ShowNetworkConfigurationResponse showNetworkConfiguration(ShowNetworkConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.showNetworkConfiguration);
    }

    /**
     * 检查云堡垒机网络
     *
     * 检查云堡垒机实例网络信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkConfigurationRequest 请求对象
     * @return SyncInvoker<ShowNetworkConfigurationRequest, ShowNetworkConfigurationResponse>
     */
    public SyncInvoker<ShowNetworkConfigurationRequest, ShowNetworkConfigurationResponse> showNetworkConfigurationInvoker(
        ShowNetworkConfigurationRequest request) {
        return new SyncInvoker<>(request, CbhMeta.showNetworkConfiguration, hcClient);
    }

    /**
     * 启动云堡垒机实例
     *
     * 启动云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartCbhInstanceRequest 请求对象
     * @return StartCbhInstanceResponse
     */
    public StartCbhInstanceResponse startCbhInstance(StartCbhInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.startCbhInstance);
    }

    /**
     * 启动云堡垒机实例
     *
     * 启动云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartCbhInstanceRequest 请求对象
     * @return SyncInvoker<StartCbhInstanceRequest, StartCbhInstanceResponse>
     */
    public SyncInvoker<StartCbhInstanceRequest, StartCbhInstanceResponse> startCbhInstanceInvoker(
        StartCbhInstanceRequest request) {
        return new SyncInvoker<>(request, CbhMeta.startCbhInstance, hcClient);
    }

    /**
     * 关闭云堡垒机实例
     *
     * 关闭云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopCbhInstanceRequest 请求对象
     * @return StopCbhInstanceResponse
     */
    public StopCbhInstanceResponse stopCbhInstance(StopCbhInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.stopCbhInstance);
    }

    /**
     * 关闭云堡垒机实例
     *
     * 关闭云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopCbhInstanceRequest 请求对象
     * @return SyncInvoker<StopCbhInstanceRequest, StopCbhInstanceResponse>
     */
    public SyncInvoker<StopCbhInstanceRequest, StopCbhInstanceResponse> stopCbhInstanceInvoker(
        StopCbhInstanceRequest request) {
        return new SyncInvoker<>(request, CbhMeta.stopCbhInstance, hcClient);
    }

    /**
     * 解绑弹性公网IP
     *
     * 云堡垒机实例解绑弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UninstallCbhEipRequest 请求对象
     * @return UninstallCbhEipResponse
     */
    public UninstallCbhEipResponse uninstallCbhEip(UninstallCbhEipRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.uninstallCbhEip);
    }

    /**
     * 解绑弹性公网IP
     *
     * 云堡垒机实例解绑弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UninstallCbhEipRequest 请求对象
     * @return SyncInvoker<UninstallCbhEipRequest, UninstallCbhEipResponse>
     */
    public SyncInvoker<UninstallCbhEipRequest, UninstallCbhEipResponse> uninstallCbhEipInvoker(
        UninstallCbhEipRequest request) {
        return new SyncInvoker<>(request, CbhMeta.uninstallCbhEip, hcClient);
    }

    /**
     * 升级云堡垒机实例
     *
     * 升级云堡垒机实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeCbhInstanceRequest 请求对象
     * @return UpgradeCbhInstanceResponse
     */
    public UpgradeCbhInstanceResponse upgradeCbhInstance(UpgradeCbhInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.upgradeCbhInstance);
    }

    /**
     * 升级云堡垒机实例
     *
     * 升级云堡垒机实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeCbhInstanceRequest 请求对象
     * @return SyncInvoker<UpgradeCbhInstanceRequest, UpgradeCbhInstanceResponse>
     */
    public SyncInvoker<UpgradeCbhInstanceRequest, UpgradeCbhInstanceResponse> upgradeCbhInstanceInvoker(
        UpgradeCbhInstanceRequest request) {
        return new SyncInvoker<>(request, CbhMeta.upgradeCbhInstance, hcClient);
    }

    /**
     * 获取IAM登录实例链接
     *
     * 获取当前IAM用户登录堡垒机的免登录链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LoginCbhRequest 请求对象
     * @return LoginCbhResponse
     */
    public LoginCbhResponse loginCbh(LoginCbhRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.loginCbh);
    }

    /**
     * 获取IAM登录实例链接
     *
     * 获取当前IAM用户登录堡垒机的免登录链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LoginCbhRequest 请求对象
     * @return SyncInvoker<LoginCbhRequest, LoginCbhResponse>
     */
    public SyncInvoker<LoginCbhRequest, LoginCbhResponse> loginCbhInvoker(LoginCbhRequest request) {
        return new SyncInvoker<>(request, CbhMeta.loginCbh, hcClient);
    }

}
