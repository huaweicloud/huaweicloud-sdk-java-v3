package com.huaweicloud.sdk.ga.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ga.v1.model.*;

@SuppressWarnings("unchecked")
public class GaMeta {

    public static final HttpRequestDef<CreateAcceleratorRequest, CreateAcceleratorResponse> createAccelerator =
        genForcreateAccelerator();

    private static HttpRequestDef<CreateAcceleratorRequest, CreateAcceleratorResponse> genForcreateAccelerator() {
        // basic
        HttpRequestDef.Builder<CreateAcceleratorRequest, CreateAcceleratorResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAcceleratorRequest.class, CreateAcceleratorResponse.class)
                .withName("CreateAccelerator")
                .withUri("/v1/accelerators")
                .withContentType("application/json");

        // requests
        builder.<CreateAcceleratorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAcceleratorRequestBody.class),
            f -> f.withMarshaller(CreateAcceleratorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAcceleratorRequest, DeleteAcceleratorResponse> deleteAccelerator =
        genFordeleteAccelerator();

    private static HttpRequestDef<DeleteAcceleratorRequest, DeleteAcceleratorResponse> genFordeleteAccelerator() {
        // basic
        HttpRequestDef.Builder<DeleteAcceleratorRequest, DeleteAcceleratorResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAcceleratorRequest.class, DeleteAcceleratorResponse.class)
                .withName("DeleteAccelerator")
                .withUri("/v1/accelerators/{accelerator_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("accelerator_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAcceleratorRequest::getAcceleratorId, (req, v) -> {
                req.setAcceleratorId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAcceleratorsRequest, ListAcceleratorsResponse> listAccelerators =
        genForlistAccelerators();

    private static HttpRequestDef<ListAcceleratorsRequest, ListAcceleratorsResponse> genForlistAccelerators() {
        // basic
        HttpRequestDef.Builder<ListAcceleratorsRequest, ListAcceleratorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAcceleratorsRequest.class, ListAcceleratorsResponse.class)
                .withName("ListAccelerators")
                .withUri("/v1/accelerators")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAcceleratorsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAcceleratorsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAcceleratorsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAcceleratorsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAcceleratorsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<ListAcceleratorsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAcceleratorsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAcceleratorsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAcceleratorsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAcceleratorRequest, ShowAcceleratorResponse> showAccelerator =
        genForshowAccelerator();

    private static HttpRequestDef<ShowAcceleratorRequest, ShowAcceleratorResponse> genForshowAccelerator() {
        // basic
        HttpRequestDef.Builder<ShowAcceleratorRequest, ShowAcceleratorResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAcceleratorRequest.class, ShowAcceleratorResponse.class)
                .withName("ShowAccelerator")
                .withUri("/v1/accelerators/{accelerator_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("accelerator_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAcceleratorRequest::getAcceleratorId, (req, v) -> {
                req.setAcceleratorId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAcceleratorRequest, UpdateAcceleratorResponse> updateAccelerator =
        genForupdateAccelerator();

    private static HttpRequestDef<UpdateAcceleratorRequest, UpdateAcceleratorResponse> genForupdateAccelerator() {
        // basic
        HttpRequestDef.Builder<UpdateAcceleratorRequest, UpdateAcceleratorResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAcceleratorRequest.class, UpdateAcceleratorResponse.class)
                .withName("UpdateAccelerator")
                .withUri("/v1/accelerators/{accelerator_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("accelerator_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAcceleratorRequest::getAcceleratorId, (req, v) -> {
                req.setAcceleratorId(v);
            }));
        builder.<UpdateAcceleratorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAcceleratorRequestBody.class),
            f -> f.withMarshaller(UpdateAcceleratorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEndpointRequest, CreateEndpointResponse> createEndpoint =
        genForcreateEndpoint();

    private static HttpRequestDef<CreateEndpointRequest, CreateEndpointResponse> genForcreateEndpoint() {
        // basic
        HttpRequestDef.Builder<CreateEndpointRequest, CreateEndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEndpointRequest.class, CreateEndpointResponse.class)
                .withName("CreateEndpoint")
                .withUri("/v1/endpoint-groups/{endpoint_group_id}/endpoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEndpointRequest::getEndpointGroupId, (req, v) -> {
                req.setEndpointGroupId(v);
            }));
        builder.<CreateEndpointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEndpointRequestBody.class),
            f -> f.withMarshaller(CreateEndpointRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpoint =
        genFordeleteEndpoint();

    private static HttpRequestDef<DeleteEndpointRequest, DeleteEndpointResponse> genFordeleteEndpoint() {
        // basic
        HttpRequestDef.Builder<DeleteEndpointRequest, DeleteEndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEndpointRequest.class, DeleteEndpointResponse.class)
                .withName("DeleteEndpoint")
                .withUri("/v1/endpoint-groups/{endpoint_group_id}/endpoints/{endpoint_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEndpointRequest::getEndpointGroupId, (req, v) -> {
                req.setEndpointGroupId(v);
            }));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEndpointRequest::getEndpointId, (req, v) -> {
                req.setEndpointId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEndpointsRequest, ListEndpointsResponse> listEndpoints =
        genForlistEndpoints();

    private static HttpRequestDef<ListEndpointsRequest, ListEndpointsResponse> genForlistEndpoints() {
        // basic
        HttpRequestDef.Builder<ListEndpointsRequest, ListEndpointsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEndpointsRequest.class, ListEndpointsResponse.class)
                .withName("ListEndpoints")
                .withUri("/v1/endpoint-groups/{endpoint_group_id}/endpoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getEndpointGroupId, (req, v) -> {
                req.setEndpointGroupId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListEndpointsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<ListEndpointsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEndpointsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListEndpointsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEndpointRequest, ShowEndpointResponse> showEndpoint = genForshowEndpoint();

    private static HttpRequestDef<ShowEndpointRequest, ShowEndpointResponse> genForshowEndpoint() {
        // basic
        HttpRequestDef.Builder<ShowEndpointRequest, ShowEndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEndpointRequest.class, ShowEndpointResponse.class)
                .withName("ShowEndpoint")
                .withUri("/v1/endpoint-groups/{endpoint_group_id}/endpoints/{endpoint_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEndpointRequest::getEndpointGroupId, (req, v) -> {
                req.setEndpointGroupId(v);
            }));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEndpointRequest::getEndpointId, (req, v) -> {
                req.setEndpointId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEndpointRequest, UpdateEndpointResponse> updateEndpoint =
        genForupdateEndpoint();

    private static HttpRequestDef<UpdateEndpointRequest, UpdateEndpointResponse> genForupdateEndpoint() {
        // basic
        HttpRequestDef.Builder<UpdateEndpointRequest, UpdateEndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEndpointRequest.class, UpdateEndpointResponse.class)
                .withName("UpdateEndpoint")
                .withUri("/v1/endpoint-groups/{endpoint_group_id}/endpoints/{endpoint_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEndpointRequest::getEndpointGroupId, (req, v) -> {
                req.setEndpointGroupId(v);
            }));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEndpointRequest::getEndpointId, (req, v) -> {
                req.setEndpointId(v);
            }));
        builder.<UpdateEndpointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEndpointRequestBody.class),
            f -> f.withMarshaller(UpdateEndpointRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEndpointGroupRequest, CreateEndpointGroupResponse> createEndpointGroup =
        genForcreateEndpointGroup();

    private static HttpRequestDef<CreateEndpointGroupRequest, CreateEndpointGroupResponse> genForcreateEndpointGroup() {
        // basic
        HttpRequestDef.Builder<CreateEndpointGroupRequest, CreateEndpointGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEndpointGroupRequest.class, CreateEndpointGroupResponse.class)
                .withName("CreateEndpointGroup")
                .withUri("/v1/endpoint-groups")
                .withContentType("application/json");

        // requests
        builder.<CreateEndpointGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEndpointGroupRequestBody.class),
            f -> f.withMarshaller(CreateEndpointGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEndpointGroupRequest, DeleteEndpointGroupResponse> deleteEndpointGroup =
        genFordeleteEndpointGroup();

    private static HttpRequestDef<DeleteEndpointGroupRequest, DeleteEndpointGroupResponse> genFordeleteEndpointGroup() {
        // basic
        HttpRequestDef.Builder<DeleteEndpointGroupRequest, DeleteEndpointGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEndpointGroupRequest.class, DeleteEndpointGroupResponse.class)
            .withName("DeleteEndpointGroup")
            .withUri("/v1/endpoint-groups/{endpoint_group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEndpointGroupRequest::getEndpointGroupId, (req, v) -> {
                req.setEndpointGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEndpointGroupsRequest, ListEndpointGroupsResponse> listEndpointGroups =
        genForlistEndpointGroups();

    private static HttpRequestDef<ListEndpointGroupsRequest, ListEndpointGroupsResponse> genForlistEndpointGroups() {
        // basic
        HttpRequestDef.Builder<ListEndpointGroupsRequest, ListEndpointGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEndpointGroupsRequest.class, ListEndpointGroupsResponse.class)
                .withName("ListEndpointGroups")
                .withUri("/v1/endpoint-groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointGroupsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListEndpointGroupsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointGroupsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointGroupsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<ListEndpointGroupsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEndpointGroupsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListEndpointGroupsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointGroupsRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEndpointGroupRequest, ShowEndpointGroupResponse> showEndpointGroup =
        genForshowEndpointGroup();

    private static HttpRequestDef<ShowEndpointGroupRequest, ShowEndpointGroupResponse> genForshowEndpointGroup() {
        // basic
        HttpRequestDef.Builder<ShowEndpointGroupRequest, ShowEndpointGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEndpointGroupRequest.class, ShowEndpointGroupResponse.class)
                .withName("ShowEndpointGroup")
                .withUri("/v1/endpoint-groups/{endpoint_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEndpointGroupRequest::getEndpointGroupId, (req, v) -> {
                req.setEndpointGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEndpointGroupRequest, UpdateEndpointGroupResponse> updateEndpointGroup =
        genForupdateEndpointGroup();

    private static HttpRequestDef<UpdateEndpointGroupRequest, UpdateEndpointGroupResponse> genForupdateEndpointGroup() {
        // basic
        HttpRequestDef.Builder<UpdateEndpointGroupRequest, UpdateEndpointGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEndpointGroupRequest.class, UpdateEndpointGroupResponse.class)
                .withName("UpdateEndpointGroup")
                .withUri("/v1/endpoint-groups/{endpoint_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEndpointGroupRequest::getEndpointGroupId, (req, v) -> {
                req.setEndpointGroupId(v);
            }));
        builder.<UpdateEndpointGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEndpointGroupRequestBody.class),
            f -> f.withMarshaller(UpdateEndpointGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHealthCheckRequest, CreateHealthCheckResponse> createHealthCheck =
        genForcreateHealthCheck();

    private static HttpRequestDef<CreateHealthCheckRequest, CreateHealthCheckResponse> genForcreateHealthCheck() {
        // basic
        HttpRequestDef.Builder<CreateHealthCheckRequest, CreateHealthCheckResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHealthCheckRequest.class, CreateHealthCheckResponse.class)
                .withName("CreateHealthCheck")
                .withUri("/v1/health-checks")
                .withContentType("application/json");

        // requests
        builder.<CreateHealthCheckRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHealthCheckRequestBody.class),
            f -> f.withMarshaller(CreateHealthCheckRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHealthCheckRequest, DeleteHealthCheckResponse> deleteHealthCheck =
        genFordeleteHealthCheck();

    private static HttpRequestDef<DeleteHealthCheckRequest, DeleteHealthCheckResponse> genFordeleteHealthCheck() {
        // basic
        HttpRequestDef.Builder<DeleteHealthCheckRequest, DeleteHealthCheckResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHealthCheckRequest.class, DeleteHealthCheckResponse.class)
                .withName("DeleteHealthCheck")
                .withUri("/v1/health-checks/{health_check_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("health_check_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHealthCheckRequest::getHealthCheckId, (req, v) -> {
                req.setHealthCheckId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHealthChecksRequest, ListHealthChecksResponse> listHealthChecks =
        genForlistHealthChecks();

    private static HttpRequestDef<ListHealthChecksRequest, ListHealthChecksResponse> genForlistHealthChecks() {
        // basic
        HttpRequestDef.Builder<ListHealthChecksRequest, ListHealthChecksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHealthChecksRequest.class, ListHealthChecksResponse.class)
                .withName("ListHealthChecks")
                .withUri("/v1/health-checks")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHealthChecksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthChecksRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHealthChecksRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthChecksRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<ListHealthChecksRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHealthChecksRequest.StatusEnum.class),
            f -> f.withMarshaller(ListHealthChecksRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("endpoint_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthChecksRequest::getEndpointGroupId, (req, v) -> {
                req.setEndpointGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHealthCheckRequest, ShowHealthCheckResponse> showHealthCheck =
        genForshowHealthCheck();

    private static HttpRequestDef<ShowHealthCheckRequest, ShowHealthCheckResponse> genForshowHealthCheck() {
        // basic
        HttpRequestDef.Builder<ShowHealthCheckRequest, ShowHealthCheckResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHealthCheckRequest.class, ShowHealthCheckResponse.class)
                .withName("ShowHealthCheck")
                .withUri("/v1/health-checks/{health_check_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("health_check_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHealthCheckRequest::getHealthCheckId, (req, v) -> {
                req.setHealthCheckId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHealthCheckRequest, UpdateHealthCheckResponse> updateHealthCheck =
        genForupdateHealthCheck();

    private static HttpRequestDef<UpdateHealthCheckRequest, UpdateHealthCheckResponse> genForupdateHealthCheck() {
        // basic
        HttpRequestDef.Builder<UpdateHealthCheckRequest, UpdateHealthCheckResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHealthCheckRequest.class, UpdateHealthCheckResponse.class)
                .withName("UpdateHealthCheck")
                .withUri("/v1/health-checks/{health_check_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("health_check_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHealthCheckRequest::getHealthCheckId, (req, v) -> {
                req.setHealthCheckId(v);
            }));
        builder.<UpdateHealthCheckRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHealthCheckRequestBody.class),
            f -> f.withMarshaller(UpdateHealthCheckRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddIpGroupIpRequest, AddIpGroupIpResponse> addIpGroupIp = genForaddIpGroupIp();

    private static HttpRequestDef<AddIpGroupIpRequest, AddIpGroupIpResponse> genForaddIpGroupIp() {
        // basic
        HttpRequestDef.Builder<AddIpGroupIpRequest, AddIpGroupIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddIpGroupIpRequest.class, AddIpGroupIpResponse.class)
                .withName("AddIpGroupIp")
                .withUri("/v1/ip-groups/{ip_group_id}/add-ips")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ip_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddIpGroupIpRequest::getIpGroupId, (req, v) -> {
                req.setIpGroupId(v);
            }));
        builder.<AddIpGroupIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddIpGroupIpRequestBody.class),
            f -> f.withMarshaller(AddIpGroupIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateListenerRequest, AssociateListenerResponse> associateListener =
        genForassociateListener();

    private static HttpRequestDef<AssociateListenerRequest, AssociateListenerResponse> genForassociateListener() {
        // basic
        HttpRequestDef.Builder<AssociateListenerRequest, AssociateListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateListenerRequest.class, AssociateListenerResponse.class)
                .withName("AssociateListener")
                .withUri("/v1/ip-groups/{ip_group_id}/associate-listener")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ip_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateListenerRequest::getIpGroupId, (req, v) -> {
                req.setIpGroupId(v);
            }));
        builder.<AssociateListenerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateListenerRequestBody.class),
            f -> f.withMarshaller(AssociateListenerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIpGroupRequest, CreateIpGroupResponse> createIpGroup =
        genForcreateIpGroup();

    private static HttpRequestDef<CreateIpGroupRequest, CreateIpGroupResponse> genForcreateIpGroup() {
        // basic
        HttpRequestDef.Builder<CreateIpGroupRequest, CreateIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateIpGroupRequest.class, CreateIpGroupResponse.class)
                .withName("CreateIpGroup")
                .withUri("/v1/ip-groups")
                .withContentType("application/json");

        // requests
        builder.<CreateIpGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIpGroupRequestBody.class),
            f -> f.withMarshaller(CreateIpGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIpGroupRequest, DeleteIpGroupResponse> deleteIpGroup =
        genFordeleteIpGroup();

    private static HttpRequestDef<DeleteIpGroupRequest, DeleteIpGroupResponse> genFordeleteIpGroup() {
        // basic
        HttpRequestDef.Builder<DeleteIpGroupRequest, DeleteIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIpGroupRequest.class, DeleteIpGroupResponse.class)
                .withName("DeleteIpGroup")
                .withUri("/v1/ip-groups/{ip_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ip_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIpGroupRequest::getIpGroupId, (req, v) -> {
                req.setIpGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateListenerRequest, DisassociateListenerResponse> disassociateListener =
        genFordisassociateListener();

    private static HttpRequestDef<DisassociateListenerRequest, DisassociateListenerResponse> genFordisassociateListener() {
        // basic
        HttpRequestDef.Builder<DisassociateListenerRequest, DisassociateListenerResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DisassociateListenerRequest.class, DisassociateListenerResponse.class)
            .withName("DisassociateListener")
            .withUri("/v1/ip-groups/{ip_group_id}/disassociate-listener")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ip_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateListenerRequest::getIpGroupId, (req, v) -> {
                req.setIpGroupId(v);
            }));
        builder.<DisassociateListenerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociateListenerRequestBody.class),
            f -> f.withMarshaller(DisassociateListenerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIpGroupsRequest, ListIpGroupsResponse> listIpGroups = genForlistIpGroups();

    private static HttpRequestDef<ListIpGroupsRequest, ListIpGroupsResponse> genForlistIpGroups() {
        // basic
        HttpRequestDef.Builder<ListIpGroupsRequest, ListIpGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIpGroupsRequest.class, ListIpGroupsResponse.class)
                .withName("ListIpGroups")
                .withUri("/v1/ip-groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIpGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpGroupsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpGroupsRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveIpGroupIpRequest, RemoveIpGroupIpResponse> removeIpGroupIp =
        genForremoveIpGroupIp();

    private static HttpRequestDef<RemoveIpGroupIpRequest, RemoveIpGroupIpResponse> genForremoveIpGroupIp() {
        // basic
        HttpRequestDef.Builder<RemoveIpGroupIpRequest, RemoveIpGroupIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RemoveIpGroupIpRequest.class, RemoveIpGroupIpResponse.class)
                .withName("RemoveIpGroupIp")
                .withUri("/v1/ip-groups/{ip_group_id}/remove-ips")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ip_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveIpGroupIpRequest::getIpGroupId, (req, v) -> {
                req.setIpGroupId(v);
            }));
        builder.<RemoveIpGroupIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemoveIpGroupIpRequestBody.class),
            f -> f.withMarshaller(RemoveIpGroupIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIpGroupRequest, ShowIpGroupResponse> showIpGroup = genForshowIpGroup();

    private static HttpRequestDef<ShowIpGroupRequest, ShowIpGroupResponse> genForshowIpGroup() {
        // basic
        HttpRequestDef.Builder<ShowIpGroupRequest, ShowIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIpGroupRequest.class, ShowIpGroupResponse.class)
                .withName("ShowIpGroup")
                .withUri("/v1/ip-groups/{ip_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ip_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpGroupRequest::getIpGroupId, (req, v) -> {
                req.setIpGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIpGroupRequest, UpdateIpGroupResponse> updateIpGroup =
        genForupdateIpGroup();

    private static HttpRequestDef<UpdateIpGroupRequest, UpdateIpGroupResponse> genForupdateIpGroup() {
        // basic
        HttpRequestDef.Builder<UpdateIpGroupRequest, UpdateIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIpGroupRequest.class, UpdateIpGroupResponse.class)
                .withName("UpdateIpGroup")
                .withUri("/v1/ip-groups/{ip_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ip_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIpGroupRequest::getIpGroupId, (req, v) -> {
                req.setIpGroupId(v);
            }));
        builder.<UpdateIpGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIpGroupRequestBody.class),
            f -> f.withMarshaller(UpdateIpGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateListenerRequest, CreateListenerResponse> createListener =
        genForcreateListener();

    private static HttpRequestDef<CreateListenerRequest, CreateListenerResponse> genForcreateListener() {
        // basic
        HttpRequestDef.Builder<CreateListenerRequest, CreateListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateListenerRequest.class, CreateListenerResponse.class)
                .withName("CreateListener")
                .withUri("/v1/listeners")
                .withContentType("application/json");

        // requests
        builder.<CreateListenerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateListenerRequestBody.class),
            f -> f.withMarshaller(CreateListenerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteListenerRequest, DeleteListenerResponse> deleteListener =
        genFordeleteListener();

    private static HttpRequestDef<DeleteListenerRequest, DeleteListenerResponse> genFordeleteListener() {
        // basic
        HttpRequestDef.Builder<DeleteListenerRequest, DeleteListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteListenerRequest.class, DeleteListenerResponse.class)
                .withName("DeleteListener")
                .withUri("/v1/listeners/{listener_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteListenerRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListListenersRequest, ListListenersResponse> listListeners =
        genForlistListeners();

    private static HttpRequestDef<ListListenersRequest, ListListenersResponse> genForlistListeners() {
        // basic
        HttpRequestDef.Builder<ListListenersRequest, ListListenersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListListenersRequest.class, ListListenersResponse.class)
                .withName("ListListeners")
                .withUri("/v1/listeners")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListListenersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<ListListenersRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListListenersRequest.StatusEnum.class),
            f -> f.withMarshaller(ListListenersRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("accelerator_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getAcceleratorId, (req, v) -> {
                req.setAcceleratorId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowListenerRequest, ShowListenerResponse> showListener = genForshowListener();

    private static HttpRequestDef<ShowListenerRequest, ShowListenerResponse> genForshowListener() {
        // basic
        HttpRequestDef.Builder<ShowListenerRequest, ShowListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowListenerRequest.class, ShowListenerResponse.class)
                .withName("ShowListener")
                .withUri("/v1/listeners/{listener_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowListenerRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateListenerRequest, UpdateListenerResponse> updateListener =
        genForupdateListener();

    private static HttpRequestDef<UpdateListenerRequest, UpdateListenerResponse> genForupdateListener() {
        // basic
        HttpRequestDef.Builder<UpdateListenerRequest, UpdateListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateListenerRequest.class, UpdateListenerResponse.class)
                .withName("UpdateListener")
                .withUri("/v1/listeners/{listener_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateListenerRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            }));
        builder.<UpdateListenerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateListenerRequestBody.class),
            f -> f.withMarshaller(UpdateListenerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRegionsRequest, ListRegionsResponse> listRegions = genForlistRegions();

    private static HttpRequestDef<ListRegionsRequest, ListRegionsResponse> genForlistRegions() {
        // basic
        HttpRequestDef.Builder<ListRegionsRequest, ListRegionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRegionsRequest.class, ListRegionsResponse.class)
                .withName("ListRegions")
                .withUri("/v1/regions")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagsRequest, CreateTagsResponse> createTags = genForcreateTags();

    private static HttpRequestDef<CreateTagsRequest, CreateTagsResponse> genForcreateTags() {
        // basic
        HttpRequestDef.Builder<CreateTagsRequest, CreateTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagsRequest.class, CreateTagsResponse.class)
                .withName("CreateTags")
                .withUri("/v1/{resource_type}/{resource_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<ResourceType>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceType.class),
            f -> f.withMarshaller(CreateTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<CreateTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTagsRequestBody.class),
            f -> f.withMarshaller(CreateTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagsRequest, DeleteTagsResponse> deleteTags = genFordeleteTags();

    private static HttpRequestDef<DeleteTagsRequest, DeleteTagsResponse> genFordeleteTags() {
        // basic
        HttpRequestDef.Builder<DeleteTagsRequest, DeleteTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTagsRequest.class, DeleteTagsResponse.class)
                .withName("DeleteTags")
                .withUri("/v1/{resource_type}/{resource_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<ResourceType>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceType.class),
            f -> f.withMarshaller(DeleteTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<DeleteTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTagsRequestBody.class),
            f -> f.withMarshaller(DeleteTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceTagsRequest, ShowResourceTagsResponse> showResourceTags =
        genForshowResourceTags();

    private static HttpRequestDef<ShowResourceTagsRequest, ShowResourceTagsResponse> genForshowResourceTags() {
        // basic
        HttpRequestDef.Builder<ShowResourceTagsRequest, ShowResourceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceTagsRequest.class, ShowResourceTagsResponse.class)
                .withName("ShowResourceTags")
                .withUri("/v1/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<ResourceType>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceType.class),
            f -> f.withMarshaller(ShowResourceTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));

        // response

        return builder.build();
    }

}
