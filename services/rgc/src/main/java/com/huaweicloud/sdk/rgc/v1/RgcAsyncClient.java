package com.huaweicloud.sdk.rgc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.rgc.v1.model.DisableControlRequest;
import com.huaweicloud.sdk.rgc.v1.model.DisableControlResponse;
import com.huaweicloud.sdk.rgc.v1.model.EnableControlRequest;
import com.huaweicloud.sdk.rgc.v1.model.EnableControlResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForOrganizationUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForOrganizationUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlOperateRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlOperateResponse;

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

}
