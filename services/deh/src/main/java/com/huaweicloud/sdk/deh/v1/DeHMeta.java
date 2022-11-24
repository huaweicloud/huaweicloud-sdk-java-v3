package com.huaweicloud.sdk.deh.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.deh.v1.model.*;

@SuppressWarnings("unchecked")
public class DeHMeta {

    public static final HttpRequestDef<BatchCreateDedicatedHostTagsRequest, BatchCreateDedicatedHostTagsResponse> batchCreateDedicatedHostTags =
        genForbatchCreateDedicatedHostTags();

    private static HttpRequestDef<BatchCreateDedicatedHostTagsRequest, BatchCreateDedicatedHostTagsResponse> genForbatchCreateDedicatedHostTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateDedicatedHostTagsRequest, BatchCreateDedicatedHostTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateDedicatedHostTagsRequest.class,
                    BatchCreateDedicatedHostTagsResponse.class)
                .withName("BatchCreateDedicatedHostTags")
                .withUri("/v1.0/{project_id}/dedicated-host-tags/{dedicated_host_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("dedicated_host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateDedicatedHostTagsRequest::getDedicatedHostId, (req, v) -> {
                req.setDedicatedHostId(v);
            }));
        builder.<ReqSetOrDeleteTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReqSetOrDeleteTags.class),
            f -> f.withMarshaller(BatchCreateDedicatedHostTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDedicatedHostTagsRequest, BatchDeleteDedicatedHostTagsResponse> batchDeleteDedicatedHostTags =
        genForbatchDeleteDedicatedHostTags();

    private static HttpRequestDef<BatchDeleteDedicatedHostTagsRequest, BatchDeleteDedicatedHostTagsResponse> genForbatchDeleteDedicatedHostTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteDedicatedHostTagsRequest, BatchDeleteDedicatedHostTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteDedicatedHostTagsRequest.class,
                    BatchDeleteDedicatedHostTagsResponse.class)
                .withName("BatchDeleteDedicatedHostTags")
                .withUri("/v1.0/{project_id}/dedicated-host-tags/{dedicated_host_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("dedicated_host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteDedicatedHostTagsRequest::getDedicatedHostId, (req, v) -> {
                req.setDedicatedHostId(v);
            }));
        builder.<ReqSetOrDeleteTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReqSetOrDeleteTags.class),
            f -> f.withMarshaller(BatchDeleteDedicatedHostTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDedicatedHostRequest, CreateDedicatedHostResponse> createDedicatedHost =
        genForcreateDedicatedHost();

    private static HttpRequestDef<CreateDedicatedHostRequest, CreateDedicatedHostResponse> genForcreateDedicatedHost() {
        // basic
        HttpRequestDef.Builder<CreateDedicatedHostRequest, CreateDedicatedHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDedicatedHostRequest.class, CreateDedicatedHostResponse.class)
                .withName("CreateDedicatedHost")
                .withUri("/v1.0/{project_id}/dedicated-hosts")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ReqAllocateDeh>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReqAllocateDeh.class),
            f -> f.withMarshaller(CreateDedicatedHostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDedicatedHostRequest, DeleteDedicatedHostResponse> deleteDedicatedHost =
        genFordeleteDedicatedHost();

    private static HttpRequestDef<DeleteDedicatedHostRequest, DeleteDedicatedHostResponse> genFordeleteDedicatedHost() {
        // basic
        HttpRequestDef.Builder<DeleteDedicatedHostRequest, DeleteDedicatedHostResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDedicatedHostRequest.class, DeleteDedicatedHostResponse.class)
            .withName("DeleteDedicatedHost")
            .withUri("/v1.0/{project_id}/dedicated-hosts/{dedicated_host_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dedicated_host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDedicatedHostRequest::getDedicatedHostId, (req, v) -> {
                req.setDedicatedHostId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDedicatedHostTypesRequest, ListDedicatedHostTypesResponse> listDedicatedHostTypes =
        genForlistDedicatedHostTypes();

    private static HttpRequestDef<ListDedicatedHostTypesRequest, ListDedicatedHostTypesResponse> genForlistDedicatedHostTypes() {
        // basic
        HttpRequestDef.Builder<ListDedicatedHostTypesRequest, ListDedicatedHostTypesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDedicatedHostTypesRequest.class, ListDedicatedHostTypesResponse.class)
            .withName("ListDedicatedHostTypes")
            .withUri("/v1.0/{project_id}/availability-zone/{availability_zone}/dedicated-host-types")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("availability_zone",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostTypesRequest::getAvailabilityZone, (req, v) -> {
                req.setAvailabilityZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDedicatedHostsRequest, ListDedicatedHostsResponse> listDedicatedHosts =
        genForlistDedicatedHosts();

    private static HttpRequestDef<ListDedicatedHostsRequest, ListDedicatedHostsResponse> genForlistDedicatedHosts() {
        // basic
        HttpRequestDef.Builder<ListDedicatedHostsRequest, ListDedicatedHostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDedicatedHostsRequest.class, ListDedicatedHostsResponse.class)
                .withName("ListDedicatedHosts")
                .withUri("/v1.0/{project_id}/dedicated-hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dedicated_host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getDedicatedHostId, (req, v) -> {
                req.setDedicatedHostId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("host_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getHostType, (req, v) -> {
                req.setHostType(v);
            }));
        builder.<String>withRequestField("host_type_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getHostTypeName, (req, v) -> {
                req.setHostTypeName(v);
            }));
        builder.<String>withRequestField("flavor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getFlavor, (req, v) -> {
                req.setFlavor(v);
            }));
        builder.<ListDedicatedHostsRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDedicatedHostsRequest.StateEnum.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<String>withRequestField("tenant",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getTenant, (req, v) -> {
                req.setTenant(v);
            }));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getAvailabilityZone, (req, v) -> {
                req.setAvailabilityZone(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<String>withRequestField("instance_uuid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getInstanceUuid, (req, v) -> {
                req.setInstanceUuid(v);
            }));
        builder.<String>withRequestField("released_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getReleasedAt, (req, v) -> {
                req.setReleasedAt(v);
            }));
        builder.<String>withRequestField("changes-since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getChangesSince, (req, v) -> {
                req.setChangesSince(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDedicatedHostsByTagsRequest, ListDedicatedHostsByTagsResponse> listDedicatedHostsByTags =
        genForlistDedicatedHostsByTags();

    private static HttpRequestDef<ListDedicatedHostsByTagsRequest, ListDedicatedHostsByTagsResponse> genForlistDedicatedHostsByTags() {
        // basic
        HttpRequestDef.Builder<ListDedicatedHostsByTagsRequest, ListDedicatedHostsByTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ListDedicatedHostsByTagsRequest.class, ListDedicatedHostsByTagsResponse.class)
                .withName("ListDedicatedHostsByTags")
                .withUri("/v1.0/{project_id}/dedicated-host-tags/resource_instances/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ReqListDehByTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReqListDehByTags.class),
            f -> f.withMarshaller(ListDedicatedHostsByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServersDedicatedHostRequest, ListServersDedicatedHostResponse> listServersDedicatedHost =
        genForlistServersDedicatedHost();

    private static HttpRequestDef<ListServersDedicatedHostRequest, ListServersDedicatedHostResponse> genForlistServersDedicatedHost() {
        // basic
        HttpRequestDef.Builder<ListServersDedicatedHostRequest, ListServersDedicatedHostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListServersDedicatedHostRequest.class, ListServersDedicatedHostResponse.class)
                .withName("ListServersDedicatedHost")
                .withUri("/v1.0/{project_id}/dedicated-hosts/{dedicated_host_id}/servers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dedicated_host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersDedicatedHostRequest::getDedicatedHostId, (req, v) -> {
                req.setDedicatedHostId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServersDedicatedHostRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersDedicatedHostRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDedicatedHostRequest, ShowDedicatedHostResponse> showDedicatedHost =
        genForshowDedicatedHost();

    private static HttpRequestDef<ShowDedicatedHostRequest, ShowDedicatedHostResponse> genForshowDedicatedHost() {
        // basic
        HttpRequestDef.Builder<ShowDedicatedHostRequest, ShowDedicatedHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDedicatedHostRequest.class, ShowDedicatedHostResponse.class)
                .withName("ShowDedicatedHost")
                .withUri("/v1.0/{project_id}/dedicated-hosts/{dedicated_host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dedicated_host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDedicatedHostRequest::getDedicatedHostId, (req, v) -> {
                req.setDedicatedHostId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDedicatedHostTagsRequest, ShowDedicatedHostTagsResponse> showDedicatedHostTags =
        genForshowDedicatedHostTags();

    private static HttpRequestDef<ShowDedicatedHostTagsRequest, ShowDedicatedHostTagsResponse> genForshowDedicatedHostTags() {
        // basic
        HttpRequestDef.Builder<ShowDedicatedHostTagsRequest, ShowDedicatedHostTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDedicatedHostTagsRequest.class, ShowDedicatedHostTagsResponse.class)
            .withName("ShowDedicatedHostTags")
            .withUri("/v1.0/{project_id}/dedicated-host-tags/{dedicated_host_id}/tags")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dedicated_host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDedicatedHostTagsRequest::getDedicatedHostId, (req, v) -> {
                req.setDedicatedHostId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaSetsRequest, ShowQuotaSetsResponse> showQuotaSets =
        genForshowQuotaSets();

    private static HttpRequestDef<ShowQuotaSetsRequest, ShowQuotaSetsResponse> genForshowQuotaSets() {
        // basic
        HttpRequestDef.Builder<ShowQuotaSetsRequest, ShowQuotaSetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotaSetsRequest.class, ShowQuotaSetsResponse.class)
                .withName("ShowQuotaSets")
                .withUri("/v1.0/{project_id}/quota-sets/{tenant_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQuotaSetsRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));
        builder.<String>withRequestField("resource",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQuotaSetsRequest::getResource, (req, v) -> {
                req.setResource(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDedicatedHostRequest, UpdateDedicatedHostResponse> updateDedicatedHost =
        genForupdateDedicatedHost();

    private static HttpRequestDef<UpdateDedicatedHostRequest, UpdateDedicatedHostResponse> genForupdateDedicatedHost() {
        // basic
        HttpRequestDef.Builder<UpdateDedicatedHostRequest, UpdateDedicatedHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDedicatedHostRequest.class, UpdateDedicatedHostResponse.class)
                .withName("UpdateDedicatedHost")
                .withUri("/v1.0/{project_id}/dedicated-hosts/{dedicated_host_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("dedicated_host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDedicatedHostRequest::getDedicatedHostId, (req, v) -> {
                req.setDedicatedHostId(v);
            }));
        builder.<ReqUpdateDeh>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReqUpdateDeh.class),
            f -> f.withMarshaller(UpdateDedicatedHostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
