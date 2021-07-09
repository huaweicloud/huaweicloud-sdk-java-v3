package com.huaweicloud.sdk.ccm.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.ccm.v1.model.*;

public class CcmClient {
    protected HcClient hcClient;

    public CcmClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CcmClient> newBuilder() {
        return new ClientBuilder<>(CcmClient::new, "GlobalCredentials");
    }


    /**
     * 创建CA
     * 创建CA
     *
     * @param CreateCertificateAuthorityRequest 请求对象
     * @return CreateCertificateAuthorityResponse
     */
    public CreateCertificateAuthorityResponse createCertificateAuthority(CreateCertificateAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.createCertificateAuthority);
    }

    /**
     * 创建CA
     * 创建CA
     *
     * @param CreateCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse>
     */
    public SyncInvoker<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse> createCertificateAuthorityInvoker(CreateCertificateAuthorityRequest request) {
        return new SyncInvoker<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse>(request, CcmMeta.createCertificateAuthority, hcClient);
    }

    /**
     * 删除CA
     * 删除CA
     *
     * @param DeleteCertificateAuthorityRequest 请求对象
     * @return DeleteCertificateAuthorityResponse
     */
    public DeleteCertificateAuthorityResponse deleteCertificateAuthority(DeleteCertificateAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.deleteCertificateAuthority);
    }

    /**
     * 删除CA
     * 删除CA
     *
     * @param DeleteCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResponse>
     */
    public SyncInvoker<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResponse> deleteCertificateAuthorityInvoker(DeleteCertificateAuthorityRequest request) {
        return new SyncInvoker<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResponse>(request, CcmMeta.deleteCertificateAuthority, hcClient);
    }

    /**
     * 禁用CA
     * 禁用CA
     *
     * @param DisableCertificateAuthorityRequest 请求对象
     * @return DisableCertificateAuthorityResponse
     */
    public DisableCertificateAuthorityResponse disableCertificateAuthority(DisableCertificateAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.disableCertificateAuthority);
    }

    /**
     * 禁用CA
     * 禁用CA
     *
     * @param DisableCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<DisableCertificateAuthorityRequest, DisableCertificateAuthorityResponse>
     */
    public SyncInvoker<DisableCertificateAuthorityRequest, DisableCertificateAuthorityResponse> disableCertificateAuthorityInvoker(DisableCertificateAuthorityRequest request) {
        return new SyncInvoker<DisableCertificateAuthorityRequest, DisableCertificateAuthorityResponse>(request, CcmMeta.disableCertificateAuthority, hcClient);
    }

    /**
     * 启用CA
     * 启用CA
     *
     * @param EnableCertificateAuthorityRequest 请求对象
     * @return EnableCertificateAuthorityResponse
     */
    public EnableCertificateAuthorityResponse enableCertificateAuthority(EnableCertificateAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.enableCertificateAuthority);
    }

    /**
     * 启用CA
     * 启用CA
     *
     * @param EnableCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<EnableCertificateAuthorityRequest, EnableCertificateAuthorityResponse>
     */
    public SyncInvoker<EnableCertificateAuthorityRequest, EnableCertificateAuthorityResponse> enableCertificateAuthorityInvoker(EnableCertificateAuthorityRequest request) {
        return new SyncInvoker<EnableCertificateAuthorityRequest, EnableCertificateAuthorityResponse>(request, CcmMeta.enableCertificateAuthority, hcClient);
    }

    /**
     * 导出CA证书
     * 导出CA证书
     *
     * @param ExportCertificateAuthorityCertificateRequest 请求对象
     * @return ExportCertificateAuthorityCertificateResponse
     */
    public ExportCertificateAuthorityCertificateResponse exportCertificateAuthorityCertificate(ExportCertificateAuthorityCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.exportCertificateAuthorityCertificate);
    }

    /**
     * 导出CA证书
     * 导出CA证书
     *
     * @param ExportCertificateAuthorityCertificateRequest 请求对象
     * @return SyncInvoker<ExportCertificateAuthorityCertificateRequest, ExportCertificateAuthorityCertificateResponse>
     */
    public SyncInvoker<ExportCertificateAuthorityCertificateRequest, ExportCertificateAuthorityCertificateResponse> exportCertificateAuthorityCertificateInvoker(ExportCertificateAuthorityCertificateRequest request) {
        return new SyncInvoker<ExportCertificateAuthorityCertificateRequest, ExportCertificateAuthorityCertificateResponse>(request, CcmMeta.exportCertificateAuthorityCertificate, hcClient);
    }

    /**
     * 导出CA的证书签名请求
     * 导出CA的证书签名请求
     *
     * @param ExportCertificateAuthorityCsrRequest 请求对象
     * @return ExportCertificateAuthorityCsrResponse
     */
    public ExportCertificateAuthorityCsrResponse exportCertificateAuthorityCsr(ExportCertificateAuthorityCsrRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.exportCertificateAuthorityCsr);
    }

    /**
     * 导出CA的证书签名请求
     * 导出CA的证书签名请求
     *
     * @param ExportCertificateAuthorityCsrRequest 请求对象
     * @return SyncInvoker<ExportCertificateAuthorityCsrRequest, ExportCertificateAuthorityCsrResponse>
     */
    public SyncInvoker<ExportCertificateAuthorityCsrRequest, ExportCertificateAuthorityCsrResponse> exportCertificateAuthorityCsrInvoker(ExportCertificateAuthorityCsrRequest request) {
        return new SyncInvoker<ExportCertificateAuthorityCsrRequest, ExportCertificateAuthorityCsrResponse>(request, CcmMeta.exportCertificateAuthorityCsr, hcClient);
    }

    /**
     * 导入CA证书
     * 导入CA证书
     *
     * @param ImportCertificateAuthorityCertificateRequest 请求对象
     * @return ImportCertificateAuthorityCertificateResponse
     */
    public ImportCertificateAuthorityCertificateResponse importCertificateAuthorityCertificate(ImportCertificateAuthorityCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.importCertificateAuthorityCertificate);
    }

    /**
     * 导入CA证书
     * 导入CA证书
     *
     * @param ImportCertificateAuthorityCertificateRequest 请求对象
     * @return SyncInvoker<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResponse>
     */
    public SyncInvoker<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResponse> importCertificateAuthorityCertificateInvoker(ImportCertificateAuthorityCertificateRequest request) {
        return new SyncInvoker<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResponse>(request, CcmMeta.importCertificateAuthorityCertificate, hcClient);
    }

    /**
     * 激活CA
     * 激活CA
     *
     * @param IssueCertificateAuthorityCertificateRequest 请求对象
     * @return IssueCertificateAuthorityCertificateResponse
     */
    public IssueCertificateAuthorityCertificateResponse issueCertificateAuthorityCertificate(IssueCertificateAuthorityCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.issueCertificateAuthorityCertificate);
    }

    /**
     * 激活CA
     * 激活CA
     *
     * @param IssueCertificateAuthorityCertificateRequest 请求对象
     * @return SyncInvoker<IssueCertificateAuthorityCertificateRequest, IssueCertificateAuthorityCertificateResponse>
     */
    public SyncInvoker<IssueCertificateAuthorityCertificateRequest, IssueCertificateAuthorityCertificateResponse> issueCertificateAuthorityCertificateInvoker(IssueCertificateAuthorityCertificateRequest request) {
        return new SyncInvoker<IssueCertificateAuthorityCertificateRequest, IssueCertificateAuthorityCertificateResponse>(request, CcmMeta.issueCertificateAuthorityCertificate, hcClient);
    }

    /**
     * 查询CA列表
     * 查询CA列表
     *
     * @param ListCertificateAuthorityRequest 请求对象
     * @return ListCertificateAuthorityResponse
     */
    public ListCertificateAuthorityResponse listCertificateAuthority(ListCertificateAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.listCertificateAuthority);
    }

    /**
     * 查询CA列表
     * 查询CA列表
     *
     * @param ListCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<ListCertificateAuthorityRequest, ListCertificateAuthorityResponse>
     */
    public SyncInvoker<ListCertificateAuthorityRequest, ListCertificateAuthorityResponse> listCertificateAuthorityInvoker(ListCertificateAuthorityRequest request) {
        return new SyncInvoker<ListCertificateAuthorityRequest, ListCertificateAuthorityResponse>(request, CcmMeta.listCertificateAuthority, hcClient);
    }

    /**
     * 恢复CA
     * 恢复CA
     *
     * @param RestoreCertificateAuthorityRequest 请求对象
     * @return RestoreCertificateAuthorityResponse
     */
    public RestoreCertificateAuthorityResponse restoreCertificateAuthority(RestoreCertificateAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.restoreCertificateAuthority);
    }

    /**
     * 恢复CA
     * 恢复CA
     *
     * @param RestoreCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResponse>
     */
    public SyncInvoker<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResponse> restoreCertificateAuthorityInvoker(RestoreCertificateAuthorityRequest request) {
        return new SyncInvoker<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResponse>(request, CcmMeta.restoreCertificateAuthority, hcClient);
    }

    /**
     * 查询CA详情
     * 查询CA详情
     *
     * @param ShowCertificateAuthorityRequest 请求对象
     * @return ShowCertificateAuthorityResponse
     */
    public ShowCertificateAuthorityResponse showCertificateAuthority(ShowCertificateAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.showCertificateAuthority);
    }

    /**
     * 查询CA详情
     * 查询CA详情
     *
     * @param ShowCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<ShowCertificateAuthorityRequest, ShowCertificateAuthorityResponse>
     */
    public SyncInvoker<ShowCertificateAuthorityRequest, ShowCertificateAuthorityResponse> showCertificateAuthorityInvoker(ShowCertificateAuthorityRequest request) {
        return new SyncInvoker<ShowCertificateAuthorityRequest, ShowCertificateAuthorityResponse>(request, CcmMeta.showCertificateAuthority, hcClient);
    }

    /**
     * 获取CA配额
     * 获取CA配额
     *
     * @param ShowCertificateAuthorityQuotaRequest 请求对象
     * @return ShowCertificateAuthorityQuotaResponse
     */
    public ShowCertificateAuthorityQuotaResponse showCertificateAuthorityQuota(ShowCertificateAuthorityQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.showCertificateAuthorityQuota);
    }

    /**
     * 获取CA配额
     * 获取CA配额
     *
     * @param ShowCertificateAuthorityQuotaRequest 请求对象
     * @return SyncInvoker<ShowCertificateAuthorityQuotaRequest, ShowCertificateAuthorityQuotaResponse>
     */
    public SyncInvoker<ShowCertificateAuthorityQuotaRequest, ShowCertificateAuthorityQuotaResponse> showCertificateAuthorityQuotaInvoker(ShowCertificateAuthorityQuotaRequest request) {
        return new SyncInvoker<ShowCertificateAuthorityQuotaRequest, ShowCertificateAuthorityQuotaResponse>(request, CcmMeta.showCertificateAuthorityQuota, hcClient);
    }

    /**
     * 申请证书
     * 申请证书
     *
     * @param CreateCertificateRequest 请求对象
     * @return CreateCertificateResponse
     */
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.createCertificate);
    }

    /**
     * 申请证书
     * 申请证书
     *
     * @param CreateCertificateRequest 请求对象
     * @return SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public SyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateInvoker(CreateCertificateRequest request) {
        return new SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>(request, CcmMeta.createCertificate, hcClient);
    }

    /**
     * 签发CSR
     * 签发CSR
     *
     * @param CreateCertificateByCsrRequest 请求对象
     * @return CreateCertificateByCsrResponse
     */
    public CreateCertificateByCsrResponse createCertificateByCsr(CreateCertificateByCsrRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.createCertificateByCsr);
    }

    /**
     * 签发CSR
     * 签发CSR
     *
     * @param CreateCertificateByCsrRequest 请求对象
     * @return SyncInvoker<CreateCertificateByCsrRequest, CreateCertificateByCsrResponse>
     */
    public SyncInvoker<CreateCertificateByCsrRequest, CreateCertificateByCsrResponse> createCertificateByCsrInvoker(CreateCertificateByCsrRequest request) {
        return new SyncInvoker<CreateCertificateByCsrRequest, CreateCertificateByCsrResponse>(request, CcmMeta.createCertificateByCsr, hcClient);
    }

    /**
     * 删除证书
     * 删除证书
     *
     * @param DeleteCertificateRequest 请求对象
     * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.deleteCertificate);
    }

    /**
     * 删除证书
     * 删除证书
     *
     * @param DeleteCertificateRequest 请求对象
     * @return SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateInvoker(DeleteCertificateRequest request) {
        return new SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request, CcmMeta.deleteCertificate, hcClient);
    }

    /**
     * 导出证书
     * 导出证书
     *
     * @param ExportCertificateRequest 请求对象
     * @return ExportCertificateResponse
     */
    public ExportCertificateResponse exportCertificate(ExportCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.exportCertificate);
    }

    /**
     * 导出证书
     * 导出证书
     *
     * @param ExportCertificateRequest 请求对象
     * @return SyncInvoker<ExportCertificateRequest, ExportCertificateResponse>
     */
    public SyncInvoker<ExportCertificateRequest, ExportCertificateResponse> exportCertificateInvoker(ExportCertificateRequest request) {
        return new SyncInvoker<ExportCertificateRequest, ExportCertificateResponse>(request, CcmMeta.exportCertificate, hcClient);
    }

    /**
     * 查询证书列表
     * 查询证书列表
     *
     * @param ListCertificateRequest 请求对象
     * @return ListCertificateResponse
     */
    public ListCertificateResponse listCertificate(ListCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.listCertificate);
    }

    /**
     * 查询证书列表
     * 查询证书列表
     *
     * @param ListCertificateRequest 请求对象
     * @return SyncInvoker<ListCertificateRequest, ListCertificateResponse>
     */
    public SyncInvoker<ListCertificateRequest, ListCertificateResponse> listCertificateInvoker(ListCertificateRequest request) {
        return new SyncInvoker<ListCertificateRequest, ListCertificateResponse>(request, CcmMeta.listCertificate, hcClient);
    }

    /**
     * 解析证书
     * 解析证书
     *
     * @param ParseCertificateSigningRequestRequest 请求对象
     * @return ParseCertificateSigningRequestResponse
     */
    public ParseCertificateSigningRequestResponse parseCertificateSigningRequest(ParseCertificateSigningRequestRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.parseCertificateSigningRequest);
    }

    /**
     * 解析证书
     * 解析证书
     *
     * @param ParseCertificateSigningRequestRequest 请求对象
     * @return SyncInvoker<ParseCertificateSigningRequestRequest, ParseCertificateSigningRequestResponse>
     */
    public SyncInvoker<ParseCertificateSigningRequestRequest, ParseCertificateSigningRequestResponse> parseCertificateSigningRequestInvoker(ParseCertificateSigningRequestRequest request) {
        return new SyncInvoker<ParseCertificateSigningRequestRequest, ParseCertificateSigningRequestResponse>(request, CcmMeta.parseCertificateSigningRequest, hcClient);
    }

    /**
     * 吊销证书
     * 吊销证书
     *
     * @param RevokeCertificateRequest 请求对象
     * @return RevokeCertificateResponse
     */
    public RevokeCertificateResponse revokeCertificate(RevokeCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.revokeCertificate);
    }

    /**
     * 吊销证书
     * 吊销证书
     *
     * @param RevokeCertificateRequest 请求对象
     * @return SyncInvoker<RevokeCertificateRequest, RevokeCertificateResponse>
     */
    public SyncInvoker<RevokeCertificateRequest, RevokeCertificateResponse> revokeCertificateInvoker(RevokeCertificateRequest request) {
        return new SyncInvoker<RevokeCertificateRequest, RevokeCertificateResponse>(request, CcmMeta.revokeCertificate, hcClient);
    }

    /**
     * 查询证书详情
     * 查询证书详情
     *
     * @param ShowCertificateRequest 请求对象
     * @return ShowCertificateResponse
     */
    public ShowCertificateResponse showCertificate(ShowCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.showCertificate);
    }

    /**
     * 查询证书详情
     * 查询证书详情
     *
     * @param ShowCertificateRequest 请求对象
     * @return SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public SyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateInvoker(ShowCertificateRequest request) {
        return new SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>(request, CcmMeta.showCertificate, hcClient);
    }

    /**
     * 查询证书配额
     * 查询证书配额
     *
     * @param ShowCertificateQuotaRequest 请求对象
     * @return ShowCertificateQuotaResponse
     */
    public ShowCertificateQuotaResponse showCertificateQuota(ShowCertificateQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.showCertificateQuota);
    }

    /**
     * 查询证书配额
     * 查询证书配额
     *
     * @param ShowCertificateQuotaRequest 请求对象
     * @return SyncInvoker<ShowCertificateQuotaRequest, ShowCertificateQuotaResponse>
     */
    public SyncInvoker<ShowCertificateQuotaRequest, ShowCertificateQuotaResponse> showCertificateQuotaInvoker(ShowCertificateQuotaRequest request) {
        return new SyncInvoker<ShowCertificateQuotaRequest, ShowCertificateQuotaResponse>(request, CcmMeta.showCertificateQuota, hcClient);
    }

    /**
     * 创建委托
     * 创建委托
     *
     * @param CreateCertificateAuthorityObsAgencyRequest 请求对象
     * @return CreateCertificateAuthorityObsAgencyResponse
     */
    public CreateCertificateAuthorityObsAgencyResponse createCertificateAuthorityObsAgency(CreateCertificateAuthorityObsAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.createCertificateAuthorityObsAgency);
    }

    /**
     * 创建委托
     * 创建委托
     *
     * @param CreateCertificateAuthorityObsAgencyRequest 请求对象
     * @return SyncInvoker<CreateCertificateAuthorityObsAgencyRequest, CreateCertificateAuthorityObsAgencyResponse>
     */
    public SyncInvoker<CreateCertificateAuthorityObsAgencyRequest, CreateCertificateAuthorityObsAgencyResponse> createCertificateAuthorityObsAgencyInvoker(CreateCertificateAuthorityObsAgencyRequest request) {
        return new SyncInvoker<CreateCertificateAuthorityObsAgencyRequest, CreateCertificateAuthorityObsAgencyResponse>(request, CcmMeta.createCertificateAuthorityObsAgency, hcClient);
    }

    /**
     * 查询OBS桶列表
     * 查询OBS桶列表
     *
     * @param ListCertificateAuthorityObsBucketRequest 请求对象
     * @return ListCertificateAuthorityObsBucketResponse
     */
    public ListCertificateAuthorityObsBucketResponse listCertificateAuthorityObsBucket(ListCertificateAuthorityObsBucketRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.listCertificateAuthorityObsBucket);
    }

    /**
     * 查询OBS桶列表
     * 查询OBS桶列表
     *
     * @param ListCertificateAuthorityObsBucketRequest 请求对象
     * @return SyncInvoker<ListCertificateAuthorityObsBucketRequest, ListCertificateAuthorityObsBucketResponse>
     */
    public SyncInvoker<ListCertificateAuthorityObsBucketRequest, ListCertificateAuthorityObsBucketResponse> listCertificateAuthorityObsBucketInvoker(ListCertificateAuthorityObsBucketRequest request) {
        return new SyncInvoker<ListCertificateAuthorityObsBucketRequest, ListCertificateAuthorityObsBucketResponse>(request, CcmMeta.listCertificateAuthorityObsBucket, hcClient);
    }

    /**
     * 查看是否具有委托权限
     * 查看是否具有委托权限
     *
     * @param ShowCertificateAuthorityObsAgencyRequest 请求对象
     * @return ShowCertificateAuthorityObsAgencyResponse
     */
    public ShowCertificateAuthorityObsAgencyResponse showCertificateAuthorityObsAgency(ShowCertificateAuthorityObsAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.showCertificateAuthorityObsAgency);
    }

    /**
     * 查看是否具有委托权限
     * 查看是否具有委托权限
     *
     * @param ShowCertificateAuthorityObsAgencyRequest 请求对象
     * @return SyncInvoker<ShowCertificateAuthorityObsAgencyRequest, ShowCertificateAuthorityObsAgencyResponse>
     */
    public SyncInvoker<ShowCertificateAuthorityObsAgencyRequest, ShowCertificateAuthorityObsAgencyResponse> showCertificateAuthorityObsAgencyInvoker(ShowCertificateAuthorityObsAgencyRequest request) {
        return new SyncInvoker<ShowCertificateAuthorityObsAgencyRequest, ShowCertificateAuthorityObsAgencyResponse>(request, CcmMeta.showCertificateAuthorityObsAgency, hcClient);
    }

}