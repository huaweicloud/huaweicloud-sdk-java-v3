package com.huaweicloud.sdk.scm.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.scm.v3.model.*;

import java.util.concurrent.CompletableFuture;

public class ScmAsyncClient {

    protected HcClient hcClient;

    public ScmAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ScmAsyncClient> newBuilder() {
        return new ClientBuilder<>(ScmAsyncClient::new);
    }

    /**
     * 删除证书
     *
     * 删除证书实例，即将证书资源从华为云系统中删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return CompletableFuture<DeleteCertificateResponse>
     */
    public CompletableFuture<DeleteCertificateResponse> deleteCertificateAsync(DeleteCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ScmMeta.deleteCertificate);
    }

    /**
     * 删除证书
     *
     * 删除证书实例，即将证书资源从华为云系统中删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateAsyncInvoker(
        DeleteCertificateRequest request) {
        return new AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request, ScmMeta.deleteCertificate,
            hcClient);
    }

    /**
     * 导出证书
     *
     * 导出证书。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportCertificateRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportCertificateRequest 请求对象
     * @return AsyncInvoker<ExportCertificateRequest, ExportCertificateResponse>
     */
    public AsyncInvoker<ExportCertificateRequest, ExportCertificateResponse> exportCertificateAsyncInvoker(
        ExportCertificateRequest request) {
        return new AsyncInvoker<ExportCertificateRequest, ExportCertificateResponse>(request, ScmMeta.exportCertificate,
            hcClient);
    }

    /**
     * 导入证书
     *
     * 导入证书到SCM服务管理。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ImportCertificateRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ImportCertificateRequest 请求对象
     * @return AsyncInvoker<ImportCertificateRequest, ImportCertificateResponse>
     */
    public AsyncInvoker<ImportCertificateRequest, ImportCertificateResponse> importCertificateAsyncInvoker(
        ImportCertificateRequest request) {
        return new AsyncInvoker<ImportCertificateRequest, ImportCertificateResponse>(request, ScmMeta.importCertificate,
            hcClient);
    }

    /**
     * 查询证书列表
     *
     * 根据证书名称或绑定域名查询证书列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCertificatesRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCertificatesRequest 请求对象
     * @return AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesAsyncInvoker(
        ListCertificatesRequest request) {
        return new AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse>(request, ScmMeta.listCertificates,
            hcClient);
    }

    /**
     * 推送证书
     *
     * 推送SSL证书到弹性负载均衡（Elastic Load Balance，简称ELB）、Web应用防火墙（Web Application Firewall，WAF）、CDN（Content Delivery Network，内容分发网络）等其它华为云产品中。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param PushCertificateRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param PushCertificateRequest 请求对象
     * @return AsyncInvoker<PushCertificateRequest, PushCertificateResponse>
     */
    public AsyncInvoker<PushCertificateRequest, PushCertificateResponse> pushCertificateAsyncInvoker(
        PushCertificateRequest request) {
        return new AsyncInvoker<PushCertificateRequest, PushCertificateResponse>(request, ScmMeta.pushCertificate,
            hcClient);
    }

    /**
     * 获取证书详情
     *
     * 查询某张证书的详细信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCertificateRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCertificateRequest 请求对象
     * @return AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateAsyncInvoker(
        ShowCertificateRequest request) {
        return new AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse>(request, ScmMeta.showCertificate,
            hcClient);
    }

}
