package com.huaweicloud.sdk.dwr.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dwr.v1.model.CollectionBaseInfo;
import com.huaweicloud.sdk.dwr.v1.model.CreateCollectionBody;
import com.huaweicloud.sdk.dwr.v1.model.CreateCollectionRequest;
import com.huaweicloud.sdk.dwr.v1.model.CreateCollectionResponse;
import com.huaweicloud.sdk.dwr.v1.model.CreateIndexBody;
import com.huaweicloud.sdk.dwr.v1.model.CreateIndexRequest;
import com.huaweicloud.sdk.dwr.v1.model.CreateIndexResponse;
import com.huaweicloud.sdk.dwr.v1.model.CreateStoreBody;
import com.huaweicloud.sdk.dwr.v1.model.CreateStoreRequest;
import com.huaweicloud.sdk.dwr.v1.model.CreateStoreResponse;
import com.huaweicloud.sdk.dwr.v1.model.DeleteCollectionRequest;
import com.huaweicloud.sdk.dwr.v1.model.DeleteCollectionResponse;
import com.huaweicloud.sdk.dwr.v1.model.DeleteEntitiesBody;
import com.huaweicloud.sdk.dwr.v1.model.DeleteEntitiesRequest;
import com.huaweicloud.sdk.dwr.v1.model.DeleteEntitiesResponse;
import com.huaweicloud.sdk.dwr.v1.model.DeleteIndexBody;
import com.huaweicloud.sdk.dwr.v1.model.DeleteIndexRequest;
import com.huaweicloud.sdk.dwr.v1.model.DeleteIndexResponse;
import com.huaweicloud.sdk.dwr.v1.model.DeleteStoreRequest;
import com.huaweicloud.sdk.dwr.v1.model.DeleteStoreResponse;
import com.huaweicloud.sdk.dwr.v1.model.DescribeCollectionRequest;
import com.huaweicloud.sdk.dwr.v1.model.DescribeCollectionResponse;
import com.huaweicloud.sdk.dwr.v1.model.DescribeIndexBody;
import com.huaweicloud.sdk.dwr.v1.model.DescribeIndexRequest;
import com.huaweicloud.sdk.dwr.v1.model.DescribeIndexResponse;
import com.huaweicloud.sdk.dwr.v1.model.DescribeJobBody;
import com.huaweicloud.sdk.dwr.v1.model.DescribeJobRequest;
import com.huaweicloud.sdk.dwr.v1.model.DescribeJobResponse;
import com.huaweicloud.sdk.dwr.v1.model.DescribeStoreRequest;
import com.huaweicloud.sdk.dwr.v1.model.DescribeStoreResponse;
import com.huaweicloud.sdk.dwr.v1.model.GetIndexProgressBody;
import com.huaweicloud.sdk.dwr.v1.model.GetProgressRequest;
import com.huaweicloud.sdk.dwr.v1.model.GetProgressResponse;
import com.huaweicloud.sdk.dwr.v1.model.HybridSearchBody;
import com.huaweicloud.sdk.dwr.v1.model.HybridSearchRequest;
import com.huaweicloud.sdk.dwr.v1.model.HybridSearchResponse;
import com.huaweicloud.sdk.dwr.v1.model.InsertEntitiesBody;
import com.huaweicloud.sdk.dwr.v1.model.InsertEntitiesRequest;
import com.huaweicloud.sdk.dwr.v1.model.InsertEntitiesResponse;
import com.huaweicloud.sdk.dwr.v1.model.ListCollectionsBody;
import com.huaweicloud.sdk.dwr.v1.model.ListCollectionsRequest;
import com.huaweicloud.sdk.dwr.v1.model.ListCollectionsResponse;
import com.huaweicloud.sdk.dwr.v1.model.ListJobsRequest;
import com.huaweicloud.sdk.dwr.v1.model.ListJobsResponse;
import com.huaweicloud.sdk.dwr.v1.model.ListStoresRequest;
import com.huaweicloud.sdk.dwr.v1.model.ListStoresResponse;
import com.huaweicloud.sdk.dwr.v1.model.LoadCollectionBody;
import com.huaweicloud.sdk.dwr.v1.model.LoadCollectionRequest;
import com.huaweicloud.sdk.dwr.v1.model.LoadCollectionResponse;
import com.huaweicloud.sdk.dwr.v1.model.QueryEntitiesBody;
import com.huaweicloud.sdk.dwr.v1.model.QueryEntitiesRequest;
import com.huaweicloud.sdk.dwr.v1.model.QueryEntitiesResponse;
import com.huaweicloud.sdk.dwr.v1.model.ReleaseCollectionRequest;
import com.huaweicloud.sdk.dwr.v1.model.ReleaseCollectionResponse;
import com.huaweicloud.sdk.dwr.v1.model.ScaleStoreBody;
import com.huaweicloud.sdk.dwr.v1.model.ScaleStoreRequest;
import com.huaweicloud.sdk.dwr.v1.model.ScaleStoreResponse;
import com.huaweicloud.sdk.dwr.v1.model.SearchEntitiesBody;
import com.huaweicloud.sdk.dwr.v1.model.SearchEntitiesRequest;
import com.huaweicloud.sdk.dwr.v1.model.SearchEntitiesResponse;
import com.huaweicloud.sdk.dwr.v1.model.StoreInfo;
import com.huaweicloud.sdk.dwr.v1.model.UpsertEntitiesBody;
import com.huaweicloud.sdk.dwr.v1.model.UpsertEntitiesRequest;
import com.huaweicloud.sdk.dwr.v1.model.UpsertEntitiesResponse;

