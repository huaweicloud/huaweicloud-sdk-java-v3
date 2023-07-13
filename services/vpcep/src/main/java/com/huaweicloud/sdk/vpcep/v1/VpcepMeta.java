package com.huaweicloud.sdk.vpcep.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.vpcep.v1.model.AcceptOrRejectEndpointRequest;
import com.huaweicloud.sdk.vpcep.v1.model.AcceptOrRejectEndpointRequestBody;
import com.huaweicloud.sdk.vpcep.v1.model.AcceptOrRejectEndpointResponse;
import com.huaweicloud.sdk.vpcep.v1.model.AddOrRemoveServicePermissionsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.AddOrRemoveServicePermissionsRequestBody;
import com.huaweicloud.sdk.vpcep.v1.model.AddOrRemoveServicePermissionsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.BatchAddEndpointServicePermissionsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.BatchAddEndpointServicePermissionsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.BatchAddOrRemoveResourceInstanceBody;
import com.huaweicloud.sdk.vpcep.v1.model.BatchAddOrRemoveResourceInstanceRequest;
import com.huaweicloud.sdk.vpcep.v1.model.BatchAddOrRemoveResourceInstanceResponse;
import com.huaweicloud.sdk.vpcep.v1.model.BatchAddPermissionRequest;
import com.huaweicloud.sdk.vpcep.v1.model.BatchRemoveEndpointServicePermissionsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.BatchRemoveEndpointServicePermissionsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.BatchRemovePermissionRequest;
import com.huaweicloud.sdk.vpcep.v1.model.CreateEndpointRequest;
import com.huaweicloud.sdk.vpcep.v1.model.CreateEndpointRequestBody;
import com.huaweicloud.sdk.vpcep.v1.model.CreateEndpointResponse;
import com.huaweicloud.sdk.vpcep.v1.model.CreateEndpointServiceRequest;
import com.huaweicloud.sdk.vpcep.v1.model.CreateEndpointServiceRequestBody;
import com.huaweicloud.sdk.vpcep.v1.model.CreateEndpointServiceResponse;
import com.huaweicloud.sdk.vpcep.v1.model.DeleteEndpointPolicyRequest;
import com.huaweicloud.sdk.vpcep.v1.model.DeleteEndpointPolicyResponse;
import com.huaweicloud.sdk.vpcep.v1.model.DeleteEndpointRequest;
import com.huaweicloud.sdk.vpcep.v1.model.DeleteEndpointResponse;
import com.huaweicloud.sdk.vpcep.v1.model.DeleteEndpointServiceRequest;
import com.huaweicloud.sdk.vpcep.v1.model.DeleteEndpointServiceResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListEndpointInfoDetailsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListEndpointInfoDetailsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListEndpointServiceRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListEndpointServiceResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListEndpointsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListEndpointsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListQueryProjectResourceTagsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListQueryProjectResourceTagsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListQuotaDetailsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListQuotaDetailsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListResourceInstancesRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListResourceInstancesResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListServiceConnectionsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListServiceConnectionsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListServiceDescribeDetailsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListServiceDescribeDetailsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListServiceDetailsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListServiceDetailsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListServicePermissionsDetailsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListServicePermissionsDetailsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListServicePublicDetailsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListServicePublicDetailsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListSpecifiedVersionDetailsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListSpecifiedVersionDetailsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.ListVersionDetailsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.ListVersionDetailsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.QueryResourceInstanceTagsBody;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointConnectionsDescRequest;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointConnectionsDescResponse;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointPolicyRequest;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointPolicyRequestBody;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointPolicyResponse;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointRoutetableRequest;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointRoutetableRequestBody;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointRoutetableResponse;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServiceNameMode;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServiceNameRequest;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServiceNameResponse;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServicePermissionDescRequest;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServicePermissionDescResponse;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServiceRequest;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServiceRequestBody;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServiceResponse;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointWhiteRequest;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointWhiteRequestBody;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointWhiteResponse;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEpConnections;
import com.huaweicloud.sdk.vpcep.v1.model.UpdatePermissionDescRequest;

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

    public static final HttpRequestDef<BatchAddEndpointServicePermissionsRequest, BatchAddEndpointServicePermissionsResponse> batchAddEndpointServicePermissions =
        genForbatchAddEndpointServicePermissions();

    private static HttpRequestDef<BatchAddEndpointServicePermissionsRequest, BatchAddEndpointServicePermissionsResponse> genForbatchAddEndpointServicePermissions() {
        // basic
        HttpRequestDef.Builder<BatchAddEndpointServicePermissionsRequest, BatchAddEndpointServicePermissionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchAddEndpointServicePermissionsRequest.class,
                    BatchAddEndpointServicePermissionsResponse.class)
                .withName("BatchAddEndpointServicePermissions")
                .withUri("/v1/{project_id}/vpc-endpoint-services/{vpc_endpoint_service_id}/permissions/batch-create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vpc_endpoint_service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddEndpointServicePermissionsRequest::getVpcEndpointServiceId, (req, v) -> {
                req.setVpcEndpointServiceId(v);
            }));
        builder.<BatchAddPermissionRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddPermissionRequest.class),
            f -> f.withMarshaller(BatchAddEndpointServicePermissionsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRemoveEndpointServicePermissionsRequest, BatchRemoveEndpointServicePermissionsResponse> batchRemoveEndpointServicePermissions =
        genForbatchRemoveEndpointServicePermissions();

    private static HttpRequestDef<BatchRemoveEndpointServicePermissionsRequest, BatchRemoveEndpointServicePermissionsResponse> genForbatchRemoveEndpointServicePermissions() {
        // basic
        HttpRequestDef.Builder<BatchRemoveEndpointServicePermissionsRequest, BatchRemoveEndpointServicePermissionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchRemoveEndpointServicePermissionsRequest.class,
                    BatchRemoveEndpointServicePermissionsResponse.class)
                .withName("BatchRemoveEndpointServicePermissions")
                .withUri("/v1/{project_id}/vpc-endpoint-services/{vpc_endpoint_service_id}/permissions/batch-delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vpc_endpoint_service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchRemoveEndpointServicePermissionsRequest::getVpcEndpointServiceId, (req, v) -> {
                req.setVpcEndpointServiceId(v);
            }));
        builder.<BatchRemovePermissionRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchRemovePermissionRequest.class),
            f -> f.withMarshaller(BatchRemoveEndpointServicePermissionsRequest::getBody, (req, v) -> {
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

    public static final HttpRequestDef<DeleteEndpointPolicyRequest, DeleteEndpointPolicyResponse> deleteEndpointPolicy =
        genFordeleteEndpointPolicy();

    private static HttpRequestDef<DeleteEndpointPolicyRequest, DeleteEndpointPolicyResponse> genFordeleteEndpointPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteEndpointPolicyRequest, DeleteEndpointPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEndpointPolicyRequest.class, DeleteEndpointPolicyResponse.class)
            .withName("DeleteEndpointPolicy")
            .withUri("/v1/{project_id}/vpc-endpoints/{vpc_endpoint_id}/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEndpointPolicyRequest::getVpcEndpointId, (req, v) -> {
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
        builder.<String>withRequestField("public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointServiceRequest::getPublicBorderGroup, (req, v) -> {
                req.setPublicBorderGroup(v);
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
        builder.<String>withRequestField("public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getPublicBorderGroup, (req, v) -> {
                req.setPublicBorderGroup(v);
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

    public static final HttpRequestDef<UpdateEndpointConnectionsDescRequest, UpdateEndpointConnectionsDescResponse> updateEndpointConnectionsDesc =
        genForupdateEndpointConnectionsDesc();

    private static HttpRequestDef<UpdateEndpointConnectionsDescRequest, UpdateEndpointConnectionsDescResponse> genForupdateEndpointConnectionsDesc() {
        // basic
        HttpRequestDef.Builder<UpdateEndpointConnectionsDescRequest, UpdateEndpointConnectionsDescResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateEndpointConnectionsDescRequest.class,
                    UpdateEndpointConnectionsDescResponse.class)
                .withName("UpdateEndpointConnectionsDesc")
                .withUri("/v1/{project_id}/vpc-endpoint-services/{vpc_endpoint_service_id}/connections/description")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vpc_endpoint_service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEndpointConnectionsDescRequest::getVpcEndpointServiceId, (req, v) -> {
                req.setVpcEndpointServiceId(v);
            }));
        builder.<UpdateEpConnections>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEpConnections.class),
            f -> f.withMarshaller(UpdateEndpointConnectionsDescRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEndpointPolicyRequest, UpdateEndpointPolicyResponse> updateEndpointPolicy =
        genForupdateEndpointPolicy();

    private static HttpRequestDef<UpdateEndpointPolicyRequest, UpdateEndpointPolicyResponse> genForupdateEndpointPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateEndpointPolicyRequest, UpdateEndpointPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateEndpointPolicyRequest.class, UpdateEndpointPolicyResponse.class)
            .withName("UpdateEndpointPolicy")
            .withUri("/v1/{project_id}/vpc-endpoints/{vpc_endpoint_id}/policy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vpc_endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEndpointPolicyRequest::getVpcEndpointId, (req, v) -> {
                req.setVpcEndpointId(v);
            }));
        builder.<UpdateEndpointPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEndpointPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateEndpointPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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

    public static final HttpRequestDef<UpdateEndpointServiceNameRequest, UpdateEndpointServiceNameResponse> updateEndpointServiceName =
        genForupdateEndpointServiceName();

    private static HttpRequestDef<UpdateEndpointServiceNameRequest, UpdateEndpointServiceNameResponse> genForupdateEndpointServiceName() {
        // basic
        HttpRequestDef.Builder<UpdateEndpointServiceNameRequest, UpdateEndpointServiceNameResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateEndpointServiceNameRequest.class,
                    UpdateEndpointServiceNameResponse.class)
                .withName("UpdateEndpointServiceName")
                .withUri("/v1/{project_id}/vpc-endpoint-services/{vpc_endpoint_service_id}/name")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vpc_endpoint_service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEndpointServiceNameRequest::getVpcEndpointServiceId, (req, v) -> {
                req.setVpcEndpointServiceId(v);
            }));
        builder.<UpdateEndpointServiceNameMode>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateEndpointServiceNameMode.class),
            f -> f.withMarshaller(UpdateEndpointServiceNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEndpointServicePermissionDescRequest, UpdateEndpointServicePermissionDescResponse> updateEndpointServicePermissionDesc =
        genForupdateEndpointServicePermissionDesc();

    private static HttpRequestDef<UpdateEndpointServicePermissionDescRequest, UpdateEndpointServicePermissionDescResponse> genForupdateEndpointServicePermissionDesc() {
        // basic
        HttpRequestDef.Builder<UpdateEndpointServicePermissionDescRequest, UpdateEndpointServicePermissionDescResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateEndpointServicePermissionDescRequest.class,
                    UpdateEndpointServicePermissionDescResponse.class)
                .withName("UpdateEndpointServicePermissionDesc")
                .withUri("/v1/{project_id}/vpc-endpoint-services/{vpc_endpoint_service_id}/permissions/{permission_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vpc_endpoint_service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEndpointServicePermissionDescRequest::getVpcEndpointServiceId, (req, v) -> {
                req.setVpcEndpointServiceId(v);
            }));
        builder.<String>withRequestField("permission_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEndpointServicePermissionDescRequest::getPermissionId, (req, v) -> {
                req.setPermissionId(v);
            }));
        builder.<UpdatePermissionDescRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePermissionDescRequest.class),
            f -> f.withMarshaller(UpdateEndpointServicePermissionDescRequest::getBody, (req, v) -> {
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
