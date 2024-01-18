package com.huaweicloud.sdk.ccm.v1;

import com.huaweicloud.sdk.ccm.v1.model.BatchCreateCaTagsRequest;
import com.huaweicloud.sdk.ccm.v1.model.BatchCreateCaTagsResponse;
import com.huaweicloud.sdk.ccm.v1.model.BatchCreateCertTagsRequest;
import com.huaweicloud.sdk.ccm.v1.model.BatchCreateCertTagsResponse;
import com.huaweicloud.sdk.ccm.v1.model.BatchDeleteCaTagsRequest;
import com.huaweicloud.sdk.ccm.v1.model.BatchDeleteCaTagsResponse;
import com.huaweicloud.sdk.ccm.v1.model.BatchDeleteCertTagsRequest;
import com.huaweicloud.sdk.ccm.v1.model.BatchDeleteCertTagsResponse;
import com.huaweicloud.sdk.ccm.v1.model.CountCaResourceInstancesRequest;
import com.huaweicloud.sdk.ccm.v1.model.CountCaResourceInstancesResponse;
import com.huaweicloud.sdk.ccm.v1.model.CountCertResourceInstancesRequest;
import com.huaweicloud.sdk.ccm.v1.model.CountCertResourceInstancesResponse;
import com.huaweicloud.sdk.ccm.v1.model.CreateCaTagRequest;
import com.huaweicloud.sdk.ccm.v1.model.CreateCaTagResponse;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertTagRequest;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertTagResponse;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateAuthorityObsAgencyRequest;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateAuthorityObsAgencyResponse;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateAuthorityOrderRequest;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateAuthorityOrderResponse;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateAuthorityRequest;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateAuthorityResponse;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateByCsrRequest;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateByCsrResponse;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateRequest;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateResponse;
import com.huaweicloud.sdk.ccm.v1.model.DeleteCertificateAuthorityRequest;
import com.huaweicloud.sdk.ccm.v1.model.DeleteCertificateAuthorityResponse;
import com.huaweicloud.sdk.ccm.v1.model.DeleteCertificateRequest;
import com.huaweicloud.sdk.ccm.v1.model.DeleteCertificateResponse;
import com.huaweicloud.sdk.ccm.v1.model.DisableCertificateAuthorityCrlRequest;
import com.huaweicloud.sdk.ccm.v1.model.DisableCertificateAuthorityCrlResponse;
import com.huaweicloud.sdk.ccm.v1.model.DisableCertificateAuthorityRequest;
import com.huaweicloud.sdk.ccm.v1.model.DisableCertificateAuthorityResponse;
import com.huaweicloud.sdk.ccm.v1.model.EnableCertificateAuthorityCrlRequest;
import com.huaweicloud.sdk.ccm.v1.model.EnableCertificateAuthorityCrlResponse;
import com.huaweicloud.sdk.ccm.v1.model.EnableCertificateAuthorityRequest;
import com.huaweicloud.sdk.ccm.v1.model.EnableCertificateAuthorityResponse;
import com.huaweicloud.sdk.ccm.v1.model.ExportCertificateAuthorityCertificateRequest;
import com.huaweicloud.sdk.ccm.v1.model.ExportCertificateAuthorityCertificateResponse;
import com.huaweicloud.sdk.ccm.v1.model.ExportCertificateAuthorityCsrRequest;
import com.huaweicloud.sdk.ccm.v1.model.ExportCertificateAuthorityCsrResponse;
import com.huaweicloud.sdk.ccm.v1.model.ExportCertificateRequest;
import com.huaweicloud.sdk.ccm.v1.model.ExportCertificateResponse;
import com.huaweicloud.sdk.ccm.v1.model.ImportCertificateAuthorityCertificateRequest;
import com.huaweicloud.sdk.ccm.v1.model.ImportCertificateAuthorityCertificateResponse;
import com.huaweicloud.sdk.ccm.v1.model.IssueCertificateAuthorityCertificateRequest;
import com.huaweicloud.sdk.ccm.v1.model.IssueCertificateAuthorityCertificateResponse;
import com.huaweicloud.sdk.ccm.v1.model.ListCaResourceInstancesRequest;
import com.huaweicloud.sdk.ccm.v1.model.ListCaResourceInstancesResponse;
import com.huaweicloud.sdk.ccm.v1.model.ListCaTagsRequest;
import com.huaweicloud.sdk.ccm.v1.model.ListCaTagsResponse;
import com.huaweicloud.sdk.ccm.v1.model.ListCertResourceInstancesRequest;
import com.huaweicloud.sdk.ccm.v1.model.ListCertResourceInstancesResponse;
import com.huaweicloud.sdk.ccm.v1.model.ListCertTagsRequest;
import com.huaweicloud.sdk.ccm.v1.model.ListCertTagsResponse;
import com.huaweicloud.sdk.ccm.v1.model.ListCertificateAuthorityObsBucketRequest;
import com.huaweicloud.sdk.ccm.v1.model.ListCertificateAuthorityObsBucketResponse;
import com.huaweicloud.sdk.ccm.v1.model.ListCertificateAuthorityRequest;
import com.huaweicloud.sdk.ccm.v1.model.ListCertificateAuthorityResponse;
import com.huaweicloud.sdk.ccm.v1.model.ListCertificateRequest;
import com.huaweicloud.sdk.ccm.v1.model.ListCertificateResponse;
import com.huaweicloud.sdk.ccm.v1.model.ListDomainCaTagsRequest;
import com.huaweicloud.sdk.ccm.v1.model.ListDomainCaTagsResponse;
import com.huaweicloud.sdk.ccm.v1.model.ListDomainCertTagsRequest;
import com.huaweicloud.sdk.ccm.v1.model.ListDomainCertTagsResponse;
import com.huaweicloud.sdk.ccm.v1.model.ParseCertificateSigningRequestRequest;
import com.huaweicloud.sdk.ccm.v1.model.ParseCertificateSigningRequestResponse;
import com.huaweicloud.sdk.ccm.v1.model.RestoreCertificateAuthorityRequest;
import com.huaweicloud.sdk.ccm.v1.model.RestoreCertificateAuthorityResponse;
import com.huaweicloud.sdk.ccm.v1.model.RevokeCertificateAuthorityRequest;
import com.huaweicloud.sdk.ccm.v1.model.RevokeCertificateAuthorityResponse;
import com.huaweicloud.sdk.ccm.v1.model.RevokeCertificateRequest;
import com.huaweicloud.sdk.ccm.v1.model.RevokeCertificateResponse;
import com.huaweicloud.sdk.ccm.v1.model.ShowCertificateAuthorityObsAgencyRequest;
import com.huaweicloud.sdk.ccm.v1.model.ShowCertificateAuthorityObsAgencyResponse;
import com.huaweicloud.sdk.ccm.v1.model.ShowCertificateAuthorityQuotaRequest;
import com.huaweicloud.sdk.ccm.v1.model.ShowCertificateAuthorityQuotaResponse;
import com.huaweicloud.sdk.ccm.v1.model.ShowCertificateAuthorityRequest;
import com.huaweicloud.sdk.ccm.v1.model.ShowCertificateAuthorityResponse;
import com.huaweicloud.sdk.ccm.v1.model.ShowCertificateQuotaRequest;
import com.huaweicloud.sdk.ccm.v1.model.ShowCertificateQuotaResponse;
import com.huaweicloud.sdk.ccm.v1.model.ShowCertificateRequest;
import com.huaweicloud.sdk.ccm.v1.model.ShowCertificateResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CcmClient {

    protected HcClient hcClient;

    public CcmClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CcmClient> newBuilder() {
        ClientBuilder<CcmClient> clientBuilder = new ClientBuilder<>(CcmClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 批量创建CA标签
     *
     * 批量创建CA标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateCaTagsRequest 请求对象
     * @return BatchCreateCaTagsResponse
     */
    public BatchCreateCaTagsResponse batchCreateCaTags(BatchCreateCaTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.batchCreateCaTags);
    }

    /**
     * 批量创建CA标签
     *
     * 批量创建CA标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateCaTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateCaTagsRequest, BatchCreateCaTagsResponse>
     */
    public SyncInvoker<BatchCreateCaTagsRequest, BatchCreateCaTagsResponse> batchCreateCaTagsInvoker(
        BatchCreateCaTagsRequest request) {
        return new SyncInvoker<>(request, CcmMeta.batchCreateCaTags, hcClient);
    }

    /**
     * 批量创建证书标签
     *
     * 批量创建证书标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateCertTagsRequest 请求对象
     * @return BatchCreateCertTagsResponse
     */
    public BatchCreateCertTagsResponse batchCreateCertTags(BatchCreateCertTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.batchCreateCertTags);
    }

    /**
     * 批量创建证书标签
     *
     * 批量创建证书标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateCertTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateCertTagsRequest, BatchCreateCertTagsResponse>
     */
    public SyncInvoker<BatchCreateCertTagsRequest, BatchCreateCertTagsResponse> batchCreateCertTagsInvoker(
        BatchCreateCertTagsRequest request) {
        return new SyncInvoker<>(request, CcmMeta.batchCreateCertTags, hcClient);
    }

    /**
     * 批量删除CA标签
     *
     * 批量删除CA标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteCaTagsRequest 请求对象
     * @return BatchDeleteCaTagsResponse
     */
    public BatchDeleteCaTagsResponse batchDeleteCaTags(BatchDeleteCaTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.batchDeleteCaTags);
    }

    /**
     * 批量删除CA标签
     *
     * 批量删除CA标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteCaTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteCaTagsRequest, BatchDeleteCaTagsResponse>
     */
    public SyncInvoker<BatchDeleteCaTagsRequest, BatchDeleteCaTagsResponse> batchDeleteCaTagsInvoker(
        BatchDeleteCaTagsRequest request) {
        return new SyncInvoker<>(request, CcmMeta.batchDeleteCaTags, hcClient);
    }

    /**
     * 批量删除证书标签
     *
     * 批量删除证书标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteCertTagsRequest 请求对象
     * @return BatchDeleteCertTagsResponse
     */
    public BatchDeleteCertTagsResponse batchDeleteCertTags(BatchDeleteCertTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.batchDeleteCertTags);
    }

    /**
     * 批量删除证书标签
     *
     * 批量删除证书标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteCertTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteCertTagsRequest, BatchDeleteCertTagsResponse>
     */
    public SyncInvoker<BatchDeleteCertTagsRequest, BatchDeleteCertTagsResponse> batchDeleteCertTagsInvoker(
        BatchDeleteCertTagsRequest request) {
        return new SyncInvoker<>(request, CcmMeta.batchDeleteCertTags, hcClient);
    }

    /**
     * 根据标签查询CA数量
     *
     * 根据标签查询CA数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountCaResourceInstancesRequest 请求对象
     * @return CountCaResourceInstancesResponse
     */
    public CountCaResourceInstancesResponse countCaResourceInstances(CountCaResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.countCaResourceInstances);
    }

    /**
     * 根据标签查询CA数量
     *
     * 根据标签查询CA数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountCaResourceInstancesRequest 请求对象
     * @return SyncInvoker<CountCaResourceInstancesRequest, CountCaResourceInstancesResponse>
     */
    public SyncInvoker<CountCaResourceInstancesRequest, CountCaResourceInstancesResponse> countCaResourceInstancesInvoker(
        CountCaResourceInstancesRequest request) {
        return new SyncInvoker<>(request, CcmMeta.countCaResourceInstances, hcClient);
    }

    /**
     * 根据标签查询证书数量
     *
     * 根据标签查询证书数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountCertResourceInstancesRequest 请求对象
     * @return CountCertResourceInstancesResponse
     */
    public CountCertResourceInstancesResponse countCertResourceInstances(CountCertResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.countCertResourceInstances);
    }

    /**
     * 根据标签查询证书数量
     *
     * 根据标签查询证书数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountCertResourceInstancesRequest 请求对象
     * @return SyncInvoker<CountCertResourceInstancesRequest, CountCertResourceInstancesResponse>
     */
    public SyncInvoker<CountCertResourceInstancesRequest, CountCertResourceInstancesResponse> countCertResourceInstancesInvoker(
        CountCertResourceInstancesRequest request) {
        return new SyncInvoker<>(request, CcmMeta.countCertResourceInstances, hcClient);
    }

    /**
     * 创建CA标签
     *
     * 创建CA标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCaTagRequest 请求对象
     * @return CreateCaTagResponse
     */
    public CreateCaTagResponse createCaTag(CreateCaTagRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.createCaTag);
    }

    /**
     * 创建CA标签
     *
     * 创建CA标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCaTagRequest 请求对象
     * @return SyncInvoker<CreateCaTagRequest, CreateCaTagResponse>
     */
    public SyncInvoker<CreateCaTagRequest, CreateCaTagResponse> createCaTagInvoker(CreateCaTagRequest request) {
        return new SyncInvoker<>(request, CcmMeta.createCaTag, hcClient);
    }

    /**
     * 创建证书标签
     *
     * 创建证书标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertTagRequest 请求对象
     * @return CreateCertTagResponse
     */
    public CreateCertTagResponse createCertTag(CreateCertTagRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.createCertTag);
    }

    /**
     * 创建证书标签
     *
     * 创建证书标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertTagRequest 请求对象
     * @return SyncInvoker<CreateCertTagRequest, CreateCertTagResponse>
     */
    public SyncInvoker<CreateCertTagRequest, CreateCertTagResponse> createCertTagInvoker(CreateCertTagRequest request) {
        return new SyncInvoker<>(request, CcmMeta.createCertTag, hcClient);
    }

    /**
     * 申请证书
     *
     * 申请证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateRequest 请求对象
     * @return CreateCertificateResponse
     */
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.createCertificate);
    }

    /**
     * 申请证书
     *
     * 申请证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateRequest 请求对象
     * @return SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public SyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateInvoker(
        CreateCertificateRequest request) {
        return new SyncInvoker<>(request, CcmMeta.createCertificate, hcClient);
    }

    /**
     * 创建委托
     *
     * 用户给PCA创建OBS委托授权，用于访问OBS桶，更新吊销列表。
     * &gt; 用户所使用账号token需要具备安全管理员（secu_admin）权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateAuthorityObsAgencyRequest 请求对象
     * @return CreateCertificateAuthorityObsAgencyResponse
     */
    public CreateCertificateAuthorityObsAgencyResponse createCertificateAuthorityObsAgency(
        CreateCertificateAuthorityObsAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.createCertificateAuthorityObsAgency);
    }

    /**
     * 创建委托
     *
     * 用户给PCA创建OBS委托授权，用于访问OBS桶，更新吊销列表。
     * &gt; 用户所使用账号token需要具备安全管理员（secu_admin）权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateAuthorityObsAgencyRequest 请求对象
     * @return SyncInvoker<CreateCertificateAuthorityObsAgencyRequest, CreateCertificateAuthorityObsAgencyResponse>
     */
    public SyncInvoker<CreateCertificateAuthorityObsAgencyRequest, CreateCertificateAuthorityObsAgencyResponse> createCertificateAuthorityObsAgencyInvoker(
        CreateCertificateAuthorityObsAgencyRequest request) {
        return new SyncInvoker<>(request, CcmMeta.createCertificateAuthorityObsAgency, hcClient);
    }

    /**
     * 购买CA
     *
     * 购买CA。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateAuthorityOrderRequest 请求对象
     * @return CreateCertificateAuthorityOrderResponse
     */
    public CreateCertificateAuthorityOrderResponse createCertificateAuthorityOrder(
        CreateCertificateAuthorityOrderRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.createCertificateAuthorityOrder);
    }

    /**
     * 购买CA
     *
     * 购买CA。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateAuthorityOrderRequest 请求对象
     * @return SyncInvoker<CreateCertificateAuthorityOrderRequest, CreateCertificateAuthorityOrderResponse>
     */
    public SyncInvoker<CreateCertificateAuthorityOrderRequest, CreateCertificateAuthorityOrderResponse> createCertificateAuthorityOrderInvoker(
        CreateCertificateAuthorityOrderRequest request) {
        return new SyncInvoker<>(request, CcmMeta.createCertificateAuthorityOrder, hcClient);
    }

    /**
     * 通过CSR签发证书
     *
     * 通过CSR签发证书。功能约束如下：
     * - 1、当前默认参数如下：
     *   - CA 默认参数：
     *       - **keyUsage**: digitalSignature, keyCertSign, cRLSign，优先采用CSR中的参数；
     *       - **SignatureHashAlgorithm**: SHA384；
     *       - **PathLength**：0 （可自定义）。
     *   - 私有证书：
     *       - **keyUsage**: digitalSignature keyAgreement，优先采用CSR中的参数；
     *       - **SignatureHashAlgorithm**: SHA384；
     * - 2、当传入的type为**INTERMEDIATE_CA**时，创建出的从属CA证书，有以下限制：
     *   - 不占用CA配额。在查询CA列表时，不会返回该证书；
     *   - 只支持通过以下两个接口获取其信息：
     *       - GET /v1/private-certificate-authorities/{ca_id} 获取证书详情
     *       - POST /v1/private-certificate-authorities/{ca_id}/export 导出证书
     *   - 本接口返回的**certificate_id**即代表从属CA的**ca_id**；
     *   - 无法用于签发证书，密钥在用户侧。
     * - 3、当type为**ENTITY_CERT**时，创建出的私有证书，有以下特点：
     *   - 占用私有证书配额。在查询私有证书列表时，会返回该证书；
     *   - 除了导出时不包含密钥信息（密钥在用户端），其余用法与其它私有证书一致。
     * &gt; 注：需要使用“\\r\\n”或“\\n”代替换行符，将CSR转换成一串字符，可参考示例请求。注：目前，证书的组织信息、公钥算法以及公钥内容等均来自CSR文件，暂不支持API传入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateByCsrRequest 请求对象
     * @return CreateCertificateByCsrResponse
     */
    public CreateCertificateByCsrResponse createCertificateByCsr(CreateCertificateByCsrRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.createCertificateByCsr);
    }

    /**
     * 通过CSR签发证书
     *
     * 通过CSR签发证书。功能约束如下：
     * - 1、当前默认参数如下：
     *   - CA 默认参数：
     *       - **keyUsage**: digitalSignature, keyCertSign, cRLSign，优先采用CSR中的参数；
     *       - **SignatureHashAlgorithm**: SHA384；
     *       - **PathLength**：0 （可自定义）。
     *   - 私有证书：
     *       - **keyUsage**: digitalSignature keyAgreement，优先采用CSR中的参数；
     *       - **SignatureHashAlgorithm**: SHA384；
     * - 2、当传入的type为**INTERMEDIATE_CA**时，创建出的从属CA证书，有以下限制：
     *   - 不占用CA配额。在查询CA列表时，不会返回该证书；
     *   - 只支持通过以下两个接口获取其信息：
     *       - GET /v1/private-certificate-authorities/{ca_id} 获取证书详情
     *       - POST /v1/private-certificate-authorities/{ca_id}/export 导出证书
     *   - 本接口返回的**certificate_id**即代表从属CA的**ca_id**；
     *   - 无法用于签发证书，密钥在用户侧。
     * - 3、当type为**ENTITY_CERT**时，创建出的私有证书，有以下特点：
     *   - 占用私有证书配额。在查询私有证书列表时，会返回该证书；
     *   - 除了导出时不包含密钥信息（密钥在用户端），其余用法与其它私有证书一致。
     * &gt; 注：需要使用“\\r\\n”或“\\n”代替换行符，将CSR转换成一串字符，可参考示例请求。注：目前，证书的组织信息、公钥算法以及公钥内容等均来自CSR文件，暂不支持API传入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateByCsrRequest 请求对象
     * @return SyncInvoker<CreateCertificateByCsrRequest, CreateCertificateByCsrResponse>
     */
    public SyncInvoker<CreateCertificateByCsrRequest, CreateCertificateByCsrResponse> createCertificateByCsrInvoker(
        CreateCertificateByCsrRequest request) {
        return new SyncInvoker<>(request, CcmMeta.createCertificateByCsr, hcClient);
    }

    /**
     * 删除证书
     *
     * 删除证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateRequest 请求对象
     * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.deleteCertificate);
    }

    /**
     * 删除证书
     *
     * 删除证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateRequest 请求对象
     * @return SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateInvoker(
        DeleteCertificateRequest request) {
        return new SyncInvoker<>(request, CcmMeta.deleteCertificate, hcClient);
    }

    /**
     * 禁用CRL
     *
     * 禁用当前CA的CRL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableCertificateAuthorityCrlRequest 请求对象
     * @return DisableCertificateAuthorityCrlResponse
     */
    public DisableCertificateAuthorityCrlResponse disableCertificateAuthorityCrl(
        DisableCertificateAuthorityCrlRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.disableCertificateAuthorityCrl);
    }

    /**
     * 禁用CRL
     *
     * 禁用当前CA的CRL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableCertificateAuthorityCrlRequest 请求对象
     * @return SyncInvoker<DisableCertificateAuthorityCrlRequest, DisableCertificateAuthorityCrlResponse>
     */
    public SyncInvoker<DisableCertificateAuthorityCrlRequest, DisableCertificateAuthorityCrlResponse> disableCertificateAuthorityCrlInvoker(
        DisableCertificateAuthorityCrlRequest request) {
        return new SyncInvoker<>(request, CcmMeta.disableCertificateAuthorityCrl, hcClient);
    }

    /**
     * 启用CRL
     *
     * 启用当前CA的CRL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableCertificateAuthorityCrlRequest 请求对象
     * @return EnableCertificateAuthorityCrlResponse
     */
    public EnableCertificateAuthorityCrlResponse enableCertificateAuthorityCrl(
        EnableCertificateAuthorityCrlRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.enableCertificateAuthorityCrl);
    }

    /**
     * 启用CRL
     *
     * 启用当前CA的CRL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableCertificateAuthorityCrlRequest 请求对象
     * @return SyncInvoker<EnableCertificateAuthorityCrlRequest, EnableCertificateAuthorityCrlResponse>
     */
    public SyncInvoker<EnableCertificateAuthorityCrlRequest, EnableCertificateAuthorityCrlResponse> enableCertificateAuthorityCrlInvoker(
        EnableCertificateAuthorityCrlRequest request) {
        return new SyncInvoker<>(request, CcmMeta.enableCertificateAuthorityCrl, hcClient);
    }

    /**
     * 导出证书
     *
     * 导出证书。
     *   - 国际算法
     *     - 选择是否压缩时，分以下两种情况：
     *       - is_compressed为true时，返回文件压缩包，命名为：证书名称_type字段小写字母.zip，如”test_apache.zip“。
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;时，压缩包中包含三个文件：**server.key**（密钥文件，内容为PEM格式，若导出证书时设置密码，则为加密后的私钥）、**chain.crt**（证书链，内容为PEM格式）、**server.crt**（证书，内容为PEM格式）；
     *           - type &#x3D; \&quot;**IIS**\&quot;时，压缩包中包含两个文件：**keystorePass.txt**（keystore口令，若导出证书时设置密码，则无此密码文件）、**server.pfx**（PFX证书，证书与证书链包含在同一个文件）；
     *           - type &#x3D; \&quot;**NGINX**\&quot;时，压缩包中包含两个文件：**server.key**（密钥文件，内容为PEM格式，若导出证书时设置密码，则为加密后的私钥）、**server.crt**（内容为PEM格式，证书与证书链包含在同一个文件）；
     *           - type &#x3D; \&quot;**TOMCAT**\&quot;时，压缩包中包含两个文件：**keystorePass.txt**（keystore口令，若导出证书时设置密码，则无此密码文件）、**server.jks**（JKX证书，证书与证书链包含在同一个文件）；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含三个文件：**server.key**（密钥文件，内容为PEM格式，若导出证书时设置密码，则为加密后的私钥）、**chain.pem**（证书链）、**server.pem**（证书）。
     *         - 导入CSR签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**TOMCAT**\&quot;时，压缩包中包含两个文件：**chain.crt**（证书链，内容为PEM格式）、**server.crt**（证书，内容为PEM格式）；
     *           - type &#x3D; \&quot;**NGINX**\&quot;时，压缩包中包含一个文件：**server.crt**（证书，内容为PEM格式）；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含两个文件：**chain.pem**（证书链，内容为PEM格式）、**cert.pem**（证书，内容为PEM格式）。
     *       - is_compressed为false时，返回json格式，返回的具体参数如下：
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**OTHER**\&quot;时，返回参数如下：
     *             - **certificate**（证书内容，PEM格式）；
     *             - **certificate_chain**（证书链，PEM格式）；
     *             - **private_key**（证书私钥，PEM格式，若导出证书时设置密码，则为加密后的私钥）；
     *           - type &#x3D; \&quot;**IIS**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义。
     *         - 导入CSR签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**IIS**\&quot;或\&quot;**TOMCAT**\&quot;或\&quot;**OTHER**\&quot;时，返回参数如下：
     *             - **certificate**（证书内容，PEM格式）；
     *             - **certificate_chain**（证书链，PEM格式）；
     *   - 国密算法（中国站）
     *     - 选择是否压缩和是否国密标准时，分以下四种情况：
     *       - is_compressed为true、is_sm_standard为true时，返回文件压缩包，命名为：证书名称_type字段小写字母.zip，如”test_apache.zip“。
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含六个文件：**chain.pem**（证书链，内容为PEM格式）、**signCert.key**（签名证书密钥文件，内容为PEM格式，若导出证书时设置密码，则为加密后的私钥）、**signCert.pem**（签名证书，内容为PEM格式）、**encSm2EnvelopedKey.key**（加密证书的国密GMT0009标准规范数字信封文件，内容为BASE64编码）、**signedAndEnvelopedData.key**（加密证书的国密GMT0010标准规范数字信封文件，内容为BASE64编码）、**encCert.pem**（加密证书，内容为PEM格式）。
     *         - 导入CSR签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含五个文件：**chain.pem**（证书链，内容为PEM格式）、**signCert.pem**（签名证书，内容为PEM格式）、**encSm2EnvelopedKey.key**（加密证书的国密GMT0009标准规范数字信封文件，内容为BASE64编码）、**signedAndEnvelopedData.key**（加密证书的国密GMT0010标准规范数字信封文件，内容为BASE64编码）、**encCert.pem**（加密证书，内容为PEM格式）。
     *       - is_compressed为true、is_sm_standard为false时，返回文件压缩包，命名为：证书名称_type字段小写字母.zip，如”test_apache.zip“。
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含五个文件：**chain.pem**（证书链，内容为PEM格式）、**signCert.key**（签名证书密钥文件，内容为PEM格式，若导出证书时设置密码，则为加密后的私钥）、**signCert.pem**（签名证书，内容为PEM格式）、**encCert.key**（加密证书密钥文件，内容为PEM格式，若导出证书时设置密码，则为加密后的私钥）、**encCert.pem**（加密证书，内容为PEM格式）。
     *         - 导入CSR签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含四个文件：**chain.pem**（证书链，内容为PEM格式）、**signCert.pem**（签名证书，内容为PEM格式）、**encCert.key**（加密证书密钥文件，内容为PEM格式）、**encCert.pem**（加密证书，内容为PEM格式）。
     *       - is_compressed为false、is_sm_standard为true时，返回json格式，返回的具体参数如下：
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，返回参数如下：
     *             - **certificate_chain**（证书链，PEM格式）；
     *             - **certificate**（签名证书内容，PEM格式）；
     *             - **private_key**（签名证书私钥，PEM格式，若导出证书时设置密码，则为加密后的私钥）；
     *             - **enc_certificate**（加密证书内容，PEM格式）；
     *             - **enc_sm2_enveloped_key**（加密证书的国密GMT0009标准规范数字信封文件，BASE64编码）；
     *             - **signed_and_enveloped_data**（加密证书的国密GMT0010标准规范数字信封文件，BASE64编码）。
     *         - 导入CSR签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，返回参数如下：
     *             - **certificate_chain**（证书链，PEM格式）；
     *             - **certificate**（签名证书内容，PEM格式）；
     *             - **enc_certificate**（加密证书内容，PEM格式）；
     *             - **enc_sm2_enveloped_key**（加密证书的国密GMT0009标准规范数字信封文件，BASE64编码）；
     *             - **signed_and_enveloped_data**（加密证书的国密GMT0010标准规范数字信封文件，BASE64编码）。
     *       - is_compressed为false、is_sm_standard为false时，返回json格式，返回的具体参数如下：
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，返回参数如下：
     *             - **certificate_chain**（证书链，PEM格式）；
     *             - **certificate**（签名证书内容，PEM格式）；
     *             - **private_key**（签名证书私钥，PEM格式，若导出证书时设置密码，则为加密后的私钥）；
     *             - **enc_certificate**（加密证书内容，PEM格式）；
     *             - **enc_private_key**（加密证书私钥，PEM格式，若导出证书时设置密码，则为加密后的私钥）。
     *         - 导入CSR签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，返回参数如下：
     *             - **certificate_chain**（证书链，PEM格式）；
     *             - **certificate**（签名证书内容，PEM格式）；
     *             - **enc_certificate**（加密证书内容，PEM格式）；
     *             - **enc_private_key**（加密证书私钥，PEM格式）。
     * &gt; 只有当证书状态为“已签发”时，可进行导出操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertificateRequest 请求对象
     * @return ExportCertificateResponse
     */
    public ExportCertificateResponse exportCertificate(ExportCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.exportCertificate);
    }

    /**
     * 导出证书
     *
     * 导出证书。
     *   - 国际算法
     *     - 选择是否压缩时，分以下两种情况：
     *       - is_compressed为true时，返回文件压缩包，命名为：证书名称_type字段小写字母.zip，如”test_apache.zip“。
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;时，压缩包中包含三个文件：**server.key**（密钥文件，内容为PEM格式，若导出证书时设置密码，则为加密后的私钥）、**chain.crt**（证书链，内容为PEM格式）、**server.crt**（证书，内容为PEM格式）；
     *           - type &#x3D; \&quot;**IIS**\&quot;时，压缩包中包含两个文件：**keystorePass.txt**（keystore口令，若导出证书时设置密码，则无此密码文件）、**server.pfx**（PFX证书，证书与证书链包含在同一个文件）；
     *           - type &#x3D; \&quot;**NGINX**\&quot;时，压缩包中包含两个文件：**server.key**（密钥文件，内容为PEM格式，若导出证书时设置密码，则为加密后的私钥）、**server.crt**（内容为PEM格式，证书与证书链包含在同一个文件）；
     *           - type &#x3D; \&quot;**TOMCAT**\&quot;时，压缩包中包含两个文件：**keystorePass.txt**（keystore口令，若导出证书时设置密码，则无此密码文件）、**server.jks**（JKX证书，证书与证书链包含在同一个文件）；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含三个文件：**server.key**（密钥文件，内容为PEM格式，若导出证书时设置密码，则为加密后的私钥）、**chain.pem**（证书链）、**server.pem**（证书）。
     *         - 导入CSR签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**TOMCAT**\&quot;时，压缩包中包含两个文件：**chain.crt**（证书链，内容为PEM格式）、**server.crt**（证书，内容为PEM格式）；
     *           - type &#x3D; \&quot;**NGINX**\&quot;时，压缩包中包含一个文件：**server.crt**（证书，内容为PEM格式）；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含两个文件：**chain.pem**（证书链，内容为PEM格式）、**cert.pem**（证书，内容为PEM格式）。
     *       - is_compressed为false时，返回json格式，返回的具体参数如下：
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**OTHER**\&quot;时，返回参数如下：
     *             - **certificate**（证书内容，PEM格式）；
     *             - **certificate_chain**（证书链，PEM格式）；
     *             - **private_key**（证书私钥，PEM格式，若导出证书时设置密码，则为加密后的私钥）；
     *           - type &#x3D; \&quot;**IIS**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义。
     *         - 导入CSR签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**IIS**\&quot;或\&quot;**TOMCAT**\&quot;或\&quot;**OTHER**\&quot;时，返回参数如下：
     *             - **certificate**（证书内容，PEM格式）；
     *             - **certificate_chain**（证书链，PEM格式）；
     *   - 国密算法（中国站）
     *     - 选择是否压缩和是否国密标准时，分以下四种情况：
     *       - is_compressed为true、is_sm_standard为true时，返回文件压缩包，命名为：证书名称_type字段小写字母.zip，如”test_apache.zip“。
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含六个文件：**chain.pem**（证书链，内容为PEM格式）、**signCert.key**（签名证书密钥文件，内容为PEM格式，若导出证书时设置密码，则为加密后的私钥）、**signCert.pem**（签名证书，内容为PEM格式）、**encSm2EnvelopedKey.key**（加密证书的国密GMT0009标准规范数字信封文件，内容为BASE64编码）、**signedAndEnvelopedData.key**（加密证书的国密GMT0010标准规范数字信封文件，内容为BASE64编码）、**encCert.pem**（加密证书，内容为PEM格式）。
     *         - 导入CSR签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含五个文件：**chain.pem**（证书链，内容为PEM格式）、**signCert.pem**（签名证书，内容为PEM格式）、**encSm2EnvelopedKey.key**（加密证书的国密GMT0009标准规范数字信封文件，内容为BASE64编码）、**signedAndEnvelopedData.key**（加密证书的国密GMT0010标准规范数字信封文件，内容为BASE64编码）、**encCert.pem**（加密证书，内容为PEM格式）。
     *       - is_compressed为true、is_sm_standard为false时，返回文件压缩包，命名为：证书名称_type字段小写字母.zip，如”test_apache.zip“。
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含五个文件：**chain.pem**（证书链，内容为PEM格式）、**signCert.key**（签名证书密钥文件，内容为PEM格式，若导出证书时设置密码，则为加密后的私钥）、**signCert.pem**（签名证书，内容为PEM格式）、**encCert.key**（加密证书密钥文件，内容为PEM格式，若导出证书时设置密码，则为加密后的私钥）、**encCert.pem**（加密证书，内容为PEM格式）。
     *         - 导入CSR签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含四个文件：**chain.pem**（证书链，内容为PEM格式）、**signCert.pem**（签名证书，内容为PEM格式）、**encCert.key**（加密证书密钥文件，内容为PEM格式）、**encCert.pem**（加密证书，内容为PEM格式）。
     *       - is_compressed为false、is_sm_standard为true时，返回json格式，返回的具体参数如下：
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，返回参数如下：
     *             - **certificate_chain**（证书链，PEM格式）；
     *             - **certificate**（签名证书内容，PEM格式）；
     *             - **private_key**（签名证书私钥，PEM格式，若导出证书时设置密码，则为加密后的私钥）；
     *             - **enc_certificate**（加密证书内容，PEM格式）；
     *             - **enc_sm2_enveloped_key**（加密证书的国密GMT0009标准规范数字信封文件，BASE64编码）；
     *             - **signed_and_enveloped_data**（加密证书的国密GMT0010标准规范数字信封文件，BASE64编码）。
     *         - 导入CSR签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，返回参数如下：
     *             - **certificate_chain**（证书链，PEM格式）；
     *             - **certificate**（签名证书内容，PEM格式）；
     *             - **enc_certificate**（加密证书内容，PEM格式）；
     *             - **enc_sm2_enveloped_key**（加密证书的国密GMT0009标准规范数字信封文件，BASE64编码）；
     *             - **signed_and_enveloped_data**（加密证书的国密GMT0010标准规范数字信封文件，BASE64编码）。
     *       - is_compressed为false、is_sm_standard为false时，返回json格式，返回的具体参数如下：
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，返回参数如下：
     *             - **certificate_chain**（证书链，PEM格式）；
     *             - **certificate**（签名证书内容，PEM格式）；
     *             - **private_key**（签名证书私钥，PEM格式，若导出证书时设置密码，则为加密后的私钥）；
     *             - **enc_certificate**（加密证书内容，PEM格式）；
     *             - **enc_private_key**（加密证书私钥，PEM格式，若导出证书时设置密码，则为加密后的私钥）。
     *         - 导入CSR签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，返回参数如下：
     *             - **certificate_chain**（证书链，PEM格式）；
     *             - **certificate**（签名证书内容，PEM格式）；
     *             - **enc_certificate**（加密证书内容，PEM格式）；
     *             - **enc_private_key**（加密证书私钥，PEM格式）。
     * &gt; 只有当证书状态为“已签发”时，可进行导出操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertificateRequest 请求对象
     * @return SyncInvoker<ExportCertificateRequest, ExportCertificateResponse>
     */
    public SyncInvoker<ExportCertificateRequest, ExportCertificateResponse> exportCertificateInvoker(
        ExportCertificateRequest request) {
        return new SyncInvoker<>(request, CcmMeta.exportCertificate, hcClient);
    }

    /**
     * 根据标签查询CA列表
     *
     * 根据标签查询CA列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaResourceInstancesRequest 请求对象
     * @return ListCaResourceInstancesResponse
     */
    public ListCaResourceInstancesResponse listCaResourceInstances(ListCaResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.listCaResourceInstances);
    }

    /**
     * 根据标签查询CA列表
     *
     * 根据标签查询CA列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaResourceInstancesRequest 请求对象
     * @return SyncInvoker<ListCaResourceInstancesRequest, ListCaResourceInstancesResponse>
     */
    public SyncInvoker<ListCaResourceInstancesRequest, ListCaResourceInstancesResponse> listCaResourceInstancesInvoker(
        ListCaResourceInstancesRequest request) {
        return new SyncInvoker<>(request, CcmMeta.listCaResourceInstances, hcClient);
    }

    /**
     * 根据CA查询标签列表
     *
     * 根据CA证书ID查询此CA的标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaTagsRequest 请求对象
     * @return ListCaTagsResponse
     */
    public ListCaTagsResponse listCaTags(ListCaTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.listCaTags);
    }

    /**
     * 根据CA查询标签列表
     *
     * 根据CA证书ID查询此CA的标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaTagsRequest 请求对象
     * @return SyncInvoker<ListCaTagsRequest, ListCaTagsResponse>
     */
    public SyncInvoker<ListCaTagsRequest, ListCaTagsResponse> listCaTagsInvoker(ListCaTagsRequest request) {
        return new SyncInvoker<>(request, CcmMeta.listCaTags, hcClient);
    }

    /**
     * 根据标签查询证书列表
     *
     * 根据标签查询证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertResourceInstancesRequest 请求对象
     * @return ListCertResourceInstancesResponse
     */
    public ListCertResourceInstancesResponse listCertResourceInstances(ListCertResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.listCertResourceInstances);
    }

    /**
     * 根据标签查询证书列表
     *
     * 根据标签查询证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertResourceInstancesRequest 请求对象
     * @return SyncInvoker<ListCertResourceInstancesRequest, ListCertResourceInstancesResponse>
     */
    public SyncInvoker<ListCertResourceInstancesRequest, ListCertResourceInstancesResponse> listCertResourceInstancesInvoker(
        ListCertResourceInstancesRequest request) {
        return new SyncInvoker<>(request, CcmMeta.listCertResourceInstances, hcClient);
    }

    /**
     * 根据证书查询标签列表
     *
     * 根据证书ID查询此证书的标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertTagsRequest 请求对象
     * @return ListCertTagsResponse
     */
    public ListCertTagsResponse listCertTags(ListCertTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.listCertTags);
    }

    /**
     * 根据证书查询标签列表
     *
     * 根据证书ID查询此证书的标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertTagsRequest 请求对象
     * @return SyncInvoker<ListCertTagsRequest, ListCertTagsResponse>
     */
    public SyncInvoker<ListCertTagsRequest, ListCertTagsResponse> listCertTagsInvoker(ListCertTagsRequest request) {
        return new SyncInvoker<>(request, CcmMeta.listCertTags, hcClient);
    }

    /**
     * 查询私有证书列表
     *
     * 查询私有证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificateRequest 请求对象
     * @return ListCertificateResponse
     */
    public ListCertificateResponse listCertificate(ListCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.listCertificate);
    }

    /**
     * 查询私有证书列表
     *
     * 查询私有证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificateRequest 请求对象
     * @return SyncInvoker<ListCertificateRequest, ListCertificateResponse>
     */
    public SyncInvoker<ListCertificateRequest, ListCertificateResponse> listCertificateInvoker(
        ListCertificateRequest request) {
        return new SyncInvoker<>(request, CcmMeta.listCertificate, hcClient);
    }

    /**
     * 查询OBS桶列表
     *
     * 查询OBS桶列表。
     * &gt; 只有用户创建了委托授权，方可使用此接口。创建委托授权参见本文档：**证书吊销处理&gt;创建委托**。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificateAuthorityObsBucketRequest 请求对象
     * @return ListCertificateAuthorityObsBucketResponse
     */
    public ListCertificateAuthorityObsBucketResponse listCertificateAuthorityObsBucket(
        ListCertificateAuthorityObsBucketRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.listCertificateAuthorityObsBucket);
    }

    /**
     * 查询OBS桶列表
     *
     * 查询OBS桶列表。
     * &gt; 只有用户创建了委托授权，方可使用此接口。创建委托授权参见本文档：**证书吊销处理&gt;创建委托**。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificateAuthorityObsBucketRequest 请求对象
     * @return SyncInvoker<ListCertificateAuthorityObsBucketRequest, ListCertificateAuthorityObsBucketResponse>
     */
    public SyncInvoker<ListCertificateAuthorityObsBucketRequest, ListCertificateAuthorityObsBucketResponse> listCertificateAuthorityObsBucketInvoker(
        ListCertificateAuthorityObsBucketRequest request) {
        return new SyncInvoker<>(request, CcmMeta.listCertificateAuthorityObsBucket, hcClient);
    }

    /**
     * 查询所有CA标签列表
     *
     * 查询所有CA标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainCaTagsRequest 请求对象
     * @return ListDomainCaTagsResponse
     */
    public ListDomainCaTagsResponse listDomainCaTags(ListDomainCaTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.listDomainCaTags);
    }

    /**
     * 查询所有CA标签列表
     *
     * 查询所有CA标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainCaTagsRequest 请求对象
     * @return SyncInvoker<ListDomainCaTagsRequest, ListDomainCaTagsResponse>
     */
    public SyncInvoker<ListDomainCaTagsRequest, ListDomainCaTagsResponse> listDomainCaTagsInvoker(
        ListDomainCaTagsRequest request) {
        return new SyncInvoker<>(request, CcmMeta.listDomainCaTags, hcClient);
    }

    /**
     * 查询所有证书标签列表
     *
     * 查询所有证书标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainCertTagsRequest 请求对象
     * @return ListDomainCertTagsResponse
     */
    public ListDomainCertTagsResponse listDomainCertTags(ListDomainCertTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.listDomainCertTags);
    }

    /**
     * 查询所有证书标签列表
     *
     * 查询所有证书标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainCertTagsRequest 请求对象
     * @return SyncInvoker<ListDomainCertTagsRequest, ListDomainCertTagsResponse>
     */
    public SyncInvoker<ListDomainCertTagsRequest, ListDomainCertTagsResponse> listDomainCertTagsInvoker(
        ListDomainCertTagsRequest request) {
        return new SyncInvoker<>(request, CcmMeta.listDomainCertTags, hcClient);
    }

    /**
     * 解析CSR
     *
     * 解析CSR。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseCertificateSigningRequestRequest 请求对象
     * @return ParseCertificateSigningRequestResponse
     */
    public ParseCertificateSigningRequestResponse parseCertificateSigningRequest(
        ParseCertificateSigningRequestRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.parseCertificateSigningRequest);
    }

    /**
     * 解析CSR
     *
     * 解析CSR。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseCertificateSigningRequestRequest 请求对象
     * @return SyncInvoker<ParseCertificateSigningRequestRequest, ParseCertificateSigningRequestResponse>
     */
    public SyncInvoker<ParseCertificateSigningRequestRequest, ParseCertificateSigningRequestResponse> parseCertificateSigningRequestInvoker(
        ParseCertificateSigningRequestRequest request) {
        return new SyncInvoker<>(request, CcmMeta.parseCertificateSigningRequest, hcClient);
    }

    /**
     * 吊销证书
     *
     * 吊销证书。
     * &gt; 注：当不想填写吊销理由时，请求body体请置为\&quot;**{}**\&quot;，否则将会报错。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokeCertificateRequest 请求对象
     * @return RevokeCertificateResponse
     */
    public RevokeCertificateResponse revokeCertificate(RevokeCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.revokeCertificate);
    }

    /**
     * 吊销证书
     *
     * 吊销证书。
     * &gt; 注：当不想填写吊销理由时，请求body体请置为\&quot;**{}**\&quot;，否则将会报错。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokeCertificateRequest 请求对象
     * @return SyncInvoker<RevokeCertificateRequest, RevokeCertificateResponse>
     */
    public SyncInvoker<RevokeCertificateRequest, RevokeCertificateResponse> revokeCertificateInvoker(
        RevokeCertificateRequest request) {
        return new SyncInvoker<>(request, CcmMeta.revokeCertificate, hcClient);
    }

    /**
     * 查询证书详情
     *
     * 查询证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateRequest 请求对象
     * @return ShowCertificateResponse
     */
    public ShowCertificateResponse showCertificate(ShowCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.showCertificate);
    }

    /**
     * 查询证书详情
     *
     * 查询证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateRequest 请求对象
     * @return SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public SyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateInvoker(
        ShowCertificateRequest request) {
        return new SyncInvoker<>(request, CcmMeta.showCertificate, hcClient);
    }

    /**
     * 查看是否具有委托权限
     *
     * 查看是否具有委托权限。
     * &gt; 用户所使用账号token需要具备安全管理员（secu_admin）权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateAuthorityObsAgencyRequest 请求对象
     * @return ShowCertificateAuthorityObsAgencyResponse
     */
    public ShowCertificateAuthorityObsAgencyResponse showCertificateAuthorityObsAgency(
        ShowCertificateAuthorityObsAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.showCertificateAuthorityObsAgency);
    }

    /**
     * 查看是否具有委托权限
     *
     * 查看是否具有委托权限。
     * &gt; 用户所使用账号token需要具备安全管理员（secu_admin）权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateAuthorityObsAgencyRequest 请求对象
     * @return SyncInvoker<ShowCertificateAuthorityObsAgencyRequest, ShowCertificateAuthorityObsAgencyResponse>
     */
    public SyncInvoker<ShowCertificateAuthorityObsAgencyRequest, ShowCertificateAuthorityObsAgencyResponse> showCertificateAuthorityObsAgencyInvoker(
        ShowCertificateAuthorityObsAgencyRequest request) {
        return new SyncInvoker<>(request, CcmMeta.showCertificateAuthorityObsAgency, hcClient);
    }

    /**
     * 查询私有证书配额
     *
     * 查询私有证书配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateQuotaRequest 请求对象
     * @return ShowCertificateQuotaResponse
     */
    public ShowCertificateQuotaResponse showCertificateQuota(ShowCertificateQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.showCertificateQuota);
    }

    /**
     * 查询私有证书配额
     *
     * 查询私有证书配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateQuotaRequest 请求对象
     * @return SyncInvoker<ShowCertificateQuotaRequest, ShowCertificateQuotaResponse>
     */
    public SyncInvoker<ShowCertificateQuotaRequest, ShowCertificateQuotaResponse> showCertificateQuotaInvoker(
        ShowCertificateQuotaRequest request) {
        return new SyncInvoker<>(request, CcmMeta.showCertificateQuota, hcClient);
    }

    /**
     * 创建CA
     *
     * 创建CA，分以下三种情况：
     * - 创建根CA，根据参数介绍中，填写必选值；
     * - 创建从属CA，并需要直接激活该证书，根据参数介绍中，填写必选值；
     * - 创建从属CA，不需要直接激活该证书，请求body中只需要缺少此三个参数之一即可：issuer_id、signature_algorithm、validity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateAuthorityRequest 请求对象
     * @return CreateCertificateAuthorityResponse
     */
    public CreateCertificateAuthorityResponse createCertificateAuthority(CreateCertificateAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.createCertificateAuthority);
    }

    /**
     * 创建CA
     *
     * 创建CA，分以下三种情况：
     * - 创建根CA，根据参数介绍中，填写必选值；
     * - 创建从属CA，并需要直接激活该证书，根据参数介绍中，填写必选值；
     * - 创建从属CA，不需要直接激活该证书，请求body中只需要缺少此三个参数之一即可：issuer_id、signature_algorithm、validity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse>
     */
    public SyncInvoker<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse> createCertificateAuthorityInvoker(
        CreateCertificateAuthorityRequest request) {
        return new SyncInvoker<>(request, CcmMeta.createCertificateAuthority, hcClient);
    }

    /**
     * 删除CA
     *
     * 计划删除CA。计划多少天后删除CA证书，可设置7天～30天内删除。
     * &gt; 只有当证书状态为”待激活“或”已禁用“状态时，才可删除。”待激活“状态下，将会立即删除证书，不支持延迟删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateAuthorityRequest 请求对象
     * @return DeleteCertificateAuthorityResponse
     */
    public DeleteCertificateAuthorityResponse deleteCertificateAuthority(DeleteCertificateAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.deleteCertificateAuthority);
    }

    /**
     * 删除CA
     *
     * 计划删除CA。计划多少天后删除CA证书，可设置7天～30天内删除。
     * &gt; 只有当证书状态为”待激活“或”已禁用“状态时，才可删除。”待激活“状态下，将会立即删除证书，不支持延迟删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResponse>
     */
    public SyncInvoker<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResponse> deleteCertificateAuthorityInvoker(
        DeleteCertificateAuthorityRequest request) {
        return new SyncInvoker<>(request, CcmMeta.deleteCertificateAuthority, hcClient);
    }

    /**
     * 禁用CA
     *
     * 禁用CA。
     * &gt; 只有当证书处于\&quot;已激活\&quot;或\&quot;已过期\&quot;状态时，可进行禁用操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableCertificateAuthorityRequest 请求对象
     * @return DisableCertificateAuthorityResponse
     */
    public DisableCertificateAuthorityResponse disableCertificateAuthority(DisableCertificateAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.disableCertificateAuthority);
    }

    /**
     * 禁用CA
     *
     * 禁用CA。
     * &gt; 只有当证书处于\&quot;已激活\&quot;或\&quot;已过期\&quot;状态时，可进行禁用操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<DisableCertificateAuthorityRequest, DisableCertificateAuthorityResponse>
     */
    public SyncInvoker<DisableCertificateAuthorityRequest, DisableCertificateAuthorityResponse> disableCertificateAuthorityInvoker(
        DisableCertificateAuthorityRequest request) {
        return new SyncInvoker<>(request, CcmMeta.disableCertificateAuthority, hcClient);
    }

    /**
     * 启用CA
     *
     * 启用CA。
     * &gt; 注：只有当证书处于\&quot;已禁用\&quot;状态时，可进行启用操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableCertificateAuthorityRequest 请求对象
     * @return EnableCertificateAuthorityResponse
     */
    public EnableCertificateAuthorityResponse enableCertificateAuthority(EnableCertificateAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.enableCertificateAuthority);
    }

    /**
     * 启用CA
     *
     * 启用CA。
     * &gt; 注：只有当证书处于\&quot;已禁用\&quot;状态时，可进行启用操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<EnableCertificateAuthorityRequest, EnableCertificateAuthorityResponse>
     */
    public SyncInvoker<EnableCertificateAuthorityRequest, EnableCertificateAuthorityResponse> enableCertificateAuthorityInvoker(
        EnableCertificateAuthorityRequest request) {
        return new SyncInvoker<>(request, CcmMeta.enableCertificateAuthority, hcClient);
    }

    /**
     * 导出CA证书
     *
     * 导出CA证书。
     * &gt; 注：只有当证书处于\&quot;已激活\&quot;或\&quot;已过期\&quot;时，可进行导出操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertificateAuthorityCertificateRequest 请求对象
     * @return ExportCertificateAuthorityCertificateResponse
     */
    public ExportCertificateAuthorityCertificateResponse exportCertificateAuthorityCertificate(
        ExportCertificateAuthorityCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.exportCertificateAuthorityCertificate);
    }

    /**
     * 导出CA证书
     *
     * 导出CA证书。
     * &gt; 注：只有当证书处于\&quot;已激活\&quot;或\&quot;已过期\&quot;时，可进行导出操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertificateAuthorityCertificateRequest 请求对象
     * @return SyncInvoker<ExportCertificateAuthorityCertificateRequest, ExportCertificateAuthorityCertificateResponse>
     */
    public SyncInvoker<ExportCertificateAuthorityCertificateRequest, ExportCertificateAuthorityCertificateResponse> exportCertificateAuthorityCertificateInvoker(
        ExportCertificateAuthorityCertificateRequest request) {
        return new SyncInvoker<>(request, CcmMeta.exportCertificateAuthorityCertificate, hcClient);
    }

    /**
     * 导出CA的证书签名请求（CSR）
     *
     * 导出CA的证书签名请求。
     * &gt; 只有当CA处于\&quot;待激活\&quot;状态时，可导出证书签名请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertificateAuthorityCsrRequest 请求对象
     * @return ExportCertificateAuthorityCsrResponse
     */
    public ExportCertificateAuthorityCsrResponse exportCertificateAuthorityCsr(
        ExportCertificateAuthorityCsrRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.exportCertificateAuthorityCsr);
    }

    /**
     * 导出CA的证书签名请求（CSR）
     *
     * 导出CA的证书签名请求。
     * &gt; 只有当CA处于\&quot;待激活\&quot;状态时，可导出证书签名请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertificateAuthorityCsrRequest 请求对象
     * @return SyncInvoker<ExportCertificateAuthorityCsrRequest, ExportCertificateAuthorityCsrResponse>
     */
    public SyncInvoker<ExportCertificateAuthorityCsrRequest, ExportCertificateAuthorityCsrResponse> exportCertificateAuthorityCsrInvoker(
        ExportCertificateAuthorityCsrRequest request) {
        return new SyncInvoker<>(request, CcmMeta.exportCertificateAuthorityCsr, hcClient);
    }

    /**
     * 导入CA证书
     *
     * 导入CA证书，使用本接口需要满足以下条件：
     *   - （1）证书为“待激活”状态的从属CA；
     *   - （2）导入的证书体必须满足以下条件：
     *       - a、该证书被签发时的证书签名请求必须是从PCA系统中导出；
     *       - b、其证书链虽然允许不上传，但后期若想要导出完整的证书链，应导入完整的证书链；
     *       - c、证书体与证书链必须为PEM编码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportCertificateAuthorityCertificateRequest 请求对象
     * @return ImportCertificateAuthorityCertificateResponse
     */
    public ImportCertificateAuthorityCertificateResponse importCertificateAuthorityCertificate(
        ImportCertificateAuthorityCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.importCertificateAuthorityCertificate);
    }

    /**
     * 导入CA证书
     *
     * 导入CA证书，使用本接口需要满足以下条件：
     *   - （1）证书为“待激活”状态的从属CA；
     *   - （2）导入的证书体必须满足以下条件：
     *       - a、该证书被签发时的证书签名请求必须是从PCA系统中导出；
     *       - b、其证书链虽然允许不上传，但后期若想要导出完整的证书链，应导入完整的证书链；
     *       - c、证书体与证书链必须为PEM编码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportCertificateAuthorityCertificateRequest 请求对象
     * @return SyncInvoker<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResponse>
     */
    public SyncInvoker<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResponse> importCertificateAuthorityCertificateInvoker(
        ImportCertificateAuthorityCertificateRequest request) {
        return new SyncInvoker<>(request, CcmMeta.importCertificateAuthorityCertificate, hcClient);
    }

    /**
     * 激活CA
     *
     * 激活CA。
     * &gt; 只有当证书处于\&quot;待激活\&quot;状态时，可进行激活操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request IssueCertificateAuthorityCertificateRequest 请求对象
     * @return IssueCertificateAuthorityCertificateResponse
     */
    public IssueCertificateAuthorityCertificateResponse issueCertificateAuthorityCertificate(
        IssueCertificateAuthorityCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.issueCertificateAuthorityCertificate);
    }

    /**
     * 激活CA
     *
     * 激活CA。
     * &gt; 只有当证书处于\&quot;待激活\&quot;状态时，可进行激活操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request IssueCertificateAuthorityCertificateRequest 请求对象
     * @return SyncInvoker<IssueCertificateAuthorityCertificateRequest, IssueCertificateAuthorityCertificateResponse>
     */
    public SyncInvoker<IssueCertificateAuthorityCertificateRequest, IssueCertificateAuthorityCertificateResponse> issueCertificateAuthorityCertificateInvoker(
        IssueCertificateAuthorityCertificateRequest request) {
        return new SyncInvoker<>(request, CcmMeta.issueCertificateAuthorityCertificate, hcClient);
    }

    /**
     * 查询CA列表
     *
     * 查询CA列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificateAuthorityRequest 请求对象
     * @return ListCertificateAuthorityResponse
     */
    public ListCertificateAuthorityResponse listCertificateAuthority(ListCertificateAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.listCertificateAuthority);
    }

    /**
     * 查询CA列表
     *
     * 查询CA列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<ListCertificateAuthorityRequest, ListCertificateAuthorityResponse>
     */
    public SyncInvoker<ListCertificateAuthorityRequest, ListCertificateAuthorityResponse> listCertificateAuthorityInvoker(
        ListCertificateAuthorityRequest request) {
        return new SyncInvoker<>(request, CcmMeta.listCertificateAuthority, hcClient);
    }

    /**
     * 恢复CA
     *
     * 恢复CA，将处于“计划删除”状态的CA证书，重新恢复为“已禁用”状态。
     * &gt; 注：只有处于“计划删除”状态的CA证书，才可进行恢复操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreCertificateAuthorityRequest 请求对象
     * @return RestoreCertificateAuthorityResponse
     */
    public RestoreCertificateAuthorityResponse restoreCertificateAuthority(RestoreCertificateAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.restoreCertificateAuthority);
    }

    /**
     * 恢复CA
     *
     * 恢复CA，将处于“计划删除”状态的CA证书，重新恢复为“已禁用”状态。
     * &gt; 注：只有处于“计划删除”状态的CA证书，才可进行恢复操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResponse>
     */
    public SyncInvoker<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResponse> restoreCertificateAuthorityInvoker(
        RestoreCertificateAuthorityRequest request) {
        return new SyncInvoker<>(request, CcmMeta.restoreCertificateAuthority, hcClient);
    }

    /**
     * 吊销CA
     *
     * 吊销子CA。
     * &gt; 注：当不想填写吊销理由时，请求body体请置为\&quot;**{}**\&quot;，否则将会报错。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokeCertificateAuthorityRequest 请求对象
     * @return RevokeCertificateAuthorityResponse
     */
    public RevokeCertificateAuthorityResponse revokeCertificateAuthority(RevokeCertificateAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.revokeCertificateAuthority);
    }

    /**
     * 吊销CA
     *
     * 吊销子CA。
     * &gt; 注：当不想填写吊销理由时，请求body体请置为\&quot;**{}**\&quot;，否则将会报错。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokeCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<RevokeCertificateAuthorityRequest, RevokeCertificateAuthorityResponse>
     */
    public SyncInvoker<RevokeCertificateAuthorityRequest, RevokeCertificateAuthorityResponse> revokeCertificateAuthorityInvoker(
        RevokeCertificateAuthorityRequest request) {
        return new SyncInvoker<>(request, CcmMeta.revokeCertificateAuthority, hcClient);
    }

    /**
     * 查询CA详情
     *
     * 查询CA详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateAuthorityRequest 请求对象
     * @return ShowCertificateAuthorityResponse
     */
    public ShowCertificateAuthorityResponse showCertificateAuthority(ShowCertificateAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.showCertificateAuthority);
    }

    /**
     * 查询CA详情
     *
     * 查询CA详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<ShowCertificateAuthorityRequest, ShowCertificateAuthorityResponse>
     */
    public SyncInvoker<ShowCertificateAuthorityRequest, ShowCertificateAuthorityResponse> showCertificateAuthorityInvoker(
        ShowCertificateAuthorityRequest request) {
        return new SyncInvoker<>(request, CcmMeta.showCertificateAuthority, hcClient);
    }

    /**
     * 查询CA配额
     *
     * 查询CA证书配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateAuthorityQuotaRequest 请求对象
     * @return ShowCertificateAuthorityQuotaResponse
     */
    public ShowCertificateAuthorityQuotaResponse showCertificateAuthorityQuota(
        ShowCertificateAuthorityQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.showCertificateAuthorityQuota);
    }

    /**
     * 查询CA配额
     *
     * 查询CA证书配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateAuthorityQuotaRequest 请求对象
     * @return SyncInvoker<ShowCertificateAuthorityQuotaRequest, ShowCertificateAuthorityQuotaResponse>
     */
    public SyncInvoker<ShowCertificateAuthorityQuotaRequest, ShowCertificateAuthorityQuotaResponse> showCertificateAuthorityQuotaInvoker(
        ShowCertificateAuthorityQuotaRequest request) {
        return new SyncInvoker<>(request, CcmMeta.showCertificateAuthorityQuota, hcClient);
    }

}
