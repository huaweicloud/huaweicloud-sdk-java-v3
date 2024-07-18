package com.huaweicloud.sdk.codeartsgovernance.v1;

import com.huaweicloud.sdk.codeartsgovernance.v1.model.CreateSecAppTaskRequest;
import com.huaweicloud.sdk.codeartsgovernance.v1.model.CreateSecAppTaskRequestBody;
import com.huaweicloud.sdk.codeartsgovernance.v1.model.CreateSecAppTaskResponse;
import com.huaweicloud.sdk.codeartsgovernance.v1.model.DeleteSecAppTaskRequest;
import com.huaweicloud.sdk.codeartsgovernance.v1.model.DeleteSecAppTaskResponse;
import com.huaweicloud.sdk.codeartsgovernance.v1.model.ShowHmReportRequest;
import com.huaweicloud.sdk.codeartsgovernance.v1.model.ShowHmReportResponse;
import com.huaweicloud.sdk.codeartsgovernance.v1.model.ShowSecAppTaskResultRequest;
import com.huaweicloud.sdk.codeartsgovernance.v1.model.ShowSecAppTaskResultResponse;
import com.huaweicloud.sdk.codeartsgovernance.v1.model.ShowSecAppTaskStatusRequest;
import com.huaweicloud.sdk.codeartsgovernance.v1.model.ShowSecAppTaskStatusResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CodeArtsGovernanceMeta {

    public static final HttpRequestDef<CreateSecAppTaskRequest, CreateSecAppTaskResponse> createSecAppTask =
        genForCreateSecAppTask();

    private static HttpRequestDef<CreateSecAppTaskRequest, CreateSecAppTaskResponse> genForCreateSecAppTask() {
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
            f -> f.withMarshaller(CreateSecAppTaskRequest::getBody, CreateSecAppTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecAppTaskRequest, DeleteSecAppTaskResponse> deleteSecAppTask =
        genForDeleteSecAppTask();

    private static HttpRequestDef<DeleteSecAppTaskRequest, DeleteSecAppTaskResponse> genForDeleteSecAppTask() {
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
            f -> f.withMarshaller(DeleteSecAppTaskRequest::getTaskId, DeleteSecAppTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHmReportRequest, ShowHmReportResponse> showHmReport = genForShowHmReport();

    private static HttpRequestDef<ShowHmReportRequest, ShowHmReportResponse> genForShowHmReport() {
        // basic
        HttpRequestDef.Builder<ShowHmReportRequest, ShowHmReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHmReportRequest.class, ShowHmReportResponse.class)
                .withName("ShowHmReport")
                .withUri("/v1/{project_id}/secapp/oh-result")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHmReportRequest::getTaskId, ShowHmReportRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecAppTaskResultRequest, ShowSecAppTaskResultResponse> showSecAppTaskResult =
        genForShowSecAppTaskResult();

    private static HttpRequestDef<ShowSecAppTaskResultRequest, ShowSecAppTaskResultResponse> genForShowSecAppTaskResult() {
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
            f -> f.withMarshaller(ShowSecAppTaskResultRequest::getTaskId, ShowSecAppTaskResultRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecAppTaskStatusRequest, ShowSecAppTaskStatusResponse> showSecAppTaskStatus =
        genForShowSecAppTaskStatus();

    private static HttpRequestDef<ShowSecAppTaskStatusRequest, ShowSecAppTaskStatusResponse> genForShowSecAppTaskStatus() {
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
            f -> f.withMarshaller(ShowSecAppTaskStatusRequest::getTaskId, ShowSecAppTaskStatusRequest::setTaskId));

        // response

        return builder.build();
    }

}
