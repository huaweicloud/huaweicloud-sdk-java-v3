package com.huaweicloud.sdk.dc.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dc.v3.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class DcMeta {

    public static final HttpRequestDef<CreateHostedDirectConnectRequest, CreateHostedDirectConnectResponse> createHostedDirectConnect =
        genForcreateHostedDirectConnect();

    private static HttpRequestDef<CreateHostedDirectConnectRequest, CreateHostedDirectConnectResponse> genForcreateHostedDirectConnect() {
        // basic
        HttpRequestDef.Builder<CreateHostedDirectConnectRequest, CreateHostedDirectConnectResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateHostedDirectConnectRequest.class,
                    CreateHostedDirectConnectResponse.class)
                .withName("CreateHostedDirectConnect")
                .withUri("/v3/{project_id}/dcaas/hosted-connects")
                .withContentType("application/json; charset=utf-8");

        // requests
        builder.<CreateHostedDirectConnectRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateHostedDirectConnectRequestBody.class),
            f -> f.withMarshaller(CreateHostedDirectConnectRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDirectConnectRequest, DeleteDirectConnectResponse> deleteDirectConnect =
        genFordeleteDirectConnect();

    private static HttpRequestDef<DeleteDirectConnectRequest, DeleteDirectConnectResponse> genFordeleteDirectConnect() {
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
            f -> f.withMarshaller(DeleteDirectConnectRequest::getDirectConnectId, (req, v) -> {
                req.setDirectConnectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHostedDirectConnectRequest, DeleteHostedDirectConnectResponse> deleteHostedDirectConnect =
        genFordeleteHostedDirectConnect();

    private static HttpRequestDef<DeleteHostedDirectConnectRequest, DeleteHostedDirectConnectResponse> genFordeleteHostedDirectConnect() {
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
            f -> f.withMarshaller(DeleteHostedDirectConnectRequest::getHostedConnectId, (req, v) -> {
                req.setHostedConnectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDirectConnectsRequest, ListDirectConnectsResponse> listDirectConnects =
        genForlistDirectConnects();

    private static HttpRequestDef<ListDirectConnectsRequest, ListDirectConnectsResponse> genForlistDirectConnects() {
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
            f -> f.withMarshaller(ListDirectConnectsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getFields, (req, v) -> {
                req.setFields(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<List<ListDirectConnectsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<List<String>>withRequestField("hosting_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getHostingId, (req, v) -> {
                req.setHostingId(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDirectConnectsRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostedDirectConnectsRequest, ListHostedDirectConnectsResponse> listHostedDirectConnects =
        genForlistHostedDirectConnects();

    private static HttpRequestDef<ListHostedDirectConnectsRequest, ListHostedDirectConnectsResponse> genForlistHostedDirectConnects() {
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
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getFields, (req, v) -> {
                req.setFields(v);
            }));
        builder.<List<ListHostedDirectConnectsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<List<String>>withRequestField("hosting_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getHostingId, (req, v) -> {
                req.setHostingId(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostedDirectConnectsRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDirectConnectRequest, ShowDirectConnectResponse> showDirectConnect =
        genForshowDirectConnect();

    private static HttpRequestDef<ShowDirectConnectRequest, ShowDirectConnectResponse> genForshowDirectConnect() {
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
            f -> f.withMarshaller(ShowDirectConnectRequest::getDirectConnectId, (req, v) -> {
                req.setDirectConnectId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDirectConnectRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDirectConnectRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowDirectConnectRequest::getFields, (req, v) -> {
                req.setFields(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHostedDirectConnectRequest, ShowHostedDirectConnectResponse> showHostedDirectConnect =
        genForshowHostedDirectConnect();

    private static HttpRequestDef<ShowHostedDirectConnectRequest, ShowHostedDirectConnectResponse> genForshowHostedDirectConnect() {
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
            f -> f.withMarshaller(ShowHostedDirectConnectRequest::getHostedConnectId, (req, v) -> {
                req.setHostedConnectId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHostedDirectConnectRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostedDirectConnectRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowHostedDirectConnectRequest::getFields, (req, v) -> {
                req.setFields(v);
            }));
        builder.<List<ShowHostedDirectConnectRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowHostedDirectConnectRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostedDirectConnectRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<List<String>>withRequestField("hosting_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowHostedDirectConnectRequest::getHostingId, (req, v) -> {
                req.setHostingId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDirectConnectRequest, UpdateDirectConnectResponse> updateDirectConnect =
        genForupdateDirectConnect();

    private static HttpRequestDef<UpdateDirectConnectRequest, UpdateDirectConnectResponse> genForupdateDirectConnect() {
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
            f -> f.withMarshaller(UpdateDirectConnectRequest::getDirectConnectId, (req, v) -> {
                req.setDirectConnectId(v);
            }));
        builder.<UpdateDirectConnectRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDirectConnectRequestBody.class),
            f -> f.withMarshaller(UpdateDirectConnectRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHostedDirectConnectRequest, UpdateHostedDirectConnectResponse> updateHostedDirectConnect =
        genForupdateHostedDirectConnect();

    private static HttpRequestDef<UpdateHostedDirectConnectRequest, UpdateHostedDirectConnectResponse> genForupdateHostedDirectConnect() {
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
            f -> f.withMarshaller(UpdateHostedDirectConnectRequest::getHostedConnectId, (req, v) -> {
                req.setHostedConnectId(v);
            }));
        builder.<UpdateHostedDirectConnectRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateHostedDirectConnectRequestBody.class),
            f -> f.withMarshaller(UpdateHostedDirectConnectRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> batchCreateResourceTags =
        genForbatchCreateResourceTags();

    private static HttpRequestDef<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> genForbatchCreateResourceTags() {
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
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<BatchCreateResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<BatchOperateResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateResourceTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchCreateResourceTagsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTag =
        genForcreateResourceTag();

    private static HttpRequestDef<CreateResourceTagRequest, CreateResourceTagResponse> genForcreateResourceTag() {
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
            f -> f.withMarshaller(CreateResourceTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<CreateResourceTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(CreateResourceTagRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<CreateResourceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceTagRequestBody.class),
            f -> f.withMarshaller(CreateResourceTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateResourceTagResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTag =
        genFordeleteResourceTag();

    private static HttpRequestDef<DeleteResourceTagRequest, DeleteResourceTagResponse> genFordeleteResourceTag() {
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
            f -> f.withMarshaller(DeleteResourceTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<DeleteResourceTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteResourceTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTags =
        genForlistProjectTags();

    private static HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> genForlistProjectTags() {
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
            f -> f.withMarshaller(ListProjectTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagResourceInstancesRequest, ListTagResourceInstancesResponse> listTagResourceInstances =
        genForlistTagResourceInstances();

    private static HttpRequestDef<ListTagResourceInstancesRequest, ListTagResourceInstancesResponse> genForlistTagResourceInstances() {
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
            f -> f.withMarshaller(ListTagResourceInstancesRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<ListTagResourceInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTagResourceInstancesRequestBody.class),
            f -> f.withMarshaller(ListTagResourceInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTag =
        genForshowResourceTag();

    private static HttpRequestDef<ShowResourceTagRequest, ShowResourceTagResponse> genForshowResourceTag() {
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
            f -> f.withMarshaller(ShowResourceTagRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVirtualGatewayRequest, CreateVirtualGatewayResponse> createVirtualGateway =
        genForcreateVirtualGateway();

    private static HttpRequestDef<CreateVirtualGatewayRequest, CreateVirtualGatewayResponse> genForcreateVirtualGateway() {
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
            f -> f.withMarshaller(CreateVirtualGatewayRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVirtualGatewayRequest, DeleteVirtualGatewayResponse> deleteVirtualGateway =
        genFordeleteVirtualGateway();

    private static HttpRequestDef<DeleteVirtualGatewayRequest, DeleteVirtualGatewayResponse> genFordeleteVirtualGateway() {
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
            f -> f.withMarshaller(DeleteVirtualGatewayRequest::getVirtualGatewayId, (req, v) -> {
                req.setVirtualGatewayId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse> listVirtualGateways =
        genForlistVirtualGateways();

    private static HttpRequestDef<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse> genForlistVirtualGateways() {
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
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getFields, (req, v) -> {
                req.setFields(v);
            }));
        builder.<List<ListVirtualGatewaysRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualGatewaysRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVirtualGatewayRequest, ShowVirtualGatewayResponse> showVirtualGateway =
        genForshowVirtualGateway();

    private static HttpRequestDef<ShowVirtualGatewayRequest, ShowVirtualGatewayResponse> genForshowVirtualGateway() {
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
            f -> f.withMarshaller(ShowVirtualGatewayRequest::getVirtualGatewayId, (req, v) -> {
                req.setVirtualGatewayId(v);
            }));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowVirtualGatewayRequest::getFields, (req, v) -> {
                req.setFields(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVirtualGatewayRequest, UpdateVirtualGatewayResponse> updateVirtualGateway =
        genForupdateVirtualGateway();

    private static HttpRequestDef<UpdateVirtualGatewayRequest, UpdateVirtualGatewayResponse> genForupdateVirtualGateway() {
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
            f -> f.withMarshaller(UpdateVirtualGatewayRequest::getVirtualGatewayId, (req, v) -> {
                req.setVirtualGatewayId(v);
            }));
        builder.<UpdateVirtualGatewayRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateVirtualGatewayRequestBody.class),
            f -> f.withMarshaller(UpdateVirtualGatewayRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVirtualInterfaceRequest, CreateVirtualInterfaceResponse> createVirtualInterface =
        genForcreateVirtualInterface();

    private static HttpRequestDef<CreateVirtualInterfaceRequest, CreateVirtualInterfaceResponse> genForcreateVirtualInterface() {
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
            f -> f.withMarshaller(CreateVirtualInterfaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResponse> deleteVirtualInterface =
        genFordeleteVirtualInterface();

    private static HttpRequestDef<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResponse> genFordeleteVirtualInterface() {
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
            f -> f.withMarshaller(DeleteVirtualInterfaceRequest::getVirtualInterfaceId, (req, v) -> {
                req.setVirtualInterfaceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVirtualInterfacesRequest, ListVirtualInterfacesResponse> listVirtualInterfaces =
        genForlistVirtualInterfaces();

    private static HttpRequestDef<ListVirtualInterfacesRequest, ListVirtualInterfacesResponse> genForlistVirtualInterfaces() {
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
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getFields, (req, v) -> {
                req.setFields(v);
            }));
        builder.<List<ListVirtualInterfacesRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<List<String>>withRequestField("direct_connect_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getDirectConnectId, (req, v) -> {
                req.setDirectConnectId(v);
            }));
        builder.<List<String>>withRequestField("vgw_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVirtualInterfacesRequest::getVgwId, (req, v) -> {
                req.setVgwId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse> showVirtualInterface =
        genForshowVirtualInterface();

    private static HttpRequestDef<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse> genForshowVirtualInterface() {
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
            f -> f.withMarshaller(ShowVirtualInterfaceRequest::getVirtualInterfaceId, (req, v) -> {
                req.setVirtualInterfaceId(v);
            }));
        builder.<List<String>>withRequestField("fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowVirtualInterfaceRequest::getFields, (req, v) -> {
                req.setFields(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVirtualInterfaceRequest, UpdateVirtualInterfaceResponse> updateVirtualInterface =
        genForupdateVirtualInterface();

    private static HttpRequestDef<UpdateVirtualInterfaceRequest, UpdateVirtualInterfaceResponse> genForupdateVirtualInterface() {
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
            f -> f.withMarshaller(UpdateVirtualInterfaceRequest::getVirtualInterfaceId, (req, v) -> {
                req.setVirtualInterfaceId(v);
            }));
        builder.<UpdateVirtualInterfaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVirtualInterfaceRequestBody.class),
            f -> f.withMarshaller(UpdateVirtualInterfaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
