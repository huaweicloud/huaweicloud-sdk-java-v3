package com.huaweicloud.sdk.antiddos.v1;

import com.huaweicloud.sdk.antiddos.v1.model.CreateDefaultConfigRequest;
import com.huaweicloud.sdk.antiddos.v1.model.CreateDefaultConfigResponse;
import com.huaweicloud.sdk.antiddos.v1.model.DeleteDefaultConfigRequest;
import com.huaweicloud.sdk.antiddos.v1.model.DeleteDefaultConfigResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ListDDosStatusRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ListDDosStatusResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ListDailyLogRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ListDailyLogResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ListDailyReportRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ListDailyReportResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ListNewConfigsRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ListNewConfigsResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ListWeeklyReportsRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ListWeeklyReportsResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ShowAlertConfigRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ShowAlertConfigResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ShowDDosRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ShowDDosResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ShowDDosStatusRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ShowDDosStatusResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ShowDefaultConfigRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ShowDefaultConfigResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ShowNewTaskStatusRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ShowNewTaskStatusResponse;
import com.huaweicloud.sdk.antiddos.v1.model.UpdateAlertConfigRequest;
import com.huaweicloud.sdk.antiddos.v1.model.UpdateAlertConfigResponse;
import com.huaweicloud.sdk.antiddos.v1.model.UpdateDDosRequest;
import com.huaweicloud.sdk.antiddos.v1.model.UpdateDDosResponse;
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
     * 配置Anti-DDoS默认防护策略
     *
     * 配置用户的默认防护策略。配置防护策略后，新购买的资源在自动开启防护时，会按照该默认防护策略进行配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDefaultConfigRequest 请求对象
     * @return CreateDefaultConfigResponse
     */
    public CreateDefaultConfigResponse createDefaultConfig(CreateDefaultConfigRequest request) {
        return hcClient.syncInvokeHttp(request, AntiDDoSMeta.createDefaultConfig);
    }

    /**
     * 配置Anti-DDoS默认防护策略
     *
     * 配置用户的默认防护策略。配置防护策略后，新购买的资源在自动开启防护时，会按照该默认防护策略进行配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDefaultConfigRequest 请求对象
     * @return SyncInvoker<CreateDefaultConfigRequest, CreateDefaultConfigResponse>
     */
    public SyncInvoker<CreateDefaultConfigRequest, CreateDefaultConfigResponse> createDefaultConfigInvoker(
        CreateDefaultConfigRequest request) {
        return new SyncInvoker<>(request, AntiDDoSMeta.createDefaultConfig, hcClient);
    }

    /**
     * 删除Ani-DDoS默认防护策略
     *
     * 删除用户配置的默认防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDefaultConfigRequest 请求对象
     * @return DeleteDefaultConfigResponse
     */
    public DeleteDefaultConfigResponse deleteDefaultConfig(DeleteDefaultConfigRequest request) {
        return hcClient.syncInvokeHttp(request, AntiDDoSMeta.deleteDefaultConfig);
    }

    /**
     * 删除Ani-DDoS默认防护策略
     *
     * 删除用户配置的默认防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDefaultConfigRequest 请求对象
     * @return SyncInvoker<DeleteDefaultConfigRequest, DeleteDefaultConfigResponse>
     */
    public SyncInvoker<DeleteDefaultConfigRequest, DeleteDefaultConfigResponse> deleteDefaultConfigInvoker(
        DeleteDefaultConfigRequest request) {
        return new SyncInvoker<>(request, AntiDDoSMeta.deleteDefaultConfig, hcClient);
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
     * 查询Ani-DDoS默认防护策略
     *
     * 查询用户配置的默认防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDefaultConfigRequest 请求对象
     * @return ShowDefaultConfigResponse
     */
    public ShowDefaultConfigResponse showDefaultConfig(ShowDefaultConfigRequest request) {
        return hcClient.syncInvokeHttp(request, AntiDDoSMeta.showDefaultConfig);
    }

    /**
     * 查询Ani-DDoS默认防护策略
     *
     * 查询用户配置的默认防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDefaultConfigRequest 请求对象
     * @return SyncInvoker<ShowDefaultConfigRequest, ShowDefaultConfigResponse>
     */
    public SyncInvoker<ShowDefaultConfigRequest, ShowDefaultConfigResponse> showDefaultConfigInvoker(
        ShowDefaultConfigRequest request) {
        return new SyncInvoker<>(request, AntiDDoSMeta.showDefaultConfig, hcClient);
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
     * 查询指定EIP异常事件
     *
     * 查询指定EIP在过去24小时之内的异常事件信息，异常事件包括清洗事件和黑洞事件，查询延迟在5分钟之内。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDailyLogRequest 请求对象
     * @return ListDailyLogResponse
     */
    public ListDailyLogResponse listDailyLog(ListDailyLogRequest request) {
        return hcClient.syncInvokeHttp(request, AntiDDoSMeta.listDailyLog);
    }

    /**
     * 查询指定EIP异常事件
     *
     * 查询指定EIP在过去24小时之内的异常事件信息，异常事件包括清洗事件和黑洞事件，查询延迟在5分钟之内。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDailyLogRequest 请求对象
     * @return SyncInvoker<ListDailyLogRequest, ListDailyLogResponse>
     */
    public SyncInvoker<ListDailyLogRequest, ListDailyLogResponse> listDailyLogInvoker(ListDailyLogRequest request) {
        return new SyncInvoker<>(request, AntiDDoSMeta.listDailyLog, hcClient);
    }

    /**
     * 查询指定EIP防护流量
     *
     * 查询指定EIP在过去24小时之内的防护流量信息，流量的间隔时间单位为5分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDailyReportRequest 请求对象
     * @return ListDailyReportResponse
     */
    public ListDailyReportResponse listDailyReport(ListDailyReportRequest request) {
        return hcClient.syncInvokeHttp(request, AntiDDoSMeta.listDailyReport);
    }

    /**
     * 查询指定EIP防护流量
     *
     * 查询指定EIP在过去24小时之内的防护流量信息，流量的间隔时间单位为5分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDailyReportRequest 请求对象
     * @return SyncInvoker<ListDailyReportRequest, ListDailyReportResponse>
     */
    public SyncInvoker<ListDailyReportRequest, ListDailyReportResponse> listDailyReportInvoker(
        ListDailyReportRequest request) {
        return new SyncInvoker<>(request, AntiDDoSMeta.listDailyReport, hcClient);
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
     * 查询周防护统计情况
     *
     * 查询用户所有Anti-DDoS防护周统计情况，包括一周内DDoS拦截次数和攻击次数、以及按照被攻击次数进行的排名信息等统计数据。系统支持当前时间之前四周的周统计数据查询，超过这个时间的请求是查询不到统计数据的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWeeklyReportsRequest 请求对象
     * @return ListWeeklyReportsResponse
     */
    public ListWeeklyReportsResponse listWeeklyReports(ListWeeklyReportsRequest request) {
        return hcClient.syncInvokeHttp(request, AntiDDoSMeta.listWeeklyReports);
    }

    /**
     * 查询周防护统计情况
     *
     * 查询用户所有Anti-DDoS防护周统计情况，包括一周内DDoS拦截次数和攻击次数、以及按照被攻击次数进行的排名信息等统计数据。系统支持当前时间之前四周的周统计数据查询，超过这个时间的请求是查询不到统计数据的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWeeklyReportsRequest 请求对象
     * @return SyncInvoker<ListWeeklyReportsRequest, ListWeeklyReportsResponse>
     */
    public SyncInvoker<ListWeeklyReportsRequest, ListWeeklyReportsResponse> listWeeklyReportsInvoker(
        ListWeeklyReportsRequest request) {
        return new SyncInvoker<>(request, AntiDDoSMeta.listWeeklyReports, hcClient);
    }

    /**
     * 查询Anti-DDoS服务
     *
     * 查询配置的Anti-DDoS防护策略，用户可以查询指定EIP的Anti-DDoS防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDDosRequest 请求对象
     * @return ShowDDosResponse
     */
    public ShowDDosResponse showDDos(ShowDDosRequest request) {
        return hcClient.syncInvokeHttp(request, AntiDDoSMeta.showDDos);
    }

    /**
     * 查询Anti-DDoS服务
     *
     * 查询配置的Anti-DDoS防护策略，用户可以查询指定EIP的Anti-DDoS防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDDosRequest 请求对象
     * @return SyncInvoker<ShowDDosRequest, ShowDDosResponse>
     */
    public SyncInvoker<ShowDDosRequest, ShowDDosResponse> showDDosInvoker(ShowDDosRequest request) {
        return new SyncInvoker<>(request, AntiDDoSMeta.showDDos, hcClient);
    }

    /**
     * 查询指定EIP防护状态
     *
     * 查询指定EIP的Anti-DDoS防护状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDDosStatusRequest 请求对象
     * @return ShowDDosStatusResponse
     */
    public ShowDDosStatusResponse showDDosStatus(ShowDDosStatusRequest request) {
        return hcClient.syncInvokeHttp(request, AntiDDoSMeta.showDDosStatus);
    }

    /**
     * 查询指定EIP防护状态
     *
     * 查询指定EIP的Anti-DDoS防护状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDDosStatusRequest 请求对象
     * @return SyncInvoker<ShowDDosStatusRequest, ShowDDosStatusResponse>
     */
    public SyncInvoker<ShowDDosStatusRequest, ShowDDosStatusResponse> showDDosStatusInvoker(
        ShowDDosStatusRequest request) {
        return new SyncInvoker<>(request, AntiDDoSMeta.showDDosStatus, hcClient);
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

    /**
     * 更新Anti-DDoS服务
     *
     * 更新指定EIP的Anti-DDoS防护策略配置。调用成功，只是说明服务节点收到了关闭更新配置请求，操作是否成功需要通过任务查询接口查询该任务的执行状态，具体请参考查询Anti-DDoS任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDDosRequest 请求对象
     * @return UpdateDDosResponse
     */
    public UpdateDDosResponse updateDDos(UpdateDDosRequest request) {
        return hcClient.syncInvokeHttp(request, AntiDDoSMeta.updateDDos);
    }

    /**
     * 更新Anti-DDoS服务
     *
     * 更新指定EIP的Anti-DDoS防护策略配置。调用成功，只是说明服务节点收到了关闭更新配置请求，操作是否成功需要通过任务查询接口查询该任务的执行状态，具体请参考查询Anti-DDoS任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDDosRequest 请求对象
     * @return SyncInvoker<UpdateDDosRequest, UpdateDDosResponse>
     */
    public SyncInvoker<UpdateDDosRequest, UpdateDDosResponse> updateDDosInvoker(UpdateDDosRequest request) {
        return new SyncInvoker<>(request, AntiDDoSMeta.updateDDos, hcClient);
    }

}
