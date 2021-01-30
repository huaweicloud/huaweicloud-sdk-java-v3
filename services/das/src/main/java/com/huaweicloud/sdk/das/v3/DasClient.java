package com.huaweicloud.sdk.das.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.das.v3.model.*;

public class DasClient {
    protected HcClient hcClient;

    public DasClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DasClient> newBuilder() {
        return new ClientBuilder<>(DasClient::new);
    }


    /**
     * 查询API版本列表
     * 查询API版本列表
     *
     * @param ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listApiVersions);
    }

    /**
     * 查询API版本列表
     * 查询API版本列表
     *
     * @param ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(ListApiVersionsRequest request) {
        return new SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, DasMeta.listApiVersions, hcClient);
    }

    /**
     * 查询指定的API版本信息
     * 查询指定的API版本信息
     *
     * @param ShowApiVersionRequest 请求对象
     * @return ShowApiVersionResponse
     */
    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showApiVersion);
    }

    /**
     * 查询指定的API版本信息
     * 查询指定的API版本信息
     *
     * @param ShowApiVersionRequest 请求对象
     * @return SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionInvoker(ShowApiVersionRequest request) {
        return new SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, DasMeta.showApiVersion, hcClient);
    }

    /**
     * 
     * 删除注册的数据用户
     *
     * @param DeleteDbUserRequest 请求对象
     * @return DeleteDbUserResponse
     */
    public DeleteDbUserResponse deleteDbUser(DeleteDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.deleteDbUser);
    }

    /**
     * 
     * 删除注册的数据用户
     *
     * @param DeleteDbUserRequest 请求对象
     * @return SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>
     */
    public SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUserInvoker(DeleteDbUserRequest request) {
        return new SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>(request, DasMeta.deleteDbUser, hcClient);
    }

    /**
     * 查杀会话
     * 支持根据会话ID、用户和数据库查杀会话。
     *
     * @param DeleteProcessRequest 请求对象
     * @return DeleteProcessResponse
     */
    public DeleteProcessResponse deleteProcess(DeleteProcessRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.deleteProcess);
    }

    /**
     * 查杀会话
     * 支持根据会话ID、用户和数据库查杀会话。
     *
     * @param DeleteProcessRequest 请求对象
     * @return SyncInvoker<DeleteProcessRequest, DeleteProcessResponse>
     */
    public SyncInvoker<DeleteProcessRequest, DeleteProcessResponse> deleteProcessInvoker(DeleteProcessRequest request) {
        return new SyncInvoker<DeleteProcessRequest, DeleteProcessResponse>(request, DasMeta.deleteProcess, hcClient);
    }

    /**
     * 
     * 查询注册的数据库用户列表
     *
     * @param ListDbUsersRequest 请求对象
     * @return ListDbUsersResponse
     */
    public ListDbUsersResponse listDbUsers(ListDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listDbUsers);
    }

    /**
     * 
     * 查询注册的数据库用户列表
     *
     * @param ListDbUsersRequest 请求对象
     * @return SyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public SyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersInvoker(ListDbUsersRequest request) {
        return new SyncInvoker<ListDbUsersRequest, ListDbUsersResponse>(request, DasMeta.listDbUsers, hcClient);
    }

    /**
     * 查询InnoDB锁等待列表
     * 查询InnoDB锁等待列表
     *
     * @param ListInnodbLocksRequest 请求对象
     * @return ListInnodbLocksResponse
     */
    public ListInnodbLocksResponse listInnodbLocks(ListInnodbLocksRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listInnodbLocks);
    }

    /**
     * 查询InnoDB锁等待列表
     * 查询InnoDB锁等待列表
     *
     * @param ListInnodbLocksRequest 请求对象
     * @return SyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse>
     */
    public SyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse> listInnodbLocksInvoker(ListInnodbLocksRequest request) {
        return new SyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse>(request, DasMeta.listInnodbLocks, hcClient);
    }

    /**
     * 查询元数据锁列表
     * 查询元数据锁列表
     *
     * @param ListMetadataLocksRequest 请求对象
     * @return ListMetadataLocksResponse
     */
    public ListMetadataLocksResponse listMetadataLocks(ListMetadataLocksRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listMetadataLocks);
    }

    /**
     * 查询元数据锁列表
     * 查询元数据锁列表
     *
     * @param ListMetadataLocksRequest 请求对象
     * @return SyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse>
     */
    public SyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse> listMetadataLocksInvoker(ListMetadataLocksRequest request) {
        return new SyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse>(request, DasMeta.listMetadataLocks, hcClient);
    }

    /**
     * 查询实例会话列表
     * 查询实例会话列表
     *
     * @param ListProcessesRequest 请求对象
     * @return ListProcessesResponse
     */
    public ListProcessesResponse listProcesses(ListProcessesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listProcesses);
    }

    /**
     * 查询实例会话列表
     * 查询实例会话列表
     *
     * @param ListProcessesRequest 请求对象
     * @return SyncInvoker<ListProcessesRequest, ListProcessesResponse>
     */
    public SyncInvoker<ListProcessesRequest, ListProcessesResponse> listProcessesInvoker(ListProcessesRequest request) {
        return new SyncInvoker<ListProcessesRequest, ListProcessesResponse>(request, DasMeta.listProcesses, hcClient);
    }

    /**
     * 
     * 注册数据库用户
     *
     * @param RegisterDbUserRequest 请求对象
     * @return RegisterDbUserResponse
     */
    public RegisterDbUserResponse registerDbUser(RegisterDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.registerDbUser);
    }

    /**
     * 
     * 注册数据库用户
     *
     * @param RegisterDbUserRequest 请求对象
     * @return SyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse>
     */
    public SyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse> registerDbUserInvoker(RegisterDbUserRequest request) {
        return new SyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse>(request, DasMeta.registerDbUser, hcClient);
    }

    /**
     * 
     * 查询注册的数据库账号信息
     *
     * @param ShowDbUserRequest 请求对象
     * @return ShowDbUserResponse
     */
    public ShowDbUserResponse showDbUser(ShowDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showDbUser);
    }

    /**
     * 
     * 查询注册的数据库账号信息
     *
     * @param ShowDbUserRequest 请求对象
     * @return SyncInvoker<ShowDbUserRequest, ShowDbUserResponse>
     */
    public SyncInvoker<ShowDbUserRequest, ShowDbUserResponse> showDbUserInvoker(ShowDbUserRequest request) {
        return new SyncInvoker<ShowDbUserRequest, ShowDbUserResponse>(request, DasMeta.showDbUser, hcClient);
    }

    /**
     * 查询SQL执行计划
     * 查询SQL执行计划
     *
     * @param ShowSqlExecutionPlanRequest 请求对象
     * @return ShowSqlExecutionPlanResponse
     */
    public ShowSqlExecutionPlanResponse showSqlExecutionPlan(ShowSqlExecutionPlanRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showSqlExecutionPlan);
    }

    /**
     * 查询SQL执行计划
     * 查询SQL执行计划
     *
     * @param ShowSqlExecutionPlanRequest 请求对象
     * @return SyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse>
     */
    public SyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse> showSqlExecutionPlanInvoker(ShowSqlExecutionPlanRequest request) {
        return new SyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse>(request, DasMeta.showSqlExecutionPlan, hcClient);
    }

    /**
     * 
     * 修改注册的数据库用户
     *
     * @param UpdateDbUserRequest 请求对象
     * @return UpdateDbUserResponse
     */
    public UpdateDbUserResponse updateDbUser(UpdateDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.updateDbUser);
    }

    /**
     * 
     * 修改注册的数据库用户
     *
     * @param UpdateDbUserRequest 请求对象
     * @return SyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse>
     */
    public SyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse> updateDbUserInvoker(UpdateDbUserRequest request) {
        return new SyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse>(request, DasMeta.updateDbUser, hcClient);
    }

}