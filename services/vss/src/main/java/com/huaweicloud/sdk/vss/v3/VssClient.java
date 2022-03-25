package com.huaweicloud.sdk.vss.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.vss.v3.model.*;

public class VssClient {

    protected HcClient hcClient;

    public VssClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VssClient> newBuilder() {
        return new ClientBuilder<>(VssClient::new);
    }

    /** 认证域名资产 认证租户的域名资产
     *
     * @param AuthorizeDomainsRequest 请求对象
     * @return AuthorizeDomainsResponse */
    public AuthorizeDomainsResponse authorizeDomains(AuthorizeDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, VssMeta.authorizeDomains);
    }

    /** 认证域名资产 认证租户的域名资产
     *
     * @param AuthorizeDomainsRequest 请求对象
     * @return SyncInvoker<AuthorizeDomainsRequest, AuthorizeDomainsResponse> */
    public SyncInvoker<AuthorizeDomainsRequest, AuthorizeDomainsResponse> authorizeDomainsInvoker(
        AuthorizeDomainsRequest request) {
        return new SyncInvoker<AuthorizeDomainsRequest, AuthorizeDomainsResponse>(request, VssMeta.authorizeDomains,
            hcClient);
    }

    /** 创建域名资产 创建租户的域名资产
     *
     * @param CreateDomainsRequest 请求对象
     * @return CreateDomainsResponse */
    public CreateDomainsResponse createDomains(CreateDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, VssMeta.createDomains);
    }

    /** 创建域名资产 创建租户的域名资产
     *
     * @param CreateDomainsRequest 请求对象
     * @return SyncInvoker<CreateDomainsRequest, CreateDomainsResponse> */
    public SyncInvoker<CreateDomainsRequest, CreateDomainsResponse> createDomainsInvoker(CreateDomainsRequest request) {
        return new SyncInvoker<CreateDomainsRequest, CreateDomainsResponse>(request, VssMeta.createDomains, hcClient);
    }

    /** 删除域名资产 删除租户的域名资产
     *
     * @param DeleteDomainsRequest 请求对象
     * @return DeleteDomainsResponse */
    public DeleteDomainsResponse deleteDomains(DeleteDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, VssMeta.deleteDomains);
    }

    /** 删除域名资产 删除租户的域名资产
     *
     * @param DeleteDomainsRequest 请求对象
     * @return SyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse> */
    public SyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse> deleteDomainsInvoker(DeleteDomainsRequest request) {
        return new SyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse>(request, VssMeta.deleteDomains, hcClient);
    }

    /** 获取域名资产 获取租户的所有域名资产
     *
     * @param ListDomainsRequest 请求对象
     * @return ListDomainsResponse */
    public ListDomainsResponse listDomains(ListDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, VssMeta.listDomains);
    }

    /** 获取域名资产 获取租户的所有域名资产
     *
     * @param ListDomainsRequest 请求对象
     * @return SyncInvoker<ListDomainsRequest, ListDomainsResponse> */
    public SyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsInvoker(ListDomainsRequest request) {
        return new SyncInvoker<ListDomainsRequest, ListDomainsResponse>(request, VssMeta.listDomains, hcClient);
    }

    /** 获取域名配置 获取域名登录配置
     *
     * @param ShowDomainSettingsRequest 请求对象
     * @return ShowDomainSettingsResponse */
    public ShowDomainSettingsResponse showDomainSettings(ShowDomainSettingsRequest request) {
        return hcClient.syncInvokeHttp(request, VssMeta.showDomainSettings);
    }

    /** 获取域名配置 获取域名登录配置
     *
     * @param ShowDomainSettingsRequest 请求对象
     * @return SyncInvoker<ShowDomainSettingsRequest, ShowDomainSettingsResponse> */
    public SyncInvoker<ShowDomainSettingsRequest, ShowDomainSettingsResponse> showDomainSettingsInvoker(
        ShowDomainSettingsRequest request) {
        return new SyncInvoker<ShowDomainSettingsRequest, ShowDomainSettingsResponse>(request,
            VssMeta.showDomainSettings, hcClient);
    }

    /** 更新域名配置 更新域名登录配置
     *
     * @param UpdateDomainSettingsRequest 请求对象
     * @return UpdateDomainSettingsResponse */
    public UpdateDomainSettingsResponse updateDomainSettings(UpdateDomainSettingsRequest request) {
        return hcClient.syncInvokeHttp(request, VssMeta.updateDomainSettings);
    }

    /** 更新域名配置 更新域名登录配置
     *
     * @param UpdateDomainSettingsRequest 请求对象
     * @return SyncInvoker<UpdateDomainSettingsRequest, UpdateDomainSettingsResponse> */
    public SyncInvoker<UpdateDomainSettingsRequest, UpdateDomainSettingsResponse> updateDomainSettingsInvoker(
        UpdateDomainSettingsRequest request) {
        return new SyncInvoker<UpdateDomainSettingsRequest, UpdateDomainSettingsResponse>(request,
            VssMeta.updateDomainSettings, hcClient);
    }

    /** 获取业务风险扫描结果 获取域名业务风险扫描结果
     *
     * @param ListBusinessRisksRequest 请求对象
     * @return ListBusinessRisksResponse */
    public ListBusinessRisksResponse listBusinessRisks(ListBusinessRisksRequest request) {
        return hcClient.syncInvokeHttp(request, VssMeta.listBusinessRisks);
    }

    /** 获取业务风险扫描结果 获取域名业务风险扫描结果
     *
     * @param ListBusinessRisksRequest 请求对象
     * @return SyncInvoker<ListBusinessRisksRequest, ListBusinessRisksResponse> */
    public SyncInvoker<ListBusinessRisksRequest, ListBusinessRisksResponse> listBusinessRisksInvoker(
        ListBusinessRisksRequest request) {
        return new SyncInvoker<ListBusinessRisksRequest, ListBusinessRisksResponse>(request, VssMeta.listBusinessRisks,
            hcClient);
    }

    /** 获取端口扫描结果 获取域名端口扫描结果
     *
     * @param ListPortResultsRequest 请求对象
     * @return ListPortResultsResponse */
    public ListPortResultsResponse listPortResults(ListPortResultsRequest request) {
        return hcClient.syncInvokeHttp(request, VssMeta.listPortResults);
    }

    /** 获取端口扫描结果 获取域名端口扫描结果
     *
     * @param ListPortResultsRequest 请求对象
     * @return SyncInvoker<ListPortResultsRequest, ListPortResultsResponse> */
    public SyncInvoker<ListPortResultsRequest, ListPortResultsResponse> listPortResultsInvoker(
        ListPortResultsRequest request) {
        return new SyncInvoker<ListPortResultsRequest, ListPortResultsResponse>(request, VssMeta.listPortResults,
            hcClient);
    }

    /** 获取扫描结果 获取域名漏洞扫描结果
     *
     * @param ShowResultsRequest 请求对象
     * @return ShowResultsResponse */
    public ShowResultsResponse showResults(ShowResultsRequest request) {
        return hcClient.syncInvokeHttp(request, VssMeta.showResults);
    }

    /** 获取扫描结果 获取域名漏洞扫描结果
     *
     * @param ShowResultsRequest 请求对象
     * @return SyncInvoker<ShowResultsRequest, ShowResultsResponse> */
    public SyncInvoker<ShowResultsRequest, ShowResultsResponse> showResultsInvoker(ShowResultsRequest request) {
        return new SyncInvoker<ShowResultsRequest, ShowResultsResponse>(request, VssMeta.showResults, hcClient);
    }

    /** 更新漏洞的误报状态 更新域名扫描漏洞的误报状态
     *
     * @param UpdateFalsePositiveRequest 请求对象
     * @return UpdateFalsePositiveResponse */
    public UpdateFalsePositiveResponse updateFalsePositive(UpdateFalsePositiveRequest request) {
        return hcClient.syncInvokeHttp(request, VssMeta.updateFalsePositive);
    }

    /** 更新漏洞的误报状态 更新域名扫描漏洞的误报状态
     *
     * @param UpdateFalsePositiveRequest 请求对象
     * @return SyncInvoker<UpdateFalsePositiveRequest, UpdateFalsePositiveResponse> */
    public SyncInvoker<UpdateFalsePositiveRequest, UpdateFalsePositiveResponse> updateFalsePositiveInvoker(
        UpdateFalsePositiveRequest request) {
        return new SyncInvoker<UpdateFalsePositiveRequest, UpdateFalsePositiveResponse>(request,
            VssMeta.updateFalsePositive, hcClient);
    }

    /** 取消或重启扫描任务 取消或重启域名漏洞扫描任务
     *
     * @param CancelTasksRequest 请求对象
     * @return CancelTasksResponse */
    public CancelTasksResponse cancelTasks(CancelTasksRequest request) {
        return hcClient.syncInvokeHttp(request, VssMeta.cancelTasks);
    }

    /** 取消或重启扫描任务 取消或重启域名漏洞扫描任务
     *
     * @param CancelTasksRequest 请求对象
     * @return SyncInvoker<CancelTasksRequest, CancelTasksResponse> */
    public SyncInvoker<CancelTasksRequest, CancelTasksResponse> cancelTasksInvoker(CancelTasksRequest request) {
        return new SyncInvoker<CancelTasksRequest, CancelTasksResponse>(request, VssMeta.cancelTasks, hcClient);
    }

    /** 创建扫描任务并启动 创建域名漏洞扫描任务并启动
     *
     * @param CreateTasksRequest 请求对象
     * @return CreateTasksResponse */
    public CreateTasksResponse createTasks(CreateTasksRequest request) {
        return hcClient.syncInvokeHttp(request, VssMeta.createTasks);
    }

    /** 创建扫描任务并启动 创建域名漏洞扫描任务并启动
     *
     * @param CreateTasksRequest 请求对象
     * @return SyncInvoker<CreateTasksRequest, CreateTasksResponse> */
    public SyncInvoker<CreateTasksRequest, CreateTasksResponse> createTasksInvoker(CreateTasksRequest request) {
        return new SyncInvoker<CreateTasksRequest, CreateTasksResponse>(request, VssMeta.createTasks, hcClient);
    }

    /** 获取域名的历史扫描任务 获取域名漏洞扫描的历史扫描任务
     *
     * @param ListTaskHistoriesRequest 请求对象
     * @return ListTaskHistoriesResponse */
    public ListTaskHistoriesResponse listTaskHistories(ListTaskHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, VssMeta.listTaskHistories);
    }

    /** 获取域名的历史扫描任务 获取域名漏洞扫描的历史扫描任务
     *
     * @param ListTaskHistoriesRequest 请求对象
     * @return SyncInvoker<ListTaskHistoriesRequest, ListTaskHistoriesResponse> */
    public SyncInvoker<ListTaskHistoriesRequest, ListTaskHistoriesResponse> listTaskHistoriesInvoker(
        ListTaskHistoriesRequest request) {
        return new SyncInvoker<ListTaskHistoriesRequest, ListTaskHistoriesResponse>(request, VssMeta.listTaskHistories,
            hcClient);
    }

    /** 获取扫描任务详情 获取域名漏洞扫描任务详情
     *
     * @param ShowTasksRequest 请求对象
     * @return ShowTasksResponse */
    public ShowTasksResponse showTasks(ShowTasksRequest request) {
        return hcClient.syncInvokeHttp(request, VssMeta.showTasks);
    }

    /** 获取扫描任务详情 获取域名漏洞扫描任务详情
     *
     * @param ShowTasksRequest 请求对象
     * @return SyncInvoker<ShowTasksRequest, ShowTasksResponse> */
    public SyncInvoker<ShowTasksRequest, ShowTasksResponse> showTasksInvoker(ShowTasksRequest request) {
        return new SyncInvoker<ShowTasksRequest, ShowTasksResponse>(request, VssMeta.showTasks, hcClient);
    }

}
