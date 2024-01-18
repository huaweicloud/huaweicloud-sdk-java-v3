package com.huaweicloud.sdk.mpc.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.mpc.v1.model.AgenciesTaskReq;
import com.huaweicloud.sdk.mpc.v1.model.BucketAuthorizedReq;
import com.huaweicloud.sdk.mpc.v1.model.CancelRemuxTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CancelRemuxTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateAgenciesTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateAgenciesTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateAnimatedGraphicsTaskReq;
import com.huaweicloud.sdk.mpc.v1.model.CreateAnimatedGraphicsTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateAnimatedGraphicsTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateEditingJobReq;
import com.huaweicloud.sdk.mpc.v1.model.CreateEditingJobRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateEditingJobResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateEncryptReq;
import com.huaweicloud.sdk.mpc.v1.model.CreateEncryptTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateEncryptTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateExtractTaskReq;
import com.huaweicloud.sdk.mpc.v1.model.CreateExtractTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateExtractTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateMbTasksReportRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateMbTasksReportResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateMediaProcessReq;
import com.huaweicloud.sdk.mpc.v1.model.CreateMediaProcessTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateMediaProcessTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateMergeChannelsReq;
import com.huaweicloud.sdk.mpc.v1.model.CreateMergeChannelsTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateMergeChannelsTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateMpeCallBackRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateMpeCallBackResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateQualityEnhanceTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateQualityEnhanceTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateRemuxTaskReq;
import com.huaweicloud.sdk.mpc.v1.model.CreateRemuxTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateRemuxTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateResetTracksReq;
import com.huaweicloud.sdk.mpc.v1.model.CreateResetTracksTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateResetTracksTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateRetryRemuxTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateRetryRemuxTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateTemplateGroupRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateTemplateGroupResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateThumbReq;
import com.huaweicloud.sdk.mpc.v1.model.CreateThumbnailsTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateThumbnailsTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateTransTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateTransTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateTranscodingReq;
import com.huaweicloud.sdk.mpc.v1.model.CreateTranscodingTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateTranscodingTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateWatermarkTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateWatermarkTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteAnimatedGraphicsTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteAnimatedGraphicsTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteEditingJobRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteEditingJobResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteEncryptTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteEncryptTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteExtractTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteExtractTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteMediaProcessTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteMediaProcessTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteMergeChannelsTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteMergeChannelsTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteQualityEnhanceTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteQualityEnhanceTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteRemuxTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteRemuxTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteResetTracksTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteResetTracksTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteTemplateGroupRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteTemplateGroupResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteThumbnailsTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteThumbnailsTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteTranscodingTaskByConsoleRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteTranscodingTaskByConsoleResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteTranscodingTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteTranscodingTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteWatermarkTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteWatermarkTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListAllBucketsRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListAllBucketsResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListAllObsObjListRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListAllObsObjListResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListAnimatedGraphicsTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListAnimatedGraphicsTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListEditingJobRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListEditingJobResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListEncryptTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListEncryptTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListExtractTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListExtractTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListMediaProcessTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListMediaProcessTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListMergeChannelsTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListMergeChannelsTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListNotifyEventRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListNotifyEventResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListNotifySmnTopicConfigRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListNotifySmnTopicConfigResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListQualityEnhanceDefaultTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListQualityEnhanceDefaultTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListRemuxTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListRemuxTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListResetTracksTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListResetTracksTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListStatSummaryRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListStatSummaryResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListTemplateGroupRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListTemplateGroupResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListThumbnailsTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListThumbnailsTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListTranscodeDetailRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListTranscodeDetailResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListTranscodingTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListTranscodingTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListWatermarkTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListWatermarkTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.MbTasksReportReq;
import com.huaweicloud.sdk.mpc.v1.model.ModifyTransTemplateGroup;
import com.huaweicloud.sdk.mpc.v1.model.ModifyTransTemplateReq;
import com.huaweicloud.sdk.mpc.v1.model.MpeCallBackReq;
import com.huaweicloud.sdk.mpc.v1.model.NotificationConfigReq;
import com.huaweicloud.sdk.mpc.v1.model.NotifySmnTopicConfigRequest;
import com.huaweicloud.sdk.mpc.v1.model.NotifySmnTopicConfigResponse;
import com.huaweicloud.sdk.mpc.v1.model.QualityEnhanceTemplate;
import com.huaweicloud.sdk.mpc.v1.model.RemuxRetryReq;
import com.huaweicloud.sdk.mpc.v1.model.ShowAgenciesTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.ShowAgenciesTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.ShowTenantAccessInfoRequest;
import com.huaweicloud.sdk.mpc.v1.model.ShowTenantAccessInfoResponse;
import com.huaweicloud.sdk.mpc.v1.model.TransTemplate;
import com.huaweicloud.sdk.mpc.v1.model.TransTemplateGroup;
import com.huaweicloud.sdk.mpc.v1.model.UpdateBucketAuthorizedRequest;
import com.huaweicloud.sdk.mpc.v1.model.UpdateBucketAuthorizedResponse;
import com.huaweicloud.sdk.mpc.v1.model.UpdateQualityEnhanceTemplateReq;
import com.huaweicloud.sdk.mpc.v1.model.UpdateQualityEnhanceTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.UpdateQualityEnhanceTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.UpdateTemplateGroupRequest;
import com.huaweicloud.sdk.mpc.v1.model.UpdateTemplateGroupResponse;
import com.huaweicloud.sdk.mpc.v1.model.UpdateTenantAccessInfoReq;
import com.huaweicloud.sdk.mpc.v1.model.UpdateTenantAccessInfoRequest;
import com.huaweicloud.sdk.mpc.v1.model.UpdateTenantAccessInfoResponse;
import com.huaweicloud.sdk.mpc.v1.model.UpdateTransTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.UpdateTransTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.UpdateWatermarkTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.UpdateWatermarkTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.WatermarkTemplate;

import java.util.List;

@SuppressWarnings("unchecked")
public class MpcMeta {

    public static final HttpRequestDef<CreateAnimatedGraphicsTaskRequest, CreateAnimatedGraphicsTaskResponse> createAnimatedGraphicsTask =
        genForCreateAnimatedGraphicsTask();

    private static HttpRequestDef<CreateAnimatedGraphicsTaskRequest, CreateAnimatedGraphicsTaskResponse> genForCreateAnimatedGraphicsTask() {
        // basic
        HttpRequestDef.Builder<CreateAnimatedGraphicsTaskRequest, CreateAnimatedGraphicsTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateAnimatedGraphicsTaskRequest.class,
                    CreateAnimatedGraphicsTaskResponse.class)
                .withName("CreateAnimatedGraphicsTask")
                .withUri("/v1/{project_id}/animated-graphics")
                .withContentType("application/json");

