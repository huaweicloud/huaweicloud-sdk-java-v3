package com.huaweicloud.sdk.ga.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ga.v1.model.AddIpGroupIpRequest;
import com.huaweicloud.sdk.ga.v1.model.AddIpGroupIpRequestBody;
import com.huaweicloud.sdk.ga.v1.model.AddIpGroupIpResponse;
import com.huaweicloud.sdk.ga.v1.model.AssociateListenerRequest;
import com.huaweicloud.sdk.ga.v1.model.AssociateListenerRequestBody;
import com.huaweicloud.sdk.ga.v1.model.AssociateListenerResponse;
import com.huaweicloud.sdk.ga.v1.model.CountResourcesByTagRequest;
import com.huaweicloud.sdk.ga.v1.model.CountResourcesByTagResponse;
import com.huaweicloud.sdk.ga.v1.model.CreateAcceleratorRequest;
import com.huaweicloud.sdk.ga.v1.model.CreateAcceleratorRequestBody;
import com.huaweicloud.sdk.ga.v1.model.CreateAcceleratorResponse;
import com.huaweicloud.sdk.ga.v1.model.CreateEndpointGroupRequest;
import com.huaweicloud.sdk.ga.v1.model.CreateEndpointGroupRequestBody;
import com.huaweicloud.sdk.ga.v1.model.CreateEndpointGroupResponse;
import com.huaweicloud.sdk.ga.v1.model.CreateEndpointRequest;
import com.huaweicloud.sdk.ga.v1.model.CreateEndpointRequestBody;
import com.huaweicloud.sdk.ga.v1.model.CreateEndpointResponse;
import com.huaweicloud.sdk.ga.v1.model.CreateHealthCheckRequest;
import com.huaweicloud.sdk.ga.v1.model.CreateHealthCheckRequestBody;
import com.huaweicloud.sdk.ga.v1.model.CreateHealthCheckResponse;
import com.huaweicloud.sdk.ga.v1.model.CreateIpGroupRequest;
import com.huaweicloud.sdk.ga.v1.model.CreateIpGroupRequestBody;
import com.huaweicloud.sdk.ga.v1.model.CreateIpGroupResponse;
import com.huaweicloud.sdk.ga.v1.model.CreateListenerRequest;
import com.huaweicloud.sdk.ga.v1.model.CreateListenerRequestBody;
import com.huaweicloud.sdk.ga.v1.model.CreateListenerResponse;
import com.huaweicloud.sdk.ga.v1.model.CreateLogtankRequest;
import com.huaweicloud.sdk.ga.v1.model.CreateLogtankRequestBody;
import com.huaweicloud.sdk.ga.v1.model.CreateLogtankResponse;
import com.huaweicloud.sdk.ga.v1.model.CreateTagsRequest;
import com.huaweicloud.sdk.ga.v1.model.CreateTagsRequestBody;
import com.huaweicloud.sdk.ga.v1.model.CreateTagsResponse;
import com.huaweicloud.sdk.ga.v1.model.DeleteAcceleratorRequest;
import com.huaweicloud.sdk.ga.v1.model.DeleteAcceleratorResponse;
import com.huaweicloud.sdk.ga.v1.model.DeleteEndpointGroupRequest;
import com.huaweicloud.sdk.ga.v1.model.DeleteEndpointGroupResponse;
import com.huaweicloud.sdk.ga.v1.model.DeleteEndpointRequest;
import com.huaweicloud.sdk.ga.v1.model.DeleteEndpointResponse;
import com.huaweicloud.sdk.ga.v1.model.DeleteHealthCheckRequest;
import com.huaweicloud.sdk.ga.v1.model.DeleteHealthCheckResponse;
import com.huaweicloud.sdk.ga.v1.model.DeleteIpGroupRequest;
import com.huaweicloud.sdk.ga.v1.model.DeleteIpGroupResponse;
import com.huaweicloud.sdk.ga.v1.model.DeleteListenerRequest;
import com.huaweicloud.sdk.ga.v1.model.DeleteListenerResponse;
import com.huaweicloud.sdk.ga.v1.model.DeleteLogtankRequest;
import com.huaweicloud.sdk.ga.v1.model.DeleteLogtankResponse;
import com.huaweicloud.sdk.ga.v1.model.DeleteTagsRequest;
import com.huaweicloud.sdk.ga.v1.model.DeleteTagsRequestBody;
import com.huaweicloud.sdk.ga.v1.model.DeleteTagsResponse;
import com.huaweicloud.sdk.ga.v1.model.DisassociateListenerRequest;
import com.huaweicloud.sdk.ga.v1.model.DisassociateListenerRequestBody;
import com.huaweicloud.sdk.ga.v1.model.DisassociateListenerResponse;
import com.huaweicloud.sdk.ga.v1.model.ListAcceleratorsRequest;
import com.huaweicloud.sdk.ga.v1.model.ListAcceleratorsResponse;
import com.huaweicloud.sdk.ga.v1.model.ListAllPopsRequest;
import com.huaweicloud.sdk.ga.v1.model.ListAllPopsResponse;
import com.huaweicloud.sdk.ga.v1.model.ListByoipPoolsRequest;
import com.huaweicloud.sdk.ga.v1.model.ListByoipPoolsResponse;
import com.huaweicloud.sdk.ga.v1.model.ListEndpointGroupsRequest;
import com.huaweicloud.sdk.ga.v1.model.ListEndpointGroupsResponse;
import com.huaweicloud.sdk.ga.v1.model.ListEndpointsRequest;
import com.huaweicloud.sdk.ga.v1.model.ListEndpointsResponse;
import com.huaweicloud.sdk.ga.v1.model.ListHealthChecksRequest;
import com.huaweicloud.sdk.ga.v1.model.ListHealthChecksResponse;
import com.huaweicloud.sdk.ga.v1.model.ListIpGroupsRequest;
import com.huaweicloud.sdk.ga.v1.model.ListIpGroupsResponse;
import com.huaweicloud.sdk.ga.v1.model.ListListenersRequest;
import com.huaweicloud.sdk.ga.v1.model.ListListenersResponse;
import com.huaweicloud.sdk.ga.v1.model.ListLogtanksRequest;
import com.huaweicloud.sdk.ga.v1.model.ListLogtanksResponse;
import com.huaweicloud.sdk.ga.v1.model.ListRegionsRequest;
import com.huaweicloud.sdk.ga.v1.model.ListRegionsResponse;
import com.huaweicloud.sdk.ga.v1.model.ListResourcesByTagRequest;
import com.huaweicloud.sdk.ga.v1.model.ListResourcesByTagRequestBody;
import com.huaweicloud.sdk.ga.v1.model.ListResourcesByTagResponse;
import com.huaweicloud.sdk.ga.v1.model.ListTagsRequest;
import com.huaweicloud.sdk.ga.v1.model.ListTagsResponse;
import com.huaweicloud.sdk.ga.v1.model.ListTenantQuotasRequest;
import com.huaweicloud.sdk.ga.v1.model.ListTenantQuotasResponse;
import com.huaweicloud.sdk.ga.v1.model.RemoveIpGroupIpRequest;
import com.huaweicloud.sdk.ga.v1.model.RemoveIpGroupIpRequestBody;
import com.huaweicloud.sdk.ga.v1.model.RemoveIpGroupIpResponse;
import com.huaweicloud.sdk.ga.v1.model.ResourceType;
import com.huaweicloud.sdk.ga.v1.model.ShowAcceleratorRequest;
import com.huaweicloud.sdk.ga.v1.model.ShowAcceleratorResponse;
import com.huaweicloud.sdk.ga.v1.model.ShowEndpointGroupRequest;
import com.huaweicloud.sdk.ga.v1.model.ShowEndpointGroupResponse;
import com.huaweicloud.sdk.ga.v1.model.ShowEndpointRequest;
import com.huaweicloud.sdk.ga.v1.model.ShowEndpointResponse;
import com.huaweicloud.sdk.ga.v1.model.ShowHealthCheckRequest;
import com.huaweicloud.sdk.ga.v1.model.ShowHealthCheckResponse;
import com.huaweicloud.sdk.ga.v1.model.ShowIpGroupRequest;
import com.huaweicloud.sdk.ga.v1.model.ShowIpGroupResponse;
import com.huaweicloud.sdk.ga.v1.model.ShowListenerRequest;
import com.huaweicloud.sdk.ga.v1.model.ShowListenerResponse;
import com.huaweicloud.sdk.ga.v1.model.ShowLogtankRequest;
import com.huaweicloud.sdk.ga.v1.model.ShowLogtankResponse;
import com.huaweicloud.sdk.ga.v1.model.ShowResourceTagsRequest;
import com.huaweicloud.sdk.ga.v1.model.ShowResourceTagsResponse;
import com.huaweicloud.sdk.ga.v1.model.UpdateAcceleratorRequest;
import com.huaweicloud.sdk.ga.v1.model.UpdateAcceleratorRequestBody;
import com.huaweicloud.sdk.ga.v1.model.UpdateAcceleratorResponse;
import com.huaweicloud.sdk.ga.v1.model.UpdateEndpointGroupRequest;
import com.huaweicloud.sdk.ga.v1.model.UpdateEndpointGroupRequestBody;
import com.huaweicloud.sdk.ga.v1.model.UpdateEndpointGroupResponse;
import com.huaweicloud.sdk.ga.v1.model.UpdateEndpointRequest;
import com.huaweicloud.sdk.ga.v1.model.UpdateEndpointRequestBody;
import com.huaweicloud.sdk.ga.v1.model.UpdateEndpointResponse;
import com.huaweicloud.sdk.ga.v1.model.UpdateHealthCheckRequest;
import com.huaweicloud.sdk.ga.v1.model.UpdateHealthCheckRequestBody;
import com.huaweicloud.sdk.ga.v1.model.UpdateHealthCheckResponse;
import com.huaweicloud.sdk.ga.v1.model.UpdateIpGroupRequest;
import com.huaweicloud.sdk.ga.v1.model.UpdateIpGroupRequestBody;
import com.huaweicloud.sdk.ga.v1.model.UpdateIpGroupResponse;
import com.huaweicloud.sdk.ga.v1.model.UpdateListenerRequest;
import com.huaweicloud.sdk.ga.v1.model.UpdateListenerRequestBody;
import com.huaweicloud.sdk.ga.v1.model.UpdateListenerResponse;
import com.huaweicloud.sdk.ga.v1.model.UpdateLogtankRequest;
import com.huaweicloud.sdk.ga.v1.model.UpdateLogtankRequestBody;
import com.huaweicloud.sdk.ga.v1.model.UpdateLogtankResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class GaMeta {

    public static final HttpRequestDef<CreateAcceleratorRequest, CreateAcceleratorResponse> createAccelerator =
        genForCreateAccelerator();

    private static HttpRequestDef<CreateAcceleratorRequest, CreateAcceleratorResponse> genForCreateAccelerator() {
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
            f -> f.withMarshaller(CreateAcceleratorRequest::getBody, CreateAcceleratorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAcceleratorRequest, DeleteAcceleratorResponse> deleteAccelerator =
        genForDeleteAccelerator();

    private static HttpRequestDef<DeleteAcceleratorRequest, DeleteAcceleratorResponse> genForDeleteAccelerator() {
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
            f -> f.withMarshaller(DeleteAcceleratorRequest::getAcceleratorId,
                DeleteAcceleratorRequest::setAcceleratorId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAcceleratorsRequest, ListAcceleratorsResponse> listAccelerators =
        genForListAccelerators();

    private static HttpRequestDef<ListAcceleratorsRequest, ListAcceleratorsResponse> genForListAccelerators() {
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
            f -> f.withMarshaller(ListAcceleratorsRequest::getLimit, ListAcceleratorsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAcceleratorsRequest::getMarker, ListAcceleratorsRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAcceleratorsRequest::getPageReverse, ListAcceleratorsRequest::setPageReverse));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAcceleratorsRequest::getId, ListAcceleratorsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAcceleratorsRequest::getName, ListAcceleratorsRequest::setName));
        builder.<ListAcceleratorsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAcceleratorsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAcceleratorsRequest::getStatus, ListAcceleratorsRequest::setStatus));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAcceleratorsRequest::getEnterpriseProjectId,
                ListAcceleratorsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAcceleratorRequest, ShowAcceleratorResponse> showAccelerator =
        genForShowAccelerator();

    private static HttpRequestDef<ShowAcceleratorRequest, ShowAcceleratorResponse> genForShowAccelerator() {
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
            f -> f.withMarshaller(ShowAcceleratorRequest::getAcceleratorId, ShowAcceleratorRequest::setAcceleratorId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAcceleratorRequest, UpdateAcceleratorResponse> updateAccelerator =
        genForUpdateAccelerator();

    private static HttpRequestDef<UpdateAcceleratorRequest, UpdateAcceleratorResponse> genForUpdateAccelerator() {
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
            f -> f.withMarshaller(UpdateAcceleratorRequest::getAcceleratorId,
                UpdateAcceleratorRequest::setAcceleratorId));
        builder.<UpdateAcceleratorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAcceleratorRequestBody.class),
            f -> f.withMarshaller(UpdateAcceleratorRequest::getBody, UpdateAcceleratorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListByoipPoolsRequest, ListByoipPoolsResponse> listByoipPools =
        genForListByoipPools();

    private static HttpRequestDef<ListByoipPoolsRequest, ListByoipPoolsResponse> genForListByoipPools() {
        // basic
        HttpRequestDef.Builder<ListByoipPoolsRequest, ListByoipPoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListByoipPoolsRequest.class, ListByoipPoolsResponse.class)
                .withName("ListByoipPools")
                .withUri("/v1/byoip-pools")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListByoipPoolsRequest::getLimit, ListByoipPoolsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListByoipPoolsRequest::getMarker, ListByoipPoolsRequest::setMarker));

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
                .withUri("/v1/endpoint-groups/{endpoint_group_id}/endpoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEndpointRequest::getEndpointGroupId,
                CreateEndpointRequest::setEndpointGroupId));
        builder.<CreateEndpointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEndpointRequestBody.class),
            f -> f.withMarshaller(CreateEndpointRequest::getBody, CreateEndpointRequest::setBody));

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
                .withUri("/v1/endpoint-groups/{endpoint_group_id}/endpoints/{endpoint_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEndpointRequest::getEndpointGroupId,
                DeleteEndpointRequest::setEndpointGroupId));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEndpointRequest::getEndpointId, DeleteEndpointRequest::setEndpointId));

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
                .withUri("/v1/endpoint-groups/{endpoint_group_id}/endpoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getEndpointGroupId, ListEndpointsRequest::setEndpointGroupId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointsRequest::getLimit, ListEndpointsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getMarker, ListEndpointsRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListEndpointsRequest::getPageReverse, ListEndpointsRequest::setPageReverse));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getId, ListEndpointsRequest::setId));
        builder.<ListEndpointsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEndpointsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListEndpointsRequest::getStatus, ListEndpointsRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEndpointRequest, ShowEndpointResponse> showEndpoint = genForShowEndpoint();

    private static HttpRequestDef<ShowEndpointRequest, ShowEndpointResponse> genForShowEndpoint() {
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
            f -> f.withMarshaller(ShowEndpointRequest::getEndpointGroupId, ShowEndpointRequest::setEndpointGroupId));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEndpointRequest::getEndpointId, ShowEndpointRequest::setEndpointId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEndpointRequest, UpdateEndpointResponse> updateEndpoint =
        genForUpdateEndpoint();

    private static HttpRequestDef<UpdateEndpointRequest, UpdateEndpointResponse> genForUpdateEndpoint() {
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
            f -> f.withMarshaller(UpdateEndpointRequest::getEndpointGroupId,
                UpdateEndpointRequest::setEndpointGroupId));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEndpointRequest::getEndpointId, UpdateEndpointRequest::setEndpointId));
        builder.<UpdateEndpointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEndpointRequestBody.class),
            f -> f.withMarshaller(UpdateEndpointRequest::getBody, UpdateEndpointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEndpointGroupRequest, CreateEndpointGroupResponse> createEndpointGroup =
        genForCreateEndpointGroup();

    private static HttpRequestDef<CreateEndpointGroupRequest, CreateEndpointGroupResponse> genForCreateEndpointGroup() {
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
            f -> f.withMarshaller(CreateEndpointGroupRequest::getBody, CreateEndpointGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEndpointGroupRequest, DeleteEndpointGroupResponse> deleteEndpointGroup =
        genForDeleteEndpointGroup();

    private static HttpRequestDef<DeleteEndpointGroupRequest, DeleteEndpointGroupResponse> genForDeleteEndpointGroup() {
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
            f -> f.withMarshaller(DeleteEndpointGroupRequest::getEndpointGroupId,
                DeleteEndpointGroupRequest::setEndpointGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEndpointGroupsRequest, ListEndpointGroupsResponse> listEndpointGroups =
        genForListEndpointGroups();

    private static HttpRequestDef<ListEndpointGroupsRequest, ListEndpointGroupsResponse> genForListEndpointGroups() {
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
            f -> f.withMarshaller(ListEndpointGroupsRequest::getLimit, ListEndpointGroupsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointGroupsRequest::getMarker, ListEndpointGroupsRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListEndpointGroupsRequest::getPageReverse,
                ListEndpointGroupsRequest::setPageReverse));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointGroupsRequest::getId, ListEndpointGroupsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointGroupsRequest::getName, ListEndpointGroupsRequest::setName));
        builder.<ListEndpointGroupsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEndpointGroupsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListEndpointGroupsRequest::getStatus, ListEndpointGroupsRequest::setStatus));
        builder.<String>withRequestField("listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointGroupsRequest::getListenerId, ListEndpointGroupsRequest::setListenerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEndpointGroupRequest, ShowEndpointGroupResponse> showEndpointGroup =
        genForShowEndpointGroup();

    private static HttpRequestDef<ShowEndpointGroupRequest, ShowEndpointGroupResponse> genForShowEndpointGroup() {
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
            f -> f.withMarshaller(ShowEndpointGroupRequest::getEndpointGroupId,
                ShowEndpointGroupRequest::setEndpointGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEndpointGroupRequest, UpdateEndpointGroupResponse> updateEndpointGroup =
        genForUpdateEndpointGroup();

    private static HttpRequestDef<UpdateEndpointGroupRequest, UpdateEndpointGroupResponse> genForUpdateEndpointGroup() {
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
            f -> f.withMarshaller(UpdateEndpointGroupRequest::getEndpointGroupId,
                UpdateEndpointGroupRequest::setEndpointGroupId));
        builder.<UpdateEndpointGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEndpointGroupRequestBody.class),
            f -> f.withMarshaller(UpdateEndpointGroupRequest::getBody, UpdateEndpointGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHealthCheckRequest, CreateHealthCheckResponse> createHealthCheck =
        genForCreateHealthCheck();

    private static HttpRequestDef<CreateHealthCheckRequest, CreateHealthCheckResponse> genForCreateHealthCheck() {
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
            f -> f.withMarshaller(CreateHealthCheckRequest::getBody, CreateHealthCheckRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHealthCheckRequest, DeleteHealthCheckResponse> deleteHealthCheck =
        genForDeleteHealthCheck();

    private static HttpRequestDef<DeleteHealthCheckRequest, DeleteHealthCheckResponse> genForDeleteHealthCheck() {
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
            f -> f.withMarshaller(DeleteHealthCheckRequest::getHealthCheckId,
                DeleteHealthCheckRequest::setHealthCheckId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHealthChecksRequest, ListHealthChecksResponse> listHealthChecks =
        genForListHealthChecks();

    private static HttpRequestDef<ListHealthChecksRequest, ListHealthChecksResponse> genForListHealthChecks() {
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
            f -> f.withMarshaller(ListHealthChecksRequest::getLimit, ListHealthChecksRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthChecksRequest::getMarker, ListHealthChecksRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHealthChecksRequest::getPageReverse, ListHealthChecksRequest::setPageReverse));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthChecksRequest::getId, ListHealthChecksRequest::setId));
        builder.<ListHealthChecksRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHealthChecksRequest.StatusEnum.class),
            f -> f.withMarshaller(ListHealthChecksRequest::getStatus, ListHealthChecksRequest::setStatus));
        builder.<String>withRequestField("endpoint_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthChecksRequest::getEndpointGroupId,
                ListHealthChecksRequest::setEndpointGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHealthCheckRequest, ShowHealthCheckResponse> showHealthCheck =
        genForShowHealthCheck();

    private static HttpRequestDef<ShowHealthCheckRequest, ShowHealthCheckResponse> genForShowHealthCheck() {
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
            f -> f.withMarshaller(ShowHealthCheckRequest::getHealthCheckId, ShowHealthCheckRequest::setHealthCheckId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHealthCheckRequest, UpdateHealthCheckResponse> updateHealthCheck =
        genForUpdateHealthCheck();

    private static HttpRequestDef<UpdateHealthCheckRequest, UpdateHealthCheckResponse> genForUpdateHealthCheck() {
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
            f -> f.withMarshaller(UpdateHealthCheckRequest::getHealthCheckId,
                UpdateHealthCheckRequest::setHealthCheckId));
        builder.<UpdateHealthCheckRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHealthCheckRequestBody.class),
            f -> f.withMarshaller(UpdateHealthCheckRequest::getBody, UpdateHealthCheckRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddIpGroupIpRequest, AddIpGroupIpResponse> addIpGroupIp = genForAddIpGroupIp();

    private static HttpRequestDef<AddIpGroupIpRequest, AddIpGroupIpResponse> genForAddIpGroupIp() {
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
            f -> f.withMarshaller(AddIpGroupIpRequest::getIpGroupId, AddIpGroupIpRequest::setIpGroupId));
        builder.<AddIpGroupIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddIpGroupIpRequestBody.class),
            f -> f.withMarshaller(AddIpGroupIpRequest::getBody, AddIpGroupIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateListenerRequest, AssociateListenerResponse> associateListener =
        genForAssociateListener();

    private static HttpRequestDef<AssociateListenerRequest, AssociateListenerResponse> genForAssociateListener() {
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
            f -> f.withMarshaller(AssociateListenerRequest::getIpGroupId, AssociateListenerRequest::setIpGroupId));
        builder.<AssociateListenerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateListenerRequestBody.class),
            f -> f.withMarshaller(AssociateListenerRequest::getBody, AssociateListenerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIpGroupRequest, CreateIpGroupResponse> createIpGroup =
        genForCreateIpGroup();

    private static HttpRequestDef<CreateIpGroupRequest, CreateIpGroupResponse> genForCreateIpGroup() {
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
            f -> f.withMarshaller(CreateIpGroupRequest::getBody, CreateIpGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIpGroupRequest, DeleteIpGroupResponse> deleteIpGroup =
        genForDeleteIpGroup();

    private static HttpRequestDef<DeleteIpGroupRequest, DeleteIpGroupResponse> genForDeleteIpGroup() {
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
            f -> f.withMarshaller(DeleteIpGroupRequest::getIpGroupId, DeleteIpGroupRequest::setIpGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateListenerRequest, DisassociateListenerResponse> disassociateListener =
        genForDisassociateListener();

    private static HttpRequestDef<DisassociateListenerRequest, DisassociateListenerResponse> genForDisassociateListener() {
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
            f -> f.withMarshaller(DisassociateListenerRequest::getIpGroupId,
                DisassociateListenerRequest::setIpGroupId));
        builder.<DisassociateListenerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociateListenerRequestBody.class),
            f -> f.withMarshaller(DisassociateListenerRequest::getBody, DisassociateListenerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIpGroupsRequest, ListIpGroupsResponse> listIpGroups = genForListIpGroups();

    private static HttpRequestDef<ListIpGroupsRequest, ListIpGroupsResponse> genForListIpGroups() {
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
            f -> f.withMarshaller(ListIpGroupsRequest::getLimit, ListIpGroupsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpGroupsRequest::getMarker, ListIpGroupsRequest::setMarker));
        builder.<String>withRequestField("listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpGroupsRequest::getListenerId, ListIpGroupsRequest::setListenerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveIpGroupIpRequest, RemoveIpGroupIpResponse> removeIpGroupIp =
        genForRemoveIpGroupIp();

    private static HttpRequestDef<RemoveIpGroupIpRequest, RemoveIpGroupIpResponse> genForRemoveIpGroupIp() {
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
            f -> f.withMarshaller(RemoveIpGroupIpRequest::getIpGroupId, RemoveIpGroupIpRequest::setIpGroupId));
        builder.<RemoveIpGroupIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemoveIpGroupIpRequestBody.class),
            f -> f.withMarshaller(RemoveIpGroupIpRequest::getBody, RemoveIpGroupIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIpGroupRequest, ShowIpGroupResponse> showIpGroup = genForShowIpGroup();

    private static HttpRequestDef<ShowIpGroupRequest, ShowIpGroupResponse> genForShowIpGroup() {
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
            f -> f.withMarshaller(ShowIpGroupRequest::getIpGroupId, ShowIpGroupRequest::setIpGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIpGroupRequest, UpdateIpGroupResponse> updateIpGroup =
        genForUpdateIpGroup();

    private static HttpRequestDef<UpdateIpGroupRequest, UpdateIpGroupResponse> genForUpdateIpGroup() {
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
            f -> f.withMarshaller(UpdateIpGroupRequest::getIpGroupId, UpdateIpGroupRequest::setIpGroupId));
        builder.<UpdateIpGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIpGroupRequestBody.class),
            f -> f.withMarshaller(UpdateIpGroupRequest::getBody, UpdateIpGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateListenerRequest, CreateListenerResponse> createListener =
        genForCreateListener();

    private static HttpRequestDef<CreateListenerRequest, CreateListenerResponse> genForCreateListener() {
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
            f -> f.withMarshaller(CreateListenerRequest::getBody, CreateListenerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteListenerRequest, DeleteListenerResponse> deleteListener =
        genForDeleteListener();

    private static HttpRequestDef<DeleteListenerRequest, DeleteListenerResponse> genForDeleteListener() {
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
            f -> f.withMarshaller(DeleteListenerRequest::getListenerId, DeleteListenerRequest::setListenerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListListenersRequest, ListListenersResponse> listListeners =
        genForListListeners();

    private static HttpRequestDef<ListListenersRequest, ListListenersResponse> genForListListeners() {
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
            f -> f.withMarshaller(ListListenersRequest::getLimit, ListListenersRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getMarker, ListListenersRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getPageReverse, ListListenersRequest::setPageReverse));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getId, ListListenersRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getName, ListListenersRequest::setName));
        builder.<ListListenersRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListListenersRequest.StatusEnum.class),
            f -> f.withMarshaller(ListListenersRequest::getStatus, ListListenersRequest::setStatus));
        builder.<String>withRequestField("accelerator_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getAcceleratorId, ListListenersRequest::setAcceleratorId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowListenerRequest, ShowListenerResponse> showListener = genForShowListener();

    private static HttpRequestDef<ShowListenerRequest, ShowListenerResponse> genForShowListener() {
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
            f -> f.withMarshaller(ShowListenerRequest::getListenerId, ShowListenerRequest::setListenerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateListenerRequest, UpdateListenerResponse> updateListener =
        genForUpdateListener();

    private static HttpRequestDef<UpdateListenerRequest, UpdateListenerResponse> genForUpdateListener() {
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
            f -> f.withMarshaller(UpdateListenerRequest::getListenerId, UpdateListenerRequest::setListenerId));
        builder.<UpdateListenerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateListenerRequestBody.class),
            f -> f.withMarshaller(UpdateListenerRequest::getBody, UpdateListenerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLogtankRequest, CreateLogtankResponse> createLogtank =
        genForCreateLogtank();

    private static HttpRequestDef<CreateLogtankRequest, CreateLogtankResponse> genForCreateLogtank() {
        // basic
        HttpRequestDef.Builder<CreateLogtankRequest, CreateLogtankResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLogtankRequest.class, CreateLogtankResponse.class)
                .withName("CreateLogtank")
                .withUri("/v1/logtanks")
                .withContentType("application/json");

        // requests
        builder.<CreateLogtankRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLogtankRequestBody.class),
            f -> f.withMarshaller(CreateLogtankRequest::getBody, CreateLogtankRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLogtankRequest, DeleteLogtankResponse> deleteLogtank =
        genForDeleteLogtank();

    private static HttpRequestDef<DeleteLogtankRequest, DeleteLogtankResponse> genForDeleteLogtank() {
        // basic
        HttpRequestDef.Builder<DeleteLogtankRequest, DeleteLogtankResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLogtankRequest.class, DeleteLogtankResponse.class)
                .withName("DeleteLogtank")
                .withUri("/v1/logtanks/{logtank_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("logtank_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogtankRequest::getLogtankId, DeleteLogtankRequest::setLogtankId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogtanksRequest, ListLogtanksResponse> listLogtanks = genForListLogtanks();

    private static HttpRequestDef<ListLogtanksRequest, ListLogtanksResponse> genForListLogtanks() {
        // basic
        HttpRequestDef.Builder<ListLogtanksRequest, ListLogtanksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLogtanksRequest.class, ListLogtanksResponse.class)
                .withName("ListLogtanks")
                .withUri("/v1/logtanks")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLogtanksRequest::getLimit, ListLogtanksRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogtanksRequest::getMarker, ListLogtanksRequest::setMarker));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogtanksRequest::getId, ListLogtanksRequest::setId));
        builder.<ListLogtanksRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListLogtanksRequest.StatusEnum.class),
            f -> f.withMarshaller(ListLogtanksRequest::getStatus, ListLogtanksRequest::setStatus));
        builder.<List<String>>withRequestField("resource_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListLogtanksRequest::getResourceIds, ListLogtanksRequest::setResourceIds));
        builder.<ListLogtanksRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListLogtanksRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListLogtanksRequest::getResourceType, ListLogtanksRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLogtankRequest, ShowLogtankResponse> showLogtank = genForShowLogtank();

    private static HttpRequestDef<ShowLogtankRequest, ShowLogtankResponse> genForShowLogtank() {
        // basic
        HttpRequestDef.Builder<ShowLogtankRequest, ShowLogtankResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLogtankRequest.class, ShowLogtankResponse.class)
                .withName("ShowLogtank")
                .withUri("/v1/logtanks/{logtank_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("logtank_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogtankRequest::getLogtankId, ShowLogtankRequest::setLogtankId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLogtankRequest, UpdateLogtankResponse> updateLogtank =
        genForUpdateLogtank();

    private static HttpRequestDef<UpdateLogtankRequest, UpdateLogtankResponse> genForUpdateLogtank() {
        // basic
        HttpRequestDef.Builder<UpdateLogtankRequest, UpdateLogtankResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLogtankRequest.class, UpdateLogtankResponse.class)
                .withName("UpdateLogtank")
                .withUri("/v1/logtanks/{logtank_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("logtank_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLogtankRequest::getLogtankId, UpdateLogtankRequest::setLogtankId));
        builder.<UpdateLogtankRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLogtankRequestBody.class),
            f -> f.withMarshaller(UpdateLogtankRequest::getBody, UpdateLogtankRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllPopsRequest, ListAllPopsResponse> listAllPops = genForListAllPops();

    private static HttpRequestDef<ListAllPopsRequest, ListAllPopsResponse> genForListAllPops() {
        // basic
        HttpRequestDef.Builder<ListAllPopsRequest, ListAllPopsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllPopsRequest.class, ListAllPopsResponse.class)
                .withName("ListAllPops")
                .withUri("/v1/pops")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllPopsRequest::getLimit, ListAllPopsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllPopsRequest::getMarker, ListAllPopsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTenantQuotasRequest, ListTenantQuotasResponse> listTenantQuotas =
        genForListTenantQuotas();

    private static HttpRequestDef<ListTenantQuotasRequest, ListTenantQuotasResponse> genForListTenantQuotas() {
        // basic
        HttpRequestDef.Builder<ListTenantQuotasRequest, ListTenantQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTenantQuotasRequest.class, ListTenantQuotasResponse.class)
                .withName("ListTenantQuotas")
                .withUri("/v1/{domain_id}/ga/quotas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantQuotasRequest::getDomainId, ListTenantQuotasRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRegionsRequest, ListRegionsResponse> listRegions = genForListRegions();

    private static HttpRequestDef<ListRegionsRequest, ListRegionsResponse> genForListRegions() {
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

    public static final HttpRequestDef<CountResourcesByTagRequest, CountResourcesByTagResponse> countResourcesByTag =
        genForCountResourcesByTag();

    private static HttpRequestDef<CountResourcesByTagRequest, CountResourcesByTagResponse> genForCountResourcesByTag() {
        // basic
        HttpRequestDef.Builder<CountResourcesByTagRequest, CountResourcesByTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CountResourcesByTagRequest.class, CountResourcesByTagResponse.class)
                .withName("CountResourcesByTag")
                .withUri("/v1/{resource_type}/resource-instances/count")
                .withContentType("application/json");

        // requests
        builder.<ResourceType>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceType.class),
            f -> f.withMarshaller(CountResourcesByTagRequest::getResourceType,
                CountResourcesByTagRequest::setResourceType));
        builder.<ListResourcesByTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourcesByTagRequestBody.class),
            f -> f.withMarshaller(CountResourcesByTagRequest::getBody, CountResourcesByTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagsRequest, CreateTagsResponse> createTags = genForCreateTags();

    private static HttpRequestDef<CreateTagsRequest, CreateTagsResponse> genForCreateTags() {
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
            f -> f.withMarshaller(CreateTagsRequest::getResourceType, CreateTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagsRequest::getResourceId, CreateTagsRequest::setResourceId));
        builder.<CreateTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTagsRequestBody.class),
            f -> f.withMarshaller(CreateTagsRequest::getBody, CreateTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagsRequest, DeleteTagsResponse> deleteTags = genForDeleteTags();

    private static HttpRequestDef<DeleteTagsRequest, DeleteTagsResponse> genForDeleteTags() {
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
            f -> f.withMarshaller(DeleteTagsRequest::getResourceType, DeleteTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagsRequest::getResourceId, DeleteTagsRequest::setResourceId));
        builder.<DeleteTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTagsRequestBody.class),
            f -> f.withMarshaller(DeleteTagsRequest::getBody, DeleteTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourcesByTagRequest, ListResourcesByTagResponse> listResourcesByTag =
        genForListResourcesByTag();

    private static HttpRequestDef<ListResourcesByTagRequest, ListResourcesByTagResponse> genForListResourcesByTag() {
        // basic
        HttpRequestDef.Builder<ListResourcesByTagRequest, ListResourcesByTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListResourcesByTagRequest.class, ListResourcesByTagResponse.class)
                .withName("ListResourcesByTag")
                .withUri("/v1/{resource_type}/resource-instances/filter")
                .withContentType("application/json");

        // requests
        builder.<ResourceType>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceType.class),
            f -> f.withMarshaller(ListResourcesByTagRequest::getResourceType,
                ListResourcesByTagRequest::setResourceType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourcesByTagRequest::getLimit, ListResourcesByTagRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourcesByTagRequest::getOffset, ListResourcesByTagRequest::setOffset));
        builder.<ListResourcesByTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourcesByTagRequestBody.class),
            f -> f.withMarshaller(ListResourcesByTagRequest::getBody, ListResourcesByTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForListTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForListTags() {
        // basic
        HttpRequestDef.Builder<ListTagsRequest, ListTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsRequest.class, ListTagsResponse.class)
                .withName("ListTags")
                .withUri("/v1/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<ResourceType>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceType.class),
            f -> f.withMarshaller(ListTagsRequest::getResourceType, ListTagsRequest::setResourceType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagsRequest::getLimit, ListTagsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagsRequest::getOffset, ListTagsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceTagsRequest, ShowResourceTagsResponse> showResourceTags =
        genForShowResourceTags();

    private static HttpRequestDef<ShowResourceTagsRequest, ShowResourceTagsResponse> genForShowResourceTags() {
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
            f -> f.withMarshaller(ShowResourceTagsRequest::getResourceType, ShowResourceTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceTagsRequest::getResourceId, ShowResourceTagsRequest::setResourceId));

        // response

        return builder.build();
    }

}
