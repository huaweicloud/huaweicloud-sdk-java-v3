package com.huaweicloud.sdk.ccm.v1;

import com.huaweicloud.sdk.ccm.v1.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CcmClient {

    protected HcClient hcClient;

    public CcmClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CcmClient> newBuilder() {
        return new ClientBuilder<>(CcmClient::new, "GlobalCredentials");
    }

    /**
     * 申请证书
     *
     * 申请证书。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateCertificateRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateCertificateRequest 请求对象
     * @return SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public SyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateInvoker(
        CreateCertificateRequest request) {
        return new SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>(request, CcmMeta.createCertificate,
            hcClient);
    }

    /**
     * 创建委托
     *
     * 用户给PCA创建OBS委托授权，用于访问OBS桶，更新吊销列表。
     * &gt; 用户所使用账号token需要具备安全管理员（secu_admin）权限。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateCertificateAuthorityObsAgencyRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateCertificateAuthorityObsAgencyRequest 请求对象
     * @return SyncInvoker<CreateCertificateAuthorityObsAgencyRequest, CreateCertificateAuthorityObsAgencyResponse>
     */
    public SyncInvoker<CreateCertificateAuthorityObsAgencyRequest, CreateCertificateAuthorityObsAgencyResponse> createCertificateAuthorityObsAgencyInvoker(
        CreateCertificateAuthorityObsAgencyRequest request) {
        return new SyncInvoker<CreateCertificateAuthorityObsAgencyRequest, CreateCertificateAuthorityObsAgencyResponse>(
            request, CcmMeta.createCertificateAuthorityObsAgency, hcClient);
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateCertificateByCsrRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateCertificateByCsrRequest 请求对象
     * @return SyncInvoker<CreateCertificateByCsrRequest, CreateCertificateByCsrResponse>
     */
    public SyncInvoker<CreateCertificateByCsrRequest, CreateCertificateByCsrResponse> createCertificateByCsrInvoker(
        CreateCertificateByCsrRequest request) {
        return new SyncInvoker<CreateCertificateByCsrRequest, CreateCertificateByCsrResponse>(request,
            CcmMeta.createCertificateByCsr, hcClient);
    }

    /**
     * 删除证书
     *
     * 删除证书。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateInvoker(
        DeleteCertificateRequest request) {
        return new SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request, CcmMeta.deleteCertificate,
            hcClient);
    }

    /**
     * 导出证书
     *
     * 导出证书。
     *   - 选择是否压缩时，分以下两种情况：
     *     - is_compressed为true时，返回文件压缩包，命名为：证书名称_type字段小写字母.zip，如”test_apache.zip“。
     *       - type &#x3D; \&quot;**APACHE**\&quot;时，压缩包中包含三个文件：**server.key**（密钥文件，内容为PEM格式）、**chain.crt**（证书链，内容为PEM格式）、**server.crt**（证书，内容为PEM格式）；
     *       - type &#x3D; \&quot;**IIS**\&quot;时，压缩包中包含两个文件：**keystorePass.txt**（keystore口令）、**server.pfx**（PFX证书，证书与证书链包含在同一个文件）；
     *       - type &#x3D; \&quot;**NGINX**\&quot;时，压缩包中包含两个文件：**server.key**（密钥文件，内容为PEM格式）、**server.crt**（内容为PEM格式，证书与证书链包含在同一个文件）；
     *       - type &#x3D; \&quot;**TOMCAT**\&quot;时，压缩包中包含两个文件：**keystorePass.txt**（keystore口令）、**server.jks**（JKX证书，证书与证书链包含在同一个文件）；
     *       - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含三个文件：**server.key**（密钥文件，内容为PEM格式）、**chain.pem**（证书链）、**server.pem**（证书）。
     *     - is_compressed为false时，返回json格式，返回的具体参数如下：
     *       - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**OTHER**\&quot;时，返回参数如下：
     *         - **certificate**（证书内容，PEM格式）；
     *         - **certificate_chain**（证书链，PEM格式）；
     *         - **private_key**（证书私钥，PEM格式）；
     *       - type &#x3D; \&quot;**IIS**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义。
     * &gt; 只有当证书状态为“已签发”时，可进行导出操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportCertificateRequest 请求对象
     * @return ExportCertificateResponse
     */
    public ExportCertificateResponse exportCertificate(ExportCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CcmMeta.exportCertificate);
    }

    /**
     * 导出证书
     *
     * 导出证书。
     *   - 选择是否压缩时，分以下两种情况：
     *     - is_compressed为true时，返回文件压缩包，命名为：证书名称_type字段小写字母.zip，如”test_apache.zip“。
     *       - type &#x3D; \&quot;**APACHE**\&quot;时，压缩包中包含三个文件：**server.key**（密钥文件，内容为PEM格式）、**chain.crt**（证书链，内容为PEM格式）、**server.crt**（证书，内容为PEM格式）；
     *       - type &#x3D; \&quot;**IIS**\&quot;时，压缩包中包含两个文件：**keystorePass.txt**（keystore口令）、**server.pfx**（PFX证书，证书与证书链包含在同一个文件）；
     *       - type &#x3D; \&quot;**NGINX**\&quot;时，压缩包中包含两个文件：**server.key**（密钥文件，内容为PEM格式）、**server.crt**（内容为PEM格式，证书与证书链包含在同一个文件）；
     *       - type &#x3D; \&quot;**TOMCAT**\&quot;时，压缩包中包含两个文件：**keystorePass.txt**（keystore口令）、**server.jks**（JKX证书，证书与证书链包含在同一个文件）；
     *       - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含三个文件：**server.key**（密钥文件，内容为PEM格式）、**chain.pem**（证书链）、**server.pem**（证书）。
     *     - is_compressed为false时，返回json格式，返回的具体参数如下：
     *       - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**OTHER**\&quot;时，返回参数如下：
     *         - **certificate**（证书内容，PEM格式）；
     *         - **certificate_chain**（证书链，PEM格式）；
     *         - **private_key**（证书私钥，PEM格式）；
     *       - type &#x3D; \&quot;**IIS**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义。
     * &gt; 只有当证书状态为“已签发”时，可进行导出操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportCertificateRequest 请求对象
     * @return SyncInvoker<ExportCertificateRequest, ExportCertificateResponse>
     */
    public SyncInvoker<ExportCertificateRequest, ExportCertificateResponse> exportCertificateInvoker(
        ExportCertificateRequest request) {
        return new SyncInvoker<ExportCertificateRequest, ExportCertificateResponse>(request, CcmMeta.exportCertificate,
            hcClient);
    }

    /**
     * 查询私有证书列表
     *
     * 查询私有证书列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCertificateRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCertificateRequest 请求对象
     * @return SyncInvoker<ListCertificateRequest, ListCertificateResponse>
     */
    public SyncInvoker<ListCertificateRequest, ListCertificateResponse> listCertificateInvoker(
        ListCertificateRequest request) {
        return new SyncInvoker<ListCertificateRequest, ListCertificateResponse>(request, CcmMeta.listCertificate,
            hcClient);
    }

    /**
     * 查询OBS桶列表
     *
     * 查询OBS桶列表。
     * &gt; 只有用户创建了委托授权，方可使用此接口。创建委托授权参见本文档：**证书吊销处理&gt;创建委托**。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCertificateAuthorityObsBucketRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCertificateAuthorityObsBucketRequest 请求对象
     * @return SyncInvoker<ListCertificateAuthorityObsBucketRequest, ListCertificateAuthorityObsBucketResponse>
     */
    public SyncInvoker<ListCertificateAuthorityObsBucketRequest, ListCertificateAuthorityObsBucketResponse> listCertificateAuthorityObsBucketInvoker(
        ListCertificateAuthorityObsBucketRequest request) {
        return new SyncInvoker<ListCertificateAuthorityObsBucketRequest, ListCertificateAuthorityObsBucketResponse>(
            request, CcmMeta.listCertificateAuthorityObsBucket, hcClient);
    }

    /**
     * 解析CSR
     *
     * 解析CSR。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ParseCertificateSigningRequestRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ParseCertificateSigningRequestRequest 请求对象
     * @return SyncInvoker<ParseCertificateSigningRequestRequest, ParseCertificateSigningRequestResponse>
     */
    public SyncInvoker<ParseCertificateSigningRequestRequest, ParseCertificateSigningRequestResponse> parseCertificateSigningRequestInvoker(
        ParseCertificateSigningRequestRequest request) {
        return new SyncInvoker<ParseCertificateSigningRequestRequest, ParseCertificateSigningRequestResponse>(request,
            CcmMeta.parseCertificateSigningRequest, hcClient);
    }

    /**
     * 吊销证书
     *
     * 吊销证书。
     * &gt; 注：当不想填写吊销理由时，请求body体请置为\&quot;**{}**\&quot;，否则将会报错。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RevokeCertificateRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RevokeCertificateRequest 请求对象
     * @return SyncInvoker<RevokeCertificateRequest, RevokeCertificateResponse>
     */
    public SyncInvoker<RevokeCertificateRequest, RevokeCertificateResponse> revokeCertificateInvoker(
        RevokeCertificateRequest request) {
        return new SyncInvoker<RevokeCertificateRequest, RevokeCertificateResponse>(request, CcmMeta.revokeCertificate,
            hcClient);
    }

    /**
     * 查询证书详情
     *
     * 查询证书详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCertificateRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCertificateRequest 请求对象
     * @return SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public SyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateInvoker(
        ShowCertificateRequest request) {
        return new SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>(request, CcmMeta.showCertificate,
            hcClient);
    }

    /**
     * 查看是否具有委托权限
     *
     * 查看是否具有委托权限。
     * &gt; 用户所使用账号token需要具备安全管理员（secu_admin）权限。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCertificateAuthorityObsAgencyRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCertificateAuthorityObsAgencyRequest 请求对象
     * @return SyncInvoker<ShowCertificateAuthorityObsAgencyRequest, ShowCertificateAuthorityObsAgencyResponse>
     */
    public SyncInvoker<ShowCertificateAuthorityObsAgencyRequest, ShowCertificateAuthorityObsAgencyResponse> showCertificateAuthorityObsAgencyInvoker(
        ShowCertificateAuthorityObsAgencyRequest request) {
        return new SyncInvoker<ShowCertificateAuthorityObsAgencyRequest, ShowCertificateAuthorityObsAgencyResponse>(
            request, CcmMeta.showCertificateAuthorityObsAgency, hcClient);
    }

    /**
     * 查询私有证书配额
     *
     * 查询私有证书配额。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCertificateQuotaRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCertificateQuotaRequest 请求对象
     * @return SyncInvoker<ShowCertificateQuotaRequest, ShowCertificateQuotaResponse>
     */
    public SyncInvoker<ShowCertificateQuotaRequest, ShowCertificateQuotaResponse> showCertificateQuotaInvoker(
        ShowCertificateQuotaRequest request) {
        return new SyncInvoker<ShowCertificateQuotaRequest, ShowCertificateQuotaResponse>(request,
            CcmMeta.showCertificateQuota, hcClient);
    }

    /**
     * 创建CA
     *
     * 创建CA，分以下三种情况：
     * - 创建根CA，根据参数介绍中，填写必选值；
     * - 创建从属CA，并需要直接激活该证书，根据参数介绍中，填写必选值；
     * - 创建从属CA，不需要直接激活该证书，请求body中只需要缺少此三个参数之一即可：issuer_id、signature_algorithm、validity。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateCertificateAuthorityRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse>
     */
    public SyncInvoker<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse> createCertificateAuthorityInvoker(
        CreateCertificateAuthorityRequest request) {
        return new SyncInvoker<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse>(request,
            CcmMeta.createCertificateAuthority, hcClient);
    }

    /**
     * 删除CA
     *
     * 计划删除CA。计划多少天后删除CA证书，可设置7天～30天内删除。
     * &gt; 只有当证书状态为”待激活“或”已禁用“状态时，才可删除。”待激活“状态下，将会立即删除证书，不支持延迟删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteCertificateAuthorityRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResponse>
     */
    public SyncInvoker<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResponse> deleteCertificateAuthorityInvoker(
        DeleteCertificateAuthorityRequest request) {
        return new SyncInvoker<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResponse>(request,
            CcmMeta.deleteCertificateAuthority, hcClient);
    }

    /**
     * 禁用CA
     *
     * 禁用CA。
     * &gt; 只有当证书处于\&quot;已激活\&quot;或\&quot;已过期\&quot;状态时，可进行禁用操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisableCertificateAuthorityRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisableCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<DisableCertificateAuthorityRequest, DisableCertificateAuthorityResponse>
     */
    public SyncInvoker<DisableCertificateAuthorityRequest, DisableCertificateAuthorityResponse> disableCertificateAuthorityInvoker(
        DisableCertificateAuthorityRequest request) {
        return new SyncInvoker<DisableCertificateAuthorityRequest, DisableCertificateAuthorityResponse>(request,
            CcmMeta.disableCertificateAuthority, hcClient);
    }

    /**
     * 启用CA
     *
     * 启用CA。
     * &gt; 注：只有当证书处于\&quot;已禁用\&quot;状态时，可进行启用操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EnableCertificateAuthorityRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EnableCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<EnableCertificateAuthorityRequest, EnableCertificateAuthorityResponse>
     */
    public SyncInvoker<EnableCertificateAuthorityRequest, EnableCertificateAuthorityResponse> enableCertificateAuthorityInvoker(
        EnableCertificateAuthorityRequest request) {
        return new SyncInvoker<EnableCertificateAuthorityRequest, EnableCertificateAuthorityResponse>(request,
            CcmMeta.enableCertificateAuthority, hcClient);
    }

    /**
     * 导出CA证书
     *
     * 导出CA证书。
     * &gt; 注：只有当证书处于\&quot;已激活\&quot;或\&quot;已过期\&quot;时，可进行导出操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportCertificateAuthorityCertificateRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportCertificateAuthorityCertificateRequest 请求对象
     * @return SyncInvoker<ExportCertificateAuthorityCertificateRequest, ExportCertificateAuthorityCertificateResponse>
     */
    public SyncInvoker<ExportCertificateAuthorityCertificateRequest, ExportCertificateAuthorityCertificateResponse> exportCertificateAuthorityCertificateInvoker(
        ExportCertificateAuthorityCertificateRequest request) {
        return new SyncInvoker<ExportCertificateAuthorityCertificateRequest, ExportCertificateAuthorityCertificateResponse>(
            request, CcmMeta.exportCertificateAuthorityCertificate, hcClient);
    }

    /**
     * 导出CA的证书签名请求（CSR）
     *
     * 导出CA的证书签名请求。
     * &gt; 只有当CA处于\&quot;待激活\&quot;状态时，可导出证书签名请求。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportCertificateAuthorityCsrRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportCertificateAuthorityCsrRequest 请求对象
     * @return SyncInvoker<ExportCertificateAuthorityCsrRequest, ExportCertificateAuthorityCsrResponse>
     */
    public SyncInvoker<ExportCertificateAuthorityCsrRequest, ExportCertificateAuthorityCsrResponse> exportCertificateAuthorityCsrInvoker(
        ExportCertificateAuthorityCsrRequest request) {
        return new SyncInvoker<ExportCertificateAuthorityCsrRequest, ExportCertificateAuthorityCsrResponse>(request,
            CcmMeta.exportCertificateAuthorityCsr, hcClient);
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ImportCertificateAuthorityCertificateRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ImportCertificateAuthorityCertificateRequest 请求对象
     * @return SyncInvoker<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResponse>
     */
    public SyncInvoker<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResponse> importCertificateAuthorityCertificateInvoker(
        ImportCertificateAuthorityCertificateRequest request) {
        return new SyncInvoker<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResponse>(
            request, CcmMeta.importCertificateAuthorityCertificate, hcClient);
    }

    /**
     * 激活CA
     *
     * 激活CA。
     * &gt; 只有当证书处于\&quot;待激活\&quot;状态时，可进行激活操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param IssueCertificateAuthorityCertificateRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param IssueCertificateAuthorityCertificateRequest 请求对象
     * @return SyncInvoker<IssueCertificateAuthorityCertificateRequest, IssueCertificateAuthorityCertificateResponse>
     */
    public SyncInvoker<IssueCertificateAuthorityCertificateRequest, IssueCertificateAuthorityCertificateResponse> issueCertificateAuthorityCertificateInvoker(
        IssueCertificateAuthorityCertificateRequest request) {
        return new SyncInvoker<IssueCertificateAuthorityCertificateRequest, IssueCertificateAuthorityCertificateResponse>(
            request, CcmMeta.issueCertificateAuthorityCertificate, hcClient);
    }

    /**
     * 查询CA列表
     *
     * 查询CA列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCertificateAuthorityRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<ListCertificateAuthorityRequest, ListCertificateAuthorityResponse>
     */
    public SyncInvoker<ListCertificateAuthorityRequest, ListCertificateAuthorityResponse> listCertificateAuthorityInvoker(
        ListCertificateAuthorityRequest request) {
        return new SyncInvoker<ListCertificateAuthorityRequest, ListCertificateAuthorityResponse>(request,
            CcmMeta.listCertificateAuthority, hcClient);
    }

    /**
     * 恢复CA
     *
     * 恢复CA，将处于“计划删除”状态的CA证书，重新恢复为“已禁用”状态。
     * &gt; 注：只有处于“计划删除”状态的CA证书，才可进行恢复操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestoreCertificateAuthorityRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestoreCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResponse>
     */
    public SyncInvoker<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResponse> restoreCertificateAuthorityInvoker(
        RestoreCertificateAuthorityRequest request) {
        return new SyncInvoker<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResponse>(request,
            CcmMeta.restoreCertificateAuthority, hcClient);
    }

    /**
     * 吊销CA
     *
     * 吊销子CA。
     * &gt; 注：当不想填写吊销理由时，请求body体请置为\&quot;**{}**\&quot;，否则将会报错。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RevokeCertificateAuthorityRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RevokeCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<RevokeCertificateAuthorityRequest, RevokeCertificateAuthorityResponse>
     */
    public SyncInvoker<RevokeCertificateAuthorityRequest, RevokeCertificateAuthorityResponse> revokeCertificateAuthorityInvoker(
        RevokeCertificateAuthorityRequest request) {
        return new SyncInvoker<RevokeCertificateAuthorityRequest, RevokeCertificateAuthorityResponse>(request,
            CcmMeta.revokeCertificateAuthority, hcClient);
    }

    /**
     * 查询CA详情
     *
     * 查询CA详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCertificateAuthorityRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCertificateAuthorityRequest 请求对象
     * @return SyncInvoker<ShowCertificateAuthorityRequest, ShowCertificateAuthorityResponse>
     */
    public SyncInvoker<ShowCertificateAuthorityRequest, ShowCertificateAuthorityResponse> showCertificateAuthorityInvoker(
        ShowCertificateAuthorityRequest request) {
        return new SyncInvoker<ShowCertificateAuthorityRequest, ShowCertificateAuthorityResponse>(request,
            CcmMeta.showCertificateAuthority, hcClient);
    }

    /**
     * 查询CA配额
     *
     * 查询CA证书配额。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCertificateAuthorityQuotaRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCertificateAuthorityQuotaRequest 请求对象
     * @return SyncInvoker<ShowCertificateAuthorityQuotaRequest, ShowCertificateAuthorityQuotaResponse>
     */
    public SyncInvoker<ShowCertificateAuthorityQuotaRequest, ShowCertificateAuthorityQuotaResponse> showCertificateAuthorityQuotaInvoker(
        ShowCertificateAuthorityQuotaRequest request) {
        return new SyncInvoker<ShowCertificateAuthorityQuotaRequest, ShowCertificateAuthorityQuotaResponse>(request,
            CcmMeta.showCertificateAuthorityQuota, hcClient);
    }

}
