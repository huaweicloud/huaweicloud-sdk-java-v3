package com.huaweicloud.sdk.dns.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dns.v2.model.*;

@SuppressWarnings("unchecked")
public class DnsMeta {

    public static final HttpRequestDef<CreateCustomLineRequest, CreateCustomLineResponse> createCustomLine =
        genForcreateCustomLine();

    private static HttpRequestDef<CreateCustomLineRequest, CreateCustomLineResponse> genForcreateCustomLine() {
        // basic
        HttpRequestDef.Builder<CreateCustomLineRequest, CreateCustomLineResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCustomLineRequest.class, CreateCustomLineResponse.class)
                .withName("CreateCustomLine")
                .withUri("/v2.1/customlines")
                .withContentType("application/json");

        // requests
        builder.<CreateCustomLines>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateCustomLines.class),
            f -> f.withMarshaller(CreateCustomLineRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLineGroupRequest, CreateLineGroupResponse> createLineGroup =
        genForcreateLineGroup();

    private static HttpRequestDef<CreateLineGroupRequest, CreateLineGroupResponse> genForcreateLineGroup() {
        // basic
        HttpRequestDef.Builder<CreateLineGroupRequest, CreateLineGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLineGroupRequest.class, CreateLineGroupResponse.class)
                .withName("CreateLineGroup")
                .withUri("/v2.1/linegroups")
                .withContentType("application/json");

        // requests
        builder.<CreateLineGroupsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLineGroupsReq.class),
            f -> f.withMarshaller(CreateLineGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCustomLineRequest, DeleteCustomLineResponse> deleteCustomLine =
        genFordeleteCustomLine();

    private static HttpRequestDef<DeleteCustomLineRequest, DeleteCustomLineResponse> genFordeleteCustomLine() {
        // basic
        HttpRequestDef.Builder<DeleteCustomLineRequest, DeleteCustomLineResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCustomLineRequest.class, DeleteCustomLineResponse.class)
                .withName("DeleteCustomLine")
                .withUri("/v2.1/customlines/{line_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("line_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomLineRequest::getLineId, (req, v) -> {
                req.setLineId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLineGroupRequest, DeleteLineGroupResponse> deleteLineGroup =
        genFordeleteLineGroup();

    private static HttpRequestDef<DeleteLineGroupRequest, DeleteLineGroupResponse> genFordeleteLineGroup() {
        // basic
        HttpRequestDef.Builder<DeleteLineGroupRequest, DeleteLineGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLineGroupRequest.class, DeleteLineGroupResponse.class)
                .withName("DeleteLineGroup")
                .withUri("/v2.1/linegroups/{linegroup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("linegroup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLineGroupRequest::getLinegroupId, (req, v) -> {
                req.setLinegroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions =
        genForlistApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForlistApiVersions() {
        // basic
        HttpRequestDef.Builder<ListApiVersionsRequest, ListApiVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionsRequest.class, ListApiVersionsResponse.class)
                .withName("ListApiVersions")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomLineRequest, ListCustomLineResponse> listCustomLine =
        genForlistCustomLine();

    private static HttpRequestDef<ListCustomLineRequest, ListCustomLineResponse> genForlistCustomLine() {
        // basic
        HttpRequestDef.Builder<ListCustomLineRequest, ListCustomLineResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCustomLineRequest.class, ListCustomLineResponse.class)
                .withName("ListCustomLine")
                .withUri("/v2.1/customlines")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("line_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomLineRequest::getLineId, (req, v) -> {
                req.setLineId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomLineRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomLineRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomLineRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Boolean>withRequestField("show_detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCustomLineRequest::getShowDetail, (req, v) -> {
                req.setShowDetail(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLineGroupsRequest, ListLineGroupsResponse> listLineGroups =
        genForlistLineGroups();

    private static HttpRequestDef<ListLineGroupsRequest, ListLineGroupsResponse> genForlistLineGroups() {
        // basic
        HttpRequestDef.Builder<ListLineGroupsRequest, ListLineGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLineGroupsRequest.class, ListLineGroupsResponse.class)
                .withName("ListLineGroups")
                .withUri("/v2.1/linegroups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("line_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLineGroupsRequest::getLineId, (req, v) -> {
                req.setLineId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLineGroupsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLineGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLineGroupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNameServersRequest, ListNameServersResponse> listNameServers =
        genForlistNameServers();

    private static HttpRequestDef<ListNameServersRequest, ListNameServersResponse> genForlistNameServers() {
        // basic
        HttpRequestDef.Builder<ListNameServersRequest, ListNameServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNameServersRequest.class, ListNameServersResponse.class)
                .withName("ListNameServers")
                .withUri("/v2/nameservers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNameServersRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNameServersRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiInfoRequest, ShowApiInfoResponse> showApiInfo = genForshowApiInfo();

    private static HttpRequestDef<ShowApiInfoRequest, ShowApiInfoResponse> genForshowApiInfo() {
        // basic
        HttpRequestDef.Builder<ShowApiInfoRequest, ShowApiInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiInfoRequest.class, ShowApiInfoResponse.class)
                .withName("ShowApiInfo")
                .withUri("/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiInfoRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLineGroupRequest, ShowLineGroupResponse> showLineGroup =
        genForshowLineGroup();

    private static HttpRequestDef<ShowLineGroupRequest, ShowLineGroupResponse> genForshowLineGroup() {
        // basic
        HttpRequestDef.Builder<ShowLineGroupRequest, ShowLineGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLineGroupRequest.class, ShowLineGroupResponse.class)
                .withName("ShowLineGroup")
                .withUri("/v2.1/linegroups/{linegroup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("linegroup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLineGroupRequest::getLinegroupId, (req, v) -> {
                req.setLinegroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCustomLineRequest, UpdateCustomLineResponse> updateCustomLine =
        genForupdateCustomLine();

    private static HttpRequestDef<UpdateCustomLineRequest, UpdateCustomLineResponse> genForupdateCustomLine() {
        // basic
        HttpRequestDef.Builder<UpdateCustomLineRequest, UpdateCustomLineResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCustomLineRequest.class, UpdateCustomLineResponse.class)
                .withName("UpdateCustomLine")
                .withUri("/v2.1/customlines/{line_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("line_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCustomLineRequest::getLineId, (req, v) -> {
                req.setLineId(v);
            }));
        builder.<UpdateCustomsLineReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateCustomsLineReq.class),
            f -> f.withMarshaller(UpdateCustomLineRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLineGroupsRequest, UpdateLineGroupsResponse> updateLineGroups =
        genForupdateLineGroups();

    private static HttpRequestDef<UpdateLineGroupsRequest, UpdateLineGroupsResponse> genForupdateLineGroups() {
        // basic
        HttpRequestDef.Builder<UpdateLineGroupsRequest, UpdateLineGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLineGroupsRequest.class, UpdateLineGroupsResponse.class)
                .withName("UpdateLineGroups")
                .withUri("/v2.1/linegroups/{linegroup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("linegroup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLineGroupsRequest::getLinegroupId, (req, v) -> {
                req.setLinegroupId(v);
            }));
        builder.<UpdateLineGroupsBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLineGroupsBody.class),
            f -> f.withMarshaller(UpdateLineGroupsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEipRecordSetRequest, CreateEipRecordSetResponse> createEipRecordSet =
        genForcreateEipRecordSet();

    private static HttpRequestDef<CreateEipRecordSetRequest, CreateEipRecordSetResponse> genForcreateEipRecordSet() {
        // basic
        HttpRequestDef.Builder<CreateEipRecordSetRequest, CreateEipRecordSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, CreateEipRecordSetRequest.class, CreateEipRecordSetResponse.class)
                .withName("CreateEipRecordSet")
                .withUri("/v2/reverse/floatingips/{region}:{floatingip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEipRecordSetRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<String>withRequestField("floatingip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEipRecordSetRequest::getFloatingipId, (req, v) -> {
                req.setFloatingipId(v);
            }));
        builder.<CreatePtrReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePtrReq.class),
            f -> f.withMarshaller(CreateEipRecordSetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPtrRecordsRequest, ListPtrRecordsResponse> listPtrRecords =
        genForlistPtrRecords();

    private static HttpRequestDef<ListPtrRecordsRequest, ListPtrRecordsResponse> genForlistPtrRecords() {
        // basic
        HttpRequestDef.Builder<ListPtrRecordsRequest, ListPtrRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPtrRecordsRequest.class, ListPtrRecordsResponse.class)
                .withName("ListPtrRecords")
                .withUri("/v2/reverse/floatingips")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPtrRecordsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPtrRecordsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPtrRecordsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPtrRecordsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPtrRecordsRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPtrRecordsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestorePtrRecordRequest, RestorePtrRecordResponse> restorePtrRecord =
        genForrestorePtrRecord();

    private static HttpRequestDef<RestorePtrRecordRequest, RestorePtrRecordResponse> genForrestorePtrRecord() {
        // basic
        HttpRequestDef.Builder<RestorePtrRecordRequest, RestorePtrRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, RestorePtrRecordRequest.class, RestorePtrRecordResponse.class)
                .withName("RestorePtrRecord")
                .withUri("/v2/reverse/floatingips/{region}:{floatingip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestorePtrRecordRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<String>withRequestField("floatingip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestorePtrRecordRequest::getFloatingipId, (req, v) -> {
                req.setFloatingipId(v);
            }));
        builder.<RestorePtrReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RestorePtrReq.class),
            f -> f.withMarshaller(RestorePtrRecordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse> showPtrRecordSet =
        genForshowPtrRecordSet();

    private static HttpRequestDef<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse> genForshowPtrRecordSet() {
        // basic
        HttpRequestDef.Builder<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPtrRecordSetRequest.class, ShowPtrRecordSetResponse.class)
                .withName("ShowPtrRecordSet")
                .withUri("/v2/reverse/floatingips/{region}:{floatingip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPtrRecordSetRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<String>withRequestField("floatingip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPtrRecordSetRequest::getFloatingipId, (req, v) -> {
                req.setFloatingipId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePtrRecordRequest, UpdatePtrRecordResponse> updatePtrRecord =
        genForupdatePtrRecord();

    private static HttpRequestDef<UpdatePtrRecordRequest, UpdatePtrRecordResponse> genForupdatePtrRecord() {
        // basic
        HttpRequestDef.Builder<UpdatePtrRecordRequest, UpdatePtrRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdatePtrRecordRequest.class, UpdatePtrRecordResponse.class)
                .withName("UpdatePtrRecord")
                .withUri("/v2/reverse/floatingips/{region}:{floatingip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePtrRecordRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<String>withRequestField("floatingip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePtrRecordRequest::getFloatingipId, (req, v) -> {
                req.setFloatingipId(v);
            }));
        builder.<UpdatePtrReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePtrReq.class),
            f -> f.withMarshaller(UpdatePtrRecordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateHealthCheckRequest, AssociateHealthCheckResponse> associateHealthCheck =
        genForassociateHealthCheck();

    private static HttpRequestDef<AssociateHealthCheckRequest, AssociateHealthCheckResponse> genForassociateHealthCheck() {
        // basic
        HttpRequestDef.Builder<AssociateHealthCheckRequest, AssociateHealthCheckResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AssociateHealthCheckRequest.class, AssociateHealthCheckResponse.class)
            .withName("AssociateHealthCheck")
            .withUri("/v2.1/recordsets/{recordset_id}/associatehealthcheck")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateHealthCheckRequest::getRecordsetId, (req, v) -> {
                req.setRecordsetId(v);
            }));
        builder.<AssociateHealthCheckReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateHealthCheckReq.class),
            f -> f.withMarshaller(AssociateHealthCheckRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse> batchDeleteRecordSetWithLine =
        genForbatchDeleteRecordSetWithLine();

    private static HttpRequestDef<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse> genForbatchDeleteRecordSetWithLine() {
        // basic
        HttpRequestDef.Builder<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    BatchDeleteRecordSetWithLineRequest.class,
                    BatchDeleteRecordSetWithLineResponse.class)
                .withName("BatchDeleteRecordSetWithLine")
                .withUri("/v2.1/zones/{zone_id}/recordsets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteRecordSetWithLineRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));
        builder.<BatchDeleteRSetWithLineReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteRSetWithLineReq.class),
            f -> f.withMarshaller(BatchDeleteRecordSetWithLineRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse> batchUpdateRecordSetWithLine =
        genForbatchUpdateRecordSetWithLine();

    private static HttpRequestDef<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse> genForbatchUpdateRecordSetWithLine() {
        // basic
        HttpRequestDef.Builder<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchUpdateRecordSetWithLineRequest.class,
                    BatchUpdateRecordSetWithLineResponse.class)
                .withName("BatchUpdateRecordSetWithLine")
                .withUri("/v2.1/zones/{zone_id}/recordsets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateRecordSetWithLineRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));
        builder.<BatchUpdateRecordSetWithLineReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateRecordSetWithLineReq.class),
            f -> f.withMarshaller(BatchUpdateRecordSetWithLineRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordSetRequest, CreateRecordSetResponse> createRecordSet =
        genForcreateRecordSet();

    private static HttpRequestDef<CreateRecordSetRequest, CreateRecordSetResponse> genForcreateRecordSet() {
        // basic
        HttpRequestDef.Builder<CreateRecordSetRequest, CreateRecordSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRecordSetRequest.class, CreateRecordSetResponse.class)
                .withName("CreateRecordSet")
                .withUri("/v2/zones/{zone_id}/recordsets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRecordSetRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));
        builder.<CreateRecordSetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRecordSetReq.class),
            f -> f.withMarshaller(CreateRecordSetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse> createRecordSetWithBatchLines =
        genForcreateRecordSetWithBatchLines();

    private static HttpRequestDef<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse> genForcreateRecordSetWithBatchLines() {
        // basic
        HttpRequestDef.Builder<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateRecordSetWithBatchLinesRequest.class,
                    CreateRecordSetWithBatchLinesResponse.class)
                .withName("CreateRecordSetWithBatchLines")
                .withUri("/v2.1/zones/{zone_id}/recordsets/batch/lines")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRecordSetWithBatchLinesRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));
        builder.<CreateRSetBatchLinesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRSetBatchLinesReq.class),
            f -> f.withMarshaller(CreateRecordSetWithBatchLinesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse> createRecordSetWithLine =
        genForcreateRecordSetWithLine();

    private static HttpRequestDef<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse> genForcreateRecordSetWithLine() {
        // basic
        HttpRequestDef.Builder<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateRecordSetWithLineRequest.class, CreateRecordSetWithLineResponse.class)
            .withName("CreateRecordSetWithLine")
            .withUri("/v2.1/zones/{zone_id}/recordsets")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRecordSetWithLineRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));
        builder.<CreateRecordSetWithLineReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRecordSetWithLineReq.class),
            f -> f.withMarshaller(CreateRecordSetWithLineRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRecordSetRequest, DeleteRecordSetResponse> deleteRecordSet =
        genFordeleteRecordSet();

    private static HttpRequestDef<DeleteRecordSetRequest, DeleteRecordSetResponse> genFordeleteRecordSet() {
        // basic
        HttpRequestDef.Builder<DeleteRecordSetRequest, DeleteRecordSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRecordSetRequest.class, DeleteRecordSetResponse.class)
                .withName("DeleteRecordSet")
                .withUri("/v2/zones/{zone_id}/recordsets/{recordset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordSetRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordSetRequest::getRecordsetId, (req, v) -> {
                req.setRecordsetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRecordSetsRequest, DeleteRecordSetsResponse> deleteRecordSets =
        genFordeleteRecordSets();

    private static HttpRequestDef<DeleteRecordSetsRequest, DeleteRecordSetsResponse> genFordeleteRecordSets() {
        // basic
        HttpRequestDef.Builder<DeleteRecordSetsRequest, DeleteRecordSetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRecordSetsRequest.class, DeleteRecordSetsResponse.class)
                .withName("DeleteRecordSets")
                .withUri("/v2.1/zones/{zone_id}/recordsets/{recordset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordSetsRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordSetsRequest::getRecordsetId, (req, v) -> {
                req.setRecordsetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateHealthCheckRequest, DisassociateHealthCheckResponse> disassociateHealthCheck =
        genFordisassociateHealthCheck();

    private static HttpRequestDef<DisassociateHealthCheckRequest, DisassociateHealthCheckResponse> genFordisassociateHealthCheck() {
        // basic
        HttpRequestDef.Builder<DisassociateHealthCheckRequest, DisassociateHealthCheckResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DisassociateHealthCheckRequest.class, DisassociateHealthCheckResponse.class)
            .withName("DisassociateHealthCheck")
            .withUri("/v2.1/recordsets/{recordset_id}/disassociatehealthcheck")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateHealthCheckRequest::getRecordsetId, (req, v) -> {
                req.setRecordsetId(v);
            }));
        builder.<AssociateHealthCheckReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateHealthCheckReq.class),
            f -> f.withMarshaller(DisassociateHealthCheckRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecordSetsRequest, ListRecordSetsResponse> listRecordSets =
        genForlistRecordSets();

    private static HttpRequestDef<ListRecordSetsRequest, ListRecordSetsResponse> genForlistRecordSets() {
        // basic
        HttpRequestDef.Builder<ListRecordSetsRequest, ListRecordSetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRecordSetsRequest.class, ListRecordSetsResponse.class)
                .withName("ListRecordSets")
                .withUri("/v2/recordsets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getZoneType, (req, v) -> {
                req.setZoneType(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("records",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getRecords, (req, v) -> {
                req.setRecords(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse> listRecordSetsByZone =
        genForlistRecordSetsByZone();

    private static HttpRequestDef<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse> genForlistRecordSetsByZone() {
        // basic
        HttpRequestDef.Builder<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRecordSetsByZoneRequest.class, ListRecordSetsByZoneResponse.class)
            .withName("ListRecordSetsByZone")
            .withUri("/v2/zones/{zone_id}/recordsets")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse> listRecordSetsWithLine =
        genForlistRecordSetsWithLine();

    private static HttpRequestDef<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse> genForlistRecordSetsWithLine() {
        // basic
        HttpRequestDef.Builder<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRecordSetsWithLineRequest.class, ListRecordSetsWithLineResponse.class)
            .withName("ListRecordSetsWithLine")
            .withUri("/v2.1/recordsets")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getZoneType, (req, v) -> {
                req.setZoneType(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("line_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getLineId, (req, v) -> {
                req.setLineId(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("records",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getRecords, (req, v) -> {
                req.setRecords(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("health_check_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getHealthCheckId, (req, v) -> {
                req.setHealthCheckId(v);
            }));
        builder.<String>withRequestField("search_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getSearchMode, (req, v) -> {
                req.setSearchMode(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse> setRecordSetsStatus =
        genForsetRecordSetsStatus();

    private static HttpRequestDef<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse> genForsetRecordSetsStatus() {
        // basic
        HttpRequestDef.Builder<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetRecordSetsStatusRequest.class, SetRecordSetsStatusResponse.class)
                .withName("SetRecordSetsStatus")
                .withUri("/v2.1/recordsets/{recordset_id}/statuses/set")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetRecordSetsStatusRequest::getRecordsetId, (req, v) -> {
                req.setRecordsetId(v);
            }));
        builder.<SetRecordSetsStatusReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetRecordSetsStatusReq.class),
            f -> f.withMarshaller(SetRecordSetsStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordSetRequest, ShowRecordSetResponse> showRecordSet =
        genForshowRecordSet();

    private static HttpRequestDef<ShowRecordSetRequest, ShowRecordSetResponse> genForshowRecordSet() {
        // basic
        HttpRequestDef.Builder<ShowRecordSetRequest, ShowRecordSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecordSetRequest.class, ShowRecordSetResponse.class)
                .withName("ShowRecordSet")
                .withUri("/v2/zones/{zone_id}/recordsets/{recordset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetRequest::getRecordsetId, (req, v) -> {
                req.setRecordsetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse> showRecordSetByZone =
        genForshowRecordSetByZone();

    private static HttpRequestDef<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse> genForshowRecordSetByZone() {
        // basic
        HttpRequestDef.Builder<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecordSetByZoneRequest.class, ShowRecordSetByZoneResponse.class)
                .withName("ShowRecordSetByZone")
                .withUri("/v2.1/zones/{zone_id}/recordsets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("line_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getLineId, (req, v) -> {
                req.setLineId(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("search_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getSearchMode, (req, v) -> {
                req.setSearchMode(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse> showRecordSetWithLine =
        genForshowRecordSetWithLine();

    private static HttpRequestDef<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse> genForshowRecordSetWithLine() {
        // basic
        HttpRequestDef.Builder<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowRecordSetWithLineRequest.class, ShowRecordSetWithLineResponse.class)
            .withName("ShowRecordSetWithLine")
            .withUri("/v2.1/zones/{zone_id}/recordsets/{recordset_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetWithLineRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetWithLineRequest::getRecordsetId, (req, v) -> {
                req.setRecordsetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecordSetRequest, UpdateRecordSetResponse> updateRecordSet =
        genForupdateRecordSet();

    private static HttpRequestDef<UpdateRecordSetRequest, UpdateRecordSetResponse> genForupdateRecordSet() {
        // basic
        HttpRequestDef.Builder<UpdateRecordSetRequest, UpdateRecordSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRecordSetRequest.class, UpdateRecordSetResponse.class)
                .withName("UpdateRecordSet")
                .withUri("/v2/zones/{zone_id}/recordsets/{recordset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordSetRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordSetRequest::getRecordsetId, (req, v) -> {
                req.setRecordsetId(v);
            }));
        builder.<UpdateRecordSetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateRecordSetReq.class),
            f -> f.withMarshaller(UpdateRecordSetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecordSetsRequest, UpdateRecordSetsResponse> updateRecordSets =
        genForupdateRecordSets();

    private static HttpRequestDef<UpdateRecordSetsRequest, UpdateRecordSetsResponse> genForupdateRecordSets() {
        // basic
        HttpRequestDef.Builder<UpdateRecordSetsRequest, UpdateRecordSetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRecordSetsRequest.class, UpdateRecordSetsResponse.class)
                .withName("UpdateRecordSets")
                .withUri("/v2.1/zones/{zone_id}/recordsets/{recordset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordSetsRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordSetsRequest::getRecordsetId, (req, v) -> {
                req.setRecordsetId(v);
            }));
        builder.<UpdateRecordSetsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateRecordSetsReq.class),
            f -> f.withMarshaller(UpdateRecordSetsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateTagRequest, BatchCreateTagResponse> batchCreateTag =
        genForbatchCreateTag();

    private static HttpRequestDef<BatchCreateTagRequest, BatchCreateTagResponse> genForbatchCreateTag() {
        // basic
        HttpRequestDef.Builder<BatchCreateTagRequest, BatchCreateTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateTagRequest.class, BatchCreateTagResponse.class)
                .withName("BatchCreateTag")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateTagRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<BatchHandTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchHandTags.class),
            f -> f.withMarshaller(BatchCreateTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagRequest, CreateTagResponse> createTag = genForcreateTag();

    private static HttpRequestDef<CreateTagRequest, CreateTagResponse> genForcreateTag() {
        // basic
        HttpRequestDef.Builder<CreateTagRequest, CreateTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagRequest.class, CreateTagResponse.class)
                .withName("CreateTag")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<CreateTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateTagReq.class),
            f -> f.withMarshaller(CreateTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagRequest, DeleteTagResponse> deleteTag = genFordeleteTag();

    private static HttpRequestDef<DeleteTagRequest, DeleteTagResponse> genFordeleteTag() {
        // basic
        HttpRequestDef.Builder<DeleteTagRequest, DeleteTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTagRequest.class, DeleteTagResponse.class)
                .withName("DeleteTag")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagRequest, ListTagResponse> listTag = genForlistTag();

    private static HttpRequestDef<ListTagRequest, ListTagResponse> genForlistTag() {
        // basic
        HttpRequestDef.Builder<ListTagRequest, ListTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTagRequest.class, ListTagResponse.class)
                .withName("ListTag")
                .withUri("/v2/{project_id}/{resource_type}/resource_instances/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<ListTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTagReq.class),
            f -> f.withMarshaller(ListTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForlistTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForlistTags() {
        // basic
        HttpRequestDef.Builder<ListTagsRequest, ListTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsRequest.class, ListTagsResponse.class)
                .withName("ListTags")
                .withUri("/v2/{project_id}/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTag =
        genForshowResourceTag();

    private static HttpRequestDef<ShowResourceTagRequest, ShowResourceTagResponse> genForshowResourceTag() {
        // basic
        HttpRequestDef.Builder<ShowResourceTagRequest, ShowResourceTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceTagRequest.class, ShowResourceTagResponse.class)
                .withName("ShowResourceTag")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceTagRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateRouterRequest, AssociateRouterResponse> associateRouter =
        genForassociateRouter();

    private static HttpRequestDef<AssociateRouterRequest, AssociateRouterResponse> genForassociateRouter() {
        // basic
        HttpRequestDef.Builder<AssociateRouterRequest, AssociateRouterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateRouterRequest.class, AssociateRouterResponse.class)
                .withName("AssociateRouter")
                .withUri("/v2/zones/{zone_id}/associaterouter")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRouterRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));
        builder.<AssociateRouterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateRouterReq.class),
            f -> f.withMarshaller(AssociateRouterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivateZoneRequest, CreatePrivateZoneResponse> createPrivateZone =
        genForcreatePrivateZone();

    private static HttpRequestDef<CreatePrivateZoneRequest, CreatePrivateZoneResponse> genForcreatePrivateZone() {
        // basic
        HttpRequestDef.Builder<CreatePrivateZoneRequest, CreatePrivateZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePrivateZoneRequest.class, CreatePrivateZoneResponse.class)
                .withName("CreatePrivateZone")
                .withUri("/v2/zones")
                .withContentType("application/json");

        // requests
        builder.<CreatePrivateZoneReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreatePrivateZoneReq.class),
            f -> f.withMarshaller(CreatePrivateZoneRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePublicZoneRequest, CreatePublicZoneResponse> createPublicZone =
        genForcreatePublicZone();

    private static HttpRequestDef<CreatePublicZoneRequest, CreatePublicZoneResponse> genForcreatePublicZone() {
        // basic
        HttpRequestDef.Builder<CreatePublicZoneRequest, CreatePublicZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePublicZoneRequest.class, CreatePublicZoneResponse.class)
                .withName("CreatePublicZone")
                .withUri("/v2/zones")
                .withContentType("application/json");

        // requests
        builder.<CreatePublicZoneReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePublicZoneReq.class),
            f -> f.withMarshaller(CreatePublicZoneRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePrivateZoneRequest, DeletePrivateZoneResponse> deletePrivateZone =
        genFordeletePrivateZone();

    private static HttpRequestDef<DeletePrivateZoneRequest, DeletePrivateZoneResponse> genFordeletePrivateZone() {
        // basic
        HttpRequestDef.Builder<DeletePrivateZoneRequest, DeletePrivateZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePrivateZoneRequest.class, DeletePrivateZoneResponse.class)
                .withName("DeletePrivateZone")
                .withUri("/v2/zones/{zone_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePrivateZoneRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePublicZoneRequest, DeletePublicZoneResponse> deletePublicZone =
        genFordeletePublicZone();

    private static HttpRequestDef<DeletePublicZoneRequest, DeletePublicZoneResponse> genFordeletePublicZone() {
        // basic
        HttpRequestDef.Builder<DeletePublicZoneRequest, DeletePublicZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePublicZoneRequest.class, DeletePublicZoneResponse.class)
                .withName("DeletePublicZone")
                .withUri("/v2/zones/{zone_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePublicZoneRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateRouterRequest, DisassociateRouterResponse> disassociateRouter =
        genFordisassociateRouter();

    private static HttpRequestDef<DisassociateRouterRequest, DisassociateRouterResponse> genFordisassociateRouter() {
        // basic
        HttpRequestDef.Builder<DisassociateRouterRequest, DisassociateRouterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisassociateRouterRequest.class, DisassociateRouterResponse.class)
                .withName("DisassociateRouter")
                .withUri("/v2/zones/{zone_id}/disassociaterouter")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateRouterRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));
        builder.<DisassociaterouterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociaterouterReq.class),
            f -> f.withMarshaller(DisassociateRouterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivateZonesRequest, ListPrivateZonesResponse> listPrivateZones =
        genForlistPrivateZones();

    private static HttpRequestDef<ListPrivateZonesRequest, ListPrivateZonesResponse> genForlistPrivateZones() {
        // basic
        HttpRequestDef.Builder<ListPrivateZonesRequest, ListPrivateZonesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPrivateZonesRequest.class, ListPrivateZonesResponse.class)
                .withName("ListPrivateZones")
                .withUri("/v2/zones")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublicZonesRequest, ListPublicZonesResponse> listPublicZones =
        genForlistPublicZones();

    private static HttpRequestDef<ListPublicZonesRequest, ListPublicZonesResponse> genForlistPublicZones() {
        // basic
        HttpRequestDef.Builder<ListPublicZonesRequest, ListPublicZonesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPublicZonesRequest.class, ListPublicZonesResponse.class)
                .withName("ListPublicZones")
                .withUri("/v2/zones")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivateZoneRequest, ShowPrivateZoneResponse> showPrivateZone =
        genForshowPrivateZone();

    private static HttpRequestDef<ShowPrivateZoneRequest, ShowPrivateZoneResponse> genForshowPrivateZone() {
        // basic
        HttpRequestDef.Builder<ShowPrivateZoneRequest, ShowPrivateZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPrivateZoneRequest.class, ShowPrivateZoneResponse.class)
                .withName("ShowPrivateZone")
                .withUri("/v2/zones/{zone_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPrivateZoneRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse> showPrivateZoneNameServer =
        genForshowPrivateZoneNameServer();

    private static HttpRequestDef<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse> genForshowPrivateZoneNameServer() {
        // basic
        HttpRequestDef.Builder<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowPrivateZoneNameServerRequest.class,
                    ShowPrivateZoneNameServerResponse.class)
                .withName("ShowPrivateZoneNameServer")
                .withUri("/v2/zones/{zone_id}/nameservers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPrivateZoneNameServerRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicZoneRequest, ShowPublicZoneResponse> showPublicZone =
        genForshowPublicZone();

    private static HttpRequestDef<ShowPublicZoneRequest, ShowPublicZoneResponse> genForshowPublicZone() {
        // basic
        HttpRequestDef.Builder<ShowPublicZoneRequest, ShowPublicZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPublicZoneRequest.class, ShowPublicZoneResponse.class)
                .withName("ShowPublicZone")
                .withUri("/v2/zones/{zone_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicZoneRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse> showPublicZoneNameServer =
        genForshowPublicZoneNameServer();

    private static HttpRequestDef<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse> genForshowPublicZoneNameServer() {
        // basic
        HttpRequestDef.Builder<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowPublicZoneNameServerRequest.class, ShowPublicZoneNameServerResponse.class)
                .withName("ShowPublicZoneNameServer")
                .withUri("/v2/zones/{zone_id}/nameservers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicZoneNameServerRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse> updatePrivateZone =
        genForupdatePrivateZone();

    private static HttpRequestDef<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse> genForupdatePrivateZone() {
        // basic
        HttpRequestDef.Builder<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdatePrivateZoneRequest.class, UpdatePrivateZoneResponse.class)
                .withName("UpdatePrivateZone")
                .withUri("/v2/zones/{zone_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrivateZoneRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));
        builder.<UpdatePrivateZoneInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePrivateZoneInfoReq.class),
            f -> f.withMarshaller(UpdatePrivateZoneRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePublicZoneRequest, UpdatePublicZoneResponse> updatePublicZone =
        genForupdatePublicZone();

    private static HttpRequestDef<UpdatePublicZoneRequest, UpdatePublicZoneResponse> genForupdatePublicZone() {
        // basic
        HttpRequestDef.Builder<UpdatePublicZoneRequest, UpdatePublicZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdatePublicZoneRequest.class, UpdatePublicZoneResponse.class)
                .withName("UpdatePublicZone")
                .withUri("/v2/zones/{zone_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePublicZoneRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));
        builder.<UpdatePublicZoneInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePublicZoneInfo.class),
            f -> f.withMarshaller(UpdatePublicZoneRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse> updatePublicZoneStatus =
        genForupdatePublicZoneStatus();

    private static HttpRequestDef<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse> genForupdatePublicZoneStatus() {
        // basic
        HttpRequestDef.Builder<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePublicZoneStatusRequest.class, UpdatePublicZoneStatusResponse.class)
            .withName("UpdatePublicZoneStatus")
            .withUri("/v2/zones/{zone_id}/statuses")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePublicZoneStatusRequest::getZoneId, (req, v) -> {
                req.setZoneId(v);
            }));
        builder.<UpdatePublicZoneStatus>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePublicZoneStatus.class),
            f -> f.withMarshaller(UpdatePublicZoneStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
