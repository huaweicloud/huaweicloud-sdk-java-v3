package com.huaweicloud.sdk.codeartsinspector.v3;

import com.huaweicloud.sdk.codeartsinspector.v3.model.AuthorizeDomainsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.AuthorizeDomainsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.CancelTasksRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.CancelTasksResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.CreateDomainsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.CreateDomainsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.CreateTasksRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.CreateTasksResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.DeleteDomainsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.DeleteDomainsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.DownloadTaskReportRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.DownloadTaskReportResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ExecuteGenerateReportRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ExecuteGenerateReportResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListBusinessRisksRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListBusinessRisksResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListDomainsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListDomainsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListPortResultsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListPortResultsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListTaskHistoriesRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListTaskHistoriesResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ShowDomainSettingsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ShowDomainSettingsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ShowReportStatusRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ShowReportStatusResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ShowResultsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ShowResultsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ShowTasksRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ShowTasksResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.UpdateDomainSettingsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.UpdateDomainSettingsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.UpdateFalsePositiveRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.UpdateFalsePositiveResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CodeArtsInspectorClient {

    protected HcClient hcClient;

    public CodeArtsInspectorClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsInspectorClient> newBuilder() {
        ClientBuilder<CodeArtsInspectorClient> clientBuilder = new ClientBuilder<>(CodeArtsInspectorClient::new);
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
     * @return DownloadTaskReportResponse
     */
    public DownloadTaskReportResponse downloadTaskReport(DownloadTaskReportRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.downloadTaskReport);
    }

    /**
     * 下载网站扫描报告
     *
     * 下载网站扫描任务PDF报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadTaskReportRequest 请求对象
     * @return SyncInvoker<DownloadTaskReportRequest, DownloadTaskReportResponse>
     */
    public SyncInvoker<DownloadTaskReportRequest, DownloadTaskReportResponse> downloadTaskReportInvoker(
        DownloadTaskReportRequest request) {
        return new SyncInvoker<DownloadTaskReportRequest, DownloadTaskReportResponse>(request,
            CodeArtsInspectorMeta.downloadTaskReport, hcClient);
    }

    /**
     * 生成网站扫描报告
     *
     * 生成网站扫描PDF报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteGenerateReportRequest 请求对象
     * @return ExecuteGenerateReportResponse
     */
    public ExecuteGenerateReportResponse executeGenerateReport(ExecuteGenerateReportRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.executeGenerateReport);
    }

    /**
     * 生成网站扫描报告
     *
     * 生成网站扫描PDF报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteGenerateReportRequest 请求对象
     * @return SyncInvoker<ExecuteGenerateReportRequest, ExecuteGenerateReportResponse>
     */
    public SyncInvoker<ExecuteGenerateReportRequest, ExecuteGenerateReportResponse> executeGenerateReportInvoker(
        ExecuteGenerateReportRequest request) {
        return new SyncInvoker<ExecuteGenerateReportRequest, ExecuteGenerateReportResponse>(request,
            CodeArtsInspectorMeta.executeGenerateReport, hcClient);
    }

    /**
     * 获取网站业务风险扫描结果
     *
     * 获取网站业务风险扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBusinessRisksRequest 请求对象
     * @return ListBusinessRisksResponse
     */
    public ListBusinessRisksResponse listBusinessRisks(ListBusinessRisksRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.listBusinessRisks);
    }

    /**
     * 获取网站业务风险扫描结果
     *
     * 获取网站业务风险扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBusinessRisksRequest 请求对象
     * @return SyncInvoker<ListBusinessRisksRequest, ListBusinessRisksResponse>
     */
    public SyncInvoker<ListBusinessRisksRequest, ListBusinessRisksResponse> listBusinessRisksInvoker(
        ListBusinessRisksRequest request) {
        return new SyncInvoker<ListBusinessRisksRequest, ListBusinessRisksResponse>(request,
            CodeArtsInspectorMeta.listBusinessRisks, hcClient);
    }

    /**
     * 获取网站端口扫描结果
     *
     * 获取网站端口扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPortResultsRequest 请求对象
     * @return ListPortResultsResponse
     */
    public ListPortResultsResponse listPortResults(ListPortResultsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.listPortResults);
    }

    /**
     * 获取网站端口扫描结果
     *
     * 获取网站端口扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPortResultsRequest 请求对象
     * @return SyncInvoker<ListPortResultsRequest, ListPortResultsResponse>
     */
    public SyncInvoker<ListPortResultsRequest, ListPortResultsResponse> listPortResultsInvoker(
        ListPortResultsRequest request) {
        return new SyncInvoker<ListPortResultsRequest, ListPortResultsResponse>(request,
            CodeArtsInspectorMeta.listPortResults, hcClient);
    }

    /**
     * 获取网站扫描报告状态
     *
     * 获取网站扫描PDF报告生成状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReportStatusRequest 请求对象
     * @return ShowReportStatusResponse
     */
    public ShowReportStatusResponse showReportStatus(ShowReportStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.showReportStatus);
    }

    /**
     * 获取网站扫描报告状态
     *
     * 获取网站扫描PDF报告生成状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReportStatusRequest 请求对象
     * @return SyncInvoker<ShowReportStatusRequest, ShowReportStatusResponse>
     */
    public SyncInvoker<ShowReportStatusRequest, ShowReportStatusResponse> showReportStatusInvoker(
        ShowReportStatusRequest request) {
        return new SyncInvoker<ShowReportStatusRequest, ShowReportStatusResponse>(request,
            CodeArtsInspectorMeta.showReportStatus, hcClient);
    }

    /**
     * 获取网站扫描结果
     *
     * 获取网站漏洞扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResultsRequest 请求对象
     * @return ShowResultsResponse
     */
    public ShowResultsResponse showResults(ShowResultsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.showResults);
    }

    /**
     * 获取网站扫描结果
     *
     * 获取网站漏洞扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResultsRequest 请求对象
     * @return SyncInvoker<ShowResultsRequest, ShowResultsResponse>
     */
    public SyncInvoker<ShowResultsRequest, ShowResultsResponse> showResultsInvoker(ShowResultsRequest request) {
        return new SyncInvoker<ShowResultsRequest, ShowResultsResponse>(request, CodeArtsInspectorMeta.showResults,
            hcClient);
    }

    /**
     * 更新网站漏洞的误报状态
     *
     * 更新网站扫描漏洞的误报状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFalsePositiveRequest 请求对象
     * @return UpdateFalsePositiveResponse
     */
    public UpdateFalsePositiveResponse updateFalsePositive(UpdateFalsePositiveRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.updateFalsePositive);
    }

    /**
     * 更新网站漏洞的误报状态
     *
     * 更新网站扫描漏洞的误报状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFalsePositiveRequest 请求对象
     * @return SyncInvoker<UpdateFalsePositiveRequest, UpdateFalsePositiveResponse>
     */
    public SyncInvoker<UpdateFalsePositiveRequest, UpdateFalsePositiveResponse> updateFalsePositiveInvoker(
        UpdateFalsePositiveRequest request) {
        return new SyncInvoker<UpdateFalsePositiveRequest, UpdateFalsePositiveResponse>(request,
            CodeArtsInspectorMeta.updateFalsePositive, hcClient);
    }

    /**
     * 取消或重启网站扫描任务
     *
     * 取消或重启网站漏洞扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelTasksRequest 请求对象
     * @return CancelTasksResponse
     */
    public CancelTasksResponse cancelTasks(CancelTasksRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.cancelTasks);
    }

    /**
     * 取消或重启网站扫描任务
     *
     * 取消或重启网站漏洞扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelTasksRequest 请求对象
     * @return SyncInvoker<CancelTasksRequest, CancelTasksResponse>
     */
    public SyncInvoker<CancelTasksRequest, CancelTasksResponse> cancelTasksInvoker(CancelTasksRequest request) {
        return new SyncInvoker<CancelTasksRequest, CancelTasksResponse>(request, CodeArtsInspectorMeta.cancelTasks,
            hcClient);
    }

    /**
     * 创建网站扫描任务并启动
     *
     * 创建网站漏洞扫描任务并启动
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTasksRequest 请求对象
     * @return CreateTasksResponse
     */
    public CreateTasksResponse createTasks(CreateTasksRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.createTasks);
    }

    /**
     * 创建网站扫描任务并启动
     *
     * 创建网站漏洞扫描任务并启动
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTasksRequest 请求对象
     * @return SyncInvoker<CreateTasksRequest, CreateTasksResponse>
     */
    public SyncInvoker<CreateTasksRequest, CreateTasksResponse> createTasksInvoker(CreateTasksRequest request) {
        return new SyncInvoker<CreateTasksRequest, CreateTasksResponse>(request, CodeArtsInspectorMeta.createTasks,
            hcClient);
    }

    /**
     * 获取网站的历史扫描任务
     *
     * 获取网站漏洞扫描的历史扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskHistoriesRequest 请求对象
     * @return ListTaskHistoriesResponse
     */
    public ListTaskHistoriesResponse listTaskHistories(ListTaskHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.listTaskHistories);
    }

    /**
     * 获取网站的历史扫描任务
     *
     * 获取网站漏洞扫描的历史扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskHistoriesRequest 请求对象
     * @return SyncInvoker<ListTaskHistoriesRequest, ListTaskHistoriesResponse>
     */
    public SyncInvoker<ListTaskHistoriesRequest, ListTaskHistoriesResponse> listTaskHistoriesInvoker(
        ListTaskHistoriesRequest request) {
        return new SyncInvoker<ListTaskHistoriesRequest, ListTaskHistoriesResponse>(request,
            CodeArtsInspectorMeta.listTaskHistories, hcClient);
    }

    /**
     * 获取网站扫描任务详情
     *
     * 获取网站漏洞扫描任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTasksRequest 请求对象
     * @return ShowTasksResponse
     */
    public ShowTasksResponse showTasks(ShowTasksRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.showTasks);
    }

    /**
     * 获取网站扫描任务详情
     *
     * 获取网站漏洞扫描任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTasksRequest 请求对象
     * @return SyncInvoker<ShowTasksRequest, ShowTasksResponse>
     */
    public SyncInvoker<ShowTasksRequest, ShowTasksResponse> showTasksInvoker(ShowTasksRequest request) {
        return new SyncInvoker<ShowTasksRequest, ShowTasksResponse>(request, CodeArtsInspectorMeta.showTasks, hcClient);
    }

    /**
     * 认证网站资产
     *
     * 认证租户的网站资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AuthorizeDomainsRequest 请求对象
     * @return AuthorizeDomainsResponse
     */
    public AuthorizeDomainsResponse authorizeDomains(AuthorizeDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.authorizeDomains);
    }

    /**
     * 认证网站资产
     *
     * 认证租户的网站资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AuthorizeDomainsRequest 请求对象
     * @return SyncInvoker<AuthorizeDomainsRequest, AuthorizeDomainsResponse>
     */
    public SyncInvoker<AuthorizeDomainsRequest, AuthorizeDomainsResponse> authorizeDomainsInvoker(
        AuthorizeDomainsRequest request) {
        return new SyncInvoker<AuthorizeDomainsRequest, AuthorizeDomainsResponse>(request,
            CodeArtsInspectorMeta.authorizeDomains, hcClient);
    }

    /**
     * 创建网站资产
     *
     * 创建租户的网站资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDomainsRequest 请求对象
     * @return CreateDomainsResponse
     */
    public CreateDomainsResponse createDomains(CreateDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.createDomains);
    }

    /**
     * 创建网站资产
     *
     * 创建租户的网站资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDomainsRequest 请求对象
     * @return SyncInvoker<CreateDomainsRequest, CreateDomainsResponse>
     */
    public SyncInvoker<CreateDomainsRequest, CreateDomainsResponse> createDomainsInvoker(CreateDomainsRequest request) {
        return new SyncInvoker<CreateDomainsRequest, CreateDomainsResponse>(request,
            CodeArtsInspectorMeta.createDomains, hcClient);
    }

    /**
     * 删除网站资产
     *
     * 删除租户的网站资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDomainsRequest 请求对象
     * @return DeleteDomainsResponse
     */
    public DeleteDomainsResponse deleteDomains(DeleteDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.deleteDomains);
    }

    /**
     * 删除网站资产
     *
     * 删除租户的网站资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDomainsRequest 请求对象
     * @return SyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse>
     */
    public SyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse> deleteDomainsInvoker(DeleteDomainsRequest request) {
        return new SyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse>(request,
            CodeArtsInspectorMeta.deleteDomains, hcClient);
    }

    /**
     * 获取网站资产
     *
     * 获取租户的所有网站资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainsRequest 请求对象
     * @return ListDomainsResponse
     */
    public ListDomainsResponse listDomains(ListDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.listDomains);
    }

    /**
     * 获取网站资产
     *
     * 获取租户的所有网站资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainsRequest 请求对象
     * @return SyncInvoker<ListDomainsRequest, ListDomainsResponse>
     */
    public SyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsInvoker(ListDomainsRequest request) {
        return new SyncInvoker<ListDomainsRequest, ListDomainsResponse>(request, CodeArtsInspectorMeta.listDomains,
            hcClient);
    }

    /**
     * 获取网站配置
     *
     * 获取网站登录配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainSettingsRequest 请求对象
     * @return ShowDomainSettingsResponse
     */
    public ShowDomainSettingsResponse showDomainSettings(ShowDomainSettingsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.showDomainSettings);
    }

    /**
     * 获取网站配置
     *
     * 获取网站登录配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainSettingsRequest 请求对象
     * @return SyncInvoker<ShowDomainSettingsRequest, ShowDomainSettingsResponse>
     */
    public SyncInvoker<ShowDomainSettingsRequest, ShowDomainSettingsResponse> showDomainSettingsInvoker(
        ShowDomainSettingsRequest request) {
        return new SyncInvoker<ShowDomainSettingsRequest, ShowDomainSettingsResponse>(request,
            CodeArtsInspectorMeta.showDomainSettings, hcClient);
    }

    /**
     * 更新网站配置
     *
     * 更新网站登录配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainSettingsRequest 请求对象
     * @return UpdateDomainSettingsResponse
     */
    public UpdateDomainSettingsResponse updateDomainSettings(UpdateDomainSettingsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.updateDomainSettings);
    }

    /**
     * 更新网站配置
     *
     * 更新网站登录配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainSettingsRequest 请求对象
     * @return SyncInvoker<UpdateDomainSettingsRequest, UpdateDomainSettingsResponse>
     */
    public SyncInvoker<UpdateDomainSettingsRequest, UpdateDomainSettingsResponse> updateDomainSettingsInvoker(
        UpdateDomainSettingsRequest request) {
        return new SyncInvoker<UpdateDomainSettingsRequest, UpdateDomainSettingsResponse>(request,
            CodeArtsInspectorMeta.updateDomainSettings, hcClient);
    }

}
