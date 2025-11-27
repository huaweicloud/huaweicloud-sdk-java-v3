package com.huaweicloud.sdk.esw.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.esw.v3.model.BindVportRequest;
import com.huaweicloud.sdk.esw.v3.model.BindVportRequestBody;
import com.huaweicloud.sdk.esw.v3.model.BindVportResponse;
import com.huaweicloud.sdk.esw.v3.model.CreateConnectionRequest;
import com.huaweicloud.sdk.esw.v3.model.CreateConnectionRequestBody;
import com.huaweicloud.sdk.esw.v3.model.CreateConnectionResponse;
import com.huaweicloud.sdk.esw.v3.model.CreateInstanceRequest;
import com.huaweicloud.sdk.esw.v3.model.CreateInstanceResponse;
import com.huaweicloud.sdk.esw.v3.model.CreatePostPaidInstanceRequestBody;
import com.huaweicloud.sdk.esw.v3.model.DeleteConnectionRequest;
import com.huaweicloud.sdk.esw.v3.model.DeleteConnectionResponse;
import com.huaweicloud.sdk.esw.v3.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.esw.v3.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.esw.v3.model.ListAvailabilityZonesRequest;
import com.huaweicloud.sdk.esw.v3.model.ListAvailabilityZonesResponse;
import com.huaweicloud.sdk.esw.v3.model.ListConnectionsAllInstancesRequest;
import com.huaweicloud.sdk.esw.v3.model.ListConnectionsAllInstancesResponse;
import com.huaweicloud.sdk.esw.v3.model.ListConnectionsRequest;
import com.huaweicloud.sdk.esw.v3.model.ListConnectionsResponse;
import com.huaweicloud.sdk.esw.v3.model.ListFlavorsRequest;
import com.huaweicloud.sdk.esw.v3.model.ListFlavorsResponse;
import com.huaweicloud.sdk.esw.v3.model.ListInstancesRequest;
import com.huaweicloud.sdk.esw.v3.model.ListInstancesResponse;
import com.huaweicloud.sdk.esw.v3.model.ListQuotasRequest;
import com.huaweicloud.sdk.esw.v3.model.ListQuotasResponse;
import com.huaweicloud.sdk.esw.v3.model.ListResourceJobsRequest;
import com.huaweicloud.sdk.esw.v3.model.ListResourceJobsResponse;
import com.huaweicloud.sdk.esw.v3.model.ShowConnectionRequest;
import com.huaweicloud.sdk.esw.v3.model.ShowConnectionResponse;
import com.huaweicloud.sdk.esw.v3.model.ShowInstanceRequest;
import com.huaweicloud.sdk.esw.v3.model.ShowInstanceResponse;
import com.huaweicloud.sdk.esw.v3.model.UnbindVportRequest;
import com.huaweicloud.sdk.esw.v3.model.UnbindVportRequestBody;
import com.huaweicloud.sdk.esw.v3.model.UnbindVportResponse;
import com.huaweicloud.sdk.esw.v3.model.UpdateConnectionRequest;
import com.huaweicloud.sdk.esw.v3.model.UpdateConnectionRequestBody;
import com.huaweicloud.sdk.esw.v3.model.UpdateConnectionResponse;
import com.huaweicloud.sdk.esw.v3.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.esw.v3.model.UpdateInstanceRequestBody;
import com.huaweicloud.sdk.esw.v3.model.UpdateInstanceResponse;

@SuppressWarnings("unchecked")
public class EswMeta {

    public static final HttpRequestDef<BindVportRequest, BindVportResponse> bindVport = genForBindVport();

