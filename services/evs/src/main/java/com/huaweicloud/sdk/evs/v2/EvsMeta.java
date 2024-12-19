package com.huaweicloud.sdk.evs.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.evs.v2.model.BatchCreateVolumeTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.BatchCreateVolumeTagsRequestBody;
import com.huaweicloud.sdk.evs.v2.model.BatchCreateVolumeTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.BatchDeleteVolumeTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.BatchDeleteVolumeTagsRequestBody;
import com.huaweicloud.sdk.evs.v2.model.BatchDeleteVolumeTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderAcceptVolumeTransferRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderAcceptVolumeTransferRequestBody;
import com.huaweicloud.sdk.evs.v2.model.CinderAcceptVolumeTransferResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderCreateVolumeTransferRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderCreateVolumeTransferRequestBody;
import com.huaweicloud.sdk.evs.v2.model.CinderCreateVolumeTransferResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderDeleteVolumeTransferRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderDeleteVolumeTransferResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderListAvailabilityZonesRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderListAvailabilityZonesResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderListQuotasRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderListQuotasResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderListVolumeTransfersRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderListVolumeTransfersResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderListVolumeTypesRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderListVolumeTypesResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderShowVolumeTransferRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderShowVolumeTransferResponse;
import com.huaweicloud.sdk.evs.v2.model.CreateSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.CreateSnapshotRequestBody;
import com.huaweicloud.sdk.evs.v2.model.CreateSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.CreateVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.CreateVolumeRequestBody;
import com.huaweicloud.sdk.evs.v2.model.CreateVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.DeleteSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.DeleteSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.DeleteVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.DeleteVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListVersionsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListVersionsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListVolumeTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListVolumeTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesByTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesByTagsRequestBody;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesByTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesRequest;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesResponse;
import com.huaweicloud.sdk.evs.v2.model.ModifyVolumeQoSRequest;
import com.huaweicloud.sdk.evs.v2.model.ModifyVolumeQoSRequestBody;
import com.huaweicloud.sdk.evs.v2.model.ModifyVolumeQoSResponse;
import com.huaweicloud.sdk.evs.v2.model.ResizeVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.ResizeVolumeRequestBody;
import com.huaweicloud.sdk.evs.v2.model.ResizeVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.RetypeVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.RetypeVolumeRequestBody;
import com.huaweicloud.sdk.evs.v2.model.RetypeVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.RollbackSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.RollbackSnapshotRequestBody;
import com.huaweicloud.sdk.evs.v2.model.RollbackSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowJobRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowJobResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowVersionRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowVersionResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowVolumeTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowVolumeTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.UnsubscribePostpaidVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.UnsubscribePostpaidVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.UnsubscribeVolumeRequestBody;
import com.huaweicloud.sdk.evs.v2.model.UnsubscribeVolumeResponseBody;
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotRequestBody;
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.UpdateVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.UpdateVolumeRequestBody;
import com.huaweicloud.sdk.evs.v2.model.UpdateVolumeResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class EvsMeta {

    public static final HttpRequestDef<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse> batchCreateVolumeTags =
        genForBatchCreateVolumeTags();

    private static HttpRequestDef<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse> genForBatchCreateVolumeTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateVolumeTagsRequest.class, BatchCreateVolumeTagsResponse.class)
            .withName("BatchCreateVolumeTags")
            .withUri("/v2/{project_id}/cloudvolumes/{volume_id}/tags/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateVolumeTagsRequest::getVolumeId,
                BatchCreateVolumeTagsRequest::setVolumeId));
        builder.<BatchCreateVolumeTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateVolumeTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateVolumeTagsRequest::getBody, BatchCreateVolumeTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse> batchDeleteVolumeTags =
        genForBatchDeleteVolumeTags();

    private static HttpRequestDef<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse> genForBatchDeleteVolumeTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteVolumeTagsRequest.class, BatchDeleteVolumeTagsResponse.class)
            .withName("BatchDeleteVolumeTags")
            .withUri("/v2/{project_id}/cloudvolumes/{volume_id}/tags/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteVolumeTagsRequest::getVolumeId,
                BatchDeleteVolumeTagsRequest::setVolumeId));
        builder.<BatchDeleteVolumeTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteVolumeTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteVolumeTagsRequest::getBody, BatchDeleteVolumeTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CinderAcceptVolumeTransferRequest, CinderAcceptVolumeTransferResponse> cinderAcceptVolumeTransfer =
        genForCinderAcceptVolumeTransfer();

    private static HttpRequestDef<CinderAcceptVolumeTransferRequest, CinderAcceptVolumeTransferResponse> genForCinderAcceptVolumeTransfer() {
        // basic
        HttpRequestDef.Builder<CinderAcceptVolumeTransferRequest, CinderAcceptVolumeTransferResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CinderAcceptVolumeTransferRequest.class,
                    CinderAcceptVolumeTransferResponse.class)
                .withName("CinderAcceptVolumeTransfer")
                .withUri("/v2/{project_id}/os-volume-transfer/{transfer_id}/accept")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("transfer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CinderAcceptVolumeTransferRequest::getTransferId,
                CinderAcceptVolumeTransferRequest::setTransferId));
        builder.<CinderAcceptVolumeTransferRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CinderAcceptVolumeTransferRequestBody.class),
            f -> f.withMarshaller(CinderAcceptVolumeTransferRequest::getBody,
                CinderAcceptVolumeTransferRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CinderCreateVolumeTransferRequest, CinderCreateVolumeTransferResponse> cinderCreateVolumeTransfer =
        genForCinderCreateVolumeTransfer();

    private static HttpRequestDef<CinderCreateVolumeTransferRequest, CinderCreateVolumeTransferResponse> genForCinderCreateVolumeTransfer() {
        // basic
        HttpRequestDef.Builder<CinderCreateVolumeTransferRequest, CinderCreateVolumeTransferResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CinderCreateVolumeTransferRequest.class,
                    CinderCreateVolumeTransferResponse.class)
                .withName("CinderCreateVolumeTransfer")
                .withUri("/v2/{project_id}/os-volume-transfer")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CinderCreateVolumeTransferRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CinderCreateVolumeTransferRequestBody.class),
            f -> f.withMarshaller(CinderCreateVolumeTransferRequest::getBody,
                CinderCreateVolumeTransferRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CinderDeleteVolumeTransferRequest, CinderDeleteVolumeTransferResponse> cinderDeleteVolumeTransfer =
        genForCinderDeleteVolumeTransfer();

    private static HttpRequestDef<CinderDeleteVolumeTransferRequest, CinderDeleteVolumeTransferResponse> genForCinderDeleteVolumeTransfer() {
        // basic
        HttpRequestDef.Builder<CinderDeleteVolumeTransferRequest, CinderDeleteVolumeTransferResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    CinderDeleteVolumeTransferRequest.class,
                    CinderDeleteVolumeTransferResponse.class)
                .withName("CinderDeleteVolumeTransfer")
                .withUri("/v2/{project_id}/os-volume-transfer/{transfer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("transfer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CinderDeleteVolumeTransferRequest::getTransferId,
                CinderDeleteVolumeTransferRequest::setTransferId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse> cinderListAvailabilityZones =
        genForCinderListAvailabilityZones();

    private static HttpRequestDef<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse> genForCinderListAvailabilityZones() {
        // basic
        HttpRequestDef.Builder<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    CinderListAvailabilityZonesRequest.class,
                    CinderListAvailabilityZonesResponse.class)
                .withName("CinderListAvailabilityZones")
                .withUri("/v2/{project_id}/os-availability-zone")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CinderListQuotasRequest, CinderListQuotasResponse> cinderListQuotas =
        genForCinderListQuotas();

    private static HttpRequestDef<CinderListQuotasRequest, CinderListQuotasResponse> genForCinderListQuotas() {
        // basic
        HttpRequestDef.Builder<CinderListQuotasRequest, CinderListQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CinderListQuotasRequest.class, CinderListQuotasResponse.class)
                .withName("CinderListQuotas")
                .withUri("/v2/{project_id}/os-quota-sets/{target_project_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("target_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CinderListQuotasRequest::getTargetProjectId,
                CinderListQuotasRequest::setTargetProjectId));
        builder.<CinderListQuotasRequest.UsageEnum>withRequestField("usage",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CinderListQuotasRequest.UsageEnum.class),
            f -> f.withMarshaller(CinderListQuotasRequest::getUsage, CinderListQuotasRequest::setUsage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CinderListVolumeTransfersRequest, CinderListVolumeTransfersResponse> cinderListVolumeTransfers =
        genForCinderListVolumeTransfers();

    private static HttpRequestDef<CinderListVolumeTransfersRequest, CinderListVolumeTransfersResponse> genForCinderListVolumeTransfers() {
        // basic
        HttpRequestDef.Builder<CinderListVolumeTransfersRequest, CinderListVolumeTransfersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    CinderListVolumeTransfersRequest.class,
                    CinderListVolumeTransfersResponse.class)
                .withName("CinderListVolumeTransfers")
                .withUri("/v2/{project_id}/os-volume-transfer")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CinderListVolumeTransfersRequest::getLimit,
                CinderListVolumeTransfersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CinderListVolumeTransfersRequest::getOffset,
                CinderListVolumeTransfersRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse> cinderListVolumeTypes =
        genForCinderListVolumeTypes();

    private static HttpRequestDef<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse> genForCinderListVolumeTypes() {
        // basic
        HttpRequestDef.Builder<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, CinderListVolumeTypesRequest.class, CinderListVolumeTypesResponse.class)
            .withName("CinderListVolumeTypes")
            .withUri("/v2/{project_id}/types")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CinderShowVolumeTransferRequest, CinderShowVolumeTransferResponse> cinderShowVolumeTransfer =
        genForCinderShowVolumeTransfer();

    private static HttpRequestDef<CinderShowVolumeTransferRequest, CinderShowVolumeTransferResponse> genForCinderShowVolumeTransfer() {
        // basic
        HttpRequestDef.Builder<CinderShowVolumeTransferRequest, CinderShowVolumeTransferResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, CinderShowVolumeTransferRequest.class, CinderShowVolumeTransferResponse.class)
                .withName("CinderShowVolumeTransfer")
                .withUri("/v2/{project_id}/os-volume-transfer/{transfer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("transfer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CinderShowVolumeTransferRequest::getTransferId,
                CinderShowVolumeTransferRequest::setTransferId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshot =
        genForCreateSnapshot();

    private static HttpRequestDef<CreateSnapshotRequest, CreateSnapshotResponse> genForCreateSnapshot() {
        // basic
        HttpRequestDef.Builder<CreateSnapshotRequest, CreateSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSnapshotRequest.class, CreateSnapshotResponse.class)
                .withName("CreateSnapshot")
                .withUri("/v2/{project_id}/cloudsnapshots")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateSnapshotRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSnapshotRequestBody.class),
            f -> f.withMarshaller(CreateSnapshotRequest::getBody, CreateSnapshotRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVolumeRequest, CreateVolumeResponse> createVolume = genForCreateVolume();

    private static HttpRequestDef<CreateVolumeRequest, CreateVolumeResponse> genForCreateVolume() {
        // basic
        HttpRequestDef.Builder<CreateVolumeRequest, CreateVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVolumeRequest.class, CreateVolumeResponse.class)
                .withName("CreateVolume")
                .withUri("/v2.1/{project_id}/cloudvolumes")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVolumeRequest::getXClientToken, CreateVolumeRequest::setXClientToken));
        builder.<CreateVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVolumeRequestBody.class),
            f -> f.withMarshaller(CreateVolumeRequest::getBody, CreateVolumeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshot =
        genForDeleteSnapshot();

    private static HttpRequestDef<DeleteSnapshotRequest, DeleteSnapshotResponse> genForDeleteSnapshot() {
        // basic
        HttpRequestDef.Builder<DeleteSnapshotRequest, DeleteSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSnapshotRequest.class, DeleteSnapshotResponse.class)
                .withName("DeleteSnapshot")
                .withUri("/v2/{project_id}/cloudsnapshots/{snapshot_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSnapshotRequest::getSnapshotId, DeleteSnapshotRequest::setSnapshotId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVolumeRequest, DeleteVolumeResponse> deleteVolume = genForDeleteVolume();

    private static HttpRequestDef<DeleteVolumeRequest, DeleteVolumeResponse> genForDeleteVolume() {
        // basic
        HttpRequestDef.Builder<DeleteVolumeRequest, DeleteVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVolumeRequest.class, DeleteVolumeResponse.class)
                .withName("DeleteVolume")
                .withUri("/v2/{project_id}/cloudvolumes/{volume_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVolumeRequest::getVolumeId, DeleteVolumeRequest::setVolumeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshots =
        genForListSnapshots();

    private static HttpRequestDef<ListSnapshotsRequest, ListSnapshotsResponse> genForListSnapshots() {
        // basic
        HttpRequestDef.Builder<ListSnapshotsRequest, ListSnapshotsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotsRequest.class, ListSnapshotsResponse.class)
                .withName("ListSnapshots")
                .withUri("/v2/{project_id}/cloudsnapshots/detail")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getOffset, ListSnapshotsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getLimit, ListSnapshotsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getName, ListSnapshotsRequest::setName));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getStatus, ListSnapshotsRequest::setStatus));
        builder.<String>withRequestField("volume_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getVolumeId, ListSnapshotsRequest::setVolumeId));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getAvailabilityZone,
                ListSnapshotsRequest::setAvailabilityZone));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getId, ListSnapshotsRequest::setId));
        builder.<String>withRequestField("dedicated_storage_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getDedicatedStorageName,
                ListSnapshotsRequest::setDedicatedStorageName));
        builder.<String>withRequestField("dedicated_storage_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getDedicatedStorageId,
                ListSnapshotsRequest::setDedicatedStorageId));
        builder.<String>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getServiceType, ListSnapshotsRequest::setServiceType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getEnterpriseProjectId,
                ListSnapshotsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVolumeTagsRequest, ListVolumeTagsResponse> listVolumeTags =
        genForListVolumeTags();

    private static HttpRequestDef<ListVolumeTagsRequest, ListVolumeTagsResponse> genForListVolumeTags() {
        // basic
        HttpRequestDef.Builder<ListVolumeTagsRequest, ListVolumeTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVolumeTagsRequest.class, ListVolumeTagsResponse.class)
                .withName("ListVolumeTags")
                .withUri("/v2/{project_id}/cloudvolumes/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVolumesRequest, ListVolumesResponse> listVolumes = genForListVolumes();

    private static HttpRequestDef<ListVolumesRequest, ListVolumesResponse> genForListVolumes() {
        // basic
        HttpRequestDef.Builder<ListVolumesRequest, ListVolumesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVolumesRequest.class, ListVolumesResponse.class)
                .withName("ListVolumes")
                .withUri("/v2/{project_id}/cloudvolumes/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getMarker, ListVolumesRequest::setMarker));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getName, ListVolumesRequest::setName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVolumesRequest::getLimit, ListVolumesRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getSortKey, ListVolumesRequest::setSortKey));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVolumesRequest::getOffset, ListVolumesRequest::setOffset));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getSortDir, ListVolumesRequest::setSortDir));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getStatus, ListVolumesRequest::setStatus));
        builder.<String>withRequestField("metadata",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getMetadata, ListVolumesRequest::setMetadata));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getAvailabilityZone, ListVolumesRequest::setAvailabilityZone));
        builder.<Boolean>withRequestField("multiattach",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListVolumesRequest::getMultiattach, ListVolumesRequest::setMultiattach));
        builder.<String>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getServiceType, ListVolumesRequest::setServiceType));
        builder.<String>withRequestField("dedicated_storage_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getDedicatedStorageId,
                ListVolumesRequest::setDedicatedStorageId));
        builder.<String>withRequestField("dedicated_storage_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getDedicatedStorageName,
                ListVolumesRequest::setDedicatedStorageName));
        builder.<String>withRequestField("volume_type_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getVolumeTypeId, ListVolumesRequest::setVolumeTypeId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getId, ListVolumesRequest::setId));
        builder.<String>withRequestField("ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getIds, ListVolumesRequest::setIds));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getEnterpriseProjectId,
                ListVolumesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getServerId, ListVolumesRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVolumesByTagsRequest, ListVolumesByTagsResponse> listVolumesByTags =
        genForListVolumesByTags();

    private static HttpRequestDef<ListVolumesByTagsRequest, ListVolumesByTagsResponse> genForListVolumesByTags() {
        // basic
        HttpRequestDef.Builder<ListVolumesByTagsRequest, ListVolumesByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListVolumesByTagsRequest.class, ListVolumesByTagsResponse.class)
                .withName("ListVolumesByTags")
                .withUri("/v2/{project_id}/cloudvolumes/resource_instances/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListVolumesByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListVolumesByTagsRequestBody.class),
            f -> f.withMarshaller(ListVolumesByTagsRequest::getBody, ListVolumesByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyVolumeQoSRequest, ModifyVolumeQoSResponse> modifyVolumeQoS =
        genForModifyVolumeQoS();

    private static HttpRequestDef<ModifyVolumeQoSRequest, ModifyVolumeQoSResponse> genForModifyVolumeQoS() {
        // basic
        HttpRequestDef.Builder<ModifyVolumeQoSRequest, ModifyVolumeQoSResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyVolumeQoSRequest.class, ModifyVolumeQoSResponse.class)
                .withName("ModifyVolumeQoS")
                .withUri("/v5/{project_id}/cloudvolumes/{volume_id}/qos")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyVolumeQoSRequest::getVolumeId, ModifyVolumeQoSRequest::setVolumeId));
        builder.<ModifyVolumeQoSRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyVolumeQoSRequestBody.class),
            f -> f.withMarshaller(ModifyVolumeQoSRequest::getBody, ModifyVolumeQoSRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeVolumeRequest, ResizeVolumeResponse> resizeVolume = genForResizeVolume();

    private static HttpRequestDef<ResizeVolumeRequest, ResizeVolumeResponse> genForResizeVolume() {
        // basic
        HttpRequestDef.Builder<ResizeVolumeRequest, ResizeVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeVolumeRequest.class, ResizeVolumeResponse.class)
                .withName("ResizeVolume")
                .withUri("/v2.1/{project_id}/cloudvolumes/{volume_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeVolumeRequest::getVolumeId, ResizeVolumeRequest::setVolumeId));
        builder.<ResizeVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeVolumeRequestBody.class),
            f -> f.withMarshaller(ResizeVolumeRequest::getBody, ResizeVolumeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetypeVolumeRequest, RetypeVolumeResponse> retypeVolume = genForRetypeVolume();

    private static HttpRequestDef<RetypeVolumeRequest, RetypeVolumeResponse> genForRetypeVolume() {
        // basic
        HttpRequestDef.Builder<RetypeVolumeRequest, RetypeVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RetypeVolumeRequest.class, RetypeVolumeResponse.class)
                .withName("RetypeVolume")
                .withUri("/v2/{project_id}/volumes/{volume_id}/retype")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetypeVolumeRequest::getVolumeId, RetypeVolumeRequest::setVolumeId));
        builder.<RetypeVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RetypeVolumeRequestBody.class),
            f -> f.withMarshaller(RetypeVolumeRequest::getBody, RetypeVolumeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RollbackSnapshotRequest, RollbackSnapshotResponse> rollbackSnapshot =
        genForRollbackSnapshot();

    private static HttpRequestDef<RollbackSnapshotRequest, RollbackSnapshotResponse> genForRollbackSnapshot() {
        // basic
        HttpRequestDef.Builder<RollbackSnapshotRequest, RollbackSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RollbackSnapshotRequest.class, RollbackSnapshotResponse.class)
                .withName("RollbackSnapshot")
                .withUri("/v2/{project_id}/cloudsnapshots/{snapshot_id}/rollback")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RollbackSnapshotRequest::getSnapshotId, RollbackSnapshotRequest::setSnapshotId));
        builder.<RollbackSnapshotRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RollbackSnapshotRequestBody.class),
            f -> f.withMarshaller(RollbackSnapshotRequest::getBody, RollbackSnapshotRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForShowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForShowJob() {
        // basic
        HttpRequestDef.Builder<ShowJobRequest, ShowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobRequest.class, ShowJobResponse.class)
                .withName("ShowJob")
                .withUri("/v1/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getJobId, ShowJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSnapshotRequest, ShowSnapshotResponse> showSnapshot = genForShowSnapshot();

    private static HttpRequestDef<ShowSnapshotRequest, ShowSnapshotResponse> genForShowSnapshot() {
        // basic
        HttpRequestDef.Builder<ShowSnapshotRequest, ShowSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSnapshotRequest.class, ShowSnapshotResponse.class)
                .withName("ShowSnapshot")
                .withUri("/v2/{project_id}/cloudsnapshots/{snapshot_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSnapshotRequest::getSnapshotId, ShowSnapshotRequest::setSnapshotId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVolumeRequest, ShowVolumeResponse> showVolume = genForShowVolume();

    private static HttpRequestDef<ShowVolumeRequest, ShowVolumeResponse> genForShowVolume() {
        // basic
        HttpRequestDef.Builder<ShowVolumeRequest, ShowVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVolumeRequest.class, ShowVolumeResponse.class)
                .withName("ShowVolume")
                .withUri("/v2/{project_id}/cloudvolumes/{volume_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVolumeRequest::getVolumeId, ShowVolumeRequest::setVolumeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVolumeTagsRequest, ShowVolumeTagsResponse> showVolumeTags =
        genForShowVolumeTags();

    private static HttpRequestDef<ShowVolumeTagsRequest, ShowVolumeTagsResponse> genForShowVolumeTags() {
        // basic
        HttpRequestDef.Builder<ShowVolumeTagsRequest, ShowVolumeTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVolumeTagsRequest.class, ShowVolumeTagsResponse.class)
                .withName("ShowVolumeTags")
                .withUri("/v2/{project_id}/cloudvolumes/{volume_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVolumeTagsRequest::getVolumeId, ShowVolumeTagsRequest::setVolumeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnsubscribePostpaidVolumeRequest, UnsubscribePostpaidVolumeResponse> unsubscribePostpaidVolume =
        genForUnsubscribePostpaidVolume();

    private static HttpRequestDef<UnsubscribePostpaidVolumeRequest, UnsubscribePostpaidVolumeResponse> genForUnsubscribePostpaidVolume() {
        // basic
        HttpRequestDef.Builder<UnsubscribePostpaidVolumeRequest, UnsubscribePostpaidVolumeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UnsubscribePostpaidVolumeRequest.class,
                    UnsubscribePostpaidVolumeResponse.class)
                .withName("UnsubscribePostpaidVolume")
                .withUri("/v2/{project_id}/cloudvolumes/unsubscribe")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UnsubscribeVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnsubscribeVolumeRequestBody.class),
            f -> f.withMarshaller(UnsubscribePostpaidVolumeRequest::getBody,
                UnsubscribePostpaidVolumeRequest::setBody));

        // response
        builder.<List<UnsubscribeVolumeResponseBody>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(UnsubscribePostpaidVolumeResponse::getBody, UnsubscribePostpaidVolumeResponse::setBody)
                .withInnerContainerType(UnsubscribeVolumeResponseBody.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSnapshotRequest, UpdateSnapshotResponse> updateSnapshot =
        genForUpdateSnapshot();

    private static HttpRequestDef<UpdateSnapshotRequest, UpdateSnapshotResponse> genForUpdateSnapshot() {
        // basic
        HttpRequestDef.Builder<UpdateSnapshotRequest, UpdateSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSnapshotRequest.class, UpdateSnapshotResponse.class)
                .withName("UpdateSnapshot")
                .withUri("/v2/{project_id}/cloudsnapshots/{snapshot_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSnapshotRequest::getSnapshotId, UpdateSnapshotRequest::setSnapshotId));
        builder.<UpdateSnapshotRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSnapshotRequestBody.class),
            f -> f.withMarshaller(UpdateSnapshotRequest::getBody, UpdateSnapshotRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVolumeRequest, UpdateVolumeResponse> updateVolume = genForUpdateVolume();

    private static HttpRequestDef<UpdateVolumeRequest, UpdateVolumeResponse> genForUpdateVolume() {
        // basic
        HttpRequestDef.Builder<UpdateVolumeRequest, UpdateVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVolumeRequest.class, UpdateVolumeResponse.class)
                .withName("UpdateVolume")
                .withUri("/v2/{project_id}/cloudvolumes/{volume_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVolumeRequest::getVolumeId, UpdateVolumeRequest::setVolumeId));
        builder.<UpdateVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVolumeRequestBody.class),
            f -> f.withMarshaller(UpdateVolumeRequest::getBody, UpdateVolumeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVersionsRequest, ListVersionsResponse> listVersions = genForListVersions();

    private static HttpRequestDef<ListVersionsRequest, ListVersionsResponse> genForListVersions() {
        // basic
        HttpRequestDef.Builder<ListVersionsRequest, ListVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVersionsRequest.class, ListVersionsResponse.class)
                .withName("ListVersions")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVersionRequest, ShowVersionResponse> showVersion = genForShowVersion();

    private static HttpRequestDef<ShowVersionRequest, ShowVersionResponse> genForShowVersion() {
        // basic
        HttpRequestDef.Builder<ShowVersionRequest, ShowVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVersionRequest.class, ShowVersionResponse.class)
                .withName("ShowVersion")
                .withUri("/{version}")
                .withContentType("application/json");

        // requests
        builder.<ShowVersionRequest.VersionEnum>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowVersionRequest.VersionEnum.class),
            f -> f.withMarshaller(ShowVersionRequest::getVersion, ShowVersionRequest::setVersion));

        // response

        return builder.build();
    }

}