@SuppressWarnings("unchecked")
public class DwrMeta {

    public static final HttpRequestDef<CreateCollectionRequest, CreateCollectionResponse> createCollection =
        genForCreateCollection();

    private static HttpRequestDef<CreateCollectionRequest, CreateCollectionResponse> genForCreateCollection() {
        // basic
        HttpRequestDef.Builder<CreateCollectionRequest, CreateCollectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCollectionRequest.class, CreateCollectionResponse.class)
                .withName("CreateCollection")
                .withUri("/v1/collections/create")
                .withContentType("application/json");

        // requests
        builder.<CreateCollectionBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCollectionBody.class),
            f -> f.withMarshaller(CreateCollectionRequest::getBody, CreateCollectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIndexRequest, CreateIndexResponse> createIndex = genForCreateIndex();

    private static HttpRequestDef<CreateIndexRequest, CreateIndexResponse> genForCreateIndex() {
        // basic
        HttpRequestDef.Builder<CreateIndexRequest, CreateIndexResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateIndexRequest.class, CreateIndexResponse.class)
                .withName("CreateIndex")
                .withUri("/v1/indexes/create")
                .withContentType("application/json");

        // requests
        builder.<CreateIndexBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIndexBody.class),
            f -> f.withMarshaller(CreateIndexRequest::getBody, CreateIndexRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStoreRequest, CreateStoreResponse> createStore = genForCreateStore();

    private static HttpRequestDef<CreateStoreRequest, CreateStoreResponse> genForCreateStore() {
        // basic
        HttpRequestDef.Builder<CreateStoreRequest, CreateStoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateStoreRequest.class, CreateStoreResponse.class)
                .withName("CreateStore")
                .withUri("/v1/stores/create")
                .withContentType("application/json");

        // requests
        builder.<CreateStoreBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateStoreBody.class),
            f -> f.withMarshaller(CreateStoreRequest::getBody, CreateStoreRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCollectionRequest, DeleteCollectionResponse> deleteCollection =
        genForDeleteCollection();

    private static HttpRequestDef<DeleteCollectionRequest, DeleteCollectionResponse> genForDeleteCollection() {
        // basic
        HttpRequestDef.Builder<DeleteCollectionRequest, DeleteCollectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteCollectionRequest.class, DeleteCollectionResponse.class)
                .withName("DeleteCollection")
                .withUri("/v1/collections/delete")
                .withContentType("application/json");

        // requests
        builder.<CollectionBaseInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CollectionBaseInfo.class),
            f -> f.withMarshaller(DeleteCollectionRequest::getBody, DeleteCollectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIndexRequest, DeleteIndexResponse> deleteIndex = genForDeleteIndex();

    private static HttpRequestDef<DeleteIndexRequest, DeleteIndexResponse> genForDeleteIndex() {
        // basic
        HttpRequestDef.Builder<DeleteIndexRequest, DeleteIndexResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteIndexRequest.class, DeleteIndexResponse.class)
                .withName("DeleteIndex")
                .withUri("/v1/indexes/delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteIndexBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteIndexBody.class),
            f -> f.withMarshaller(DeleteIndexRequest::getBody, DeleteIndexRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStoreRequest, DeleteStoreResponse> deleteStore = genForDeleteStore();

    private static HttpRequestDef<DeleteStoreRequest, DeleteStoreResponse> genForDeleteStore() {
        // basic
        HttpRequestDef.Builder<DeleteStoreRequest, DeleteStoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteStoreRequest.class, DeleteStoreResponse.class)
                .withName("DeleteStore")
                .withUri("/v1/stores/delete")
                .withContentType("application/json");

        // requests
        builder.<StoreInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StoreInfo.class),
            f -> f.withMarshaller(DeleteStoreRequest::getBody, DeleteStoreRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribeCollectionRequest, DescribeCollectionResponse> describeCollection =
        genForDescribeCollection();

    private static HttpRequestDef<DescribeCollectionRequest, DescribeCollectionResponse> genForDescribeCollection() {
        // basic
        HttpRequestDef.Builder<DescribeCollectionRequest, DescribeCollectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DescribeCollectionRequest.class, DescribeCollectionResponse.class)
                .withName("DescribeCollection")
                .withUri("/v1/collections/describe")
                .withContentType("application/json");

        // requests
        builder.<CollectionBaseInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CollectionBaseInfo.class),
            f -> f.withMarshaller(DescribeCollectionRequest::getBody, DescribeCollectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribeIndexRequest, DescribeIndexResponse> describeIndex =
        genForDescribeIndex();

    private static HttpRequestDef<DescribeIndexRequest, DescribeIndexResponse> genForDescribeIndex() {
        // basic
        HttpRequestDef.Builder<DescribeIndexRequest, DescribeIndexResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DescribeIndexRequest.class, DescribeIndexResponse.class)
                .withName("DescribeIndex")
                .withUri("/v1/indexes/describe")
                .withContentType("application/json");

        // requests
        builder.<DescribeIndexBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DescribeIndexBody.class),
            f -> f.withMarshaller(DescribeIndexRequest::getBody, DescribeIndexRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribeJobRequest, DescribeJobResponse> describeJob = genForDescribeJob();

    private static HttpRequestDef<DescribeJobRequest, DescribeJobResponse> genForDescribeJob() {
        // basic
        HttpRequestDef.Builder<DescribeJobRequest, DescribeJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DescribeJobRequest.class, DescribeJobResponse.class)
                .withName("DescribeJob")
                .withUri("/v1/jobs/describe")
                .withContentType("application/json");

        // requests
        builder.<DescribeJobBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DescribeJobBody.class),
            f -> f.withMarshaller(DescribeJobRequest::getBody, DescribeJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribeStoreRequest, DescribeStoreResponse> describeStore =
        genForDescribeStore();

    private static HttpRequestDef<DescribeStoreRequest, DescribeStoreResponse> genForDescribeStore() {
        // basic
        HttpRequestDef.Builder<DescribeStoreRequest, DescribeStoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DescribeStoreRequest.class, DescribeStoreResponse.class)
                .withName("DescribeStore")
                .withUri("/v1/stores/describe")
                .withContentType("application/json");

        // requests
        builder.<StoreInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StoreInfo.class),
            f -> f.withMarshaller(DescribeStoreRequest::getBody, DescribeStoreRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetProgressRequest, GetProgressResponse> getProgress = genForGetProgress();

    private static HttpRequestDef<GetProgressRequest, GetProgressResponse> genForGetProgress() {
        // basic
        HttpRequestDef.Builder<GetProgressRequest, GetProgressResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, GetProgressRequest.class, GetProgressResponse.class)
                .withName("GetProgress")
                .withUri("/v1/indexes/get-progress")
                .withContentType("application/json");

        // requests
        builder.<GetIndexProgressBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetIndexProgressBody.class),
            f -> f.withMarshaller(GetProgressRequest::getBody, GetProgressRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCollectionsRequest, ListCollectionsResponse> listCollections =
        genForListCollections();

    private static HttpRequestDef<ListCollectionsRequest, ListCollectionsResponse> genForListCollections() {
        // basic
        HttpRequestDef.Builder<ListCollectionsRequest, ListCollectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListCollectionsRequest.class, ListCollectionsResponse.class)
                .withName("ListCollections")
                .withUri("/v1/collections/list")
                .withContentType("application/json");

        // requests
        builder.<ListCollectionsBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListCollectionsBody.class),
            f -> f.withMarshaller(ListCollectionsRequest::getBody, ListCollectionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobsRequest, ListJobsResponse> listJobs = genForListJobs();

    private static HttpRequestDef<ListJobsRequest, ListJobsResponse> genForListJobs() {
        // basic
        HttpRequestDef.Builder<ListJobsRequest, ListJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListJobsRequest.class, ListJobsResponse.class)
                .withName("ListJobs")
                .withUri("/v1/jobs/list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getStartTime, ListJobsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getEndTime, ListJobsRequest::setEndTime));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getStatus, ListJobsRequest::setStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobsRequest::getOffset, ListJobsRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getLimit, ListJobsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStoresRequest, ListStoresResponse> listStores = genForListStores();

    private static HttpRequestDef<ListStoresRequest, ListStoresResponse> genForListStores() {
        // basic
        HttpRequestDef.Builder<ListStoresRequest, ListStoresResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListStoresRequest.class, ListStoresResponse.class)
                .withName("ListStores")
                .withUri("/v1/stores/list")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LoadCollectionRequest, LoadCollectionResponse> loadCollection =
        genForLoadCollection();

    private static HttpRequestDef<LoadCollectionRequest, LoadCollectionResponse> genForLoadCollection() {
        // basic
        HttpRequestDef.Builder<LoadCollectionRequest, LoadCollectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, LoadCollectionRequest.class, LoadCollectionResponse.class)
                .withName("LoadCollection")
                .withUri("/v1/collections/load")
                .withContentType("application/json");

        // requests
        builder.<LoadCollectionBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LoadCollectionBody.class),
            f -> f.withMarshaller(LoadCollectionRequest::getBody, LoadCollectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ReleaseCollectionRequest, ReleaseCollectionResponse> releaseCollection =
        genForReleaseCollection();

    private static HttpRequestDef<ReleaseCollectionRequest, ReleaseCollectionResponse> genForReleaseCollection() {
        // basic
        HttpRequestDef.Builder<ReleaseCollectionRequest, ReleaseCollectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ReleaseCollectionRequest.class, ReleaseCollectionResponse.class)
                .withName("ReleaseCollection")
                .withUri("/v1/collections/release")
                .withContentType("application/json");

        // requests
        builder.<CollectionBaseInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CollectionBaseInfo.class),
            f -> f.withMarshaller(ReleaseCollectionRequest::getBody, ReleaseCollectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ScaleStoreRequest, ScaleStoreResponse> scaleStore = genForScaleStore();

    private static HttpRequestDef<ScaleStoreRequest, ScaleStoreResponse> genForScaleStore() {
        // basic
        HttpRequestDef.Builder<ScaleStoreRequest, ScaleStoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ScaleStoreRequest.class, ScaleStoreResponse.class)
                .withName("ScaleStore")
                .withUri("/v1/stores/scale")
                .withContentType("application/json");

        // requests
        builder.<ScaleStoreBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ScaleStoreBody.class),
            f -> f.withMarshaller(ScaleStoreRequest::getBody, ScaleStoreRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEntitiesRequest, DeleteEntitiesResponse> deleteEntities =
        genForDeleteEntities();

    private static HttpRequestDef<DeleteEntitiesRequest, DeleteEntitiesResponse> genForDeleteEntities() {
        // basic
        HttpRequestDef.Builder<DeleteEntitiesRequest, DeleteEntitiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteEntitiesRequest.class, DeleteEntitiesResponse.class)
                .withName("DeleteEntities")
                .withUri("/v1/entities/delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteEntitiesBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteEntitiesBody.class),
            f -> f.withMarshaller(DeleteEntitiesRequest::getBody, DeleteEntitiesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<HybridSearchRequest, HybridSearchResponse> hybridSearch = genForHybridSearch();

    private static HttpRequestDef<HybridSearchRequest, HybridSearchResponse> genForHybridSearch() {
        // basic
        HttpRequestDef.Builder<HybridSearchRequest, HybridSearchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, HybridSearchRequest.class, HybridSearchResponse.class)
                .withName("HybridSearch")
                .withUri("/v1/entities/hybrid-search")
                .withContentType("application/json");

        // requests
        builder.<HybridSearchBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HybridSearchBody.class),
            f -> f.withMarshaller(HybridSearchRequest::getBody, HybridSearchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InsertEntitiesRequest, InsertEntitiesResponse> insertEntities =
        genForInsertEntities();

    private static HttpRequestDef<InsertEntitiesRequest, InsertEntitiesResponse> genForInsertEntities() {
        // basic
        HttpRequestDef.Builder<InsertEntitiesRequest, InsertEntitiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InsertEntitiesRequest.class, InsertEntitiesResponse.class)
                .withName("InsertEntities")
                .withUri("/v1/entities/insert")
                .withContentType("application/json");

        // requests
        builder.<InsertEntitiesBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InsertEntitiesBody.class),
            f -> f.withMarshaller(InsertEntitiesRequest::getBody, InsertEntitiesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<QueryEntitiesRequest, QueryEntitiesResponse> queryEntities =
        genForQueryEntities();

    private static HttpRequestDef<QueryEntitiesRequest, QueryEntitiesResponse> genForQueryEntities() {
        // basic
        HttpRequestDef.Builder<QueryEntitiesRequest, QueryEntitiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, QueryEntitiesRequest.class, QueryEntitiesResponse.class)
                .withName("QueryEntities")
                .withUri("/v1/entities/query")
                .withContentType("application/json");

        // requests
        builder.<QueryEntitiesBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryEntitiesBody.class),
            f -> f.withMarshaller(QueryEntitiesRequest::getBody, QueryEntitiesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchEntitiesRequest, SearchEntitiesResponse> searchEntities =
        genForSearchEntities();

    private static HttpRequestDef<SearchEntitiesRequest, SearchEntitiesResponse> genForSearchEntities() {
        // basic
        HttpRequestDef.Builder<SearchEntitiesRequest, SearchEntitiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchEntitiesRequest.class, SearchEntitiesResponse.class)
                .withName("SearchEntities")
                .withUri("/v1/entities/search")
                .withContentType("application/json");

        // requests
        builder.<SearchEntitiesBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchEntitiesBody.class),
            f -> f.withMarshaller(SearchEntitiesRequest::getBody, SearchEntitiesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpsertEntitiesRequest, UpsertEntitiesResponse> upsertEntities =
        genForUpsertEntities();

    private static HttpRequestDef<UpsertEntitiesRequest, UpsertEntitiesResponse> genForUpsertEntities() {
        // basic
        HttpRequestDef.Builder<UpsertEntitiesRequest, UpsertEntitiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpsertEntitiesRequest.class, UpsertEntitiesResponse.class)
                .withName("UpsertEntities")
                .withUri("/v1/entities/upsert")
                .withContentType("application/json");

        // requests
        builder.<UpsertEntitiesBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpsertEntitiesBody.class),
            f -> f.withMarshaller(UpsertEntitiesRequest::getBody, UpsertEntitiesRequest::setBody));

        // response

        return builder.build();
    }

}
