package com.huaweicloud.sdk.csms.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.csms.v1.model.*;

public class CsmsClient {

    protected HcClient hcClient;

    public CsmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CsmsClient> newBuilder() {
        return new ClientBuilder<>(CsmsClient::new);
    }

    /** 批量添加或删除凭据标签 - 功能介绍：批量添加或删除凭据标签。
     *
     * @param BatchCreateOrDeleteTagsRequest 请求对象
     * @return BatchCreateOrDeleteTagsResponse */
    public BatchCreateOrDeleteTagsResponse batchCreateOrDeleteTags(BatchCreateOrDeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.batchCreateOrDeleteTags);
    }

    /** 批量添加或删除凭据标签 - 功能介绍：批量添加或删除凭据标签。
     *
     * @param BatchCreateOrDeleteTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> */
    public SyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> batchCreateOrDeleteTagsInvoker(
        BatchCreateOrDeleteTagsRequest request) {
        return new SyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse>(request,
            CsmsMeta.batchCreateOrDeleteTags, hcClient);
    }

    /** 创建凭据 创建新的凭据，并将凭据值存入凭据的初始版本。
     * 凭据管理服务将凭据值加密后，存储在凭据对象下的版本中。每个版本可与多个凭据版本状态相关联，凭据版本状态用于标识凭据版本处于的阶段，没有版本状态标记的版本视为已弃用，可用凭据管理服务自动删除。
     * 初始版本的状态被标记为SYSCURRENT。
     *
     * @param CreateSecretRequest 请求对象
     * @return CreateSecretResponse */
    public CreateSecretResponse createSecret(CreateSecretRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.createSecret);
    }

    /** 创建凭据 创建新的凭据，并将凭据值存入凭据的初始版本。
     * 凭据管理服务将凭据值加密后，存储在凭据对象下的版本中。每个版本可与多个凭据版本状态相关联，凭据版本状态用于标识凭据版本处于的阶段，没有版本状态标记的版本视为已弃用，可用凭据管理服务自动删除。
     * 初始版本的状态被标记为SYSCURRENT。
     *
     * @param CreateSecretRequest 请求对象
     * @return SyncInvoker<CreateSecretRequest, CreateSecretResponse> */
    public SyncInvoker<CreateSecretRequest, CreateSecretResponse> createSecretInvoker(CreateSecretRequest request) {
        return new SyncInvoker<CreateSecretRequest, CreateSecretResponse>(request, CsmsMeta.createSecret, hcClient);
    }

    /** 添加凭据标签 - 功能介绍：添加凭据标签。
     *
     * @param CreateSecretTagRequest 请求对象
     * @return CreateSecretTagResponse */
    public CreateSecretTagResponse createSecretTag(CreateSecretTagRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.createSecretTag);
    }

    /** 添加凭据标签 - 功能介绍：添加凭据标签。
     *
     * @param CreateSecretTagRequest 请求对象
     * @return SyncInvoker<CreateSecretTagRequest, CreateSecretTagResponse> */
    public SyncInvoker<CreateSecretTagRequest, CreateSecretTagResponse> createSecretTagInvoker(
        CreateSecretTagRequest request) {
        return new SyncInvoker<CreateSecretTagRequest, CreateSecretTagResponse>(request, CsmsMeta.createSecretTag,
            hcClient);
    }

    /** 创建凭据版本
     * 在指定的凭据中，创建一个新的凭据版本，用于加密保管新的凭据值。默认情况下，新创建的凭据版本被标记为SYSCURRENT状态，而SYSCURRENT标记的前一个凭据版本被标记为SYSPREVIOUS状态。您可以通过指定VersionStage参数来覆盖默认行为。
     *
     * @param CreateSecretVersionRequest 请求对象
     * @return CreateSecretVersionResponse */
    public CreateSecretVersionResponse createSecretVersion(CreateSecretVersionRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.createSecretVersion);
    }

    /** 创建凭据版本
     * 在指定的凭据中，创建一个新的凭据版本，用于加密保管新的凭据值。默认情况下，新创建的凭据版本被标记为SYSCURRENT状态，而SYSCURRENT标记的前一个凭据版本被标记为SYSPREVIOUS状态。您可以通过指定VersionStage参数来覆盖默认行为。
     *
     * @param CreateSecretVersionRequest 请求对象
     * @return SyncInvoker<CreateSecretVersionRequest, CreateSecretVersionResponse> */
    public SyncInvoker<CreateSecretVersionRequest, CreateSecretVersionResponse> createSecretVersionInvoker(
        CreateSecretVersionRequest request) {
        return new SyncInvoker<CreateSecretVersionRequest, CreateSecretVersionResponse>(request,
            CsmsMeta.createSecretVersion, hcClient);
    }

    /** 立即删除凭据 立即删除指定的凭据，且无法恢复。
     *
     * @param DeleteSecretRequest 请求对象
     * @return DeleteSecretResponse */
    public DeleteSecretResponse deleteSecret(DeleteSecretRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.deleteSecret);
    }

    /** 立即删除凭据 立即删除指定的凭据，且无法恢复。
     *
     * @param DeleteSecretRequest 请求对象
     * @return SyncInvoker<DeleteSecretRequest, DeleteSecretResponse> */
    public SyncInvoker<DeleteSecretRequest, DeleteSecretResponse> deleteSecretInvoker(DeleteSecretRequest request) {
        return new SyncInvoker<DeleteSecretRequest, DeleteSecretResponse>(request, CsmsMeta.deleteSecret, hcClient);
    }

    /** 创建凭据的定时删除任务 指定延迟删除时间，创建删除凭据的定时任务，可设置7~30天的的延迟删除时间。
     *
     * @param DeleteSecretForScheduleRequest 请求对象
     * @return DeleteSecretForScheduleResponse */
    public DeleteSecretForScheduleResponse deleteSecretForSchedule(DeleteSecretForScheduleRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.deleteSecretForSchedule);
    }

    /** 创建凭据的定时删除任务 指定延迟删除时间，创建删除凭据的定时任务，可设置7~30天的的延迟删除时间。
     *
     * @param DeleteSecretForScheduleRequest 请求对象
     * @return SyncInvoker<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse> */
    public SyncInvoker<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse> deleteSecretForScheduleInvoker(
        DeleteSecretForScheduleRequest request) {
        return new SyncInvoker<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse>(request,
            CsmsMeta.deleteSecretForSchedule, hcClient);
    }

    /** 删除凭据的版本状态 删除指定的凭据版本状态。
     *
     * @param DeleteSecretStageRequest 请求对象
     * @return DeleteSecretStageResponse */
    public DeleteSecretStageResponse deleteSecretStage(DeleteSecretStageRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.deleteSecretStage);
    }

    /** 删除凭据的版本状态 删除指定的凭据版本状态。
     *
     * @param DeleteSecretStageRequest 请求对象
     * @return SyncInvoker<DeleteSecretStageRequest, DeleteSecretStageResponse> */
    public SyncInvoker<DeleteSecretStageRequest, DeleteSecretStageResponse> deleteSecretStageInvoker(
        DeleteSecretStageRequest request) {
        return new SyncInvoker<DeleteSecretStageRequest, DeleteSecretStageResponse>(request, CsmsMeta.deleteSecretStage,
            hcClient);
    }

    /** 删除凭据标签 - 功能介绍：删除凭据标签。
     *
     * @param DeleteSecretTagRequest 请求对象
     * @return DeleteSecretTagResponse */
    public DeleteSecretTagResponse deleteSecretTag(DeleteSecretTagRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.deleteSecretTag);
    }

    /** 删除凭据标签 - 功能介绍：删除凭据标签。
     *
     * @param DeleteSecretTagRequest 请求对象
     * @return SyncInvoker<DeleteSecretTagRequest, DeleteSecretTagResponse> */
    public SyncInvoker<DeleteSecretTagRequest, DeleteSecretTagResponse> deleteSecretTagInvoker(
        DeleteSecretTagRequest request) {
        return new SyncInvoker<DeleteSecretTagRequest, DeleteSecretTagResponse>(request, CsmsMeta.deleteSecretTag,
            hcClient);
    }

    /** 查询项目标签 - 功能介绍：查询用户在指定项目下的所有凭据标签集合。
     *
     * @param ListProjectSecretsTagsRequest 请求对象
     * @return ListProjectSecretsTagsResponse */
    public ListProjectSecretsTagsResponse listProjectSecretsTags(ListProjectSecretsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.listProjectSecretsTags);
    }

    /** 查询项目标签 - 功能介绍：查询用户在指定项目下的所有凭据标签集合。
     *
     * @param ListProjectSecretsTagsRequest 请求对象
     * @return SyncInvoker<ListProjectSecretsTagsRequest, ListProjectSecretsTagsResponse> */
    public SyncInvoker<ListProjectSecretsTagsRequest, ListProjectSecretsTagsResponse> listProjectSecretsTagsInvoker(
        ListProjectSecretsTagsRequest request) {
        return new SyncInvoker<ListProjectSecretsTagsRequest, ListProjectSecretsTagsResponse>(request,
            CsmsMeta.listProjectSecretsTags, hcClient);
    }

    /** 查询凭据实例 - 功能介绍：查询凭据实例。通过标签过滤，筛选用户凭据,返回凭据列表。
     *
     * @param ListResourceInstancesRequest 请求对象
     * @return ListResourceInstancesResponse */
    public ListResourceInstancesResponse listResourceInstances(ListResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.listResourceInstances);
    }

    /** 查询凭据实例 - 功能介绍：查询凭据实例。通过标签过滤，筛选用户凭据,返回凭据列表。
     *
     * @param ListResourceInstancesRequest 请求对象
     * @return SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> */
    public SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstancesInvoker(
        ListResourceInstancesRequest request) {
        return new SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>(request,
            CsmsMeta.listResourceInstances, hcClient);
    }

    /** 查询凭据的版本状态 查询指定凭据版本状态标记的版本信息。
     *
     * @param ListSecretStageRequest 请求对象
     * @return ListSecretStageResponse */
    public ListSecretStageResponse listSecretStage(ListSecretStageRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.listSecretStage);
    }

    /** 查询凭据的版本状态 查询指定凭据版本状态标记的版本信息。
     *
     * @param ListSecretStageRequest 请求对象
     * @return SyncInvoker<ListSecretStageRequest, ListSecretStageResponse> */
    public SyncInvoker<ListSecretStageRequest, ListSecretStageResponse> listSecretStageInvoker(
        ListSecretStageRequest request) {
        return new SyncInvoker<ListSecretStageRequest, ListSecretStageResponse>(request, CsmsMeta.listSecretStage,
            hcClient);
    }

    /** 查询凭据标签 - 功能介绍：查询凭据标签。
     *
     * @param ListSecretTagsRequest 请求对象
     * @return ListSecretTagsResponse */
    public ListSecretTagsResponse listSecretTags(ListSecretTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.listSecretTags);
    }

    /** 查询凭据标签 - 功能介绍：查询凭据标签。
     *
     * @param ListSecretTagsRequest 请求对象
     * @return SyncInvoker<ListSecretTagsRequest, ListSecretTagsResponse> */
    public SyncInvoker<ListSecretTagsRequest, ListSecretTagsResponse> listSecretTagsInvoker(
        ListSecretTagsRequest request) {
        return new SyncInvoker<ListSecretTagsRequest, ListSecretTagsResponse>(request, CsmsMeta.listSecretTags,
            hcClient);
    }

    /** 查询凭据的版本列表 查询指定凭据下的版本列表信息。
     *
     * @param ListSecretVersionsRequest 请求对象
     * @return ListSecretVersionsResponse */
    public ListSecretVersionsResponse listSecretVersions(ListSecretVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.listSecretVersions);
    }

    /** 查询凭据的版本列表 查询指定凭据下的版本列表信息。
     *
     * @param ListSecretVersionsRequest 请求对象
     * @return SyncInvoker<ListSecretVersionsRequest, ListSecretVersionsResponse> */
    public SyncInvoker<ListSecretVersionsRequest, ListSecretVersionsResponse> listSecretVersionsInvoker(
        ListSecretVersionsRequest request) {
        return new SyncInvoker<ListSecretVersionsRequest, ListSecretVersionsResponse>(request,
            CsmsMeta.listSecretVersions, hcClient);
    }

    /** 查询凭据列表 查询当前用户在本项目下创建的所有凭据。
     *
     * @param ListSecretsRequest 请求对象
     * @return ListSecretsResponse */
    public ListSecretsResponse listSecrets(ListSecretsRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.listSecrets);
    }

    /** 查询凭据列表 查询当前用户在本项目下创建的所有凭据。
     *
     * @param ListSecretsRequest 请求对象
     * @return SyncInvoker<ListSecretsRequest, ListSecretsResponse> */
    public SyncInvoker<ListSecretsRequest, ListSecretsResponse> listSecretsInvoker(ListSecretsRequest request) {
        return new SyncInvoker<ListSecretsRequest, ListSecretsResponse>(request, CsmsMeta.listSecrets, hcClient);
    }

    /** 取消凭据的定时删除任务 取消凭据的定时删除任务，凭据对象恢复可使用状态。
     *
     * @param RestoreSecretRequest 请求对象
     * @return RestoreSecretResponse */
    public RestoreSecretResponse restoreSecret(RestoreSecretRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.restoreSecret);
    }

    /** 取消凭据的定时删除任务 取消凭据的定时删除任务，凭据对象恢复可使用状态。
     *
     * @param RestoreSecretRequest 请求对象
     * @return SyncInvoker<RestoreSecretRequest, RestoreSecretResponse> */
    public SyncInvoker<RestoreSecretRequest, RestoreSecretResponse> restoreSecretInvoker(RestoreSecretRequest request) {
        return new SyncInvoker<RestoreSecretRequest, RestoreSecretResponse>(request, CsmsMeta.restoreSecret, hcClient);
    }

    /** 查询凭据 查询指定凭据的信息。
     *
     * @param ShowSecretRequest 请求对象
     * @return ShowSecretResponse */
    public ShowSecretResponse showSecret(ShowSecretRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.showSecret);
    }

    /** 查询凭据 查询指定凭据的信息。
     *
     * @param ShowSecretRequest 请求对象
     * @return SyncInvoker<ShowSecretRequest, ShowSecretResponse> */
    public SyncInvoker<ShowSecretRequest, ShowSecretResponse> showSecretInvoker(ShowSecretRequest request) {
        return new SyncInvoker<ShowSecretRequest, ShowSecretResponse>(request, CsmsMeta.showSecret, hcClient);
    }

    /** 查询凭据的版本与凭据值 查询指定凭据版本的信息和版本中的明文凭据值，只能查询ENABLED状态的凭据。
     * 通过/v1/{project_id}/secrets/{secret_id}/versions/latest可访问凭据最新版本的凭据值。
     *
     * @param ShowSecretVersionRequest 请求对象
     * @return ShowSecretVersionResponse */
    public ShowSecretVersionResponse showSecretVersion(ShowSecretVersionRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.showSecretVersion);
    }

    /** 查询凭据的版本与凭据值 查询指定凭据版本的信息和版本中的明文凭据值，只能查询ENABLED状态的凭据。
     * 通过/v1/{project_id}/secrets/{secret_id}/versions/latest可访问凭据最新版本的凭据值。
     *
     * @param ShowSecretVersionRequest 请求对象
     * @return SyncInvoker<ShowSecretVersionRequest, ShowSecretVersionResponse> */
    public SyncInvoker<ShowSecretVersionRequest, ShowSecretVersionResponse> showSecretVersionInvoker(
        ShowSecretVersionRequest request) {
        return new SyncInvoker<ShowSecretVersionRequest, ShowSecretVersionResponse>(request, CsmsMeta.showSecretVersion,
            hcClient);
    }

    /** 更新凭据 更新指定凭据的元数据信息。
     *
     * @param UpdateSecretRequest 请求对象
     * @return UpdateSecretResponse */
    public UpdateSecretResponse updateSecret(UpdateSecretRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.updateSecret);
    }

    /** 更新凭据 更新指定凭据的元数据信息。
     *
     * @param UpdateSecretRequest 请求对象
     * @return SyncInvoker<UpdateSecretRequest, UpdateSecretResponse> */
    public SyncInvoker<UpdateSecretRequest, UpdateSecretResponse> updateSecretInvoker(UpdateSecretRequest request) {
        return new SyncInvoker<UpdateSecretRequest, UpdateSecretResponse>(request, CsmsMeta.updateSecret, hcClient);
    }

    /** 更新凭据的版本状态 更新凭据的版本状态。
     *
     * @param UpdateSecretStageRequest 请求对象
     * @return UpdateSecretStageResponse */
    public UpdateSecretStageResponse updateSecretStage(UpdateSecretStageRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.updateSecretStage);
    }

    /** 更新凭据的版本状态 更新凭据的版本状态。
     *
     * @param UpdateSecretStageRequest 请求对象
     * @return SyncInvoker<UpdateSecretStageRequest, UpdateSecretStageResponse> */
    public SyncInvoker<UpdateSecretStageRequest, UpdateSecretStageResponse> updateSecretStageInvoker(
        UpdateSecretStageRequest request) {
        return new SyncInvoker<UpdateSecretStageRequest, UpdateSecretStageResponse>(request, CsmsMeta.updateSecretStage,
            hcClient);
    }

}
