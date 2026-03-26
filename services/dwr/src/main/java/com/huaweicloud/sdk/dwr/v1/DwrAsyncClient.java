package com.huaweicloud.sdk.dwr.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class DwrAsyncClient {

    protected HcClient hcClient;

    public DwrAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DwrAsyncClient> newBuilder() {
        ClientBuilder<DwrAsyncClient> clientBuilder = new ClientBuilder<>(DwrAsyncClient::new);
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
     * @return CompletableFuture<CreateCollectionResponse>
     */
    public CompletableFuture<CreateCollectionResponse> createCollectionAsync(CreateCollectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.createCollection);
    }

    /**
     * 创建collection
     *
     * 在知识仓实例下创建collection。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectionRequest 请求对象
     * @return AsyncInvoker<CreateCollectionRequest, CreateCollectionResponse>
     */
    public AsyncInvoker<CreateCollectionRequest, CreateCollectionResponse> createCollectionAsyncInvoker(
        CreateCollectionRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.createCollection, hcClient);
    }

    /**
     * 创建索引
     *
     * 在指定的collection中，按照参数创建索引。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIndexRequest 请求对象
     * @return CompletableFuture<CreateIndexResponse>
     */
    public CompletableFuture<CreateIndexResponse> createIndexAsync(CreateIndexRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.createIndex);
    }

    /**
     * 创建索引
     *
     * 在指定的collection中，按照参数创建索引。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIndexRequest 请求对象
     * @return AsyncInvoker<CreateIndexRequest, CreateIndexResponse>
     */
    public AsyncInvoker<CreateIndexRequest, CreateIndexResponse> createIndexAsyncInvoker(CreateIndexRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.createIndex, hcClient);
    }

    /**
     * 创建知识仓实例
     *
     * 创建知识仓实例。知识仓实例名称region内唯一。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStoreRequest 请求对象
     * @return CompletableFuture<CreateStoreResponse>
     */
    public CompletableFuture<CreateStoreResponse> createStoreAsync(CreateStoreRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.createStore);
    }

    /**
     * 创建知识仓实例
     *
     * 创建知识仓实例。知识仓实例名称region内唯一。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStoreRequest 请求对象
     * @return AsyncInvoker<CreateStoreRequest, CreateStoreResponse>
     */
    public AsyncInvoker<CreateStoreRequest, CreateStoreResponse> createStoreAsyncInvoker(CreateStoreRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.createStore, hcClient);
    }

    /**
     * 删除collection
     *
     * 在知识仓实例下删除指定的collection。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCollectionRequest 请求对象
     * @return CompletableFuture<DeleteCollectionResponse>
     */
    public CompletableFuture<DeleteCollectionResponse> deleteCollectionAsync(DeleteCollectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.deleteCollection);
    }

    /**
     * 删除collection
     *
     * 在知识仓实例下删除指定的collection。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCollectionRequest 请求对象
     * @return AsyncInvoker<DeleteCollectionRequest, DeleteCollectionResponse>
     */
    public AsyncInvoker<DeleteCollectionRequest, DeleteCollectionResponse> deleteCollectionAsyncInvoker(
        DeleteCollectionRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.deleteCollection, hcClient);
    }

    /**
     * 删除索引
     *
     * 删除指定索引。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIndexRequest 请求对象
     * @return CompletableFuture<DeleteIndexResponse>
     */
    public CompletableFuture<DeleteIndexResponse> deleteIndexAsync(DeleteIndexRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.deleteIndex);
    }

    /**
     * 删除索引
     *
     * 删除指定索引。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIndexRequest 请求对象
     * @return AsyncInvoker<DeleteIndexRequest, DeleteIndexResponse>
     */
    public AsyncInvoker<DeleteIndexRequest, DeleteIndexResponse> deleteIndexAsyncInvoker(DeleteIndexRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.deleteIndex, hcClient);
    }

    /**
     * 删除知识仓实例
     *
     * 删除指定的知识仓实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStoreRequest 请求对象
     * @return CompletableFuture<DeleteStoreResponse>
     */
    public CompletableFuture<DeleteStoreResponse> deleteStoreAsync(DeleteStoreRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.deleteStore);
    }

    /**
     * 删除知识仓实例
     *
     * 删除指定的知识仓实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStoreRequest 请求对象
     * @return AsyncInvoker<DeleteStoreRequest, DeleteStoreResponse>
     */
    public AsyncInvoker<DeleteStoreRequest, DeleteStoreResponse> deleteStoreAsyncInvoker(DeleteStoreRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.deleteStore, hcClient);
    }

    /**
     * 查询collection
     *
     * 在知识仓实例下查询指定的collection的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeCollectionRequest 请求对象
     * @return CompletableFuture<DescribeCollectionResponse>
     */
    public CompletableFuture<DescribeCollectionResponse> describeCollectionAsync(DescribeCollectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.describeCollection);
    }

    /**
     * 查询collection
     *
     * 在知识仓实例下查询指定的collection的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeCollectionRequest 请求对象
     * @return AsyncInvoker<DescribeCollectionRequest, DescribeCollectionResponse>
     */
    public AsyncInvoker<DescribeCollectionRequest, DescribeCollectionResponse> describeCollectionAsyncInvoker(
        DescribeCollectionRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.describeCollection, hcClient);
    }

    /**
     * 查询索引
     *
     * 查询指定索引的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeIndexRequest 请求对象
     * @return CompletableFuture<DescribeIndexResponse>
     */
    public CompletableFuture<DescribeIndexResponse> describeIndexAsync(DescribeIndexRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.describeIndex);
    }

    /**
     * 查询索引
     *
     * 查询指定索引的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeIndexRequest 请求对象
     * @return AsyncInvoker<DescribeIndexRequest, DescribeIndexResponse>
     */
    public AsyncInvoker<DescribeIndexRequest, DescribeIndexResponse> describeIndexAsyncInvoker(
        DescribeIndexRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.describeIndex, hcClient);
    }

    /**
     * 获取指定ID任务信息
     *
     * 根据指定的jobid查询任务信息。用于在创建和删除知识仓实例操作执行成功后，通过响应中返回的job_id，来查询创建和删除知识仓实例执行的具体结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeJobRequest 请求对象
     * @return CompletableFuture<DescribeJobResponse>
     */
    public CompletableFuture<DescribeJobResponse> describeJobAsync(DescribeJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.describeJob);
    }

    /**
     * 获取指定ID任务信息
     *
     * 根据指定的jobid查询任务信息。用于在创建和删除知识仓实例操作执行成功后，通过响应中返回的job_id，来查询创建和删除知识仓实例执行的具体结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeJobRequest 请求对象
     * @return AsyncInvoker<DescribeJobRequest, DescribeJobResponse>
     */
    public AsyncInvoker<DescribeJobRequest, DescribeJobResponse> describeJobAsyncInvoker(DescribeJobRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.describeJob, hcClient);
    }

    /**
     * 查询知识仓实例
     *
     * 查询指定知识仓实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeStoreRequest 请求对象
     * @return CompletableFuture<DescribeStoreResponse>
     */
    public CompletableFuture<DescribeStoreResponse> describeStoreAsync(DescribeStoreRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.describeStore);
    }

    /**
     * 查询知识仓实例
     *
     * 查询指定知识仓实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeStoreRequest 请求对象
     * @return AsyncInvoker<DescribeStoreRequest, DescribeStoreResponse>
     */
    public AsyncInvoker<DescribeStoreRequest, DescribeStoreResponse> describeStoreAsyncInvoker(
        DescribeStoreRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.describeStore, hcClient);
    }

    /**
     * 查询索引构建进度
     *
     * 查询指定索引的构建进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetProgressRequest 请求对象
     * @return CompletableFuture<GetProgressResponse>
     */
    public CompletableFuture<GetProgressResponse> getProgressAsync(GetProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.getProgress);
    }

    /**
     * 查询索引构建进度
     *
     * 查询指定索引的构建进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetProgressRequest 请求对象
     * @return AsyncInvoker<GetProgressRequest, GetProgressResponse>
     */
    public AsyncInvoker<GetProgressRequest, GetProgressResponse> getProgressAsyncInvoker(GetProgressRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.getProgress, hcClient);
    }

    /**
     * 列举collection
     *
     * 列举指定知识仓实例中所有的collections。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectionsRequest 请求对象
     * @return CompletableFuture<ListCollectionsResponse>
     */
    public CompletableFuture<ListCollectionsResponse> listCollectionsAsync(ListCollectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.listCollections);
    }

    /**
     * 列举collection
     *
     * 列举指定知识仓实例中所有的collections。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectionsRequest 请求对象
     * @return AsyncInvoker<ListCollectionsRequest, ListCollectionsResponse>
     */
    public AsyncInvoker<ListCollectionsRequest, ListCollectionsResponse> listCollectionsAsyncInvoker(
        ListCollectionsRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.listCollections, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 根据指定条件查询列举任务的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return CompletableFuture<ListJobsResponse>
     */
    public CompletableFuture<ListJobsResponse> listJobsAsync(ListJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.listJobs);
    }

    /**
     * 查询任务列表
     *
     * 根据指定条件查询列举任务的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return AsyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public AsyncInvoker<ListJobsRequest, ListJobsResponse> listJobsAsyncInvoker(ListJobsRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.listJobs, hcClient);
    }

    /**
     * 列举知识仓实例
     *
     * 列举租户所有的知识仓实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoresRequest 请求对象
     * @return CompletableFuture<ListStoresResponse>
     */
    public CompletableFuture<ListStoresResponse> listStoresAsync(ListStoresRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.listStores);
    }

    /**
     * 列举知识仓实例
     *
     * 列举租户所有的知识仓实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoresRequest 请求对象
     * @return AsyncInvoker<ListStoresRequest, ListStoresResponse>
     */
    public AsyncInvoker<ListStoresRequest, ListStoresResponse> listStoresAsyncInvoker(ListStoresRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.listStores, hcClient);
    }

    /**
     * 加载collection
     *
     * 加载指定collection的数据。加载成功后，才能执行查询操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LoadCollectionRequest 请求对象
     * @return CompletableFuture<LoadCollectionResponse>
     */
    public CompletableFuture<LoadCollectionResponse> loadCollectionAsync(LoadCollectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.loadCollection);
    }

    /**
     * 加载collection
     *
     * 加载指定collection的数据。加载成功后，才能执行查询操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LoadCollectionRequest 请求对象
     * @return AsyncInvoker<LoadCollectionRequest, LoadCollectionResponse>
     */
    public AsyncInvoker<LoadCollectionRequest, LoadCollectionResponse> loadCollectionAsyncInvoker(
        LoadCollectionRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.loadCollection, hcClient);
    }

    /**
     * 卸载collection
     *
     * 卸载已加载collection的数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReleaseCollectionRequest 请求对象
     * @return CompletableFuture<ReleaseCollectionResponse>
     */
    public CompletableFuture<ReleaseCollectionResponse> releaseCollectionAsync(ReleaseCollectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.releaseCollection);
    }

    /**
     * 卸载collection
     *
     * 卸载已加载collection的数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReleaseCollectionRequest 请求对象
     * @return AsyncInvoker<ReleaseCollectionRequest, ReleaseCollectionResponse>
     */
    public AsyncInvoker<ReleaseCollectionRequest, ReleaseCollectionResponse> releaseCollectionAsyncInvoker(
        ReleaseCollectionRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.releaseCollection, hcClient);
    }

    /**
     * 变更知识仓实例
     *
     * 对指定的知识仓实例进行扩容或缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScaleStoreRequest 请求对象
     * @return CompletableFuture<ScaleStoreResponse>
     */
    public CompletableFuture<ScaleStoreResponse> scaleStoreAsync(ScaleStoreRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.scaleStore);
    }

    /**
     * 变更知识仓实例
     *
     * 对指定的知识仓实例进行扩容或缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScaleStoreRequest 请求对象
     * @return AsyncInvoker<ScaleStoreRequest, ScaleStoreResponse>
     */
    public AsyncInvoker<ScaleStoreRequest, ScaleStoreResponse> scaleStoreAsyncInvoker(ScaleStoreRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.scaleStore, hcClient);
    }

    /**
     * 删除向量
     *
     * 在指定的collection中删除一个或多个Entity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEntitiesRequest 请求对象
     * @return CompletableFuture<DeleteEntitiesResponse>
     */
    public CompletableFuture<DeleteEntitiesResponse> deleteEntitiesAsync(DeleteEntitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.deleteEntities);
    }

    /**
     * 删除向量
     *
     * 在指定的collection中删除一个或多个Entity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEntitiesRequest 请求对象
     * @return AsyncInvoker<DeleteEntitiesRequest, DeleteEntitiesResponse>
     */
    public AsyncInvoker<DeleteEntitiesRequest, DeleteEntitiesResponse> deleteEntitiesAsyncInvoker(
        DeleteEntitiesRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.deleteEntities, hcClient);
    }

    /**
     * 混合搜索
     *
     * 基于相似度匹配的查询方式，用于查找与给定多个向量进行相似性搜索，支持密集向量，稀疏向量等多路召回，并对结果进行重排处理，最终返回指定的 Top K 个最相似的 Entity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HybridSearchRequest 请求对象
     * @return CompletableFuture<HybridSearchResponse>
     */
    public CompletableFuture<HybridSearchResponse> hybridSearchAsync(HybridSearchRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.hybridSearch);
    }

    /**
     * 混合搜索
     *
     * 基于相似度匹配的查询方式，用于查找与给定多个向量进行相似性搜索，支持密集向量，稀疏向量等多路召回，并对结果进行重排处理，最终返回指定的 Top K 个最相似的 Entity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HybridSearchRequest 请求对象
     * @return AsyncInvoker<HybridSearchRequest, HybridSearchResponse>
     */
    public AsyncInvoker<HybridSearchRequest, HybridSearchResponse> hybridSearchAsyncInvoker(
        HybridSearchRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.hybridSearch, hcClient);
    }

    /**
     * 插入向量
     *
     * 在指定的collection中插入一个或多个Entity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InsertEntitiesRequest 请求对象
     * @return CompletableFuture<InsertEntitiesResponse>
     */
    public CompletableFuture<InsertEntitiesResponse> insertEntitiesAsync(InsertEntitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.insertEntities);
    }

    /**
     * 插入向量
     *
     * 在指定的collection中插入一个或多个Entity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InsertEntitiesRequest 请求对象
     * @return AsyncInvoker<InsertEntitiesRequest, InsertEntitiesResponse>
     */
    public AsyncInvoker<InsertEntitiesRequest, InsertEntitiesResponse> insertEntitiesAsyncInvoker(
        InsertEntitiesRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.insertEntities, hcClient);
    }

    /**
     * 标量查询
     *
     * 接口用于精确查找与查询条件完全匹配的向量，此操作使用指定的布尔表达式对标量字段进行筛选。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request QueryEntitiesRequest 请求对象
     * @return CompletableFuture<QueryEntitiesResponse>
     */
    public CompletableFuture<QueryEntitiesResponse> queryEntitiesAsync(QueryEntitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.queryEntities);
    }

    /**
     * 标量查询
     *
     * 接口用于精确查找与查询条件完全匹配的向量，此操作使用指定的布尔表达式对标量字段进行筛选。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request QueryEntitiesRequest 请求对象
     * @return AsyncInvoker<QueryEntitiesRequest, QueryEntitiesResponse>
     */
    public AsyncInvoker<QueryEntitiesRequest, QueryEntitiesResponse> queryEntitiesAsyncInvoker(
        QueryEntitiesRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.queryEntities, hcClient);
    }

    /**
     * 向量查询
     *
     * 基于相似度匹配的查询方式，用于查找与给定查询向量相似的向量。返回指定的 Top K 个最相似的 Entity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchEntitiesRequest 请求对象
     * @return CompletableFuture<SearchEntitiesResponse>
     */
    public CompletableFuture<SearchEntitiesResponse> searchEntitiesAsync(SearchEntitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.searchEntities);
    }

    /**
     * 向量查询
     *
     * 基于相似度匹配的查询方式，用于查找与给定查询向量相似的向量。返回指定的 Top K 个最相似的 Entity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchEntitiesRequest 请求对象
     * @return AsyncInvoker<SearchEntitiesRequest, SearchEntitiesResponse>
     */
    public AsyncInvoker<SearchEntitiesRequest, SearchEntitiesResponse> searchEntitiesAsyncInvoker(
        SearchEntitiesRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.searchEntities, hcClient);
    }

    /**
     * 更新向量
     *
     * 在指定collection中更新Entity。如果pk列中值存在，则更新Entity，如果不存在，则插入Entity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpsertEntitiesRequest 请求对象
     * @return CompletableFuture<UpsertEntitiesResponse>
     */
    public CompletableFuture<UpsertEntitiesResponse> upsertEntitiesAsync(UpsertEntitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.upsertEntities);
    }

    /**
     * 更新向量
     *
     * 在指定collection中更新Entity。如果pk列中值存在，则更新Entity，如果不存在，则插入Entity。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpsertEntitiesRequest 请求对象
     * @return AsyncInvoker<UpsertEntitiesRequest, UpsertEntitiesResponse>
     */
    public AsyncInvoker<UpsertEntitiesRequest, UpsertEntitiesResponse> upsertEntitiesAsyncInvoker(
        UpsertEntitiesRequest request) {
        return new AsyncInvoker<>(request, DwrMeta.upsertEntities, hcClient);
    }

}
