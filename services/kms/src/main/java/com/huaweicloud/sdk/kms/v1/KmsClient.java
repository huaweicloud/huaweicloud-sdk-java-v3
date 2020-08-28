package com.huaweicloud.sdk.kms.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.kms.v1.model.*;

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
     * - 功能介绍：批量添加删除密钥标签。
     *
     * @param BatchCreateKmsTagsRequest 请求对象
     * @return BatchCreateKmsTagsResponse
    */
    public BatchCreateKmsTagsResponse batchCreateKmsTags(BatchCreateKmsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.batchCreateKmsTags);
    }

    /**
     * 撤销授权
     * - 功能介绍：撤销授权，授权用户撤销被授权用户操作密钥的权限。 - 说明：    - 创建密钥的用户才能撤销该密钥授权。
     *
     * @param CancelGrantRequest 请求对象
     * @return CancelGrantResponse
    */
    public CancelGrantResponse cancelGrant(CancelGrantRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.cancelGrant);
    }

    /**
     * 取消计划删除密钥
     * - 功能介绍：取消计划删除密钥。  - 说明：密钥处于“计划删除”状态才能取消计划删除密钥。
     *
     * @param CancelKeyDeletionRequest 请求对象
     * @return CancelKeyDeletionResponse
    */
    public CancelKeyDeletionResponse cancelKeyDeletion(CancelKeyDeletionRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.cancelKeyDeletion);
    }

    /**
     * 退役授权
     * - 功能介绍：退役授权，表示被授权用户不再具有授权密钥的操作权。   例如：用户A授权用户B可以操作密钥A/key，同时授权用户C可以撤销该授权，   那么用户A、B、C均可退役该授权，退役授权后，用户B不再可以使用A/key。 - 须知：      可执行退役授权的主体包括：    - 创建授权的用户；    - 授权中retiring_principal指向的用户；    - 当授权的操作列表中包含retire-grant时，grantee_principal指向的用户。
     *
     * @param CancelSelfGrantRequest 请求对象
     * @return CancelSelfGrantResponse
    */
    public CancelSelfGrantResponse cancelSelfGrant(CancelSelfGrantRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.cancelSelfGrant);
    }

    /**
     * 创建数据密钥
     * - 功能介绍：创建数据密钥，返回结果包含明文和密文。
     *
     * @param CreateDatakeyRequest 请求对象
     * @return CreateDatakeyResponse
    */
    public CreateDatakeyResponse createDatakey(CreateDatakeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createDatakey);
    }

    /**
     * 创建不含明文数据密钥
     * - 功能介绍：创建数据密钥，返回结果只包含密文。
     *
     * @param CreateDatakeyWithoutPlaintextRequest 请求对象
     * @return CreateDatakeyWithoutPlaintextResponse
    */
    public CreateDatakeyWithoutPlaintextResponse createDatakeyWithoutPlaintext(CreateDatakeyWithoutPlaintextRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createDatakeyWithoutPlaintext);
    }

    /**
     * 创建授权
     * - 功能介绍：创建授权，被授权用户可以对授权密钥进行操作。 - 说明：    - 服务默认主密钥（密钥别名后缀为“/default”）不可以授权。
     *
     * @param CreateGrantRequest 请求对象
     * @return CreateGrantResponse
    */
    public CreateGrantResponse createGrant(CreateGrantRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createGrant);
    }

    /**
     * 创建密钥
     * - 功能介绍：创建用户主密钥，可用来加密数据密钥。  - 说明： 别名“/default”为服务默认主密钥的后缀名，由服务自动创建。因此用户创建的主密钥别名不能与服务默认主密钥的别名相同，即后缀名不能为“/default”。对于开通企业项目的用户，服务默认主密钥属于且只能属于默认企业项目下，且不支持企业资源的迁入迁出。服务默认主密钥为用户提供基础的云上加密功能，满足合规要求。因此，在企业多项目下，其他非默认企业项目下的用户均可使用该密钥。若客户有企业管理资源诉求，请自行创建和使用密钥。
     *
     * @param CreateKeyRequest 请求对象
     * @return CreateKeyResponse
    */
    public CreateKeyResponse createKey(CreateKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createKey);
    }

    /**
     * 添加密钥标签
     * - 功能介绍：添加密钥标签。
     *
     * @param CreateKmsTagRequest 请求对象
     * @return CreateKmsTagResponse
    */
    public CreateKmsTagResponse createKmsTag(CreateKmsTagRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createKmsTag);
    }

    /**
     * 获取密钥导入参数
     * - 功能介绍：获取导入密钥的必要参数，包括密钥导入令牌和密钥加密公钥。 - 说明：返回的公钥类型默认为RSA_2048。
     *
     * @param CreateParametersForImportRequest 请求对象
     * @return CreateParametersForImportResponse
    */
    public CreateParametersForImportResponse createParametersForImport(CreateParametersForImportRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createParametersForImport);
    }

    /**
     * 创建随机数
     * - 功能介绍：   生成8~8192bit范围内的随机数。   生成512bit的随机数。
     *
     * @param CreateRandomRequest 请求对象
     * @return CreateRandomResponse
    */
    public CreateRandomResponse createRandom(CreateRandomRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createRandom);
    }

    /**
     * 解密数据
     * - 功能介绍：解密数据。
     *
     * @param DecryptDataRequest 请求对象
     * @return DecryptDataResponse
    */
    public DecryptDataResponse decryptData(DecryptDataRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.decryptData);
    }

    /**
     * 解密数据密钥
     * - 功能介绍：解密数据密钥，用指定的主密钥解密数据密钥。
     *
     * @param DecryptDatakeyRequest 请求对象
     * @return DecryptDatakeyResponse
    */
    public DecryptDatakeyResponse decryptDatakey(DecryptDatakeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.decryptDatakey);
    }

    /**
     * 删除密钥材料
     * - 功能介绍：删除密钥材料信息。
     *
     * @param DeleteImportedKeyMaterialRequest 请求对象
     * @return DeleteImportedKeyMaterialResponse
    */
    public DeleteImportedKeyMaterialResponse deleteImportedKeyMaterial(DeleteImportedKeyMaterialRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.deleteImportedKeyMaterial);
    }

    /**
     * 计划删除密钥
     * - 功能介绍：计划多少天后删除密钥，可设置7天～1096天内删除密钥。
     *
     * @param DeleteKeyRequest 请求对象
     * @return DeleteKeyResponse
    */
    public DeleteKeyResponse deleteKey(DeleteKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.deleteKey);
    }

    /**
     * 删除密钥标签
     * - 功能介绍：删除密钥标签。
     *
     * @param DeleteTagRequest 请求对象
     * @return DeleteTagResponse
    */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.deleteTag);
    }

    /**
     * 禁用密钥
     * - 功能介绍：禁用密钥，密钥禁用后不可以使用。  - 说明：密钥为启用状态才能禁用密钥。
     *
     * @param DisableKeyRequest 请求对象
     * @return DisableKeyResponse
    */
    public DisableKeyResponse disableKey(DisableKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.disableKey);
    }

    /**
     * 关闭密钥轮换
     * - 功能介绍：关闭用户主密钥轮换。
     *
     * @param DisableKeyRotationRequest 请求对象
     * @return DisableKeyRotationResponse
    */
    public DisableKeyRotationResponse disableKeyRotation(DisableKeyRotationRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.disableKeyRotation);
    }

    /**
     * 启用密钥
     * - 功能介绍：启用密钥，密钥启用后才可以使用。  - 说明：密钥为禁用状态才能启用密钥。
     *
     * @param EnableKeyRequest 请求对象
     * @return EnableKeyResponse
    */
    public EnableKeyResponse enableKey(EnableKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.enableKey);
    }

    /**
     * 开启密钥轮换
     * - 功能介绍：开启用户主密钥轮换。 - 说明：   - 开启密钥轮换后，默认轮询间隔时间为365天。   - 默认主密钥及外部导入密钥不支持轮换操作。
     *
     * @param EnableKeyRotationRequest 请求对象
     * @return EnableKeyRotationResponse
    */
    public EnableKeyRotationResponse enableKeyRotation(EnableKeyRotationRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.enableKeyRotation);
    }

    /**
     * 加密数据
     * - 功能介绍：加密数据，用指定的用户主密钥加密数据。
     *
     * @param EncryptDataRequest 请求对象
     * @return EncryptDataResponse
    */
    public EncryptDataResponse encryptData(EncryptDataRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.encryptData);
    }

    /**
     * 加密数据密钥
     * - 功能介绍：加密数据密钥，用指定的主密钥加密数据密钥。
     *
     * @param EncryptDatakeyRequest 请求对象
     * @return EncryptDatakeyResponse
    */
    public EncryptDatakeyResponse encryptDatakey(EncryptDatakeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.encryptDatakey);
    }

    /**
     * 导入密钥材料
     * - 功能介绍：导入密钥材料。
     *
     * @param ImportKeyMaterialRequest 请求对象
     * @return ImportKeyMaterialResponse
    */
    public ImportKeyMaterialResponse importKeyMaterial(ImportKeyMaterialRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.importKeyMaterial);
    }

    /**
     * 查询授权列表
     * - 功能介绍：查询密钥的授权列表。
     *
     * @param ListGrantsRequest 请求对象
     * @return ListGrantsResponse
    */
    public ListGrantsResponse listGrants(ListGrantsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listGrants);
    }

    /**
     * 查询密钥信息
     * - 功能介绍：查询密钥详细信息。
     *
     * @param ListKeyDetailRequest 请求对象
     * @return ListKeyDetailResponse
    */
    public ListKeyDetailResponse listKeyDetail(ListKeyDetailRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKeyDetail);
    }

    /**
     * 查询密钥列表
     * - 功能介绍：查询用户所有密钥列表。
     *
     * @param ListKeysRequest 请求对象
     * @return ListKeysResponse
    */
    public ListKeysResponse listKeys(ListKeysRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKeys);
    }

    /**
     * 查询密钥实例
     * - 功能介绍：查询密钥实例。通过标签过滤，查询指定用户主密钥的详细信息。
     *
     * @param ListKmsByTagsRequest 请求对象
     * @return ListKmsByTagsResponse
    */
    public ListKmsByTagsResponse listKmsByTags(ListKmsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKmsByTags);
    }

    /**
     * 查询项目标签
     * - 功能介绍：查询用户在指定项目下的所有标签集合。
     *
     * @param ListKmsTagsRequest 请求对象
     * @return ListKmsTagsResponse
    */
    public ListKmsTagsResponse listKmsTags(ListKmsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKmsTags);
    }

    /**
     * 查询可退役授权列表
     * - 功能介绍：查询用户可以退役的授权列表。
     *
     * @param ListRetirableGrantsRequest 请求对象
     * @return ListRetirableGrantsResponse
    */
    public ListRetirableGrantsResponse listRetirableGrants(ListRetirableGrantsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listRetirableGrants);
    }

    /**
     * 查询密钥轮换状态
     * - 功能介绍：查询用户主密钥轮换状态。
     *
     * @param ShowKeyRotationStatusRequest 请求对象
     * @return ShowKeyRotationStatusResponse
    */
    public ShowKeyRotationStatusResponse showKeyRotationStatus(ShowKeyRotationStatusRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showKeyRotationStatus);
    }

    /**
     * 查询密钥标签
     * - 功能介绍：查询密钥标签。
     *
     * @param ShowKmsTagsRequest 请求对象
     * @return ShowKmsTagsResponse
    */
    public ShowKmsTagsResponse showKmsTags(ShowKmsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showKmsTags);
    }

    /**
     * 查询实例数
     * - 功能介绍：查询实例数，获取用户已经创建的用户主密钥数量。
     *
     * @param ShowUserInstancesRequest 请求对象
     * @return ShowUserInstancesResponse
    */
    public ShowUserInstancesResponse showUserInstances(ShowUserInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showUserInstances);
    }

    /**
     * 查询配额
     * - 功能介绍：查询配额，查询用户可以创建的用户主密钥配额总数及当前使用量信息。
     *
     * @param ShowUserQuotasRequest 请求对象
     * @return ShowUserQuotasResponse
    */
    public ShowUserQuotasResponse showUserQuotas(ShowUserQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showUserQuotas);
    }

    /**
     * 修改密钥别名
     * - 功能介绍：修改用户主密钥别名。 - 说明：    - 服务默认主密钥（密钥别名后缀为“/default”）不可以修改。    - 密钥处于“计划删除”状态，密钥别名不可以修改。
     *
     * @param UpdateKeyAliasRequest 请求对象
     * @return UpdateKeyAliasResponse
    */
    public UpdateKeyAliasResponse updateKeyAlias(UpdateKeyAliasRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.updateKeyAlias);
    }

    /**
     * 修改密钥描述
     * - 功能介绍：修改用户主密钥描述信息。 - 说明：    - 服务默认主密钥（密钥别名后缀为“/default”）不可以修改。    - 密钥处于“计划删除”状态，密钥描述不可以修改。
     *
     * @param UpdateKeyDescriptionRequest 请求对象
     * @return UpdateKeyDescriptionResponse
    */
    public UpdateKeyDescriptionResponse updateKeyDescription(UpdateKeyDescriptionRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.updateKeyDescription);
    }

    /**
     * 修改密钥轮换周期
     * - 功能介绍：修改用户主密钥轮换周期。
     *
     * @param UpdateKeyRotationIntervalRequest 请求对象
     * @return UpdateKeyRotationIntervalResponse
    */
    public UpdateKeyRotationIntervalResponse updateKeyRotationInterval(UpdateKeyRotationIntervalRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.updateKeyRotationInterval);
    }

    /**
     * 查询指定版本信息
     * - 功能介绍：查指定API版本信息。
     *
     * @param ShowVersionRequest 请求对象
     * @return ShowVersionResponse
    */
    public ShowVersionResponse showVersion(ShowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showVersion);
    }

    /**
     * 查询版本信息列表
     * - 功能介绍：查询API版本信息列表。
     *
     * @param ShowVersionsRequest 请求对象
     * @return ShowVersionsResponse
    */
    public ShowVersionsResponse showVersions(ShowVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showVersions);
    }

}