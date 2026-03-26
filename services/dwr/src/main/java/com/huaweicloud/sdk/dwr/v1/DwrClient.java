package com.huaweicloud.sdk.dwr.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dwr.v1.model.CreateCollectionRequest;
import com.huaweicloud.sdk.dwr.v1.model.CreateCollectionResponse;
import com.huaweicloud.sdk.dwr.v1.model.CreateIndexRequest;
import com.huaweicloud.sdk.dwr.v1.model.CreateIndexResponse;
import com.huaweicloud.sdk.dwr.v1.model.CreateStoreRequest;
import com.huaweicloud.sdk.dwr.v1.model.CreateStoreResponse;
import com.huaweicloud.sdk.dwr.v1.model.DeleteCollectionRequest;
import com.huaweicloud.sdk.dwr.v1.model.DeleteCollectionResponse;
import com.huaweicloud.sdk.dwr.v1.model.DeleteEntitiesRequest;
import com.huaweicloud.sdk.dwr.v1.model.DeleteEntitiesResponse;
import com.huaweicloud.sdk.dwr.v1.model.DeleteIndexRequest;
import com.huaweicloud.sdk.dwr.v1.model.DeleteIndexResponse;
import com.huaweicloud.sdk.dwr.v1.model.DeleteStoreRequest;
import com.huaweicloud.sdk.dwr.v1.model.DeleteStoreResponse;
import com.huaweicloud.sdk.dwr.v1.model.DescribeCollectionRequest;
import com.huaweicloud.sdk.dwr.v1.model.DescribeCollectionResponse;
import com.huaweicloud.sdk.dwr.v1.model.DescribeIndexRequest;
import com.huaweicloud.sdk.dwr.v1.model.DescribeIndexResponse;
import com.huaweicloud.sdk.dwr.v1.model.DescribeJobRequest;
import com.huaweicloud.sdk.dwr.v1.model.DescribeJobResponse;
import com.huaweicloud.sdk.dwr.v1.model.DescribeStoreRequest;
import com.huaweicloud.sdk.dwr.v1.model.DescribeStoreResponse;
import com.huaweicloud.sdk.dwr.v1.model.GetProgressRequest;
import com.huaweicloud.sdk.dwr.v1.model.GetProgressResponse;
import com.huaweicloud.sdk.dwr.v1.model.HybridSearchRequest;
import com.huaweicloud.sdk.dwr.v1.model.HybridSearchResponse;
import com.huaweicloud.sdk.dwr.v1.model.InsertEntitiesRequest;
import com.huaweicloud.sdk.dwr.v1.model.InsertEntitiesResponse;
import com.huaweicloud.sdk.dwr.v1.model.ListCollectionsRequest;
import com.huaweicloud.sdk.dwr.v1.model.ListCollectionsResponse;
import com.huaweicloud.sdk.dwr.v1.model.ListJobsRequest;
import com.huaweicloud.sdk.dwr.v1.model.ListJobsResponse;
import com.huaweicloud.sdk.dwr.v1.model.ListStoresRequest;
import com.huaweicloud.sdk.dwr.v1.model.ListStoresResponse;
import com.huaweicloud.sdk.dwr.v1.model.LoadCollectionRequest;
import com.huaweicloud.sdk.dwr.v1.model.LoadCollectionResponse;
import com.huaweicloud.sdk.dwr.v1.model.QueryEntitiesRequest;
import com.huaweicloud.sdk.dwr.v1.model.QueryEntitiesResponse;
import com.huaweicloud.sdk.dwr.v1.model.ReleaseCollectionRequest;
import com.huaweicloud.sdk.dwr.v1.model.ReleaseCollectionResponse;
import com.huaweicloud.sdk.dwr.v1.model.ScaleStoreRequest;
import com.huaweicloud.sdk.dwr.v1.model.ScaleStoreResponse;
import com.huaweicloud.sdk.dwr.v1.model.SearchEntitiesRequest;
import com.huaweicloud.sdk.dwr.v1.model.SearchEntitiesResponse;
import com.huaweicloud.sdk.dwr.v1.model.UpsertEntitiesRequest;
import com.huaweicloud.sdk.dwr.v1.model.UpsertEntitiesResponse;

public class DwrClient {

    protected HcClient hcClient;

    public DwrClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DwrClient> newBuilder() {
        ClientBuilder<DwrClient> clientBuilder = new ClientBuilder<>(DwrClient::new);
        return clientBuilder;
    }

