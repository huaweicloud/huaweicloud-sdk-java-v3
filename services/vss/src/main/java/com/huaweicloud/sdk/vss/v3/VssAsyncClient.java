package com.huaweicloud.sdk.vss.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.vss.v3.model.*;

import java.util.concurrent.CompletableFuture;

public class VssAsyncClient {

    protected HcClient hcClient;

    public VssAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VssAsyncClient> newBuilder() {
        return new ClientBuilder<>(VssAsyncClient::new);
    }

    /** 认证域名资产 认证租户的域名资产
     *
     * @param AuthorizeDomainsRequest 请求对象
     * @return CompletableFuture<AuthorizeDomainsResponse> */
    public CompletableFuture<AuthorizeDomainsResponse> authorizeDomainsAsync(AuthorizeDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.authorizeDomains);
    }

    /** 认证域名资产 认证租户的域名资产
     *
     * @param AuthorizeDomainsRequest 请求对象
     * @return AsyncInvoker<AuthorizeDomainsRequest, AuthorizeDomainsResponse> */
    public AsyncInvoker<AuthorizeDomainsRequest, AuthorizeDomainsResponse> authorizeDomainsAsyncInvoker(
        AuthorizeDomainsRequest request) {
        return new AsyncInvoker<AuthorizeDomainsRequest, AuthorizeDomainsResponse>(request, VssMeta.authorizeDomains,
            hcClient);
    }

    /** 创建域名资产 创建租户的域名资产
     *
     * @param CreateDomainsRequest 请求对象
     * @return CompletableFuture<CreateDomainsResponse> */
    public CompletableFuture<CreateDomainsResponse> createDomainsAsync(CreateDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.createDomains);
    }

    /** 创建域名资产 创建租户的域名资产
     *
     * @param CreateDomainsRequest 请求对象
     * @return AsyncInvoker<CreateDomainsRequest, CreateDomainsResponse> */
    public AsyncInvoker<CreateDomainsRequest, CreateDomainsResponse> createDomainsAsyncInvoker(
        CreateDomainsRequest request) {
        return new AsyncInvoker<CreateDomainsRequest, CreateDomainsResponse>(request, VssMeta.createDomains, hcClient);
    }

    /** 删除域名资产 删除租户的域名资产
     *
     * @param DeleteDomainsRequest 请求对象
     * @return CompletableFuture<DeleteDomainsResponse> */
    public CompletableFuture<DeleteDomainsResponse> deleteDomainsAsync(DeleteDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.deleteDomains);
    }

    /** 删除域名资产 删除租户的域名资产
     *
     * @param DeleteDomainsRequest 请求对象
     * @return AsyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse> */
    public AsyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse> deleteDomainsAsyncInvoker(
        DeleteDomainsRequest request) {
        return new AsyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse>(request, VssMeta.deleteDomains, hcClient);
    }

    /** 获取域名资产 获取租户的所有域名资产
     *
     * @param ListDomainsRequest 请求对象
     * @return CompletableFuture<ListDomainsResponse> */
    public CompletableFuture<ListDomainsResponse> listDomainsAsync(ListDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.listDomains);
    }

    /** 获取域名资产 获取租户的所有域名资产
     *
     * @param ListDomainsRequest 请求对象
     * @return AsyncInvoker<ListDomainsRequest, ListDomainsResponse> */
    public AsyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsAsyncInvoker(ListDomainsRequest request) {
        return new AsyncInvoker<ListDomainsRequest, ListDomainsResponse>(request, VssMeta.listDomains, hcClient);
    }

    /** 获取域名配置 获取域名登录配置
     *
     * @param ShowDomainSettingsRequest 请求对象
     * @return CompletableFuture<ShowDomainSettingsResponse> */
    public CompletableFuture<ShowDomainSettingsResponse> showDomainSettingsAsync(ShowDomainSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.showDomainSettings);
    }

    /** 获取域名配置 获取域名登录配置
     *
     * @param ShowDomainSettingsRequest 请求对象
     * @return AsyncInvoker<ShowDomainSettingsRequest, ShowDomainSettingsResponse> */
    public AsyncInvoker<ShowDomainSettingsRequest, ShowDomainSettingsResponse> showDomainSettingsAsyncInvoker(
        ShowDomainSettingsRequest request) {
        return new AsyncInvoker<ShowDomainSettingsRequest, ShowDomainSettingsResponse>(request,
            VssMeta.showDomainSettings, hcClient);
    }

    /** 更新域名配置 更新域名登录配置
     *
     * @param UpdateDomainSettingsRequest 请求对象
     * @return CompletableFuture<UpdateDomainSettingsResponse> */
    public CompletableFuture<UpdateDomainSettingsResponse> updateDomainSettingsAsync(
        UpdateDomainSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.updateDomainSettings);
    }

    /** 更新域名配置 更新域名登录配置
     *
     * @param UpdateDomainSettingsRequest 请求对象
     * @return AsyncInvoker<UpdateDomainSettingsRequest, UpdateDomainSettingsResponse> */
    public AsyncInvoker<UpdateDomainSettingsRequest, UpdateDomainSettingsResponse> updateDomainSettingsAsyncInvoker(
        UpdateDomainSettingsRequest request) {
        return new AsyncInvoker<UpdateDomainSettingsRequest, UpdateDomainSettingsResponse>(request,
            VssMeta.updateDomainSettings, hcClient);
    }

    /** 获取业务风险扫描结果 获取域名业务风险扫描结果
     *
     * @param ListBusinessRisksRequest 请求对象
     * @return CompletableFuture<ListBusinessRisksResponse> */
    public CompletableFuture<ListBusinessRisksResponse> listBusinessRisksAsync(ListBusinessRisksRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.listBusinessRisks);
    }

    /** 获取业务风险扫描结果 获取域名业务风险扫描结果
     *
     * @param ListBusinessRisksRequest 请求对象
     * @return AsyncInvoker<ListBusinessRisksRequest, ListBusinessRisksResponse> */
    public AsyncInvoker<ListBusinessRisksRequest, ListBusinessRisksResponse> listBusinessRisksAsyncInvoker(
        ListBusinessRisksRequest request) {
        return new AsyncInvoker<ListBusinessRisksRequest, ListBusinessRisksResponse>(request, VssMeta.listBusinessRisks,
            hcClient);
    }

    /** 获取端口扫描结果 获取域名端口扫描结果
     *
     * @param ListPortResultsRequest 请求对象
     * @return CompletableFuture<ListPortResultsResponse> */
    public CompletableFuture<ListPortResultsResponse> listPortResultsAsync(ListPortResultsRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.listPortResults);
    }

    /** 获取端口扫描结果 获取域名端口扫描结果
     *
     * @param ListPortResultsRequest 请求对象
     * @return AsyncInvoker<ListPortResultsRequest, ListPortResultsResponse> */
    public AsyncInvoker<ListPortResultsRequest, ListPortResultsResponse> listPortResultsAsyncInvoker(
        ListPortResultsRequest request) {
        return new AsyncInvoker<ListPortResultsRequest, ListPortResultsResponse>(request, VssMeta.listPortResults,
            hcClient);
    }

    /** 获取扫描结果 获取域名漏洞扫描结果
     *
     * @param ShowResultsRequest 请求对象
     * @return CompletableFuture<ShowResultsResponse> */
    public CompletableFuture<ShowResultsResponse> showResultsAsync(ShowResultsRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.showResults);
    }

    /** 获取扫描结果 获取域名漏洞扫描结果
     *
     * @param ShowResultsRequest 请求对象
     * @return AsyncInvoker<ShowResultsRequest, ShowResultsResponse> */
    public AsyncInvoker<ShowResultsRequest, ShowResultsResponse> showResultsAsyncInvoker(ShowResultsRequest request) {
        return new AsyncInvoker<ShowResultsRequest, ShowResultsResponse>(request, VssMeta.showResults, hcClient);
    }

    /** 更新漏洞的误报状态 更新域名扫描漏洞的误报状态
     *
     * @param UpdateFalsePositiveRequest 请求对象
     * @return CompletableFuture<UpdateFalsePositiveResponse> */
    public CompletableFuture<UpdateFalsePositiveResponse> updateFalsePositiveAsync(UpdateFalsePositiveRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.updateFalsePositive);
    }

    /** 更新漏洞的误报状态 更新域名扫描漏洞的误报状态
     *
     * @param UpdateFalsePositiveRequest 请求对象
     * @return AsyncInvoker<UpdateFalsePositiveRequest, UpdateFalsePositiveResponse> */
    public AsyncInvoker<UpdateFalsePositiveRequest, UpdateFalsePositiveResponse> updateFalsePositiveAsyncInvoker(
        UpdateFalsePositiveRequest request) {
        return new AsyncInvoker<UpdateFalsePositiveRequest, UpdateFalsePositiveResponse>(request,
            VssMeta.updateFalsePositive, hcClient);
    }

    /** 取消或重启扫描任务 取消或重启域名漏洞扫描任务
     *
     * @param CancelTasksRequest 请求对象
     * @return CompletableFuture<CancelTasksResponse> */
    public CompletableFuture<CancelTasksResponse> cancelTasksAsync(CancelTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.cancelTasks);
    }

    /** 取消或重启扫描任务 取消或重启域名漏洞扫描任务
     *
     * @param CancelTasksRequest 请求对象
     * @return AsyncInvoker<CancelTasksRequest, CancelTasksResponse> */
    public AsyncInvoker<CancelTasksRequest, CancelTasksResponse> cancelTasksAsyncInvoker(CancelTasksRequest request) {
        return new AsyncInvoker<CancelTasksRequest, CancelTasksResponse>(request, VssMeta.cancelTasks, hcClient);
    }

    /** 创建扫描任务并启动 创建域名漏洞扫描任务并启动
     *
     * @param CreateTasksRequest 请求对象
     * @return CompletableFuture<CreateTasksResponse> */
    public CompletableFuture<CreateTasksResponse> createTasksAsync(CreateTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.createTasks);
    }

    /** 创建扫描任务并启动 创建域名漏洞扫描任务并启动
     *
     * @param CreateTasksRequest 请求对象
     * @return AsyncInvoker<CreateTasksRequest, CreateTasksResponse> */
    public AsyncInvoker<CreateTasksRequest, CreateTasksResponse> createTasksAsyncInvoker(CreateTasksRequest request) {
        return new AsyncInvoker<CreateTasksRequest, CreateTasksResponse>(request, VssMeta.createTasks, hcClient);
    }

    /** 获取域名的历史扫描任务 获取域名漏洞扫描的历史扫描任务
     *
     * @param ListTaskHistoriesRequest 请求对象
     * @return CompletableFuture<ListTaskHistoriesResponse> */
    public CompletableFuture<ListTaskHistoriesResponse> listTaskHistoriesAsync(ListTaskHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.listTaskHistories);
    }

    /** 获取域名的历史扫描任务 获取域名漏洞扫描的历史扫描任务
     *
     * @param ListTaskHistoriesRequest 请求对象
     * @return AsyncInvoker<ListTaskHistoriesRequest, ListTaskHistoriesResponse> */
    public AsyncInvoker<ListTaskHistoriesRequest, ListTaskHistoriesResponse> listTaskHistoriesAsyncInvoker(
        ListTaskHistoriesRequest request) {
        return new AsyncInvoker<ListTaskHistoriesRequest, ListTaskHistoriesResponse>(request, VssMeta.listTaskHistories,
            hcClient);
    }

    /** 获取扫描任务详情 获取域名漏洞扫描任务详情
     *
     * @param ShowTasksRequest 请求对象
     * @return CompletableFuture<ShowTasksResponse> */
    public CompletableFuture<ShowTasksResponse> showTasksAsync(ShowTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.showTasks);
    }

    /** 获取扫描任务详情 获取域名漏洞扫描任务详情
     *
     * @param ShowTasksRequest 请求对象
     * @return AsyncInvoker<ShowTasksRequest, ShowTasksResponse> */
    public AsyncInvoker<ShowTasksRequest, ShowTasksResponse> showTasksAsyncInvoker(ShowTasksRequest request) {
        return new AsyncInvoker<ShowTasksRequest, ShowTasksResponse>(request, VssMeta.showTasks, hcClient);
    }

}
