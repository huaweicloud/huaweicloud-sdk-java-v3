package com.huaweicloud.sdk.vpcep.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.vpcep.v1.model.*;

@SuppressWarnings("unchecked")
public class VpcepMeta {

    public static final HttpRequestDef<AcceptOrRejectEndpointRequest, AcceptOrRejectEndpointResponse> acceptOrRejectEndpoint =
        genForacceptOrRejectEndpoint();

    private static HttpRequestDef<AcceptOrRejectEndpointRequest, AcceptOrRejectEndpointResponse> genForacceptOrRejectEndpoint() {
        // basic
        HttpRequestDef.Builder<AcceptOrRejectEndpointRequest, AcceptOrRejectEndpointResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AcceptOrRejectEndpointRequest.class, AcceptOrRejectEndpointResponse.class)
            .withName("AcceptOrRejectEndpoint")
            .withUri("/v1/{project_id}/vpc-endpoint-services/{vpc_endpoint_service_id}/connections/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vpc_endpoint_service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptOrRejectEndpointRequest::getVpcEndpointServiceId, (req, v) -> {
                req.setVpcEndpointServiceId(v);
            }));
        builder.<AcceptOrRejectEndpointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AcceptOrRejectEndpointRequestBody.class),
            f -> f.withMarshaller(AcceptOrRejectEndpointRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddOrRemoveServicePermissionsRequest, AddOrRemoveServicePermissionsResponse> addOrRemoveServicePermissions =
        genForaddOrRemoveServicePermissions();

    private static HttpRequestDef<AddOrRemoveServicePermissionsRequest, AddOrRemoveServicePermissionsResponse> genForaddOrRemoveServicePermissions() {
        // basic
        HttpRequestDef.Builder<AddOrRemoveServicePermissionsRequest, AddOrRemoveServicePermissionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AddOrRemoveServicePermissionsRequest.class,
                    AddOrRemoveServicePermissionsResponse.class)
                .withName("AddOrRemoveServicePermissions")
                .withUri("/v1/{project_id}/vpc-endpoint-services/{vpc_endpoint_service_id}/permissions/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vpc_endpoint_service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddOrRemoveServicePermissionsRequest::getVpcEndpointServiceId, (req, v) -> {
                req.setVpcEndpointServiceId(v);
            }));
        builder.<AddOrRemoveServicePermissionsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddOrRemoveServicePermissionsRequestBody.class),
            f -> f.withMarshaller(AddOrRemoveServicePermissionsRequest::getBody, (req, v) -> {
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
                .withUri("/v1/{project_id}/vpc-endpoints")
                .withContentType("application/json;charset=UTF-8");

        // requests
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

    public static final HttpRequestDef<CreateEndpointServiceRequest, CreateEndpointServiceResponse> createEndpointService =
        genForcreateEndpointService();

    private static HttpRequestDef<CreateEndpointServiceRequest, CreateEndpointServiceResponse> genForcreateEndpointService() {
        // basic
        HttpRequestDef.Builder<CreateEndpointServiceRequest, CreateEndpointServiceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateEndpointServiceRequest.class, CreateEndpointServiceResponse.class)
            .withName("CreateEndpointService")
            .withUri("/v1/{project_id}/vpc-endpoint-services")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateEndpointServiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEndpointServiceRequestBody.class),
            f -> f.withMarshaller(CreateEndpointServiceRequest::getBody, (req, v) -> {
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
                .withUri("/v1/{project_id}/vpc-endpoints/{vpc_endpoint_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEndpointRequest::getVpcEndpointId, (req, v) -> {
                req.setVpcEndpointId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEndpointServiceRequest, DeleteEndpointServiceResponse> deleteEndpointService =
        genFordeleteEndpointService();

    private static HttpRequestDef<DeleteEndpointServiceRequest, DeleteEndpointServiceResponse> genFordeleteEndpointService() {
        // basic
        HttpRequestDef.Builder<DeleteEndpointServiceRequest, DeleteEndpointServiceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEndpointServiceRequest.class, DeleteEndpointServiceResponse.class)
            .withName("DeleteEndpointService")
            .withUri("/v1/{project_id}/vpc-endpoint-services/{vpc_endpoint_service_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_endpoint_service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEndpointServiceRequest::getVpcEndpointServiceId, (req, v) -> {
                req.setVpcEndpointServiceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEndpointInfoDetailsRequest, ListEndpointInfoDetailsResponse> listEndpointInfoDetails =
        genForlistEndpointInfoDetails();

    private static HttpRequestDef<ListEndpointInfoDetailsRequest, ListEndpointInfoDetailsResponse> genForlistEndpointInfoDetails() {
        // basic
        HttpRequestDef.Builder<ListEndpointInfoDetailsRequest, ListEndpointInfoDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEndpointInfoDetailsRequest.class, ListEndpointInfoDetailsResponse.class)
            .withName("ListEndpointInfoDetails")
            .withUri("/v1/{project_id}/vpc-endpoints/{vpc_endpoint_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointInfoDetailsRequest::getVpcEndpointId, (req, v) -> {
                req.setVpcEndpointId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEndpointServiceRequest, ListEndpointServiceResponse> listEndpointService =
        genForlistEndpointService();

    private static HttpRequestDef<ListEndpointServiceRequest, ListEndpointServiceResponse> genForlistEndpointService() {
        // basic
        HttpRequestDef.Builder<ListEndpointServiceRequest, ListEndpointServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEndpointServiceRequest.class, ListEndpointServiceResponse.class)
                .withName("ListEndpointService")
                .withUri("/v1/{project_id}/vpc-endpoint-services")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_service_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointServiceRequest::getEndpointServiceName, (req, v) -> {
                req.setEndpointServiceName(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointServiceRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<ListEndpointServiceRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEndpointServiceRequest.StatusEnum.class),
            f -> f.withMarshaller(ListEndpointServiceRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<ListEndpointServiceRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEndpointServiceRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListEndpointServiceRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<ListEndpointServiceRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEndpointServiceRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListEndpointServiceRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointServiceRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointServiceRequest::getOffset, (req, v) -> {
                req.setOffset(v);
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
                .withUri("/v1/{project_id}/vpc-endpoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_service_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getEndpointServiceName, (req, v) -> {
                req.setEndpointServiceName(v);
            }));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotaDetailsRequest, ListQuotaDetailsResponse> listQuotaDetails =
        genForlistQuotaDetails();

    private static HttpRequestDef<ListQuotaDetailsRequest, ListQuotaDetailsResponse> genForlistQuotaDetails() {
        // basic
        HttpRequestDef.Builder<ListQuotaDetailsRequest, ListQuotaDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotaDetailsRequest.class, ListQuotaDetailsResponse.class)
                .withName("ListQuotaDetails")
                .withUri("/v1/{project_id}/quotas")
                .withContentType("application/json");

        // requests
        builder.<ListQuotaDetailsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListQuotaDetailsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListQuotaDetailsRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceConnectionsRequest, ListServiceConnectionsResponse> listServiceConnections =
        genForlistServiceConnections();

    private static HttpRequestDef<ListServiceConnectionsRequest, ListServiceConnectionsResponse> genForlistServiceConnections() {
        // basic
        HttpRequestDef.Builder<ListServiceConnectionsRequest, ListServiceConnectionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListServiceConnectionsRequest.class, ListServiceConnectionsResponse.class)
            .withName("ListServiceConnections")
            .withUri("/v1/{project_id}/vpc-endpoint-services/{vpc_endpoint_service_id}/connections")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_endpoint_service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceConnectionsRequest::getVpcEndpointServiceId, (req, v) -> {
                req.setVpcEndpointServiceId(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceConnectionsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("marker_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceConnectionsRequest::getMarkerId, (req, v) -> {
                req.setMarkerId(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceConnectionsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<ListServiceConnectionsRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServiceConnectionsRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListServiceConnectionsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<ListServiceConnectionsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServiceConnectionsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListServiceConnectionsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceConnectionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceConnectionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceDescribeDetailsRequest, ListServiceDescribeDetailsResponse> listServiceDescribeDetails =
        genForlistServiceDescribeDetails();

    private static HttpRequestDef<ListServiceDescribeDetailsRequest, ListServiceDescribeDetailsResponse> genForlistServiceDescribeDetails() {
        // basic
        HttpRequestDef.Builder<ListServiceDescribeDetailsRequest, ListServiceDescribeDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListServiceDescribeDetailsRequest.class,
                    ListServiceDescribeDetailsResponse.class)
                .withName("ListServiceDescribeDetails")
                .withUri("/v1/{project_id}/vpc-endpoint-services/describe")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_service_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceDescribeDetailsRequest::getEndpointServiceName, (req, v) -> {
                req.setEndpointServiceName(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceDescribeDetailsRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceDetailsRequest, ListServiceDetailsResponse> listServiceDetails =
        genForlistServiceDetails();

    private static HttpRequestDef<ListServiceDetailsRequest, ListServiceDetailsResponse> genForlistServiceDetails() {
        // basic
        HttpRequestDef.Builder<ListServiceDetailsRequest, ListServiceDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServiceDetailsRequest.class, ListServiceDetailsResponse.class)
                .withName("ListServiceDetails")
                .withUri("/v1/{project_id}/vpc-endpoint-services/{vpc_endpoint_service_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_endpoint_service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceDetailsRequest::getVpcEndpointServiceId, (req, v) -> {
                req.setVpcEndpointServiceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServicePermissionsDetailsRequest, ListServicePermissionsDetailsResponse> listServicePermissionsDetails =
        genForlistServicePermissionsDetails();

    private static HttpRequestDef<ListServicePermissionsDetailsRequest, ListServicePermissionsDetailsResponse> genForlistServicePermissionsDetails() {
        // basic
        HttpRequestDef.Builder<ListServicePermissionsDetailsRequest, ListServicePermissionsDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListServicePermissionsDetailsRequest.class,
                    ListServicePermissionsDetailsResponse.class)
                .withName("ListServicePermissionsDetails")
                .withUri("/v1/{project_id}/vpc-endpoint-services/{vpc_endpoint_service_id}/permissions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_endpoint_service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicePermissionsDetailsRequest::getVpcEndpointServiceId, (req, v) -> {
                req.setVpcEndpointServiceId(v);
            }));
        builder.<String>withRequestField("permission",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicePermissionsDetailsRequest::getPermission, (req, v) -> {
                req.setPermission(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServicePermissionsDetailsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServicePermissionsDetailsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<ListServicePermissionsDetailsRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServicePermissionsDetailsRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListServicePermissionsDetailsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<ListServicePermissionsDetailsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServicePermissionsDetailsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListServicePermissionsDetailsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServicePublicDetailsRequest, ListServicePublicDetailsResponse> listServicePublicDetails =
        genForlistServicePublicDetails();

    private static HttpRequestDef<ListServicePublicDetailsRequest, ListServicePublicDetailsResponse> genForlistServicePublicDetails() {
        // basic
        HttpRequestDef.Builder<ListServicePublicDetailsRequest, ListServicePublicDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListServicePublicDetailsRequest.class, ListServicePublicDetailsResponse.class)
                .withName("ListServicePublicDetails")
                .withUri("/v1/{project_id}/vpc-endpoint-services/public")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServicePublicDetailsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServicePublicDetailsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("endpoint_service_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicePublicDetailsRequest::getEndpointServiceName, (req, v) -> {
                req.setEndpointServiceName(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicePublicDetailsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<ListServicePublicDetailsRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServicePublicDetailsRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListServicePublicDetailsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<ListServicePublicDetailsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServicePublicDetailsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListServicePublicDetailsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSpecifiedVersionDetailsRequest, ListSpecifiedVersionDetailsResponse> listSpecifiedVersionDetails =
        genForlistSpecifiedVersionDetails();

    private static HttpRequestDef<ListSpecifiedVersionDetailsRequest, ListSpecifiedVersionDetailsResponse> genForlistSpecifiedVersionDetails() {
        // basic
        HttpRequestDef.Builder<ListSpecifiedVersionDetailsRequest, ListSpecifiedVersionDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSpecifiedVersionDetailsRequest.class,
                    ListSpecifiedVersionDetailsResponse.class)
                .withName("ListSpecifiedVersionDetails")
                .withUri("/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpecifiedVersionDetailsRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVersionDetailsRequest, ListVersionDetailsResponse> listVersionDetails =
        genForlistVersionDetails();

    private static HttpRequestDef<ListVersionDetailsRequest, ListVersionDetailsResponse> genForlistVersionDetails() {
        // basic
        HttpRequestDef.Builder<ListVersionDetailsRequest, ListVersionDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVersionDetailsRequest.class, ListVersionDetailsResponse.class)
                .withName("ListVersionDetails")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEndpointRoutetableRequest, UpdateEndpointRoutetableResponse> updateEndpointRoutetable =
        genForupdateEndpointRoutetable();

    private static HttpRequestDef<UpdateEndpointRoutetableRequest, UpdateEndpointRoutetableResponse> genForupdateEndpointRoutetable() {
        // basic
        HttpRequestDef.Builder<UpdateEndpointRoutetableRequest, UpdateEndpointRoutetableResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateEndpointRoutetableRequest.class, UpdateEndpointRoutetableResponse.class)
                .withName("UpdateEndpointRoutetable")
                .withUri("/v1/{project_id}/vpc-endpoints/{vpc_endpoint_id}/routetables")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vpc_endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEndpointRoutetableRequest::getVpcEndpointId, (req, v) -> {
                req.setVpcEndpointId(v);
            }));
        builder.<UpdateEndpointRoutetableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEndpointRoutetableRequestBody.class),
            f -> f.withMarshaller(UpdateEndpointRoutetableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEndpointServiceRequest, UpdateEndpointServiceResponse> updateEndpointService =
        genForupdateEndpointService();

    private static HttpRequestDef<UpdateEndpointServiceRequest, UpdateEndpointServiceResponse> genForupdateEndpointService() {
        // basic
        HttpRequestDef.Builder<UpdateEndpointServiceRequest, UpdateEndpointServiceResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateEndpointServiceRequest.class, UpdateEndpointServiceResponse.class)
            .withName("UpdateEndpointService")
            .withUri("/v1/{project_id}/vpc-endpoint-services/{vpc_endpoint_service_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vpc_endpoint_service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEndpointServiceRequest::getVpcEndpointServiceId, (req, v) -> {
                req.setVpcEndpointServiceId(v);
            }));
        builder.<UpdateEndpointServiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEndpointServiceRequestBody.class),
            f -> f.withMarshaller(UpdateEndpointServiceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEndpointWhiteRequest, UpdateEndpointWhiteResponse> updateEndpointWhite =
        genForupdateEndpointWhite();

    private static HttpRequestDef<UpdateEndpointWhiteRequest, UpdateEndpointWhiteResponse> genForupdateEndpointWhite() {
        // basic
        HttpRequestDef.Builder<UpdateEndpointWhiteRequest, UpdateEndpointWhiteResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEndpointWhiteRequest.class, UpdateEndpointWhiteResponse.class)
                .withName("UpdateEndpointWhite")
                .withUri("/v1/{project_id}/vpc-endpoints/{vpc_endpoint_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vpc_endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEndpointWhiteRequest::getVpcEndpointId, (req, v) -> {
                req.setVpcEndpointId(v);
            }));
        builder.<UpdateEndpointWhiteRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEndpointWhiteRequestBody.class),
            f -> f.withMarshaller(UpdateEndpointWhiteRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddOrRemoveResourceInstanceRequest, BatchAddOrRemoveResourceInstanceResponse> batchAddOrRemoveResourceInstance =
        genForbatchAddOrRemoveResourceInstance();

    private static HttpRequestDef<BatchAddOrRemoveResourceInstanceRequest, BatchAddOrRemoveResourceInstanceResponse> genForbatchAddOrRemoveResourceInstance() {
        // basic
        HttpRequestDef.Builder<BatchAddOrRemoveResourceInstanceRequest, BatchAddOrRemoveResourceInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchAddOrRemoveResourceInstanceRequest.class,
                    BatchAddOrRemoveResourceInstanceResponse.class)
                .withName("BatchAddOrRemoveResourceInstance")
                .withUri("/v1/{project_id}/{resource_type}/{resource_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddOrRemoveResourceInstanceRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddOrRemoveResourceInstanceRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<BatchAddOrRemoveResourceInstanceBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchAddOrRemoveResourceInstanceBody.class),
            f -> f.withMarshaller(BatchAddOrRemoveResourceInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueryProjectResourceTagsRequest, ListQueryProjectResourceTagsResponse> listQueryProjectResourceTags =
        genForlistQueryProjectResourceTags();

    private static HttpRequestDef<ListQueryProjectResourceTagsRequest, ListQueryProjectResourceTagsResponse> genForlistQueryProjectResourceTags() {
        // basic
        HttpRequestDef.Builder<ListQueryProjectResourceTagsRequest, ListQueryProjectResourceTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListQueryProjectResourceTagsRequest.class,
                    ListQueryProjectResourceTagsResponse.class)
                .withName("ListQueryProjectResourceTags")
                .withUri("/v1/{project_id}/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryProjectResourceTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstances =
        genForlistResourceInstances();

    private static HttpRequestDef<ListResourceInstancesRequest, ListResourceInstancesResponse> genForlistResourceInstances() {
        // basic
        HttpRequestDef.Builder<ListResourceInstancesRequest, ListResourceInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListResourceInstancesRequest.class, ListResourceInstancesResponse.class)
            .withName("ListResourceInstances")
            .withUri("/v1/{project_id}/{resource_type}/resource_instances/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<QueryResourceInstanceTagsBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryResourceInstanceTagsBody.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
