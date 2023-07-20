package com.huaweicloud.sdk.vss.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.vss.v3.model.AuthorizeDomainsRequest;
import com.huaweicloud.sdk.vss.v3.model.AuthorizeDomainsResponse;
import com.huaweicloud.sdk.vss.v3.model.CancelTasksRequest;
import com.huaweicloud.sdk.vss.v3.model.CancelTasksResponse;
import com.huaweicloud.sdk.vss.v3.model.CreateDomainsRequest;
import com.huaweicloud.sdk.vss.v3.model.CreateDomainsResponse;
import com.huaweicloud.sdk.vss.v3.model.CreateTasksRequest;
import com.huaweicloud.sdk.vss.v3.model.CreateTasksResponse;
import com.huaweicloud.sdk.vss.v3.model.DeleteDomainsRequest;
import com.huaweicloud.sdk.vss.v3.model.DeleteDomainsResponse;
import com.huaweicloud.sdk.vss.v3.model.DownloadTaskReportRequest;
import com.huaweicloud.sdk.vss.v3.model.DownloadTaskReportResponse;
import com.huaweicloud.sdk.vss.v3.model.ExecuteGenerateReportRequest;
import com.huaweicloud.sdk.vss.v3.model.ExecuteGenerateReportResponse;
import com.huaweicloud.sdk.vss.v3.model.ListBusinessRisksRequest;
import com.huaweicloud.sdk.vss.v3.model.ListBusinessRisksResponse;
import com.huaweicloud.sdk.vss.v3.model.ListDomainsRequest;
import com.huaweicloud.sdk.vss.v3.model.ListDomainsResponse;
import com.huaweicloud.sdk.vss.v3.model.ListPortResultsRequest;
import com.huaweicloud.sdk.vss.v3.model.ListPortResultsResponse;
import com.huaweicloud.sdk.vss.v3.model.ListTaskHistoriesRequest;
import com.huaweicloud.sdk.vss.v3.model.ListTaskHistoriesResponse;
import com.huaweicloud.sdk.vss.v3.model.ShowDomainSettingsRequest;
import com.huaweicloud.sdk.vss.v3.model.ShowDomainSettingsResponse;
import com.huaweicloud.sdk.vss.v3.model.ShowReportStatusRequest;
import com.huaweicloud.sdk.vss.v3.model.ShowReportStatusResponse;
import com.huaweicloud.sdk.vss.v3.model.ShowResultsRequest;
import com.huaweicloud.sdk.vss.v3.model.ShowResultsResponse;
import com.huaweicloud.sdk.vss.v3.model.ShowTasksRequest;
import com.huaweicloud.sdk.vss.v3.model.ShowTasksResponse;
import com.huaweicloud.sdk.vss.v3.model.UpdateDomainSettingsRequest;
import com.huaweicloud.sdk.vss.v3.model.UpdateDomainSettingsResponse;
import com.huaweicloud.sdk.vss.v3.model.UpdateFalsePositiveRequest;
import com.huaweicloud.sdk.vss.v3.model.UpdateFalsePositiveResponse;

import java.util.concurrent.CompletableFuture;

public class VssAsyncClient {

    protected HcClient hcClient;

    public VssAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VssAsyncClient> newBuilder() {
        ClientBuilder<VssAsyncClient> clientBuilder = new ClientBuilder<>(VssAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 下载网站扫描报告
     *
     * 下载网站扫描任务PDF报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadTaskReportRequest 请求对象
     * @return CompletableFuture<DownloadTaskReportResponse>
     */
    public CompletableFuture<DownloadTaskReportResponse> downloadTaskReportAsync(DownloadTaskReportRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.downloadTaskReport);
    }

    /**
     * 下载网站扫描报告
     *
     * 下载网站扫描任务PDF报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadTaskReportRequest 请求对象
     * @return AsyncInvoker<DownloadTaskReportRequest, DownloadTaskReportResponse>
     */
    public AsyncInvoker<DownloadTaskReportRequest, DownloadTaskReportResponse> downloadTaskReportAsyncInvoker(
        DownloadTaskReportRequest request) {
        return new AsyncInvoker<DownloadTaskReportRequest, DownloadTaskReportResponse>(request,
            VssMeta.downloadTaskReport, hcClient);
    }

    /**
     * 生成网站扫描报告
     *
     * 生成网站扫描PDF报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteGenerateReportRequest 请求对象
     * @return CompletableFuture<ExecuteGenerateReportResponse>
     */
    public CompletableFuture<ExecuteGenerateReportResponse> executeGenerateReportAsync(
        ExecuteGenerateReportRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.executeGenerateReport);
    }

