package com.huaweicloud.sdk.das.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.das.v3.model.*;

public class DasAsyncClient {
    protected HcClient hcClient;

    public DasAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DasAsyncClient> newBuilder() {
        return new ClientBuilder<>(DasAsyncClient::new);
    }


    /**
     * 查询API版本列表
     * 查询API版本列表
     *
     * @param ListApiVersionsRequest 请求对象
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listApiVersions);
    }

    /**
     * 查询API版本列表
     * 查询API版本列表
     *
     * @param ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(ListApiVersionsRequest request) {
        return new AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, DasMeta.listApiVersions, hcClient);
    }

    /**
     * 查询指定的API版本信息
     * 查询指定的API版本信息
     *
     * @param ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse>
     */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showApiVersion);
    }

    /**
     * 查询指定的API版本信息
     * 查询指定的API版本信息
     *
     * @param ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(ShowApiVersionRequest request) {
        return new AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, DasMeta.showApiVersion, hcClient);
    }

    /**
     * 
     * 删除注册的数据用户
     *
     * @param DeleteDbUserRequest 请求对象
     * @return CompletableFuture<DeleteDbUserResponse>
     */
    public CompletableFuture<DeleteDbUserResponse> deleteDbUserAsync(DeleteDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.deleteDbUser);
    }

    /**
     * 
     * 删除注册的数据用户
     *
     * @param DeleteDbUserRequest 请求对象
     * @return AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>
     */
    public AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUserAsyncInvoker(DeleteDbUserRequest request) {
        return new AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>(request, DasMeta.deleteDbUser, hcClient);
    }

    /**
     * 查杀会话
     * 支持根据会话ID、用户和数据库查杀会话。
     *
     * @param DeleteProcessRequest 请求对象
     * @return CompletableFuture<DeleteProcessResponse>
     */
    public CompletableFuture<DeleteProcessResponse> deleteProcessAsync(DeleteProcessRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.deleteProcess);
    }

    /**
     * 查杀会话
     * 支持根据会话ID、用户和数据库查杀会话。
     *
     * @param DeleteProcessRequest 请求对象
     * @return AsyncInvoker<DeleteProcessRequest, DeleteProcessResponse>
     */
    public AsyncInvoker<DeleteProcessRequest, DeleteProcessResponse> deleteProcessAsyncInvoker(DeleteProcessRequest request) {
        return new AsyncInvoker<DeleteProcessRequest, DeleteProcessResponse>(request, DasMeta.deleteProcess, hcClient);
    }

    /**
     * 
     * 查询注册的数据库用户列表
     *
     * @param ListDbUsersRequest 请求对象
     * @return CompletableFuture<ListDbUsersResponse>
     */
    public CompletableFuture<ListDbUsersResponse> listDbUsersAsync(ListDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listDbUsers);
    }

    /**
     * 
     * 查询注册的数据库用户列表
     *
     * @param ListDbUsersRequest 请求对象
     * @return AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersAsyncInvoker(ListDbUsersRequest request) {
        return new AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse>(request, DasMeta.listDbUsers, hcClient);
    }

    /**
     * 查询InnoDB锁等待列表
     * 查询InnoDB锁等待列表
     *
     * @param ListInnodbLocksRequest 请求对象
     * @return CompletableFuture<ListInnodbLocksResponse>
     */
    public CompletableFuture<ListInnodbLocksResponse> listInnodbLocksAsync(ListInnodbLocksRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listInnodbLocks);
    }

    /**
     * 查询InnoDB锁等待列表
     * 查询InnoDB锁等待列表
     *
     * @param ListInnodbLocksRequest 请求对象
     * @return AsyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse>
     */
    public AsyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse> listInnodbLocksAsyncInvoker(ListInnodbLocksRequest request) {
        return new AsyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse>(request, DasMeta.listInnodbLocks, hcClient);
    }

    /**
     * 查询元数据锁列表
     * 查询元数据锁列表
     *
     * @param ListMetadataLocksRequest 请求对象
     * @return CompletableFuture<ListMetadataLocksResponse>
     */
    public CompletableFuture<ListMetadataLocksResponse> listMetadataLocksAsync(ListMetadataLocksRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listMetadataLocks);
    }

    /**
     * 查询元数据锁列表
     * 查询元数据锁列表
     *
     * @param ListMetadataLocksRequest 请求对象
     * @return AsyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse>
     */
    public AsyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse> listMetadataLocksAsyncInvoker(ListMetadataLocksRequest request) {
        return new AsyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse>(request, DasMeta.listMetadataLocks, hcClient);
    }

    /**
     * 查询实例会话列表
     * 查询实例会话列表
     *
     * @param ListProcessesRequest 请求对象
     * @return CompletableFuture<ListProcessesResponse>
     */
    public CompletableFuture<ListProcessesResponse> listProcessesAsync(ListProcessesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listProcesses);
    }

    /**
     * 查询实例会话列表
     * 查询实例会话列表
     *
     * @param ListProcessesRequest 请求对象
     * @return AsyncInvoker<ListProcessesRequest, ListProcessesResponse>
     */
    public AsyncInvoker<ListProcessesRequest, ListProcessesResponse> listProcessesAsyncInvoker(ListProcessesRequest request) {
        return new AsyncInvoker<ListProcessesRequest, ListProcessesResponse>(request, DasMeta.listProcesses, hcClient);
    }

    /**
     * 
     * 注册数据库用户
     *
     * @param RegisterDbUserRequest 请求对象
     * @return CompletableFuture<RegisterDbUserResponse>
     */
    public CompletableFuture<RegisterDbUserResponse> registerDbUserAsync(RegisterDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.registerDbUser);
    }

    /**
     * 
     * 注册数据库用户
     *
     * @param RegisterDbUserRequest 请求对象
     * @return AsyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse>
     */
    public AsyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse> registerDbUserAsyncInvoker(RegisterDbUserRequest request) {
        return new AsyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse>(request, DasMeta.registerDbUser, hcClient);
    }

    /**
     * 
     * 查询注册的数据库账号信息
     *
     * @param ShowDbUserRequest 请求对象
     * @return CompletableFuture<ShowDbUserResponse>
     */
    public CompletableFuture<ShowDbUserResponse> showDbUserAsync(ShowDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showDbUser);
    }

    /**
     * 
     * 查询注册的数据库账号信息
     *
     * @param ShowDbUserRequest 请求对象
     * @return AsyncInvoker<ShowDbUserRequest, ShowDbUserResponse>
     */
    public AsyncInvoker<ShowDbUserRequest, ShowDbUserResponse> showDbUserAsyncInvoker(ShowDbUserRequest request) {
        return new AsyncInvoker<ShowDbUserRequest, ShowDbUserResponse>(request, DasMeta.showDbUser, hcClient);
    }

    /**
     * 查询SQL执行计划
     * 查询SQL执行计划
     *
     * @param ShowSqlExecutionPlanRequest 请求对象
     * @return CompletableFuture<ShowSqlExecutionPlanResponse>
     */
    public CompletableFuture<ShowSqlExecutionPlanResponse> showSqlExecutionPlanAsync(ShowSqlExecutionPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showSqlExecutionPlan);
    }

    /**
     * 查询SQL执行计划
     * 查询SQL执行计划
     *
     * @param ShowSqlExecutionPlanRequest 请求对象
     * @return AsyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse>
     */
    public AsyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse> showSqlExecutionPlanAsyncInvoker(ShowSqlExecutionPlanRequest request) {
        return new AsyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse>(request, DasMeta.showSqlExecutionPlan, hcClient);
    }

    /**
     * 
     * 修改注册的数据库用户
     *
     * @param UpdateDbUserRequest 请求对象
     * @return CompletableFuture<UpdateDbUserResponse>
     */
    public CompletableFuture<UpdateDbUserResponse> updateDbUserAsync(UpdateDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.updateDbUser);
    }

    /**
     * 
     * 修改注册的数据库用户
     *
     * @param UpdateDbUserRequest 请求对象
     * @return AsyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse>
     */
    public AsyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse> updateDbUserAsyncInvoker(UpdateDbUserRequest request) {
        return new AsyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse>(request, DasMeta.updateDbUser, hcClient);
    }

}