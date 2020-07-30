package com.huaweicloud.sdk.mpc.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.mpc.v1.model.*;

public class MpcAsyncClient {
    protected HcClient hcClient;

    public MpcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MpcAsyncClient> newBuilder() {
        return new ClientBuilder<>(MpcAsyncClient::new);
    }


    public CompletableFuture<CreateAnimatedGraphicsTaskResponse> createAnimatedGraphicsTaskAsync(CreateAnimatedGraphicsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createAnimatedGraphicsTask);
    }

    public CompletableFuture<DeleteAnimatedGraphicsTaskResponse> deleteAnimatedGraphicsTaskAsync(DeleteAnimatedGraphicsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteAnimatedGraphicsTask);
    }

    public CompletableFuture<ListAnimatedGraphicsTaskResponse> listAnimatedGraphicsTaskAsync(ListAnimatedGraphicsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listAnimatedGraphicsTask);
    }

    public CompletableFuture<CreateEncryptTaskResponse> createEncryptTaskAsync(CreateEncryptTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createEncryptTask);
    }

    public CompletableFuture<DeleteEncryptTaskResponse> deleteEncryptTaskAsync(DeleteEncryptTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteEncryptTask);
    }

    public CompletableFuture<ListEncryptTaskResponse> listEncryptTaskAsync(ListEncryptTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listEncryptTask);
    }

    public CompletableFuture<CreateExtractTaskResponse> createExtractTaskAsync(CreateExtractTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createExtractTask);
    }

    public CompletableFuture<DeleteExtractTaskResponse> deleteExtractTaskAsync(DeleteExtractTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteExtractTask);
    }

    public CompletableFuture<ListExtractTaskResponse> listExtractTaskAsync(ListExtractTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listExtractTask);
    }

    public CompletableFuture<ShowJobStatusResponse> showJobStatusAsync(ShowJobStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.showJobStatus);
    }

    public CompletableFuture<ListAllBucketsResponse> listAllBucketsAsync(ListAllBucketsRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listAllBuckets);
    }

    public CompletableFuture<UpdateBucketAuthorizedResponse> updateBucketAuthorizedAsync(UpdateBucketAuthorizedRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.updateBucketAuthorized);
    }

    public CompletableFuture<ListAllObsObjListResponse> listAllObsObjListAsync(ListAllObsObjListRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listAllObsObjList);
    }

    public CompletableFuture<CreateQualityEnhanceTemplateResponse> createQualityEnhanceTemplateAsync(CreateQualityEnhanceTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createQualityEnhanceTemplate);
    }

    public CompletableFuture<DeleteQualityEnhanceTemplateResponse> deleteQualityEnhanceTemplateAsync(DeleteQualityEnhanceTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteQualityEnhanceTemplate);
    }

    public CompletableFuture<ListQualityEnhanceDefaultTemplateResponse> listQualityEnhanceDefaultTemplateAsync(ListQualityEnhanceDefaultTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listQualityEnhanceDefaultTemplate);
    }

    public CompletableFuture<ListQualityEnhanceTemplateResponse> listQualityEnhanceTemplateAsync(ListQualityEnhanceTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listQualityEnhanceTemplate);
    }

    public CompletableFuture<UpdateQualityEnhanceTemplateResponse> updateQualityEnhanceTemplateAsync(UpdateQualityEnhanceTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.updateQualityEnhanceTemplate);
    }

    public CompletableFuture<ListTranscodeDetailResponse> listTranscodeDetailAsync(ListTranscodeDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listTranscodeDetail);
    }

    public CompletableFuture<CancelRemuxTaskResponse> cancelRemuxTaskAsync(CancelRemuxTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.cancelRemuxTask);
    }

    public CompletableFuture<CreateRemuxTaskResponse> createRemuxTaskAsync(CreateRemuxTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createRemuxTask);
    }

    public CompletableFuture<CreateRetryRemuxTaskResponse> createRetryRemuxTaskAsync(CreateRetryRemuxTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createRetryRemuxTask);
    }

    public CompletableFuture<DeleteRemuxTaskResponse> deleteRemuxTaskAsync(DeleteRemuxTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteRemuxTask);
    }

    public CompletableFuture<ListRemuxTaskResponse> listRemuxTaskAsync(ListRemuxTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listRemuxTask);
    }

    public CompletableFuture<ListNotifyEventResponse> listNotifyEventAsync(ListNotifyEventRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listNotifyEvent);
    }

    public CompletableFuture<ListNotifySmnTopicConfigResponse> listNotifySmnTopicConfigAsync(ListNotifySmnTopicConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listNotifySmnTopicConfig);
    }

    public CompletableFuture<ListNotifyTemplateResponse> listNotifyTemplateAsync(ListNotifyTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listNotifyTemplate);
    }

    public CompletableFuture<NotifySmnTopicConfigResponse> notifySmnTopicConfigAsync(NotifySmnTopicConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.notifySmnTopicConfig);
    }

    public CompletableFuture<ListStatSummaryResponse> listStatSummaryAsync(ListStatSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listStatSummary);
    }

    public CompletableFuture<ListSummaryResponse> listSummaryAsync(ListSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listSummary);
    }

    public CompletableFuture<CreateTemplateGroupResponse> createTemplateGroupAsync(CreateTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createTemplateGroup);
    }

    public CompletableFuture<DeleteTemplateGroupResponse> deleteTemplateGroupAsync(DeleteTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteTemplateGroup);
    }

    public CompletableFuture<ListTemplateGroupResponse> listTemplateGroupAsync(ListTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listTemplateGroup);
    }

    public CompletableFuture<UpdateTemplateGroupResponse> updateTemplateGroupAsync(UpdateTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.updateTemplateGroup);
    }

    public CompletableFuture<UpdateTenantStatusResponse> updateTenantStatusAsync(UpdateTenantStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.updateTenantStatus);
    }

    public CompletableFuture<ShowTenantInfoResponse> showTenantInfoAsync(ShowTenantInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.showTenantInfo);
    }

    public CompletableFuture<UpdateTenantInfoResponse> updateTenantInfoAsync(UpdateTenantInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.updateTenantInfo);
    }

    public CompletableFuture<CreateThumbnailsTaskResponse> createThumbnailsTaskAsync(CreateThumbnailsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createThumbnailsTask);
    }

    public CompletableFuture<DeleteThumbnailsTaskResponse> deleteThumbnailsTaskAsync(DeleteThumbnailsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteThumbnailsTask);
    }

    public CompletableFuture<ListThumbnailsTaskResponse> listThumbnailsTaskAsync(ListThumbnailsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listThumbnailsTask);
    }

    public CompletableFuture<CreateTranscodingTaskResponse> createTranscodingTaskAsync(CreateTranscodingTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createTranscodingTask);
    }

    public CompletableFuture<DeleteTranscodingTaskResponse> deleteTranscodingTaskAsync(DeleteTranscodingTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteTranscodingTask);
    }

    public CompletableFuture<DeleteTranscodingTaskByConsoleResponse> deleteTranscodingTaskByConsoleAsync(DeleteTranscodingTaskByConsoleRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteTranscodingTaskByConsole);
    }

    public CompletableFuture<ListTranscodingTaskResponse> listTranscodingTaskAsync(ListTranscodingTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listTranscodingTask);
    }

    public CompletableFuture<CreateTransTemplateResponse> createTransTemplateAsync(CreateTransTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createTransTemplate);
    }

    public CompletableFuture<DeleteTemplateResponse> deleteTemplateAsync(DeleteTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteTemplate);
    }

    public CompletableFuture<ListTemplateResponse> listTemplateAsync(ListTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listTemplate);
    }

    public CompletableFuture<UpdateTransTemplateResponse> updateTransTemplateAsync(UpdateTransTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.updateTransTemplate);
    }

    public CompletableFuture<CreateWatermarkTemplateResponse> createWatermarkTemplateAsync(CreateWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createWatermarkTemplate);
    }

    public CompletableFuture<DeleteWatermarkTemplateResponse> deleteWatermarkTemplateAsync(DeleteWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteWatermarkTemplate);
    }

    public CompletableFuture<ListWatermarkTemplateResponse> listWatermarkTemplateAsync(ListWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listWatermarkTemplate);
    }

    public CompletableFuture<UpdateWatermarkTemplateResponse> updateWatermarkTemplateAsync(UpdateWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.updateWatermarkTemplate);
    }

}