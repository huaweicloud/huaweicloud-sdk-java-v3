package com.huaweicloud.sdk.rgc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
     * 列出注册OU下开启的控制策略
     *
     * 列出组织里某个注册OU开启的所有控制策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListControlsForOrganizationalUnitRequest 请求对象
     * @return CompletableFuture<ListControlsForOrganizationalUnitResponse>
     */
    public CompletableFuture<ListControlsForOrganizationalUnitResponse> listControlsForOrganizationalUnitAsync(
        ListControlsForOrganizationalUnitRequest request) {
        return hcClient.asyncInvokeHttp(request, RgcMeta.listControlsForOrganizationalUnit);
    }

    /**
     * 列出注册OU下开启的控制策略
     *
     * 列出组织里某个注册OU开启的所有控制策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListControlsForOrganizationalUnitRequest 请求对象
     * @return AsyncInvoker<ListControlsForOrganizationalUnitRequest, ListControlsForOrganizationalUnitResponse>
     */
    public AsyncInvoker<ListControlsForOrganizationalUnitRequest, ListControlsForOrganizationalUnitResponse> listControlsForOrganizationalUnitAsyncInvoker(
        ListControlsForOrganizationalUnitRequest request) {
        return new AsyncInvoker<>(request, RgcMeta.listControlsForOrganizationalUnit, hcClient);
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

}
