package com.huaweicloud.sdk.csms.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.csms.v1.model.BatchCreateOrDeleteTagsRequest;
import com.huaweicloud.sdk.csms.v1.model.BatchCreateOrDeleteTagsResponse;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretEventRequest;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretEventResponse;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretRequest;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretResponse;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretTagRequest;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretTagResponse;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretVersionRequest;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretVersionResponse;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretEventRequest;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretEventResponse;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretForScheduleRequest;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretForScheduleResponse;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretRequest;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretResponse;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretStageRequest;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretStageResponse;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretTagRequest;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretTagResponse;
import com.huaweicloud.sdk.csms.v1.model.DownloadSecretBlobRequest;
import com.huaweicloud.sdk.csms.v1.model.DownloadSecretBlobResponse;
import com.huaweicloud.sdk.csms.v1.model.ListNotificationRecordsRequest;
import com.huaweicloud.sdk.csms.v1.model.ListNotificationRecordsResponse;
import com.huaweicloud.sdk.csms.v1.model.ListProjectSecretsTagsRequest;
import com.huaweicloud.sdk.csms.v1.model.ListProjectSecretsTagsResponse;
import com.huaweicloud.sdk.csms.v1.model.ListResourceInstancesRequest;
import com.huaweicloud.sdk.csms.v1.model.ListResourceInstancesResponse;
import com.huaweicloud.sdk.csms.v1.model.ListSecretEventsRequest;
import com.huaweicloud.sdk.csms.v1.model.ListSecretEventsResponse;
import com.huaweicloud.sdk.csms.v1.model.ListSecretTagsRequest;
import com.huaweicloud.sdk.csms.v1.model.ListSecretTagsResponse;
import com.huaweicloud.sdk.csms.v1.model.ListSecretVersionsRequest;
import com.huaweicloud.sdk.csms.v1.model.ListSecretVersionsResponse;
import com.huaweicloud.sdk.csms.v1.model.ListSecretsRequest;
import com.huaweicloud.sdk.csms.v1.model.ListSecretsResponse;
import com.huaweicloud.sdk.csms.v1.model.RestoreSecretRequest;
import com.huaweicloud.sdk.csms.v1.model.RestoreSecretResponse;
import com.huaweicloud.sdk.csms.v1.model.RotateSecretRequest;
import com.huaweicloud.sdk.csms.v1.model.RotateSecretResponse;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretEventRequest;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretEventResponse;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretRequest;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretResponse;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretStageRequest;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretStageResponse;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretVersionRequest;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretVersionResponse;
import com.huaweicloud.sdk.csms.v1.model.UpdateSecretEventRequest;
import com.huaweicloud.sdk.csms.v1.model.UpdateSecretEventResponse;
import com.huaweicloud.sdk.csms.v1.model.UpdateSecretRequest;
import com.huaweicloud.sdk.csms.v1.model.UpdateSecretResponse;
import com.huaweicloud.sdk.csms.v1.model.UpdateSecretStageRequest;
import com.huaweicloud.sdk.csms.v1.model.UpdateSecretStageResponse;
import com.huaweicloud.sdk.csms.v1.model.UpdateVersionRequest;
import com.huaweicloud.sdk.csms.v1.model.UpdateVersionResponse;
import com.huaweicloud.sdk.csms.v1.model.UploadSecretBlobRequest;
import com.huaweicloud.sdk.csms.v1.model.UploadSecretBlobResponse;

public class CsmsClient {

    protected HcClient hcClient;

    public CsmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CsmsClient> newBuilder() {
        ClientBuilder<CsmsClient> clientBuilder = new ClientBuilder<>(CsmsClient::new);
        return clientBuilder;
    }

