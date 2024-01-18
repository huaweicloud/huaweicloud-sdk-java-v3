package com.huaweicloud.sdk.kms.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.kms.v2.model.BatchCreateKmsTagsRequest;
import com.huaweicloud.sdk.kms.v2.model.BatchCreateKmsTagsResponse;
import com.huaweicloud.sdk.kms.v2.model.CancelGrantRequest;
import com.huaweicloud.sdk.kms.v2.model.CancelGrantResponse;
import com.huaweicloud.sdk.kms.v2.model.CancelKeyDeletionRequest;
import com.huaweicloud.sdk.kms.v2.model.CancelKeyDeletionResponse;
import com.huaweicloud.sdk.kms.v2.model.CancelSelfGrantRequest;
import com.huaweicloud.sdk.kms.v2.model.CancelSelfGrantResponse;
import com.huaweicloud.sdk.kms.v2.model.CreateDatakeyRequest;
import com.huaweicloud.sdk.kms.v2.model.CreateDatakeyResponse;
import com.huaweicloud.sdk.kms.v2.model.CreateDatakeyWithoutPlaintextRequest;
import com.huaweicloud.sdk.kms.v2.model.CreateDatakeyWithoutPlaintextResponse;
import com.huaweicloud.sdk.kms.v2.model.CreateGrantRequest;
import com.huaweicloud.sdk.kms.v2.model.CreateGrantResponse;
import com.huaweicloud.sdk.kms.v2.model.CreateKeyRequest;
import com.huaweicloud.sdk.kms.v2.model.CreateKeyResponse;
import com.huaweicloud.sdk.kms.v2.model.CreateKeyStoreRequest;
import com.huaweicloud.sdk.kms.v2.model.CreateKeyStoreResponse;
import com.huaweicloud.sdk.kms.v2.model.CreateKmsTagRequest;
import com.huaweicloud.sdk.kms.v2.model.CreateKmsTagResponse;
import com.huaweicloud.sdk.kms.v2.model.CreateParametersForImportRequest;
import com.huaweicloud.sdk.kms.v2.model.CreateParametersForImportResponse;
import com.huaweicloud.sdk.kms.v2.model.CreateRandomRequest;
import com.huaweicloud.sdk.kms.v2.model.CreateRandomResponse;
import com.huaweicloud.sdk.kms.v2.model.DecryptDataRequest;
import com.huaweicloud.sdk.kms.v2.model.DecryptDataResponse;
import com.huaweicloud.sdk.kms.v2.model.DecryptDatakeyRequest;
import com.huaweicloud.sdk.kms.v2.model.DecryptDatakeyResponse;
import com.huaweicloud.sdk.kms.v2.model.DeleteImportedKeyMaterialRequest;
import com.huaweicloud.sdk.kms.v2.model.DeleteImportedKeyMaterialResponse;
import com.huaweicloud.sdk.kms.v2.model.DeleteKeyRequest;
import com.huaweicloud.sdk.kms.v2.model.DeleteKeyResponse;
import com.huaweicloud.sdk.kms.v2.model.DeleteKeyStoreRequest;
import com.huaweicloud.sdk.kms.v2.model.DeleteKeyStoreResponse;
import com.huaweicloud.sdk.kms.v2.model.DeleteTagRequest;
import com.huaweicloud.sdk.kms.v2.model.DeleteTagResponse;
import com.huaweicloud.sdk.kms.v2.model.DisableKeyRequest;
import com.huaweicloud.sdk.kms.v2.model.DisableKeyResponse;
import com.huaweicloud.sdk.kms.v2.model.DisableKeyRotationRequest;
import com.huaweicloud.sdk.kms.v2.model.DisableKeyRotationResponse;
import com.huaweicloud.sdk.kms.v2.model.DisableKeyStoreRequest;
import com.huaweicloud.sdk.kms.v2.model.DisableKeyStoreResponse;
import com.huaweicloud.sdk.kms.v2.model.EnableKeyRequest;
import com.huaweicloud.sdk.kms.v2.model.EnableKeyResponse;
import com.huaweicloud.sdk.kms.v2.model.EnableKeyRotationRequest;
import com.huaweicloud.sdk.kms.v2.model.EnableKeyRotationResponse;
import com.huaweicloud.sdk.kms.v2.model.EnableKeyStoreRequest;
import com.huaweicloud.sdk.kms.v2.model.EnableKeyStoreResponse;
import com.huaweicloud.sdk.kms.v2.model.EncryptDataRequest;
import com.huaweicloud.sdk.kms.v2.model.EncryptDataResponse;
import com.huaweicloud.sdk.kms.v2.model.EncryptDatakeyRequest;
import com.huaweicloud.sdk.kms.v2.model.EncryptDatakeyResponse;
import com.huaweicloud.sdk.kms.v2.model.ImportKeyMaterialRequest;
import com.huaweicloud.sdk.kms.v2.model.ImportKeyMaterialResponse;
import com.huaweicloud.sdk.kms.v2.model.ListGrantsRequest;
import com.huaweicloud.sdk.kms.v2.model.ListGrantsResponse;
import com.huaweicloud.sdk.kms.v2.model.ListKeyDetailRequest;
import com.huaweicloud.sdk.kms.v2.model.ListKeyDetailResponse;
import com.huaweicloud.sdk.kms.v2.model.ListKeyStoresRequest;
import com.huaweicloud.sdk.kms.v2.model.ListKeyStoresResponse;
import com.huaweicloud.sdk.kms.v2.model.ListKeysRequest;
import com.huaweicloud.sdk.kms.v2.model.ListKeysResponse;
import com.huaweicloud.sdk.kms.v2.model.ListKmsByTagsRequest;
import com.huaweicloud.sdk.kms.v2.model.ListKmsByTagsResponse;
import com.huaweicloud.sdk.kms.v2.model.ListKmsTagsRequest;
import com.huaweicloud.sdk.kms.v2.model.ListKmsTagsResponse;
import com.huaweicloud.sdk.kms.v2.model.ListRetirableGrantsRequest;
import com.huaweicloud.sdk.kms.v2.model.ListRetirableGrantsResponse;
import com.huaweicloud.sdk.kms.v2.model.ShowKeyRotationStatusRequest;
import com.huaweicloud.sdk.kms.v2.model.ShowKeyRotationStatusResponse;
import com.huaweicloud.sdk.kms.v2.model.ShowKeyStoreRequest;
import com.huaweicloud.sdk.kms.v2.model.ShowKeyStoreResponse;
import com.huaweicloud.sdk.kms.v2.model.ShowKmsTagsRequest;
import com.huaweicloud.sdk.kms.v2.model.ShowKmsTagsResponse;
import com.huaweicloud.sdk.kms.v2.model.ShowPublicKeyRequest;
import com.huaweicloud.sdk.kms.v2.model.ShowPublicKeyResponse;
import com.huaweicloud.sdk.kms.v2.model.ShowUserInstancesRequest;
import com.huaweicloud.sdk.kms.v2.model.ShowUserInstancesResponse;
import com.huaweicloud.sdk.kms.v2.model.ShowUserQuotasRequest;
import com.huaweicloud.sdk.kms.v2.model.ShowUserQuotasResponse;
import com.huaweicloud.sdk.kms.v2.model.ShowVersionRequest;
import com.huaweicloud.sdk.kms.v2.model.ShowVersionResponse;
import com.huaweicloud.sdk.kms.v2.model.ShowVersionsRequest;
import com.huaweicloud.sdk.kms.v2.model.ShowVersionsResponse;
import com.huaweicloud.sdk.kms.v2.model.SignRequest;
import com.huaweicloud.sdk.kms.v2.model.SignResponse;
import com.huaweicloud.sdk.kms.v2.model.UpdateKeyAliasRequest;
import com.huaweicloud.sdk.kms.v2.model.UpdateKeyAliasResponse;
import com.huaweicloud.sdk.kms.v2.model.UpdateKeyDescriptionRequest;
import com.huaweicloud.sdk.kms.v2.model.UpdateKeyDescriptionResponse;
import com.huaweicloud.sdk.kms.v2.model.UpdateKeyRotationIntervalRequest;
import com.huaweicloud.sdk.kms.v2.model.UpdateKeyRotationIntervalResponse;
import com.huaweicloud.sdk.kms.v2.model.ValidateSignatureRequest;
import com.huaweicloud.sdk.kms.v2.model.ValidateSignatureResponse;

