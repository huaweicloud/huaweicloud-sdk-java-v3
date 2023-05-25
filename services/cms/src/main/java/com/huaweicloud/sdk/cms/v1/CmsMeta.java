package com.huaweicloud.sdk.cms.v1;

import com.huaweicloud.sdk.cms.v1.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CmsMeta {

    public static final HttpRequestDef<CreateAutoLaunchGroupRequest, CreateAutoLaunchGroupResponse> createAutoLaunchGroup =
        genForcreateAutoLaunchGroup();

    private static HttpRequestDef<CreateAutoLaunchGroupRequest, CreateAutoLaunchGroupResponse> genForcreateAutoLaunchGroup() {
        // basic
        HttpRequestDef.Builder<CreateAutoLaunchGroupRequest, CreateAutoLaunchGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAutoLaunchGroupRequest.class, CreateAutoLaunchGroupResponse.class)
            .withName("CreateAutoLaunchGroup")
            .withUri("/v2/{domain_id}/auto-launch-groups")
            .withContentType("application/json");

        // requests
        builder.<AutoLaunchGroupReqV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AutoLaunchGroupReqV2.class),
            f -> f.withMarshaller(CreateAutoLaunchGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAutoLaunchGroupRequest, DeleteAutoLaunchGroupResponse> deleteAutoLaunchGroup =
        genFordeleteAutoLaunchGroup();

    private static HttpRequestDef<DeleteAutoLaunchGroupRequest, DeleteAutoLaunchGroupResponse> genFordeleteAutoLaunchGroup() {
        // basic
        HttpRequestDef.Builder<DeleteAutoLaunchGroupRequest, DeleteAutoLaunchGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAutoLaunchGroupRequest.class, DeleteAutoLaunchGroupResponse.class)
            .withName("DeleteAutoLaunchGroup")
            .withUri("/v2/{domain_id}/auto-launch-groups/{auto_launch_group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("auto_launch_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAutoLaunchGroupRequest::getAutoLaunchGroupId, (req, v) -> {
                req.setAutoLaunchGroupId(v);
            }));
        builder.<DeleteAutoLaunchGroupReqV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteAutoLaunchGroupReqV2.class),
            f -> f.withMarshaller(DeleteAutoLaunchGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAutoLaunchGroupsRequest, ListAutoLaunchGroupsResponse> listAutoLaunchGroups =
        genForlistAutoLaunchGroups();

    private static HttpRequestDef<ListAutoLaunchGroupsRequest, ListAutoLaunchGroupsResponse> genForlistAutoLaunchGroups() {
        // basic
        HttpRequestDef.Builder<ListAutoLaunchGroupsRequest, ListAutoLaunchGroupsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAutoLaunchGroupsRequest.class, ListAutoLaunchGroupsResponse.class)
            .withName("ListAutoLaunchGroups")
            .withUri("/v2/{domain_id}/auto-launch-groups")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchGroupsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchGroupsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("valid_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchGroupsRequest::getValidSince, (req, v) -> {
                req.setValidSince(v);
            }));
        builder.<String>withRequestField("valid_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchGroupsRequest::getValidUntil, (req, v) -> {
                req.setValidUntil(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForlistInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForlistInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v2/{domain_id}/auto-launch-groups/{auto_launch_group_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("auto_launch_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getAutoLaunchGroupId, (req, v) -> {
                req.setAutoLaunchGroupId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSupplyRecommendationRequest, ListSupplyRecommendationResponse> listSupplyRecommendation =
        genForlistSupplyRecommendation();

    private static HttpRequestDef<ListSupplyRecommendationRequest, ListSupplyRecommendationResponse> genForlistSupplyRecommendation() {
        // basic
        HttpRequestDef.Builder<ListSupplyRecommendationRequest, ListSupplyRecommendationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ListSupplyRecommendationRequest.class, ListSupplyRecommendationResponse.class)
                .withName("ListSupplyRecommendation")
                .withUri("/v1/{domain_id}/recommendations/ecs-supply")
                .withContentType("application/json");

        // requests
        builder.<ListSupplyRecommendationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSupplyRecommendationRequestBody.class),
            f -> f.withMarshaller(ListSupplyRecommendationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoLaunchGroupRequest, ShowAutoLaunchGroupResponse> showAutoLaunchGroup =
        genForshowAutoLaunchGroup();

    private static HttpRequestDef<ShowAutoLaunchGroupRequest, ShowAutoLaunchGroupResponse> genForshowAutoLaunchGroup() {
        // basic
        HttpRequestDef.Builder<ShowAutoLaunchGroupRequest, ShowAutoLaunchGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAutoLaunchGroupRequest.class, ShowAutoLaunchGroupResponse.class)
                .withName("ShowAutoLaunchGroup")
                .withUri("/v2/{domain_id}/auto-launch-groups/{auto_launch_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("auto_launch_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoLaunchGroupRequest::getAutoLaunchGroupId, (req, v) -> {
                req.setAutoLaunchGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAutoLaunchGroupRequest, UpdateAutoLaunchGroupResponse> updateAutoLaunchGroup =
        genForupdateAutoLaunchGroup();

    private static HttpRequestDef<UpdateAutoLaunchGroupRequest, UpdateAutoLaunchGroupResponse> genForupdateAutoLaunchGroup() {
        // basic
        HttpRequestDef.Builder<UpdateAutoLaunchGroupRequest, UpdateAutoLaunchGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAutoLaunchGroupRequest.class, UpdateAutoLaunchGroupResponse.class)
            .withName("UpdateAutoLaunchGroup")
            .withUri("/v2/{domain_id}/auto-launch-groups/{auto_launch_group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("auto_launch_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoLaunchGroupRequest::getAutoLaunchGroupId, (req, v) -> {
                req.setAutoLaunchGroupId(v);
            }));
        builder.<UpdateAutoLaunchGroupReqV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateAutoLaunchGroupReqV2.class),
            f -> f.withMarshaller(UpdateAutoLaunchGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
