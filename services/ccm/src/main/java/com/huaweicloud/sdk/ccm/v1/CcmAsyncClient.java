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

    /**
     * 申请证书
     *
     * 申请证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCertificateRequest 请求对象
     * @return CompletableFuture<CreateCertificateResponse>
     */
    public CompletableFuture<CreateCertificateResponse> createCertificateAsync(CreateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.createCertificate);
    }

    /**
     * 申请证书
     *
     * 申请证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCertificateRequest 请求对象
     * @return AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateAsyncInvoker(
        CreateCertificateRequest request) {
        return new AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse>(request, CcmMeta.createCertificate,
            hcClient);
    }

    /**
     * 创建委托
     *
     * 用户给PCA创建OBS委托授权，用于访问OBS桶，更新吊销列表。
     * &gt; 用户所使用账号token需要具备安全管理员（secu_admin）权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCertificateAuthorityObsAgencyRequest 请求对象
     * @return CompletableFuture<CreateCertificateAuthorityObsAgencyResponse>
     */
    public CompletableFuture<CreateCertificateAuthorityObsAgencyResponse> createCertificateAuthorityObsAgencyAsync(
        CreateCertificateAuthorityObsAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.createCertificateAuthorityObsAgency);
    }

    /**
     * 创建委托
     *
     * 用户给PCA创建OBS委托授权，用于访问OBS桶，更新吊销列表。
     * &gt; 用户所使用账号token需要具备安全管理员（secu_admin）权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCertificateAuthorityObsAgencyRequest 请求对象
     * @return AsyncInvoker<CreateCertificateAuthorityObsAgencyRequest, CreateCertificateAuthorityObsAgencyResponse>
     */
    public AsyncInvoker<CreateCertificateAuthorityObsAgencyRequest, CreateCertificateAuthorityObsAgencyResponse> createCertificateAuthorityObsAgencyAsyncInvoker(
        CreateCertificateAuthorityObsAgencyRequest request) {
        return new AsyncInvoker<CreateCertificateAuthorityObsAgencyRequest, CreateCertificateAuthorityObsAgencyResponse>(
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCertificateByCsrRequest 请求对象
     * @return CompletableFuture<CreateCertificateByCsrResponse>
     */
    public CompletableFuture<CreateCertificateByCsrResponse> createCertificateByCsrAsync(
        CreateCertificateByCsrRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.createCertificateByCsr);
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
     * @param CreateCertificateByCsrRequest 请求对象
     * @return AsyncInvoker<CreateCertificateByCsrRequest, CreateCertificateByCsrResponse>
     */
    public AsyncInvoker<CreateCertificateByCsrRequest, CreateCertificateByCsrResponse> createCertificateByCsrAsyncInvoker(
        CreateCertificateByCsrRequest request) {
        return new AsyncInvoker<CreateCertificateByCsrRequest, CreateCertificateByCsrResponse>(request,
            CcmMeta.createCertificateByCsr, hcClient);
    }

    /**
     * 删除证书
     *
     * 删除证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return CompletableFuture<DeleteCertificateResponse>
     */
    public CompletableFuture<DeleteCertificateResponse> deleteCertificateAsync(DeleteCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.deleteCertificate);
    }

    /**
     * 删除证书
     *
     * 删除证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateAsyncInvoker(
        DeleteCertificateRequest request) {
        return new AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request, CcmMeta.deleteCertificate,
            hcClient);
    }

    /**
     * 禁用CRL
     *
     * 禁用当前CA的CRL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableCertificateAuthorityCrlRequest 请求对象
     * @return CompletableFuture<DisableCertificateAuthorityCrlResponse>
     */
    public CompletableFuture<DisableCertificateAuthorityCrlResponse> disableCertificateAuthorityCrlAsync(
        DisableCertificateAuthorityCrlRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.disableCertificateAuthorityCrl);
    }

    /**
     * 禁用CRL
     *
     * 禁用当前CA的CRL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableCertificateAuthorityCrlRequest 请求对象
     * @return AsyncInvoker<DisableCertificateAuthorityCrlRequest, DisableCertificateAuthorityCrlResponse>
     */
    public AsyncInvoker<DisableCertificateAuthorityCrlRequest, DisableCertificateAuthorityCrlResponse> disableCertificateAuthorityCrlAsyncInvoker(
        DisableCertificateAuthorityCrlRequest request) {
        return new AsyncInvoker<DisableCertificateAuthorityCrlRequest, DisableCertificateAuthorityCrlResponse>(request,
            CcmMeta.disableCertificateAuthorityCrl, hcClient);
    }

    /**
     * 启用CRL
     *
     * 启用当前CA的CRL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableCertificateAuthorityCrlRequest 请求对象
     * @return CompletableFuture<EnableCertificateAuthorityCrlResponse>
     */
    public CompletableFuture<EnableCertificateAuthorityCrlResponse> enableCertificateAuthorityCrlAsync(
        EnableCertificateAuthorityCrlRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.enableCertificateAuthorityCrl);
    }

    /**
     * 启用CRL
     *
     * 启用当前CA的CRL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableCertificateAuthorityCrlRequest 请求对象
     * @return AsyncInvoker<EnableCertificateAuthorityCrlRequest, EnableCertificateAuthorityCrlResponse>
     */
    public AsyncInvoker<EnableCertificateAuthorityCrlRequest, EnableCertificateAuthorityCrlResponse> enableCertificateAuthorityCrlAsyncInvoker(
        EnableCertificateAuthorityCrlRequest request) {
        return new AsyncInvoker<EnableCertificateAuthorityCrlRequest, EnableCertificateAuthorityCrlResponse>(request,
            CcmMeta.enableCertificateAuthorityCrl, hcClient);
    }

    /**
     * 导出证书
     *
     * 导出证书。
     *   - 国际算法
     *     - 选择是否压缩时，分以下两种情况：
     *       - is_compressed为true时，返回文件压缩包，命名为：证书名称_type字段小写字母.zip，如”test_apache.zip“。
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;时，压缩包中包含三个文件：**server.key**（密钥文件，内容为PEM格式）、**chain.crt**（证书链，内容为PEM格式）、**server.crt**（证书，内容为PEM格式）；
     *           - type &#x3D; \&quot;**IIS**\&quot;时，压缩包中包含两个文件：**keystorePass.txt**（keystore口令）、**server.pfx**（PFX证书，证书与证书链包含在同一个文件）；
     *           - type &#x3D; \&quot;**NGINX**\&quot;时，压缩包中包含两个文件：**server.key**（密钥文件，内容为PEM格式）、**server.crt**（内容为PEM格式，证书与证书链包含在同一个文件）；
     *           - type &#x3D; \&quot;**TOMCAT**\&quot;时，压缩包中包含两个文件：**keystorePass.txt**（keystore口令）、**server.jks**（JKX证书，证书与证书链包含在同一个文件）；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含三个文件：**server.key**（密钥文件，内容为PEM格式）、**chain.pem**（证书链）、**server.pem**（证书）。
     *         - 导入CSR签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**TOMCAT**\&quot;时，压缩包中包含两个文件：**chain.crt**（证书链，内容为PEM格式）、**server.crt**（证书，内容为PEM格式）；
     *           - type &#x3D; \&quot;**NGINX**\&quot;时，压缩包中包含一个文件：**server.crt**（证书，内容为PEM格式）；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含两个文件：**chain.pem**（证书链，内容为PEM格式）、**cert.pem**（证书，内容为PEM格式）。
     *       - is_compressed为false时，返回json格式，返回的具体参数如下：
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**OTHER**\&quot;时，返回参数如下：
     *             - **certificate**（证书内容，PEM格式）；
     *             - **certificate_chain**（证书链，PEM格式）；
     *             - **private_key**（证书私钥，PEM格式）；
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
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含五个文件：**chain.pem**（证书链，内容为PEM格式）、**signCert.key**（签名证书密钥文件，内容为PEM格式）、**signCert.pem**（签名证书，内容为PEM格式）、**encSm2EnvelopedKey.key**（加密证书的国密标准SM2数字信封文件，内容为BASE64编码）、**encCert.pem**（加密证书，内容为PEM格式）。
     *         - 导入CSR签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含四个文件：**chain.pem**（证书链，内容为PEM格式）、**signCert.pem**（签名证书，内容为PEM格式）、**encSm2EnvelopedKey.key**（加密证书的国密标准SM2数字信封文件，内容为BASE64编码）、**encCert.pem**（加密证书，内容为PEM格式）。
     *       - is_compressed为true、is_sm_standard为false时，返回文件压缩包，命名为：证书名称_type字段小写字母.zip，如”test_apache.zip“。
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含五个文件：**chain.pem**（证书链，内容为PEM格式）、**signCert.key**（签名证书密钥文件，内容为PEM格式）、**signCert.pem**（签名证书，内容为PEM格式）、**encCert.key**（加密证书密钥文件，内容为PEM格式）、**encCert.pem**（加密证书，内容为PEM格式）。
     *         - 导入CSR签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含四个文件：**chain.pem**（证书链，内容为PEM格式）、**signCert.pem**（签名证书，内容为PEM格式）、**encCert.key**（加密证书密钥文件，内容为PEM格式）、**encCert.pem**（加密证书，内容为PEM格式）。
     *       - is_compressed为false、is_sm_standard为true时，返回json格式，返回的具体参数如下：
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，返回参数如下：
     *             - **certificate_chain**（证书链，PEM格式）；
     *             - **certificate**（签名证书内容，PEM格式）；
     *             - **private_key**（签名证书私钥，PEM格式）；
     *             - **enc_certificate**（加密证书内容，PEM格式）；
     *             - **enc_sm2_enveloped_key**（加密证书的国密GMT0009标准规范SM2数字信封文件，BASE64编码）。
     *         - 导入CSR签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，返回参数如下：
     *             - **certificate_chain**（证书链，PEM格式）；
     *             - **certificate**（签名证书内容，PEM格式）；
     *             - **enc_certificate**（加密证书内容，PEM格式）；
     *             - **enc_sm2_enveloped_key**（加密证书的国密GMT0009标准规范SM2数字信封文件，BASE64编码）。
     *       - is_compressed为false、is_sm_standard为false时，返回json格式，返回的具体参数如下：
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，返回参数如下：
     *             - **certificate_chain**（证书链，PEM格式）；
     *             - **certificate**（签名证书内容，PEM格式）；
     *             - **private_key**（签名证书私钥，PEM格式）；
     *             - **enc_certificate**（加密证书内容，PEM格式）；
     *             - **enc_private_key**（加密证书私钥，PEM格式）。
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
     * @param ExportCertificateRequest 请求对象
     * @return CompletableFuture<ExportCertificateResponse>
     */
    public CompletableFuture<ExportCertificateResponse> exportCertificateAsync(ExportCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.exportCertificate);
    }

    /**
     * 导出证书
     *
     * 导出证书。
     *   - 国际算法
     *     - 选择是否压缩时，分以下两种情况：
     *       - is_compressed为true时，返回文件压缩包，命名为：证书名称_type字段小写字母.zip，如”test_apache.zip“。
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;时，压缩包中包含三个文件：**server.key**（密钥文件，内容为PEM格式）、**chain.crt**（证书链，内容为PEM格式）、**server.crt**（证书，内容为PEM格式）；
     *           - type &#x3D; \&quot;**IIS**\&quot;时，压缩包中包含两个文件：**keystorePass.txt**（keystore口令）、**server.pfx**（PFX证书，证书与证书链包含在同一个文件）；
     *           - type &#x3D; \&quot;**NGINX**\&quot;时，压缩包中包含两个文件：**server.key**（密钥文件，内容为PEM格式）、**server.crt**（内容为PEM格式，证书与证书链包含在同一个文件）；
     *           - type &#x3D; \&quot;**TOMCAT**\&quot;时，压缩包中包含两个文件：**keystorePass.txt**（keystore口令）、**server.jks**（JKX证书，证书与证书链包含在同一个文件）；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含三个文件：**server.key**（密钥文件，内容为PEM格式）、**chain.pem**（证书链）、**server.pem**（证书）。
     *         - 导入CSR签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**TOMCAT**\&quot;时，压缩包中包含两个文件：**chain.crt**（证书链，内容为PEM格式）、**server.crt**（证书，内容为PEM格式）；
     *           - type &#x3D; \&quot;**NGINX**\&quot;时，压缩包中包含一个文件：**server.crt**（证书，内容为PEM格式）；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含两个文件：**chain.pem**（证书链，内容为PEM格式）、**cert.pem**（证书，内容为PEM格式）。
     *       - is_compressed为false时，返回json格式，返回的具体参数如下：
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**OTHER**\&quot;时，返回参数如下：
     *             - **certificate**（证书内容，PEM格式）；
     *             - **certificate_chain**（证书链，PEM格式）；
     *             - **private_key**（证书私钥，PEM格式）；
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
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含五个文件：**chain.pem**（证书链，内容为PEM格式）、**signCert.key**（签名证书密钥文件，内容为PEM格式）、**signCert.pem**（签名证书，内容为PEM格式）、**encSm2EnvelopedKey.key**（加密证书的国密标准SM2数字信封文件，内容为BASE64编码）、**encCert.pem**（加密证书，内容为PEM格式）。
     *         - 导入CSR签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含四个文件：**chain.pem**（证书链，内容为PEM格式）、**signCert.pem**（签名证书，内容为PEM格式）、**encSm2EnvelopedKey.key**（加密证书的国密标准SM2数字信封文件，内容为BASE64编码）、**encCert.pem**（加密证书，内容为PEM格式）。
     *       - is_compressed为true、is_sm_standard为false时，返回文件压缩包，命名为：证书名称_type字段小写字母.zip，如”test_apache.zip“。
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含五个文件：**chain.pem**（证书链，内容为PEM格式）、**signCert.key**（签名证书密钥文件，内容为PEM格式）、**signCert.pem**（签名证书，内容为PEM格式）、**encCert.key**（加密证书密钥文件，内容为PEM格式）、**encCert.pem**（加密证书，内容为PEM格式）。
     *         - 导入CSR签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，压缩包中包含四个文件：**chain.pem**（证书链，内容为PEM格式）、**signCert.pem**（签名证书，内容为PEM格式）、**encCert.key**（加密证书密钥文件，内容为PEM格式）、**encCert.pem**（加密证书，内容为PEM格式）。
     *       - is_compressed为false、is_sm_standard为true时，返回json格式，返回的具体参数如下：
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，返回参数如下：
     *             - **certificate_chain**（证书链，PEM格式）；
     *             - **certificate**（签名证书内容，PEM格式）；
     *             - **private_key**（签名证书私钥，PEM格式）；
     *             - **enc_certificate**（加密证书内容，PEM格式）；
     *             - **enc_sm2_enveloped_key**（加密证书的国密GMT0009标准规范SM2数字信封文件，BASE64编码）。
     *         - 导入CSR签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，返回参数如下：
     *             - **certificate_chain**（证书链，PEM格式）；
     *             - **certificate**（签名证书内容，PEM格式）；
     *             - **enc_certificate**（加密证书内容，PEM格式）；
     *             - **enc_sm2_enveloped_key**（加密证书的国密GMT0009标准规范SM2数字信封文件，BASE64编码）。
     *       - is_compressed为false、is_sm_standard为false时，返回json格式，返回的具体参数如下：
     *         - 系统生成密钥签发证书
     *           - type &#x3D; \&quot;**APACHE**\&quot;或\&quot;**IIS**\&quot;或\&quot;**NGINX**\&quot;或\&quot;**TOMCAT**\&quot;时，暂时未定义；
     *           - type &#x3D; \&quot;**OTHER**\&quot;时，返回参数如下：
     *             - **certificate_chain**（证书链，PEM格式）；
     *             - **certificate**（签名证书内容，PEM格式）；
     *             - **private_key**（签名证书私钥，PEM格式）；
     *             - **enc_certificate**（加密证书内容，PEM格式）；
     *             - **enc_private_key**（加密证书私钥，PEM格式）。
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
     * @param ExportCertificateRequest 请求对象
     * @return AsyncInvoker<ExportCertificateRequest, ExportCertificateResponse>
     */
    public AsyncInvoker<ExportCertificateRequest, ExportCertificateResponse> exportCertificateAsyncInvoker(
        ExportCertificateRequest request) {
        return new AsyncInvoker<ExportCertificateRequest, ExportCertificateResponse>(request, CcmMeta.exportCertificate,
            hcClient);
    }

    /**
     * 查询私有证书列表
     *
     * 查询私有证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCertificateRequest 请求对象
     * @return CompletableFuture<ListCertificateResponse>
     */
    public CompletableFuture<ListCertificateResponse> listCertificateAsync(ListCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.listCertificate);
    }

    /**
     * 查询私有证书列表
     *
     * 查询私有证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCertificateRequest 请求对象
     * @return AsyncInvoker<ListCertificateRequest, ListCertificateResponse>
     */
    public AsyncInvoker<ListCertificateRequest, ListCertificateResponse> listCertificateAsyncInvoker(
        ListCertificateRequest request) {
        return new AsyncInvoker<ListCertificateRequest, ListCertificateResponse>(request, CcmMeta.listCertificate,
            hcClient);
    }

    /**
     * 查询OBS桶列表
     *
     * 查询OBS桶列表。
     * &gt; 只有用户创建了委托授权，方可使用此接口。创建委托授权参见本文档：**证书吊销处理&gt;创建委托**。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCertificateAuthorityObsBucketRequest 请求对象
     * @return CompletableFuture<ListCertificateAuthorityObsBucketResponse>
     */
    public CompletableFuture<ListCertificateAuthorityObsBucketResponse> listCertificateAuthorityObsBucketAsync(
        ListCertificateAuthorityObsBucketRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.listCertificateAuthorityObsBucket);
    }

    /**
     * 查询OBS桶列表
     *
     * 查询OBS桶列表。
     * &gt; 只有用户创建了委托授权，方可使用此接口。创建委托授权参见本文档：**证书吊销处理&gt;创建委托**。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCertificateAuthorityObsBucketRequest 请求对象
     * @return AsyncInvoker<ListCertificateAuthorityObsBucketRequest, ListCertificateAuthorityObsBucketResponse>
     */
    public AsyncInvoker<ListCertificateAuthorityObsBucketRequest, ListCertificateAuthorityObsBucketResponse> listCertificateAuthorityObsBucketAsyncInvoker(
        ListCertificateAuthorityObsBucketRequest request) {
        return new AsyncInvoker<ListCertificateAuthorityObsBucketRequest, ListCertificateAuthorityObsBucketResponse>(
            request, CcmMeta.listCertificateAuthorityObsBucket, hcClient);
    }

    /**
     * 解析CSR
     *
     * 解析CSR。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ParseCertificateSigningRequestRequest 请求对象
     * @return CompletableFuture<ParseCertificateSigningRequestResponse>
     */
    public CompletableFuture<ParseCertificateSigningRequestResponse> parseCertificateSigningRequestAsync(
        ParseCertificateSigningRequestRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.parseCertificateSigningRequest);
    }

    /**
     * 解析CSR
     *
     * 解析CSR。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ParseCertificateSigningRequestRequest 请求对象
     * @return AsyncInvoker<ParseCertificateSigningRequestRequest, ParseCertificateSigningRequestResponse>
     */
    public AsyncInvoker<ParseCertificateSigningRequestRequest, ParseCertificateSigningRequestResponse> parseCertificateSigningRequestAsyncInvoker(
        ParseCertificateSigningRequestRequest request) {
        return new AsyncInvoker<ParseCertificateSigningRequestRequest, ParseCertificateSigningRequestResponse>(request,
            CcmMeta.parseCertificateSigningRequest, hcClient);
    }

    /**
     * 吊销证书
     *
     * 吊销证书。
     * &gt; 注：当不想填写吊销理由时，请求body体请置为\&quot;**{}**\&quot;，否则将会报错。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RevokeCertificateRequest 请求对象
     * @return CompletableFuture<RevokeCertificateResponse>
     */
    public CompletableFuture<RevokeCertificateResponse> revokeCertificateAsync(RevokeCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.revokeCertificate);
    }

    /**
     * 吊销证书
     *
     * 吊销证书。
     * &gt; 注：当不想填写吊销理由时，请求body体请置为\&quot;**{}**\&quot;，否则将会报错。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RevokeCertificateRequest 请求对象
     * @return AsyncInvoker<RevokeCertificateRequest, RevokeCertificateResponse>
     */
    public AsyncInvoker<RevokeCertificateRequest, RevokeCertificateResponse> revokeCertificateAsyncInvoker(
        RevokeCertificateRequest request) {
        return new AsyncInvoker<RevokeCertificateRequest, RevokeCertificateResponse>(request, CcmMeta.revokeCertificate,
            hcClient);
    }

    /**
     * 查询证书详情
     *
     * 查询证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertificateRequest 请求对象
     * @return CompletableFuture<ShowCertificateResponse>
     */
    public CompletableFuture<ShowCertificateResponse> showCertificateAsync(ShowCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.showCertificate);
    }

    /**
     * 查询证书详情
     *
     * 查询证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertificateRequest 请求对象
     * @return AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateAsyncInvoker(
        ShowCertificateRequest request) {
        return new AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse>(request, CcmMeta.showCertificate,
            hcClient);
    }

    /**
     * 查看是否具有委托权限
     *
     * 查看是否具有委托权限。
     * &gt; 用户所使用账号token需要具备安全管理员（secu_admin）权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertificateAuthorityObsAgencyRequest 请求对象
     * @return CompletableFuture<ShowCertificateAuthorityObsAgencyResponse>
     */
    public CompletableFuture<ShowCertificateAuthorityObsAgencyResponse> showCertificateAuthorityObsAgencyAsync(
        ShowCertificateAuthorityObsAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.showCertificateAuthorityObsAgency);
    }

    /**
     * 查看是否具有委托权限
     *
     * 查看是否具有委托权限。
     * &gt; 用户所使用账号token需要具备安全管理员（secu_admin）权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertificateAuthorityObsAgencyRequest 请求对象
     * @return AsyncInvoker<ShowCertificateAuthorityObsAgencyRequest, ShowCertificateAuthorityObsAgencyResponse>
     */
    public AsyncInvoker<ShowCertificateAuthorityObsAgencyRequest, ShowCertificateAuthorityObsAgencyResponse> showCertificateAuthorityObsAgencyAsyncInvoker(
        ShowCertificateAuthorityObsAgencyRequest request) {
        return new AsyncInvoker<ShowCertificateAuthorityObsAgencyRequest, ShowCertificateAuthorityObsAgencyResponse>(
            request, CcmMeta.showCertificateAuthorityObsAgency, hcClient);
    }

    /**
     * 查询私有证书配额
     *
     * 查询私有证书配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertificateQuotaRequest 请求对象
     * @return CompletableFuture<ShowCertificateQuotaResponse>
     */
    public CompletableFuture<ShowCertificateQuotaResponse> showCertificateQuotaAsync(
        ShowCertificateQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.showCertificateQuota);
    }

    /**
     * 查询私有证书配额
     *
     * 查询私有证书配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertificateQuotaRequest 请求对象
     * @return AsyncInvoker<ShowCertificateQuotaRequest, ShowCertificateQuotaResponse>
     */
    public AsyncInvoker<ShowCertificateQuotaRequest, ShowCertificateQuotaResponse> showCertificateQuotaAsyncInvoker(
        ShowCertificateQuotaRequest request) {
        return new AsyncInvoker<ShowCertificateQuotaRequest, ShowCertificateQuotaResponse>(request,
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCertificateAuthorityRequest 请求对象
     * @return CompletableFuture<CreateCertificateAuthorityResponse>
     */
    public CompletableFuture<CreateCertificateAuthorityResponse> createCertificateAuthorityAsync(
        CreateCertificateAuthorityRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.createCertificateAuthority);
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
     * @param CreateCertificateAuthorityRequest 请求对象
     * @return AsyncInvoker<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse>
     */
    public AsyncInvoker<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse> createCertificateAuthorityAsyncInvoker(
        CreateCertificateAuthorityRequest request) {
        return new AsyncInvoker<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse>(request,
            CcmMeta.createCertificateAuthority, hcClient);
    }

    /**
     * 删除CA
     *
     * 计划删除CA。计划多少天后删除CA证书，可设置7天～30天内删除。
     * &gt; 只有当证书状态为”待激活“或”已禁用“状态时，才可删除。”待激活“状态下，将会立即删除证书，不支持延迟删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCertificateAuthorityRequest 请求对象
     * @return CompletableFuture<DeleteCertificateAuthorityResponse>
     */
    public CompletableFuture<DeleteCertificateAuthorityResponse> deleteCertificateAuthorityAsync(
        DeleteCertificateAuthorityRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.deleteCertificateAuthority);
    }

    /**
     * 删除CA
     *
     * 计划删除CA。计划多少天后删除CA证书，可设置7天～30天内删除。
     * &gt; 只有当证书状态为”待激活“或”已禁用“状态时，才可删除。”待激活“状态下，将会立即删除证书，不支持延迟删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCertificateAuthorityRequest 请求对象
     * @return AsyncInvoker<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResponse>
     */
    public AsyncInvoker<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResponse> deleteCertificateAuthorityAsyncInvoker(
        DeleteCertificateAuthorityRequest request) {
        return new AsyncInvoker<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResponse>(request,
            CcmMeta.deleteCertificateAuthority, hcClient);
    }

    /**
     * 禁用CA
     *
     * 禁用CA。
     * &gt; 只有当证书处于\&quot;已激活\&quot;或\&quot;已过期\&quot;状态时，可进行禁用操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableCertificateAuthorityRequest 请求对象
     * @return CompletableFuture<DisableCertificateAuthorityResponse>
     */
    public CompletableFuture<DisableCertificateAuthorityResponse> disableCertificateAuthorityAsync(
        DisableCertificateAuthorityRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.disableCertificateAuthority);
    }

    /**
     * 禁用CA
     *
     * 禁用CA。
     * &gt; 只有当证书处于\&quot;已激活\&quot;或\&quot;已过期\&quot;状态时，可进行禁用操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableCertificateAuthorityRequest 请求对象
     * @return AsyncInvoker<DisableCertificateAuthorityRequest, DisableCertificateAuthorityResponse>
     */
    public AsyncInvoker<DisableCertificateAuthorityRequest, DisableCertificateAuthorityResponse> disableCertificateAuthorityAsyncInvoker(
        DisableCertificateAuthorityRequest request) {
        return new AsyncInvoker<DisableCertificateAuthorityRequest, DisableCertificateAuthorityResponse>(request,
            CcmMeta.disableCertificateAuthority, hcClient);
    }

    /**
     * 启用CA
     *
     * 启用CA。
     * &gt; 注：只有当证书处于\&quot;已禁用\&quot;状态时，可进行启用操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableCertificateAuthorityRequest 请求对象
     * @return CompletableFuture<EnableCertificateAuthorityResponse>
     */
    public CompletableFuture<EnableCertificateAuthorityResponse> enableCertificateAuthorityAsync(
        EnableCertificateAuthorityRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.enableCertificateAuthority);
    }

    /**
     * 启用CA
     *
     * 启用CA。
     * &gt; 注：只有当证书处于\&quot;已禁用\&quot;状态时，可进行启用操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableCertificateAuthorityRequest 请求对象
     * @return AsyncInvoker<EnableCertificateAuthorityRequest, EnableCertificateAuthorityResponse>
     */
    public AsyncInvoker<EnableCertificateAuthorityRequest, EnableCertificateAuthorityResponse> enableCertificateAuthorityAsyncInvoker(
        EnableCertificateAuthorityRequest request) {
        return new AsyncInvoker<EnableCertificateAuthorityRequest, EnableCertificateAuthorityResponse>(request,
            CcmMeta.enableCertificateAuthority, hcClient);
    }

    /**
     * 导出CA证书
     *
     * 导出CA证书。
     * &gt; 注：只有当证书处于\&quot;已激活\&quot;或\&quot;已过期\&quot;时，可进行导出操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportCertificateAuthorityCertificateRequest 请求对象
     * @return CompletableFuture<ExportCertificateAuthorityCertificateResponse>
     */
    public CompletableFuture<ExportCertificateAuthorityCertificateResponse> exportCertificateAuthorityCertificateAsync(
        ExportCertificateAuthorityCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.exportCertificateAuthorityCertificate);
    }

    /**
     * 导出CA证书
     *
     * 导出CA证书。
     * &gt; 注：只有当证书处于\&quot;已激活\&quot;或\&quot;已过期\&quot;时，可进行导出操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportCertificateAuthorityCertificateRequest 请求对象
     * @return AsyncInvoker<ExportCertificateAuthorityCertificateRequest, ExportCertificateAuthorityCertificateResponse>
     */
    public AsyncInvoker<ExportCertificateAuthorityCertificateRequest, ExportCertificateAuthorityCertificateResponse> exportCertificateAuthorityCertificateAsyncInvoker(
        ExportCertificateAuthorityCertificateRequest request) {
        return new AsyncInvoker<ExportCertificateAuthorityCertificateRequest, ExportCertificateAuthorityCertificateResponse>(
            request, CcmMeta.exportCertificateAuthorityCertificate, hcClient);
    }

    /**
     * 导出CA的证书签名请求（CSR）
     *
     * 导出CA的证书签名请求。
     * &gt; 只有当CA处于\&quot;待激活\&quot;状态时，可导出证书签名请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportCertificateAuthorityCsrRequest 请求对象
     * @return CompletableFuture<ExportCertificateAuthorityCsrResponse>
     */
    public CompletableFuture<ExportCertificateAuthorityCsrResponse> exportCertificateAuthorityCsrAsync(
        ExportCertificateAuthorityCsrRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.exportCertificateAuthorityCsr);
    }

    /**
     * 导出CA的证书签名请求（CSR）
     *
     * 导出CA的证书签名请求。
     * &gt; 只有当CA处于\&quot;待激活\&quot;状态时，可导出证书签名请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportCertificateAuthorityCsrRequest 请求对象
     * @return AsyncInvoker<ExportCertificateAuthorityCsrRequest, ExportCertificateAuthorityCsrResponse>
     */
    public AsyncInvoker<ExportCertificateAuthorityCsrRequest, ExportCertificateAuthorityCsrResponse> exportCertificateAuthorityCsrAsyncInvoker(
        ExportCertificateAuthorityCsrRequest request) {
        return new AsyncInvoker<ExportCertificateAuthorityCsrRequest, ExportCertificateAuthorityCsrResponse>(request,
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportCertificateAuthorityCertificateRequest 请求对象
     * @return CompletableFuture<ImportCertificateAuthorityCertificateResponse>
     */
    public CompletableFuture<ImportCertificateAuthorityCertificateResponse> importCertificateAuthorityCertificateAsync(
        ImportCertificateAuthorityCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.importCertificateAuthorityCertificate);
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
     * @param ImportCertificateAuthorityCertificateRequest 请求对象
     * @return AsyncInvoker<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResponse>
     */
    public AsyncInvoker<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResponse> importCertificateAuthorityCertificateAsyncInvoker(
        ImportCertificateAuthorityCertificateRequest request) {
        return new AsyncInvoker<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResponse>(
            request, CcmMeta.importCertificateAuthorityCertificate, hcClient);
    }

    /**
     * 激活CA
     *
     * 激活CA。
     * &gt; 只有当证书处于\&quot;待激活\&quot;状态时，可进行激活操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param IssueCertificateAuthorityCertificateRequest 请求对象
     * @return CompletableFuture<IssueCertificateAuthorityCertificateResponse>
     */
    public CompletableFuture<IssueCertificateAuthorityCertificateResponse> issueCertificateAuthorityCertificateAsync(
        IssueCertificateAuthorityCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.issueCertificateAuthorityCertificate);
    }

    /**
     * 激活CA
     *
     * 激活CA。
     * &gt; 只有当证书处于\&quot;待激活\&quot;状态时，可进行激活操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param IssueCertificateAuthorityCertificateRequest 请求对象
     * @return AsyncInvoker<IssueCertificateAuthorityCertificateRequest, IssueCertificateAuthorityCertificateResponse>
     */
    public AsyncInvoker<IssueCertificateAuthorityCertificateRequest, IssueCertificateAuthorityCertificateResponse> issueCertificateAuthorityCertificateAsyncInvoker(
        IssueCertificateAuthorityCertificateRequest request) {
        return new AsyncInvoker<IssueCertificateAuthorityCertificateRequest, IssueCertificateAuthorityCertificateResponse>(
            request, CcmMeta.issueCertificateAuthorityCertificate, hcClient);
    }

    /**
     * 查询CA列表
     *
     * 查询CA列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCertificateAuthorityRequest 请求对象
     * @return CompletableFuture<ListCertificateAuthorityResponse>
     */
    public CompletableFuture<ListCertificateAuthorityResponse> listCertificateAuthorityAsync(
        ListCertificateAuthorityRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.listCertificateAuthority);
    }

    /**
     * 查询CA列表
     *
     * 查询CA列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCertificateAuthorityRequest 请求对象
     * @return AsyncInvoker<ListCertificateAuthorityRequest, ListCertificateAuthorityResponse>
     */
    public AsyncInvoker<ListCertificateAuthorityRequest, ListCertificateAuthorityResponse> listCertificateAuthorityAsyncInvoker(
        ListCertificateAuthorityRequest request) {
        return new AsyncInvoker<ListCertificateAuthorityRequest, ListCertificateAuthorityResponse>(request,
            CcmMeta.listCertificateAuthority, hcClient);
    }

    /**
     * 恢复CA
     *
     * 恢复CA，将处于“计划删除”状态的CA证书，重新恢复为“已禁用”状态。
     * &gt; 注：只有处于“计划删除”状态的CA证书，才可进行恢复操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreCertificateAuthorityRequest 请求对象
     * @return CompletableFuture<RestoreCertificateAuthorityResponse>
     */
    public CompletableFuture<RestoreCertificateAuthorityResponse> restoreCertificateAuthorityAsync(
        RestoreCertificateAuthorityRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.restoreCertificateAuthority);
    }

    /**
     * 恢复CA
     *
     * 恢复CA，将处于“计划删除”状态的CA证书，重新恢复为“已禁用”状态。
     * &gt; 注：只有处于“计划删除”状态的CA证书，才可进行恢复操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreCertificateAuthorityRequest 请求对象
     * @return AsyncInvoker<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResponse>
     */
    public AsyncInvoker<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResponse> restoreCertificateAuthorityAsyncInvoker(
        RestoreCertificateAuthorityRequest request) {
        return new AsyncInvoker<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResponse>(request,
            CcmMeta.restoreCertificateAuthority, hcClient);
    }

    /**
     * 吊销CA
     *
     * 吊销子CA。
     * &gt; 注：当不想填写吊销理由时，请求body体请置为\&quot;**{}**\&quot;，否则将会报错。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RevokeCertificateAuthorityRequest 请求对象
     * @return CompletableFuture<RevokeCertificateAuthorityResponse>
     */
    public CompletableFuture<RevokeCertificateAuthorityResponse> revokeCertificateAuthorityAsync(
        RevokeCertificateAuthorityRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.revokeCertificateAuthority);
    }

    /**
     * 吊销CA
     *
     * 吊销子CA。
     * &gt; 注：当不想填写吊销理由时，请求body体请置为\&quot;**{}**\&quot;，否则将会报错。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RevokeCertificateAuthorityRequest 请求对象
     * @return AsyncInvoker<RevokeCertificateAuthorityRequest, RevokeCertificateAuthorityResponse>
     */
    public AsyncInvoker<RevokeCertificateAuthorityRequest, RevokeCertificateAuthorityResponse> revokeCertificateAuthorityAsyncInvoker(
        RevokeCertificateAuthorityRequest request) {
        return new AsyncInvoker<RevokeCertificateAuthorityRequest, RevokeCertificateAuthorityResponse>(request,
            CcmMeta.revokeCertificateAuthority, hcClient);
    }

    /**
     * 查询CA详情
     *
     * 查询CA详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertificateAuthorityRequest 请求对象
     * @return CompletableFuture<ShowCertificateAuthorityResponse>
     */
    public CompletableFuture<ShowCertificateAuthorityResponse> showCertificateAuthorityAsync(
        ShowCertificateAuthorityRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.showCertificateAuthority);
    }

    /**
     * 查询CA详情
     *
     * 查询CA详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertificateAuthorityRequest 请求对象
     * @return AsyncInvoker<ShowCertificateAuthorityRequest, ShowCertificateAuthorityResponse>
     */
    public AsyncInvoker<ShowCertificateAuthorityRequest, ShowCertificateAuthorityResponse> showCertificateAuthorityAsyncInvoker(
        ShowCertificateAuthorityRequest request) {
        return new AsyncInvoker<ShowCertificateAuthorityRequest, ShowCertificateAuthorityResponse>(request,
            CcmMeta.showCertificateAuthority, hcClient);
    }

    /**
     * 查询CA配额
     *
     * 查询CA证书配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertificateAuthorityQuotaRequest 请求对象
     * @return CompletableFuture<ShowCertificateAuthorityQuotaResponse>
     */
    public CompletableFuture<ShowCertificateAuthorityQuotaResponse> showCertificateAuthorityQuotaAsync(
        ShowCertificateAuthorityQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, CcmMeta.showCertificateAuthorityQuota);
    }

    /**
     * 查询CA配额
     *
     * 查询CA证书配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertificateAuthorityQuotaRequest 请求对象
     * @return AsyncInvoker<ShowCertificateAuthorityQuotaRequest, ShowCertificateAuthorityQuotaResponse>
     */
    public AsyncInvoker<ShowCertificateAuthorityQuotaRequest, ShowCertificateAuthorityQuotaResponse> showCertificateAuthorityQuotaAsyncInvoker(
        ShowCertificateAuthorityQuotaRequest request) {
        return new AsyncInvoker<ShowCertificateAuthorityQuotaRequest, ShowCertificateAuthorityQuotaResponse>(request,
            CcmMeta.showCertificateAuthorityQuota, hcClient);
    }

}
