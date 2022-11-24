package com.huaweicloud.sdk.cc.v3;

import com.huaweicloud.sdk.cc.v3.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CcMeta {

    public static final HttpRequestDef<CreateCloudConnectionRequest, CreateCloudConnectionResponse> createCloudConnection =
        genForcreateCloudConnection();

    private static HttpRequestDef<CreateCloudConnectionRequest, CreateCloudConnectionResponse> genForcreateCloudConnection() {
        // basic
        HttpRequestDef.Builder<CreateCloudConnectionRequest, CreateCloudConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateCloudConnectionRequest.class, CreateCloudConnectionResponse.class)
            .withName("CreateCloudConnection")
            .withUri("/v3/{domain_id}/ccaas/cloud-connections")
            .withContentType("application/json");

        // requests
        builder.<CreateCloudConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCloudConnectionRequestBody.class),
            f -> f.withMarshaller(CreateCloudConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse> createNetworkInstance =
        genForcreateNetworkInstance();

    private static HttpRequestDef<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse> genForcreateNetworkInstance() {
        // basic
        HttpRequestDef.Builder<CreateNetworkInstanceRequest, CreateNetworkInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateNetworkInstanceRequest.class, CreateNetworkInstanceResponse.class)
            .withName("CreateNetworkInstance")
            .withUri("/v3/{domain_id}/ccaas/network-instances")
            .withContentType("application/json");

        // requests
        builder.<CreateNetworkInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNetworkInstanceRequestBody.class),
            f -> f.withMarshaller(CreateNetworkInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse> deleteCloudConnection =
        genFordeleteCloudConnection();

    private static HttpRequestDef<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse> genFordeleteCloudConnection() {
        // basic
        HttpRequestDef.Builder<DeleteCloudConnectionRequest, DeleteCloudConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteCloudConnectionRequest.class, DeleteCloudConnectionResponse.class)
            .withName("DeleteCloudConnection")
            .withUri("/v3/{domain_id}/ccaas/cloud-connections/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudConnectionRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse> deleteNetworkInstance =
        genFordeleteNetworkInstance();

    private static HttpRequestDef<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse> genFordeleteNetworkInstance() {
        // basic
        HttpRequestDef.Builder<DeleteNetworkInstanceRequest, DeleteNetworkInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteNetworkInstanceRequest.class, DeleteNetworkInstanceResponse.class)
            .withName("DeleteNetworkInstance")
            .withUri("/v3/{domain_id}/ccaas/network-instances/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNetworkInstanceRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse> listCloudConnectionRoutes =
        genForlistCloudConnectionRoutes();

    private static HttpRequestDef<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse> genForlistCloudConnectionRoutes() {
        // basic
        HttpRequestDef.Builder<ListCloudConnectionRoutesRequest, ListCloudConnectionRoutesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCloudConnectionRoutesRequest.class,
                    ListCloudConnectionRoutesResponse.class)
                .withName("ListCloudConnectionRoutes")
                .withUri("/v3/{domain_id}/ccaas/cloud-connection-routes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getCloudConnectionId, (req, v) -> {
                req.setCloudConnectionId(v);
            }));
        builder.<List<String>>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionRoutesRequest::getRegionId, (req, v) -> {
                req.setRegionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudConnectionsRequest, ListCloudConnectionsResponse> listCloudConnections =
        genForlistCloudConnections();

    private static HttpRequestDef<ListCloudConnectionsRequest, ListCloudConnectionsResponse> genForlistCloudConnections() {
        // basic
        HttpRequestDef.Builder<ListCloudConnectionsRequest, ListCloudConnectionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCloudConnectionsRequest.class, ListCloudConnectionsResponse.class)
            .withName("ListCloudConnections")
            .withUri("/v3/{domain_id}/ccaas/cloud-connections")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<List<ListCloudConnectionsRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudConnectionsRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNetworkInstancesRequest, ListNetworkInstancesResponse> listNetworkInstances =
        genForlistNetworkInstances();

    private static HttpRequestDef<ListNetworkInstancesRequest, ListNetworkInstancesResponse> genForlistNetworkInstances() {
        // basic
        HttpRequestDef.Builder<ListNetworkInstancesRequest, ListNetworkInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListNetworkInstancesRequest.class, ListNetworkInstancesResponse.class)
            .withName("ListNetworkInstances")
            .withUri("/v3/{domain_id}/ccaas/network-instances")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<List<ListNetworkInstancesRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<List<String>>withRequestField("cloud_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getCloudConnectionId, (req, v) -> {
                req.setCloudConnectionId(v);
            }));
        builder.<List<String>>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<List<String>>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNetworkInstancesRequest::getRegionId, (req, v) -> {
                req.setRegionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCloudConnectionRequest, ShowCloudConnectionResponse> showCloudConnection =
        genForshowCloudConnection();

    private static HttpRequestDef<ShowCloudConnectionRequest, ShowCloudConnectionResponse> genForshowCloudConnection() {
        // basic
        HttpRequestDef.Builder<ShowCloudConnectionRequest, ShowCloudConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCloudConnectionRequest.class, ShowCloudConnectionResponse.class)
                .withName("ShowCloudConnection")
                .withUri("/v3/{domain_id}/ccaas/cloud-connections/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCloudConnectionRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse> showCloudConnectionRoutes =
        genForshowCloudConnectionRoutes();

    private static HttpRequestDef<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse> genForshowCloudConnectionRoutes() {
        // basic
        HttpRequestDef.Builder<ShowCloudConnectionRoutesRequest, ShowCloudConnectionRoutesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowCloudConnectionRoutesRequest.class,
                    ShowCloudConnectionRoutesResponse.class)
                .withName("ShowCloudConnectionRoutes")
                .withUri("/v3/{domain_id}/ccaas/cloud-connection-routes/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCloudConnectionRoutesRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse> showNetworkInstance =
        genForshowNetworkInstance();

    private static HttpRequestDef<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse> genForshowNetworkInstance() {
        // basic
        HttpRequestDef.Builder<ShowNetworkInstanceRequest, ShowNetworkInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNetworkInstanceRequest.class, ShowNetworkInstanceResponse.class)
                .withName("ShowNetworkInstance")
                .withUri("/v3/{domain_id}/ccaas/network-instances/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNetworkInstanceRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse> updateCloudConnection =
        genForupdateCloudConnection();

    private static HttpRequestDef<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse> genForupdateCloudConnection() {
        // basic
        HttpRequestDef.Builder<UpdateCloudConnectionRequest, UpdateCloudConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateCloudConnectionRequest.class, UpdateCloudConnectionResponse.class)
            .withName("UpdateCloudConnection")
            .withUri("/v3/{domain_id}/ccaas/cloud-connections/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCloudConnectionRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<UpdateCloudConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCloudConnectionRequestBody.class),
            f -> f.withMarshaller(UpdateCloudConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse> updateNetworkInstance =
        genForupdateNetworkInstance();

    private static HttpRequestDef<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse> genForupdateNetworkInstance() {
        // basic
        HttpRequestDef.Builder<UpdateNetworkInstanceRequest, UpdateNetworkInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateNetworkInstanceRequest.class, UpdateNetworkInstanceResponse.class)
            .withName("UpdateNetworkInstance")
            .withUri("/v3/{domain_id}/ccaas/network-instances/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNetworkInstanceRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<UpdateNetworkInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNetworkInstanceRequestBody.class),
            f -> f.withMarshaller(UpdateNetworkInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
