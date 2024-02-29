package com.huaweicloud.sdk.dns.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dns.v2.model.AssociateRouterRequest;
import com.huaweicloud.sdk.dns.v2.model.AssociateRouterRequestBody;
import com.huaweicloud.sdk.dns.v2.model.AssociateRouterResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchCreateTagRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchCreateTagResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchDeleteRecordSetWithLineRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchDeleteRecordSetWithLineRequestBody;
import com.huaweicloud.sdk.dns.v2.model.BatchDeleteRecordSetWithLineResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchHandTags;
import com.huaweicloud.sdk.dns.v2.model.BatchUpdateRecordSetWithLineReq;
import com.huaweicloud.sdk.dns.v2.model.BatchUpdateRecordSetWithLineRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchUpdateRecordSetWithLineResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateCustomLineRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateCustomLineResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateCustomLines;
import com.huaweicloud.sdk.dns.v2.model.CreateEipRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateEipRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateLineGroupRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateLineGroupResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateLineGroupsReq;
import com.huaweicloud.sdk.dns.v2.model.CreatePrivateZoneReq;
import com.huaweicloud.sdk.dns.v2.model.CreatePrivateZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.CreatePrivateZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.CreatePtrReq;
import com.huaweicloud.sdk.dns.v2.model.CreatePublicZoneReq;
import com.huaweicloud.sdk.dns.v2.model.CreatePublicZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.CreatePublicZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateRSetBatchLinesReq;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetRequestBody;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetWithBatchLinesRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetWithBatchLinesResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetWithLineRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetWithLineRequestBody;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetWithLineResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateTagReq;
import com.huaweicloud.sdk.dns.v2.model.CreateTagRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateTagResponse;
import com.huaweicloud.sdk.dns.v2.model.DeleteCustomLineRequest;
import com.huaweicloud.sdk.dns.v2.model.DeleteCustomLineResponse;
import com.huaweicloud.sdk.dns.v2.model.DeleteLineGroupRequest;
import com.huaweicloud.sdk.dns.v2.model.DeleteLineGroupResponse;
import com.huaweicloud.sdk.dns.v2.model.DeletePrivateZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.DeletePrivateZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.DeletePublicZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.DeletePublicZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.DeleteRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.DeleteRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.DeleteRecordSetsRequest;
import com.huaweicloud.sdk.dns.v2.model.DeleteRecordSetsResponse;
import com.huaweicloud.sdk.dns.v2.model.DeleteTagRequest;
import com.huaweicloud.sdk.dns.v2.model.DeleteTagResponse;
import com.huaweicloud.sdk.dns.v2.model.DisassociateRouterRequest;
import com.huaweicloud.sdk.dns.v2.model.DisassociateRouterResponse;
import com.huaweicloud.sdk.dns.v2.model.DisassociaterouterRequestBody;
import com.huaweicloud.sdk.dns.v2.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.dns.v2.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.dns.v2.model.ListCustomLineRequest;
import com.huaweicloud.sdk.dns.v2.model.ListCustomLineResponse;
import com.huaweicloud.sdk.dns.v2.model.ListLineGroupsRequest;
import com.huaweicloud.sdk.dns.v2.model.ListLineGroupsResponse;
import com.huaweicloud.sdk.dns.v2.model.ListNameServersRequest;
import com.huaweicloud.sdk.dns.v2.model.ListNameServersResponse;
import com.huaweicloud.sdk.dns.v2.model.ListPrivateZonesRequest;
import com.huaweicloud.sdk.dns.v2.model.ListPrivateZonesResponse;
import com.huaweicloud.sdk.dns.v2.model.ListPtrRecordsRequest;
import com.huaweicloud.sdk.dns.v2.model.ListPtrRecordsResponse;
import com.huaweicloud.sdk.dns.v2.model.ListPublicZonesRequest;
import com.huaweicloud.sdk.dns.v2.model.ListPublicZonesResponse;
import com.huaweicloud.sdk.dns.v2.model.ListRecordSetsByZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.ListRecordSetsByZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.ListRecordSetsRequest;
import com.huaweicloud.sdk.dns.v2.model.ListRecordSetsResponse;
import com.huaweicloud.sdk.dns.v2.model.ListRecordSetsWithLineRequest;
import com.huaweicloud.sdk.dns.v2.model.ListRecordSetsWithLineResponse;
import com.huaweicloud.sdk.dns.v2.model.ListTagReq;
import com.huaweicloud.sdk.dns.v2.model.ListTagRequest;
import com.huaweicloud.sdk.dns.v2.model.ListTagResponse;
import com.huaweicloud.sdk.dns.v2.model.ListTagsRequest;
import com.huaweicloud.sdk.dns.v2.model.ListTagsResponse;
import com.huaweicloud.sdk.dns.v2.model.RestorePtrRecordRequest;
import com.huaweicloud.sdk.dns.v2.model.RestorePtrRecordResponse;
import com.huaweicloud.sdk.dns.v2.model.RestorePtrReq;
import com.huaweicloud.sdk.dns.v2.model.SetRecordSetsStatusReq;
import com.huaweicloud.sdk.dns.v2.model.SetRecordSetsStatusRequest;
import com.huaweicloud.sdk.dns.v2.model.SetRecordSetsStatusResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowApiInfoRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowApiInfoResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowDomainQuotaRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowDomainQuotaResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowLineGroupRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowLineGroupResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowPrivateZoneNameServerRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowPrivateZoneNameServerResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowPrivateZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowPrivateZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowPtrRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowPtrRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowPublicZoneNameServerRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowPublicZoneNameServerResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowPublicZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowPublicZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowRecordSetByZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowRecordSetByZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowRecordSetWithLineRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowRecordSetWithLineResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowResourceTagRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowResourceTagResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdateCustomLineRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdateCustomLineResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdateCustomsLineReq;
import com.huaweicloud.sdk.dns.v2.model.UpdateLineGroupsBody;
import com.huaweicloud.sdk.dns.v2.model.UpdateLineGroupsRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdateLineGroupsResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdatePrivateZoneInfoReq;
import com.huaweicloud.sdk.dns.v2.model.UpdatePrivateZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdatePrivateZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdatePtrRecordRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdatePtrRecordResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdatePtrReq;
import com.huaweicloud.sdk.dns.v2.model.UpdatePublicZoneInfo;
import com.huaweicloud.sdk.dns.v2.model.UpdatePublicZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdatePublicZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdatePublicZoneStatusRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdatePublicZoneStatusRequestBody;
import com.huaweicloud.sdk.dns.v2.model.UpdatePublicZoneStatusResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdateRecordSetReq;
import com.huaweicloud.sdk.dns.v2.model.UpdateRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdateRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdateRecordSetsReq;
import com.huaweicloud.sdk.dns.v2.model.UpdateRecordSetsRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdateRecordSetsResponse;

