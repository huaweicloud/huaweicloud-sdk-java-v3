package com.huaweicloud.sdk.cc.v2;

import com.huaweicloud.sdk.cc.v2.model.BatchCreateDeleteTagsRequest;
import com.huaweicloud.sdk.cc.v2.model.BatchCreateDeleteTagsResponse;
import com.huaweicloud.sdk.cc.v2.model.CreateTagRequest;
import com.huaweicloud.sdk.cc.v2.model.CreateTagRequestBody;
import com.huaweicloud.sdk.cc.v2.model.CreateTagResponse;
import com.huaweicloud.sdk.cc.v2.model.DeleteTagRequest;
import com.huaweicloud.sdk.cc.v2.model.DeleteTagResponse;
import com.huaweicloud.sdk.cc.v2.model.ListDomainTagsRequest;
import com.huaweicloud.sdk.cc.v2.model.ListDomainTagsResponse;
import com.huaweicloud.sdk.cc.v2.model.ListResourceByFilterTagRequest;
import com.huaweicloud.sdk.cc.v2.model.ListResourceByFilterTagRequestBody;
import com.huaweicloud.sdk.cc.v2.model.ListResourceByFilterTagResponse;
import com.huaweicloud.sdk.cc.v2.model.ListTagsRequest;
import com.huaweicloud.sdk.cc.v2.model.ListTagsResponse;
import com.huaweicloud.sdk.cc.v2.model.ResourceTags;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CcMeta {

    public static final HttpRequestDef<BatchCreateDeleteTagsRequest, BatchCreateDeleteTagsResponse> batchCreateDeleteTags =
        genForBatchCreateDeleteTags();

    private static HttpRequestDef<BatchCreateDeleteTagsRequest, BatchCreateDeleteTagsResponse> genForBatchCreateDeleteTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateDeleteTagsRequest, BatchCreateDeleteTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateDeleteTagsRequest.class, BatchCreateDeleteTagsResponse.class)
            .withName("BatchCreateDeleteTags")
            .withUri("/v3/{domain_id}/ccaas/{resource_type}/{resource_id}/tags/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateDeleteTagsRequest::getResourceId,
                BatchCreateDeleteTagsRequest::setResourceId));
        builder.<BatchCreateDeleteTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateDeleteTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchCreateDeleteTagsRequest::getResourceType,
                BatchCreateDeleteTagsRequest::setResourceType));
        builder.<ResourceTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResourceTags.class),
            f -> f.withMarshaller(BatchCreateDeleteTagsRequest::getBody, BatchCreateDeleteTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagRequest, CreateTagResponse> createTag = genForCreateTag();

    private static HttpRequestDef<CreateTagRequest, CreateTagResponse> genForCreateTag() {
        // basic
        HttpRequestDef.Builder<CreateTagRequest, CreateTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagRequest.class, CreateTagResponse.class)
                .withName("CreateTag")
                .withUri("/v3/{domain_id}/ccaas/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getResourceId, CreateTagRequest::setResourceId));
        builder.<CreateTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(CreateTagRequest::getResourceType, CreateTagRequest::setResourceType));
        builder.<CreateTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateTagRequestBody.class),
            f -> f.withMarshaller(CreateTagRequest::getBody, CreateTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagRequest, DeleteTagResponse> deleteTag = genForDeleteTag();

    private static HttpRequestDef<DeleteTagRequest, DeleteTagResponse> genForDeleteTag() {
        // basic
        HttpRequestDef.Builder<DeleteTagRequest, DeleteTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTagRequest.class, DeleteTagResponse.class)
                .withName("DeleteTag")
                .withUri("/v3/{domain_id}/ccaas/{resource_type}/{resource_id}/tags/{tag_key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getResourceId, DeleteTagRequest::setResourceId));
        builder.<String>withRequestField("tag_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getTagKey, DeleteTagRequest::setTagKey));
        builder.<DeleteTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(DeleteTagRequest::getResourceType, DeleteTagRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainTagsRequest, ListDomainTagsResponse> listDomainTags =
        genForListDomainTags();

    private static HttpRequestDef<ListDomainTagsRequest, ListDomainTagsResponse> genForListDomainTags() {
        // basic
        HttpRequestDef.Builder<ListDomainTagsRequest, ListDomainTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainTagsRequest.class, ListDomainTagsResponse.class)
                .withName("ListDomainTags")
                .withUri("/v3/{domain_id}/ccaas/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListDomainTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListDomainTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListDomainTagsRequest::getResourceType, ListDomainTagsRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceByFilterTagRequest, ListResourceByFilterTagResponse> listResourceByFilterTag =
        genForListResourceByFilterTag();

    private static HttpRequestDef<ListResourceByFilterTagRequest, ListResourceByFilterTagResponse> genForListResourceByFilterTag() {
        // basic
        HttpRequestDef.Builder<ListResourceByFilterTagRequest, ListResourceByFilterTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListResourceByFilterTagRequest.class, ListResourceByFilterTagResponse.class)
            .withName("ListResourceByFilterTag")
            .withUri("/v3/{domain_id}/ccaas/{resource_type}/resource-instances/action")
            .withContentType("application/json");

        // requests
        builder.<ListResourceByFilterTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceByFilterTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListResourceByFilterTagRequest::getResourceType,
                ListResourceByFilterTagRequest::setResourceType));
        builder.<ListResourceByFilterTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResourceByFilterTagRequestBody.class),
            f -> f.withMarshaller(ListResourceByFilterTagRequest::getBody, ListResourceByFilterTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForListTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForListTags() {
        // basic
        HttpRequestDef.Builder<ListTagsRequest, ListTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsRequest.class, ListTagsResponse.class)
                .withName("ListTags")
                .withUri("/v3/{domain_id}/ccaas/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListTagsRequest::getResourceType, ListTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getResourceId, ListTagsRequest::setResourceId));

        // response

        return builder.build();
    }

}
