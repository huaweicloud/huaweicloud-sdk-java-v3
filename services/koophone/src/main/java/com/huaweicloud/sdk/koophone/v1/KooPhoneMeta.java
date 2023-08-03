package com.huaweicloud.sdk.koophone.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.koophone.v1.model.AsyncInvokeInstanceRequest;
import com.huaweicloud.sdk.koophone.v1.model.AsyncInvokeInstanceResponse;
import com.huaweicloud.sdk.koophone.v1.model.BatchResetInstanceRequest;
import com.huaweicloud.sdk.koophone.v1.model.BatchResetInstanceResponse;
import com.huaweicloud.sdk.koophone.v1.model.BatchShowInstanceRequest;
import com.huaweicloud.sdk.koophone.v1.model.BatchShowInstanceResponse;
import com.huaweicloud.sdk.koophone.v1.model.ExecuteJobRequest;
import com.huaweicloud.sdk.koophone.v1.model.ExecuteJobResponse;
import com.huaweicloud.sdk.koophone.v1.model.InstanceAsyncCommandsReq;
import com.huaweicloud.sdk.koophone.v1.model.InstanceResetReq;
import com.huaweicloud.sdk.koophone.v1.model.InstanceStatusReq;
import com.huaweicloud.sdk.koophone.v1.model.InstanceSyncCommandsReq;
import com.huaweicloud.sdk.koophone.v1.model.InstanceVideoSettingReq;
import com.huaweicloud.sdk.koophone.v1.model.SetVideoRequest;
import com.huaweicloud.sdk.koophone.v1.model.SetVideoResponse;
import com.huaweicloud.sdk.koophone.v1.model.SyncInvokeInstanceRequest;
import com.huaweicloud.sdk.koophone.v1.model.SyncInvokeInstanceResponse;

@SuppressWarnings("unchecked")
public class KooPhoneMeta {

    public static final HttpRequestDef<AsyncInvokeInstanceRequest, AsyncInvokeInstanceResponse> asyncInvokeInstance =
        genForasyncInvokeInstance();

    private static HttpRequestDef<AsyncInvokeInstanceRequest, AsyncInvokeInstanceResponse> genForasyncInvokeInstance() {
        // basic
        HttpRequestDef.Builder<AsyncInvokeInstanceRequest, AsyncInvokeInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AsyncInvokeInstanceRequest.class, AsyncInvokeInstanceResponse.class)
                .withName("AsyncInvokeInstance")
                .withUri("/v1/instances/async-command")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("x-request-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AsyncInvokeInstanceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<InstanceAsyncCommandsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceAsyncCommandsReq.class),
            f -> f.withMarshaller(AsyncInvokeInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchResetInstanceRequest, BatchResetInstanceResponse> batchResetInstance =
        genForbatchResetInstance();

    private static HttpRequestDef<BatchResetInstanceRequest, BatchResetInstanceResponse> genForbatchResetInstance() {
        // basic
        HttpRequestDef.Builder<BatchResetInstanceRequest, BatchResetInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchResetInstanceRequest.class, BatchResetInstanceResponse.class)
                .withName("BatchResetInstance")
                .withUri("/v1/instances/batch-reset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("x-request-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchResetInstanceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<InstanceResetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceResetReq.class),
            f -> f.withMarshaller(BatchResetInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowInstanceRequest, BatchShowInstanceResponse> batchShowInstance =
        genForbatchShowInstance();

    private static HttpRequestDef<BatchShowInstanceRequest, BatchShowInstanceResponse> genForbatchShowInstance() {
        // basic
        HttpRequestDef.Builder<BatchShowInstanceRequest, BatchShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchShowInstanceRequest.class, BatchShowInstanceResponse.class)
                .withName("BatchShowInstance")
                .withUri("/v1/instances/batch-query-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("x-request-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowInstanceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<InstanceStatusReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceStatusReq.class),
            f -> f.withMarshaller(BatchShowInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteJobRequest, ExecuteJobResponse> executeJob = genForexecuteJob();

    private static HttpRequestDef<ExecuteJobRequest, ExecuteJobResponse> genForexecuteJob() {
        // basic
        HttpRequestDef.Builder<ExecuteJobRequest, ExecuteJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ExecuteJobRequest.class, ExecuteJobResponse.class)
                .withName("ExecuteJob")
                .withUri("/v1/instances/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteJobRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("x-request-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteJobRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetVideoRequest, SetVideoResponse> setVideo = genForsetVideo();

    private static HttpRequestDef<SetVideoRequest, SetVideoResponse> genForsetVideo() {
        // basic
        HttpRequestDef.Builder<SetVideoRequest, SetVideoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetVideoRequest.class, SetVideoResponse.class)
                .withName("SetVideo")
                .withUri("/v1/instances/video-setting")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("x-request-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetVideoRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<InstanceVideoSettingReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceVideoSettingReq.class),
            f -> f.withMarshaller(SetVideoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SyncInvokeInstanceRequest, SyncInvokeInstanceResponse> syncInvokeInstance =
        genForsyncInvokeInstance();

    private static HttpRequestDef<SyncInvokeInstanceRequest, SyncInvokeInstanceResponse> genForsyncInvokeInstance() {
        // basic
        HttpRequestDef.Builder<SyncInvokeInstanceRequest, SyncInvokeInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SyncInvokeInstanceRequest.class, SyncInvokeInstanceResponse.class)
                .withName("SyncInvokeInstance")
                .withUri("/v1/instances/sync-command")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("x-request-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SyncInvokeInstanceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<InstanceSyncCommandsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceSyncCommandsReq.class),
            f -> f.withMarshaller(SyncInvokeInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
