package com.huaweicloud.sdk.deh.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.deh.v1.model.BatchCreateDedicatedHostTagsRequest;
import com.huaweicloud.sdk.deh.v1.model.BatchCreateDedicatedHostTagsResponse;
import com.huaweicloud.sdk.deh.v1.model.BatchDeleteDedicatedHostTagsRequest;
import com.huaweicloud.sdk.deh.v1.model.BatchDeleteDedicatedHostTagsResponse;
import com.huaweicloud.sdk.deh.v1.model.CreateDedicatedHostRequest;
import com.huaweicloud.sdk.deh.v1.model.CreateDedicatedHostResponse;
import com.huaweicloud.sdk.deh.v1.model.ListDedicatedHostTagsRequest;
import com.huaweicloud.sdk.deh.v1.model.ListDedicatedHostTagsResponse;
import com.huaweicloud.sdk.deh.v1.model.ListDedicatedHostTypesRequest;
import com.huaweicloud.sdk.deh.v1.model.ListDedicatedHostTypesResponse;
import com.huaweicloud.sdk.deh.v1.model.ListDedicatedHostsByTagsRequest;
import com.huaweicloud.sdk.deh.v1.model.ListDedicatedHostsByTagsResponse;
import com.huaweicloud.sdk.deh.v1.model.ListDedicatedHostsRequest;
import com.huaweicloud.sdk.deh.v1.model.ListDedicatedHostsResponse;
import com.huaweicloud.sdk.deh.v1.model.ListServersDedicatedHostRequest;
import com.huaweicloud.sdk.deh.v1.model.ListServersDedicatedHostResponse;
import com.huaweicloud.sdk.deh.v1.model.ReqAllocateDeh;
import com.huaweicloud.sdk.deh.v1.model.ReqListDehByTags;
import com.huaweicloud.sdk.deh.v1.model.ReqSetOrDeleteTags;
import com.huaweicloud.sdk.deh.v1.model.ReqUpdateDeh;
import com.huaweicloud.sdk.deh.v1.model.ShowDedicatedHostRequest;
import com.huaweicloud.sdk.deh.v1.model.ShowDedicatedHostResponse;
import com.huaweicloud.sdk.deh.v1.model.ShowDedicatedHostTagsRequest;
import com.huaweicloud.sdk.deh.v1.model.ShowDedicatedHostTagsResponse;
import com.huaweicloud.sdk.deh.v1.model.ShowQuotaSetsRequest;
import com.huaweicloud.sdk.deh.v1.model.ShowQuotaSetsResponse;
import com.huaweicloud.sdk.deh.v1.model.UpdateDedicatedHostRequest;
import com.huaweicloud.sdk.deh.v1.model.UpdateDedicatedHostResponse;

@SuppressWarnings("unchecked")
public class DeHMeta {

    public static final HttpRequestDef<BatchCreateDedicatedHostTagsRequest, BatchCreateDedicatedHostTagsResponse> batchCreateDedicatedHostTags =
        genForBatchCreateDedicatedHostTags();

