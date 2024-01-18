package com.huaweicloud.sdk.rgc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.rgc.v1.model.CheckLaunchRequest;
import com.huaweicloud.sdk.rgc.v1.model.CheckLaunchResponse;
import com.huaweicloud.sdk.rgc.v1.model.CreateAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.CreateAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.DeleteManagedOrganizationalUnitsRequest;
import com.huaweicloud.sdk.rgc.v1.model.DeleteManagedOrganizationalUnitsResponse;
import com.huaweicloud.sdk.rgc.v1.model.DeregisterOrganizationalUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.DeregisterOrganizationalUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.DisableControlRequest;
import com.huaweicloud.sdk.rgc.v1.model.DisableControlResponse;
import com.huaweicloud.sdk.rgc.v1.model.EnableControlRequest;
import com.huaweicloud.sdk.rgc.v1.model.EnableControlResponse;
import com.huaweicloud.sdk.rgc.v1.model.EnrollAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.EnrollAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListConfigRuleComplianceRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListConfigRuleComplianceResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListControlViolationsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListControlViolationsResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForOrganizationUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForOrganizationUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListDriftDetailsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListDriftDetailsResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListEnabledControlsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListEnabledControlsResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListManagedAccountsForParentRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListManagedAccountsForParentResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListManagedAccountsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListManagedAccountsResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListManagedOrganizationalUnitsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListManagedOrganizationalUnitsResponse;
import com.huaweicloud.sdk.rgc.v1.model.ReRegisterOrganizationalUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.ReRegisterOrganizationalUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.RegisterOrganizationalUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.RegisterOrganizationalUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.SetupLandingZoneRequest;
import com.huaweicloud.sdk.rgc.v1.model.SetupLandingZoneResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowAvailableUpdatesRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowAvailableUpdatesResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowComplianceStatusForAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowComplianceStatusForAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowComplianceStatusForOrganizationUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowComplianceStatusForOrganizationUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlOperateRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlOperateResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlsForOrganizationUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlsForOrganizationUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowHomeRegionRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowHomeRegionResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowLandingZoneConfigurationRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowLandingZoneConfigurationResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowLandingZoneIdentityCenterRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowLandingZoneIdentityCenterResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowLandingZoneStatusRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowLandingZoneStatusResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedCoreAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedCoreAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedOrganizationalUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedOrganizationalUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowOperationRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowOperationResponse;
import com.huaweicloud.sdk.rgc.v1.model.UnEnrollAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.UnEnrollAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.UpdateManagedAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.UpdateManagedAccountResponse;

public class RgcClient {

    protected HcClient hcClient;

    public RgcClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RgcClient> newBuilder() {
        ClientBuilder<RgcClient> clientBuilder = new ClientBuilder<>(RgcClient::new);
        return clientBuilder;
    }

