package com.huaweicloud.sdk.kvs.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.kvs.v1.model.BatchWriteKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.BatchWriteKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.CheckHealthRequest;
import com.huaweicloud.sdk.kvs.v1.model.CheckHealthResponse;
import com.huaweicloud.sdk.kvs.v1.model.CreateTableRequest;
import com.huaweicloud.sdk.kvs.v1.model.CreateTableResponse;
import com.huaweicloud.sdk.kvs.v1.model.DeleteKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.DeleteKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.DescribeTableRequest;
import com.huaweicloud.sdk.kvs.v1.model.DescribeTableResponse;
import com.huaweicloud.sdk.kvs.v1.model.GetKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.GetKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.ListStoreRequest;
import com.huaweicloud.sdk.kvs.v1.model.ListStoreResponse;
import com.huaweicloud.sdk.kvs.v1.model.ListTableRequest;
import com.huaweicloud.sdk.kvs.v1.model.ListTableResponse;
import com.huaweicloud.sdk.kvs.v1.model.PutKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.PutKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.ScanKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.ScanKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.ScanSkeyKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.ScanSkeyKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.UpdateKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.UpdateKvResponse;

import java.util.concurrent.CompletableFuture;

public class KvsAsyncClient implements IKvsAsyncClient {

    protected HcClient hcClient;

