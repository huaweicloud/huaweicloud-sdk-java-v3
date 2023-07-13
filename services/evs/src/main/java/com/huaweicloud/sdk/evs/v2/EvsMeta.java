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
import com.huaweicloud.sdk.evs.v2.model.ResizeVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.ResizeVolumeRequestBody;
import com.huaweicloud.sdk.evs.v2.model.ResizeVolumeResponse;
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
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotRequestBody;
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.UpdateVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.UpdateVolumeRequestBody;
import com.huaweicloud.sdk.evs.v2.model.UpdateVolumeResponse;

@SuppressWarnings("unchecked")
public class EvsMeta {

    public static final HttpRequestDef<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse> batchCreateVolumeTags =
        genForbatchCreateVolumeTags();

    private static HttpRequestDef<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse> genForbatchCreateVolumeTags() {
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
            f -> f.withMarshaller(BatchCreateVolumeTagsRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            }));
        builder.<BatchCreateVolumeTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateVolumeTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateVolumeTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse> batchDeleteVolumeTags =
        genForbatchDeleteVolumeTags();

    private static HttpRequestDef<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse> genForbatchDeleteVolumeTags() {
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
            f -> f.withMarshaller(BatchDeleteVolumeTagsRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            }));
        builder.<BatchDeleteVolumeTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteVolumeTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteVolumeTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CinderAcceptVolumeTransferRequest, CinderAcceptVolumeTransferResponse> cinderAcceptVolumeTransfer =
        genForcinderAcceptVolumeTransfer();

    private static HttpRequestDef<CinderAcceptVolumeTransferRequest, CinderAcceptVolumeTransferResponse> genForcinderAcceptVolumeTransfer() {
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
            f -> f.withMarshaller(CinderAcceptVolumeTransferRequest::getTransferId, (req, v) -> {
                req.setTransferId(v);
            }));
        builder.<CinderAcceptVolumeTransferRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CinderAcceptVolumeTransferRequestBody.class),
            f -> f.withMarshaller(CinderAcceptVolumeTransferRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CinderCreateVolumeTransferRequest, CinderCreateVolumeTransferResponse> cinderCreateVolumeTransfer =
        genForcinderCreateVolumeTransfer();

    private static HttpRequestDef<CinderCreateVolumeTransferRequest, CinderCreateVolumeTransferResponse> genForcinderCreateVolumeTransfer() {
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
            f -> f.withMarshaller(CinderCreateVolumeTransferRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CinderDeleteVolumeTransferRequest, CinderDeleteVolumeTransferResponse> cinderDeleteVolumeTransfer =
        genForcinderDeleteVolumeTransfer();

    private static HttpRequestDef<CinderDeleteVolumeTransferRequest, CinderDeleteVolumeTransferResponse> genForcinderDeleteVolumeTransfer() {
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
            f -> f.withMarshaller(CinderDeleteVolumeTransferRequest::getTransferId, (req, v) -> {
                req.setTransferId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse> cinderListAvailabilityZones =
        genForcinderListAvailabilityZones();

    private static HttpRequestDef<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse> genForcinderListAvailabilityZones() {
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
        genForcinderListQuotas();

    private static HttpRequestDef<CinderListQuotasRequest, CinderListQuotasResponse> genForcinderListQuotas() {
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
            f -> f.withMarshaller(CinderListQuotasRequest::getTargetProjectId, (req, v) -> {
                req.setTargetProjectId(v);
            }));
        builder.<CinderListQuotasRequest.UsageEnum>withRequestField("usage",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CinderListQuotasRequest.UsageEnum.class),
            f -> f.withMarshaller(CinderListQuotasRequest::getUsage, (req, v) -> {
                req.setUsage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CinderListVolumeTransfersRequest, CinderListVolumeTransfersResponse> cinderListVolumeTransfers =
        genForcinderListVolumeTransfers();

    private static HttpRequestDef<CinderListVolumeTransfersRequest, CinderListVolumeTransfersResponse> genForcinderListVolumeTransfers() {
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
            f -> f.withMarshaller(CinderListVolumeTransfersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CinderListVolumeTransfersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse> cinderListVolumeTypes =
        genForcinderListVolumeTypes();

    private static HttpRequestDef<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse> genForcinderListVolumeTypes() {
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
        genForcinderShowVolumeTransfer();

    private static HttpRequestDef<CinderShowVolumeTransferRequest, CinderShowVolumeTransferResponse> genForcinderShowVolumeTransfer() {
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
            f -> f.withMarshaller(CinderShowVolumeTransferRequest::getTransferId, (req, v) -> {
                req.setTransferId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshot =
        genForcreateSnapshot();

    private static HttpRequestDef<CreateSnapshotRequest, CreateSnapshotResponse> genForcreateSnapshot() {
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
            f -> f.withMarshaller(CreateSnapshotRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVolumeRequest, CreateVolumeResponse> createVolume = genForcreateVolume();

    private static HttpRequestDef<CreateVolumeRequest, CreateVolumeResponse> genForcreateVolume() {
        // basic
        HttpRequestDef.Builder<CreateVolumeRequest, CreateVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVolumeRequest.class, CreateVolumeResponse.class)
                .withName("CreateVolume")
                .withUri("/v2.1/{project_id}/cloudvolumes")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVolumeRequestBody.class),
            f -> f.withMarshaller(CreateVolumeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshot =
        genFordeleteSnapshot();

    private static HttpRequestDef<DeleteSnapshotRequest, DeleteSnapshotResponse> genFordeleteSnapshot() {
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
            f -> f.withMarshaller(DeleteSnapshotRequest::getSnapshotId, (req, v) -> {
                req.setSnapshotId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVolumeRequest, DeleteVolumeResponse> deleteVolume = genFordeleteVolume();

    private static HttpRequestDef<DeleteVolumeRequest, DeleteVolumeResponse> genFordeleteVolume() {
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
            f -> f.withMarshaller(DeleteVolumeRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshots =
        genForlistSnapshots();

    private static HttpRequestDef<ListSnapshotsRequest, ListSnapshotsResponse> genForlistSnapshots() {
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
            f -> f.withMarshaller(ListSnapshotsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("volume_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            }));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getAvailabilityZone, (req, v) -> {
                req.setAvailabilityZone(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("dedicated_storage_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getDedicatedStorageName, (req, v) -> {
                req.setDedicatedStorageName(v);
            }));
        builder.<String>withRequestField("dedicated_storage_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getDedicatedStorageId, (req, v) -> {
                req.setDedicatedStorageId(v);
            }));
        builder.<String>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getServiceType, (req, v) -> {
                req.setServiceType(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVolumeTagsRequest, ListVolumeTagsResponse> listVolumeTags =
        genForlistVolumeTags();

    private static HttpRequestDef<ListVolumeTagsRequest, ListVolumeTagsResponse> genForlistVolumeTags() {
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

    public static final HttpRequestDef<ListVolumesRequest, ListVolumesResponse> listVolumes = genForlistVolumes();

    private static HttpRequestDef<ListVolumesRequest, ListVolumesResponse> genForlistVolumes() {
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
            f -> f.withMarshaller(ListVolumesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVolumesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVolumesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("metadata",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getMetadata, (req, v) -> {
                req.setMetadata(v);
            }));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getAvailabilityZone, (req, v) -> {
                req.setAvailabilityZone(v);
            }));
        builder.<Boolean>withRequestField("multiattach",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListVolumesRequest::getMultiattach, (req, v) -> {
                req.setMultiattach(v);
            }));
        builder.<String>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getServiceType, (req, v) -> {
                req.setServiceType(v);
            }));
        builder.<String>withRequestField("dedicated_storage_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getDedicatedStorageId, (req, v) -> {
                req.setDedicatedStorageId(v);
            }));
        builder.<String>withRequestField("dedicated_storage_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getDedicatedStorageName, (req, v) -> {
                req.setDedicatedStorageName(v);
            }));
        builder.<String>withRequestField("volume_type_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getVolumeTypeId, (req, v) -> {
                req.setVolumeTypeId(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getIds, (req, v) -> {
                req.setIds(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVolumesByTagsRequest, ListVolumesByTagsResponse> listVolumesByTags =
        genForlistVolumesByTags();

    private static HttpRequestDef<ListVolumesByTagsRequest, ListVolumesByTagsResponse> genForlistVolumesByTags() {
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
            f -> f.withMarshaller(ListVolumesByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeVolumeRequest, ResizeVolumeResponse> resizeVolume = genForresizeVolume();

    private static HttpRequestDef<ResizeVolumeRequest, ResizeVolumeResponse> genForresizeVolume() {
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
            f -> f.withMarshaller(ResizeVolumeRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            }));
        builder.<ResizeVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeVolumeRequestBody.class),
            f -> f.withMarshaller(ResizeVolumeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RollbackSnapshotRequest, RollbackSnapshotResponse> rollbackSnapshot =
        genForrollbackSnapshot();

    private static HttpRequestDef<RollbackSnapshotRequest, RollbackSnapshotResponse> genForrollbackSnapshot() {
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
            f -> f.withMarshaller(RollbackSnapshotRequest::getSnapshotId, (req, v) -> {
                req.setSnapshotId(v);
            }));
        builder.<RollbackSnapshotRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RollbackSnapshotRequestBody.class),
            f -> f.withMarshaller(RollbackSnapshotRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForshowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForshowJob() {
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
            f -> f.withMarshaller(ShowJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSnapshotRequest, ShowSnapshotResponse> showSnapshot = genForshowSnapshot();

    private static HttpRequestDef<ShowSnapshotRequest, ShowSnapshotResponse> genForshowSnapshot() {
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
            f -> f.withMarshaller(ShowSnapshotRequest::getSnapshotId, (req, v) -> {
                req.setSnapshotId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVolumeRequest, ShowVolumeResponse> showVolume = genForshowVolume();

    private static HttpRequestDef<ShowVolumeRequest, ShowVolumeResponse> genForshowVolume() {
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
            f -> f.withMarshaller(ShowVolumeRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVolumeTagsRequest, ShowVolumeTagsResponse> showVolumeTags =
        genForshowVolumeTags();

    private static HttpRequestDef<ShowVolumeTagsRequest, ShowVolumeTagsResponse> genForshowVolumeTags() {
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
            f -> f.withMarshaller(ShowVolumeTagsRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSnapshotRequest, UpdateSnapshotResponse> updateSnapshot =
        genForupdateSnapshot();

    private static HttpRequestDef<UpdateSnapshotRequest, UpdateSnapshotResponse> genForupdateSnapshot() {
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
            f -> f.withMarshaller(UpdateSnapshotRequest::getSnapshotId, (req, v) -> {
                req.setSnapshotId(v);
            }));
        builder.<UpdateSnapshotRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSnapshotRequestBody.class),
            f -> f.withMarshaller(UpdateSnapshotRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVolumeRequest, UpdateVolumeResponse> updateVolume = genForupdateVolume();

    private static HttpRequestDef<UpdateVolumeRequest, UpdateVolumeResponse> genForupdateVolume() {
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
            f -> f.withMarshaller(UpdateVolumeRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            }));
        builder.<UpdateVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVolumeRequestBody.class),
            f -> f.withMarshaller(UpdateVolumeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVersionsRequest, ListVersionsResponse> listVersions = genForlistVersions();

    private static HttpRequestDef<ListVersionsRequest, ListVersionsResponse> genForlistVersions() {
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

    public static final HttpRequestDef<ShowVersionRequest, ShowVersionResponse> showVersion = genForshowVersion();

    private static HttpRequestDef<ShowVersionRequest, ShowVersionResponse> genForshowVersion() {
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
            f -> f.withMarshaller(ShowVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

}