    private static HttpRequestDef<BindVportRequest, BindVportResponse> genForBindVport() {
        // basic
        HttpRequestDef.Builder<BindVportRequest, BindVportResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BindVportRequest.class, BindVportResponse.class)
                .withName("BindVport")
                .withUri("/v3/{project_id}/l2cg/connections/{connection_id}/vports/bind")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BindVportRequest::getConnectionId, BindVportRequest::setConnectionId));
        builder.<BindVportRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BindVportRequestBody.class),
            f -> f.withMarshaller(BindVportRequest::getBody, BindVportRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConnectionRequest, CreateConnectionResponse> createConnection =
        genForCreateConnection();

    private static HttpRequestDef<CreateConnectionRequest, CreateConnectionResponse> genForCreateConnection() {
        // basic
        HttpRequestDef.Builder<CreateConnectionRequest, CreateConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateConnectionRequest.class, CreateConnectionResponse.class)
                .withName("CreateConnection")
                .withUri("/v3/{project_id}/l2cg/instances/{instance_id}/connections")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConnectionRequest::getInstanceId, CreateConnectionRequest::setInstanceId));
        builder.<CreateConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateConnectionRequestBody.class),
            f -> f.withMarshaller(CreateConnectionRequest::getBody, CreateConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForCreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForCreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v3/{project_id}/l2cg/instances")
                .withContentType("application/json");

        // requests
        builder.<CreatePostPaidInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePostPaidInstanceRequestBody.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, CreateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConnectionRequest, DeleteConnectionResponse> deleteConnection =
        genForDeleteConnection();

    private static HttpRequestDef<DeleteConnectionRequest, DeleteConnectionResponse> genForDeleteConnection() {
        // basic
        HttpRequestDef.Builder<DeleteConnectionRequest, DeleteConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteConnectionRequest.class, DeleteConnectionResponse.class)
                .withName("DeleteConnection")
                .withUri("/v3/{project_id}/l2cg/instances/{instance_id}/connections/{connection_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConnectionRequest::getConnectionId, DeleteConnectionRequest::setConnectionId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConnectionRequest::getInstanceId, DeleteConnectionRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genForDeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genForDeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v3/{project_id}/l2cg/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, DeleteInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZones =
        genForListAvailabilityZones();

    private static HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> genForListAvailabilityZones() {
        // basic
        HttpRequestDef.Builder<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAvailabilityZonesRequest.class, ListAvailabilityZonesResponse.class)
            .withName("ListAvailabilityZones")
            .withUri("/v3/{project_id}/l2cg/availability-zones")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConnectionsRequest, ListConnectionsResponse> listConnections =
        genForListConnections();

    private static HttpRequestDef<ListConnectionsRequest, ListConnectionsResponse> genForListConnections() {
        // basic
        HttpRequestDef.Builder<ListConnectionsRequest, ListConnectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConnectionsRequest.class, ListConnectionsResponse.class)
                .withName("ListConnections")
                .withUri("/v3/{project_id}/l2cg/instances/{instance_id}/connections")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getInstanceId, ListConnectionsRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getId, ListConnectionsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getName, ListConnectionsRequest::setName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectionsRequest::getLimit, ListConnectionsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getMarker, ListConnectionsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConnectionsAllInstancesRequest, ListConnectionsAllInstancesResponse> listConnectionsAllInstances =
        genForListConnectionsAllInstances();

    private static HttpRequestDef<ListConnectionsAllInstancesRequest, ListConnectionsAllInstancesResponse> genForListConnectionsAllInstances() {
        // basic
        HttpRequestDef.Builder<ListConnectionsAllInstancesRequest, ListConnectionsAllInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListConnectionsAllInstancesRequest.class,
                    ListConnectionsAllInstancesResponse.class)
                .withName("ListConnectionsAllInstances")
                .withUri("/v3/{project_id}/l2cg/connections")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsAllInstancesRequest::getId,
                ListConnectionsAllInstancesRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsAllInstancesRequest::getName,
                ListConnectionsAllInstancesRequest::setName));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsAllInstancesRequest::getInstanceId,
                ListConnectionsAllInstancesRequest::setInstanceId));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsAllInstancesRequest::getVpcId,
                ListConnectionsAllInstancesRequest::setVpcId));
        builder.<String>withRequestField("virsubnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsAllInstancesRequest::getVirsubnetId,
                ListConnectionsAllInstancesRequest::setVirsubnetId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectionsAllInstancesRequest::getLimit,
                ListConnectionsAllInstancesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsAllInstancesRequest::getMarker,
                ListConnectionsAllInstancesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForListFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForListFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withName("ListFlavors")
                .withUri("/v3/{project_id}/l2cg/flavors")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForListInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForListInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v3/{project_id}/l2cg/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getId, ListInstancesRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getName, ListInstancesRequest::setName));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getDescription, ListInstancesRequest::setDescription));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, ListInstancesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getMarker, ListInstancesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForListQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForListQuotas() {
        // basic
        HttpRequestDef.Builder<ListQuotasRequest, ListQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotasRequest.class, ListQuotasResponse.class)
                .withName("ListQuotas")
                .withUri("/v3/{project_id}/l2cg/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceJobsRequest, ListResourceJobsResponse> listResourceJobs =
        genForListResourceJobs();

    private static HttpRequestDef<ListResourceJobsRequest, ListResourceJobsResponse> genForListResourceJobs() {
        // basic
        HttpRequestDef.Builder<ListResourceJobsRequest, ListResourceJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceJobsRequest.class, ListResourceJobsResponse.class)
                .withName("ListResourceJobs")
                .withUri("/v3/{project_id}/l2cg/resources/{resource_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceJobsRequest::getResourceId, ListResourceJobsRequest::setResourceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceJobsRequest::getLimit, ListResourceJobsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceJobsRequest::getMarker, ListResourceJobsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConnectionRequest, ShowConnectionResponse> showConnection =
        genForShowConnection();

    private static HttpRequestDef<ShowConnectionRequest, ShowConnectionResponse> genForShowConnection() {
        // basic
        HttpRequestDef.Builder<ShowConnectionRequest, ShowConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConnectionRequest.class, ShowConnectionResponse.class)
                .withName("ShowConnection")
                .withUri("/v3/{project_id}/l2cg/instances/{instance_id}/connections/{connection_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectionRequest::getConnectionId, ShowConnectionRequest::setConnectionId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectionRequest::getInstanceId, ShowConnectionRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForShowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForShowInstance() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRequest, ShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRequest.class, ShowInstanceResponse.class)
                .withName("ShowInstance")
                .withUri("/v3/{project_id}/l2cg/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getInstanceId, ShowInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnbindVportRequest, UnbindVportResponse> unbindVport = genForUnbindVport();

    private static HttpRequestDef<UnbindVportRequest, UnbindVportResponse> genForUnbindVport() {
        // basic
        HttpRequestDef.Builder<UnbindVportRequest, UnbindVportResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnbindVportRequest.class, UnbindVportResponse.class)
                .withName("UnbindVport")
                .withUri("/v3/{project_id}/l2cg/connections/{connection_id}/vports/unbind")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnbindVportRequest::getConnectionId, UnbindVportRequest::setConnectionId));
        builder.<UnbindVportRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnbindVportRequestBody.class),
            f -> f.withMarshaller(UnbindVportRequest::getBody, UnbindVportRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConnectionRequest, UpdateConnectionResponse> updateConnection =
        genForUpdateConnection();

    private static HttpRequestDef<UpdateConnectionRequest, UpdateConnectionResponse> genForUpdateConnection() {
        // basic
        HttpRequestDef.Builder<UpdateConnectionRequest, UpdateConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateConnectionRequest.class, UpdateConnectionResponse.class)
                .withName("UpdateConnection")
                .withUri("/v3/{project_id}/l2cg/instances/{instance_id}/connections/{connection_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConnectionRequest::getConnectionId, UpdateConnectionRequest::setConnectionId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConnectionRequest::getInstanceId, UpdateConnectionRequest::setInstanceId));
        builder.<UpdateConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateConnectionRequestBody.class),
            f -> f.withMarshaller(UpdateConnectionRequest::getBody, UpdateConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> updateInstance =
        genForUpdateInstance();

    private static HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> genForUpdateInstance() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceRequest, UpdateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceRequest.class, UpdateInstanceResponse.class)
                .withName("UpdateInstance")
                .withUri("/v3/{project_id}/l2cg/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getInstanceId, UpdateInstanceRequest::setInstanceId));
        builder.<UpdateInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getBody, UpdateInstanceRequest::setBody));

        // response

        return builder.build();
    }

}
