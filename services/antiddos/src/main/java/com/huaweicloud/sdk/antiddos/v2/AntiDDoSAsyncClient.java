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
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class AntiDDoSAsyncClient {

    protected HcClient hcClient;

    public AntiDDoSAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AntiDDoSAsyncClient> newBuilder() {
        ClientBuilder<AntiDDoSAsyncClient> clientBuilder = new ClientBuilder<>(AntiDDoSAsyncClient::new);
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
     * @return CompletableFuture<ShowAlertConfigResponse>
     */
    public CompletableFuture<ShowAlertConfigResponse> showAlertConfigAsync(ShowAlertConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, AntiDDoSMeta.showAlertConfig);
    }

    /**
     * 查询告警配置信息
     *
     * 查询用户配置信息，用户可以通过此接口查询是否接收某类告警，同时可以配置是手机短信还是电子邮件接收告警信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertConfigRequest 请求对象
     * @return AsyncInvoker<ShowAlertConfigRequest, ShowAlertConfigResponse>
     */
    public AsyncInvoker<ShowAlertConfigRequest, ShowAlertConfigResponse> showAlertConfigAsyncInvoker(
        ShowAlertConfigRequest request) {
        return new AsyncInvoker<>(request, AntiDDoSMeta.showAlertConfig, hcClient);
    }

    /**
     * 更新告警配置信息
     *
     * 更新用户配置信息，用户可以通过此接口更新是否接收某类告警，同时可以配置是手机短信还是电子邮件接收告警信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlertConfigRequest 请求对象
     * @return CompletableFuture<UpdateAlertConfigResponse>
     */
    public CompletableFuture<UpdateAlertConfigResponse> updateAlertConfigAsync(UpdateAlertConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, AntiDDoSMeta.updateAlertConfig);
    }

    /**
     * 更新告警配置信息
     *
     * 更新用户配置信息，用户可以通过此接口更新是否接收某类告警，同时可以配置是手机短信还是电子邮件接收告警信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlertConfigRequest 请求对象
     * @return AsyncInvoker<UpdateAlertConfigRequest, UpdateAlertConfigResponse>
     */
    public AsyncInvoker<UpdateAlertConfigRequest, UpdateAlertConfigResponse> updateAlertConfigAsyncInvoker(
        UpdateAlertConfigRequest request) {
        return new AsyncInvoker<>(request, AntiDDoSMeta.updateAlertConfig, hcClient);
    }

    /**
     * 查询EIP防护状态列表
     *
     * 查询用户所有EIP的Anti-DDoS防护状态信息，用户的EIP无论是否绑定到云服务器，都可以进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDDosStatusRequest 请求对象
     * @return CompletableFuture<ListDDosStatusResponse>
     */
    public CompletableFuture<ListDDosStatusResponse> listDDosStatusAsync(ListDDosStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, AntiDDoSMeta.listDDosStatus);
    }

    /**
     * 查询EIP防护状态列表
     *
     * 查询用户所有EIP的Anti-DDoS防护状态信息，用户的EIP无论是否绑定到云服务器，都可以进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDDosStatusRequest 请求对象
     * @return AsyncInvoker<ListDDosStatusRequest, ListDDosStatusResponse>
     */
    public AsyncInvoker<ListDDosStatusRequest, ListDDosStatusResponse> listDDosStatusAsyncInvoker(
        ListDDosStatusRequest request) {
        return new AsyncInvoker<>(request, AntiDDoSMeta.listDDosStatus, hcClient);
    }

    /**
     * 查询Anti-DDoS配置可选范围
     *
     * 查询系统支持的Anti-DDoS防护策略配置的可选范围，用户根据范围列表选择适合自已业务的防护策略进行Anti-DDoS流量清洗。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNewConfigsRequest 请求对象
     * @return CompletableFuture<ListNewConfigsResponse>
     */
    public CompletableFuture<ListNewConfigsResponse> listNewConfigsAsync(ListNewConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, AntiDDoSMeta.listNewConfigs);
    }

    /**
     * 查询Anti-DDoS配置可选范围
     *
     * 查询系统支持的Anti-DDoS防护策略配置的可选范围，用户根据范围列表选择适合自已业务的防护策略进行Anti-DDoS流量清洗。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNewConfigsRequest 请求对象
     * @return AsyncInvoker<ListNewConfigsRequest, ListNewConfigsResponse>
     */
    public AsyncInvoker<ListNewConfigsRequest, ListNewConfigsResponse> listNewConfigsAsyncInvoker(
        ListNewConfigsRequest request) {
        return new AsyncInvoker<>(request, AntiDDoSMeta.listNewConfigs, hcClient);
    }

    /**
     * 查询Anti-DDoS任务
     *
     * 用户查询指定的Anti-DDoS防护配置任务，得到任务当前执行的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNewTaskStatusRequest 请求对象
     * @return CompletableFuture<ShowNewTaskStatusResponse>
     */
    public CompletableFuture<ShowNewTaskStatusResponse> showNewTaskStatusAsync(ShowNewTaskStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, AntiDDoSMeta.showNewTaskStatus);
    }

    /**
     * 查询Anti-DDoS任务
     *
     * 用户查询指定的Anti-DDoS防护配置任务，得到任务当前执行的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNewTaskStatusRequest 请求对象
     * @return AsyncInvoker<ShowNewTaskStatusRequest, ShowNewTaskStatusResponse>
     */
    public AsyncInvoker<ShowNewTaskStatusRequest, ShowNewTaskStatusResponse> showNewTaskStatusAsyncInvoker(
        ShowNewTaskStatusRequest request) {
        return new AsyncInvoker<>(request, AntiDDoSMeta.showNewTaskStatus, hcClient);
    }

}
