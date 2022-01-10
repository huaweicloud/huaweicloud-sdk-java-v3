package com.huaweicloud.sdk.csms.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.csms.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class CsmsAsyncClient {

    protected HcClient hcClient;

    public CsmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CsmsAsyncClient> newBuilder() {
        return new ClientBuilder<>(CsmsAsyncClient::new);
    }

    /** 批量添加或删除凭据标签 - 功能介绍：批量添加或删除凭据标签。
     *
     * @param BatchCreateOrDeleteTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateOrDeleteTagsResponse> */
    public CompletableFuture<BatchCreateOrDeleteTagsResponse> batchCreateOrDeleteTagsAsync(
        BatchCreateOrDeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.batchCreateOrDeleteTags);
    }

    /** 批量添加或删除凭据标签 - 功能介绍：批量添加或删除凭据标签。
     *
     * @param BatchCreateOrDeleteTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> */
    public AsyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> batchCreateOrDeleteTagsAsyncInvoker(
        BatchCreateOrDeleteTagsRequest request) {
        return new AsyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse>(request,
            CsmsMeta.batchCreateOrDeleteTags, hcClient);
    }

    /** 创建凭据 创建新的凭据，并将凭据值存入凭据的初始版本。
     * 凭据管理服务将凭据值加密后，存储在凭据对象下的版本中。每个版本可与多个凭据版本状态相关联，凭据版本状态用于标识凭据版本处于的阶段，没有版本状态标记的版本视为已弃用，可用凭据管理服务自动删除。
     * 初始版本的状态被标记为SYSCURRENT。
     *
     * @param CreateSecretRequest 请求对象
     * @return CompletableFuture<CreateSecretResponse> */
    public CompletableFuture<CreateSecretResponse> createSecretAsync(CreateSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.createSecret);
    }

    /** 创建凭据 创建新的凭据，并将凭据值存入凭据的初始版本。
     * 凭据管理服务将凭据值加密后，存储在凭据对象下的版本中。每个版本可与多个凭据版本状态相关联，凭据版本状态用于标识凭据版本处于的阶段，没有版本状态标记的版本视为已弃用，可用凭据管理服务自动删除。
     * 初始版本的状态被标记为SYSCURRENT。
     *
     * @param CreateSecretRequest 请求对象
     * @return AsyncInvoker<CreateSecretRequest, CreateSecretResponse> */
    public AsyncInvoker<CreateSecretRequest, CreateSecretResponse> createSecretAsyncInvoker(
        CreateSecretRequest request) {
        return new AsyncInvoker<CreateSecretRequest, CreateSecretResponse>(request, CsmsMeta.createSecret, hcClient);
    }

    /** 添加凭据标签 - 功能介绍：添加凭据标签。
     *
     * @param CreateSecretTagRequest 请求对象
     * @return CompletableFuture<CreateSecretTagResponse> */
    public CompletableFuture<CreateSecretTagResponse> createSecretTagAsync(CreateSecretTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.createSecretTag);
    }

    /** 添加凭据标签 - 功能介绍：添加凭据标签。
     *
     * @param CreateSecretTagRequest 请求对象
     * @return AsyncInvoker<CreateSecretTagRequest, CreateSecretTagResponse> */
    public AsyncInvoker<CreateSecretTagRequest, CreateSecretTagResponse> createSecretTagAsyncInvoker(
        CreateSecretTagRequest request) {
        return new AsyncInvoker<CreateSecretTagRequest, CreateSecretTagResponse>(request, CsmsMeta.createSecretTag,
            hcClient);
    }

    /** 创建凭据版本
     * 在指定的凭据中，创建一个新的凭据版本，用于加密保管新的凭据值。默认情况下，新创建的凭据版本被标记为SYSCURRENT状态，而SYSCURRENT标记的前一个凭据版本被标记为SYSPREVIOUS状态。您可以通过指定VersionStage参数来覆盖默认行为。
     *
     * @param CreateSecretVersionRequest 请求对象
     * @return CompletableFuture<CreateSecretVersionResponse> */
    public CompletableFuture<CreateSecretVersionResponse> createSecretVersionAsync(CreateSecretVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.createSecretVersion);
    }

    /** 创建凭据版本
     * 在指定的凭据中，创建一个新的凭据版本，用于加密保管新的凭据值。默认情况下，新创建的凭据版本被标记为SYSCURRENT状态，而SYSCURRENT标记的前一个凭据版本被标记为SYSPREVIOUS状态。您可以通过指定VersionStage参数来覆盖默认行为。
     *
     * @param CreateSecretVersionRequest 请求对象
     * @return AsyncInvoker<CreateSecretVersionRequest, CreateSecretVersionResponse> */
    public AsyncInvoker<CreateSecretVersionRequest, CreateSecretVersionResponse> createSecretVersionAsyncInvoker(
        CreateSecretVersionRequest request) {
        return new AsyncInvoker<CreateSecretVersionRequest, CreateSecretVersionResponse>(request,
            CsmsMeta.createSecretVersion, hcClient);
    }

    /** 立即删除凭据 立即删除指定的凭据，且无法恢复。
     *
     * @param DeleteSecretRequest 请求对象
     * @return CompletableFuture<DeleteSecretResponse> */
    public CompletableFuture<DeleteSecretResponse> deleteSecretAsync(DeleteSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.deleteSecret);
    }

    /** 立即删除凭据 立即删除指定的凭据，且无法恢复。
     *
     * @param DeleteSecretRequest 请求对象
     * @return AsyncInvoker<DeleteSecretRequest, DeleteSecretResponse> */
    public AsyncInvoker<DeleteSecretRequest, DeleteSecretResponse> deleteSecretAsyncInvoker(
        DeleteSecretRequest request) {
        return new AsyncInvoker<DeleteSecretRequest, DeleteSecretResponse>(request, CsmsMeta.deleteSecret, hcClient);
    }

    /** 创建凭据的定时删除任务 指定延迟删除时间，创建删除凭据的定时任务，可设置7~30天的的延迟删除时间。
     *
     * @param DeleteSecretForScheduleRequest 请求对象
     * @return CompletableFuture<DeleteSecretForScheduleResponse> */
    public CompletableFuture<DeleteSecretForScheduleResponse> deleteSecretForScheduleAsync(
        DeleteSecretForScheduleRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.deleteSecretForSchedule);
    }

    /** 创建凭据的定时删除任务 指定延迟删除时间，创建删除凭据的定时任务，可设置7~30天的的延迟删除时间。
     *
     * @param DeleteSecretForScheduleRequest 请求对象
     * @return AsyncInvoker<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse> */
    public AsyncInvoker<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse> deleteSecretForScheduleAsyncInvoker(
        DeleteSecretForScheduleRequest request) {
        return new AsyncInvoker<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse>(request,
            CsmsMeta.deleteSecretForSchedule, hcClient);
    }

    /** 删除凭据的版本状态 删除指定的凭据版本状态。
     *
     * @param DeleteSecretStageRequest 请求对象
     * @return CompletableFuture<DeleteSecretStageResponse> */
    public CompletableFuture<DeleteSecretStageResponse> deleteSecretStageAsync(DeleteSecretStageRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.deleteSecretStage);
    }

    /** 删除凭据的版本状态 删除指定的凭据版本状态。
     *
     * @param DeleteSecretStageRequest 请求对象
     * @return AsyncInvoker<DeleteSecretStageRequest, DeleteSecretStageResponse> */
    public AsyncInvoker<DeleteSecretStageRequest, DeleteSecretStageResponse> deleteSecretStageAsyncInvoker(
        DeleteSecretStageRequest request) {
        return new AsyncInvoker<DeleteSecretStageRequest, DeleteSecretStageResponse>(request,
            CsmsMeta.deleteSecretStage, hcClient);
    }

    /** 删除凭据标签 - 功能介绍：删除凭据标签。
     *
     * @param DeleteSecretTagRequest 请求对象
     * @return CompletableFuture<DeleteSecretTagResponse> */
    public CompletableFuture<DeleteSecretTagResponse> deleteSecretTagAsync(DeleteSecretTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.deleteSecretTag);
    }

    /** 删除凭据标签 - 功能介绍：删除凭据标签。
     *
     * @param DeleteSecretTagRequest 请求对象
     * @return AsyncInvoker<DeleteSecretTagRequest, DeleteSecretTagResponse> */
    public AsyncInvoker<DeleteSecretTagRequest, DeleteSecretTagResponse> deleteSecretTagAsyncInvoker(
        DeleteSecretTagRequest request) {
        return new AsyncInvoker<DeleteSecretTagRequest, DeleteSecretTagResponse>(request, CsmsMeta.deleteSecretTag,
            hcClient);
    }

    /** 查询项目标签 - 功能介绍：查询用户在指定项目下的所有凭据标签集合。
     *
     * @param ListProjectSecretsTagsRequest 请求对象
     * @return CompletableFuture<ListProjectSecretsTagsResponse> */
    public CompletableFuture<ListProjectSecretsTagsResponse> listProjectSecretsTagsAsync(
        ListProjectSecretsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.listProjectSecretsTags);
    }

    /** 查询项目标签 - 功能介绍：查询用户在指定项目下的所有凭据标签集合。
     *
     * @param ListProjectSecretsTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectSecretsTagsRequest, ListProjectSecretsTagsResponse> */
    public AsyncInvoker<ListProjectSecretsTagsRequest, ListProjectSecretsTagsResponse> listProjectSecretsTagsAsyncInvoker(
        ListProjectSecretsTagsRequest request) {
        return new AsyncInvoker<ListProjectSecretsTagsRequest, ListProjectSecretsTagsResponse>(request,
            CsmsMeta.listProjectSecretsTags, hcClient);
    }

    /** 查询凭据实例 - 功能介绍：查询凭据实例。通过标签过滤，筛选用户凭据,返回凭据列表。
     *
     * @param ListResourceInstancesRequest 请求对象
     * @return CompletableFuture<ListResourceInstancesResponse> */
    public CompletableFuture<ListResourceInstancesResponse> listResourceInstancesAsync(
        ListResourceInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.listResourceInstances);
    }

    /** 查询凭据实例 - 功能介绍：查询凭据实例。通过标签过滤，筛选用户凭据,返回凭据列表。
     *
     * @param ListResourceInstancesRequest 请求对象
     * @return AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> */
    public AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstancesAsyncInvoker(
        ListResourceInstancesRequest request) {
        return new AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>(request,
            CsmsMeta.listResourceInstances, hcClient);
    }

    /** 查询凭据标签 - 功能介绍：查询凭据标签。
     *
     * @param ListSecretTagsRequest 请求对象
     * @return CompletableFuture<ListSecretTagsResponse> */
    public CompletableFuture<ListSecretTagsResponse> listSecretTagsAsync(ListSecretTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.listSecretTags);
    }

    /** 查询凭据标签 - 功能介绍：查询凭据标签。
     *
     * @param ListSecretTagsRequest 请求对象
     * @return AsyncInvoker<ListSecretTagsRequest, ListSecretTagsResponse> */
    public AsyncInvoker<ListSecretTagsRequest, ListSecretTagsResponse> listSecretTagsAsyncInvoker(
        ListSecretTagsRequest request) {
        return new AsyncInvoker<ListSecretTagsRequest, ListSecretTagsResponse>(request, CsmsMeta.listSecretTags,
            hcClient);
    }

    /** 查询凭据的版本列表 查询指定凭据下的版本列表信息。
     *
     * @param ListSecretVersionsRequest 请求对象
     * @return CompletableFuture<ListSecretVersionsResponse> */
    public CompletableFuture<ListSecretVersionsResponse> listSecretVersionsAsync(ListSecretVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.listSecretVersions);
    }

    /** 查询凭据的版本列表 查询指定凭据下的版本列表信息。
     *
     * @param ListSecretVersionsRequest 请求对象
     * @return AsyncInvoker<ListSecretVersionsRequest, ListSecretVersionsResponse> */
    public AsyncInvoker<ListSecretVersionsRequest, ListSecretVersionsResponse> listSecretVersionsAsyncInvoker(
        ListSecretVersionsRequest request) {
        return new AsyncInvoker<ListSecretVersionsRequest, ListSecretVersionsResponse>(request,
            CsmsMeta.listSecretVersions, hcClient);
    }

    /** 查询凭据列表 查询当前用户在本项目下创建的所有凭据。
     *
     * @param ListSecretsRequest 请求对象
     * @return CompletableFuture<ListSecretsResponse> */
    public CompletableFuture<ListSecretsResponse> listSecretsAsync(ListSecretsRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.listSecrets);
    }

    /** 查询凭据列表 查询当前用户在本项目下创建的所有凭据。
     *
     * @param ListSecretsRequest 请求对象
     * @return AsyncInvoker<ListSecretsRequest, ListSecretsResponse> */
    public AsyncInvoker<ListSecretsRequest, ListSecretsResponse> listSecretsAsyncInvoker(ListSecretsRequest request) {
        return new AsyncInvoker<ListSecretsRequest, ListSecretsResponse>(request, CsmsMeta.listSecrets, hcClient);
    }

    /** 取消凭据的定时删除任务 取消凭据的定时删除任务，凭据对象恢复可使用状态。
     *
     * @param RestoreSecretRequest 请求对象
     * @return CompletableFuture<RestoreSecretResponse> */
    public CompletableFuture<RestoreSecretResponse> restoreSecretAsync(RestoreSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.restoreSecret);
    }

    /** 取消凭据的定时删除任务 取消凭据的定时删除任务，凭据对象恢复可使用状态。
     *
     * @param RestoreSecretRequest 请求对象
     * @return AsyncInvoker<RestoreSecretRequest, RestoreSecretResponse> */
    public AsyncInvoker<RestoreSecretRequest, RestoreSecretResponse> restoreSecretAsyncInvoker(
        RestoreSecretRequest request) {
        return new AsyncInvoker<RestoreSecretRequest, RestoreSecretResponse>(request, CsmsMeta.restoreSecret, hcClient);
    }

    /** 查询凭据 查询指定凭据的信息。
     *
     * @param ShowSecretRequest 请求对象
     * @return CompletableFuture<ShowSecretResponse> */
    public CompletableFuture<ShowSecretResponse> showSecretAsync(ShowSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.showSecret);
    }

    /** 查询凭据 查询指定凭据的信息。
     *
     * @param ShowSecretRequest 请求对象
     * @return AsyncInvoker<ShowSecretRequest, ShowSecretResponse> */
    public AsyncInvoker<ShowSecretRequest, ShowSecretResponse> showSecretAsyncInvoker(ShowSecretRequest request) {
        return new AsyncInvoker<ShowSecretRequest, ShowSecretResponse>(request, CsmsMeta.showSecret, hcClient);
    }

    /** 查询凭据的版本状态 查询指定凭据版本状态标记的版本信息。
     *
     * @param ShowSecretStageRequest 请求对象
     * @return CompletableFuture<ShowSecretStageResponse> */
    public CompletableFuture<ShowSecretStageResponse> showSecretStageAsync(ShowSecretStageRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.showSecretStage);
    }

    /** 查询凭据的版本状态 查询指定凭据版本状态标记的版本信息。
     *
     * @param ShowSecretStageRequest 请求对象
     * @return AsyncInvoker<ShowSecretStageRequest, ShowSecretStageResponse> */
    public AsyncInvoker<ShowSecretStageRequest, ShowSecretStageResponse> showSecretStageAsyncInvoker(
        ShowSecretStageRequest request) {
        return new AsyncInvoker<ShowSecretStageRequest, ShowSecretStageResponse>(request, CsmsMeta.showSecretStage,
            hcClient);
    }

    /** 查询凭据的版本与凭据值 查询指定凭据版本的信息和版本中的明文凭据值，只能查询ENABLED状态的凭据。
     * 通过/v1/{project_id}/secrets/{secret_id}/versions/latest可访问凭据最新版本的凭据值。
     *
     * @param ShowSecretVersionRequest 请求对象
     * @return CompletableFuture<ShowSecretVersionResponse> */
    public CompletableFuture<ShowSecretVersionResponse> showSecretVersionAsync(ShowSecretVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.showSecretVersion);
    }

    /** 查询凭据的版本与凭据值 查询指定凭据版本的信息和版本中的明文凭据值，只能查询ENABLED状态的凭据。
     * 通过/v1/{project_id}/secrets/{secret_id}/versions/latest可访问凭据最新版本的凭据值。
     *
     * @param ShowSecretVersionRequest 请求对象
     * @return AsyncInvoker<ShowSecretVersionRequest, ShowSecretVersionResponse> */
    public AsyncInvoker<ShowSecretVersionRequest, ShowSecretVersionResponse> showSecretVersionAsyncInvoker(
        ShowSecretVersionRequest request) {
        return new AsyncInvoker<ShowSecretVersionRequest, ShowSecretVersionResponse>(request,
            CsmsMeta.showSecretVersion, hcClient);
    }

    /** 更新凭据 更新指定凭据的元数据信息。
     *
     * @param UpdateSecretRequest 请求对象
     * @return CompletableFuture<UpdateSecretResponse> */
    public CompletableFuture<UpdateSecretResponse> updateSecretAsync(UpdateSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.updateSecret);
    }

    /** 更新凭据 更新指定凭据的元数据信息。
     *
     * @param UpdateSecretRequest 请求对象
     * @return AsyncInvoker<UpdateSecretRequest, UpdateSecretResponse> */
    public AsyncInvoker<UpdateSecretRequest, UpdateSecretResponse> updateSecretAsyncInvoker(
        UpdateSecretRequest request) {
        return new AsyncInvoker<UpdateSecretRequest, UpdateSecretResponse>(request, CsmsMeta.updateSecret, hcClient);
    }

    /** 更新凭据的版本状态 更新凭据的版本状态。
     *
     * @param UpdateSecretStageRequest 请求对象
     * @return CompletableFuture<UpdateSecretStageResponse> */
    public CompletableFuture<UpdateSecretStageResponse> updateSecretStageAsync(UpdateSecretStageRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.updateSecretStage);
    }

    /** 更新凭据的版本状态 更新凭据的版本状态。
     *
     * @param UpdateSecretStageRequest 请求对象
     * @return AsyncInvoker<UpdateSecretStageRequest, UpdateSecretStageResponse> */
    public AsyncInvoker<UpdateSecretStageRequest, UpdateSecretStageResponse> updateSecretStageAsyncInvoker(
        UpdateSecretStageRequest request) {
        return new AsyncInvoker<UpdateSecretStageRequest, UpdateSecretStageResponse>(request,
            CsmsMeta.updateSecretStage, hcClient);
    }

}