    private static HttpRequestDef<BatchCreateDedicatedHostTagsRequest, BatchCreateDedicatedHostTagsResponse> genForBatchCreateDedicatedHostTags() {
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
            f -> f.withMarshaller(BatchCreateDedicatedHostTagsRequest::getDedicatedHostId,
                BatchCreateDedicatedHostTagsRequest::setDedicatedHostId));
        builder.<ReqSetOrDeleteTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReqSetOrDeleteTags.class),
            f -> f.withMarshaller(BatchCreateDedicatedHostTagsRequest::getBody,
                BatchCreateDedicatedHostTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDedicatedHostTagsRequest, BatchDeleteDedicatedHostTagsResponse> batchDeleteDedicatedHostTags =
        genForBatchDeleteDedicatedHostTags();

    private static HttpRequestDef<BatchDeleteDedicatedHostTagsRequest, BatchDeleteDedicatedHostTagsResponse> genForBatchDeleteDedicatedHostTags() {
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
            f -> f.withMarshaller(BatchDeleteDedicatedHostTagsRequest::getDedicatedHostId,
                BatchDeleteDedicatedHostTagsRequest::setDedicatedHostId));
        builder.<ReqSetOrDeleteTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReqSetOrDeleteTags.class),
            f -> f.withMarshaller(BatchDeleteDedicatedHostTagsRequest::getBody,
                BatchDeleteDedicatedHostTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDedicatedHostRequest, CreateDedicatedHostResponse> createDedicatedHost =
        genForCreateDedicatedHost();

    private static HttpRequestDef<CreateDedicatedHostRequest, CreateDedicatedHostResponse> genForCreateDedicatedHost() {
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
            f -> f.withMarshaller(CreateDedicatedHostRequest::getBody, CreateDedicatedHostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDedicatedHostTagsRequest, ListDedicatedHostTagsResponse> listDedicatedHostTags =
        genForListDedicatedHostTags();

    private static HttpRequestDef<ListDedicatedHostTagsRequest, ListDedicatedHostTagsResponse> genForListDedicatedHostTags() {
        // basic
        HttpRequestDef.Builder<ListDedicatedHostTagsRequest, ListDedicatedHostTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDedicatedHostTagsRequest.class, ListDedicatedHostTagsResponse.class)
            .withName("ListDedicatedHostTags")
            .withUri("/v1.0/{project_id}/dedicated-host-tags/tags")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDedicatedHostTypesRequest, ListDedicatedHostTypesResponse> listDedicatedHostTypes =
        genForListDedicatedHostTypes();

    private static HttpRequestDef<ListDedicatedHostTypesRequest, ListDedicatedHostTypesResponse> genForListDedicatedHostTypes() {
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
            f -> f.withMarshaller(ListDedicatedHostTypesRequest::getAvailabilityZone,
                ListDedicatedHostTypesRequest::setAvailabilityZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDedicatedHostsRequest, ListDedicatedHostsResponse> listDedicatedHosts =
        genForListDedicatedHosts();

    private static HttpRequestDef<ListDedicatedHostsRequest, ListDedicatedHostsResponse> genForListDedicatedHosts() {
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
            f -> f.withMarshaller(ListDedicatedHostsRequest::getDedicatedHostId,
                ListDedicatedHostsRequest::setDedicatedHostId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getName, ListDedicatedHostsRequest::setName));
        builder.<String>withRequestField("host_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getHostType, ListDedicatedHostsRequest::setHostType));
        builder.<String>withRequestField("host_type_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getHostTypeName,
                ListDedicatedHostsRequest::setHostTypeName));
        builder.<String>withRequestField("flavor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getFlavor, ListDedicatedHostsRequest::setFlavor));
        builder.<ListDedicatedHostsRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDedicatedHostsRequest.StateEnum.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getState, ListDedicatedHostsRequest::setState));
        builder.<String>withRequestField("tenant",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getTenant, ListDedicatedHostsRequest::setTenant));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getAvailabilityZone,
                ListDedicatedHostsRequest::setAvailabilityZone));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getLimit, ListDedicatedHostsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getMarker, ListDedicatedHostsRequest::setMarker));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getTags, ListDedicatedHostsRequest::setTags));
        builder.<String>withRequestField("instance_uuid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getInstanceUuid,
                ListDedicatedHostsRequest::setInstanceUuid));
        builder.<String>withRequestField("released_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getReleasedAt, ListDedicatedHostsRequest::setReleasedAt));
        builder.<String>withRequestField("changes-since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedHostsRequest::getChangesSince,
                ListDedicatedHostsRequest::setChangesSince));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDedicatedHostsByTagsRequest, ListDedicatedHostsByTagsResponse> listDedicatedHostsByTags =
        genForListDedicatedHostsByTags();

    private static HttpRequestDef<ListDedicatedHostsByTagsRequest, ListDedicatedHostsByTagsResponse> genForListDedicatedHostsByTags() {
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
            f -> f.withMarshaller(ListDedicatedHostsByTagsRequest::getBody, ListDedicatedHostsByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServersDedicatedHostRequest, ListServersDedicatedHostResponse> listServersDedicatedHost =
        genForListServersDedicatedHost();

    private static HttpRequestDef<ListServersDedicatedHostRequest, ListServersDedicatedHostResponse> genForListServersDedicatedHost() {
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
            f -> f.withMarshaller(ListServersDedicatedHostRequest::getDedicatedHostId,
                ListServersDedicatedHostRequest::setDedicatedHostId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServersDedicatedHostRequest::getLimit,
                ListServersDedicatedHostRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersDedicatedHostRequest::getMarker,
                ListServersDedicatedHostRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDedicatedHostRequest, ShowDedicatedHostResponse> showDedicatedHost =
        genForShowDedicatedHost();

    private static HttpRequestDef<ShowDedicatedHostRequest, ShowDedicatedHostResponse> genForShowDedicatedHost() {
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
            f -> f.withMarshaller(ShowDedicatedHostRequest::getDedicatedHostId,
                ShowDedicatedHostRequest::setDedicatedHostId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDedicatedHostTagsRequest, ShowDedicatedHostTagsResponse> showDedicatedHostTags =
        genForShowDedicatedHostTags();

    private static HttpRequestDef<ShowDedicatedHostTagsRequest, ShowDedicatedHostTagsResponse> genForShowDedicatedHostTags() {
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
            f -> f.withMarshaller(ShowDedicatedHostTagsRequest::getDedicatedHostId,
                ShowDedicatedHostTagsRequest::setDedicatedHostId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaSetsRequest, ShowQuotaSetsResponse> showQuotaSets =
        genForShowQuotaSets();

    private static HttpRequestDef<ShowQuotaSetsRequest, ShowQuotaSetsResponse> genForShowQuotaSets() {
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
            f -> f.withMarshaller(ShowQuotaSetsRequest::getTenantId, ShowQuotaSetsRequest::setTenantId));
        builder.<String>withRequestField("resource",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQuotaSetsRequest::getResource, ShowQuotaSetsRequest::setResource));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDedicatedHostRequest, UpdateDedicatedHostResponse> updateDedicatedHost =
        genForUpdateDedicatedHost();

    private static HttpRequestDef<UpdateDedicatedHostRequest, UpdateDedicatedHostResponse> genForUpdateDedicatedHost() {
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
            f -> f.withMarshaller(UpdateDedicatedHostRequest::getDedicatedHostId,
                UpdateDedicatedHostRequest::setDedicatedHostId));
        builder.<ReqUpdateDeh>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReqUpdateDeh.class),
            f -> f.withMarshaller(UpdateDedicatedHostRequest::getBody, UpdateDedicatedHostRequest::setBody));

        // response

        return builder.build();
    }

}
