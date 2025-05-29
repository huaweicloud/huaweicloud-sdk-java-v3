package com.huaweicloud.sdk.scm.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.scm.v3.model.ApplyCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.ApplyCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.BatchCreateOrDeleteTagsRequest;
import com.huaweicloud.sdk.scm.v3.model.BatchCreateOrDeleteTagsResponse;
import com.huaweicloud.sdk.scm.v3.model.BatchPushCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.BatchPushCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.CancelCertificateRequestRequest;
import com.huaweicloud.sdk.scm.v3.model.CancelCertificateRequestResponse;
import com.huaweicloud.sdk.scm.v3.model.CreateCertificateTagRequest;
import com.huaweicloud.sdk.scm.v3.model.CreateCertificateTagResponse;
import com.huaweicloud.sdk.scm.v3.model.CreateCsrRequest;
import com.huaweicloud.sdk.scm.v3.model.CreateCsrResponse;
import com.huaweicloud.sdk.scm.v3.model.DeleteCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.DeleteCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.DeleteCsrRequest;
import com.huaweicloud.sdk.scm.v3.model.DeleteCsrResponse;
import com.huaweicloud.sdk.scm.v3.model.DeployCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.DeployCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.ExportCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.ExportCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.ImportCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.ImportCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.ListAllTagsRequest;
import com.huaweicloud.sdk.scm.v3.model.ListAllTagsResponse;
import com.huaweicloud.sdk.scm.v3.model.ListCertificatesByTagRequest;
import com.huaweicloud.sdk.scm.v3.model.ListCertificatesByTagResponse;
import com.huaweicloud.sdk.scm.v3.model.ListCertificatesRequest;
import com.huaweicloud.sdk.scm.v3.model.ListCertificatesResponse;
import com.huaweicloud.sdk.scm.v3.model.ListCsrRequest;
import com.huaweicloud.sdk.scm.v3.model.ListCsrResponse;
import com.huaweicloud.sdk.scm.v3.model.ListDeployedResourcesRequest;
import com.huaweicloud.sdk.scm.v3.model.ListDeployedResourcesResponse;
import com.huaweicloud.sdk.scm.v3.model.ListTagsByCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.ListTagsByCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.PushCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.PushCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.ShowCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.ShowCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.ShowCsrPrivateKeyRequest;
import com.huaweicloud.sdk.scm.v3.model.ShowCsrPrivateKeyResponse;
import com.huaweicloud.sdk.scm.v3.model.ShowCsrRequest;
import com.huaweicloud.sdk.scm.v3.model.ShowCsrResponse;
import com.huaweicloud.sdk.scm.v3.model.SubscribeCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.SubscribeCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.UnsubscribeCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.UnsubscribeCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.UpdateCsrRequest;
import com.huaweicloud.sdk.scm.v3.model.UpdateCsrResponse;
import com.huaweicloud.sdk.scm.v3.model.UploadCsrRequest;
import com.huaweicloud.sdk.scm.v3.model.UploadCsrResponse;

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
     * 批量创建或删除标签
     *
     * 批量创建或删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteTagsRequest 请求对象
     * @return BatchCreateOrDeleteTagsResponse
     */
    public BatchCreateOrDeleteTagsResponse batchCreateOrDeleteTags(BatchCreateOrDeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.batchCreateOrDeleteTags);
    }

    /**
     * 批量创建或删除标签
     *
     * 批量创建或删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse>
     */
    public SyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> batchCreateOrDeleteTagsInvoker(
        BatchCreateOrDeleteTagsRequest request) {
        return new SyncInvoker<>(request, ScmMeta.batchCreateOrDeleteTags, hcClient);
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
     * 撤回证书申请
     *
     * 撤回证书申请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelCertificateRequestRequest 请求对象
     * @return CancelCertificateRequestResponse
     */
    public CancelCertificateRequestResponse cancelCertificateRequest(CancelCertificateRequestRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.cancelCertificateRequest);
    }

    /**
     * 撤回证书申请
     *
     * 撤回证书申请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelCertificateRequestRequest 请求对象
     * @return SyncInvoker<CancelCertificateRequestRequest, CancelCertificateRequestResponse>
     */
    public SyncInvoker<CancelCertificateRequestRequest, CancelCertificateRequestResponse> cancelCertificateRequestInvoker(
        CancelCertificateRequestRequest request) {
        return new SyncInvoker<>(request, ScmMeta.cancelCertificateRequest, hcClient);
    }

    /**
     * 创建标签
     *
     * 创建标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateTagRequest 请求对象
     * @return CreateCertificateTagResponse
     */
    public CreateCertificateTagResponse createCertificateTag(CreateCertificateTagRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.createCertificateTag);
    }

    /**
     * 创建标签
     *
     * 创建标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateTagRequest 请求对象
     * @return SyncInvoker<CreateCertificateTagRequest, CreateCertificateTagResponse>
     */
    public SyncInvoker<CreateCertificateTagRequest, CreateCertificateTagResponse> createCertificateTagInvoker(
        CreateCertificateTagRequest request) {
        return new SyncInvoker<>(request, ScmMeta.createCertificateTag, hcClient);
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
     * 导入证书到CCM服务管理。
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
     * 导入证书到CCM服务管理。
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
     * 查询所有标签列表
     *
     * 查询所有标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTagsRequest 请求对象
     * @return ListAllTagsResponse
     */
    public ListAllTagsResponse listAllTags(ListAllTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.listAllTags);
    }

    /**
     * 查询所有标签列表
     *
     * 查询所有标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTagsRequest 请求对象
     * @return SyncInvoker<ListAllTagsRequest, ListAllTagsResponse>
     */
    public SyncInvoker<ListAllTagsRequest, ListAllTagsResponse> listAllTagsInvoker(ListAllTagsRequest request) {
        return new SyncInvoker<>(request, ScmMeta.listAllTags, hcClient);
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
     * 根据标签查询证书列表
     *
     * 根据标签查询证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificatesByTagRequest 请求对象
     * @return ListCertificatesByTagResponse
     */
    public ListCertificatesByTagResponse listCertificatesByTag(ListCertificatesByTagRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.listCertificatesByTag);
    }

    /**
     * 根据标签查询证书列表
     *
     * 根据标签查询证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificatesByTagRequest 请求对象
     * @return SyncInvoker<ListCertificatesByTagRequest, ListCertificatesByTagResponse>
     */
    public SyncInvoker<ListCertificatesByTagRequest, ListCertificatesByTagResponse> listCertificatesByTagInvoker(
        ListCertificatesByTagRequest request) {
        return new SyncInvoker<>(request, ScmMeta.listCertificatesByTag, hcClient);
    }

    /**
     * 查询已部署资源
     *
     * 查询证书已部署的具体资源。针对已签发和上传的非国密证书。
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
     * 查询证书已部署的具体资源。针对已签发和上传的非国密证书。
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
     * 根据证书ID查询标签列表
     *
     * 根据证书ID查询标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsByCertificateRequest 请求对象
     * @return ListTagsByCertificateResponse
     */
    public ListTagsByCertificateResponse listTagsByCertificate(ListTagsByCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.listTagsByCertificate);
    }

    /**
     * 根据证书ID查询标签列表
     *
     * 根据证书ID查询标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsByCertificateRequest 请求对象
     * @return SyncInvoker<ListTagsByCertificateRequest, ListTagsByCertificateResponse>
     */
    public SyncInvoker<ListTagsByCertificateRequest, ListTagsByCertificateResponse> listTagsByCertificateInvoker(
        ListTagsByCertificateRequest request) {
        return new SyncInvoker<>(request, ScmMeta.listTagsByCertificate, hcClient);
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

    /**
     * 创建CSR
     *
     * 创建CSR。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCsrRequest 请求对象
     * @return CreateCsrResponse
     */
    public CreateCsrResponse createCsr(CreateCsrRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.createCsr);
    }

    /**
     * 创建CSR
     *
     * 创建CSR。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCsrRequest 请求对象
     * @return SyncInvoker<CreateCsrRequest, CreateCsrResponse>
     */
    public SyncInvoker<CreateCsrRequest, CreateCsrResponse> createCsrInvoker(CreateCsrRequest request) {
        return new SyncInvoker<>(request, ScmMeta.createCsr, hcClient);
    }

    /**
     * 删除CSR
     *
     * 删除CSR。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCsrRequest 请求对象
     * @return DeleteCsrResponse
     */
    public DeleteCsrResponse deleteCsr(DeleteCsrRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.deleteCsr);
    }

    /**
     * 删除CSR
     *
     * 删除CSR。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCsrRequest 请求对象
     * @return SyncInvoker<DeleteCsrRequest, DeleteCsrResponse>
     */
    public SyncInvoker<DeleteCsrRequest, DeleteCsrResponse> deleteCsrInvoker(DeleteCsrRequest request) {
        return new SyncInvoker<>(request, ScmMeta.deleteCsr, hcClient);
    }

    /**
     * 查询CSR列表
     *
     * 查询CSR列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCsrRequest 请求对象
     * @return ListCsrResponse
     */
    public ListCsrResponse listCsr(ListCsrRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.listCsr);
    }

    /**
     * 查询CSR列表
     *
     * 查询CSR列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCsrRequest 请求对象
     * @return SyncInvoker<ListCsrRequest, ListCsrResponse>
     */
    public SyncInvoker<ListCsrRequest, ListCsrResponse> listCsrInvoker(ListCsrRequest request) {
        return new SyncInvoker<>(request, ScmMeta.listCsr, hcClient);
    }

    /**
     * 查询CSR
     *
     * 查询CSR。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCsrRequest 请求对象
     * @return ShowCsrResponse
     */
    public ShowCsrResponse showCsr(ShowCsrRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.showCsr);
    }

    /**
     * 查询CSR
     *
     * 查询CSR。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCsrRequest 请求对象
     * @return SyncInvoker<ShowCsrRequest, ShowCsrResponse>
     */
    public SyncInvoker<ShowCsrRequest, ShowCsrResponse> showCsrInvoker(ShowCsrRequest request) {
        return new SyncInvoker<>(request, ScmMeta.showCsr, hcClient);
    }

    /**
     * 查询私钥
     *
     * 查询私钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCsrPrivateKeyRequest 请求对象
     * @return ShowCsrPrivateKeyResponse
     */
    public ShowCsrPrivateKeyResponse showCsrPrivateKey(ShowCsrPrivateKeyRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.showCsrPrivateKey);
    }

    /**
     * 查询私钥
     *
     * 查询私钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCsrPrivateKeyRequest 请求对象
     * @return SyncInvoker<ShowCsrPrivateKeyRequest, ShowCsrPrivateKeyResponse>
     */
    public SyncInvoker<ShowCsrPrivateKeyRequest, ShowCsrPrivateKeyResponse> showCsrPrivateKeyInvoker(
        ShowCsrPrivateKeyRequest request) {
        return new SyncInvoker<>(request, ScmMeta.showCsrPrivateKey, hcClient);
    }

    /**
     * 更新CSR
     *
     * 更新CSR。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCsrRequest 请求对象
     * @return UpdateCsrResponse
     */
    public UpdateCsrResponse updateCsr(UpdateCsrRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.updateCsr);
    }

    /**
     * 更新CSR
     *
     * 更新CSR。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCsrRequest 请求对象
     * @return SyncInvoker<UpdateCsrRequest, UpdateCsrResponse>
     */
    public SyncInvoker<UpdateCsrRequest, UpdateCsrResponse> updateCsrInvoker(UpdateCsrRequest request) {
        return new SyncInvoker<>(request, ScmMeta.updateCsr, hcClient);
    }

    /**
     * 上传CSR
     *
     * 上传CSR。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadCsrRequest 请求对象
     * @return UploadCsrResponse
     */
    public UploadCsrResponse uploadCsr(UploadCsrRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.uploadCsr);
    }

    /**
     * 上传CSR
     *
     * 上传CSR。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadCsrRequest 请求对象
     * @return SyncInvoker<UploadCsrRequest, UploadCsrResponse>
     */
    public SyncInvoker<UploadCsrRequest, UploadCsrResponse> uploadCsrInvoker(UploadCsrRequest request) {
        return new SyncInvoker<>(request, ScmMeta.uploadCsr, hcClient);
    }

}
