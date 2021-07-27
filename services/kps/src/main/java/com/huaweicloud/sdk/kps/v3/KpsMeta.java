package com.huaweicloud.sdk.kps.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.kps.v3.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class KpsMeta {

    public static final HttpRequestDef<AssociateKeypairRequest, AssociateKeypairResponse> associateKeypair = genForassociateKeypair();

    private static HttpRequestDef<AssociateKeypairRequest, AssociateKeypairResponse> genForassociateKeypair() {
        // basic
        HttpRequestDef.Builder<AssociateKeypairRequest, AssociateKeypairResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateKeypairRequest.class, AssociateKeypairResponse.class)
                .withName("AssociateKeypair")
                .withUri("/v3/{project_id}/keypairs/associate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AssociateKeypairRequestBody.class,
            f -> f.withMarshaller(AssociateKeypairRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateKeypairRequest, CreateKeypairResponse> createKeypair = genForcreateKeypair();

    private static HttpRequestDef<CreateKeypairRequest, CreateKeypairResponse> genForcreateKeypair() {
        // basic
        HttpRequestDef.Builder<CreateKeypairRequest, CreateKeypairResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateKeypairRequest.class, CreateKeypairResponse.class)
                .withName("CreateKeypair")
                .withUri("/v3/{project_id}/keypairs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateKeypairRequestBody.class,
            f -> f.withMarshaller(CreateKeypairRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteAllFailedTaskRequest, DeleteAllFailedTaskResponse> deleteAllFailedTask = genFordeleteAllFailedTask();

    private static HttpRequestDef<DeleteAllFailedTaskRequest, DeleteAllFailedTaskResponse> genFordeleteAllFailedTask() {
        // basic
        HttpRequestDef.Builder<DeleteAllFailedTaskRequest, DeleteAllFailedTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAllFailedTaskRequest.class, DeleteAllFailedTaskResponse.class)
                .withName("DeleteAllFailedTask")
                .withUri("/v3/{project_id}/failed-tasks")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteFailedTaskRequest, DeleteFailedTaskResponse> deleteFailedTask = genFordeleteFailedTask();

    private static HttpRequestDef<DeleteFailedTaskRequest, DeleteFailedTaskResponse> genFordeleteFailedTask() {
        // basic
        HttpRequestDef.Builder<DeleteFailedTaskRequest, DeleteFailedTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFailedTaskRequest.class, DeleteFailedTaskResponse.class)
                .withName("DeleteFailedTask")
                .withUri("/v3/{project_id}/failed-tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteFailedTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteKeypairRequest, DeleteKeypairResponse> deleteKeypair = genFordeleteKeypair();

    private static HttpRequestDef<DeleteKeypairRequest, DeleteKeypairResponse> genFordeleteKeypair() {
        // basic
        HttpRequestDef.Builder<DeleteKeypairRequest, DeleteKeypairResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteKeypairRequest.class, DeleteKeypairResponse.class)
                .withName("DeleteKeypair")
                .withUri("/v3/{project_id}/keypairs/{keypair_name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("keypair_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteKeypairRequest::getKeypairName, (req, v) -> {
                req.setKeypairName(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DisassociateKeypairRequest, DisassociateKeypairResponse> disassociateKeypair = genFordisassociateKeypair();

    private static HttpRequestDef<DisassociateKeypairRequest, DisassociateKeypairResponse> genFordisassociateKeypair() {
        // basic
        HttpRequestDef.Builder<DisassociateKeypairRequest, DisassociateKeypairResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisassociateKeypairRequest.class, DisassociateKeypairResponse.class)
                .withName("DisassociateKeypair")
                .withUri("/v3/{project_id}/keypairs/disassociate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DisassociateKeypairRequestBody.class,
            f -> f.withMarshaller(DisassociateKeypairRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListFailedTaskRequest, ListFailedTaskResponse> listFailedTask = genForlistFailedTask();

    private static HttpRequestDef<ListFailedTaskRequest, ListFailedTaskResponse> genForlistFailedTask() {
        // basic
        HttpRequestDef.Builder<ListFailedTaskRequest, ListFailedTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFailedTaskRequest.class, ListFailedTaskResponse.class)
                .withName("ListFailedTask")
                .withUri("/v3/{project_id}/failed-tasks")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListKeypairDetailRequest, ListKeypairDetailResponse> listKeypairDetail = genForlistKeypairDetail();

    private static HttpRequestDef<ListKeypairDetailRequest, ListKeypairDetailResponse> genForlistKeypairDetail() {
        // basic
        HttpRequestDef.Builder<ListKeypairDetailRequest, ListKeypairDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListKeypairDetailRequest.class, ListKeypairDetailResponse.class)
                .withName("ListKeypairDetail")
                .withUri("/v3/{project_id}/keypairs/{keypair_name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("keypair_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListKeypairDetailRequest::getKeypairName, (req, v) -> {
                req.setKeypairName(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListKeypairTaskRequest, ListKeypairTaskResponse> listKeypairTask = genForlistKeypairTask();

    private static HttpRequestDef<ListKeypairTaskRequest, ListKeypairTaskResponse> genForlistKeypairTask() {
        // basic
        HttpRequestDef.Builder<ListKeypairTaskRequest, ListKeypairTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListKeypairTaskRequest.class, ListKeypairTaskResponse.class)
                .withName("ListKeypairTask")
                .withUri("/v3/{project_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListKeypairTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

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

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListRunningTaskRequest, ListRunningTaskResponse> listRunningTask = genForlistRunningTask();

    private static HttpRequestDef<ListRunningTaskRequest, ListRunningTaskResponse> genForlistRunningTask() {
        // basic
        HttpRequestDef.Builder<ListRunningTaskRequest, ListRunningTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRunningTaskRequest.class, ListRunningTaskResponse.class)
                .withName("ListRunningTask")
                .withUri("/v3/{project_id}/running-tasks")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateKeypairDescriptionRequest, UpdateKeypairDescriptionResponse> updateKeypairDescription = genForupdateKeypairDescription();

    private static HttpRequestDef<UpdateKeypairDescriptionRequest, UpdateKeypairDescriptionResponse> genForupdateKeypairDescription() {
        // basic
        HttpRequestDef.Builder<UpdateKeypairDescriptionRequest, UpdateKeypairDescriptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateKeypairDescriptionRequest.class, UpdateKeypairDescriptionResponse.class)
                .withName("UpdateKeypairDescription")
                .withUri("/v3/{project_id}/keypairs/{keypair_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("keypair_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateKeypairDescriptionRequest::getKeypairName, (req, v) -> {
                req.setKeypairName(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateKeypairDescriptionRequestBody.class,
            f -> f.withMarshaller(UpdateKeypairDescriptionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}
