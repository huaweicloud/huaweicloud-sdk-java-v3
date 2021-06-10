package com.huaweicloud.sdk.ugo.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.ugo.v1.model.*;

public class UgoClient {
    protected HcClient hcClient;

    public UgoClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<UgoClient> newBuilder() {
        return new ClientBuilder<>(UgoClient::new);
    }


    /**
     * 查询当前支持的API版本信息列表
     * 查询当前支持的API版本信息列表。
     *
     * @param ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.listApiVersions);
    }

    /**
     * 查询当前支持的API版本信息列表
     * 查询当前支持的API版本信息列表。
     *
     * @param ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(ListApiVersionsRequest request) {
        return new SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, UgoMeta.listApiVersions, hcClient);
    }

    /**
     * 查询指定API版本信息
     * 查询指定API版本信息。
     *
     * @param ShowApiVersionRequest 请求对象
     * @return ShowApiVersionResponse
     */
    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.showApiVersion);
    }

    /**
     * 查询指定API版本信息
     * 查询指定API版本信息。
     *
     * @param ShowApiVersionRequest 请求对象
     * @return SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionInvoker(ShowApiVersionRequest request) {
        return new SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, UgoMeta.showApiVersion, hcClient);
    }

    /**
     * SQL翻译接口
     * 实现源库与目标数据之间SQL语句的自动翻译
     *
     * @param MigrateSqlStatementRequest 请求对象
     * @return MigrateSqlStatementResponse
     */
    public MigrateSqlStatementResponse migrateSqlStatement(MigrateSqlStatementRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.migrateSqlStatement);
    }

    /**
     * SQL翻译接口
     * 实现源库与目标数据之间SQL语句的自动翻译
     *
     * @param MigrateSqlStatementRequest 请求对象
     * @return SyncInvoker<MigrateSqlStatementRequest, MigrateSqlStatementResponse>
     */
    public SyncInvoker<MigrateSqlStatementRequest, MigrateSqlStatementResponse> migrateSqlStatementInvoker(MigrateSqlStatementRequest request) {
        return new SyncInvoker<MigrateSqlStatementRequest, MigrateSqlStatementResponse>(request, UgoMeta.migrateSqlStatement, hcClient);
    }

}