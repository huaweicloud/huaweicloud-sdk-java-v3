package com.huaweicloud.sdk.kms.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.kms.v1.model.*;

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
     * - 功能介绍：批量添加删除密钥标签。
     *
     * @param BatchCreateKmsTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateKmsTagsResponse>
     */
    public CompletableFuture<BatchCreateKmsTagsResponse> batchCreateKmsTagsAsync(BatchCreateKmsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.batchCreateKmsTags);
    }

    /**
     * 撤销授权
     * - 功能介绍：撤销授权，授权用户撤销被授权用户操作密钥的权限。 - 说明：    - 创建密钥的用户才能撤销该密钥授权。
     *
     * @param CancelGrantRequest 请求对象
     * @return CompletableFuture<CancelGrantResponse>
     */
    public CompletableFuture<CancelGrantResponse> cancelGrantAsync(CancelGrantRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.cancelGrant);
    }

    /**
     * 取消计划删除密钥
     * - 功能介绍：取消计划删除密钥。  - 说明：密钥处于“计划删除”状态才能取消计划删除密钥。
     *
     * @param CancelKeyDeletionRequest 请求对象
     * @return CompletableFuture<CancelKeyDeletionResponse>
     */
    public CompletableFuture<CancelKeyDeletionResponse> cancelKeyDeletionAsync(CancelKeyDeletionRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.cancelKeyDeletion);
    }

    /**
     * 退役授权
     * - 功能介绍：退役授权，表示被授权用户不再具有授权密钥的操作权。   例如：用户A授权用户B可以操作密钥A/key，同时授权用户C可以撤销该授权，   那么用户A、B、C均可退役该授权，退役授权后，用户B不再可以使用A/key。 - 须知：      可执行退役授权的主体包括：    - 创建授权的用户；    - 授权中retiring_principal指向的用户；    - 当授权的操作列表中包含retire-grant时，grantee_principal指向的用户。
     *
     * @param CancelSelfGrantRequest 请求对象
     * @return CompletableFuture<CancelSelfGrantResponse>
     */
    public CompletableFuture<CancelSelfGrantResponse> cancelSelfGrantAsync(CancelSelfGrantRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.cancelSelfGrant);
    }

    /**
     * 创建数据密钥
     * - 功能介绍：创建数据密钥，返回结果包含明文和密文。
     *
     * @param CreateDatakeyRequest 请求对象
     * @return CompletableFuture<CreateDatakeyResponse>
     */
    public CompletableFuture<CreateDatakeyResponse> createDatakeyAsync(CreateDatakeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createDatakey);
    }

    /**
     * 创建不含明文数据密钥
     * - 功能介绍：创建数据密钥，返回结果只包含密文。
     *
     * @param CreateDatakeyWithoutPlaintextRequest 请求对象
     * @return CompletableFuture<CreateDatakeyWithoutPlaintextResponse>
     */
    public CompletableFuture<CreateDatakeyWithoutPlaintextResponse> createDatakeyWithoutPlaintextAsync(CreateDatakeyWithoutPlaintextRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createDatakeyWithoutPlaintext);
    }

    /**
     * 创建授权
     * - 功能介绍：创建授权，被授权用户可以对授权密钥进行操作。 - 说明：    - 服务默认主密钥（密钥别名后缀为“/default”）不可以授权。
     *
     * @param CreateGrantRequest 请求对象
     * @return CompletableFuture<CreateGrantResponse>
     */
    public CompletableFuture<CreateGrantResponse> createGrantAsync(CreateGrantRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createGrant);
    }

    /**
     * 创建密钥
     * - 功能介绍：创建用户主密钥，可用来加密数据密钥。  - 说明： 别名“/default”为服务默认主密钥的后缀名，由服务自动创建。因此用户创建的主密钥别名不能与服务默认主密钥的别名相同，即后缀名不能为“/default”。对于开通企业项目的用户，服务默认主密钥属于且只能属于默认企业项目下，且不支持企业资源的迁入迁出。服务默认主密钥为用户提供基础的云上加密功能，满足合规要求。因此，在企业多项目下，其他非默认企业项目下的用户均可使用该密钥。若客户有企业管理资源诉求，请自行创建和使用密钥。
     *
     * @param CreateKeyRequest 请求对象
     * @return CompletableFuture<CreateKeyResponse>
     */
    public CompletableFuture<CreateKeyResponse> createKeyAsync(CreateKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createKey);
    }

    /**
     * 添加密钥标签
     * - 功能介绍：添加密钥标签。
     *
     * @param CreateKmsTagRequest 请求对象
     * @return CompletableFuture<CreateKmsTagResponse>
     */
    public CompletableFuture<CreateKmsTagResponse> createKmsTagAsync(CreateKmsTagRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createKmsTag);
    }

    /**
     * 获取密钥导入参数
     * - 功能介绍：获取导入密钥的必要参数，包括密钥导入令牌和密钥加密公钥。 - 说明：返回的公钥类型默认为RSA_2048。
     *
     * @param CreateParametersForImportRequest 请求对象
     * @return CompletableFuture<CreateParametersForImportResponse>
     */
    public CompletableFuture<CreateParametersForImportResponse> createParametersForImportAsync(CreateParametersForImportRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createParametersForImport);
    }

    /**
     * 创建随机数
     * - 功能介绍：   生成8~8192bit范围内的随机数。   生成512bit的随机数。
     *
     * @param CreateRandomRequest 请求对象
     * @return CompletableFuture<CreateRandomResponse>
     */
    public CompletableFuture<CreateRandomResponse> createRandomAsync(CreateRandomRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createRandom);
    }

    /**
     * 解密数据
     * - 功能介绍：解密数据。
     *
     * @param DecryptDataRequest 请求对象
     * @return CompletableFuture<DecryptDataResponse>
     */
    public CompletableFuture<DecryptDataResponse> decryptDataAsync(DecryptDataRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.decryptData);
    }

    /**
     * 解密数据密钥
     * - 功能介绍：解密数据密钥，用指定的主密钥解密数据密钥。
     *
     * @param DecryptDatakeyRequest 请求对象
     * @return CompletableFuture<DecryptDatakeyResponse>
     */
    public CompletableFuture<DecryptDatakeyResponse> decryptDatakeyAsync(DecryptDatakeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.decryptDatakey);
    }

    /**
     * 删除密钥材料
     * - 功能介绍：删除密钥材料信息。
     *
     * @param DeleteImportedKeyMaterialRequest 请求对象
     * @return CompletableFuture<DeleteImportedKeyMaterialResponse>
     */
    public CompletableFuture<DeleteImportedKeyMaterialResponse> deleteImportedKeyMaterialAsync(DeleteImportedKeyMaterialRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.deleteImportedKeyMaterial);
    }

    /**
     * 计划删除密钥
     * - 功能介绍：计划多少天后删除密钥，可设置7天～1096天内删除密钥。
     *
     * @param DeleteKeyRequest 请求对象
     * @return CompletableFuture<DeleteKeyResponse>
     */
    public CompletableFuture<DeleteKeyResponse> deleteKeyAsync(DeleteKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.deleteKey);
    }

    /**
     * 删除密钥标签
     * - 功能介绍：删除密钥标签。
     *
     * @param DeleteTagRequest 请求对象
     * @return CompletableFuture<DeleteTagResponse>
     */
    public CompletableFuture<DeleteTagResponse> deleteTagAsync(DeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.deleteTag);
    }

    /**
     * 禁用密钥
     * - 功能介绍：禁用密钥，密钥禁用后不可以使用。  - 说明：密钥为启用状态才能禁用密钥。
     *
     * @param DisableKeyRequest 请求对象
     * @return CompletableFuture<DisableKeyResponse>
     */
    public CompletableFuture<DisableKeyResponse> disableKeyAsync(DisableKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.disableKey);
    }

    /**
     * 关闭密钥轮换
     * - 功能介绍：关闭用户主密钥轮换。
     *
     * @param DisableKeyRotationRequest 请求对象
     * @return CompletableFuture<DisableKeyRotationResponse>
     */
    public CompletableFuture<DisableKeyRotationResponse> disableKeyRotationAsync(DisableKeyRotationRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.disableKeyRotation);
    }

    /**
     * 启用密钥
     * - 功能介绍：启用密钥，密钥启用后才可以使用。  - 说明：密钥为禁用状态才能启用密钥。
     *
     * @param EnableKeyRequest 请求对象
     * @return CompletableFuture<EnableKeyResponse>
     */
    public CompletableFuture<EnableKeyResponse> enableKeyAsync(EnableKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.enableKey);
    }

    /**
     * 开启密钥轮换
     * - 功能介绍：开启用户主密钥轮换。 - 说明：   - 开启密钥轮换后，默认轮询间隔时间为365天。   - 默认主密钥及外部导入密钥不支持轮换操作。
     *
     * @param EnableKeyRotationRequest 请求对象
     * @return CompletableFuture<EnableKeyRotationResponse>
     */
    public CompletableFuture<EnableKeyRotationResponse> enableKeyRotationAsync(EnableKeyRotationRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.enableKeyRotation);
    }

    /**
     * 加密数据
     * - 功能介绍：加密数据，用指定的用户主密钥加密数据。
     *
     * @param EncryptDataRequest 请求对象
     * @return CompletableFuture<EncryptDataResponse>
     */
    public CompletableFuture<EncryptDataResponse> encryptDataAsync(EncryptDataRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.encryptData);
    }

    /**
     * 加密数据密钥
     * - 功能介绍：加密数据密钥，用指定的主密钥加密数据密钥。
     *
     * @param EncryptDatakeyRequest 请求对象
     * @return CompletableFuture<EncryptDatakeyResponse>
     */
    public CompletableFuture<EncryptDatakeyResponse> encryptDatakeyAsync(EncryptDatakeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.encryptDatakey);
    }

    /**
     * 导入密钥材料
     * - 功能介绍：导入密钥材料。
     *
     * @param ImportKeyMaterialRequest 请求对象
     * @return CompletableFuture<ImportKeyMaterialResponse>
     */
    public CompletableFuture<ImportKeyMaterialResponse> importKeyMaterialAsync(ImportKeyMaterialRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.importKeyMaterial);
    }

    /**
     * 查询授权列表
     * - 功能介绍：查询密钥的授权列表。
     *
     * @param ListGrantsRequest 请求对象
     * @return CompletableFuture<ListGrantsResponse>
     */
    public CompletableFuture<ListGrantsResponse> listGrantsAsync(ListGrantsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listGrants);
    }

    /**
     * 查询密钥信息
     * - 功能介绍：查询密钥详细信息。
     *
     * @param ListKeyDetailRequest 请求对象
     * @return CompletableFuture<ListKeyDetailResponse>
     */
    public CompletableFuture<ListKeyDetailResponse> listKeyDetailAsync(ListKeyDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKeyDetail);
    }

    /**
     * 查询密钥列表
     * - 功能介绍：查询用户所有密钥列表。
     *
     * @param ListKeysRequest 请求对象
     * @return CompletableFuture<ListKeysResponse>
     */
    public CompletableFuture<ListKeysResponse> listKeysAsync(ListKeysRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKeys);
    }

    /**
     * 查询密钥实例
     * - 功能介绍：查询密钥实例。通过标签过滤，查询指定用户主密钥的详细信息。
     *
     * @param ListKmsByTagsRequest 请求对象
     * @return CompletableFuture<ListKmsByTagsResponse>
     */
    public CompletableFuture<ListKmsByTagsResponse> listKmsByTagsAsync(ListKmsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKmsByTags);
    }

    /**
     * 查询项目标签
     * - 功能介绍：查询用户在指定项目下的所有标签集合。
     *
     * @param ListKmsTagsRequest 请求对象
     * @return CompletableFuture<ListKmsTagsResponse>
     */
    public CompletableFuture<ListKmsTagsResponse> listKmsTagsAsync(ListKmsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKmsTags);
    }

    /**
     * 查询可退役授权列表
     * - 功能介绍：查询用户可以退役的授权列表。
     *
     * @param ListRetirableGrantsRequest 请求对象
     * @return CompletableFuture<ListRetirableGrantsResponse>
     */
    public CompletableFuture<ListRetirableGrantsResponse> listRetirableGrantsAsync(ListRetirableGrantsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listRetirableGrants);
    }

    /**
     * 查询密钥轮换状态
     * - 功能介绍：查询用户主密钥轮换状态。
     *
     * @param ShowKeyRotationStatusRequest 请求对象
     * @return CompletableFuture<ShowKeyRotationStatusResponse>
     */
    public CompletableFuture<ShowKeyRotationStatusResponse> showKeyRotationStatusAsync(ShowKeyRotationStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showKeyRotationStatus);
    }

    /**
     * 查询密钥标签
     * - 功能介绍：查询密钥标签。
     *
     * @param ShowKmsTagsRequest 请求对象
     * @return CompletableFuture<ShowKmsTagsResponse>
     */
    public CompletableFuture<ShowKmsTagsResponse> showKmsTagsAsync(ShowKmsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showKmsTags);
    }

    /**
     * 查询实例数
     * - 功能介绍：查询实例数，获取用户已经创建的用户主密钥数量。
     *
     * @param ShowUserInstancesRequest 请求对象
     * @return CompletableFuture<ShowUserInstancesResponse>
     */
    public CompletableFuture<ShowUserInstancesResponse> showUserInstancesAsync(ShowUserInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showUserInstances);
    }

    /**
     * 查询配额
     * - 功能介绍：查询配额，查询用户可以创建的用户主密钥配额总数及当前使用量信息。
     *
     * @param ShowUserQuotasRequest 请求对象
     * @return CompletableFuture<ShowUserQuotasResponse>
     */
    public CompletableFuture<ShowUserQuotasResponse> showUserQuotasAsync(ShowUserQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showUserQuotas);
    }

    /**
     * 修改密钥别名
     * - 功能介绍：修改用户主密钥别名。 - 说明：    - 服务默认主密钥（密钥别名后缀为“/default”）不可以修改。    - 密钥处于“计划删除”状态，密钥别名不可以修改。
     *
     * @param UpdateKeyAliasRequest 请求对象
     * @return CompletableFuture<UpdateKeyAliasResponse>
     */
    public CompletableFuture<UpdateKeyAliasResponse> updateKeyAliasAsync(UpdateKeyAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.updateKeyAlias);
    }

    /**
     * 修改密钥描述
     * - 功能介绍：修改用户主密钥描述信息。 - 说明：    - 服务默认主密钥（密钥别名后缀为“/default”）不可以修改。    - 密钥处于“计划删除”状态，密钥描述不可以修改。
     *
     * @param UpdateKeyDescriptionRequest 请求对象
     * @return CompletableFuture<UpdateKeyDescriptionResponse>
     */
    public CompletableFuture<UpdateKeyDescriptionResponse> updateKeyDescriptionAsync(UpdateKeyDescriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.updateKeyDescription);
    }

    /**
     * 修改密钥轮换周期
     * - 功能介绍：修改用户主密钥轮换周期。
     *
     * @param UpdateKeyRotationIntervalRequest 请求对象
     * @return CompletableFuture<UpdateKeyRotationIntervalResponse>
     */
    public CompletableFuture<UpdateKeyRotationIntervalResponse> updateKeyRotationIntervalAsync(UpdateKeyRotationIntervalRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.updateKeyRotationInterval);
    }

    /**
     * 查询指定版本信息
     * - 功能介绍：查指定API版本信息。
     *
     * @param ShowVersionRequest 请求对象
     * @return CompletableFuture<ShowVersionResponse>
     */
    public CompletableFuture<ShowVersionResponse> showVersionAsync(ShowVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showVersion);
    }

    /**
     * 查询版本信息列表
     * - 功能介绍：查询API版本信息列表。
     *
     * @param ShowVersionsRequest 请求对象
     * @return CompletableFuture<ShowVersionsResponse>
     */
    public CompletableFuture<ShowVersionsResponse> showVersionsAsync(ShowVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showVersions);
    }

}