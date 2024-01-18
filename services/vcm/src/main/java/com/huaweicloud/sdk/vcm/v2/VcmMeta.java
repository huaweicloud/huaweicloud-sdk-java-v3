package com.huaweicloud.sdk.vcm.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.vcm.v2.model.CheckAudioJobRequest;
import com.huaweicloud.sdk.vcm.v2.model.CheckAudioJobResponse;
import com.huaweicloud.sdk.vcm.v2.model.CheckVideoJobRequest;
import com.huaweicloud.sdk.vcm.v2.model.CheckVideoJobResponse;
import com.huaweicloud.sdk.vcm.v2.model.CreateAudioJobRequest;
import com.huaweicloud.sdk.vcm.v2.model.CreateAudioJobRequestBody;
import com.huaweicloud.sdk.vcm.v2.model.CreateAudioJobResponse;
import com.huaweicloud.sdk.vcm.v2.model.CreateAudioJobResponseBody;
import com.huaweicloud.sdk.vcm.v2.model.CreateVideoJobReq;
import com.huaweicloud.sdk.vcm.v2.model.CreateVideoJobRequest;
import com.huaweicloud.sdk.vcm.v2.model.CreateVideoJobResponse;
import com.huaweicloud.sdk.vcm.v2.model.CreateVideoJobResponseBody;
import com.huaweicloud.sdk.vcm.v2.model.DeleteDemoInfoRequest;
import com.huaweicloud.sdk.vcm.v2.model.DeleteDemoInfoResponse;
import com.huaweicloud.sdk.vcm.v2.model.DeleteVideoJobRequest;
import com.huaweicloud.sdk.vcm.v2.model.DeleteVideoJobResponse;
import com.huaweicloud.sdk.vcm.v2.model.ListAudioJobsRequest;
import com.huaweicloud.sdk.vcm.v2.model.ListAudioJobsResponse;
import com.huaweicloud.sdk.vcm.v2.model.ListVideoJobsRequest;
import com.huaweicloud.sdk.vcm.v2.model.ListVideoJobsResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class VcmMeta {

    public static final HttpRequestDef<CheckAudioJobRequest, CheckAudioJobResponse> checkAudioJob =
        genForCheckAudioJob();

    private static HttpRequestDef<CheckAudioJobRequest, CheckAudioJobResponse> genForCheckAudioJob() {
        // basic
        HttpRequestDef.Builder<CheckAudioJobRequest, CheckAudioJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckAudioJobRequest.class, CheckAudioJobResponse.class)
                .withName("CheckAudioJob")
                .withUri("/v2/{project_id}/services/audio-moderation/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckAudioJobRequest::getTaskId, CheckAudioJobRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckVideoJobRequest, CheckVideoJobResponse> checkVideoJob =
        genForCheckVideoJob();

    private static HttpRequestDef<CheckVideoJobRequest, CheckVideoJobResponse> genForCheckVideoJob() {
        // basic
        HttpRequestDef.Builder<CheckVideoJobRequest, CheckVideoJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckVideoJobRequest.class, CheckVideoJobResponse.class)
                .withName("CheckVideoJob")
                .withUri("/v2/{project_id}/services/video-moderation/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckVideoJobRequest::getTaskId, CheckVideoJobRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAudioJobRequest, CreateAudioJobResponse> createAudioJob =
        genForCreateAudioJob();

    private static HttpRequestDef<CreateAudioJobRequest, CreateAudioJobResponse> genForCreateAudioJob() {
        // basic
        HttpRequestDef.Builder<CreateAudioJobRequest, CreateAudioJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAudioJobRequest.class, CreateAudioJobResponse.class)
                .withName("CreateAudioJob")
                .withUri("/v2/{project_id}/services/audio-moderation/tasks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateAudioJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAudioJobRequestBody.class),
            f -> f.withMarshaller(CreateAudioJobRequest::getBody, CreateAudioJobRequest::setBody));

        // response
        builder.<List<CreateAudioJobResponseBody>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateAudioJobResponse::getBody, CreateAudioJobResponse::setBody)
                .withInnerContainerType(CreateAudioJobResponseBody.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateVideoJobRequest, CreateVideoJobResponse> createVideoJob =
        genForCreateVideoJob();

    private static HttpRequestDef<CreateVideoJobRequest, CreateVideoJobResponse> genForCreateVideoJob() {
        // basic
        HttpRequestDef.Builder<CreateVideoJobRequest, CreateVideoJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVideoJobRequest.class, CreateVideoJobResponse.class)
                .withName("CreateVideoJob")
                .withUri("/v2/{project_id}/services/video-moderation/tasks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateVideoJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVideoJobReq.class),
            f -> f.withMarshaller(CreateVideoJobRequest::getBody, CreateVideoJobRequest::setBody));

        // response
        builder.<List<CreateVideoJobResponseBody>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateVideoJobResponse::getBody, CreateVideoJobResponse::setBody)
                .withInnerContainerType(CreateVideoJobResponseBody.class));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDemoInfoRequest, DeleteDemoInfoResponse> deleteDemoInfo =
        genForDeleteDemoInfo();

    private static HttpRequestDef<DeleteDemoInfoRequest, DeleteDemoInfoResponse> genForDeleteDemoInfo() {
        // basic
        HttpRequestDef.Builder<DeleteDemoInfoRequest, DeleteDemoInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDemoInfoRequest.class, DeleteDemoInfoResponse.class)
                .withName("DeleteDemoInfo")
                .withUri("/v2/{project_id}/services/audio-moderation/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDemoInfoRequest::getTaskId, DeleteDemoInfoRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVideoJobRequest, DeleteVideoJobResponse> deleteVideoJob =
        genForDeleteVideoJob();

    private static HttpRequestDef<DeleteVideoJobRequest, DeleteVideoJobResponse> genForDeleteVideoJob() {
        // basic
        HttpRequestDef.Builder<DeleteVideoJobRequest, DeleteVideoJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVideoJobRequest.class, DeleteVideoJobResponse.class)
                .withName("DeleteVideoJob")
                .withUri("/v2/{project_id}/services/video-moderation/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVideoJobRequest::getTaskId, DeleteVideoJobRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAudioJobsRequest, ListAudioJobsResponse> listAudioJobs =
        genForListAudioJobs();

    private static HttpRequestDef<ListAudioJobsRequest, ListAudioJobsResponse> genForListAudioJobs() {
        // basic
        HttpRequestDef.Builder<ListAudioJobsRequest, ListAudioJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAudioJobsRequest.class, ListAudioJobsResponse.class)
                .withName("ListAudioJobs")
                .withUri("/v2/{project_id}/services/audio-moderation/tasks")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVideoJobsRequest, ListVideoJobsResponse> listVideoJobs =
        genForListVideoJobs();

    private static HttpRequestDef<ListVideoJobsRequest, ListVideoJobsResponse> genForListVideoJobs() {
        // basic
        HttpRequestDef.Builder<ListVideoJobsRequest, ListVideoJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVideoJobsRequest.class, ListVideoJobsResponse.class)
                .withName("ListVideoJobs")
                .withUri("/v2/{project_id}/services/video-moderation/tasks")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

}
