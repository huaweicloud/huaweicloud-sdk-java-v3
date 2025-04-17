package com.huaweicloud.sdk.antiddos.v2;

import com.huaweicloud.sdk.antiddos.v2.model.ListDDosStatusRequest;
import com.huaweicloud.sdk.antiddos.v2.model.ListDDosStatusResponse;
import com.huaweicloud.sdk.antiddos.v2.model.ListNewConfigsRequest;
import com.huaweicloud.sdk.antiddos.v2.model.ListNewConfigsResponse;
import com.huaweicloud.sdk.antiddos.v2.model.ShowAlertConfigRequest;
import com.huaweicloud.sdk.antiddos.v2.model.ShowAlertConfigResponse;
import com.huaweicloud.sdk.antiddos.v2.model.ShowNewTaskStatusRequest;
import com.huaweicloud.sdk.antiddos.v2.model.ShowNewTaskStatusResponse;
import com.huaweicloud.sdk.antiddos.v2.model.UpdateAlertConfigRequest;
import com.huaweicloud.sdk.antiddos.v2.model.UpdateAlertConfigResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class AntiDDoSClient {

    protected HcClient hcClient;

    public AntiDDoSClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AntiDDoSClient> newBuilder() {
        ClientBuilder<AntiDDoSClient> clientBuilder = new ClientBuilder<>(AntiDDoSClient::new);
        return clientBuilder;
    }

    /**
     * 查询告警配置信息
     *
     * 查询用户配置信息，用户可以通过此接口查询是否接收某类告警，同时可以配置是手机短信还是电子邮件接收告警信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertConfigRequest 请求对象
     * @return ShowAlertConfigResponse
     */
    public ShowAlertConfigResponse showAlertConfig(ShowAlertConfigRequest request) {
        return hcClient.syncInvokeHttp(request, AntiDDoSMeta.showAlertConfig);
    }

    /**
     * 查询告警配置信息
     *
     * 查询用户配置信息，用户可以通过此接口查询是否接收某类告警，同时可以配置是手机短信还是电子邮件接收告警信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertConfigRequest 请求对象
     * @return SyncInvoker<ShowAlertConfigRequest, ShowAlertConfigResponse>
     */
    public SyncInvoker<ShowAlertConfigRequest, ShowAlertConfigResponse> showAlertConfigInvoker(
        ShowAlertConfigRequest request) {
        return new SyncInvoker<>(request, AntiDDoSMeta.showAlertConfig, hcClient);
    }

    /**
     * 更新告警配置信息
     *
     * 更新用户配置信息，用户可以通过此接口更新是否接收某类告警，同时可以配置是手机短信还是电子邮件接收告警信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlertConfigRequest 请求对象
     * @return UpdateAlertConfigResponse
     */
    public UpdateAlertConfigResponse updateAlertConfig(UpdateAlertConfigRequest request) {
        return hcClient.syncInvokeHttp(request, AntiDDoSMeta.updateAlertConfig);
    }

    /**
     * 更新告警配置信息
     *
     * 更新用户配置信息，用户可以通过此接口更新是否接收某类告警，同时可以配置是手机短信还是电子邮件接收告警信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlertConfigRequest 请求对象
     * @return SyncInvoker<UpdateAlertConfigRequest, UpdateAlertConfigResponse>
     */
    public SyncInvoker<UpdateAlertConfigRequest, UpdateAlertConfigResponse> updateAlertConfigInvoker(
        UpdateAlertConfigRequest request) {
        return new SyncInvoker<>(request, AntiDDoSMeta.updateAlertConfig, hcClient);
    }

    /**
     * 查询EIP防护状态列表
     *
     * 查询用户所有EIP的Anti-DDoS防护状态信息，用户的EIP无论是否绑定到云服务器，都可以进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDDosStatusRequest 请求对象
     * @return ListDDosStatusResponse
     */
    public ListDDosStatusResponse listDDosStatus(ListDDosStatusRequest request) {
        return hcClient.syncInvokeHttp(request, AntiDDoSMeta.listDDosStatus);
    }

    /**
     * 查询EIP防护状态列表
     *
     * 查询用户所有EIP的Anti-DDoS防护状态信息，用户的EIP无论是否绑定到云服务器，都可以进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDDosStatusRequest 请求对象
     * @return SyncInvoker<ListDDosStatusRequest, ListDDosStatusResponse>
     */
    public SyncInvoker<ListDDosStatusRequest, ListDDosStatusResponse> listDDosStatusInvoker(
        ListDDosStatusRequest request) {
        return new SyncInvoker<>(request, AntiDDoSMeta.listDDosStatus, hcClient);
    }

    /**
     * 查询Anti-DDoS配置可选范围
     *
     * 查询系统支持的Anti-DDoS防护策略配置的可选范围，用户根据范围列表选择适合自已业务的防护策略进行Anti-DDoS流量清洗。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNewConfigsRequest 请求对象
     * @return ListNewConfigsResponse
     */
    public ListNewConfigsResponse listNewConfigs(ListNewConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, AntiDDoSMeta.listNewConfigs);
    }

    /**
     * 查询Anti-DDoS配置可选范围
     *
     * 查询系统支持的Anti-DDoS防护策略配置的可选范围，用户根据范围列表选择适合自已业务的防护策略进行Anti-DDoS流量清洗。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNewConfigsRequest 请求对象
     * @return SyncInvoker<ListNewConfigsRequest, ListNewConfigsResponse>
     */
    public SyncInvoker<ListNewConfigsRequest, ListNewConfigsResponse> listNewConfigsInvoker(
        ListNewConfigsRequest request) {
        return new SyncInvoker<>(request, AntiDDoSMeta.listNewConfigs, hcClient);
    }

    /**
     * 查询Anti-DDoS任务
     *
     * 用户查询指定的Anti-DDoS防护配置任务，得到任务当前执行的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNewTaskStatusRequest 请求对象
     * @return ShowNewTaskStatusResponse
     */
    public ShowNewTaskStatusResponse showNewTaskStatus(ShowNewTaskStatusRequest request) {
        return hcClient.syncInvokeHttp(request, AntiDDoSMeta.showNewTaskStatus);
    }

    /**
     * 查询Anti-DDoS任务
     *
     * 用户查询指定的Anti-DDoS防护配置任务，得到任务当前执行的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNewTaskStatusRequest 请求对象
     * @return SyncInvoker<ShowNewTaskStatusRequest, ShowNewTaskStatusResponse>
     */
    public SyncInvoker<ShowNewTaskStatusRequest, ShowNewTaskStatusResponse> showNewTaskStatusInvoker(
        ShowNewTaskStatusRequest request) {
        return new SyncInvoker<>(request, AntiDDoSMeta.showNewTaskStatus, hcClient);
    }

}
