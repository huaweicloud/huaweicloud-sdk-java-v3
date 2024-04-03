package com.huaweicloud.sdk.scm.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.scm.v3.model.ApplyCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.ApplyCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.BatchPushCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.BatchPushCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.DeleteCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.DeleteCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.DeployCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.DeployCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.ExportCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.ExportCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.ImportCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.ImportCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.ListCertificatesRequest;
import com.huaweicloud.sdk.scm.v3.model.ListCertificatesResponse;
import com.huaweicloud.sdk.scm.v3.model.ListDeployedResourcesRequest;
import com.huaweicloud.sdk.scm.v3.model.ListDeployedResourcesResponse;
import com.huaweicloud.sdk.scm.v3.model.PushCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.PushCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.ShowCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.ShowCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.SubscribeCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.SubscribeCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.UnsubscribeCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.UnsubscribeCertificateResponse;

import java.util.concurrent.CompletableFuture;

public class ScmAsyncClient {

    protected HcClient hcClient;

    public ScmAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ScmAsyncClient> newBuilder() {
        ClientBuilder<ScmAsyncClient> clientBuilder =
            new ClientBuilder<>(ScmAsyncClient::new, "GlobalCredentials,BasicCredentials");
        return clientBuilder;
    }

    /**
     * 申请证书
     *
     * 申请证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyCertificateRequest 请求对象
     * @return CompletableFuture<ApplyCertificateResponse>
     */
    public CompletableFuture<ApplyCertificateResponse> applyCertificateAsync(ApplyCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ScmMeta.applyCertificate);
    }

    /**
     * 申请证书
     *
     * 申请证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyCertificateRequest 请求对象
     * @return AsyncInvoker<ApplyCertificateRequest, ApplyCertificateResponse>
     */
    public AsyncInvoker<ApplyCertificateRequest, ApplyCertificateResponse> applyCertificateAsyncInvoker(
        ApplyCertificateRequest request) {
        return new AsyncInvoker<>(request, ScmMeta.applyCertificate, hcClient);
    }

    /**
     * 批量推送证书
     *
     * 批量推送SSL证书到弹性负载均衡（Elastic Load Balance，简称ELB）、Web应用防火墙（Web Application Firewall，WAF）、CDN（Content Delivery Network，内容分发网络）等其它华为云产品中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchPushCertificateRequest 请求对象
     * @return CompletableFuture<BatchPushCertificateResponse>
     */
    public CompletableFuture<BatchPushCertificateResponse> batchPushCertificateAsync(
        BatchPushCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ScmMeta.batchPushCertificate);
    }

    /**
     * 批量推送证书
     *
     * 批量推送SSL证书到弹性负载均衡（Elastic Load Balance，简称ELB）、Web应用防火墙（Web Application Firewall，WAF）、CDN（Content Delivery Network，内容分发网络）等其它华为云产品中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchPushCertificateRequest 请求对象
     * @return AsyncInvoker<BatchPushCertificateRequest, BatchPushCertificateResponse>
     */
    public AsyncInvoker<BatchPushCertificateRequest, BatchPushCertificateResponse> batchPushCertificateAsyncInvoker(
        BatchPushCertificateRequest request) {
        return new AsyncInvoker<>(request, ScmMeta.batchPushCertificate, hcClient);
    }

    /**
     * 删除证书
     *
     * 删除证书实例，即将证书资源从系统中删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateRequest 请求对象
     * @return CompletableFuture<DeleteCertificateResponse>
     */
    public CompletableFuture<DeleteCertificateResponse> deleteCertificateAsync(DeleteCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ScmMeta.deleteCertificate);
    }

    /**
     * 删除证书
     *
     * 删除证书实例，即将证书资源从系统中删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateRequest 请求对象
     * @return AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateAsyncInvoker(
        DeleteCertificateRequest request) {
        return new AsyncInvoker<>(request, ScmMeta.deleteCertificate, hcClient);
    }

    /**
     * 部署证书
     *
     * 部署SSL证书到弹性负载均衡（Elastic Load Balance，简称ELB）、Web应用防火墙（Web Application Firewall，WAF）、CDN（Content Delivery Network，内容分发网络）等其它华为云产品中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployCertificateRequest 请求对象
     * @return CompletableFuture<DeployCertificateResponse>
     */
    public CompletableFuture<DeployCertificateResponse> deployCertificateAsync(DeployCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ScmMeta.deployCertificate);
    }

    /**
     * 部署证书
     *
     * 部署SSL证书到弹性负载均衡（Elastic Load Balance，简称ELB）、Web应用防火墙（Web Application Firewall，WAF）、CDN（Content Delivery Network，内容分发网络）等其它华为云产品中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployCertificateRequest 请求对象
     * @return AsyncInvoker<DeployCertificateRequest, DeployCertificateResponse>
     */
    public AsyncInvoker<DeployCertificateRequest, DeployCertificateResponse> deployCertificateAsyncInvoker(
        DeployCertificateRequest request) {
        return new AsyncInvoker<>(request, ScmMeta.deployCertificate, hcClient);
    }

    /**
     * 导出证书
     *
     * 导出证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertificateRequest 请求对象
     * @return CompletableFuture<ExportCertificateResponse>
     */
    public CompletableFuture<ExportCertificateResponse> exportCertificateAsync(ExportCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ScmMeta.exportCertificate);
    }

    /**
     * 导出证书
     *
     * 导出证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertificateRequest 请求对象
     * @return AsyncInvoker<ExportCertificateRequest, ExportCertificateResponse>
     */
    public AsyncInvoker<ExportCertificateRequest, ExportCertificateResponse> exportCertificateAsyncInvoker(
        ExportCertificateRequest request) {
        return new AsyncInvoker<>(request, ScmMeta.exportCertificate, hcClient);
    }

    /**
     * 导入证书
     *
     * 导入证书到SCM服务管理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportCertificateRequest 请求对象
     * @return CompletableFuture<ImportCertificateResponse>
     */
    public CompletableFuture<ImportCertificateResponse> importCertificateAsync(ImportCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ScmMeta.importCertificate);
    }

    /**
     * 导入证书
     *
     * 导入证书到SCM服务管理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportCertificateRequest 请求对象
     * @return AsyncInvoker<ImportCertificateRequest, ImportCertificateResponse>
     */
    public AsyncInvoker<ImportCertificateRequest, ImportCertificateResponse> importCertificateAsyncInvoker(
        ImportCertificateRequest request) {
        return new AsyncInvoker<>(request, ScmMeta.importCertificate, hcClient);
    }

    /**
     * 查询证书列表
     *
     * 根据证书名称或绑定域名查询证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificatesRequest 请求对象
     * @return CompletableFuture<ListCertificatesResponse>
     */
    public CompletableFuture<ListCertificatesResponse> listCertificatesAsync(ListCertificatesRequest request) {
        return hcClient.asyncInvokeHttp(request, ScmMeta.listCertificates);
    }

    /**
     * 查询证书列表
     *
     * 根据证书名称或绑定域名查询证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificatesRequest 请求对象
     * @return AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesAsyncInvoker(
        ListCertificatesRequest request) {
        return new AsyncInvoker<>(request, ScmMeta.listCertificates, hcClient);
    }

    /**
     * 查询已部署资源
     *
     * 查询证书已部署的具体资源。针对已签发和上传的非国密证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeployedResourcesRequest 请求对象
     * @return CompletableFuture<ListDeployedResourcesResponse>
     */
    public CompletableFuture<ListDeployedResourcesResponse> listDeployedResourcesAsync(
        ListDeployedResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, ScmMeta.listDeployedResources);
    }

    /**
     * 查询已部署资源
     *
     * 查询证书已部署的具体资源。针对已签发和上传的非国密证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeployedResourcesRequest 请求对象
     * @return AsyncInvoker<ListDeployedResourcesRequest, ListDeployedResourcesResponse>
     */
    public AsyncInvoker<ListDeployedResourcesRequest, ListDeployedResourcesResponse> listDeployedResourcesAsyncInvoker(
        ListDeployedResourcesRequest request) {
        return new AsyncInvoker<>(request, ScmMeta.listDeployedResources, hcClient);
    }

    /**
     * 推送证书
     *
     * 推送SSL证书到弹性负载均衡（Elastic Load Balance，简称ELB）、Web应用防火墙（Web Application Firewall，WAF）、CDN（Content Delivery Network，内容分发网络）等其它华为云产品中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PushCertificateRequest 请求对象
     * @return CompletableFuture<PushCertificateResponse>
     */
    public CompletableFuture<PushCertificateResponse> pushCertificateAsync(PushCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ScmMeta.pushCertificate);
    }

    /**
     * 推送证书
     *
     * 推送SSL证书到弹性负载均衡（Elastic Load Balance，简称ELB）、Web应用防火墙（Web Application Firewall，WAF）、CDN（Content Delivery Network，内容分发网络）等其它华为云产品中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PushCertificateRequest 请求对象
     * @return AsyncInvoker<PushCertificateRequest, PushCertificateResponse>
     */
    public AsyncInvoker<PushCertificateRequest, PushCertificateResponse> pushCertificateAsyncInvoker(
        PushCertificateRequest request) {
        return new AsyncInvoker<>(request, ScmMeta.pushCertificate, hcClient);
    }

    /**
     * 获取证书详情
     *
     * 查询某张证书的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateRequest 请求对象
     * @return CompletableFuture<ShowCertificateResponse>
     */
    public CompletableFuture<ShowCertificateResponse> showCertificateAsync(ShowCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ScmMeta.showCertificate);
    }

    /**
     * 获取证书详情
     *
     * 查询某张证书的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateRequest 请求对象
     * @return AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateAsyncInvoker(
        ShowCertificateRequest request) {
        return new AsyncInvoker<>(request, ScmMeta.showCertificate, hcClient);
    }

    /**
     * 购买SSL证书
     *
     * 购买SSL证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeCertificateRequest 请求对象
     * @return CompletableFuture<SubscribeCertificateResponse>
     */
    public CompletableFuture<SubscribeCertificateResponse> subscribeCertificateAsync(
        SubscribeCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ScmMeta.subscribeCertificate);
    }

    /**
     * 购买SSL证书
     *
     * 购买SSL证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeCertificateRequest 请求对象
     * @return AsyncInvoker<SubscribeCertificateRequest, SubscribeCertificateResponse>
     */
    public AsyncInvoker<SubscribeCertificateRequest, SubscribeCertificateResponse> subscribeCertificateAsyncInvoker(
        SubscribeCertificateRequest request) {
        return new AsyncInvoker<>(request, ScmMeta.subscribeCertificate, hcClient);
    }

    /**
     * 退订证书
     *
     * 退订证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnsubscribeCertificateRequest 请求对象
     * @return CompletableFuture<UnsubscribeCertificateResponse>
     */
    public CompletableFuture<UnsubscribeCertificateResponse> unsubscribeCertificateAsync(
        UnsubscribeCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ScmMeta.unsubscribeCertificate);
    }

    /**
     * 退订证书
     *
     * 退订证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnsubscribeCertificateRequest 请求对象
     * @return AsyncInvoker<UnsubscribeCertificateRequest, UnsubscribeCertificateResponse>
     */
    public AsyncInvoker<UnsubscribeCertificateRequest, UnsubscribeCertificateResponse> unsubscribeCertificateAsyncInvoker(
        UnsubscribeCertificateRequest request) {
        return new AsyncInvoker<>(request, ScmMeta.unsubscribeCertificate, hcClient);
    }

}
