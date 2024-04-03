package com.huaweicloud.sdk.scm.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class ScmClient {

    protected HcClient hcClient;

    public ScmClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ScmClient> newBuilder() {
        ClientBuilder<ScmClient> clientBuilder =
            new ClientBuilder<>(ScmClient::new, "GlobalCredentials,BasicCredentials");
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
     * @return ApplyCertificateResponse
     */
    public ApplyCertificateResponse applyCertificate(ApplyCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.applyCertificate);
    }

    /**
     * 申请证书
     *
     * 申请证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyCertificateRequest 请求对象
     * @return SyncInvoker<ApplyCertificateRequest, ApplyCertificateResponse>
     */
    public SyncInvoker<ApplyCertificateRequest, ApplyCertificateResponse> applyCertificateInvoker(
        ApplyCertificateRequest request) {
        return new SyncInvoker<>(request, ScmMeta.applyCertificate, hcClient);
    }

    /**
     * 批量推送证书
     *
     * 批量推送SSL证书到弹性负载均衡（Elastic Load Balance，简称ELB）、Web应用防火墙（Web Application Firewall，WAF）、CDN（Content Delivery Network，内容分发网络）等其它华为云产品中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchPushCertificateRequest 请求对象
     * @return BatchPushCertificateResponse
     */
    public BatchPushCertificateResponse batchPushCertificate(BatchPushCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.batchPushCertificate);
    }

    /**
     * 批量推送证书
     *
     * 批量推送SSL证书到弹性负载均衡（Elastic Load Balance，简称ELB）、Web应用防火墙（Web Application Firewall，WAF）、CDN（Content Delivery Network，内容分发网络）等其它华为云产品中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchPushCertificateRequest 请求对象
     * @return SyncInvoker<BatchPushCertificateRequest, BatchPushCertificateResponse>
     */
    public SyncInvoker<BatchPushCertificateRequest, BatchPushCertificateResponse> batchPushCertificateInvoker(
        BatchPushCertificateRequest request) {
        return new SyncInvoker<>(request, ScmMeta.batchPushCertificate, hcClient);
    }

    /**
     * 删除证书
     *
     * 删除证书实例，即将证书资源从系统中删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateRequest 请求对象
     * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.deleteCertificate);
    }

    /**
     * 删除证书
     *
     * 删除证书实例，即将证书资源从系统中删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateRequest 请求对象
     * @return SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateInvoker(
        DeleteCertificateRequest request) {
        return new SyncInvoker<>(request, ScmMeta.deleteCertificate, hcClient);
    }

    /**
     * 部署证书
     *
     * 部署SSL证书到弹性负载均衡（Elastic Load Balance，简称ELB）、Web应用防火墙（Web Application Firewall，WAF）、CDN（Content Delivery Network，内容分发网络）等其它华为云产品中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployCertificateRequest 请求对象
     * @return DeployCertificateResponse
     */
    public DeployCertificateResponse deployCertificate(DeployCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.deployCertificate);
    }

    /**
     * 部署证书
     *
     * 部署SSL证书到弹性负载均衡（Elastic Load Balance，简称ELB）、Web应用防火墙（Web Application Firewall，WAF）、CDN（Content Delivery Network，内容分发网络）等其它华为云产品中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployCertificateRequest 请求对象
     * @return SyncInvoker<DeployCertificateRequest, DeployCertificateResponse>
     */
    public SyncInvoker<DeployCertificateRequest, DeployCertificateResponse> deployCertificateInvoker(
        DeployCertificateRequest request) {
        return new SyncInvoker<>(request, ScmMeta.deployCertificate, hcClient);
    }

    /**
     * 导出证书
     *
     * 导出证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertificateRequest 请求对象
     * @return ExportCertificateResponse
     */
    public ExportCertificateResponse exportCertificate(ExportCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.exportCertificate);
    }

    /**
     * 导出证书
     *
     * 导出证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertificateRequest 请求对象
     * @return SyncInvoker<ExportCertificateRequest, ExportCertificateResponse>
     */
    public SyncInvoker<ExportCertificateRequest, ExportCertificateResponse> exportCertificateInvoker(
        ExportCertificateRequest request) {
        return new SyncInvoker<>(request, ScmMeta.exportCertificate, hcClient);
    }

    /**
     * 导入证书
     *
     * 导入证书到SCM服务管理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportCertificateRequest 请求对象
     * @return ImportCertificateResponse
     */
    public ImportCertificateResponse importCertificate(ImportCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.importCertificate);
    }

    /**
     * 导入证书
     *
     * 导入证书到SCM服务管理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportCertificateRequest 请求对象
     * @return SyncInvoker<ImportCertificateRequest, ImportCertificateResponse>
     */
    public SyncInvoker<ImportCertificateRequest, ImportCertificateResponse> importCertificateInvoker(
        ImportCertificateRequest request) {
        return new SyncInvoker<>(request, ScmMeta.importCertificate, hcClient);
    }

    /**
     * 查询证书列表
     *
     * 根据证书名称或绑定域名查询证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificatesRequest 请求对象
     * @return ListCertificatesResponse
     */
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.listCertificates);
    }

    /**
     * 查询证书列表
     *
     * 根据证书名称或绑定域名查询证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificatesRequest 请求对象
     * @return SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public SyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesInvoker(
        ListCertificatesRequest request) {
        return new SyncInvoker<>(request, ScmMeta.listCertificates, hcClient);
    }

    /**
     * 查询已部署资源
     *
     * 查询证书已部署的具体资源。针对已签发和上传的非国密证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeployedResourcesRequest 请求对象
     * @return ListDeployedResourcesResponse
     */
    public ListDeployedResourcesResponse listDeployedResources(ListDeployedResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.listDeployedResources);
    }

    /**
     * 查询已部署资源
     *
     * 查询证书已部署的具体资源。针对已签发和上传的非国密证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeployedResourcesRequest 请求对象
     * @return SyncInvoker<ListDeployedResourcesRequest, ListDeployedResourcesResponse>
     */
    public SyncInvoker<ListDeployedResourcesRequest, ListDeployedResourcesResponse> listDeployedResourcesInvoker(
        ListDeployedResourcesRequest request) {
        return new SyncInvoker<>(request, ScmMeta.listDeployedResources, hcClient);
    }

    /**
     * 推送证书
     *
     * 推送SSL证书到弹性负载均衡（Elastic Load Balance，简称ELB）、Web应用防火墙（Web Application Firewall，WAF）、CDN（Content Delivery Network，内容分发网络）等其它华为云产品中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PushCertificateRequest 请求对象
     * @return PushCertificateResponse
     */
    public PushCertificateResponse pushCertificate(PushCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.pushCertificate);
    }

    /**
     * 推送证书
     *
     * 推送SSL证书到弹性负载均衡（Elastic Load Balance，简称ELB）、Web应用防火墙（Web Application Firewall，WAF）、CDN（Content Delivery Network，内容分发网络）等其它华为云产品中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PushCertificateRequest 请求对象
     * @return SyncInvoker<PushCertificateRequest, PushCertificateResponse>
     */
    public SyncInvoker<PushCertificateRequest, PushCertificateResponse> pushCertificateInvoker(
        PushCertificateRequest request) {
        return new SyncInvoker<>(request, ScmMeta.pushCertificate, hcClient);
    }

    /**
     * 获取证书详情
     *
     * 查询某张证书的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateRequest 请求对象
     * @return ShowCertificateResponse
     */
    public ShowCertificateResponse showCertificate(ShowCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.showCertificate);
    }

    /**
     * 获取证书详情
     *
     * 查询某张证书的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateRequest 请求对象
     * @return SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public SyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateInvoker(
        ShowCertificateRequest request) {
        return new SyncInvoker<>(request, ScmMeta.showCertificate, hcClient);
    }

    /**
     * 购买SSL证书
     *
     * 购买SSL证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeCertificateRequest 请求对象
     * @return SubscribeCertificateResponse
     */
    public SubscribeCertificateResponse subscribeCertificate(SubscribeCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.subscribeCertificate);
    }

    /**
     * 购买SSL证书
     *
     * 购买SSL证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeCertificateRequest 请求对象
     * @return SyncInvoker<SubscribeCertificateRequest, SubscribeCertificateResponse>
     */
    public SyncInvoker<SubscribeCertificateRequest, SubscribeCertificateResponse> subscribeCertificateInvoker(
        SubscribeCertificateRequest request) {
        return new SyncInvoker<>(request, ScmMeta.subscribeCertificate, hcClient);
    }

    /**
     * 退订证书
     *
     * 退订证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnsubscribeCertificateRequest 请求对象
     * @return UnsubscribeCertificateResponse
     */
    public UnsubscribeCertificateResponse unsubscribeCertificate(UnsubscribeCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.unsubscribeCertificate);
    }

    /**
     * 退订证书
     *
     * 退订证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnsubscribeCertificateRequest 请求对象
     * @return SyncInvoker<UnsubscribeCertificateRequest, UnsubscribeCertificateResponse>
     */
    public SyncInvoker<UnsubscribeCertificateRequest, UnsubscribeCertificateResponse> unsubscribeCertificateInvoker(
        UnsubscribeCertificateRequest request) {
        return new SyncInvoker<>(request, ScmMeta.unsubscribeCertificate, hcClient);
    }

}