import java.util.concurrent.CompletableFuture;

public class KmsAsyncClient {

    protected HcClient hcClient;

    public KmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KmsAsyncClient> newBuilder() {
        ClientBuilder<KmsAsyncClient> clientBuilder = new ClientBuilder<>(KmsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 批量添加删除密钥标签
     *
     * - 功能介绍：批量添加删除密钥标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateKmsTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateKmsTagsResponse>
     */
    public CompletableFuture<BatchCreateKmsTagsResponse> batchCreateKmsTagsAsync(BatchCreateKmsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.batchCreateKmsTags);
    }

    /**
     * 批量添加删除密钥标签
     *
     * - 功能介绍：批量添加删除密钥标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateKmsTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse>
     */
    public AsyncInvoker<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse> batchCreateKmsTagsAsyncInvoker(
        BatchCreateKmsTagsRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.batchCreateKmsTags, hcClient);
    }

    /**
     * 撤销授权
     *
     * - 功能介绍：撤销授权，授权用户撤销被授权用户操作密钥的权限。
     * - 说明：
     *    - 创建密钥的用户才能撤销该密钥授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelGrantRequest 请求对象
     * @return CompletableFuture<CancelGrantResponse>
     */
    public CompletableFuture<CancelGrantResponse> cancelGrantAsync(CancelGrantRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.cancelGrant);
    }

    /**
     * 撤销授权
     *
     * - 功能介绍：撤销授权，授权用户撤销被授权用户操作密钥的权限。
     * - 说明：
     *    - 创建密钥的用户才能撤销该密钥授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelGrantRequest 请求对象
     * @return AsyncInvoker<CancelGrantRequest, CancelGrantResponse>
     */
    public AsyncInvoker<CancelGrantRequest, CancelGrantResponse> cancelGrantAsyncInvoker(CancelGrantRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.cancelGrant, hcClient);
    }

    /**
     * 取消计划删除密钥
     *
     * - 功能介绍：取消计划删除密钥。
     * - 说明：密钥处于“计划删除”状态才能取消计划删除密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelKeyDeletionRequest 请求对象
     * @return CompletableFuture<CancelKeyDeletionResponse>
     */
    public CompletableFuture<CancelKeyDeletionResponse> cancelKeyDeletionAsync(CancelKeyDeletionRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.cancelKeyDeletion);
    }

    /**
     * 取消计划删除密钥
     *
     * - 功能介绍：取消计划删除密钥。
     * - 说明：密钥处于“计划删除”状态才能取消计划删除密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelKeyDeletionRequest 请求对象
     * @return AsyncInvoker<CancelKeyDeletionRequest, CancelKeyDeletionResponse>
     */
    public AsyncInvoker<CancelKeyDeletionRequest, CancelKeyDeletionResponse> cancelKeyDeletionAsyncInvoker(
        CancelKeyDeletionRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.cancelKeyDeletion, hcClient);
    }

    /**
     * 退役授权
     *
     * - 功能介绍：退役授权，表示被授权用户不再具有授权密钥的操作权。
     *   例如：用户A授权用户B可以操作密钥A/key，同时授权用户C可以撤销该授权，
     *   那么用户A、B、C均可退役该授权，退役授权后，用户B不再可以使用A/key。
     * - 须知：
     *      可执行退役授权的主体包括：
     *    - 创建授权的用户；
     *    - 授权中retiring_principal指向的用户；
     *    - 当授权的操作列表中包含retire-grant时，grantee_principal指向的用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelSelfGrantRequest 请求对象
     * @return CompletableFuture<CancelSelfGrantResponse>
     */
    public CompletableFuture<CancelSelfGrantResponse> cancelSelfGrantAsync(CancelSelfGrantRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.cancelSelfGrant);
    }

    /**
     * 退役授权
     *
     * - 功能介绍：退役授权，表示被授权用户不再具有授权密钥的操作权。
     *   例如：用户A授权用户B可以操作密钥A/key，同时授权用户C可以撤销该授权，
     *   那么用户A、B、C均可退役该授权，退役授权后，用户B不再可以使用A/key。
     * - 须知：
     *      可执行退役授权的主体包括：
     *    - 创建授权的用户；
     *    - 授权中retiring_principal指向的用户；
     *    - 当授权的操作列表中包含retire-grant时，grantee_principal指向的用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelSelfGrantRequest 请求对象
     * @return AsyncInvoker<CancelSelfGrantRequest, CancelSelfGrantResponse>
     */
    public AsyncInvoker<CancelSelfGrantRequest, CancelSelfGrantResponse> cancelSelfGrantAsyncInvoker(
        CancelSelfGrantRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.cancelSelfGrant, hcClient);
    }

    /**
     * 创建数据密钥
     *
     * - 功能介绍：创建数据密钥，返回结果包含明文和密文。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatakeyRequest 请求对象
     * @return CompletableFuture<CreateDatakeyResponse>
     */
    public CompletableFuture<CreateDatakeyResponse> createDatakeyAsync(CreateDatakeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createDatakey);
    }

    /**
     * 创建数据密钥
     *
     * - 功能介绍：创建数据密钥，返回结果包含明文和密文。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatakeyRequest 请求对象
     * @return AsyncInvoker<CreateDatakeyRequest, CreateDatakeyResponse>
     */
    public AsyncInvoker<CreateDatakeyRequest, CreateDatakeyResponse> createDatakeyAsyncInvoker(
        CreateDatakeyRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.createDatakey, hcClient);
    }

    /**
     * 创建不含明文数据密钥
     *
     * - 功能介绍：创建数据密钥，返回结果只包含密文。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatakeyWithoutPlaintextRequest 请求对象
     * @return CompletableFuture<CreateDatakeyWithoutPlaintextResponse>
     */
    public CompletableFuture<CreateDatakeyWithoutPlaintextResponse> createDatakeyWithoutPlaintextAsync(
        CreateDatakeyWithoutPlaintextRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createDatakeyWithoutPlaintext);
    }

    /**
     * 创建不含明文数据密钥
     *
     * - 功能介绍：创建数据密钥，返回结果只包含密文。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatakeyWithoutPlaintextRequest 请求对象
     * @return AsyncInvoker<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse>
     */
    public AsyncInvoker<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse> createDatakeyWithoutPlaintextAsyncInvoker(
        CreateDatakeyWithoutPlaintextRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.createDatakeyWithoutPlaintext, hcClient);
    }

    /**
     * 创建授权
     *
     * - 功能介绍：创建授权，被授权用户可以对授权密钥进行操作。
     * - 说明：
     *    - 服务默认主密钥（密钥别名后缀为“/default”）不可以授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGrantRequest 请求对象
     * @return CompletableFuture<CreateGrantResponse>
     */
    public CompletableFuture<CreateGrantResponse> createGrantAsync(CreateGrantRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createGrant);
    }

    /**
     * 创建授权
     *
     * - 功能介绍：创建授权，被授权用户可以对授权密钥进行操作。
     * - 说明：
     *    - 服务默认主密钥（密钥别名后缀为“/default”）不可以授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGrantRequest 请求对象
     * @return AsyncInvoker<CreateGrantRequest, CreateGrantResponse>
     */
    public AsyncInvoker<CreateGrantRequest, CreateGrantResponse> createGrantAsyncInvoker(CreateGrantRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.createGrant, hcClient);
    }

    /**
     * 创建密钥
     *
     * 创建用户主密钥，用户主密钥可以为对称密钥或非对称密钥。
     * - 对称密钥为长度为256位AES密钥或者128位SM4密钥，可用于小量数据的加密或者用于加密数据密钥。
     * - 非对称密钥可以为RSA密钥对或者ECC密钥对（包含SM2密钥对），可用于加解密数据、数字签名及验签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKeyRequest 请求对象
     * @return CompletableFuture<CreateKeyResponse>
     */
    public CompletableFuture<CreateKeyResponse> createKeyAsync(CreateKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createKey);
    }

    /**
     * 创建密钥
     *
     * 创建用户主密钥，用户主密钥可以为对称密钥或非对称密钥。
     * - 对称密钥为长度为256位AES密钥或者128位SM4密钥，可用于小量数据的加密或者用于加密数据密钥。
     * - 非对称密钥可以为RSA密钥对或者ECC密钥对（包含SM2密钥对），可用于加解密数据、数字签名及验签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKeyRequest 请求对象
     * @return AsyncInvoker<CreateKeyRequest, CreateKeyResponse>
     */
    public AsyncInvoker<CreateKeyRequest, CreateKeyResponse> createKeyAsyncInvoker(CreateKeyRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.createKey, hcClient);
    }

    /**
     * 创建专属密钥库
     *
     * - \&quot;创建租户专属密钥库，专属密钥库使用DHSM实例作为密钥的存储\&quot;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKeyStoreRequest 请求对象
     * @return CompletableFuture<CreateKeyStoreResponse>
     */
    public CompletableFuture<CreateKeyStoreResponse> createKeyStoreAsync(CreateKeyStoreRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createKeyStore);
    }

    /**
     * 创建专属密钥库
     *
     * - \&quot;创建租户专属密钥库，专属密钥库使用DHSM实例作为密钥的存储\&quot;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKeyStoreRequest 请求对象
     * @return AsyncInvoker<CreateKeyStoreRequest, CreateKeyStoreResponse>
     */
    public AsyncInvoker<CreateKeyStoreRequest, CreateKeyStoreResponse> createKeyStoreAsyncInvoker(
        CreateKeyStoreRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.createKeyStore, hcClient);
    }

    /**
     * 添加密钥标签
     *
     * - 功能介绍：添加密钥标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKmsTagRequest 请求对象
     * @return CompletableFuture<CreateKmsTagResponse>
     */
    public CompletableFuture<CreateKmsTagResponse> createKmsTagAsync(CreateKmsTagRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createKmsTag);
    }

    /**
     * 添加密钥标签
     *
     * - 功能介绍：添加密钥标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKmsTagRequest 请求对象
     * @return AsyncInvoker<CreateKmsTagRequest, CreateKmsTagResponse>
     */
    public AsyncInvoker<CreateKmsTagRequest, CreateKmsTagResponse> createKmsTagAsyncInvoker(
        CreateKmsTagRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.createKmsTag, hcClient);
    }

    /**
     * 获取密钥导入参数
     *
     * - 功能介绍：获取导入密钥的必要参数，包括密钥导入令牌和密钥加密公钥。
     * - 说明：返回的公钥类型默认为RSA_2048。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateParametersForImportRequest 请求对象
     * @return CompletableFuture<CreateParametersForImportResponse>
     */
    public CompletableFuture<CreateParametersForImportResponse> createParametersForImportAsync(
        CreateParametersForImportRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createParametersForImport);
    }

    /**
     * 获取密钥导入参数
     *
     * - 功能介绍：获取导入密钥的必要参数，包括密钥导入令牌和密钥加密公钥。
     * - 说明：返回的公钥类型默认为RSA_2048。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateParametersForImportRequest 请求对象
     * @return AsyncInvoker<CreateParametersForImportRequest, CreateParametersForImportResponse>
     */
    public AsyncInvoker<CreateParametersForImportRequest, CreateParametersForImportResponse> createParametersForImportAsyncInvoker(
        CreateParametersForImportRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.createParametersForImport, hcClient);
    }

    /**
     * 创建随机数
     *
     * - 功能介绍：
     *   生成8~8192bit范围内的随机数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRandomRequest 请求对象
     * @return CompletableFuture<CreateRandomResponse>
     */
    public CompletableFuture<CreateRandomResponse> createRandomAsync(CreateRandomRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createRandom);
    }

    /**
     * 创建随机数
     *
     * - 功能介绍：
     *   生成8~8192bit范围内的随机数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRandomRequest 请求对象
     * @return AsyncInvoker<CreateRandomRequest, CreateRandomResponse>
     */
    public AsyncInvoker<CreateRandomRequest, CreateRandomResponse> createRandomAsyncInvoker(
        CreateRandomRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.createRandom, hcClient);
    }

    /**
     * 解密数据
     *
     * - 功能介绍：解密数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DecryptDataRequest 请求对象
     * @return CompletableFuture<DecryptDataResponse>
     */
    public CompletableFuture<DecryptDataResponse> decryptDataAsync(DecryptDataRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.decryptData);
    }

    /**
     * 解密数据
     *
     * - 功能介绍：解密数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DecryptDataRequest 请求对象
     * @return AsyncInvoker<DecryptDataRequest, DecryptDataResponse>
     */
    public AsyncInvoker<DecryptDataRequest, DecryptDataResponse> decryptDataAsyncInvoker(DecryptDataRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.decryptData, hcClient);
    }

    /**
     * 解密数据密钥
     *
     * - 功能介绍：解密数据密钥，用指定的主密钥解密数据密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DecryptDatakeyRequest 请求对象
     * @return CompletableFuture<DecryptDatakeyResponse>
     */
    public CompletableFuture<DecryptDatakeyResponse> decryptDatakeyAsync(DecryptDatakeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.decryptDatakey);
    }

    /**
     * 解密数据密钥
     *
     * - 功能介绍：解密数据密钥，用指定的主密钥解密数据密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DecryptDatakeyRequest 请求对象
     * @return AsyncInvoker<DecryptDatakeyRequest, DecryptDatakeyResponse>
     */
    public AsyncInvoker<DecryptDatakeyRequest, DecryptDatakeyResponse> decryptDatakeyAsyncInvoker(
        DecryptDatakeyRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.decryptDatakey, hcClient);
    }

    /**
     * 删除密钥材料
     *
     * - 功能介绍：删除密钥材料信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImportedKeyMaterialRequest 请求对象
     * @return CompletableFuture<DeleteImportedKeyMaterialResponse>
     */
    public CompletableFuture<DeleteImportedKeyMaterialResponse> deleteImportedKeyMaterialAsync(
        DeleteImportedKeyMaterialRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.deleteImportedKeyMaterial);
    }

    /**
     * 删除密钥材料
     *
     * - 功能介绍：删除密钥材料信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImportedKeyMaterialRequest 请求对象
     * @return AsyncInvoker<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse>
     */
    public AsyncInvoker<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse> deleteImportedKeyMaterialAsyncInvoker(
        DeleteImportedKeyMaterialRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.deleteImportedKeyMaterial, hcClient);
    }

    /**
     * 计划删除密钥
     *
     * - 功能介绍：计划多少天后删除密钥，可设置7天～1096天内删除密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKeyRequest 请求对象
     * @return CompletableFuture<DeleteKeyResponse>
     */
    public CompletableFuture<DeleteKeyResponse> deleteKeyAsync(DeleteKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.deleteKey);
    }

    /**
     * 计划删除密钥
     *
     * - 功能介绍：计划多少天后删除密钥，可设置7天～1096天内删除密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKeyRequest 请求对象
     * @return AsyncInvoker<DeleteKeyRequest, DeleteKeyResponse>
     */
    public AsyncInvoker<DeleteKeyRequest, DeleteKeyResponse> deleteKeyAsyncInvoker(DeleteKeyRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.deleteKey, hcClient);
    }

    /**
     * 删除专属密钥库
     *
     * 删除租户专属密钥库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKeyStoreRequest 请求对象
     * @return CompletableFuture<DeleteKeyStoreResponse>
     */
    public CompletableFuture<DeleteKeyStoreResponse> deleteKeyStoreAsync(DeleteKeyStoreRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.deleteKeyStore);
    }

    /**
     * 删除专属密钥库
     *
     * 删除租户专属密钥库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKeyStoreRequest 请求对象
     * @return AsyncInvoker<DeleteKeyStoreRequest, DeleteKeyStoreResponse>
     */
    public AsyncInvoker<DeleteKeyStoreRequest, DeleteKeyStoreResponse> deleteKeyStoreAsyncInvoker(
        DeleteKeyStoreRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.deleteKeyStore, hcClient);
    }

    /**
     * 删除密钥标签
     *
     * - 功能介绍：删除密钥标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return CompletableFuture<DeleteTagResponse>
     */
    public CompletableFuture<DeleteTagResponse> deleteTagAsync(DeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.deleteTag);
    }

    /**
     * 删除密钥标签
     *
     * - 功能介绍：删除密钥标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return AsyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public AsyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagAsyncInvoker(DeleteTagRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.deleteTag, hcClient);
    }

    /**
     * 禁用密钥
     *
     * - 功能介绍：禁用密钥，密钥禁用后不可以使用。
     * - 说明：密钥为启用状态才能禁用密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableKeyRequest 请求对象
     * @return CompletableFuture<DisableKeyResponse>
     */
    public CompletableFuture<DisableKeyResponse> disableKeyAsync(DisableKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.disableKey);
    }

    /**
     * 禁用密钥
     *
     * - 功能介绍：禁用密钥，密钥禁用后不可以使用。
     * - 说明：密钥为启用状态才能禁用密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableKeyRequest 请求对象
     * @return AsyncInvoker<DisableKeyRequest, DisableKeyResponse>
     */
    public AsyncInvoker<DisableKeyRequest, DisableKeyResponse> disableKeyAsyncInvoker(DisableKeyRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.disableKey, hcClient);
    }

    /**
     * 关闭密钥轮换
     *
     * - 功能介绍：关闭用户主密钥轮换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableKeyRotationRequest 请求对象
     * @return CompletableFuture<DisableKeyRotationResponse>
     */
    public CompletableFuture<DisableKeyRotationResponse> disableKeyRotationAsync(DisableKeyRotationRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.disableKeyRotation);
    }

    /**
     * 关闭密钥轮换
     *
     * - 功能介绍：关闭用户主密钥轮换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableKeyRotationRequest 请求对象
     * @return AsyncInvoker<DisableKeyRotationRequest, DisableKeyRotationResponse>
     */
    public AsyncInvoker<DisableKeyRotationRequest, DisableKeyRotationResponse> disableKeyRotationAsyncInvoker(
        DisableKeyRotationRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.disableKeyRotation, hcClient);
    }

    /**
     * 禁用专属密钥库
     *
     * 禁用租户专属密钥库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableKeyStoreRequest 请求对象
     * @return CompletableFuture<DisableKeyStoreResponse>
     */
    public CompletableFuture<DisableKeyStoreResponse> disableKeyStoreAsync(DisableKeyStoreRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.disableKeyStore);
    }

    /**
     * 禁用专属密钥库
     *
     * 禁用租户专属密钥库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableKeyStoreRequest 请求对象
     * @return AsyncInvoker<DisableKeyStoreRequest, DisableKeyStoreResponse>
     */
    public AsyncInvoker<DisableKeyStoreRequest, DisableKeyStoreResponse> disableKeyStoreAsyncInvoker(
        DisableKeyStoreRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.disableKeyStore, hcClient);
    }

    /**
     * 启用密钥
     *
     * - 功能介绍：启用密钥，密钥启用后才可以使用。
     * - 说明：密钥为禁用状态才能启用密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableKeyRequest 请求对象
     * @return CompletableFuture<EnableKeyResponse>
     */
    public CompletableFuture<EnableKeyResponse> enableKeyAsync(EnableKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.enableKey);
    }

    /**
     * 启用密钥
     *
     * - 功能介绍：启用密钥，密钥启用后才可以使用。
     * - 说明：密钥为禁用状态才能启用密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableKeyRequest 请求对象
     * @return AsyncInvoker<EnableKeyRequest, EnableKeyResponse>
     */
    public AsyncInvoker<EnableKeyRequest, EnableKeyResponse> enableKeyAsyncInvoker(EnableKeyRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.enableKey, hcClient);
    }

    /**
     * 开启密钥轮换
     *
     * - 功能介绍：开启用户主密钥轮换。
     * - 说明：
     *   - 开启密钥轮换后，默认轮换间隔时间为365天。
     *   - 默认主密钥及外部导入密钥不支持轮换操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableKeyRotationRequest 请求对象
     * @return CompletableFuture<EnableKeyRotationResponse>
     */
    public CompletableFuture<EnableKeyRotationResponse> enableKeyRotationAsync(EnableKeyRotationRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.enableKeyRotation);
    }

    /**
     * 开启密钥轮换
     *
     * - 功能介绍：开启用户主密钥轮换。
     * - 说明：
     *   - 开启密钥轮换后，默认轮换间隔时间为365天。
     *   - 默认主密钥及外部导入密钥不支持轮换操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableKeyRotationRequest 请求对象
     * @return AsyncInvoker<EnableKeyRotationRequest, EnableKeyRotationResponse>
     */
    public AsyncInvoker<EnableKeyRotationRequest, EnableKeyRotationResponse> enableKeyRotationAsyncInvoker(
        EnableKeyRotationRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.enableKeyRotation, hcClient);
    }

    /**
     * 启用专属密钥库
     *
     * 启用租户专属密钥库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableKeyStoreRequest 请求对象
     * @return CompletableFuture<EnableKeyStoreResponse>
     */
    public CompletableFuture<EnableKeyStoreResponse> enableKeyStoreAsync(EnableKeyStoreRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.enableKeyStore);
    }

    /**
     * 启用专属密钥库
     *
     * 启用租户专属密钥库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableKeyStoreRequest 请求对象
     * @return AsyncInvoker<EnableKeyStoreRequest, EnableKeyStoreResponse>
     */
    public AsyncInvoker<EnableKeyStoreRequest, EnableKeyStoreResponse> enableKeyStoreAsyncInvoker(
        EnableKeyStoreRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.enableKeyStore, hcClient);
    }

    /**
     * 加密数据
     *
     * - 功能介绍：加密数据，用指定的用户主密钥加密数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EncryptDataRequest 请求对象
     * @return CompletableFuture<EncryptDataResponse>
     */
    public CompletableFuture<EncryptDataResponse> encryptDataAsync(EncryptDataRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.encryptData);
    }

    /**
     * 加密数据
     *
     * - 功能介绍：加密数据，用指定的用户主密钥加密数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EncryptDataRequest 请求对象
     * @return AsyncInvoker<EncryptDataRequest, EncryptDataResponse>
     */
    public AsyncInvoker<EncryptDataRequest, EncryptDataResponse> encryptDataAsyncInvoker(EncryptDataRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.encryptData, hcClient);
    }

    /**
     * 加密数据密钥
     *
     * - 功能介绍：加密数据密钥，用指定的主密钥加密数据密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EncryptDatakeyRequest 请求对象
     * @return CompletableFuture<EncryptDatakeyResponse>
     */
    public CompletableFuture<EncryptDatakeyResponse> encryptDatakeyAsync(EncryptDatakeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.encryptDatakey);
    }

    /**
     * 加密数据密钥
     *
     * - 功能介绍：加密数据密钥，用指定的主密钥加密数据密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EncryptDatakeyRequest 请求对象
     * @return AsyncInvoker<EncryptDatakeyRequest, EncryptDatakeyResponse>
     */
    public AsyncInvoker<EncryptDatakeyRequest, EncryptDatakeyResponse> encryptDatakeyAsyncInvoker(
        EncryptDatakeyRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.encryptDatakey, hcClient);
    }

    /**
     * 导入密钥材料
     *
     * - 功能介绍：导入密钥材料。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportKeyMaterialRequest 请求对象
     * @return CompletableFuture<ImportKeyMaterialResponse>
     */
    public CompletableFuture<ImportKeyMaterialResponse> importKeyMaterialAsync(ImportKeyMaterialRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.importKeyMaterial);
    }

    /**
     * 导入密钥材料
     *
     * - 功能介绍：导入密钥材料。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportKeyMaterialRequest 请求对象
     * @return AsyncInvoker<ImportKeyMaterialRequest, ImportKeyMaterialResponse>
     */
    public AsyncInvoker<ImportKeyMaterialRequest, ImportKeyMaterialResponse> importKeyMaterialAsyncInvoker(
        ImportKeyMaterialRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.importKeyMaterial, hcClient);
    }

    /**
     * 查询授权列表
     *
     * - 功能介绍：查询密钥的授权列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGrantsRequest 请求对象
     * @return CompletableFuture<ListGrantsResponse>
     */
    public CompletableFuture<ListGrantsResponse> listGrantsAsync(ListGrantsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listGrants);
    }

    /**
     * 查询授权列表
     *
     * - 功能介绍：查询密钥的授权列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGrantsRequest 请求对象
     * @return AsyncInvoker<ListGrantsRequest, ListGrantsResponse>
     */
    public AsyncInvoker<ListGrantsRequest, ListGrantsResponse> listGrantsAsyncInvoker(ListGrantsRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.listGrants, hcClient);
    }

    /**
     * 查询密钥信息
     *
     * - 功能介绍：查询密钥详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeyDetailRequest 请求对象
     * @return CompletableFuture<ListKeyDetailResponse>
     */
    public CompletableFuture<ListKeyDetailResponse> listKeyDetailAsync(ListKeyDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKeyDetail);
    }

    /**
     * 查询密钥信息
     *
     * - 功能介绍：查询密钥详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeyDetailRequest 请求对象
     * @return AsyncInvoker<ListKeyDetailRequest, ListKeyDetailResponse>
     */
    public AsyncInvoker<ListKeyDetailRequest, ListKeyDetailResponse> listKeyDetailAsyncInvoker(
        ListKeyDetailRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.listKeyDetail, hcClient);
    }

    /**
     * 查询专属密钥库列表
     *
     * 查询租户专属密钥库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeyStoresRequest 请求对象
     * @return CompletableFuture<ListKeyStoresResponse>
     */
    public CompletableFuture<ListKeyStoresResponse> listKeyStoresAsync(ListKeyStoresRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKeyStores);
    }

    /**
     * 查询专属密钥库列表
     *
     * 查询租户专属密钥库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeyStoresRequest 请求对象
     * @return AsyncInvoker<ListKeyStoresRequest, ListKeyStoresResponse>
     */
    public AsyncInvoker<ListKeyStoresRequest, ListKeyStoresResponse> listKeyStoresAsyncInvoker(
        ListKeyStoresRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.listKeyStores, hcClient);
    }

    /**
     * 查询密钥列表
     *
     * - 功能介绍：查询用户所有密钥列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeysRequest 请求对象
     * @return CompletableFuture<ListKeysResponse>
     */
    public CompletableFuture<ListKeysResponse> listKeysAsync(ListKeysRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKeys);
    }

    /**
     * 查询密钥列表
     *
     * - 功能介绍：查询用户所有密钥列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeysRequest 请求对象
     * @return AsyncInvoker<ListKeysRequest, ListKeysResponse>
     */
    public AsyncInvoker<ListKeysRequest, ListKeysResponse> listKeysAsyncInvoker(ListKeysRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.listKeys, hcClient);
    }

    /**
     * 查询密钥实例
     *
     * - 功能介绍：查询密钥实例。通过标签过滤，查询指定用户主密钥的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKmsByTagsRequest 请求对象
     * @return CompletableFuture<ListKmsByTagsResponse>
     */
    public CompletableFuture<ListKmsByTagsResponse> listKmsByTagsAsync(ListKmsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKmsByTags);
    }

    /**
     * 查询密钥实例
     *
     * - 功能介绍：查询密钥实例。通过标签过滤，查询指定用户主密钥的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKmsByTagsRequest 请求对象
     * @return AsyncInvoker<ListKmsByTagsRequest, ListKmsByTagsResponse>
     */
    public AsyncInvoker<ListKmsByTagsRequest, ListKmsByTagsResponse> listKmsByTagsAsyncInvoker(
        ListKmsByTagsRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.listKmsByTags, hcClient);
    }

    /**
     * 查询项目标签
     *
     * - 功能介绍：查询用户在指定项目下的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKmsTagsRequest 请求对象
     * @return CompletableFuture<ListKmsTagsResponse>
     */
    public CompletableFuture<ListKmsTagsResponse> listKmsTagsAsync(ListKmsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKmsTags);
    }

    /**
     * 查询项目标签
     *
     * - 功能介绍：查询用户在指定项目下的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKmsTagsRequest 请求对象
     * @return AsyncInvoker<ListKmsTagsRequest, ListKmsTagsResponse>
     */
    public AsyncInvoker<ListKmsTagsRequest, ListKmsTagsResponse> listKmsTagsAsyncInvoker(ListKmsTagsRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.listKmsTags, hcClient);
    }

    /**
     * 查询可退役授权列表
     *
     * - 功能介绍：查询用户可以退役的授权列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRetirableGrantsRequest 请求对象
     * @return CompletableFuture<ListRetirableGrantsResponse>
     */
    public CompletableFuture<ListRetirableGrantsResponse> listRetirableGrantsAsync(ListRetirableGrantsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listRetirableGrants);
    }

    /**
     * 查询可退役授权列表
     *
     * - 功能介绍：查询用户可以退役的授权列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRetirableGrantsRequest 请求对象
     * @return AsyncInvoker<ListRetirableGrantsRequest, ListRetirableGrantsResponse>
     */
    public AsyncInvoker<ListRetirableGrantsRequest, ListRetirableGrantsResponse> listRetirableGrantsAsyncInvoker(
        ListRetirableGrantsRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.listRetirableGrants, hcClient);
    }

    /**
     * 查询密钥轮换状态
     *
     * - 功能介绍：查询用户主密钥轮换状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKeyRotationStatusRequest 请求对象
     * @return CompletableFuture<ShowKeyRotationStatusResponse>
     */
    public CompletableFuture<ShowKeyRotationStatusResponse> showKeyRotationStatusAsync(
        ShowKeyRotationStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showKeyRotationStatus);
    }

    /**
     * 查询密钥轮换状态
     *
     * - 功能介绍：查询用户主密钥轮换状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKeyRotationStatusRequest 请求对象
     * @return AsyncInvoker<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse>
     */
    public AsyncInvoker<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse> showKeyRotationStatusAsyncInvoker(
        ShowKeyRotationStatusRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.showKeyRotationStatus, hcClient);
    }

    /**
     * 获取专属密钥库
     *
     * 获取租户专属密钥库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKeyStoreRequest 请求对象
     * @return CompletableFuture<ShowKeyStoreResponse>
     */
    public CompletableFuture<ShowKeyStoreResponse> showKeyStoreAsync(ShowKeyStoreRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showKeyStore);
    }

    /**
     * 获取专属密钥库
     *
     * 获取租户专属密钥库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKeyStoreRequest 请求对象
     * @return AsyncInvoker<ShowKeyStoreRequest, ShowKeyStoreResponse>
     */
    public AsyncInvoker<ShowKeyStoreRequest, ShowKeyStoreResponse> showKeyStoreAsyncInvoker(
        ShowKeyStoreRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.showKeyStore, hcClient);
    }

    /**
     * 查询密钥标签
     *
     * - 功能介绍：查询密钥标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKmsTagsRequest 请求对象
     * @return CompletableFuture<ShowKmsTagsResponse>
     */
    public CompletableFuture<ShowKmsTagsResponse> showKmsTagsAsync(ShowKmsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showKmsTags);
    }

    /**
     * 查询密钥标签
     *
     * - 功能介绍：查询密钥标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKmsTagsRequest 请求对象
     * @return AsyncInvoker<ShowKmsTagsRequest, ShowKmsTagsResponse>
     */
    public AsyncInvoker<ShowKmsTagsRequest, ShowKmsTagsResponse> showKmsTagsAsyncInvoker(ShowKmsTagsRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.showKmsTags, hcClient);
    }

    /**
     * 查询公钥信息
     *
     * - 查询用户指定非对称密钥的公钥信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicKeyRequest 请求对象
     * @return CompletableFuture<ShowPublicKeyResponse>
     */
    public CompletableFuture<ShowPublicKeyResponse> showPublicKeyAsync(ShowPublicKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showPublicKey);
    }

    /**
     * 查询公钥信息
     *
     * - 查询用户指定非对称密钥的公钥信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicKeyRequest 请求对象
     * @return AsyncInvoker<ShowPublicKeyRequest, ShowPublicKeyResponse>
     */
    public AsyncInvoker<ShowPublicKeyRequest, ShowPublicKeyResponse> showPublicKeyAsyncInvoker(
        ShowPublicKeyRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.showPublicKey, hcClient);
    }

    /**
     * 查询实例数
     *
     * - 功能介绍：查询实例数，获取用户已经创建的用户主密钥数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserInstancesRequest 请求对象
     * @return CompletableFuture<ShowUserInstancesResponse>
     */
    public CompletableFuture<ShowUserInstancesResponse> showUserInstancesAsync(ShowUserInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showUserInstances);
    }

    /**
     * 查询实例数
     *
     * - 功能介绍：查询实例数，获取用户已经创建的用户主密钥数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserInstancesRequest 请求对象
     * @return AsyncInvoker<ShowUserInstancesRequest, ShowUserInstancesResponse>
     */
    public AsyncInvoker<ShowUserInstancesRequest, ShowUserInstancesResponse> showUserInstancesAsyncInvoker(
        ShowUserInstancesRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.showUserInstances, hcClient);
    }

    /**
     * 查询配额
     *
     * - 功能介绍：查询配额，查询用户可以创建的用户主密钥配额总数及当前使用量信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserQuotasRequest 请求对象
     * @return CompletableFuture<ShowUserQuotasResponse>
     */
    public CompletableFuture<ShowUserQuotasResponse> showUserQuotasAsync(ShowUserQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showUserQuotas);
    }

    /**
     * 查询配额
     *
     * - 功能介绍：查询配额，查询用户可以创建的用户主密钥配额总数及当前使用量信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserQuotasRequest 请求对象
     * @return AsyncInvoker<ShowUserQuotasRequest, ShowUserQuotasResponse>
     */
    public AsyncInvoker<ShowUserQuotasRequest, ShowUserQuotasResponse> showUserQuotasAsyncInvoker(
        ShowUserQuotasRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.showUserQuotas, hcClient);
    }

    /**
     * 签名数据
     *
     * - 功能介绍：使用非对称密钥的私钥对消息或消息摘要进行数字签名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SignRequest 请求对象
     * @return CompletableFuture<SignResponse>
     */
    public CompletableFuture<SignResponse> signAsync(SignRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.sign);
    }

    /**
     * 签名数据
     *
     * - 功能介绍：使用非对称密钥的私钥对消息或消息摘要进行数字签名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SignRequest 请求对象
     * @return AsyncInvoker<SignRequest, SignResponse>
     */
    public AsyncInvoker<SignRequest, SignResponse> signAsyncInvoker(SignRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.sign, hcClient);
    }

    /**
     * 修改密钥别名
     *
     * - 功能介绍：修改用户主密钥别名。
     * - 说明：
     *    - 服务默认主密钥（密钥别名后缀为“/default”）不可以修改。
     *    - 密钥处于“计划删除”状态，密钥别名不可以修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKeyAliasRequest 请求对象
     * @return CompletableFuture<UpdateKeyAliasResponse>
     */
    public CompletableFuture<UpdateKeyAliasResponse> updateKeyAliasAsync(UpdateKeyAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.updateKeyAlias);
    }

    /**
     * 修改密钥别名
     *
     * - 功能介绍：修改用户主密钥别名。
     * - 说明：
     *    - 服务默认主密钥（密钥别名后缀为“/default”）不可以修改。
     *    - 密钥处于“计划删除”状态，密钥别名不可以修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKeyAliasRequest 请求对象
     * @return AsyncInvoker<UpdateKeyAliasRequest, UpdateKeyAliasResponse>
     */
    public AsyncInvoker<UpdateKeyAliasRequest, UpdateKeyAliasResponse> updateKeyAliasAsyncInvoker(
        UpdateKeyAliasRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.updateKeyAlias, hcClient);
    }

    /**
     * 修改密钥描述
     *
     * - 功能介绍：修改用户主密钥描述信息。
     * - 说明：
     *    - 服务默认主密钥（密钥别名后缀为“/default”）不可以修改。
     *    - 密钥处于“计划删除”状态，密钥描述不可以修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKeyDescriptionRequest 请求对象
     * @return CompletableFuture<UpdateKeyDescriptionResponse>
     */
    public CompletableFuture<UpdateKeyDescriptionResponse> updateKeyDescriptionAsync(
        UpdateKeyDescriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.updateKeyDescription);
    }

    /**
     * 修改密钥描述
     *
     * - 功能介绍：修改用户主密钥描述信息。
     * - 说明：
     *    - 服务默认主密钥（密钥别名后缀为“/default”）不可以修改。
     *    - 密钥处于“计划删除”状态，密钥描述不可以修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKeyDescriptionRequest 请求对象
     * @return AsyncInvoker<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse>
     */
    public AsyncInvoker<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse> updateKeyDescriptionAsyncInvoker(
        UpdateKeyDescriptionRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.updateKeyDescription, hcClient);
    }

    /**
     * 修改密钥轮换周期
     *
     * - 功能介绍：修改用户主密钥轮换周期。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKeyRotationIntervalRequest 请求对象
     * @return CompletableFuture<UpdateKeyRotationIntervalResponse>
     */
    public CompletableFuture<UpdateKeyRotationIntervalResponse> updateKeyRotationIntervalAsync(
        UpdateKeyRotationIntervalRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.updateKeyRotationInterval);
    }

    /**
     * 修改密钥轮换周期
     *
     * - 功能介绍：修改用户主密钥轮换周期。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKeyRotationIntervalRequest 请求对象
     * @return AsyncInvoker<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse>
     */
    public AsyncInvoker<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse> updateKeyRotationIntervalAsyncInvoker(
        UpdateKeyRotationIntervalRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.updateKeyRotationInterval, hcClient);
    }

    /**
     * 验证签名
     *
     * - 功能介绍：使用非对称密钥的私钥对消息或消息摘要进行签名验证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateSignatureRequest 请求对象
     * @return CompletableFuture<ValidateSignatureResponse>
     */
    public CompletableFuture<ValidateSignatureResponse> validateSignatureAsync(ValidateSignatureRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.validateSignature);
    }

    /**
     * 验证签名
     *
     * - 功能介绍：使用非对称密钥的私钥对消息或消息摘要进行签名验证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateSignatureRequest 请求对象
     * @return AsyncInvoker<ValidateSignatureRequest, ValidateSignatureResponse>
     */
    public AsyncInvoker<ValidateSignatureRequest, ValidateSignatureResponse> validateSignatureAsyncInvoker(
        ValidateSignatureRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.validateSignature, hcClient);
    }

    /**
     * 查询指定版本信息
     *
     * - 功能介绍：查指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionRequest 请求对象
     * @return CompletableFuture<ShowVersionResponse>
     */
    public CompletableFuture<ShowVersionResponse> showVersionAsync(ShowVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showVersion);
    }

    /**
     * 查询指定版本信息
     *
     * - 功能介绍：查指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionRequest 请求对象
     * @return AsyncInvoker<ShowVersionRequest, ShowVersionResponse>
     */
    public AsyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionAsyncInvoker(ShowVersionRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.showVersion, hcClient);
    }

    /**
     * 查询版本信息列表
     *
     * - 功能介绍：查询API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionsRequest 请求对象
     * @return CompletableFuture<ShowVersionsResponse>
     */
    public CompletableFuture<ShowVersionsResponse> showVersionsAsync(ShowVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showVersions);
    }

    /**
     * 查询版本信息列表
     *
     * - 功能介绍：查询API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionsRequest 请求对象
     * @return AsyncInvoker<ShowVersionsRequest, ShowVersionsResponse>
     */
    public AsyncInvoker<ShowVersionsRequest, ShowVersionsResponse> showVersionsAsyncInvoker(
        ShowVersionsRequest request) {
        return new AsyncInvoker<>(request, KmsMeta.showVersions, hcClient);
    }

}