    /**
     * 批量添加或删除凭据标签
     *
     * - 功能介绍：批量添加或删除凭据标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteTagsRequest 请求对象
     * @return BatchCreateOrDeleteTagsResponse
     */
    public BatchCreateOrDeleteTagsResponse batchCreateOrDeleteTags(BatchCreateOrDeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.batchCreateOrDeleteTags);
    }

    /**
     * 批量添加或删除凭据标签
     *
     * - 功能介绍：批量添加或删除凭据标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse>
     */
    public SyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> batchCreateOrDeleteTagsInvoker(
        BatchCreateOrDeleteTagsRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.batchCreateOrDeleteTags, hcClient);
    }

    /**
     * 创建凭据
     *
     * 创建新的凭据，并将凭据值存入凭据的初始版本。
     * 
     * 凭据管理服务将凭据值加密后，存储在凭据对象下的版本中。每个版本可与多个凭据版本状态相关联，凭据版本状态用于标识凭据版本处于的阶段，没有版本状态标记的版本视为已弃用，可用凭据管理服务自动删除。
     * 
     * 初始版本的状态被标记为SYSCURRENT。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecretRequest 请求对象
     * @return CreateSecretResponse
     */
    public CreateSecretResponse createSecret(CreateSecretRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.createSecret);
    }

    /**
     * 创建凭据
     *
     * 创建新的凭据，并将凭据值存入凭据的初始版本。
     * 
     * 凭据管理服务将凭据值加密后，存储在凭据对象下的版本中。每个版本可与多个凭据版本状态相关联，凭据版本状态用于标识凭据版本处于的阶段，没有版本状态标记的版本视为已弃用，可用凭据管理服务自动删除。
     * 
     * 初始版本的状态被标记为SYSCURRENT。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecretRequest 请求对象
     * @return SyncInvoker<CreateSecretRequest, CreateSecretResponse>
     */
    public SyncInvoker<CreateSecretRequest, CreateSecretResponse> createSecretInvoker(CreateSecretRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.createSecret, hcClient);
    }

    /**
     * 创建事件
     *
     * 创建事件，事件可配置在一个或多个凭据对象上。当事件为启用状态且包含的基础事件类型在凭据对象上触发时，云服务会将对应的事件通知发送至事件指定的通知主题上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecretEventRequest 请求对象
     * @return CreateSecretEventResponse
     */
    public CreateSecretEventResponse createSecretEvent(CreateSecretEventRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.createSecretEvent);
    }

    /**
     * 创建事件
     *
     * 创建事件，事件可配置在一个或多个凭据对象上。当事件为启用状态且包含的基础事件类型在凭据对象上触发时，云服务会将对应的事件通知发送至事件指定的通知主题上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecretEventRequest 请求对象
     * @return SyncInvoker<CreateSecretEventRequest, CreateSecretEventResponse>
     */
    public SyncInvoker<CreateSecretEventRequest, CreateSecretEventResponse> createSecretEventInvoker(
        CreateSecretEventRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.createSecretEvent, hcClient);
    }

    /**
     * 添加凭据标签
     *
     * 添加凭据标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecretTagRequest 请求对象
     * @return CreateSecretTagResponse
     */
    public CreateSecretTagResponse createSecretTag(CreateSecretTagRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.createSecretTag);
    }

    /**
     * 添加凭据标签
     *
     * 添加凭据标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecretTagRequest 请求对象
     * @return SyncInvoker<CreateSecretTagRequest, CreateSecretTagResponse>
     */
    public SyncInvoker<CreateSecretTagRequest, CreateSecretTagResponse> createSecretTagInvoker(
        CreateSecretTagRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.createSecretTag, hcClient);
    }

    /**
     * 创建凭据版本
     *
     * 在指定的凭据中，创建一个新的凭据版本，用于加密保管新的凭据值。默认情况下，新创建的凭据版本被标记为SYSCURRENT状态，而SYSCURRENT标记的前一个凭据版本被标记为SYSPREVIOUS状态。您可以通过指定VersionStage参数来覆盖默认行为。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecretVersionRequest 请求对象
     * @return CreateSecretVersionResponse
     */
    public CreateSecretVersionResponse createSecretVersion(CreateSecretVersionRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.createSecretVersion);
    }

    /**
     * 创建凭据版本
     *
     * 在指定的凭据中，创建一个新的凭据版本，用于加密保管新的凭据值。默认情况下，新创建的凭据版本被标记为SYSCURRENT状态，而SYSCURRENT标记的前一个凭据版本被标记为SYSPREVIOUS状态。您可以通过指定VersionStage参数来覆盖默认行为。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecretVersionRequest 请求对象
     * @return SyncInvoker<CreateSecretVersionRequest, CreateSecretVersionResponse>
     */
    public SyncInvoker<CreateSecretVersionRequest, CreateSecretVersionResponse> createSecretVersionInvoker(
        CreateSecretVersionRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.createSecretVersion, hcClient);
    }

    /**
     * 立即删除凭据
     *
     * 立即删除指定的凭据，且无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecretRequest 请求对象
     * @return DeleteSecretResponse
     */
    public DeleteSecretResponse deleteSecret(DeleteSecretRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.deleteSecret);
    }

    /**
     * 立即删除凭据
     *
     * 立即删除指定的凭据，且无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecretRequest 请求对象
     * @return SyncInvoker<DeleteSecretRequest, DeleteSecretResponse>
     */
    public SyncInvoker<DeleteSecretRequest, DeleteSecretResponse> deleteSecretInvoker(DeleteSecretRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.deleteSecret, hcClient);
    }

    /**
     * 立即删除事件
     *
     * 立即删除指定的事件，且无法恢复。如事件存在凭据引用，则无法删除，请先解除关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecretEventRequest 请求对象
     * @return DeleteSecretEventResponse
     */
    public DeleteSecretEventResponse deleteSecretEvent(DeleteSecretEventRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.deleteSecretEvent);
    }

    /**
     * 立即删除事件
     *
     * 立即删除指定的事件，且无法恢复。如事件存在凭据引用，则无法删除，请先解除关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecretEventRequest 请求对象
     * @return SyncInvoker<DeleteSecretEventRequest, DeleteSecretEventResponse>
     */
    public SyncInvoker<DeleteSecretEventRequest, DeleteSecretEventResponse> deleteSecretEventInvoker(
        DeleteSecretEventRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.deleteSecretEvent, hcClient);
    }

    /**
     * 创建凭据的定时删除任务
     *
     * 指定延迟删除时间，创建删除凭据的定时任务，可设置7~30天的的延迟删除时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecretForScheduleRequest 请求对象
     * @return DeleteSecretForScheduleResponse
     */
    public DeleteSecretForScheduleResponse deleteSecretForSchedule(DeleteSecretForScheduleRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.deleteSecretForSchedule);
    }

    /**
     * 创建凭据的定时删除任务
     *
     * 指定延迟删除时间，创建删除凭据的定时任务，可设置7~30天的的延迟删除时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecretForScheduleRequest 请求对象
     * @return SyncInvoker<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse>
     */
    public SyncInvoker<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse> deleteSecretForScheduleInvoker(
        DeleteSecretForScheduleRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.deleteSecretForSchedule, hcClient);
    }

    /**
     * 删除凭据的版本状态
     *
     * 删除指定的凭据版本状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecretStageRequest 请求对象
     * @return DeleteSecretStageResponse
     */
    public DeleteSecretStageResponse deleteSecretStage(DeleteSecretStageRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.deleteSecretStage);
    }

    /**
     * 删除凭据的版本状态
     *
     * 删除指定的凭据版本状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecretStageRequest 请求对象
     * @return SyncInvoker<DeleteSecretStageRequest, DeleteSecretStageResponse>
     */
    public SyncInvoker<DeleteSecretStageRequest, DeleteSecretStageResponse> deleteSecretStageInvoker(
        DeleteSecretStageRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.deleteSecretStage, hcClient);
    }

    /**
     * 删除凭据标签
     *
     * 删除凭据标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecretTagRequest 请求对象
     * @return DeleteSecretTagResponse
     */
    public DeleteSecretTagResponse deleteSecretTag(DeleteSecretTagRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.deleteSecretTag);
    }

    /**
     * 删除凭据标签
     *
     * 删除凭据标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecretTagRequest 请求对象
     * @return SyncInvoker<DeleteSecretTagRequest, DeleteSecretTagResponse>
     */
    public SyncInvoker<DeleteSecretTagRequest, DeleteSecretTagResponse> deleteSecretTagInvoker(
        DeleteSecretTagRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.deleteSecretTag, hcClient);
    }

    /**
     * 下载凭据备份
     *
     * 下载指定凭据的备份文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadSecretBlobRequest 请求对象
     * @return DownloadSecretBlobResponse
     */
    public DownloadSecretBlobResponse downloadSecretBlob(DownloadSecretBlobRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.downloadSecretBlob);
    }

    /**
     * 下载凭据备份
     *
     * 下载指定凭据的备份文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadSecretBlobRequest 请求对象
     * @return SyncInvoker<DownloadSecretBlobRequest, DownloadSecretBlobResponse>
     */
    public SyncInvoker<DownloadSecretBlobRequest, DownloadSecretBlobResponse> downloadSecretBlobInvoker(
        DownloadSecretBlobRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.downloadSecretBlob, hcClient);
    }

    /**
     * 查询已触发的事件通知记录
     *
     * 查询三个月内所有已触发的事件通知记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationRecordsRequest 请求对象
     * @return ListNotificationRecordsResponse
     */
    public ListNotificationRecordsResponse listNotificationRecords(ListNotificationRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.listNotificationRecords);
    }

    /**
     * 查询已触发的事件通知记录
     *
     * 查询三个月内所有已触发的事件通知记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationRecordsRequest 请求对象
     * @return SyncInvoker<ListNotificationRecordsRequest, ListNotificationRecordsResponse>
     */
    public SyncInvoker<ListNotificationRecordsRequest, ListNotificationRecordsResponse> listNotificationRecordsInvoker(
        ListNotificationRecordsRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.listNotificationRecords, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询用户在指定项目下的所有凭据标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectSecretsTagsRequest 请求对象
     * @return ListProjectSecretsTagsResponse
     */
    public ListProjectSecretsTagsResponse listProjectSecretsTags(ListProjectSecretsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.listProjectSecretsTags);
    }

    /**
     * 查询项目标签
     *
     * 查询用户在指定项目下的所有凭据标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectSecretsTagsRequest 请求对象
     * @return SyncInvoker<ListProjectSecretsTagsRequest, ListProjectSecretsTagsResponse>
     */
    public SyncInvoker<ListProjectSecretsTagsRequest, ListProjectSecretsTagsResponse> listProjectSecretsTagsInvoker(
        ListProjectSecretsTagsRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.listProjectSecretsTags, hcClient);
    }

    /**
     * 查询凭据实例
     *
     * 查询凭据实例。通过标签过滤，筛选用户凭据，返回凭据列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstancesRequest 请求对象
     * @return ListResourceInstancesResponse
     */
    public ListResourceInstancesResponse listResourceInstances(ListResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.listResourceInstances);
    }

    /**
     * 查询凭据实例
     *
     * 查询凭据实例。通过标签过滤，筛选用户凭据，返回凭据列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstancesRequest 请求对象
     * @return SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>
     */
    public SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstancesInvoker(
        ListResourceInstancesRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.listResourceInstances, hcClient);
    }

    /**
     * 查询事件列表
     *
     * 查询当前用户在本项目下创建的所有事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecretEventsRequest 请求对象
     * @return ListSecretEventsResponse
     */
    public ListSecretEventsResponse listSecretEvents(ListSecretEventsRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.listSecretEvents);
    }

    /**
     * 查询事件列表
     *
     * 查询当前用户在本项目下创建的所有事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecretEventsRequest 请求对象
     * @return SyncInvoker<ListSecretEventsRequest, ListSecretEventsResponse>
     */
    public SyncInvoker<ListSecretEventsRequest, ListSecretEventsResponse> listSecretEventsInvoker(
        ListSecretEventsRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.listSecretEvents, hcClient);
    }

    /**
     * 查询凭据标签
     *
     * 查询凭据标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecretTagsRequest 请求对象
     * @return ListSecretTagsResponse
     */
    public ListSecretTagsResponse listSecretTags(ListSecretTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.listSecretTags);
    }

    /**
     * 查询凭据标签
     *
     * 查询凭据标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecretTagsRequest 请求对象
     * @return SyncInvoker<ListSecretTagsRequest, ListSecretTagsResponse>
     */
    public SyncInvoker<ListSecretTagsRequest, ListSecretTagsResponse> listSecretTagsInvoker(
        ListSecretTagsRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.listSecretTags, hcClient);
    }

    /**
     * 查询凭据的版本列表
     *
     * 查询指定凭据下的版本列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecretVersionsRequest 请求对象
     * @return ListSecretVersionsResponse
     */
    public ListSecretVersionsResponse listSecretVersions(ListSecretVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.listSecretVersions);
    }

    /**
     * 查询凭据的版本列表
     *
     * 查询指定凭据下的版本列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecretVersionsRequest 请求对象
     * @return SyncInvoker<ListSecretVersionsRequest, ListSecretVersionsResponse>
     */
    public SyncInvoker<ListSecretVersionsRequest, ListSecretVersionsResponse> listSecretVersionsInvoker(
        ListSecretVersionsRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.listSecretVersions, hcClient);
    }

    /**
     * 查询凭据列表
     *
     * 查询当前用户在本项目下创建的所有凭据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecretsRequest 请求对象
     * @return ListSecretsResponse
     */
    public ListSecretsResponse listSecrets(ListSecretsRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.listSecrets);
    }

    /**
     * 查询凭据列表
     *
     * 查询当前用户在本项目下创建的所有凭据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecretsRequest 请求对象
     * @return SyncInvoker<ListSecretsRequest, ListSecretsResponse>
     */
    public SyncInvoker<ListSecretsRequest, ListSecretsResponse> listSecretsInvoker(ListSecretsRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.listSecrets, hcClient);
    }

    /**
     * 取消凭据的定时删除任务
     *
     * 取消凭据的定时删除任务，凭据对象恢复可使用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreSecretRequest 请求对象
     * @return RestoreSecretResponse
     */
    public RestoreSecretResponse restoreSecret(RestoreSecretRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.restoreSecret);
    }

    /**
     * 取消凭据的定时删除任务
     *
     * 取消凭据的定时删除任务，凭据对象恢复可使用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreSecretRequest 请求对象
     * @return SyncInvoker<RestoreSecretRequest, RestoreSecretResponse>
     */
    public SyncInvoker<RestoreSecretRequest, RestoreSecretResponse> restoreSecretInvoker(RestoreSecretRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.restoreSecret, hcClient);
    }

    /**
     * 轮转凭据
     *
     * 立即执行轮转凭据。在指定的凭据中，创建一个新的凭据版本，用于加密存储后台随机产生的凭据值。同时将新创建的凭据版本标记为SYSCURRENT状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RotateSecretRequest 请求对象
     * @return RotateSecretResponse
     */
    public RotateSecretResponse rotateSecret(RotateSecretRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.rotateSecret);
    }

    /**
     * 轮转凭据
     *
     * 立即执行轮转凭据。在指定的凭据中，创建一个新的凭据版本，用于加密存储后台随机产生的凭据值。同时将新创建的凭据版本标记为SYSCURRENT状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RotateSecretRequest 请求对象
     * @return SyncInvoker<RotateSecretRequest, RotateSecretResponse>
     */
    public SyncInvoker<RotateSecretRequest, RotateSecretResponse> rotateSecretInvoker(RotateSecretRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.rotateSecret, hcClient);
    }

    /**
     * 查询凭据
     *
     * 查询指定凭据的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecretRequest 请求对象
     * @return ShowSecretResponse
     */
    public ShowSecretResponse showSecret(ShowSecretRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.showSecret);
    }

    /**
     * 查询凭据
     *
     * 查询指定凭据的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecretRequest 请求对象
     * @return SyncInvoker<ShowSecretRequest, ShowSecretResponse>
     */
    public SyncInvoker<ShowSecretRequest, ShowSecretResponse> showSecretInvoker(ShowSecretRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.showSecret, hcClient);
    }

    /**
     * 查询事件
     *
     * 查询指定事件的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecretEventRequest 请求对象
     * @return ShowSecretEventResponse
     */
    public ShowSecretEventResponse showSecretEvent(ShowSecretEventRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.showSecretEvent);
    }

    /**
     * 查询事件
     *
     * 查询指定事件的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecretEventRequest 请求对象
     * @return SyncInvoker<ShowSecretEventRequest, ShowSecretEventResponse>
     */
    public SyncInvoker<ShowSecretEventRequest, ShowSecretEventResponse> showSecretEventInvoker(
        ShowSecretEventRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.showSecretEvent, hcClient);
    }

    /**
     * 查询凭据的版本状态
     *
     * 查询指定凭据版本状态标记的版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecretStageRequest 请求对象
     * @return ShowSecretStageResponse
     */
    public ShowSecretStageResponse showSecretStage(ShowSecretStageRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.showSecretStage);
    }

    /**
     * 查询凭据的版本状态
     *
     * 查询指定凭据版本状态标记的版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecretStageRequest 请求对象
     * @return SyncInvoker<ShowSecretStageRequest, ShowSecretStageResponse>
     */
    public SyncInvoker<ShowSecretStageRequest, ShowSecretStageResponse> showSecretStageInvoker(
        ShowSecretStageRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.showSecretStage, hcClient);
    }

    /**
     * 查询凭据的版本与凭据值
     *
     * 查询指定凭据版本的信息和版本中的明文凭据值，只能查询ENABLED状态的凭据。
     * 通过/v1/{project_id}/secrets/{secret_name}/versions/latest （即将当前接口URL中的{version_id}赋值为latest）可访问凭据最新版本的凭据值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecretVersionRequest 请求对象
     * @return ShowSecretVersionResponse
     */
    public ShowSecretVersionResponse showSecretVersion(ShowSecretVersionRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.showSecretVersion);
    }

    /**
     * 查询凭据的版本与凭据值
     *
     * 查询指定凭据版本的信息和版本中的明文凭据值，只能查询ENABLED状态的凭据。
     * 通过/v1/{project_id}/secrets/{secret_name}/versions/latest （即将当前接口URL中的{version_id}赋值为latest）可访问凭据最新版本的凭据值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecretVersionRequest 请求对象
     * @return SyncInvoker<ShowSecretVersionRequest, ShowSecretVersionResponse>
     */
    public SyncInvoker<ShowSecretVersionRequest, ShowSecretVersionResponse> showSecretVersionInvoker(
        ShowSecretVersionRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.showSecretVersion, hcClient);
    }

    /**
     * 更新凭据
     *
     * 更新指定凭据的元数据信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecretRequest 请求对象
     * @return UpdateSecretResponse
     */
    public UpdateSecretResponse updateSecret(UpdateSecretRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.updateSecret);
    }

    /**
     * 更新凭据
     *
     * 更新指定凭据的元数据信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecretRequest 请求对象
     * @return SyncInvoker<UpdateSecretRequest, UpdateSecretResponse>
     */
    public SyncInvoker<UpdateSecretRequest, UpdateSecretResponse> updateSecretInvoker(UpdateSecretRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.updateSecret, hcClient);
    }

    /**
     * 更新事件
     *
     * 更新指定事件的元数据信息。支持更新的元数据包含事件启用状态、基础类型列表、通知主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecretEventRequest 请求对象
     * @return UpdateSecretEventResponse
     */
    public UpdateSecretEventResponse updateSecretEvent(UpdateSecretEventRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.updateSecretEvent);
    }

    /**
     * 更新事件
     *
     * 更新指定事件的元数据信息。支持更新的元数据包含事件启用状态、基础类型列表、通知主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecretEventRequest 请求对象
     * @return SyncInvoker<UpdateSecretEventRequest, UpdateSecretEventResponse>
     */
    public SyncInvoker<UpdateSecretEventRequest, UpdateSecretEventResponse> updateSecretEventInvoker(
        UpdateSecretEventRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.updateSecretEvent, hcClient);
    }

    /**
     * 更新凭据的版本状态
     *
     * 更新凭据的版本状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecretStageRequest 请求对象
     * @return UpdateSecretStageResponse
     */
    public UpdateSecretStageResponse updateSecretStage(UpdateSecretStageRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.updateSecretStage);
    }

    /**
     * 更新凭据的版本状态
     *
     * 更新凭据的版本状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecretStageRequest 请求对象
     * @return SyncInvoker<UpdateSecretStageRequest, UpdateSecretStageResponse>
     */
    public SyncInvoker<UpdateSecretStageRequest, UpdateSecretStageResponse> updateSecretStageInvoker(
        UpdateSecretStageRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.updateSecretStage, hcClient);
    }

    /**
     * 更新凭据版本
     *
     * 当前支持更新指定凭据版本的有效期，只能更新ENABLED状态的凭据。在关联订阅的事件包含“版本过期”基础事件类型时，每次更新版本有效期后仅会触发一次事件通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVersionRequest 请求对象
     * @return UpdateVersionResponse
     */
    public UpdateVersionResponse updateVersion(UpdateVersionRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.updateVersion);
    }

    /**
     * 更新凭据版本
     *
     * 当前支持更新指定凭据版本的有效期，只能更新ENABLED状态的凭据。在关联订阅的事件包含“版本过期”基础事件类型时，每次更新版本有效期后仅会触发一次事件通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVersionRequest 请求对象
     * @return SyncInvoker<UpdateVersionRequest, UpdateVersionResponse>
     */
    public SyncInvoker<UpdateVersionRequest, UpdateVersionResponse> updateVersionInvoker(UpdateVersionRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.updateVersion, hcClient);
    }

    /**
     * 恢复凭据对象
     *
     * 通过上传凭据备份文件，恢复凭据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadSecretBlobRequest 请求对象
     * @return UploadSecretBlobResponse
     */
    public UploadSecretBlobResponse uploadSecretBlob(UploadSecretBlobRequest request) {
        return hcClient.syncInvokeHttp(request, CsmsMeta.uploadSecretBlob);
    }

    /**
     * 恢复凭据对象
     *
     * 通过上传凭据备份文件，恢复凭据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadSecretBlobRequest 请求对象
     * @return SyncInvoker<UploadSecretBlobRequest, UploadSecretBlobResponse>
     */
    public SyncInvoker<UploadSecretBlobRequest, UploadSecretBlobResponse> uploadSecretBlobInvoker(
        UploadSecretBlobRequest request) {
        return new SyncInvoker<>(request, CsmsMeta.uploadSecretBlob, hcClient);
    }

}
