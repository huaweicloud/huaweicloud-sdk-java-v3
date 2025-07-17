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
import com.huaweicloud.sdk.koophone.v1.model.BatchShowSkuRequest;
import com.huaweicloud.sdk.koophone.v1.model.BatchShowSkuResponse;
import com.huaweicloud.sdk.koophone.v1.model.CancelInstanceRequest;
import com.huaweicloud.sdk.koophone.v1.model.CancelInstanceResponse;
import com.huaweicloud.sdk.koophone.v1.model.CreateInstanceRequest;
import com.huaweicloud.sdk.koophone.v1.model.CreateInstanceResponse;
import com.huaweicloud.sdk.koophone.v1.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.koophone.v1.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.koophone.v1.model.ExecuteInstanceAuthTokenRequest;
import com.huaweicloud.sdk.koophone.v1.model.ExecuteInstanceAuthTokenResponse;
import com.huaweicloud.sdk.koophone.v1.model.ExecuteJobRequest;
import com.huaweicloud.sdk.koophone.v1.model.ExecuteJobResponse;
import com.huaweicloud.sdk.koophone.v1.model.InstanceAssignReq;
import com.huaweicloud.sdk.koophone.v1.model.InstanceAsyncCommandsReq;
import com.huaweicloud.sdk.koophone.v1.model.InstanceCreateReq;
import com.huaweicloud.sdk.koophone.v1.model.InstanceDeleteRequest;
import com.huaweicloud.sdk.koophone.v1.model.InstanceResetReq;
import com.huaweicloud.sdk.koophone.v1.model.InstanceStatusReq;
import com.huaweicloud.sdk.koophone.v1.model.InstanceSyncCommandsReq;
import com.huaweicloud.sdk.koophone.v1.model.InstanceUnassignReq;
import com.huaweicloud.sdk.koophone.v1.model.InstanceVideoSettingReq;
import com.huaweicloud.sdk.koophone.v1.model.ProvisionInstanceRequest;
import com.huaweicloud.sdk.koophone.v1.model.ProvisionInstanceResponse;
import com.huaweicloud.sdk.koophone.v1.model.SetVideoRequest;
import com.huaweicloud.sdk.koophone.v1.model.SetVideoResponse;
import com.huaweicloud.sdk.koophone.v1.model.SyncInvokeInstanceRequest;
import com.huaweicloud.sdk.koophone.v1.model.SyncInvokeInstanceResponse;

@SuppressWarnings("unchecked")
public class KooPhoneMeta {

    public static final HttpRequestDef<AsyncInvokeInstanceRequest, AsyncInvokeInstanceResponse> asyncInvokeInstance =
        genForAsyncInvokeInstance();

    private static HttpRequestDef<AsyncInvokeInstanceRequest, AsyncInvokeInstanceResponse> genForAsyncInvokeInstance() {
        // basic
        HttpRequestDef.Builder<AsyncInvokeInstanceRequest, AsyncInvokeInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AsyncInvokeInstanceRequest.class, AsyncInvokeInstanceResponse.class)
                .withName("AsyncInvokeInstance")
                .withUri("/v1/instances/async-command")
                .withContentType("application/json");

