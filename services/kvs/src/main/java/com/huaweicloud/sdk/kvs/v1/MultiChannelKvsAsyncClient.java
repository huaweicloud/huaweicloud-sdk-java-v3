package com.huaweicloud.sdk.kvs.v1;

import com.huaweicloud.sdk.core.exception.ConnectionException;
import com.huaweicloud.sdk.core.exception.RequestTimeoutException;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.kvs.v1.config.KvsSdkConfig;
import com.huaweicloud.sdk.kvs.v1.config.KvsSdkConfigManager;
import com.huaweicloud.sdk.kvs.v1.model.BatchGetKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.BatchGetKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.BatchWriteKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.BatchWriteKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.CheckHealthRequest;
import com.huaweicloud.sdk.kvs.v1.model.CheckHealthResponse;
import com.huaweicloud.sdk.kvs.v1.model.CreateTableRequest;
import com.huaweicloud.sdk.kvs.v1.model.CreateTableResponse;
import com.huaweicloud.sdk.kvs.v1.model.DeleteKvRequest;
import com.huaweicloud.sdk.kvs.v1.model.DeleteKvResponse;
import com.huaweicloud.sdk.kvs.v1.model.DeleteTableRequest;
import com.huaweicloud.sdk.kvs.v1.model.DeleteTableResponse;
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

