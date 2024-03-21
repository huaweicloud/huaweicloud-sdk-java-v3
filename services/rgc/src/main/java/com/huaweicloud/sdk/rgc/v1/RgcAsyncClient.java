package com.huaweicloud.sdk.rgc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.rgc.v1.model.CheckLaunchRequest;
import com.huaweicloud.sdk.rgc.v1.model.CheckLaunchResponse;
import com.huaweicloud.sdk.rgc.v1.model.CreateAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.CreateAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.CreateTemplateRequest;
import com.huaweicloud.sdk.rgc.v1.model.CreateTemplateResponse;
import com.huaweicloud.sdk.rgc.v1.model.DeleteManagedOrganizationalUnitsRequest;
import com.huaweicloud.sdk.rgc.v1.model.DeleteManagedOrganizationalUnitsResponse;
import com.huaweicloud.sdk.rgc.v1.model.DeleteTemplateRequest;
import com.huaweicloud.sdk.rgc.v1.model.DeleteTemplateResponse;
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
import com.huaweicloud.sdk.rgc.v1.model.ListOperationRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListOperationResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListPredefinedTemplatesRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListPredefinedTemplatesResponse;
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
import com.huaweicloud.sdk.rgc.v1.model.ShowTemplateDeployParamsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowTemplateDeployParamsResponse;
import com.huaweicloud.sdk.rgc.v1.model.UnEnrollAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.UnEnrollAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.UpdateManagedAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.UpdateManagedAccountResponse;

import java.util.concurrent.CompletableFuture;

public class RgcAsyncClient {

    protected HcClient hcClient;

    public RgcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RgcAsyncClient> newBuilder() {
        ClientBuilder<RgcAsyncClient> clientBuilder = new ClientBuilder<>(RgcAsyncClient::new);
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
     * @return CompletableFuture<DisableControlResponse>
     */
    public CompletableFuture<DisableControlResponse> disableControlAsync(DisableControlRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.disableControl);
    }