    /**
     * 关闭控制策略
     *
     * 关闭组织下的某个单元的某个控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableControlRequest 请求对象
     * @return DisableControlResponse
     */
    public DisableControlResponse disableControl(DisableControlRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.disableControl);
    }

    /**
     * 关闭控制策略
     *
     * 关闭组织下的某个单元的某个控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableControlRequest 请求对象
     * @return SyncInvoker<DisableControlRequest, DisableControlResponse>
     */
    public SyncInvoker<DisableControlRequest, DisableControlResponse> disableControlInvoker(
        DisableControlRequest request) {
        return new SyncInvoker<>(request, RgcMeta.disableControl, hcClient);
    }

    /**
     * 开启控制策略
     *
     * 给组织下的某个单元开启某个控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableControlRequest 请求对象
     * @return EnableControlResponse
     */
    public EnableControlResponse enableControl(EnableControlRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.enableControl);
    }

    /**
     * 开启控制策略
     *
     * 给组织下的某个单元开启某个控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableControlRequest 请求对象
     * @return SyncInvoker<EnableControlRequest, EnableControlResponse>
     */
    public SyncInvoker<EnableControlRequest, EnableControlResponse> enableControlInvoker(EnableControlRequest request) {
        return new SyncInvoker<>(request, RgcMeta.enableControl, hcClient);
    }

    /**
     * 查询纳管账号的Config规则合规性信息
     *
     * 查询纳管账号的Config规则合规性信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigRuleComplianceRequest 请求对象
     * @return ListConfigRuleComplianceResponse
     */
    public ListConfigRuleComplianceResponse listConfigRuleCompliance(ListConfigRuleComplianceRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.listConfigRuleCompliance);
    }

    /**
     * 查询纳管账号的Config规则合规性信息
     *
     * 查询纳管账号的Config规则合规性信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigRuleComplianceRequest 请求对象
     * @return SyncInvoker<ListConfigRuleComplianceRequest, ListConfigRuleComplianceResponse>
     */
    public SyncInvoker<ListConfigRuleComplianceRequest, ListConfigRuleComplianceResponse> listConfigRuleComplianceInvoker(
        ListConfigRuleComplianceRequest request) {
        return new SyncInvoker<>(request, RgcMeta.listConfigRuleCompliance, hcClient);
    }

    /**
     * 列出不合规信息
     *
     * 列出组织里所有不合规的资源信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListControlViolationsRequest 请求对象
     * @return ListControlViolationsResponse
     */
    public ListControlViolationsResponse listControlViolations(ListControlViolationsRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.listControlViolations);
    }

    /**
     * 列出不合规信息
     *
     * 列出组织里所有不合规的资源信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListControlViolationsRequest 请求对象
     * @return SyncInvoker<ListControlViolationsRequest, ListControlViolationsResponse>
     */
    public SyncInvoker<ListControlViolationsRequest, ListControlViolationsResponse> listControlViolationsInvoker(
        ListControlViolationsRequest request) {
        return new SyncInvoker<>(request, RgcMeta.listControlViolations, hcClient);
    }

    /**
     * 列出控制策略
     *
     * 列出RGC服务里所有的预置控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListControlsRequest 请求对象
     * @return ListControlsResponse
     */
    public ListControlsResponse listControls(ListControlsRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.listControls);
    }

    /**
     * 列出控制策略
     *
     * 列出RGC服务里所有的预置控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListControlsRequest 请求对象
     * @return SyncInvoker<ListControlsRequest, ListControlsResponse>
     */
    public SyncInvoker<ListControlsRequest, ListControlsResponse> listControlsInvoker(ListControlsRequest request) {
        return new SyncInvoker<>(request, RgcMeta.listControls, hcClient);
    }

    /**
     * 列出纳管账号下开启的控制策略
     *
     * 列出组织里某个纳管账号开启的所有控制策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListControlsForAccountRequest 请求对象
     * @return ListControlsForAccountResponse
     */
    public ListControlsForAccountResponse listControlsForAccount(ListControlsForAccountRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.listControlsForAccount);
    }

    /**
     * 列出纳管账号下开启的控制策略
     *
     * 列出组织里某个纳管账号开启的所有控制策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListControlsForAccountRequest 请求对象
     * @return SyncInvoker<ListControlsForAccountRequest, ListControlsForAccountResponse>
     */
    public SyncInvoker<ListControlsForAccountRequest, ListControlsForAccountResponse> listControlsForAccountInvoker(
        ListControlsForAccountRequest request) {
        return new SyncInvoker<>(request, RgcMeta.listControlsForAccount, hcClient);
    }

    /**
     * 列出注册OU下开启的控制策略
     *
     * 列出组织里某个注册OU开启的所有控制策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListControlsForOrganizationUnitRequest 请求对象
     * @return ListControlsForOrganizationUnitResponse
     */
    public ListControlsForOrganizationUnitResponse listControlsForOrganizationUnit(
        ListControlsForOrganizationUnitRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.listControlsForOrganizationUnit);
    }

    /**
     * 列出注册OU下开启的控制策略
     *
     * 列出组织里某个注册OU开启的所有控制策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListControlsForOrganizationUnitRequest 请求对象
     * @return SyncInvoker<ListControlsForOrganizationUnitRequest, ListControlsForOrganizationUnitResponse>
     */
    public SyncInvoker<ListControlsForOrganizationUnitRequest, ListControlsForOrganizationUnitResponse> listControlsForOrganizationUnitInvoker(
        ListControlsForOrganizationUnitRequest request) {
        return new SyncInvoker<>(request, RgcMeta.listControlsForOrganizationUnit, hcClient);
    }

    /**
     * 列出漂移信息
     *
     * 列出Landing Zone的所有漂移详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDriftDetailsRequest 请求对象
     * @return ListDriftDetailsResponse
     */
    public ListDriftDetailsResponse listDriftDetails(ListDriftDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.listDriftDetails);
    }

    /**
     * 列出漂移信息
     *
     * 列出Landing Zone的所有漂移详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDriftDetailsRequest 请求对象
     * @return SyncInvoker<ListDriftDetailsRequest, ListDriftDetailsResponse>
     */
    public SyncInvoker<ListDriftDetailsRequest, ListDriftDetailsResponse> listDriftDetailsInvoker(
        ListDriftDetailsRequest request) {
        return new SyncInvoker<>(request, RgcMeta.listDriftDetails, hcClient);
    }

    /**
     * 列出开启的控制策略
     *
     * 列出组织里开启的所有控制策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnabledControlsRequest 请求对象
     * @return ListEnabledControlsResponse
     */
    public ListEnabledControlsResponse listEnabledControls(ListEnabledControlsRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.listEnabledControls);
    }

    /**
     * 列出开启的控制策略
     *
     * 列出组织里开启的所有控制策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnabledControlsRequest 请求对象
     * @return SyncInvoker<ListEnabledControlsRequest, ListEnabledControlsResponse>
     */
    public SyncInvoker<ListEnabledControlsRequest, ListEnabledControlsResponse> listEnabledControlsInvoker(
        ListEnabledControlsRequest request) {
        return new SyncInvoker<>(request, RgcMeta.listEnabledControls, hcClient);
    }

    /**
     * 查询纳管账号的合规状态
     *
     * 查询组织里某个纳管账号的资源合规状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComplianceStatusForAccountRequest 请求对象
     * @return ShowComplianceStatusForAccountResponse
     */
    public ShowComplianceStatusForAccountResponse showComplianceStatusForAccount(
        ShowComplianceStatusForAccountRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.showComplianceStatusForAccount);
    }

    /**
     * 查询纳管账号的合规状态
     *
     * 查询组织里某个纳管账号的资源合规状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComplianceStatusForAccountRequest 请求对象
     * @return SyncInvoker<ShowComplianceStatusForAccountRequest, ShowComplianceStatusForAccountResponse>
     */
    public SyncInvoker<ShowComplianceStatusForAccountRequest, ShowComplianceStatusForAccountResponse> showComplianceStatusForAccountInvoker(
        ShowComplianceStatusForAccountRequest request) {
        return new SyncInvoker<>(request, RgcMeta.showComplianceStatusForAccount, hcClient);
    }

    /**
     * 查询注册OU的合规状态
     *
     * 查询组织里某个注册OU下所有纳管账号的资源合规状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComplianceStatusForOrganizationUnitRequest 请求对象
     * @return ShowComplianceStatusForOrganizationUnitResponse
     */
    public ShowComplianceStatusForOrganizationUnitResponse showComplianceStatusForOrganizationUnit(
        ShowComplianceStatusForOrganizationUnitRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.showComplianceStatusForOrganizationUnit);
    }

    /**
     * 查询注册OU的合规状态
     *
     * 查询组织里某个注册OU下所有纳管账号的资源合规状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComplianceStatusForOrganizationUnitRequest 请求对象
     * @return SyncInvoker<ShowComplianceStatusForOrganizationUnitRequest, ShowComplianceStatusForOrganizationUnitResponse>
     */
    public SyncInvoker<ShowComplianceStatusForOrganizationUnitRequest, ShowComplianceStatusForOrganizationUnitResponse> showComplianceStatusForOrganizationUnitInvoker(
        ShowComplianceStatusForOrganizationUnitRequest request) {
        return new SyncInvoker<>(request, RgcMeta.showComplianceStatusForOrganizationUnit, hcClient);
    }

    /**
     * 查询控制策略详细信息
     *
     * 查询单个预置的控制策略详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowControlRequest 请求对象
     * @return ShowControlResponse
     */
    public ShowControlResponse showControl(ShowControlRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.showControl);
    }

    /**
     * 查询控制策略详细信息
     *
     * 查询单个预置的控制策略详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowControlRequest 请求对象
     * @return SyncInvoker<ShowControlRequest, ShowControlResponse>
     */
    public SyncInvoker<ShowControlRequest, ShowControlResponse> showControlInvoker(ShowControlRequest request) {
        return new SyncInvoker<>(request, RgcMeta.showControl, hcClient);
    }

    /**
     * 查询控制策略操作状态
     *
     * 根据操作ID查询返回指定ID的操作状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowControlOperateRequest 请求对象
     * @return ShowControlOperateResponse
     */
    public ShowControlOperateResponse showControlOperate(ShowControlOperateRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.showControlOperate);
    }

    /**
     * 查询控制策略操作状态
     *
     * 根据操作ID查询返回指定ID的操作状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowControlOperateRequest 请求对象
     * @return SyncInvoker<ShowControlOperateRequest, ShowControlOperateResponse>
     */
    public SyncInvoker<ShowControlOperateRequest, ShowControlOperateResponse> showControlOperateInvoker(
        ShowControlOperateRequest request) {
        return new SyncInvoker<>(request, RgcMeta.showControlOperate, hcClient);
    }

    /**
     * 查询注册OU开启的控制策略
     *
     * 查询组织里某个注册OU下开启的某个控制策略的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowControlsForOrganizationUnitRequest 请求对象
     * @return ShowControlsForOrganizationUnitResponse
     */
    public ShowControlsForOrganizationUnitResponse showControlsForOrganizationUnit(
        ShowControlsForOrganizationUnitRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.showControlsForOrganizationUnit);
    }

    /**
     * 查询注册OU开启的控制策略
     *
     * 查询组织里某个注册OU下开启的某个控制策略的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowControlsForOrganizationUnitRequest 请求对象
     * @return SyncInvoker<ShowControlsForOrganizationUnitRequest, ShowControlsForOrganizationUnitResponse>
     */
    public SyncInvoker<ShowControlsForOrganizationUnitRequest, ShowControlsForOrganizationUnitResponse> showControlsForOrganizationUnitInvoker(
        ShowControlsForOrganizationUnitRequest request) {
        return new SyncInvoker<>(request, RgcMeta.showControlsForOrganizationUnit, hcClient);
    }

    /**
     * 设置Landing Zone前检查
     *
     * 在设置Landing Zone之前，检查当前区域是否可以设置Landing Zone。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckLaunchRequest 请求对象
     * @return CheckLaunchResponse
     */
    public CheckLaunchResponse checkLaunch(CheckLaunchRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.checkLaunch);
    }

    /**
     * 设置Landing Zone前检查
     *
     * 在设置Landing Zone之前，检查当前区域是否可以设置Landing Zone。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckLaunchRequest 请求对象
     * @return SyncInvoker<CheckLaunchRequest, CheckLaunchResponse>
     */
    public SyncInvoker<CheckLaunchRequest, CheckLaunchResponse> checkLaunchInvoker(CheckLaunchRequest request) {
        return new SyncInvoker<>(request, RgcMeta.checkLaunch, hcClient);
    }

    /**
     * 设置Landing Zone
     *
     * 在当前区域创建或者更新Landing Zone。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetupLandingZoneRequest 请求对象
     * @return SetupLandingZoneResponse
     */
    public SetupLandingZoneResponse setupLandingZone(SetupLandingZoneRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.setupLandingZone);
    }

    /**
     * 设置Landing Zone
     *
     * 在当前区域创建或者更新Landing Zone。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetupLandingZoneRequest 请求对象
     * @return SyncInvoker<SetupLandingZoneRequest, SetupLandingZoneResponse>
     */
    public SyncInvoker<SetupLandingZoneRequest, SetupLandingZoneResponse> setupLandingZoneInvoker(
        SetupLandingZoneRequest request) {
        return new SyncInvoker<>(request, RgcMeta.setupLandingZone, hcClient);
    }

    /**
     * 查询Landing Zone可更新状态
     *
     * 查询Landing Zone当前是否需要升级更新。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailableUpdatesRequest 请求对象
     * @return ShowAvailableUpdatesResponse
     */
    public ShowAvailableUpdatesResponse showAvailableUpdates(ShowAvailableUpdatesRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.showAvailableUpdates);
    }

    /**
     * 查询Landing Zone可更新状态
     *
     * 查询Landing Zone当前是否需要升级更新。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailableUpdatesRequest 请求对象
     * @return SyncInvoker<ShowAvailableUpdatesRequest, ShowAvailableUpdatesResponse>
     */
    public SyncInvoker<ShowAvailableUpdatesRequest, ShowAvailableUpdatesResponse> showAvailableUpdatesInvoker(
        ShowAvailableUpdatesRequest request) {
        return new SyncInvoker<>(request, RgcMeta.showAvailableUpdates, hcClient);
    }

    /**
     * 查询主区域
     *
     * 查询Landing Zone的主区域。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHomeRegionRequest 请求对象
     * @return ShowHomeRegionResponse
     */
    public ShowHomeRegionResponse showHomeRegion(ShowHomeRegionRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.showHomeRegion);
    }

    /**
     * 查询主区域
     *
     * 查询Landing Zone的主区域。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHomeRegionRequest 请求对象
     * @return SyncInvoker<ShowHomeRegionRequest, ShowHomeRegionResponse>
     */
    public SyncInvoker<ShowHomeRegionRequest, ShowHomeRegionResponse> showHomeRegionInvoker(
        ShowHomeRegionRequest request) {
        return new SyncInvoker<>(request, RgcMeta.showHomeRegion, hcClient);
    }

    /**
     * 查询Landing Zone的配置
     *
     * 查询当前客户的Landing Zone的所有配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLandingZoneConfigurationRequest 请求对象
     * @return ShowLandingZoneConfigurationResponse
     */
    public ShowLandingZoneConfigurationResponse showLandingZoneConfiguration(
        ShowLandingZoneConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.showLandingZoneConfiguration);
    }

    /**
     * 查询Landing Zone的配置
     *
     * 查询当前客户的Landing Zone的所有配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLandingZoneConfigurationRequest 请求对象
     * @return SyncInvoker<ShowLandingZoneConfigurationRequest, ShowLandingZoneConfigurationResponse>
     */
    public SyncInvoker<ShowLandingZoneConfigurationRequest, ShowLandingZoneConfigurationResponse> showLandingZoneConfigurationInvoker(
        ShowLandingZoneConfigurationRequest request) {
        return new SyncInvoker<>(request, RgcMeta.showLandingZoneConfiguration, hcClient);
    }

    /**
     * 查询当前客户的Identity Center用户信息
     *
     * 查询当前客户的Identity Center用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLandingZoneIdentityCenterRequest 请求对象
     * @return ShowLandingZoneIdentityCenterResponse
     */
    public ShowLandingZoneIdentityCenterResponse showLandingZoneIdentityCenter(
        ShowLandingZoneIdentityCenterRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.showLandingZoneIdentityCenter);
    }

    /**
     * 查询当前客户的Identity Center用户信息
     *
     * 查询当前客户的Identity Center用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLandingZoneIdentityCenterRequest 请求对象
     * @return SyncInvoker<ShowLandingZoneIdentityCenterRequest, ShowLandingZoneIdentityCenterResponse>
     */
    public SyncInvoker<ShowLandingZoneIdentityCenterRequest, ShowLandingZoneIdentityCenterResponse> showLandingZoneIdentityCenterInvoker(
        ShowLandingZoneIdentityCenterRequest request) {
        return new SyncInvoker<>(request, RgcMeta.showLandingZoneIdentityCenter, hcClient);
    }

    /**
     * 查询Landing Zone设置状态
     *
     * 查询Landing Zone的设置状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLandingZoneStatusRequest 请求对象
     * @return ShowLandingZoneStatusResponse
     */
    public ShowLandingZoneStatusResponse showLandingZoneStatus(ShowLandingZoneStatusRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.showLandingZoneStatus);
    }

    /**
     * 查询Landing Zone设置状态
     *
     * 查询Landing Zone的设置状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLandingZoneStatusRequest 请求对象
     * @return SyncInvoker<ShowLandingZoneStatusRequest, ShowLandingZoneStatusResponse>
     */
    public SyncInvoker<ShowLandingZoneStatusRequest, ShowLandingZoneStatusResponse> showLandingZoneStatusInvoker(
        ShowLandingZoneStatusRequest request) {
        return new SyncInvoker<>(request, RgcMeta.showLandingZoneStatus, hcClient);
    }

    /**
     * 创建账号
     *
     * 在组织里的某个注册OU下创建账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccountRequest 请求对象
     * @return CreateAccountResponse
     */
    public CreateAccountResponse createAccount(CreateAccountRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.createAccount);
    }

    /**
     * 创建账号
     *
     * 在组织里的某个注册OU下创建账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccountRequest 请求对象
     * @return SyncInvoker<CreateAccountRequest, CreateAccountResponse>
     */
    public SyncInvoker<CreateAccountRequest, CreateAccountResponse> createAccountInvoker(CreateAccountRequest request) {
        return new SyncInvoker<>(request, RgcMeta.createAccount, hcClient);
    }

    /**
     * 删除注册OU
     *
     * 在组织里删除已注册OU。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteManagedOrganizationalUnitsRequest 请求对象
     * @return DeleteManagedOrganizationalUnitsResponse
     */
    public DeleteManagedOrganizationalUnitsResponse deleteManagedOrganizationalUnits(
        DeleteManagedOrganizationalUnitsRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.deleteManagedOrganizationalUnits);
    }

    /**
     * 删除注册OU
     *
     * 在组织里删除已注册OU。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteManagedOrganizationalUnitsRequest 请求对象
     * @return SyncInvoker<DeleteManagedOrganizationalUnitsRequest, DeleteManagedOrganizationalUnitsResponse>
     */
    public SyncInvoker<DeleteManagedOrganizationalUnitsRequest, DeleteManagedOrganizationalUnitsResponse> deleteManagedOrganizationalUnitsInvoker(
        DeleteManagedOrganizationalUnitsRequest request) {
        return new SyncInvoker<>(request, RgcMeta.deleteManagedOrganizationalUnits, hcClient);
    }

    /**
     * 取消注册OU
     *
     * 将组织里的某个OU从RGC服务里取消注册。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeregisterOrganizationalUnitRequest 请求对象
     * @return DeregisterOrganizationalUnitResponse
     */
    public DeregisterOrganizationalUnitResponse deregisterOrganizationalUnit(
        DeregisterOrganizationalUnitRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.deregisterOrganizationalUnit);
    }

    /**
     * 取消注册OU
     *
     * 将组织里的某个OU从RGC服务里取消注册。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeregisterOrganizationalUnitRequest 请求对象
     * @return SyncInvoker<DeregisterOrganizationalUnitRequest, DeregisterOrganizationalUnitResponse>
     */
    public SyncInvoker<DeregisterOrganizationalUnitRequest, DeregisterOrganizationalUnitResponse> deregisterOrganizationalUnitInvoker(
        DeregisterOrganizationalUnitRequest request) {
        return new SyncInvoker<>(request, RgcMeta.deregisterOrganizationalUnit, hcClient);
    }

    /**
     * 纳管账号
     *
     * 将组织里的某个账号纳管到RGC服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnrollAccountRequest 请求对象
     * @return EnrollAccountResponse
     */
    public EnrollAccountResponse enrollAccount(EnrollAccountRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.enrollAccount);
    }

    /**
     * 纳管账号
     *
     * 将组织里的某个账号纳管到RGC服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnrollAccountRequest 请求对象
     * @return SyncInvoker<EnrollAccountRequest, EnrollAccountResponse>
     */
    public SyncInvoker<EnrollAccountRequest, EnrollAccountResponse> enrollAccountInvoker(EnrollAccountRequest request) {
        return new SyncInvoker<>(request, RgcMeta.enrollAccount, hcClient);
    }

    /**
     * 列举控制策略生效的纳管账号信息
     *
     * 列举控制策略生效的纳管账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedAccountsRequest 请求对象
     * @return ListManagedAccountsResponse
     */
    public ListManagedAccountsResponse listManagedAccounts(ListManagedAccountsRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.listManagedAccounts);
    }

    /**
     * 列举控制策略生效的纳管账号信息
     *
     * 列举控制策略生效的纳管账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedAccountsRequest 请求对象
     * @return SyncInvoker<ListManagedAccountsRequest, ListManagedAccountsResponse>
     */
    public SyncInvoker<ListManagedAccountsRequest, ListManagedAccountsResponse> listManagedAccountsInvoker(
        ListManagedAccountsRequest request) {
        return new SyncInvoker<>(request, RgcMeta.listManagedAccounts, hcClient);
    }

    /**
     * 列出注册OU下的纳管账号信息
     *
     * 列出组织里某个注册OU下的所有纳管账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedAccountsForParentRequest 请求对象
     * @return ListManagedAccountsForParentResponse
     */
    public ListManagedAccountsForParentResponse listManagedAccountsForParent(
        ListManagedAccountsForParentRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.listManagedAccountsForParent);
    }

    /**
     * 列出注册OU下的纳管账号信息
     *
     * 列出组织里某个注册OU下的所有纳管账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedAccountsForParentRequest 请求对象
     * @return SyncInvoker<ListManagedAccountsForParentRequest, ListManagedAccountsForParentResponse>
     */
    public SyncInvoker<ListManagedAccountsForParentRequest, ListManagedAccountsForParentResponse> listManagedAccountsForParentInvoker(
        ListManagedAccountsForParentRequest request) {
        return new SyncInvoker<>(request, RgcMeta.listManagedAccountsForParent, hcClient);
    }

    /**
     * 列举控制策略生效的注册OU信息
     *
     * 列举控制策略生效的注册OU信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedOrganizationalUnitsRequest 请求对象
     * @return ListManagedOrganizationalUnitsResponse
     */
    public ListManagedOrganizationalUnitsResponse listManagedOrganizationalUnits(
        ListManagedOrganizationalUnitsRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.listManagedOrganizationalUnits);
    }

    /**
     * 列举控制策略生效的注册OU信息
     *
     * 列举控制策略生效的注册OU信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedOrganizationalUnitsRequest 请求对象
     * @return SyncInvoker<ListManagedOrganizationalUnitsRequest, ListManagedOrganizationalUnitsResponse>
     */
    public SyncInvoker<ListManagedOrganizationalUnitsRequest, ListManagedOrganizationalUnitsResponse> listManagedOrganizationalUnitsInvoker(
        ListManagedOrganizationalUnitsRequest request) {
        return new SyncInvoker<>(request, RgcMeta.listManagedOrganizationalUnits, hcClient);
    }

    /**
     * 重新注册OU
     *
     * 重新注册组织里的某个OU到RGC服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReRegisterOrganizationalUnitRequest 请求对象
     * @return ReRegisterOrganizationalUnitResponse
     */
    public ReRegisterOrganizationalUnitResponse reRegisterOrganizationalUnit(
        ReRegisterOrganizationalUnitRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.reRegisterOrganizationalUnit);
    }

    /**
     * 重新注册OU
     *
     * 重新注册组织里的某个OU到RGC服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReRegisterOrganizationalUnitRequest 请求对象
     * @return SyncInvoker<ReRegisterOrganizationalUnitRequest, ReRegisterOrganizationalUnitResponse>
     */
    public SyncInvoker<ReRegisterOrganizationalUnitRequest, ReRegisterOrganizationalUnitResponse> reRegisterOrganizationalUnitInvoker(
        ReRegisterOrganizationalUnitRequest request) {
        return new SyncInvoker<>(request, RgcMeta.reRegisterOrganizationalUnit, hcClient);
    }

    /**
     * 注册OU
     *
     * 将组织里的某个OU注册到RGC服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterOrganizationalUnitRequest 请求对象
     * @return RegisterOrganizationalUnitResponse
     */
    public RegisterOrganizationalUnitResponse registerOrganizationalUnit(RegisterOrganizationalUnitRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.registerOrganizationalUnit);
    }

    /**
     * 注册OU
     *
     * 将组织里的某个OU注册到RGC服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterOrganizationalUnitRequest 请求对象
     * @return SyncInvoker<RegisterOrganizationalUnitRequest, RegisterOrganizationalUnitResponse>
     */
    public SyncInvoker<RegisterOrganizationalUnitRequest, RegisterOrganizationalUnitResponse> registerOrganizationalUnitInvoker(
        RegisterOrganizationalUnitRequest request) {
        return new SyncInvoker<>(request, RgcMeta.registerOrganizationalUnit, hcClient);
    }

    /**
     * 查询纳管账号信息
     *
     * 查询组织里某个纳管账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowManagedAccountRequest 请求对象
     * @return ShowManagedAccountResponse
     */
    public ShowManagedAccountResponse showManagedAccount(ShowManagedAccountRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.showManagedAccount);
    }

    /**
     * 查询纳管账号信息
     *
     * 查询组织里某个纳管账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowManagedAccountRequest 请求对象
     * @return SyncInvoker<ShowManagedAccountRequest, ShowManagedAccountResponse>
     */
    public SyncInvoker<ShowManagedAccountRequest, ShowManagedAccountResponse> showManagedAccountInvoker(
        ShowManagedAccountRequest request) {
        return new SyncInvoker<>(request, RgcMeta.showManagedAccount, hcClient);
    }

    /**
     * 列出核心纳管账号
     *
     * 列出组织里的所有核心纳管账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowManagedCoreAccountRequest 请求对象
     * @return ShowManagedCoreAccountResponse
     */
    public ShowManagedCoreAccountResponse showManagedCoreAccount(ShowManagedCoreAccountRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.showManagedCoreAccount);
    }

    /**
     * 列出核心纳管账号
     *
     * 列出组织里的所有核心纳管账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowManagedCoreAccountRequest 请求对象
     * @return SyncInvoker<ShowManagedCoreAccountRequest, ShowManagedCoreAccountResponse>
     */
    public SyncInvoker<ShowManagedCoreAccountRequest, ShowManagedCoreAccountResponse> showManagedCoreAccountInvoker(
        ShowManagedCoreAccountRequest request) {
        return new SyncInvoker<>(request, RgcMeta.showManagedCoreAccount, hcClient);
    }

    /**
     * 查询已注册OU信息
     *
     * 查询在RGC服务里的注册OU信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowManagedOrganizationalUnitRequest 请求对象
     * @return ShowManagedOrganizationalUnitResponse
     */
    public ShowManagedOrganizationalUnitResponse showManagedOrganizationalUnit(
        ShowManagedOrganizationalUnitRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.showManagedOrganizationalUnit);
    }

    /**
     * 查询已注册OU信息
     *
     * 查询在RGC服务里的注册OU信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowManagedOrganizationalUnitRequest 请求对象
     * @return SyncInvoker<ShowManagedOrganizationalUnitRequest, ShowManagedOrganizationalUnitResponse>
     */
    public SyncInvoker<ShowManagedOrganizationalUnitRequest, ShowManagedOrganizationalUnitResponse> showManagedOrganizationalUnitInvoker(
        ShowManagedOrganizationalUnitRequest request) {
        return new SyncInvoker<>(request, RgcMeta.showManagedOrganizationalUnit, hcClient);
    }

    /**
     * 查询注册过程信息
     *
     * 查询在RGC服务里注册/取消注册的过程信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOperationRequest 请求对象
     * @return ShowOperationResponse
     */
    public ShowOperationResponse showOperation(ShowOperationRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.showOperation);
    }

    /**
     * 查询注册过程信息
     *
     * 查询在RGC服务里注册/取消注册的过程信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOperationRequest 请求对象
     * @return SyncInvoker<ShowOperationRequest, ShowOperationResponse>
     */
    public SyncInvoker<ShowOperationRequest, ShowOperationResponse> showOperationInvoker(ShowOperationRequest request) {
        return new SyncInvoker<>(request, RgcMeta.showOperation, hcClient);
    }

    /**
     * 取消纳管账号
     *
     * 将组织里的某个账号从RGC服务里取消纳管。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnEnrollAccountRequest 请求对象
     * @return UnEnrollAccountResponse
     */
    public UnEnrollAccountResponse unEnrollAccount(UnEnrollAccountRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.unEnrollAccount);
    }

    /**
     * 取消纳管账号
     *
     * 将组织里的某个账号从RGC服务里取消纳管。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnEnrollAccountRequest 请求对象
     * @return SyncInvoker<UnEnrollAccountRequest, UnEnrollAccountResponse>
     */
    public SyncInvoker<UnEnrollAccountRequest, UnEnrollAccountResponse> unEnrollAccountInvoker(
        UnEnrollAccountRequest request) {
        return new SyncInvoker<>(request, RgcMeta.unEnrollAccount, hcClient);
    }

    /**
     * 更新纳管账号
     *
     * 更新组织里某个已在RGC服务的纳管账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateManagedAccountRequest 请求对象
     * @return UpdateManagedAccountResponse
     */
    public UpdateManagedAccountResponse updateManagedAccount(UpdateManagedAccountRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.updateManagedAccount);
    }

    /**
     * 更新纳管账号
     *
     * 更新组织里某个已在RGC服务的纳管账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateManagedAccountRequest 请求对象
     * @return SyncInvoker<UpdateManagedAccountRequest, UpdateManagedAccountResponse>
     */
    public SyncInvoker<UpdateManagedAccountRequest, UpdateManagedAccountResponse> updateManagedAccountInvoker(
        UpdateManagedAccountRequest request) {
        return new SyncInvoker<>(request, RgcMeta.updateManagedAccount, hcClient);
    }

}
