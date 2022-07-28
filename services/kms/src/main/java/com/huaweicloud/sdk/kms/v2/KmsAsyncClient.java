package com.huaweicloud.sdk.kms.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.kms.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class KmsAsyncClient {

    protected HcClient hcClient;

    public KmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KmsAsyncClient> newBuilder() {
        return new ClientBuilder<>(KmsAsyncClient::new);
    }

    /**
     * 批量添加删除密钥标签
     *
     * - 功能介绍：批量添加删除密钥标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchCreateKmsTagsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchCreateKmsTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse>
     */
    public AsyncInvoker<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse> batchCreateKmsTagsAsyncInvoker(
        BatchCreateKmsTagsRequest request) {
        return new AsyncInvoker<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse>(request,
            KmsMeta.batchCreateKmsTags, hcClient);
    }

    /**
     * 撤销授权
     *
     * - 功能介绍：撤销授权，授权用户撤销被授权用户操作密钥的权限。
     * - 说明：
     *    - 创建密钥的用户才能撤销该密钥授权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelGrantRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelGrantRequest 请求对象
     * @return AsyncInvoker<CancelGrantRequest, CancelGrantResponse>
     */
    public AsyncInvoker<CancelGrantRequest, CancelGrantResponse> cancelGrantAsyncInvoker(CancelGrantRequest request) {
        return new AsyncInvoker<CancelGrantRequest, CancelGrantResponse>(request, KmsMeta.cancelGrant, hcClient);
    }

    /**
     * 取消计划删除密钥
     *
     * - 功能介绍：取消计划删除密钥。
     * - 说明：密钥处于“计划删除”状态才能取消计划删除密钥。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelKeyDeletionRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelKeyDeletionRequest 请求对象
     * @return AsyncInvoker<CancelKeyDeletionRequest, CancelKeyDeletionResponse>
     */
    public AsyncInvoker<CancelKeyDeletionRequest, CancelKeyDeletionResponse> cancelKeyDeletionAsyncInvoker(
        CancelKeyDeletionRequest request) {
        return new AsyncInvoker<CancelKeyDeletionRequest, CancelKeyDeletionResponse>(request, KmsMeta.cancelKeyDeletion,
            hcClient);
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelSelfGrantRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelSelfGrantRequest 请求对象
     * @return AsyncInvoker<CancelSelfGrantRequest, CancelSelfGrantResponse>
     */
    public AsyncInvoker<CancelSelfGrantRequest, CancelSelfGrantResponse> cancelSelfGrantAsyncInvoker(
        CancelSelfGrantRequest request) {
        return new AsyncInvoker<CancelSelfGrantRequest, CancelSelfGrantResponse>(request, KmsMeta.cancelSelfGrant,
            hcClient);
    }

    /**
     * 创建数据密钥
     *
     * - 功能介绍：创建数据密钥，返回结果包含明文和密文。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDatakeyRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDatakeyRequest 请求对象
     * @return AsyncInvoker<CreateDatakeyRequest, CreateDatakeyResponse>
     */
    public AsyncInvoker<CreateDatakeyRequest, CreateDatakeyResponse> createDatakeyAsyncInvoker(
        CreateDatakeyRequest request) {
        return new AsyncInvoker<CreateDatakeyRequest, CreateDatakeyResponse>(request, KmsMeta.createDatakey, hcClient);
    }

    /**
     * 创建不含明文数据密钥
     *
     * - 功能介绍：创建数据密钥，返回结果只包含密文。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDatakeyWithoutPlaintextRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDatakeyWithoutPlaintextRequest 请求对象
     * @return AsyncInvoker<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse>
     */
    public AsyncInvoker<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse> createDatakeyWithoutPlaintextAsyncInvoker(
        CreateDatakeyWithoutPlaintextRequest request) {
        return new AsyncInvoker<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse>(request,
            KmsMeta.createDatakeyWithoutPlaintext, hcClient);
    }

    /**
     * 创建授权
     *
     * - 功能介绍：创建授权，被授权用户可以对授权密钥进行操作。
     * - 说明：
     *    - 服务默认主密钥（密钥别名后缀为“/default”）不可以授权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateGrantRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateGrantRequest 请求对象
     * @return AsyncInvoker<CreateGrantRequest, CreateGrantResponse>
     */
    public AsyncInvoker<CreateGrantRequest, CreateGrantResponse> createGrantAsyncInvoker(CreateGrantRequest request) {
        return new AsyncInvoker<CreateGrantRequest, CreateGrantResponse>(request, KmsMeta.createGrant, hcClient);
    }

    /**
     * 创建密钥
     *
     * 创建用户主密钥，用户主密钥可以为对称密钥或非对称密钥。
     * - 对称密钥为长度为256位AES密钥或者128位SM4密钥，可用于小量数据的加密或者用于加密数据密钥。
     * - 非对称密钥可以为RSA密钥对或者ECC密钥对（包含SM2密钥对），可用于加解密数据、数字签名及验签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateKeyRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateKeyRequest 请求对象
     * @return AsyncInvoker<CreateKeyRequest, CreateKeyResponse>
     */
    public AsyncInvoker<CreateKeyRequest, CreateKeyResponse> createKeyAsyncInvoker(CreateKeyRequest request) {
        return new AsyncInvoker<CreateKeyRequest, CreateKeyResponse>(request, KmsMeta.createKey, hcClient);
    }

    /**
     * 创建专属密钥库
     *
     * - \&quot;创建租户专属密钥库，专属密钥库使用DHSM实例作为密钥的存储\&quot;
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateKeyStoreRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateKeyStoreRequest 请求对象
     * @return AsyncInvoker<CreateKeyStoreRequest, CreateKeyStoreResponse>
     */
    public AsyncInvoker<CreateKeyStoreRequest, CreateKeyStoreResponse> createKeyStoreAsyncInvoker(
        CreateKeyStoreRequest request) {
        return new AsyncInvoker<CreateKeyStoreRequest, CreateKeyStoreResponse>(request, KmsMeta.createKeyStore,
            hcClient);
    }

    /**
     * 添加密钥标签
     *
     * - 功能介绍：添加密钥标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateKmsTagRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateKmsTagRequest 请求对象
     * @return AsyncInvoker<CreateKmsTagRequest, CreateKmsTagResponse>
     */
    public AsyncInvoker<CreateKmsTagRequest, CreateKmsTagResponse> createKmsTagAsyncInvoker(
        CreateKmsTagRequest request) {
        return new AsyncInvoker<CreateKmsTagRequest, CreateKmsTagResponse>(request, KmsMeta.createKmsTag, hcClient);
    }

    /**
     * 获取密钥导入参数
     *
     * - 功能介绍：获取导入密钥的必要参数，包括密钥导入令牌和密钥加密公钥。
     * - 说明：返回的公钥类型默认为RSA_2048。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateParametersForImportRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateParametersForImportRequest 请求对象
     * @return AsyncInvoker<CreateParametersForImportRequest, CreateParametersForImportResponse>
     */
    public AsyncInvoker<CreateParametersForImportRequest, CreateParametersForImportResponse> createParametersForImportAsyncInvoker(
        CreateParametersForImportRequest request) {
        return new AsyncInvoker<CreateParametersForImportRequest, CreateParametersForImportResponse>(request,
            KmsMeta.createParametersForImport, hcClient);
    }

    /**
     * 创建随机数
     *
     * - 功能介绍：
     *   生成8~8192bit范围内的随机数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRandomRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRandomRequest 请求对象
     * @return AsyncInvoker<CreateRandomRequest, CreateRandomResponse>
     */
    public AsyncInvoker<CreateRandomRequest, CreateRandomResponse> createRandomAsyncInvoker(
        CreateRandomRequest request) {
        return new AsyncInvoker<CreateRandomRequest, CreateRandomResponse>(request, KmsMeta.createRandom, hcClient);
    }

    /**
     * 解密数据
     *
     * - 功能介绍：解密数据。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DecryptDataRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DecryptDataRequest 请求对象
     * @return AsyncInvoker<DecryptDataRequest, DecryptDataResponse>
     */
    public AsyncInvoker<DecryptDataRequest, DecryptDataResponse> decryptDataAsyncInvoker(DecryptDataRequest request) {
        return new AsyncInvoker<DecryptDataRequest, DecryptDataResponse>(request, KmsMeta.decryptData, hcClient);
    }

    /**
     * 解密数据密钥
     *
     * - 功能介绍：解密数据密钥，用指定的主密钥解密数据密钥。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DecryptDatakeyRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DecryptDatakeyRequest 请求对象
     * @return AsyncInvoker<DecryptDatakeyRequest, DecryptDatakeyResponse>
     */
    public AsyncInvoker<DecryptDatakeyRequest, DecryptDatakeyResponse> decryptDatakeyAsyncInvoker(
        DecryptDatakeyRequest request) {
        return new AsyncInvoker<DecryptDatakeyRequest, DecryptDatakeyResponse>(request, KmsMeta.decryptDatakey,
            hcClient);
    }

    /**
     * 删除密钥材料
     *
     * - 功能介绍：删除密钥材料信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteImportedKeyMaterialRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteImportedKeyMaterialRequest 请求对象
     * @return AsyncInvoker<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse>
     */
    public AsyncInvoker<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse> deleteImportedKeyMaterialAsyncInvoker(
        DeleteImportedKeyMaterialRequest request) {
        return new AsyncInvoker<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse>(request,
            KmsMeta.deleteImportedKeyMaterial, hcClient);
    }

    /**
     * 计划删除密钥
     *
     * - 功能介绍：计划多少天后删除密钥，可设置7天～1096天内删除密钥。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteKeyRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteKeyRequest 请求对象
     * @return AsyncInvoker<DeleteKeyRequest, DeleteKeyResponse>
     */
    public AsyncInvoker<DeleteKeyRequest, DeleteKeyResponse> deleteKeyAsyncInvoker(DeleteKeyRequest request) {
        return new AsyncInvoker<DeleteKeyRequest, DeleteKeyResponse>(request, KmsMeta.deleteKey, hcClient);
    }

    /**
     * 删除专属密钥库
     *
     * 删除租户专属密钥库
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteKeyStoreRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteKeyStoreRequest 请求对象
     * @return AsyncInvoker<DeleteKeyStoreRequest, DeleteKeyStoreResponse>
     */
    public AsyncInvoker<DeleteKeyStoreRequest, DeleteKeyStoreResponse> deleteKeyStoreAsyncInvoker(
        DeleteKeyStoreRequest request) {
        return new AsyncInvoker<DeleteKeyStoreRequest, DeleteKeyStoreResponse>(request, KmsMeta.deleteKeyStore,
            hcClient);
    }

    /**
     * 删除密钥标签
     *
     * - 功能介绍：删除密钥标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return AsyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public AsyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagAsyncInvoker(DeleteTagRequest request) {
        return new AsyncInvoker<DeleteTagRequest, DeleteTagResponse>(request, KmsMeta.deleteTag, hcClient);
    }

    /**
     * 禁用密钥
     *
     * - 功能介绍：禁用密钥，密钥禁用后不可以使用。
     * - 说明：密钥为启用状态才能禁用密钥。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisableKeyRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisableKeyRequest 请求对象
     * @return AsyncInvoker<DisableKeyRequest, DisableKeyResponse>
     */
    public AsyncInvoker<DisableKeyRequest, DisableKeyResponse> disableKeyAsyncInvoker(DisableKeyRequest request) {
        return new AsyncInvoker<DisableKeyRequest, DisableKeyResponse>(request, KmsMeta.disableKey, hcClient);
    }

    /**
     * 关闭密钥轮换
     *
     * - 功能介绍：关闭用户主密钥轮换。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisableKeyRotationRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisableKeyRotationRequest 请求对象
     * @return AsyncInvoker<DisableKeyRotationRequest, DisableKeyRotationResponse>
     */
    public AsyncInvoker<DisableKeyRotationRequest, DisableKeyRotationResponse> disableKeyRotationAsyncInvoker(
        DisableKeyRotationRequest request) {
        return new AsyncInvoker<DisableKeyRotationRequest, DisableKeyRotationResponse>(request,
            KmsMeta.disableKeyRotation, hcClient);
    }

    /**
     * 禁用专属密钥库
     *
     * 禁用租户专属密钥库
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisableKeyStoreRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisableKeyStoreRequest 请求对象
     * @return AsyncInvoker<DisableKeyStoreRequest, DisableKeyStoreResponse>
     */
    public AsyncInvoker<DisableKeyStoreRequest, DisableKeyStoreResponse> disableKeyStoreAsyncInvoker(
        DisableKeyStoreRequest request) {
        return new AsyncInvoker<DisableKeyStoreRequest, DisableKeyStoreResponse>(request, KmsMeta.disableKeyStore,
            hcClient);
    }

    /**
     * 启用密钥
     *
     * - 功能介绍：启用密钥，密钥启用后才可以使用。
     * - 说明：密钥为禁用状态才能启用密钥。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EnableKeyRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EnableKeyRequest 请求对象
     * @return AsyncInvoker<EnableKeyRequest, EnableKeyResponse>
     */
    public AsyncInvoker<EnableKeyRequest, EnableKeyResponse> enableKeyAsyncInvoker(EnableKeyRequest request) {
        return new AsyncInvoker<EnableKeyRequest, EnableKeyResponse>(request, KmsMeta.enableKey, hcClient);
    }

    /**
     * 开启密钥轮换
     *
     * - 功能介绍：开启用户主密钥轮换。
     * - 说明：
     *   - 开启密钥轮换后，默认轮换间隔时间为365天。
     *   - 默认主密钥及外部导入密钥不支持轮换操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EnableKeyRotationRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EnableKeyRotationRequest 请求对象
     * @return AsyncInvoker<EnableKeyRotationRequest, EnableKeyRotationResponse>
     */
    public AsyncInvoker<EnableKeyRotationRequest, EnableKeyRotationResponse> enableKeyRotationAsyncInvoker(
        EnableKeyRotationRequest request) {
        return new AsyncInvoker<EnableKeyRotationRequest, EnableKeyRotationResponse>(request, KmsMeta.enableKeyRotation,
            hcClient);
    }

    /**
     * 启用专属密钥库
     *
     * 启用租户专属密钥库
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EnableKeyStoreRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EnableKeyStoreRequest 请求对象
     * @return AsyncInvoker<EnableKeyStoreRequest, EnableKeyStoreResponse>
     */
    public AsyncInvoker<EnableKeyStoreRequest, EnableKeyStoreResponse> enableKeyStoreAsyncInvoker(
        EnableKeyStoreRequest request) {
        return new AsyncInvoker<EnableKeyStoreRequest, EnableKeyStoreResponse>(request, KmsMeta.enableKeyStore,
            hcClient);
    }

    /**
     * 加密数据
     *
     * - 功能介绍：加密数据，用指定的用户主密钥加密数据。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EncryptDataRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EncryptDataRequest 请求对象
     * @return AsyncInvoker<EncryptDataRequest, EncryptDataResponse>
     */
    public AsyncInvoker<EncryptDataRequest, EncryptDataResponse> encryptDataAsyncInvoker(EncryptDataRequest request) {
        return new AsyncInvoker<EncryptDataRequest, EncryptDataResponse>(request, KmsMeta.encryptData, hcClient);
    }

    /**
     * 加密数据密钥
     *
     * - 功能介绍：加密数据密钥，用指定的主密钥加密数据密钥。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EncryptDatakeyRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EncryptDatakeyRequest 请求对象
     * @return AsyncInvoker<EncryptDatakeyRequest, EncryptDatakeyResponse>
     */
    public AsyncInvoker<EncryptDatakeyRequest, EncryptDatakeyResponse> encryptDatakeyAsyncInvoker(
        EncryptDatakeyRequest request) {
        return new AsyncInvoker<EncryptDatakeyRequest, EncryptDatakeyResponse>(request, KmsMeta.encryptDatakey,
            hcClient);
    }

    /**
     * 导入密钥材料
     *
     * - 功能介绍：导入密钥材料。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ImportKeyMaterialRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ImportKeyMaterialRequest 请求对象
     * @return AsyncInvoker<ImportKeyMaterialRequest, ImportKeyMaterialResponse>
     */
    public AsyncInvoker<ImportKeyMaterialRequest, ImportKeyMaterialResponse> importKeyMaterialAsyncInvoker(
        ImportKeyMaterialRequest request) {
        return new AsyncInvoker<ImportKeyMaterialRequest, ImportKeyMaterialResponse>(request, KmsMeta.importKeyMaterial,
            hcClient);
    }

    /**
     * 查询授权列表
     *
     * - 功能介绍：查询密钥的授权列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListGrantsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListGrantsRequest 请求对象
     * @return AsyncInvoker<ListGrantsRequest, ListGrantsResponse>
     */
    public AsyncInvoker<ListGrantsRequest, ListGrantsResponse> listGrantsAsyncInvoker(ListGrantsRequest request) {
        return new AsyncInvoker<ListGrantsRequest, ListGrantsResponse>(request, KmsMeta.listGrants, hcClient);
    }

    /**
     * 查询密钥信息
     *
     * - 功能介绍：查询密钥详细信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListKeyDetailRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListKeyDetailRequest 请求对象
     * @return AsyncInvoker<ListKeyDetailRequest, ListKeyDetailResponse>
     */
    public AsyncInvoker<ListKeyDetailRequest, ListKeyDetailResponse> listKeyDetailAsyncInvoker(
        ListKeyDetailRequest request) {
        return new AsyncInvoker<ListKeyDetailRequest, ListKeyDetailResponse>(request, KmsMeta.listKeyDetail, hcClient);
    }

    /**
     * 查询专属密钥库列表
     *
     * 查询租户专属密钥库列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListKeyStoresRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListKeyStoresRequest 请求对象
     * @return AsyncInvoker<ListKeyStoresRequest, ListKeyStoresResponse>
     */
    public AsyncInvoker<ListKeyStoresRequest, ListKeyStoresResponse> listKeyStoresAsyncInvoker(
        ListKeyStoresRequest request) {
        return new AsyncInvoker<ListKeyStoresRequest, ListKeyStoresResponse>(request, KmsMeta.listKeyStores, hcClient);
    }

    /**
     * 查询密钥列表
     *
     * - 功能介绍：查询用户所有密钥列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListKeysRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListKeysRequest 请求对象
     * @return AsyncInvoker<ListKeysRequest, ListKeysResponse>
     */
    public AsyncInvoker<ListKeysRequest, ListKeysResponse> listKeysAsyncInvoker(ListKeysRequest request) {
        return new AsyncInvoker<ListKeysRequest, ListKeysResponse>(request, KmsMeta.listKeys, hcClient);
    }

    /**
     * 查询密钥实例
     *
     * - 功能介绍：查询密钥实例。通过标签过滤，查询指定用户主密钥的详细信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListKmsByTagsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListKmsByTagsRequest 请求对象
     * @return AsyncInvoker<ListKmsByTagsRequest, ListKmsByTagsResponse>
     */
    public AsyncInvoker<ListKmsByTagsRequest, ListKmsByTagsResponse> listKmsByTagsAsyncInvoker(
        ListKmsByTagsRequest request) {
        return new AsyncInvoker<ListKmsByTagsRequest, ListKmsByTagsResponse>(request, KmsMeta.listKmsByTags, hcClient);
    }

    /**
     * 查询项目标签
     *
     * - 功能介绍：查询用户在指定项目下的所有标签集合。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListKmsTagsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListKmsTagsRequest 请求对象
     * @return AsyncInvoker<ListKmsTagsRequest, ListKmsTagsResponse>
     */
    public AsyncInvoker<ListKmsTagsRequest, ListKmsTagsResponse> listKmsTagsAsyncInvoker(ListKmsTagsRequest request) {
        return new AsyncInvoker<ListKmsTagsRequest, ListKmsTagsResponse>(request, KmsMeta.listKmsTags, hcClient);
    }

    /**
     * 查询可退役授权列表
     *
     * - 功能介绍：查询用户可以退役的授权列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRetirableGrantsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRetirableGrantsRequest 请求对象
     * @return AsyncInvoker<ListRetirableGrantsRequest, ListRetirableGrantsResponse>
     */
    public AsyncInvoker<ListRetirableGrantsRequest, ListRetirableGrantsResponse> listRetirableGrantsAsyncInvoker(
        ListRetirableGrantsRequest request) {
        return new AsyncInvoker<ListRetirableGrantsRequest, ListRetirableGrantsResponse>(request,
            KmsMeta.listRetirableGrants, hcClient);
    }

    /**
     * 查询密钥轮换状态
     *
     * - 功能介绍：查询用户主密钥轮换状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowKeyRotationStatusRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowKeyRotationStatusRequest 请求对象
     * @return AsyncInvoker<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse>
     */
    public AsyncInvoker<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse> showKeyRotationStatusAsyncInvoker(
        ShowKeyRotationStatusRequest request) {
        return new AsyncInvoker<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse>(request,
            KmsMeta.showKeyRotationStatus, hcClient);
    }

    /**
     * 获取专属密钥库
     *
     * 获取租户专属密钥库
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowKeyStoreRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowKeyStoreRequest 请求对象
     * @return AsyncInvoker<ShowKeyStoreRequest, ShowKeyStoreResponse>
     */
    public AsyncInvoker<ShowKeyStoreRequest, ShowKeyStoreResponse> showKeyStoreAsyncInvoker(
        ShowKeyStoreRequest request) {
        return new AsyncInvoker<ShowKeyStoreRequest, ShowKeyStoreResponse>(request, KmsMeta.showKeyStore, hcClient);
    }

    /**
     * 查询密钥标签
     *
     * - 功能介绍：查询密钥标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowKmsTagsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowKmsTagsRequest 请求对象
     * @return AsyncInvoker<ShowKmsTagsRequest, ShowKmsTagsResponse>
     */
    public AsyncInvoker<ShowKmsTagsRequest, ShowKmsTagsResponse> showKmsTagsAsyncInvoker(ShowKmsTagsRequest request) {
        return new AsyncInvoker<ShowKmsTagsRequest, ShowKmsTagsResponse>(request, KmsMeta.showKmsTags, hcClient);
    }

    /**
     * 查询公钥信息
     *
     * - 查询用户指定非对称密钥的公钥信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPublicKeyRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPublicKeyRequest 请求对象
     * @return AsyncInvoker<ShowPublicKeyRequest, ShowPublicKeyResponse>
     */
    public AsyncInvoker<ShowPublicKeyRequest, ShowPublicKeyResponse> showPublicKeyAsyncInvoker(
        ShowPublicKeyRequest request) {
        return new AsyncInvoker<ShowPublicKeyRequest, ShowPublicKeyResponse>(request, KmsMeta.showPublicKey, hcClient);
    }

    /**
     * 查询实例数
     *
     * - 功能介绍：查询实例数，获取用户已经创建的用户主密钥数量。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowUserInstancesRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowUserInstancesRequest 请求对象
     * @return AsyncInvoker<ShowUserInstancesRequest, ShowUserInstancesResponse>
     */
    public AsyncInvoker<ShowUserInstancesRequest, ShowUserInstancesResponse> showUserInstancesAsyncInvoker(
        ShowUserInstancesRequest request) {
        return new AsyncInvoker<ShowUserInstancesRequest, ShowUserInstancesResponse>(request, KmsMeta.showUserInstances,
            hcClient);
    }

    /**
     * 查询配额
     *
     * - 功能介绍：查询配额，查询用户可以创建的用户主密钥配额总数及当前使用量信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowUserQuotasRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowUserQuotasRequest 请求对象
     * @return AsyncInvoker<ShowUserQuotasRequest, ShowUserQuotasResponse>
     */
    public AsyncInvoker<ShowUserQuotasRequest, ShowUserQuotasResponse> showUserQuotasAsyncInvoker(
        ShowUserQuotasRequest request) {
        return new AsyncInvoker<ShowUserQuotasRequest, ShowUserQuotasResponse>(request, KmsMeta.showUserQuotas,
            hcClient);
    }

    /**
     * 签名数据
     *
     * - 功能介绍：使用非对称密钥的私钥对消息或消息摘要进行数字签名。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SignRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SignRequest 请求对象
     * @return AsyncInvoker<SignRequest, SignResponse>
     */
    public AsyncInvoker<SignRequest, SignResponse> signAsyncInvoker(SignRequest request) {
        return new AsyncInvoker<SignRequest, SignResponse>(request, KmsMeta.sign, hcClient);
    }

    /**
     * 修改密钥别名
     *
     * - 功能介绍：修改用户主密钥别名。
     * - 说明：
     *    - 服务默认主密钥（密钥别名后缀为“/default”）不可以修改。
     *    - 密钥处于“计划删除”状态，密钥别名不可以修改。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateKeyAliasRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateKeyAliasRequest 请求对象
     * @return AsyncInvoker<UpdateKeyAliasRequest, UpdateKeyAliasResponse>
     */
    public AsyncInvoker<UpdateKeyAliasRequest, UpdateKeyAliasResponse> updateKeyAliasAsyncInvoker(
        UpdateKeyAliasRequest request) {
        return new AsyncInvoker<UpdateKeyAliasRequest, UpdateKeyAliasResponse>(request, KmsMeta.updateKeyAlias,
            hcClient);
    }

    /**
     * 修改密钥描述
     *
     * - 功能介绍：修改用户主密钥描述信息。
     * - 说明：
     *    - 服务默认主密钥（密钥别名后缀为“/default”）不可以修改。
     *    - 密钥处于“计划删除”状态，密钥描述不可以修改。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateKeyDescriptionRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateKeyDescriptionRequest 请求对象
     * @return AsyncInvoker<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse>
     */
    public AsyncInvoker<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse> updateKeyDescriptionAsyncInvoker(
        UpdateKeyDescriptionRequest request) {
        return new AsyncInvoker<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse>(request,
            KmsMeta.updateKeyDescription, hcClient);
    }

    /**
     * 修改密钥轮换周期
     *
     * - 功能介绍：修改用户主密钥轮换周期。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateKeyRotationIntervalRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateKeyRotationIntervalRequest 请求对象
     * @return AsyncInvoker<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse>
     */
    public AsyncInvoker<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse> updateKeyRotationIntervalAsyncInvoker(
        UpdateKeyRotationIntervalRequest request) {
        return new AsyncInvoker<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse>(request,
            KmsMeta.updateKeyRotationInterval, hcClient);
    }

    /**
     * 验证签名
     *
     * - 功能介绍：使用非对称密钥的私钥对消息或消息摘要进行签名验证。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ValidateSignatureRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ValidateSignatureRequest 请求对象
     * @return AsyncInvoker<ValidateSignatureRequest, ValidateSignatureResponse>
     */
    public AsyncInvoker<ValidateSignatureRequest, ValidateSignatureResponse> validateSignatureAsyncInvoker(
        ValidateSignatureRequest request) {
        return new AsyncInvoker<ValidateSignatureRequest, ValidateSignatureResponse>(request, KmsMeta.validateSignature,
            hcClient);
    }

    /**
     * 查询指定版本信息
     *
     * - 功能介绍：查指定API版本信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVersionRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVersionRequest 请求对象
     * @return AsyncInvoker<ShowVersionRequest, ShowVersionResponse>
     */
    public AsyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionAsyncInvoker(ShowVersionRequest request) {
        return new AsyncInvoker<ShowVersionRequest, ShowVersionResponse>(request, KmsMeta.showVersion, hcClient);
    }

    /**
     * 查询版本信息列表
     *
     * - 功能介绍：查询API版本信息列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVersionsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVersionsRequest 请求对象
     * @return AsyncInvoker<ShowVersionsRequest, ShowVersionsResponse>
     */
    public AsyncInvoker<ShowVersionsRequest, ShowVersionsResponse> showVersionsAsyncInvoker(
        ShowVersionsRequest request) {
        return new AsyncInvoker<ShowVersionsRequest, ShowVersionsResponse>(request, KmsMeta.showVersions, hcClient);
    }

}
