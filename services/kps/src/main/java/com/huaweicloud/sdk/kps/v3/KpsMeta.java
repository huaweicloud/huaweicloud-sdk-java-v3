package com.huaweicloud.sdk.kps.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.kps.v3.model.AssociateKeypairRequest;
import com.huaweicloud.sdk.kps.v3.model.AssociateKeypairRequestBody;
import com.huaweicloud.sdk.kps.v3.model.AssociateKeypairResponse;
import com.huaweicloud.sdk.kps.v3.model.CreateKeypairRequest;
import com.huaweicloud.sdk.kps.v3.model.CreateKeypairRequestBody;
import com.huaweicloud.sdk.kps.v3.model.CreateKeypairResponse;
import com.huaweicloud.sdk.kps.v3.model.DeleteAllFailedTaskRequest;
import com.huaweicloud.sdk.kps.v3.model.DeleteAllFailedTaskResponse;
import com.huaweicloud.sdk.kps.v3.model.DeleteFailedTaskRequest;
import com.huaweicloud.sdk.kps.v3.model.DeleteFailedTaskResponse;
import com.huaweicloud.sdk.kps.v3.model.DeleteKeypairRequest;
import com.huaweicloud.sdk.kps.v3.model.DeleteKeypairResponse;
import com.huaweicloud.sdk.kps.v3.model.DisassociateKeypairRequest;
import com.huaweicloud.sdk.kps.v3.model.DisassociateKeypairRequestBody;
import com.huaweicloud.sdk.kps.v3.model.DisassociateKeypairResponse;
import com.huaweicloud.sdk.kps.v3.model.ListFailedTaskRequest;
import com.huaweicloud.sdk.kps.v3.model.ListFailedTaskResponse;
import com.huaweicloud.sdk.kps.v3.model.ListKeypairDetailRequest;
import com.huaweicloud.sdk.kps.v3.model.ListKeypairDetailResponse;
import com.huaweicloud.sdk.kps.v3.model.ListKeypairTaskRequest;
import com.huaweicloud.sdk.kps.v3.model.ListKeypairTaskResponse;
import com.huaweicloud.sdk.kps.v3.model.ListKeypairsRequest;
import com.huaweicloud.sdk.kps.v3.model.ListKeypairsResponse;
import com.huaweicloud.sdk.kps.v3.model.ListRunningTaskRequest;
import com.huaweicloud.sdk.kps.v3.model.ListRunningTaskResponse;
import com.huaweicloud.sdk.kps.v3.model.UpdateKeypairDescriptionRequest;
import com.huaweicloud.sdk.kps.v3.model.UpdateKeypairDescriptionRequestBody;
import com.huaweicloud.sdk.kps.v3.model.UpdateKeypairDescriptionResponse;

@SuppressWarnings("unchecked")
public class KpsMeta {

    public static final HttpRequestDef<AssociateKeypairRequest, AssociateKeypairResponse> associateKeypair =
        genForassociateKeypair();

