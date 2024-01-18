package com.huaweicloud.sdk.kps.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.kps.v3.model.AssociateKeypairRequest;
import com.huaweicloud.sdk.kps.v3.model.AssociateKeypairRequestBody;
import com.huaweicloud.sdk.kps.v3.model.AssociateKeypairResponse;
import com.huaweicloud.sdk.kps.v3.model.BatchAssociateKeypairRequest;
import com.huaweicloud.sdk.kps.v3.model.BatchAssociateKeypairRequestBody;
import com.huaweicloud.sdk.kps.v3.model.BatchAssociateKeypairResponse;
import com.huaweicloud.sdk.kps.v3.model.ClearPrivateKeyRequest;
import com.huaweicloud.sdk.kps.v3.model.ClearPrivateKeyResponse;
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
import com.huaweicloud.sdk.kps.v3.model.ExportPrivateKeyRequest;
import com.huaweicloud.sdk.kps.v3.model.ExportPrivateKeyRequestBody;
import com.huaweicloud.sdk.kps.v3.model.ExportPrivateKeyResponse;
import com.huaweicloud.sdk.kps.v3.model.ImportPrivateKeyRequest;
import com.huaweicloud.sdk.kps.v3.model.ImportPrivateKeyRequestBody;
import com.huaweicloud.sdk.kps.v3.model.ImportPrivateKeyResponse;
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
        genForAssociateKeypair();

    private static HttpRequestDef<AssociateKeypairRequest, AssociateKeypairResponse> genForAssociateKeypair() {
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
            f -> f.withMarshaller(AssociateKeypairRequest::getBody, AssociateKeypairRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAssociateKeypairRequest, BatchAssociateKeypairResponse> batchAssociateKeypair =
        genForBatchAssociateKeypair();

    private static HttpRequestDef<BatchAssociateKeypairRequest, BatchAssociateKeypairResponse> genForBatchAssociateKeypair() {
        // basic
        HttpRequestDef.Builder<BatchAssociateKeypairRequest, BatchAssociateKeypairResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchAssociateKeypairRequest.class, BatchAssociateKeypairResponse.class)
            .withName("BatchAssociateKeypair")
            .withUri("/v3/{project_id}/keypairs/batch-associate")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchAssociateKeypairRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAssociateKeypairRequestBody.class),
            f -> f.withMarshaller(BatchAssociateKeypairRequest::getBody, BatchAssociateKeypairRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ClearPrivateKeyRequest, ClearPrivateKeyResponse> clearPrivateKey =
        genForClearPrivateKey();

    private static HttpRequestDef<ClearPrivateKeyRequest, ClearPrivateKeyResponse> genForClearPrivateKey() {
        // basic
        HttpRequestDef.Builder<ClearPrivateKeyRequest, ClearPrivateKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, ClearPrivateKeyRequest.class, ClearPrivateKeyResponse.class)
                .withName("ClearPrivateKey")
                .withUri("/v3/{project_id}/keypairs/{keypair_name}/private-key")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keypair_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ClearPrivateKeyRequest::getKeypairName, ClearPrivateKeyRequest::setKeypairName));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ClearPrivateKeyResponse::getBody, ClearPrivateKeyResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateKeypairRequest, CreateKeypairResponse> createKeypair =
        genForCreateKeypair();

    private static HttpRequestDef<CreateKeypairRequest, CreateKeypairResponse> genForCreateKeypair() {
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
            f -> f.withMarshaller(CreateKeypairRequest::getBody, CreateKeypairRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAllFailedTaskRequest, DeleteAllFailedTaskResponse> deleteAllFailedTask =
        genForDeleteAllFailedTask();

    private static HttpRequestDef<DeleteAllFailedTaskRequest, DeleteAllFailedTaskResponse> genForDeleteAllFailedTask() {
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
        genForDeleteFailedTask();

    private static HttpRequestDef<DeleteFailedTaskRequest, DeleteFailedTaskResponse> genForDeleteFailedTask() {
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
            f -> f.withMarshaller(DeleteFailedTaskRequest::getTaskId, DeleteFailedTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteKeypairRequest, DeleteKeypairResponse> deleteKeypair =
        genForDeleteKeypair();

    private static HttpRequestDef<DeleteKeypairRequest, DeleteKeypairResponse> genForDeleteKeypair() {
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
            f -> f.withMarshaller(DeleteKeypairRequest::getKeypairName, DeleteKeypairRequest::setKeypairName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateKeypairRequest, DisassociateKeypairResponse> disassociateKeypair =
        genForDisassociateKeypair();

    private static HttpRequestDef<DisassociateKeypairRequest, DisassociateKeypairResponse> genForDisassociateKeypair() {
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
            f -> f.withMarshaller(DisassociateKeypairRequest::getBody, DisassociateKeypairRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportPrivateKeyRequest, ExportPrivateKeyResponse> exportPrivateKey =
        genForExportPrivateKey();

    private static HttpRequestDef<ExportPrivateKeyRequest, ExportPrivateKeyResponse> genForExportPrivateKey() {
        // basic
        HttpRequestDef.Builder<ExportPrivateKeyRequest, ExportPrivateKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportPrivateKeyRequest.class, ExportPrivateKeyResponse.class)
                .withName("ExportPrivateKey")
                .withUri("/v3/{project_id}/keypairs/private-key/export")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ExportPrivateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportPrivateKeyRequestBody.class),
            f -> f.withMarshaller(ExportPrivateKeyRequest::getBody, ExportPrivateKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportPrivateKeyRequest, ImportPrivateKeyResponse> importPrivateKey =
        genForImportPrivateKey();

    private static HttpRequestDef<ImportPrivateKeyRequest, ImportPrivateKeyResponse> genForImportPrivateKey() {
        // basic
        HttpRequestDef.Builder<ImportPrivateKeyRequest, ImportPrivateKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportPrivateKeyRequest.class, ImportPrivateKeyResponse.class)
                .withName("ImportPrivateKey")
                .withUri("/v3/{project_id}/keypairs/private-key/import")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ImportPrivateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportPrivateKeyRequestBody.class),
            f -> f.withMarshaller(ImportPrivateKeyRequest::getBody, ImportPrivateKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFailedTaskRequest, ListFailedTaskResponse> listFailedTask =
        genForListFailedTask();

    private static HttpRequestDef<ListFailedTaskRequest, ListFailedTaskResponse> genForListFailedTask() {
        // basic
        HttpRequestDef.Builder<ListFailedTaskRequest, ListFailedTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFailedTaskRequest.class, ListFailedTaskResponse.class)
                .withName("ListFailedTask")
                .withUri("/v3/{project_id}/failed-tasks")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFailedTaskRequest::getLimit, ListFailedTaskRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFailedTaskRequest::getOffset, ListFailedTaskRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKeypairDetailRequest, ListKeypairDetailResponse> listKeypairDetail =
        genForListKeypairDetail();

    private static HttpRequestDef<ListKeypairDetailRequest, ListKeypairDetailResponse> genForListKeypairDetail() {
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
            f -> f.withMarshaller(ListKeypairDetailRequest::getKeypairName, ListKeypairDetailRequest::setKeypairName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKeypairTaskRequest, ListKeypairTaskResponse> listKeypairTask =
        genForListKeypairTask();

    private static HttpRequestDef<ListKeypairTaskRequest, ListKeypairTaskResponse> genForListKeypairTask() {
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
            f -> f.withMarshaller(ListKeypairTaskRequest::getTaskId, ListKeypairTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKeypairsRequest, ListKeypairsResponse> listKeypairs = genForListKeypairs();

    private static HttpRequestDef<ListKeypairsRequest, ListKeypairsResponse> genForListKeypairs() {
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
            f -> f.withMarshaller(ListKeypairsRequest::getLimit, ListKeypairsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKeypairsRequest::getMarker, ListKeypairsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRunningTaskRequest, ListRunningTaskResponse> listRunningTask =
        genForListRunningTask();

    private static HttpRequestDef<ListRunningTaskRequest, ListRunningTaskResponse> genForListRunningTask() {
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
            f -> f.withMarshaller(ListRunningTaskRequest::getLimit, ListRunningTaskRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRunningTaskRequest::getOffset, ListRunningTaskRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKeypairDescriptionRequest, UpdateKeypairDescriptionResponse> updateKeypairDescription =
        genForUpdateKeypairDescription();

    private static HttpRequestDef<UpdateKeypairDescriptionRequest, UpdateKeypairDescriptionResponse> genForUpdateKeypairDescription() {
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
            f -> f.withMarshaller(UpdateKeypairDescriptionRequest::getKeypairName,
                UpdateKeypairDescriptionRequest::setKeypairName));
        builder.<UpdateKeypairDescriptionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateKeypairDescriptionRequestBody.class),
            f -> f.withMarshaller(UpdateKeypairDescriptionRequest::getBody, UpdateKeypairDescriptionRequest::setBody));

        // response

        return builder.build();
    }

}