    /**
     * 关闭控制策略
     *
     * 关闭组织下的某个单元的某个控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableControlRequest 请求对象
     * @return AsyncInvoker<DisableControlRequest, DisableControlResponse>
     */
    public AsyncInvoker<DisableControlRequest, DisableControlResponse> disableControlAsyncInvoker(
        DisableControlRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.disableControl, hcClient);
    }

    /**
     * 开启控制策略
     *
     * 给组织下的某个单元开启某个控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableControlRequest 请求对象
     * @return CompletableFuture<EnableControlResponse>
     */
    public CompletableFuture<EnableControlResponse> enableControlAsync(EnableControlRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.enableControl);
    }

    /**
     * 开启控制策略
     *
     * 给组织下的某个单元开启某个控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableControlRequest 请求对象
     * @return AsyncInvoker<EnableControlRequest, EnableControlResponse>
     */
    public AsyncInvoker<EnableControlRequest, EnableControlResponse> enableControlAsyncInvoker(
        EnableControlRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.enableControl, hcClient);
    }

    /**
     * 查询纳管账号的Config规则合规性信息
     *
     * 查询纳管账号的Config规则合规性信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigRuleComplianceRequest 请求对象
     * @return CompletableFuture<ListConfigRuleComplianceResponse>
     */
    public CompletableFuture<ListConfigRuleComplianceResponse> listConfigRuleComplianceAsync(
        ListConfigRuleComplianceRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.listConfigRuleCompliance);
    }

    /**
     * 查询纳管账号的Config规则合规性信息
     *
     * 查询纳管账号的Config规则合规性信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigRuleComplianceRequest 请求对象
     * @return AsyncInvoker<ListConfigRuleComplianceRequest, ListConfigRuleComplianceResponse>
     */
    public AsyncInvoker<ListConfigRuleComplianceRequest, ListConfigRuleComplianceResponse> listConfigRuleComplianceAsyncInvoker(
        ListConfigRuleComplianceRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.listConfigRuleCompliance, hcClient);
    }

    /**
     * 列出不合规信息
     *
     * 列出组织里所有不合规的资源信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListControlViolationsRequest 请求对象
     * @return CompletableFuture<ListControlViolationsResponse>
     */
    public CompletableFuture<ListControlViolationsResponse> listControlViolationsAsync(
        ListControlViolationsRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.listControlViolations);
    }

    /**
     * 列出不合规信息
     *
     * 列出组织里所有不合规的资源信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListControlViolationsRequest 请求对象
     * @return AsyncInvoker<ListControlViolationsRequest, ListControlViolationsResponse>
     */
    public AsyncInvoker<ListControlViolationsRequest, ListControlViolationsResponse> listControlViolationsAsyncInvoker(
        ListControlViolationsRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.listControlViolations, hcClient);
    }

    /**
     * 列出控制策略
     *
     * 列出RGC服务里所有的预置控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListControlsRequest 请求对象
     * @return CompletableFuture<ListControlsResponse>
     */
    public CompletableFuture<ListControlsResponse> listControlsAsync(ListControlsRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.listControls);
    }

    /**
     * 列出控制策略
     *
     * 列出RGC服务里所有的预置控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListControlsRequest 请求对象
     * @return AsyncInvoker<ListControlsRequest, ListControlsResponse>
     */
    public AsyncInvoker<ListControlsRequest, ListControlsResponse> listControlsAsyncInvoker(
        ListControlsRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.listControls, hcClient);
    }

    /**
     * 列出纳管账号下开启的控制策略
     *
     * 列出组织里某个纳管账号开启的所有控制策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListControlsForAccountRequest 请求对象
     * @return CompletableFuture<ListControlsForAccountResponse>
     */
    public CompletableFuture<ListControlsForAccountResponse> listControlsForAccountAsync(
        ListControlsForAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.listControlsForAccount);
    }

    /**
     * 列出纳管账号下开启的控制策略
     *
     * 列出组织里某个纳管账号开启的所有控制策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListControlsForAccountRequest 请求对象
     * @return AsyncInvoker<ListControlsForAccountRequest, ListControlsForAccountResponse>
     */
    public AsyncInvoker<ListControlsForAccountRequest, ListControlsForAccountResponse> listControlsForAccountAsyncInvoker(
        ListControlsForAccountRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.listControlsForAccount, hcClient);
    }

    /**
     * 列出注册OU下开启的控制策略
     *
     * 列出组织里某个注册OU开启的所有控制策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListControlsForOrganizationUnitRequest 请求对象
     * @return CompletableFuture<ListControlsForOrganizationUnitResponse>
     */
    public CompletableFuture<ListControlsForOrganizationUnitResponse> listControlsForOrganizationUnitAsync(
        ListControlsForOrganizationUnitRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.listControlsForOrganizationUnit);
    }

    /**
     * 列出注册OU下开启的控制策略
     *
     * 列出组织里某个注册OU开启的所有控制策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListControlsForOrganizationUnitRequest 请求对象
     * @return AsyncInvoker<ListControlsForOrganizationUnitRequest, ListControlsForOrganizationUnitResponse>
     */
    public AsyncInvoker<ListControlsForOrganizationUnitRequest, ListControlsForOrganizationUnitResponse> listControlsForOrganizationUnitAsyncInvoker(
        ListControlsForOrganizationUnitRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.listControlsForOrganizationUnit, hcClient);
    }

    /**
     * 列出漂移信息
     *
     * 列出Landing Zone的所有漂移详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDriftDetailsRequest 请求对象
     * @return CompletableFuture<ListDriftDetailsResponse>
     */
    public CompletableFuture<ListDriftDetailsResponse> listDriftDetailsAsync(ListDriftDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.listDriftDetails);
    }

    /**
     * 列出漂移信息
     *
     * 列出Landing Zone的所有漂移详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDriftDetailsRequest 请求对象
     * @return AsyncInvoker<ListDriftDetailsRequest, ListDriftDetailsResponse>
     */
    public AsyncInvoker<ListDriftDetailsRequest, ListDriftDetailsResponse> listDriftDetailsAsyncInvoker(
        ListDriftDetailsRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.listDriftDetails, hcClient);
    }

    /**
     * 列出开启的控制策略
     *
     * 列出组织里开启的所有控制策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnabledControlsRequest 请求对象
     * @return CompletableFuture<ListEnabledControlsResponse>
     */
    public CompletableFuture<ListEnabledControlsResponse> listEnabledControlsAsync(ListEnabledControlsRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.listEnabledControls);
    }

    /**
     * 列出开启的控制策略
     *
     * 列出组织里开启的所有控制策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnabledControlsRequest 请求对象
     * @return AsyncInvoker<ListEnabledControlsRequest, ListEnabledControlsResponse>
     */
    public AsyncInvoker<ListEnabledControlsRequest, ListEnabledControlsResponse> listEnabledControlsAsyncInvoker(
        ListEnabledControlsRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.listEnabledControls, hcClient);
    }

    /**
     * 查询纳管账号的合规状态
     *
     * 查询组织里某个纳管账号的资源合规状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComplianceStatusForAccountRequest 请求对象
     * @return CompletableFuture<ShowComplianceStatusForAccountResponse>
     */
    public CompletableFuture<ShowComplianceStatusForAccountResponse> showComplianceStatusForAccountAsync(
        ShowComplianceStatusForAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.showComplianceStatusForAccount);
    }

    /**
     * 查询纳管账号的合规状态
     *
     * 查询组织里某个纳管账号的资源合规状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComplianceStatusForAccountRequest 请求对象
     * @return AsyncInvoker<ShowComplianceStatusForAccountRequest, ShowComplianceStatusForAccountResponse>
     */
    public AsyncInvoker<ShowComplianceStatusForAccountRequest, ShowComplianceStatusForAccountResponse> showComplianceStatusForAccountAsyncInvoker(
        ShowComplianceStatusForAccountRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.showComplianceStatusForAccount, hcClient);
    }

    /**
     * 查询注册OU的合规状态
     *
     * 查询组织里某个注册OU下所有纳管账号的资源合规状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComplianceStatusForOrganizationUnitRequest 请求对象
     * @return CompletableFuture<ShowComplianceStatusForOrganizationUnitResponse>
     */
    public CompletableFuture<ShowComplianceStatusForOrganizationUnitResponse> showComplianceStatusForOrganizationUnitAsync(
        ShowComplianceStatusForOrganizationUnitRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.showComplianceStatusForOrganizationUnit);
    }

    /**
     * 查询注册OU的合规状态
     *
     * 查询组织里某个注册OU下所有纳管账号的资源合规状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComplianceStatusForOrganizationUnitRequest 请求对象
     * @return AsyncInvoker<ShowComplianceStatusForOrganizationUnitRequest, ShowComplianceStatusForOrganizationUnitResponse>
     */
    public AsyncInvoker<ShowComplianceStatusForOrganizationUnitRequest, ShowComplianceStatusForOrganizationUnitResponse> showComplianceStatusForOrganizationUnitAsyncInvoker(
        ShowComplianceStatusForOrganizationUnitRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.showComplianceStatusForOrganizationUnit, hcClient);
    }

    /**
     * 查询控制策略详细信息
     *
     * 查询单个预置的控制策略详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowControlRequest 请求对象
     * @return CompletableFuture<ShowControlResponse>
     */
    public CompletableFuture<ShowControlResponse> showControlAsync(ShowControlRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.showControl);
    }

    /**
     * 查询控制策略详细信息
     *
     * 查询单个预置的控制策略详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowControlRequest 请求对象
     * @return AsyncInvoker<ShowControlRequest, ShowControlResponse>
     */
    public AsyncInvoker<ShowControlRequest, ShowControlResponse> showControlAsyncInvoker(ShowControlRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.showControl, hcClient);
    }

    /**
     * 查询控制策略操作状态
     *
     * 根据操作ID查询返回指定ID的操作状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowControlOperateRequest 请求对象
     * @return CompletableFuture<ShowControlOperateResponse>
     */
    public CompletableFuture<ShowControlOperateResponse> showControlOperateAsync(ShowControlOperateRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.showControlOperate);
    }

    /**
     * 查询控制策略操作状态
     *
     * 根据操作ID查询返回指定ID的操作状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowControlOperateRequest 请求对象
     * @return AsyncInvoker<ShowControlOperateRequest, ShowControlOperateResponse>
     */
    public AsyncInvoker<ShowControlOperateRequest, ShowControlOperateResponse> showControlOperateAsyncInvoker(
        ShowControlOperateRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.showControlOperate, hcClient);
    }

    /**
     * 查询注册OU开启的控制策略
     *
     * 查询组织里某个注册OU下开启的某个控制策略的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowControlsForOrganizationUnitRequest 请求对象
     * @return CompletableFuture<ShowControlsForOrganizationUnitResponse>
     */
    public CompletableFuture<ShowControlsForOrganizationUnitResponse> showControlsForOrganizationUnitAsync(
        ShowControlsForOrganizationUnitRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.showControlsForOrganizationUnit);
    }

    /**
     * 查询注册OU开启的控制策略
     *
     * 查询组织里某个注册OU下开启的某个控制策略的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowControlsForOrganizationUnitRequest 请求对象
     * @return AsyncInvoker<ShowControlsForOrganizationUnitRequest, ShowControlsForOrganizationUnitResponse>
     */
    public AsyncInvoker<ShowControlsForOrganizationUnitRequest, ShowControlsForOrganizationUnitResponse> showControlsForOrganizationUnitAsyncInvoker(
        ShowControlsForOrganizationUnitRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.showControlsForOrganizationUnit, hcClient);
    }

    /**
     * 设置Landing Zone前检查
     *
     * 在设置Landing Zone之前，检查当前区域是否可以设置Landing Zone。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckLaunchRequest 请求对象
     * @return CompletableFuture<CheckLaunchResponse>
     */
    public CompletableFuture<CheckLaunchResponse> checkLaunchAsync(CheckLaunchRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.checkLaunch);
    }

    /**
     * 设置Landing Zone前检查
     *
     * 在设置Landing Zone之前，检查当前区域是否可以设置Landing Zone。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckLaunchRequest 请求对象
     * @return AsyncInvoker<CheckLaunchRequest, CheckLaunchResponse>
     */
    public AsyncInvoker<CheckLaunchRequest, CheckLaunchResponse> checkLaunchAsyncInvoker(CheckLaunchRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.checkLaunch, hcClient);
    }

    /**
     * 设置Landing Zone
     *
     * 在当前区域创建或者更新Landing Zone。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetupLandingZoneRequest 请求对象
     * @return CompletableFuture<SetupLandingZoneResponse>
     */
    public CompletableFuture<SetupLandingZoneResponse> setupLandingZoneAsync(SetupLandingZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.setupLandingZone);
    }

    /**
     * 设置Landing Zone
     *
     * 在当前区域创建或者更新Landing Zone。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetupLandingZoneRequest 请求对象
     * @return AsyncInvoker<SetupLandingZoneRequest, SetupLandingZoneResponse>
     */
    public AsyncInvoker<SetupLandingZoneRequest, SetupLandingZoneResponse> setupLandingZoneAsyncInvoker(
        SetupLandingZoneRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.setupLandingZone, hcClient);
    }

    /**
     * 查询Landing Zone可更新状态
     *
     * 查询Landing Zone当前是否需要升级更新。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailableUpdatesRequest 请求对象
     * @return CompletableFuture<ShowAvailableUpdatesResponse>
     */
    public CompletableFuture<ShowAvailableUpdatesResponse> showAvailableUpdatesAsync(
        ShowAvailableUpdatesRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.showAvailableUpdates);
    }

    /**
     * 查询Landing Zone可更新状态
     *
     * 查询Landing Zone当前是否需要升级更新。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailableUpdatesRequest 请求对象
     * @return AsyncInvoker<ShowAvailableUpdatesRequest, ShowAvailableUpdatesResponse>
     */
    public AsyncInvoker<ShowAvailableUpdatesRequest, ShowAvailableUpdatesResponse> showAvailableUpdatesAsyncInvoker(
        ShowAvailableUpdatesRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.showAvailableUpdates, hcClient);
    }

    /**
     * 查询主区域
     *
     * 查询Landing Zone的主区域。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHomeRegionRequest 请求对象
     * @return CompletableFuture<ShowHomeRegionResponse>
     */
    public CompletableFuture<ShowHomeRegionResponse> showHomeRegionAsync(ShowHomeRegionRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.showHomeRegion);
    }

    /**
     * 查询主区域
     *
     * 查询Landing Zone的主区域。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHomeRegionRequest 请求对象
     * @return AsyncInvoker<ShowHomeRegionRequest, ShowHomeRegionResponse>
     */
    public AsyncInvoker<ShowHomeRegionRequest, ShowHomeRegionResponse> showHomeRegionAsyncInvoker(
        ShowHomeRegionRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.showHomeRegion, hcClient);
    }

    /**
     * 查询Landing Zone的配置
     *
     * 查询当前客户的Landing Zone的所有配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLandingZoneConfigurationRequest 请求对象
     * @return CompletableFuture<ShowLandingZoneConfigurationResponse>
     */
    public CompletableFuture<ShowLandingZoneConfigurationResponse> showLandingZoneConfigurationAsync(
        ShowLandingZoneConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.showLandingZoneConfiguration);
    }

    /**
     * 查询Landing Zone的配置
     *
     * 查询当前客户的Landing Zone的所有配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLandingZoneConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowLandingZoneConfigurationRequest, ShowLandingZoneConfigurationResponse>
     */
    public AsyncInvoker<ShowLandingZoneConfigurationRequest, ShowLandingZoneConfigurationResponse> showLandingZoneConfigurationAsyncInvoker(
        ShowLandingZoneConfigurationRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.showLandingZoneConfiguration, hcClient);
    }

    /**
     * 查询当前客户的Identity Center用户信息
     *
     * 查询当前客户的Identity Center用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLandingZoneIdentityCenterRequest 请求对象
     * @return CompletableFuture<ShowLandingZoneIdentityCenterResponse>
     */
    public CompletableFuture<ShowLandingZoneIdentityCenterResponse> showLandingZoneIdentityCenterAsync(
        ShowLandingZoneIdentityCenterRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.showLandingZoneIdentityCenter);
    }

    /**
     * 查询当前客户的Identity Center用户信息
     *
     * 查询当前客户的Identity Center用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLandingZoneIdentityCenterRequest 请求对象
     * @return AsyncInvoker<ShowLandingZoneIdentityCenterRequest, ShowLandingZoneIdentityCenterResponse>
     */
    public AsyncInvoker<ShowLandingZoneIdentityCenterRequest, ShowLandingZoneIdentityCenterResponse> showLandingZoneIdentityCenterAsyncInvoker(
        ShowLandingZoneIdentityCenterRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.showLandingZoneIdentityCenter, hcClient);
    }

    /**
     * 查询Landing Zone设置状态
     *
     * 查询Landing Zone的设置状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLandingZoneStatusRequest 请求对象
     * @return CompletableFuture<ShowLandingZoneStatusResponse>
     */
    public CompletableFuture<ShowLandingZoneStatusResponse> showLandingZoneStatusAsync(
        ShowLandingZoneStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.showLandingZoneStatus);
    }

    /**
     * 查询Landing Zone设置状态
     *
     * 查询Landing Zone的设置状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLandingZoneStatusRequest 请求对象
     * @return AsyncInvoker<ShowLandingZoneStatusRequest, ShowLandingZoneStatusResponse>
     */
    public AsyncInvoker<ShowLandingZoneStatusRequest, ShowLandingZoneStatusResponse> showLandingZoneStatusAsyncInvoker(
        ShowLandingZoneStatusRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.showLandingZoneStatus, hcClient);
    }

    /**
     * 创建账号
     *
     * 在组织里的某个注册OU下创建账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccountRequest 请求对象
     * @return CompletableFuture<CreateAccountResponse>
     */
    public CompletableFuture<CreateAccountResponse> createAccountAsync(CreateAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.createAccount);
    }

    /**
     * 创建账号
     *
     * 在组织里的某个注册OU下创建账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccountRequest 请求对象
     * @return AsyncInvoker<CreateAccountRequest, CreateAccountResponse>
     */
    public AsyncInvoker<CreateAccountRequest, CreateAccountResponse> createAccountAsyncInvoker(
        CreateAccountRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.createAccount, hcClient);
    }

    /**
     * 删除注册OU
     *
     * 在组织里删除已注册OU。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteManagedOrganizationalUnitsRequest 请求对象
     * @return CompletableFuture<DeleteManagedOrganizationalUnitsResponse>
     */
    public CompletableFuture<DeleteManagedOrganizationalUnitsResponse> deleteManagedOrganizationalUnitsAsync(
        DeleteManagedOrganizationalUnitsRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.deleteManagedOrganizationalUnits);
    }

    /**
     * 删除注册OU
     *
     * 在组织里删除已注册OU。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteManagedOrganizationalUnitsRequest 请求对象
     * @return AsyncInvoker<DeleteManagedOrganizationalUnitsRequest, DeleteManagedOrganizationalUnitsResponse>
     */
    public AsyncInvoker<DeleteManagedOrganizationalUnitsRequest, DeleteManagedOrganizationalUnitsResponse> deleteManagedOrganizationalUnitsAsyncInvoker(
        DeleteManagedOrganizationalUnitsRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.deleteManagedOrganizationalUnits, hcClient);
    }

    /**
     * 取消注册OU
     *
     * 将组织里的某个OU从RGC服务里取消注册。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeregisterOrganizationalUnitRequest 请求对象
     * @return CompletableFuture<DeregisterOrganizationalUnitResponse>
     */
    public CompletableFuture<DeregisterOrganizationalUnitResponse> deregisterOrganizationalUnitAsync(
        DeregisterOrganizationalUnitRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.deregisterOrganizationalUnit);
    }

    /**
     * 取消注册OU
     *
     * 将组织里的某个OU从RGC服务里取消注册。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeregisterOrganizationalUnitRequest 请求对象
     * @return AsyncInvoker<DeregisterOrganizationalUnitRequest, DeregisterOrganizationalUnitResponse>
     */
    public AsyncInvoker<DeregisterOrganizationalUnitRequest, DeregisterOrganizationalUnitResponse> deregisterOrganizationalUnitAsyncInvoker(
        DeregisterOrganizationalUnitRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.deregisterOrganizationalUnit, hcClient);
    }

    /**
     * 纳管账号
     *
     * 将组织里的某个账号纳管到RGC服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnrollAccountRequest 请求对象
     * @return CompletableFuture<EnrollAccountResponse>
     */
    public CompletableFuture<EnrollAccountResponse> enrollAccountAsync(EnrollAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.enrollAccount);
    }

    /**
     * 纳管账号
     *
     * 将组织里的某个账号纳管到RGC服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnrollAccountRequest 请求对象
     * @return AsyncInvoker<EnrollAccountRequest, EnrollAccountResponse>
     */
    public AsyncInvoker<EnrollAccountRequest, EnrollAccountResponse> enrollAccountAsyncInvoker(
        EnrollAccountRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.enrollAccount, hcClient);
    }

    /**
     * 列举控制策略生效的纳管账号信息
     *
     * 列举控制策略生效的纳管账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedAccountsRequest 请求对象
     * @return CompletableFuture<ListManagedAccountsResponse>
     */
    public CompletableFuture<ListManagedAccountsResponse> listManagedAccountsAsync(ListManagedAccountsRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.listManagedAccounts);
    }

    /**
     * 列举控制策略生效的纳管账号信息
     *
     * 列举控制策略生效的纳管账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedAccountsRequest 请求对象
     * @return AsyncInvoker<ListManagedAccountsRequest, ListManagedAccountsResponse>
     */
    public AsyncInvoker<ListManagedAccountsRequest, ListManagedAccountsResponse> listManagedAccountsAsyncInvoker(
        ListManagedAccountsRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.listManagedAccounts, hcClient);
    }

    /**
     * 列出注册OU下的纳管账号信息
     *
     * 列出组织里某个注册OU下的所有纳管账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedAccountsForParentRequest 请求对象
     * @return CompletableFuture<ListManagedAccountsForParentResponse>
     */
    public CompletableFuture<ListManagedAccountsForParentResponse> listManagedAccountsForParentAsync(
        ListManagedAccountsForParentRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.listManagedAccountsForParent);
    }

    /**
     * 列出注册OU下的纳管账号信息
     *
     * 列出组织里某个注册OU下的所有纳管账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedAccountsForParentRequest 请求对象
     * @return AsyncInvoker<ListManagedAccountsForParentRequest, ListManagedAccountsForParentResponse>
     */
    public AsyncInvoker<ListManagedAccountsForParentRequest, ListManagedAccountsForParentResponse> listManagedAccountsForParentAsyncInvoker(
        ListManagedAccountsForParentRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.listManagedAccountsForParent, hcClient);
    }

    /**
     * 列举控制策略生效的注册OU信息
     *
     * 列举控制策略生效的注册OU信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedOrganizationalUnitsRequest 请求对象
     * @return CompletableFuture<ListManagedOrganizationalUnitsResponse>
     */
    public CompletableFuture<ListManagedOrganizationalUnitsResponse> listManagedOrganizationalUnitsAsync(
        ListManagedOrganizationalUnitsRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.listManagedOrganizationalUnits);
    }

    /**
     * 列举控制策略生效的注册OU信息
     *
     * 列举控制策略生效的注册OU信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManagedOrganizationalUnitsRequest 请求对象
     * @return AsyncInvoker<ListManagedOrganizationalUnitsRequest, ListManagedOrganizationalUnitsResponse>
     */
    public AsyncInvoker<ListManagedOrganizationalUnitsRequest, ListManagedOrganizationalUnitsResponse> listManagedOrganizationalUnitsAsyncInvoker(
        ListManagedOrganizationalUnitsRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.listManagedOrganizationalUnits, hcClient);
    }

    /**
     * 查询已注册OU和纳管帐号操作过程信息列表
     *
     * 查询在RGC服务里已注册OU和纳管帐号操作的过程信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOperationRequest 请求对象
     * @return CompletableFuture<ListOperationResponse>
     */
    public CompletableFuture<ListOperationResponse> listOperationAsync(ListOperationRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.listOperation);
    }

    /**
     * 查询已注册OU和纳管帐号操作过程信息列表
     *
     * 查询在RGC服务里已注册OU和纳管帐号操作的过程信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOperationRequest 请求对象
     * @return AsyncInvoker<ListOperationRequest, ListOperationResponse>
     */
    public AsyncInvoker<ListOperationRequest, ListOperationResponse> listOperationAsyncInvoker(
        ListOperationRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.listOperation, hcClient);
    }

    /**
     * 重新注册OU
     *
     * 重新注册组织里的某个OU到RGC服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReRegisterOrganizationalUnitRequest 请求对象
     * @return CompletableFuture<ReRegisterOrganizationalUnitResponse>
     */
    public CompletableFuture<ReRegisterOrganizationalUnitResponse> reRegisterOrganizationalUnitAsync(
        ReRegisterOrganizationalUnitRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.reRegisterOrganizationalUnit);
    }

    /**
     * 重新注册OU
     *
     * 重新注册组织里的某个OU到RGC服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReRegisterOrganizationalUnitRequest 请求对象
     * @return AsyncInvoker<ReRegisterOrganizationalUnitRequest, ReRegisterOrganizationalUnitResponse>
     */
    public AsyncInvoker<ReRegisterOrganizationalUnitRequest, ReRegisterOrganizationalUnitResponse> reRegisterOrganizationalUnitAsyncInvoker(
        ReRegisterOrganizationalUnitRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.reRegisterOrganizationalUnit, hcClient);
    }

    /**
     * 注册OU
     *
     * 将组织里的某个OU注册到RGC服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterOrganizationalUnitRequest 请求对象
     * @return CompletableFuture<RegisterOrganizationalUnitResponse>
     */
    public CompletableFuture<RegisterOrganizationalUnitResponse> registerOrganizationalUnitAsync(
        RegisterOrganizationalUnitRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.registerOrganizationalUnit);
    }

    /**
     * 注册OU
     *
     * 将组织里的某个OU注册到RGC服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterOrganizationalUnitRequest 请求对象
     * @return AsyncInvoker<RegisterOrganizationalUnitRequest, RegisterOrganizationalUnitResponse>
     */
    public AsyncInvoker<RegisterOrganizationalUnitRequest, RegisterOrganizationalUnitResponse> registerOrganizationalUnitAsyncInvoker(
        RegisterOrganizationalUnitRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.registerOrganizationalUnit, hcClient);
    }

    /**
     * 查询纳管账号信息
     *
     * 查询组织里某个纳管账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowManagedAccountRequest 请求对象
     * @return CompletableFuture<ShowManagedAccountResponse>
     */
    public CompletableFuture<ShowManagedAccountResponse> showManagedAccountAsync(ShowManagedAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.showManagedAccount);
    }

    /**
     * 查询纳管账号信息
     *
     * 查询组织里某个纳管账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowManagedAccountRequest 请求对象
     * @return AsyncInvoker<ShowManagedAccountRequest, ShowManagedAccountResponse>
     */
    public AsyncInvoker<ShowManagedAccountRequest, ShowManagedAccountResponse> showManagedAccountAsyncInvoker(
        ShowManagedAccountRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.showManagedAccount, hcClient);
    }

    /**
     * 列出核心纳管账号
     *
     * 列出组织里的所有核心纳管账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowManagedCoreAccountRequest 请求对象
     * @return CompletableFuture<ShowManagedCoreAccountResponse>
     */
    public CompletableFuture<ShowManagedCoreAccountResponse> showManagedCoreAccountAsync(
        ShowManagedCoreAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.showManagedCoreAccount);
    }

    /**
     * 列出核心纳管账号
     *
     * 列出组织里的所有核心纳管账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowManagedCoreAccountRequest 请求对象
     * @return AsyncInvoker<ShowManagedCoreAccountRequest, ShowManagedCoreAccountResponse>
     */
    public AsyncInvoker<ShowManagedCoreAccountRequest, ShowManagedCoreAccountResponse> showManagedCoreAccountAsyncInvoker(
        ShowManagedCoreAccountRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.showManagedCoreAccount, hcClient);
    }

    /**
     * 查询已注册OU信息
     *
     * 查询在RGC服务里的注册OU信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowManagedOrganizationalUnitRequest 请求对象
     * @return CompletableFuture<ShowManagedOrganizationalUnitResponse>
     */
    public CompletableFuture<ShowManagedOrganizationalUnitResponse> showManagedOrganizationalUnitAsync(
        ShowManagedOrganizationalUnitRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.showManagedOrganizationalUnit);
    }

    /**
     * 查询已注册OU信息
     *
     * 查询在RGC服务里的注册OU信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowManagedOrganizationalUnitRequest 请求对象
     * @return AsyncInvoker<ShowManagedOrganizationalUnitRequest, ShowManagedOrganizationalUnitResponse>
     */
    public AsyncInvoker<ShowManagedOrganizationalUnitRequest, ShowManagedOrganizationalUnitResponse> showManagedOrganizationalUnitAsyncInvoker(
        ShowManagedOrganizationalUnitRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.showManagedOrganizationalUnit, hcClient);
    }

    /**
     * 查询注册过程信息
     *
     * 查询在RGC服务里注册/取消注册的过程信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOperationRequest 请求对象
     * @return CompletableFuture<ShowOperationResponse>
     */
    public CompletableFuture<ShowOperationResponse> showOperationAsync(ShowOperationRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.showOperation);
    }

    /**
     * 查询注册过程信息
     *
     * 查询在RGC服务里注册/取消注册的过程信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOperationRequest 请求对象
     * @return AsyncInvoker<ShowOperationRequest, ShowOperationResponse>
     */
    public AsyncInvoker<ShowOperationRequest, ShowOperationResponse> showOperationAsyncInvoker(
        ShowOperationRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.showOperation, hcClient);
    }

    /**
     * 取消纳管账号
     *
     * 将组织里的某个账号从RGC服务里取消纳管。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnEnrollAccountRequest 请求对象
     * @return CompletableFuture<UnEnrollAccountResponse>
     */
    public CompletableFuture<UnEnrollAccountResponse> unEnrollAccountAsync(UnEnrollAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.unEnrollAccount);
    }

    /**
     * 取消纳管账号
     *
     * 将组织里的某个账号从RGC服务里取消纳管。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnEnrollAccountRequest 请求对象
     * @return AsyncInvoker<UnEnrollAccountRequest, UnEnrollAccountResponse>
     */
    public AsyncInvoker<UnEnrollAccountRequest, UnEnrollAccountResponse> unEnrollAccountAsyncInvoker(
        UnEnrollAccountRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.unEnrollAccount, hcClient);
    }

    /**
     * 更新纳管账号
     *
     * 更新组织里某个已在RGC服务的纳管账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateManagedAccountRequest 请求对象
     * @return CompletableFuture<UpdateManagedAccountResponse>
     */
    public CompletableFuture<UpdateManagedAccountResponse> updateManagedAccountAsync(
        UpdateManagedAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.updateManagedAccount);
    }

    /**
     * 更新纳管账号
     *
     * 更新组织里某个已在RGC服务的纳管账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateManagedAccountRequest 请求对象
     * @return AsyncInvoker<UpdateManagedAccountRequest, UpdateManagedAccountResponse>
     */
    public AsyncInvoker<UpdateManagedAccountRequest, UpdateManagedAccountResponse> updateManagedAccountAsyncInvoker(
        UpdateManagedAccountRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.updateManagedAccount, hcClient);
    }

    /**
     * 创建模板。
     *
     * 创建RFS模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateRequest 请求对象
     * @return CompletableFuture<CreateTemplateResponse>
     */
    public CompletableFuture<CreateTemplateResponse> createTemplateAsync(CreateTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.createTemplate);
    }

    /**
     * 创建模板。
     *
     * 创建RFS模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateRequest 请求对象
     * @return AsyncInvoker<CreateTemplateRequest, CreateTemplateResponse>
     */
    public AsyncInvoker<CreateTemplateRequest, CreateTemplateResponse> createTemplateAsyncInvoker(
        CreateTemplateRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.createTemplate, hcClient);
    }

    /**
     * 删除模板。
     *
     * 删除RFS模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateRequest 请求对象
     * @return CompletableFuture<DeleteTemplateResponse>
     */
    public CompletableFuture<DeleteTemplateResponse> deleteTemplateAsync(DeleteTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.deleteTemplate);
    }

    /**
     * 删除模板。
     *
     * 删除RFS模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>
     */
    public AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateAsyncInvoker(
        DeleteTemplateRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.deleteTemplate, hcClient);
    }

    /**
     * 查询预置模板列表
     *
     * 查询预置模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPredefinedTemplatesRequest 请求对象
     * @return CompletableFuture<ListPredefinedTemplatesResponse>
     */
    public CompletableFuture<ListPredefinedTemplatesResponse> listPredefinedTemplatesAsync(
        ListPredefinedTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.listPredefinedTemplates);
    }

    /**
     * 查询预置模板列表
     *
     * 查询预置模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPredefinedTemplatesRequest 请求对象
     * @return AsyncInvoker<ListPredefinedTemplatesRequest, ListPredefinedTemplatesResponse>
     */
    public AsyncInvoker<ListPredefinedTemplatesRequest, ListPredefinedTemplatesResponse> listPredefinedTemplatesAsyncInvoker(
        ListPredefinedTemplatesRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.listPredefinedTemplates, hcClient);
    }

    /**
     * 查询模板的部署参数。
     *
     * 查询模板的部署参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateDeployParamsRequest 请求对象
     * @return CompletableFuture<ShowTemplateDeployParamsResponse>
     */
    public CompletableFuture<ShowTemplateDeployParamsResponse> showTemplateDeployParamsAsync(
        ShowTemplateDeployParamsRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.showTemplateDeployParams);
    }

    /**
     * 查询模板的部署参数。
     *
     * 查询模板的部署参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateDeployParamsRequest 请求对象
     * @return AsyncInvoker<ShowTemplateDeployParamsRequest, ShowTemplateDeployParamsResponse>
     */
    public AsyncInvoker<ShowTemplateDeployParamsRequest, ShowTemplateDeployParamsResponse> showTemplateDeployParamsAsyncInvoker(
        ShowTemplateDeployParamsRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.showTemplateDeployParams, hcClient);
    }

}