    private static HttpRequestDef<AssociateKeypairRequest, AssociateKeypairResponse> genForassociateKeypair() {
        // basic
        HttpRequestDef.Builder<AssociateKeypairRequest, AssociateKeypairResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateKeypairRequest.class, AssociateKeypairResponse.class)
                .withName("AssociateKeypair")
                .withUri("/v3/{project_id}/keypairs/associate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<AssociateKeypairRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateKeypairRequestBody.class),
            f -> f.withMarshaller(AssociateKeypairRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateKeypairRequest, CreateKeypairResponse> createKeypair =
        genForcreateKeypair();

    private static HttpRequestDef<CreateKeypairRequest, CreateKeypairResponse> genForcreateKeypair() {
        // basic
        HttpRequestDef.Builder<CreateKeypairRequest, CreateKeypairResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateKeypairRequest.class, CreateKeypairResponse.class)
                .withName("CreateKeypair")
                .withUri("/v3/{project_id}/keypairs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateKeypairRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateKeypairRequestBody.class),
            f -> f.withMarshaller(CreateKeypairRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAllFailedTaskRequest, DeleteAllFailedTaskResponse> deleteAllFailedTask =
        genFordeleteAllFailedTask();

    private static HttpRequestDef<DeleteAllFailedTaskRequest, DeleteAllFailedTaskResponse> genFordeleteAllFailedTask() {
        // basic
        HttpRequestDef.Builder<DeleteAllFailedTaskRequest, DeleteAllFailedTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAllFailedTaskRequest.class, DeleteAllFailedTaskResponse.class)
            .withName("DeleteAllFailedTask")
            .withUri("/v3/{project_id}/failed-tasks")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFailedTaskRequest, DeleteFailedTaskResponse> deleteFailedTask =
        genFordeleteFailedTask();

    private static HttpRequestDef<DeleteFailedTaskRequest, DeleteFailedTaskResponse> genFordeleteFailedTask() {
        // basic
        HttpRequestDef.Builder<DeleteFailedTaskRequest, DeleteFailedTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFailedTaskRequest.class, DeleteFailedTaskResponse.class)
                .withName("DeleteFailedTask")
                .withUri("/v3/{project_id}/failed-tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFailedTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteKeypairRequest, DeleteKeypairResponse> deleteKeypair =
        genFordeleteKeypair();

    private static HttpRequestDef<DeleteKeypairRequest, DeleteKeypairResponse> genFordeleteKeypair() {
        // basic
        HttpRequestDef.Builder<DeleteKeypairRequest, DeleteKeypairResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteKeypairRequest.class, DeleteKeypairResponse.class)
                .withName("DeleteKeypair")
                .withUri("/v3/{project_id}/keypairs/{keypair_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keypair_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKeypairRequest::getKeypairName, (req, v) -> {
                req.setKeypairName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateKeypairRequest, DisassociateKeypairResponse> disassociateKeypair =
        genFordisassociateKeypair();

    private static HttpRequestDef<DisassociateKeypairRequest, DisassociateKeypairResponse> genFordisassociateKeypair() {
        // basic
        HttpRequestDef.Builder<DisassociateKeypairRequest, DisassociateKeypairResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisassociateKeypairRequest.class, DisassociateKeypairResponse.class)
                .withName("DisassociateKeypair")
                .withUri("/v3/{project_id}/keypairs/disassociate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DisassociateKeypairRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociateKeypairRequestBody.class),
            f -> f.withMarshaller(DisassociateKeypairRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFailedTaskRequest, ListFailedTaskResponse> listFailedTask =
        genForlistFailedTask();

    private static HttpRequestDef<ListFailedTaskRequest, ListFailedTaskResponse> genForlistFailedTask() {
        // basic
        HttpRequestDef.Builder<ListFailedTaskRequest, ListFailedTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFailedTaskRequest.class, ListFailedTaskResponse.class)
                .withName("ListFailedTask")
                .withUri("/v3/{project_id}/failed-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFailedTaskRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFailedTaskRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKeypairDetailRequest, ListKeypairDetailResponse> listKeypairDetail =
        genForlistKeypairDetail();

    private static HttpRequestDef<ListKeypairDetailRequest, ListKeypairDetailResponse> genForlistKeypairDetail() {
        // basic
        HttpRequestDef.Builder<ListKeypairDetailRequest, ListKeypairDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListKeypairDetailRequest.class, ListKeypairDetailResponse.class)
                .withName("ListKeypairDetail")
                .withUri("/v3/{project_id}/keypairs/{keypair_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keypair_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKeypairDetailRequest::getKeypairName, (req, v) -> {
                req.setKeypairName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKeypairTaskRequest, ListKeypairTaskResponse> listKeypairTask =
        genForlistKeypairTask();

    private static HttpRequestDef<ListKeypairTaskRequest, ListKeypairTaskResponse> genForlistKeypairTask() {
        // basic
        HttpRequestDef.Builder<ListKeypairTaskRequest, ListKeypairTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListKeypairTaskRequest.class, ListKeypairTaskResponse.class)
                .withName("ListKeypairTask")
                .withUri("/v3/{project_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKeypairTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKeypairsRequest, ListKeypairsResponse> listKeypairs = genForlistKeypairs();

    private static HttpRequestDef<ListKeypairsRequest, ListKeypairsResponse> genForlistKeypairs() {
        // basic
        HttpRequestDef.Builder<ListKeypairsRequest, ListKeypairsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListKeypairsRequest.class, ListKeypairsResponse.class)
                .withName("ListKeypairs")
                .withUri("/v3/{project_id}/keypairs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKeypairsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKeypairsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRunningTaskRequest, ListRunningTaskResponse> listRunningTask =
        genForlistRunningTask();

    private static HttpRequestDef<ListRunningTaskRequest, ListRunningTaskResponse> genForlistRunningTask() {
        // basic
        HttpRequestDef.Builder<ListRunningTaskRequest, ListRunningTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRunningTaskRequest.class, ListRunningTaskResponse.class)
                .withName("ListRunningTask")
                .withUri("/v3/{project_id}/running-tasks")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRunningTaskRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRunningTaskRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKeypairDescriptionRequest, UpdateKeypairDescriptionResponse> updateKeypairDescription =
        genForupdateKeypairDescription();

    private static HttpRequestDef<UpdateKeypairDescriptionRequest, UpdateKeypairDescriptionResponse> genForupdateKeypairDescription() {
        // basic
        HttpRequestDef.Builder<UpdateKeypairDescriptionRequest, UpdateKeypairDescriptionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateKeypairDescriptionRequest.class, UpdateKeypairDescriptionResponse.class)
                .withName("UpdateKeypairDescription")
                .withUri("/v3/{project_id}/keypairs/{keypair_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("keypair_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKeypairDescriptionRequest::getKeypairName, (req, v) -> {
                req.setKeypairName(v);
            }));
        builder.<UpdateKeypairDescriptionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateKeypairDescriptionRequestBody.class),
            f -> f.withMarshaller(UpdateKeypairDescriptionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
