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
import com.huaweicloud.sdk.vpcep.v1.model.BatchAddEndpointServicePermissionsRequestBody;
import com.huaweicloud.sdk.vpcep.v1.model.BatchAddEndpointServicePermissionsResponse;
import com.huaweicloud.sdk.vpcep.v1.model.BatchAddOrRemoveResourceInstanceRequest;
import com.huaweicloud.sdk.vpcep.v1.model.BatchAddOrRemoveResourceInstanceRequestBody;
import com.huaweicloud.sdk.vpcep.v1.model.BatchAddOrRemoveResourceInstanceResponse;
import com.huaweicloud.sdk.vpcep.v1.model.BatchRemoveEndpointServicePermissionsRequest;
import com.huaweicloud.sdk.vpcep.v1.model.BatchRemoveEndpointServicePermissionsRequestBody;
import com.huaweicloud.sdk.vpcep.v1.model.BatchRemoveEndpointServicePermissionsResponse;
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
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointConnectionsDescRequestBody;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointConnectionsDescResponse;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointPolicyRequest;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointPolicyRequestBody;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointPolicyResponse;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointRoutetableRequest;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointRoutetableRequestBody;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointRoutetableResponse;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServiceNameRequest;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServiceNameRequestBody;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServiceNameResponse;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServicePermissionDescRequest;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServicePermissionDescRequestBody;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServicePermissionDescResponse;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServiceRequest;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServiceRequestBody;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointServiceResponse;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointWhiteRequest;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointWhiteRequestBody;
import com.huaweicloud.sdk.vpcep.v1.model.UpdateEndpointWhiteResponse;

@SuppressWarnings("unchecked")
public class VpcepMeta {

    public static final HttpRequestDef<AcceptOrRejectEndpointRequest, AcceptOrRejectEndpointResponse> acceptOrRejectEndpoint =
        genForAcceptOrRejectEndpoint();

