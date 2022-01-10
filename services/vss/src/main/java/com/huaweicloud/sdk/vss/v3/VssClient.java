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
