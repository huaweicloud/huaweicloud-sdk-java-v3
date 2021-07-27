package com.huaweicloud.sdk.evs.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.evs.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class EvsMeta {

    public static final HttpRequestDef<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse> batchCreateVolumeTags = genForbatchCreateVolumeTags();

    private static HttpRequestDef<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse> genForbatchCreateVolumeTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateVolumeTagsRequest.class, BatchCreateVolumeTagsResponse.class)
                .withName("BatchCreateVolumeTags")
                .withUri("/v2/{project_id}/cloudvolumes/{volume_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchCreateVolumeTagsRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchCreateVolumeTagsRequestBody.class,
            f -> f.withMarshaller(BatchCreateVolumeTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse> batchDeleteVolumeTags = genForbatchDeleteVolumeTags();

    private static HttpRequestDef<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse> genForbatchDeleteVolumeTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteVolumeTagsRequest.class, BatchDeleteVolumeTagsResponse.class)
                .withName("BatchDeleteVolumeTags")
                .withUri("/v2/{project_id}/cloudvolumes/{volume_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDeleteVolumeTagsRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchDeleteVolumeTagsRequestBody.class,
            f -> f.withMarshaller(BatchDeleteVolumeTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CinderExportToImageRequest, CinderExportToImageResponse> cinderExportToImage = genForcinderExportToImage();

    private static HttpRequestDef<CinderExportToImageRequest, CinderExportToImageResponse> genForcinderExportToImage() {
        // basic
        HttpRequestDef.Builder<CinderExportToImageRequest, CinderExportToImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CinderExportToImageRequest.class, CinderExportToImageResponse.class)
                .withName("CinderExportToImage")
                .withUri("/v2/{project_id}/volumes/{volume_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CinderExportToImageRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CinderExportToImageRequestBody.class,
            f -> f.withMarshaller(CinderExportToImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse> cinderListAvailabilityZones = genForcinderListAvailabilityZones();

    private static HttpRequestDef<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse> genForcinderListAvailabilityZones() {
        // basic
        HttpRequestDef.Builder<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CinderListAvailabilityZonesRequest.class, CinderListAvailabilityZonesResponse.class)
                .withName("CinderListAvailabilityZones")
                .withUri("/v2/{project_id}/os-availability-zone")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CinderListQuotasRequest, CinderListQuotasResponse> cinderListQuotas = genForcinderListQuotas();

    private static HttpRequestDef<CinderListQuotasRequest, CinderListQuotasResponse> genForcinderListQuotas() {
        // basic
        HttpRequestDef.Builder<CinderListQuotasRequest, CinderListQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CinderListQuotasRequest.class, CinderListQuotasResponse.class)
                .withName("CinderListQuotas")
                .withUri("/v2/{project_id}/os-quota-sets/{target_project_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("target_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CinderListQuotasRequest::getTargetProjectId, (req, v) -> {
                req.setTargetProjectId(v);
            })
        );
        builder.withRequestField("usage",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            CinderListQuotasRequest.UsageEnum.class,
            f -> f.withMarshaller(CinderListQuotasRequest::getUsage, (req, v) -> {
                req.setUsage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse> cinderListVolumeTypes = genForcinderListVolumeTypes();

    private static HttpRequestDef<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse> genForcinderListVolumeTypes() {
        // basic
        HttpRequestDef.Builder<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CinderListVolumeTypesRequest.class, CinderListVolumeTypesResponse.class)
                .withName("CinderListVolumeTypes")
                .withUri("/v2/{project_id}/types")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshot = genForcreateSnapshot();

    private static HttpRequestDef<CreateSnapshotRequest, CreateSnapshotResponse> genForcreateSnapshot() {
        // basic
        HttpRequestDef.Builder<CreateSnapshotRequest, CreateSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSnapshotRequest.class, CreateSnapshotResponse.class)
                .withName("CreateSnapshot")
                .withUri("/v2/{project_id}/cloudsnapshots")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateSnapshotRequestBody.class,
            f -> f.withMarshaller(CreateSnapshotRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

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
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateVolumeRequestBody.class,
            f -> f.withMarshaller(CreateVolumeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshot = genFordeleteSnapshot();

    private static HttpRequestDef<DeleteSnapshotRequest, DeleteSnapshotResponse> genFordeleteSnapshot() {
        // basic
        HttpRequestDef.Builder<DeleteSnapshotRequest, DeleteSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSnapshotRequest.class, DeleteSnapshotResponse.class)
                .withName("DeleteSnapshot")
                .withUri("/v2/{project_id}/cloudsnapshots/{snapshot_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSnapshotRequest::getSnapshotId, (req, v) -> {
                req.setSnapshotId(v);
            })
        );

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
        builder.withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteVolumeRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshots = genForlistSnapshots();

    private static HttpRequestDef<ListSnapshotsRequest, ListSnapshotsResponse> genForlistSnapshots() {
        // basic
        HttpRequestDef.Builder<ListSnapshotsRequest, ListSnapshotsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotsRequest.class, ListSnapshotsResponse.class)
                .withName("ListSnapshots")
                .withUri("/v2/{project_id}/cloudsnapshots/detail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSnapshotsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSnapshotsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSnapshotsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSnapshotsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("volume_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSnapshotsRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            })
        );
        builder.withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSnapshotsRequest::getAvailabilityZone, (req, v) -> {
                req.setAvailabilityZone(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSnapshotsRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("dedicated_storage_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSnapshotsRequest::getDedicatedStorageName, (req, v) -> {
                req.setDedicatedStorageName(v);
            })
        );
        builder.withRequestField("dedicated_storage_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSnapshotsRequest::getDedicatedStorageId, (req, v) -> {
                req.setDedicatedStorageId(v);
            })
        );
        builder.withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSnapshotsRequest::getServiceType, (req, v) -> {
                req.setServiceType(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSnapshotsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListVolumeTagsRequest, ListVolumeTagsResponse> listVolumeTags = genForlistVolumeTags();

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
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVolumesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVolumesRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListVolumesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVolumesRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListVolumesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVolumesRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVolumesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("metadata",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVolumesRequest::getMetadata, (req, v) -> {
                req.setMetadata(v);
            })
        );
        builder.withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVolumesRequest::getAvailabilityZone, (req, v) -> {
                req.setAvailabilityZone(v);
            })
        );
        builder.withRequestField("multiattach",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListVolumesRequest::getMultiattach, (req, v) -> {
                req.setMultiattach(v);
            })
        );
        builder.withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVolumesRequest::getServiceType, (req, v) -> {
                req.setServiceType(v);
            })
        );
        builder.withRequestField("dedicated_storage_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVolumesRequest::getDedicatedStorageId, (req, v) -> {
                req.setDedicatedStorageId(v);
            })
        );
        builder.withRequestField("dedicated_storage_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVolumesRequest::getDedicatedStorageName, (req, v) -> {
                req.setDedicatedStorageName(v);
            })
        );
        builder.withRequestField("volume_type_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVolumesRequest::getVolumeTypeId, (req, v) -> {
                req.setVolumeTypeId(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVolumesRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVolumesRequest::getIds, (req, v) -> {
                req.setIds(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVolumesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListVolumesByTagsRequest, ListVolumesByTagsResponse> listVolumesByTags = genForlistVolumesByTags();

    private static HttpRequestDef<ListVolumesByTagsRequest, ListVolumesByTagsResponse> genForlistVolumesByTags() {
        // basic
        HttpRequestDef.Builder<ListVolumesByTagsRequest, ListVolumesByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListVolumesByTagsRequest.class, ListVolumesByTagsResponse.class)
                .withName("ListVolumesByTags")
                .withUri("/v2/{project_id}/cloudvolumes/resource_instances/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListVolumesByTagsRequestBody.class,
            f -> f.withMarshaller(ListVolumesByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

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
        builder.withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResizeVolumeRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResizeVolumeRequestBody.class,
            f -> f.withMarshaller(ResizeVolumeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RollbackSnapshotRequest, RollbackSnapshotResponse> rollbackSnapshot = genForrollbackSnapshot();

    private static HttpRequestDef<RollbackSnapshotRequest, RollbackSnapshotResponse> genForrollbackSnapshot() {
        // basic
        HttpRequestDef.Builder<RollbackSnapshotRequest, RollbackSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RollbackSnapshotRequest.class, RollbackSnapshotResponse.class)
                .withName("RollbackSnapshot")
                .withUri("/v2/{project_id}/cloudsnapshots/{snapshot_id}/rollback")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RollbackSnapshotRequest::getSnapshotId, (req, v) -> {
                req.setSnapshotId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RollbackSnapshotRequestBody.class,
            f -> f.withMarshaller(RollbackSnapshotRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

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
        builder.withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            })
        );

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
        builder.withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowSnapshotRequest::getSnapshotId, (req, v) -> {
                req.setSnapshotId(v);
            })
        );

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
        builder.withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowVolumeRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowVolumeTagsRequest, ShowVolumeTagsResponse> showVolumeTags = genForshowVolumeTags();

    private static HttpRequestDef<ShowVolumeTagsRequest, ShowVolumeTagsResponse> genForshowVolumeTags() {
        // basic
        HttpRequestDef.Builder<ShowVolumeTagsRequest, ShowVolumeTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVolumeTagsRequest.class, ShowVolumeTagsResponse.class)
                .withName("ShowVolumeTags")
                .withUri("/v2/{project_id}/cloudvolumes/{volume_id}/tags")
                .withContentType("application/json");

        // requests
        builder.withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowVolumeTagsRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateSnapshotRequest, UpdateSnapshotResponse> updateSnapshot = genForupdateSnapshot();

    private static HttpRequestDef<UpdateSnapshotRequest, UpdateSnapshotResponse> genForupdateSnapshot() {
        // basic
        HttpRequestDef.Builder<UpdateSnapshotRequest, UpdateSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSnapshotRequest.class, UpdateSnapshotResponse.class)
                .withName("UpdateSnapshot")
                .withUri("/v2/{project_id}/cloudsnapshots/{snapshot_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSnapshotRequest::getSnapshotId, (req, v) -> {
                req.setSnapshotId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateSnapshotRequestBody.class,
            f -> f.withMarshaller(UpdateSnapshotRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

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
        builder.withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateVolumeRequest::getVolumeId, (req, v) -> {
                req.setVolumeId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateVolumeRequestBody.class,
            f -> f.withMarshaller(UpdateVolumeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}
