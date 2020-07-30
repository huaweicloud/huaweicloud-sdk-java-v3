package com.huaweicloud.sdk.mpc.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.mpc.v1.model.*;

public class MpcClient {
    protected HcClient hcClient;

    public MpcClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MpcClient> newBuilder() {
        return new ClientBuilder<>(MpcClient::new);
    }

    public CreateAnimatedGraphicsTaskResponse createAnimatedGraphicsTask(CreateAnimatedGraphicsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createAnimatedGraphicsTask);
    }

    public DeleteAnimatedGraphicsTaskResponse deleteAnimatedGraphicsTask(DeleteAnimatedGraphicsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteAnimatedGraphicsTask);
    }

    public ListAnimatedGraphicsTaskResponse listAnimatedGraphicsTask(ListAnimatedGraphicsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listAnimatedGraphicsTask);
    }

    public CreateEncryptTaskResponse createEncryptTask(CreateEncryptTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createEncryptTask);
    }

    public DeleteEncryptTaskResponse deleteEncryptTask(DeleteEncryptTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteEncryptTask);
    }

    public ListEncryptTaskResponse listEncryptTask(ListEncryptTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listEncryptTask);
    }

    public CreateExtractTaskResponse createExtractTask(CreateExtractTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createExtractTask);
    }

    public DeleteExtractTaskResponse deleteExtractTask(DeleteExtractTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteExtractTask);
    }

    public ListExtractTaskResponse listExtractTask(ListExtractTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listExtractTask);
    }

    public ShowJobStatusResponse showJobStatus(ShowJobStatusRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.showJobStatus);
    }

    public ListAllBucketsResponse listAllBuckets(ListAllBucketsRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listAllBuckets);
    }

    public UpdateBucketAuthorizedResponse updateBucketAuthorized(UpdateBucketAuthorizedRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.updateBucketAuthorized);
    }

    public ListAllObsObjListResponse listAllObsObjList(ListAllObsObjListRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listAllObsObjList);
    }

    public CreateQualityEnhanceTemplateResponse createQualityEnhanceTemplate(CreateQualityEnhanceTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createQualityEnhanceTemplate);
    }

    public DeleteQualityEnhanceTemplateResponse deleteQualityEnhanceTemplate(DeleteQualityEnhanceTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteQualityEnhanceTemplate);
    }

    public ListQualityEnhanceDefaultTemplateResponse listQualityEnhanceDefaultTemplate(ListQualityEnhanceDefaultTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listQualityEnhanceDefaultTemplate);
    }

    public ListQualityEnhanceTemplateResponse listQualityEnhanceTemplate(ListQualityEnhanceTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listQualityEnhanceTemplate);
    }

    public UpdateQualityEnhanceTemplateResponse updateQualityEnhanceTemplate(UpdateQualityEnhanceTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.updateQualityEnhanceTemplate);
    }

    public ListTranscodeDetailResponse listTranscodeDetail(ListTranscodeDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listTranscodeDetail);
    }

    public CancelRemuxTaskResponse cancelRemuxTask(CancelRemuxTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.cancelRemuxTask);
    }

    public CreateRemuxTaskResponse createRemuxTask(CreateRemuxTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createRemuxTask);
    }

    public CreateRetryRemuxTaskResponse createRetryRemuxTask(CreateRetryRemuxTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createRetryRemuxTask);
    }

    public DeleteRemuxTaskResponse deleteRemuxTask(DeleteRemuxTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteRemuxTask);
    }

    public ListRemuxTaskResponse listRemuxTask(ListRemuxTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listRemuxTask);
    }

    public ListNotifyEventResponse listNotifyEvent(ListNotifyEventRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listNotifyEvent);
    }

    public ListNotifySmnTopicConfigResponse listNotifySmnTopicConfig(ListNotifySmnTopicConfigRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listNotifySmnTopicConfig);
    }

    public ListNotifyTemplateResponse listNotifyTemplate(ListNotifyTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listNotifyTemplate);
    }

    public NotifySmnTopicConfigResponse notifySmnTopicConfig(NotifySmnTopicConfigRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.notifySmnTopicConfig);
    }

    public ListStatSummaryResponse listStatSummary(ListStatSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listStatSummary);
    }

    public ListSummaryResponse listSummary(ListSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listSummary);
    }

    public CreateTemplateGroupResponse createTemplateGroup(CreateTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createTemplateGroup);
    }

    public DeleteTemplateGroupResponse deleteTemplateGroup(DeleteTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteTemplateGroup);
    }

    public ListTemplateGroupResponse listTemplateGroup(ListTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listTemplateGroup);
    }

    public UpdateTemplateGroupResponse updateTemplateGroup(UpdateTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.updateTemplateGroup);
    }

    public UpdateTenantStatusResponse updateTenantStatus(UpdateTenantStatusRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.updateTenantStatus);
    }

    public ShowTenantInfoResponse showTenantInfo(ShowTenantInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.showTenantInfo);
    }

    public UpdateTenantInfoResponse updateTenantInfo(UpdateTenantInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.updateTenantInfo);
    }

    public CreateThumbnailsTaskResponse createThumbnailsTask(CreateThumbnailsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createThumbnailsTask);
    }

    public DeleteThumbnailsTaskResponse deleteThumbnailsTask(DeleteThumbnailsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteThumbnailsTask);
    }

    public ListThumbnailsTaskResponse listThumbnailsTask(ListThumbnailsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listThumbnailsTask);
    }

    public CreateTranscodingTaskResponse createTranscodingTask(CreateTranscodingTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createTranscodingTask);
    }

    public DeleteTranscodingTaskResponse deleteTranscodingTask(DeleteTranscodingTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteTranscodingTask);
    }

    public DeleteTranscodingTaskByConsoleResponse deleteTranscodingTaskByConsole(DeleteTranscodingTaskByConsoleRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteTranscodingTaskByConsole);
    }

    public ListTranscodingTaskResponse listTranscodingTask(ListTranscodingTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listTranscodingTask);
    }

    public CreateTransTemplateResponse createTransTemplate(CreateTransTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createTransTemplate);
    }

    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteTemplate);
    }

    public ListTemplateResponse listTemplate(ListTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listTemplate);
    }

    public UpdateTransTemplateResponse updateTransTemplate(UpdateTransTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.updateTransTemplate);
    }

    public CreateWatermarkTemplateResponse createWatermarkTemplate(CreateWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createWatermarkTemplate);
    }

    public DeleteWatermarkTemplateResponse deleteWatermarkTemplate(DeleteWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteWatermarkTemplate);
    }

    public ListWatermarkTemplateResponse listWatermarkTemplate(ListWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listWatermarkTemplate);
    }

    public UpdateWatermarkTemplateResponse updateWatermarkTemplate(UpdateWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.updateWatermarkTemplate);
    }

}