package com.huaweicloud.sdk.cbh.v1;

import com.huaweicloud.sdk.cbh.v1.model.ChangeInstanceNetworkRequest;
import com.huaweicloud.sdk.cbh.v1.model.ChangeInstanceNetworkResponse;
import com.huaweicloud.sdk.cbh.v1.model.ChangeInstanceOrderRequest;
import com.huaweicloud.sdk.cbh.v1.model.ChangeInstanceOrderResponse;
import com.huaweicloud.sdk.cbh.v1.model.CreateInstanceOrderRequest;
import com.huaweicloud.sdk.cbh.v1.model.CreateInstanceOrderResponse;
import com.huaweicloud.sdk.cbh.v1.model.CreateInstanceRequest;
import com.huaweicloud.sdk.cbh.v1.model.CreateInstanceResponse;
import com.huaweicloud.sdk.cbh.v1.model.InstallInstanceEipRequest;
import com.huaweicloud.sdk.cbh.v1.model.InstallInstanceEipResponse;
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
import com.huaweicloud.sdk.cbh.v1.model.UninstallInstanceEipRequest;
import com.huaweicloud.sdk.cbh.v1.model.UninstallInstanceEipResponse;
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
     * @param ChangeInstanceNetworkRequest 请求对象
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
     * @param ChangeInstanceNetworkRequest 请求对象
     * @return SyncInvoker<ChangeInstanceNetworkRequest, ChangeInstanceNetworkResponse>
     */
    public SyncInvoker<ChangeInstanceNetworkRequest, ChangeInstanceNetworkResponse> changeInstanceNetworkInvoker(
        ChangeInstanceNetworkRequest request) {
        return new SyncInvoker<ChangeInstanceNetworkRequest, ChangeInstanceNetworkResponse>(request,
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
     * @param ChangeInstanceOrderRequest 请求对象
     * @return SyncInvoker<ChangeInstanceOrderRequest, ChangeInstanceOrderResponse>
     */
    public SyncInvoker<ChangeInstanceOrderRequest, ChangeInstanceOrderResponse> changeInstanceOrderInvoker(
        ChangeInstanceOrderRequest request) {
        return new SyncInvoker<ChangeInstanceOrderRequest, ChangeInstanceOrderResponse>(request,
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
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.createInstance);
    }

    /**
     * 创建云堡垒机实例
     *
     * 创建云堡垒机实例。（创建云堡垒机实例订单前，先调用此接口）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, CbhMeta.createInstance,
            hcClient);
    }

    /**
     * 创建云堡垒机实例订单
     *
     * 创建云堡垒机实例订单。(调用此接口前先调用创建云堡垒机实例接口)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceOrderRequest 请求对象
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
     * @param CreateInstanceOrderRequest 请求对象
     * @return SyncInvoker<CreateInstanceOrderRequest, CreateInstanceOrderResponse>
     */
    public SyncInvoker<CreateInstanceOrderRequest, CreateInstanceOrderResponse> createInstanceOrderInvoker(
        CreateInstanceOrderRequest request) {
        return new SyncInvoker<CreateInstanceOrderRequest, CreateInstanceOrderResponse>(request,
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
     * @return InstallInstanceEipResponse
     */
    public InstallInstanceEipResponse installInstanceEip(InstallInstanceEipRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.installInstanceEip);
    }

    /**
     * 绑定弹性公网IP
     *
     * 云堡垒机实例绑定弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param InstallInstanceEipRequest 请求对象
     * @return SyncInvoker<InstallInstanceEipRequest, InstallInstanceEipResponse>
     */
    public SyncInvoker<InstallInstanceEipRequest, InstallInstanceEipResponse> installInstanceEipInvoker(
        InstallInstanceEipRequest request) {
        return new SyncInvoker<InstallInstanceEipRequest, InstallInstanceEipResponse>(request,
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
     * @param ListCbhInstanceRequest 请求对象
     * @return SyncInvoker<ListCbhInstanceRequest, ListCbhInstanceResponse>
     */
    public SyncInvoker<ListCbhInstanceRequest, ListCbhInstanceResponse> listCbhInstanceInvoker(
        ListCbhInstanceRequest request) {
        return new SyncInvoker<ListCbhInstanceRequest, ListCbhInstanceResponse>(request, CbhMeta.listCbhInstance,
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
     * @param ListQuotaStatusRequest 请求对象
     * @return SyncInvoker<ListQuotaStatusRequest, ListQuotaStatusResponse>
     */
    public SyncInvoker<ListQuotaStatusRequest, ListQuotaStatusResponse> listQuotaStatusInvoker(
        ListQuotaStatusRequest request) {
        return new SyncInvoker<ListQuotaStatusRequest, ListQuotaStatusResponse>(request, CbhMeta.listQuotaStatus,
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
     * @param ResetLoginMethodRequest 请求对象
     * @return SyncInvoker<ResetLoginMethodRequest, ResetLoginMethodResponse>
     */
    public SyncInvoker<ResetLoginMethodRequest, ResetLoginMethodResponse> resetLoginMethodInvoker(
        ResetLoginMethodRequest request) {
        return new SyncInvoker<ResetLoginMethodRequest, ResetLoginMethodResponse>(request, CbhMeta.resetLoginMethod,
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
     * @param ResetPasswordRequest 请求对象
     * @return SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public SyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordInvoker(ResetPasswordRequest request) {
        return new SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>(request, CbhMeta.resetPassword, hcClient);
    }

    /**
     * 重启云堡垒机实例
     *
     * 重启云堡垒机实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartCbhInstanceRequest 请求对象
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
     * @param RestartCbhInstanceRequest 请求对象
     * @return SyncInvoker<RestartCbhInstanceRequest, RestartCbhInstanceResponse>
     */
    public SyncInvoker<RestartCbhInstanceRequest, RestartCbhInstanceResponse> restartCbhInstanceInvoker(
        RestartCbhInstanceRequest request) {
        return new SyncInvoker<RestartCbhInstanceRequest, RestartCbhInstanceResponse>(request,
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
     * @param SearchQuotaRequest 请求对象
     * @return SyncInvoker<SearchQuotaRequest, SearchQuotaResponse>
     */
    public SyncInvoker<SearchQuotaRequest, SearchQuotaResponse> searchQuotaInvoker(SearchQuotaRequest request) {
        return new SyncInvoker<SearchQuotaRequest, SearchQuotaResponse>(request, CbhMeta.searchQuota, hcClient);
    }

    /**
     * 获取可用用分区信息
     *
     * 获取云堡垒机服务可用分区信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAvailableZoneInfoRequest 请求对象
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
     * @param ShowAvailableZoneInfoRequest 请求对象
     * @return SyncInvoker<ShowAvailableZoneInfoRequest, ShowAvailableZoneInfoResponse>
     */
    public SyncInvoker<ShowAvailableZoneInfoRequest, ShowAvailableZoneInfoResponse> showAvailableZoneInfoInvoker(
        ShowAvailableZoneInfoRequest request) {
        return new SyncInvoker<ShowAvailableZoneInfoRequest, ShowAvailableZoneInfoResponse>(request,
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
     * @param ShowNetworkConfigurationRequest 请求对象
     * @return SyncInvoker<ShowNetworkConfigurationRequest, ShowNetworkConfigurationResponse>
     */
    public SyncInvoker<ShowNetworkConfigurationRequest, ShowNetworkConfigurationResponse> showNetworkConfigurationInvoker(
        ShowNetworkConfigurationRequest request) {
        return new SyncInvoker<ShowNetworkConfigurationRequest, ShowNetworkConfigurationResponse>(request,
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
     * @param StartCbhInstanceRequest 请求对象
     * @return SyncInvoker<StartCbhInstanceRequest, StartCbhInstanceResponse>
     */
    public SyncInvoker<StartCbhInstanceRequest, StartCbhInstanceResponse> startCbhInstanceInvoker(
        StartCbhInstanceRequest request) {
        return new SyncInvoker<StartCbhInstanceRequest, StartCbhInstanceResponse>(request, CbhMeta.startCbhInstance,
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
     * @param StopCbhInstanceRequest 请求对象
     * @return SyncInvoker<StopCbhInstanceRequest, StopCbhInstanceResponse>
     */
    public SyncInvoker<StopCbhInstanceRequest, StopCbhInstanceResponse> stopCbhInstanceInvoker(
        StopCbhInstanceRequest request) {
        return new SyncInvoker<StopCbhInstanceRequest, StopCbhInstanceResponse>(request, CbhMeta.stopCbhInstance,
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
     * @return UninstallInstanceEipResponse
     */
    public UninstallInstanceEipResponse uninstallInstanceEip(UninstallInstanceEipRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.uninstallInstanceEip);
    }

    /**
     * 解绑弹性公网IP
     *
     * 云堡垒机实例解绑弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UninstallInstanceEipRequest 请求对象
     * @return SyncInvoker<UninstallInstanceEipRequest, UninstallInstanceEipResponse>
     */
    public SyncInvoker<UninstallInstanceEipRequest, UninstallInstanceEipResponse> uninstallInstanceEipInvoker(
        UninstallInstanceEipRequest request) {
        return new SyncInvoker<UninstallInstanceEipRequest, UninstallInstanceEipResponse>(request,
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
     * @param UpgradeCbhInstanceRequest 请求对象
     * @return SyncInvoker<UpgradeCbhInstanceRequest, UpgradeCbhInstanceResponse>
     */
    public SyncInvoker<UpgradeCbhInstanceRequest, UpgradeCbhInstanceResponse> upgradeCbhInstanceInvoker(
        UpgradeCbhInstanceRequest request) {
        return new SyncInvoker<UpgradeCbhInstanceRequest, UpgradeCbhInstanceResponse>(request,
            CbhMeta.upgradeCbhInstance, hcClient);
    }

    /**
     * 获取IAM登录实例链接
     *
     * 获取当前IAM用户登录堡垒机的免登录链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param LoginCbhRequest 请求对象
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
     * @param LoginCbhRequest 请求对象
     * @return SyncInvoker<LoginCbhRequest, LoginCbhResponse>
     */
    public SyncInvoker<LoginCbhRequest, LoginCbhResponse> loginCbhInvoker(LoginCbhRequest request) {
        return new SyncInvoker<LoginCbhRequest, LoginCbhResponse>(request, CbhMeta.loginCbh, hcClient);
    }

}
