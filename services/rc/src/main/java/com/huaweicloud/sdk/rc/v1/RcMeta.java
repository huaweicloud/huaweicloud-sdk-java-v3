package com.huaweicloud.sdk.rc.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.rc.v1.model.AddResourcesRequestBody;
import com.huaweicloud.sdk.rc.v1.model.AddResourcesToGroupRequest;
import com.huaweicloud.sdk.rc.v1.model.AddResourcesToGroupResponse;
import com.huaweicloud.sdk.rc.v1.model.CollectAllResourcesSummaryRequest;
import com.huaweicloud.sdk.rc.v1.model.CollectAllResourcesSummaryResponse;
import com.huaweicloud.sdk.rc.v1.model.CountAllResourcesRequest;
import com.huaweicloud.sdk.rc.v1.model.CountAllResourcesResponse;
import com.huaweicloud.sdk.rc.v1.model.CreateResourceGroupRequest;
import com.huaweicloud.sdk.rc.v1.model.CreateResourceGroupResponse;
import com.huaweicloud.sdk.rc.v1.model.DeleteResourceGroupRequest;
import com.huaweicloud.sdk.rc.v1.model.DeleteResourceGroupResponse;
import com.huaweicloud.sdk.rc.v1.model.GenericResourceGroupRequestBody;
import com.huaweicloud.sdk.rc.v1.model.ListAllProvidersRequest;
import com.huaweicloud.sdk.rc.v1.model.ListAllProvidersResponse;
import com.huaweicloud.sdk.rc.v1.model.ListAllResourcesRequest;
import com.huaweicloud.sdk.rc.v1.model.ListAllResourcesResponse;
import com.huaweicloud.sdk.rc.v1.model.ListAllTagsRequest;
import com.huaweicloud.sdk.rc.v1.model.ListAllTagsResponse;
import com.huaweicloud.sdk.rc.v1.model.ListResourceGroupsRequest;
import com.huaweicloud.sdk.rc.v1.model.ListResourceGroupsResponse;
import com.huaweicloud.sdk.rc.v1.model.ListResourcesRequest;
import com.huaweicloud.sdk.rc.v1.model.ListResourcesResponse;
import com.huaweicloud.sdk.rc.v1.model.RemoveResourceFromGroupRequest;
import com.huaweicloud.sdk.rc.v1.model.RemoveResourceFromGroupResponse;
import com.huaweicloud.sdk.rc.v1.model.ResourceSummaryResponseItem;
import com.huaweicloud.sdk.rc.v1.model.ShowResourceByIdRequest;
import com.huaweicloud.sdk.rc.v1.model.ShowResourceByIdResponse;
import com.huaweicloud.sdk.rc.v1.model.ShowResourceDetailRequest;
import com.huaweicloud.sdk.rc.v1.model.ShowResourceDetailResponse;
import com.huaweicloud.sdk.rc.v1.model.ShowResourceGroupRequest;
import com.huaweicloud.sdk.rc.v1.model.ShowResourceGroupResponse;
import com.huaweicloud.sdk.rc.v1.model.ShowResourceRelationsRequest;
import com.huaweicloud.sdk.rc.v1.model.ShowResourceRelationsResponse;
import com.huaweicloud.sdk.rc.v1.model.UpdateResourceGroupRequest;
import com.huaweicloud.sdk.rc.v1.model.UpdateResourceGroupRequestBody;
import com.huaweicloud.sdk.rc.v1.model.UpdateResourceGroupResponse;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class RcMeta {

    public static final HttpRequestDef<AddResourcesToGroupRequest, AddResourcesToGroupResponse> addResourcesToGroup =
        genForAddResourcesToGroup();

    private static HttpRequestDef<AddResourcesToGroupRequest, AddResourcesToGroupResponse> genForAddResourcesToGroup() {
        // basic
        HttpRequestDef.Builder<AddResourcesToGroupRequest, AddResourcesToGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AddResourcesToGroupRequest.class, AddResourcesToGroupResponse.class)
                .withName("AddResourcesToGroup")
                .withUri("/v1/resource-center/groups/{group_id}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddResourcesToGroupRequest::getGroupId, AddResourcesToGroupRequest::setGroupId));
        builder.<AddResourcesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddResourcesRequestBody.class),
            f -> f.withMarshaller(AddResourcesToGroupRequest::getBody, AddResourcesToGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceGroupRequest, CreateResourceGroupResponse> createResourceGroup =
        genForCreateResourceGroup();

    private static HttpRequestDef<CreateResourceGroupRequest, CreateResourceGroupResponse> genForCreateResourceGroup() {
        // basic
        HttpRequestDef.Builder<CreateResourceGroupRequest, CreateResourceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResourceGroupRequest.class, CreateResourceGroupResponse.class)
                .withName("CreateResourceGroup")
                .withUri("/v1/resource-center/groups")
                .withContentType("application/json");

        // requests
        builder.<GenericResourceGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GenericResourceGroupRequestBody.class),
            f -> f.withMarshaller(CreateResourceGroupRequest::getBody, CreateResourceGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceGroupRequest, DeleteResourceGroupResponse> deleteResourceGroup =
        genForDeleteResourceGroup();

    private static HttpRequestDef<DeleteResourceGroupRequest, DeleteResourceGroupResponse> genForDeleteResourceGroup() {
        // basic
        HttpRequestDef.Builder<DeleteResourceGroupRequest, DeleteResourceGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteResourceGroupRequest.class, DeleteResourceGroupResponse.class)
            .withName("DeleteResourceGroup")
            .withUri("/v1/resource-center/groups/{group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceGroupRequest::getGroupId, DeleteResourceGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceGroupsRequest, ListResourceGroupsResponse> listResourceGroups =
        genForListResourceGroups();

    private static HttpRequestDef<ListResourceGroupsRequest, ListResourceGroupsResponse> genForListResourceGroups() {
        // basic
        HttpRequestDef.Builder<ListResourceGroupsRequest, ListResourceGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceGroupsRequest.class, ListResourceGroupsResponse.class)
                .withName("ListResourceGroups")
                .withUri("/v1/resource-center/groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceGroupsRequest::getLimit, ListResourceGroupsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceGroupsRequest::getMarker, ListResourceGroupsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveResourceFromGroupRequest, RemoveResourceFromGroupResponse> removeResourceFromGroup =
        genForRemoveResourceFromGroup();

    private static HttpRequestDef<RemoveResourceFromGroupRequest, RemoveResourceFromGroupResponse> genForRemoveResourceFromGroup() {
        // basic
        HttpRequestDef.Builder<RemoveResourceFromGroupRequest, RemoveResourceFromGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, RemoveResourceFromGroupRequest.class, RemoveResourceFromGroupResponse.class)
            .withName("RemoveResourceFromGroup")
            .withUri("/v1/resource-center/groups/{group_id}/resources/{resource_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveResourceFromGroupRequest::getGroupId,
                RemoveResourceFromGroupRequest::setGroupId));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveResourceFromGroupRequest::getResourceId,
                RemoveResourceFromGroupRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceGroupRequest, ShowResourceGroupResponse> showResourceGroup =
        genForShowResourceGroup();

    private static HttpRequestDef<ShowResourceGroupRequest, ShowResourceGroupResponse> genForShowResourceGroup() {
        // basic
        HttpRequestDef.Builder<ShowResourceGroupRequest, ShowResourceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceGroupRequest.class, ShowResourceGroupResponse.class)
                .withName("ShowResourceGroup")
                .withUri("/v1/resource-center/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceGroupRequest::getGroupId, ShowResourceGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResourceGroupRequest, UpdateResourceGroupResponse> updateResourceGroup =
        genForUpdateResourceGroup();

    private static HttpRequestDef<UpdateResourceGroupRequest, UpdateResourceGroupResponse> genForUpdateResourceGroup() {
        // basic
        HttpRequestDef.Builder<UpdateResourceGroupRequest, UpdateResourceGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.PATCH, UpdateResourceGroupRequest.class, UpdateResourceGroupResponse.class)
            .withName("UpdateResourceGroup")
            .withUri("/v1/resource-center/groups/{group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResourceGroupRequest::getGroupId, UpdateResourceGroupRequest::setGroupId));
        builder.<UpdateResourceGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateResourceGroupRequestBody.class),
            f -> f.withMarshaller(UpdateResourceGroupRequest::getBody, UpdateResourceGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceRelationsRequest, ShowResourceRelationsResponse> showResourceRelations =
        genForShowResourceRelations();

    private static HttpRequestDef<ShowResourceRelationsRequest, ShowResourceRelationsResponse> genForShowResourceRelations() {
        // basic
        HttpRequestDef.Builder<ShowResourceRelationsRequest, ShowResourceRelationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowResourceRelationsRequest.class, ShowResourceRelationsResponse.class)
            .withName("ShowResourceRelations")
            .withUri("/v1/resource-center/resource-relations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceRelationsRequest::getResourceId,
                ShowResourceRelationsRequest::setResourceId));
        builder.<String>withRequestField("related_resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceRelationsRequest::getRelatedResourceId,
                ShowResourceRelationsRequest::setRelatedResourceId));
        builder.<String>withRequestField("related_resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceRelationsRequest::getRelatedResourceType,
                ShowResourceRelationsRequest::setRelatedResourceType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowResourceRelationsRequest::getLimit, ShowResourceRelationsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceRelationsRequest::getMarker, ShowResourceRelationsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CollectAllResourcesSummaryRequest, CollectAllResourcesSummaryResponse> collectAllResourcesSummary =
        genForCollectAllResourcesSummary();

    private static HttpRequestDef<CollectAllResourcesSummaryRequest, CollectAllResourcesSummaryResponse> genForCollectAllResourcesSummary() {
        // basic
        HttpRequestDef.Builder<CollectAllResourcesSummaryRequest, CollectAllResourcesSummaryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    CollectAllResourcesSummaryRequest.class,
                    CollectAllResourcesSummaryResponse.class)
                .withName("CollectAllResourcesSummary")
                .withUri("/v1/resource-center/all-resources/summary")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectAllResourcesSummaryRequest::getName,
                CollectAllResourcesSummaryRequest::setName));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CollectAllResourcesSummaryRequest::getType,
                CollectAllResourcesSummaryRequest::setType));
        builder.<List<String>>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CollectAllResourcesSummaryRequest::getRegionId,
                CollectAllResourcesSummaryRequest::setRegionId));
        builder.<List<String>>withRequestField("ep_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CollectAllResourcesSummaryRequest::getEpId,
                CollectAllResourcesSummaryRequest::setEpId));
        builder.<List<String>>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CollectAllResourcesSummaryRequest::getProjectId,
                CollectAllResourcesSummaryRequest::setProjectId));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CollectAllResourcesSummaryRequest::getTags,
                CollectAllResourcesSummaryRequest::setTags));

        // response
        builder.<List<ResourceSummaryResponseItem>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(CollectAllResourcesSummaryResponse::getBody,
                    CollectAllResourcesSummaryResponse::setBody)
                .withInnerContainerType(ResourceSummaryResponseItem.class));

        return builder.build();
    }

    public static final HttpRequestDef<CountAllResourcesRequest, CountAllResourcesResponse> countAllResources =
        genForCountAllResources();

    private static HttpRequestDef<CountAllResourcesRequest, CountAllResourcesResponse> genForCountAllResources() {
        // basic
        HttpRequestDef.Builder<CountAllResourcesRequest, CountAllResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CountAllResourcesRequest.class, CountAllResourcesResponse.class)
                .withName("CountAllResources")
                .withUri("/v1/resource-center/all-resources/count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountAllResourcesRequest::getId, CountAllResourcesRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountAllResourcesRequest::getName, CountAllResourcesRequest::setName));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountAllResourcesRequest::getType, CountAllResourcesRequest::setType));
        builder.<List<String>>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountAllResourcesRequest::getRegionId, CountAllResourcesRequest::setRegionId));
        builder.<List<String>>withRequestField("ep_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountAllResourcesRequest::getEpId, CountAllResourcesRequest::setEpId));
        builder.<List<String>>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountAllResourcesRequest::getProjectId, CountAllResourcesRequest::setProjectId));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountAllResourcesRequest::getTags, CountAllResourcesRequest::setTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllProvidersRequest, ListAllProvidersResponse> listAllProviders =
        genForListAllProviders();

    private static HttpRequestDef<ListAllProvidersRequest, ListAllProvidersResponse> genForListAllProviders() {
        // basic
        HttpRequestDef.Builder<ListAllProvidersRequest, ListAllProvidersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllProvidersRequest.class, ListAllProvidersResponse.class)
                .withName("ListAllProviders")
                .withUri("/v1/resource-center/all-providers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllProvidersRequest::getOffset, ListAllProvidersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllProvidersRequest::getLimit, ListAllProvidersRequest::setLimit));
        builder.<ListAllProvidersRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAllProvidersRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListAllProvidersRequest::getXLanguage, ListAllProvidersRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllResourcesRequest, ListAllResourcesResponse> listAllResources =
        genForListAllResources();

    private static HttpRequestDef<ListAllResourcesRequest, ListAllResourcesResponse> genForListAllResources() {
        // basic
        HttpRequestDef.Builder<ListAllResourcesRequest, ListAllResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllResourcesRequest.class, ListAllResourcesResponse.class)
                .withName("ListAllResources")
                .withUri("/v1/resource-center/all-resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getRegionId, ListAllResourcesRequest::setRegionId));
        builder.<String>withRequestField("ep_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getEpId, ListAllResourcesRequest::setEpId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getType, ListAllResourcesRequest::setType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getLimit, ListAllResourcesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getMarker, ListAllResourcesRequest::setMarker));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getId, ListAllResourcesRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getName, ListAllResourcesRequest::setName));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getTags, ListAllResourcesRequest::setTags));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getGroupId, ListAllResourcesRequest::setGroupId));
        builder.<List<String>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getSortKey, ListAllResourcesRequest::setSortKey));
        builder.<List<String>>withRequestField("sort_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getSortValue, ListAllResourcesRequest::setSortValue));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllTagsRequest, ListAllTagsResponse> listAllTags = genForListAllTags();

    private static HttpRequestDef<ListAllTagsRequest, ListAllTagsResponse> genForListAllTags() {
        // basic
        HttpRequestDef.Builder<ListAllTagsRequest, ListAllTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllTagsRequest.class, ListAllTagsResponse.class)
                .withName("ListAllTags")
                .withUri("/v1/resource-center/all-resources/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllTagsRequest::getKey, ListAllTagsRequest::setKey));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllTagsRequest::getMarker, ListAllTagsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllTagsRequest::getLimit, ListAllTagsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourcesRequest, ListResourcesResponse> listResources =
        genForListResources();

    private static HttpRequestDef<ListResourcesRequest, ListResourcesResponse> genForListResources() {
        // basic
        HttpRequestDef.Builder<ListResourcesRequest, ListResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourcesRequest.class, ListResourcesResponse.class)
                .withName("ListResources")
                .withUri("/v1/resource-center/provider/{provider}/type/{type}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("provider",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getProvider, ListResourcesRequest::setProvider));
        builder.<String>withRequestField("type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getType, ListResourcesRequest::setType));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getRegionId, ListResourcesRequest::setRegionId));
        builder.<String>withRequestField("ep_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getEpId, ListResourcesRequest::setEpId));
        builder.<Map<String, List<String>>>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(ListResourcesRequest::getTag, ListResourcesRequest::setTag));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourcesRequest::getLimit, ListResourcesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getMarker, ListResourcesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceByIdRequest, ShowResourceByIdResponse> showResourceById =
        genForShowResourceById();

    private static HttpRequestDef<ShowResourceByIdRequest, ShowResourceByIdResponse> genForShowResourceById() {
        // basic
        HttpRequestDef.Builder<ShowResourceByIdRequest, ShowResourceByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceByIdRequest.class, ShowResourceByIdResponse.class)
                .withName("ShowResourceById")
                .withUri("/v1/resource-center/provider/{provider}/type/{type}/resources/{resource_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("provider",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceByIdRequest::getProvider, ShowResourceByIdRequest::setProvider));
        builder.<String>withRequestField("type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceByIdRequest::getType, ShowResourceByIdRequest::setType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceByIdRequest::getResourceId, ShowResourceByIdRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceDetailRequest, ShowResourceDetailResponse> showResourceDetail =
        genForShowResourceDetail();

    private static HttpRequestDef<ShowResourceDetailRequest, ShowResourceDetailResponse> genForShowResourceDetail() {
        // basic
        HttpRequestDef.Builder<ShowResourceDetailRequest, ShowResourceDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceDetailRequest.class, ShowResourceDetailResponse.class)
                .withName("ShowResourceDetail")
                .withUri("/v1/resource-center/all-resources/{resource_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceDetailRequest::getResourceId, ShowResourceDetailRequest::setResourceId));

        // response

        return builder.build();
    }

}
