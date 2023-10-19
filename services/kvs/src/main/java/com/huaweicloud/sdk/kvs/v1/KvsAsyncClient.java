package com.huaweicloud.sdk.kvs.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.kvs.v1.model.BatchGetKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.BatchGetKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.BatchWriteKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.BatchWriteKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.CreateTableRequest;
import com.huaweicloud.sdk.kvs.v1.model.CreateTableResponse;
import com.huaweicloud.sdk.kvs.v1.model.DeleteKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.DeleteKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.DescribeTableRequest;
import com.huaweicloud.sdk.kvs.v1.model.DescribeTableResponse;
import com.huaweicloud.sdk.kvs.v1.model.GetKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.GetKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.ListTableRequest;
import com.huaweicloud.sdk.kvs.v1.model.ListTableResponse;
import com.huaweicloud.sdk.kvs.v1.model.PutKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.PutKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.RenameKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.RenameKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.ScanKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.ScanKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.ScanSkeyKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.ScanSkeyKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.UpdateKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.UpdateKvResponse;

import java.util.concurrent.CompletableFuture;

public class KvsAsyncClient {

    protected HcClient hcClient;

    public KvsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KvsAsyncClient> newBuilder() {
        ClientBuilder<KvsAsyncClient> clientBuilder = new ClientBuilder<>(KvsAsyncClient::new);
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
     * create table
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTableRequest 请求对象
     * @return CompletableFuture<CreateTableResponse>
     */
    public CompletableFuture<CreateTableResponse> createTableAsync(CreateTableRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.createTable);
    }

    /**
     * 创建表
     *
     * create table
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTableRequest 请求对象
     * @return AsyncInvoker<CreateTableRequest, CreateTableResponse>
     */
    public AsyncInvoker<CreateTableRequest, CreateTableResponse> createTableAsyncInvoker(CreateTableRequest request) {
        return new AsyncInvoker<CreateTableRequest, CreateTableResponse>(request, KvsMeta.createTable, hcClient);
    }

