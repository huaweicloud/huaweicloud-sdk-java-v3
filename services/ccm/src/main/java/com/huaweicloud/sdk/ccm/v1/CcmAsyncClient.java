package com.huaweicloud.sdk.ccm.v1;

import com.huaweicloud.sdk.ccm.v1.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CcmAsyncClient {

    protected HcClient hcClient;

    public CcmAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CcmAsyncClient> newBuilder() {
        return new ClientBuilder<>(CcmAsyncClient::new, "GlobalCredentials");
    }

    /** 创建CA 创建CA
     *
     * @param CreateCertificateAuthorityRequest 请求对象
     * @return CompletableFuture<CreateCertificateAuthorityResponse> */
    public CompletableFuture<CreateCertificateAuthorityResponse> createCertificateAuthorityAsync(
        CreateCertificateAuthorityRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.createCertificateAuthority);
    }

    /** 创建CA 创建CA
     *
     * @param CreateCertificateAuthorityRequest 请求对象
     * @return AsyncInvoker<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse> */
    public AsyncInvoker<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse> createCertificateAuthorityAsyncInvoker(
        CreateCertificateAuthorityRequest request) {
        return new AsyncInvoker<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse>(request,
            CcmMeta.createCertificateAuthority, hcClient);
    }

    /** 删除CA 删除CA
     *
     * @param DeleteCertificateAuthorityRequest 请求对象
     * @return CompletableFuture<DeleteCertificateAuthorityResponse> */
    public CompletableFuture<DeleteCertificateAuthorityResponse> deleteCertificateAuthorityAsync(
        DeleteCertificateAuthorityRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.deleteCertificateAuthority);
    }

    /** 删除CA 删除CA
     *
     * @param DeleteCertificateAuthorityRequest 请求对象
     * @return AsyncInvoker<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResponse> */
    public AsyncInvoker<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResponse> deleteCertificateAuthorityAsyncInvoker(
        DeleteCertificateAuthorityRequest request) {
        return new AsyncInvoker<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResponse>(request,
            CcmMeta.deleteCertificateAuthority, hcClient);
    }

    /** 禁用CA 禁用CA
     *
     * @param DisableCertificateAuthorityRequest 请求对象
     * @return CompletableFuture<DisableCertificateAuthorityResponse> */
    public CompletableFuture<DisableCertificateAuthorityResponse> disableCertificateAuthorityAsync(
        DisableCertificateAuthorityRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.disableCertificateAuthority);
    }

    /** 禁用CA 禁用CA
     *
     * @param DisableCertificateAuthorityRequest 请求对象
     * @return AsyncInvoker<DisableCertificateAuthorityRequest, DisableCertificateAuthorityResponse> */
    public AsyncInvoker<DisableCertificateAuthorityRequest, DisableCertificateAuthorityResponse> disableCertificateAuthorityAsyncInvoker(
        DisableCertificateAuthorityRequest request) {
        return new AsyncInvoker<DisableCertificateAuthorityRequest, DisableCertificateAuthorityResponse>(request,
            CcmMeta.disableCertificateAuthority, hcClient);
    }

    /** 启用CA 启用CA
     *
     * @param EnableCertificateAuthorityRequest 请求对象
     * @return CompletableFuture<EnableCertificateAuthorityResponse> */
    public CompletableFuture<EnableCertificateAuthorityResponse> enableCertificateAuthorityAsync(
        EnableCertificateAuthorityRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.enableCertificateAuthority);
    }

    /** 启用CA 启用CA
     *
     * @param EnableCertificateAuthorityRequest 请求对象
     * @return AsyncInvoker<EnableCertificateAuthorityRequest, EnableCertificateAuthorityResponse> */
    public AsyncInvoker<EnableCertificateAuthorityRequest, EnableCertificateAuthorityResponse> enableCertificateAuthorityAsyncInvoker(
        EnableCertificateAuthorityRequest request) {
        return new AsyncInvoker<EnableCertificateAuthorityRequest, EnableCertificateAuthorityResponse>(request,
            CcmMeta.enableCertificateAuthority, hcClient);
    }

    /** 导出CA证书 导出CA证书
     *
     * @param ExportCertificateAuthorityCertificateRequest 请求对象
     * @return CompletableFuture<ExportCertificateAuthorityCertificateResponse> */
    public CompletableFuture<ExportCertificateAuthorityCertificateResponse> exportCertificateAuthorityCertificateAsync(
        ExportCertificateAuthorityCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.exportCertificateAuthorityCertificate);
    }

    /** 导出CA证书 导出CA证书
     *
     * @param ExportCertificateAuthorityCertificateRequest 请求对象
     * @return AsyncInvoker<ExportCertificateAuthorityCertificateRequest,
     *         ExportCertificateAuthorityCertificateResponse> */
    public AsyncInvoker<ExportCertificateAuthorityCertificateRequest, ExportCertificateAuthorityCertificateResponse> exportCertificateAuthorityCertificateAsyncInvoker(
        ExportCertificateAuthorityCertificateRequest request) {
        return new AsyncInvoker<ExportCertificateAuthorityCertificateRequest, ExportCertificateAuthorityCertificateResponse>(
            request, CcmMeta.exportCertificateAuthorityCertificate, hcClient);
    }

    /** 导出CA的证书签名请求 导出CA的证书签名请求
     *
     * @param ExportCertificateAuthorityCsrRequest 请求对象
     * @return CompletableFuture<ExportCertificateAuthorityCsrResponse> */
    public CompletableFuture<ExportCertificateAuthorityCsrResponse> exportCertificateAuthorityCsrAsync(
        ExportCertificateAuthorityCsrRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.exportCertificateAuthorityCsr);
    }

    /** 导出CA的证书签名请求 导出CA的证书签名请求
     *
     * @param ExportCertificateAuthorityCsrRequest 请求对象
     * @return AsyncInvoker<ExportCertificateAuthorityCsrRequest, ExportCertificateAuthorityCsrResponse> */
    public AsyncInvoker<ExportCertificateAuthorityCsrRequest, ExportCertificateAuthorityCsrResponse> exportCertificateAuthorityCsrAsyncInvoker(
        ExportCertificateAuthorityCsrRequest request) {
        return new AsyncInvoker<ExportCertificateAuthorityCsrRequest, ExportCertificateAuthorityCsrResponse>(request,
            CcmMeta.exportCertificateAuthorityCsr, hcClient);
    }

    /** 导入CA证书 导入CA证书
     *
     * @param ImportCertificateAuthorityCertificateRequest 请求对象
     * @return CompletableFuture<ImportCertificateAuthorityCertificateResponse> */
    public CompletableFuture<ImportCertificateAuthorityCertificateResponse> importCertificateAuthorityCertificateAsync(
        ImportCertificateAuthorityCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.importCertificateAuthorityCertificate);
    }

    /** 导入CA证书 导入CA证书
     *
     * @param ImportCertificateAuthorityCertificateRequest 请求对象
     * @return AsyncInvoker<ImportCertificateAuthorityCertificateRequest,
     *         ImportCertificateAuthorityCertificateResponse> */
    public AsyncInvoker<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResponse> importCertificateAuthorityCertificateAsyncInvoker(
        ImportCertificateAuthorityCertificateRequest request) {
        return new AsyncInvoker<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResponse>(
            request, CcmMeta.importCertificateAuthorityCertificate, hcClient);
    }

    /** 激活CA 激活CA
     *
     * @param IssueCertificateAuthorityCertificateRequest 请求对象
     * @return CompletableFuture<IssueCertificateAuthorityCertificateResponse> */
    public CompletableFuture<IssueCertificateAuthorityCertificateResponse> issueCertificateAuthorityCertificateAsync(
        IssueCertificateAuthorityCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.issueCertificateAuthorityCertificate);
    }

    /** 激活CA 激活CA
     *
     * @param IssueCertificateAuthorityCertificateRequest 请求对象
     * @return AsyncInvoker<IssueCertificateAuthorityCertificateRequest,
     *         IssueCertificateAuthorityCertificateResponse> */
    public AsyncInvoker<IssueCertificateAuthorityCertificateRequest, IssueCertificateAuthorityCertificateResponse> issueCertificateAuthorityCertificateAsyncInvoker(
        IssueCertificateAuthorityCertificateRequest request) {
        return new AsyncInvoker<IssueCertificateAuthorityCertificateRequest, IssueCertificateAuthorityCertificateResponse>(
            request, CcmMeta.issueCertificateAuthorityCertificate, hcClient);
    }

    /** 查询CA列表 查询CA列表
     *
     * @param ListCertificateAuthorityRequest 请求对象
     * @return CompletableFuture<ListCertificateAuthorityResponse> */
    public CompletableFuture<ListCertificateAuthorityResponse> listCertificateAuthorityAsync(
        ListCertificateAuthorityRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.listCertificateAuthority);
    }

    /** 查询CA列表 查询CA列表
     *
     * @param ListCertificateAuthorityRequest 请求对象
     * @return AsyncInvoker<ListCertificateAuthorityRequest, ListCertificateAuthorityResponse> */
    public AsyncInvoker<ListCertificateAuthorityRequest, ListCertificateAuthorityResponse> listCertificateAuthorityAsyncInvoker(
        ListCertificateAuthorityRequest request) {
        return new AsyncInvoker<ListCertificateAuthorityRequest, ListCertificateAuthorityResponse>(request,
            CcmMeta.listCertificateAuthority, hcClient);
    }

    /** 恢复CA 恢复CA
     *
     * @param RestoreCertificateAuthorityRequest 请求对象
     * @return CompletableFuture<RestoreCertificateAuthorityResponse> */
    public CompletableFuture<RestoreCertificateAuthorityResponse> restoreCertificateAuthorityAsync(
        RestoreCertificateAuthorityRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.restoreCertificateAuthority);
    }

    /** 恢复CA 恢复CA
     *
     * @param RestoreCertificateAuthorityRequest 请求对象
     * @return AsyncInvoker<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResponse> */
    public AsyncInvoker<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResponse> restoreCertificateAuthorityAsyncInvoker(
        RestoreCertificateAuthorityRequest request) {
        return new AsyncInvoker<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResponse>(request,
            CcmMeta.restoreCertificateAuthority, hcClient);
    }

    /** 查询CA详情 查询CA详情
     *
     * @param ShowCertificateAuthorityRequest 请求对象
     * @return CompletableFuture<ShowCertificateAuthorityResponse> */
    public CompletableFuture<ShowCertificateAuthorityResponse> showCertificateAuthorityAsync(
        ShowCertificateAuthorityRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.showCertificateAuthority);
    }

    /** 查询CA详情 查询CA详情
     *
     * @param ShowCertificateAuthorityRequest 请求对象
     * @return AsyncInvoker<ShowCertificateAuthorityRequest, ShowCertificateAuthorityResponse> */
    public AsyncInvoker<ShowCertificateAuthorityRequest, ShowCertificateAuthorityResponse> showCertificateAuthorityAsyncInvoker(
        ShowCertificateAuthorityRequest request) {
        return new AsyncInvoker<ShowCertificateAuthorityRequest, ShowCertificateAuthorityResponse>(request,
            CcmMeta.showCertificateAuthority, hcClient);
    }

    /** 获取CA配额 获取CA配额
     *
     * @param ShowCertificateAuthorityQuotaRequest 请求对象
     * @return CompletableFuture<ShowCertificateAuthorityQuotaResponse> */
    public CompletableFuture<ShowCertificateAuthorityQuotaResponse> showCertificateAuthorityQuotaAsync(
        ShowCertificateAuthorityQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.showCertificateAuthorityQuota);
    }

    /** 获取CA配额 获取CA配额
     *
     * @param ShowCertificateAuthorityQuotaRequest 请求对象
     * @return AsyncInvoker<ShowCertificateAuthorityQuotaRequest, ShowCertificateAuthorityQuotaResponse> */
    public AsyncInvoker<ShowCertificateAuthorityQuotaRequest, ShowCertificateAuthorityQuotaResponse> showCertificateAuthorityQuotaAsyncInvoker(
        ShowCertificateAuthorityQuotaRequest request) {
        return new AsyncInvoker<ShowCertificateAuthorityQuotaRequest, ShowCertificateAuthorityQuotaResponse>(request,
            CcmMeta.showCertificateAuthorityQuota, hcClient);
    }

    /** 申请证书 申请证书
     *
     * @param CreateCertificateRequest 请求对象
     * @return CompletableFuture<CreateCertificateResponse> */
    public CompletableFuture<CreateCertificateResponse> createCertificateAsync(CreateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.createCertificate);
    }

    /** 申请证书 申请证书
     *
     * @param CreateCertificateRequest 请求对象
     * @return AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse> */
    public AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateAsyncInvoker(
        CreateCertificateRequest request) {
        return new AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse>(request, CcmMeta.createCertificate,
            hcClient);
    }

    /** 签发CSR 签发CSR
     *
     * @param CreateCertificateByCsrRequest 请求对象
     * @return CompletableFuture<CreateCertificateByCsrResponse> */
    public CompletableFuture<CreateCertificateByCsrResponse> createCertificateByCsrAsync(
        CreateCertificateByCsrRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.createCertificateByCsr);
    }

    /** 签发CSR 签发CSR
     *
     * @param CreateCertificateByCsrRequest 请求对象
     * @return AsyncInvoker<CreateCertificateByCsrRequest, CreateCertificateByCsrResponse> */
    public AsyncInvoker<CreateCertificateByCsrRequest, CreateCertificateByCsrResponse> createCertificateByCsrAsyncInvoker(
        CreateCertificateByCsrRequest request) {
        return new AsyncInvoker<CreateCertificateByCsrRequest, CreateCertificateByCsrResponse>(request,
            CcmMeta.createCertificateByCsr, hcClient);
    }

    /** 删除证书 删除证书
     *
     * @param DeleteCertificateRequest 请求对象
     * @return CompletableFuture<DeleteCertificateResponse> */
    public CompletableFuture<DeleteCertificateResponse> deleteCertificateAsync(DeleteCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.deleteCertificate);
    }

    /** 删除证书 删除证书
     *
     * @param DeleteCertificateRequest 请求对象
     * @return AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> */
    public AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateAsyncInvoker(
        DeleteCertificateRequest request) {
        return new AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request, CcmMeta.deleteCertificate,
            hcClient);
    }

    /** 导出证书 导出证书
     *
     * @param ExportCertificateRequest 请求对象
     * @return CompletableFuture<ExportCertificateResponse> */
    public CompletableFuture<ExportCertificateResponse> exportCertificateAsync(ExportCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.exportCertificate);
    }

    /** 导出证书 导出证书
     *
     * @param ExportCertificateRequest 请求对象
     * @return AsyncInvoker<ExportCertificateRequest, ExportCertificateResponse> */
    public AsyncInvoker<ExportCertificateRequest, ExportCertificateResponse> exportCertificateAsyncInvoker(
        ExportCertificateRequest request) {
        return new AsyncInvoker<ExportCertificateRequest, ExportCertificateResponse>(request, CcmMeta.exportCertificate,
            hcClient);
    }

    /** 查询证书列表 查询证书列表
     *
     * @param ListCertificateRequest 请求对象
     * @return CompletableFuture<ListCertificateResponse> */
    public CompletableFuture<ListCertificateResponse> listCertificateAsync(ListCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.listCertificate);
    }

    /** 查询证书列表 查询证书列表
     *
     * @param ListCertificateRequest 请求对象
     * @return AsyncInvoker<ListCertificateRequest, ListCertificateResponse> */
    public AsyncInvoker<ListCertificateRequest, ListCertificateResponse> listCertificateAsyncInvoker(
        ListCertificateRequest request) {
        return new AsyncInvoker<ListCertificateRequest, ListCertificateResponse>(request, CcmMeta.listCertificate,
            hcClient);
    }

    /** 解析证书 解析证书
     *
     * @param ParseCertificateSigningRequestRequest 请求对象
     * @return CompletableFuture<ParseCertificateSigningRequestResponse> */
    public CompletableFuture<ParseCertificateSigningRequestResponse> parseCertificateSigningRequestAsync(
        ParseCertificateSigningRequestRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.parseCertificateSigningRequest);
    }

    /** 解析证书 解析证书
     *
     * @param ParseCertificateSigningRequestRequest 请求对象
     * @return AsyncInvoker<ParseCertificateSigningRequestRequest, ParseCertificateSigningRequestResponse> */
    public AsyncInvoker<ParseCertificateSigningRequestRequest, ParseCertificateSigningRequestResponse> parseCertificateSigningRequestAsyncInvoker(
        ParseCertificateSigningRequestRequest request) {
        return new AsyncInvoker<ParseCertificateSigningRequestRequest, ParseCertificateSigningRequestResponse>(request,
            CcmMeta.parseCertificateSigningRequest, hcClient);
    }

    /** 吊销证书 吊销证书
     *
     * @param RevokeCertificateRequest 请求对象
     * @return CompletableFuture<RevokeCertificateResponse> */
    public CompletableFuture<RevokeCertificateResponse> revokeCertificateAsync(RevokeCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.revokeCertificate);
    }

    /** 吊销证书 吊销证书
     *
     * @param RevokeCertificateRequest 请求对象
     * @return AsyncInvoker<RevokeCertificateRequest, RevokeCertificateResponse> */
    public AsyncInvoker<RevokeCertificateRequest, RevokeCertificateResponse> revokeCertificateAsyncInvoker(
        RevokeCertificateRequest request) {
        return new AsyncInvoker<RevokeCertificateRequest, RevokeCertificateResponse>(request, CcmMeta.revokeCertificate,
            hcClient);
    }

    /** 查询证书详情 查询证书详情
     *
     * @param ShowCertificateRequest 请求对象
     * @return CompletableFuture<ShowCertificateResponse> */
    public CompletableFuture<ShowCertificateResponse> showCertificateAsync(ShowCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.showCertificate);
    }

    /** 查询证书详情 查询证书详情
     *
     * @param ShowCertificateRequest 请求对象
     * @return AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse> */
    public AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateAsyncInvoker(
        ShowCertificateRequest request) {
        return new AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse>(request, CcmMeta.showCertificate,
            hcClient);
    }

    /** 查询证书配额 查询证书配额
     *
     * @param ShowCertificateQuotaRequest 请求对象
     * @return CompletableFuture<ShowCertificateQuotaResponse> */
    public CompletableFuture<ShowCertificateQuotaResponse> showCertificateQuotaAsync(
        ShowCertificateQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.showCertificateQuota);
    }

    /** 查询证书配额 查询证书配额
     *
     * @param ShowCertificateQuotaRequest 请求对象
     * @return AsyncInvoker<ShowCertificateQuotaRequest, ShowCertificateQuotaResponse> */
    public AsyncInvoker<ShowCertificateQuotaRequest, ShowCertificateQuotaResponse> showCertificateQuotaAsyncInvoker(
        ShowCertificateQuotaRequest request) {
        return new AsyncInvoker<ShowCertificateQuotaRequest, ShowCertificateQuotaResponse>(request,
            CcmMeta.showCertificateQuota, hcClient);
    }

    /** 创建委托 创建委托
     *
     * @param CreateCertificateAuthorityObsAgencyRequest 请求对象
     * @return CompletableFuture<CreateCertificateAuthorityObsAgencyResponse> */
    public CompletableFuture<CreateCertificateAuthorityObsAgencyResponse> createCertificateAuthorityObsAgencyAsync(
        CreateCertificateAuthorityObsAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.createCertificateAuthorityObsAgency);
    }

    /** 创建委托 创建委托
     *
     * @param CreateCertificateAuthorityObsAgencyRequest 请求对象
     * @return AsyncInvoker<CreateCertificateAuthorityObsAgencyRequest, CreateCertificateAuthorityObsAgencyResponse> */
    public AsyncInvoker<CreateCertificateAuthorityObsAgencyRequest, CreateCertificateAuthorityObsAgencyResponse> createCertificateAuthorityObsAgencyAsyncInvoker(
        CreateCertificateAuthorityObsAgencyRequest request) {
        return new AsyncInvoker<CreateCertificateAuthorityObsAgencyRequest, CreateCertificateAuthorityObsAgencyResponse>(
            request, CcmMeta.createCertificateAuthorityObsAgency, hcClient);
    }

    /** 查询OBS桶列表 查询OBS桶列表
     *
     * @param ListCertificateAuthorityObsBucketRequest 请求对象
     * @return CompletableFuture<ListCertificateAuthorityObsBucketResponse> */
    public CompletableFuture<ListCertificateAuthorityObsBucketResponse> listCertificateAuthorityObsBucketAsync(
        ListCertificateAuthorityObsBucketRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.listCertificateAuthorityObsBucket);
    }

    /** 查询OBS桶列表 查询OBS桶列表
     *
     * @param ListCertificateAuthorityObsBucketRequest 请求对象
     * @return AsyncInvoker<ListCertificateAuthorityObsBucketRequest, ListCertificateAuthorityObsBucketResponse> */
    public AsyncInvoker<ListCertificateAuthorityObsBucketRequest, ListCertificateAuthorityObsBucketResponse> listCertificateAuthorityObsBucketAsyncInvoker(
        ListCertificateAuthorityObsBucketRequest request) {
        return new AsyncInvoker<ListCertificateAuthorityObsBucketRequest, ListCertificateAuthorityObsBucketResponse>(
            request, CcmMeta.listCertificateAuthorityObsBucket, hcClient);
    }

    /** 查看是否具有委托权限 查看是否具有委托权限
     *
     * @param ShowCertificateAuthorityObsAgencyRequest 请求对象
     * @return CompletableFuture<ShowCertificateAuthorityObsAgencyResponse> */
    public CompletableFuture<ShowCertificateAuthorityObsAgencyResponse> showCertificateAuthorityObsAgencyAsync(
        ShowCertificateAuthorityObsAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.showCertificateAuthorityObsAgency);
    }

    /** 查看是否具有委托权限 查看是否具有委托权限
     *
     * @param ShowCertificateAuthorityObsAgencyRequest 请求对象
     * @return AsyncInvoker<ShowCertificateAuthorityObsAgencyRequest, ShowCertificateAuthorityObsAgencyResponse> */
    public AsyncInvoker<ShowCertificateAuthorityObsAgencyRequest, ShowCertificateAuthorityObsAgencyResponse> showCertificateAuthorityObsAgencyAsyncInvoker(
        ShowCertificateAuthorityObsAgencyRequest request) {
        return new AsyncInvoker<ShowCertificateAuthorityObsAgencyRequest, ShowCertificateAuthorityObsAgencyResponse>(
            request, CcmMeta.showCertificateAuthorityObsAgency, hcClient);
    }

}