        // requests
        builder.<CreateAnimatedGraphicsTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAnimatedGraphicsTaskReq.class),
            f -> f.withMarshaller(CreateAnimatedGraphicsTaskRequest::getBody,
                CreateAnimatedGraphicsTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAnimatedGraphicsTaskRequest, DeleteAnimatedGraphicsTaskResponse> deleteAnimatedGraphicsTask =
        genForDeleteAnimatedGraphicsTask();

    private static HttpRequestDef<DeleteAnimatedGraphicsTaskRequest, DeleteAnimatedGraphicsTaskResponse> genForDeleteAnimatedGraphicsTask() {
        // basic
        HttpRequestDef.Builder<DeleteAnimatedGraphicsTaskRequest, DeleteAnimatedGraphicsTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteAnimatedGraphicsTaskRequest.class,
                    DeleteAnimatedGraphicsTaskResponse.class)
                .withName("DeleteAnimatedGraphicsTask")
                .withUri("/v1/{project_id}/animated-graphics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAnimatedGraphicsTaskRequest::getTaskId,
                DeleteAnimatedGraphicsTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAnimatedGraphicsTaskRequest, ListAnimatedGraphicsTaskResponse> listAnimatedGraphicsTask =
        genForListAnimatedGraphicsTask();

    private static HttpRequestDef<ListAnimatedGraphicsTaskRequest, ListAnimatedGraphicsTaskResponse> genForListAnimatedGraphicsTask() {
        // basic
        HttpRequestDef.Builder<ListAnimatedGraphicsTaskRequest, ListAnimatedGraphicsTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListAnimatedGraphicsTaskRequest.class, ListAnimatedGraphicsTaskResponse.class)
                .withName("ListAnimatedGraphicsTask")
                .withUri("/v1/{project_id}/animated-graphics")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAnimatedGraphicsTaskRequest::getTaskId,
                ListAnimatedGraphicsTaskRequest::setTaskId));
        builder.<ListAnimatedGraphicsTaskRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAnimatedGraphicsTaskRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAnimatedGraphicsTaskRequest::getStatus,
                ListAnimatedGraphicsTaskRequest::setStatus));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAnimatedGraphicsTaskRequest::getStartTime,
                ListAnimatedGraphicsTaskRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAnimatedGraphicsTaskRequest::getEndTime,
                ListAnimatedGraphicsTaskRequest::setEndTime));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAnimatedGraphicsTaskRequest::getPage, ListAnimatedGraphicsTaskRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAnimatedGraphicsTaskRequest::getSize, ListAnimatedGraphicsTaskRequest::setSize));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAnimatedGraphicsTaskRequest::getXLanguage,
                ListAnimatedGraphicsTaskRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAgenciesTaskRequest, CreateAgenciesTaskResponse> createAgenciesTask =
        genForCreateAgenciesTask();

    private static HttpRequestDef<CreateAgenciesTaskRequest, CreateAgenciesTaskResponse> genForCreateAgenciesTask() {
        // basic
        HttpRequestDef.Builder<CreateAgenciesTaskRequest, CreateAgenciesTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAgenciesTaskRequest.class, CreateAgenciesTaskResponse.class)
                .withName("CreateAgenciesTask")
                .withUri("/v1/{project_id}/agencies")
                .withContentType("application/json");

        // requests
        builder.<AgenciesTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AgenciesTaskReq.class),
            f -> f.withMarshaller(CreateAgenciesTaskRequest::getBody, CreateAgenciesTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllBucketsRequest, ListAllBucketsResponse> listAllBuckets =
        genForListAllBuckets();

    private static HttpRequestDef<ListAllBucketsRequest, ListAllBucketsResponse> genForListAllBuckets() {
        // basic
        HttpRequestDef.Builder<ListAllBucketsRequest, ListAllBucketsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllBucketsRequest.class, ListAllBucketsResponse.class)
                .withName("ListAllBuckets")
                .withUri("/v1/{project_id}/buckets")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllObsObjListRequest, ListAllObsObjListResponse> listAllObsObjList =
        genForListAllObsObjList();

    private static HttpRequestDef<ListAllObsObjListRequest, ListAllObsObjListResponse> genForListAllObsObjList() {
        // basic
        HttpRequestDef.Builder<ListAllObsObjListRequest, ListAllObsObjListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllObsObjListRequest.class, ListAllObsObjListResponse.class)
                .withName("ListAllObsObjList")
                .withUri("/v1.0-ext/{project_id}/objects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bucket",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllObsObjListRequest::getBucket, ListAllObsObjListRequest::setBucket));
        builder.<String>withRequestField("prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllObsObjListRequest::getPrefix, ListAllObsObjListRequest::setPrefix));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllObsObjListRequest::getType, ListAllObsObjListRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotifyEventRequest, ListNotifyEventResponse> listNotifyEvent =
        genForListNotifyEvent();

    private static HttpRequestDef<ListNotifyEventRequest, ListNotifyEventResponse> genForListNotifyEvent() {
        // basic
        HttpRequestDef.Builder<ListNotifyEventRequest, ListNotifyEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNotifyEventRequest.class, ListNotifyEventResponse.class)
                .withName("ListNotifyEvent")
                .withUri("/v1/{project_id}/notification/event")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotifySmnTopicConfigRequest, ListNotifySmnTopicConfigResponse> listNotifySmnTopicConfig =
        genForListNotifySmnTopicConfig();

    private static HttpRequestDef<ListNotifySmnTopicConfigRequest, ListNotifySmnTopicConfigResponse> genForListNotifySmnTopicConfig() {
        // basic
        HttpRequestDef.Builder<ListNotifySmnTopicConfigRequest, ListNotifySmnTopicConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListNotifySmnTopicConfigRequest.class, ListNotifySmnTopicConfigResponse.class)
                .withName("ListNotifySmnTopicConfig")
                .withUri("/v1/{project_id}/notification")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NotifySmnTopicConfigRequest, NotifySmnTopicConfigResponse> notifySmnTopicConfig =
        genForNotifySmnTopicConfig();

    private static HttpRequestDef<NotifySmnTopicConfigRequest, NotifySmnTopicConfigResponse> genForNotifySmnTopicConfig() {
        // basic
        HttpRequestDef.Builder<NotifySmnTopicConfigRequest, NotifySmnTopicConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, NotifySmnTopicConfigRequest.class, NotifySmnTopicConfigResponse.class)
            .withName("NotifySmnTopicConfig")
            .withUri("/v1/{project_id}/notification")
            .withContentType("application/json");

        // requests
        builder.<NotificationConfigReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(NotificationConfigReq.class),
            f -> f.withMarshaller(NotifySmnTopicConfigRequest::getBody, NotifySmnTopicConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAgenciesTaskRequest, ShowAgenciesTaskResponse> showAgenciesTask =
        genForShowAgenciesTask();

    private static HttpRequestDef<ShowAgenciesTaskRequest, ShowAgenciesTaskResponse> genForShowAgenciesTask() {
        // basic
        HttpRequestDef.Builder<ShowAgenciesTaskRequest, ShowAgenciesTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAgenciesTaskRequest.class, ShowAgenciesTaskResponse.class)
                .withName("ShowAgenciesTask")
                .withUri("/v1/{project_id}/agencies")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> updateBucketAuthorized =
        genForUpdateBucketAuthorized();

    private static HttpRequestDef<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> genForUpdateBucketAuthorized() {
        // basic
        HttpRequestDef.Builder<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateBucketAuthorizedRequest.class, UpdateBucketAuthorizedResponse.class)
            .withName("UpdateBucketAuthorized")
            .withUri("/v1/{project_id}/authority")
            .withContentType("application/json");

        // requests
        builder.<BucketAuthorizedReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BucketAuthorizedReq.class),
            f -> f.withMarshaller(UpdateBucketAuthorizedRequest::getBody, UpdateBucketAuthorizedRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEditingJobRequest, CreateEditingJobResponse> createEditingJob =
        genForCreateEditingJob();

    private static HttpRequestDef<CreateEditingJobRequest, CreateEditingJobResponse> genForCreateEditingJob() {
        // basic
        HttpRequestDef.Builder<CreateEditingJobRequest, CreateEditingJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEditingJobRequest.class, CreateEditingJobResponse.class)
                .withName("CreateEditingJob")
                .withUri("/v1/{project_id}/editing/jobs")
                .withContentType("application/json");

        // requests
        builder.<CreateEditingJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEditingJobReq.class),
            f -> f.withMarshaller(CreateEditingJobRequest::getBody, CreateEditingJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEditingJobRequest, DeleteEditingJobResponse> deleteEditingJob =
        genForDeleteEditingJob();

    private static HttpRequestDef<DeleteEditingJobRequest, DeleteEditingJobResponse> genForDeleteEditingJob() {
        // basic
        HttpRequestDef.Builder<DeleteEditingJobRequest, DeleteEditingJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEditingJobRequest.class, DeleteEditingJobResponse.class)
                .withName("DeleteEditingJob")
                .withUri("/v1/{project_id}/editing/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEditingJobRequest::getJobId, DeleteEditingJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEditingJobRequest, ListEditingJobResponse> listEditingJob =
        genForListEditingJob();

    private static HttpRequestDef<ListEditingJobRequest, ListEditingJobResponse> genForListEditingJob() {
        // basic
        HttpRequestDef.Builder<ListEditingJobRequest, ListEditingJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEditingJobRequest.class, ListEditingJobResponse.class)
                .withName("ListEditingJob")
                .withUri("/v1/{project_id}/editing/jobs")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEditingJobRequest::getJobId, ListEditingJobRequest::setJobId));
        builder.<ListEditingJobRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEditingJobRequest.StatusEnum.class),
            f -> f.withMarshaller(ListEditingJobRequest::getStatus, ListEditingJobRequest::setStatus));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEditingJobRequest::getStartTime, ListEditingJobRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEditingJobRequest::getEndTime, ListEditingJobRequest::setEndTime));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEditingJobRequest::getPage, ListEditingJobRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEditingJobRequest::getSize, ListEditingJobRequest::setSize));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEditingJobRequest::getXLanguage, ListEditingJobRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEncryptTaskRequest, CreateEncryptTaskResponse> createEncryptTask =
        genForCreateEncryptTask();

    private static HttpRequestDef<CreateEncryptTaskRequest, CreateEncryptTaskResponse> genForCreateEncryptTask() {
        // basic
        HttpRequestDef.Builder<CreateEncryptTaskRequest, CreateEncryptTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEncryptTaskRequest.class, CreateEncryptTaskResponse.class)
                .withName("CreateEncryptTask")
                .withUri("/v1/{project_id}/encryptions")
                .withContentType("application/json");

        // requests
        builder.<CreateEncryptReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEncryptReq.class),
            f -> f.withMarshaller(CreateEncryptTaskRequest::getBody, CreateEncryptTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEncryptTaskRequest, DeleteEncryptTaskResponse> deleteEncryptTask =
        genForDeleteEncryptTask();

    private static HttpRequestDef<DeleteEncryptTaskRequest, DeleteEncryptTaskResponse> genForDeleteEncryptTask() {
        // basic
        HttpRequestDef.Builder<DeleteEncryptTaskRequest, DeleteEncryptTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEncryptTaskRequest.class, DeleteEncryptTaskResponse.class)
                .withName("DeleteEncryptTask")
                .withUri("/v1/{project_id}/encryptions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEncryptTaskRequest::getTaskId, DeleteEncryptTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEncryptTaskRequest, ListEncryptTaskResponse> listEncryptTask =
        genForListEncryptTask();

    private static HttpRequestDef<ListEncryptTaskRequest, ListEncryptTaskResponse> genForListEncryptTask() {
        // basic
        HttpRequestDef.Builder<ListEncryptTaskRequest, ListEncryptTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEncryptTaskRequest.class, ListEncryptTaskResponse.class)
                .withName("ListEncryptTask")
                .withUri("/v1/{project_id}/encryptions")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEncryptTaskRequest::getTaskId, ListEncryptTaskRequest::setTaskId));
        builder.<ListEncryptTaskRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEncryptTaskRequest.StatusEnum.class),
            f -> f.withMarshaller(ListEncryptTaskRequest::getStatus, ListEncryptTaskRequest::setStatus));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEncryptTaskRequest::getStartTime, ListEncryptTaskRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEncryptTaskRequest::getEndTime, ListEncryptTaskRequest::setEndTime));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEncryptTaskRequest::getPage, ListEncryptTaskRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEncryptTaskRequest::getSize, ListEncryptTaskRequest::setSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateExtractTaskRequest, CreateExtractTaskResponse> createExtractTask =
        genForCreateExtractTask();

    private static HttpRequestDef<CreateExtractTaskRequest, CreateExtractTaskResponse> genForCreateExtractTask() {
        // basic
        HttpRequestDef.Builder<CreateExtractTaskRequest, CreateExtractTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateExtractTaskRequest.class, CreateExtractTaskResponse.class)
                .withName("CreateExtractTask")
                .withUri("/v1/{project_id}/extract-metadata")
                .withContentType("application/json");

        // requests
        builder.<CreateExtractTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateExtractTaskReq.class),
            f -> f.withMarshaller(CreateExtractTaskRequest::getBody, CreateExtractTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteExtractTaskRequest, DeleteExtractTaskResponse> deleteExtractTask =
        genForDeleteExtractTask();

    private static HttpRequestDef<DeleteExtractTaskRequest, DeleteExtractTaskResponse> genForDeleteExtractTask() {
        // basic
        HttpRequestDef.Builder<DeleteExtractTaskRequest, DeleteExtractTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteExtractTaskRequest.class, DeleteExtractTaskResponse.class)
                .withName("DeleteExtractTask")
                .withUri("/v1/{project_id}/extract-metadata")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExtractTaskRequest::getTaskId, DeleteExtractTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListExtractTaskRequest, ListExtractTaskResponse> listExtractTask =
        genForListExtractTask();

    private static HttpRequestDef<ListExtractTaskRequest, ListExtractTaskResponse> genForListExtractTask() {
        // basic
        HttpRequestDef.Builder<ListExtractTaskRequest, ListExtractTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListExtractTaskRequest.class, ListExtractTaskResponse.class)
                .withName("ListExtractTask")
                .withUri("/v1/{project_id}/extract-metadata")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListExtractTaskRequest::getTaskId, ListExtractTaskRequest::setTaskId));
        builder.<ListExtractTaskRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListExtractTaskRequest.StatusEnum.class),
            f -> f.withMarshaller(ListExtractTaskRequest::getStatus, ListExtractTaskRequest::setStatus));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExtractTaskRequest::getStartTime, ListExtractTaskRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExtractTaskRequest::getEndTime, ListExtractTaskRequest::setEndTime));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListExtractTaskRequest::getPage, ListExtractTaskRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListExtractTaskRequest::getSize, ListExtractTaskRequest::setSize));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExtractTaskRequest::getXLanguage, ListExtractTaskRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMbTasksReportRequest, CreateMbTasksReportResponse> createMbTasksReport =
        genForCreateMbTasksReport();

    private static HttpRequestDef<CreateMbTasksReportRequest, CreateMbTasksReportResponse> genForCreateMbTasksReport() {
        // basic
        HttpRequestDef.Builder<CreateMbTasksReportRequest, CreateMbTasksReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CreateMbTasksReportRequest.class, CreateMbTasksReportResponse.class)
                .withName("CreateMbTasksReport")
                .withUri("/v1/mediabox/tasks/report")
                .withContentType("application/json");

        // requests
        builder.<MbTasksReportReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MbTasksReportReq.class),
            f -> f.withMarshaller(CreateMbTasksReportRequest::getBody, CreateMbTasksReportRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMergeChannelsTaskRequest, CreateMergeChannelsTaskResponse> createMergeChannelsTask =
        genForCreateMergeChannelsTask();

    private static HttpRequestDef<CreateMergeChannelsTaskRequest, CreateMergeChannelsTaskResponse> genForCreateMergeChannelsTask() {
        // basic
        HttpRequestDef.Builder<CreateMergeChannelsTaskRequest, CreateMergeChannelsTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateMergeChannelsTaskRequest.class, CreateMergeChannelsTaskResponse.class)
            .withName("CreateMergeChannelsTask")
            .withUri("/v1/{project_id}/audio/services/merge_channels/task")
            .withContentType("application/json");

        // requests
        builder.<CreateMergeChannelsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMergeChannelsReq.class),
            f -> f.withMarshaller(CreateMergeChannelsTaskRequest::getBody, CreateMergeChannelsTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResetTracksTaskRequest, CreateResetTracksTaskResponse> createResetTracksTask =
        genForCreateResetTracksTask();

    private static HttpRequestDef<CreateResetTracksTaskRequest, CreateResetTracksTaskResponse> genForCreateResetTracksTask() {
        // basic
        HttpRequestDef.Builder<CreateResetTracksTaskRequest, CreateResetTracksTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateResetTracksTaskRequest.class, CreateResetTracksTaskResponse.class)
            .withName("CreateResetTracksTask")
            .withUri("/v1/{project_id}/audio/services/reset_tracks/task")
            .withContentType("application/json");

        // requests
        builder.<CreateResetTracksReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResetTracksReq.class),
            f -> f.withMarshaller(CreateResetTracksTaskRequest::getBody, CreateResetTracksTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMergeChannelsTaskRequest, DeleteMergeChannelsTaskResponse> deleteMergeChannelsTask =
        genForDeleteMergeChannelsTask();

    private static HttpRequestDef<DeleteMergeChannelsTaskRequest, DeleteMergeChannelsTaskResponse> genForDeleteMergeChannelsTask() {
        // basic
        HttpRequestDef.Builder<DeleteMergeChannelsTaskRequest, DeleteMergeChannelsTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteMergeChannelsTaskRequest.class, DeleteMergeChannelsTaskResponse.class)
            .withName("DeleteMergeChannelsTask")
            .withUri("/v1/{project_id}/audio/services/merge_channels/task")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMergeChannelsTaskRequest::getTaskId,
                DeleteMergeChannelsTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResetTracksTaskRequest, DeleteResetTracksTaskResponse> deleteResetTracksTask =
        genForDeleteResetTracksTask();

    private static HttpRequestDef<DeleteResetTracksTaskRequest, DeleteResetTracksTaskResponse> genForDeleteResetTracksTask() {
        // basic
        HttpRequestDef.Builder<DeleteResetTracksTaskRequest, DeleteResetTracksTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteResetTracksTaskRequest.class, DeleteResetTracksTaskResponse.class)
            .withName("DeleteResetTracksTask")
            .withUri("/v1/{project_id}/audio/services/reset_tracks/task")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResetTracksTaskRequest::getTaskId, DeleteResetTracksTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMergeChannelsTaskRequest, ListMergeChannelsTaskResponse> listMergeChannelsTask =
        genForListMergeChannelsTask();

    private static HttpRequestDef<ListMergeChannelsTaskRequest, ListMergeChannelsTaskResponse> genForListMergeChannelsTask() {
        // basic
        HttpRequestDef.Builder<ListMergeChannelsTaskRequest, ListMergeChannelsTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMergeChannelsTaskRequest.class, ListMergeChannelsTaskResponse.class)
            .withName("ListMergeChannelsTask")
            .withUri("/v1/{project_id}/audio/services/merge_channels/task")
            .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMergeChannelsTaskRequest::getTaskId, ListMergeChannelsTaskRequest::setTaskId));
        builder.<ListMergeChannelsTaskRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMergeChannelsTaskRequest.StatusEnum.class),
            f -> f.withMarshaller(ListMergeChannelsTaskRequest::getStatus, ListMergeChannelsTaskRequest::setStatus));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeChannelsTaskRequest::getStartTime,
                ListMergeChannelsTaskRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeChannelsTaskRequest::getEndTime, ListMergeChannelsTaskRequest::setEndTime));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeChannelsTaskRequest::getPage, ListMergeChannelsTaskRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeChannelsTaskRequest::getSize, ListMergeChannelsTaskRequest::setSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResetTracksTaskRequest, ListResetTracksTaskResponse> listResetTracksTask =
        genForListResetTracksTask();

    private static HttpRequestDef<ListResetTracksTaskRequest, ListResetTracksTaskResponse> genForListResetTracksTask() {
        // basic
        HttpRequestDef.Builder<ListResetTracksTaskRequest, ListResetTracksTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResetTracksTaskRequest.class, ListResetTracksTaskResponse.class)
                .withName("ListResetTracksTask")
                .withUri("/v1/{project_id}/audio/services/reset_tracks/task")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListResetTracksTaskRequest::getTaskId, ListResetTracksTaskRequest::setTaskId));
        builder.<ListResetTracksTaskRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResetTracksTaskRequest.StatusEnum.class),
            f -> f.withMarshaller(ListResetTracksTaskRequest::getStatus, ListResetTracksTaskRequest::setStatus));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResetTracksTaskRequest::getStartTime, ListResetTracksTaskRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResetTracksTaskRequest::getEndTime, ListResetTracksTaskRequest::setEndTime));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResetTracksTaskRequest::getPage, ListResetTracksTaskRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResetTracksTaskRequest::getSize, ListResetTracksTaskRequest::setSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMediaProcessTaskRequest, CreateMediaProcessTaskResponse> createMediaProcessTask =
        genForCreateMediaProcessTask();

    private static HttpRequestDef<CreateMediaProcessTaskRequest, CreateMediaProcessTaskResponse> genForCreateMediaProcessTask() {
        // basic
        HttpRequestDef.Builder<CreateMediaProcessTaskRequest, CreateMediaProcessTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateMediaProcessTaskRequest.class, CreateMediaProcessTaskResponse.class)
            .withName("CreateMediaProcessTask")
            .withUri("/v1/{project_id}/enhancements")
            .withContentType("application/json");

        // requests
        builder.<CreateMediaProcessReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMediaProcessReq.class),
            f -> f.withMarshaller(CreateMediaProcessTaskRequest::getBody, CreateMediaProcessTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMediaProcessTaskRequest, DeleteMediaProcessTaskResponse> deleteMediaProcessTask =
        genForDeleteMediaProcessTask();

    private static HttpRequestDef<DeleteMediaProcessTaskRequest, DeleteMediaProcessTaskResponse> genForDeleteMediaProcessTask() {
        // basic
        HttpRequestDef.Builder<DeleteMediaProcessTaskRequest, DeleteMediaProcessTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteMediaProcessTaskRequest.class, DeleteMediaProcessTaskResponse.class)
            .withName("DeleteMediaProcessTask")
            .withUri("/v1/{project_id}/enhancements")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMediaProcessTaskRequest::getTaskId, DeleteMediaProcessTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMediaProcessTaskRequest, ListMediaProcessTaskResponse> listMediaProcessTask =
        genForListMediaProcessTask();

    private static HttpRequestDef<ListMediaProcessTaskRequest, ListMediaProcessTaskResponse> genForListMediaProcessTask() {
        // basic
        HttpRequestDef.Builder<ListMediaProcessTaskRequest, ListMediaProcessTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMediaProcessTaskRequest.class, ListMediaProcessTaskResponse.class)
            .withName("ListMediaProcessTask")
            .withUri("/v1/{project_id}/enhancements")
            .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMediaProcessTaskRequest::getTaskId, ListMediaProcessTaskRequest::setTaskId));
        builder.<ListMediaProcessTaskRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMediaProcessTaskRequest.StatusEnum.class),
            f -> f.withMarshaller(ListMediaProcessTaskRequest::getStatus, ListMediaProcessTaskRequest::setStatus));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMediaProcessTaskRequest::getStartTime,
                ListMediaProcessTaskRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMediaProcessTaskRequest::getEndTime, ListMediaProcessTaskRequest::setEndTime));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMediaProcessTaskRequest::getPage, ListMediaProcessTaskRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMediaProcessTaskRequest::getSize, ListMediaProcessTaskRequest::setSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMpeCallBackRequest, CreateMpeCallBackResponse> createMpeCallBack =
        genForCreateMpeCallBack();

    private static HttpRequestDef<CreateMpeCallBackRequest, CreateMpeCallBackResponse> genForCreateMpeCallBack() {
        // basic
        HttpRequestDef.Builder<CreateMpeCallBackRequest, CreateMpeCallBackResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMpeCallBackRequest.class, CreateMpeCallBackResponse.class)
                .withName("CreateMpeCallBack")
                .withUri("/v1/mpe/notification")
                .withContentType("application/json");

        // requests
        builder.<MpeCallBackReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MpeCallBackReq.class),
            f -> f.withMarshaller(CreateMpeCallBackRequest::getBody, CreateMpeCallBackRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateQualityEnhanceTemplateRequest, CreateQualityEnhanceTemplateResponse> createQualityEnhanceTemplate =
        genForCreateQualityEnhanceTemplate();

    private static HttpRequestDef<CreateQualityEnhanceTemplateRequest, CreateQualityEnhanceTemplateResponse> genForCreateQualityEnhanceTemplate() {
        // basic
        HttpRequestDef.Builder<CreateQualityEnhanceTemplateRequest, CreateQualityEnhanceTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateQualityEnhanceTemplateRequest.class,
                    CreateQualityEnhanceTemplateResponse.class)
                .withName("CreateQualityEnhanceTemplate")
                .withUri("/v1/{project_id}/template/qualityenhance")
                .withContentType("application/json");

        // requests
        builder.<QualityEnhanceTemplate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(QualityEnhanceTemplate.class),
            f -> f.withMarshaller(CreateQualityEnhanceTemplateRequest::getBody,
                CreateQualityEnhanceTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteQualityEnhanceTemplateRequest, DeleteQualityEnhanceTemplateResponse> deleteQualityEnhanceTemplate =
        genForDeleteQualityEnhanceTemplate();

    private static HttpRequestDef<DeleteQualityEnhanceTemplateRequest, DeleteQualityEnhanceTemplateResponse> genForDeleteQualityEnhanceTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteQualityEnhanceTemplateRequest, DeleteQualityEnhanceTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteQualityEnhanceTemplateRequest.class,
                    DeleteQualityEnhanceTemplateResponse.class)
                .withName("DeleteQualityEnhanceTemplate")
                .withUri("/v1/{project_id}/template/qualityenhance")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteQualityEnhanceTemplateRequest::getTemplateId,
                DeleteQualityEnhanceTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQualityEnhanceDefaultTemplateRequest, ListQualityEnhanceDefaultTemplateResponse> listQualityEnhanceDefaultTemplate =
        genForListQualityEnhanceDefaultTemplate();

    private static HttpRequestDef<ListQualityEnhanceDefaultTemplateRequest, ListQualityEnhanceDefaultTemplateResponse> genForListQualityEnhanceDefaultTemplate() {
        // basic
        HttpRequestDef.Builder<ListQualityEnhanceDefaultTemplateRequest, ListQualityEnhanceDefaultTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListQualityEnhanceDefaultTemplateRequest.class,
                    ListQualityEnhanceDefaultTemplateResponse.class)
                .withName("ListQualityEnhanceDefaultTemplate")
                .withUri("/v1/{project_id}/template/qualityenhance/default")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateQualityEnhanceTemplateRequest, UpdateQualityEnhanceTemplateResponse> updateQualityEnhanceTemplate =
        genForUpdateQualityEnhanceTemplate();

    private static HttpRequestDef<UpdateQualityEnhanceTemplateRequest, UpdateQualityEnhanceTemplateResponse> genForUpdateQualityEnhanceTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateQualityEnhanceTemplateRequest, UpdateQualityEnhanceTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateQualityEnhanceTemplateRequest.class,
                    UpdateQualityEnhanceTemplateResponse.class)
                .withName("UpdateQualityEnhanceTemplate")
                .withUri("/v1/{project_id}/template/qualityenhance")
                .withContentType("application/json");

        // requests
        builder.<UpdateQualityEnhanceTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateQualityEnhanceTemplateReq.class),
            f -> f.withMarshaller(UpdateQualityEnhanceTemplateRequest::getBody,
                UpdateQualityEnhanceTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTranscodeDetailRequest, ListTranscodeDetailResponse> listTranscodeDetail =
        genForListTranscodeDetail();

    private static HttpRequestDef<ListTranscodeDetailRequest, ListTranscodeDetailResponse> genForListTranscodeDetail() {
        // basic
        HttpRequestDef.Builder<ListTranscodeDetailRequest, ListTranscodeDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTranscodeDetailRequest.class, ListTranscodeDetailResponse.class)
                .withName("ListTranscodeDetail")
                .withUri("/v1/{project_id}/transcodings/detail")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTranscodeDetailRequest::getTaskId, ListTranscodeDetailRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelRemuxTaskRequest, CancelRemuxTaskResponse> cancelRemuxTask =
        genForCancelRemuxTask();

    private static HttpRequestDef<CancelRemuxTaskRequest, CancelRemuxTaskResponse> genForCancelRemuxTask() {
        // basic
        HttpRequestDef.Builder<CancelRemuxTaskRequest, CancelRemuxTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelRemuxTaskRequest.class, CancelRemuxTaskResponse.class)
                .withName("CancelRemuxTask")
                .withUri("/v1/{project_id}/remux")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelRemuxTaskRequest::getTaskId, CancelRemuxTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRemuxTaskRequest, CreateRemuxTaskResponse> createRemuxTask =
        genForCreateRemuxTask();

    private static HttpRequestDef<CreateRemuxTaskRequest, CreateRemuxTaskResponse> genForCreateRemuxTask() {
        // basic
        HttpRequestDef.Builder<CreateRemuxTaskRequest, CreateRemuxTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRemuxTaskRequest.class, CreateRemuxTaskResponse.class)
                .withName("CreateRemuxTask")
                .withUri("/v1/{project_id}/remux")
                .withContentType("application/json");

        // requests
        builder.<CreateRemuxTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRemuxTaskReq.class),
            f -> f.withMarshaller(CreateRemuxTaskRequest::getBody, CreateRemuxTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRetryRemuxTaskRequest, CreateRetryRemuxTaskResponse> createRetryRemuxTask =
        genForCreateRetryRemuxTask();

    private static HttpRequestDef<CreateRetryRemuxTaskRequest, CreateRetryRemuxTaskResponse> genForCreateRetryRemuxTask() {
        // basic
        HttpRequestDef.Builder<CreateRetryRemuxTaskRequest, CreateRetryRemuxTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, CreateRetryRemuxTaskRequest.class, CreateRetryRemuxTaskResponse.class)
            .withName("CreateRetryRemuxTask")
            .withUri("/v1/{project_id}/remux")
            .withContentType("application/json");

        // requests
        builder.<RemuxRetryReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemuxRetryReq.class),
            f -> f.withMarshaller(CreateRetryRemuxTaskRequest::getBody, CreateRetryRemuxTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRemuxTaskRequest, DeleteRemuxTaskResponse> deleteRemuxTask =
        genForDeleteRemuxTask();

    private static HttpRequestDef<DeleteRemuxTaskRequest, DeleteRemuxTaskResponse> genForDeleteRemuxTask() {
        // basic
        HttpRequestDef.Builder<DeleteRemuxTaskRequest, DeleteRemuxTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRemuxTaskRequest.class, DeleteRemuxTaskResponse.class)
                .withName("DeleteRemuxTask")
                .withUri("/v1/{project_id}/remux/task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRemuxTaskRequest::getTaskId, DeleteRemuxTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRemuxTaskRequest, ListRemuxTaskResponse> listRemuxTask =
        genForListRemuxTask();

    private static HttpRequestDef<ListRemuxTaskRequest, ListRemuxTaskResponse> genForListRemuxTask() {
        // basic
        HttpRequestDef.Builder<ListRemuxTaskRequest, ListRemuxTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRemuxTaskRequest.class, ListRemuxTaskResponse.class)
                .withName("ListRemuxTask")
                .withUri("/v1/{project_id}/remux")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRemuxTaskRequest::getTaskId, ListRemuxTaskRequest::setTaskId));
        builder.<ListRemuxTaskRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRemuxTaskRequest.StatusEnum.class),
            f -> f.withMarshaller(ListRemuxTaskRequest::getStatus, ListRemuxTaskRequest::setStatus));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRemuxTaskRequest::getStartTime, ListRemuxTaskRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRemuxTaskRequest::getEndTime, ListRemuxTaskRequest::setEndTime));
        builder.<String>withRequestField("input_bucket",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRemuxTaskRequest::getInputBucket, ListRemuxTaskRequest::setInputBucket));
        builder.<String>withRequestField("input_object",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRemuxTaskRequest::getInputObject, ListRemuxTaskRequest::setInputObject));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRemuxTaskRequest::getPage, ListRemuxTaskRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRemuxTaskRequest::getSize, ListRemuxTaskRequest::setSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateGroupRequest, CreateTemplateGroupResponse> createTemplateGroup =
        genForCreateTemplateGroup();

    private static HttpRequestDef<CreateTemplateGroupRequest, CreateTemplateGroupResponse> genForCreateTemplateGroup() {
        // basic
        HttpRequestDef.Builder<CreateTemplateGroupRequest, CreateTemplateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemplateGroupRequest.class, CreateTemplateGroupResponse.class)
                .withName("CreateTemplateGroup")
                .withUri("/v1/{project_id}/template_group/transcodings")
                .withContentType("application/json");

        // requests
        builder.<TransTemplateGroup>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TransTemplateGroup.class),
            f -> f.withMarshaller(CreateTemplateGroupRequest::getBody, CreateTemplateGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> deleteTemplateGroup =
        genForDeleteTemplateGroup();

    private static HttpRequestDef<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> genForDeleteTemplateGroup() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteTemplateGroupRequest.class, DeleteTemplateGroupResponse.class)
            .withName("DeleteTemplateGroup")
            .withUri("/v1/{project_id}/template_group/transcodings")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateGroupRequest::getGroupId, DeleteTemplateGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateGroupRequest, ListTemplateGroupResponse> listTemplateGroup =
        genForListTemplateGroup();

    private static HttpRequestDef<ListTemplateGroupRequest, ListTemplateGroupResponse> genForListTemplateGroup() {
        // basic
        HttpRequestDef.Builder<ListTemplateGroupRequest, ListTemplateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplateGroupRequest.class, ListTemplateGroupResponse.class)
                .withName("ListTemplateGroup")
                .withUri("/v1/{project_id}/template_group/transcodings")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTemplateGroupRequest::getGroupId, ListTemplateGroupRequest::setGroupId));
        builder.<List<String>>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTemplateGroupRequest::getGroupName, ListTemplateGroupRequest::setGroupName));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateGroupRequest::getPage, ListTemplateGroupRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateGroupRequest::getSize, ListTemplateGroupRequest::setSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> updateTemplateGroup =
        genForUpdateTemplateGroup();

    private static HttpRequestDef<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> genForUpdateTemplateGroup() {
        // basic
        HttpRequestDef.Builder<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTemplateGroupRequest.class, UpdateTemplateGroupResponse.class)
                .withName("UpdateTemplateGroup")
                .withUri("/v1/{project_id}/template_group/transcodings")
                .withContentType("application/json");

        // requests
        builder.<ModifyTransTemplateGroup>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyTransTemplateGroup.class),
            f -> f.withMarshaller(UpdateTemplateGroupRequest::getBody, UpdateTemplateGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTenantAccessInfoRequest, ShowTenantAccessInfoResponse> showTenantAccessInfo =
        genForShowTenantAccessInfo();

    private static HttpRequestDef<ShowTenantAccessInfoRequest, ShowTenantAccessInfoResponse> genForShowTenantAccessInfo() {
        // basic
        HttpRequestDef.Builder<ShowTenantAccessInfoRequest, ShowTenantAccessInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTenantAccessInfoRequest.class, ShowTenantAccessInfoResponse.class)
            .withName("ShowTenantAccessInfo")
            .withUri("/v1/{project_id}/tenant/access")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTenantAccessInfoRequest::getXLanguage,
                ShowTenantAccessInfoRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTenantAccessInfoRequest, UpdateTenantAccessInfoResponse> updateTenantAccessInfo =
        genForUpdateTenantAccessInfo();

    private static HttpRequestDef<UpdateTenantAccessInfoRequest, UpdateTenantAccessInfoResponse> genForUpdateTenantAccessInfo() {
        // basic
        HttpRequestDef.Builder<UpdateTenantAccessInfoRequest, UpdateTenantAccessInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateTenantAccessInfoRequest.class, UpdateTenantAccessInfoResponse.class)
            .withName("UpdateTenantAccessInfo")
            .withUri("/v1/{project_id}/tenant/access")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTenantAccessInfoRequest::getXLanguage,
                UpdateTenantAccessInfoRequest::setXLanguage));
        builder.<UpdateTenantAccessInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateTenantAccessInfoReq.class),
            f -> f.withMarshaller(UpdateTenantAccessInfoRequest::getBody, UpdateTenantAccessInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateThumbnailsTaskRequest, CreateThumbnailsTaskResponse> createThumbnailsTask =
        genForCreateThumbnailsTask();

    private static HttpRequestDef<CreateThumbnailsTaskRequest, CreateThumbnailsTaskResponse> genForCreateThumbnailsTask() {
        // basic
        HttpRequestDef.Builder<CreateThumbnailsTaskRequest, CreateThumbnailsTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateThumbnailsTaskRequest.class, CreateThumbnailsTaskResponse.class)
            .withName("CreateThumbnailsTask")
            .withUri("/v1/{project_id}/thumbnails")
            .withContentType("application/json");

        // requests
        builder.<CreateThumbReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateThumbReq.class),
            f -> f.withMarshaller(CreateThumbnailsTaskRequest::getBody, CreateThumbnailsTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteThumbnailsTaskRequest, DeleteThumbnailsTaskResponse> deleteThumbnailsTask =
        genForDeleteThumbnailsTask();

    private static HttpRequestDef<DeleteThumbnailsTaskRequest, DeleteThumbnailsTaskResponse> genForDeleteThumbnailsTask() {
        // basic
        HttpRequestDef.Builder<DeleteThumbnailsTaskRequest, DeleteThumbnailsTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteThumbnailsTaskRequest.class, DeleteThumbnailsTaskResponse.class)
            .withName("DeleteThumbnailsTask")
            .withUri("/v1/{project_id}/thumbnails")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteThumbnailsTaskRequest::getTaskId, DeleteThumbnailsTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListThumbnailsTaskRequest, ListThumbnailsTaskResponse> listThumbnailsTask =
        genForListThumbnailsTask();

    private static HttpRequestDef<ListThumbnailsTaskRequest, ListThumbnailsTaskResponse> genForListThumbnailsTask() {
        // basic
        HttpRequestDef.Builder<ListThumbnailsTaskRequest, ListThumbnailsTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListThumbnailsTaskRequest.class, ListThumbnailsTaskResponse.class)
                .withName("ListThumbnailsTask")
                .withUri("/v1/{project_id}/thumbnails")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListThumbnailsTaskRequest::getTaskId, ListThumbnailsTaskRequest::setTaskId));
        builder.<ListThumbnailsTaskRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListThumbnailsTaskRequest.StatusEnum.class),
            f -> f.withMarshaller(ListThumbnailsTaskRequest::getStatus, ListThumbnailsTaskRequest::setStatus));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListThumbnailsTaskRequest::getStartTime, ListThumbnailsTaskRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListThumbnailsTaskRequest::getEndTime, ListThumbnailsTaskRequest::setEndTime));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListThumbnailsTaskRequest::getPage, ListThumbnailsTaskRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListThumbnailsTaskRequest::getSize, ListThumbnailsTaskRequest::setSize));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListThumbnailsTaskRequest::getXLanguage, ListThumbnailsTaskRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTranscodingTaskRequest, CreateTranscodingTaskResponse> createTranscodingTask =
        genForCreateTranscodingTask();

    private static HttpRequestDef<CreateTranscodingTaskRequest, CreateTranscodingTaskResponse> genForCreateTranscodingTask() {
        // basic
        HttpRequestDef.Builder<CreateTranscodingTaskRequest, CreateTranscodingTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateTranscodingTaskRequest.class, CreateTranscodingTaskResponse.class)
            .withName("CreateTranscodingTask")
            .withUri("/v1/{project_id}/transcodings")
            .withContentType("application/json");

        // requests
        builder.<CreateTranscodingReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateTranscodingReq.class),
            f -> f.withMarshaller(CreateTranscodingTaskRequest::getBody, CreateTranscodingTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTranscodingTaskRequest, DeleteTranscodingTaskResponse> deleteTranscodingTask =
        genForDeleteTranscodingTask();

    private static HttpRequestDef<DeleteTranscodingTaskRequest, DeleteTranscodingTaskResponse> genForDeleteTranscodingTask() {
        // basic
        HttpRequestDef.Builder<DeleteTranscodingTaskRequest, DeleteTranscodingTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteTranscodingTaskRequest.class, DeleteTranscodingTaskResponse.class)
            .withName("DeleteTranscodingTask")
            .withUri("/v1/{project_id}/transcodings")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteTranscodingTaskRequest::getTaskId, DeleteTranscodingTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTranscodingTaskByConsoleRequest, DeleteTranscodingTaskByConsoleResponse> deleteTranscodingTaskByConsole =
        genForDeleteTranscodingTaskByConsole();

    private static HttpRequestDef<DeleteTranscodingTaskByConsoleRequest, DeleteTranscodingTaskByConsoleResponse> genForDeleteTranscodingTaskByConsole() {
        // basic
        HttpRequestDef.Builder<DeleteTranscodingTaskByConsoleRequest, DeleteTranscodingTaskByConsoleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteTranscodingTaskByConsoleRequest.class,
                    DeleteTranscodingTaskByConsoleResponse.class)
                .withName("DeleteTranscodingTaskByConsole")
                .withUri("/v1/{project_id}/transcodings/task")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteTranscodingTaskByConsoleRequest::getTaskId,
                DeleteTranscodingTaskByConsoleRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStatSummaryRequest, ListStatSummaryResponse> listStatSummary =
        genForListStatSummary();

    private static HttpRequestDef<ListStatSummaryRequest, ListStatSummaryResponse> genForListStatSummary() {
        // basic
        HttpRequestDef.Builder<ListStatSummaryRequest, ListStatSummaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStatSummaryRequest.class, ListStatSummaryResponse.class)
                .withName("ListStatSummary")
                .withUri("/v1/{project_id}/transcodings/summaries")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatSummaryRequest::getStartTime, ListStatSummaryRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatSummaryRequest::getEndTime, ListStatSummaryRequest::setEndTime));
        builder.<String>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatSummaryRequest::getStatType, ListStatSummaryRequest::setStatType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTranscodingTaskRequest, ListTranscodingTaskResponse> listTranscodingTask =
        genForListTranscodingTask();

    private static HttpRequestDef<ListTranscodingTaskRequest, ListTranscodingTaskResponse> genForListTranscodingTask() {
        // basic
        HttpRequestDef.Builder<ListTranscodingTaskRequest, ListTranscodingTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTranscodingTaskRequest.class, ListTranscodingTaskResponse.class)
                .withName("ListTranscodingTask")
                .withUri("/v1/{project_id}/transcodings")
                .withContentType("application/json");

        // requests
        builder.<List<Long>>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTranscodingTaskRequest::getTaskId, ListTranscodingTaskRequest::setTaskId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTranscodingTaskRequest::getStatus, ListTranscodingTaskRequest::setStatus));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTranscodingTaskRequest::getStartTime, ListTranscodingTaskRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTranscodingTaskRequest::getEndTime, ListTranscodingTaskRequest::setEndTime));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTranscodingTaskRequest::getPage, ListTranscodingTaskRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTranscodingTaskRequest::getSize, ListTranscodingTaskRequest::setSize));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTranscodingTaskRequest::getXLanguage, ListTranscodingTaskRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTransTemplateRequest, CreateTransTemplateResponse> createTransTemplate =
        genForCreateTransTemplate();

    private static HttpRequestDef<CreateTransTemplateRequest, CreateTransTemplateResponse> genForCreateTransTemplate() {
        // basic
        HttpRequestDef.Builder<CreateTransTemplateRequest, CreateTransTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTransTemplateRequest.class, CreateTransTemplateResponse.class)
                .withName("CreateTransTemplate")
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json");

        // requests
        builder.<TransTemplate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(TransTemplate.class),
            f -> f.withMarshaller(CreateTransTemplateRequest::getBody, CreateTransTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplate =
        genForDeleteTemplate();

    private static HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> genForDeleteTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateRequest, DeleteTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplateRequest.class, DeleteTemplateResponse.class)
                .withName("DeleteTemplate")
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getTemplateId, DeleteTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateRequest, ListTemplateResponse> listTemplate = genForListTemplate();

    private static HttpRequestDef<ListTemplateRequest, ListTemplateResponse> genForListTemplate() {
        // basic
        HttpRequestDef.Builder<ListTemplateRequest, ListTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplateRequest.class, ListTemplateResponse.class)
                .withName("ListTemplate")
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json");

        // requests
        builder.<List<Integer>>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTemplateRequest::getTemplateId, ListTemplateRequest::setTemplateId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateRequest::getPage, ListTemplateRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateRequest::getSize, ListTemplateRequest::setSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTransTemplateRequest, UpdateTransTemplateResponse> updateTransTemplate =
        genForUpdateTransTemplate();

    private static HttpRequestDef<UpdateTransTemplateRequest, UpdateTransTemplateResponse> genForUpdateTransTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateTransTemplateRequest, UpdateTransTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTransTemplateRequest.class, UpdateTransTemplateResponse.class)
                .withName("UpdateTransTemplate")
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json");

        // requests
        builder.<ModifyTransTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyTransTemplateReq.class),
            f -> f.withMarshaller(UpdateTransTemplateRequest::getBody, UpdateTransTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> createWatermarkTemplate =
        genForCreateWatermarkTemplate();

    private static HttpRequestDef<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> genForCreateWatermarkTemplate() {
        // basic
        HttpRequestDef.Builder<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateWatermarkTemplateRequest.class, CreateWatermarkTemplateResponse.class)
            .withName("CreateWatermarkTemplate")
            .withUri("/v1/{project_id}/template/watermark")
            .withContentType("application/json");

        // requests
        builder.<WatermarkTemplate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(WatermarkTemplate.class),
            f -> f.withMarshaller(CreateWatermarkTemplateRequest::getBody, CreateWatermarkTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> deleteWatermarkTemplate =
        genForDeleteWatermarkTemplate();

    private static HttpRequestDef<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> genForDeleteWatermarkTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteWatermarkTemplateRequest.class, DeleteWatermarkTemplateResponse.class)
            .withName("DeleteWatermarkTemplate")
            .withUri("/v1/{project_id}/template/watermark")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteWatermarkTemplateRequest::getTemplateId,
                DeleteWatermarkTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> listWatermarkTemplate =
        genForListWatermarkTemplate();

    private static HttpRequestDef<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> genForListWatermarkTemplate() {
        // basic
        HttpRequestDef.Builder<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListWatermarkTemplateRequest.class, ListWatermarkTemplateResponse.class)
            .withName("ListWatermarkTemplate")
            .withUri("/v1/{project_id}/template/watermark")
            .withContentType("application/json");

        // requests
        builder.<List<Integer>>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getTemplateId,
                ListWatermarkTemplateRequest::setTemplateId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getPage, ListWatermarkTemplateRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getSize, ListWatermarkTemplateRequest::setSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> updateWatermarkTemplate =
        genForUpdateWatermarkTemplate();

    private static HttpRequestDef<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> genForUpdateWatermarkTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateWatermarkTemplateRequest.class, UpdateWatermarkTemplateResponse.class)
            .withName("UpdateWatermarkTemplate")
            .withUri("/v1/{project_id}/template/watermark")
            .withContentType("application/json");

        // requests
        builder.<WatermarkTemplate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(WatermarkTemplate.class),
            f -> f.withMarshaller(UpdateWatermarkTemplateRequest::getBody, UpdateWatermarkTemplateRequest::setBody));

        // response

        return builder.build();
    }

}
