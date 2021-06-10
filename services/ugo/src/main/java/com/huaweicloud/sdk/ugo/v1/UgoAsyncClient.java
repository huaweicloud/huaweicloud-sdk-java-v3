package com.huaweicloud.sdk.ugo.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.ugo.v1.model.*;

public class UgoAsyncClient {
    protected HcClient hcClient;

    public UgoAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<UgoAsyncClient> newBuilder() {
        return new ClientBuilder<>(UgoAsyncClient::new);
    }


    /**
     * 查询当前支持的API版本信息列表
     * 查询当前支持的API版本信息列表。
     *
     * @param ListApiVersionsRequest 请求对象
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.listApiVersions);
    }

    /**
     * 查询当前支持的API版本信息列表
     * 查询当前支持的API版本信息列表。
     *
     * @param ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(ListApiVersionsRequest request) {
        return new AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, UgoMeta.listApiVersions, hcClient);
    }

    /**
     * 查询指定API版本信息
     * 查询指定API版本信息。
     *
     * @param ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse>
     */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.showApiVersion);
    }

    /**
     * 查询指定API版本信息
     * 查询指定API版本信息。
     *
     * @param ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(ShowApiVersionRequest request) {
        return new AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, UgoMeta.showApiVersion, hcClient);
    }

    /**
     * SQL翻译接口
     * 实现源库与目标数据之间SQL语句的自动翻译
     *
     * @param MigrateSqlStatementRequest 请求对象
     * @return CompletableFuture<MigrateSqlStatementResponse>
     */
    public CompletableFuture<MigrateSqlStatementResponse> migrateSqlStatementAsync(MigrateSqlStatementRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.migrateSqlStatement);
    }

    /**
     * SQL翻译接口
     * 实现源库与目标数据之间SQL语句的自动翻译
     *
     * @param MigrateSqlStatementRequest 请求对象
     * @return AsyncInvoker<MigrateSqlStatementRequest, MigrateSqlStatementResponse>
     */
    public AsyncInvoker<MigrateSqlStatementRequest, MigrateSqlStatementResponse> migrateSqlStatementAsyncInvoker(MigrateSqlStatementRequest request) {
        return new AsyncInvoker<MigrateSqlStatementRequest, MigrateSqlStatementResponse>(request, UgoMeta.migrateSqlStatement, hcClient);
    }

}