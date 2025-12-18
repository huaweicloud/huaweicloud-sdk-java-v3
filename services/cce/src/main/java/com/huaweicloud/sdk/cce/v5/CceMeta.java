package com.huaweicloud.sdk.cce.v5;

import com.huaweicloud.sdk.cce.v5.model.CreateImageCacheRequest;
import com.huaweicloud.sdk.cce.v5.model.CreateImageCacheRequestBody;
import com.huaweicloud.sdk.cce.v5.model.CreateImageCacheResponse;
import com.huaweicloud.sdk.cce.v5.model.DeleteImageCacheRequest;
import com.huaweicloud.sdk.cce.v5.model.DeleteImageCacheResponse;
import com.huaweicloud.sdk.cce.v5.model.ListImageCachesRequest;
import com.huaweicloud.sdk.cce.v5.model.ListImageCachesResponse;
import com.huaweicloud.sdk.cce.v5.model.ListPackageProductsRequest;
import com.huaweicloud.sdk.cce.v5.model.ListPackageProductsResponse;
import com.huaweicloud.sdk.cce.v5.model.ShowImageCacheRequest;
import com.huaweicloud.sdk.cce.v5.model.ShowImageCacheResponse;
import com.huaweicloud.sdk.cce.v5.model.SubscribePackageProductsRequest;
import com.huaweicloud.sdk.cce.v5.model.SubscribePackageProductsRequestBody;
import com.huaweicloud.sdk.cce.v5.model.SubscribePackageProductsResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CceMeta {

    public static final HttpRequestDef<CreateImageCacheRequest, CreateImageCacheResponse> createImageCache =
        genForCreateImageCache();

    private static HttpRequestDef<CreateImageCacheRequest, CreateImageCacheResponse> genForCreateImageCache() {
        // basic
        HttpRequestDef.Builder<CreateImageCacheRequest, CreateImageCacheResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateImageCacheRequest.class, CreateImageCacheResponse.class)
                .withName("CreateImageCache")
                .withUri("/v5/imagecaches")
                .withContentType("application/json");

        // requests
        builder.<CreateImageCacheRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateImageCacheRequestBody.class),
            f -> f.withMarshaller(CreateImageCacheRequest::getBody, CreateImageCacheRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteImageCacheRequest, DeleteImageCacheResponse> deleteImageCache =
        genForDeleteImageCache();

    private static HttpRequestDef<DeleteImageCacheRequest, DeleteImageCacheResponse> genForDeleteImageCache() {
        // basic
        HttpRequestDef.Builder<DeleteImageCacheRequest, DeleteImageCacheResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteImageCacheRequest.class, DeleteImageCacheResponse.class)
                .withName("DeleteImageCache")
                .withUri("/v5/imagecaches/{image_cache_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_cache_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImageCacheRequest::getImageCacheId, DeleteImageCacheRequest::setImageCacheId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageCachesRequest, ListImageCachesResponse> listImageCaches =
        genForListImageCaches();

    private static HttpRequestDef<ListImageCachesRequest, ListImageCachesResponse> genForListImageCaches() {
        // basic
        HttpRequestDef.Builder<ListImageCachesRequest, ListImageCachesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImageCachesRequest.class, ListImageCachesResponse.class)
                .withName("ListImageCaches")
                .withUri("/v5/imagecaches")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageCachesRequest::getName, ListImageCachesRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPackageProductsRequest, ListPackageProductsResponse> listPackageProducts =
        genForListPackageProducts();

    private static HttpRequestDef<ListPackageProductsRequest, ListPackageProductsResponse> genForListPackageProducts() {
        // basic
        HttpRequestDef.Builder<ListPackageProductsRequest, ListPackageProductsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPackageProductsRequest.class, ListPackageProductsResponse.class)
                .withName("ListPackageProducts")
                .withUri("/v5/package-products")
                .withContentType("application/json");

        // requests
        builder.<ListPackageProductsRequest.LocaleEnum>withRequestField("locale",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPackageProductsRequest.LocaleEnum.class),
            f -> f.withMarshaller(ListPackageProductsRequest::getLocale, ListPackageProductsRequest::setLocale));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageCacheRequest, ShowImageCacheResponse> showImageCache =
        genForShowImageCache();

    private static HttpRequestDef<ShowImageCacheRequest, ShowImageCacheResponse> genForShowImageCache() {
        // basic
        HttpRequestDef.Builder<ShowImageCacheRequest, ShowImageCacheResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowImageCacheRequest.class, ShowImageCacheResponse.class)
                .withName("ShowImageCache")
                .withUri("/v5/imagecaches/{image_cache_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_cache_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCacheRequest::getImageCacheId, ShowImageCacheRequest::setImageCacheId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SubscribePackageProductsRequest, SubscribePackageProductsResponse> subscribePackageProducts =
        genForSubscribePackageProducts();

    private static HttpRequestDef<SubscribePackageProductsRequest, SubscribePackageProductsResponse> genForSubscribePackageProducts() {
        // basic
        HttpRequestDef.Builder<SubscribePackageProductsRequest, SubscribePackageProductsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, SubscribePackageProductsRequest.class, SubscribePackageProductsResponse.class)
                .withName("SubscribePackageProducts")
                .withUri("/v5/package-products/subscribe")
                .withContentType("application/json");

        // requests
        builder.<SubscribePackageProductsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscribePackageProductsRequestBody.class),
            f -> f.withMarshaller(SubscribePackageProductsRequest::getBody, SubscribePackageProductsRequest::setBody));

        // response

        return builder.build();
    }

}