        // requests
        builder.<InstanceAsyncCommandsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceAsyncCommandsReq.class),
            f -> f.withMarshaller(AsyncInvokeInstanceRequest::getBody, AsyncInvokeInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchResetInstanceRequest, BatchResetInstanceResponse> batchResetInstance =
        genForBatchResetInstance();

    private static HttpRequestDef<BatchResetInstanceRequest, BatchResetInstanceResponse> genForBatchResetInstance() {
        // basic
        HttpRequestDef.Builder<BatchResetInstanceRequest, BatchResetInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchResetInstanceRequest.class, BatchResetInstanceResponse.class)
                .withName("BatchResetInstance")
                .withUri("/v1/instances/batch-reset")
                .withContentType("application/json");

        // requests
        builder.<InstanceResetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceResetReq.class),
            f -> f.withMarshaller(BatchResetInstanceRequest::getBody, BatchResetInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowInstanceRequest, BatchShowInstanceResponse> batchShowInstance =
        genForBatchShowInstance();

    private static HttpRequestDef<BatchShowInstanceRequest, BatchShowInstanceResponse> genForBatchShowInstance() {
        // basic
        HttpRequestDef.Builder<BatchShowInstanceRequest, BatchShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchShowInstanceRequest.class, BatchShowInstanceResponse.class)
                .withName("BatchShowInstance")
                .withUri("/v1/instances/batch-query-status")
                .withContentType("application/json");

        // requests
        builder.<InstanceStatusReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceStatusReq.class),
            f -> f.withMarshaller(BatchShowInstanceRequest::getBody, BatchShowInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowSkuRequest, BatchShowSkuResponse> batchShowSku = genForBatchShowSku();

    private static HttpRequestDef<BatchShowSkuRequest, BatchShowSkuResponse> genForBatchShowSku() {
        // basic
        HttpRequestDef.Builder<BatchShowSkuRequest, BatchShowSkuResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, BatchShowSkuRequest.class, BatchShowSkuResponse.class)
                .withName("BatchShowSku")
                .withUri("/v1/instances/sku")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowSkuRequest::getType, BatchShowSkuRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelInstanceRequest, CancelInstanceResponse> cancelInstance =
        genForCancelInstance();

    private static HttpRequestDef<CancelInstanceRequest, CancelInstanceResponse> genForCancelInstance() {
        // basic
        HttpRequestDef.Builder<CancelInstanceRequest, CancelInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelInstanceRequest.class, CancelInstanceResponse.class)
                .withName("CancelInstance")
                .withUri("/v1/instances/unassign")
                .withContentType("application/json");

        // requests
        builder.<InstanceUnassignReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceUnassignReq.class),
            f -> f.withMarshaller(CancelInstanceRequest::getBody, CancelInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForCreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForCreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v1/instances/create")
                .withContentType("application/json");

        // requests
        builder.<InstanceCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceCreateReq.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, CreateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genForDeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genForDeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v1/instances/delete")
                .withContentType("application/json");

        // requests
        builder.<InstanceDeleteRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceDeleteRequest.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getBody, DeleteInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteInstanceAuthTokenRequest, ExecuteInstanceAuthTokenResponse> executeInstanceAuthToken =
        genForExecuteInstanceAuthToken();

    private static HttpRequestDef<ExecuteInstanceAuthTokenRequest, ExecuteInstanceAuthTokenResponse> genForExecuteInstanceAuthToken() {
        // basic
        HttpRequestDef.Builder<ExecuteInstanceAuthTokenRequest, ExecuteInstanceAuthTokenResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ExecuteInstanceAuthTokenRequest.class, ExecuteInstanceAuthTokenResponse.class)
                .withName("ExecuteInstanceAuthToken")
                .withUri("/v1/instances/{instance_id}/auth")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteInstanceAuthTokenRequest::getInstanceId,
                ExecuteInstanceAuthTokenRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteJobRequest, ExecuteJobResponse> executeJob = genForExecuteJob();

    private static HttpRequestDef<ExecuteJobRequest, ExecuteJobResponse> genForExecuteJob() {
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
            f -> f.withMarshaller(ExecuteJobRequest::getTaskId, ExecuteJobRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ProvisionInstanceRequest, ProvisionInstanceResponse> provisionInstance =
        genForProvisionInstance();

    private static HttpRequestDef<ProvisionInstanceRequest, ProvisionInstanceResponse> genForProvisionInstance() {
        // basic
        HttpRequestDef.Builder<ProvisionInstanceRequest, ProvisionInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ProvisionInstanceRequest.class, ProvisionInstanceResponse.class)
                .withName("ProvisionInstance")
                .withUri("/v1/instances/assign")
                .withContentType("application/json");

        // requests
        builder.<InstanceAssignReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceAssignReq.class),
            f -> f.withMarshaller(ProvisionInstanceRequest::getBody, ProvisionInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetVideoRequest, SetVideoResponse> setVideo = genForSetVideo();

    private static HttpRequestDef<SetVideoRequest, SetVideoResponse> genForSetVideo() {
        // basic
        HttpRequestDef.Builder<SetVideoRequest, SetVideoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetVideoRequest.class, SetVideoResponse.class)
                .withName("SetVideo")
                .withUri("/v1/instances/video-setting")
                .withContentType("application/json");

        // requests
        builder.<InstanceVideoSettingReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceVideoSettingReq.class),
            f -> f.withMarshaller(SetVideoRequest::getBody, SetVideoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SyncInvokeInstanceRequest, SyncInvokeInstanceResponse> syncInvokeInstance =
        genForSyncInvokeInstance();

    private static HttpRequestDef<SyncInvokeInstanceRequest, SyncInvokeInstanceResponse> genForSyncInvokeInstance() {
        // basic
        HttpRequestDef.Builder<SyncInvokeInstanceRequest, SyncInvokeInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SyncInvokeInstanceRequest.class, SyncInvokeInstanceResponse.class)
                .withName("SyncInvokeInstance")
                .withUri("/v1/instances/sync-command")
                .withContentType("application/json");

        // requests
        builder.<InstanceSyncCommandsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceSyncCommandsReq.class),
            f -> f.withMarshaller(SyncInvokeInstanceRequest::getBody, SyncInvokeInstanceRequest::setBody));

        // response

        return builder.build();
    }

}
