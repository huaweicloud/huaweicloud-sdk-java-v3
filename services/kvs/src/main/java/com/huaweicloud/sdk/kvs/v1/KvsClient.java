package com.huaweicloud.sdk.kvs.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class KvsClient {

    protected HcClient hcClient;

    public KvsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KvsClient> newBuilder() {
        ClientBuilder<KvsClient> clientBuilder = new ClientBuilder<>(KvsClient::new);
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
     * @return CreateTableResponse
     */
    public CreateTableResponse createTable(CreateTableRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.createTable);
    }

    /**
     * 创建表
     *
     * create table
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTableRequest 请求对象
     * @return SyncInvoker<CreateTableRequest, CreateTableResponse>
     */
    public SyncInvoker<CreateTableRequest, CreateTableResponse> createTableInvoker(CreateTableRequest request) {
        return new SyncInvoker<CreateTableRequest, CreateTableResponse>(request, KvsMeta.createTable, hcClient);
    }

    /**
     * 指定查询表的属性信息
     *
     * describe table
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DescribeTableRequest 请求对象
     * @return DescribeTableResponse
     */
    public DescribeTableResponse describeTable(DescribeTableRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.describeTable);
    }

    /**
     * 指定查询表的属性信息
     *
     * describe table
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DescribeTableRequest 请求对象
     * @return SyncInvoker<DescribeTableRequest, DescribeTableResponse>
     */
    public SyncInvoker<DescribeTableRequest, DescribeTableResponse> describeTableInvoker(DescribeTableRequest request) {
        return new SyncInvoker<DescribeTableRequest, DescribeTableResponse>(request, KvsMeta.describeTable, hcClient);
    }

    /**
     * 列出所有表
     *
     * list table
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableRequest 请求对象
     * @return ListTableResponse
     */
    public ListTableResponse listTable(ListTableRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.listTable);
    }

    /**
     * 列出所有表
     *
     * list table
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableRequest 请求对象
     * @return SyncInvoker<ListTableRequest, ListTableResponse>
     */
    public SyncInvoker<ListTableRequest, ListTableResponse> listTableInvoker(ListTableRequest request) {
        return new SyncInvoker<ListTableRequest, ListTableResponse>(request, KvsMeta.listTable, hcClient);
    }

    /**
     * 批量查询kv
     *
     * batch get kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchGetKvRequest 请求对象
     * @return BatchGetKvResponse
     */
    public BatchGetKvResponse batchGetKv(BatchGetKvRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.batchGetKv);
    }

    /**
     * 批量查询kv
     *
     * batch get kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchGetKvRequest 请求对象
     * @return SyncInvoker<BatchGetKvRequest, BatchGetKvResponse>
     */
    public SyncInvoker<BatchGetKvRequest, BatchGetKvResponse> batchGetKvInvoker(BatchGetKvRequest request) {
        return new SyncInvoker<BatchGetKvRequest, BatchGetKvResponse>(request, KvsMeta.batchGetKv, hcClient);
    }

    /**
     * 持同一个store的同一张表的put-kv操作和delete-kv操作， 最多携带25个操作，body部分不超过8MB
     *
     * batch write kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchWriteKvRequest 请求对象
     * @return BatchWriteKvResponse
     */
    public BatchWriteKvResponse batchWriteKv(BatchWriteKvRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.batchWriteKv);
    }

    /**
     * 持同一个store的同一张表的put-kv操作和delete-kv操作， 最多携带25个操作，body部分不超过8MB
     *
     * batch write kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchWriteKvRequest 请求对象
     * @return SyncInvoker<BatchWriteKvRequest, BatchWriteKvResponse>
     */
    public SyncInvoker<BatchWriteKvRequest, BatchWriteKvResponse> batchWriteKvInvoker(BatchWriteKvRequest request) {
        return new SyncInvoker<BatchWriteKvRequest, BatchWriteKvResponse>(request, KvsMeta.batchWriteKv, hcClient);
    }

    /**
     * 删除指定的kv文档，默认不会返回kv文档内容
     *
     * delete kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteKvRequest 请求对象
     * @return DeleteKvResponse
     */
    public DeleteKvResponse deleteKv(DeleteKvRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.deleteKv);
    }

    /**
     * 删除指定的kv文档，默认不会返回kv文档内容
     *
     * delete kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteKvRequest 请求对象
     * @return SyncInvoker<DeleteKvRequest, DeleteKvResponse>
     */
    public SyncInvoker<DeleteKvRequest, DeleteKvResponse> deleteKvInvoker(DeleteKvRequest request) {
        return new SyncInvoker<DeleteKvRequest, DeleteKvResponse>(request, KvsMeta.deleteKv, hcClient);
    }

    /**
     * 下载一个kv文档的全部内容，或者部分字段的内容
     *
     * get kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetKvRequest 请求对象
     * @return GetKvResponse
     */
    public GetKvResponse getKv(GetKvRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.getKv);
    }

    /**
     * 下载一个kv文档的全部内容，或者部分字段的内容
     *
     * get kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetKvRequest 请求对象
     * @return SyncInvoker<GetKvRequest, GetKvResponse>
     */
    public SyncInvoker<GetKvRequest, GetKvResponse> getKvInvoker(GetKvRequest request) {
        return new SyncInvoker<GetKvRequest, GetKvResponse>(request, KvsMeta.getKv, hcClient);
    }

    /**
     * 上传一个kv文档
     *
     * put kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PutKvRequest 请求对象
     * @return PutKvResponse
     */
    public PutKvResponse putKv(PutKvRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.putKv);
    }

    /**
     * 上传一个kv文档
     *
     * put kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PutKvRequest 请求对象
     * @return SyncInvoker<PutKvRequest, PutKvResponse>
     */
    public SyncInvoker<PutKvRequest, PutKvResponse> putKvInvoker(PutKvRequest request) {
        return new SyncInvoker<PutKvRequest, PutKvResponse>(request, KvsMeta.putKv, hcClient);
    }

    /**
     * 更新指定kv的sortkey 并更新部分字段
     *
     * rename kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RenameKvRequest 请求对象
     * @return RenameKvResponse
     */
    public RenameKvResponse renameKv(RenameKvRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.renameKv);
    }

    /**
     * 更新指定kv的sortkey 并更新部分字段
     *
     * rename kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RenameKvRequest 请求对象
     * @return SyncInvoker<RenameKvRequest, RenameKvResponse>
     */
    public SyncInvoker<RenameKvRequest, RenameKvResponse> renameKvInvoker(RenameKvRequest request) {
        return new SyncInvoker<RenameKvRequest, RenameKvResponse>(request, KvsMeta.renameKv, hcClient);
    }

    /**
     * 对指定table 扫描主索引或者指定二级索引进行扫描，可指定filter过滤需要返回的doc
     *
     * scan kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ScanKvRequest 请求对象
     * @return ScanKvResponse
     */
    public ScanKvResponse scanKv(ScanKvRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.scanKv);
    }

    /**
     * 对指定table 扫描主索引或者指定二级索引进行扫描，可指定filter过滤需要返回的doc
     *
     * scan kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ScanKvRequest 请求对象
     * @return SyncInvoker<ScanKvRequest, ScanKvResponse>
     */
    public SyncInvoker<ScanKvRequest, ScanKvResponse> scanKvInvoker(ScanKvRequest request) {
        return new SyncInvoker<ScanKvRequest, ScanKvResponse>(request, KvsMeta.scanKv, hcClient);
    }

    /**
     * 与scan-kv类似，query-skey-kv必须指定shardkey
     *
     * scan skey kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ScanSkeyKvRequest 请求对象
     * @return ScanSkeyKvResponse
     */
    public ScanSkeyKvResponse scanSkeyKv(ScanSkeyKvRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.scanSkeyKv);
    }

    /**
     * 与scan-kv类似，query-skey-kv必须指定shardkey
     *
     * scan skey kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ScanSkeyKvRequest 请求对象
     * @return SyncInvoker<ScanSkeyKvRequest, ScanSkeyKvResponse>
     */
    public SyncInvoker<ScanSkeyKvRequest, ScanSkeyKvResponse> scanSkeyKvInvoker(ScanSkeyKvRequest request) {
        return new SyncInvoker<ScanSkeyKvRequest, ScanSkeyKvResponse>(request, KvsMeta.scanSkeyKv, hcClient);
    }

    /**
     * 允许参数控制并返回删除前的kv文档内容,更新指定的kv文档,默认不会返回kv文档内容
     *
     * update kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateKvRequest 请求对象
     * @return UpdateKvResponse
     */
    public UpdateKvResponse updateKv(UpdateKvRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.updateKv);
    }

    /**
     * 允许参数控制并返回删除前的kv文档内容,更新指定的kv文档,默认不会返回kv文档内容
     *
     * update kv
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateKvRequest 请求对象
     * @return SyncInvoker<UpdateKvRequest, UpdateKvResponse>
     */
    public SyncInvoker<UpdateKvRequest, UpdateKvResponse> updateKvInvoker(UpdateKvRequest request) {
        return new SyncInvoker<UpdateKvRequest, UpdateKvResponse>(request, KvsMeta.updateKv, hcClient);
    }

}
