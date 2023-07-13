package com.huaweicloud.sdk.devsecurity.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.devsecurity.v1.model.CreateSecAppTaskRequest;
import com.huaweicloud.sdk.devsecurity.v1.model.CreateSecAppTaskRequestBody;
import com.huaweicloud.sdk.devsecurity.v1.model.CreateSecAppTaskResponse;
import com.huaweicloud.sdk.devsecurity.v1.model.DeleteSecAppTaskRequest;
import com.huaweicloud.sdk.devsecurity.v1.model.DeleteSecAppTaskResponse;
import com.huaweicloud.sdk.devsecurity.v1.model.ShowSecAppTaskResultRequest;
import com.huaweicloud.sdk.devsecurity.v1.model.ShowSecAppTaskResultResponse;
import com.huaweicloud.sdk.devsecurity.v1.model.ShowSecAppTaskStatusRequest;
import com.huaweicloud.sdk.devsecurity.v1.model.ShowSecAppTaskStatusResponse;

@SuppressWarnings("unchecked")
public class DevSecurityMeta {

    public static final HttpRequestDef<CreateSecAppTaskRequest, CreateSecAppTaskResponse> createSecAppTask =
        genForcreateSecAppTask();

    private static HttpRequestDef<CreateSecAppTaskRequest, CreateSecAppTaskResponse> genForcreateSecAppTask() {
        // basic
        HttpRequestDef.Builder<CreateSecAppTaskRequest, CreateSecAppTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSecAppTaskRequest.class, CreateSecAppTaskResponse.class)
                .withName("CreateSecAppTask")
                .withUri("/v1/{project_id}/secapp/task")
                .withContentType("multipart/form-data");

        // requests
        builder.<CreateSecAppTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSecAppTaskRequestBody.class),
            f -> f.withMarshaller(CreateSecAppTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecAppTaskRequest, DeleteSecAppTaskResponse> deleteSecAppTask =
        genFordeleteSecAppTask();

    private static HttpRequestDef<DeleteSecAppTaskRequest, DeleteSecAppTaskResponse> genFordeleteSecAppTask() {
        // basic
        HttpRequestDef.Builder<DeleteSecAppTaskRequest, DeleteSecAppTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSecAppTaskRequest.class, DeleteSecAppTaskResponse.class)
                .withName("DeleteSecAppTask")
                .withUri("/v1/{project_id}/secapp/task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecAppTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecAppTaskResultRequest, ShowSecAppTaskResultResponse> showSecAppTaskResult =
        genForshowSecAppTaskResult();

    private static HttpRequestDef<ShowSecAppTaskResultRequest, ShowSecAppTaskResultResponse> genForshowSecAppTaskResult() {
        // basic
        HttpRequestDef.Builder<ShowSecAppTaskResultRequest, ShowSecAppTaskResultResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSecAppTaskResultRequest.class, ShowSecAppTaskResultResponse.class)
            .withName("ShowSecAppTaskResult")
            .withUri("/v1/{project_id}/secapp/task-result")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecAppTaskResultRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecAppTaskStatusRequest, ShowSecAppTaskStatusResponse> showSecAppTaskStatus =
        genForshowSecAppTaskStatus();

    private static HttpRequestDef<ShowSecAppTaskStatusRequest, ShowSecAppTaskStatusResponse> genForshowSecAppTaskStatus() {
        // basic
        HttpRequestDef.Builder<ShowSecAppTaskStatusRequest, ShowSecAppTaskStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSecAppTaskStatusRequest.class, ShowSecAppTaskStatusResponse.class)
            .withName("ShowSecAppTaskStatus")
            .withUri("/v1/{project_id}/secapp/task-status")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecAppTaskStatusRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

}