    /**
     * 创建collection
     *
     * 在知识仓实例下创建collection。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectionRequest 请求对象
     * @return CreateCollectionResponse
     */
    public CreateCollectionResponse createCollection(CreateCollectionRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.createCollection);
    }

    /**
     * 创建collection
     *
     * 在知识仓实例下创建collection。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectionRequest 请求对象
     * @return SyncInvoker<CreateCollectionRequest, CreateCollectionResponse>
     */
    public SyncInvoker<CreateCollectionRequest, CreateCollectionResponse> createCollectionInvoker(
        CreateCollectionRequest request) {
        return new SyncInvoker<>(request, DwrMeta.createCollection, hcClient);
    }

    /**
     * 创建索引
     *
     * 在指定的collection中，按照参数创建索引。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIndexRequest 请求对象
     * @return CreateIndexResponse
     */
    public CreateIndexResponse createIndex(CreateIndexRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.createIndex);
    }

    /**
     * 创建索引
     *
     * 在指定的collection中，按照参数创建索引。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIndexRequest 请求对象
     * @return SyncInvoker<CreateIndexRequest, CreateIndexResponse>
     */
    public SyncInvoker<CreateIndexRequest, CreateIndexResponse> createIndexInvoker(CreateIndexRequest request) {
        return new SyncInvoker<>(request, DwrMeta.createIndex, hcClient);
    }

    /**
     * 创建知识仓实例
     *
     * 创建知识仓实例。知识仓实例名称region内唯一。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStoreRequest 请求对象
     * @return CreateStoreResponse
     */
    public CreateStoreResponse createStore(CreateStoreRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.createStore);
    }

    /**
     * 创建知识仓实例
     *
     * 创建知识仓实例。知识仓实例名称region内唯一。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStoreRequest 请求对象
     * @return SyncInvoker<CreateStoreRequest, CreateStoreResponse>
     */
    public SyncInvoker<CreateStoreRequest, CreateStoreResponse> createStoreInvoker(CreateStoreRequest request) {
        return new SyncInvoker<>(request, DwrMeta.createStore, hcClient);
    }

    /**
     * 删除collection
     *
     * 在知识仓实例下删除指定的collection。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCollectionRequest 请求对象
     * @return DeleteCollectionResponse
     */
    public DeleteCollectionResponse deleteCollection(DeleteCollectionRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.deleteCollection);
    }

    /**
     * 删除collection
     *
     * 在知识仓实例下删除指定的collection。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCollectionRequest 请求对象
     * @return SyncInvoker<DeleteCollectionRequest, DeleteCollectionResponse>
     */
    public SyncInvoker<DeleteCollectionRequest, DeleteCollectionResponse> deleteCollectionInvoker(
        DeleteCollectionRequest request) {
        return new SyncInvoker<>(request, DwrMeta.deleteCollection, hcClient);
    }

    /**
     * 删除索引
     *
     * 删除指定索引。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIndexRequest 请求对象
     * @return DeleteIndexResponse
     */
    public DeleteIndexResponse deleteIndex(DeleteIndexRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.deleteIndex);
    }

    /**
     * 删除索引
     *
     * 删除指定索引。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIndexRequest 请求对象
     * @return SyncInvoker<DeleteIndexRequest, DeleteIndexResponse>
     */
    public SyncInvoker<DeleteIndexRequest, DeleteIndexResponse> deleteIndexInvoker(DeleteIndexRequest request) {
        return new SyncInvoker<>(request, DwrMeta.deleteIndex, hcClient);
    }

    /**
     * 删除知识仓实例
     *
     * 删除指定的知识仓实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStoreRequest 请求对象
     * @return DeleteStoreResponse
     */
    public DeleteStoreResponse deleteStore(DeleteStoreRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.deleteStore);
    }

    /**
     * 删除知识仓实例
     *
     * 删除指定的知识仓实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStoreRequest 请求对象
     * @return SyncInvoker<DeleteStoreRequest, DeleteStoreResponse>
     */
    public SyncInvoker<DeleteStoreRequest, DeleteStoreResponse> deleteStoreInvoker(DeleteStoreRequest request) {
        return new SyncInvoker<>(request, DwrMeta.deleteStore, hcClient);
    }

    /**
     * 查询collection
     *
     * 在知识仓实例下查询指定的collection的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeCollectionRequest 请求对象
     * @return DescribeCollectionResponse
     */
    public DescribeCollectionResponse describeCollection(DescribeCollectionRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.describeCollection);
    }

    /**
     * 查询collection
     *
     * 在知识仓实例下查询指定的collection的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeCollectionRequest 请求对象
     * @return SyncInvoker<DescribeCollectionRequest, DescribeCollectionResponse>
     */
    public SyncInvoker<DescribeCollectionRequest, DescribeCollectionResponse> describeCollectionInvoker(
        DescribeCollectionRequest request) {
        return new SyncInvoker<>(request, DwrMeta.describeCollection, hcClient);
    }

    /**
     * 查询索引
     *
     * 查询指定索引的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeIndexRequest 请求对象
     * @return DescribeIndexResponse
     */
    public DescribeIndexResponse describeIndex(DescribeIndexRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.describeIndex);
    }

    /**
     * 查询索引
     *
     * 查询指定索引的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeIndexRequest 请求对象
     * @return SyncInvoker<DescribeIndexRequest, DescribeIndexResponse>
     */
    public SyncInvoker<DescribeIndexRequest, DescribeIndexResponse> describeIndexInvoker(DescribeIndexRequest request) {
        return new SyncInvoker<>(request, DwrMeta.describeIndex, hcClient);
    }

    /**
     * 获取指定ID任务信息
     *
     * 根据指定的jobid查询任务信息。用于在创建和删除知识仓实例操作执行成功后，通过响应中返回的job_id，来查询创建和删除知识仓实例执行的具体结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeJobRequest 请求对象
     * @return DescribeJobResponse
     */
    public DescribeJobResponse describeJob(DescribeJobRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.describeJob);
    }

    /**
     * 获取指定ID任务信息
     *
     * 根据指定的jobid查询任务信息。用于在创建和删除知识仓实例操作执行成功后，通过响应中返回的job_id，来查询创建和删除知识仓实例执行的具体结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeJobRequest 请求对象
     * @return SyncInvoker<DescribeJobRequest, DescribeJobResponse>
     */
    public SyncInvoker<DescribeJobRequest, DescribeJobResponse> describeJobInvoker(DescribeJobRequest request) {
        return new SyncInvoker<>(request, DwrMeta.describeJob, hcClient);
    }

    /**
     * 查询知识仓实例
     *
     * 查询指定知识仓实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeStoreRequest 请求对象
     * @return DescribeStoreResponse
     */
    public DescribeStoreResponse describeStore(DescribeStoreRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.describeStore);
    }

    /**
     * 查询知识仓实例
     *
     * 查询指定知识仓实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeStoreRequest 请求对象
     * @return SyncInvoker<DescribeStoreRequest, DescribeStoreResponse>
     */
    public SyncInvoker<DescribeStoreRequest, DescribeStoreResponse> describeStoreInvoker(DescribeStoreRequest request) {
        return new SyncInvoker<>(request, DwrMeta.describeStore, hcClient);
    }

    /**
     * 查询索引构建进度
     *
     * 查询指定索引的构建进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetProgressRequest 请求对象
     * @return GetProgressResponse
     */
    public GetProgressResponse getProgress(GetProgressRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.getProgress);
    }

    /**
     * 查询索引构建进度
     *
     * 查询指定索引的构建进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetProgressRequest 请求对象
     * @return SyncInvoker<GetProgressRequest, GetProgressResponse>
     */
    public SyncInvoker<GetProgressRequest, GetProgressResponse> getProgressInvoker(GetProgressRequest request) {
        return new SyncInvoker<>(request, DwrMeta.getProgress, hcClient);
    }

    /**
     * 列举collection
     *
     * 列举指定知识仓实例中所有的collections。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectionsRequest 请求对象
     * @return ListCollectionsResponse
     */
    public ListCollectionsResponse listCollections(ListCollectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.listCollections);
    }

    /**
     * 列举collection
     *
     * 列举指定知识仓实例中所有的collections。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectionsRequest 请求对象
     * @return SyncInvoker<ListCollectionsRequest, ListCollectionsResponse>
     */
    public SyncInvoker<ListCollectionsRequest, ListCollectionsResponse> listCollectionsInvoker(
        ListCollectionsRequest request) {
        return new SyncInvoker<>(request, DwrMeta.listCollections, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 根据指定条件查询列举任务的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.listJobs);
    }

    /**
     * 查询任务列表
     *
     * 根据指定条件查询列举任务的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return SyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public SyncInvoker<ListJobsRequest, ListJobsResponse> listJobsInvoker(ListJobsRequest request) {
        return new SyncInvoker<>(request, DwrMeta.listJobs, hcClient);
    }

    /**
     * 列举知识仓实例
     *
     * 列举租户所有的知识仓实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoresRequest 请求对象
     * @return ListStoresResponse
     */
    public ListStoresResponse listStores(ListStoresRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.listStores);
    }

    /**
     * 列举知识仓实例
     *
     * 列举租户所有的知识仓实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoresRequest 请求对象
     * @return SyncInvoker<ListStoresRequest, ListStoresResponse>
     */
    public SyncInvoker<ListStoresRequest, ListStoresResponse> listStoresInvoker(ListStoresRequest request) {
        return new SyncInvoker<>(request, DwrMeta.listStores, hcClient);
    }

    /**
     * 加载collection
     *
     * 加载指定collection的数据。加载成功后，才能执行查询操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LoadCollectionRequest 请求对象
     * @return LoadCollectionResponse
     */
    public LoadCollectionResponse loadCollection(LoadCollectionRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.loadCollection);
    }

    /**
     * 加载collection
     *
     * 加载指定collection的数据。加载成功后，才能执行查询操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LoadCollectionRequest 请求对象
     * @return SyncInvoker<LoadCollectionRequest, LoadCollectionResponse>
     */
    public SyncInvoker<LoadCollectionRequest, LoadCollectionResponse> loadCollectionInvoker(
        LoadCollectionRequest request) {
        return new SyncInvoker<>(request, DwrMeta.loadCollection, hcClient);
    }

    /**
     * 卸载collection
     *
     * 卸载已加载collection的数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReleaseCollectionRequest 请求对象
     * @return ReleaseCollectionResponse
     */
    public ReleaseCollectionResponse releaseCollection(ReleaseCollectionRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.releaseCollection);
    }

    /**
     * 卸载collection
     *
     * 卸载已加载collection的数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReleaseCollectionRequest 请求对象
     * @return SyncInvoker<ReleaseCollectionRequest, ReleaseCollectionResponse>
     */
    public SyncInvoker<ReleaseCollectionRequest, ReleaseCollectionResponse> releaseCollectionInvoker(
        ReleaseCollectionRequest request) {
        return new SyncInvoker<>(request, DwrMeta.releaseCollection, hcClient);
    }

    /**
     * 变更知识仓实例
     *
     * 对指定的知识仓实例进行扩容或缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScaleStoreRequest 请求对象
     * @return ScaleStoreResponse
     */
    public ScaleStoreResponse scaleStore(ScaleStoreRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.scaleStore);
    }

    /**
     * 变更知识仓实例
     *
     * 对指定的知识仓实例进行扩容或缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScaleStoreRequest 请求对象
     * @return SyncInvoker<ScaleStoreRequest, ScaleStoreResponse>
     */
    public SyncInvoker<ScaleStoreRequest, ScaleStoreResponse> scaleStoreInvoker(ScaleStoreRequest request) {
        return new SyncInvoker<>(request, DwrMeta.scaleStore, hcClient);
    }

    /**
     * 删除向量
     *
     * 在指定的collection中删除一个或多个Entity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEntitiesRequest 请求对象
     * @return DeleteEntitiesResponse
     */
    public DeleteEntitiesResponse deleteEntities(DeleteEntitiesRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.deleteEntities);
    }

    /**
     * 删除向量
     *
     * 在指定的collection中删除一个或多个Entity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEntitiesRequest 请求对象
     * @return SyncInvoker<DeleteEntitiesRequest, DeleteEntitiesResponse>
     */
    public SyncInvoker<DeleteEntitiesRequest, DeleteEntitiesResponse> deleteEntitiesInvoker(
        DeleteEntitiesRequest request) {
        return new SyncInvoker<>(request, DwrMeta.deleteEntities, hcClient);
    }

    /**
     * 混合搜索
     *
     * 基于相似度匹配的查询方式，用于查找与给定多个向量进行相似性搜索，支持密集向量，稀疏向量等多路召回，并对结果进行重排处理，最终返回指定的 Top K 个最相似的 Entity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HybridSearchRequest 请求对象
     * @return HybridSearchResponse
     */
    public HybridSearchResponse hybridSearch(HybridSearchRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.hybridSearch);
    }

    /**
     * 混合搜索
     *
     * 基于相似度匹配的查询方式，用于查找与给定多个向量进行相似性搜索，支持密集向量，稀疏向量等多路召回，并对结果进行重排处理，最终返回指定的 Top K 个最相似的 Entity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HybridSearchRequest 请求对象
     * @return SyncInvoker<HybridSearchRequest, HybridSearchResponse>
     */
    public SyncInvoker<HybridSearchRequest, HybridSearchResponse> hybridSearchInvoker(HybridSearchRequest request) {
        return new SyncInvoker<>(request, DwrMeta.hybridSearch, hcClient);
    }

    /**
     * 插入向量
     *
     * 在指定的collection中插入一个或多个Entity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InsertEntitiesRequest 请求对象
     * @return InsertEntitiesResponse
     */
    public InsertEntitiesResponse insertEntities(InsertEntitiesRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.insertEntities);
    }

    /**
     * 插入向量
     *
     * 在指定的collection中插入一个或多个Entity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InsertEntitiesRequest 请求对象
     * @return SyncInvoker<InsertEntitiesRequest, InsertEntitiesResponse>
     */
    public SyncInvoker<InsertEntitiesRequest, InsertEntitiesResponse> insertEntitiesInvoker(
        InsertEntitiesRequest request) {
        return new SyncInvoker<>(request, DwrMeta.insertEntities, hcClient);
    }

    /**
     * 标量查询
     *
     * 接口用于精确查找与查询条件完全匹配的向量，此操作使用指定的布尔表达式对标量字段进行筛选。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request QueryEntitiesRequest 请求对象
     * @return QueryEntitiesResponse
     */
    public QueryEntitiesResponse queryEntities(QueryEntitiesRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.queryEntities);
    }

    /**
     * 标量查询
     *
     * 接口用于精确查找与查询条件完全匹配的向量，此操作使用指定的布尔表达式对标量字段进行筛选。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request QueryEntitiesRequest 请求对象
     * @return SyncInvoker<QueryEntitiesRequest, QueryEntitiesResponse>
     */
    public SyncInvoker<QueryEntitiesRequest, QueryEntitiesResponse> queryEntitiesInvoker(QueryEntitiesRequest request) {
        return new SyncInvoker<>(request, DwrMeta.queryEntities, hcClient);
    }

    /**
     * 向量查询
     *
     * 基于相似度匹配的查询方式，用于查找与给定查询向量相似的向量。返回指定的 Top K 个最相似的 Entity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchEntitiesRequest 请求对象
     * @return SearchEntitiesResponse
     */
    public SearchEntitiesResponse searchEntities(SearchEntitiesRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.searchEntities);
    }

    /**
     * 向量查询
     *
     * 基于相似度匹配的查询方式，用于查找与给定查询向量相似的向量。返回指定的 Top K 个最相似的 Entity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchEntitiesRequest 请求对象
     * @return SyncInvoker<SearchEntitiesRequest, SearchEntitiesResponse>
     */
    public SyncInvoker<SearchEntitiesRequest, SearchEntitiesResponse> searchEntitiesInvoker(
        SearchEntitiesRequest request) {
        return new SyncInvoker<>(request, DwrMeta.searchEntities, hcClient);
    }

    /**
     * 更新向量
     *
     * 在指定collection中更新Entity。如果pk列中值存在，则更新Entity，如果不存在，则插入Entity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpsertEntitiesRequest 请求对象
     * @return UpsertEntitiesResponse
     */
    public UpsertEntitiesResponse upsertEntities(UpsertEntitiesRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.upsertEntities);
    }

    /**
     * 更新向量
     *
     * 在指定collection中更新Entity。如果pk列中值存在，则更新Entity，如果不存在，则插入Entity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpsertEntitiesRequest 请求对象
     * @return SyncInvoker<UpsertEntitiesRequest, UpsertEntitiesResponse>
     */
    public SyncInvoker<UpsertEntitiesRequest, UpsertEntitiesResponse> upsertEntitiesInvoker(
        UpsertEntitiesRequest request) {
        return new SyncInvoker<>(request, DwrMeta.upsertEntities, hcClient);
    }

}
