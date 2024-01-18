package com.huaweicloud.sdk.dc.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dc.v3.model.BatchCreateResourceTagsRequest;
import com.huaweicloud.sdk.dc.v3.model.BatchCreateResourceTagsResponse;
import com.huaweicloud.sdk.dc.v3.model.BatchOperateResourceTagsRequestBody;
import com.huaweicloud.sdk.dc.v3.model.CreateHostedDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateHostedDirectConnectRequestBody;
import com.huaweicloud.sdk.dc.v3.model.CreateHostedDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateResourceTagRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateResourceTagRequestBody;
import com.huaweicloud.sdk.dc.v3.model.CreateResourceTagResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateSwitchoverTestRequestBody;
import com.huaweicloud.sdk.dc.v3.model.CreateVifPeerRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateVifPeerRequestBody;
import com.huaweicloud.sdk.dc.v3.model.CreateVifPeerResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateVirtualGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateVirtualGatewayRequestBody;
import com.huaweicloud.sdk.dc.v3.model.CreateVirtualGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateVirtualInterfaceRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateVirtualInterfaceRequestBody;
import com.huaweicloud.sdk.dc.v3.model.CreateVirtualInterfaceResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteHostedDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteHostedDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteResourceTagRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteResourceTagResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteVifPeerRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteVifPeerResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteVirtualGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteVirtualGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteVirtualInterfaceRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteVirtualInterfaceResponse;
import com.huaweicloud.sdk.dc.v3.model.ListDirectConnectsRequest;
import com.huaweicloud.sdk.dc.v3.model.ListDirectConnectsResponse;
import com.huaweicloud.sdk.dc.v3.model.ListHostedDirectConnectsRequest;
import com.huaweicloud.sdk.dc.v3.model.ListHostedDirectConnectsResponse;
import com.huaweicloud.sdk.dc.v3.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.dc.v3.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.dc.v3.model.ListSwitchoverTestRecordsRequest;
import com.huaweicloud.sdk.dc.v3.model.ListSwitchoverTestRecordsResponse;
import com.huaweicloud.sdk.dc.v3.model.ListTagResourceInstancesRequest;
import com.huaweicloud.sdk.dc.v3.model.ListTagResourceInstancesRequestBody;
import com.huaweicloud.sdk.dc.v3.model.ListTagResourceInstancesResponse;
import com.huaweicloud.sdk.dc.v3.model.ListVirtualGatewaysRequest;
import com.huaweicloud.sdk.dc.v3.model.ListVirtualGatewaysResponse;
import com.huaweicloud.sdk.dc.v3.model.ListVirtualInterfacesRequest;
import com.huaweicloud.sdk.dc.v3.model.ListVirtualInterfacesResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowHostedDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowHostedDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowQuotasResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowResourceTagRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowResourceTagResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowVirtualGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowVirtualGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowVirtualInterfaceRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowVirtualInterfaceResponse;
import com.huaweicloud.sdk.dc.v3.model.SwitchoverTestRequest;
import com.huaweicloud.sdk.dc.v3.model.SwitchoverTestResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateDirectConnectRequestBody;
import com.huaweicloud.sdk.dc.v3.model.UpdateDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateHostedDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateHostedDirectConnectRequestBody;
import com.huaweicloud.sdk.dc.v3.model.UpdateHostedDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateVifPeerRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateVifPeerRequestBody;
import com.huaweicloud.sdk.dc.v3.model.UpdateVifPeerResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateVirtualGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateVirtualGatewayRequestBody;
import com.huaweicloud.sdk.dc.v3.model.UpdateVirtualGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateVirtualInterfaceRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateVirtualInterfaceRequestBody;
import com.huaweicloud.sdk.dc.v3.model.UpdateVirtualInterfaceResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class DcMeta {

    public static final HttpRequestDef<CreateHostedDirectConnectRequest, CreateHostedDirectConnectResponse> createHostedDirectConnect =
        genForCreateHostedDirectConnect();

    private static HttpRequestDef<CreateHostedDirectConnectRequest, CreateHostedDirectConnectResponse> genForCreateHostedDirectConnect() {
        // basic
        HttpRequestDef.Builder<CreateHostedDirectConnectRequest, CreateHostedDirectConnectResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateHostedDirectConnectRequest.class,
                    CreateHostedDirectConnectResponse.class)
                .withName("CreateHostedDirectConnect")
                .withUri("/v3/{project_id}/dcaas/hosted-connects")
                .withContentType("application/json");

        // requests
        builder.<CreateHostedDirectConnectRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateHostedDirectConnectRequestBody.class),
            f -> f.withMarshaller(CreateHostedDirectConnectRequest::getBody,
                CreateHostedDirectConnectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDirectConnectRequest, DeleteDirectConnectResponse> deleteDirectConnect =
        genForDeleteDirectConnect();

    private static HttpRequestDef<DeleteDirectConnectRequest, DeleteDirectConnectResponse> genForDeleteDirectConnect() {
        // basic
        HttpRequestDef.Builder<DeleteDirectConnectRequest, DeleteDirectConnectResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDirectConnectRequest.class, DeleteDirectConnectResponse.class)
            .withName("DeleteDirectConnect")
            .withUri("/v3/{project_id}/dcaas/direct-connects/{direct_connect_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("direct_connect_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDirectConnectRequest::getDirectConnectId,
                DeleteDirectConnectRequest::setDirectConnectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHostedDirectConnectRequest, DeleteHostedDirectConnectResponse> deleteHostedDirectConnect =
        genForDeleteHostedDirectConnect();

    private static HttpRequestDef<DeleteHostedDirectConnectRequest, DeleteHostedDirectConnectResponse> genForDeleteHostedDirectConnect() {
        // basic
        HttpRequestDef.Builder<DeleteHostedDirectConnectRequest, DeleteHostedDirectConnectResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteHostedDirectConnectRequest.class,
                    DeleteHostedDirectConnectResponse.class)
                .withName("DeleteHostedDirectConnect")
                .withUri("/v3/{project_id}/dcaas/hosted-connects/{hosted_connect_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("hosted_connect_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostedDirectConnectRequest::getHostedConnectId,
                DeleteHostedDirectConnectRequest::setHostedConnectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDirectConnectsRequest, ListDirectConnectsResponse> listDirectConnects =
        genForListDirectConnects();

    private static HttpRequestDef<ListDirectConnectsRequest, ListDirectConnectsResponse> genForListDirectConnects() {
        // basic
        HttpRequestDef.Builder<ListDirectConnectsRequest, ListDirectConnectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDirectConnectsRequest.class, ListDirectConnectsResponse.class)
                .withName("ListDirectConnects")
                .withUri("/v3/{project_id}/dcaas/direct-connects")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getLimit, ListDirectConnectsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getMarker, ListDirectConnectsRequest::setMarker));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getFields, ListDirectConnectsRequest::setFields));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getSortKey, ListDirectConnectsRequest::setSortKey));
        builder.<List<ListDirectConnectsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getSortDir, ListDirectConnectsRequest::setSortDir));
        builder.<List<String>>withRequestField("hosting_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getHostingId, ListDirectConnectsRequest::setHostingId));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getEnterpriseProjectId,
                ListDirectConnectsRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getId, ListDirectConnectsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getName, ListDirectConnectsRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostedDirectConnectsRequest, ListHostedDirectConnectsResponse> listHostedDirectConnects =
        genForListHostedDirectConnects();

    private static HttpRequestDef<ListHostedDirectConnectsRequest, ListHostedDirectConnectsResponse> genForListHostedDirectConnects() {
        // basic
        HttpRequestDef.Builder<ListHostedDirectConnectsRequest, ListHostedDirectConnectsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListHostedDirectConnectsRequest.class, ListHostedDirectConnectsResponse.class)
                .withName("ListHostedDirectConnects")
                .withUri("/v3/{project_id}/dcaas/hosted-connects")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getLimit,
                ListHostedDirectConnectsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getMarker,
                ListHostedDirectConnectsRequest::setMarker));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getFields,
                ListHostedDirectConnectsRequest::setFields));
        builder.<List<ListHostedDirectConnectsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getSortDir,
                ListHostedDirectConnectsRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getSortKey,
                ListHostedDirectConnectsRequest::setSortKey));
        builder.<List<String>>withRequestField("hosting_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getHostingId,
                ListHostedDirectConnectsRequest::setHostingId));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getId, ListHostedDirectConnectsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getName, ListHostedDirectConnectsRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDirectConnectRequest, ShowDirectConnectResponse> showDirectConnect =
        genForShowDirectConnect();

    private static HttpRequestDef<ShowDirectConnectRequest, ShowDirectConnectResponse> genForShowDirectConnect() {
        // basic
        HttpRequestDef.Builder<ShowDirectConnectRequest, ShowDirectConnectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDirectConnectRequest.class, ShowDirectConnectResponse.class)
                .withName("ShowDirectConnect")
                .withUri("/v3/{project_id}/dcaas/direct-connects/{direct_connect_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("direct_connect_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDirectConnectRequest::getDirectConnectId,
                ShowDirectConnectRequest::setDirectConnectId));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowDirectConnectRequest::getFields, ShowDirectConnectRequest::setFields));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHostedDirectConnectRequest, ShowHostedDirectConnectResponse> showHostedDirectConnect =
        genForShowHostedDirectConnect();

    private static HttpRequestDef<ShowHostedDirectConnectRequest, ShowHostedDirectConnectResponse> genForShowHostedDirectConnect() {
        // basic
        HttpRequestDef.Builder<ShowHostedDirectConnectRequest, ShowHostedDirectConnectResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowHostedDirectConnectRequest.class, ShowHostedDirectConnectResponse.class)
            .withName("ShowHostedDirectConnect")
            .withUri("/v3/{project_id}/dcaas/hosted-connects/{hosted_connect_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("hosted_connect_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostedDirectConnectRequest::getHostedConnectId,
                ShowHostedDirectConnectRequest::setHostedConnectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHostedDirectConnectRequest::getLimit, ShowHostedDirectConnectRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostedDirectConnectRequest::getMarker,
                ShowHostedDirectConnectRequest::setMarker));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowHostedDirectConnectRequest::getFields,
                ShowHostedDirectConnectRequest::setFields));
        builder.<List<ShowHostedDirectConnectRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowHostedDirectConnectRequest::getSortDir,
                ShowHostedDirectConnectRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostedDirectConnectRequest::getSortKey,
                ShowHostedDirectConnectRequest::setSortKey));
        builder.<List<String>>withRequestField("hosting_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowHostedDirectConnectRequest::getHostingId,
                ShowHostedDirectConnectRequest::setHostingId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDirectConnectRequest, UpdateDirectConnectResponse> updateDirectConnect =
        genForUpdateDirectConnect();

    private static HttpRequestDef<UpdateDirectConnectRequest, UpdateDirectConnectResponse> genForUpdateDirectConnect() {
        // basic
        HttpRequestDef.Builder<UpdateDirectConnectRequest, UpdateDirectConnectResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDirectConnectRequest.class, UpdateDirectConnectResponse.class)
                .withName("UpdateDirectConnect")
                .withUri("/v3/{project_id}/dcaas/direct-connects/{direct_connect_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("direct_connect_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDirectConnectRequest::getDirectConnectId,
                UpdateDirectConnectRequest::setDirectConnectId));
        builder.<UpdateDirectConnectRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDirectConnectRequestBody.class),
            f -> f.withMarshaller(UpdateDirectConnectRequest::getBody, UpdateDirectConnectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHostedDirectConnectRequest, UpdateHostedDirectConnectResponse> updateHostedDirectConnect =
        genForUpdateHostedDirectConnect();

    private static HttpRequestDef<UpdateHostedDirectConnectRequest, UpdateHostedDirectConnectResponse> genForUpdateHostedDirectConnect() {
        // basic
        HttpRequestDef.Builder<UpdateHostedDirectConnectRequest, UpdateHostedDirectConnectResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateHostedDirectConnectRequest.class,
                    UpdateHostedDirectConnectResponse.class)
                .withName("UpdateHostedDirectConnect")
                .withUri("/v3/{project_id}/dcaas/hosted-connects/{hosted_connect_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("hosted_connect_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostedDirectConnectRequest::getHostedConnectId,
                UpdateHostedDirectConnectRequest::setHostedConnectId));
        builder.<UpdateHostedDirectConnectRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateHostedDirectConnectRequestBody.class),
            f -> f.withMarshaller(UpdateHostedDirectConnectRequest::getBody,
                UpdateHostedDirectConnectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForShowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForShowQuotas() {
        // basic
        HttpRequestDef.Builder<ShowQuotasRequest, ShowQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotasRequest.class, ShowQuotasResponse.class)
                .withName("ShowQuotas")
                .withUri("/v3/{project_id}/dcaas/quotas")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowQuotasRequest::getType, ShowQuotasRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> batchCreateResourceTags =
        genForBatchCreateResourceTags();

    private static HttpRequestDef<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> genForBatchCreateResourceTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateResourceTagsRequest.class, BatchCreateResourceTagsResponse.class)
            .withName("BatchCreateResourceTags")
            .withUri("/v3/{project_id}/{resource_type}/{resource_id}/tags/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getResourceId,
                BatchCreateResourceTagsRequest::setResourceId));
        builder.<BatchCreateResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getResourceType,
                BatchCreateResourceTagsRequest::setResourceType));
        builder.<BatchOperateResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateResourceTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getBody, BatchCreateResourceTagsRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchCreateResourceTagsResponse::getBody, BatchCreateResourceTagsResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTag =
        genForCreateResourceTag();

    private static HttpRequestDef<CreateResourceTagRequest, CreateResourceTagResponse> genForCreateResourceTag() {
        // basic
        HttpRequestDef.Builder<CreateResourceTagRequest, CreateResourceTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResourceTagRequest.class, CreateResourceTagResponse.class)
                .withName("CreateResourceTag")
                .withUri("/v3/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResourceTagRequest::getResourceId, CreateResourceTagRequest::setResourceId));
        builder.<CreateResourceTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(CreateResourceTagRequest::getResourceType,
                CreateResourceTagRequest::setResourceType));
        builder.<CreateResourceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceTagRequestBody.class),
            f -> f.withMarshaller(CreateResourceTagRequest::getBody, CreateResourceTagRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateResourceTagResponse::getBody, CreateResourceTagResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTag =
        genForDeleteResourceTag();

    private static HttpRequestDef<DeleteResourceTagRequest, DeleteResourceTagResponse> genForDeleteResourceTag() {
        // basic
        HttpRequestDef.Builder<DeleteResourceTagRequest, DeleteResourceTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteResourceTagRequest.class, DeleteResourceTagResponse.class)
                .withName("DeleteResourceTag")
                .withUri("/v3/{project_id}/{resource_type}/{resource_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getKey, DeleteResourceTagRequest::setKey));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceId, DeleteResourceTagRequest::setResourceId));
        builder.<DeleteResourceTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteResourceTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceType,
                DeleteResourceTagRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTags =
        genForListProjectTags();

    private static HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> genForListProjectTags() {
        // basic
        HttpRequestDef.Builder<ListProjectTagsRequest, ListProjectTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectTagsRequest.class, ListProjectTagsResponse.class)
                .withName("ListProjectTags")
                .withUri("/v3/{project_id}/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListProjectTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListProjectTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getResourceType, ListProjectTagsRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagResourceInstancesRequest, ListTagResourceInstancesResponse> listTagResourceInstances =
        genForListTagResourceInstances();

    private static HttpRequestDef<ListTagResourceInstancesRequest, ListTagResourceInstancesResponse> genForListTagResourceInstances() {
        // basic
        HttpRequestDef.Builder<ListTagResourceInstancesRequest, ListTagResourceInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ListTagResourceInstancesRequest.class, ListTagResourceInstancesResponse.class)
                .withName("ListTagResourceInstances")
                .withUri("/v3/{project_id}/{resource_type}/resource-instances/action")
                .withContentType("application/json");

        // requests
        builder.<ListTagResourceInstancesRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTagResourceInstancesRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListTagResourceInstancesRequest::getResourceType,
                ListTagResourceInstancesRequest::setResourceType));
        builder.<ListTagResourceInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTagResourceInstancesRequestBody.class),
            f -> f.withMarshaller(ListTagResourceInstancesRequest::getBody, ListTagResourceInstancesRequest::setBody));

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
                .withUri("/v3/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<ShowResourceTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowResourceTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ShowResourceTagRequest::getResourceType, ShowResourceTagRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceTagRequest::getResourceId, ShowResourceTagRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVirtualGatewayRequest, CreateVirtualGatewayResponse> createVirtualGateway =
        genForCreateVirtualGateway();

    private static HttpRequestDef<CreateVirtualGatewayRequest, CreateVirtualGatewayResponse> genForCreateVirtualGateway() {
        // basic
        HttpRequestDef.Builder<CreateVirtualGatewayRequest, CreateVirtualGatewayResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateVirtualGatewayRequest.class, CreateVirtualGatewayResponse.class)
            .withName("CreateVirtualGateway")
            .withUri("/v3/{project_id}/dcaas/virtual-gateways")
            .withContentType("application/json");

        // requests
        builder.<CreateVirtualGatewayRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateVirtualGatewayRequestBody.class),
            f -> f.withMarshaller(CreateVirtualGatewayRequest::getBody, CreateVirtualGatewayRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVirtualGatewayRequest, DeleteVirtualGatewayResponse> deleteVirtualGateway =
        genForDeleteVirtualGateway();

    private static HttpRequestDef<DeleteVirtualGatewayRequest, DeleteVirtualGatewayResponse> genForDeleteVirtualGateway() {
        // basic
        HttpRequestDef.Builder<DeleteVirtualGatewayRequest, DeleteVirtualGatewayResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteVirtualGatewayRequest.class, DeleteVirtualGatewayResponse.class)
            .withName("DeleteVirtualGateway")
            .withUri("/v3/{project_id}/dcaas/virtual-gateways/{virtual_gateway_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("virtual_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVirtualGatewayRequest::getVirtualGatewayId,
                DeleteVirtualGatewayRequest::setVirtualGatewayId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse> listVirtualGateways =
        genForListVirtualGateways();

    private static HttpRequestDef<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse> genForListVirtualGateways() {
        // basic
        HttpRequestDef.Builder<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVirtualGatewaysRequest.class, ListVirtualGatewaysResponse.class)
                .withName("ListVirtualGateways")
                .withUri("/v3/{project_id}/dcaas/virtual-gateways")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getLimit, ListVirtualGatewaysRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getMarker, ListVirtualGatewaysRequest::setMarker));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getFields, ListVirtualGatewaysRequest::setFields));
        builder.<List<ListVirtualGatewaysRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getSortDir, ListVirtualGatewaysRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getSortKey, ListVirtualGatewaysRequest::setSortKey));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getId, ListVirtualGatewaysRequest::setId));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getEnterpriseProjectId,
                ListVirtualGatewaysRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getVpcId, ListVirtualGatewaysRequest::setVpcId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVirtualGatewayRequest, ShowVirtualGatewayResponse> showVirtualGateway =
        genForShowVirtualGateway();

    private static HttpRequestDef<ShowVirtualGatewayRequest, ShowVirtualGatewayResponse> genForShowVirtualGateway() {
        // basic
        HttpRequestDef.Builder<ShowVirtualGatewayRequest, ShowVirtualGatewayResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVirtualGatewayRequest.class, ShowVirtualGatewayResponse.class)
                .withName("ShowVirtualGateway")
                .withUri("/v3/{project_id}/dcaas/virtual-gateways/{virtual_gateway_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("virtual_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVirtualGatewayRequest::getVirtualGatewayId,
                ShowVirtualGatewayRequest::setVirtualGatewayId));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowVirtualGatewayRequest::getFields, ShowVirtualGatewayRequest::setFields));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVirtualGatewayRequest, UpdateVirtualGatewayResponse> updateVirtualGateway =
        genForUpdateVirtualGateway();

    private static HttpRequestDef<UpdateVirtualGatewayRequest, UpdateVirtualGatewayResponse> genForUpdateVirtualGateway() {
        // basic
        HttpRequestDef.Builder<UpdateVirtualGatewayRequest, UpdateVirtualGatewayResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateVirtualGatewayRequest.class, UpdateVirtualGatewayResponse.class)
            .withName("UpdateVirtualGateway")
            .withUri("/v3/{project_id}/dcaas/virtual-gateways/{virtual_gateway_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("virtual_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVirtualGatewayRequest::getVirtualGatewayId,
                UpdateVirtualGatewayRequest::setVirtualGatewayId));
        builder.<UpdateVirtualGatewayRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateVirtualGatewayRequestBody.class),
            f -> f.withMarshaller(UpdateVirtualGatewayRequest::getBody, UpdateVirtualGatewayRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVifPeerRequest, CreateVifPeerResponse> createVifPeer =
        genForCreateVifPeer();

    private static HttpRequestDef<CreateVifPeerRequest, CreateVifPeerResponse> genForCreateVifPeer() {
        // basic
        HttpRequestDef.Builder<CreateVifPeerRequest, CreateVifPeerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVifPeerRequest.class, CreateVifPeerResponse.class)
                .withName("CreateVifPeer")
                .withUri("/v3/{project_id}/dcaas/vif-peers")
                .withContentType("application/json");

        // requests
        builder.<CreateVifPeerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateVifPeerRequestBody.class),
            f -> f.withMarshaller(CreateVifPeerRequest::getBody, CreateVifPeerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVirtualInterfaceRequest, CreateVirtualInterfaceResponse> createVirtualInterface =
        genForCreateVirtualInterface();

    private static HttpRequestDef<CreateVirtualInterfaceRequest, CreateVirtualInterfaceResponse> genForCreateVirtualInterface() {
        // basic
        HttpRequestDef.Builder<CreateVirtualInterfaceRequest, CreateVirtualInterfaceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateVirtualInterfaceRequest.class, CreateVirtualInterfaceResponse.class)
            .withName("CreateVirtualInterface")
            .withUri("/v3/{project_id}/dcaas/virtual-interfaces")
            .withContentType("application/json");

        // requests
        builder.<CreateVirtualInterfaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVirtualInterfaceRequestBody.class),
            f -> f.withMarshaller(CreateVirtualInterfaceRequest::getBody, CreateVirtualInterfaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVifPeerRequest, DeleteVifPeerResponse> deleteVifPeer =
        genForDeleteVifPeer();

    private static HttpRequestDef<DeleteVifPeerRequest, DeleteVifPeerResponse> genForDeleteVifPeer() {
        // basic
        HttpRequestDef.Builder<DeleteVifPeerRequest, DeleteVifPeerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVifPeerRequest.class, DeleteVifPeerResponse.class)
                .withName("DeleteVifPeer")
                .withUri("/v3/{project_id}/dcaas/vif-peers/{vif_peer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vif_peer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVifPeerRequest::getVifPeerId, DeleteVifPeerRequest::setVifPeerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResponse> deleteVirtualInterface =
        genForDeleteVirtualInterface();

    private static HttpRequestDef<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResponse> genForDeleteVirtualInterface() {
        // basic
        HttpRequestDef.Builder<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteVirtualInterfaceRequest.class, DeleteVirtualInterfaceResponse.class)
            .withName("DeleteVirtualInterface")
            .withUri("/v3/{project_id}/dcaas/virtual-interfaces/{virtual_interface_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("virtual_interface_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVirtualInterfaceRequest::getVirtualInterfaceId,
                DeleteVirtualInterfaceRequest::setVirtualInterfaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSwitchoverTestRecordsRequest, ListSwitchoverTestRecordsResponse> listSwitchoverTestRecords =
        genForListSwitchoverTestRecords();

    private static HttpRequestDef<ListSwitchoverTestRecordsRequest, ListSwitchoverTestRecordsResponse> genForListSwitchoverTestRecords() {
        // basic
        HttpRequestDef.Builder<ListSwitchoverTestRecordsRequest, ListSwitchoverTestRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSwitchoverTestRecordsRequest.class,
                    ListSwitchoverTestRecordsResponse.class)
                .withName("ListSwitchoverTestRecords")
                .withUri("/v3/{project_id}/dcaas/switchover-test")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSwitchoverTestRecordsRequest::getLimit,
                ListSwitchoverTestRecordsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwitchoverTestRecordsRequest::getMarker,
                ListSwitchoverTestRecordsRequest::setMarker));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSwitchoverTestRecordsRequest::getFields,
                ListSwitchoverTestRecordsRequest::setFields));
        builder.<List<ListSwitchoverTestRecordsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSwitchoverTestRecordsRequest::getSortDir,
                ListSwitchoverTestRecordsRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwitchoverTestRecordsRequest::getSortKey,
                ListSwitchoverTestRecordsRequest::setSortKey));
        builder.<List<String>>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSwitchoverTestRecordsRequest::getResourceId,
                ListSwitchoverTestRecordsRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVirtualInterfacesRequest, ListVirtualInterfacesResponse> listVirtualInterfaces =
        genForListVirtualInterfaces();

    private static HttpRequestDef<ListVirtualInterfacesRequest, ListVirtualInterfacesResponse> genForListVirtualInterfaces() {
        // basic
        HttpRequestDef.Builder<ListVirtualInterfacesRequest, ListVirtualInterfacesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListVirtualInterfacesRequest.class, ListVirtualInterfacesResponse.class)
            .withName("ListVirtualInterfaces")
            .withUri("/v3/{project_id}/dcaas/virtual-interfaces")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getLimit, ListVirtualInterfacesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getMarker, ListVirtualInterfacesRequest::setMarker));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getFields, ListVirtualInterfacesRequest::setFields));
        builder.<List<ListVirtualInterfacesRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getSortDir, ListVirtualInterfacesRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getSortKey, ListVirtualInterfacesRequest::setSortKey));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getEnterpriseProjectId,
                ListVirtualInterfacesRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getId, ListVirtualInterfacesRequest::setId));
        builder.<List<String>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getStatus, ListVirtualInterfacesRequest::setStatus));
        builder.<List<String>>withRequestField("direct_connect_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getDirectConnectId,
                ListVirtualInterfacesRequest::setDirectConnectId));
        builder.<List<String>>withRequestField("vgw_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getVgwId, ListVirtualInterfacesRequest::setVgwId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse> showVirtualInterface =
        genForShowVirtualInterface();

    private static HttpRequestDef<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse> genForShowVirtualInterface() {
        // basic
        HttpRequestDef.Builder<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowVirtualInterfaceRequest.class, ShowVirtualInterfaceResponse.class)
            .withName("ShowVirtualInterface")
            .withUri("/v3/{project_id}/dcaas/virtual-interfaces/{virtual_interface_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("virtual_interface_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVirtualInterfaceRequest::getVirtualInterfaceId,
                ShowVirtualInterfaceRequest::setVirtualInterfaceId));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowVirtualInterfaceRequest::getFields, ShowVirtualInterfaceRequest::setFields));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchoverTestRequest, SwitchoverTestResponse> switchoverTest =
        genForSwitchoverTest();

    private static HttpRequestDef<SwitchoverTestRequest, SwitchoverTestResponse> genForSwitchoverTest() {
        // basic
        HttpRequestDef.Builder<SwitchoverTestRequest, SwitchoverTestResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchoverTestRequest.class, SwitchoverTestResponse.class)
                .withName("SwitchoverTest")
                .withUri("/v3/{project_id}/dcaas/switchover-test")
                .withContentType("application/json");

        // requests
        builder.<CreateSwitchoverTestRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSwitchoverTestRequestBody.class),
            f -> f.withMarshaller(SwitchoverTestRequest::getBody, SwitchoverTestRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVifPeerRequest, UpdateVifPeerResponse> updateVifPeer =
        genForUpdateVifPeer();

    private static HttpRequestDef<UpdateVifPeerRequest, UpdateVifPeerResponse> genForUpdateVifPeer() {
        // basic
        HttpRequestDef.Builder<UpdateVifPeerRequest, UpdateVifPeerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVifPeerRequest.class, UpdateVifPeerResponse.class)
                .withName("UpdateVifPeer")
                .withUri("/v3/{project_id}/dcaas/vif-peers/{vif_peer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vif_peer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVifPeerRequest::getVifPeerId, UpdateVifPeerRequest::setVifPeerId));
        builder.<UpdateVifPeerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateVifPeerRequestBody.class),
            f -> f.withMarshaller(UpdateVifPeerRequest::getBody, UpdateVifPeerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVirtualInterfaceRequest, UpdateVirtualInterfaceResponse> updateVirtualInterface =
        genForUpdateVirtualInterface();

    private static HttpRequestDef<UpdateVirtualInterfaceRequest, UpdateVirtualInterfaceResponse> genForUpdateVirtualInterface() {
        // basic
        HttpRequestDef.Builder<UpdateVirtualInterfaceRequest, UpdateVirtualInterfaceResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateVirtualInterfaceRequest.class, UpdateVirtualInterfaceResponse.class)
            .withName("UpdateVirtualInterface")
            .withUri("/v3/{project_id}/dcaas/virtual-interfaces/{virtual_interface_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("virtual_interface_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVirtualInterfaceRequest::getVirtualInterfaceId,
                UpdateVirtualInterfaceRequest::setVirtualInterfaceId));
        builder.<UpdateVirtualInterfaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVirtualInterfaceRequestBody.class),
            f -> f.withMarshaller(UpdateVirtualInterfaceRequest::getBody, UpdateVirtualInterfaceRequest::setBody));

        // response

        return builder.build();
    }

}
