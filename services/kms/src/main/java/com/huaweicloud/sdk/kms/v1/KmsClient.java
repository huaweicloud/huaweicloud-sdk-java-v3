package com.huaweicloud.sdk.kms.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.kms.v1.model.*;

public class KmsClient {

    protected HcClient hcClient;

    public KmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KmsClient> newBuilder() {
        return new ClientBuilder<>(KmsClient::new);
    }

    /** 批量添加删除密钥标签 - 功能介绍：批量添加删除密钥标签。
     *
     * @param BatchCreateKmsTagsRequest 请求对象
     * @return BatchCreateKmsTagsResponse */
    public BatchCreateKmsTagsResponse batchCreateKmsTags(BatchCreateKmsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.batchCreateKmsTags);
    }

    /** 批量添加删除密钥标签 - 功能介绍：批量添加删除密钥标签。
     *
     * @param BatchCreateKmsTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse> */
    public SyncInvoker<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse> batchCreateKmsTagsInvoker(
        BatchCreateKmsTagsRequest request) {
        return new SyncInvoker<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse>(request,
            KmsMeta.batchCreateKmsTags, hcClient);
    }

    /** 撤销授权 - 功能介绍：撤销授权，授权用户撤销被授权用户操作密钥的权限。 - 说明： - 创建密钥的用户才能撤销该密钥授权。
     *
     * @param CancelGrantRequest 请求对象
     * @return CancelGrantResponse */
    public CancelGrantResponse cancelGrant(CancelGrantRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.cancelGrant);
    }

    /** 撤销授权 - 功能介绍：撤销授权，授权用户撤销被授权用户操作密钥的权限。 - 说明： - 创建密钥的用户才能撤销该密钥授权。
     *
     * @param CancelGrantRequest 请求对象
     * @return SyncInvoker<CancelGrantRequest, CancelGrantResponse> */
    public SyncInvoker<CancelGrantRequest, CancelGrantResponse> cancelGrantInvoker(CancelGrantRequest request) {
        return new SyncInvoker<CancelGrantRequest, CancelGrantResponse>(request, KmsMeta.cancelGrant, hcClient);
    }

    /** 取消计划删除密钥 - 功能介绍：取消计划删除密钥。 - 说明：密钥处于“计划删除”状态才能取消计划删除密钥。
     *
     * @param CancelKeyDeletionRequest 请求对象
     * @return CancelKeyDeletionResponse */
    public CancelKeyDeletionResponse cancelKeyDeletion(CancelKeyDeletionRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.cancelKeyDeletion);
    }

    /** 取消计划删除密钥 - 功能介绍：取消计划删除密钥。 - 说明：密钥处于“计划删除”状态才能取消计划删除密钥。
     *
     * @param CancelKeyDeletionRequest 请求对象
     * @return SyncInvoker<CancelKeyDeletionRequest, CancelKeyDeletionResponse> */
    public SyncInvoker<CancelKeyDeletionRequest, CancelKeyDeletionResponse> cancelKeyDeletionInvoker(
        CancelKeyDeletionRequest request) {
        return new SyncInvoker<CancelKeyDeletionRequest, CancelKeyDeletionResponse>(request, KmsMeta.cancelKeyDeletion,
            hcClient);
    }

    /** 退役授权 - 功能介绍：退役授权，表示被授权用户不再具有授权密钥的操作权。 例如：用户A授权用户B可以操作密钥A/key，同时授权用户C可以撤销该授权，
     * 那么用户A、B、C均可退役该授权，退役授权后，用户B不再可以使用A/key。 - 须知： 可执行退役授权的主体包括： - 创建授权的用户； - 授权中retiring_principal指向的用户； -
     * 当授权的操作列表中包含retire-grant时，grantee_principal指向的用户。
     *
     * @param CancelSelfGrantRequest 请求对象
     * @return CancelSelfGrantResponse */
    public CancelSelfGrantResponse cancelSelfGrant(CancelSelfGrantRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.cancelSelfGrant);
    }

    /** 退役授权 - 功能介绍：退役授权，表示被授权用户不再具有授权密钥的操作权。 例如：用户A授权用户B可以操作密钥A/key，同时授权用户C可以撤销该授权，
     * 那么用户A、B、C均可退役该授权，退役授权后，用户B不再可以使用A/key。 - 须知： 可执行退役授权的主体包括： - 创建授权的用户； - 授权中retiring_principal指向的用户； -
     * 当授权的操作列表中包含retire-grant时，grantee_principal指向的用户。
     *
     * @param CancelSelfGrantRequest 请求对象
     * @return SyncInvoker<CancelSelfGrantRequest, CancelSelfGrantResponse> */
    public SyncInvoker<CancelSelfGrantRequest, CancelSelfGrantResponse> cancelSelfGrantInvoker(
        CancelSelfGrantRequest request) {
        return new SyncInvoker<CancelSelfGrantRequest, CancelSelfGrantResponse>(request, KmsMeta.cancelSelfGrant,
            hcClient);
    }

    /** 创建数据密钥 - 功能介绍：创建数据密钥，返回结果包含明文和密文。
     *
     * @param CreateDatakeyRequest 请求对象
     * @return CreateDatakeyResponse */
    public CreateDatakeyResponse createDatakey(CreateDatakeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createDatakey);
    }

    /** 创建数据密钥 - 功能介绍：创建数据密钥，返回结果包含明文和密文。
     *
     * @param CreateDatakeyRequest 请求对象
     * @return SyncInvoker<CreateDatakeyRequest, CreateDatakeyResponse> */
    public SyncInvoker<CreateDatakeyRequest, CreateDatakeyResponse> createDatakeyInvoker(CreateDatakeyRequest request) {
        return new SyncInvoker<CreateDatakeyRequest, CreateDatakeyResponse>(request, KmsMeta.createDatakey, hcClient);
    }

    /** 创建不含明文数据密钥 - 功能介绍：创建数据密钥，返回结果只包含密文。
     *
     * @param CreateDatakeyWithoutPlaintextRequest 请求对象
     * @return CreateDatakeyWithoutPlaintextResponse */
    public CreateDatakeyWithoutPlaintextResponse createDatakeyWithoutPlaintext(
        CreateDatakeyWithoutPlaintextRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createDatakeyWithoutPlaintext);
    }

    /** 创建不含明文数据密钥 - 功能介绍：创建数据密钥，返回结果只包含密文。
     *
     * @param CreateDatakeyWithoutPlaintextRequest 请求对象
     * @return SyncInvoker<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse> */
    public SyncInvoker<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse> createDatakeyWithoutPlaintextInvoker(
        CreateDatakeyWithoutPlaintextRequest request) {
        return new SyncInvoker<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse>(request,
            KmsMeta.createDatakeyWithoutPlaintext, hcClient);
    }

    /** 创建授权 - 功能介绍：创建授权，被授权用户可以对授权密钥进行操作。 - 说明： - 服务默认主密钥（密钥别名后缀为“/default”）不可以授权。
     *
     * @param CreateGrantRequest 请求对象
     * @return CreateGrantResponse */
    public CreateGrantResponse createGrant(CreateGrantRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createGrant);
    }

    /** 创建授权 - 功能介绍：创建授权，被授权用户可以对授权密钥进行操作。 - 说明： - 服务默认主密钥（密钥别名后缀为“/default”）不可以授权。
     *
     * @param CreateGrantRequest 请求对象
     * @return SyncInvoker<CreateGrantRequest, CreateGrantResponse> */
    public SyncInvoker<CreateGrantRequest, CreateGrantResponse> createGrantInvoker(CreateGrantRequest request) {
        return new SyncInvoker<CreateGrantRequest, CreateGrantResponse>(request, KmsMeta.createGrant, hcClient);
    }

    /** 创建密钥 创建用户主密钥，用户主密钥可以为对称密钥或非对称密钥。 - 对称密钥为长度为256位AES密钥，可用于小量数据的加密或者用于加密数据密钥。 - 非对称密钥可以为RSA密钥对或者ECC密钥对，可用于数字签名及验签。
     *
     * @param CreateKeyRequest 请求对象
     * @return CreateKeyResponse */
    public CreateKeyResponse createKey(CreateKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createKey);
    }

    /** 创建密钥 创建用户主密钥，用户主密钥可以为对称密钥或非对称密钥。 - 对称密钥为长度为256位AES密钥，可用于小量数据的加密或者用于加密数据密钥。 - 非对称密钥可以为RSA密钥对或者ECC密钥对，可用于数字签名及验签。
     *
     * @param CreateKeyRequest 请求对象
     * @return SyncInvoker<CreateKeyRequest, CreateKeyResponse> */
    public SyncInvoker<CreateKeyRequest, CreateKeyResponse> createKeyInvoker(CreateKeyRequest request) {
        return new SyncInvoker<CreateKeyRequest, CreateKeyResponse>(request, KmsMeta.createKey, hcClient);
    }

    /** 添加密钥标签 - 功能介绍：添加密钥标签。
     *
     * @param CreateKmsTagRequest 请求对象
     * @return CreateKmsTagResponse */
    public CreateKmsTagResponse createKmsTag(CreateKmsTagRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createKmsTag);
    }

    /** 添加密钥标签 - 功能介绍：添加密钥标签。
     *
     * @param CreateKmsTagRequest 请求对象
     * @return SyncInvoker<CreateKmsTagRequest, CreateKmsTagResponse> */
    public SyncInvoker<CreateKmsTagRequest, CreateKmsTagResponse> createKmsTagInvoker(CreateKmsTagRequest request) {
        return new SyncInvoker<CreateKmsTagRequest, CreateKmsTagResponse>(request, KmsMeta.createKmsTag, hcClient);
    }

    /** 获取密钥导入参数 - 功能介绍：获取导入密钥的必要参数，包括密钥导入令牌和密钥加密公钥。 - 说明：返回的公钥类型默认为RSA_2048。
     *
     * @param CreateParametersForImportRequest 请求对象
     * @return CreateParametersForImportResponse */
    public CreateParametersForImportResponse createParametersForImport(CreateParametersForImportRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createParametersForImport);
    }

    /** 获取密钥导入参数 - 功能介绍：获取导入密钥的必要参数，包括密钥导入令牌和密钥加密公钥。 - 说明：返回的公钥类型默认为RSA_2048。
     *
     * @param CreateParametersForImportRequest 请求对象
     * @return SyncInvoker<CreateParametersForImportRequest, CreateParametersForImportResponse> */
    public SyncInvoker<CreateParametersForImportRequest, CreateParametersForImportResponse> createParametersForImportInvoker(
        CreateParametersForImportRequest request) {
        return new SyncInvoker<CreateParametersForImportRequest, CreateParametersForImportResponse>(request,
            KmsMeta.createParametersForImport, hcClient);
    }

    /** 创建随机数 - 功能介绍： 生成8~8192bit范围内的随机数。
     *
     * @param CreateRandomRequest 请求对象
     * @return CreateRandomResponse */
    public CreateRandomResponse createRandom(CreateRandomRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createRandom);
    }

    /** 创建随机数 - 功能介绍： 生成8~8192bit范围内的随机数。
     *
     * @param CreateRandomRequest 请求对象
     * @return SyncInvoker<CreateRandomRequest, CreateRandomResponse> */
    public SyncInvoker<CreateRandomRequest, CreateRandomResponse> createRandomInvoker(CreateRandomRequest request) {
        return new SyncInvoker<CreateRandomRequest, CreateRandomResponse>(request, KmsMeta.createRandom, hcClient);
    }

    /** 创建凭据 创建新的凭据，并将凭据值存入凭据的初始版本。
     * 凭据管理服务将凭据值加密后，存储在凭据对象下的版本中。每个版本可与多个凭据版本状态相关联，凭据版本状态用于标识凭据版本处于的阶段，没有版本状态标记的版本视为已弃用，可用凭据管理服务自动删除。
     * 初始版本的状态被标记为SYSCURRENT。
     *
     * @param CreateSecretRequest 请求对象
     * @return CreateSecretResponse */
    public CreateSecretResponse createSecret(CreateSecretRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createSecret);
    }

    /** 创建凭据 创建新的凭据，并将凭据值存入凭据的初始版本。
     * 凭据管理服务将凭据值加密后，存储在凭据对象下的版本中。每个版本可与多个凭据版本状态相关联，凭据版本状态用于标识凭据版本处于的阶段，没有版本状态标记的版本视为已弃用，可用凭据管理服务自动删除。
     * 初始版本的状态被标记为SYSCURRENT。
     *
     * @param CreateSecretRequest 请求对象
     * @return SyncInvoker<CreateSecretRequest, CreateSecretResponse> */
    public SyncInvoker<CreateSecretRequest, CreateSecretResponse> createSecretInvoker(CreateSecretRequest request) {
        return new SyncInvoker<CreateSecretRequest, CreateSecretResponse>(request, KmsMeta.createSecret, hcClient);
    }

    /** 创建凭据版本
     * 在指定的凭据中，创建一个新的凭据版本，用于加密保管新的凭据值。默认情况下，新创建的凭据版本被标记为SYSCURRENT状态，而SYSCURRENT标记的前一个凭据版本被标记为SYSPREVIOUS状态。您可以通过指定VersionStage参数来覆盖默认行为。
     *
     * @param CreateSecretVersionRequest 请求对象
     * @return CreateSecretVersionResponse */
    public CreateSecretVersionResponse createSecretVersion(CreateSecretVersionRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createSecretVersion);
    }

    /** 创建凭据版本
     * 在指定的凭据中，创建一个新的凭据版本，用于加密保管新的凭据值。默认情况下，新创建的凭据版本被标记为SYSCURRENT状态，而SYSCURRENT标记的前一个凭据版本被标记为SYSPREVIOUS状态。您可以通过指定VersionStage参数来覆盖默认行为。
     *
     * @param CreateSecretVersionRequest 请求对象
     * @return SyncInvoker<CreateSecretVersionRequest, CreateSecretVersionResponse> */
    public SyncInvoker<CreateSecretVersionRequest, CreateSecretVersionResponse> createSecretVersionInvoker(
        CreateSecretVersionRequest request) {
        return new SyncInvoker<CreateSecretVersionRequest, CreateSecretVersionResponse>(request,
            KmsMeta.createSecretVersion, hcClient);
    }

    /** 解密数据 - 功能介绍：解密数据。
     *
     * @param DecryptDataRequest 请求对象
     * @return DecryptDataResponse */
    public DecryptDataResponse decryptData(DecryptDataRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.decryptData);
    }

    /** 解密数据 - 功能介绍：解密数据。
     *
     * @param DecryptDataRequest 请求对象
     * @return SyncInvoker<DecryptDataRequest, DecryptDataResponse> */
    public SyncInvoker<DecryptDataRequest, DecryptDataResponse> decryptDataInvoker(DecryptDataRequest request) {
        return new SyncInvoker<DecryptDataRequest, DecryptDataResponse>(request, KmsMeta.decryptData, hcClient);
    }

    /** 解密数据密钥 - 功能介绍：解密数据密钥，用指定的主密钥解密数据密钥。
     *
     * @param DecryptDatakeyRequest 请求对象
     * @return DecryptDatakeyResponse */
    public DecryptDatakeyResponse decryptDatakey(DecryptDatakeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.decryptDatakey);
    }

    /** 解密数据密钥 - 功能介绍：解密数据密钥，用指定的主密钥解密数据密钥。
     *
     * @param DecryptDatakeyRequest 请求对象
     * @return SyncInvoker<DecryptDatakeyRequest, DecryptDatakeyResponse> */
    public SyncInvoker<DecryptDatakeyRequest, DecryptDatakeyResponse> decryptDatakeyInvoker(
        DecryptDatakeyRequest request) {
        return new SyncInvoker<DecryptDatakeyRequest, DecryptDatakeyResponse>(request, KmsMeta.decryptDatakey,
            hcClient);
    }

    /** 删除密钥材料 - 功能介绍：删除密钥材料信息。
     *
     * @param DeleteImportedKeyMaterialRequest 请求对象
     * @return DeleteImportedKeyMaterialResponse */
    public DeleteImportedKeyMaterialResponse deleteImportedKeyMaterial(DeleteImportedKeyMaterialRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.deleteImportedKeyMaterial);
    }

    /** 删除密钥材料 - 功能介绍：删除密钥材料信息。
     *
     * @param DeleteImportedKeyMaterialRequest 请求对象
     * @return SyncInvoker<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse> */
    public SyncInvoker<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse> deleteImportedKeyMaterialInvoker(
        DeleteImportedKeyMaterialRequest request) {
        return new SyncInvoker<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse>(request,
            KmsMeta.deleteImportedKeyMaterial, hcClient);
    }

    /** 计划删除密钥 - 功能介绍：计划多少天后删除密钥，可设置7天～1096天内删除密钥。
     *
     * @param DeleteKeyRequest 请求对象
     * @return DeleteKeyResponse */
    public DeleteKeyResponse deleteKey(DeleteKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.deleteKey);
    }

    /** 计划删除密钥 - 功能介绍：计划多少天后删除密钥，可设置7天～1096天内删除密钥。
     *
     * @param DeleteKeyRequest 请求对象
     * @return SyncInvoker<DeleteKeyRequest, DeleteKeyResponse> */
    public SyncInvoker<DeleteKeyRequest, DeleteKeyResponse> deleteKeyInvoker(DeleteKeyRequest request) {
        return new SyncInvoker<DeleteKeyRequest, DeleteKeyResponse>(request, KmsMeta.deleteKey, hcClient);
    }

    /** 立即删除凭据 立即删除指定的凭据，且无法恢复。
     *
     * @param DeleteSecretRequest 请求对象
     * @return DeleteSecretResponse */
    public DeleteSecretResponse deleteSecret(DeleteSecretRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.deleteSecret);
    }

    /** 立即删除凭据 立即删除指定的凭据，且无法恢复。
     *
     * @param DeleteSecretRequest 请求对象
     * @return SyncInvoker<DeleteSecretRequest, DeleteSecretResponse> */
    public SyncInvoker<DeleteSecretRequest, DeleteSecretResponse> deleteSecretInvoker(DeleteSecretRequest request) {
        return new SyncInvoker<DeleteSecretRequest, DeleteSecretResponse>(request, KmsMeta.deleteSecret, hcClient);
    }

    /** 创建凭据的定时删除任务 指定延迟删除时间，创建删除凭据的定时任务，可设置7~30天的的延迟删除时间。
     *
     * @param DeleteSecretForScheduleRequest 请求对象
     * @return DeleteSecretForScheduleResponse */
    public DeleteSecretForScheduleResponse deleteSecretForSchedule(DeleteSecretForScheduleRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.deleteSecretForSchedule);
    }

    /** 创建凭据的定时删除任务 指定延迟删除时间，创建删除凭据的定时任务，可设置7~30天的的延迟删除时间。
     *
     * @param DeleteSecretForScheduleRequest 请求对象
     * @return SyncInvoker<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse> */
    public SyncInvoker<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse> deleteSecretForScheduleInvoker(
        DeleteSecretForScheduleRequest request) {
        return new SyncInvoker<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse>(request,
            KmsMeta.deleteSecretForSchedule, hcClient);
    }

    /** 删除凭据的版本状态 删除指定的凭据版本状态。
     *
     * @param DeleteSecretStageRequest 请求对象
     * @return DeleteSecretStageResponse */
    public DeleteSecretStageResponse deleteSecretStage(DeleteSecretStageRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.deleteSecretStage);
    }

    /** 删除凭据的版本状态 删除指定的凭据版本状态。
     *
     * @param DeleteSecretStageRequest 请求对象
     * @return SyncInvoker<DeleteSecretStageRequest, DeleteSecretStageResponse> */
    public SyncInvoker<DeleteSecretStageRequest, DeleteSecretStageResponse> deleteSecretStageInvoker(
        DeleteSecretStageRequest request) {
        return new SyncInvoker<DeleteSecretStageRequest, DeleteSecretStageResponse>(request, KmsMeta.deleteSecretStage,
            hcClient);
    }

    /** 删除密钥标签 - 功能介绍：删除密钥标签。
     *
     * @param DeleteTagRequest 请求对象
     * @return DeleteTagResponse */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.deleteTag);
    }

    /** 删除密钥标签 - 功能介绍：删除密钥标签。
     *
     * @param DeleteTagRequest 请求对象
     * @return SyncInvoker<DeleteTagRequest, DeleteTagResponse> */
    public SyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagInvoker(DeleteTagRequest request) {
        return new SyncInvoker<DeleteTagRequest, DeleteTagResponse>(request, KmsMeta.deleteTag, hcClient);
    }

    /** 禁用密钥 - 功能介绍：禁用密钥，密钥禁用后不可以使用。 - 说明：密钥为启用状态才能禁用密钥。
     *
     * @param DisableKeyRequest 请求对象
     * @return DisableKeyResponse */
    public DisableKeyResponse disableKey(DisableKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.disableKey);
    }

    /** 禁用密钥 - 功能介绍：禁用密钥，密钥禁用后不可以使用。 - 说明：密钥为启用状态才能禁用密钥。
     *
     * @param DisableKeyRequest 请求对象
     * @return SyncInvoker<DisableKeyRequest, DisableKeyResponse> */
    public SyncInvoker<DisableKeyRequest, DisableKeyResponse> disableKeyInvoker(DisableKeyRequest request) {
        return new SyncInvoker<DisableKeyRequest, DisableKeyResponse>(request, KmsMeta.disableKey, hcClient);
    }

    /** 关闭密钥轮换 - 功能介绍：关闭用户主密钥轮换。
     *
     * @param DisableKeyRotationRequest 请求对象
     * @return DisableKeyRotationResponse */
    public DisableKeyRotationResponse disableKeyRotation(DisableKeyRotationRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.disableKeyRotation);
    }

    /** 关闭密钥轮换 - 功能介绍：关闭用户主密钥轮换。
     *
     * @param DisableKeyRotationRequest 请求对象
     * @return SyncInvoker<DisableKeyRotationRequest, DisableKeyRotationResponse> */
    public SyncInvoker<DisableKeyRotationRequest, DisableKeyRotationResponse> disableKeyRotationInvoker(
        DisableKeyRotationRequest request) {
        return new SyncInvoker<DisableKeyRotationRequest, DisableKeyRotationResponse>(request,
            KmsMeta.disableKeyRotation, hcClient);
    }

    /** 启用密钥 - 功能介绍：启用密钥，密钥启用后才可以使用。 - 说明：密钥为禁用状态才能启用密钥。
     *
     * @param EnableKeyRequest 请求对象
     * @return EnableKeyResponse */
    public EnableKeyResponse enableKey(EnableKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.enableKey);
    }

    /** 启用密钥 - 功能介绍：启用密钥，密钥启用后才可以使用。 - 说明：密钥为禁用状态才能启用密钥。
     *
     * @param EnableKeyRequest 请求对象
     * @return SyncInvoker<EnableKeyRequest, EnableKeyResponse> */
    public SyncInvoker<EnableKeyRequest, EnableKeyResponse> enableKeyInvoker(EnableKeyRequest request) {
        return new SyncInvoker<EnableKeyRequest, EnableKeyResponse>(request, KmsMeta.enableKey, hcClient);
    }

    /** 开启密钥轮换 - 功能介绍：开启用户主密钥轮换。 - 说明： - 开启密钥轮换后，默认轮询间隔时间为365天。 - 默认主密钥及外部导入密钥不支持轮换操作。
     *
     * @param EnableKeyRotationRequest 请求对象
     * @return EnableKeyRotationResponse */
    public EnableKeyRotationResponse enableKeyRotation(EnableKeyRotationRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.enableKeyRotation);
    }

    /** 开启密钥轮换 - 功能介绍：开启用户主密钥轮换。 - 说明： - 开启密钥轮换后，默认轮询间隔时间为365天。 - 默认主密钥及外部导入密钥不支持轮换操作。
     *
     * @param EnableKeyRotationRequest 请求对象
     * @return SyncInvoker<EnableKeyRotationRequest, EnableKeyRotationResponse> */
    public SyncInvoker<EnableKeyRotationRequest, EnableKeyRotationResponse> enableKeyRotationInvoker(
        EnableKeyRotationRequest request) {
        return new SyncInvoker<EnableKeyRotationRequest, EnableKeyRotationResponse>(request, KmsMeta.enableKeyRotation,
            hcClient);
    }

    /** 加密数据 - 功能介绍：加密数据，用指定的用户主密钥加密数据。
     *
     * @param EncryptDataRequest 请求对象
     * @return EncryptDataResponse */
    public EncryptDataResponse encryptData(EncryptDataRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.encryptData);
    }

    /** 加密数据 - 功能介绍：加密数据，用指定的用户主密钥加密数据。
     *
     * @param EncryptDataRequest 请求对象
     * @return SyncInvoker<EncryptDataRequest, EncryptDataResponse> */
    public SyncInvoker<EncryptDataRequest, EncryptDataResponse> encryptDataInvoker(EncryptDataRequest request) {
        return new SyncInvoker<EncryptDataRequest, EncryptDataResponse>(request, KmsMeta.encryptData, hcClient);
    }

    /** 加密数据密钥 - 功能介绍：加密数据密钥，用指定的主密钥加密数据密钥。
     *
     * @param EncryptDatakeyRequest 请求对象
     * @return EncryptDatakeyResponse */
    public EncryptDatakeyResponse encryptDatakey(EncryptDatakeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.encryptDatakey);
    }

    /** 加密数据密钥 - 功能介绍：加密数据密钥，用指定的主密钥加密数据密钥。
     *
     * @param EncryptDatakeyRequest 请求对象
     * @return SyncInvoker<EncryptDatakeyRequest, EncryptDatakeyResponse> */
    public SyncInvoker<EncryptDatakeyRequest, EncryptDatakeyResponse> encryptDatakeyInvoker(
        EncryptDatakeyRequest request) {
        return new SyncInvoker<EncryptDatakeyRequest, EncryptDatakeyResponse>(request, KmsMeta.encryptDatakey,
            hcClient);
    }

    /** 导入密钥材料 - 功能介绍：导入密钥材料。
     *
     * @param ImportKeyMaterialRequest 请求对象
     * @return ImportKeyMaterialResponse */
    public ImportKeyMaterialResponse importKeyMaterial(ImportKeyMaterialRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.importKeyMaterial);
    }

    /** 导入密钥材料 - 功能介绍：导入密钥材料。
     *
     * @param ImportKeyMaterialRequest 请求对象
     * @return SyncInvoker<ImportKeyMaterialRequest, ImportKeyMaterialResponse> */
    public SyncInvoker<ImportKeyMaterialRequest, ImportKeyMaterialResponse> importKeyMaterialInvoker(
        ImportKeyMaterialRequest request) {
        return new SyncInvoker<ImportKeyMaterialRequest, ImportKeyMaterialResponse>(request, KmsMeta.importKeyMaterial,
            hcClient);
    }

    /** 查询授权列表 - 功能介绍：查询密钥的授权列表。
     *
     * @param ListGrantsRequest 请求对象
     * @return ListGrantsResponse */
    public ListGrantsResponse listGrants(ListGrantsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listGrants);
    }

    /** 查询授权列表 - 功能介绍：查询密钥的授权列表。
     *
     * @param ListGrantsRequest 请求对象
     * @return SyncInvoker<ListGrantsRequest, ListGrantsResponse> */
    public SyncInvoker<ListGrantsRequest, ListGrantsResponse> listGrantsInvoker(ListGrantsRequest request) {
        return new SyncInvoker<ListGrantsRequest, ListGrantsResponse>(request, KmsMeta.listGrants, hcClient);
    }

    /** 查询密钥信息 - 功能介绍：查询密钥详细信息。
     *
     * @param ListKeyDetailRequest 请求对象
     * @return ListKeyDetailResponse */
    public ListKeyDetailResponse listKeyDetail(ListKeyDetailRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKeyDetail);
    }

    /** 查询密钥信息 - 功能介绍：查询密钥详细信息。
     *
     * @param ListKeyDetailRequest 请求对象
     * @return SyncInvoker<ListKeyDetailRequest, ListKeyDetailResponse> */
    public SyncInvoker<ListKeyDetailRequest, ListKeyDetailResponse> listKeyDetailInvoker(ListKeyDetailRequest request) {
        return new SyncInvoker<ListKeyDetailRequest, ListKeyDetailResponse>(request, KmsMeta.listKeyDetail, hcClient);
    }

    /** 查询密钥列表 - 功能介绍：查询用户所有密钥列表。
     *
     * @param ListKeysRequest 请求对象
     * @return ListKeysResponse */
    public ListKeysResponse listKeys(ListKeysRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKeys);
    }

    /** 查询密钥列表 - 功能介绍：查询用户所有密钥列表。
     *
     * @param ListKeysRequest 请求对象
     * @return SyncInvoker<ListKeysRequest, ListKeysResponse> */
    public SyncInvoker<ListKeysRequest, ListKeysResponse> listKeysInvoker(ListKeysRequest request) {
        return new SyncInvoker<ListKeysRequest, ListKeysResponse>(request, KmsMeta.listKeys, hcClient);
    }

    /** 查询密钥实例 - 功能介绍：查询密钥实例。通过标签过滤，查询指定用户主密钥的详细信息。
     *
     * @param ListKmsByTagsRequest 请求对象
     * @return ListKmsByTagsResponse */
    public ListKmsByTagsResponse listKmsByTags(ListKmsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKmsByTags);
    }

    /** 查询密钥实例 - 功能介绍：查询密钥实例。通过标签过滤，查询指定用户主密钥的详细信息。
     *
     * @param ListKmsByTagsRequest 请求对象
     * @return SyncInvoker<ListKmsByTagsRequest, ListKmsByTagsResponse> */
    public SyncInvoker<ListKmsByTagsRequest, ListKmsByTagsResponse> listKmsByTagsInvoker(ListKmsByTagsRequest request) {
        return new SyncInvoker<ListKmsByTagsRequest, ListKmsByTagsResponse>(request, KmsMeta.listKmsByTags, hcClient);
    }

    /** 查询项目标签 - 功能介绍：查询用户在指定项目下的所有标签集合。
     *
     * @param ListKmsTagsRequest 请求对象
     * @return ListKmsTagsResponse */
    public ListKmsTagsResponse listKmsTags(ListKmsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKmsTags);
    }

    /** 查询项目标签 - 功能介绍：查询用户在指定项目下的所有标签集合。
     *
     * @param ListKmsTagsRequest 请求对象
     * @return SyncInvoker<ListKmsTagsRequest, ListKmsTagsResponse> */
    public SyncInvoker<ListKmsTagsRequest, ListKmsTagsResponse> listKmsTagsInvoker(ListKmsTagsRequest request) {
        return new SyncInvoker<ListKmsTagsRequest, ListKmsTagsResponse>(request, KmsMeta.listKmsTags, hcClient);
    }

    /** 查询可退役授权列表 - 功能介绍：查询用户可以退役的授权列表。
     *
     * @param ListRetirableGrantsRequest 请求对象
     * @return ListRetirableGrantsResponse */
    public ListRetirableGrantsResponse listRetirableGrants(ListRetirableGrantsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listRetirableGrants);
    }

    /** 查询可退役授权列表 - 功能介绍：查询用户可以退役的授权列表。
     *
     * @param ListRetirableGrantsRequest 请求对象
     * @return SyncInvoker<ListRetirableGrantsRequest, ListRetirableGrantsResponse> */
    public SyncInvoker<ListRetirableGrantsRequest, ListRetirableGrantsResponse> listRetirableGrantsInvoker(
        ListRetirableGrantsRequest request) {
        return new SyncInvoker<ListRetirableGrantsRequest, ListRetirableGrantsResponse>(request,
            KmsMeta.listRetirableGrants, hcClient);
    }

    /** 查询凭据的版本状态 查询指定凭据版本状态标记的版本信息。
     *
     * @param ListSecretStageRequest 请求对象
     * @return ListSecretStageResponse */
    public ListSecretStageResponse listSecretStage(ListSecretStageRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listSecretStage);
    }

    /** 查询凭据的版本状态 查询指定凭据版本状态标记的版本信息。
     *
     * @param ListSecretStageRequest 请求对象
     * @return SyncInvoker<ListSecretStageRequest, ListSecretStageResponse> */
    public SyncInvoker<ListSecretStageRequest, ListSecretStageResponse> listSecretStageInvoker(
        ListSecretStageRequest request) {
        return new SyncInvoker<ListSecretStageRequest, ListSecretStageResponse>(request, KmsMeta.listSecretStage,
            hcClient);
    }

    /** 查询凭据的版本列表 查询指定凭据下的版本列表信息。
     *
     * @param ListSecretVersionsRequest 请求对象
     * @return ListSecretVersionsResponse */
    public ListSecretVersionsResponse listSecretVersions(ListSecretVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listSecretVersions);
    }

    /** 查询凭据的版本列表 查询指定凭据下的版本列表信息。
     *
     * @param ListSecretVersionsRequest 请求对象
     * @return SyncInvoker<ListSecretVersionsRequest, ListSecretVersionsResponse> */
    public SyncInvoker<ListSecretVersionsRequest, ListSecretVersionsResponse> listSecretVersionsInvoker(
        ListSecretVersionsRequest request) {
        return new SyncInvoker<ListSecretVersionsRequest, ListSecretVersionsResponse>(request,
            KmsMeta.listSecretVersions, hcClient);
    }

    /** 查询凭据列表 查询当前用户在本项目下创建的所有凭据。
     *
     * @param ListSecretsRequest 请求对象
     * @return ListSecretsResponse */
    public ListSecretsResponse listSecrets(ListSecretsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listSecrets);
    }

    /** 查询凭据列表 查询当前用户在本项目下创建的所有凭据。
     *
     * @param ListSecretsRequest 请求对象
     * @return SyncInvoker<ListSecretsRequest, ListSecretsResponse> */
    public SyncInvoker<ListSecretsRequest, ListSecretsResponse> listSecretsInvoker(ListSecretsRequest request) {
        return new SyncInvoker<ListSecretsRequest, ListSecretsResponse>(request, KmsMeta.listSecrets, hcClient);
    }

    /** 取消凭据的定时删除任务 取消凭据的定时删除任务，凭据对象恢复可使用状态。
     *
     * @param RestoreSecretRequest 请求对象
     * @return RestoreSecretResponse */
    public RestoreSecretResponse restoreSecret(RestoreSecretRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.restoreSecret);
    }

    /** 取消凭据的定时删除任务 取消凭据的定时删除任务，凭据对象恢复可使用状态。
     *
     * @param RestoreSecretRequest 请求对象
     * @return SyncInvoker<RestoreSecretRequest, RestoreSecretResponse> */
    public SyncInvoker<RestoreSecretRequest, RestoreSecretResponse> restoreSecretInvoker(RestoreSecretRequest request) {
        return new SyncInvoker<RestoreSecretRequest, RestoreSecretResponse>(request, KmsMeta.restoreSecret, hcClient);
    }

    /** 查询密钥轮换状态 - 功能介绍：查询用户主密钥轮换状态。
     *
     * @param ShowKeyRotationStatusRequest 请求对象
     * @return ShowKeyRotationStatusResponse */
    public ShowKeyRotationStatusResponse showKeyRotationStatus(ShowKeyRotationStatusRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showKeyRotationStatus);
    }

    /** 查询密钥轮换状态 - 功能介绍：查询用户主密钥轮换状态。
     *
     * @param ShowKeyRotationStatusRequest 请求对象
     * @return SyncInvoker<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse> */
    public SyncInvoker<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse> showKeyRotationStatusInvoker(
        ShowKeyRotationStatusRequest request) {
        return new SyncInvoker<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse>(request,
            KmsMeta.showKeyRotationStatus, hcClient);
    }

    /** 查询密钥标签 - 功能介绍：查询密钥标签。
     *
     * @param ShowKmsTagsRequest 请求对象
     * @return ShowKmsTagsResponse */
    public ShowKmsTagsResponse showKmsTags(ShowKmsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showKmsTags);
    }

    /** 查询密钥标签 - 功能介绍：查询密钥标签。
     *
     * @param ShowKmsTagsRequest 请求对象
     * @return SyncInvoker<ShowKmsTagsRequest, ShowKmsTagsResponse> */
    public SyncInvoker<ShowKmsTagsRequest, ShowKmsTagsResponse> showKmsTagsInvoker(ShowKmsTagsRequest request) {
        return new SyncInvoker<ShowKmsTagsRequest, ShowKmsTagsResponse>(request, KmsMeta.showKmsTags, hcClient);
    }

    /** 查询公钥信息 - 查询用户指定非对称密钥的公钥信息。
     *
     * @param ShowPublicKeyRequest 请求对象
     * @return ShowPublicKeyResponse */
    public ShowPublicKeyResponse showPublicKey(ShowPublicKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showPublicKey);
    }

    /** 查询公钥信息 - 查询用户指定非对称密钥的公钥信息。
     *
     * @param ShowPublicKeyRequest 请求对象
     * @return SyncInvoker<ShowPublicKeyRequest, ShowPublicKeyResponse> */
    public SyncInvoker<ShowPublicKeyRequest, ShowPublicKeyResponse> showPublicKeyInvoker(ShowPublicKeyRequest request) {
        return new SyncInvoker<ShowPublicKeyRequest, ShowPublicKeyResponse>(request, KmsMeta.showPublicKey, hcClient);
    }

    /** 查询凭据 查询指定凭据的信息。
     *
     * @param ShowSecretRequest 请求对象
     * @return ShowSecretResponse */
    public ShowSecretResponse showSecret(ShowSecretRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showSecret);
    }

    /** 查询凭据 查询指定凭据的信息。
     *
     * @param ShowSecretRequest 请求对象
     * @return SyncInvoker<ShowSecretRequest, ShowSecretResponse> */
    public SyncInvoker<ShowSecretRequest, ShowSecretResponse> showSecretInvoker(ShowSecretRequest request) {
        return new SyncInvoker<ShowSecretRequest, ShowSecretResponse>(request, KmsMeta.showSecret, hcClient);
    }

    /** 查询凭据的版本与凭据值 查询指定凭据版本的信息和版本中的明文凭据值，只能查询ENABLED状态的凭据。
     * 通过/v1/{project_id}/secrets/{secret_id}/versions/latest可访问凭据最新版本的凭据值。
     *
     * @param ShowSecretVersionRequest 请求对象
     * @return ShowSecretVersionResponse */
    public ShowSecretVersionResponse showSecretVersion(ShowSecretVersionRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showSecretVersion);
    }

    /** 查询凭据的版本与凭据值 查询指定凭据版本的信息和版本中的明文凭据值，只能查询ENABLED状态的凭据。
     * 通过/v1/{project_id}/secrets/{secret_id}/versions/latest可访问凭据最新版本的凭据值。
     *
     * @param ShowSecretVersionRequest 请求对象
     * @return SyncInvoker<ShowSecretVersionRequest, ShowSecretVersionResponse> */
    public SyncInvoker<ShowSecretVersionRequest, ShowSecretVersionResponse> showSecretVersionInvoker(
        ShowSecretVersionRequest request) {
        return new SyncInvoker<ShowSecretVersionRequest, ShowSecretVersionResponse>(request, KmsMeta.showSecretVersion,
            hcClient);
    }

    /** 查询实例数 - 功能介绍：查询实例数，获取用户已经创建的用户主密钥数量。
     *
     * @param ShowUserInstancesRequest 请求对象
     * @return ShowUserInstancesResponse */
    public ShowUserInstancesResponse showUserInstances(ShowUserInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showUserInstances);
    }

    /** 查询实例数 - 功能介绍：查询实例数，获取用户已经创建的用户主密钥数量。
     *
     * @param ShowUserInstancesRequest 请求对象
     * @return SyncInvoker<ShowUserInstancesRequest, ShowUserInstancesResponse> */
    public SyncInvoker<ShowUserInstancesRequest, ShowUserInstancesResponse> showUserInstancesInvoker(
        ShowUserInstancesRequest request) {
        return new SyncInvoker<ShowUserInstancesRequest, ShowUserInstancesResponse>(request, KmsMeta.showUserInstances,
            hcClient);
    }

    /** 查询配额 - 功能介绍：查询配额，查询用户可以创建的用户主密钥配额总数及当前使用量信息。
     *
     * @param ShowUserQuotasRequest 请求对象
     * @return ShowUserQuotasResponse */
    public ShowUserQuotasResponse showUserQuotas(ShowUserQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showUserQuotas);
    }

    /** 查询配额 - 功能介绍：查询配额，查询用户可以创建的用户主密钥配额总数及当前使用量信息。
     *
     * @param ShowUserQuotasRequest 请求对象
     * @return SyncInvoker<ShowUserQuotasRequest, ShowUserQuotasResponse> */
    public SyncInvoker<ShowUserQuotasRequest, ShowUserQuotasResponse> showUserQuotasInvoker(
        ShowUserQuotasRequest request) {
        return new SyncInvoker<ShowUserQuotasRequest, ShowUserQuotasResponse>(request, KmsMeta.showUserQuotas,
            hcClient);
    }

    /** 签名数据 - 功能介绍：使用非对称密钥的私钥对消息或消息摘要进行数字签名。
     *
     * @param SignRequest 请求对象
     * @return SignResponse */
    public SignResponse sign(SignRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.sign);
    }

    /** 签名数据 - 功能介绍：使用非对称密钥的私钥对消息或消息摘要进行数字签名。
     *
     * @param SignRequest 请求对象
     * @return SyncInvoker<SignRequest, SignResponse> */
    public SyncInvoker<SignRequest, SignResponse> signInvoker(SignRequest request) {
        return new SyncInvoker<SignRequest, SignResponse>(request, KmsMeta.sign, hcClient);
    }

    /** 修改密钥别名 - 功能介绍：修改用户主密钥别名。 - 说明： - 服务默认主密钥（密钥别名后缀为“/default”）不可以修改。 - 密钥处于“计划删除”状态，密钥别名不可以修改。
     *
     * @param UpdateKeyAliasRequest 请求对象
     * @return UpdateKeyAliasResponse */
    public UpdateKeyAliasResponse updateKeyAlias(UpdateKeyAliasRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.updateKeyAlias);
    }

    /** 修改密钥别名 - 功能介绍：修改用户主密钥别名。 - 说明： - 服务默认主密钥（密钥别名后缀为“/default”）不可以修改。 - 密钥处于“计划删除”状态，密钥别名不可以修改。
     *
     * @param UpdateKeyAliasRequest 请求对象
     * @return SyncInvoker<UpdateKeyAliasRequest, UpdateKeyAliasResponse> */
    public SyncInvoker<UpdateKeyAliasRequest, UpdateKeyAliasResponse> updateKeyAliasInvoker(
        UpdateKeyAliasRequest request) {
        return new SyncInvoker<UpdateKeyAliasRequest, UpdateKeyAliasResponse>(request, KmsMeta.updateKeyAlias,
            hcClient);
    }

    /** 修改密钥描述 - 功能介绍：修改用户主密钥描述信息。 - 说明： - 服务默认主密钥（密钥别名后缀为“/default”）不可以修改。 - 密钥处于“计划删除”状态，密钥描述不可以修改。
     *
     * @param UpdateKeyDescriptionRequest 请求对象
     * @return UpdateKeyDescriptionResponse */
    public UpdateKeyDescriptionResponse updateKeyDescription(UpdateKeyDescriptionRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.updateKeyDescription);
    }

    /** 修改密钥描述 - 功能介绍：修改用户主密钥描述信息。 - 说明： - 服务默认主密钥（密钥别名后缀为“/default”）不可以修改。 - 密钥处于“计划删除”状态，密钥描述不可以修改。
     *
     * @param UpdateKeyDescriptionRequest 请求对象
     * @return SyncInvoker<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse> */
    public SyncInvoker<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse> updateKeyDescriptionInvoker(
        UpdateKeyDescriptionRequest request) {
        return new SyncInvoker<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse>(request,
            KmsMeta.updateKeyDescription, hcClient);
    }

    /** 修改密钥轮换周期 - 功能介绍：修改用户主密钥轮换周期。
     *
     * @param UpdateKeyRotationIntervalRequest 请求对象
     * @return UpdateKeyRotationIntervalResponse */
    public UpdateKeyRotationIntervalResponse updateKeyRotationInterval(UpdateKeyRotationIntervalRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.updateKeyRotationInterval);
    }

    /** 修改密钥轮换周期 - 功能介绍：修改用户主密钥轮换周期。
     *
     * @param UpdateKeyRotationIntervalRequest 请求对象
     * @return SyncInvoker<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse> */
    public SyncInvoker<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse> updateKeyRotationIntervalInvoker(
        UpdateKeyRotationIntervalRequest request) {
        return new SyncInvoker<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse>(request,
            KmsMeta.updateKeyRotationInterval, hcClient);
    }

    /** 更新凭据 更新指定凭据的元数据信息。
     *
     * @param UpdateSecretRequest 请求对象
     * @return UpdateSecretResponse */
    public UpdateSecretResponse updateSecret(UpdateSecretRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.updateSecret);
    }

    /** 更新凭据 更新指定凭据的元数据信息。
     *
     * @param UpdateSecretRequest 请求对象
     * @return SyncInvoker<UpdateSecretRequest, UpdateSecretResponse> */
    public SyncInvoker<UpdateSecretRequest, UpdateSecretResponse> updateSecretInvoker(UpdateSecretRequest request) {
        return new SyncInvoker<UpdateSecretRequest, UpdateSecretResponse>(request, KmsMeta.updateSecret, hcClient);
    }

    /** 更新凭据的版本状态 更新凭据的版本状态。
     *
     * @param UpdateSecretStageRequest 请求对象
     * @return UpdateSecretStageResponse */
    public UpdateSecretStageResponse updateSecretStage(UpdateSecretStageRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.updateSecretStage);
    }

    /** 更新凭据的版本状态 更新凭据的版本状态。
     *
     * @param UpdateSecretStageRequest 请求对象
     * @return SyncInvoker<UpdateSecretStageRequest, UpdateSecretStageResponse> */
    public SyncInvoker<UpdateSecretStageRequest, UpdateSecretStageResponse> updateSecretStageInvoker(
        UpdateSecretStageRequest request) {
        return new SyncInvoker<UpdateSecretStageRequest, UpdateSecretStageResponse>(request, KmsMeta.updateSecretStage,
            hcClient);
    }

    /** 验证签名 - 功能介绍：使用非对称密钥的私钥对消息或消息摘要进行数字签名。
     *
     * @param ValidateSignatureRequest 请求对象
     * @return ValidateSignatureResponse */
    public ValidateSignatureResponse validateSignature(ValidateSignatureRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.validateSignature);
    }

    /** 验证签名 - 功能介绍：使用非对称密钥的私钥对消息或消息摘要进行数字签名。
     *
     * @param ValidateSignatureRequest 请求对象
     * @return SyncInvoker<ValidateSignatureRequest, ValidateSignatureResponse> */
    public SyncInvoker<ValidateSignatureRequest, ValidateSignatureResponse> validateSignatureInvoker(
        ValidateSignatureRequest request) {
        return new SyncInvoker<ValidateSignatureRequest, ValidateSignatureResponse>(request, KmsMeta.validateSignature,
            hcClient);
    }

    /** 查询指定版本信息 - 功能介绍：查指定API版本信息。
     *
     * @param ShowVersionRequest 请求对象
     * @return ShowVersionResponse */
    public ShowVersionResponse showVersion(ShowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showVersion);
    }

    /** 查询指定版本信息 - 功能介绍：查指定API版本信息。
     *
     * @param ShowVersionRequest 请求对象
     * @return SyncInvoker<ShowVersionRequest, ShowVersionResponse> */
    public SyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionInvoker(ShowVersionRequest request) {
        return new SyncInvoker<ShowVersionRequest, ShowVersionResponse>(request, KmsMeta.showVersion, hcClient);
    }

    /** 查询版本信息列表 - 功能介绍：查询API版本信息列表。
     *
     * @param ShowVersionsRequest 请求对象
     * @return ShowVersionsResponse */
    public ShowVersionsResponse showVersions(ShowVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showVersions);
    }

    /** 查询版本信息列表 - 功能介绍：查询API版本信息列表。
     *
     * @param ShowVersionsRequest 请求对象
     * @return SyncInvoker<ShowVersionsRequest, ShowVersionsResponse> */
    public SyncInvoker<ShowVersionsRequest, ShowVersionsResponse> showVersionsInvoker(ShowVersionsRequest request) {
        return new SyncInvoker<ShowVersionsRequest, ShowVersionsResponse>(request, KmsMeta.showVersions, hcClient);
    }

}
