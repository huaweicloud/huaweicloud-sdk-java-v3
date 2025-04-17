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
     * 配置Anti-DDoS默认防护策略
     *
     * 配置用户的默认防护策略。配置防护策略后，新购买的资源在自动开启防护时，会按照该默认防护策略进行配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDefaultConfigRequest 请求对象
     * @return CompletableFuture<CreateDefaultConfigResponse>
     */
    public CompletableFuture<CreateDefaultConfigResponse> createDefaultConfigAsync(CreateDefaultConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, AntiDDoSMeta.createDefaultConfig);
    }

    /**
     * 配置Anti-DDoS默认防护策略
     *
     * 配置用户的默认防护策略。配置防护策略后，新购买的资源在自动开启防护时，会按照该默认防护策略进行配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDefaultConfigRequest 请求对象
     * @return AsyncInvoker<CreateDefaultConfigRequest, CreateDefaultConfigResponse>
     */
    public AsyncInvoker<CreateDefaultConfigRequest, CreateDefaultConfigResponse> createDefaultConfigAsyncInvoker(
        CreateDefaultConfigRequest request) {
        return new AsyncInvoker<>(request, AntiDDoSMeta.createDefaultConfig, hcClient);
    }

    /**
     * 删除Ani-DDoS默认防护策略
     *
     * 删除用户配置的默认防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDefaultConfigRequest 请求对象
     * @return CompletableFuture<DeleteDefaultConfigResponse>
     */
    public CompletableFuture<DeleteDefaultConfigResponse> deleteDefaultConfigAsync(DeleteDefaultConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, AntiDDoSMeta.deleteDefaultConfig);
    }

    /**
     * 删除Ani-DDoS默认防护策略
     *
     * 删除用户配置的默认防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDefaultConfigRequest 请求对象
     * @return AsyncInvoker<DeleteDefaultConfigRequest, DeleteDefaultConfigResponse>
     */
    public AsyncInvoker<DeleteDefaultConfigRequest, DeleteDefaultConfigResponse> deleteDefaultConfigAsyncInvoker(
        DeleteDefaultConfigRequest request) {
        return new AsyncInvoker<>(request, AntiDDoSMeta.deleteDefaultConfig, hcClient);
    }

    /**
     * 查询Ani-DDoS默认防护策略
     *
     * 查询用户配置的默认防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDefaultConfigRequest 请求对象
     * @return CompletableFuture<ShowDefaultConfigResponse>
     */
    public CompletableFuture<ShowDefaultConfigResponse> showDefaultConfigAsync(ShowDefaultConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, AntiDDoSMeta.showDefaultConfig);
    }

    /**
     * 查询Ani-DDoS默认防护策略
     *
     * 查询用户配置的默认防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDefaultConfigRequest 请求对象
     * @return AsyncInvoker<ShowDefaultConfigRequest, ShowDefaultConfigResponse>
     */
    public AsyncInvoker<ShowDefaultConfigRequest, ShowDefaultConfigResponse> showDefaultConfigAsyncInvoker(
        ShowDefaultConfigRequest request) {
        return new AsyncInvoker<>(request, AntiDDoSMeta.showDefaultConfig, hcClient);
    }

    /**
     * 开通DDoS服务
     *
     * 开通DDoS服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDefensePolicyRequest 请求对象
     * @return CompletableFuture<EnableDefensePolicyResponse>
     */
    public CompletableFuture<EnableDefensePolicyResponse> enableDefensePolicyAsync(EnableDefensePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AntiDDoSMeta.enableDefensePolicy);
    }

    /**
     * 开通DDoS服务
     *
     * 开通DDoS服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDefensePolicyRequest 请求对象
     * @return AsyncInvoker<EnableDefensePolicyRequest, EnableDefensePolicyResponse>
     */
    public AsyncInvoker<EnableDefensePolicyRequest, EnableDefensePolicyResponse> enableDefensePolicyAsyncInvoker(
        EnableDefensePolicyRequest request) {
        return new AsyncInvoker<>(request, AntiDDoSMeta.enableDefensePolicy, hcClient);
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
     * 查询指定EIP异常事件
     *
     * 查询指定EIP在过去24小时之内的异常事件信息，异常事件包括清洗事件和黑洞事件，查询延迟在5分钟之内。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDailyLogRequest 请求对象
     * @return CompletableFuture<ListDailyLogResponse>
     */
    public CompletableFuture<ListDailyLogResponse> listDailyLogAsync(ListDailyLogRequest request) {
        return hcClient.asyncInvokeHttp(request, AntiDDoSMeta.listDailyLog);
    }

    /**
     * 查询指定EIP异常事件
     *
     * 查询指定EIP在过去24小时之内的异常事件信息，异常事件包括清洗事件和黑洞事件，查询延迟在5分钟之内。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDailyLogRequest 请求对象
     * @return AsyncInvoker<ListDailyLogRequest, ListDailyLogResponse>
     */
    public AsyncInvoker<ListDailyLogRequest, ListDailyLogResponse> listDailyLogAsyncInvoker(
        ListDailyLogRequest request) {
        return new AsyncInvoker<>(request, AntiDDoSMeta.listDailyLog, hcClient);
    }

    /**
     * 查询指定EIP防护流量
     *
     * 查询指定EIP在过去24小时之内的防护流量信息，流量的间隔时间单位为5分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDailyReportRequest 请求对象
     * @return CompletableFuture<ListDailyReportResponse>
     */
    public CompletableFuture<ListDailyReportResponse> listDailyReportAsync(ListDailyReportRequest request) {
        return hcClient.asyncInvokeHttp(request, AntiDDoSMeta.listDailyReport);
    }

    /**
     * 查询指定EIP防护流量
     *
     * 查询指定EIP在过去24小时之内的防护流量信息，流量的间隔时间单位为5分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDailyReportRequest 请求对象
     * @return AsyncInvoker<ListDailyReportRequest, ListDailyReportResponse>
     */
    public AsyncInvoker<ListDailyReportRequest, ListDailyReportResponse> listDailyReportAsyncInvoker(
        ListDailyReportRequest request) {
        return new AsyncInvoker<>(request, AntiDDoSMeta.listDailyReport, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotaRequest 请求对象
     * @return CompletableFuture<ListQuotaResponse>
     */
    public CompletableFuture<ListQuotaResponse> listQuotaAsync(ListQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, AntiDDoSMeta.listQuota);
    }

    /**
     * 查询配额
     *
     * 查询配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotaRequest 请求对象
     * @return AsyncInvoker<ListQuotaRequest, ListQuotaResponse>
     */
    public AsyncInvoker<ListQuotaRequest, ListQuotaResponse> listQuotaAsyncInvoker(ListQuotaRequest request) {
        return new AsyncInvoker<>(request, AntiDDoSMeta.listQuota, hcClient);
    }

    /**
     * 查询周防护统计情况
     *
     * 查询用户所有Anti-DDoS防护周统计情况，包括一周内DDoS拦截次数和攻击次数、以及按照被攻击次数进行的排名信息等统计数据。系统支持当前时间之前四周的周统计数据查询，超过这个时间的请求是查询不到统计数据的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWeeklyReportsRequest 请求对象
     * @return CompletableFuture<ListWeeklyReportsResponse>
     */
    public CompletableFuture<ListWeeklyReportsResponse> listWeeklyReportsAsync(ListWeeklyReportsRequest request) {
        return hcClient.asyncInvokeHttp(request, AntiDDoSMeta.listWeeklyReports);
    }

    /**
     * 查询周防护统计情况
     *
     * 查询用户所有Anti-DDoS防护周统计情况，包括一周内DDoS拦截次数和攻击次数、以及按照被攻击次数进行的排名信息等统计数据。系统支持当前时间之前四周的周统计数据查询，超过这个时间的请求是查询不到统计数据的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWeeklyReportsRequest 请求对象
     * @return AsyncInvoker<ListWeeklyReportsRequest, ListWeeklyReportsResponse>
     */
    public AsyncInvoker<ListWeeklyReportsRequest, ListWeeklyReportsResponse> listWeeklyReportsAsyncInvoker(
        ListWeeklyReportsRequest request) {
        return new AsyncInvoker<>(request, AntiDDoSMeta.listWeeklyReports, hcClient);
    }

    /**
     * 查询Anti-DDoS服务
     *
     * 查询配置的Anti-DDoS防护策略，用户可以查询指定EIP的Anti-DDoS防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDDosRequest 请求对象
     * @return CompletableFuture<ShowDDosResponse>
     */
    public CompletableFuture<ShowDDosResponse> showDDosAsync(ShowDDosRequest request) {
        return hcClient.asyncInvokeHttp(request, AntiDDoSMeta.showDDos);
    }

    /**
     * 查询Anti-DDoS服务
     *
     * 查询配置的Anti-DDoS防护策略，用户可以查询指定EIP的Anti-DDoS防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDDosRequest 请求对象
     * @return AsyncInvoker<ShowDDosRequest, ShowDDosResponse>
     */
    public AsyncInvoker<ShowDDosRequest, ShowDDosResponse> showDDosAsyncInvoker(ShowDDosRequest request) {
        return new AsyncInvoker<>(request, AntiDDoSMeta.showDDos, hcClient);
    }

    /**
     * 查询指定EIP防护状态
     *
     * 查询指定EIP的Anti-DDoS防护状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDDosStatusRequest 请求对象
     * @return CompletableFuture<ShowDDosStatusResponse>
     */
    public CompletableFuture<ShowDDosStatusResponse> showDDosStatusAsync(ShowDDosStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, AntiDDoSMeta.showDDosStatus);
    }

    /**
     * 查询指定EIP防护状态
     *
     * 查询指定EIP的Anti-DDoS防护状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDDosStatusRequest 请求对象
     * @return AsyncInvoker<ShowDDosStatusRequest, ShowDDosStatusResponse>
     */
    public AsyncInvoker<ShowDDosStatusRequest, ShowDDosStatusResponse> showDDosStatusAsyncInvoker(
        ShowDDosStatusRequest request) {
        return new AsyncInvoker<>(request, AntiDDoSMeta.showDDosStatus, hcClient);
    }

    /**
     * 查询全量日志设置
     *
     * 查询全量日志设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogConfigRequest 请求对象
     * @return CompletableFuture<ShowLogConfigResponse>
     */
    public CompletableFuture<ShowLogConfigResponse> showLogConfigAsync(ShowLogConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, AntiDDoSMeta.showLogConfig);
    }

    /**
     * 查询全量日志设置
     *
     * 查询全量日志设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogConfigRequest 请求对象
     * @return AsyncInvoker<ShowLogConfigRequest, ShowLogConfigResponse>
     */
    public AsyncInvoker<ShowLogConfigRequest, ShowLogConfigResponse> showLogConfigAsyncInvoker(
        ShowLogConfigRequest request) {
        return new AsyncInvoker<>(request, AntiDDoSMeta.showLogConfig, hcClient);
    }

    /**
     * 更新Anti-DDoS服务
     *
     * 更新指定EIP的Anti-DDoS防护策略配置。调用成功，只是说明服务节点收到了关闭更新配置请求，操作是否成功需要通过任务查询接口查询该任务的执行状态，具体请参考查询Anti-DDoS任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDDosRequest 请求对象
     * @return CompletableFuture<UpdateDDosResponse>
     */
    public CompletableFuture<UpdateDDosResponse> updateDDosAsync(UpdateDDosRequest request) {
        return hcClient.asyncInvokeHttp(request, AntiDDoSMeta.updateDDos);
    }

    /**
     * 更新Anti-DDoS服务
     *
     * 更新指定EIP的Anti-DDoS防护策略配置。调用成功，只是说明服务节点收到了关闭更新配置请求，操作是否成功需要通过任务查询接口查询该任务的执行状态，具体请参考查询Anti-DDoS任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDDosRequest 请求对象
     * @return AsyncInvoker<UpdateDDosRequest, UpdateDDosResponse>
     */
    public AsyncInvoker<UpdateDDosRequest, UpdateDDosResponse> updateDDosAsyncInvoker(UpdateDDosRequest request) {
        return new AsyncInvoker<>(request, AntiDDoSMeta.updateDDos, hcClient);
    }

    /**
     * 更新用户全量日志设置
     *
     * 更新用户全量日志设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogConfigRequest 请求对象
     * @return CompletableFuture<UpdateLogConfigResponse>
     */
    public CompletableFuture<UpdateLogConfigResponse> updateLogConfigAsync(UpdateLogConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, AntiDDoSMeta.updateLogConfig);
    }

    /**
     * 更新用户全量日志设置
     *
     * 更新用户全量日志设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogConfigRequest 请求对象
     * @return AsyncInvoker<UpdateLogConfigRequest, UpdateLogConfigResponse>
     */
    public AsyncInvoker<UpdateLogConfigRequest, UpdateLogConfigResponse> updateLogConfigAsyncInvoker(
        UpdateLogConfigRequest request) {
        return new AsyncInvoker<>(request, AntiDDoSMeta.updateLogConfig, hcClient);
    }

}