    /**
     * 指定查询表的属性信息
     *
     * describe table
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DescribeTableRequest 请求对象
     * @return CompletableFuture<DescribeTableResponse>
     */
    public CompletableFuture<DescribeTableResponse> describeTableAsync(DescribeTableRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.describeTable);
    }

    /**
     * 指定查询表的属性信息
     *
     * describe table
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DescribeTableRequest 请求对象
     * @return AsyncInvoker<DescribeTableRequest, DescribeTableResponse>
     */
    public AsyncInvoker<DescribeTableRequest, DescribeTableResponse> describeTableAsyncInvoker(
        DescribeTableRequest request) {
        return new AsyncInvoker<DescribeTableRequest, DescribeTableResponse>(request, KvsMeta.describeTable, hcClient);
    }

    /**
     * 列出所有表
     *
     * list table
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableRequest 请求对象
     * @return CompletableFuture<ListTableResponse>
     */
    public CompletableFuture<ListTableResponse> listTableAsync(ListTableRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.listTable);
    }

    /**
     * 列出所有表
     *
     * list table
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableRequest 请求对象
     * @return AsyncInvoker<ListTableRequest, ListTableResponse>
     */
    public AsyncInvoker<ListTableRequest, ListTableResponse> listTableAsyncInvoker(ListTableRequest request) {
        return new AsyncInvoker<ListTableRequest, ListTableResponse>(request, KvsMeta.listTable, hcClient);
    }

    /**
     * 批量查询kv
     *
     * batch get kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchGetKvRequest 请求对象
     * @return CompletableFuture<BatchGetKvResponse>
     */
    public CompletableFuture<BatchGetKvResponse> batchGetKvAsync(BatchGetKvRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.batchGetKv);
    }

    /**
     * 批量查询kv
     *
     * batch get kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchGetKvRequest 请求对象
     * @return AsyncInvoker<BatchGetKvRequest, BatchGetKvResponse>
     */
    public AsyncInvoker<BatchGetKvRequest, BatchGetKvResponse> batchGetKvAsyncInvoker(BatchGetKvRequest request) {
        return new AsyncInvoker<BatchGetKvRequest, BatchGetKvResponse>(request, KvsMeta.batchGetKv, hcClient);
    }

    /**
     * 持同一个store的同一张表的put-kv操作和delete-kv操作， 最多携带25个操作，body部分不超过8MB
     *
     * batch write kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchWriteKvRequest 请求对象
     * @return CompletableFuture<BatchWriteKvResponse>
     */
    public CompletableFuture<BatchWriteKvResponse> batchWriteKvAsync(BatchWriteKvRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.batchWriteKv);
    }

    /**
     * 持同一个store的同一张表的put-kv操作和delete-kv操作， 最多携带25个操作，body部分不超过8MB
     *
     * batch write kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchWriteKvRequest 请求对象
     * @return AsyncInvoker<BatchWriteKvRequest, BatchWriteKvResponse>
     */
    public AsyncInvoker<BatchWriteKvRequest, BatchWriteKvResponse> batchWriteKvAsyncInvoker(
        BatchWriteKvRequest request) {
        return new AsyncInvoker<BatchWriteKvRequest, BatchWriteKvResponse>(request, KvsMeta.batchWriteKv, hcClient);
    }

    /**
     * 删除指定的kv文档，默认不会返回kv文档内容
     *
     * delete kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteKvRequest 请求对象
     * @return CompletableFuture<DeleteKvResponse>
     */
    public CompletableFuture<DeleteKvResponse> deleteKvAsync(DeleteKvRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.deleteKv);
    }

    /**
     * 删除指定的kv文档，默认不会返回kv文档内容
     *
     * delete kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteKvRequest 请求对象
     * @return AsyncInvoker<DeleteKvRequest, DeleteKvResponse>
     */
    public AsyncInvoker<DeleteKvRequest, DeleteKvResponse> deleteKvAsyncInvoker(DeleteKvRequest request) {
        return new AsyncInvoker<DeleteKvRequest, DeleteKvResponse>(request, KvsMeta.deleteKv, hcClient);
    }

    /**
     * 下载一个kv文档的全部内容，或者部分字段的内容
     *
     * get kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetKvRequest 请求对象
     * @return CompletableFuture<GetKvResponse>
     */
    public CompletableFuture<GetKvResponse> getKvAsync(GetKvRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.getKv);
    }

    /**
     * 下载一个kv文档的全部内容，或者部分字段的内容
     *
     * get kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetKvRequest 请求对象
     * @return AsyncInvoker<GetKvRequest, GetKvResponse>
     */
    public AsyncInvoker<GetKvRequest, GetKvResponse> getKvAsyncInvoker(GetKvRequest request) {
        return new AsyncInvoker<GetKvRequest, GetKvResponse>(request, KvsMeta.getKv, hcClient);
    }

    /**
     * 上传一个kv文档
     *
     * put kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PutKvRequest 请求对象
     * @return CompletableFuture<PutKvResponse>
     */
    public CompletableFuture<PutKvResponse> putKvAsync(PutKvRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.putKv);
    }

    /**
     * 上传一个kv文档
     *
     * put kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PutKvRequest 请求对象
     * @return AsyncInvoker<PutKvRequest, PutKvResponse>
     */
    public AsyncInvoker<PutKvRequest, PutKvResponse> putKvAsyncInvoker(PutKvRequest request) {
        return new AsyncInvoker<PutKvRequest, PutKvResponse>(request, KvsMeta.putKv, hcClient);
    }

    /**
     * 更新指定kv的sortkey 并更新部分字段
     *
     * rename kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RenameKvRequest 请求对象
     * @return CompletableFuture<RenameKvResponse>
     */
    public CompletableFuture<RenameKvResponse> renameKvAsync(RenameKvRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.renameKv);
    }

    /**
     * 更新指定kv的sortkey 并更新部分字段
     *
     * rename kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RenameKvRequest 请求对象
     * @return AsyncInvoker<RenameKvRequest, RenameKvResponse>
     */
    public AsyncInvoker<RenameKvRequest, RenameKvResponse> renameKvAsyncInvoker(RenameKvRequest request) {
        return new AsyncInvoker<RenameKvRequest, RenameKvResponse>(request, KvsMeta.renameKv, hcClient);
    }

    /**
     * 对指定table 扫描主索引或者指定二级索引进行扫描，可指定filter过滤需要返回的doc
     *
     * scan kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ScanKvRequest 请求对象
     * @return CompletableFuture<ScanKvResponse>
     */
    public CompletableFuture<ScanKvResponse> scanKvAsync(ScanKvRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.scanKv);
    }

    /**
     * 对指定table 扫描主索引或者指定二级索引进行扫描，可指定filter过滤需要返回的doc
     *
     * scan kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ScanKvRequest 请求对象
     * @return AsyncInvoker<ScanKvRequest, ScanKvResponse>
     */
    public AsyncInvoker<ScanKvRequest, ScanKvResponse> scanKvAsyncInvoker(ScanKvRequest request) {
        return new AsyncInvoker<ScanKvRequest, ScanKvResponse>(request, KvsMeta.scanKv, hcClient);
    }

    /**
     * 与scan-kv类似，query-skey-kv必须指定shardkey
     *
     * scan skey kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ScanSkeyKvRequest 请求对象
     * @return CompletableFuture<ScanSkeyKvResponse>
     */
    public CompletableFuture<ScanSkeyKvResponse> scanSkeyKvAsync(ScanSkeyKvRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.scanSkeyKv);
    }

    /**
     * 与scan-kv类似，query-skey-kv必须指定shardkey
     *
     * scan skey kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ScanSkeyKvRequest 请求对象
     * @return AsyncInvoker<ScanSkeyKvRequest, ScanSkeyKvResponse>
     */
    public AsyncInvoker<ScanSkeyKvRequest, ScanSkeyKvResponse> scanSkeyKvAsyncInvoker(ScanSkeyKvRequest request) {
        return new AsyncInvoker<ScanSkeyKvRequest, ScanSkeyKvResponse>(request, KvsMeta.scanSkeyKv, hcClient);
    }

    /**
     * 允许参数控制并返回删除前的kv文档内容,更新指定的kv文档,默认不会返回kv文档内容
     *
     * update kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateKvRequest 请求对象
     * @return CompletableFuture<UpdateKvResponse>
     */
    public CompletableFuture<UpdateKvResponse> updateKvAsync(UpdateKvRequest request) {
        return hcClient.asyncInvokeHttp(request, KvsMeta.updateKv);
    }

    /**
     * 允许参数控制并返回删除前的kv文档内容,更新指定的kv文档,默认不会返回kv文档内容
     *
     * update kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateKvRequest 请求对象
     * @return AsyncInvoker<UpdateKvRequest, UpdateKvResponse>
     */
    public AsyncInvoker<UpdateKvRequest, UpdateKvResponse> updateKvAsyncInvoker(UpdateKvRequest request) {
        return new AsyncInvoker<UpdateKvRequest, UpdateKvResponse>(request, KvsMeta.updateKv, hcClient);
    }

}
