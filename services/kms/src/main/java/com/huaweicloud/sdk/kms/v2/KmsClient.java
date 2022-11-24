package com.huaweicloud.sdk.kms.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.kms.v2.model.*;

public class KmsClient {

    protected HcClient hcClient;

    public KmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KmsClient> newBuilder() {
        return new ClientBuilder<>(KmsClient::new);
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
     * @return BatchCreateKmsTagsResponse
     */
    public BatchCreateKmsTagsResponse batchCreateKmsTags(BatchCreateKmsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.batchCreateKmsTags);
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
     * @return SyncInvoker<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse>
     */
    public SyncInvoker<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse> batchCreateKmsTagsInvoker(
        BatchCreateKmsTagsRequest request) {
        return new SyncInvoker<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse>(request,
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
     * @return CancelGrantResponse
     */
    public CancelGrantResponse cancelGrant(CancelGrantRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.cancelGrant);
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
     * @return SyncInvoker<CancelGrantRequest, CancelGrantResponse>
     */
    public SyncInvoker<CancelGrantRequest, CancelGrantResponse> cancelGrantInvoker(CancelGrantRequest request) {
        return new SyncInvoker<CancelGrantRequest, CancelGrantResponse>(request, KmsMeta.cancelGrant, hcClient);
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
     * @return CancelKeyDeletionResponse
     */
    public CancelKeyDeletionResponse cancelKeyDeletion(CancelKeyDeletionRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.cancelKeyDeletion);
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
     * @return SyncInvoker<CancelKeyDeletionRequest, CancelKeyDeletionResponse>
     */
    public SyncInvoker<CancelKeyDeletionRequest, CancelKeyDeletionResponse> cancelKeyDeletionInvoker(
        CancelKeyDeletionRequest request) {
        return new SyncInvoker<CancelKeyDeletionRequest, CancelKeyDeletionResponse>(request, KmsMeta.cancelKeyDeletion,
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
     * @return CancelSelfGrantResponse
     */
    public CancelSelfGrantResponse cancelSelfGrant(CancelSelfGrantRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.cancelSelfGrant);
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
     * @return SyncInvoker<CancelSelfGrantRequest, CancelSelfGrantResponse>
     */
    public SyncInvoker<CancelSelfGrantRequest, CancelSelfGrantResponse> cancelSelfGrantInvoker(
        CancelSelfGrantRequest request) {
        return new SyncInvoker<CancelSelfGrantRequest, CancelSelfGrantResponse>(request, KmsMeta.cancelSelfGrant,
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
     * @return CreateDatakeyResponse
     */
    public CreateDatakeyResponse createDatakey(CreateDatakeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createDatakey);
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
     * @return SyncInvoker<CreateDatakeyRequest, CreateDatakeyResponse>
     */
    public SyncInvoker<CreateDatakeyRequest, CreateDatakeyResponse> createDatakeyInvoker(CreateDatakeyRequest request) {
        return new SyncInvoker<CreateDatakeyRequest, CreateDatakeyResponse>(request, KmsMeta.createDatakey, hcClient);
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
     * @return CreateDatakeyWithoutPlaintextResponse
     */
    public CreateDatakeyWithoutPlaintextResponse createDatakeyWithoutPlaintext(
        CreateDatakeyWithoutPlaintextRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createDatakeyWithoutPlaintext);
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
     * @return SyncInvoker<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse>
     */
    public SyncInvoker<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse> createDatakeyWithoutPlaintextInvoker(
        CreateDatakeyWithoutPlaintextRequest request) {
        return new SyncInvoker<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse>(request,
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
     * @return CreateGrantResponse
     */
    public CreateGrantResponse createGrant(CreateGrantRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createGrant);
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
     * @return SyncInvoker<CreateGrantRequest, CreateGrantResponse>
     */
    public SyncInvoker<CreateGrantRequest, CreateGrantResponse> createGrantInvoker(CreateGrantRequest request) {
        return new SyncInvoker<CreateGrantRequest, CreateGrantResponse>(request, KmsMeta.createGrant, hcClient);
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
     * @return CreateKeyResponse
     */
    public CreateKeyResponse createKey(CreateKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createKey);
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
     * @return SyncInvoker<CreateKeyRequest, CreateKeyResponse>
     */
    public SyncInvoker<CreateKeyRequest, CreateKeyResponse> createKeyInvoker(CreateKeyRequest request) {
        return new SyncInvoker<CreateKeyRequest, CreateKeyResponse>(request, KmsMeta.createKey, hcClient);
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
     * @return CreateKeyStoreResponse
     */
    public CreateKeyStoreResponse createKeyStore(CreateKeyStoreRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createKeyStore);
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
     * @return SyncInvoker<CreateKeyStoreRequest, CreateKeyStoreResponse>
     */
    public SyncInvoker<CreateKeyStoreRequest, CreateKeyStoreResponse> createKeyStoreInvoker(
        CreateKeyStoreRequest request) {
        return new SyncInvoker<CreateKeyStoreRequest, CreateKeyStoreResponse>(request, KmsMeta.createKeyStore,
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
     * @return CreateKmsTagResponse
     */
    public CreateKmsTagResponse createKmsTag(CreateKmsTagRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createKmsTag);
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
     * @return SyncInvoker<CreateKmsTagRequest, CreateKmsTagResponse>
     */
    public SyncInvoker<CreateKmsTagRequest, CreateKmsTagResponse> createKmsTagInvoker(CreateKmsTagRequest request) {
        return new SyncInvoker<CreateKmsTagRequest, CreateKmsTagResponse>(request, KmsMeta.createKmsTag, hcClient);
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
     * @return CreateParametersForImportResponse
     */
    public CreateParametersForImportResponse createParametersForImport(CreateParametersForImportRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createParametersForImport);
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
     * @return SyncInvoker<CreateParametersForImportRequest, CreateParametersForImportResponse>
     */
    public SyncInvoker<CreateParametersForImportRequest, CreateParametersForImportResponse> createParametersForImportInvoker(
        CreateParametersForImportRequest request) {
        return new SyncInvoker<CreateParametersForImportRequest, CreateParametersForImportResponse>(request,
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
     * @return CreateRandomResponse
     */
    public CreateRandomResponse createRandom(CreateRandomRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createRandom);
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
     * @return SyncInvoker<CreateRandomRequest, CreateRandomResponse>
     */
    public SyncInvoker<CreateRandomRequest, CreateRandomResponse> createRandomInvoker(CreateRandomRequest request) {
        return new SyncInvoker<CreateRandomRequest, CreateRandomResponse>(request, KmsMeta.createRandom, hcClient);
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
     * @return DecryptDataResponse
     */
    public DecryptDataResponse decryptData(DecryptDataRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.decryptData);
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
     * @return SyncInvoker<DecryptDataRequest, DecryptDataResponse>
     */
    public SyncInvoker<DecryptDataRequest, DecryptDataResponse> decryptDataInvoker(DecryptDataRequest request) {
        return new SyncInvoker<DecryptDataRequest, DecryptDataResponse>(request, KmsMeta.decryptData, hcClient);
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
     * @return DecryptDatakeyResponse
     */
    public DecryptDatakeyResponse decryptDatakey(DecryptDatakeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.decryptDatakey);
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
     * @return SyncInvoker<DecryptDatakeyRequest, DecryptDatakeyResponse>
     */
    public SyncInvoker<DecryptDatakeyRequest, DecryptDatakeyResponse> decryptDatakeyInvoker(
        DecryptDatakeyRequest request) {
        return new SyncInvoker<DecryptDatakeyRequest, DecryptDatakeyResponse>(request, KmsMeta.decryptDatakey,
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
     * @return DeleteImportedKeyMaterialResponse
     */
    public DeleteImportedKeyMaterialResponse deleteImportedKeyMaterial(DeleteImportedKeyMaterialRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.deleteImportedKeyMaterial);
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
     * @return SyncInvoker<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse>
     */
    public SyncInvoker<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse> deleteImportedKeyMaterialInvoker(
        DeleteImportedKeyMaterialRequest request) {
        return new SyncInvoker<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse>(request,
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
     * @return DeleteKeyResponse
     */
    public DeleteKeyResponse deleteKey(DeleteKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.deleteKey);
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
     * @return SyncInvoker<DeleteKeyRequest, DeleteKeyResponse>
     */
    public SyncInvoker<DeleteKeyRequest, DeleteKeyResponse> deleteKeyInvoker(DeleteKeyRequest request) {
        return new SyncInvoker<DeleteKeyRequest, DeleteKeyResponse>(request, KmsMeta.deleteKey, hcClient);
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
     * @return DeleteKeyStoreResponse
     */
    public DeleteKeyStoreResponse deleteKeyStore(DeleteKeyStoreRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.deleteKeyStore);
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
     * @return SyncInvoker<DeleteKeyStoreRequest, DeleteKeyStoreResponse>
     */
    public SyncInvoker<DeleteKeyStoreRequest, DeleteKeyStoreResponse> deleteKeyStoreInvoker(
        DeleteKeyStoreRequest request) {
        return new SyncInvoker<DeleteKeyStoreRequest, DeleteKeyStoreResponse>(request, KmsMeta.deleteKeyStore,
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
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.deleteTag);
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
     * @return SyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public SyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagInvoker(DeleteTagRequest request) {
        return new SyncInvoker<DeleteTagRequest, DeleteTagResponse>(request, KmsMeta.deleteTag, hcClient);
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
     * @return DisableKeyResponse
     */
    public DisableKeyResponse disableKey(DisableKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.disableKey);
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
     * @return SyncInvoker<DisableKeyRequest, DisableKeyResponse>
     */
    public SyncInvoker<DisableKeyRequest, DisableKeyResponse> disableKeyInvoker(DisableKeyRequest request) {
        return new SyncInvoker<DisableKeyRequest, DisableKeyResponse>(request, KmsMeta.disableKey, hcClient);
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
     * @return DisableKeyRotationResponse
     */
    public DisableKeyRotationResponse disableKeyRotation(DisableKeyRotationRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.disableKeyRotation);
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
     * @return SyncInvoker<DisableKeyRotationRequest, DisableKeyRotationResponse>
     */
    public SyncInvoker<DisableKeyRotationRequest, DisableKeyRotationResponse> disableKeyRotationInvoker(
        DisableKeyRotationRequest request) {
        return new SyncInvoker<DisableKeyRotationRequest, DisableKeyRotationResponse>(request,
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
     * @return DisableKeyStoreResponse
     */
    public DisableKeyStoreResponse disableKeyStore(DisableKeyStoreRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.disableKeyStore);
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
     * @return SyncInvoker<DisableKeyStoreRequest, DisableKeyStoreResponse>
     */
    public SyncInvoker<DisableKeyStoreRequest, DisableKeyStoreResponse> disableKeyStoreInvoker(
        DisableKeyStoreRequest request) {
        return new SyncInvoker<DisableKeyStoreRequest, DisableKeyStoreResponse>(request, KmsMeta.disableKeyStore,
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
     * @return EnableKeyResponse
     */
    public EnableKeyResponse enableKey(EnableKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.enableKey);
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
     * @return SyncInvoker<EnableKeyRequest, EnableKeyResponse>
     */
    public SyncInvoker<EnableKeyRequest, EnableKeyResponse> enableKeyInvoker(EnableKeyRequest request) {
        return new SyncInvoker<EnableKeyRequest, EnableKeyResponse>(request, KmsMeta.enableKey, hcClient);
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
     * @return EnableKeyRotationResponse
     */
    public EnableKeyRotationResponse enableKeyRotation(EnableKeyRotationRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.enableKeyRotation);
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
     * @return SyncInvoker<EnableKeyRotationRequest, EnableKeyRotationResponse>
     */
    public SyncInvoker<EnableKeyRotationRequest, EnableKeyRotationResponse> enableKeyRotationInvoker(
        EnableKeyRotationRequest request) {
        return new SyncInvoker<EnableKeyRotationRequest, EnableKeyRotationResponse>(request, KmsMeta.enableKeyRotation,
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
     * @return EnableKeyStoreResponse
     */
    public EnableKeyStoreResponse enableKeyStore(EnableKeyStoreRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.enableKeyStore);
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
     * @return SyncInvoker<EnableKeyStoreRequest, EnableKeyStoreResponse>
     */
    public SyncInvoker<EnableKeyStoreRequest, EnableKeyStoreResponse> enableKeyStoreInvoker(
        EnableKeyStoreRequest request) {
        return new SyncInvoker<EnableKeyStoreRequest, EnableKeyStoreResponse>(request, KmsMeta.enableKeyStore,
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
     * @return EncryptDataResponse
     */
    public EncryptDataResponse encryptData(EncryptDataRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.encryptData);
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
     * @return SyncInvoker<EncryptDataRequest, EncryptDataResponse>
     */
    public SyncInvoker<EncryptDataRequest, EncryptDataResponse> encryptDataInvoker(EncryptDataRequest request) {
        return new SyncInvoker<EncryptDataRequest, EncryptDataResponse>(request, KmsMeta.encryptData, hcClient);
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
     * @return EncryptDatakeyResponse
     */
    public EncryptDatakeyResponse encryptDatakey(EncryptDatakeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.encryptDatakey);
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
     * @return SyncInvoker<EncryptDatakeyRequest, EncryptDatakeyResponse>
     */
    public SyncInvoker<EncryptDatakeyRequest, EncryptDatakeyResponse> encryptDatakeyInvoker(
        EncryptDatakeyRequest request) {
        return new SyncInvoker<EncryptDatakeyRequest, EncryptDatakeyResponse>(request, KmsMeta.encryptDatakey,
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
     * @return ImportKeyMaterialResponse
     */
    public ImportKeyMaterialResponse importKeyMaterial(ImportKeyMaterialRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.importKeyMaterial);
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
     * @return SyncInvoker<ImportKeyMaterialRequest, ImportKeyMaterialResponse>
     */
    public SyncInvoker<ImportKeyMaterialRequest, ImportKeyMaterialResponse> importKeyMaterialInvoker(
        ImportKeyMaterialRequest request) {
        return new SyncInvoker<ImportKeyMaterialRequest, ImportKeyMaterialResponse>(request, KmsMeta.importKeyMaterial,
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
     * @return ListGrantsResponse
     */
    public ListGrantsResponse listGrants(ListGrantsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listGrants);
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
     * @return SyncInvoker<ListGrantsRequest, ListGrantsResponse>
     */
    public SyncInvoker<ListGrantsRequest, ListGrantsResponse> listGrantsInvoker(ListGrantsRequest request) {
        return new SyncInvoker<ListGrantsRequest, ListGrantsResponse>(request, KmsMeta.listGrants, hcClient);
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
     * @return ListKeyDetailResponse
     */
    public ListKeyDetailResponse listKeyDetail(ListKeyDetailRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKeyDetail);
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
     * @return SyncInvoker<ListKeyDetailRequest, ListKeyDetailResponse>
     */
    public SyncInvoker<ListKeyDetailRequest, ListKeyDetailResponse> listKeyDetailInvoker(ListKeyDetailRequest request) {
        return new SyncInvoker<ListKeyDetailRequest, ListKeyDetailResponse>(request, KmsMeta.listKeyDetail, hcClient);
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
     * @return ListKeyStoresResponse
     */
    public ListKeyStoresResponse listKeyStores(ListKeyStoresRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKeyStores);
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
     * @return SyncInvoker<ListKeyStoresRequest, ListKeyStoresResponse>
     */
    public SyncInvoker<ListKeyStoresRequest, ListKeyStoresResponse> listKeyStoresInvoker(ListKeyStoresRequest request) {
        return new SyncInvoker<ListKeyStoresRequest, ListKeyStoresResponse>(request, KmsMeta.listKeyStores, hcClient);
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
     * @return ListKeysResponse
     */
    public ListKeysResponse listKeys(ListKeysRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKeys);
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
     * @return SyncInvoker<ListKeysRequest, ListKeysResponse>
     */
    public SyncInvoker<ListKeysRequest, ListKeysResponse> listKeysInvoker(ListKeysRequest request) {
        return new SyncInvoker<ListKeysRequest, ListKeysResponse>(request, KmsMeta.listKeys, hcClient);
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
     * @return ListKmsByTagsResponse
     */
    public ListKmsByTagsResponse listKmsByTags(ListKmsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKmsByTags);
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
     * @return SyncInvoker<ListKmsByTagsRequest, ListKmsByTagsResponse>
     */
    public SyncInvoker<ListKmsByTagsRequest, ListKmsByTagsResponse> listKmsByTagsInvoker(ListKmsByTagsRequest request) {
        return new SyncInvoker<ListKmsByTagsRequest, ListKmsByTagsResponse>(request, KmsMeta.listKmsByTags, hcClient);
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
     * @return ListKmsTagsResponse
     */
    public ListKmsTagsResponse listKmsTags(ListKmsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKmsTags);
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
     * @return SyncInvoker<ListKmsTagsRequest, ListKmsTagsResponse>
     */
    public SyncInvoker<ListKmsTagsRequest, ListKmsTagsResponse> listKmsTagsInvoker(ListKmsTagsRequest request) {
        return new SyncInvoker<ListKmsTagsRequest, ListKmsTagsResponse>(request, KmsMeta.listKmsTags, hcClient);
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
     * @return ListRetirableGrantsResponse
     */
    public ListRetirableGrantsResponse listRetirableGrants(ListRetirableGrantsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listRetirableGrants);
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
     * @return SyncInvoker<ListRetirableGrantsRequest, ListRetirableGrantsResponse>
     */
    public SyncInvoker<ListRetirableGrantsRequest, ListRetirableGrantsResponse> listRetirableGrantsInvoker(
        ListRetirableGrantsRequest request) {
        return new SyncInvoker<ListRetirableGrantsRequest, ListRetirableGrantsResponse>(request,
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
     * @return ShowKeyRotationStatusResponse
     */
    public ShowKeyRotationStatusResponse showKeyRotationStatus(ShowKeyRotationStatusRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showKeyRotationStatus);
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
     * @return SyncInvoker<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse>
     */
    public SyncInvoker<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse> showKeyRotationStatusInvoker(
        ShowKeyRotationStatusRequest request) {
        return new SyncInvoker<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse>(request,
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
     * @return ShowKeyStoreResponse
     */
    public ShowKeyStoreResponse showKeyStore(ShowKeyStoreRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showKeyStore);
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
     * @return SyncInvoker<ShowKeyStoreRequest, ShowKeyStoreResponse>
     */
    public SyncInvoker<ShowKeyStoreRequest, ShowKeyStoreResponse> showKeyStoreInvoker(ShowKeyStoreRequest request) {
        return new SyncInvoker<ShowKeyStoreRequest, ShowKeyStoreResponse>(request, KmsMeta.showKeyStore, hcClient);
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
     * @return ShowKmsTagsResponse
     */
    public ShowKmsTagsResponse showKmsTags(ShowKmsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showKmsTags);
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
     * @return SyncInvoker<ShowKmsTagsRequest, ShowKmsTagsResponse>
     */
    public SyncInvoker<ShowKmsTagsRequest, ShowKmsTagsResponse> showKmsTagsInvoker(ShowKmsTagsRequest request) {
        return new SyncInvoker<ShowKmsTagsRequest, ShowKmsTagsResponse>(request, KmsMeta.showKmsTags, hcClient);
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
     * @return ShowPublicKeyResponse
     */
    public ShowPublicKeyResponse showPublicKey(ShowPublicKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showPublicKey);
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
     * @return SyncInvoker<ShowPublicKeyRequest, ShowPublicKeyResponse>
     */
    public SyncInvoker<ShowPublicKeyRequest, ShowPublicKeyResponse> showPublicKeyInvoker(ShowPublicKeyRequest request) {
        return new SyncInvoker<ShowPublicKeyRequest, ShowPublicKeyResponse>(request, KmsMeta.showPublicKey, hcClient);
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
     * @return ShowUserInstancesResponse
     */
    public ShowUserInstancesResponse showUserInstances(ShowUserInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showUserInstances);
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
     * @return SyncInvoker<ShowUserInstancesRequest, ShowUserInstancesResponse>
     */
    public SyncInvoker<ShowUserInstancesRequest, ShowUserInstancesResponse> showUserInstancesInvoker(
        ShowUserInstancesRequest request) {
        return new SyncInvoker<ShowUserInstancesRequest, ShowUserInstancesResponse>(request, KmsMeta.showUserInstances,
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
     * @return ShowUserQuotasResponse
     */
    public ShowUserQuotasResponse showUserQuotas(ShowUserQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showUserQuotas);
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
     * @return SyncInvoker<ShowUserQuotasRequest, ShowUserQuotasResponse>
     */
    public SyncInvoker<ShowUserQuotasRequest, ShowUserQuotasResponse> showUserQuotasInvoker(
        ShowUserQuotasRequest request) {
        return new SyncInvoker<ShowUserQuotasRequest, ShowUserQuotasResponse>(request, KmsMeta.showUserQuotas,
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
     * @return SignResponse
     */
    public SignResponse sign(SignRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.sign);
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
     * @return SyncInvoker<SignRequest, SignResponse>
     */
    public SyncInvoker<SignRequest, SignResponse> signInvoker(SignRequest request) {
        return new SyncInvoker<SignRequest, SignResponse>(request, KmsMeta.sign, hcClient);
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
     * @return UpdateKeyAliasResponse
     */
    public UpdateKeyAliasResponse updateKeyAlias(UpdateKeyAliasRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.updateKeyAlias);
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
     * @return SyncInvoker<UpdateKeyAliasRequest, UpdateKeyAliasResponse>
     */
    public SyncInvoker<UpdateKeyAliasRequest, UpdateKeyAliasResponse> updateKeyAliasInvoker(
        UpdateKeyAliasRequest request) {
        return new SyncInvoker<UpdateKeyAliasRequest, UpdateKeyAliasResponse>(request, KmsMeta.updateKeyAlias,
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
     * @return UpdateKeyDescriptionResponse
     */
    public UpdateKeyDescriptionResponse updateKeyDescription(UpdateKeyDescriptionRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.updateKeyDescription);
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
     * @return SyncInvoker<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse>
     */
    public SyncInvoker<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse> updateKeyDescriptionInvoker(
        UpdateKeyDescriptionRequest request) {
        return new SyncInvoker<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse>(request,
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
     * @return UpdateKeyRotationIntervalResponse
     */
    public UpdateKeyRotationIntervalResponse updateKeyRotationInterval(UpdateKeyRotationIntervalRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.updateKeyRotationInterval);
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
     * @return SyncInvoker<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse>
     */
    public SyncInvoker<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse> updateKeyRotationIntervalInvoker(
        UpdateKeyRotationIntervalRequest request) {
        return new SyncInvoker<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse>(request,
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
     * @return ValidateSignatureResponse
     */
    public ValidateSignatureResponse validateSignature(ValidateSignatureRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.validateSignature);
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
     * @return SyncInvoker<ValidateSignatureRequest, ValidateSignatureResponse>
     */
    public SyncInvoker<ValidateSignatureRequest, ValidateSignatureResponse> validateSignatureInvoker(
        ValidateSignatureRequest request) {
        return new SyncInvoker<ValidateSignatureRequest, ValidateSignatureResponse>(request, KmsMeta.validateSignature,
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
     * @return ShowVersionResponse
     */
    public ShowVersionResponse showVersion(ShowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showVersion);
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
     * @return SyncInvoker<ShowVersionRequest, ShowVersionResponse>
     */
    public SyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionInvoker(ShowVersionRequest request) {
        return new SyncInvoker<ShowVersionRequest, ShowVersionResponse>(request, KmsMeta.showVersion, hcClient);
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
     * @return ShowVersionsResponse
     */
    public ShowVersionsResponse showVersions(ShowVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showVersions);
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
     * @return SyncInvoker<ShowVersionsRequest, ShowVersionsResponse>
     */
    public SyncInvoker<ShowVersionsRequest, ShowVersionsResponse> showVersionsInvoker(ShowVersionsRequest request) {
        return new SyncInvoker<ShowVersionsRequest, ShowVersionsResponse>(request, KmsMeta.showVersions, hcClient);
    }

}
