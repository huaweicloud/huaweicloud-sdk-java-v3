package com.huaweicloud.sdk.kms.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.kms.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class KmsAsyncClient {

    protected HcClient hcClient;

    public KmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KmsAsyncClient> newBuilder() {
        return new ClientBuilder<>(KmsAsyncClient::new);
    }

    /** 批量添加删除密钥标签 - 功能介绍：批量添加删除密钥标签。
     *
     * @param BatchCreateKmsTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateKmsTagsResponse> */
    public CompletableFuture<BatchCreateKmsTagsResponse> batchCreateKmsTagsAsync(BatchCreateKmsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.batchCreateKmsTags);
    }

    /** 批量添加删除密钥标签 - 功能介绍：批量添加删除密钥标签。
     *
     * @param BatchCreateKmsTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse> */
    public AsyncInvoker<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse> batchCreateKmsTagsAsyncInvoker(
        BatchCreateKmsTagsRequest request) {
        return new AsyncInvoker<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse>(request,
            KmsMeta.batchCreateKmsTags, hcClient);
    }

    /** 撤销授权 - 功能介绍：撤销授权，授权用户撤销被授权用户操作密钥的权限。 - 说明： - 创建密钥的用户才能撤销该密钥授权。
     *
     * @param CancelGrantRequest 请求对象
     * @return CompletableFuture<CancelGrantResponse> */
    public CompletableFuture<CancelGrantResponse> cancelGrantAsync(CancelGrantRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.cancelGrant);
    }

    /** 撤销授权 - 功能介绍：撤销授权，授权用户撤销被授权用户操作密钥的权限。 - 说明： - 创建密钥的用户才能撤销该密钥授权。
     *
     * @param CancelGrantRequest 请求对象
     * @return AsyncInvoker<CancelGrantRequest, CancelGrantResponse> */
    public AsyncInvoker<CancelGrantRequest, CancelGrantResponse> cancelGrantAsyncInvoker(CancelGrantRequest request) {
        return new AsyncInvoker<CancelGrantRequest, CancelGrantResponse>(request, KmsMeta.cancelGrant, hcClient);
    }

    /** 取消计划删除密钥 - 功能介绍：取消计划删除密钥。 - 说明：密钥处于“计划删除”状态才能取消计划删除密钥。
     *
     * @param CancelKeyDeletionRequest 请求对象
     * @return CompletableFuture<CancelKeyDeletionResponse> */
    public CompletableFuture<CancelKeyDeletionResponse> cancelKeyDeletionAsync(CancelKeyDeletionRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.cancelKeyDeletion);
    }

    /** 取消计划删除密钥 - 功能介绍：取消计划删除密钥。 - 说明：密钥处于“计划删除”状态才能取消计划删除密钥。
     *
     * @param CancelKeyDeletionRequest 请求对象
     * @return AsyncInvoker<CancelKeyDeletionRequest, CancelKeyDeletionResponse> */
    public AsyncInvoker<CancelKeyDeletionRequest, CancelKeyDeletionResponse> cancelKeyDeletionAsyncInvoker(
        CancelKeyDeletionRequest request) {
        return new AsyncInvoker<CancelKeyDeletionRequest, CancelKeyDeletionResponse>(request, KmsMeta.cancelKeyDeletion,
            hcClient);
    }

    /** 退役授权 - 功能介绍：退役授权，表示被授权用户不再具有授权密钥的操作权。 例如：用户A授权用户B可以操作密钥A/key，同时授权用户C可以撤销该授权，
     * 那么用户A、B、C均可退役该授权，退役授权后，用户B不再可以使用A/key。 - 须知： 可执行退役授权的主体包括： - 创建授权的用户； - 授权中retiring_principal指向的用户； -
     * 当授权的操作列表中包含retire-grant时，grantee_principal指向的用户。
     *
     * @param CancelSelfGrantRequest 请求对象
     * @return CompletableFuture<CancelSelfGrantResponse> */
    public CompletableFuture<CancelSelfGrantResponse> cancelSelfGrantAsync(CancelSelfGrantRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.cancelSelfGrant);
    }

    /** 退役授权 - 功能介绍：退役授权，表示被授权用户不再具有授权密钥的操作权。 例如：用户A授权用户B可以操作密钥A/key，同时授权用户C可以撤销该授权，
     * 那么用户A、B、C均可退役该授权，退役授权后，用户B不再可以使用A/key。 - 须知： 可执行退役授权的主体包括： - 创建授权的用户； - 授权中retiring_principal指向的用户； -
     * 当授权的操作列表中包含retire-grant时，grantee_principal指向的用户。
     *
     * @param CancelSelfGrantRequest 请求对象
     * @return AsyncInvoker<CancelSelfGrantRequest, CancelSelfGrantResponse> */
    public AsyncInvoker<CancelSelfGrantRequest, CancelSelfGrantResponse> cancelSelfGrantAsyncInvoker(
        CancelSelfGrantRequest request) {
        return new AsyncInvoker<CancelSelfGrantRequest, CancelSelfGrantResponse>(request, KmsMeta.cancelSelfGrant,
            hcClient);
    }

    /** 创建数据密钥 - 功能介绍：创建数据密钥，返回结果包含明文和密文。
     *
     * @param CreateDatakeyRequest 请求对象
     * @return CompletableFuture<CreateDatakeyResponse> */
    public CompletableFuture<CreateDatakeyResponse> createDatakeyAsync(CreateDatakeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createDatakey);
    }

    /** 创建数据密钥 - 功能介绍：创建数据密钥，返回结果包含明文和密文。
     *
     * @param CreateDatakeyRequest 请求对象
     * @return AsyncInvoker<CreateDatakeyRequest, CreateDatakeyResponse> */
    public AsyncInvoker<CreateDatakeyRequest, CreateDatakeyResponse> createDatakeyAsyncInvoker(
        CreateDatakeyRequest request) {
        return new AsyncInvoker<CreateDatakeyRequest, CreateDatakeyResponse>(request, KmsMeta.createDatakey, hcClient);
    }

    /** 创建不含明文数据密钥 - 功能介绍：创建数据密钥，返回结果只包含密文。
     *
     * @param CreateDatakeyWithoutPlaintextRequest 请求对象
     * @return CompletableFuture<CreateDatakeyWithoutPlaintextResponse> */
    public CompletableFuture<CreateDatakeyWithoutPlaintextResponse> createDatakeyWithoutPlaintextAsync(
        CreateDatakeyWithoutPlaintextRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createDatakeyWithoutPlaintext);
    }

    /** 创建不含明文数据密钥 - 功能介绍：创建数据密钥，返回结果只包含密文。
     *
     * @param CreateDatakeyWithoutPlaintextRequest 请求对象
     * @return AsyncInvoker<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse> */
    public AsyncInvoker<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse> createDatakeyWithoutPlaintextAsyncInvoker(
        CreateDatakeyWithoutPlaintextRequest request) {
        return new AsyncInvoker<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse>(request,
            KmsMeta.createDatakeyWithoutPlaintext, hcClient);
    }

    /** 创建授权 - 功能介绍：创建授权，被授权用户可以对授权密钥进行操作。 - 说明： - 服务默认主密钥（密钥别名后缀为“/default”）不可以授权。
     *
     * @param CreateGrantRequest 请求对象
     * @return CompletableFuture<CreateGrantResponse> */
    public CompletableFuture<CreateGrantResponse> createGrantAsync(CreateGrantRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createGrant);
    }

    /** 创建授权 - 功能介绍：创建授权，被授权用户可以对授权密钥进行操作。 - 说明： - 服务默认主密钥（密钥别名后缀为“/default”）不可以授权。
     *
     * @param CreateGrantRequest 请求对象
     * @return AsyncInvoker<CreateGrantRequest, CreateGrantResponse> */
    public AsyncInvoker<CreateGrantRequest, CreateGrantResponse> createGrantAsyncInvoker(CreateGrantRequest request) {
        return new AsyncInvoker<CreateGrantRequest, CreateGrantResponse>(request, KmsMeta.createGrant, hcClient);
    }

    /** 创建密钥 创建用户主密钥，用户主密钥可以为对称密钥或非对称密钥。 - 对称密钥为长度为256位AES密钥，可用于小量数据的加密或者用于加密数据密钥。 - 非对称密钥可以为RSA密钥对或者ECC密钥对，可用于数字签名及验签。
     *
     * @param CreateKeyRequest 请求对象
     * @return CompletableFuture<CreateKeyResponse> */
    public CompletableFuture<CreateKeyResponse> createKeyAsync(CreateKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createKey);
    }

    /** 创建密钥 创建用户主密钥，用户主密钥可以为对称密钥或非对称密钥。 - 对称密钥为长度为256位AES密钥，可用于小量数据的加密或者用于加密数据密钥。 - 非对称密钥可以为RSA密钥对或者ECC密钥对，可用于数字签名及验签。
     *
     * @param CreateKeyRequest 请求对象
     * @return AsyncInvoker<CreateKeyRequest, CreateKeyResponse> */
    public AsyncInvoker<CreateKeyRequest, CreateKeyResponse> createKeyAsyncInvoker(CreateKeyRequest request) {
        return new AsyncInvoker<CreateKeyRequest, CreateKeyResponse>(request, KmsMeta.createKey, hcClient);
    }

    /** 添加密钥标签 - 功能介绍：添加密钥标签。
     *
     * @param CreateKmsTagRequest 请求对象
     * @return CompletableFuture<CreateKmsTagResponse> */
    public CompletableFuture<CreateKmsTagResponse> createKmsTagAsync(CreateKmsTagRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createKmsTag);
    }

    /** 添加密钥标签 - 功能介绍：添加密钥标签。
     *
     * @param CreateKmsTagRequest 请求对象
     * @return AsyncInvoker<CreateKmsTagRequest, CreateKmsTagResponse> */
    public AsyncInvoker<CreateKmsTagRequest, CreateKmsTagResponse> createKmsTagAsyncInvoker(
        CreateKmsTagRequest request) {
        return new AsyncInvoker<CreateKmsTagRequest, CreateKmsTagResponse>(request, KmsMeta.createKmsTag, hcClient);
    }

    /** 获取密钥导入参数 - 功能介绍：获取导入密钥的必要参数，包括密钥导入令牌和密钥加密公钥。 - 说明：返回的公钥类型默认为RSA_2048。
     *
     * @param CreateParametersForImportRequest 请求对象
     * @return CompletableFuture<CreateParametersForImportResponse> */
    public CompletableFuture<CreateParametersForImportResponse> createParametersForImportAsync(
        CreateParametersForImportRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createParametersForImport);
    }

    /** 获取密钥导入参数 - 功能介绍：获取导入密钥的必要参数，包括密钥导入令牌和密钥加密公钥。 - 说明：返回的公钥类型默认为RSA_2048。
     *
     * @param CreateParametersForImportRequest 请求对象
     * @return AsyncInvoker<CreateParametersForImportRequest, CreateParametersForImportResponse> */
    public AsyncInvoker<CreateParametersForImportRequest, CreateParametersForImportResponse> createParametersForImportAsyncInvoker(
        CreateParametersForImportRequest request) {
        return new AsyncInvoker<CreateParametersForImportRequest, CreateParametersForImportResponse>(request,
            KmsMeta.createParametersForImport, hcClient);
    }

    /** 创建随机数 - 功能介绍： 生成8~8192bit范围内的随机数。
     *
     * @param CreateRandomRequest 请求对象
     * @return CompletableFuture<CreateRandomResponse> */
    public CompletableFuture<CreateRandomResponse> createRandomAsync(CreateRandomRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createRandom);
    }

    /** 创建随机数 - 功能介绍： 生成8~8192bit范围内的随机数。
     *
     * @param CreateRandomRequest 请求对象
     * @return AsyncInvoker<CreateRandomRequest, CreateRandomResponse> */
    public AsyncInvoker<CreateRandomRequest, CreateRandomResponse> createRandomAsyncInvoker(
        CreateRandomRequest request) {
        return new AsyncInvoker<CreateRandomRequest, CreateRandomResponse>(request, KmsMeta.createRandom, hcClient);
    }

    /** 创建凭据 创建新的凭据，并将凭据值存入凭据的初始版本。
     * 凭据管理服务将凭据值加密后，存储在凭据对象下的版本中。每个版本可与多个凭据版本状态相关联，凭据版本状态用于标识凭据版本处于的阶段，没有版本状态标记的版本视为已弃用，可用凭据管理服务自动删除。
     * 初始版本的状态被标记为SYSCURRENT。
     *
     * @param CreateSecretRequest 请求对象
     * @return CompletableFuture<CreateSecretResponse> */
    public CompletableFuture<CreateSecretResponse> createSecretAsync(CreateSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createSecret);
    }

    /** 创建凭据 创建新的凭据，并将凭据值存入凭据的初始版本。
     * 凭据管理服务将凭据值加密后，存储在凭据对象下的版本中。每个版本可与多个凭据版本状态相关联，凭据版本状态用于标识凭据版本处于的阶段，没有版本状态标记的版本视为已弃用，可用凭据管理服务自动删除。
     * 初始版本的状态被标记为SYSCURRENT。
     *
     * @param CreateSecretRequest 请求对象
     * @return AsyncInvoker<CreateSecretRequest, CreateSecretResponse> */
    public AsyncInvoker<CreateSecretRequest, CreateSecretResponse> createSecretAsyncInvoker(
        CreateSecretRequest request) {
        return new AsyncInvoker<CreateSecretRequest, CreateSecretResponse>(request, KmsMeta.createSecret, hcClient);
    }

    /** 创建凭据版本
     * 在指定的凭据中，创建一个新的凭据版本，用于加密保管新的凭据值。默认情况下，新创建的凭据版本被标记为SYSCURRENT状态，而SYSCURRENT标记的前一个凭据版本被标记为SYSPREVIOUS状态。您可以通过指定VersionStage参数来覆盖默认行为。
     *
     * @param CreateSecretVersionRequest 请求对象
     * @return CompletableFuture<CreateSecretVersionResponse> */
    public CompletableFuture<CreateSecretVersionResponse> createSecretVersionAsync(CreateSecretVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createSecretVersion);
    }

    /** 创建凭据版本
     * 在指定的凭据中，创建一个新的凭据版本，用于加密保管新的凭据值。默认情况下，新创建的凭据版本被标记为SYSCURRENT状态，而SYSCURRENT标记的前一个凭据版本被标记为SYSPREVIOUS状态。您可以通过指定VersionStage参数来覆盖默认行为。
     *
     * @param CreateSecretVersionRequest 请求对象
     * @return AsyncInvoker<CreateSecretVersionRequest, CreateSecretVersionResponse> */
    public AsyncInvoker<CreateSecretVersionRequest, CreateSecretVersionResponse> createSecretVersionAsyncInvoker(
        CreateSecretVersionRequest request) {
        return new AsyncInvoker<CreateSecretVersionRequest, CreateSecretVersionResponse>(request,
            KmsMeta.createSecretVersion, hcClient);
    }

    /** 解密数据 - 功能介绍：解密数据。
     *
     * @param DecryptDataRequest 请求对象
     * @return CompletableFuture<DecryptDataResponse> */
    public CompletableFuture<DecryptDataResponse> decryptDataAsync(DecryptDataRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.decryptData);
    }

    /** 解密数据 - 功能介绍：解密数据。
     *
     * @param DecryptDataRequest 请求对象
     * @return AsyncInvoker<DecryptDataRequest, DecryptDataResponse> */
    public AsyncInvoker<DecryptDataRequest, DecryptDataResponse> decryptDataAsyncInvoker(DecryptDataRequest request) {
        return new AsyncInvoker<DecryptDataRequest, DecryptDataResponse>(request, KmsMeta.decryptData, hcClient);
    }

    /** 解密数据密钥 - 功能介绍：解密数据密钥，用指定的主密钥解密数据密钥。
     *
     * @param DecryptDatakeyRequest 请求对象
     * @return CompletableFuture<DecryptDatakeyResponse> */
    public CompletableFuture<DecryptDatakeyResponse> decryptDatakeyAsync(DecryptDatakeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.decryptDatakey);
    }

    /** 解密数据密钥 - 功能介绍：解密数据密钥，用指定的主密钥解密数据密钥。
     *
     * @param DecryptDatakeyRequest 请求对象
     * @return AsyncInvoker<DecryptDatakeyRequest, DecryptDatakeyResponse> */
    public AsyncInvoker<DecryptDatakeyRequest, DecryptDatakeyResponse> decryptDatakeyAsyncInvoker(
        DecryptDatakeyRequest request) {
        return new AsyncInvoker<DecryptDatakeyRequest, DecryptDatakeyResponse>(request, KmsMeta.decryptDatakey,
            hcClient);
    }

    /** 删除密钥材料 - 功能介绍：删除密钥材料信息。
     *
     * @param DeleteImportedKeyMaterialRequest 请求对象
     * @return CompletableFuture<DeleteImportedKeyMaterialResponse> */
    public CompletableFuture<DeleteImportedKeyMaterialResponse> deleteImportedKeyMaterialAsync(
        DeleteImportedKeyMaterialRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.deleteImportedKeyMaterial);
    }

    /** 删除密钥材料 - 功能介绍：删除密钥材料信息。
     *
     * @param DeleteImportedKeyMaterialRequest 请求对象
     * @return AsyncInvoker<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse> */
    public AsyncInvoker<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse> deleteImportedKeyMaterialAsyncInvoker(
        DeleteImportedKeyMaterialRequest request) {
        return new AsyncInvoker<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse>(request,
            KmsMeta.deleteImportedKeyMaterial, hcClient);
    }

    /** 计划删除密钥 - 功能介绍：计划多少天后删除密钥，可设置7天～1096天内删除密钥。
     *
     * @param DeleteKeyRequest 请求对象
     * @return CompletableFuture<DeleteKeyResponse> */
    public CompletableFuture<DeleteKeyResponse> deleteKeyAsync(DeleteKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.deleteKey);
    }

    /** 计划删除密钥 - 功能介绍：计划多少天后删除密钥，可设置7天～1096天内删除密钥。
     *
     * @param DeleteKeyRequest 请求对象
     * @return AsyncInvoker<DeleteKeyRequest, DeleteKeyResponse> */
    public AsyncInvoker<DeleteKeyRequest, DeleteKeyResponse> deleteKeyAsyncInvoker(DeleteKeyRequest request) {
        return new AsyncInvoker<DeleteKeyRequest, DeleteKeyResponse>(request, KmsMeta.deleteKey, hcClient);
    }

    /** 立即删除凭据 立即删除指定的凭据，且无法恢复。
     *
     * @param DeleteSecretRequest 请求对象
     * @return CompletableFuture<DeleteSecretResponse> */
    public CompletableFuture<DeleteSecretResponse> deleteSecretAsync(DeleteSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.deleteSecret);
    }

    /** 立即删除凭据 立即删除指定的凭据，且无法恢复。
     *
     * @param DeleteSecretRequest 请求对象
     * @return AsyncInvoker<DeleteSecretRequest, DeleteSecretResponse> */
    public AsyncInvoker<DeleteSecretRequest, DeleteSecretResponse> deleteSecretAsyncInvoker(
        DeleteSecretRequest request) {
        return new AsyncInvoker<DeleteSecretRequest, DeleteSecretResponse>(request, KmsMeta.deleteSecret, hcClient);
    }

    /** 创建凭据的定时删除任务 指定延迟删除时间，创建删除凭据的定时任务，可设置7~30天的的延迟删除时间。
     *
     * @param DeleteSecretForScheduleRequest 请求对象
     * @return CompletableFuture<DeleteSecretForScheduleResponse> */
    public CompletableFuture<DeleteSecretForScheduleResponse> deleteSecretForScheduleAsync(
        DeleteSecretForScheduleRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.deleteSecretForSchedule);
    }

    /** 创建凭据的定时删除任务 指定延迟删除时间，创建删除凭据的定时任务，可设置7~30天的的延迟删除时间。
     *
     * @param DeleteSecretForScheduleRequest 请求对象
     * @return AsyncInvoker<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse> */
    public AsyncInvoker<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse> deleteSecretForScheduleAsyncInvoker(
        DeleteSecretForScheduleRequest request) {
        return new AsyncInvoker<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse>(request,
            KmsMeta.deleteSecretForSchedule, hcClient);
    }

    /** 删除凭据的版本状态 删除指定的凭据版本状态。
     *
     * @param DeleteSecretStageRequest 请求对象
     * @return CompletableFuture<DeleteSecretStageResponse> */
    public CompletableFuture<DeleteSecretStageResponse> deleteSecretStageAsync(DeleteSecretStageRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.deleteSecretStage);
    }

    /** 删除凭据的版本状态 删除指定的凭据版本状态。
     *
     * @param DeleteSecretStageRequest 请求对象
     * @return AsyncInvoker<DeleteSecretStageRequest, DeleteSecretStageResponse> */
    public AsyncInvoker<DeleteSecretStageRequest, DeleteSecretStageResponse> deleteSecretStageAsyncInvoker(
        DeleteSecretStageRequest request) {
        return new AsyncInvoker<DeleteSecretStageRequest, DeleteSecretStageResponse>(request, KmsMeta.deleteSecretStage,
            hcClient);
    }

    /** 删除密钥标签 - 功能介绍：删除密钥标签。
     *
     * @param DeleteTagRequest 请求对象
     * @return CompletableFuture<DeleteTagResponse> */
    public CompletableFuture<DeleteTagResponse> deleteTagAsync(DeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.deleteTag);
    }

    /** 删除密钥标签 - 功能介绍：删除密钥标签。
     *
     * @param DeleteTagRequest 请求对象
     * @return AsyncInvoker<DeleteTagRequest, DeleteTagResponse> */
    public AsyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagAsyncInvoker(DeleteTagRequest request) {
        return new AsyncInvoker<DeleteTagRequest, DeleteTagResponse>(request, KmsMeta.deleteTag, hcClient);
    }

    /** 禁用密钥 - 功能介绍：禁用密钥，密钥禁用后不可以使用。 - 说明：密钥为启用状态才能禁用密钥。
     *
     * @param DisableKeyRequest 请求对象
     * @return CompletableFuture<DisableKeyResponse> */
    public CompletableFuture<DisableKeyResponse> disableKeyAsync(DisableKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.disableKey);
    }

    /** 禁用密钥 - 功能介绍：禁用密钥，密钥禁用后不可以使用。 - 说明：密钥为启用状态才能禁用密钥。
     *
     * @param DisableKeyRequest 请求对象
     * @return AsyncInvoker<DisableKeyRequest, DisableKeyResponse> */
    public AsyncInvoker<DisableKeyRequest, DisableKeyResponse> disableKeyAsyncInvoker(DisableKeyRequest request) {
        return new AsyncInvoker<DisableKeyRequest, DisableKeyResponse>(request, KmsMeta.disableKey, hcClient);
    }

    /** 关闭密钥轮换 - 功能介绍：关闭用户主密钥轮换。
     *
     * @param DisableKeyRotationRequest 请求对象
     * @return CompletableFuture<DisableKeyRotationResponse> */
    public CompletableFuture<DisableKeyRotationResponse> disableKeyRotationAsync(DisableKeyRotationRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.disableKeyRotation);
    }

    /** 关闭密钥轮换 - 功能介绍：关闭用户主密钥轮换。
     *
     * @param DisableKeyRotationRequest 请求对象
     * @return AsyncInvoker<DisableKeyRotationRequest, DisableKeyRotationResponse> */
    public AsyncInvoker<DisableKeyRotationRequest, DisableKeyRotationResponse> disableKeyRotationAsyncInvoker(
        DisableKeyRotationRequest request) {
        return new AsyncInvoker<DisableKeyRotationRequest, DisableKeyRotationResponse>(request,
            KmsMeta.disableKeyRotation, hcClient);
    }

    /** 启用密钥 - 功能介绍：启用密钥，密钥启用后才可以使用。 - 说明：密钥为禁用状态才能启用密钥。
     *
     * @param EnableKeyRequest 请求对象
     * @return CompletableFuture<EnableKeyResponse> */
    public CompletableFuture<EnableKeyResponse> enableKeyAsync(EnableKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.enableKey);
    }

    /** 启用密钥 - 功能介绍：启用密钥，密钥启用后才可以使用。 - 说明：密钥为禁用状态才能启用密钥。
     *
     * @param EnableKeyRequest 请求对象
     * @return AsyncInvoker<EnableKeyRequest, EnableKeyResponse> */
    public AsyncInvoker<EnableKeyRequest, EnableKeyResponse> enableKeyAsyncInvoker(EnableKeyRequest request) {
        return new AsyncInvoker<EnableKeyRequest, EnableKeyResponse>(request, KmsMeta.enableKey, hcClient);
    }

    /** 开启密钥轮换 - 功能介绍：开启用户主密钥轮换。 - 说明： - 开启密钥轮换后，默认轮询间隔时间为365天。 - 默认主密钥及外部导入密钥不支持轮换操作。
     *
     * @param EnableKeyRotationRequest 请求对象
     * @return CompletableFuture<EnableKeyRotationResponse> */
    public CompletableFuture<EnableKeyRotationResponse> enableKeyRotationAsync(EnableKeyRotationRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.enableKeyRotation);
    }

    /** 开启密钥轮换 - 功能介绍：开启用户主密钥轮换。 - 说明： - 开启密钥轮换后，默认轮询间隔时间为365天。 - 默认主密钥及外部导入密钥不支持轮换操作。
     *
     * @param EnableKeyRotationRequest 请求对象
     * @return AsyncInvoker<EnableKeyRotationRequest, EnableKeyRotationResponse> */
    public AsyncInvoker<EnableKeyRotationRequest, EnableKeyRotationResponse> enableKeyRotationAsyncInvoker(
        EnableKeyRotationRequest request) {
        return new AsyncInvoker<EnableKeyRotationRequest, EnableKeyRotationResponse>(request, KmsMeta.enableKeyRotation,
            hcClient);
    }

    /** 加密数据 - 功能介绍：加密数据，用指定的用户主密钥加密数据。
     *
     * @param EncryptDataRequest 请求对象
     * @return CompletableFuture<EncryptDataResponse> */
    public CompletableFuture<EncryptDataResponse> encryptDataAsync(EncryptDataRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.encryptData);
    }

    /** 加密数据 - 功能介绍：加密数据，用指定的用户主密钥加密数据。
     *
     * @param EncryptDataRequest 请求对象
     * @return AsyncInvoker<EncryptDataRequest, EncryptDataResponse> */
    public AsyncInvoker<EncryptDataRequest, EncryptDataResponse> encryptDataAsyncInvoker(EncryptDataRequest request) {
        return new AsyncInvoker<EncryptDataRequest, EncryptDataResponse>(request, KmsMeta.encryptData, hcClient);
    }

    /** 加密数据密钥 - 功能介绍：加密数据密钥，用指定的主密钥加密数据密钥。
     *
     * @param EncryptDatakeyRequest 请求对象
     * @return CompletableFuture<EncryptDatakeyResponse> */
    public CompletableFuture<EncryptDatakeyResponse> encryptDatakeyAsync(EncryptDatakeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.encryptDatakey);
    }

    /** 加密数据密钥 - 功能介绍：加密数据密钥，用指定的主密钥加密数据密钥。
     *
     * @param EncryptDatakeyRequest 请求对象
     * @return AsyncInvoker<EncryptDatakeyRequest, EncryptDatakeyResponse> */
    public AsyncInvoker<EncryptDatakeyRequest, EncryptDatakeyResponse> encryptDatakeyAsyncInvoker(
        EncryptDatakeyRequest request) {
        return new AsyncInvoker<EncryptDatakeyRequest, EncryptDatakeyResponse>(request, KmsMeta.encryptDatakey,
            hcClient);
    }

    /** 导入密钥材料 - 功能介绍：导入密钥材料。
     *
     * @param ImportKeyMaterialRequest 请求对象
     * @return CompletableFuture<ImportKeyMaterialResponse> */
    public CompletableFuture<ImportKeyMaterialResponse> importKeyMaterialAsync(ImportKeyMaterialRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.importKeyMaterial);
    }

    /** 导入密钥材料 - 功能介绍：导入密钥材料。
     *
     * @param ImportKeyMaterialRequest 请求对象
     * @return AsyncInvoker<ImportKeyMaterialRequest, ImportKeyMaterialResponse> */
    public AsyncInvoker<ImportKeyMaterialRequest, ImportKeyMaterialResponse> importKeyMaterialAsyncInvoker(
        ImportKeyMaterialRequest request) {
        return new AsyncInvoker<ImportKeyMaterialRequest, ImportKeyMaterialResponse>(request, KmsMeta.importKeyMaterial,
            hcClient);
    }

    /** 查询授权列表 - 功能介绍：查询密钥的授权列表。
     *
     * @param ListGrantsRequest 请求对象
     * @return CompletableFuture<ListGrantsResponse> */
    public CompletableFuture<ListGrantsResponse> listGrantsAsync(ListGrantsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listGrants);
    }

    /** 查询授权列表 - 功能介绍：查询密钥的授权列表。
     *
     * @param ListGrantsRequest 请求对象
     * @return AsyncInvoker<ListGrantsRequest, ListGrantsResponse> */
    public AsyncInvoker<ListGrantsRequest, ListGrantsResponse> listGrantsAsyncInvoker(ListGrantsRequest request) {
        return new AsyncInvoker<ListGrantsRequest, ListGrantsResponse>(request, KmsMeta.listGrants, hcClient);
    }

    /** 查询密钥信息 - 功能介绍：查询密钥详细信息。
     *
     * @param ListKeyDetailRequest 请求对象
     * @return CompletableFuture<ListKeyDetailResponse> */
    public CompletableFuture<ListKeyDetailResponse> listKeyDetailAsync(ListKeyDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKeyDetail);
    }

    /** 查询密钥信息 - 功能介绍：查询密钥详细信息。
     *
     * @param ListKeyDetailRequest 请求对象
     * @return AsyncInvoker<ListKeyDetailRequest, ListKeyDetailResponse> */
    public AsyncInvoker<ListKeyDetailRequest, ListKeyDetailResponse> listKeyDetailAsyncInvoker(
        ListKeyDetailRequest request) {
        return new AsyncInvoker<ListKeyDetailRequest, ListKeyDetailResponse>(request, KmsMeta.listKeyDetail, hcClient);
    }

    /** 查询密钥列表 - 功能介绍：查询用户所有密钥列表。
     *
     * @param ListKeysRequest 请求对象
     * @return CompletableFuture<ListKeysResponse> */
    public CompletableFuture<ListKeysResponse> listKeysAsync(ListKeysRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKeys);
    }

    /** 查询密钥列表 - 功能介绍：查询用户所有密钥列表。
     *
     * @param ListKeysRequest 请求对象
     * @return AsyncInvoker<ListKeysRequest, ListKeysResponse> */
    public AsyncInvoker<ListKeysRequest, ListKeysResponse> listKeysAsyncInvoker(ListKeysRequest request) {
        return new AsyncInvoker<ListKeysRequest, ListKeysResponse>(request, KmsMeta.listKeys, hcClient);
    }

    /** 查询密钥实例 - 功能介绍：查询密钥实例。通过标签过滤，查询指定用户主密钥的详细信息。
     *
     * @param ListKmsByTagsRequest 请求对象
     * @return CompletableFuture<ListKmsByTagsResponse> */
    public CompletableFuture<ListKmsByTagsResponse> listKmsByTagsAsync(ListKmsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKmsByTags);
    }

    /** 查询密钥实例 - 功能介绍：查询密钥实例。通过标签过滤，查询指定用户主密钥的详细信息。
     *
     * @param ListKmsByTagsRequest 请求对象
     * @return AsyncInvoker<ListKmsByTagsRequest, ListKmsByTagsResponse> */
    public AsyncInvoker<ListKmsByTagsRequest, ListKmsByTagsResponse> listKmsByTagsAsyncInvoker(
        ListKmsByTagsRequest request) {
        return new AsyncInvoker<ListKmsByTagsRequest, ListKmsByTagsResponse>(request, KmsMeta.listKmsByTags, hcClient);
    }

    /** 查询项目标签 - 功能介绍：查询用户在指定项目下的所有标签集合。
     *
     * @param ListKmsTagsRequest 请求对象
     * @return CompletableFuture<ListKmsTagsResponse> */
    public CompletableFuture<ListKmsTagsResponse> listKmsTagsAsync(ListKmsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKmsTags);
    }

    /** 查询项目标签 - 功能介绍：查询用户在指定项目下的所有标签集合。
     *
     * @param ListKmsTagsRequest 请求对象
     * @return AsyncInvoker<ListKmsTagsRequest, ListKmsTagsResponse> */
    public AsyncInvoker<ListKmsTagsRequest, ListKmsTagsResponse> listKmsTagsAsyncInvoker(ListKmsTagsRequest request) {
        return new AsyncInvoker<ListKmsTagsRequest, ListKmsTagsResponse>(request, KmsMeta.listKmsTags, hcClient);
    }

    /** 查询可退役授权列表 - 功能介绍：查询用户可以退役的授权列表。
     *
     * @param ListRetirableGrantsRequest 请求对象
     * @return CompletableFuture<ListRetirableGrantsResponse> */
    public CompletableFuture<ListRetirableGrantsResponse> listRetirableGrantsAsync(ListRetirableGrantsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listRetirableGrants);
    }

    /** 查询可退役授权列表 - 功能介绍：查询用户可以退役的授权列表。
     *
     * @param ListRetirableGrantsRequest 请求对象
     * @return AsyncInvoker<ListRetirableGrantsRequest, ListRetirableGrantsResponse> */
    public AsyncInvoker<ListRetirableGrantsRequest, ListRetirableGrantsResponse> listRetirableGrantsAsyncInvoker(
        ListRetirableGrantsRequest request) {
        return new AsyncInvoker<ListRetirableGrantsRequest, ListRetirableGrantsResponse>(request,
            KmsMeta.listRetirableGrants, hcClient);
    }

    /** 查询凭据的版本状态 查询指定凭据版本状态标记的版本信息。
     *
     * @param ListSecretStageRequest 请求对象
     * @return CompletableFuture<ListSecretStageResponse> */
    public CompletableFuture<ListSecretStageResponse> listSecretStageAsync(ListSecretStageRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listSecretStage);
    }

    /** 查询凭据的版本状态 查询指定凭据版本状态标记的版本信息。
     *
     * @param ListSecretStageRequest 请求对象
     * @return AsyncInvoker<ListSecretStageRequest, ListSecretStageResponse> */
    public AsyncInvoker<ListSecretStageRequest, ListSecretStageResponse> listSecretStageAsyncInvoker(
        ListSecretStageRequest request) {
        return new AsyncInvoker<ListSecretStageRequest, ListSecretStageResponse>(request, KmsMeta.listSecretStage,
            hcClient);
    }

    /** 查询凭据的版本列表 查询指定凭据下的版本列表信息。
     *
     * @param ListSecretVersionsRequest 请求对象
     * @return CompletableFuture<ListSecretVersionsResponse> */
    public CompletableFuture<ListSecretVersionsResponse> listSecretVersionsAsync(ListSecretVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listSecretVersions);
    }

    /** 查询凭据的版本列表 查询指定凭据下的版本列表信息。
     *
     * @param ListSecretVersionsRequest 请求对象
     * @return AsyncInvoker<ListSecretVersionsRequest, ListSecretVersionsResponse> */
    public AsyncInvoker<ListSecretVersionsRequest, ListSecretVersionsResponse> listSecretVersionsAsyncInvoker(
        ListSecretVersionsRequest request) {
        return new AsyncInvoker<ListSecretVersionsRequest, ListSecretVersionsResponse>(request,
            KmsMeta.listSecretVersions, hcClient);
    }

    /** 查询凭据列表 查询当前用户在本项目下创建的所有凭据。
     *
     * @param ListSecretsRequest 请求对象
     * @return CompletableFuture<ListSecretsResponse> */
    public CompletableFuture<ListSecretsResponse> listSecretsAsync(ListSecretsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listSecrets);
    }

    /** 查询凭据列表 查询当前用户在本项目下创建的所有凭据。
     *
     * @param ListSecretsRequest 请求对象
     * @return AsyncInvoker<ListSecretsRequest, ListSecretsResponse> */
    public AsyncInvoker<ListSecretsRequest, ListSecretsResponse> listSecretsAsyncInvoker(ListSecretsRequest request) {
        return new AsyncInvoker<ListSecretsRequest, ListSecretsResponse>(request, KmsMeta.listSecrets, hcClient);
    }

    /** 取消凭据的定时删除任务 取消凭据的定时删除任务，凭据对象恢复可使用状态。
     *
     * @param RestoreSecretRequest 请求对象
     * @return CompletableFuture<RestoreSecretResponse> */
    public CompletableFuture<RestoreSecretResponse> restoreSecretAsync(RestoreSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.restoreSecret);
    }

    /** 取消凭据的定时删除任务 取消凭据的定时删除任务，凭据对象恢复可使用状态。
     *
     * @param RestoreSecretRequest 请求对象
     * @return AsyncInvoker<RestoreSecretRequest, RestoreSecretResponse> */
    public AsyncInvoker<RestoreSecretRequest, RestoreSecretResponse> restoreSecretAsyncInvoker(
        RestoreSecretRequest request) {
        return new AsyncInvoker<RestoreSecretRequest, RestoreSecretResponse>(request, KmsMeta.restoreSecret, hcClient);
    }

    /** 查询密钥轮换状态 - 功能介绍：查询用户主密钥轮换状态。
     *
     * @param ShowKeyRotationStatusRequest 请求对象
     * @return CompletableFuture<ShowKeyRotationStatusResponse> */
    public CompletableFuture<ShowKeyRotationStatusResponse> showKeyRotationStatusAsync(
        ShowKeyRotationStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showKeyRotationStatus);
    }

    /** 查询密钥轮换状态 - 功能介绍：查询用户主密钥轮换状态。
     *
     * @param ShowKeyRotationStatusRequest 请求对象
     * @return AsyncInvoker<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse> */
    public AsyncInvoker<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse> showKeyRotationStatusAsyncInvoker(
        ShowKeyRotationStatusRequest request) {
        return new AsyncInvoker<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse>(request,
            KmsMeta.showKeyRotationStatus, hcClient);
    }

    /** 查询密钥标签 - 功能介绍：查询密钥标签。
     *
     * @param ShowKmsTagsRequest 请求对象
     * @return CompletableFuture<ShowKmsTagsResponse> */
    public CompletableFuture<ShowKmsTagsResponse> showKmsTagsAsync(ShowKmsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showKmsTags);
    }

    /** 查询密钥标签 - 功能介绍：查询密钥标签。
     *
     * @param ShowKmsTagsRequest 请求对象
     * @return AsyncInvoker<ShowKmsTagsRequest, ShowKmsTagsResponse> */
    public AsyncInvoker<ShowKmsTagsRequest, ShowKmsTagsResponse> showKmsTagsAsyncInvoker(ShowKmsTagsRequest request) {
        return new AsyncInvoker<ShowKmsTagsRequest, ShowKmsTagsResponse>(request, KmsMeta.showKmsTags, hcClient);
    }

    /** 查询公钥信息 - 查询用户指定非对称密钥的公钥信息。
     *
     * @param ShowPublicKeyRequest 请求对象
     * @return CompletableFuture<ShowPublicKeyResponse> */
    public CompletableFuture<ShowPublicKeyResponse> showPublicKeyAsync(ShowPublicKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showPublicKey);
    }

    /** 查询公钥信息 - 查询用户指定非对称密钥的公钥信息。
     *
     * @param ShowPublicKeyRequest 请求对象
     * @return AsyncInvoker<ShowPublicKeyRequest, ShowPublicKeyResponse> */
    public AsyncInvoker<ShowPublicKeyRequest, ShowPublicKeyResponse> showPublicKeyAsyncInvoker(
        ShowPublicKeyRequest request) {
        return new AsyncInvoker<ShowPublicKeyRequest, ShowPublicKeyResponse>(request, KmsMeta.showPublicKey, hcClient);
    }

    /** 查询凭据 查询指定凭据的信息。
     *
     * @param ShowSecretRequest 请求对象
     * @return CompletableFuture<ShowSecretResponse> */
    public CompletableFuture<ShowSecretResponse> showSecretAsync(ShowSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showSecret);
    }

    /** 查询凭据 查询指定凭据的信息。
     *
     * @param ShowSecretRequest 请求对象
     * @return AsyncInvoker<ShowSecretRequest, ShowSecretResponse> */
    public AsyncInvoker<ShowSecretRequest, ShowSecretResponse> showSecretAsyncInvoker(ShowSecretRequest request) {
        return new AsyncInvoker<ShowSecretRequest, ShowSecretResponse>(request, KmsMeta.showSecret, hcClient);
    }

    /** 查询凭据的版本与凭据值 查询指定凭据版本的信息和版本中的明文凭据值，只能查询ENABLED状态的凭据。
     * 通过/v1/{project_id}/secrets/{secret_id}/versions/latest可访问凭据最新版本的凭据值。
     *
     * @param ShowSecretVersionRequest 请求对象
     * @return CompletableFuture<ShowSecretVersionResponse> */
    public CompletableFuture<ShowSecretVersionResponse> showSecretVersionAsync(ShowSecretVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showSecretVersion);
    }

    /** 查询凭据的版本与凭据值 查询指定凭据版本的信息和版本中的明文凭据值，只能查询ENABLED状态的凭据。
     * 通过/v1/{project_id}/secrets/{secret_id}/versions/latest可访问凭据最新版本的凭据值。
     *
     * @param ShowSecretVersionRequest 请求对象
     * @return AsyncInvoker<ShowSecretVersionRequest, ShowSecretVersionResponse> */
    public AsyncInvoker<ShowSecretVersionRequest, ShowSecretVersionResponse> showSecretVersionAsyncInvoker(
        ShowSecretVersionRequest request) {
        return new AsyncInvoker<ShowSecretVersionRequest, ShowSecretVersionResponse>(request, KmsMeta.showSecretVersion,
            hcClient);
    }

    /** 查询实例数 - 功能介绍：查询实例数，获取用户已经创建的用户主密钥数量。
     *
     * @param ShowUserInstancesRequest 请求对象
     * @return CompletableFuture<ShowUserInstancesResponse> */
    public CompletableFuture<ShowUserInstancesResponse> showUserInstancesAsync(ShowUserInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showUserInstances);
    }

    /** 查询实例数 - 功能介绍：查询实例数，获取用户已经创建的用户主密钥数量。
     *
     * @param ShowUserInstancesRequest 请求对象
     * @return AsyncInvoker<ShowUserInstancesRequest, ShowUserInstancesResponse> */
    public AsyncInvoker<ShowUserInstancesRequest, ShowUserInstancesResponse> showUserInstancesAsyncInvoker(
        ShowUserInstancesRequest request) {
        return new AsyncInvoker<ShowUserInstancesRequest, ShowUserInstancesResponse>(request, KmsMeta.showUserInstances,
            hcClient);
    }

    /** 查询配额 - 功能介绍：查询配额，查询用户可以创建的用户主密钥配额总数及当前使用量信息。
     *
     * @param ShowUserQuotasRequest 请求对象
     * @return CompletableFuture<ShowUserQuotasResponse> */
    public CompletableFuture<ShowUserQuotasResponse> showUserQuotasAsync(ShowUserQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showUserQuotas);
    }

    /** 查询配额 - 功能介绍：查询配额，查询用户可以创建的用户主密钥配额总数及当前使用量信息。
     *
     * @param ShowUserQuotasRequest 请求对象
     * @return AsyncInvoker<ShowUserQuotasRequest, ShowUserQuotasResponse> */
    public AsyncInvoker<ShowUserQuotasRequest, ShowUserQuotasResponse> showUserQuotasAsyncInvoker(
        ShowUserQuotasRequest request) {
        return new AsyncInvoker<ShowUserQuotasRequest, ShowUserQuotasResponse>(request, KmsMeta.showUserQuotas,
            hcClient);
    }

    /** 签名数据 - 功能介绍：使用非对称密钥的私钥对消息或消息摘要进行数字签名。
     *
     * @param SignRequest 请求对象
     * @return CompletableFuture<SignResponse> */
    public CompletableFuture<SignResponse> signAsync(SignRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.sign);
    }

    /** 签名数据 - 功能介绍：使用非对称密钥的私钥对消息或消息摘要进行数字签名。
     *
     * @param SignRequest 请求对象
     * @return AsyncInvoker<SignRequest, SignResponse> */
    public AsyncInvoker<SignRequest, SignResponse> signAsyncInvoker(SignRequest request) {
        return new AsyncInvoker<SignRequest, SignResponse>(request, KmsMeta.sign, hcClient);
    }

    /** 修改密钥别名 - 功能介绍：修改用户主密钥别名。 - 说明： - 服务默认主密钥（密钥别名后缀为“/default”）不可以修改。 - 密钥处于“计划删除”状态，密钥别名不可以修改。
     *
     * @param UpdateKeyAliasRequest 请求对象
     * @return CompletableFuture<UpdateKeyAliasResponse> */
    public CompletableFuture<UpdateKeyAliasResponse> updateKeyAliasAsync(UpdateKeyAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.updateKeyAlias);
    }

    /** 修改密钥别名 - 功能介绍：修改用户主密钥别名。 - 说明： - 服务默认主密钥（密钥别名后缀为“/default”）不可以修改。 - 密钥处于“计划删除”状态，密钥别名不可以修改。
     *
     * @param UpdateKeyAliasRequest 请求对象
     * @return AsyncInvoker<UpdateKeyAliasRequest, UpdateKeyAliasResponse> */
    public AsyncInvoker<UpdateKeyAliasRequest, UpdateKeyAliasResponse> updateKeyAliasAsyncInvoker(
        UpdateKeyAliasRequest request) {
        return new AsyncInvoker<UpdateKeyAliasRequest, UpdateKeyAliasResponse>(request, KmsMeta.updateKeyAlias,
            hcClient);
    }

    /** 修改密钥描述 - 功能介绍：修改用户主密钥描述信息。 - 说明： - 服务默认主密钥（密钥别名后缀为“/default”）不可以修改。 - 密钥处于“计划删除”状态，密钥描述不可以修改。
     *
     * @param UpdateKeyDescriptionRequest 请求对象
     * @return CompletableFuture<UpdateKeyDescriptionResponse> */
    public CompletableFuture<UpdateKeyDescriptionResponse> updateKeyDescriptionAsync(
        UpdateKeyDescriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.updateKeyDescription);
    }

    /** 修改密钥描述 - 功能介绍：修改用户主密钥描述信息。 - 说明： - 服务默认主密钥（密钥别名后缀为“/default”）不可以修改。 - 密钥处于“计划删除”状态，密钥描述不可以修改。
     *
     * @param UpdateKeyDescriptionRequest 请求对象
     * @return AsyncInvoker<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse> */
    public AsyncInvoker<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse> updateKeyDescriptionAsyncInvoker(
        UpdateKeyDescriptionRequest request) {
        return new AsyncInvoker<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse>(request,
            KmsMeta.updateKeyDescription, hcClient);
    }

    /** 修改密钥轮换周期 - 功能介绍：修改用户主密钥轮换周期。
     *
     * @param UpdateKeyRotationIntervalRequest 请求对象
     * @return CompletableFuture<UpdateKeyRotationIntervalResponse> */
    public CompletableFuture<UpdateKeyRotationIntervalResponse> updateKeyRotationIntervalAsync(
        UpdateKeyRotationIntervalRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.updateKeyRotationInterval);
    }

    /** 修改密钥轮换周期 - 功能介绍：修改用户主密钥轮换周期。
     *
     * @param UpdateKeyRotationIntervalRequest 请求对象
     * @return AsyncInvoker<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse> */
    public AsyncInvoker<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse> updateKeyRotationIntervalAsyncInvoker(
        UpdateKeyRotationIntervalRequest request) {
        return new AsyncInvoker<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse>(request,
            KmsMeta.updateKeyRotationInterval, hcClient);
    }

    /** 更新凭据 更新指定凭据的元数据信息。
     *
     * @param UpdateSecretRequest 请求对象
     * @return CompletableFuture<UpdateSecretResponse> */
    public CompletableFuture<UpdateSecretResponse> updateSecretAsync(UpdateSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.updateSecret);
    }

    /** 更新凭据 更新指定凭据的元数据信息。
     *
     * @param UpdateSecretRequest 请求对象
     * @return AsyncInvoker<UpdateSecretRequest, UpdateSecretResponse> */
    public AsyncInvoker<UpdateSecretRequest, UpdateSecretResponse> updateSecretAsyncInvoker(
        UpdateSecretRequest request) {
        return new AsyncInvoker<UpdateSecretRequest, UpdateSecretResponse>(request, KmsMeta.updateSecret, hcClient);
    }

    /** 更新凭据的版本状态 更新凭据的版本状态。
     *
     * @param UpdateSecretStageRequest 请求对象
     * @return CompletableFuture<UpdateSecretStageResponse> */
    public CompletableFuture<UpdateSecretStageResponse> updateSecretStageAsync(UpdateSecretStageRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.updateSecretStage);
    }

    /** 更新凭据的版本状态 更新凭据的版本状态。
     *
     * @param UpdateSecretStageRequest 请求对象
     * @return AsyncInvoker<UpdateSecretStageRequest, UpdateSecretStageResponse> */
    public AsyncInvoker<UpdateSecretStageRequest, UpdateSecretStageResponse> updateSecretStageAsyncInvoker(
        UpdateSecretStageRequest request) {
        return new AsyncInvoker<UpdateSecretStageRequest, UpdateSecretStageResponse>(request, KmsMeta.updateSecretStage,
            hcClient);
    }

    /** 验证签名 - 功能介绍：使用非对称密钥的私钥对消息或消息摘要进行数字签名。
     *
     * @param ValidateSignatureRequest 请求对象
     * @return CompletableFuture<ValidateSignatureResponse> */
    public CompletableFuture<ValidateSignatureResponse> validateSignatureAsync(ValidateSignatureRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.validateSignature);
    }

    /** 验证签名 - 功能介绍：使用非对称密钥的私钥对消息或消息摘要进行数字签名。
     *
     * @param ValidateSignatureRequest 请求对象
     * @return AsyncInvoker<ValidateSignatureRequest, ValidateSignatureResponse> */
    public AsyncInvoker<ValidateSignatureRequest, ValidateSignatureResponse> validateSignatureAsyncInvoker(
        ValidateSignatureRequest request) {
        return new AsyncInvoker<ValidateSignatureRequest, ValidateSignatureResponse>(request, KmsMeta.validateSignature,
            hcClient);
    }

    /** 查询指定版本信息 - 功能介绍：查指定API版本信息。
     *
     * @param ShowVersionRequest 请求对象
     * @return CompletableFuture<ShowVersionResponse> */
    public CompletableFuture<ShowVersionResponse> showVersionAsync(ShowVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showVersion);
    }

    /** 查询指定版本信息 - 功能介绍：查指定API版本信息。
     *
     * @param ShowVersionRequest 请求对象
     * @return AsyncInvoker<ShowVersionRequest, ShowVersionResponse> */
    public AsyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionAsyncInvoker(ShowVersionRequest request) {
        return new AsyncInvoker<ShowVersionRequest, ShowVersionResponse>(request, KmsMeta.showVersion, hcClient);
    }

    /** 查询版本信息列表 - 功能介绍：查询API版本信息列表。
     *
     * @param ShowVersionsRequest 请求对象
     * @return CompletableFuture<ShowVersionsResponse> */
    public CompletableFuture<ShowVersionsResponse> showVersionsAsync(ShowVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showVersions);
    }

    /** 查询版本信息列表 - 功能介绍：查询API版本信息列表。
     *
     * @param ShowVersionsRequest 请求对象
     * @return AsyncInvoker<ShowVersionsRequest, ShowVersionsResponse> */
    public AsyncInvoker<ShowVersionsRequest, ShowVersionsResponse> showVersionsAsyncInvoker(
        ShowVersionsRequest request) {
        return new AsyncInvoker<ShowVersionsRequest, ShowVersionsResponse>(request, KmsMeta.showVersions, hcClient);
    }

}