    private static HttpRequestDef<AcceptOrRejectEndpointRequest, AcceptOrRejectEndpointResponse> genForAcceptOrRejectEndpoint() {
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
            f -> f.withMarshaller(AcceptOrRejectEndpointRequest::getVpcEndpointServiceId,
                AcceptOrRejectEndpointRequest::setVpcEndpointServiceId));
        builder.<AcceptOrRejectEndpointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AcceptOrRejectEndpointRequestBody.class),
            f -> f.withMarshaller(AcceptOrRejectEndpointRequest::getBody, AcceptOrRejectEndpointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddOrRemoveServicePermissionsRequest, AddOrRemoveServicePermissionsResponse> addOrRemoveServicePermissions =
        genForAddOrRemoveServicePermissions();

    private static HttpRequestDef<AddOrRemoveServicePermissionsRequest, AddOrRemoveServicePermissionsResponse> genForAddOrRemoveServicePermissions() {
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
            f -> f.withMarshaller(AddOrRemoveServicePermissionsRequest::getVpcEndpointServiceId,
                AddOrRemoveServicePermissionsRequest::setVpcEndpointServiceId));
        builder.<AddOrRemoveServicePermissionsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddOrRemoveServicePermissionsRequestBody.class),
            f -> f.withMarshaller(AddOrRemoveServicePermissionsRequest::getBody,
                AddOrRemoveServicePermissionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddEndpointServicePermissionsRequest, BatchAddEndpointServicePermissionsResponse> batchAddEndpointServicePermissions =
        genForBatchAddEndpointServicePermissions();

    private static HttpRequestDef<BatchAddEndpointServicePermissionsRequest, BatchAddEndpointServicePermissionsResponse> genForBatchAddEndpointServicePermissions() {
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
            f -> f.withMarshaller(BatchAddEndpointServicePermissionsRequest::getVpcEndpointServiceId,
                BatchAddEndpointServicePermissionsRequest::setVpcEndpointServiceId));
        builder.<BatchAddEndpointServicePermissionsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddEndpointServicePermissionsRequestBody.class),
            f -> f.withMarshaller(BatchAddEndpointServicePermissionsRequest::getBody,
                BatchAddEndpointServicePermissionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRemoveEndpointServicePermissionsRequest, BatchRemoveEndpointServicePermissionsResponse> batchRemoveEndpointServicePermissions =
        genForBatchRemoveEndpointServicePermissions();

    private static HttpRequestDef<BatchRemoveEndpointServicePermissionsRequest, BatchRemoveEndpointServicePermissionsResponse> genForBatchRemoveEndpointServicePermissions() {
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
            f -> f.withMarshaller(BatchRemoveEndpointServicePermissionsRequest::getVpcEndpointServiceId,
                BatchRemoveEndpointServicePermissionsRequest::setVpcEndpointServiceId));
        builder.<BatchRemoveEndpointServicePermissionsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchRemoveEndpointServicePermissionsRequestBody.class),
            f -> f.withMarshaller(BatchRemoveEndpointServicePermissionsRequest::getBody,
                BatchRemoveEndpointServicePermissionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEndpointRequest, CreateEndpointResponse> createEndpoint =
        genForCreateEndpoint();

    private static HttpRequestDef<CreateEndpointRequest, CreateEndpointResponse> genForCreateEndpoint() {
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
            f -> f.withMarshaller(CreateEndpointRequest::getBody, CreateEndpointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEndpointServiceRequest, CreateEndpointServiceResponse> createEndpointService =
        genForCreateEndpointService();

    private static HttpRequestDef<CreateEndpointServiceRequest, CreateEndpointServiceResponse> genForCreateEndpointService() {
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
            f -> f.withMarshaller(CreateEndpointServiceRequest::getBody, CreateEndpointServiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpoint =
        genForDeleteEndpoint();

    private static HttpRequestDef<DeleteEndpointRequest, DeleteEndpointResponse> genForDeleteEndpoint() {
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
            f -> f.withMarshaller(DeleteEndpointRequest::getVpcEndpointId, DeleteEndpointRequest::setVpcEndpointId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEndpointPolicyRequest, DeleteEndpointPolicyResponse> deleteEndpointPolicy =
        genForDeleteEndpointPolicy();

    private static HttpRequestDef<DeleteEndpointPolicyRequest, DeleteEndpointPolicyResponse> genForDeleteEndpointPolicy() {
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
            f -> f.withMarshaller(DeleteEndpointPolicyRequest::getVpcEndpointId,
                DeleteEndpointPolicyRequest::setVpcEndpointId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEndpointServiceRequest, DeleteEndpointServiceResponse> deleteEndpointService =
        genForDeleteEndpointService();

    private static HttpRequestDef<DeleteEndpointServiceRequest, DeleteEndpointServiceResponse> genForDeleteEndpointService() {
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
            f -> f.withMarshaller(DeleteEndpointServiceRequest::getVpcEndpointServiceId,
                DeleteEndpointServiceRequest::setVpcEndpointServiceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEndpointInfoDetailsRequest, ListEndpointInfoDetailsResponse> listEndpointInfoDetails =
        genForListEndpointInfoDetails();

    private static HttpRequestDef<ListEndpointInfoDetailsRequest, ListEndpointInfoDetailsResponse> genForListEndpointInfoDetails() {
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
            f -> f.withMarshaller(ListEndpointInfoDetailsRequest::getVpcEndpointId,
                ListEndpointInfoDetailsRequest::setVpcEndpointId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEndpointServiceRequest, ListEndpointServiceResponse> listEndpointService =
        genForListEndpointService();

    private static HttpRequestDef<ListEndpointServiceRequest, ListEndpointServiceResponse> genForListEndpointService() {
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
            f -> f.withMarshaller(ListEndpointServiceRequest::getEndpointServiceName,
                ListEndpointServiceRequest::setEndpointServiceName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointServiceRequest::getId, ListEndpointServiceRequest::setId));
        builder.<ListEndpointServiceRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEndpointServiceRequest.StatusEnum.class),
            f -> f.withMarshaller(ListEndpointServiceRequest::getStatus, ListEndpointServiceRequest::setStatus));
        builder.<ListEndpointServiceRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEndpointServiceRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListEndpointServiceRequest::getSortKey, ListEndpointServiceRequest::setSortKey));
        builder.<ListEndpointServiceRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEndpointServiceRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListEndpointServiceRequest::getSortDir, ListEndpointServiceRequest::setSortDir));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointServiceRequest::getLimit, ListEndpointServiceRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointServiceRequest::getOffset, ListEndpointServiceRequest::setOffset));
        builder.<String>withRequestField("public_border_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointServiceRequest::getPublicBorderGroup,
                ListEndpointServiceRequest::setPublicBorderGroup));
        builder.<ListEndpointServiceRequest.NetTypeEnum>withRequestField("net_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEndpointServiceRequest.NetTypeEnum.class),
            f -> f.withMarshaller(ListEndpointServiceRequest::getNetType, ListEndpointServiceRequest::setNetType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEndpointsRequest, ListEndpointsResponse> listEndpoints =
        genForListEndpoints();

    private static HttpRequestDef<ListEndpointsRequest, ListEndpointsResponse> genForListEndpoints() {
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
            f -> f.withMarshaller(ListEndpointsRequest::getEndpointServiceName,
                ListEndpointsRequest::setEndpointServiceName));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getVpcId, ListEndpointsRequest::setVpcId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getId, ListEndpointsRequest::setId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointsRequest::getLimit, ListEndpointsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointsRequest::getOffset, ListEndpointsRequest::setOffset));
        builder.<ListEndpointsRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEndpointsRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListEndpointsRequest::getSortKey, ListEndpointsRequest::setSortKey));
        builder.<ListEndpointsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEndpointsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListEndpointsRequest::getSortDir, ListEndpointsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotaDetailsRequest, ListQuotaDetailsResponse> listQuotaDetails =
        genForListQuotaDetails();

    private static HttpRequestDef<ListQuotaDetailsRequest, ListQuotaDetailsResponse> genForListQuotaDetails() {
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
            f -> f.withMarshaller(ListQuotaDetailsRequest::getType, ListQuotaDetailsRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceConnectionsRequest, ListServiceConnectionsResponse> listServiceConnections =
        genForListServiceConnections();

    private static HttpRequestDef<ListServiceConnectionsRequest, ListServiceConnectionsResponse> genForListServiceConnections() {
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
            f -> f.withMarshaller(ListServiceConnectionsRequest::getVpcEndpointServiceId,
                ListServiceConnectionsRequest::setVpcEndpointServiceId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceConnectionsRequest::getId, ListServiceConnectionsRequest::setId));
        builder.<String>withRequestField("marker_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceConnectionsRequest::getMarkerId,
                ListServiceConnectionsRequest::setMarkerId));
        builder.<ListServiceConnectionsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServiceConnectionsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListServiceConnectionsRequest::getStatus, ListServiceConnectionsRequest::setStatus));
        builder.<ListServiceConnectionsRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServiceConnectionsRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListServiceConnectionsRequest::getSortKey,
                ListServiceConnectionsRequest::setSortKey));
        builder.<ListServiceConnectionsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServiceConnectionsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListServiceConnectionsRequest::getSortDir,
                ListServiceConnectionsRequest::setSortDir));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceConnectionsRequest::getLimit, ListServiceConnectionsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceConnectionsRequest::getOffset, ListServiceConnectionsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceDescribeDetailsRequest, ListServiceDescribeDetailsResponse> listServiceDescribeDetails =
        genForListServiceDescribeDetails();

    private static HttpRequestDef<ListServiceDescribeDetailsRequest, ListServiceDescribeDetailsResponse> genForListServiceDescribeDetails() {
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
            f -> f.withMarshaller(ListServiceDescribeDetailsRequest::getEndpointServiceName,
                ListServiceDescribeDetailsRequest::setEndpointServiceName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceDescribeDetailsRequest::getId, ListServiceDescribeDetailsRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceDetailsRequest, ListServiceDetailsResponse> listServiceDetails =
        genForListServiceDetails();

    private static HttpRequestDef<ListServiceDetailsRequest, ListServiceDetailsResponse> genForListServiceDetails() {
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
            f -> f.withMarshaller(ListServiceDetailsRequest::getVpcEndpointServiceId,
                ListServiceDetailsRequest::setVpcEndpointServiceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServicePermissionsDetailsRequest, ListServicePermissionsDetailsResponse> listServicePermissionsDetails =
        genForListServicePermissionsDetails();

    private static HttpRequestDef<ListServicePermissionsDetailsRequest, ListServicePermissionsDetailsResponse> genForListServicePermissionsDetails() {
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
            f -> f.withMarshaller(ListServicePermissionsDetailsRequest::getVpcEndpointServiceId,
                ListServicePermissionsDetailsRequest::setVpcEndpointServiceId));
        builder.<String>withRequestField("permission",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicePermissionsDetailsRequest::getPermission,
                ListServicePermissionsDetailsRequest::setPermission));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServicePermissionsDetailsRequest::getLimit,
                ListServicePermissionsDetailsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServicePermissionsDetailsRequest::getOffset,
                ListServicePermissionsDetailsRequest::setOffset));
        builder.<ListServicePermissionsDetailsRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServicePermissionsDetailsRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListServicePermissionsDetailsRequest::getSortKey,
                ListServicePermissionsDetailsRequest::setSortKey));
        builder.<ListServicePermissionsDetailsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServicePermissionsDetailsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListServicePermissionsDetailsRequest::getSortDir,
                ListServicePermissionsDetailsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServicePublicDetailsRequest, ListServicePublicDetailsResponse> listServicePublicDetails =
        genForListServicePublicDetails();

    private static HttpRequestDef<ListServicePublicDetailsRequest, ListServicePublicDetailsResponse> genForListServicePublicDetails() {
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
            f -> f.withMarshaller(ListServicePublicDetailsRequest::getLimit,
                ListServicePublicDetailsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServicePublicDetailsRequest::getOffset,
                ListServicePublicDetailsRequest::setOffset));
        builder.<String>withRequestField("endpoint_service_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicePublicDetailsRequest::getEndpointServiceName,
                ListServicePublicDetailsRequest::setEndpointServiceName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicePublicDetailsRequest::getId, ListServicePublicDetailsRequest::setId));
        builder.<ListServicePublicDetailsRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServicePublicDetailsRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListServicePublicDetailsRequest::getSortKey,
                ListServicePublicDetailsRequest::setSortKey));
        builder.<ListServicePublicDetailsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServicePublicDetailsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListServicePublicDetailsRequest::getSortDir,
                ListServicePublicDetailsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSpecifiedVersionDetailsRequest, ListSpecifiedVersionDetailsResponse> listSpecifiedVersionDetails =
        genForListSpecifiedVersionDetails();

    private static HttpRequestDef<ListSpecifiedVersionDetailsRequest, ListSpecifiedVersionDetailsResponse> genForListSpecifiedVersionDetails() {
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
            f -> f.withMarshaller(ListSpecifiedVersionDetailsRequest::getVersion,
                ListSpecifiedVersionDetailsRequest::setVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVersionDetailsRequest, ListVersionDetailsResponse> listVersionDetails =
        genForListVersionDetails();

    private static HttpRequestDef<ListVersionDetailsRequest, ListVersionDetailsResponse> genForListVersionDetails() {
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
        genForUpdateEndpointConnectionsDesc();

    private static HttpRequestDef<UpdateEndpointConnectionsDescRequest, UpdateEndpointConnectionsDescResponse> genForUpdateEndpointConnectionsDesc() {
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
            f -> f.withMarshaller(UpdateEndpointConnectionsDescRequest::getVpcEndpointServiceId,
                UpdateEndpointConnectionsDescRequest::setVpcEndpointServiceId));
        builder.<UpdateEndpointConnectionsDescRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEndpointConnectionsDescRequestBody.class),
            f -> f.withMarshaller(UpdateEndpointConnectionsDescRequest::getBody,
                UpdateEndpointConnectionsDescRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEndpointPolicyRequest, UpdateEndpointPolicyResponse> updateEndpointPolicy =
        genForUpdateEndpointPolicy();

    private static HttpRequestDef<UpdateEndpointPolicyRequest, UpdateEndpointPolicyResponse> genForUpdateEndpointPolicy() {
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
            f -> f.withMarshaller(UpdateEndpointPolicyRequest::getVpcEndpointId,
                UpdateEndpointPolicyRequest::setVpcEndpointId));
        builder.<UpdateEndpointPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEndpointPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateEndpointPolicyRequest::getBody, UpdateEndpointPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEndpointRoutetableRequest, UpdateEndpointRoutetableResponse> updateEndpointRoutetable =
        genForUpdateEndpointRoutetable();

    private static HttpRequestDef<UpdateEndpointRoutetableRequest, UpdateEndpointRoutetableResponse> genForUpdateEndpointRoutetable() {
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
            f -> f.withMarshaller(UpdateEndpointRoutetableRequest::getVpcEndpointId,
                UpdateEndpointRoutetableRequest::setVpcEndpointId));
        builder.<UpdateEndpointRoutetableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEndpointRoutetableRequestBody.class),
            f -> f.withMarshaller(UpdateEndpointRoutetableRequest::getBody, UpdateEndpointRoutetableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEndpointServiceRequest, UpdateEndpointServiceResponse> updateEndpointService =
        genForUpdateEndpointService();

    private static HttpRequestDef<UpdateEndpointServiceRequest, UpdateEndpointServiceResponse> genForUpdateEndpointService() {
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
            f -> f.withMarshaller(UpdateEndpointServiceRequest::getVpcEndpointServiceId,
                UpdateEndpointServiceRequest::setVpcEndpointServiceId));
        builder.<UpdateEndpointServiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEndpointServiceRequestBody.class),
            f -> f.withMarshaller(UpdateEndpointServiceRequest::getBody, UpdateEndpointServiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEndpointServiceNameRequest, UpdateEndpointServiceNameResponse> updateEndpointServiceName =
        genForUpdateEndpointServiceName();

    private static HttpRequestDef<UpdateEndpointServiceNameRequest, UpdateEndpointServiceNameResponse> genForUpdateEndpointServiceName() {
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
            f -> f.withMarshaller(UpdateEndpointServiceNameRequest::getVpcEndpointServiceId,
                UpdateEndpointServiceNameRequest::setVpcEndpointServiceId));
        builder.<UpdateEndpointServiceNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateEndpointServiceNameRequestBody.class),
            f -> f.withMarshaller(UpdateEndpointServiceNameRequest::getBody,
                UpdateEndpointServiceNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEndpointServicePermissionDescRequest, UpdateEndpointServicePermissionDescResponse> updateEndpointServicePermissionDesc =
        genForUpdateEndpointServicePermissionDesc();

    private static HttpRequestDef<UpdateEndpointServicePermissionDescRequest, UpdateEndpointServicePermissionDescResponse> genForUpdateEndpointServicePermissionDesc() {
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
            f -> f.withMarshaller(UpdateEndpointServicePermissionDescRequest::getVpcEndpointServiceId,
                UpdateEndpointServicePermissionDescRequest::setVpcEndpointServiceId));
        builder.<String>withRequestField("permission_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEndpointServicePermissionDescRequest::getPermissionId,
                UpdateEndpointServicePermissionDescRequest::setPermissionId));
        builder.<UpdateEndpointServicePermissionDescRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEndpointServicePermissionDescRequestBody.class),
            f -> f.withMarshaller(UpdateEndpointServicePermissionDescRequest::getBody,
                UpdateEndpointServicePermissionDescRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEndpointWhiteRequest, UpdateEndpointWhiteResponse> updateEndpointWhite =
        genForUpdateEndpointWhite();

    private static HttpRequestDef<UpdateEndpointWhiteRequest, UpdateEndpointWhiteResponse> genForUpdateEndpointWhite() {
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
            f -> f.withMarshaller(UpdateEndpointWhiteRequest::getVpcEndpointId,
                UpdateEndpointWhiteRequest::setVpcEndpointId));
        builder.<UpdateEndpointWhiteRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEndpointWhiteRequestBody.class),
            f -> f.withMarshaller(UpdateEndpointWhiteRequest::getBody, UpdateEndpointWhiteRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddOrRemoveResourceInstanceRequest, BatchAddOrRemoveResourceInstanceResponse> batchAddOrRemoveResourceInstance =
        genForBatchAddOrRemoveResourceInstance();

    private static HttpRequestDef<BatchAddOrRemoveResourceInstanceRequest, BatchAddOrRemoveResourceInstanceResponse> genForBatchAddOrRemoveResourceInstance() {
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
        builder.<BatchAddOrRemoveResourceInstanceRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddOrRemoveResourceInstanceRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchAddOrRemoveResourceInstanceRequest::getResourceType,
                BatchAddOrRemoveResourceInstanceRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddOrRemoveResourceInstanceRequest::getResourceId,
                BatchAddOrRemoveResourceInstanceRequest::setResourceId));
        builder.<BatchAddOrRemoveResourceInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchAddOrRemoveResourceInstanceRequestBody.class),
            f -> f.withMarshaller(BatchAddOrRemoveResourceInstanceRequest::getBody,
                BatchAddOrRemoveResourceInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueryProjectResourceTagsRequest, ListQueryProjectResourceTagsResponse> listQueryProjectResourceTags =
        genForListQueryProjectResourceTags();

    private static HttpRequestDef<ListQueryProjectResourceTagsRequest, ListQueryProjectResourceTagsResponse> genForListQueryProjectResourceTags() {
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
        builder.<ListQueryProjectResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListQueryProjectResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListQueryProjectResourceTagsRequest::getResourceType,
                ListQueryProjectResourceTagsRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstances =
        genForListResourceInstances();

    private static HttpRequestDef<ListResourceInstancesRequest, ListResourceInstancesResponse> genForListResourceInstances() {
        // basic
        HttpRequestDef.Builder<ListResourceInstancesRequest, ListResourceInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListResourceInstancesRequest.class, ListResourceInstancesResponse.class)
            .withName("ListResourceInstances")
            .withUri("/v1/{project_id}/{resource_type}/resource_instances/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListResourceInstancesRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstancesRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getResourceType,
                ListResourceInstancesRequest::setResourceType));
        builder.<QueryResourceInstanceTagsBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryResourceInstanceTagsBody.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getBody, ListResourceInstancesRequest::setBody));

        // response

        return builder.build();
    }

}
