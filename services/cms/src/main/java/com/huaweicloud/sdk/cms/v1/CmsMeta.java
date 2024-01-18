package com.huaweicloud.sdk.cms.v1;

import com.huaweicloud.sdk.cms.v1.model.AutoLaunchGroupReqV2;
import com.huaweicloud.sdk.cms.v1.model.CreateAutoLaunchGroupRequest;
import com.huaweicloud.sdk.cms.v1.model.CreateAutoLaunchGroupResponse;
import com.huaweicloud.sdk.cms.v1.model.DeleteAutoLaunchGroupReqV2;
import com.huaweicloud.sdk.cms.v1.model.DeleteAutoLaunchGroupRequest;
import com.huaweicloud.sdk.cms.v1.model.DeleteAutoLaunchGroupResponse;
import com.huaweicloud.sdk.cms.v1.model.ListAutoLaunchGroupsRequest;
import com.huaweicloud.sdk.cms.v1.model.ListAutoLaunchGroupsResponse;
import com.huaweicloud.sdk.cms.v1.model.ListInstancesRequest;
import com.huaweicloud.sdk.cms.v1.model.ListInstancesResponse;
import com.huaweicloud.sdk.cms.v1.model.ListSupplyRecommendationRequest;
import com.huaweicloud.sdk.cms.v1.model.ListSupplyRecommendationRequestBody;
import com.huaweicloud.sdk.cms.v1.model.ListSupplyRecommendationResponse;
import com.huaweicloud.sdk.cms.v1.model.ShowAutoLaunchGroupRequest;
import com.huaweicloud.sdk.cms.v1.model.ShowAutoLaunchGroupResponse;
import com.huaweicloud.sdk.cms.v1.model.UpdateAutoLaunchGroupReqV2;
import com.huaweicloud.sdk.cms.v1.model.UpdateAutoLaunchGroupRequest;
import com.huaweicloud.sdk.cms.v1.model.UpdateAutoLaunchGroupResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CmsMeta {

    public static final HttpRequestDef<CreateAutoLaunchGroupRequest, CreateAutoLaunchGroupResponse> createAutoLaunchGroup =
        genForCreateAutoLaunchGroup();

    private static HttpRequestDef<CreateAutoLaunchGroupRequest, CreateAutoLaunchGroupResponse> genForCreateAutoLaunchGroup() {
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
            f -> f.withMarshaller(CreateAutoLaunchGroupRequest::getBody, CreateAutoLaunchGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAutoLaunchGroupRequest, DeleteAutoLaunchGroupResponse> deleteAutoLaunchGroup =
        genForDeleteAutoLaunchGroup();

    private static HttpRequestDef<DeleteAutoLaunchGroupRequest, DeleteAutoLaunchGroupResponse> genForDeleteAutoLaunchGroup() {
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
            f -> f.withMarshaller(DeleteAutoLaunchGroupRequest::getAutoLaunchGroupId,
                DeleteAutoLaunchGroupRequest::setAutoLaunchGroupId));
        builder.<DeleteAutoLaunchGroupReqV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteAutoLaunchGroupReqV2.class),
            f -> f.withMarshaller(DeleteAutoLaunchGroupRequest::getBody, DeleteAutoLaunchGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAutoLaunchGroupsRequest, ListAutoLaunchGroupsResponse> listAutoLaunchGroups =
        genForListAutoLaunchGroups();

    private static HttpRequestDef<ListAutoLaunchGroupsRequest, ListAutoLaunchGroupsResponse> genForListAutoLaunchGroups() {
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
            f -> f.withMarshaller(ListAutoLaunchGroupsRequest::getLimit, ListAutoLaunchGroupsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchGroupsRequest::getMarker, ListAutoLaunchGroupsRequest::setMarker));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchGroupsRequest::getName, ListAutoLaunchGroupsRequest::setName));
        builder.<String>withRequestField("valid_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchGroupsRequest::getValidSince,
                ListAutoLaunchGroupsRequest::setValidSince));
        builder.<String>withRequestField("valid_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchGroupsRequest::getValidUntil,
                ListAutoLaunchGroupsRequest::setValidUntil));

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
                .withUri("/v2/{domain_id}/auto-launch-groups/{auto_launch_group_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("auto_launch_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getAutoLaunchGroupId,
                ListInstancesRequest::setAutoLaunchGroupId));
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

    public static final HttpRequestDef<ListSupplyRecommendationRequest, ListSupplyRecommendationResponse> listSupplyRecommendation =
        genForListSupplyRecommendation();

    private static HttpRequestDef<ListSupplyRecommendationRequest, ListSupplyRecommendationResponse> genForListSupplyRecommendation() {
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
            f -> f.withMarshaller(ListSupplyRecommendationRequest::getBody, ListSupplyRecommendationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoLaunchGroupRequest, ShowAutoLaunchGroupResponse> showAutoLaunchGroup =
        genForShowAutoLaunchGroup();

    private static HttpRequestDef<ShowAutoLaunchGroupRequest, ShowAutoLaunchGroupResponse> genForShowAutoLaunchGroup() {
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
            f -> f.withMarshaller(ShowAutoLaunchGroupRequest::getAutoLaunchGroupId,
                ShowAutoLaunchGroupRequest::setAutoLaunchGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAutoLaunchGroupRequest, UpdateAutoLaunchGroupResponse> updateAutoLaunchGroup =
        genForUpdateAutoLaunchGroup();

    private static HttpRequestDef<UpdateAutoLaunchGroupRequest, UpdateAutoLaunchGroupResponse> genForUpdateAutoLaunchGroup() {
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
            f -> f.withMarshaller(UpdateAutoLaunchGroupRequest::getAutoLaunchGroupId,
                UpdateAutoLaunchGroupRequest::setAutoLaunchGroupId));
        builder.<UpdateAutoLaunchGroupReqV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateAutoLaunchGroupReqV2.class),
            f -> f.withMarshaller(UpdateAutoLaunchGroupRequest::getBody, UpdateAutoLaunchGroupRequest::setBody));

        // response

        return builder.build();
    }

}
