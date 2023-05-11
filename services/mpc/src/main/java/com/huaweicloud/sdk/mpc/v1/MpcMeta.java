package com.huaweicloud.sdk.mpc.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.mpc.v1.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class MpcMeta {

    public static final HttpRequestDef<CreateAnimatedGraphicsTaskRequest, CreateAnimatedGraphicsTaskResponse> createAnimatedGraphicsTask =
        genForcreateAnimatedGraphicsTask();

    private static HttpRequestDef<CreateAnimatedGraphicsTaskRequest, CreateAnimatedGraphicsTaskResponse> genForcreateAnimatedGraphicsTask() {
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
            f -> f.withMarshaller(CreateAnimatedGraphicsTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAnimatedGraphicsTaskRequest, DeleteAnimatedGraphicsTaskResponse> deleteAnimatedGraphicsTask =
        genFordeleteAnimatedGraphicsTask();

    private static HttpRequestDef<DeleteAnimatedGraphicsTaskRequest, DeleteAnimatedGraphicsTaskResponse> genFordeleteAnimatedGraphicsTask() {
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
            f -> f.withMarshaller(DeleteAnimatedGraphicsTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAnimatedGraphicsTaskRequest, ListAnimatedGraphicsTaskResponse> listAnimatedGraphicsTask =
        genForlistAnimatedGraphicsTask();

    private static HttpRequestDef<ListAnimatedGraphicsTaskRequest, ListAnimatedGraphicsTaskResponse> genForlistAnimatedGraphicsTask() {
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
            f -> f.withMarshaller(ListAnimatedGraphicsTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<ListAnimatedGraphicsTaskRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAnimatedGraphicsTaskRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAnimatedGraphicsTaskRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAnimatedGraphicsTaskRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAnimatedGraphicsTaskRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAnimatedGraphicsTaskRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAnimatedGraphicsTaskRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAnimatedGraphicsTaskRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAgenciesTaskRequest, CreateAgenciesTaskResponse> createAgenciesTask =
        genForcreateAgenciesTask();

    private static HttpRequestDef<CreateAgenciesTaskRequest, CreateAgenciesTaskResponse> genForcreateAgenciesTask() {
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
            f -> f.withMarshaller(CreateAgenciesTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllBucketsRequest, ListAllBucketsResponse> listAllBuckets =
        genForlistAllBuckets();

    private static HttpRequestDef<ListAllBucketsRequest, ListAllBucketsResponse> genForlistAllBuckets() {
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
        genForlistAllObsObjList();

    private static HttpRequestDef<ListAllObsObjListRequest, ListAllObsObjListResponse> genForlistAllObsObjList() {
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
            f -> f.withMarshaller(ListAllObsObjListRequest::getBucket, (req, v) -> {
                req.setBucket(v);
            }));
        builder.<String>withRequestField("prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllObsObjListRequest::getPrefix, (req, v) -> {
                req.setPrefix(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllObsObjListRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotifyEventRequest, ListNotifyEventResponse> listNotifyEvent =
        genForlistNotifyEvent();

    private static HttpRequestDef<ListNotifyEventRequest, ListNotifyEventResponse> genForlistNotifyEvent() {
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
        genForlistNotifySmnTopicConfig();

    private static HttpRequestDef<ListNotifySmnTopicConfigRequest, ListNotifySmnTopicConfigResponse> genForlistNotifySmnTopicConfig() {
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
        genFornotifySmnTopicConfig();

    private static HttpRequestDef<NotifySmnTopicConfigRequest, NotifySmnTopicConfigResponse> genFornotifySmnTopicConfig() {
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
            f -> f.withMarshaller(NotifySmnTopicConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAgenciesTaskRequest, ShowAgenciesTaskResponse> showAgenciesTask =
        genForshowAgenciesTask();

    private static HttpRequestDef<ShowAgenciesTaskRequest, ShowAgenciesTaskResponse> genForshowAgenciesTask() {
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
        genForupdateBucketAuthorized();

    private static HttpRequestDef<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> genForupdateBucketAuthorized() {
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
            f -> f.withMarshaller(UpdateBucketAuthorizedRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEditingJobRequest, CreateEditingJobResponse> createEditingJob =
        genForcreateEditingJob();

    private static HttpRequestDef<CreateEditingJobRequest, CreateEditingJobResponse> genForcreateEditingJob() {
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
            f -> f.withMarshaller(CreateEditingJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEditingJobRequest, DeleteEditingJobResponse> deleteEditingJob =
        genFordeleteEditingJob();

    private static HttpRequestDef<DeleteEditingJobRequest, DeleteEditingJobResponse> genFordeleteEditingJob() {
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
            f -> f.withMarshaller(DeleteEditingJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEditingJobRequest, ListEditingJobResponse> listEditingJob =
        genForlistEditingJob();

    private static HttpRequestDef<ListEditingJobRequest, ListEditingJobResponse> genForlistEditingJob() {
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
            f -> f.withMarshaller(ListEditingJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<ListEditingJobRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEditingJobRequest.StatusEnum.class),
            f -> f.withMarshaller(ListEditingJobRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEditingJobRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEditingJobRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEditingJobRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEditingJobRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEditingJobRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEditingJobsRequest, CreateEditingJobsResponse> createEditingJobs =
        genForcreateEditingJobs();

    private static HttpRequestDef<CreateEditingJobsRequest, CreateEditingJobsResponse> genForcreateEditingJobs() {
        // basic
        HttpRequestDef.Builder<CreateEditingJobsRequest, CreateEditingJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEditingJobsRequest.class, CreateEditingJobsResponse.class)
                .withName("CreateEditingJobs")
                .withUri("/v2/{project_id}/editing/jobs")
                .withContentType("application/json");

        // requests
        builder.<CreateEditingJobsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEditingJobsReq.class),
            f -> f.withMarshaller(CreateEditingJobsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateEditingJobsResponse::getXRequestId, CreateEditingJobsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteEditingJobsRequest, DeleteEditingJobsResponse> deleteEditingJobs =
        genFordeleteEditingJobs();

    private static HttpRequestDef<DeleteEditingJobsRequest, DeleteEditingJobsResponse> genFordeleteEditingJobs() {
        // basic
        HttpRequestDef.Builder<DeleteEditingJobsRequest, DeleteEditingJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEditingJobsRequest.class, DeleteEditingJobsResponse.class)
                .withName("DeleteEditingJobs")
                .withUri("/v2/{project_id}/editing/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEditingJobsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteEditingJobsResponse::getXRequestId, DeleteEditingJobsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListEditingJobsRequest, ListEditingJobsResponse> listEditingJobs =
        genForlistEditingJobs();

    private static HttpRequestDef<ListEditingJobsRequest, ListEditingJobsResponse> genForlistEditingJobs() {
        // basic
        HttpRequestDef.Builder<ListEditingJobsRequest, ListEditingJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEditingJobsRequest.class, ListEditingJobsResponse.class)
                .withName("ListEditingJobs")
                .withUri("/v2/{project_id}/editing/jobs")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEditingJobsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEditingJobsResponse::getXRequestId, ListEditingJobsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateEncryptTaskRequest, CreateEncryptTaskResponse> createEncryptTask =
        genForcreateEncryptTask();

    private static HttpRequestDef<CreateEncryptTaskRequest, CreateEncryptTaskResponse> genForcreateEncryptTask() {
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
            f -> f.withMarshaller(CreateEncryptTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEncryptTaskRequest, DeleteEncryptTaskResponse> deleteEncryptTask =
        genFordeleteEncryptTask();

    private static HttpRequestDef<DeleteEncryptTaskRequest, DeleteEncryptTaskResponse> genFordeleteEncryptTask() {
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
            f -> f.withMarshaller(DeleteEncryptTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEncryptTaskRequest, ListEncryptTaskResponse> listEncryptTask =
        genForlistEncryptTask();

    private static HttpRequestDef<ListEncryptTaskRequest, ListEncryptTaskResponse> genForlistEncryptTask() {
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
            f -> f.withMarshaller(ListEncryptTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<ListEncryptTaskRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEncryptTaskRequest.StatusEnum.class),
            f -> f.withMarshaller(ListEncryptTaskRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEncryptTaskRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEncryptTaskRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEncryptTaskRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEncryptTaskRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateExtractTaskRequest, CreateExtractTaskResponse> createExtractTask =
        genForcreateExtractTask();

    private static HttpRequestDef<CreateExtractTaskRequest, CreateExtractTaskResponse> genForcreateExtractTask() {
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
            f -> f.withMarshaller(CreateExtractTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteExtractTaskRequest, DeleteExtractTaskResponse> deleteExtractTask =
        genFordeleteExtractTask();

    private static HttpRequestDef<DeleteExtractTaskRequest, DeleteExtractTaskResponse> genFordeleteExtractTask() {
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
            f -> f.withMarshaller(DeleteExtractTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListExtractTaskRequest, ListExtractTaskResponse> listExtractTask =
        genForlistExtractTask();

    private static HttpRequestDef<ListExtractTaskRequest, ListExtractTaskResponse> genForlistExtractTask() {
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
            f -> f.withMarshaller(ListExtractTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<ListExtractTaskRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListExtractTaskRequest.StatusEnum.class),
            f -> f.withMarshaller(ListExtractTaskRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExtractTaskRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExtractTaskRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListExtractTaskRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListExtractTaskRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExtractTaskRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMbTasksReportRequest, CreateMbTasksReportResponse> createMbTasksReport =
        genForcreateMbTasksReport();

    private static HttpRequestDef<CreateMbTasksReportRequest, CreateMbTasksReportResponse> genForcreateMbTasksReport() {
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
            f -> f.withMarshaller(CreateMbTasksReportRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMergeChannelsTaskRequest, CreateMergeChannelsTaskResponse> createMergeChannelsTask =
        genForcreateMergeChannelsTask();

    private static HttpRequestDef<CreateMergeChannelsTaskRequest, CreateMergeChannelsTaskResponse> genForcreateMergeChannelsTask() {
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
            f -> f.withMarshaller(CreateMergeChannelsTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResetTracksTaskRequest, CreateResetTracksTaskResponse> createResetTracksTask =
        genForcreateResetTracksTask();

    private static HttpRequestDef<CreateResetTracksTaskRequest, CreateResetTracksTaskResponse> genForcreateResetTracksTask() {
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
            f -> f.withMarshaller(CreateResetTracksTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMergeChannelsTaskRequest, DeleteMergeChannelsTaskResponse> deleteMergeChannelsTask =
        genFordeleteMergeChannelsTask();

    private static HttpRequestDef<DeleteMergeChannelsTaskRequest, DeleteMergeChannelsTaskResponse> genFordeleteMergeChannelsTask() {
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
            f -> f.withMarshaller(DeleteMergeChannelsTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResetTracksTaskRequest, DeleteResetTracksTaskResponse> deleteResetTracksTask =
        genFordeleteResetTracksTask();

    private static HttpRequestDef<DeleteResetTracksTaskRequest, DeleteResetTracksTaskResponse> genFordeleteResetTracksTask() {
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
            f -> f.withMarshaller(DeleteResetTracksTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMergeChannelsTaskRequest, ListMergeChannelsTaskResponse> listMergeChannelsTask =
        genForlistMergeChannelsTask();

    private static HttpRequestDef<ListMergeChannelsTaskRequest, ListMergeChannelsTaskResponse> genForlistMergeChannelsTask() {
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
            f -> f.withMarshaller(ListMergeChannelsTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<ListMergeChannelsTaskRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMergeChannelsTaskRequest.StatusEnum.class),
            f -> f.withMarshaller(ListMergeChannelsTaskRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeChannelsTaskRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeChannelsTaskRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeChannelsTaskRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeChannelsTaskRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResetTracksTaskRequest, ListResetTracksTaskResponse> listResetTracksTask =
        genForlistResetTracksTask();

    private static HttpRequestDef<ListResetTracksTaskRequest, ListResetTracksTaskResponse> genForlistResetTracksTask() {
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
            f -> f.withMarshaller(ListResetTracksTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<ListResetTracksTaskRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResetTracksTaskRequest.StatusEnum.class),
            f -> f.withMarshaller(ListResetTracksTaskRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResetTracksTaskRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResetTracksTaskRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResetTracksTaskRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResetTracksTaskRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMediaProcessTaskRequest, CreateMediaProcessTaskResponse> createMediaProcessTask =
        genForcreateMediaProcessTask();

    private static HttpRequestDef<CreateMediaProcessTaskRequest, CreateMediaProcessTaskResponse> genForcreateMediaProcessTask() {
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
            f -> f.withMarshaller(CreateMediaProcessTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMediaProcessTaskRequest, DeleteMediaProcessTaskResponse> deleteMediaProcessTask =
        genFordeleteMediaProcessTask();

    private static HttpRequestDef<DeleteMediaProcessTaskRequest, DeleteMediaProcessTaskResponse> genFordeleteMediaProcessTask() {
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
            f -> f.withMarshaller(DeleteMediaProcessTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMediaProcessTaskRequest, ListMediaProcessTaskResponse> listMediaProcessTask =
        genForlistMediaProcessTask();

    private static HttpRequestDef<ListMediaProcessTaskRequest, ListMediaProcessTaskResponse> genForlistMediaProcessTask() {
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
            f -> f.withMarshaller(ListMediaProcessTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<ListMediaProcessTaskRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMediaProcessTaskRequest.StatusEnum.class),
            f -> f.withMarshaller(ListMediaProcessTaskRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMediaProcessTaskRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMediaProcessTaskRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMediaProcessTaskRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMediaProcessTaskRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMpeCallBackRequest, CreateMpeCallBackResponse> createMpeCallBack =
        genForcreateMpeCallBack();

    private static HttpRequestDef<CreateMpeCallBackRequest, CreateMpeCallBackResponse> genForcreateMpeCallBack() {
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
            f -> f.withMarshaller(CreateMpeCallBackRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateQualityEnhanceTemplateRequest, CreateQualityEnhanceTemplateResponse> createQualityEnhanceTemplate =
        genForcreateQualityEnhanceTemplate();

    private static HttpRequestDef<CreateQualityEnhanceTemplateRequest, CreateQualityEnhanceTemplateResponse> genForcreateQualityEnhanceTemplate() {
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
            f -> f.withMarshaller(CreateQualityEnhanceTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteQualityEnhanceTemplateRequest, DeleteQualityEnhanceTemplateResponse> deleteQualityEnhanceTemplate =
        genFordeleteQualityEnhanceTemplate();

    private static HttpRequestDef<DeleteQualityEnhanceTemplateRequest, DeleteQualityEnhanceTemplateResponse> genFordeleteQualityEnhanceTemplate() {
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
            f -> f.withMarshaller(DeleteQualityEnhanceTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQualityEnhanceDefaultTemplateRequest, ListQualityEnhanceDefaultTemplateResponse> listQualityEnhanceDefaultTemplate =
        genForlistQualityEnhanceDefaultTemplate();

    private static HttpRequestDef<ListQualityEnhanceDefaultTemplateRequest, ListQualityEnhanceDefaultTemplateResponse> genForlistQualityEnhanceDefaultTemplate() {
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
        genForupdateQualityEnhanceTemplate();

    private static HttpRequestDef<UpdateQualityEnhanceTemplateRequest, UpdateQualityEnhanceTemplateResponse> genForupdateQualityEnhanceTemplate() {
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
            f -> f.withMarshaller(UpdateQualityEnhanceTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTranscodeDetailRequest, ListTranscodeDetailResponse> listTranscodeDetail =
        genForlistTranscodeDetail();

    private static HttpRequestDef<ListTranscodeDetailRequest, ListTranscodeDetailResponse> genForlistTranscodeDetail() {
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
            f -> f.withMarshaller(ListTranscodeDetailRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelRemuxTaskRequest, CancelRemuxTaskResponse> cancelRemuxTask =
        genForcancelRemuxTask();

    private static HttpRequestDef<CancelRemuxTaskRequest, CancelRemuxTaskResponse> genForcancelRemuxTask() {
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
            f -> f.withMarshaller(CancelRemuxTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRemuxTaskRequest, CreateRemuxTaskResponse> createRemuxTask =
        genForcreateRemuxTask();

    private static HttpRequestDef<CreateRemuxTaskRequest, CreateRemuxTaskResponse> genForcreateRemuxTask() {
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
            f -> f.withMarshaller(CreateRemuxTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRetryRemuxTaskRequest, CreateRetryRemuxTaskResponse> createRetryRemuxTask =
        genForcreateRetryRemuxTask();

    private static HttpRequestDef<CreateRetryRemuxTaskRequest, CreateRetryRemuxTaskResponse> genForcreateRetryRemuxTask() {
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
            f -> f.withMarshaller(CreateRetryRemuxTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRemuxTaskRequest, DeleteRemuxTaskResponse> deleteRemuxTask =
        genFordeleteRemuxTask();

    private static HttpRequestDef<DeleteRemuxTaskRequest, DeleteRemuxTaskResponse> genFordeleteRemuxTask() {
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
            f -> f.withMarshaller(DeleteRemuxTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRemuxTaskRequest, ListRemuxTaskResponse> listRemuxTask =
        genForlistRemuxTask();

    private static HttpRequestDef<ListRemuxTaskRequest, ListRemuxTaskResponse> genForlistRemuxTask() {
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
            f -> f.withMarshaller(ListRemuxTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<ListRemuxTaskRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRemuxTaskRequest.StatusEnum.class),
            f -> f.withMarshaller(ListRemuxTaskRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRemuxTaskRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRemuxTaskRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("input_bucket",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRemuxTaskRequest::getInputBucket, (req, v) -> {
                req.setInputBucket(v);
            }));
        builder.<String>withRequestField("input_object",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRemuxTaskRequest::getInputObject, (req, v) -> {
                req.setInputObject(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRemuxTaskRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRemuxTaskRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateGroupRequest, CreateTemplateGroupResponse> createTemplateGroup =
        genForcreateTemplateGroup();

    private static HttpRequestDef<CreateTemplateGroupRequest, CreateTemplateGroupResponse> genForcreateTemplateGroup() {
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
            f -> f.withMarshaller(CreateTemplateGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> deleteTemplateGroup =
        genFordeleteTemplateGroup();

    private static HttpRequestDef<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> genFordeleteTemplateGroup() {
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
            f -> f.withMarshaller(DeleteTemplateGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateGroupRequest, ListTemplateGroupResponse> listTemplateGroup =
        genForlistTemplateGroup();

    private static HttpRequestDef<ListTemplateGroupRequest, ListTemplateGroupResponse> genForlistTemplateGroup() {
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
            f -> f.withMarshaller(ListTemplateGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<List<String>>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTemplateGroupRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateGroupRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateGroupRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> updateTemplateGroup =
        genForupdateTemplateGroup();

    private static HttpRequestDef<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> genForupdateTemplateGroup() {
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
            f -> f.withMarshaller(UpdateTemplateGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateThumbnailsTaskRequest, CreateThumbnailsTaskResponse> createThumbnailsTask =
        genForcreateThumbnailsTask();

    private static HttpRequestDef<CreateThumbnailsTaskRequest, CreateThumbnailsTaskResponse> genForcreateThumbnailsTask() {
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
            f -> f.withMarshaller(CreateThumbnailsTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteThumbnailsTaskRequest, DeleteThumbnailsTaskResponse> deleteThumbnailsTask =
        genFordeleteThumbnailsTask();

    private static HttpRequestDef<DeleteThumbnailsTaskRequest, DeleteThumbnailsTaskResponse> genFordeleteThumbnailsTask() {
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
            f -> f.withMarshaller(DeleteThumbnailsTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListThumbnailsTaskRequest, ListThumbnailsTaskResponse> listThumbnailsTask =
        genForlistThumbnailsTask();

    private static HttpRequestDef<ListThumbnailsTaskRequest, ListThumbnailsTaskResponse> genForlistThumbnailsTask() {
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
            f -> f.withMarshaller(ListThumbnailsTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<ListThumbnailsTaskRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListThumbnailsTaskRequest.StatusEnum.class),
            f -> f.withMarshaller(ListThumbnailsTaskRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListThumbnailsTaskRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListThumbnailsTaskRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListThumbnailsTaskRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListThumbnailsTaskRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListThumbnailsTaskRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTranscodingTaskRequest, CreateTranscodingTaskResponse> createTranscodingTask =
        genForcreateTranscodingTask();

    private static HttpRequestDef<CreateTranscodingTaskRequest, CreateTranscodingTaskResponse> genForcreateTranscodingTask() {
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
            f -> f.withMarshaller(CreateTranscodingTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTranscodingTaskRequest, DeleteTranscodingTaskResponse> deleteTranscodingTask =
        genFordeleteTranscodingTask();

    private static HttpRequestDef<DeleteTranscodingTaskRequest, DeleteTranscodingTaskResponse> genFordeleteTranscodingTask() {
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
            f -> f.withMarshaller(DeleteTranscodingTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTranscodingTaskByConsoleRequest, DeleteTranscodingTaskByConsoleResponse> deleteTranscodingTaskByConsole =
        genFordeleteTranscodingTaskByConsole();

    private static HttpRequestDef<DeleteTranscodingTaskByConsoleRequest, DeleteTranscodingTaskByConsoleResponse> genFordeleteTranscodingTaskByConsole() {
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
            f -> f.withMarshaller(DeleteTranscodingTaskByConsoleRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStatSummaryRequest, ListStatSummaryResponse> listStatSummary =
        genForlistStatSummary();

    private static HttpRequestDef<ListStatSummaryRequest, ListStatSummaryResponse> genForlistStatSummary() {
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
            f -> f.withMarshaller(ListStatSummaryRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatSummaryRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatSummaryRequest::getStatType, (req, v) -> {
                req.setStatType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTranscodingTaskRequest, ListTranscodingTaskResponse> listTranscodingTask =
        genForlistTranscodingTask();

    private static HttpRequestDef<ListTranscodingTaskRequest, ListTranscodingTaskResponse> genForlistTranscodingTask() {
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
            f -> f.withMarshaller(ListTranscodingTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTranscodingTaskRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTranscodingTaskRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTranscodingTaskRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTranscodingTaskRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTranscodingTaskRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTranscodingTaskRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTransTemplateRequest, CreateTransTemplateResponse> createTransTemplate =
        genForcreateTransTemplate();

    private static HttpRequestDef<CreateTransTemplateRequest, CreateTransTemplateResponse> genForcreateTransTemplate() {
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
            f -> f.withMarshaller(CreateTransTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplate =
        genFordeleteTemplate();

    private static HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> genFordeleteTemplate() {
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
            f -> f.withMarshaller(DeleteTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateRequest, ListTemplateResponse> listTemplate = genForlistTemplate();

    private static HttpRequestDef<ListTemplateRequest, ListTemplateResponse> genForlistTemplate() {
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
            f -> f.withMarshaller(ListTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTransTemplateRequest, UpdateTransTemplateResponse> updateTransTemplate =
        genForupdateTransTemplate();

    private static HttpRequestDef<UpdateTransTemplateRequest, UpdateTransTemplateResponse> genForupdateTransTemplate() {
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
            f -> f.withMarshaller(UpdateTransTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> createWatermarkTemplate =
        genForcreateWatermarkTemplate();

    private static HttpRequestDef<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> genForcreateWatermarkTemplate() {
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
            f -> f.withMarshaller(CreateWatermarkTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> deleteWatermarkTemplate =
        genFordeleteWatermarkTemplate();

    private static HttpRequestDef<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> genFordeleteWatermarkTemplate() {
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
            f -> f.withMarshaller(DeleteWatermarkTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> listWatermarkTemplate =
        genForlistWatermarkTemplate();

    private static HttpRequestDef<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> genForlistWatermarkTemplate() {
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
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> updateWatermarkTemplate =
        genForupdateWatermarkTemplate();

    private static HttpRequestDef<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> genForupdateWatermarkTemplate() {
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
            f -> f.withMarshaller(UpdateWatermarkTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
