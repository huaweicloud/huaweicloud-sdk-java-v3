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
import com.huaweicloud.sdk.kvs.v1.model.ListStoreRequest;
import com.huaweicloud.sdk.kvs.v1.model.ListStoreResponse;
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
import com.huaweicloud.sdk.kvs.v1.model.TransactWriteSkeyKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.TransactWriteSkeyKvResponse;
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
     * 在指定仓内创建表，表名在仓内唯一； 创建表时，指定主键模板及本地二级索引模板及全局二级索引模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTableRequest 请求对象
     * @return CreateTableResponse
     */
    public CreateTableResponse createTable(CreateTableRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.createTable);
    }

    /**
     * 创建表
     *
     * 在指定仓内创建表，表名在仓内唯一； 创建表时，指定主键模板及本地二级索引模板及全局二级索引模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTableRequest 请求对象
     * @return SyncInvoker<CreateTableRequest, CreateTableResponse>
     */
    public SyncInvoker<CreateTableRequest, CreateTableResponse> createTableInvoker(CreateTableRequest request) {
        return new SyncInvoker<>(request, KvsMeta.createTable, hcClient);
    }

    /**
     * 查询表
     *
     * 指定仓查询表属性，如容量，规模，配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeTableRequest 请求对象
     * @return DescribeTableResponse
     */
    public DescribeTableResponse describeTable(DescribeTableRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.describeTable);
    }

    /**
     * 查询表
     *
     * 指定仓查询表属性，如容量，规模，配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeTableRequest 请求对象
     * @return SyncInvoker<DescribeTableRequest, DescribeTableResponse>
     */
    public SyncInvoker<DescribeTableRequest, DescribeTableResponse> describeTableInvoker(DescribeTableRequest request) {
        return new SyncInvoker<>(request, KvsMeta.describeTable, hcClient);
    }

    /**
     * 列举仓
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoreRequest 请求对象
     * @return ListStoreResponse
     */
    public ListStoreResponse listStore(ListStoreRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.listStore);
    }

    /**
     * 列举仓
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoreRequest 请求对象
     * @return SyncInvoker<ListStoreRequest, ListStoreResponse>
     */
    public SyncInvoker<ListStoreRequest, ListStoreResponse> listStoreInvoker(ListStoreRequest request) {
        return new SyncInvoker<>(request, KvsMeta.listStore, hcClient);
    }

    /**
     * 列举表
     *
     * 指定仓列举创建的所有表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableRequest 请求对象
     * @return ListTableResponse
     */
    public ListTableResponse listTable(ListTableRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.listTable);
    }

    /**
     * 列举表
     *
     * 指定仓列举创建的所有表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableRequest 请求对象
     * @return SyncInvoker<ListTableRequest, ListTableResponse>
     */
    public SyncInvoker<ListTableRequest, ListTableResponse> listTableInvoker(ListTableRequest request) {
        return new SyncInvoker<>(request, KvsMeta.listTable, hcClient);
    }

    /**
     * 批量读请求
     *
     * 批量读请求，其中可以携带一或多个表的不同kv的查询操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchGetKvRequest 请求对象
     * @return BatchGetKvResponse
     */
    public BatchGetKvResponse batchGetKv(BatchGetKvRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.batchGetKv);
    }

    /**
     * 批量读请求
     *
     * 批量读请求，其中可以携带一或多个表的不同kv的查询操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchGetKvRequest 请求对象
     * @return SyncInvoker<BatchGetKvRequest, BatchGetKvResponse>
     */
    public SyncInvoker<BatchGetKvRequest, BatchGetKvResponse> batchGetKvInvoker(BatchGetKvRequest request) {
        return new SyncInvoker<>(request, KvsMeta.batchGetKv, hcClient);
    }

    /**
     * 批量写请求
     *
     * 批量写请求，其中可以携带一或多个表的不同kv的写操作，上传kv/删除kv。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchWriteKvRequest 请求对象
     * @return BatchWriteKvResponse
     */
    public BatchWriteKvResponse batchWriteKv(BatchWriteKvRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.batchWriteKv);
    }

    /**
     * 批量写请求
     *
     * 批量写请求，其中可以携带一或多个表的不同kv的写操作，上传kv/删除kv。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchWriteKvRequest 请求对象
     * @return SyncInvoker<BatchWriteKvRequest, BatchWriteKvResponse>
     */
    public SyncInvoker<BatchWriteKvRequest, BatchWriteKvResponse> batchWriteKvInvoker(BatchWriteKvRequest request) {
        return new SyncInvoker<>(request, KvsMeta.batchWriteKv, hcClient);
    }

    /**
     * 删除单个kv
     *
     * 指定表，指定主键，删除该文档；允许指定条件执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKvRequest 请求对象
     * @return DeleteKvResponse
     */
    public DeleteKvResponse deleteKv(DeleteKvRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.deleteKv);
    }

    /**
     * 删除单个kv
     *
     * 指定表，指定主键，删除该文档；允许指定条件执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKvRequest 请求对象
     * @return SyncInvoker<DeleteKvRequest, DeleteKvResponse>
     */
    public SyncInvoker<DeleteKvRequest, DeleteKvResponse> deleteKvInvoker(DeleteKvRequest request) {
        return new SyncInvoker<>(request, KvsMeta.deleteKv, hcClient);
    }

    /**
     * 查询单个kv
     *
     * 下载一个kv文档的全部内容，或者部分字段的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetKvRequest 请求对象
     * @return GetKvResponse
     */
    public GetKvResponse getKv(GetKvRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.getKv);
    }

    /**
     * 查询单个kv
     *
     * 下载一个kv文档的全部内容，或者部分字段的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetKvRequest 请求对象
     * @return SyncInvoker<GetKvRequest, GetKvResponse>
     */
    public SyncInvoker<GetKvRequest, GetKvResponse> getKvInvoker(GetKvRequest request) {
        return new SyncInvoker<>(request, KvsMeta.getKv, hcClient);
    }

    /**
     * 上传单个kv
     *
     * 指定表，新建kv或覆盖已有kv，且满足表的key schema描述；允许指定条件执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutKvRequest 请求对象
     * @return PutKvResponse
     */
    public PutKvResponse putKv(PutKvRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.putKv);
    }

    /**
     * 上传单个kv
     *
     * 指定表，新建kv或覆盖已有kv，且满足表的key schema描述；允许指定条件执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutKvRequest 请求对象
     * @return SyncInvoker<PutKvRequest, PutKvResponse>
     */
    public SyncInvoker<PutKvRequest, PutKvResponse> putKvInvoker(PutKvRequest request) {
        return new SyncInvoker<>(request, KvsMeta.putKv, hcClient);
    }

    /**
     * 排序键更名
     *
     * 更新指定KvBlob的分区键和属性信息
     * 1.rename-kv只支持对KvBlob生效，否则返回400 BadReqeust；
     * 2.rename-kv同时只能增加对Xattr字段修改，不支持内容修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenameKvRequest 请求对象
     * @return RenameKvResponse
     */
    public RenameKvResponse renameKv(RenameKvRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.renameKv);
    }

    /**
     * 排序键更名
     *
     * 更新指定KvBlob的分区键和属性信息
     * 1.rename-kv只支持对KvBlob生效，否则返回400 BadReqeust；
     * 2.rename-kv同时只能增加对Xattr字段修改，不支持内容修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenameKvRequest 请求对象
     * @return SyncInvoker<RenameKvRequest, RenameKvResponse>
     */
    public SyncInvoker<RenameKvRequest, RenameKvResponse> renameKvInvoker(RenameKvRequest request) {
        return new SyncInvoker<>(request, KvsMeta.renameKv, hcClient);
    }

    /**
     * 扫描所有kv
     *
     * 指定表，扫描表下所有kv；允许指定过滤条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScanKvRequest 请求对象
     * @return ScanKvResponse
     */
    public ScanKvResponse scanKv(ScanKvRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.scanKv);
    }

    /**
     * 扫描所有kv
     *
     * 指定表，扫描表下所有kv；允许指定过滤条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScanKvRequest 请求对象
     * @return SyncInvoker<ScanKvRequest, ScanKvResponse>
     */
    public SyncInvoker<ScanKvRequest, ScanKvResponse> scanKvInvoker(ScanKvRequest request) {
        return new SyncInvoker<>(request, KvsMeta.scanKv, hcClient);
    }

    /**
     * 扫描分区键内kv
     *
     * 指定表及分区键，携带条件查询kv；允许指定过滤条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScanSkeyKvRequest 请求对象
     * @return ScanSkeyKvResponse
     */
    public ScanSkeyKvResponse scanSkeyKv(ScanSkeyKvRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.scanSkeyKv);
    }

    /**
     * 扫描分区键内kv
     *
     * 指定表及分区键，携带条件查询kv；允许指定过滤条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScanSkeyKvRequest 请求对象
     * @return SyncInvoker<ScanSkeyKvRequest, ScanSkeyKvResponse>
     */
    public SyncInvoker<ScanSkeyKvRequest, ScanSkeyKvResponse> scanSkeyKvInvoker(ScanSkeyKvRequest request) {
        return new SyncInvoker<>(request, KvsMeta.scanSkeyKv, hcClient);
    }

    /**
     * 指定分区键下事务写请求
     *
     * transact-write-skey-kv支持对某个表指定分区键下的kv的操作，kv条数最大100,000，body最大不超过16MB，该操作保证原子性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TransactWriteSkeyKvRequest 请求对象
     * @return TransactWriteSkeyKvResponse
     */
    public TransactWriteSkeyKvResponse transactWriteSkeyKv(TransactWriteSkeyKvRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.transactWriteSkeyKv);
    }

    /**
     * 指定分区键下事务写请求
     *
     * transact-write-skey-kv支持对某个表指定分区键下的kv的操作，kv条数最大100,000，body最大不超过16MB，该操作保证原子性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TransactWriteSkeyKvRequest 请求对象
     * @return SyncInvoker<TransactWriteSkeyKvRequest, TransactWriteSkeyKvResponse>
     */
    public SyncInvoker<TransactWriteSkeyKvRequest, TransactWriteSkeyKvResponse> transactWriteSkeyKvInvoker(
        TransactWriteSkeyKvRequest request) {
        return new SyncInvoker<>(request, KvsMeta.transactWriteSkeyKv, hcClient);
    }

    /**
     * 更新单个kv
     *
     * 指定表，指定主键，指定更新文档的部分内容，如果是自描述文档，指定字段名；如果是二进制文档，指定偏移位置和长度；允许指定条件执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKvRequest 请求对象
     * @return UpdateKvResponse
     */
    public UpdateKvResponse updateKv(UpdateKvRequest request) {
        return hcClient.syncInvokeHttp(request, KvsMeta.updateKv);
    }

    /**
     * 更新单个kv
     *
     * 指定表，指定主键，指定更新文档的部分内容，如果是自描述文档，指定字段名；如果是二进制文档，指定偏移位置和长度；允许指定条件执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKvRequest 请求对象
     * @return SyncInvoker<UpdateKvRequest, UpdateKvResponse>
     */
    public SyncInvoker<UpdateKvRequest, UpdateKvResponse> updateKvInvoker(UpdateKvRequest request) {
        return new SyncInvoker<>(request, KvsMeta.updateKv, hcClient);
    }

}