import org.apache.commons.configuration2.ex.ConfigurationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class MultiChannelKvsAsyncClient extends AbstractMultiChannelKvsClient implements IKvsAsyncClient {

    private static final Logger LOG = LoggerFactory.getLogger(MultiChannelKvsAsyncClient.class);

    private final KvsSdkConfigManager configManager;

    private final KvsClientHeartbeatKeeper heartbeatKeeper;

    private final Integer totalTimeoutMs;

    private final Timer oldClientMapCleanTimer;

    public MultiChannelKvsAsyncClient(String configFilePath) throws ConfigurationException {
        this(configFilePath, null);
    }

    public MultiChannelKvsAsyncClient(String configFilePath,
        HttpConfig customizeHttpConfig) throws ConfigurationException {
        this.configManager =
            new KvsSdkConfigManager(configFilePath, false, kvsClientMap, oldKvsClientMaps, customizeHttpConfig);
        KvsSdkConfig config = this.configManager.getConfig();
        this.totalTimeoutMs = config.getConnectionTimeout() * 1000 + config.getReadTimeout() * 1000;
        this.heartbeatKeeper = new KvsClientHeartbeatKeeper(kvsClientMap, config.getHeartbeatInterval() * 1000,
            config.getHeartbeatThreadPoolSize());
        this.oldClientMapCleanTimer = new Timer("oldClientMapCleanTimer");
        oldClientMapCleanTimer
            .schedule(new MultiChannelKvsAsyncClient.oldClientMapCleanTask(), totalTimeoutMs, totalTimeoutMs);
    }

    public void close() {
        this.heartbeatKeeper.close();
        this.oldClientMapCleanTimer.cancel();
        this.oldClientMapCleanTimer.purge();
        LOG.info("MultiChannelKvsAsyncClient is closed !");
    }

    private class oldClientMapCleanTask extends TimerTask {

        @Override
        public void run() {
            oldKvsClientMaps =
                (ConcurrentHashMap<Long, ConcurrentHashMap<Integer, ManagedKvsClient>>) oldKvsClientMaps.entrySet()
                    .stream()
                    .filter(entry -> System.currentTimeMillis() < entry.getKey() + totalTimeoutMs)
                    .collect(Collectors.toConcurrentMap(Map.Entry::getKey, Map.Entry::getValue));
        }
    }

    public KvsSdkConfig getConfig() {
        return this.configManager.getConfig();
    }

    public ConcurrentHashMap<Long, ConcurrentHashMap<Integer, ManagedKvsClient>> getOldKvsClientMaps() {
        return this.oldKvsClientMaps;
    }

    /**
    * 创建表
    *
        * 在指定仓内创建表，表名在仓内唯一；创建表时，指定主键模板及本地二级索引模板及全局二级索引模板。创建表时，如果仓不存在，将会自动创建仓。
        * 
        * Please refer to HUAWEI cloud API Explorer for details.
    *
    * @param request CreateTableRequest 请求对象
    * @return CreateTableResponse
    */
    public CompletableFuture<CreateTableResponse> createTableAsync(CreateTableRequest request) {
        int retryCount = 0;
        while (retryCount < getConfig().getApiRetryCount()) {
            ManagedKvsClient client = getKvsClientByPolling(retryCount);
            try {
                return client.getKvsAsyncClient().createTableAsync(request);
            } catch (RequestTimeoutException | ConnectionException e) {
                client.setIsUsable(false);
                retryCount++;
                LOG.warn(
                    "this is client " + client.getEndpointName() + " createTable throwing Exception " + retryCount
                        + " time. errorInfo: " + e,
                    e);
            }
        }
        throw new SdkException("retry createTable " + retryCount + " times, and failed!");
    }

    /**
    * 创建表
    *
        * 在指定仓内创建表，表名在仓内唯一；创建表时，指定主键模板及本地二级索引模板及全局二级索引模板。创建表时，如果仓不存在，将会自动创建仓。
        * 
        * Please refer to HUAWEI cloud API Explorer for details.
    *
    * @param request CreateTableRequest 请求对象
    * @return SyncInvoker<CreateTableRequest, CreateTableResponse>
    */
    public AsyncInvoker<CreateTableRequest, CreateTableResponse> createTableAsyncInvoker(CreateTableRequest request) {
        return getKvsClientByPolling().getKvsAsyncClient().createTableAsyncInvoker(request);
    }

    /**
    * 删除表
    *
        * 删除指定表及所有kv文档，表标记为删除后，空间不会立刻释放，并发的读写访问仍需继续完成。
        * 
        * Please refer to HUAWEI cloud API Explorer for details.
    *
    * @param request DeleteTableRequest 请求对象
    * @return DeleteTableResponse
    */
    public CompletableFuture<DeleteTableResponse> deleteTableAsync(DeleteTableRequest request) {
        int retryCount = 0;
        while (retryCount < getConfig().getApiRetryCount()) {
            ManagedKvsClient client = getKvsClientByPolling(retryCount);
            try {
                return client.getKvsAsyncClient().deleteTableAsync(request);
            } catch (RequestTimeoutException | ConnectionException e) {
                client.setIsUsable(false);
                retryCount++;
                LOG.warn(
                    "this is client " + client.getEndpointName() + " deleteTable throwing Exception " + retryCount
                        + " time. errorInfo: " + e,
                    e);
            }
        }
        throw new SdkException("retry deleteTable " + retryCount + " times, and failed!");
    }

    /**
    * 删除表
    *
        * 删除指定表及所有kv文档，表标记为删除后，空间不会立刻释放，并发的读写访问仍需继续完成。
        * 
        * Please refer to HUAWEI cloud API Explorer for details.
    *
    * @param request DeleteTableRequest 请求对象
    * @return SyncInvoker<DeleteTableRequest, DeleteTableResponse>
    */
    public AsyncInvoker<DeleteTableRequest, DeleteTableResponse> deleteTableAsyncInvoker(DeleteTableRequest request) {
        return getKvsClientByPolling().getKvsAsyncClient().deleteTableAsyncInvoker(request);
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
    public CompletableFuture<DescribeTableResponse> describeTableAsync(DescribeTableRequest request) {
        int retryCount = 0;
        while (retryCount < getConfig().getApiRetryCount()) {
            ManagedKvsClient client = getKvsClientByPolling(retryCount);
            try {
                return client.getKvsAsyncClient().describeTableAsync(request);
            } catch (RequestTimeoutException | ConnectionException e) {
                client.setIsUsable(false);
                retryCount++;
                LOG.warn(
                    "this is client " + client.getEndpointName() + " describeTable throwing Exception " + retryCount
                        + " time. errorInfo: " + e,
                    e);
            }
        }
        throw new SdkException("retry describeTable " + retryCount + " times, and failed!");
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
    public AsyncInvoker<DescribeTableRequest, DescribeTableResponse> describeTableAsyncInvoker(
        DescribeTableRequest request) {
        return getKvsClientByPolling().getKvsAsyncClient().describeTableAsyncInvoker(request);
    }

    /**
    * 列举仓
    *
        * 一个账户下可以创建最多25个仓，每个仓可以创建最多100个store，响应中一次性返回所有仓名称。
        * 
        * Please refer to HUAWEI cloud API Explorer for details.
    *
    * @param request ListStoreRequest 请求对象
    * @return ListStoreResponse
    */
    public CompletableFuture<ListStoreResponse> listStoreAsync(ListStoreRequest request) {
        int retryCount = 0;
        while (retryCount < getConfig().getApiRetryCount()) {
            ManagedKvsClient client = getKvsClientByPolling(retryCount);
            try {
                return client.getKvsAsyncClient().listStoreAsync(request);
            } catch (RequestTimeoutException | ConnectionException e) {
                client.setIsUsable(false);
                retryCount++;
                LOG.warn(
                    "this is client " + client.getEndpointName() + " listStore throwing Exception " + retryCount
                        + " time. errorInfo: " + e,
                    e);
            }
        }
        throw new SdkException("retry listStore " + retryCount + " times, and failed!");
    }

    /**
    * 列举仓
    *
        * 一个账户下可以创建最多25个仓，每个仓可以创建最多100个store，响应中一次性返回所有仓名称。
        * 
        * Please refer to HUAWEI cloud API Explorer for details.
    *
    * @param request ListStoreRequest 请求对象
    * @return SyncInvoker<ListStoreRequest, ListStoreResponse>
    */
    public AsyncInvoker<ListStoreRequest, ListStoreResponse> listStoreAsyncInvoker(ListStoreRequest request) {
        return getKvsClientByPolling().getKvsAsyncClient().listStoreAsyncInvoker(request);
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
    public CompletableFuture<ListTableResponse> listTableAsync(ListTableRequest request) {
        int retryCount = 0;
        while (retryCount < getConfig().getApiRetryCount()) {
            ManagedKvsClient client = getKvsClientByPolling(retryCount);
            try {
                return client.getKvsAsyncClient().listTableAsync(request);
            } catch (RequestTimeoutException | ConnectionException e) {
                client.setIsUsable(false);
                retryCount++;
                LOG.warn(
                    "this is client " + client.getEndpointName() + " listTable throwing Exception " + retryCount
                        + " time. errorInfo: " + e,
                    e);
            }
        }
        throw new SdkException("retry listTable " + retryCount + " times, and failed!");
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
    public AsyncInvoker<ListTableRequest, ListTableResponse> listTableAsyncInvoker(ListTableRequest request) {
        return getKvsClientByPolling().getKvsAsyncClient().listTableAsyncInvoker(request);
    }

    /**
    * 网络信道健康检查
    *
        * 网络信道健康检查，返回response未抛出网络异常即为成功
        * 
        * Please refer to HUAWEI cloud API Explorer for details.
    *
    * @param request CheckHealthRequest 请求对象
    * @return CheckHealthResponse
    */
    public CompletableFuture<CheckHealthResponse> checkHealthAsync(CheckHealthRequest request) {
        int retryCount = 0;
        while (retryCount < getConfig().getApiRetryCount()) {
            ManagedKvsClient client = getKvsClientByPolling(retryCount);
            try {
                return client.getKvsAsyncClient().checkHealthAsync(request);
            } catch (RequestTimeoutException | ConnectionException e) {
                client.setIsUsable(false);
                retryCount++;
                LOG.warn(
                    "this is client " + client.getEndpointName() + " checkHealth throwing Exception " + retryCount
                        + " time. errorInfo: " + e,
                    e);
            }
        }
        throw new SdkException("retry checkHealth " + retryCount + " times, and failed!");
    }

    /**
    * 网络信道健康检查
    *
        * 网络信道健康检查，返回response未抛出网络异常即为成功
        * 
        * Please refer to HUAWEI cloud API Explorer for details.
    *
    * @param request CheckHealthRequest 请求对象
    * @return SyncInvoker<CheckHealthRequest, CheckHealthResponse>
    */
    public AsyncInvoker<CheckHealthRequest, CheckHealthResponse> checkHealthAsyncInvoker(CheckHealthRequest request) {
        return getKvsClientByPolling().getKvsAsyncClient().checkHealthAsyncInvoker(request);
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
    public CompletableFuture<BatchGetKvResponse> batchGetKvAsync(BatchGetKvRequest request) {
        int retryCount = 0;
        while (retryCount < getConfig().getApiRetryCount()) {
            ManagedKvsClient client = getKvsClientByPolling(retryCount);
            try {
                return client.getKvsAsyncClient().batchGetKvAsync(request);
            } catch (RequestTimeoutException | ConnectionException e) {
                client.setIsUsable(false);
                retryCount++;
                LOG.warn(
                    "this is client " + client.getEndpointName() + " batchGetKv throwing Exception " + retryCount
                        + " time. errorInfo: " + e,
                    e);
            }
        }
        throw new SdkException("retry batchGetKv " + retryCount + " times, and failed!");
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
    public AsyncInvoker<BatchGetKvRequest, BatchGetKvResponse> batchGetKvAsyncInvoker(BatchGetKvRequest request) {
        return getKvsClientByPolling().getKvsAsyncClient().batchGetKvAsyncInvoker(request);
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
    public CompletableFuture<BatchWriteKvResponse> batchWriteKvAsync(BatchWriteKvRequest request) {
        int retryCount = 0;
        while (retryCount < getConfig().getApiRetryCount()) {
            ManagedKvsClient client = getKvsClientByPolling(retryCount);
            try {
                return client.getKvsAsyncClient().batchWriteKvAsync(request);
            } catch (RequestTimeoutException | ConnectionException e) {
                client.setIsUsable(false);
                retryCount++;
                LOG.warn(
                    "this is client " + client.getEndpointName() + " batchWriteKv throwing Exception " + retryCount
                        + " time. errorInfo: " + e,
                    e);
            }
        }
        throw new SdkException("retry batchWriteKv " + retryCount + " times, and failed!");
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
    public AsyncInvoker<BatchWriteKvRequest, BatchWriteKvResponse> batchWriteKvAsyncInvoker(
        BatchWriteKvRequest request) {
        return getKvsClientByPolling().getKvsAsyncClient().batchWriteKvAsyncInvoker(request);
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
    public CompletableFuture<DeleteKvResponse> deleteKvAsync(DeleteKvRequest request) {
        int retryCount = 0;
        while (retryCount < getConfig().getApiRetryCount()) {
            ManagedKvsClient client = getKvsClientByPolling(retryCount);
            try {
                return client.getKvsAsyncClient().deleteKvAsync(request);
            } catch (RequestTimeoutException | ConnectionException e) {
                client.setIsUsable(false);
                retryCount++;
                LOG.warn(
                    "this is client " + client.getEndpointName() + " deleteKv throwing Exception " + retryCount
                        + " time. errorInfo: " + e,
                    e);
            }
        }
        throw new SdkException("retry deleteKv " + retryCount + " times, and failed!");
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
    public AsyncInvoker<DeleteKvRequest, DeleteKvResponse> deleteKvAsyncInvoker(DeleteKvRequest request) {
        return getKvsClientByPolling().getKvsAsyncClient().deleteKvAsyncInvoker(request);
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
    public CompletableFuture<GetKvResponse> getKvAsync(GetKvRequest request) {
        int retryCount = 0;
        while (retryCount < getConfig().getApiRetryCount()) {
            ManagedKvsClient client = getKvsClientByPolling(retryCount);
            try {
                return client.getKvsAsyncClient().getKvAsync(request);
            } catch (RequestTimeoutException | ConnectionException e) {
                client.setIsUsable(false);
                retryCount++;
                LOG.warn(
                    "this is client " + client.getEndpointName() + " getKv throwing Exception " + retryCount
                        + " time. errorInfo: " + e,
                    e);
            }
        }
        throw new SdkException("retry getKv " + retryCount + " times, and failed!");
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
    public AsyncInvoker<GetKvRequest, GetKvResponse> getKvAsyncInvoker(GetKvRequest request) {
        return getKvsClientByPolling().getKvsAsyncClient().getKvAsyncInvoker(request);
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
    public CompletableFuture<PutKvResponse> putKvAsync(PutKvRequest request) {
        int retryCount = 0;
        while (retryCount < getConfig().getApiRetryCount()) {
            ManagedKvsClient client = getKvsClientByPolling(retryCount);
            try {
                return client.getKvsAsyncClient().putKvAsync(request);
            } catch (RequestTimeoutException | ConnectionException e) {
                client.setIsUsable(false);
                retryCount++;
                LOG.warn(
                    "this is client " + client.getEndpointName() + " putKv throwing Exception " + retryCount
                        + " time. errorInfo: " + e,
                    e);
            }
        }
        throw new SdkException("retry putKv " + retryCount + " times, and failed!");
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
    public AsyncInvoker<PutKvRequest, PutKvResponse> putKvAsyncInvoker(PutKvRequest request) {
        return getKvsClientByPolling().getKvsAsyncClient().putKvAsyncInvoker(request);
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
    public CompletableFuture<ScanKvResponse> scanKvAsync(ScanKvRequest request) {
        int retryCount = 0;
        while (retryCount < getConfig().getApiRetryCount()) {
            ManagedKvsClient client = getKvsClientByPolling(retryCount);
            try {
                return client.getKvsAsyncClient().scanKvAsync(request);
            } catch (RequestTimeoutException | ConnectionException e) {
                client.setIsUsable(false);
                retryCount++;
                LOG.warn(
                    "this is client " + client.getEndpointName() + " scanKv throwing Exception " + retryCount
                        + " time. errorInfo: " + e,
                    e);
            }
        }
        throw new SdkException("retry scanKv " + retryCount + " times, and failed!");
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
    public AsyncInvoker<ScanKvRequest, ScanKvResponse> scanKvAsyncInvoker(ScanKvRequest request) {
        return getKvsClientByPolling().getKvsAsyncClient().scanKvAsyncInvoker(request);
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
    public CompletableFuture<ScanSkeyKvResponse> scanSkeyKvAsync(ScanSkeyKvRequest request) {
        int retryCount = 0;
        while (retryCount < getConfig().getApiRetryCount()) {
            ManagedKvsClient client = getKvsClientByPolling(retryCount);
            try {
                return client.getKvsAsyncClient().scanSkeyKvAsync(request);
            } catch (RequestTimeoutException | ConnectionException e) {
                client.setIsUsable(false);
                retryCount++;
                LOG.warn(
                    "this is client " + client.getEndpointName() + " scanSkeyKv throwing Exception " + retryCount
                        + " time. errorInfo: " + e,
                    e);
            }
        }
        throw new SdkException("retry scanSkeyKv " + retryCount + " times, and failed!");
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
    public AsyncInvoker<ScanSkeyKvRequest, ScanSkeyKvResponse> scanSkeyKvAsyncInvoker(ScanSkeyKvRequest request) {
        return getKvsClientByPolling().getKvsAsyncClient().scanSkeyKvAsyncInvoker(request);
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
    public CompletableFuture<UpdateKvResponse> updateKvAsync(UpdateKvRequest request) {
        int retryCount = 0;
        while (retryCount < getConfig().getApiRetryCount()) {
            ManagedKvsClient client = getKvsClientByPolling(retryCount);
            try {
                return client.getKvsAsyncClient().updateKvAsync(request);
            } catch (RequestTimeoutException | ConnectionException e) {
                client.setIsUsable(false);
                retryCount++;
                LOG.warn(
                    "this is client " + client.getEndpointName() + " updateKv throwing Exception " + retryCount
                        + " time. errorInfo: " + e,
                    e);
            }
        }
        throw new SdkException("retry updateKv " + retryCount + " times, and failed!");
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
    public AsyncInvoker<UpdateKvRequest, UpdateKvResponse> updateKvAsyncInvoker(UpdateKvRequest request) {
        return getKvsClientByPolling().getKvsAsyncClient().updateKvAsyncInvoker(request);
    }

}