@SuppressWarnings("unchecked")
public class DnsMeta {

    public static final HttpRequestDef<CreateCustomLineRequest, CreateCustomLineResponse> createCustomLine =
        genForCreateCustomLine();

    private static HttpRequestDef<CreateCustomLineRequest, CreateCustomLineResponse> genForCreateCustomLine() {
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
            f -> f.withMarshaller(CreateCustomLineRequest::getBody, CreateCustomLineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLineGroupRequest, CreateLineGroupResponse> createLineGroup =
        genForCreateLineGroup();

    private static HttpRequestDef<CreateLineGroupRequest, CreateLineGroupResponse> genForCreateLineGroup() {
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
            f -> f.withMarshaller(CreateLineGroupRequest::getBody, CreateLineGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCustomLineRequest, DeleteCustomLineResponse> deleteCustomLine =
        genForDeleteCustomLine();

    private static HttpRequestDef<DeleteCustomLineRequest, DeleteCustomLineResponse> genForDeleteCustomLine() {
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
            f -> f.withMarshaller(DeleteCustomLineRequest::getLineId, DeleteCustomLineRequest::setLineId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLineGroupRequest, DeleteLineGroupResponse> deleteLineGroup =
        genForDeleteLineGroup();

    private static HttpRequestDef<DeleteLineGroupRequest, DeleteLineGroupResponse> genForDeleteLineGroup() {
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
            f -> f.withMarshaller(DeleteLineGroupRequest::getLinegroupId, DeleteLineGroupRequest::setLinegroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions =
        genForListApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForListApiVersions() {
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
        genForListCustomLine();

    private static HttpRequestDef<ListCustomLineRequest, ListCustomLineResponse> genForListCustomLine() {
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
            f -> f.withMarshaller(ListCustomLineRequest::getLineId, ListCustomLineRequest::setLineId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomLineRequest::getName, ListCustomLineRequest::setName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomLineRequest::getLimit, ListCustomLineRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomLineRequest::getOffset, ListCustomLineRequest::setOffset));
        builder.<Boolean>withRequestField("show_detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCustomLineRequest::getShowDetail, ListCustomLineRequest::setShowDetail));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLineGroupsRequest, ListLineGroupsResponse> listLineGroups =
        genForListLineGroups();

    private static HttpRequestDef<ListLineGroupsRequest, ListLineGroupsResponse> genForListLineGroups() {
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
            f -> f.withMarshaller(ListLineGroupsRequest::getLineId, ListLineGroupsRequest::setLineId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLineGroupsRequest::getName, ListLineGroupsRequest::setName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLineGroupsRequest::getLimit, ListLineGroupsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLineGroupsRequest::getOffset, ListLineGroupsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNameServersRequest, ListNameServersResponse> listNameServers =
        genForListNameServers();

    private static HttpRequestDef<ListNameServersRequest, ListNameServersResponse> genForListNameServers() {
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
            f -> f.withMarshaller(ListNameServersRequest::getType, ListNameServersRequest::setType));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNameServersRequest::getRegion, ListNameServersRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiInfoRequest, ShowApiInfoResponse> showApiInfo = genForShowApiInfo();

    private static HttpRequestDef<ShowApiInfoRequest, ShowApiInfoResponse> genForShowApiInfo() {
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
            f -> f.withMarshaller(ShowApiInfoRequest::getVersion, ShowApiInfoRequest::setVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainQuotaRequest, ShowDomainQuotaResponse> showDomainQuota =
        genForShowDomainQuota();

    private static HttpRequestDef<ShowDomainQuotaRequest, ShowDomainQuotaResponse> genForShowDomainQuota() {
        // basic
        HttpRequestDef.Builder<ShowDomainQuotaRequest, ShowDomainQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainQuotaRequest.class, ShowDomainQuotaResponse.class)
                .withName("ShowDomainQuota")
                .withUri("/v2/quotamg/dns/quotas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainQuotaRequest::getDomainId, ShowDomainQuotaRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLineGroupRequest, ShowLineGroupResponse> showLineGroup =
        genForShowLineGroup();

    private static HttpRequestDef<ShowLineGroupRequest, ShowLineGroupResponse> genForShowLineGroup() {
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
            f -> f.withMarshaller(ShowLineGroupRequest::getLinegroupId, ShowLineGroupRequest::setLinegroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCustomLineRequest, UpdateCustomLineResponse> updateCustomLine =
        genForUpdateCustomLine();

    private static HttpRequestDef<UpdateCustomLineRequest, UpdateCustomLineResponse> genForUpdateCustomLine() {
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
            f -> f.withMarshaller(UpdateCustomLineRequest::getLineId, UpdateCustomLineRequest::setLineId));
        builder.<UpdateCustomsLineReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateCustomsLineReq.class),
            f -> f.withMarshaller(UpdateCustomLineRequest::getBody, UpdateCustomLineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLineGroupsRequest, UpdateLineGroupsResponse> updateLineGroups =
        genForUpdateLineGroups();

    private static HttpRequestDef<UpdateLineGroupsRequest, UpdateLineGroupsResponse> genForUpdateLineGroups() {
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
            f -> f.withMarshaller(UpdateLineGroupsRequest::getLinegroupId, UpdateLineGroupsRequest::setLinegroupId));
        builder.<UpdateLineGroupsBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLineGroupsBody.class),
            f -> f.withMarshaller(UpdateLineGroupsRequest::getBody, UpdateLineGroupsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEipRecordSetRequest, CreateEipRecordSetResponse> createEipRecordSet =
        genForCreateEipRecordSet();

    private static HttpRequestDef<CreateEipRecordSetRequest, CreateEipRecordSetResponse> genForCreateEipRecordSet() {
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
            f -> f.withMarshaller(CreateEipRecordSetRequest::getRegion, CreateEipRecordSetRequest::setRegion));
        builder.<String>withRequestField("floatingip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEipRecordSetRequest::getFloatingipId,
                CreateEipRecordSetRequest::setFloatingipId));
        builder.<CreatePtrReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePtrReq.class),
            f -> f.withMarshaller(CreateEipRecordSetRequest::getBody, CreateEipRecordSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPtrRecordsRequest, ListPtrRecordsResponse> listPtrRecords =
        genForListPtrRecords();

    private static HttpRequestDef<ListPtrRecordsRequest, ListPtrRecordsResponse> genForListPtrRecords() {
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
            f -> f.withMarshaller(ListPtrRecordsRequest::getMarker, ListPtrRecordsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPtrRecordsRequest::getLimit, ListPtrRecordsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPtrRecordsRequest::getOffset, ListPtrRecordsRequest::setOffset));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPtrRecordsRequest::getEnterpriseProjectId,
                ListPtrRecordsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPtrRecordsRequest::getTags, ListPtrRecordsRequest::setTags));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPtrRecordsRequest::getStatus, ListPtrRecordsRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestorePtrRecordRequest, RestorePtrRecordResponse> restorePtrRecord =
        genForRestorePtrRecord();

    private static HttpRequestDef<RestorePtrRecordRequest, RestorePtrRecordResponse> genForRestorePtrRecord() {
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
            f -> f.withMarshaller(RestorePtrRecordRequest::getRegion, RestorePtrRecordRequest::setRegion));
        builder.<String>withRequestField("floatingip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestorePtrRecordRequest::getFloatingipId, RestorePtrRecordRequest::setFloatingipId));
        builder.<RestorePtrReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RestorePtrReq.class),
            f -> f.withMarshaller(RestorePtrRecordRequest::getBody, RestorePtrRecordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse> showPtrRecordSet =
        genForShowPtrRecordSet();

    private static HttpRequestDef<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse> genForShowPtrRecordSet() {
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
            f -> f.withMarshaller(ShowPtrRecordSetRequest::getRegion, ShowPtrRecordSetRequest::setRegion));
        builder.<String>withRequestField("floatingip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPtrRecordSetRequest::getFloatingipId, ShowPtrRecordSetRequest::setFloatingipId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePtrRecordRequest, UpdatePtrRecordResponse> updatePtrRecord =
        genForUpdatePtrRecord();

    private static HttpRequestDef<UpdatePtrRecordRequest, UpdatePtrRecordResponse> genForUpdatePtrRecord() {
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
            f -> f.withMarshaller(UpdatePtrRecordRequest::getRegion, UpdatePtrRecordRequest::setRegion));
        builder.<String>withRequestField("floatingip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePtrRecordRequest::getFloatingipId, UpdatePtrRecordRequest::setFloatingipId));
        builder.<UpdatePtrReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePtrReq.class),
            f -> f.withMarshaller(UpdatePtrRecordRequest::getBody, UpdatePtrRecordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse> batchDeleteRecordSetWithLine =
        genForBatchDeleteRecordSetWithLine();

    private static HttpRequestDef<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse> genForBatchDeleteRecordSetWithLine() {
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
            f -> f.withMarshaller(BatchDeleteRecordSetWithLineRequest::getZoneId,
                BatchDeleteRecordSetWithLineRequest::setZoneId));
        builder.<BatchDeleteRecordSetWithLineRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteRecordSetWithLineRequestBody.class),
            f -> f.withMarshaller(BatchDeleteRecordSetWithLineRequest::getBody,
                BatchDeleteRecordSetWithLineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse> batchUpdateRecordSetWithLine =
        genForBatchUpdateRecordSetWithLine();

    private static HttpRequestDef<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse> genForBatchUpdateRecordSetWithLine() {
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
            f -> f.withMarshaller(BatchUpdateRecordSetWithLineRequest::getZoneId,
                BatchUpdateRecordSetWithLineRequest::setZoneId));
        builder.<BatchUpdateRecordSetWithLineReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateRecordSetWithLineReq.class),
            f -> f.withMarshaller(BatchUpdateRecordSetWithLineRequest::getBody,
                BatchUpdateRecordSetWithLineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordSetRequest, CreateRecordSetResponse> createRecordSet =
        genForCreateRecordSet();

    private static HttpRequestDef<CreateRecordSetRequest, CreateRecordSetResponse> genForCreateRecordSet() {
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
            f -> f.withMarshaller(CreateRecordSetRequest::getZoneId, CreateRecordSetRequest::setZoneId));
        builder.<CreateRecordSetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRecordSetRequestBody.class),
            f -> f.withMarshaller(CreateRecordSetRequest::getBody, CreateRecordSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse> createRecordSetWithBatchLines =
        genForCreateRecordSetWithBatchLines();

    private static HttpRequestDef<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse> genForCreateRecordSetWithBatchLines() {
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
            f -> f.withMarshaller(CreateRecordSetWithBatchLinesRequest::getZoneId,
                CreateRecordSetWithBatchLinesRequest::setZoneId));
        builder.<CreateRSetBatchLinesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRSetBatchLinesReq.class),
            f -> f.withMarshaller(CreateRecordSetWithBatchLinesRequest::getBody,
                CreateRecordSetWithBatchLinesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse> createRecordSetWithLine =
        genForCreateRecordSetWithLine();

    private static HttpRequestDef<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse> genForCreateRecordSetWithLine() {
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
            f -> f.withMarshaller(CreateRecordSetWithLineRequest::getZoneId,
                CreateRecordSetWithLineRequest::setZoneId));
        builder.<CreateRecordSetWithLineRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRecordSetWithLineRequestBody.class),
            f -> f.withMarshaller(CreateRecordSetWithLineRequest::getBody, CreateRecordSetWithLineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRecordSetRequest, DeleteRecordSetResponse> deleteRecordSet =
        genForDeleteRecordSet();

    private static HttpRequestDef<DeleteRecordSetRequest, DeleteRecordSetResponse> genForDeleteRecordSet() {
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
            f -> f.withMarshaller(DeleteRecordSetRequest::getZoneId, DeleteRecordSetRequest::setZoneId));
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordSetRequest::getRecordsetId, DeleteRecordSetRequest::setRecordsetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRecordSetsRequest, DeleteRecordSetsResponse> deleteRecordSets =
        genForDeleteRecordSets();

    private static HttpRequestDef<DeleteRecordSetsRequest, DeleteRecordSetsResponse> genForDeleteRecordSets() {
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
            f -> f.withMarshaller(DeleteRecordSetsRequest::getZoneId, DeleteRecordSetsRequest::setZoneId));
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordSetsRequest::getRecordsetId, DeleteRecordSetsRequest::setRecordsetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecordSetsRequest, ListRecordSetsResponse> listRecordSets =
        genForListRecordSets();

    private static HttpRequestDef<ListRecordSetsRequest, ListRecordSetsResponse> genForListRecordSets() {
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
            f -> f.withMarshaller(ListRecordSetsRequest::getZoneType, ListRecordSetsRequest::setZoneType));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getMarker, ListRecordSetsRequest::setMarker));
        builder.<String>withRequestField("search_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getSearchMode, ListRecordSetsRequest::setSearchMode));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getLimit, ListRecordSetsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getOffset, ListRecordSetsRequest::setOffset));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getTags, ListRecordSetsRequest::setTags));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getStatus, ListRecordSetsRequest::setStatus));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getType, ListRecordSetsRequest::setType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getName, ListRecordSetsRequest::setName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getId, ListRecordSetsRequest::setId));
        builder.<String>withRequestField("records",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getRecords, ListRecordSetsRequest::setRecords));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getSortKey, ListRecordSetsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getSortDir, ListRecordSetsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse> listRecordSetsByZone =
        genForListRecordSetsByZone();

    private static HttpRequestDef<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse> genForListRecordSetsByZone() {
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
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getZoneId, ListRecordSetsByZoneRequest::setZoneId));
        builder.<String>withRequestField("search_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getSearchMode,
                ListRecordSetsByZoneRequest::setSearchMode));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getMarker, ListRecordSetsByZoneRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getLimit, ListRecordSetsByZoneRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getOffset, ListRecordSetsByZoneRequest::setOffset));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getTags, ListRecordSetsByZoneRequest::setTags));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getStatus, ListRecordSetsByZoneRequest::setStatus));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getType, ListRecordSetsByZoneRequest::setType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getName, ListRecordSetsByZoneRequest::setName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getId, ListRecordSetsByZoneRequest::setId));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getSortKey, ListRecordSetsByZoneRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getSortDir, ListRecordSetsByZoneRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse> listRecordSetsWithLine =
        genForListRecordSetsWithLine();

    private static HttpRequestDef<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse> genForListRecordSetsWithLine() {
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
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getZoneType,
                ListRecordSetsWithLineRequest::setZoneType));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getMarker, ListRecordSetsWithLineRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getLimit, ListRecordSetsWithLineRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getOffset, ListRecordSetsWithLineRequest::setOffset));
        builder.<String>withRequestField("line_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getLineId, ListRecordSetsWithLineRequest::setLineId));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getTags, ListRecordSetsWithLineRequest::setTags));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getStatus, ListRecordSetsWithLineRequest::setStatus));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getType, ListRecordSetsWithLineRequest::setType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getName, ListRecordSetsWithLineRequest::setName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getId, ListRecordSetsWithLineRequest::setId));
        builder.<String>withRequestField("records",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getRecords,
                ListRecordSetsWithLineRequest::setRecords));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getSortKey,
                ListRecordSetsWithLineRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getSortDir,
                ListRecordSetsWithLineRequest::setSortDir));
        builder.<String>withRequestField("health_check_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getHealthCheckId,
                ListRecordSetsWithLineRequest::setHealthCheckId));
        builder.<String>withRequestField("search_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getSearchMode,
                ListRecordSetsWithLineRequest::setSearchMode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse> setRecordSetsStatus =
        genForSetRecordSetsStatus();

    private static HttpRequestDef<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse> genForSetRecordSetsStatus() {
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
            f -> f.withMarshaller(SetRecordSetsStatusRequest::getRecordsetId,
                SetRecordSetsStatusRequest::setRecordsetId));
        builder.<SetRecordSetsStatusReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetRecordSetsStatusReq.class),
            f -> f.withMarshaller(SetRecordSetsStatusRequest::getBody, SetRecordSetsStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordSetRequest, ShowRecordSetResponse> showRecordSet =
        genForShowRecordSet();

    private static HttpRequestDef<ShowRecordSetRequest, ShowRecordSetResponse> genForShowRecordSet() {
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
            f -> f.withMarshaller(ShowRecordSetRequest::getZoneId, ShowRecordSetRequest::setZoneId));
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetRequest::getRecordsetId, ShowRecordSetRequest::setRecordsetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse> showRecordSetByZone =
        genForShowRecordSetByZone();

    private static HttpRequestDef<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse> genForShowRecordSetByZone() {
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
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getZoneId, ShowRecordSetByZoneRequest::setZoneId));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getMarker, ShowRecordSetByZoneRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getLimit, ShowRecordSetByZoneRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getOffset, ShowRecordSetByZoneRequest::setOffset));
        builder.<String>withRequestField("line_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getLineId, ShowRecordSetByZoneRequest::setLineId));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getTags, ShowRecordSetByZoneRequest::setTags));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getStatus, ShowRecordSetByZoneRequest::setStatus));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getType, ShowRecordSetByZoneRequest::setType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getName, ShowRecordSetByZoneRequest::setName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getId, ShowRecordSetByZoneRequest::setId));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getSortKey, ShowRecordSetByZoneRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getSortDir, ShowRecordSetByZoneRequest::setSortDir));
        builder.<String>withRequestField("search_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getSearchMode,
                ShowRecordSetByZoneRequest::setSearchMode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse> showRecordSetWithLine =
        genForShowRecordSetWithLine();

    private static HttpRequestDef<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse> genForShowRecordSetWithLine() {
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
            f -> f.withMarshaller(ShowRecordSetWithLineRequest::getZoneId, ShowRecordSetWithLineRequest::setZoneId));
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetWithLineRequest::getRecordsetId,
                ShowRecordSetWithLineRequest::setRecordsetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecordSetRequest, UpdateRecordSetResponse> updateRecordSet =
        genForUpdateRecordSet();

    private static HttpRequestDef<UpdateRecordSetRequest, UpdateRecordSetResponse> genForUpdateRecordSet() {
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
            f -> f.withMarshaller(UpdateRecordSetRequest::getZoneId, UpdateRecordSetRequest::setZoneId));
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordSetRequest::getRecordsetId, UpdateRecordSetRequest::setRecordsetId));
        builder.<UpdateRecordSetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateRecordSetReq.class),
            f -> f.withMarshaller(UpdateRecordSetRequest::getBody, UpdateRecordSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecordSetsRequest, UpdateRecordSetsResponse> updateRecordSets =
        genForUpdateRecordSets();

    private static HttpRequestDef<UpdateRecordSetsRequest, UpdateRecordSetsResponse> genForUpdateRecordSets() {
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
            f -> f.withMarshaller(UpdateRecordSetsRequest::getZoneId, UpdateRecordSetsRequest::setZoneId));
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordSetsRequest::getRecordsetId, UpdateRecordSetsRequest::setRecordsetId));
        builder.<UpdateRecordSetsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateRecordSetsReq.class),
            f -> f.withMarshaller(UpdateRecordSetsRequest::getBody, UpdateRecordSetsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateTagRequest, BatchCreateTagResponse> batchCreateTag =
        genForBatchCreateTag();

    private static HttpRequestDef<BatchCreateTagRequest, BatchCreateTagResponse> genForBatchCreateTag() {
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
            f -> f.withMarshaller(BatchCreateTagRequest::getResourceType, BatchCreateTagRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateTagRequest::getResourceId, BatchCreateTagRequest::setResourceId));
        builder.<BatchHandTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchHandTags.class),
            f -> f.withMarshaller(BatchCreateTagRequest::getBody, BatchCreateTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagRequest, CreateTagResponse> createTag = genForCreateTag();

    private static HttpRequestDef<CreateTagRequest, CreateTagResponse> genForCreateTag() {
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
            f -> f.withMarshaller(CreateTagRequest::getResourceType, CreateTagRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getResourceId, CreateTagRequest::setResourceId));
        builder.<CreateTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateTagReq.class),
            f -> f.withMarshaller(CreateTagRequest::getBody, CreateTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagRequest, DeleteTagResponse> deleteTag = genForDeleteTag();

    private static HttpRequestDef<DeleteTagRequest, DeleteTagResponse> genForDeleteTag() {
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
            f -> f.withMarshaller(DeleteTagRequest::getResourceType, DeleteTagRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getResourceId, DeleteTagRequest::setResourceId));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getKey, DeleteTagRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagRequest, ListTagResponse> listTag = genForListTag();

    private static HttpRequestDef<ListTagRequest, ListTagResponse> genForListTag() {
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
            f -> f.withMarshaller(ListTagRequest::getResourceType, ListTagRequest::setResourceType));
        builder.<ListTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTagReq.class),
            f -> f.withMarshaller(ListTagRequest::getBody, ListTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForListTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForListTags() {
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
            f -> f.withMarshaller(ListTagsRequest::getResourceType, ListTagsRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTag =
        genForShowResourceTag();

    private static HttpRequestDef<ShowResourceTagRequest, ShowResourceTagResponse> genForShowResourceTag() {
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
            f -> f.withMarshaller(ShowResourceTagRequest::getResourceType, ShowResourceTagRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceTagRequest::getResourceId, ShowResourceTagRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateRouterRequest, AssociateRouterResponse> associateRouter =
        genForAssociateRouter();

    private static HttpRequestDef<AssociateRouterRequest, AssociateRouterResponse> genForAssociateRouter() {
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
            f -> f.withMarshaller(AssociateRouterRequest::getZoneId, AssociateRouterRequest::setZoneId));
        builder.<AssociateRouterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateRouterRequestBody.class),
            f -> f.withMarshaller(AssociateRouterRequest::getBody, AssociateRouterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivateZoneRequest, CreatePrivateZoneResponse> createPrivateZone =
        genForCreatePrivateZone();

    private static HttpRequestDef<CreatePrivateZoneRequest, CreatePrivateZoneResponse> genForCreatePrivateZone() {
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
            f -> f.withMarshaller(CreatePrivateZoneRequest::getBody, CreatePrivateZoneRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePublicZoneRequest, CreatePublicZoneResponse> createPublicZone =
        genForCreatePublicZone();

    private static HttpRequestDef<CreatePublicZoneRequest, CreatePublicZoneResponse> genForCreatePublicZone() {
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
            f -> f.withMarshaller(CreatePublicZoneRequest::getBody, CreatePublicZoneRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePrivateZoneRequest, DeletePrivateZoneResponse> deletePrivateZone =
        genForDeletePrivateZone();

    private static HttpRequestDef<DeletePrivateZoneRequest, DeletePrivateZoneResponse> genForDeletePrivateZone() {
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
            f -> f.withMarshaller(DeletePrivateZoneRequest::getZoneId, DeletePrivateZoneRequest::setZoneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePublicZoneRequest, DeletePublicZoneResponse> deletePublicZone =
        genForDeletePublicZone();

    private static HttpRequestDef<DeletePublicZoneRequest, DeletePublicZoneResponse> genForDeletePublicZone() {
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
            f -> f.withMarshaller(DeletePublicZoneRequest::getZoneId, DeletePublicZoneRequest::setZoneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateRouterRequest, DisassociateRouterResponse> disassociateRouter =
        genForDisassociateRouter();

    private static HttpRequestDef<DisassociateRouterRequest, DisassociateRouterResponse> genForDisassociateRouter() {
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
            f -> f.withMarshaller(DisassociateRouterRequest::getZoneId, DisassociateRouterRequest::setZoneId));
        builder.<DisassociaterouterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociaterouterRequestBody.class),
            f -> f.withMarshaller(DisassociateRouterRequest::getBody, DisassociateRouterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivateZonesRequest, ListPrivateZonesResponse> listPrivateZones =
        genForListPrivateZones();

    private static HttpRequestDef<ListPrivateZonesRequest, ListPrivateZonesResponse> genForListPrivateZones() {
        // basic
        HttpRequestDef.Builder<ListPrivateZonesRequest, ListPrivateZonesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPrivateZonesRequest.class, ListPrivateZonesResponse.class)
                .withName("ListPrivateZones")
                .withUri("/v2/zones")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getType, ListPrivateZonesRequest::setType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getLimit, ListPrivateZonesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getMarker, ListPrivateZonesRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getOffset, ListPrivateZonesRequest::setOffset));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getTags, ListPrivateZonesRequest::setTags));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getName, ListPrivateZonesRequest::setName));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getStatus, ListPrivateZonesRequest::setStatus));
        builder.<String>withRequestField("search_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getSearchMode, ListPrivateZonesRequest::setSearchMode));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getEnterpriseProjectId,
                ListPrivateZonesRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublicZonesRequest, ListPublicZonesResponse> listPublicZones =
        genForListPublicZones();

    private static HttpRequestDef<ListPublicZonesRequest, ListPublicZonesResponse> genForListPublicZones() {
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
            f -> f.withMarshaller(ListPublicZonesRequest::getType, ListPublicZonesRequest::setType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getLimit, ListPublicZonesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getMarker, ListPublicZonesRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getOffset, ListPublicZonesRequest::setOffset));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getTags, ListPublicZonesRequest::setTags));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getName, ListPublicZonesRequest::setName));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getStatus, ListPublicZonesRequest::setStatus));
        builder.<String>withRequestField("search_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getSearchMode, ListPublicZonesRequest::setSearchMode));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getEnterpriseProjectId,
                ListPublicZonesRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivateZoneRequest, ShowPrivateZoneResponse> showPrivateZone =
        genForShowPrivateZone();

    private static HttpRequestDef<ShowPrivateZoneRequest, ShowPrivateZoneResponse> genForShowPrivateZone() {
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
            f -> f.withMarshaller(ShowPrivateZoneRequest::getZoneId, ShowPrivateZoneRequest::setZoneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse> showPrivateZoneNameServer =
        genForShowPrivateZoneNameServer();

    private static HttpRequestDef<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse> genForShowPrivateZoneNameServer() {
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
            f -> f.withMarshaller(ShowPrivateZoneNameServerRequest::getZoneId,
                ShowPrivateZoneNameServerRequest::setZoneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicZoneRequest, ShowPublicZoneResponse> showPublicZone =
        genForShowPublicZone();

    private static HttpRequestDef<ShowPublicZoneRequest, ShowPublicZoneResponse> genForShowPublicZone() {
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
            f -> f.withMarshaller(ShowPublicZoneRequest::getZoneId, ShowPublicZoneRequest::setZoneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse> showPublicZoneNameServer =
        genForShowPublicZoneNameServer();

    private static HttpRequestDef<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse> genForShowPublicZoneNameServer() {
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
            f -> f.withMarshaller(ShowPublicZoneNameServerRequest::getZoneId,
                ShowPublicZoneNameServerRequest::setZoneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse> updatePrivateZone =
        genForUpdatePrivateZone();

    private static HttpRequestDef<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse> genForUpdatePrivateZone() {
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
            f -> f.withMarshaller(UpdatePrivateZoneRequest::getZoneId, UpdatePrivateZoneRequest::setZoneId));
        builder.<UpdatePrivateZoneInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePrivateZoneInfoReq.class),
            f -> f.withMarshaller(UpdatePrivateZoneRequest::getBody, UpdatePrivateZoneRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePublicZoneRequest, UpdatePublicZoneResponse> updatePublicZone =
        genForUpdatePublicZone();

    private static HttpRequestDef<UpdatePublicZoneRequest, UpdatePublicZoneResponse> genForUpdatePublicZone() {
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
            f -> f.withMarshaller(UpdatePublicZoneRequest::getZoneId, UpdatePublicZoneRequest::setZoneId));
        builder.<UpdatePublicZoneInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePublicZoneInfo.class),
            f -> f.withMarshaller(UpdatePublicZoneRequest::getBody, UpdatePublicZoneRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse> updatePublicZoneStatus =
        genForUpdatePublicZoneStatus();

    private static HttpRequestDef<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse> genForUpdatePublicZoneStatus() {
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
            f -> f.withMarshaller(UpdatePublicZoneStatusRequest::getZoneId, UpdatePublicZoneStatusRequest::setZoneId));
        builder.<UpdatePublicZoneStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePublicZoneStatusRequestBody.class),
            f -> f.withMarshaller(UpdatePublicZoneStatusRequest::getBody, UpdatePublicZoneStatusRequest::setBody));

        // response

        return builder.build();
    }

}
