package com.huaweicloud.sdk.tms.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.tms.v1.model.ChangeAssociatedResourceOpenStatusRequest;
import com.huaweicloud.sdk.tms.v1.model.ChangeAssociatedResourceOpenStatusResponse;
import com.huaweicloud.sdk.tms.v1.model.CreateAssociatedResourceRulesRequest;
import com.huaweicloud.sdk.tms.v1.model.CreateAssociatedResourceRulesResponse;
import com.huaweicloud.sdk.tms.v1.model.CreatePredefineTagsRequest;
import com.huaweicloud.sdk.tms.v1.model.CreatePredefineTagsResponse;
import com.huaweicloud.sdk.tms.v1.model.CreateResourceTagRequest;
import com.huaweicloud.sdk.tms.v1.model.CreateResourceTagResponse;
import com.huaweicloud.sdk.tms.v1.model.DeleteAssociatedResourceRuleRequest;
import com.huaweicloud.sdk.tms.v1.model.DeleteAssociatedResourceRuleResponse;
import com.huaweicloud.sdk.tms.v1.model.DeletePredefineTagsRequest;
import com.huaweicloud.sdk.tms.v1.model.DeletePredefineTagsResponse;
import com.huaweicloud.sdk.tms.v1.model.DeleteResourceTagRequest;
import com.huaweicloud.sdk.tms.v1.model.DeleteResourceTagResponse;
import com.huaweicloud.sdk.tms.v1.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.tms.v1.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.tms.v1.model.ListAssociatedResourceRulesRequest;
import com.huaweicloud.sdk.tms.v1.model.ListAssociatedResourceRulesResponse;
import com.huaweicloud.sdk.tms.v1.model.ListAssociatedResourceSettingsRequest;
import com.huaweicloud.sdk.tms.v1.model.ListAssociatedResourceSettingsResponse;
import com.huaweicloud.sdk.tms.v1.model.ListPredefineTagsRequest;
import com.huaweicloud.sdk.tms.v1.model.ListPredefineTagsResponse;
import com.huaweicloud.sdk.tms.v1.model.ListProvidersRequest;
import com.huaweicloud.sdk.tms.v1.model.ListProvidersResponse;
import com.huaweicloud.sdk.tms.v1.model.ListResourceRequest;
import com.huaweicloud.sdk.tms.v1.model.ListResourceResponse;
import com.huaweicloud.sdk.tms.v1.model.ListTagKeysRequest;
import com.huaweicloud.sdk.tms.v1.model.ListTagKeysResponse;
import com.huaweicloud.sdk.tms.v1.model.ListTagValuesRequest;
import com.huaweicloud.sdk.tms.v1.model.ListTagValuesResponse;
import com.huaweicloud.sdk.tms.v1.model.ListTagsRequest;
import com.huaweicloud.sdk.tms.v1.model.ListTagsResponse;
import com.huaweicloud.sdk.tms.v1.model.ModifyPrefineTag;
import com.huaweicloud.sdk.tms.v1.model.ReqAssociatedResourceOpenStatus;
import com.huaweicloud.sdk.tms.v1.model.ReqCreateAssociatedResourceRules;
import com.huaweicloud.sdk.tms.v1.model.ReqCreatePredefineTag;
import com.huaweicloud.sdk.tms.v1.model.ReqCreateTag;
import com.huaweicloud.sdk.tms.v1.model.ReqDeletePredefineTag;
import com.huaweicloud.sdk.tms.v1.model.ReqDeleteTag;
import com.huaweicloud.sdk.tms.v1.model.ReqUpdateAssociatedResourceRules;
import com.huaweicloud.sdk.tms.v1.model.ResqTagResource;
import com.huaweicloud.sdk.tms.v1.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.tms.v1.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.tms.v1.model.ShowAssociatedResourceOpenStatusRequest;
import com.huaweicloud.sdk.tms.v1.model.ShowAssociatedResourceOpenStatusResponse;
import com.huaweicloud.sdk.tms.v1.model.ShowResourceTagRequest;
import com.huaweicloud.sdk.tms.v1.model.ShowResourceTagResponse;
import com.huaweicloud.sdk.tms.v1.model.ShowTagQuotaRequest;
import com.huaweicloud.sdk.tms.v1.model.ShowTagQuotaResponse;
import com.huaweicloud.sdk.tms.v1.model.UpdateAssociatedResourceRulesRequest;
import com.huaweicloud.sdk.tms.v1.model.UpdateAssociatedResourceRulesResponse;
import com.huaweicloud.sdk.tms.v1.model.UpdatePredefineTagsRequest;
import com.huaweicloud.sdk.tms.v1.model.UpdatePredefineTagsResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class TmsMeta {

    public static final HttpRequestDef<ChangeAssociatedResourceOpenStatusRequest, ChangeAssociatedResourceOpenStatusResponse> changeAssociatedResourceOpenStatus =
        genForChangeAssociatedResourceOpenStatus();

    private static HttpRequestDef<ChangeAssociatedResourceOpenStatusRequest, ChangeAssociatedResourceOpenStatusResponse> genForChangeAssociatedResourceOpenStatus() {
        // basic
        HttpRequestDef.Builder<ChangeAssociatedResourceOpenStatusRequest, ChangeAssociatedResourceOpenStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ChangeAssociatedResourceOpenStatusRequest.class,
                    ChangeAssociatedResourceOpenStatusResponse.class)
                .withName("ChangeAssociatedResourceOpenStatus")
                .withUri("/v2/tms/associated-resources/status")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ReqAssociatedResourceOpenStatus>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReqAssociatedResourceOpenStatus.class),
            f -> f.withMarshaller(ChangeAssociatedResourceOpenStatusRequest::getBody,
                ChangeAssociatedResourceOpenStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAssociatedResourceRulesRequest, CreateAssociatedResourceRulesResponse> createAssociatedResourceRules =
        genForCreateAssociatedResourceRules();

    private static HttpRequestDef<CreateAssociatedResourceRulesRequest, CreateAssociatedResourceRulesResponse> genForCreateAssociatedResourceRules() {
        // basic
        HttpRequestDef.Builder<CreateAssociatedResourceRulesRequest, CreateAssociatedResourceRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateAssociatedResourceRulesRequest.class,
                    CreateAssociatedResourceRulesResponse.class)
                .withName("CreateAssociatedResourceRules")
                .withUri("/v2/tms/associated-resources/rules/batch-create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ReqCreateAssociatedResourceRules>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReqCreateAssociatedResourceRules.class),
            f -> f.withMarshaller(CreateAssociatedResourceRulesRequest::getBody,
                CreateAssociatedResourceRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePredefineTagsRequest, CreatePredefineTagsResponse> createPredefineTags =
        genForCreatePredefineTags();

    private static HttpRequestDef<CreatePredefineTagsRequest, CreatePredefineTagsResponse> genForCreatePredefineTags() {
        // basic
        HttpRequestDef.Builder<CreatePredefineTagsRequest, CreatePredefineTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePredefineTagsRequest.class, CreatePredefineTagsResponse.class)
                .withName("CreatePredefineTags")
                .withUri("/v1.0/predefine_tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ReqCreatePredefineTag>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReqCreatePredefineTag.class),
            f -> f.withMarshaller(CreatePredefineTagsRequest::getBody, CreatePredefineTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTag =
        genForCreateResourceTag();

    private static HttpRequestDef<CreateResourceTagRequest, CreateResourceTagResponse> genForCreateResourceTag() {
        // basic
        HttpRequestDef.Builder<CreateResourceTagRequest, CreateResourceTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResourceTagRequest.class, CreateResourceTagResponse.class)
                .withName("CreateResourceTag")
                .withUri("/v1.0/resource-tags/batch-create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ReqCreateTag>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReqCreateTag.class),
            f -> f.withMarshaller(CreateResourceTagRequest::getBody, CreateResourceTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssociatedResourceRuleRequest, DeleteAssociatedResourceRuleResponse> deleteAssociatedResourceRule =
        genForDeleteAssociatedResourceRule();

    private static HttpRequestDef<DeleteAssociatedResourceRuleRequest, DeleteAssociatedResourceRuleResponse> genForDeleteAssociatedResourceRule() {
        // basic
        HttpRequestDef.Builder<DeleteAssociatedResourceRuleRequest, DeleteAssociatedResourceRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteAssociatedResourceRuleRequest.class,
                    DeleteAssociatedResourceRuleResponse.class)
                .withName("DeleteAssociatedResourceRule")
                .withUri("/v2/tms/associated-resources/rules/{setting_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("setting_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssociatedResourceRuleRequest::getSettingName,
                DeleteAssociatedResourceRuleRequest::setSettingName));
        builder.<List<String>>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteAssociatedResourceRuleRequest::getRegionId,
                DeleteAssociatedResourceRuleRequest::setRegionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePredefineTagsRequest, DeletePredefineTagsResponse> deletePredefineTags =
        genForDeletePredefineTags();

    private static HttpRequestDef<DeletePredefineTagsRequest, DeletePredefineTagsResponse> genForDeletePredefineTags() {
        // basic
        HttpRequestDef.Builder<DeletePredefineTagsRequest, DeletePredefineTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeletePredefineTagsRequest.class, DeletePredefineTagsResponse.class)
                .withName("DeletePredefineTags")
                .withUri("/v1.0/predefine_tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ReqDeletePredefineTag>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReqDeletePredefineTag.class),
            f -> f.withMarshaller(DeletePredefineTagsRequest::getBody, DeletePredefineTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTag =
        genForDeleteResourceTag();

    private static HttpRequestDef<DeleteResourceTagRequest, DeleteResourceTagResponse> genForDeleteResourceTag() {
        // basic
        HttpRequestDef.Builder<DeleteResourceTagRequest, DeleteResourceTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteResourceTagRequest.class, DeleteResourceTagResponse.class)
                .withName("DeleteResourceTag")
                .withUri("/v1.0/resource-tags/batch-delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ReqDeleteTag>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReqDeleteTag.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getBody, DeleteResourceTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions =
        genForListApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForListApiVersions() {
        // basic
        HttpRequestDef.Builder<ListApiVersionsRequest, ListApiVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionsRequest.class, ListApiVersionsResponse.class)
                .withName("ListApiVersions")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssociatedResourceRulesRequest, ListAssociatedResourceRulesResponse> listAssociatedResourceRules =
        genForListAssociatedResourceRules();

    private static HttpRequestDef<ListAssociatedResourceRulesRequest, ListAssociatedResourceRulesResponse> genForListAssociatedResourceRules() {
        // basic
        HttpRequestDef.Builder<ListAssociatedResourceRulesRequest, ListAssociatedResourceRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAssociatedResourceRulesRequest.class,
                    ListAssociatedResourceRulesResponse.class)
                .withName("ListAssociatedResourceRules")
                .withUri("/v2/tms/associated-resources/rules")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociatedResourceRulesRequest::getLimit,
                ListAssociatedResourceRulesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssociatedResourceRulesRequest::getMarker,
                ListAssociatedResourceRulesRequest::setMarker));
        builder.<String>withRequestField("setting_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssociatedResourceRulesRequest::getSettingName,
                ListAssociatedResourceRulesRequest::setSettingName));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssociatedResourceRulesRequest::getRegionId,
                ListAssociatedResourceRulesRequest::setRegionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssociatedResourceSettingsRequest, ListAssociatedResourceSettingsResponse> listAssociatedResourceSettings =
        genForListAssociatedResourceSettings();

    private static HttpRequestDef<ListAssociatedResourceSettingsRequest, ListAssociatedResourceSettingsResponse> genForListAssociatedResourceSettings() {
        // basic
        HttpRequestDef.Builder<ListAssociatedResourceSettingsRequest, ListAssociatedResourceSettingsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAssociatedResourceSettingsRequest.class,
                    ListAssociatedResourceSettingsResponse.class)
                .withName("ListAssociatedResourceSettings")
                .withUri("/v2/tms/associated-resources/settings")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociatedResourceSettingsRequest::getLimit,
                ListAssociatedResourceSettingsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssociatedResourceSettingsRequest::getMarker,
                ListAssociatedResourceSettingsRequest::setMarker));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssociatedResourceSettingsRequest::getRegionId,
                ListAssociatedResourceSettingsRequest::setRegionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPredefineTagsRequest, ListPredefineTagsResponse> listPredefineTags =
        genForListPredefineTags();

    private static HttpRequestDef<ListPredefineTagsRequest, ListPredefineTagsResponse> genForListPredefineTags() {
        // basic
        HttpRequestDef.Builder<ListPredefineTagsRequest, ListPredefineTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPredefineTagsRequest.class, ListPredefineTagsResponse.class)
                .withName("ListPredefineTags")
                .withUri("/v1.0/predefine_tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPredefineTagsRequest::getKey, ListPredefineTagsRequest::setKey));
        builder.<String>withRequestField("value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPredefineTagsRequest::getValue, ListPredefineTagsRequest::setValue));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPredefineTagsRequest::getLimit, ListPredefineTagsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPredefineTagsRequest::getMarker, ListPredefineTagsRequest::setMarker));
        builder.<String>withRequestField("order_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPredefineTagsRequest::getOrderField, ListPredefineTagsRequest::setOrderField));
        builder.<ListPredefineTagsRequest.OrderMethodEnum>withRequestField("order_method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPredefineTagsRequest.OrderMethodEnum.class),
            f -> f.withMarshaller(ListPredefineTagsRequest::getOrderMethod, ListPredefineTagsRequest::setOrderMethod));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProvidersRequest, ListProvidersResponse> listProviders =
        genForListProviders();

    private static HttpRequestDef<ListProvidersRequest, ListProvidersResponse> genForListProviders() {
        // basic
        HttpRequestDef.Builder<ListProvidersRequest, ListProvidersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProvidersRequest.class, ListProvidersResponse.class)
                .withName("ListProviders")
                .withUri("/v1.0/tms/providers")
                .withContentType("application/json");

        // requests
        builder.<ListProvidersRequest.LocaleEnum>withRequestField("locale",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProvidersRequest.LocaleEnum.class),
            f -> f.withMarshaller(ListProvidersRequest::getLocale, ListProvidersRequest::setLocale));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProvidersRequest::getLimit, ListProvidersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProvidersRequest::getOffset, ListProvidersRequest::setOffset));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProvidersRequest::getProvider, ListProvidersRequest::setProvider));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceRequest, ListResourceResponse> listResource = genForListResource();

    private static HttpRequestDef<ListResourceRequest, ListResourceResponse> genForListResource() {
        // basic
        HttpRequestDef.Builder<ListResourceRequest, ListResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListResourceRequest.class, ListResourceResponse.class)
                .withName("ListResource")
                .withUri("/v1.0/resource-instances/filter")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ResqTagResource>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResqTagResource.class),
            f -> f.withMarshaller(ListResourceRequest::getBody, ListResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagKeysRequest, ListTagKeysResponse> listTagKeys = genForListTagKeys();

    private static HttpRequestDef<ListTagKeysRequest, ListTagKeysResponse> genForListTagKeys() {
        // basic
        HttpRequestDef.Builder<ListTagKeysRequest, ListTagKeysResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagKeysRequest.class, ListTagKeysResponse.class)
                .withName("ListTagKeys")
                .withUri("/v1.0/tag-keys")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagKeysRequest::getRegionId, ListTagKeysRequest::setRegionId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagKeysRequest::getLimit, ListTagKeysRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagKeysRequest::getMarker, ListTagKeysRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagValuesRequest, ListTagValuesResponse> listTagValues =
        genForListTagValues();

    private static HttpRequestDef<ListTagValuesRequest, ListTagValuesResponse> genForListTagValues() {
        // basic
        HttpRequestDef.Builder<ListTagValuesRequest, ListTagValuesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagValuesRequest.class, ListTagValuesResponse.class)
                .withName("ListTagValues")
                .withUri("/v1.0/tag-values")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagValuesRequest::getRegionId, ListTagValuesRequest::setRegionId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagValuesRequest::getLimit, ListTagValuesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagValuesRequest::getMarker, ListTagValuesRequest::setMarker));
        builder.<String>withRequestField("key",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagValuesRequest::getKey, ListTagValuesRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForListTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForListTags() {
        // basic
        HttpRequestDef.Builder<ListTagsRequest, ListTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsRequest.class, ListTagsResponse.class)
                .withName("ListTags")
                .withUri("/v1.0/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_types",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getResourceTypes, ListTagsRequest::setResourceTypes));
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getProjectId, ListTagsRequest::setProjectId));
        builder.<ListTagsRequest.TagTypesEnum>withRequestField("tag_types",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTagsRequest.TagTypesEnum.class),
            f -> f.withMarshaller(ListTagsRequest::getTagTypes, ListTagsRequest::setTagTypes));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersion =
        genForShowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForShowApiVersion() {
        // basic
        HttpRequestDef.Builder<ShowApiVersionRequest, ShowApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiVersionRequest.class, ShowApiVersionResponse.class)
                .withName("ShowApiVersion")
                .withUri("/{api_version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("api_version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiVersionRequest::getApiVersion, ShowApiVersionRequest::setApiVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssociatedResourceOpenStatusRequest, ShowAssociatedResourceOpenStatusResponse> showAssociatedResourceOpenStatus =
        genForShowAssociatedResourceOpenStatus();

    private static HttpRequestDef<ShowAssociatedResourceOpenStatusRequest, ShowAssociatedResourceOpenStatusResponse> genForShowAssociatedResourceOpenStatus() {
        // basic
        HttpRequestDef.Builder<ShowAssociatedResourceOpenStatusRequest, ShowAssociatedResourceOpenStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAssociatedResourceOpenStatusRequest.class,
                    ShowAssociatedResourceOpenStatusResponse.class)
                .withName("ShowAssociatedResourceOpenStatus")
                .withUri("/v2/tms/associated-resources/status")
                .withContentType("application/json");

        // requests

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
                .withUri("/v2.0/resources/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceTagRequest::getResourceId, ShowResourceTagRequest::setResourceId));
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceTagRequest::getProjectId, ShowResourceTagRequest::setProjectId));
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceTagRequest::getResourceType, ShowResourceTagRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTagQuotaRequest, ShowTagQuotaResponse> showTagQuota = genForShowTagQuota();

    private static HttpRequestDef<ShowTagQuotaRequest, ShowTagQuotaResponse> genForShowTagQuota() {
        // basic
        HttpRequestDef.Builder<ShowTagQuotaRequest, ShowTagQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTagQuotaRequest.class, ShowTagQuotaResponse.class)
                .withName("ShowTagQuota")
                .withUri("/v1.0/tms/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssociatedResourceRulesRequest, UpdateAssociatedResourceRulesResponse> updateAssociatedResourceRules =
        genForUpdateAssociatedResourceRules();

    private static HttpRequestDef<UpdateAssociatedResourceRulesRequest, UpdateAssociatedResourceRulesResponse> genForUpdateAssociatedResourceRules() {
        // basic
        HttpRequestDef.Builder<UpdateAssociatedResourceRulesRequest, UpdateAssociatedResourceRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateAssociatedResourceRulesRequest.class,
                    UpdateAssociatedResourceRulesResponse.class)
                .withName("UpdateAssociatedResourceRules")
                .withUri("/v2/tms/associated-resources/rules/batch-update")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ReqUpdateAssociatedResourceRules>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReqUpdateAssociatedResourceRules.class),
            f -> f.withMarshaller(UpdateAssociatedResourceRulesRequest::getBody,
                UpdateAssociatedResourceRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse> updatePredefineTags =
        genForUpdatePredefineTags();

    private static HttpRequestDef<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse> genForUpdatePredefineTags() {
        // basic
        HttpRequestDef.Builder<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePredefineTagsRequest.class, UpdatePredefineTagsResponse.class)
                .withName("UpdatePredefineTags")
                .withUri("/v1.0/predefine_tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ModifyPrefineTag>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyPrefineTag.class),
            f -> f.withMarshaller(UpdatePredefineTagsRequest::getBody, UpdatePredefineTagsRequest::setBody));

        // response

        return builder.build();
    }

}
