package com.huaweicloud.sdk.antiddos.v1;

import com.huaweicloud.sdk.antiddos.v1.model.CreateDefaultConfigRequest;
import com.huaweicloud.sdk.antiddos.v1.model.CreateDefaultConfigResponse;
import com.huaweicloud.sdk.antiddos.v1.model.DeleteDefaultConfigRequest;
import com.huaweicloud.sdk.antiddos.v1.model.DeleteDefaultConfigResponse;
import com.huaweicloud.sdk.antiddos.v1.model.EnableDefensePolicyRequest;
import com.huaweicloud.sdk.antiddos.v1.model.EnableDefensePolicyResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ListDDosStatusRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ListDDosStatusResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ListDailyLogRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ListDailyLogResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ListDailyReportRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ListDailyReportResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ListQuotaRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ListQuotaResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ListWeeklyReportsRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ListWeeklyReportsResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ShowDDosRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ShowDDosResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ShowDDosStatusRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ShowDDosStatusResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ShowDefaultConfigRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ShowDefaultConfigResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ShowLogConfigRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ShowLogConfigResponse;
import com.huaweicloud.sdk.antiddos.v1.model.UpdateDDosRequest;
import com.huaweicloud.sdk.antiddos.v1.model.UpdateDDosResponse;
import com.huaweicloud.sdk.antiddos.v1.model.UpdateLogConfigRequest;
import com.huaweicloud.sdk.antiddos.v1.model.UpdateLogConfigResponse;
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
     * 开通DDoS服务
     *
     * 开通DDoS服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDefensePolicyRequest 请求对象
     * @return EnableDefensePolicyResponse
     */
    public EnableDefensePolicyResponse enableDefensePolicy(EnableDefensePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AntiDDoSMeta.enableDefensePolicy);
    }

    /**
     * 开通DDoS服务
     *
     * 开通DDoS服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDefensePolicyRequest 请求对象
     * @return SyncInvoker<EnableDefensePolicyRequest, EnableDefensePolicyResponse>
     */
    public SyncInvoker<EnableDefensePolicyRequest, EnableDefensePolicyResponse> enableDefensePolicyInvoker(
        EnableDefensePolicyRequest request) {
        return new SyncInvoker<>(request, AntiDDoSMeta.enableDefensePolicy, hcClient);
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
     * 查询配额
     *
     * 查询配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotaRequest 请求对象
     * @return ListQuotaResponse
     */
    public ListQuotaResponse listQuota(ListQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, AntiDDoSMeta.listQuota);
    }

    /**
     * 查询配额
     *
     * 查询配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotaRequest 请求对象
     * @return SyncInvoker<ListQuotaRequest, ListQuotaResponse>
     */
    public SyncInvoker<ListQuotaRequest, ListQuotaResponse> listQuotaInvoker(ListQuotaRequest request) {
        return new SyncInvoker<>(request, AntiDDoSMeta.listQuota, hcClient);
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
     * 查询全量日志设置
     *
     * 查询全量日志设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogConfigRequest 请求对象
     * @return ShowLogConfigResponse
     */
    public ShowLogConfigResponse showLogConfig(ShowLogConfigRequest request) {
        return hcClient.syncInvokeHttp(request, AntiDDoSMeta.showLogConfig);
    }

    /**
     * 查询全量日志设置
     *
     * 查询全量日志设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogConfigRequest 请求对象
     * @return SyncInvoker<ShowLogConfigRequest, ShowLogConfigResponse>
     */
    public SyncInvoker<ShowLogConfigRequest, ShowLogConfigResponse> showLogConfigInvoker(ShowLogConfigRequest request) {
        return new SyncInvoker<>(request, AntiDDoSMeta.showLogConfig, hcClient);
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

    /**
     * 更新用户全量日志设置
     *
     * 更新用户全量日志设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogConfigRequest 请求对象
     * @return UpdateLogConfigResponse
     */
    public UpdateLogConfigResponse updateLogConfig(UpdateLogConfigRequest request) {
        return hcClient.syncInvokeHttp(request, AntiDDoSMeta.updateLogConfig);
    }

    /**
     * 更新用户全量日志设置
     *
     * 更新用户全量日志设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogConfigRequest 请求对象
     * @return SyncInvoker<UpdateLogConfigRequest, UpdateLogConfigResponse>
     */
    public SyncInvoker<UpdateLogConfigRequest, UpdateLogConfigResponse> updateLogConfigInvoker(
        UpdateLogConfigRequest request) {
        return new SyncInvoker<>(request, AntiDDoSMeta.updateLogConfig, hcClient);
    }

}