    /**
     * 生成网站扫描报告
     *
     * 生成网站扫描PDF报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteGenerateReportRequest 请求对象
     * @return AsyncInvoker<ExecuteGenerateReportRequest, ExecuteGenerateReportResponse>
     */
    public AsyncInvoker<ExecuteGenerateReportRequest, ExecuteGenerateReportResponse> executeGenerateReportAsyncInvoker(
        ExecuteGenerateReportRequest request) {
        return new AsyncInvoker<ExecuteGenerateReportRequest, ExecuteGenerateReportResponse>(request,
            VssMeta.executeGenerateReport, hcClient);
    }

    /**
     * 获取网站业务风险扫描结果
     *
     * 获取网站业务风险扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBusinessRisksRequest 请求对象
     * @return CompletableFuture<ListBusinessRisksResponse>
     */
    public CompletableFuture<ListBusinessRisksResponse> listBusinessRisksAsync(ListBusinessRisksRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.listBusinessRisks);
    }

    /**
     * 获取网站业务风险扫描结果
     *
     * 获取网站业务风险扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBusinessRisksRequest 请求对象
     * @return AsyncInvoker<ListBusinessRisksRequest, ListBusinessRisksResponse>
     */
    public AsyncInvoker<ListBusinessRisksRequest, ListBusinessRisksResponse> listBusinessRisksAsyncInvoker(
        ListBusinessRisksRequest request) {
        return new AsyncInvoker<ListBusinessRisksRequest, ListBusinessRisksResponse>(request, VssMeta.listBusinessRisks,
            hcClient);
    }

    /**
     * 获取网站端口扫描结果
     *
     * 获取网站端口扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPortResultsRequest 请求对象
     * @return CompletableFuture<ListPortResultsResponse>
     */
    public CompletableFuture<ListPortResultsResponse> listPortResultsAsync(ListPortResultsRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.listPortResults);
    }

    /**
     * 获取网站端口扫描结果
     *
     * 获取网站端口扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPortResultsRequest 请求对象
     * @return AsyncInvoker<ListPortResultsRequest, ListPortResultsResponse>
     */
    public AsyncInvoker<ListPortResultsRequest, ListPortResultsResponse> listPortResultsAsyncInvoker(
        ListPortResultsRequest request) {
        return new AsyncInvoker<ListPortResultsRequest, ListPortResultsResponse>(request, VssMeta.listPortResults,
            hcClient);
    }

    /**
     * 获取网站扫描报告状态
     *
     * 获取网站扫描PDF报告生成状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReportStatusRequest 请求对象
     * @return CompletableFuture<ShowReportStatusResponse>
     */
    public CompletableFuture<ShowReportStatusResponse> showReportStatusAsync(ShowReportStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.showReportStatus);
    }

    /**
     * 获取网站扫描报告状态
     *
     * 获取网站扫描PDF报告生成状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReportStatusRequest 请求对象
     * @return AsyncInvoker<ShowReportStatusRequest, ShowReportStatusResponse>
     */
    public AsyncInvoker<ShowReportStatusRequest, ShowReportStatusResponse> showReportStatusAsyncInvoker(
        ShowReportStatusRequest request) {
        return new AsyncInvoker<ShowReportStatusRequest, ShowReportStatusResponse>(request, VssMeta.showReportStatus,
            hcClient);
    }

    /**
     * 获取网站扫描结果
     *
     * 获取网站漏洞扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResultsRequest 请求对象
     * @return CompletableFuture<ShowResultsResponse>
     */
    public CompletableFuture<ShowResultsResponse> showResultsAsync(ShowResultsRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.showResults);
    }

    /**
     * 获取网站扫描结果
     *
     * 获取网站漏洞扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResultsRequest 请求对象
     * @return AsyncInvoker<ShowResultsRequest, ShowResultsResponse>
     */
    public AsyncInvoker<ShowResultsRequest, ShowResultsResponse> showResultsAsyncInvoker(ShowResultsRequest request) {
        return new AsyncInvoker<ShowResultsRequest, ShowResultsResponse>(request, VssMeta.showResults, hcClient);
    }

    /**
     * 更新网站漏洞的误报状态
     *
     * 更新网站扫描漏洞的误报状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFalsePositiveRequest 请求对象
     * @return CompletableFuture<UpdateFalsePositiveResponse>
     */
    public CompletableFuture<UpdateFalsePositiveResponse> updateFalsePositiveAsync(UpdateFalsePositiveRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.updateFalsePositive);
    }

    /**
     * 更新网站漏洞的误报状态
     *
     * 更新网站扫描漏洞的误报状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFalsePositiveRequest 请求对象
     * @return AsyncInvoker<UpdateFalsePositiveRequest, UpdateFalsePositiveResponse>
     */
    public AsyncInvoker<UpdateFalsePositiveRequest, UpdateFalsePositiveResponse> updateFalsePositiveAsyncInvoker(
        UpdateFalsePositiveRequest request) {
        return new AsyncInvoker<UpdateFalsePositiveRequest, UpdateFalsePositiveResponse>(request,
            VssMeta.updateFalsePositive, hcClient);
    }

    /**
     * 取消或重启网站扫描任务
     *
     * 取消或重启网站漏洞扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelTasksRequest 请求对象
     * @return CompletableFuture<CancelTasksResponse>
     */
    public CompletableFuture<CancelTasksResponse> cancelTasksAsync(CancelTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.cancelTasks);
    }

    /**
     * 取消或重启网站扫描任务
     *
     * 取消或重启网站漏洞扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelTasksRequest 请求对象
     * @return AsyncInvoker<CancelTasksRequest, CancelTasksResponse>
     */
    public AsyncInvoker<CancelTasksRequest, CancelTasksResponse> cancelTasksAsyncInvoker(CancelTasksRequest request) {
        return new AsyncInvoker<CancelTasksRequest, CancelTasksResponse>(request, VssMeta.cancelTasks, hcClient);
    }

    /**
     * 创建网站扫描任务并启动
     *
     * 创建网站漏洞扫描任务并启动
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTasksRequest 请求对象
     * @return CompletableFuture<CreateTasksResponse>
     */
    public CompletableFuture<CreateTasksResponse> createTasksAsync(CreateTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.createTasks);
    }

    /**
     * 创建网站扫描任务并启动
     *
     * 创建网站漏洞扫描任务并启动
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTasksRequest 请求对象
     * @return AsyncInvoker<CreateTasksRequest, CreateTasksResponse>
     */
    public AsyncInvoker<CreateTasksRequest, CreateTasksResponse> createTasksAsyncInvoker(CreateTasksRequest request) {
        return new AsyncInvoker<CreateTasksRequest, CreateTasksResponse>(request, VssMeta.createTasks, hcClient);
    }

    /**
     * 获取网站的历史扫描任务
     *
     * 获取网站漏洞扫描的历史扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskHistoriesRequest 请求对象
     * @return CompletableFuture<ListTaskHistoriesResponse>
     */
    public CompletableFuture<ListTaskHistoriesResponse> listTaskHistoriesAsync(ListTaskHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.listTaskHistories);
    }

    /**
     * 获取网站的历史扫描任务
     *
     * 获取网站漏洞扫描的历史扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskHistoriesRequest 请求对象
     * @return AsyncInvoker<ListTaskHistoriesRequest, ListTaskHistoriesResponse>
     */
    public AsyncInvoker<ListTaskHistoriesRequest, ListTaskHistoriesResponse> listTaskHistoriesAsyncInvoker(
        ListTaskHistoriesRequest request) {
        return new AsyncInvoker<ListTaskHistoriesRequest, ListTaskHistoriesResponse>(request, VssMeta.listTaskHistories,
            hcClient);
    }

    /**
     * 获取网站扫描任务详情
     *
     * 获取网站漏洞扫描任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTasksRequest 请求对象
     * @return CompletableFuture<ShowTasksResponse>
     */
    public CompletableFuture<ShowTasksResponse> showTasksAsync(ShowTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.showTasks);
    }

    /**
     * 获取网站扫描任务详情
     *
     * 获取网站漏洞扫描任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTasksRequest 请求对象
     * @return AsyncInvoker<ShowTasksRequest, ShowTasksResponse>
     */
    public AsyncInvoker<ShowTasksRequest, ShowTasksResponse> showTasksAsyncInvoker(ShowTasksRequest request) {
        return new AsyncInvoker<ShowTasksRequest, ShowTasksResponse>(request, VssMeta.showTasks, hcClient);
    }

    /**
     * 认证网站资产
     *
     * 认证租户的网站资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AuthorizeDomainsRequest 请求对象
     * @return CompletableFuture<AuthorizeDomainsResponse>
     */
    public CompletableFuture<AuthorizeDomainsResponse> authorizeDomainsAsync(AuthorizeDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.authorizeDomains);
    }

    /**
     * 认证网站资产
     *
     * 认证租户的网站资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AuthorizeDomainsRequest 请求对象
     * @return AsyncInvoker<AuthorizeDomainsRequest, AuthorizeDomainsResponse>
     */
    public AsyncInvoker<AuthorizeDomainsRequest, AuthorizeDomainsResponse> authorizeDomainsAsyncInvoker(
        AuthorizeDomainsRequest request) {
        return new AsyncInvoker<AuthorizeDomainsRequest, AuthorizeDomainsResponse>(request, VssMeta.authorizeDomains,
            hcClient);
    }

    /**
     * 创建网站资产
     *
     * 创建租户的网站资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDomainsRequest 请求对象
     * @return CompletableFuture<CreateDomainsResponse>
     */
    public CompletableFuture<CreateDomainsResponse> createDomainsAsync(CreateDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.createDomains);
    }

    /**
     * 创建网站资产
     *
     * 创建租户的网站资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDomainsRequest 请求对象
     * @return AsyncInvoker<CreateDomainsRequest, CreateDomainsResponse>
     */
    public AsyncInvoker<CreateDomainsRequest, CreateDomainsResponse> createDomainsAsyncInvoker(
        CreateDomainsRequest request) {
        return new AsyncInvoker<CreateDomainsRequest, CreateDomainsResponse>(request, VssMeta.createDomains, hcClient);
    }

    /**
     * 删除网站资产
     *
     * 删除租户的网站资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDomainsRequest 请求对象
     * @return CompletableFuture<DeleteDomainsResponse>
     */
    public CompletableFuture<DeleteDomainsResponse> deleteDomainsAsync(DeleteDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.deleteDomains);
    }

    /**
     * 删除网站资产
     *
     * 删除租户的网站资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDomainsRequest 请求对象
     * @return AsyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse>
     */
    public AsyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse> deleteDomainsAsyncInvoker(
        DeleteDomainsRequest request) {
        return new AsyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse>(request, VssMeta.deleteDomains, hcClient);
    }

    /**
     * 获取网站资产
     *
     * 获取租户的所有网站资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainsRequest 请求对象
     * @return CompletableFuture<ListDomainsResponse>
     */
    public CompletableFuture<ListDomainsResponse> listDomainsAsync(ListDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.listDomains);
    }

    /**
     * 获取网站资产
     *
     * 获取租户的所有网站资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainsRequest 请求对象
     * @return AsyncInvoker<ListDomainsRequest, ListDomainsResponse>
     */
    public AsyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsAsyncInvoker(ListDomainsRequest request) {
        return new AsyncInvoker<ListDomainsRequest, ListDomainsResponse>(request, VssMeta.listDomains, hcClient);
    }

    /**
     * 获取网站配置
     *
     * 获取网站登录配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainSettingsRequest 请求对象
     * @return CompletableFuture<ShowDomainSettingsResponse>
     */
    public CompletableFuture<ShowDomainSettingsResponse> showDomainSettingsAsync(ShowDomainSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.showDomainSettings);
    }

    /**
     * 获取网站配置
     *
     * 获取网站登录配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainSettingsRequest 请求对象
     * @return AsyncInvoker<ShowDomainSettingsRequest, ShowDomainSettingsResponse>
     */
    public AsyncInvoker<ShowDomainSettingsRequest, ShowDomainSettingsResponse> showDomainSettingsAsyncInvoker(
        ShowDomainSettingsRequest request) {
        return new AsyncInvoker<ShowDomainSettingsRequest, ShowDomainSettingsResponse>(request,
            VssMeta.showDomainSettings, hcClient);
    }

    /**
     * 更新网站配置
     *
     * 更新网站登录配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainSettingsRequest 请求对象
     * @return CompletableFuture<UpdateDomainSettingsResponse>
     */
    public CompletableFuture<UpdateDomainSettingsResponse> updateDomainSettingsAsync(
        UpdateDomainSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.updateDomainSettings);
    }

    /**
     * 更新网站配置
     *
     * 更新网站登录配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainSettingsRequest 请求对象
     * @return AsyncInvoker<UpdateDomainSettingsRequest, UpdateDomainSettingsResponse>
     */
    public AsyncInvoker<UpdateDomainSettingsRequest, UpdateDomainSettingsResponse> updateDomainSettingsAsyncInvoker(
        UpdateDomainSettingsRequest request) {
        return new AsyncInvoker<UpdateDomainSettingsRequest, UpdateDomainSettingsResponse>(request,
            VssMeta.updateDomainSettings, hcClient);
    }

}
