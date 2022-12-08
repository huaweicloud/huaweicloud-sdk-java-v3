package com.huaweicloud.sdk.cbh.v1;

import com.huaweicloud.sdk.cbh.v1.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CbhClient {

    protected HcClient hcClient;

    public CbhClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CbhClient> newBuilder() {
        return new ClientBuilder<>(CbhClient::new);
    }

    /**
     * 修改CBH实例网络
     *
     * 修改CBH实例网络
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
     * 修改CBH实例网络
     *
     * 修改CBH实例网络
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
     * 创建CBH实例
     *
     * 创建CBH实例
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
     * 创建CBH实例
     *
     * 创建CBH实例
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
     * 创建CBH实例订单
     *
     * 创建CBH实例订单
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
     * 创建CBH实例订单
     *
     * 创建CBH实例订单
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
     * 获取CBH实例列表
     *
     * 获取CBH实例列表
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
     * 获取CBH实例列表
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
     * 重启CBH实例
     *
     * 重启CBH实例
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
     * 重启CBH实例
     *
     * 重启CBH实例
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
     * 查询堡垒机配额
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
     * 查询堡垒机配额
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
     * 获取CBH服务可用分区信息
     *
     * 获取CBH服务可用分区信息
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
     * 获取CBH服务可用分区信息
     *
     * 获取CBH服务可用分区信息
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
     * 检查网络接口
     *
     * 检查网络接口
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
     * 检查网络接口
     *
     * 检查网络接口
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
     * 启动CBH实例
     *
     * 启动CBH实例
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
     * 启动CBH实例
     *
     * 启动CBH实例
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
     * 升级CBH实例
     *
     * 升级CBH实例
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
     * 升级CBH实例
     *
     * 升级CBH实例
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
     * 修改admin用户多因子认证方式
     *
     * 修改admin用户多因子认证方式
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
     * 修改admin用户多因子认证方式
     *
     * 修改admin用户多因子认证方式
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
     * 修改admin密码
     *
     * 修改admin密码
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
     * 修改admin密码
     *
     * 修改admin密码
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
     * 关闭CBH实例
     *
     * 关闭CBH实例
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
     * 关闭CBH实例
     *
     * 关闭CBH实例
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
     * 获取ECS配额
     *
     * 获取当前租户所选择的可用分区、性能规格所对应的ECS flavor是否可用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaStateRequest 请求对象
     * @return ListQuotaStateResponse
     */
    public ListQuotaStateResponse listQuotaState(ListQuotaStateRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.listQuotaState);
    }

    /**
     * 获取ECS配额
     *
     * 获取当前租户所选择的可用分区、性能规格所对应的ECS flavor是否可用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaStateRequest 请求对象
     * @return SyncInvoker<ListQuotaStateRequest, ListQuotaStateResponse>
     */
    public SyncInvoker<ListQuotaStateRequest, ListQuotaStateResponse> listQuotaStateInvoker(
        ListQuotaStateRequest request) {
        return new SyncInvoker<ListQuotaStateRequest, ListQuotaStateResponse>(request, CbhMeta.listQuotaState,
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
     * @return InstallInstanceEipResponse
     */
    public InstallInstanceEipResponse installInstanceEip(InstallInstanceEipRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.installInstanceEip);
    }

    /**
     * 绑定CBH实例Eip
     *
     * 绑定CBH实例Eip
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
     * 解绑CBH实例Eip
     *
     * 解绑CBH实例Eip
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
     * 解绑CBH实例Eip
     *
     * 解绑CBH实例Eip
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

}