    public KvsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KvsAsyncClient> newBuilder() {
        ClientBuilder<KvsAsyncClient> clientBuilder =
            new ClientBuilder<>(KvsAsyncClient::new, "BasicCredentials,KvsCredentials");
        try {
            Class<?> exceptionHandler = Class.forName("com.huaweicloud.sdk.core.exception.ExceptionHandler");
            clientBuilder.getClass()
                .getMethod("withExceptionHandler", exceptionHandler)
                .invoke(clientBuilder, new KvsExceptionHandler());
        } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException
            | java.lang.reflect.InvocationTargetException ignore) {
        }
        return clientBuilder;
    }

    /**
     * 创建表
     *
     * 在指定仓内创建表，表名在仓内唯一；创建表时，指定主键模板及本地二级索引模板及全局二级索引模板。创建表时，如果仓不存在，将会自动创建仓。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTableRequest 请求对象
     * @return CompletableFuture<CreateTableResponse>
     */
    public CompletableFuture<CreateTableResponse> createTableAsync(CreateTableRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.createTable);
    }

    /**
     * 创建表
     *
     * 在指定仓内创建表，表名在仓内唯一；创建表时，指定主键模板及本地二级索引模板及全局二级索引模板。创建表时，如果仓不存在，将会自动创建仓。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTableRequest 请求对象
     * @return AsyncInvoker<CreateTableRequest, CreateTableResponse>
     */
    public AsyncInvoker<CreateTableRequest, CreateTableResponse> createTableAsyncInvoker(CreateTableRequest request) {
        return new AsyncInvoker<>(request, KvsMeta.createTable, hcClient);
    }

    /**
     * 查询表
     *
     * 指定仓查询表属性，如容量，规模，配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeTableRequest 请求对象
     * @return CompletableFuture<DescribeTableResponse>
     */
    public CompletableFuture<DescribeTableResponse> describeTableAsync(DescribeTableRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.describeTable);
    }

    /**
     * 查询表
     *
     * 指定仓查询表属性，如容量，规模，配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeTableRequest 请求对象
     * @return AsyncInvoker<DescribeTableRequest, DescribeTableResponse>
     */
    public AsyncInvoker<DescribeTableRequest, DescribeTableResponse> describeTableAsyncInvoker(
        DescribeTableRequest request) {
        return new AsyncInvoker<>(request, KvsMeta.describeTable, hcClient);
    }

    /**
     * 列举仓
     *
     * 一个账户下可以创建最多25个仓，每个仓可以创建最多100个store，响应中一次性返回所有仓名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoreRequest 请求对象
     * @return CompletableFuture<ListStoreResponse>
     */
    public CompletableFuture<ListStoreResponse> listStoreAsync(ListStoreRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.listStore);
    }

    /**
     * 列举仓
     *
     * 一个账户下可以创建最多25个仓，每个仓可以创建最多100个store，响应中一次性返回所有仓名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoreRequest 请求对象
     * @return AsyncInvoker<ListStoreRequest, ListStoreResponse>
     */
    public AsyncInvoker<ListStoreRequest, ListStoreResponse> listStoreAsyncInvoker(ListStoreRequest request) {
        return new AsyncInvoker<>(request, KvsMeta.listStore, hcClient);
    }

    /**
     * 列举表
     *
     * 指定仓列举创建的所有表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableRequest 请求对象
     * @return CompletableFuture<ListTableResponse>
     */
    public CompletableFuture<ListTableResponse> listTableAsync(ListTableRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.listTable);
    }

    /**
     * 列举表
     *
     * 指定仓列举创建的所有表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableRequest 请求对象
     * @return AsyncInvoker<ListTableRequest, ListTableResponse>
     */
    public AsyncInvoker<ListTableRequest, ListTableResponse> listTableAsyncInvoker(ListTableRequest request) {
        return new AsyncInvoker<>(request, KvsMeta.listTable, hcClient);
    }

    /**
     * 网络信道健康检查
     *
     * 网络信道健康检查，返回response未抛出网络异常即为成功
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckHealthRequest 请求对象
     * @return CompletableFuture<CheckHealthResponse>
     */
    public CompletableFuture<CheckHealthResponse> checkHealthAsync(CheckHealthRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.checkHealth);
    }

    /**
     * 网络信道健康检查
     *
     * 网络信道健康检查，返回response未抛出网络异常即为成功
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckHealthRequest 请求对象
     * @return AsyncInvoker<CheckHealthRequest, CheckHealthResponse>
     */
    public AsyncInvoker<CheckHealthRequest, CheckHealthResponse> checkHealthAsyncInvoker(CheckHealthRequest request) {
        return new AsyncInvoker<>(request, KvsMeta.checkHealth, hcClient);
    }

    /**
     * 批量写请求
     *
     * 批量写请求，其中可以携带一或多个表的不同kv的写操作，上传kv/删除kv。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchWriteKvRequest 请求对象
     * @return CompletableFuture<BatchWriteKvResponse>
     */
    public CompletableFuture<BatchWriteKvResponse> batchWriteKvAsync(BatchWriteKvRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.batchWriteKv);
    }

    /**
     * 批量写请求
     *
     * 批量写请求，其中可以携带一或多个表的不同kv的写操作，上传kv/删除kv。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchWriteKvRequest 请求对象
     * @return AsyncInvoker<BatchWriteKvRequest, BatchWriteKvResponse>
     */
    public AsyncInvoker<BatchWriteKvRequest, BatchWriteKvResponse> batchWriteKvAsyncInvoker(
        BatchWriteKvRequest request) {
        return new AsyncInvoker<>(request, KvsMeta.batchWriteKv, hcClient);
    }

    /**
     * 删除单个kv
     *
     * 指定表，指定主键，删除该文档；允许指定条件执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKvRequest 请求对象
     * @return CompletableFuture<DeleteKvResponse>
     */
    public CompletableFuture<DeleteKvResponse> deleteKvAsync(DeleteKvRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.deleteKv);
    }

    /**
     * 删除单个kv
     *
     * 指定表，指定主键，删除该文档；允许指定条件执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKvRequest 请求对象
     * @return AsyncInvoker<DeleteKvRequest, DeleteKvResponse>
     */
    public AsyncInvoker<DeleteKvRequest, DeleteKvResponse> deleteKvAsyncInvoker(DeleteKvRequest request) {
        return new AsyncInvoker<>(request, KvsMeta.deleteKv, hcClient);
    }

    /**
     * 查询单个kv
     *
     * 下载一个kv文档的全部内容，或者部分字段的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetKvRequest 请求对象
     * @return CompletableFuture<GetKvResponse>
     */
    public CompletableFuture<GetKvResponse> getKvAsync(GetKvRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.getKv);
    }

    /**
     * 查询单个kv
     *
     * 下载一个kv文档的全部内容，或者部分字段的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetKvRequest 请求对象
     * @return AsyncInvoker<GetKvRequest, GetKvResponse>
     */
    public AsyncInvoker<GetKvRequest, GetKvResponse> getKvAsyncInvoker(GetKvRequest request) {
        return new AsyncInvoker<>(request, KvsMeta.getKv, hcClient);
    }

    /**
     * 上传单个kv
     *
     * 指定表，新建kv或覆盖已有kv，且满足表的key schema描述；允许指定条件执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutKvRequest 请求对象
     * @return CompletableFuture<PutKvResponse>
     */
    public CompletableFuture<PutKvResponse> putKvAsync(PutKvRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.putKv);
    }

    /**
     * 上传单个kv
     *
     * 指定表，新建kv或覆盖已有kv，且满足表的key schema描述；允许指定条件执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutKvRequest 请求对象
     * @return AsyncInvoker<PutKvRequest, PutKvResponse>
     */
    public AsyncInvoker<PutKvRequest, PutKvResponse> putKvAsyncInvoker(PutKvRequest request) {
        return new AsyncInvoker<>(request, KvsMeta.putKv, hcClient);
    }

    /**
     * 扫描所有kv
     *
     * 指定表，扫描表下所有kv；允许指定过滤条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScanKvRequest 请求对象
     * @return CompletableFuture<ScanKvResponse>
     */
    public CompletableFuture<ScanKvResponse> scanKvAsync(ScanKvRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.scanKv);
    }

    /**
     * 扫描所有kv
     *
     * 指定表，扫描表下所有kv；允许指定过滤条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScanKvRequest 请求对象
     * @return AsyncInvoker<ScanKvRequest, ScanKvResponse>
     */
    public AsyncInvoker<ScanKvRequest, ScanKvResponse> scanKvAsyncInvoker(ScanKvRequest request) {
        return new AsyncInvoker<>(request, KvsMeta.scanKv, hcClient);
    }

    /**
     * 扫描分区键内kv
     *
     * 指定表及分区键，携带条件查询kv；允许指定过滤条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScanSkeyKvRequest 请求对象
     * @return CompletableFuture<ScanSkeyKvResponse>
     */
    public CompletableFuture<ScanSkeyKvResponse> scanSkeyKvAsync(ScanSkeyKvRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.scanSkeyKv);
    }

    /**
     * 扫描分区键内kv
     *
     * 指定表及分区键，携带条件查询kv；允许指定过滤条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScanSkeyKvRequest 请求对象
     * @return AsyncInvoker<ScanSkeyKvRequest, ScanSkeyKvResponse>
     */
    public AsyncInvoker<ScanSkeyKvRequest, ScanSkeyKvResponse> scanSkeyKvAsyncInvoker(ScanSkeyKvRequest request) {
        return new AsyncInvoker<>(request, KvsMeta.scanSkeyKv, hcClient);
    }

    /**
     * 更新单个kv
     *
     * 指定表，指定主键，指定更新文档的部分内容，如果是自描述文档，指定字段名；如果是二进制文档，指定偏移位置和长度；允许指定条件执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKvRequest 请求对象
     * @return CompletableFuture<UpdateKvResponse>
     */
    public CompletableFuture<UpdateKvResponse> updateKvAsync(UpdateKvRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.updateKv);
    }

    /**
     * 更新单个kv
     *
     * 指定表，指定主键，指定更新文档的部分内容，如果是自描述文档，指定字段名；如果是二进制文档，指定偏移位置和长度；允许指定条件执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKvRequest 请求对象
     * @return AsyncInvoker<UpdateKvRequest, UpdateKvResponse>
     */
    public AsyncInvoker<UpdateKvRequest, UpdateKvResponse> updateKvAsyncInvoker(UpdateKvRequest request) {
        return new AsyncInvoker<>(request, KvsMeta.updateKv, hcClient);
    }

}
