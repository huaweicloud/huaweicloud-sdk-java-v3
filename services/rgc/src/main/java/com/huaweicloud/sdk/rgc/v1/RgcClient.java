package com.huaweicloud.sdk.rgc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.rgc.v1.model.DisableControlRequest;
import com.huaweicloud.sdk.rgc.v1.model.DisableControlResponse;
import com.huaweicloud.sdk.rgc.v1.model.EnableControlRequest;
import com.huaweicloud.sdk.rgc.v1.model.EnableControlResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForOrganizationUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForOrganizationUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlOperateRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlOperateResponse;

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

}
