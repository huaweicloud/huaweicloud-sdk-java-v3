package com.huaweicloud.sdk.codeartsinspector.v3;

import com.huaweicloud.sdk.codeartsinspector.v3.model.AddGroupRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.AddGroupResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.AuthorizeDomainsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.AuthorizeDomainsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.BatchCreateHostsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.BatchCreateHostsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.BatchStartHostTasksRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.BatchStartHostTasksResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.CancelTasksRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.CancelTasksResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.CreateDomainsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.CreateDomainsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.CreateTasksRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.CreateTasksResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.DeleteDomainsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.DeleteDomainsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.DeleteGroupRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.DeleteGroupResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.DeleteHostRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.DeleteHostResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.DownloadTaskReportRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.DownloadTaskReportResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ExecuteGenerateReportRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ExecuteGenerateReportResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListBusinessRisksRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListBusinessRisksResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListDomainsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListDomainsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListGroupsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListGroupsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListHostResultsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListHostResultsResponse;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListHostsRequest;
import com.huaweicloud.sdk.codeartsinspector.v3.model.ListHostsResponse;
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
     * 批量创建主机组
     *
     * 批量创建主机组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddGroupRequest 请求对象
     * @return AddGroupResponse
     */
    public AddGroupResponse addGroup(AddGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.addGroup);
    }

    /**
     * 批量创建主机组
     *
     * 批量创建主机组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddGroupRequest 请求对象
     * @return SyncInvoker<AddGroupRequest, AddGroupResponse>
     */
    public SyncInvoker<AddGroupRequest, AddGroupResponse> addGroupInvoker(AddGroupRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.addGroup, hcClient);
    }

    /**
     * 删除主机组
     *
     * 删除主机组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.deleteGroup);
    }

    /**
     * 删除主机组
     *
     * 删除主机组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return SyncInvoker<DeleteGroupRequest, DeleteGroupResponse>
     */
    public SyncInvoker<DeleteGroupRequest, DeleteGroupResponse> deleteGroupInvoker(DeleteGroupRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.deleteGroup, hcClient);
    }

    /**
     * 获取主机组列表
     *
     * 获取主机组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupsRequest 请求对象
     * @return ListGroupsResponse
     */
    public ListGroupsResponse listGroups(ListGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.listGroups);
    }

    /**
     * 获取主机组列表
     *
     * 获取主机组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupsRequest 请求对象
     * @return SyncInvoker<ListGroupsRequest, ListGroupsResponse>
     */
    public SyncInvoker<ListGroupsRequest, ListGroupsResponse> listGroupsInvoker(ListGroupsRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.listGroups, hcClient);
    }

    /**
     * 获取主机漏洞扫描结果
     *
     * 获取主机漏洞扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostResultsRequest 请求对象
     * @return ListHostResultsResponse
     */
    public ListHostResultsResponse listHostResults(ListHostResultsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.listHostResults);
    }

    /**
     * 获取主机漏洞扫描结果
     *
     * 获取主机漏洞扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostResultsRequest 请求对象
     * @return SyncInvoker<ListHostResultsRequest, ListHostResultsResponse>
     */
    public SyncInvoker<ListHostResultsRequest, ListHostResultsResponse> listHostResultsInvoker(
        ListHostResultsRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.listHostResults, hcClient);
    }

    /**
     * 批量启动或取消主机扫描任务
     *
     * 批量启动或取消主机漏洞扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartHostTasksRequest 请求对象
     * @return BatchStartHostTasksResponse
     */
    public BatchStartHostTasksResponse batchStartHostTasks(BatchStartHostTasksRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.batchStartHostTasks);
    }

    /**
     * 批量启动或取消主机扫描任务
     *
     * 批量启动或取消主机漏洞扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartHostTasksRequest 请求对象
     * @return SyncInvoker<BatchStartHostTasksRequest, BatchStartHostTasksResponse>
     */
    public SyncInvoker<BatchStartHostTasksRequest, BatchStartHostTasksResponse> batchStartHostTasksInvoker(
        BatchStartHostTasksRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.batchStartHostTasks, hcClient);
    }

    /**
     * 批量创建主机资产
     *
     * 批量创建租户的主机资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateHostsRequest 请求对象
     * @return BatchCreateHostsResponse
     */
    public BatchCreateHostsResponse batchCreateHosts(BatchCreateHostsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.batchCreateHosts);
    }

    /**
     * 批量创建主机资产
     *
     * 批量创建租户的主机资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateHostsRequest 请求对象
     * @return SyncInvoker<BatchCreateHostsRequest, BatchCreateHostsResponse>
     */
    public SyncInvoker<BatchCreateHostsRequest, BatchCreateHostsResponse> batchCreateHostsInvoker(
        BatchCreateHostsRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.batchCreateHosts, hcClient);
    }

    /**
     * 删除主机资产
     *
     * 删除租户的主机资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostRequest 请求对象
     * @return DeleteHostResponse
     */
    public DeleteHostResponse deleteHost(DeleteHostRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.deleteHost);
    }

    /**
     * 删除主机资产
     *
     * 删除租户的主机资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostRequest 请求对象
     * @return SyncInvoker<DeleteHostRequest, DeleteHostResponse>
     */
    public SyncInvoker<DeleteHostRequest, DeleteHostResponse> deleteHostInvoker(DeleteHostRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.deleteHost, hcClient);
    }

    /**
     * 获取主机资产
     *
     * 获取租户的主机资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostsRequest 请求对象
     * @return ListHostsResponse
     */
    public ListHostsResponse listHosts(ListHostsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.listHosts);
    }

    /**
     * 获取主机资产
     *
     * 获取租户的主机资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostsRequest 请求对象
     * @return SyncInvoker<ListHostsRequest, ListHostsResponse>
     */
    public SyncInvoker<ListHostsRequest, ListHostsResponse> listHostsInvoker(ListHostsRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.listHosts, hcClient);
    }

    /**
     * 下载网站扫描报告
     *
     * 下载网站扫描任务PDF报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadTaskReportRequest 请求对象
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
     * @param request DownloadTaskReportRequest 请求对象
     * @return SyncInvoker<DownloadTaskReportRequest, DownloadTaskReportResponse>
     */
    public SyncInvoker<DownloadTaskReportRequest, DownloadTaskReportResponse> downloadTaskReportInvoker(
        DownloadTaskReportRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.downloadTaskReport, hcClient);
    }

    /**
     * 生成网站扫描报告
     *
     * 生成网站扫描PDF报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteGenerateReportRequest 请求对象
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
     * @param request ExecuteGenerateReportRequest 请求对象
     * @return SyncInvoker<ExecuteGenerateReportRequest, ExecuteGenerateReportResponse>
     */
    public SyncInvoker<ExecuteGenerateReportRequest, ExecuteGenerateReportResponse> executeGenerateReportInvoker(
        ExecuteGenerateReportRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.executeGenerateReport, hcClient);
    }

    /**
     * 获取网站业务风险扫描结果
     *
     * 获取网站业务风险扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBusinessRisksRequest 请求对象
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
     * @param request ListBusinessRisksRequest 请求对象
     * @return SyncInvoker<ListBusinessRisksRequest, ListBusinessRisksResponse>
     */
    public SyncInvoker<ListBusinessRisksRequest, ListBusinessRisksResponse> listBusinessRisksInvoker(
        ListBusinessRisksRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.listBusinessRisks, hcClient);
    }

    /**
     * 获取网站端口扫描结果
     *
     * 获取网站端口扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortResultsRequest 请求对象
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
     * @param request ListPortResultsRequest 请求对象
     * @return SyncInvoker<ListPortResultsRequest, ListPortResultsResponse>
     */
    public SyncInvoker<ListPortResultsRequest, ListPortResultsResponse> listPortResultsInvoker(
        ListPortResultsRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.listPortResults, hcClient);
    }

    /**
     * 获取网站扫描报告状态
     *
     * 获取网站扫描PDF报告生成状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportStatusRequest 请求对象
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
     * @param request ShowReportStatusRequest 请求对象
     * @return SyncInvoker<ShowReportStatusRequest, ShowReportStatusResponse>
     */
    public SyncInvoker<ShowReportStatusRequest, ShowReportStatusResponse> showReportStatusInvoker(
        ShowReportStatusRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.showReportStatus, hcClient);
    }

    /**
     * 获取网站扫描结果
     *
     * 获取网站漏洞扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResultsRequest 请求对象
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
     * @param request ShowResultsRequest 请求对象
     * @return SyncInvoker<ShowResultsRequest, ShowResultsResponse>
     */
    public SyncInvoker<ShowResultsRequest, ShowResultsResponse> showResultsInvoker(ShowResultsRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.showResults, hcClient);
    }

    /**
     * 更新网站漏洞的误报状态
     *
     * 更新网站扫描漏洞的误报状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFalsePositiveRequest 请求对象
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
     * @param request UpdateFalsePositiveRequest 请求对象
     * @return SyncInvoker<UpdateFalsePositiveRequest, UpdateFalsePositiveResponse>
     */
    public SyncInvoker<UpdateFalsePositiveRequest, UpdateFalsePositiveResponse> updateFalsePositiveInvoker(
        UpdateFalsePositiveRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.updateFalsePositive, hcClient);
    }

    /**
     * 取消或重启网站扫描任务
     *
     * 取消或重启网站漏洞扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelTasksRequest 请求对象
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
     * @param request CancelTasksRequest 请求对象
     * @return SyncInvoker<CancelTasksRequest, CancelTasksResponse>
     */
    public SyncInvoker<CancelTasksRequest, CancelTasksResponse> cancelTasksInvoker(CancelTasksRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.cancelTasks, hcClient);
    }

    /**
     * 创建网站扫描任务并启动
     *
     * 创建网站漏洞扫描任务并启动
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTasksRequest 请求对象
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
     * @param request CreateTasksRequest 请求对象
     * @return SyncInvoker<CreateTasksRequest, CreateTasksResponse>
     */
    public SyncInvoker<CreateTasksRequest, CreateTasksResponse> createTasksInvoker(CreateTasksRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.createTasks, hcClient);
    }

    /**
     * 获取网站的历史扫描任务
     *
     * 获取网站漏洞扫描的历史扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskHistoriesRequest 请求对象
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
     * @param request ListTaskHistoriesRequest 请求对象
     * @return SyncInvoker<ListTaskHistoriesRequest, ListTaskHistoriesResponse>
     */
    public SyncInvoker<ListTaskHistoriesRequest, ListTaskHistoriesResponse> listTaskHistoriesInvoker(
        ListTaskHistoriesRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.listTaskHistories, hcClient);
    }

    /**
     * 获取网站扫描任务详情
     *
     * 获取网站漏洞扫描任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTasksRequest 请求对象
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
     * @param request ShowTasksRequest 请求对象
     * @return SyncInvoker<ShowTasksRequest, ShowTasksResponse>
     */
    public SyncInvoker<ShowTasksRequest, ShowTasksResponse> showTasksInvoker(ShowTasksRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.showTasks, hcClient);
    }

    /**
     * 认证网站资产
     *
     * 认证租户的网站资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizeDomainsRequest 请求对象
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
     * @param request AuthorizeDomainsRequest 请求对象
     * @return SyncInvoker<AuthorizeDomainsRequest, AuthorizeDomainsResponse>
     */
    public SyncInvoker<AuthorizeDomainsRequest, AuthorizeDomainsResponse> authorizeDomainsInvoker(
        AuthorizeDomainsRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.authorizeDomains, hcClient);
    }

    /**
     * 创建网站资产
     *
     * 创建租户的网站资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainsRequest 请求对象
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
     * @param request CreateDomainsRequest 请求对象
     * @return SyncInvoker<CreateDomainsRequest, CreateDomainsResponse>
     */
    public SyncInvoker<CreateDomainsRequest, CreateDomainsResponse> createDomainsInvoker(CreateDomainsRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.createDomains, hcClient);
    }

    /**
     * 删除网站资产
     *
     * 删除租户的网站资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainsRequest 请求对象
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
     * @param request DeleteDomainsRequest 请求对象
     * @return SyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse>
     */
    public SyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse> deleteDomainsInvoker(DeleteDomainsRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.deleteDomains, hcClient);
    }

    /**
     * 获取网站资产
     *
     * 获取租户的所有网站资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainsRequest 请求对象
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
     * @param request ListDomainsRequest 请求对象
     * @return SyncInvoker<ListDomainsRequest, ListDomainsResponse>
     */
    public SyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsInvoker(ListDomainsRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.listDomains, hcClient);
    }

    /**
     * 获取网站配置
     *
     * 获取网站登录配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainSettingsRequest 请求对象
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
     * @param request ShowDomainSettingsRequest 请求对象
     * @return SyncInvoker<ShowDomainSettingsRequest, ShowDomainSettingsResponse>
     */
    public SyncInvoker<ShowDomainSettingsRequest, ShowDomainSettingsResponse> showDomainSettingsInvoker(
        ShowDomainSettingsRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.showDomainSettings, hcClient);
    }

    /**
     * 更新网站配置
     *
     * 更新网站登录配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainSettingsRequest 请求对象
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
     * @param request UpdateDomainSettingsRequest 请求对象
     * @return SyncInvoker<UpdateDomainSettingsRequest, UpdateDomainSettingsResponse>
     */
    public SyncInvoker<UpdateDomainSettingsRequest, UpdateDomainSettingsResponse> updateDomainSettingsInvoker(
        UpdateDomainSettingsRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.updateDomainSettings, hcClient);
    }

}
