package com.huaweicloud.sdk.rgc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.rgc.v1.model.CreateAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.CreateAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.DisableControlRequest;
import com.huaweicloud.sdk.rgc.v1.model.DisableControlResponse;
import com.huaweicloud.sdk.rgc.v1.model.EnableControlRequest;
import com.huaweicloud.sdk.rgc.v1.model.EnableControlResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForOrganizationalUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForOrganizationalUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListEnabledControlsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListEnabledControlsResponse;
import com.huaweicloud.sdk.rgc.v1.model.RegisterOrganizationalUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.RegisterOrganizationalUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlOperateRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlOperateResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowOperationRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowOperationResponse;

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
     * 列出注册OU下开启的控制策略
     *
     * 列出组织里某个注册OU开启的所有控制策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListControlsForOrganizationalUnitRequest 请求对象
     * @return ListControlsForOrganizationalUnitResponse
     */
    public ListControlsForOrganizationalUnitResponse listControlsForOrganizationalUnit(
        ListControlsForOrganizationalUnitRequest request) {
        return hcClient.syncInvokeHttp(request, RgcMeta.listControlsForOrganizationalUnit);
    }

    /**
     * 列出注册OU下开启的控制策略
     *
     * 列出组织里某个注册OU开启的所有控制策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListControlsForOrganizationalUnitRequest 请求对象
     * @return SyncInvoker<ListControlsForOrganizationalUnitRequest, ListControlsForOrganizationalUnitResponse>
     */
    public SyncInvoker<ListControlsForOrganizationalUnitRequest, ListControlsForOrganizationalUnitResponse> listControlsForOrganizationalUnitInvoker(
        ListControlsForOrganizationalUnitRequest request) {
        return new SyncInvoker<>(request, RgcMeta.listControlsForOrganizationalUnit, hcClient);
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

}
