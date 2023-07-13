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
        genForcheckAudioJob();

    private static HttpRequestDef<CheckAudioJobRequest, CheckAudioJobResponse> genForcheckAudioJob() {
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
            f -> f.withMarshaller(CheckAudioJobRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckVideoJobRequest, CheckVideoJobResponse> checkVideoJob =
        genForcheckVideoJob();

    private static HttpRequestDef<CheckVideoJobRequest, CheckVideoJobResponse> genForcheckVideoJob() {
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
            f -> f.withMarshaller(CheckVideoJobRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAudioJobRequest, CreateAudioJobResponse> createAudioJob =
        genForcreateAudioJob();

    private static HttpRequestDef<CreateAudioJobRequest, CreateAudioJobResponse> genForcreateAudioJob() {
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
            f -> f.withMarshaller(CreateAudioJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<CreateAudioJobResponseBody>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateAudioJobResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(CreateAudioJobResponseBody.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateVideoJobRequest, CreateVideoJobResponse> createVideoJob =
        genForcreateVideoJob();

    private static HttpRequestDef<CreateVideoJobRequest, CreateVideoJobResponse> genForcreateVideoJob() {
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
            f -> f.withMarshaller(CreateVideoJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<CreateVideoJobResponseBody>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateVideoJobResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(CreateVideoJobResponseBody.class));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDemoInfoRequest, DeleteDemoInfoResponse> deleteDemoInfo =
        genFordeleteDemoInfo();

    private static HttpRequestDef<DeleteDemoInfoRequest, DeleteDemoInfoResponse> genFordeleteDemoInfo() {
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
            f -> f.withMarshaller(DeleteDemoInfoRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVideoJobRequest, DeleteVideoJobResponse> deleteVideoJob =
        genFordeleteVideoJob();

    private static HttpRequestDef<DeleteVideoJobRequest, DeleteVideoJobResponse> genFordeleteVideoJob() {
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
            f -> f.withMarshaller(DeleteVideoJobRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAudioJobsRequest, ListAudioJobsResponse> listAudioJobs =
        genForlistAudioJobs();

    private static HttpRequestDef<ListAudioJobsRequest, ListAudioJobsResponse> genForlistAudioJobs() {
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
        genForlistVideoJobs();

    private static HttpRequestDef<ListVideoJobsRequest, ListVideoJobsResponse> genForlistVideoJobs() {
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
