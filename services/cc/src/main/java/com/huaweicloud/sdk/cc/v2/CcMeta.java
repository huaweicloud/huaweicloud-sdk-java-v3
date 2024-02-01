package com.huaweicloud.sdk.cc.v2;

import com.huaweicloud.sdk.cc.v2.model.BatchCreateDeleteTagsRequest;
import com.huaweicloud.sdk.cc.v2.model.BatchCreateDeleteTagsResponse;
import com.huaweicloud.sdk.cc.v2.model.BatchCreateGcbResourceTagsRequest;
import com.huaweicloud.sdk.cc.v2.model.BatchCreateGcbResourceTagsResponse;
import com.huaweicloud.sdk.cc.v2.model.BatchDeleteGcbResourceTagsRequest;
import com.huaweicloud.sdk.cc.v2.model.BatchDeleteGcbResourceTagsResponse;
import com.huaweicloud.sdk.cc.v2.model.CountGcbResourceByTagRequest;
import com.huaweicloud.sdk.cc.v2.model.CountGcbResourceByTagResponse;
import com.huaweicloud.sdk.cc.v2.model.CreateDeleteGcbTagsRequestBody;
import com.huaweicloud.sdk.cc.v2.model.CreateGcbResourceTagRequest;
import com.huaweicloud.sdk.cc.v2.model.CreateGcbResourceTagResponse;
import com.huaweicloud.sdk.cc.v2.model.CreateGcbTagRequestBody;
import com.huaweicloud.sdk.cc.v2.model.CreateTagRequest;
import com.huaweicloud.sdk.cc.v2.model.CreateTagRequestBody;
import com.huaweicloud.sdk.cc.v2.model.CreateTagResponse;
import com.huaweicloud.sdk.cc.v2.model.DeleteGcbResourceTagRequest;
import com.huaweicloud.sdk.cc.v2.model.DeleteGcbResourceTagResponse;
import com.huaweicloud.sdk.cc.v2.model.DeleteTagRequest;
import com.huaweicloud.sdk.cc.v2.model.DeleteTagResponse;
import com.huaweicloud.sdk.cc.v2.model.ListDomainTagsRequest;
import com.huaweicloud.sdk.cc.v2.model.ListDomainTagsResponse;
import com.huaweicloud.sdk.cc.v2.model.ListGcbResourceByTagRequest;
import com.huaweicloud.sdk.cc.v2.model.ListGcbResourceByTagResponse;
import com.huaweicloud.sdk.cc.v2.model.ListGcbResourceTagsRequest;
import com.huaweicloud.sdk.cc.v2.model.ListGcbResourceTagsResponse;
import com.huaweicloud.sdk.cc.v2.model.ListGcbTenantTagsRequest;
import com.huaweicloud.sdk.cc.v2.model.ListGcbTenantTagsResponse;
import com.huaweicloud.sdk.cc.v2.model.ListResourceByFilterTagRequest;
import com.huaweicloud.sdk.cc.v2.model.ListResourceByFilterTagRequestBody;
import com.huaweicloud.sdk.cc.v2.model.ListResourceByFilterTagResponse;
import com.huaweicloud.sdk.cc.v2.model.ListTagsRequest;
import com.huaweicloud.sdk.cc.v2.model.ListTagsResponse;
import com.huaweicloud.sdk.cc.v2.model.QueryResourceByTagRequestBody;
import com.huaweicloud.sdk.cc.v2.model.ResourceTags;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CcMeta {

    public static final HttpRequestDef<BatchCreateGcbResourceTagsRequest, BatchCreateGcbResourceTagsResponse> batchCreateGcbResourceTags =
        genForBatchCreateGcbResourceTags();

    private static HttpRequestDef<BatchCreateGcbResourceTagsRequest, BatchCreateGcbResourceTagsResponse> genForBatchCreateGcbResourceTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateGcbResourceTagsRequest, BatchCreateGcbResourceTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateGcbResourceTagsRequest.class,
                    BatchCreateGcbResourceTagsResponse.class)
                .withName("BatchCreateGcbResourceTags")
                .withUri("/v3/gcb/{resource_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateGcbResourceTagsRequest::getResourceId,
                BatchCreateGcbResourceTagsRequest::setResourceId));
        builder.<CreateDeleteGcbTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDeleteGcbTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateGcbResourceTagsRequest::getBody,
                BatchCreateGcbResourceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteGcbResourceTagsRequest, BatchDeleteGcbResourceTagsResponse> batchDeleteGcbResourceTags =
        genForBatchDeleteGcbResourceTags();

    private static HttpRequestDef<BatchDeleteGcbResourceTagsRequest, BatchDeleteGcbResourceTagsResponse> genForBatchDeleteGcbResourceTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteGcbResourceTagsRequest, BatchDeleteGcbResourceTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteGcbResourceTagsRequest.class,
                    BatchDeleteGcbResourceTagsResponse.class)
                .withName("BatchDeleteGcbResourceTags")
                .withUri("/v3/gcb/{resource_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteGcbResourceTagsRequest::getResourceId,
                BatchDeleteGcbResourceTagsRequest::setResourceId));
        builder.<CreateDeleteGcbTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDeleteGcbTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteGcbResourceTagsRequest::getBody,
                BatchDeleteGcbResourceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountGcbResourceByTagRequest, CountGcbResourceByTagResponse> countGcbResourceByTag =
        genForCountGcbResourceByTag();

    private static HttpRequestDef<CountGcbResourceByTagRequest, CountGcbResourceByTagResponse> genForCountGcbResourceByTag() {
        // basic
        HttpRequestDef.Builder<CountGcbResourceByTagRequest, CountGcbResourceByTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CountGcbResourceByTagRequest.class, CountGcbResourceByTagResponse.class)
            .withName("CountGcbResourceByTag")
            .withUri("/v3/gcb/resource-instances/count")
            .withContentType("application/json");

        // requests
        builder.<QueryResourceByTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryResourceByTagRequestBody.class),
            f -> f.withMarshaller(CountGcbResourceByTagRequest::getBody, CountGcbResourceByTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGcbResourceTagRequest, CreateGcbResourceTagResponse> createGcbResourceTag =
        genForCreateGcbResourceTag();

    private static HttpRequestDef<CreateGcbResourceTagRequest, CreateGcbResourceTagResponse> genForCreateGcbResourceTag() {
        // basic
        HttpRequestDef.Builder<CreateGcbResourceTagRequest, CreateGcbResourceTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateGcbResourceTagRequest.class, CreateGcbResourceTagResponse.class)
            .withName("CreateGcbResourceTag")
            .withUri("/v3/gcb/{resource_id}/tags")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGcbResourceTagRequest::getResourceId,
                CreateGcbResourceTagRequest::setResourceId));
        builder.<CreateGcbTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGcbTagRequestBody.class),
            f -> f.withMarshaller(CreateGcbResourceTagRequest::getBody, CreateGcbResourceTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGcbResourceTagRequest, DeleteGcbResourceTagResponse> deleteGcbResourceTag =
        genForDeleteGcbResourceTag();

    private static HttpRequestDef<DeleteGcbResourceTagRequest, DeleteGcbResourceTagResponse> genForDeleteGcbResourceTag() {
        // basic
        HttpRequestDef.Builder<DeleteGcbResourceTagRequest, DeleteGcbResourceTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteGcbResourceTagRequest.class, DeleteGcbResourceTagResponse.class)
            .withName("DeleteGcbResourceTag")
            .withUri("/v3/gcb/{resource_id}/tags/{tag_key}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGcbResourceTagRequest::getResourceId,
                DeleteGcbResourceTagRequest::setResourceId));
        builder.<String>withRequestField("tag_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGcbResourceTagRequest::getTagKey, DeleteGcbResourceTagRequest::setTagKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGcbResourceByTagRequest, ListGcbResourceByTagResponse> listGcbResourceByTag =
        genForListGcbResourceByTag();

    private static HttpRequestDef<ListGcbResourceByTagRequest, ListGcbResourceByTagResponse> genForListGcbResourceByTag() {
        // basic
        HttpRequestDef.Builder<ListGcbResourceByTagRequest, ListGcbResourceByTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListGcbResourceByTagRequest.class, ListGcbResourceByTagResponse.class)
            .withName("ListGcbResourceByTag")
            .withUri("/v3/gcb/resource-instances/filter")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGcbResourceByTagRequest::getLimit, ListGcbResourceByTagRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGcbResourceByTagRequest::getOffset, ListGcbResourceByTagRequest::setOffset));
        builder.<QueryResourceByTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryResourceByTagRequestBody.class),
            f -> f.withMarshaller(ListGcbResourceByTagRequest::getBody, ListGcbResourceByTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGcbResourceTagsRequest, ListGcbResourceTagsResponse> listGcbResourceTags =
        genForListGcbResourceTags();

    private static HttpRequestDef<ListGcbResourceTagsRequest, ListGcbResourceTagsResponse> genForListGcbResourceTags() {
        // basic
        HttpRequestDef.Builder<ListGcbResourceTagsRequest, ListGcbResourceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGcbResourceTagsRequest.class, ListGcbResourceTagsResponse.class)
                .withName("ListGcbResourceTags")
                .withUri("/v3/gcb/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGcbResourceTagsRequest::getResourceId,
                ListGcbResourceTagsRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGcbTenantTagsRequest, ListGcbTenantTagsResponse> listGcbTenantTags =
        genForListGcbTenantTags();

    private static HttpRequestDef<ListGcbTenantTagsRequest, ListGcbTenantTagsResponse> genForListGcbTenantTags() {
        // basic
        HttpRequestDef.Builder<ListGcbTenantTagsRequest, ListGcbTenantTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGcbTenantTagsRequest.class, ListGcbTenantTagsResponse.class)
                .withName("ListGcbTenantTags")
                .withUri("/v3/gcb/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

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
